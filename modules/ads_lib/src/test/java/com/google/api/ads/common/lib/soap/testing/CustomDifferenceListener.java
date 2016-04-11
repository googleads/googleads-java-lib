// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.soap.testing;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.DifferenceConstants;
import org.custommonkey.xmlunit.DifferenceListener;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import java.util.Map;

import javax.xml.namespace.QName;

/**
 * Implementation of XMLUnit {@link DifferenceListener} that performs additional checks when
 * namespace or attribute differences are found. The default implementation XMLUnit provides does
 * not check for logical equivalence between namespaces if the prefixes don't match or the namespace
 * is inherited from the parent node.
 */
public class CustomDifferenceListener implements DifferenceListener {

  @Override
  public void skippedComparison(Node control, Node test) {
    throw new IllegalArgumentException(
        String.format("Unable to compare nodes: %s, %s", control, test));
  }

  @Override
  public int differenceFound(Difference difference) {
    switch (difference.getId()) {
      case DifferenceConstants.NAMESPACE_URI_ID:
        return namespaceDifferenceFound(difference);
      case DifferenceConstants.ELEMENT_NUM_ATTRIBUTES_ID:
      case DifferenceConstants.ATTR_NAME_NOT_FOUND_ID:
        return attributeDifferenceFound(difference);
      default:
        return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
    }
  }

  /**
   * Checks for logical equivalence of the qualified node names.
   */
  private int namespaceDifferenceFound(Difference difference) {
    Node controlNode = difference.getControlNodeDetail().getNode();
    Node testNode = difference.getTestNodeDetail().getNode();
    String controlNs = getNamespaceURI(controlNode);
    String testNs = getNamespaceURI(testNode);
    if (Objects.equal(controlNs, testNs)) {
      if (Objects.equal(controlNode.getLocalName(), testNode.getLocalName())) {
        return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_SIMILAR;
      }
    }
    return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
  }

  /**
   * Ignores differences that are only due to missing xsi:type.
   */
  private int attributeDifferenceFound(Difference difference) {
    NamedNodeMap controlAttributes = difference.getControlNodeDetail().getNode().getAttributes();
    NamedNodeMap testAttributes = difference.getTestNodeDetail().getNode().getAttributes();
    Map<QName, Node> controlAttributesMap = createAttributesMapExcludingXsiType(controlAttributes);
    Map<QName, Node> testAttributesMap = createAttributesMapExcludingXsiType(testAttributes);
    if (controlAttributesMap.size() != testAttributesMap.size()) {
      return DifferenceListener.RETURN_ACCEPT_DIFFERENCE;
    }
    return DifferenceListener.RETURN_IGNORE_DIFFERENCE_NODES_SIMILAR;
  }

  /**
   * Finds the namespace URI of the node, navigating up the node tree if necessary.
   *
   * @return the namespace URI of the node, which may be null.
   */
  private String getNamespaceURI(Node node) {
    while (node != null && Strings.isNullOrEmpty(node.getNamespaceURI())) {
      node = node.getParentNode();
    }
    return node == null ? null : node.getNamespaceURI();
  }

  /**
   * Converts the XMLUnit {@link NamedNodeMap} into a map of {@link QName} to {@link Node},
   * <em>excluding</em> {@code xsi:type} attributes.
   */
  private Map<QName, Node> createAttributesMapExcludingXsiType(NamedNodeMap attributes) {
    Map<QName, Node> attributesMap = Maps.newHashMap();
    for (int i = 0; i < attributes.getLength(); i++) {
      Node item = attributes.item(i);
      String itemNamespace = getNamespaceURI(item);
      String localName = item.getLocalName();
      if (!("http://www.w3.org/2001/XMLSchema-instance".equals(itemNamespace)
          && "type".equals(localName))) {
        attributesMap.put(new QName(itemNamespace, item.getLocalName()), item);
      }
    }
    return attributesMap;
  }
}
