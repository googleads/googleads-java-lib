// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201802.shopping;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.axis.utils.v201802.shopping.ProductPartitionNodeDiffer.NodeDifference;
import com.google.api.ads.adwords.axis.v201802.cm.ProductDimension;
import java.util.Comparator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link ProductPartitionNodeDiffer}.
 */
@RunWith(JUnit4.class)
public class ProductPartitionNodeDifferTest {

  private final Comparator<ProductDimension> dimensionComparator = new ProductDimensionComparator();

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  /**
   * Test for when both nodes are null.
   */
  @Test
  public void testFindNodeDifference_bothNull() {
    NodeDifference diff = ProductPartitionNodeDiffer.diff(null, null, dimensionComparator);
    assertEquals(NodeDifference.NONE, diff);
  }

  /**
   * Test for when the new node is null and the original node is not null.
   */
  @Test
  public void testFindNodeDifference_newNull() {
    ProductPartitionNode origNode = new ProductPartitionNode(null, null, -1L, dimensionComparator);
    NodeDifference diff = ProductPartitionNodeDiffer.diff(origNode, null, dimensionComparator);
    assertEquals(NodeDifference.REMOVED_NODE, diff);
  }

  /**
   * Test for when the new node is not null and the original node is null.
   */
  @Test
  public void testFindNodeDifference_origNull() {
    ProductPartitionNode newNode = new ProductPartitionNode(null, null, -1L, dimensionComparator);
    NodeDifference diff = ProductPartitionNodeDiffer.diff(null, newNode, dimensionComparator);
    assertEquals(NodeDifference.NEW_NODE, diff);
  }

  /**
   * Test for when both nodes are not null and are logically equivalent.
   */
  @Test
  public void testFindNodeDifference_neitherNull_logicallyEquivalent() {
    ProductPartitionNode origNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asSubdivision();
    ProductPartitionNode newNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asSubdivision();
    NodeDifference diff = ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator);
    assertEquals(NodeDifference.NONE, diff);
  }

  /**
   * Test for when comparing a node to itself.
   */
  @Test
  public void testFindNodeDifference_identity() {
    ProductPartitionNode node = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asSubdivision();
    assertEquals(NodeDifference.NONE,
        ProductPartitionNodeDiffer.diff(node, node, dimensionComparator));
  }

  /**
   * Test for when the dimensions of the two nodes differ. In this case, expect an
   * IllegalArgumentException.
   */
  @Test
  public void testFindNodeDifference_differentDimensionTypes_fails() {
    ProductPartitionNode origNode = new ProductPartitionNode(null,
        ProductDimensions.createBrand("nike"), -1L, dimensionComparator);
    ProductPartitionNode newNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator);
    thrown.expect(IllegalArgumentException.class);
    ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator);
  }

  /**
   * Test for when the dimensions of the two nodes differ and the original node has a null
   * dimension. In this case, expect an IllegalArgumentException.
   */
  @Test
  public void testFindNodeDifference_differentDimensionTypes_origNullDimension_fails() {
    ProductPartitionNode origNode = new ProductPartitionNode(null, null, -1L, dimensionComparator);
    ProductPartitionNode newNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator);
    thrown.expect(IllegalArgumentException.class);
    ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator);
  }

  /**
   * Test for when the dimensions of the two nodes differ and the new node has a null dimension. In
   * this case, expect an IllegalArgumentException.
   */
  @Test
  public void testFindNodeDifference_differentDimensionTypes_newNullDimension_fails() {
    ProductPartitionNode origNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator);
    ProductPartitionNode newNode = new ProductPartitionNode(null, null, -1L, dimensionComparator);
    thrown.expect(IllegalArgumentException.class);
    ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator);
  }

  /**
   * Test for when the two nodes differ in partition type.
   */
  @Test
  public void testFindNodeDifference_partitionTypeDiffers() {
    ProductPartitionNode origNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asSubdivision();
    ProductPartitionNode newNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asBiddableUnit();
    // Regardless of which is original and which is new, the differ should return the same
    // NodeDifference for this case.
    assertEquals(NodeDifference.PARTITION_TYPE_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.PARTITION_TYPE_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));
  }

  /**
   * Test for when the two unit nodes differ in bid amount.
   */
  @Test
  public void testFindNodeDifference_bidDiffers() {
    ProductPartitionNode origNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asBiddableUnit().setBid(
        1000000L);
    ProductPartitionNode newNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asBiddableUnit().setBid(
        2000000L);
    // Regardless of which is original and which is new, the differ should return the same
    // NodeDifference for this case.
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));

    // Result should be the same if one of the nodes has a null bid.
    newNode = newNode.setBid(null);
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));
  }

  @Test
  public void testFindNodeDifference_trackingTemplateDiffers() {
    ProductPartitionNode origNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asBiddableUnit().setBid(
        1000000L).setTrackingUrlTemplate("http://www.example.com/tracking/1");
    ProductPartitionNode newNode = new ProductPartitionNode(null,
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asBiddableUnit().setBid(
        1000000L).setTrackingUrlTemplate("http://www.example.com/tracking/2");
    // Regardless of which is original and which is new, the differ should return the same
    // NodeDifference for this case.
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));
    // Result should be the same if one of the nodes has a null tracking template.
    newNode = newNode.setTrackingUrlTemplate(null);
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));
  }

  @Test
  public void testFindNodeDifference_customParametersDiffers() {
    ProductPartitionNode origNode =
        new ProductPartitionNode(
                null, ProductDimensions.createOfferId("1234"), -1L, dimensionComparator)
            .asBiddableUnit()
            .setBid(1000000L)
            .putCustomParameter("param0", "value0")
            .putCustomParameter("param1", "value1");

    ProductPartitionNode newNode =
        new ProductPartitionNode(
                null, ProductDimensions.createOfferId("1234"), -1L, dimensionComparator)
            .asBiddableUnit()
            .setBid(1000000L)
            .putCustomParameter("param0", "newValue0")
            .putCustomParameter("param1", "newValue1");
    // Regardless of which is original and which is new, the differ should return the same
    // NodeDifference for this case.
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));
    // Result should be the same if one of the nodes has a null custom parameters.
    newNode.getCustomParameters().keySet().forEach(newNode::removeCustomParameter);
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.BIDDABLE_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));
  }

  /**
   * Test for when the two nodes are unit nodes but one is excluded and the other is biddable.
   */
  @Test
  public void testFindNodeDifference_isExcludedDiffers() {
    ProductPartitionNode origNode = new ProductPartitionNode(
        new ProductPartitionNode(null, null, 2L, dimensionComparator),
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asBiddableUnit().setBid(
        1000000L);
    ProductPartitionNode newNode = new ProductPartitionNode(
        new ProductPartitionNode(null, null, 2L, dimensionComparator),
        ProductDimensions.createOfferId("1234"), -1L, dimensionComparator).asExcludedUnit();
    // Regardless of which is original and which is new, the differ should return the same
    // NodeDifference for this case.
    assertEquals(NodeDifference.EXCLUDED_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(origNode, newNode, dimensionComparator));
    assertEquals(NodeDifference.EXCLUDED_UNIT_CHANGE,
        ProductPartitionNodeDiffer.diff(newNode, origNode, dimensionComparator));
  }
}
