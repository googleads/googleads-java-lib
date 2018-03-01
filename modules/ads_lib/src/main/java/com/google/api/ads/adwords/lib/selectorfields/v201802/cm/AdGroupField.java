// Copyright 2018 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201802.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdGroup}.
 */
public enum AdGroupField implements EntityField {

  // Fields constants definitions

  /**
   * 
   */
  @Filterable
  AdGroupType(true),

  /**
   * 
   */
  @Filterable
  AdRotationMode(true),

  /**
   * ID of the base adgroup from which this draft/trial adgroup was created.
   * For base adgroups this is equal to the adgroup ID.
   * If the adgroup was created in the draft or trial and has no corresponding base adgroup, this field is null.
   * This field is readonly and will be ignored when sent to the API.
   */
  BaseAdGroupId(false),

  /**
   * ID of the base campaign from which this draft/trial adgroup was created.
   * This field is only returned on get requests.
   */
  BaseCampaignId(false),

  /**
   * Id of the bidding strategy to be associated with the campaign, ad group or ad group criteria.
   * A bidding strategy is created using the BiddingStrategyService ADD operation and is assigned a BiddingStrategyId.
   * The BiddingStrategyId can be shared across campaigns, ad groups and ad group criteria.
   * <p>Starting with v201705, this field cannot be set at the ad group or ad group criterion level.
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
   * <p>For details on portfolio vs.
   * standard availability, see the <a href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding guide</a>.
   * <p>Starting with v201705, this field cannot be set at the ad group or ad group criterion level to any value other than {@code BiddingStrategyType.NONE}.
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
   * For more information about enhanced CPC, see the <a href="//support.google.com/adwords/answer/2464964" >AdWords Help Center</a>.
   */
  @Filterable
  EnhancedCpcEnabled(true),

  /**
   * ID of this ad group.
   */
  @Filterable
  Id(true),

  /**
   * Labels that are attached to the {@code AdGroup}.
   * To associate an existing {@code Label} to an existing {@code AdGroup}, use {@code AdGroupService#mutateLabel} with ADD operator.
   * To remove an associated {@code Label} from the {@code AdGroup}, use {@code AdGroupService#mutateLabel} with REMOVE operator.
   * To filter on {@code Label}s, use one of {@code Predicate.Operator#CONTAINS_ALL}, {@code Predicate.Operator#CONTAINS_ANY}, {@code Predicate.Operator#CONTAINS_NONE} operators with a list of {@code Label} ids.
   */
  @Filterable
  Labels(true),

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
   * Average cost per acquisition (CPA) target.
   * This target should be greater than or equal to minimum billable unit based on the currency for the account.
   */
  @Filterable
  TargetCpa(true),

  /**
   * Target cost per acquisition (CPA).
   * This is applicable only at the ad group level.
   * <p>If an ad group-level target is not set and the strategy type is TARGET_CPA, the strategy level target will be used.
   * To set the strategy-level target, set the {@code TargetCpaBiddingScheme#targetCpa} on the strategy's {@code BiddingStrategyConfiguration#biddingScheme}.
   */
  @Filterable
  TargetCpaBid(true),

  /**
   * The level (ad group, ad group strategy, or campaign strategy) at which the bid was set.
   * This is applicable only at the ad group level.
   */
  @Filterable
  TargetCpaBidSource(true),

  /**
   * The target return on average spend (ROAS).
   * This target can only be set on ad groups.
   * If this ad group's effective bidding strategy is a standard {@code TARGET_ROAS} strategy attached to the campaign, then the target overrides the target roas specified in the campaign's bidding strategy.
   * Otherwise, this value is ignored.
   */
  @Filterable
  TargetRoasOverride(true),

  /**
   * URL template for constructing a tracking URL.
   * <p>On update, empty string ("") indicates to clear the field.
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

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
