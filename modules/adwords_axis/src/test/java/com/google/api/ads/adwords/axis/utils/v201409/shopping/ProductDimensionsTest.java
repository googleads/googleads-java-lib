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

package com.google.api.ads.adwords.axis.utils.v201409.shopping;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.axis.v201409.cm.ProductBiddingCategory;
import com.google.api.ads.adwords.axis.v201409.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201409.cm.ProductCanonicalCondition;
import com.google.api.ads.adwords.axis.v201409.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201409.cm.ProductCustomAttribute;
import com.google.api.ads.adwords.axis.v201409.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201409.cm.ProductOfferId;
import com.google.api.ads.adwords.axis.v201409.cm.ProductType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link ProductDimensions}.
 *
 * @author Josh Radcliff
 */
@RunWith(JUnit4.class)
public class ProductDimensionsTest {

  private static final String STRING_VALUE = "dummy";

  /**
   * Test method for createType.
   */
  @Test
  public void testCreateType() {
    ProductType type =
        ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L1, STRING_VALUE);
    assertEquals(STRING_VALUE, type.getValue());
  }

  /**
   * Test method for createType with a null product type level. This should fail.
   */
  @Test(expected = NullPointerException.class)
  public void testCreateType_nullTypeLevel_fails() {
    ProductDimensions.createType(null, STRING_VALUE);
  }

  /**
   * Test method for createCanonicalCondition.
   */
  @Test
  public void testCreateCanonicalCondition() {
    ProductCanonicalCondition condition =
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.NEW);
    assertEquals(ProductCanonicalConditionCondition.NEW, condition.getCondition());
  }

  /**
   * Test method for createBiddingCategory.
   */
  @Test
  public void testCreateBiddingCategory() {
    ProductBiddingCategory category =
        ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L1, 1L);
    assertEquals(ProductDimensionType.BIDDING_CATEGORY_L1, category.getType());
    assertEquals(Long.valueOf(1), category.getValue());
  }

  /**
   * Test method for testCreateBiddingCategory with a null category level. This should fail.
   */
  @Test(expected = NullPointerException.class)
  public void testCreateBiddingCategory_nullCategoryLevel_fails() {
    ProductDimensions.createBiddingCategory(null, 1L);
  }

  /**
   * Test method for createOfferId.
   */
  @Test
  public void testCreateOfferId() {
    ProductOfferId offerId = ProductDimensions.createOfferId(STRING_VALUE);
    assertEquals(STRING_VALUE, offerId.getValue());
  }

  /**
   * Test method for createBrand.
   */
  @Test
  public void testCreateBrand() {
    ProductBrand brand = ProductDimensions.createBrand(STRING_VALUE);
    assertEquals(STRING_VALUE, brand.getValue());
  }

  /**
   * Test method for createCustomAttribute.
   */
  @Test
  public void testCreateCustomAttribute() {
    ProductCustomAttribute attribute = ProductDimensions.createCustomAttribute(
        ProductDimensionType.CUSTOM_ATTRIBUTE_2, STRING_VALUE);
    assertEquals(ProductDimensionType.CUSTOM_ATTRIBUTE_2, attribute.getType());
    assertEquals(STRING_VALUE, attribute.getValue());
  }

  /**
   * Test method for testCreateBiddingCategory with a null category level. This should fail.
   */
  @Test(expected = NullPointerException.class)
  public void testCreateCustomAttribute_nullAttributeLevel_fails() {
    ProductDimensions.createCustomAttribute(null, STRING_VALUE);
  }
}
