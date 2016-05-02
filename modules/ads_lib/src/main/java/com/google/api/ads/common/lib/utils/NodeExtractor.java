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

package com.google.api.ads.common.lib.utils;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Deque;
import java.util.List;

import javax.xml.xpath.XPathExpression;

/**
 * Utility that extracts a {@link Node} from a parent node given a list of xpaths using DOM methods,
 * <em>not</em> {@link XPathExpression} objects.
 *
 * <p>
 * This utility exists because the {@code Node} objects produced by Axis and JAX-WS do not seem to
 * be compatible with {@link XPathExpression}.
 */
public class NodeExtractor {

  /**
   * Extracts the node specified by the xpath list.
   *
   * @param parentNode the node to extract the child node from.
   * @param xpath list of non-null <em>local</em> element names that make up the child node's xpath.
   * @return the matching {@link Node}, or {@code null} if no such child node exists.
   */
  public Node extractNode(Node parentNode, List<String> xpath) {
    Deque<String> xpathStack =
        Lists.newLinkedList(Preconditions.checkNotNull(xpath, "Null xpath list"));
    Node node = parentNode;
    boolean wasMatch = false;
    while (!xpathStack.isEmpty() && node != null) {
      wasMatch = false;
      String localName = xpathStack.pop();
      NodeList childNodes = node.getChildNodes();
      for (int i = 0; i < childNodes.getLength(); i++) {
        Node childNode = childNodes.item(i);
        String childName = childNode.getLocalName();
        if (childName == null || childName.contains(":")) {
          childName = childNode.getNodeName();
        }
        if (localName.equals(childName)) {
          node = childNode;
          wasMatch = true;
          break;
        }
      }
    }
    return wasMatch ? node : null;
  }
}
