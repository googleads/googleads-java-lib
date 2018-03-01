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

import com.google.api.ads.adwords.axis.utils.ProductPartitionTreeInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201802.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201802.cm.AdGroupCriterionField;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.reflect.Reflection;
import java.lang.reflect.InvocationHandler;
import java.rmi.RemoteException;
import java.util.List;

/**
 * A ProductPartitionTree is a container for a root {@link ProductPartitionNode} that also handles
 * applying changes made to the tree under the root.
 */
public class ProductPartitionTree
    implements ProductPartitionTreeInterface<ProductPartitionNode, AdGroupCriterionOperation> {

  private final ProductPartitionTreeInterface<ProductPartitionNode, AdGroupCriterionOperation> impl;
  
  /**
   * Required fields for any {@link Selector} used to fetch {@link AdGroupCriterion} objects used by
   * an instance of this class.
   */
  public static final ImmutableList<AdGroupCriterionField> REQUIRED_SELECTOR_FIELD_ENUMS =
      ProductPartitionTreeImpl.REQUIRED_SELECTOR_FIELD_ENUMS;

  /**
   * Required fields for any {@link Selector} used to fetch {@link AdGroupCriterion} objects used by
   * an instance of this class.
   *
   * @deprecated Use the {@code REQUIRED_SELECTOR_FIELD_ENUMS} instead.
   */
  @Deprecated
  public static final ImmutableList<String> REQUIRED_SELECTOR_FIELDS =
      ImmutableList.copyOf(
          Collections2.transform(REQUIRED_SELECTOR_FIELD_ENUMS, Functions.toStringFunction()));

  @SuppressWarnings("unchecked")
  private ProductPartitionTree(final ProductPartitionTreeImpl impl) {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(
            impl, AdWordsInternals.getInstance().getAdsUtilityRegistry()) {
          @Override
          public String toString() {
            return impl.toString();
          }
        };
    this.impl = Reflection.newProxy(ProductPartitionTreeInterface.class, invocationHandler);
  }

  /**
   * Returns a new instance of this class by retrieving the product partitions of the
   * specified ad group. All parameters are required.
   */
  public static ProductPartitionTree createAdGroupTree(AdWordsServicesInterface services,
      AdWordsSession session, Long adGroupId) throws ApiException, RemoteException {
    return new ProductPartitionTree(
        ProductPartitionTreeImpl.createAdGroupTree(services, session, adGroupId));
  }

  /**
   * Returns a new instance of this class based on the collection of ad group criteria provided.
   * <p>
   * NOTE: If retrieving existing criteria for use with this method, you must include all of the
   * fields in {@link #REQUIRED_SELECTOR_FIELD_ENUMS} in your {@link Selector}.
   *
   * @param adGroupId the ID of the ad group
   * @param biddingStrategyConfig the {@link BiddingStrategyConfiguration} for the ad group
   * @param adGroupCriteria the non-null (but possibly empty) list of ad group criteria
   *
   * @throws NullPointerException if any argument is null, any element in {@code adGroupCriteria} is
   * null, or any required field from {@link #REQUIRED_SELECTOR_FIELD_ENUMS} is missing from an
   * element in {@code adGroupCriteria}
   * @throws IllegalArgumentException if {@code adGroupCriteria} does not include the root criterion
   * of the product partition tree
   */
  public static ProductPartitionTree createAdGroupTree(
      Long adGroupId,
      BiddingStrategyConfiguration biddingStrategyConfig,
      List<AdGroupCriterion> adGroupCriteria) {
    return new ProductPartitionTree(
        ProductPartitionTreeImpl.createAdGroupTree(
            adGroupId, biddingStrategyConfig, adGroupCriteria));
  }

  @Override
  public Long getAdGroupId() {
    return impl.getAdGroupId();
  }
  
  @Override
  public ProductPartitionNode getRoot() {
    return impl.getRoot();
  }
  
  @Override
  public String toString() {
    return impl.toString();
  }

  @Override
  public List<AdGroupCriterionOperation> getMutateOperations() {
    return impl.getMutateOperations();
  }

}
