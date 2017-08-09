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

import com.google.api.ads.adwords.axis.v201708.cm.ProductBrand;
import com.google.common.collect.Lists;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for comparing {@link ProductBrand} dimensions.
 */
@RunWith(JUnit4.class)
public class ProductBrandComparatorTest extends BaseProductDimensionComparatorTest {

  @Override
  ProductBrand createOtherProductDimension() {
    return ProductDimensions.createBrand(null);
  }

  @Override
  List<ProductBrand> createNonOtherProductDimensions() {
    return Lists.newArrayList(
        ProductDimensions.createBrand("A"), ProductDimensions.createBrand("B"));
  }

  @Test
  public void testCaseInsensitive() {
    ProductBrand brand1 = ProductDimensions.createBrand("ABC");
    ProductBrand brand2 = ProductDimensions.createBrand("AbC");
    assertEquals(
        "Brands that only differ in case should be equivalent",
        0,
        comparator.compare(brand1, brand2));
  }
}
