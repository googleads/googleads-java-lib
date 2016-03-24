// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension.util;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * The SelectorField class contains all the possible fields that each service
 * can use.
 *
 * <p>https://developers.google.com/adwords/api/docs/appendix/selectorfields
 */
public final class SelectorFields {

  /**
   * Specific FieldType for the API Object/Service fields.
   */
  public interface FieldType<T> {
    public String getField();
    public boolean getFilterable();
  }

  /**
   * Helper method that generates the String[]
   * needed by the AdWords Services from the constant list.
   *
   * @param enums The list of constant Enums of the <T> type of object
   *        that the Service works with, for example Campaign, AdGroup, etc.
   * @return the String[] needed by the AdWords Services
   */
  public static <T extends FieldType<?>> String[] getFields(List<T> enums) {
    return Lists.transform(enums, new Function<FieldType<?>, String>() {
      @Override
      public String apply(FieldType<?> selectorField) {
        return selectorField.getField();
      }
    }).toArray(new String[] {});
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomer}.
   */
  public enum ManagedCustomer
      implements FieldType<com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomer> {
    ACCOUNT_LABELS("AccountLabels", true),
    CAN_MANAGE_CLIENTS("CanManageClients", true),
    COMPANY_NAME("CompanyName", true),
    CURRENCY_CODE("CurrencyCode", true),
    CUSTOMER_ID("CustomerId", true),
    DATE_TIME_ZONE("DateTimeZone", true),
    NAME("Name", true),
    TEST_ACCOUNT("TestAccount", false);

    private String field;
    private boolean filterable;

    private ManagedCustomer(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<ManagedCustomer> all() {
      return ImmutableList.copyOf(SelectorFields.ManagedCustomer.values());
    }
    
    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.Campaign}.
   */
  public enum Campaign implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.Campaign> {
    AD_SERVING_OPTIMIZATION_STATUS("AdServingOptimizationStatus", false),
    ADVERTISING_CHANNEL_SUB_TYPE("AdvertisingChannelSubType", true),
    ADVERTISING_CHANNEL_TYPE("AdvertisingChannelType", true),
    AMOUNT("Amount", true),
    BASE_CAMPAIGN_ID("BaseCampaignId", true),
    BID_CEILING("BidCeiling", false),
    BID_TYPE("BidType", true),
    BIDDING_STRATEGY_ID("BiddingStrategyId", true),
    BIDDING_STRATEGY_NAME("BiddingStrategyName", true),
    BIDDING_STRATEGY_TYPE("BiddingStrategyType", true),
    BUDGET_ID("BudgetId", true),
    BUDGET_NAME("BudgetName", false),
    BUDGET_REFERENCE_COUNT("BudgetReferenceCount", true),
    BUDGET_STATUS("BudgetStatus", true),
    CAMPAIGN_TRIAL_TYPE("CampaignTrialType", true),
    DELIVERY_METHOD("DeliveryMethod", false),
    ELIGIBLE("Eligible", false),
    END_DATE("EndDate", true),
    ENHANCED_CPC_ENABLED("EnhancedCpcEnabled", true),
    FREQUENCY_CAP_MAX_IMPRESSIONS("FrequencyCapMaxImpressions", true),
    ID("Id", true),
    IS_BUDGET_EXPLICITLY_SHARED("IsBudgetExplicitlyShared", false),
    LABELS("Labels", true),
    LEVEL("Level", true),
    NAME("Name", true),
    PRICING_MODE("PricingMode", true),
    REJECTION_REASONS("RejectionReasons", false),
    SERVING_STATUS("ServingStatus", true),
    SETTINGS("Settings", false),
    START_DATE("StartDate", true),
    STATUS("Status", true),
    TARGET_CONTENT_NETWORK("TargetContentNetwork", true),
    TARGET_CPA("TargetCpa", false),
    TARGET_CPA_MAX_CPC_BID_CEILING("TargetCpaMaxCpcBidCeiling", true),
    TARGET_CPA_MAX_CPC_BID_FLOOR("TargetCpaMaxCpcBidFloor", true),
    TARGET_GOOGLE_SEARCH("TargetGoogleSearch", true),
    TARGET_PARTNER_SEARCH_NETWORK("TargetPartnerSearchNetwork", true),
    TARGET_ROAS("TargetRoas", false),
    TARGET_ROAS_BID_CEILING("TargetRoasBidCeiling", false),
    TARGET_ROAS_BID_FLOOR("TargetRoasBidFloor", false),
    TARGET_SEARCH_NETWORK("TargetSearchNetwork", true),
    TARGET_SPEND_BID_CEILING("TargetSpendBidCeiling", false),
    TARGET_SPEND_SPEND_TARGET("TargetSpendSpendTarget", false),
    TIME_UNIT("TimeUnit", true),
    TRACKING_URL_TEMPLATE("TrackingUrlTemplate", true),
    URL_CUSTOM_PARAMETERS("UrlCustomParameters", false),
    VANITY_PHARMA_DISPLAY_URL_MODE("VanityPharmaDisplayUrlMode", false),
    VANITY_PHARMA_TEXT("VanityPharmaText", false);

    private String field;
    private boolean filterable;

    private Campaign(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<Campaign> all() {
      return ImmutableList.copyOf(SelectorFields.Campaign.values());
    }
    
    public static String[] allFields() {
      return getFields(all());
    }
  }

  
  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.AdGroupAd}.
   */
  public enum AdGroupAd
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.AdGroupAd> {
    ADGROUP_AD_DISAPPROVAL_REASONS("AdGroupAdDisapprovalReasons", true),
    ADGROUP_AD_TRADEMARK_DISAPPROVED("AdGroupAdTrademarkDisapproved", false),
    ADGROUP_CREATIVE_APPROVAL_STATUS("AdGroupCreativeApprovalStatus", true),
    ADGROUP_ID("AdGroupId", true),
    AD_TYPE("AdType", true),
    ADVERTISING_ID("AdvertisingId", false),
    BASE_ADGROUP_ID("BaseAdGroupId", true),
    BASE_CAMPAIGN_ID("BaseCampaignId", true),
    CALL_ONLY_AD_BUSINESS_NAME("CallOnlyAdBusinessName", true),
    CALL_ONLY_AD_CALL_TRACKED("CallOnlyAdCallTracked", false),
    CALL_ONLY_AD_CONVERSION_TYPE_ID("CallOnlyAdConversionTypeId", false),
    CALL_ONLY_AD_COUNTRY_CODE("CallOnlyAdCountryCode", true),
    CALL_ONLY_AD_DESCRIPTION_1("CallOnlyAdDescription1", true),
    CALL_ONLY_AD_DESCRIPTION_2("CallOnlyAdDescription2", true),
    CALL_ONLY_AD_DISABLE_CALL_CONVERSION("CallOnlyAdDisableCallConversion", false),
    CALL_ONLY_AD_PHONE_NUMBER("CallOnlyAdPhoneNumber", true),
    CALL_ONLY_AD_PHONE_NUMBER_VERIFICATION_URL("CallOnlyAdPhoneNumberVerificationUrl", true),
    CREATION_TIME("CreationTime", false),
    CREATIVE_FINAL_APP_URLS("CreativeFinalAppUrls", true),
    CREATIVE_FINAL_MOBILE_URLS("CreativeFinalMobileUrls", true),
    CREATIVE_FINAL_URLS("CreativeFinalUrls", true),
    CREATIVE_TRACKING_URL_TEMPLATE("CreativeTrackingUrlTemplate", true),
    CREATIVE_URL_CUSTOM_PARAMETERS("CreativeUrlCustomParameters", true),
    DESCRIPTION_1("Description1", true),
    DESCRIPTION_2("Description2", true),
    DEVICE_PREFERENCE("DevicePreference", true),
    DIMENSIONS("Dimensions", false),
    DISPLAY_URL("DisplayUrl", true),
    DURATION_MILLIS("DurationMillis", true),
    EXPANDING_DIRECTIONS("ExpandingDirections", false),
    EXPERIMENT_DATA_STATUS("ExperimentDataStatus", false),
    EXPERIMENT_DELTA_STATUS("ExperimentDeltaStatus", false),
    EXPERIMENT_ID("ExperimentId", true),
    FILE_SIZE("FileSize", false),
    HEADLINE("Headline", true),
    HEIGHT("Height", false),
    ID("Id", true),
    IMAGE_CREATIVE_NAME("ImageCreativeName", true),
    INDUSTRY_STANDARD_COMMERCIAL_IDENTIFIER("IndustryStandardCommercialIdentifier", false),
    IS_COOKIE_TARGETED("IsCookieTargeted", false),
    IS_TAGGED("IsTagged", false),
    IS_USER_INTEREST_TARGETED("IsUserInterestTargeted", false),
    LABELS("Labels", true),
    MEDIA_ID("MediaId", false),
    MIME_TYPE("MimeType", false),
    NAME("Name", false),
    PROMOTION_LINE("PromotionLine", true),
    READY_TO_PLAY_ON_THE_WEB("ReadyToPlayOnTheWeb", false),
    REFERENCE_ID("ReferenceId", false),
    RICH_MEDIA_AD_CERTIFIED_VENDOR_FORMAT_ID("RichMediaAdCertifiedVendorFormatId", false),
    RICH_MEDIA_AD_DURATION("RichMediaAdDuration", false),
    RICH_MEDIA_AD_IMPRESSION_BEACON_URL("RichMediaAdImpressionBeaconUrl", false),
    RICH_MEDIA_AD_NAME("RichMediaAdName", false),
    RICH_MEDIA_AD_SNIPPET("RichMediaAdSnippet", false),
    RICH_MEDIA_AD_SOURCE_URL("RichMediaAdSourceUrl", false),
    RICH_MEDIA_AD_TYPE("RichMediaAdType", false),
    SOURCE_URL("SourceUrl", false),
    STATUS("Status", true),
    STREAMING_URL("StreamingUrl", false),
    TEMPLATE_AD_DURATION("TemplateAdDuration", false),
    TEMPLATE_AD_NAME("TemplateAdName", false),
    TEMPLATE_AD_UNION_ID("TemplateAdUnionId", false),
    TEMPLATE_ELEMENT_FIELD_NAME("TemplateElementFieldName", false),
    TEMPLATE_ELEMENT_FIELD_TEXT("TemplateElementFieldText", false),
    TEMPLATE_ELEMENT_FIELD_TYPE("TemplateElementFieldType", false),
    TEMPLATE_ID("TemplateId", true),
    TEMPLATE_ORIGIN_AD_ID("TemplateOriginAdId", false),
    TRADEMARKS("Trademarks", false),
    TYPE("Type", false),
    UNIQUE_NAME("UniqueName", false),
    URL("Url", true),
    URLS("Urls", false),
    VIDEO_TYPES("VideoTypes", false),
    WIDTH("Width", false),
    YOU_TUBE_VIDEO_ID_STRING("YouTubeVideoIdString", false);

    private String field;
    private boolean filterable;

    private AdGroupAd(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<AdGroupAd> all() {
      return ImmutableList.copyOf(SelectorFields.AdGroupAd.values());
    }
    
    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.AdGroupCriterion}.
   */
  public enum AdGroupCriterion
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.AdGroupCriterion> {
    ADGROUP_ID("AdGroupId", true),
    AGE_RANGE_TYPE("AgeRangeType", false),
    APP_ID("AppId", true),
    APP_PAYMENT_MODEL_TYPE("AppPaymentModelType", false),
    APPROVAL_STATUS("ApprovalStatus", true),
    BASE_AD_GROUP_ID("BaseAdGroupId", true),
    BASE_CAMPAIGN_ID("BaseCampaignId", true),
    BID_MODIFIER("BidModifier", true),
    BID_TYPE("BidType", true),
    BIDDING_STRATEGY_ID("BiddingStrategyId", true),
    BIDDING_STRATEGY_NAME("BiddingStrategyName", true),
    BIDDING_STRATEGY_SOURCE("BiddingStrategySource", true),
    BIDDING_STRATEGY_TYPE("BiddingStrategyType", true),
    CASE_VALUE("CaseValue", false),
    CHANNEL_ID("ChannelId", false),
    CHANNEL_NAME("ChannelName", false),
    CPC_BID("CpcBid", true),
    CPC_BID_SOURCE("CpcBidSource", true),
    CPM_BID("CpmBid", true),
    CPM_BID_SOURCE("CpmBidSource", true),
    CRITERIA_COVERAGE("CriteriaCoverage", false),
    CRITERIA_SAMPLES("CriteriaSamples", false),
    CRITERIA_TYPE("CriteriaType", true),
    CRITERION_USE("CriterionUse", true),
    DESTINATION_URL("DestinationUrl", true),
    DISAPPROVAL_REASONS("DisapprovalReasons", false),
    DISPLAY_NAME("DisplayName", true),
    ENHANCED_CPC_ENABLED("EnhancedCpcEnabled", true),
    EXPERIMENT_BID_MULTIPLIER("ExperimentBidMultiplier", true),
    EXPERIMENT_DATA_STATUS("ExperimentDataStatus", false),
    EXPERIMENT_DELTA_STATUS("ExperimentDeltaStatus", true),
    EXPERIMENT_ID("ExperimentId", true),
    FINAL_APP_URLS("FinalAppUrls", true),
    FINAL_MOBILE_URLS("FinalMobileUrls", true),
    FINAL_URLS("FinalUrls", true),
    FIRST_PAGE_CPC("FirstPageCpc", true),
    FIRST_POSITION_CPC("FirstPositionCpc", true),
    GENDER_TYPE("GenderType", false),
    ID("Id", true),
    KEYWORD_MATCH_TYPE("KeywordMatchType", true),
    KEYWORD_TEXT("KeywordText", true),
    LABELS("Labels", true),
    MAX_CPC_MULTIPLIER("MaxCpcMultiplier", true),
    MOBILE_APP_CATEGORY_ID("MobileAppCategoryId", false),
    MULTIPLIER_SOURCE("MultiplierSource", false),
    PARAMETER("Parameter", false),
    PARENT_CRITERION_ID("ParentCriterionId", false),
    PARENT_TYPE("ParentType", false),
    PARTITION_TYPE("PartitionType", false),
    PATH("Path", false),
    PLACEMENT_URL("PlacementUrl", true),
    QUALITY_SCORE("QualityScore", true),
    STATUS("Status", true),
    SYSTEM_SERVING_STATUS("SystemServingStatus", true),
    TOP_OF_PAGE_CPC("TopOfPageCpc", true),
    TRACKING_URL_TEMPLATE("TrackingUrlTemplate", true),
    URL_CUSTOM_PARAMETERS("UrlCustomParameters", true),
    USER_INTEREST_ID("UserInterestId", false),
    USER_INTEREST_NAME("UserInterestName", false),
    USER_INTEREST_PARENT_ID("UserInterestParentId", false),
    USER_LIST_ELIGIBLE_FOR_DISPLAY("UserListEligibleForDisplay", true),
    USER_LIST_ELIGIBLE_FOR_SEARCH("UserListEligibleForSearch", true),
    USER_LIST_ID("UserListId", false),
    USER_LIST_MEMBERSHIP_STATUS("UserListMembershipStatus", true),
    USER_LIST_NAME("UserListName", false),
    VERTICAL_ID("VerticalId", false),
    VERTICAL_PARENT_ID("VerticalParentId", false),
    VIDEO_ID("VideoId", false),
    VIDEO_NAME("VideoName", false);

    private String field;
    private boolean filterable;

    private AdGroupCriterion(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    /**
     * Returns all fields that are not marked as beta. In v201603, no
     * fields are beta fields, so the {@code includeBetaFields}
     * parameter is ignored.
     * 
     * @param includeBetaFields whether to include beta fields.
     */
    public static ImmutableList<AdGroupCriterion> all(boolean includeBetaFields) {
      // No fields are beta fields.
      return ImmutableList.copyOf(SelectorFields.AdGroupCriterion.values());
    }
    
    public static String[] allFields(boolean includeBetaFields) {
      return getFields(all(includeBetaFields));
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.AdGroup}.
   */
  public enum AdGroup implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.AdGroup> {
    BASE_ADGROUP_ID("BaseAdGroupId", false),
    BASE_CAMPAIGN_ID("BaseCampaignId", false),
    BID_TYPE("BidType", true),
    BIDDING_STRATEGY_ID("BiddingStrategyId", true),
    BIDDING_STRATEGY_NAME("BiddingStrategyName", true),
    BIDDING_STRATEGY_SOURCE("BiddingStrategySource", true),
    BIDDING_STRATEGY_TYPE("BiddingStrategyType", true),
    CAMPAIGN_ID("CampaignId", true),
    CAMPAIGN_NAME("CampaignName", true),
    CONTENT_BID_CRITERION_TYPE_GROUP("ContentBidCriterionTypeGroup", true),
    CPC_BID("CpcBid", true),
    CPM_BID("CpmBid", true),
    ENHANCED_CPC_ENABLED("EnhancedCpcEnabled", true),
    EXPERIMENT_DATA_STATUS("ExperimentDataStatus", false),
    EXPERIMENT_DELTA_STATUS("ExperimentDeltaStatus", false),
    EXPERIMENT_ID("ExperimentId", true),
    ID("Id", true),
    LABELS("Labels", true),
    MAX_CONTENT_CPC_MULTIPLIER("MaxContentCpcMultiplier", true),
    MAX_CPC_MULTIPLIER("MaxCpcMultiplier", true),
    MAX_CPM_MULTIPLIER("MaxCpmMultiplier", true),
    NAME("Name", true),
    SETTINGS("Settings", false),
    STATUS("Status", true),
    TARGET_CPA("TargetCpa", true),
    TARGET_CPA_BID("TargetCpaBid", true),
    TARGET_CPA_BID_SOURCE("TargetCpaBidSource", false),
    TRACKING_URL_TEMPLATE("TrackingUrlTemplate", true),
    URL_CUSTOM_PARAMETERS("UrlCustomParameters", false);

    private String field;
    private boolean filterable;

    private AdGroup(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<AdGroup> all() {
      return ImmutableList.copyOf(SelectorFields.AdGroup.values());
    }
    
    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.AdGroupFeed}.
   */
  public enum AdGroupFeed
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.AdGroupFeed> {
    ADGROUP_ID("AdGroupId", true),
    BASE_ADGROUP_ID("BaseAdGroupId", true),
    BASE_CAMPAIGN_ID("BaseCampaignId", true),
    FEED_ID("FeedId", true),
    MATCHING_FUNCTION("MatchingFunction", false),
    PLACEHOLDER_TYPES("PlaceholderTypes", true),
    STATUS("Status", true);

    private String field;
    private boolean filterable;

    private AdGroupFeed(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<AdGroupFeed> all() {
      return ImmutableList.copyOf(SelectorFields.AdGroupFeed.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.AdParam}.
   */
  public enum AdParam implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.AdParam> {
    ADGROUP_ID("AdGroupId", true),
    CRITERION_ID("CriterionId", true),
    INSERTION_TEXT("InsertionText", false),
    PARAM_INDEX("ParamIndex", false);

    private String field;
    private boolean filterable;

    private AdParam(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<AdParam> all() {
      return ImmutableList.copyOf(SelectorFields.AdParam.values());
    }
    
    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.Budget}.
   */
  public enum Budget implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.Budget> {
    AMOUNT("Amount", true),
    BUDGET_ID("BudgetId", true),
    BUDGET_NAME("BudgetName", true),
    BUDGET_REFERENCE_COUNT("BudgetReferenceCount", true),
    BUDGET_STATUS("BudgetStatus", true),
    DELIVERY_METHOD("DeliveryMethod", false),
    IS_BUDGET_EXPLICITLY_SHARED("IsBudgetExplicitlyShared", true);

    private String field;
    private boolean filterable;

    private Budget(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<Budget> all() {
      return ImmutableList.copyOf(SelectorFields.Budget.values());
    }
    
    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.billing.BudgetOrder}.
   */
  public enum BudgetOrder
      implements FieldType<com.google.api.ads.adwords.axis.v201603.billing.BudgetOrder> {
    BILLING_ACCOUNT_ID("BillingAccountId", true),
    BILLING_ACCOUNT_NAME("BillingAccountName", true), //New Billing
    BUDGET_ORDER_NAME("BudgetOrderName", true), //New Billing
    END_DATE_TIME("EndDateTime", true),
    ID("Id", true),
    LAST_REQUEST("LastRequest", false), //New Billing
    PO_NUMBER("PoNumber", true), //New Billing
    PRIMARY_BILLING_ID("PrimaryBillingId", true), //New Billing
    SECONDARY_BILLING_ID("SecondaryBillingId", true), //New Billing
    SPENDING_LIMIT("SpendingLimit", true),
    START_DATE_TIME("StartDateTime", true);

    private String field;
    private boolean filterable;

    private BudgetOrder(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<BudgetOrder> all(boolean newBilling) {
      if (newBilling) {
        return ImmutableList.copyOf(SelectorFields.BudgetOrder.values());  
      } else {
        return ImmutableList.of(
            BILLING_ACCOUNT_ID, END_DATE_TIME, ID, SPENDING_LIMIT, START_DATE_TIME);
      }
    }
    
    public static String[] allFields(boolean newBilling) {
      return getFields(all(newBilling));
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.CampaignCriterion}.
   */
  public enum CampaignCriterion
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.CampaignCriterion> {
    ADDRESS("Address", false),
    AGE_RANGE_TYPE("AgeRangeType", false),
    APP_ID("AppId", true),
    BASE_CAMPAIGN_ID("BaseCampaignId", true),
    BID_MODIFIER("BidModifier", true),
    CAMPAIGN_ID("CampaignId", true),
    CARRIER_COUNTRY_CODE("CarrierCountryCode", false),
    CARRIER_NAME("CarrierName", false),
    CHANNEL_ID("ChannelId", false),
    CHANNEL_NAME("ChannelName", false),
    CONTENT_LABEL_TYPE("ContentLabelType", true),
    CRITERIA_TYPE("CriteriaType", true),
    DAY_OF_WEEK("DayOfWeek", false),
    DEVICE_NAME("DeviceName", false),
    DEVICE_TYPE("DeviceType", false),
    DIMENSIONS("Dimensions", false),
    DISPLAY_NAME("DisplayName", true),
    DISPLAY_TYPE("DisplayType", false),
    END_HOUR("EndHour", false),
    END_MINUTE("EndMinute", false),
    FEED_ID("FeedId", false),
    GENDER_TYPE("GenderType", false),
    GEO_POINT("GeoPoint", false),
    ID("Id", true),
    IP_ADDRESS("IpAddress", true),
    IS_NEGATIVE("IsNegative", true),
    KEYWORD_MATCH_TYPE("KeywordMatchType", true),
    KEYWORD_TEXT("KeywordText", true),
    LANGUAGE_CODE("LanguageCode", false),
    LANGUAGE_NAME("LanguageName", false),
    LOCATION_NAME("LocationName", true),
    MANUFACTURER_NAME("ManufacturerName", false),
    MATCHING_FUNCTION("MatchingFunction", false),
    MOBILE_APP_CATEGORY_ID("MobileAppCategoryId", false),
    OPERATING_SYSTEM_NAME("OperatingSystemName", false),
    OPERATOR_TYPE("OperatorType", false),
    OS_MAJOR_VERSION("OsMajorVersion", false),
    OS_MINOR_VERSION("OsMinorVersion", false),
    PARAMETER("Parameter", false),
    PARENT_LOCATIONS("ParentLocations", false),
    PARENT_TYPE("ParentType", false),
    PATH("Path", false),
    PLACEMENT_URL("PlacementUrl", true),
    PLATFORM_NAME("PlatformName", false),
    RADIUS_DISTANCE_UNITS("RadiusDistanceUnits", false),
    RADIUS_IN_UNITS("RadiusInUnits", false),
    START_HOUR("StartHour", false),
    START_MINUTE("StartMinute", false),
    TARGETING_STATUS("TargetingStatus", false),
    USER_INTEREST_ID("UserInterestId", false),
    USER_INTEREST_NAME("UserInterestName", false),
    USER_INTEREST_PARENT_ID("UserInterestParentId", false),
    USER_LIST_ELIGIBLE_FOR_DISPLAY("UserListEligibleForDisplay", true),
    USER_LIST_ELIGIBLE_FOR_SEARCH("UserListEligibleForSearch", true),
    USER_LIST_ID("UserListId", false),
    USER_LIST_MEMBERSHIP_STATUS("UserListMembershipStatus", true),
    USER_LIST_NAME("UserListName", false),
    VERTICAL_ID("VerticalId", false),
    VERTICAL_PARENT_ID("VerticalParentId", false),
    VIDEO_ID("VideoId", false),
    VIDEO_NAME("VideoName", false);

    private String field;
    private boolean filterable;

    private CampaignCriterion(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<CampaignCriterion> all() {
      return ImmutableList.copyOf(SelectorFields.CampaignCriterion.values());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.CampaignFeed}.
   */
  public enum CampaignFeed
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.CampaignFeed> {
    BASE_CAMPAIGN_ID("BaseCampaignId", true),
    CAMPAIGN_ID("CampaignId", true),
    FEED_ID("FeedId", true),
    MATCHING_FUNCTION("MatchingFunction", false),
    PLACEHOLDER_TYPES("PlaceholderTypes", true),
    STATUS("Status", true);

    private String field;
    private boolean filterable;

    private CampaignFeed(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<CampaignFeed> all() {
      return ImmutableList.copyOf(SelectorFields.CampaignFeed.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.ConversionTracker}.
   */
  public enum ConversionTracker
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.ConversionTracker> {
    ALWAYS_USE_DEFAULT_REVENUE_VALUE("AlwaysUseDefaultRevenueValue", true),
    APP_ID("AppId", true),
    APP_PLATFORM("AppPlatform", true),
    APP_POSTBACK_URL("AppPostbackUrl", true),
    BACKGROUND_COLOR("BackgroundColor", true),
    CATEGORY("Category", true),
    CONVERSION_PAGE_LANGUAGE("ConversionPageLanguage", true),
    CONVERSION_TYPE_OWNER_CUSTOMER_ID("ConversionTypeOwnerCustomerId", true),
    COUNTING_TYPE("CountingType", true),
    CTC_LOOKBACK_WINDOW("CtcLookbackWindow", true),
    DEFAULT_REVENUE_CURRENCY_CODE("DefaultRevenueCurrencyCode", true),
    DEFAULT_REVENUE_VALUE("DefaultRevenueValue", true),
    EXCLUDE_FROM_BIDDING("ExcludeFromBidding", true),
    ID("Id", true),
    LAST_RECEIVED_REQUEST_TIME("LastReceivedRequestTime", false),
    MOST_RECENT_CONVERSION_DATE("MostRecentConversionDate", false),
    NAME("Name", true),
    ORIGINAL_CONVERSION_TYPE_ID("OriginalConversionTypeId", true),
    PHONE_CALL_DURATION("PhoneCallDuration", true),
    STATUS("Status", true),
    TEXT_FORMAT("TextFormat", true),
    TRACKING_CODE_TYPE("TrackingCodeType", true),
    VIEWTHROUGH_LOOKBACK_WINDOW("ViewthroughLookbackWindow", true),
    WEBSITE_PHONE_CALL_DURATION("WebsitePhoneCallDuration", false);

    private String field;
    private boolean filterable;

    private ConversionTracker(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<ConversionTracker> all() {
      return ImmutableList.copyOf(SelectorFields.ConversionTracker.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidLandscape}.
   */
  public enum AdGroupBidLandscape
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidLandscape> {
    ADGROUP_ID("AdGroupId", true),
    BID("Bid", true),
    CAMPAIGN_ID("CampaignId", true),
    END_DATE("EndDate", false),
    LANDSCAPE_CURRENT("LandscapeCurrent", true),
    LANDSCAPE_TYPE("LandscapeType", true),
    LOCAL_CLICKS("LocalClicks", true),
    LOCAL_COST("LocalCost", true),
    LOCAL_IMPRESSIONS("LocalImpressions", true),
    PROMOTED_IMPRESSIONS("PromotedImpressions", true),
    START_DATE("StartDate", false);

    private String field;
    private boolean filterable;

    private AdGroupBidLandscape(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<AdGroupBidLandscape> all() {
      return ImmutableList.copyOf(SelectorFields.AdGroupBidLandscape.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.CriterionBidLandscape}.
   */
  public enum CriterionBidLandscape
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.CriterionBidLandscape> {
    ADGROUP_ID("AdGroupId", true),
    BID("Bid", true),
    CAMPAIGN_ID("CampaignId", true),
    CRITERION_ID("CriterionId", true),
    END_DATE("EndDate", false),
    LOCAL_CLICKS("LocalClicks", true),
    LOCAL_COST("LocalCost", true),
    LOCAL_IMPRESSIONS("LocalImpressions", true),
    PROMOTED_IMPRESSIONS("PromotedImpressions", true),
    START_DATE("StartDate", false);

    private String field;
    private boolean filterable;

    private CriterionBidLandscape(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<CriterionBidLandscape> all() {
      return ImmutableList.copyOf(SelectorFields.CriterionBidLandscape.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.Experiment}.
   */
  public enum Experiment
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.Experiment> {
    ADGROUP_ADS_COUNT("AdGroupAdsCount", false),
    ADGROUP_CRITERIA_COUNT("AdGroupCriteriaCount", false),
    ADGROUPS_COUNT("AdGroupsCount", false),
    CAMPAIGN_ID("CampaignId", true),
    CONTROL_ID("ControlId", true),
    END_DATE_TIME("EndDateTime", true),
    ID("Id", true),
    LAST_MODIFIED_DATE_TIME("LastModifiedDateTime", true),
    NAME("Name", true),
    QUERY_PERCENTAGE("QueryPercentage", true),
    SERVING_STATUS("ServingStatus", false),
    START_DATE_TIME("StartDateTime", true),
    STATUS("Status", true);

    private String field;
    private boolean filterable;

    private Experiment(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<Experiment> all() {
      return ImmutableList.copyOf(SelectorFields.Experiment.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.Feed}.
   */
  public enum Feed implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.Feed> {
    ATTRIBUTES("Attributes", false),
    FEED_STATUS("FeedStatus", true),
    ID("Id", true),
    NAME("Name", true),
    ORIGIN("Origin", true),
    SYSTEM_FEED_GENERATION_DATA("SystemFeedGenerationData", false);

    private String field;
    private boolean filterable;

    private Feed(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<Feed> all() {
      return ImmutableList.copyOf(SelectorFields.Feed.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.FeedItem}.
   */
  public enum FeedItem implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.FeedItem> {
    ATTRIBUTE_VALUES("AttributeValues", false),
    DEVICE_PREFERENCE("DevicePreference", true),
    END_TIME("EndTime", true),
    FEED_ID("FeedId", true),
    FEED_ITEM_ID("FeedItemId", true),
    GEO_TARGETING_DISPLAY_TYPE("GeoTargetingDisplayType", false),
    GEO_TARGETING_LOCATION_NAME("GeoTargetingLocationName", false),
    GEO_TARGETING_PARENT_LOCATIONS("GeoTargetingParentLocations", false),
    GEO_TARGETING_STATUS("GeoTargetingStatus", false),
    KEYWORD_MATCH_TYPE("KeywordMatchType", true),
    KEYWORD_TARGETING_CRITERION_ID("KeywordTargetingCriterionId", true),
    KEYWORD_TEXT("KeywordText", true),
    POLICY_DATA("PolicyData", false),
    SCHEDULING("Scheduling", false),
    START_TIME("StartTime", true),
    STATUS("Status", true),
    TARGETING_AD_GROUP_ID("TargetingAdGroupId", true),
    TARGETING_CAMPAIGN_ID("TargetingCampaignId", true),
    URL_CUSTOM_PARAMETERS("UrlCustomParameters", false);

    private String field;
    private boolean filterable;

    private FeedItem(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<FeedItem> all() {
      return ImmutableList.copyOf(SelectorFields.FeedItem.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.FeedMapping}.
   */
  public enum FeedMapping
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.FeedMapping> {
    ATTRIBUTE_FIELD_MAPPINGS("AttributeFieldMappings", false),
    CRITERION_TYPE("CriterionType", false),
    FEED_ID("FeedId", true),
    FEED_MAPPING_ID("FeedMappingId", true),
    PLACEHOLDER_TYPE("PlaceholderType", true),
    STATUS("Status", true);

    private String field;
    private boolean filterable;

    private FeedMapping(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<FeedMapping> all() {
      return ImmutableList.copyOf(SelectorFields.FeedMapping.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.LocationCriterion}.
   */
  public enum LocationCriterion
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.LocationCriterion> {
    CANONICAL_NAME("CanonicalName", false),
    COUNTRY_CODE("CountryCode", true),
    CRITERIA_TYPE("CriteriaType", true),
    DISPLAY_TYPE("DisplayType", false),
    ID("Id", true),
    LOCALE("Locale", true),
    LOCATION_NAME("LocationName", true),
    PARENT_LOCATIONS("ParentLocations", false),
    REACH("Reach", false),
    TARGETING_STATUS("TargetingStatus", false);

    private String field;
    private boolean filterable;

    private LocationCriterion(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<LocationCriterion> all() {
      return ImmutableList.copyOf(SelectorFields.LocationCriterion.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.Media}.
   */
  public enum Media implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.Media> {
    ADVERTISING_ID("AdvertisingId", true),
    CREATION_TIME("CreationTime", true),
    DIMENSIONS("Dimensions", false),
    DURATION_MILLIS("DurationMillis", true),
    FILE_SIZE("FileSize", true),
    HEIGHT("Height", true),
    INDUSTRY_STANDARD_COMMERCIAL_IDENTIFIER("IndustryStandardCommercialIdentifier", true),
    MEDIA_ID("MediaId", true),
    MIME_TYPE("MimeType", true),
    NAME("Name", true),
    READY_TO_PLAY_ON_THE_WEB("ReadyToPlayOnTheWeb", false),
    REFERENCE_ID("ReferenceId", true),
    SOURCE_URL("SourceUrl", true),
    STREAMING_URL("StreamingUrl", false),
    TYPE("Type", true),
    URLS("Urls", false),
    WIDTH("Width", true),
    YOU_TUBE_VIDEO_ID_STRING("YouTubeVideoIdString", true);

    private String field;
    private boolean filterable;

    private Media(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<Media> all() {
      return ImmutableList.copyOf(SelectorFields.Media.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.rm.UserList}.
   */
  public enum UserList implements FieldType<com.google.api.ads.adwords.axis.v201603.rm.UserList> {
    ACCESS_REASON("AccessReason", true),
    ACCOUNT_USER_LIST_STATUS("AccountUserListStatus", true),
    CONVERSION_TYPES("ConversionTypes", false),
    DESCRIPTION("Description", false),
    ID("Id", true),
    IS_READ_ONLY("IsReadOnly", false),
    MEMBERSHIP_LIFE_SPAN("MembershipLifeSpan", true),
    NAME("Name", true),
    RULES("Rules", false),
    SIZE("Size", true),
    SIZE_RANGE("SizeRange", false),
    STATUS("Status", true),
    LIST_TYPE("ListType", true);

    private String field;
    private boolean filterable;

    private UserList(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<UserList> all() {
      return ImmutableList.copyOf(SelectorFields.UserList.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidModifier}.
   */
  public enum AdGroupBidModifier
      implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidModifier> {
    ADGROUP_ID("AdGroupId", true),
    BASE_AD_GROUP_ID("BaseAdGroupId", true),
    BID_MODIFIER("BidModifier", true),
    BID_MODIFIER_SOURCE("BidModifierSource", true),
    CAMPAIGN_ID("CampaignId", true),
    CRITERIA_TYPE("CriteriaType", true),
    ID("Id", true),
    PLATFORM_NAME("PlatformName", false);

    private String field;
    private boolean filterable;

    private AdGroupBidModifier(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }
 
    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<AdGroupBidModifier> all() {
      return ImmutableList.copyOf(SelectorFields.AdGroupBidModifier.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201603.cm.Label}.
   */
  public enum Label implements FieldType<com.google.api.ads.adwords.axis.v201603.cm.Label> {
    ATTRIBUTE("LabelAttribute", false),
    ID("LabelId", true),
    NAME("LabelName", true),
    STATUS("LabelStatus", true);

    private String field;
    private boolean filterable;

    private Label(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    @Override
    public String getField() {
      return field;
    }

    @Override
    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<Label> all() {
      return ImmutableList.copyOf(SelectorFields.Label.values());
    }

    public static String[] allFields() {
      return getFields(all());
    }
  }
}
