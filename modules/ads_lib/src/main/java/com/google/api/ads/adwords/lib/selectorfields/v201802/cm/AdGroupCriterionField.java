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
 * A {@code Enum} to facilitate the selection of fields for {@code AdGroupCriterion}.
 */
public enum AdGroupCriterionField implements EntityField {

  // Fields constants definitions

  /**
   * The ad group this criterion is in.
   */
  @Filterable
  AdGroupId(true),

  /**
   * 
   */
  AgeRangeType(false),

  /**
   * A string that uniquely identifies a mobile application to AdWords API.
   * The format of this string is "<code>{platform}-{platform_native_id}</code>", where <code>platform</code> is "1" for iOS apps and "2" for Android apps, and where <code>platform_native_id</code> is the mobile application identifier native to the corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the end of an App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, this native identifier is the application's package name (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * A well formed app id for AdWords API would thus be "1-476943146" for iOS and "2-com.labpixies.colordrips" for Android.
   */
  @Filterable
  AppId(true),

  /**
   * 
   */
  AppPaymentModelType(false),

  /**
   * Approval status.
   */
  @Filterable
  ApprovalStatus(true),

  /**
   * ID of the base ad group from which this draft/trial ad group criterion was created.
   * For base ad groups this is equal to the ad group ID.
   * If the ad group was created in the draft or trial and has no corresponding base ad group, this field is null.
   * This field is only returned on get requests.
   */
  @Filterable
  BaseAdGroupId(true),

  /**
   * ID of the base campaign from which this draft/trial ad group criterion was created.
   * This field is only returned on get requests.
   */
  @Filterable
  BaseCampaignId(true),

  /**
   * Bid modifier of the criterion which is used when the criterion is not in an absolute bidding dimension.
   */
  @Filterable
  BidModifier(true),

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
   * Dimension value with which this product partition is refining its parent.
   * Undefined for the root partition.
   */
  CaseValue(false),

  /**
   * The YouTube uploader channel id or the channel code of a YouTube content channel.
   * <p>The uploader channel id can be obtained from the YouTube id-based URL.
   * For example, in <code>https://www.youtube.com/channel/UCEN58iXQg82TXgsDCjWqIkg</code> the channel id is <code>UCEN58iXQg82TXgsDCjWqIkg</code> <p>For more information see: https://support.google.com/youtube/answer/6180214
   */
  ChannelId(false),

  /**
   * The public name for a YouTube user channel.
   */
  ChannelName(false),

  /**
   * Max CPC (cost per click) bid.
   * At the ad group level, this represents the default bid applicable for <ul><li>keyword targeting on search network.</li> <li>keywords & placements for content targeting.</li></ul> At the ad group criteria level, this is the max cpc bid.
   */
  @Filterable
  CpcBid(true),

  /**
   * The level (ad group or criterion) at which the bid was set.
   * This is applicable only at the criteria level.
   */
  @Filterable
  CpcBidSource(true),

  /**
   * Max CPM (cost per thousand impressions) bid.
   */
  @Filterable
  CpmBid(true),

  /**
   * The level (ad group or criterion) at which the bid was set.
   * This is applicable only at the criteria level.
   */
  @Filterable
  CpmBidSource(true),

  /**
   * Keywordless criteria coverage - Computed percentage of website coverage based on the website target, negative website targets and negative keywords in the ad group and campaign.
   */
  CriteriaCoverage(false),

  /**
   * Keywordless criteria samples - List of sample urls that matches with the website target.
   */
  CriteriaSamples(false),

  /**
   * 
   */
  @Filterable
  CriteriaType(true),

  /**
   * 
   */
  @Filterable
  CriterionUse(true),

  /**
   * Destination URL override when Ad is triggered by this criterion.
   * <p>Some sample valid URLs are: "http://www.website.com", "http://www.domain.com/somepath".
   * <p>Set to the empty string ("") to clear the destination URL.
   */
  @Filterable
  DestinationUrl(true),

  /**
   * List of disapproval reasons.
   */
  DisapprovalReasons(false),

  /**
   * Title of this mobile application.
   */
  @Filterable
  DisplayName(true),

  /**
   * The enhanced CPC bidding option for the campaign, which enables bids to be enhanced based on conversion optimizer data.
   * For more information about enhanced CPC, see the <a href="//support.google.com/adwords/answer/2464964" >AdWords Help Center</a>.
   */
  @Filterable
  EnhancedCpcEnabled(true),

  /**
   * A list of final app URLs that will be used on mobile if the user has the specific app installed.
   */
  @Filterable
  FinalAppUrls(true),

  /**
   * A list of possible final mobile URLs after all cross domain redirects.
   */
  @Filterable
  FinalMobileUrls(true),

  /**
   * A list of possible final URLs after all cross domain redirects.
   */
  @Filterable
  FinalUrls(true),

  /**
   * First page Cpc for this criterion.
   */
  @Filterable
  FirstPageCpc(true),

  /**
   * An estimate of the cpc bid needed for your ad to regularly appear in the top position above the search results on google.com when a query matches the keywords exactly.
   * Note that meeting this estimate is not a guarantee of ad position, which may depend on other factors.
   */
  @Filterable
  FirstPositionCpc(true),

  /**
   * 
   */
  GenderType(false),

  /**
   * ID of this criterion.
   */
  @Filterable
  Id(true),

  /**
   * 
   */
  IncomeRangeType(false),

  /**
   * Match type of this keyword.
   */
  @Filterable
  KeywordMatchType(true),

  /**
   * Text of this keyword (at most 80 characters and ten words).
   */
  @Filterable
  KeywordText(true),

  /**
   * Labels that are attached to the AdGroupCriterion.
   * To associate an existing {@code Label} to an existing {@code AdGroupCriterion}, use {@code AdGroupCriterionService#mutateLabel} with ADD operator.
   * To remove an associated {@code Label} from the {@code AdGroupCriterion}, use {@code AdGroupCriterionService#mutateLabel} with REMOVE operator.
   * To filter on {@code Label}s, use one of {@code Predicate.Operator#CONTAINS_ALL}, {@code Predicate.Operator#CONTAINS_ANY}, {@code Predicate.Operator#CONTAINS_NONE} operators with a list of {@code Label} ids.
   */
  @Filterable
  Labels(true),

  /**
   * ID of this mobile app category.
   * A complete list of the available mobile app categories is available <a href="/adwords/api/docs/appendix/mobileappcategories">here</a>.
   */
  MobileAppCategoryId(false),

  /**
   * The webpage criterion parameter.
   */
  Parameter(false),

  /**
   * ID of the parent product partition subdivision.
   * Undefined for the root partition.
   */
  ParentCriterionId(false),

  /**
   * 
   */
  ParentType(false),

  /**
   * Type of the product partition.
   */
  PartitionType(false),

  /**
   * The category to target or exclude.
   * Each subsequent element in the array describes a more specific sub-category.
   * For example, <code>{"Pets &amp; Animals", "Pets", "Dogs"}</code> represents the "Pets &amp; Animals/Pets/Dogs" category.
   * A complete list of available vertical categories is available <a href="/adwords/api/docs/appendix/verticals">here</a> This field is required and must not be empty.
   */
  Path(false),

  /**
   * Url of the placement.
   * <p>For example, "http://www.domain.com".
   */
  @Filterable
  PlacementUrl(true),

  /**
   * The keyword quality score ranges from 1 (lowest) to 10 (highest).
   * <p>If there aren't enough impressions or clicks to determine an appropriate quality score value, the QualityInfo object is not returned.
   * For reports, this field will return null (designated by "--").
   */
  @Filterable
  QualityScore(true),

  /**
   * Current user-set state of criterion.
   * UserStatus may not be set to {@code REMOVED} and is not supported for ProductPartition criterion.
   * On add, defaults to {@code ENABLED} if unspecified.
   */
  @Filterable
  Status(true),

  /**
   * Serving status.
   */
  @Filterable
  SystemServingStatus(true),

  /**
   * An estimate of the cpc bid needed for your ad to appear above the first page of Google search results when a query matches the keywords exactly.
   * Note that meeting this estimate is not a guarantee of ad position, which may depend on other factors.
   */
  @Filterable
  TopOfPageCpc(true),

  /**
   * URL template for constructing a tracking URL.
   * <p>On update, empty string ("") indicates to clear the field.
   */
  @Filterable
  TrackingUrlTemplate(true),

  /**
   * A list of mappings to be used for substituting URL custom parameter tags in the trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
   */
  @Filterable
  UrlCustomParameters(true),

  /**
   * Id of this user interest.
   * This is a required field.
   */
  UserInterestId(false),

  /**
   * Name of this user interest.
   */
  UserInterestName(false),

  /**
   * Parent Id of this user interest.
   */
  UserInterestParentId(false),

  /**
   * Determines whether a user list is eligible for targeting in the display network.
   */
  @Filterable
  UserListEligibleForDisplay(true),

  /**
   * Determines whether a user list is eligible for targeting in the google.com (search) network.
   */
  @Filterable
  UserListEligibleForSearch(true),

  /**
   * Id of this user list.
   * This is a required field.
   */
  UserListId(false),

  /**
   * 
   */
  @Filterable
  UserListMembershipStatus(true),

  /**
   * 
   */
  UserListName(false),

  /**
   * Id of this vertical.
   */
  VerticalId(false),

  /**
   * Id of the parent of this vertical.
   */
  VerticalParentId(false),

  /**
   * YouTube video id as it appears on the YouTube watch page.
   */
  VideoId(false),

  /**
   * Name of the video.
   */
  VideoName(false),

  ;

  private final boolean isFilterable;

  private AdGroupCriterionField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
