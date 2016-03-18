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

package com.google.api.ads.adwords.axis.utils.v201509.shopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.adwords.axis.v201509.cm.ProductBiddingCategory;
import com.google.api.ads.adwords.axis.v201509.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201509.cm.ProductCanonicalCondition;
import com.google.api.ads.adwords.axis.v201509.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201509.cm.ProductChannel;
import com.google.api.ads.adwords.axis.v201509.cm.ProductChannelExclusivity;
import com.google.api.ads.adwords.axis.v201509.cm.ProductCustomAttribute;
import com.google.api.ads.adwords.axis.v201509.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201509.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201509.cm.ProductOfferId;
import com.google.api.ads.adwords.axis.v201509.cm.ProductType;
import com.google.api.ads.adwords.axis.v201509.cm.ShoppingProductChannel;
import com.google.api.ads.adwords.axis.v201509.cm.ShoppingProductChannelExclusivity;
import com.google.common.collect.Maps;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Map;
import java.util.Set;

/**
 * Tests for {@link ProductPartitionNode}.
 */
@RunWith(JUnit4.class)
public class ProductPartitionNodeTest {

  private ProductPartitionNode rootNode;
  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() {
    rootNode = new ProductPartitionNode(null, null, -1L, new ProductDimensionComparator());
  }

  @Test
  public void testRootNodeBasicFunctionality() {
    assertNull("parent of parentNode should be null", rootNode.getParent());
    assertNull("parentNode dimension should be null", rootNode.getDimension());
    assertEquals("dimension from getDimension should be logically equivalent to null", 0,
        new ProductDimensionComparator().compare(null, rootNode.getDimension()));
    assertEquals("partition ID is incorrect after constructor", -1L,
        rootNode.getProductPartitionId().longValue());
    rootNode = rootNode.setProductPartitionId(-2L);
    assertEquals("partition ID is incorrect after setProductPartitionId", -2L,
        rootNode.getProductPartitionId().longValue());
    assertFalse("parentNode should not have any children",
        rootNode.getChildren().iterator().hasNext());
    assertTrue("new node should be a unit node by default", rootNode.isUnit());
    assertFalse("new node should not be a subdivision by default", rootNode.isSubdivision());
    assertTrue("new node should be a biddable unit node by default", rootNode.isBiddableUnit());
  }

  @Test
  public void testChildNodeBasicFunctionality() {
    rootNode = rootNode.asSubdivision();
    assertFalse("parent should not be a unit", rootNode.isUnit());
    assertTrue("parent should be a subdivision", rootNode.isSubdivision());
    ProductBrand childDimension = ProductDimensions.createBrand("google");
    ProductPartitionNode childNode = rootNode.addChild(childDimension);
    assertNotSame("getDimension should return a copy", childDimension, childNode.getDimension());
    assertEquals("dimension from getDimension should be logically equivalent to childDimension", 0,
        new ProductDimensionComparator().compare(childDimension, childNode.getDimension()));

    assertSame("child.getParent should return parentNode", rootNode, childNode.getParent());
    assertNull("partition ID is incorrect", childNode.getProductPartitionId());
    assertFalse("childNode should not have any children",
        childNode.getChildren().iterator().hasNext());
    assertTrue("new node should be a unit node by default", childNode.isUnit());
    assertTrue("new node should be a biddable unit node by default", childNode.isBiddableUnit());

    assertTrue("rootNode.hasChild should return true when passed the dimension of the added child",
        rootNode.hasChild(childDimension));
    assertFalse("rootNode.hasChild should return false when passed a dimension for a nonexistent "
        + "child", rootNode.hasChild(ProductDimensions.createBrand("xyz")));
    assertFalse("rootNode.hasChild should return false when passed a dimension for a nonexistent "
        + "child", rootNode.hasChild(null));

    String childToString = childNode.toString();
    assertNotNull("child toString returned null", childToString);
    String parentDetailedToString = rootNode.toDetailedString();
    assertThat("Parent toDetailedString does not contain the child's toString",
        parentDetailedToString, Matchers.containsString(childToString));
    String parentToString = rootNode.toString();
    assertNotNull("parent toString returned null", parentToString);
    assertThat("Parent toDetailedString does not contain the parent's toString",
        parentDetailedToString, Matchers.containsString(parentToString));
  }

  /**
   * Checks that adding a child to a UNIT node fails.
   */
  @Test
  public void testAddChildToUnit_fails() {
    assertTrue("root should be a unit by default", rootNode.isUnit());
    thrown.expect(IllegalArgumentException.class);
    rootNode.addChild(ProductDimensions.createBrand("google"));
  }

  @Test
  public void testCreateExcludedRoot_fails() {
    thrown.expect(IllegalStateException.class);
    rootNode.asExcludedUnit();
  }

  @Test
  public void testGetChildThatDoesNotExist_fails() {
    rootNode = rootNode.asSubdivision();
    thrown.expect(IllegalArgumentException.class);
    rootNode.getChild(ProductDimensions.createBrand("google"));
  }

  @Test
  public void testRemoveChildThatDoesNotExist_fails() {
    rootNode = rootNode.asSubdivision();
    thrown.expect(IllegalArgumentException.class);
    rootNode.removeChild(ProductDimensions.createBrand("google"));
  }

  @Test
  public void testAddChildThatExists_fails() {
    rootNode = rootNode.asSubdivision();
    rootNode.addChild(ProductDimensions.createBrand("google"));

    // Add the same child again. The call should fail.
    thrown.expect(IllegalArgumentException.class);
    rootNode.addChild(ProductDimensions.createBrand("google"));
  }

  /**
   * Checks that setting a bid on a SUBDIVISION node fails.
   */
  @Test
  public void testSetBidOnSubdivision_fails() {
    rootNode = rootNode.asSubdivision();
    thrown.expect(IllegalStateException.class);
    rootNode.setBid(1L);
  }

  /**
   * Checks that setting a negative bid on a UNIT node fails.
   */
  @Test
  public void testSetNegativeBid_fails() {
    assertTrue("root should be a unit by default", rootNode.isUnit());
    thrown.expect(IllegalArgumentException.class);
    rootNode.setBid(-1L);
  }

  @Test
  public void testSetBidOnUnit() {
    rootNode = rootNode.asSubdivision();
    ProductBrand childDimension = ProductDimensions.createBrand("google");
    ProductPartitionNode childNode = rootNode.addChild(childDimension);

    assertNull("Bid should be null by default", childNode.getBid());

    childNode = childNode.setBid(1L);
    assertEquals("Bid does not reflect setBid", 1L, childNode.getBid().longValue());
    assertTrue("Node should be a biddable unit", childNode.isBiddableUnit());

    childNode = childNode.asExcludedUnit();
    assertTrue("Node should be an excluded unit", childNode.isExcludedUnit());
    assertFalse("Node should not be a biddable unit", childNode.isBiddableUnit());
    assertNull("Excluded unit should have a null bid", childNode.getBid());

    // Set back to biddable.
    childNode = childNode.asBiddableUnit();
    assertTrue("Node should be a biddable unit", childNode.isBiddableUnit());
  }

  @Test
  public void testNavigation() {
    rootNode = rootNode.asSubdivision();
    ProductBrand brandGoogle = ProductDimensions.createBrand("google");
    ProductBrand brandOther = ProductDimensions.createBrand(null);
    ProductCanonicalCondition conditionNew =
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.NEW);
    ProductCanonicalCondition conditionUsed =
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.USED);
    ProductCanonicalCondition conditionOther = ProductDimensions.createCanonicalCondition(null);

    // Build up the brand = Google node under the root.
    ProductPartitionNode brandGoogleNode = rootNode.addChild(brandGoogle).asSubdivision();
    brandGoogleNode.addChild(conditionNew);
    brandGoogleNode.addChild(conditionUsed);
    brandGoogleNode.addChild(conditionOther);

    assertTrue("hasChild should return true for existing child dimension",
        brandGoogleNode.hasChild(conditionNew));
    assertSame("parent->getChild->getParent should return parent", brandGoogleNode,
        brandGoogleNode.getChild(conditionNew).getParent());
    assertTrue("hasChild should return true for existing child dimension",
        brandGoogleNode.hasChild(conditionUsed));
    assertSame("parent->getChild->getParent should return parent", brandGoogleNode,
        brandGoogleNode.getChild(conditionUsed).getParent());
    assertTrue("hasChild should return true for existing child dimension",
        brandGoogleNode.hasChild(conditionOther));
    assertSame("parent->getChild->getParent should return parent", brandGoogleNode,
        brandGoogleNode.getChild(conditionOther).getParent());

    // Build up the brand = null (other) node under the root.
    ProductPartitionNode brandOtherNode = rootNode.addChild(brandOther).asSubdivision();
    brandOtherNode.addChild(conditionNew);
    assertTrue("hasChild should return true for existing child dimension",
        brandOtherNode.hasChild(conditionNew));
    assertSame("parent->getChild->getParent should return parent", brandOtherNode,
        brandOtherNode.getChild(conditionNew).getParent());
    assertFalse("hasChild should return false for nonexistent child dimension",
        brandOtherNode.hasChild(conditionUsed));
    assertFalse("hasChild should return false for nonexistent child dimension",
        brandOtherNode.hasChild(conditionOther));
    brandOtherNode.addChild(conditionOther);
    assertTrue("hasChild should return true for existing child dimension",
        brandOtherNode.hasChild(conditionOther));
    assertSame("parent->getChild->getParent should return parent", brandOtherNode,
        brandOtherNode.getChild(conditionOther).getParent());

    // Remove one of the children of brand = null.
    brandOtherNode.removeChild(conditionOther);
    assertFalse("hasChild should return false for a removed child dimension",
        brandOtherNode.hasChild(conditionOther));

    // Remove the rest of the children of brand = null.
    brandOtherNode.removeAllChildren();
    assertFalse("hasChild should return false for any removed child dimension",
        brandOtherNode.hasChild(conditionNew));
    assertFalse("hasChild should return false for any removed child dimension",
        brandOtherNode.hasChild(conditionUsed));
  }
  
  /**
   * Test to confirm that {@link ProductPartitionNode#toString(ProductDimension)} handles each
   * subclass of {@link ProductDimension}. This will help ensure that
   * {@link ProductPartitionNode#toString(ProductDimension)} is kept up to date with changes in
   * {@link ProductDimensions}.
   */
  @Test
  public void testDimensionToString() throws Exception {
    // Use reflection to determine which subclasses of ProductDimension have a factory
    // method in ProductDimensions.
    Set<Class<? extends ProductDimension>> dimensionSubclasses =
        ProductDimensionsTest.getAllProductDimensionFactoryMethods().keySet();

    // Create a sample instance for each subclass of ProductDimension.
    Map<Class<? extends ProductDimension>, ProductDimension> dimensionsByType = Maps.newHashMap();
    dimensionsByType.put(ProductBrand.class, ProductDimensions.createBrand("testBrand"));
    dimensionsByType.put(ProductBiddingCategory.class,
        ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L1, 123L));
    dimensionsByType.put(ProductCanonicalCondition.class,
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.NEW));
    dimensionsByType.put(ProductChannel.class,
        ProductDimensions.createChannel(ShoppingProductChannel.LOCAL));
    dimensionsByType.put(ProductChannelExclusivity.class, ProductDimensions
        .createChannelExclusivity(ShoppingProductChannelExclusivity.SINGLE_CHANNEL));
    dimensionsByType.put(ProductCustomAttribute.class, ProductDimensions.createCustomAttribute(
        ProductDimensionType.CUSTOM_ATTRIBUTE_2, "testAttribute"));
    dimensionsByType.put(ProductOfferId.class, ProductDimensions.createOfferId("testOfferId"));
    dimensionsByType.put(ProductType.class,
        ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L3, "testType"));

    // For each ProductDimension subclass, assert that we have a sample instance and that
    // ProductPartitionNode.toString(ProductDimension) produces a meaningful String for the
    // sample instance.
    for (Class<? extends ProductDimension> dimensionSubclass : dimensionSubclasses) {
      ProductDimension sampleDimension = dimensionsByType.get(dimensionSubclass);
      assertNotNull("No sample dimension found for ProductDimension subclass " + dimensionSubclass
          + ". Add a sample instance of this type to the dimensionsByType map in this test.",
          sampleDimension);
      String dimensionToString = ProductPartitionNode.toString(sampleDimension);
      assertThat("ProductPartitionNode.toString does not appear to recognize any attributes of "
          + dimensionSubclass, dimensionToString, Matchers.not(Matchers.containsString("[]")));
      assertThat("ProductPartitionNode.toString failed to interpret the attributes of a "
          + dimensionSubclass, dimensionToString, Matchers.not(Matchers.containsString("UNKNOWN")));
    }
  }
}

