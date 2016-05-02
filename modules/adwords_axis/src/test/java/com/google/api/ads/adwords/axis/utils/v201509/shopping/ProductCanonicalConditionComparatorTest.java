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

import com.google.api.ads.adwords.axis.v201509.cm.ProductCanonicalCondition;
import com.google.api.ads.adwords.axis.v201509.cm.ProductCanonicalConditionCondition;
import com.google.common.collect.Lists;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

/**
 * Tests for comparing {@link ProductCanonicalCondition} dimensions.
 */
@RunWith(JUnit4.class)
public class ProductCanonicalConditionComparatorTest extends BaseProductDimensionComparatorTest {

  @Override
  ProductCanonicalCondition createOtherProductDimension() {
    return ProductDimensions.createCanonicalCondition(null);
  }

  @Override
  List<ProductCanonicalCondition> createNonOtherProductDimensions() {
    return Lists.newArrayList(
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.NEW),
        ProductDimensions.createCanonicalCondition(ProductCanonicalConditionCondition.USED));
  }
}
