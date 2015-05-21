// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201502.shopping;

import com.google.api.ads.adwords.axis.v201502.cm.ProductDimension;

import java.util.Comparator;


/**
 * Static utility class that detects the differences between two {@link ProductPartitionNode}s.
 *
 * @author Josh Radcliff
 */
class ProductPartitionNodeDiffer {

  private ProductPartitionNodeDiffer() {
    // Static utility class - do not instantiate.
  }

  /**
   * Returns the {@link NodeDifference} between the original node and the new node.
   *
   * @throws IllegalArgumentException if both nodes are not null and do not have the same
   *         {@link ProductPartitionNode#getDimension()}.
   */
  static NodeDifference diff(ProductPartitionNode originalNode,
      ProductPartitionNode newNode, Comparator<ProductDimension> dimensionComparator) {
    NodeDifference nodeDifference;
    if (originalNode == null && newNode == null) {
      nodeDifference = NodeDifference.NONE;
    } else if (originalNode == null) {
      nodeDifference = NodeDifference.NEW_NODE;
    } else if (newNode == null) {
      nodeDifference = NodeDifference.REMOVED_NODE;
    } else if (dimensionComparator.compare(originalNode.getDimension(), newNode.getDimension())
        != 0) {
      throw new IllegalArgumentException(
          "Original node and new node are not for the same product dimension");
    } else if (originalNode.isUnit() != newNode.isUnit()) {
      nodeDifference = NodeDifference.PARTITION_TYPE_CHANGE;
    } else if (originalNode.isExcludedUnit() != newNode.isExcludedUnit()) {
      nodeDifference = NodeDifference.EXCLUDED_UNIT_CHANGE;
    } else if (!originalNode.isExcludedUnit() && originalNode.isUnit() && newNode.isUnit()) {
      // Both nodes are non-excluded units - the only possible difference
      // left is the bid.
      Long bid1 = originalNode.getBid();
      Long bid2 = newNode.getBid();
      if ((bid1 == null) != (bid2 == null)) {
        nodeDifference = NodeDifference.BID_CHANGE;
      } else if (bid1 == null && bid2 == null) {
        nodeDifference = NodeDifference.NONE;
      } else if (bid1.compareTo(bid2) != 0) {
        nodeDifference = NodeDifference.BID_CHANGE;
      } else {
        nodeDifference = NodeDifference.NONE;
      }
    } else {
      nodeDifference = NodeDifference.NONE;
    }
    return nodeDifference;
  }

  /**
   * Enumeration of changes to a node.
   */
  enum NodeDifference {
    /** No differences */
    NONE,
    /** New node was added */
    NEW_NODE,
    /** Original node was removed */
    REMOVED_NODE,
    /** The product partition type differs between the two nodes */
    PARTITION_TYPE_CHANGE,
    /** The isExcludedUnit attribute differs between the two nodes - both nodes are unit nodes */
    EXCLUDED_UNIT_CHANGE,
    /** The bid differs between the two nodes - both nodes are non-excluded unit nodes */
    BID_CHANGE;
  }
}
