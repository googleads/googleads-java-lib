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

package com.google.api.ads.adwords.axis.utils.v201710.shopping;

import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.BidSource;
import com.google.api.ads.adwords.axis.v201710.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201710.cm.Bids;
import com.google.api.ads.adwords.axis.v201710.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201710.cm.CustomParameter;
import com.google.api.ads.adwords.axis.v201710.cm.CustomParameters;
import com.google.api.ads.adwords.axis.v201710.cm.Money;
import com.google.api.ads.adwords.axis.v201710.cm.NegativeAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.ProductPartition;
import com.google.api.ads.adwords.axis.v201710.cm.ProductPartitionType;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/**
 * Adapter that translates {@link ProductPartitionNode} objects into {@link AdGroupCriterion}
 * objects for various operations.
 */
class ProductPartitionNodeAdapter {

  private ProductPartitionNodeAdapter() {
    // Static utility class. Do not instantiate.
  }

  /**
   * Returns a new AdGroupCriterion configured for a REMOVE operation.
   *
   * @param node the node whose criterion should be removed
   * @param adGroupId the ad group ID of the criterion
   */
  static AdGroupCriterion createCriterionForRemove(ProductPartitionNode node,
      long adGroupId) {
    Preconditions.checkNotNull(node, "Null node");

    AdGroupCriterion adGroupCriterion = new AdGroupCriterion();
    adGroupCriterion.setAdGroupId(adGroupId);
    adGroupCriterion.setCriterion(new ProductPartition());
    adGroupCriterion.getCriterion().setId(node.getProductPartitionId());

    return adGroupCriterion;
  }

  /**
   * Returns a new AdGroupCriterion configured for an ADD operation.
   *
   * @param node the node whose criterion should be added
   * @param adGroupId the ad group ID of the criterion
   * @param biddingConfig the bidding strategy configuration of the criterion
   */
  static AdGroupCriterion createCriterionForAdd(ProductPartitionNode node, long adGroupId,
      BiddingStrategyConfiguration biddingConfig) {
    Preconditions.checkNotNull(node, "Null node");
    Preconditions.checkNotNull(biddingConfig, "Null bidding configuration");

    AdGroupCriterion adGroupCriterion;
    if (node.isExcludedUnit()) {
      adGroupCriterion = new NegativeAdGroupCriterion();
    } else if (node.isBiddableUnit()){
      BiddableAdGroupCriterion biddableCriterion = new BiddableAdGroupCriterion();
      if (node.getBid() != null) {
        Money bidMoney = new Money();
        bidMoney.setMicroAmount(node.getBid());
        CpcBid cpcBid = new CpcBid();
        cpcBid.setBid(bidMoney);
        cpcBid.setCpcBidSource(BidSource.CRITERION);
        biddingConfig.setBids(new Bids[] {cpcBid});
        biddableCriterion.setBiddingStrategyConfiguration(
            biddingConfig);
      }
      if (node.getTrackingUrlTemplate() != null) {
        biddableCriterion.setTrackingUrlTemplate(
            node.getTrackingUrlTemplate());
      }
      biddableCriterion.setUrlCustomParameters(createCustomParameters(node));
      adGroupCriterion = biddableCriterion;
    } else {
      adGroupCriterion = new BiddableAdGroupCriterion();
    }
    adGroupCriterion.setAdGroupId(adGroupId);

    ProductPartition partition = new ProductPartition();
    partition.setId(node.getProductPartitionId());
    if (node.getParent() != null) {
      partition.setParentCriterionId(node.getParent().getProductPartitionId());
    }
    partition.setCaseValue(node.getDimension());
    partition.setPartitionType(
        node.isUnit() ? ProductPartitionType.UNIT : ProductPartitionType.SUBDIVISION);
    adGroupCriterion.setCriterion(partition);
    return adGroupCriterion;
  }

  /**
   * Returns a new AdGroupCriterion configured for a SET operation that will set the criterion's
   * bid, tracking template, and custom parameters.
   *
   * @param node the node whose criterion should be updated
   * @param adGroupId the ad group ID of the criterion
   * @param biddingConfig the bidding strategy configuration of the criterion
   */
  static AdGroupCriterion createCriterionForSetBiddableUnit(
      ProductPartitionNode node, long adGroupId, BiddingStrategyConfiguration biddingConfig) {
    Preconditions.checkNotNull(node, "Null node");
    Preconditions.checkNotNull(biddingConfig, "Null bidding configuration");
    Preconditions.checkArgument(node.isBiddableUnit(), "Node is not a biddable unit");

    BiddableAdGroupCriterion biddableCriterion = new BiddableAdGroupCriterion();
    biddableCriterion.setAdGroupId(adGroupId);

    ProductPartition partition = new ProductPartition();
    partition.setId(node.getProductPartitionId());
    if (node.getParent() != null) {
      partition.setParentCriterionId(node.getParent().getProductPartitionId());
    }
    partition.setCaseValue(node.getDimension());
    partition.setPartitionType(ProductPartitionType.UNIT);

    biddableCriterion.setCriterion(partition);

    // Set the bidding attributes on the new ad group criterion.
    if (node.getBid() != null) {
      Money bidMoney = new Money();
      bidMoney.setMicroAmount(node.getBid());
      CpcBid cpcBid = new CpcBid();
      cpcBid.setBid(bidMoney);
      biddingConfig.setBids(new Bids[] {cpcBid});
    } else {
      biddingConfig.setBids(new Bids[0]);
    }
    biddableCriterion.setBiddingStrategyConfiguration(biddingConfig);

    // Set the upgraded URL attributes on the new ad group criterion.
    if (node.getTrackingUrlTemplate() != null) {
      biddableCriterion.setTrackingUrlTemplate(
          node.getTrackingUrlTemplate());
    }
    biddableCriterion.setUrlCustomParameters(createCustomParameters(node));
    return biddableCriterion;
  }

  /**
   * Creates an AdWords API {@link CustomParameters} object using the map of custom parameters
   * on the node.
   *
   * @param node the node.
   */
  private static CustomParameters createCustomParameters(ProductPartitionNode node) {
    Preconditions.checkArgument(
        node.isBiddableUnit(), "Node is not a biddable unit. Custom parameters not supported.");
    CustomParameters customParameters = new CustomParameters();
    List<CustomParameter> parameters = new ArrayList<>();
    for (Entry<String, String> customParamEntry : node.getCustomParameters().entrySet()) {
      CustomParameter customParameter = new CustomParameter();
      customParameter.setKey(customParamEntry.getKey());
      customParameter.setValue(customParamEntry.getValue());
      parameters.add(customParameter);
    }
    customParameters.setParameters(parameters.toArray(new CustomParameter[0]));
    // Always replace all custom parameters. This attribute is ignored on ADD.
    customParameters.setDoReplace(true);
    return customParameters;
  }
}
