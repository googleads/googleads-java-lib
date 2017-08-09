// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201708.shopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.google.api.ads.adwords.axis.v201708.cm.ProductCustomAttribute;
import com.google.api.ads.adwords.axis.v201708.cm.ProductDimensionType;
import com.google.common.collect.Lists;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for comparing {@link ProductCustomAttribute} dimensions.
 */
@RunWith(JUnit4.class)
public class ProductCustomAttributeComparatorTest extends BaseProductDimensionComparatorTest {

  @Override
  ProductCustomAttribute createOtherProductDimension() {
    return ProductDimensions.createCustomAttribute(ProductDimensionType.CUSTOM_ATTRIBUTE_0, null);
  }

  @Override
  List<ProductCustomAttribute> createNonOtherProductDimensions() {
    return Lists.newArrayList(
        ProductDimensions.createCustomAttribute(ProductDimensionType.CUSTOM_ATTRIBUTE_0, "A"),
        ProductDimensions.createCustomAttribute(ProductDimensionType.CUSTOM_ATTRIBUTE_0, "B"));
  }

  @Test
  public void testCaseInsensitive() {
    ProductCustomAttribute attrib1 =
        ProductDimensions.createCustomAttribute(ProductDimensionType.PRODUCT_TYPE_L1, "ABC");
    ProductCustomAttribute attrib2 =
        ProductDimensions.createCustomAttribute(ProductDimensionType.PRODUCT_TYPE_L1, "AbC");
    assertEquals(
        "Attributes that only differ in case should be equivalent",
        0,
        comparator.compare(attrib1, attrib2));
  }

  @Test
  public void testDifferByLevel() {
    ProductCustomAttribute attrib1 =
        ProductDimensions.createCustomAttribute(ProductDimensionType.PRODUCT_TYPE_L1, "ABC");
    ProductCustomAttribute attrib2 =
        ProductDimensions.createCustomAttribute(ProductDimensionType.PRODUCT_TYPE_L2, "AbC");
    assertThat(
        "Attributes that differ in level # should yield compareTo != 0",
        comparator.compare(attrib1, attrib2),
        Matchers.not(0));
  }
}
