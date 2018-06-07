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

package com.google.api.ads.adwords.axis.utils.v201806.shopping;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.axis.v201806.cm.ProductOfferId;
import com.google.common.collect.Lists;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for comparing {@link ProductOfferId} dimensions.
 */
@RunWith(JUnit4.class)
public class ProductOfferIdComparatorTest extends BaseProductDimensionComparatorTest {

  @Override
  ProductOfferId createOtherProductDimension() {
    return ProductDimensions.createOfferId(null);
  }

  @Override
  List<ProductOfferId> createNonOtherProductDimensions() {
    return Lists.newArrayList(
        ProductDimensions.createOfferId("A"), ProductDimensions.createOfferId("B"));
  }

  @Test
  public void testCaseInsensitive() {
    ProductOfferId offerId1 = ProductDimensions.createOfferId("ABC");
    ProductOfferId offerId2 = ProductDimensions.createOfferId("AbC");
    assertEquals(
        "OfferIds that only differ in case should be equivalent",
        0,
        comparator.compare(offerId1, offerId2));
  }
}
