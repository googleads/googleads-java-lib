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

import com.google.api.ads.adwords.axis.v201708.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201708.cm.ProductType;
import com.google.common.collect.Lists;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for comparing {@link ProductType} dimensions.
 */
@RunWith(JUnit4.class)
public class ProductTypeComparatorTest extends BaseProductDimensionComparatorTest {

  @Override
  ProductType createOtherProductDimension() {
    return ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L1, null);
  }

  @Override
  List<ProductType> createNonOtherProductDimensions() {
    return Lists.newArrayList(
        ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L1, "A"),
        ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L1, "B"));
  }

  @Test
  public void testCaseInsensitive() {
    ProductType type1 = ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L1, "ABC");
    ProductType type2 = ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L1, "AbC");
    assertEquals("ProductTypes that only differ in case should be equivalent", 0,
        comparator.compare(type1, type2));
  }

  @Test
  public void testDifferByLevel() {
    ProductType type1 = ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L1, "ABC");
    ProductType type2 = ProductDimensions.createType(ProductDimensionType.PRODUCT_TYPE_L2, "AbC");
    assertThat("Attributes that differ in level # should yield compareTo != 0",
        comparator.compare(type1, type2), Matchers.not(0));
  }
}