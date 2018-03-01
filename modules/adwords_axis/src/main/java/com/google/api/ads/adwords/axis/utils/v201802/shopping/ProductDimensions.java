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
import com.google.api.ads.adwords.axis.v201802.cm.ProductDimensionType;
import com.google.api.ads.adwords.axis.v201802.cm.ProductOfferId;
import com.google.api.ads.adwords.axis.v201802.cm.ProductType;
import com.google.api.ads.adwords.axis.v201802.cm.ShoppingProductChannel;
import com.google.api.ads.adwords.axis.v201802.cm.ShoppingProductChannelExclusivity;
import com.google.common.base.Preconditions;
import javax.annotation.Nullable;

/**
 * Factory methods for creating ProductDimension objects. Each ProductDimension subclass has a
 * create method, and each of those methods has a signature that reflects the attributes that
 * logically identify an instance of that subclass.
 *
 * <p>For example, {@link #createBrand(String)} has a single {@code brand} parameter since the
 * {@code brand} attribute is what uniquely identifies a {@link ProductBrand}, while
 * {@link #createBiddingCategory(ProductDimensionType, Long)} has both a
 * {@code productDimensionType} and a {@code biddingCategoryId} parameter since both attributes are
 * required to uniquely identify a {@link ProductBiddingCategory}.
 *
 * <p>Note that this factory only includes methods for subclasses of ProductDimension that are
 * supported by Shopping Campaigns.
 */
public class ProductDimensions {

  private ProductDimensions() {}

  /**
   * Creates a new ProductType.
   *
   * @param productDimensionType required
   * @param productTypeValue may be null if creating an "other" dimension
   */
  public static ProductType createType(ProductDimensionType productDimensionType,
      @Nullable String productTypeValue) {
    Preconditions.checkNotNull(productDimensionType,
        "ProductDimensionType is required when creating a ProductType");
    ProductType productType = new ProductType();
    productType.setType(productDimensionType);
    productType.setValue(productTypeValue);
    return productType;
  }

  /**
   * Creates a new ProductCanonicalCondition.
   *
   * @param condition may be null if creating an "other" dimension
   */
  public static ProductCanonicalCondition createCanonicalCondition(
      @Nullable ProductCanonicalConditionCondition condition) {
    ProductCanonicalCondition productCanonicalCondition = new ProductCanonicalCondition();
    productCanonicalCondition.setCondition(condition);
    return productCanonicalCondition;
  }

  /**
   * Creates a new ProductBiddingCategory.
   *
   * @param productDimensionType required
   * @param biddingCategoryId may be null if creating an "other" dimension
   */
  public static ProductBiddingCategory createBiddingCategory(
      ProductDimensionType productDimensionType, @Nullable Long biddingCategoryId) {
    Preconditions.checkNotNull(productDimensionType,
        "ProductDimensionType is required when creating a ProductBiddingCategory");
    ProductBiddingCategory productBiddingCategory = new ProductBiddingCategory();
    productBiddingCategory.setType(productDimensionType);
    productBiddingCategory.setValue(biddingCategoryId);
    return productBiddingCategory;
  }

  /**
   * Creates a new ProductOfferId.
   *
   * @param offerId may be null if creating an "other" dimension
   */
  public static ProductOfferId createOfferId(@Nullable String offerId) {
    ProductOfferId productOfferId = new ProductOfferId();
    productOfferId.setValue(offerId);
    return productOfferId;
  }

  /**
   * Creates a new ProductBrand.
   *
   * @param brand may be null if creating an "other" dimension
   */
  public static ProductBrand createBrand(@Nullable String brand) {
    ProductBrand productBrand = new ProductBrand();
    productBrand.setValue(brand);
    return productBrand;
  }

  /**
   * Creates a new ProductCustomAttribute.
   *
   * @param productDimensionType required
   * @param attributeValue may be null if creating an "other" dimension
   */
  public static ProductCustomAttribute createCustomAttribute(
      ProductDimensionType productDimensionType, @Nullable String attributeValue) {
    Preconditions.checkNotNull(productDimensionType,
        "ProductDimensionType is required when creating a ProductCustomAttribute");
    ProductCustomAttribute productCustomAttribute = new ProductCustomAttribute();
    productCustomAttribute.setType(productDimensionType);
    productCustomAttribute.setValue(attributeValue);
    return productCustomAttribute;
  }

  /**
   * Creates a new ProductChannel.
   *
   * @param channel may be null if creating an "other" dimension
   */
  public static ProductChannel createChannel(@Nullable ShoppingProductChannel channel) {
    ProductChannel productChannel = new ProductChannel();
    productChannel.setChannel(channel);
    return productChannel;
  }

  /**
   * Creates a new ProductChannelExclusivity.
   *
   * @param channelExclusivity may be null if creating an "other" dimension
   */
  public static ProductChannelExclusivity createChannelExclusivity(
      @Nullable ShoppingProductChannelExclusivity channelExclusivity) {
    ProductChannelExclusivity productChannelExclusivity = new ProductChannelExclusivity();
    productChannelExclusivity.setChannelExclusivity(channelExclusivity);
    return productChannelExclusivity;
  }
}
