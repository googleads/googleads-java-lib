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

package com.google.api.ads.adwords.lib.selectorfields.v201409.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdGroup}.
 */
public enum AdGroupField implements EntityField {

  // Fields constants definitions

  /**
   * Bid type indicates if it is a Target CPA or Max CPA campaign.
   * If the Bid type is not specified it defaults to Target CPA.
   */
  @Filterable
  BidType(true),

  /**
   * Id of the bidding strategy to be associated with the campaign, ad group or ad group criteria.
   * A bidding strategy is created using the BiddingStrategyService ADD operation and is assigned a BiddingStrategyId.
   * The BiddingStrategyId can be shared across campaigns, ad groups and ad group criteria.
   */
  @Filterable
  BiddingStrategyId(true),

  /**
   * Name of the bidding strategy.
   * This is applicable only for flexible bidding strategies.
   */
  @Filterable
  BiddingStrategyName(true),

  /**
   * Indicates where the bidding strategy is associated i.e.
   * campaign, ad group or ad group criterion.
   */
  @Filterable
  BiddingStrategySource(true),

  /**
   * The type of the bidding strategy to be attached.
   */
  @Filterable
  BiddingStrategyType(true),

  /**
   * ID of the campaign with which this ad group is associated.
   */
  @Filterable
  CampaignId(true),

  /**
   * Name of the campaign with which this ad group is associated.
   */
  @Filterable
  CampaignName(true),

  /**
   * Allows advertisers to specify a criteria dimension on which to place absolute bids.
   * This is only applicable for campaigns that target only the content network and not search.
   */
  @Filterable
  ContentBidCriterionTypeGroup(true),

  /**
   * Max CPC (cost per click) bid.
   * At the ad group level, this represents the default bid applicable for <ul><li>keyword targeting on search network.</li> <li>keywords & placements for content targeting.</li></ul> At the ad group criteria level, this is the max cpc bid.
   */
  @Filterable
  CpcBid(true),

  /**
   * Max CPM (cost per thousand impressions) bid.
   */
  @Filterable
  CpmBid(true),

  /**
   * The enhanced CPC bidding option for the campaign, which enables bids to be enhanced based on conversion optimizer data.
   * For more information about enhanced CPC, see the <a href="//support.google.com/adwords/bin/answer.py?answer=2464964" >AdWords Help Center</a>.
   */
  @Filterable
  EnhancedCpcEnabled(true),

  /**
   * Status of the experiment row.
   * If this is set to REMOVED in a SET operation, the adgroup will be removed from the experiment.
   */
  ExperimentDataStatus(false),

  /**
   * Status of this adgroup in the experiment.
   * It must be specified while adding experiment data, which could come through a SET as well.
   */
  ExperimentDeltaStatus(false),

  /**
   * 
   */
  @Filterable
  ExperimentId(true),

  /**
   * ID of this ad group.
   */
  @Filterable
  Id(true),

  /**
   * Labels that are attached to the {@link AdGroup}.
   * To associate an existing {@link Label} to an existing {@link AdGroup}, use {@link AdGroupService#mutateLabel} with ADD operator.
   * To remove an associated {@link Label} from the {@link AdGroup}, use {@link AdGroupService#mutateLabel} with REMOVE operator.
   * To filter on {@link Label}s, use one of {@link Predicate.Operator#CONTAINS_ALL}, {@link Predicate.Operator#CONTAINS_ANY}, {@link Predicate.Operator#CONTAINS_NONE} operators with a list of {@link Label} ids.
   */
  @Filterable
  Labels(true),

  /**
   * 
   */
  @Filterable
  MaxContentCpcMultiplier(true),

  /**
   * 
   */
  @Filterable
  MaxCpcMultiplier(true),

  /**
   * 
   */
  @Filterable
  MaxCpmMultiplier(true),

  /**
   * Name of this ad group (at most 255 UTF-8 full-width characters).
   * This field is required and should not be {@code null} for ADD operations from v201309 version.
   */
  @Filterable
  Name(true),

  /**
   * List of settings for the AdGroup.
   */
  Settings(false),

  /**
   * Status of this ad group.
   */
  @Filterable
  Status(true),

  /**
   * Average CPA target.
   */
  @Filterable
  TargetCpa(true),

  /**
   * Target cost per acquisition/conversion.
   * This is applicable only at the ad group level.
   */
  @Filterable
  TargetCpaBid(true),

  /**
   * URL template for constructing a tracking URL.
   */
  @Filterable
  TrackingUrlTemplate(true),

  /**
   * A list of mappings to be used for substituting URL custom parameter tags in the trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
   */
  UrlCustomParameters(false),

  ;

  private final boolean isFilterable;

  private AdGroupField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
