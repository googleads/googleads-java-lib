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
 * A {@code Enum} to facilitate the selection of fields for {@code Campaign}.
 */
public enum CampaignField implements EntityField {

  // Fields constants definitions

  /**
   * Ad serving optimization status.
   */
  AdServingOptimizationStatus(false),

  /**
   * Optional refinement of advertisingChannelType.
   * Must be a valid sub-type of the parent channel type.
   * May only be set for new campaigns and cannot be changed once set.
   */
  @Filterable
  AdvertisingChannelSubType(true),

  /**
   * The primary serving target for ads within this campaign.
   * The targeting options can be refined in NetworkSetting.
   * May only be set for new campaigns.
   * This field is required and should not be {@code null} when it is contained within {@code Operator}s : ADD
   */
  @Filterable
  AdvertisingChannelType(true),

  /**
   * Amount of budget in the local currency for the account.
   * This value represents an average daily budget amount; the actual daily costs might vary.
   * See <a href="https://support.google.com/adwords/answer/1704443">Charges and your daily budget</a>.
   */
  @Filterable
  Amount(true),

  /**
   * ID of the base campaign of the draft or trial campaign.
   * For base campaigns, this is equal to the campaign ID.
   * This field is only returned on get requests.
   */
  @Filterable
  BaseCampaignId(true),

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
   * The type of the bidding strategy to be attached.
   * <p>For details on portfolio vs.
   * standard availability, see the <a href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding guide</a>.
   * <p>Starting with v201705, this field cannot be set at the ad group or ad group criterion level to any value other than {@code BiddingStrategyType.NONE}.
   */
  @Filterable
  BiddingStrategyType(true),

  /**
   * A Budget is created using the BudgetService ADD operation and is assigned a BudgetId.
   * The BudgetId is used when modifying the Budget with BudgetService, or associating the Budget to a Campaign with CampaignService.
   * A BudgetId can be shared across different campaigns--the system will then allocate the Budget among the Campaigns to get the optimum result.
   */
  @Filterable
  BudgetId(true),

  /**
   * Name of the Budget.
   * When creating a Budget through BudgetService, every explicitly shared Budget must have a non-null non-empty name.
   * In addition, all explicitly shared Budget names owned by an account must be distinct.
   * Budgets that are not explicitly shared derive their name from the attached Campaign's name.
   */
  BudgetName(false),

  /**
   * Number of campaigns actively using this budget.
   * This field is only populated for Get operations.
   */
  @Filterable
  BudgetReferenceCount(true),

  /**
   * 
   */
  @Filterable
  BudgetStatus(true),

  /**
   * Id of the campaign group this campaign belongs to.
   */
  @Filterable
  CampaignGroupId(true),

  /**
   * Indicates if this campaign is a normal campaign, a draft campaign, or a trial campaign.
   */
  @Filterable
  CampaignTrialType(true),

  /**
   * Delivery method for the Budget which determines the rate at which the Budget is spent.
   * Defaults to STANDARD and can be changed through BudgetService ADD or SET operations.
   */
  DeliveryMethod(false),

  /**
   * If the campaign is eligible to enter conversion optimizer.
   */
  Eligible(false),

  /**
   * Date the campaign ends.
   * On add, defaults to <code>20371230</code>, which means the campaign will run indefinitely.
   * To set an existing campaign to run indefinitely, set this field to <code>203712<b>30</b></code>.
   * The date's format should be YYYYMMDD.
   */
  @Filterable
  EndDate(true),

  /**
   * The enhanced CPC bidding option for the campaign, which enables bids to be enhanced based on conversion optimizer data.
   * For more information about enhanced CPC, see the <a href="//support.google.com/adwords/answer/2464964" >AdWords Help Center</a>.
   */
  @Filterable
  EnhancedCpcEnabled(true),

  /**
   * Maximum number of impressions allowed during the time range by this cap.
   * To remove the frequency cap on a campaign, set this field to {@code 0}.
   */
  @Filterable
  FrequencyCapMaxImpressions(true),

  /**
   * ID of this campaign.
   */
  @Filterable
  Id(true),

  /**
   * If true, this budget was created with the purpose of sharing this budget across one or more campaigns.
   * <p>If false, this budget was created with the intention to be dedicatedly used with a single campaign, and the Budget's name and status will stay in the sync with the associated Campaign's name and status.
   * Attempting to share this budget with a second Campaign will result in an error.</p>
   */
  IsBudgetExplicitlyShared(false),

  /**
   * Labels that are attached to the campaign.
   * To associate an existing {@code Label} to an existing {@code Campaign}, use {@code CampaignService#mutateLabel} with the ADD operator.
   * To remove an associated {@code Label} from the {@code Campaign}, use {@code CampaignService#mutateLabel} with the REMOVE operator.
   * To filter on {@code Label}s, use one of {@code Predicate.Operator#CONTAINS_ALL}, {@code Predicate.Operator#CONTAINS_ANY}, {@code Predicate.Operator#CONTAINS_NONE} operators with a list of {@code Label} ids.
   */
  @Filterable
  Labels(true),

  /**
   * The level on which the cap is to be applied (creative/adgroup).
   * Cap is applied to all the entities of this level in the campaign.
   */
  @Filterable
  Level(true),

  /**
   * The target return on ad spend (ROAS).
   * This is optional.
   * If set, the bid strategy will maximize revenue while averaging the target return on ad spend.
   * If the target ROAS is high, the bid strategy may not be able to spend the full budget.
   * If the target ROAS is not set, the bid strategy will aim to achieve the highest possible ROAS for the budget.
   */
  @Filterable
  MaximizeConversionValueTargetRoas(true),

  /**
   * Name of this campaign.
   * This field is required and should not be {@code null} for ADD operations.
   * For SET and REMOVE operations, this can be used to address the campaign by name when the campaign is ENABLED or PAUSED.
   * Removed campaigns cannot be addressed by name.
   * If you wish to rename a campaign, you must provide the ID.
   */
  @Filterable
  Name(true),

  /**
   * Reason why a campaign would be rejected for conversion optimizer.
   */
  RejectionReasons(false),

  /**
   * Selective optimization setting for this campaign, which includes a set of conversion types to optimize this campaign towards.
   */
  SelectiveOptimization(false),

  /**
   * Serving status.
   */
  @Filterable
  ServingStatus(true),

  /**
   * List of settings for the campaign.
   */
  Settings(false),

  /**
   * Date the campaign begins.
   * On add, defaults to the current day in the parent account's local timezone.
   * The date's format should be YYYYMMDD.
   */
  @Filterable
  StartDate(true),

  /**
   * Status of this campaign.
   * On add, defaults to {@code ENABLED}.
   */
  @Filterable
  Status(true),

  /**
   * Ads will be served on specified placements in the Google Display Network.
   * Placements are specified using {@code Placement} criteria.
   */
  @Filterable
  TargetContentNetwork(true),

  /**
   * Average cost per acquisition (CPA) target.
   * This target should be greater than or equal to minimum billable unit based on the currency for the account.
   */
  TargetCpa(false),

  /**
   * Maximum cpc bid limit that applies to all keywords managed by the strategy.
   */
  @Filterable
  TargetCpaMaxCpcBidCeiling(true),

  /**
   * Minimum cpc bid limit that applies to all keywords managed by the strategy.
   */
  @Filterable
  TargetCpaMaxCpcBidFloor(true),

  /**
   * Ads will be served with Google.com search results.
   */
  @Filterable
  TargetGoogleSearch(true),

  /**
   * Ads will be served on the Google Partner Network.
   * This is available to only some specific Google partner accounts.
   */
  @Filterable
  TargetPartnerSearchNetwork(true),

  /**
   * The target return on average spend (ROAS).
   */
  TargetRoas(false),

  /**
   * Maximum bid limit that applies to all keywords managed by the strategy.
   */
  TargetRoasBidCeiling(false),

  /**
   * Minimum bid limit that applies to all keywords managed by the strategy.
   */
  TargetRoasBidFloor(false),

  /**
   * Ads will be served on partner sites in the Google Search Network (requires {@code GOOGLE_SEARCH}).
   */
  @Filterable
  TargetSearchNetwork(true),

  /**
   * The largest max CPC bid that can be set by the TargetSpend bidder.
   */
  TargetSpendBidCeiling(false),

  /**
   * A spend target under which to maximize clicks.
   * The TargetSpend bidder will attempt to spend the smaller of this value or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   */
  TargetSpendSpendTarget(false),

  /**
   * Unit of time the cap is defined at.
   * Only the Day, Week and Month time units are supported.
   */
  @Filterable
  TimeUnit(true),

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

  /**
   * The display mode for vanity pharma URLs.
   */
  @Filterable
  VanityPharmaDisplayUrlMode(true),

  /**
   * The text that will be displayed in display URL of the text ad when website description is the selected display mode for vanity pharma URLs.
   */
  @Filterable
  VanityPharmaText(true),

  /**
   * This read-only field denotes whether Viewable CPM is enabled, and is computed based on the advertising channel type and subtype.
   * Null unless the bidding strategy type is CPM.
   * Only selectable in CampaignService, using the value ViewableCpmEnabled.
   */
  @Filterable
  ViewableCpmEnabled(true),

  ;

  private final boolean isFilterable;

  private CampaignField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
