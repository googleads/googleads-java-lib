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
import org.w3c.dom.Node;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.DifferenceEvaluator;

/**
 * Implementation of XMLUnit {@link DifferenceEvaluator} that performs additional checks when
 * namespace or attribute differences are found. The default implementation XMLUnit provides does
 * not check for logical equivalence between namespaces if the prefixes don't match or the namespace
 * is inherited from the parent node.
 */
public class CustomDifferenceEvaluator implements DifferenceEvaluator {

  @Override
  public ComparisonResult evaluate(Comparison comparison, ComparisonResult outcome) {
    if (outcome != ComparisonResult.DIFFERENT) {
      return outcome;
    }
    switch (comparison.getType()) {
      case NAMESPACE_PREFIX:
      case NAMESPACE_URI:
        return namespaceDifferenceFound(comparison, outcome);
      case ATTR_NAME_LOOKUP:
        return attributeDifferenceFound(comparison, outcome);
      default:
        return outcome;
    }
  }

  /** Checks for logical equivalence of the qualified node names. */
  private ComparisonResult namespaceDifferenceFound(
      Comparison comparison, ComparisonResult outcome) {
    Node controlNode = comparison.getControlDetails().getTarget();
    Node testNode = comparison.getTestDetails().getTarget();
    String controlNs = getNamespaceURI(controlNode);
    String testNs = getNamespaceURI(testNode);
    if (Objects.equal(controlNs, testNs)) {
      if (Objects.equal(controlNode.getLocalName(), testNode.getLocalName())) {
        return ComparisonResult.SIMILAR;
      }
    }
    return outcome;
  }

  /** Ignores differences that are only due to missing xsi:type. */
  private ComparisonResult attributeDifferenceFound(
      Comparison comparison, ComparisonResult outcome) {
    Node controlNode = comparison.getControlDetails().getTarget();
    Node testNode = comparison.getTestDetails().getTarget();
    if (isXsiTypeAttribute(controlNode) && testNode == null) {
      return ComparisonResult.SIMILAR;
    }
    return outcome;
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

  /** Returns whether the provided {@link Node} is an {@code xsi:type} attribute node. */
  private boolean isXsiTypeAttribute(Node node) {
    if (node == null || node.getNodeType() != Node.ATTRIBUTE_NODE) {
      return false;
    }
    String itemNamespace = getNamespaceURI(node);
    String localName = node.getLocalName();
    return "http://www.w3.org/2001/XMLSchema-instance".equals(itemNamespace)
        && "type".equals(localName);
  }
}
