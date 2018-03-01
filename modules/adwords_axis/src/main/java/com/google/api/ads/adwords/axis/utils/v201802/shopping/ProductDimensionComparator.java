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

package com.google.api.ads.adwords.axis.utils.v201802.shopping;

import com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory;
import com.google.api.ads.adwords.axis.v201802.cm.ProductBrand;
import com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalCondition;
import com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalConditionCondition;
import com.google.api.ads.adwords.axis.v201802.cm.ProductChannel;
import com.google.api.ads.adwords.axis.v201802.cm.ProductChannelExclusivity;
import com.google.api.ads.adwords.axis.v201802.cm.ProductCustomAttribute;
import com.google.api.ads.adwords.axis.v201802.cm.ProductDimension;
import com.google.api.ads.adwords.axis.v201802.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201802.cm.ProductOfferId;
import com.google.api.ads.adwords.axis.v201802.cm.ProductType;
import com.google.api.ads.adwords.axis.v201802.cm.ShoppingProductChannel;
import com.google.api.ads.adwords.axis.v201802.cm.ShoppingProductChannelExclusivity;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import javax.annotation.Nullable;

/**
 * Subclass-aware comparator for {@link ProductDimension} objects. Performs a <em>logical</em>
 * comparison between instances. This comparator is <em>not</em> consistent with
 * {@link #equals(Object)}.
 *
 * <p>The {@link #compare(ProductDimension, ProductDimension)} method handles nulls, ordering nulls
 * last.
 */
class ProductDimensionComparator implements Comparator<ProductDimension> {

  private final
      ImmutableMap<Class<? extends ProductDimension>, Comparator<? extends ProductDimension>>
      comparatorMap;
  
  /**
   * Ordering for Comparable objects that places nulls last, then defers to the Comparable's
   * natural ordering.
   */
  private static final Ordering<Comparable<?>> NULLS_LAST_NATURAL_ORDERING =
      Ordering.natural().nullsLast();
  
  /**
   * Ordering for any type that simply compares null-ness, placing nulls last.
   */
  private static final Ordering<Object> NULLS_LAST_OBJECT_ORDERING =
      Ordering.allEqual().nullsLast();
  
  /**
   * Ordering for ProductDimensionType that compares by {@link ProductDimensionType#getValue()},
   * placing nulls last.
   */
  private static final Ordering<ProductDimensionType> NULLS_LAST_DIMENSION_TYPE_ORDERING =
      new Ordering<ProductDimensionType>() {
        @Override
        public int compare(ProductDimensionType left, ProductDimensionType right) {
          return NULLS_LAST_CASE_INSENSITIVE_ORDERING.compare(left.getValue(), right.getValue());
        }
      }.nullsLast();
        
  /**
   * Ordering for String that places nulls last, then defers to
   * {@link String#CASE_INSENSITIVE_ORDER}.
   */
  private static final Ordering<String> NULLS_LAST_CASE_INSENSITIVE_ORDERING =
      Ordering.from(String.CASE_INSENSITIVE_ORDER).nullsLast();

  ProductDimensionComparator() {
    Builder<Class<? extends ProductDimension>, Comparator<? extends ProductDimension>> mapBuilder =
        ImmutableMap.builder();
    mapBuilder.put(ProductBiddingCategory.class, new ProductBiddingCategoryComparator());
    mapBuilder.put(ProductBrand.class, new ProductBrandComparator());
    mapBuilder.put(ProductCanonicalCondition.class, new ProductCanonicalConditionComparator());
    mapBuilder.put(ProductCustomAttribute.class, new ProductCustomAttributeComparator());
    mapBuilder.put(ProductOfferId.class, new ProductOfferIdComparator());
    mapBuilder.put(ProductType.class, new ProductTypeComparator());
    mapBuilder.put(ProductChannel.class, new ProductChannelComparator());
    mapBuilder.put(ProductChannelExclusivity.class, new ProductChannelExclusivityComparator());
    comparatorMap = mapBuilder.build();
  }

  @Override
  public int compare(@Nullable ProductDimension d1, @Nullable ProductDimension d2) {
    // Confirm that each of d1 and d2 is either null or is a supported subclass of ProductDimension.
    Preconditions.checkArgument(d1 == null || comparatorMap.containsKey(d1.getClass()),
        "Unsupported dimension type %s", d1);
    Preconditions.checkArgument(d2 == null || comparatorMap.containsKey(d2.getClass()),
        "Unsupported dimension type %s", d2);
    
    if (d1 == d2) {
      return 0;
    }

    // Order nulls last.
    int result = NULLS_LAST_OBJECT_ORDERING.compare(d1, d2);
    if (result != 0) {
      return result;
    }

    // java.lang.Class does not implement Comparable, so compare by fully qualified name instead.
    result = d1.getClass().getName().compareTo(d2.getClass().getName());
    if (result != 0) {
      return result;
    }

    Preconditions.checkArgument(d1.getClass().equals(d2.getClass()),
        "Assumption failed - class of %s and %s are not equal", d1, d2);

    // Both dimensions are of the same type, so now compare by the appropriate values
    // for the type.
    return getDeepComparator(d1).compare(d1, d2);
  }

  /**
   * Returns the deep comparator that will compare the appropriate values between two instances of
   * type D. Throws an IllegalArgumentException if {@code D} is a subclass of ProductDimension not
   * supported by Shopping campaigns. As of v201409, the types not supported by Shopping campaigns
   * are:
   * <ul>
   * <li>ProductAdWordsGrouping</li>
   * <li>ProductAdWordsLabels</li>
   * <li>ProductLegacyCondition</li>
   * <li>ProductTypeFull</li>
   * </ul>
   *
   * @throws IllegalArgumentException if {@code D} is not a dimension type supported by this
   *         comparator
   */
  private <D extends ProductDimension> Comparator<D> getDeepComparator(D dimension) {
    @SuppressWarnings("unchecked")
    Comparator<D> comparator = (Comparator<D>) comparatorMap.get(dimension.getClass());
    Preconditions.checkArgument(comparator != null,
        "No comparator exists for %s. This comparator only supports comparisons of "
        + "ProductDimension subclasses supported by Shopping campaigns.", dimension);
    return comparator;
  }

  // Below are the ProductDimension subclass-specific implementations of Comparator. Each of these
  // assumes that it will only be passed non-null arguments since ProductDimensionComparator.compare
  // will only defer to one of these Comparators if neither object is null. 

  /**
   * Comparator for {@link ProductBiddingCategory} objects that orders by type and then value.
   * Assumes that neither object is null.
   */
  private static class ProductBiddingCategoryComparator implements
      Comparator<ProductBiddingCategory> {

    @Override
    public int compare(ProductBiddingCategory o1, ProductBiddingCategory o2) {
      int result = NULLS_LAST_DIMENSION_TYPE_ORDERING.compare(o1.getType(), o2.getType());
      if (result != 0) {
        return result;
      }

      // Value is optional, so handle nulls.
      return NULLS_LAST_NATURAL_ORDERING.compare(o1.getValue(), o2.getValue());
    }
  }

  /**
   * Comparator for {@link ProductBrand} objects that orders by value. Assumes that neither object
   * is null.
   */
  private static class ProductBrandComparator implements Comparator<ProductBrand> {

    @Override
    public int compare(ProductBrand o1, ProductBrand o2) {
      return NULLS_LAST_CASE_INSENSITIVE_ORDERING.compare(o1.getValue(), o2.getValue());
    }
  }

  /**
   * Comparator for {@link ProductCanonicalCondition} objects that orders by condition. Assumes that
   * neither object is null.
   */
  private static class ProductCanonicalConditionComparator implements
      Comparator<ProductCanonicalCondition> {

    @Override
    public int compare(ProductCanonicalCondition o1, ProductCanonicalCondition o2) {
      ProductCanonicalConditionCondition condition1 = o1.getCondition();
      ProductCanonicalConditionCondition condition2 = o2.getCondition();

      if (condition1 == condition2) {
        return 0;
      }

      // If one condition is null but not the other, order so that the null object will be last.
      int result = NULLS_LAST_OBJECT_ORDERING.compare(condition1, condition2); 
      if (result != 0) {
        return result;
      }

      return NULLS_LAST_NATURAL_ORDERING.compare(condition1.getValue(), condition2.getValue());
    }
  }

  /**
   * Comparator for {@link ProductCustomAttribute} objects that orders by type then value. Assumes
   * that neither object is null.
   */
  private static class ProductCustomAttributeComparator implements
      Comparator<ProductCustomAttribute> {

    @Override
    public int compare(ProductCustomAttribute o1, ProductCustomAttribute o2) {
      int result = NULLS_LAST_DIMENSION_TYPE_ORDERING.compare(o1.getType(), o2.getType());
      if (result != 0) {
        return result;
      }

      return NULLS_LAST_CASE_INSENSITIVE_ORDERING.compare(o1.getValue(), o2.getValue());
    }
  }

  /**
   * Comparator for {@link ProductOfferId} objects that orders by value. Assumes that neither object
   * is null.
   */
  private static class ProductOfferIdComparator implements Comparator<ProductOfferId> {

    @Override
    public int compare(ProductOfferId o1, ProductOfferId o2) {
      return NULLS_LAST_CASE_INSENSITIVE_ORDERING.compare(o1.getValue(), o2.getValue());
    }
  }

  /**
   * Comparator for {@link ProductType} objects that orders by type then value. Assumes that neither
   * object is null.
   */
  private static class ProductTypeComparator implements Comparator<ProductType> {

    @Override
    public int compare(ProductType o1, ProductType o2) {
      int result = NULLS_LAST_DIMENSION_TYPE_ORDERING.compare(o1.getType(), o2.getType());
      if (result != 0) {
        return result;
      }

      return NULLS_LAST_CASE_INSENSITIVE_ORDERING.compare(o1.getValue(), o2.getValue());
    }
  }
  
  /**
   * Comparator for {@link ProductChannel} objects that orders by channel. Assumes that neither
   * object is null.
   */
  private static class ProductChannelComparator implements Comparator<ProductChannel> {

    @Override
    public int compare(ProductChannel o1, ProductChannel o2) {
      ShoppingProductChannel channel1 = o1.getChannel();
      ShoppingProductChannel channel2 = o2.getChannel();
      
      if (channel1 == channel2) {
        return 0;
      }
      
      // If one channel is null but not the other, order so that the null object will be last.
      int result = NULLS_LAST_OBJECT_ORDERING.compare(channel1, channel2);
      if (result != 0) {
        return result;
      }

      return NULLS_LAST_NATURAL_ORDERING.compare(channel1.getValue(), channel2.getValue());
    }
  }
  
  /**
   * Comparator for {@link ProductChannelExclusivity} objects that orders by channel exclusivity.
   * Assumes that neither object is null.
   */
  private static class ProductChannelExclusivityComparator implements
      Comparator<ProductChannelExclusivity> {

    @Override
    public int compare(ProductChannelExclusivity o1, ProductChannelExclusivity o2) {
      ShoppingProductChannelExclusivity exclusivity1 = o1.getChannelExclusivity();
      ShoppingProductChannelExclusivity exclusivity2 = o2.getChannelExclusivity();

      if (exclusivity1 == exclusivity2) {
        return 0;
      }

      // If one exclusivity is null but not the other, order so that the null object will be last.
      int result = NULLS_LAST_OBJECT_ORDERING.compare(exclusivity1, exclusivity2);
      if (result != 0) {
        return result;
      }

      return NULLS_LAST_NATURAL_ORDERING.compare(exclusivity1.getValue(), exclusivity2.getValue());
    }
  }
}

