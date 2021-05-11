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

package com.google.api.ads.adwords.axis.utils.v201809.shopping;

import static org.junit.Assert.assertThat;

import com.google.api.ads.adwords.axis.v201809.cm.ProductBiddingCategory;
import com.google.api.ads.adwords.axis.v201809.cm.ProductDimensionType;
import com.google.common.collect.Lists;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for comparing {@link ProductBiddingCategory} dimensions.
 */
@RunWith(JUnit4.class)
public class ProductBiddingCategoryComparatorTest extends BaseProductDimensionComparatorTest {

  @Override
  ProductBiddingCategory createOtherProductDimension() {
    return ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L1, null);
  }

  @Override
  List<ProductBiddingCategory> createNonOtherProductDimensions() {
    return Lists.newArrayList(
        ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L1, 123L),
        ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L1, 456L));
  }

  @Test
  public void testDifferByLevel() {
    ProductBiddingCategory category1 =
        ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L1, 123L);
    ProductBiddingCategory category2 =
        ProductDimensions.createBiddingCategory(ProductDimensionType.BIDDING_CATEGORY_L2, 123L);
    assertThat("Attributes that differ in level # should yield compareTo != 0",
        comparator.compare(category1, category2), Matchers.not(0));
  }
}