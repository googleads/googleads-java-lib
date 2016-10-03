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

package com.google.api.ads.adwords.axis.utils.v201609.shopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.google.api.ads.adwords.axis.v201609.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201609.cm.ProductDimension;
import java.util.Comparator;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Base class for ProductDimension comparator tests.
 */
public abstract class BaseProductDimensionComparatorTest {

  /** Subclass of ProductDimension that the comparator will not recognize. */
  private static class UnsupportedDimensionType extends ProductDimension {
  }

  protected final Comparator<ProductDimension> comparator = new ProductDimensionComparator();
  @Rule public ExpectedException thrown = ExpectedException.none();
  
  /**
   * Returns an instance of D for the "other" case, a.k.a. the "everything else" case.
   */
  abstract ProductDimension createOtherProductDimension();
  
  /**
   * Returns at least two instances of D that are <em>not</em> the "other" case. The list
   * should be ordered.
   */
  abstract List<? extends ProductDimension> createNonOtherProductDimensions();

  @Test
  public void testIdentityComparison() {
    ProductDimension dimension = createOtherProductDimension();
    int result = comparator.compare(dimension, dimension);
    assertEquals("Comparing a dimension to itself should return 0", 0, result);
  }

  @Test
  public void testBothNull() {
    assertEquals("Comparing null to null should return 0", 0, comparator.compare(null, null));
  }

  @Test
  public void testOnlyOneNull() {
    ProductDimension dimension = createOtherProductDimension();
    assertThat("Null should be greater than non-null", comparator.compare(null, dimension),
        Matchers.greaterThan(0));
    assertThat("Non-null should be less than null", comparator.compare(dimension, null),
        Matchers.lessThan(0));
  }
  
  @Test
  public void testNeitherNull() {
    ProductDimension otherDimension = createOtherProductDimension();
    List<? extends ProductDimension> nonOtherDimensions = createNonOtherProductDimensions();
    if (nonOtherDimensions == null) {
      return;
    }
    int result = comparator.compare(otherDimension, nonOtherDimensions.get(0));
    assertThat("The 'other' case should be > the non-other case", result,
        Matchers.greaterThan(0));
  }

  @Test
  public void testCompareToDifferentDimensionType() {
    ProductDimension dimension = createOtherProductDimension();
    ProductDimension otherTypeOfDimension =
        dimension instanceof ProductBrand ? ProductDimensions.createOfferId("abc")
            : ProductDimensions.createBrand("google");
    assertThat("Comparing dimensions of different types should return a non-zero result",
        comparator.compare(dimension, otherTypeOfDimension), Matchers.not(0));
    assertThat("Comparing dimensions of different types should return a non-zero result",
        comparator.compare(otherTypeOfDimension, dimension), Matchers.not(0));
  }

  /**
   * Tests that the comparator throws an IllegalArgumentException when passed two non-null instances
   * of an unsupported subclass of ProductDimension.
   */
  @Test
  public void testCompareUnsupportedDimensionTypes_bothNonNull_fails() {
    // Compare two instances of the subclass.
    ProductDimension otherTypeOfDimension1 = new UnsupportedDimensionType();
    ProductDimension otherTypeOfDimension2 = new UnsupportedDimensionType();
    thrown.expect(IllegalArgumentException.class);
    comparator.compare(otherTypeOfDimension1, otherTypeOfDimension2);
  }
  
  /**
   * Tests that the comparator throws an IllegalArgumentException when passed a non-null instance
   * of an unsupported subclass of ProductDimension as the first argument, and null as the second
   * argument.
   */
  @Test
  public void testCompareUnsupportedDimensionTypes_firstNonNull_fails() {
    // Compare an unsupported type to null.
    ProductDimension unsupportedTypeOfDimension = new UnsupportedDimensionType();
    thrown.expect(IllegalArgumentException.class);
    comparator.compare(unsupportedTypeOfDimension, null);
  }
  
  /**
   * Tests that the comparator throws an IllegalArgumentException when passed null as the first
   * argument, and a non-null instance of an unsupported subclass of ProductDimension as the second
   * argument.
   */
  @Test
  public void testCompareUnsupportedDimensionTypes_secondNonNull_fails() {
    // Compare null to an unsupported type.
    ProductDimension unsupportedTypeOfDimension = new UnsupportedDimensionType();
    thrown.expect(IllegalArgumentException.class);
    comparator.compare(null, unsupportedTypeOfDimension);
  }
  
  /**
   * Tests that the comparator throws an IllegalArgumentException when passed an instance of an
   * unsupported subclass of ProductDimension as the first argument, and an instance of a supported
   * type as the second argument.
   */
  @Test
  public void testCompareUnsupportedDimensionTypes_firstUnsupported_fails() {
    // Compare an unsupported type to null.
    ProductDimension unsupportedTypeOfDimension = new UnsupportedDimensionType();
    thrown.expect(IllegalArgumentException.class);
    comparator.compare(unsupportedTypeOfDimension, createOtherProductDimension());
  }

  /**
   * Tests that the comparator throws an IllegalArgumentException when passed an instance of a
   * supported type as the first argument, and an instance of an unsupported subclass of
   * ProductDimension as the second argument.
   */
  @Test
  public void testCompareUnsupportedDimensionTypes_secondUnsupported_fails() {
    // Compare null to an unsupported type.
    ProductDimension unsupportedTypeOfDimension = new UnsupportedDimensionType();
    thrown.expect(IllegalArgumentException.class);
    comparator.compare(createOtherProductDimension(), unsupportedTypeOfDimension);
  }
}

