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

package com.google.api.ads.adwords.axis.utils.v201705.shopping;

import com.google.api.ads.adwords.axis.v201705.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201705.cm.BidSource;
import com.google.api.ads.adwords.axis.v201705.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201705.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201705.cm.Bids;
import com.google.api.ads.adwords.axis.v201705.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201705.cm.Money;
import com.google.api.ads.adwords.axis.v201705.cm.NegativeAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201705.cm.ProductPartition;
import com.google.api.ads.adwords.axis.v201705.cm.ProductPartitionType;
import com.google.common.base.Preconditions;

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
    } else {
      adGroupCriterion = new BiddableAdGroupCriterion();
      if (node.isUnit() && node.getBid() != null) {
        Money bidMoney = new Money();
        bidMoney.setMicroAmount(node.getBid());
        CpcBid cpcBid = new CpcBid();
        cpcBid.setBid(bidMoney);
        cpcBid.setCpcBidSource(BidSource.CRITERION);
        biddingConfig.setBids(new Bids[] {cpcBid});
        ((BiddableAdGroupCriterion) adGroupCriterion).setBiddingStrategyConfiguration(
            biddingConfig);
      }
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
   * Returns a new AdGroupCriterion configured for a SET operation that will set
   * the criterion's bid.
   * 
   * @param node the node whose criterion should be updated
   * @param adGroupId the ad group ID of the criterion
   * @param biddingConfig the bidding strategy configuration of the criterion
   */
  static AdGroupCriterion createCriterionForSetBid(ProductPartitionNode node, long adGroupId,
      BiddingStrategyConfiguration biddingConfig) {
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
    return biddableCriterion;
  }
}
