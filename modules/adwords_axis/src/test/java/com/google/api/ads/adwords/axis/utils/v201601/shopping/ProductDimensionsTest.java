// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201601.shopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.adwords.axis.v201601.cm.ProductAdwordsGrouping;
import com.google.api.ads.adwords.axis.v201601.cm.ProductAdwordsLabels;
import com.google.api.ads.adwords.axis.v201601.cm.ProductBiddingCategory;
import com.google.api.ads.adwords.axis.v201601.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201601.cm.ProductCanonicalCondition;
import com.google.api.ads.adwords.axis.v201601.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201601.cm.ProductChannel;
import com.google.api.ads.adwords.axis.v201601.cm.ProductChannelExclusivity;
import com.google.api.ads.adwords.axis.v201601.cm.ProductCustomAttribute;
import com.google.api.ads.adwords.axis.v201601.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201601.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201601.cm.ProductLegacyCondition;
import com.google.api.ads.adwords.axis.v201601.cm.ProductOfferId;
import com.google.api.ads.adwords.axis.v201601.cm.ProductType;
import com.google.api.ads.adwords.axis.v201601.cm.ProductTypeFull;
import com.google.api.ads.adwords.axis.v201601.cm.ShoppingProductChannel;
import com.google.api.ads.adwords.axis.v201601.cm.ShoppingProductChannelExclusivity;
import com.google.api.ads.adwords.axis.v201601.cm.UnknownProductDimension;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Tests for {@link ProductDimensions}.
 */
@RunWith(JUnit4.class)
public class ProductDimensionsTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  private static final String STRING_VALUE = "dummy";

  /**
   * Set of {@link ProductDimension} subclasses to ignore because they either are not supported by
   * shopping campaigns or are not ADD-able.
   */
  private static final ImmutableSet<Class<? extends ProductDimension>> DIMENSION_TYPES_TO_IGNORE =
      ImmutableSet
          .<Class<? extends ProductDimension>>builder()
          .add(ProductAdwordsGrouping.class)
          .add(ProductAdwordsLabels.class)
          .add(ProductLegacyCondition.class)
          .add(ProductTypeFull.class)
          .add(UnknownProductDimension.class)
          .build();

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
  @Test
  public void testCreateType_nullTypeLevel_fails() {
    thrown.expect(NullPointerException.class);
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
  @Test
  public void testCreateBiddingCategory_nullCategoryLevel_fails() {
    thrown.expect(NullPointerException.class);
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
  @Test
  public void testCreateCustomAttribute_nullAttributeLevel_fails() {
    thrown.expect(NullPointerException.class);
    ProductDimensions.createCustomAttribute(null, STRING_VALUE);
  }

  /**
   * Test method for createChannel.
   */
  @Test
  public void testCreateChannel() {
    ProductChannel channel = ProductDimensions.createChannel(ShoppingProductChannel.LOCAL);
    assertEquals(ShoppingProductChannel.LOCAL, channel.getChannel());
  }

  /**
   * Test method for createChannelExclusivity.
   */
  @Test
  public void testCreateChannelExclusivity() {
    ProductChannelExclusivity channelExclusivity =
        ProductDimensions.createChannelExclusivity(ShoppingProductChannelExclusivity.MULTI_CHANNEL);
    assertEquals(ShoppingProductChannelExclusivity.MULTI_CHANNEL,
        channelExclusivity.getChannelExclusivity());
  }

  /**
   * Test that verifies that {@link ProductDimensions} has a {@code createX} method for every
   * subclass {@code X} of {@link ProductDimension}.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testCreateMethodExistsForEveryDimensionSubclass() throws Exception {
    String basePackageNameForVersion = ProductDimension.class.getPackage().getName()
        .substring(0, ProductDimension.class.getPackage().getName().length() - ".cm".length());

    ClassPath classPath = ClassPath.from(ProductDimension.class.getClassLoader());
    Set<Class<? extends ProductDimension>> dimensionSubclasses = Sets.newHashSet();
    for (ClassInfo classInfo : classPath.getTopLevelClassesRecursive(basePackageNameForVersion)) {
      Class<?> classInfoClass = classInfo.load();
      if (ProductDimension.class.isAssignableFrom(classInfoClass)
          && ProductDimension.class != classInfoClass) {
        dimensionSubclasses.add((Class<? extends ProductDimension>) classInfoClass);
      }
    }

    Map<Class<? extends ProductDimension>, Method> factoryMethodsMap =
        getAllProductDimensionFactoryMethods();
    for (Class<? extends ProductDimension> dimensionSubclass : dimensionSubclasses) {
      if (!DIMENSION_TYPES_TO_IGNORE.contains(dimensionSubclass)) {
        assertThat(
            "No factory method exists for subclass " + dimensionSubclass + " of ProductDimension",
            dimensionSubclass, Matchers.isIn(factoryMethodsMap.keySet()));
      }
    }
  }

  /**
   * Test that verifies that this test class has a test method for every {@code createX} method of
   * {@link ProductDimensions}.
   */
  @Test
  public void testCoverageOfAllCreateMethods() throws Exception {
    // Collect all of the testCreateX methods from this test class.
    Set<String> actualTestMethodNames = Sets.newHashSet();
    for (Method method : getClass().getMethods()) {
      String methodName = method.getName();
      if (methodName.startsWith("testCreate") && !methodName.contains("_")) {
        actualTestMethodNames.add(methodName);
      }
    }

    // Assert that each createX method of ProductDimensions has a corresponding
    // testCreateX method in this test class.
    for (Entry<Class<? extends ProductDimension>, Method> methodEntry :
        getAllProductDimensionFactoryMethods().entrySet()) {
      Method method = methodEntry.getValue();
      String methodName = method.getName();
      if (methodName.startsWith("create")) {
        String expectedTestMethodName = "testCreate" + methodName.substring("create".length());
        assertThat("No test exists for factory method", expectedTestMethodName,
            Matchers.isIn(actualTestMethodNames));
      }
    }
  }

  /**
   * Returns a map of return type to {@code createX} method from {@link ProductDimensions}.
   */
  @SuppressWarnings("unchecked")
  static Map<Class<? extends ProductDimension>, Method> getAllProductDimensionFactoryMethods() {
    Map<Class<? extends ProductDimension>, Method> methodsMap = Maps.newHashMap();
    for (Method method : ProductDimensions.class.getMethods()) {
      String methodName = method.getName();
      if (methodName.startsWith("create")) {
        Class<?> returnType = method.getReturnType();
        assertTrue(String.format("Return type %s of %s is not a subclass of ProductDimension",
            returnType, methodName), ProductDimension.class.isAssignableFrom(returnType));
        methodsMap.put((Class<? extends ProductDimension>) returnType, method);
      }
    }
    return methodsMap;
  }
}
