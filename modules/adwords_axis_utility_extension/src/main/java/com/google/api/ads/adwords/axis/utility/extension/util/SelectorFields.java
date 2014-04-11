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
 * https://developers.google.com/adwords/api/docs/appendix/selectorfields
 *
 * @author Julian Toledo
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
   * @returns the String[] needed by the AdWords Services
   */
  public static <T extends FieldType<?>> String[] getFields(List<T> enums) {
    return Lists.transform(enums, new Function<FieldType<?>, String>() {
      public String apply(FieldType<?> selectorField) {
        return selectorField.getField();
      }
    }).toArray(new String[] {});
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.mcm.ManagedCustomer}.
   */
  public enum ManagedCustomer
      implements FieldType<com.google.api.ads.adwords.axis.v201402.mcm.ManagedCustomer> {
    CAN_MANAGE_CLIENTS("CanManageClients", true),
    COMPANY_NAME("CompanyName", true),
    CURRENCY_CODE("CurrencyCode", true),
    CUSTOMER_ID("CustomerId", true),
    DATE_TIME_ZONE("DateTimeZone", true),
    LOGIN("Login", true),
    NAME("Name", true),
    TEST_ACCOUNT("TestAccount", false);

    private String field;
    private boolean filterable;

    private ManagedCustomer(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.Campaign}.
   */
  public enum Campaign implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.Campaign> {
    AD_SERVING_OPTIMIZATION_STATUS("AdServingOptimizationStatus", false),
    AMOUNT("Amount", true),
    BID_CEILING("BidCeiling", false),
    BID_TYPE("BidType", true),
    BIDDING_STRATEGY_TYPE("BiddingStrategyType", true),
    BUDGET_ID("BudgetId", true),
    BUDGET_NAME("BudgetName", true),
    BUDGET_REFERENCE_COUNT("BudgetReferenceCount", false),
    BUDGET_STATUS("BudgetStatus", true),
    DELIVERY_METHOD("DeliveryMethod", false),
    ELIGIBLE("Eligible", false),
    END_DATE("EndDate", true),
    ENHANCED_CPC_ENABLED("EnhancedCpcEnabled", true),
    FREQUENCY_CAP_MAX_IMPRESSIONS("FrequencyCapMaxImpressions", true),
    ID("Id", true),
    IS_BUDGET_EXPLICITLY_SHARED("IsBudgetExplicitlyShared", true),
    LEVEL("Level", true),
    NAME("Name", true),
    PERIOD("Period", false),
    PRICING_MODE("PricingMode", true),
    REJECTION_REASONS("RejectionReasons", false),
    SERVING_STATUS("ServingStatus", true),
    SETTINGS("Settings", false),
    START_DATE("StartDate", true),
    STATUS("Status", true),
    TARGET_CONTENT_NETWORK("TargetContentNetwork", true),
    TARGET_GOOGLE_SEARCH("TargetGoogleSearch", true),
    TARGET_PARTNER_SEARCH_NETWORK("TargetPartnerSearchNetwork", true),    
    TARGET_SEARCH_NETWORK("TargetSearchNetwork", true),
    TIME_UNIT("TimeUnit", true);

    private String field;
    private boolean filterable;

    private Campaign(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.AdGroupAd}.
   */
  public enum AdGroupAd
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.AdGroupAd> {
    ADGROUPAD_TRADEMARK_DISAPPROVED("AdGroupAdTrademarkDisapproved", false),
    ADGROUP_CREATIVE_APPROVAL_STATUS("AdGroupCreativeApprovalStatus", true),
    ADGROUP_ID("AdGroupId", true),
    ADVERTISING_ID("AdvertisingId", true),
    CREATION_TIME("CreationTime", true),
    DESCRIPTION1("Description1", true),
    DESCRIPTION2("Description2", true),
    DEVICE_PREFERENCE("DevicePreference", true),
    DIMENSIONS("Dimensions", false),
    DISPLAY_URL("DisplayUrl", true),
    EXPANDING_DIRECTIONS("ExpandingDirections", false),
    EXPERIMENT_DATA_STATUS("ExperimentDataStatus", false),
    EXPERIMENT_DELTA_STATUS("ExperimentDeltaStatus", false),
    EXPERIMENT_ID("ExperimentId", true),
    FILE_SIZE("FileSize", true),
    HEADLINE("Headline", true),
    HEIGHT("Height", true),
    ID("Id", true),
    IMAGE_CREATIVE_NAME("ImageCreativeName", true),
    INDUSTRY_STANDARD_COMMERCIAL_IDENTIFIER("IndustryStandardCommercialIdentifier", true),
    IS_COOKIE_TARGETED("IsCookieTargeted", false),
    IS_TAGGED("IsTagged", false),
    IS_USER_INTEREST_TARGETED("IsUserInterestTargeted", false),
    MEDIA_ID("MediaId", true),
    MIME_TYPE("MimeType", true),
    MOBILEAD_BUSINESS_NAME("MobileAdBusinessName", false),
    MOBILEAD_COUNTRY_CODE("MobileAdCountryCode", false),
    MOBILEAD_DESCRIPTION("MobileAdDescription", false),
    MOBILEAD_HEADLINE("MobileAdHeadline", false),
    MOBILEAD_MARKUP_LANGUAGES("MobileAdMarkupLanguages", false),
    MOBILEAD_MOBILE_CARRIERS("MobileAdMobileCarriers", false),
    MOBILEAD_PHONE_NUMBER("MobileAdPhoneNumber", false),
    MOBILEIMAGEAD_MARKUP_LANGUAGES("MobileImageAdMarkupLanguages", false),
    MOBILEIMAGEAD_MOBILE_CARRIERS("MobileImageAdMobileCarriers", false),
    PROMOTION_LINE("PromotionLine", true),
    READY_TO_PLAY_ON_THE_WEB("ReadyToPlayOnTheWeb", false),
    REFERENCE_ID("ReferenceId", true),
    RICHMEDIAAD_CERTIFIED_VENDOR_FORMAT_ID("RichMediaAdCertifiedVendorFormatId", false),
    RICHMEDIAAD_DURATION("RichMediaAdDuration", false),
    RICHMEDIAAD_IMPRESSION_BEACON_URL("RichMediaAdImpressionBeaconUrl", false),
    RICHMEDIAAD_NAME("RichMediaAdName", false),
    RICHMEDIAAD_SNIPPET("RichMediaAdSnippet", false),
    RICHMEDIAAD_SOURCE_URL("RichMediaAdSourceUrl", false),
    RICHMEDIAAD_TYPE("RichMediaAdType", false),
    SOURCE_URL("SourceUrl", true),
    STATUS("Status", true),
    TEMPLATEAD_DURATION("TemplateAdDuration", false),
    TEMPLATEAD_NAME("TemplateAdName", false),
    TEMPLATEAD_UNIONID("TemplateAdUnionId", false),
    TEMPLATE_ELEMENT_FIELD_NAME("TemplateElementFieldName", false),
    TEMPLATE_ELEMENT_FIELD_TEXT("TemplateElementFieldText", false),
    TEMPLATE_ELEMENT_FIELD_TYPE("TemplateElementFieldType", false),
    TEMPLATE_ID("TemplateId", false),
    UNIQUE_NAME("UniqueName", false),
    URL("Url", true),
    URLS("Urls", false),
    VIDEO_TYPES("VideoTypes", false),
    WIDTH("Width", true),
    YOUTUBEVIDEO_ID_STRING("YouTubeVideoIdString", true);

    private String field;
    private boolean filterable;

    private AdGroupAd(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.AdGroupCriterion}.
   */
  public enum AdGroupCriterion
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.AdGroupCriterion> {
    ADGROUP_ID("AdGroupId", true),
    AGE_RANGE_TYPE("AgeRangeType", false),
    APPROVAL_STATUS("ApprovalStatus", true),
    ARGUMENT("Argument", false),
    BID_TYPE("BidType", true),
    BIDDING_STRATEGY_TYPE("BiddingStrategyType", true),
    CPC_BID("CpcBid", true),
    CPC_BID_SOURCE("CpcBidSource", true),
    CPM_BID("CpmBid", true),
    CPM_BID_SOURCE("CpmBidSource", true),
    CRITERIA_COVERAGE("CriteriaCoverage", false),
    CRITERIA_SAMPLES("CriteriaSamples", false),
    CRITERIA_TYPE("CriteriaType", true),
    CRITERION_USE("CriterionUse", true),
    DESTINATION_URL("DestinationUrl", true),
    DISPLAY_NAME("DisplayName", true),
    ENHANCED_CPC_ENABLED("EnhancedCpcEnabled", true),
    EXPERIMENT_BID_MULTIPLIER("ExperimentBidMultiplier", true),
    EXPERIMENT_DATA_STATUS("ExperimentDataStatus", false),
    EXPERIMENT_DELTA_STATUS("ExperimentDeltaStatus", true),
    EXPERIMENT_ID("ExperimentId", true),
    FIRST_PAGE_CPC("FirstPageCpc", true),
    GENDER_TYPE("GenderType", false),
    ID("Id", true),
    IS_KEYWORD_AD_RELEVANCE_ACCEPTABLE("IsKeywordAdRelevanceAcceptable", true),
    IS_LANDING_PAGE_LATENCY_ACCEPTABLE("IsLandingPageLatencyAcceptable", true),
    IS_LANDING_PAGE_QUALITY_ACCEPTABLE("IsLandingPageQualityAcceptable", true),
    KEYWORD_MATCH_TYPE("KeywordMatchType", true),
    KEYWORD_TEXT("KeywordText", true),
    MOBILE_APP_CATEGORY_ID("MobileAppCategoryId", false),
    OPERAND("Operand", false),
    PARAMETER("Parameter", true), // Beta
    PATH("Path", true),
    PERCENT_CPA_BID("PercentCpaBid", true),
    PERCENT_CPA_BID_SOURCE("PercentCpaBidSource", true),
    PLACEMENT_URL("PlacementUrl", true),
    QUALITY_SCORE("QualityScore", true),
    STATUS("Status", true),
    SYSTEM_SERVING_STATUS("SystemServingStatus", true),
    TEXT("Text", false),
    TOP_OF_PAGE_CPC("TopOfPageCpc", true), // Beta
    USER_INTEREST_ID("UserInterestId", false),
    USER_INTEREST_NAME("UserInterestName", false),
    USER_LIST_ID("UserListId", false),
    USER_LIST_MEMBERSHIP_STATUS("UserListMembershipStatus", true),
    USER_LIST_NAME("UserListName", false),
    VERTICAL_ID("VerticalId", false),
    VERTICAL_PARENT_ID("VerticalParentId", false);

    private String field;
    private boolean filterable;

    private AdGroupCriterion(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

    public boolean getFilterable() {
      return filterable;
    }

    // Returns all fields that are not marked as beta
    public static ImmutableList<AdGroupCriterion> all(boolean includeBetaFields) {
      if (includeBetaFields) {
        return ImmutableList.copyOf(SelectorFields.AdGroupCriterion.values());
      } else {
        return ImmutableList.<AdGroupCriterion>builder()
            .add(ADGROUP_ID)
            .add(AGE_RANGE_TYPE)
            .add(APPROVAL_STATUS)
            .add(ARGUMENT)
            .add(BID_TYPE)
            .add(BIDDING_STRATEGY_TYPE)
            .add(CPC_BID)
            .add(CPC_BID_SOURCE)
            .add(CPM_BID)
            .add(CPM_BID_SOURCE)
            .add(CRITERIA_COVERAGE)
            .add(CRITERIA_SAMPLES)
            .add(CRITERIA_TYPE)
            .add(CRITERION_USE)
            .add(DESTINATION_URL)
            .add(DISPLAY_NAME)
            .add(ENHANCED_CPC_ENABLED)
            .add(EXPERIMENT_BID_MULTIPLIER)
            .add(EXPERIMENT_DATA_STATUS)
            .add(EXPERIMENT_DELTA_STATUS)
            .add(EXPERIMENT_ID)
            .add(FIRST_PAGE_CPC)
            .add(GENDER_TYPE)
            .add(ID)
            .add(IS_KEYWORD_AD_RELEVANCE_ACCEPTABLE)
            .add(IS_LANDING_PAGE_LATENCY_ACCEPTABLE)
            .add(IS_LANDING_PAGE_QUALITY_ACCEPTABLE)
            .add(KEYWORD_MATCH_TYPE)
            .add(KEYWORD_TEXT)
            .add(MOBILE_APP_CATEGORY_ID)
            .add(OPERAND)
            .add(PATH)
            .add(PERCENT_CPA_BID)
            .add(PERCENT_CPA_BID_SOURCE)
            .add(PLACEMENT_URL)
            .add(QUALITY_SCORE)
            .add(STATUS)
            .add(SYSTEM_SERVING_STATUS)
            .add(TEXT)
            .add(USER_INTEREST_ID)
            .add(USER_INTEREST_NAME)
            .add(USER_LIST_ID)
            .add(USER_LIST_MEMBERSHIP_STATUS)
            .add(USER_LIST_NAME)
            .add(VERTICAL_ID)
            .add(VERTICAL_PARENT_ID).build();
      }
    }
    
    public static String[] allFields(boolean includeBetaFields) {
      return getFields(all(includeBetaFields));
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.AdGroup}.
   */
  public enum AdGroup implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.AdGroup> {
    BID_TYPE("BidType", true),
    BIDDING_STRATEGY_TYPE("BiddingStrategyType", true),
    CAMPAIGN_ID("CampaignId", true),
    CAMPAIGN_NAME("CampaignName", true),
    CONTENT_BID("ContentBid", true),
    CONTENT_BID_CRITERION_TYPE_GROUP("ContentBidCriterionTypeGroup", true),
    CPC_BID("CpcBid", true),
    CPM_BID("CpmBid", true),
    ENHANCED_CPC_ENABLED("EnhancedCpcEnabled", true),
    EXPERIMENT_DELTA_STATUS("ExperimentDeltaStatus", false),
    EXPERIMENT_ID("ExperimentId", true),
    ID("Id", true),
    MAX_CONTENT_CPC_MULTIPLIER("MaxContentCpcMultiplier", true),
    MAX_CPC_MULTIPLIER("MaxCpcMultiplier", true),
    MAX_CPM_MULTIPLIER("MaxCpmMultiplier", true),
    NAME("Name", true),
    PERCENT_CPA_BID("PercentCpaBid", true),
    SETTINGS("Settings", false),
    STATUS("Status", true),
    TARGET_CPA_BID("TargetCpaBid", true);

    private String field;
    private boolean filterable;

    private AdGroup(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.AdGroupFeed}.
   */
  public enum AdGroupFeed
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.AdGroupFeed> {
    ADGROUP_ID("AdGroupId", true),
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

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.AdParam}.
   */
  public enum AdParam implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.AdParam> {
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

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.Budget}.
   */
  public enum Budget implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.Budget> {
    AMOUNT("Amount", true),
    BUDGET_ID("BudgetId", true),
    BUDGET_NAME("BudgetName", true),
    BUDGET_REFERENCE_COUNT("BudgetReferenceCount", false),
    BUDGET_STATUS("BudgetStatus", true),
    DELIVERY_METHOD("DeliveryMethod", false),
    IS_BUDGET_EXPLICITLY_SHARED("IsBudgetExplicitlyShared", false),
    PERIOD("Period", true);

    private String field;
    private boolean filterable;

    private Budget(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder}.
   */
  public enum BudgetOrder
      implements FieldType<com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder> {
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

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.CampaignAdExtension}.
   */
  public enum CampaignAdExtension
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.CampaignAdExtension> {
    AD_EXTENSION_ID("AdExtensionId", true),
    ADDRESS("Address", false),
    ADVERTISER_NAME("AdvertiserName", false),
    APP_ID("AppId", false),
    APP_STORE("AppStore", false),
    APPROVAL_STATUS("ApprovalStatus", true),
    ARGUMENT("Argument", false),
    CAMPAIGN_ID("CampaignId", true),
    COMPANY_NAME("CompanyName", false),
    COUNTRY_CODE("CountryCode", false),
    DESTINATION_URL("DestinationUrl", false),
    DISPLAY_TEXT("DisplayText", false),
    DOMAIN_NAME("DomainName", false),
    EMAIL("Email", false),
    ENCODED_LOCATION("EncodedLocation", false),
    GEO_POINT("GeoPoint", false),
    GOOGLE_BASE_CUSTOMER_ID("GoogleBaseCustomerId", false),
    ICON_MEDIA_ID("IconMediaId", false),
    IMAGE_MEDIA_ID("ImageMediaId", false),
    IN_APP_LINK_TEXT("InAppLinkText", false),
    IN_APP_LINK_URL("InAppLinkUrl", false),
    IS_CALL_ONLY("IsCallOnly", false),
    IS_CALL_TRACKING_ENABLED("IsCallTrackingEnabled", false), // Beta
    LANGUAGE_CODE("LanguageCode", false),
    LOCATION_EXTENSION_SOURCE("LocationExtensionSource", true),
    OPERAND("Operand", false),
    PHONE_NUMBER("PhoneNumber", false),
    SHOULD_SYNC_URL("ShouldSyncUrl", false),
    STATUS("Status", true);

    private String field;
    private boolean filterable;

    private CampaignAdExtension(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

    public boolean getFilterable() {
      return filterable;
    }

    // Returns all fields that are not marked as beta
    public static ImmutableList<CampaignAdExtension> all(boolean includeBetaFields) {
      if (includeBetaFields) {
        return ImmutableList.copyOf(SelectorFields.CampaignAdExtension.values());
      } else {
        return ImmutableList.<CampaignAdExtension>builder()
            .add(AD_EXTENSION_ID)
            .add(ADDRESS)
            .add(ADVERTISER_NAME)
            .add(APP_ID)
            .add(APP_STORE)
            .add(APPROVAL_STATUS)
            .add(ARGUMENT)
            .add(CAMPAIGN_ID)
            .add(DESTINATION_URL)
            .add(DISPLAY_TEXT)
            .add(DOMAIN_NAME)
            .add(EMAIL)
            .add(ENCODED_LOCATION)
            .add(GEO_POINT)
            .add(GOOGLE_BASE_CUSTOMER_ID)
            .add(ICON_MEDIA_ID)
            .add(IMAGE_MEDIA_ID)
            .add(IN_APP_LINK_TEXT)
            .add(IN_APP_LINK_URL)
            .add(IS_CALL_ONLY)
            .add(LANGUAGE_CODE)
            .add(LOCATION_EXTENSION_SOURCE)
            .add(OPERAND)
            .add(PHONE_NUMBER)
            .add(SHOULD_SYNC_URL)
            .add(STATUS).build();
      }
    }

    public static String[] allFields(boolean includeBetaFields) {
      return getFields(all(includeBetaFields));
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.CampaignCriterion}.
   */
  public enum CampaignCriterion
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.CampaignCriterion> {
    ADDRESS("Address", false),
    AGE_RANGE_TYPE("AgeRangeType", false),
    ARGUMENT("Argument", false),
    BID_MODIFIER("BidModifier", true),
    CAMPAIGN_ID("CampaignId", true),
    CARRIER_COUNTRY_CODE("CarrierCountryCode", false),
    CARRIER_NAME("CarrierName", false),
    CONTENT_LABEL_TYPE("ContentLabelType", true),
    CRITERIA_TYPE("CriteriaType", true),
    DAY_OF_WEEK("DayOfWeek", false),
    DEVICE_NAME("DeviceName", false),
    DEVICE_TYPE("DeviceType", false),
    DISPLAY_NAME("DisplayName", true),
    DISPLAY_TYPE("DisplayType", false),
    END_HOUR("EndHour", false),
    END_MINUTE("EndMinute", false),
    GENDER_TYPE("GenderType", false),
    GEO_POINT("GeoPoint", false),
    ID("Id", true),
    IS_NEGATIVE("IsNegative", true),
    KEYWORD_MATCH_TYPE("KeywordMatchType", true),
    KEYWORD_TEXT("KeywordText", true),
    LANGUAGE_CODE("LanguageCode", false),
    LANGUAGE_NAME("LanguageName", false),
    LOCATION_NAME("LocationName", true),
    MANUFACTURER_NAME("ManufacturerName", false),
    MOBILE_APP_CATEGORY_ID("MobileAppCategoryId", false),
    OPERAND("Operand", false),
    OPERATING_SYSTEM_NAME("OperatingSystemName", false),
    OPERATOR_TYPE("OperatorType", false),
    OS_MAJOR_VERSION("OsMajorVersion", false),
    OS_MINOR_VERSION("OsMinorVersion", false),
    PARENT_LOCATIONS("ParentLocations", false),
    PATH("Path", false),
    PLACEMENT_URL("PlacementUrl", false),
    PLATFORM_NAME("PlatformName", false),
    RADIUS_DISTANCE_UNITS("RadiusDistanceUnits", false),
    RADIUS_IN_UNITS("RadiusInUnits", false),
    START_HOUR("StartHour", false),
    START_MINUTE("StartMinute", false),
    TARGETING_STATUS("TargetingStatus", false),
    TEXT("Text", false),
    USER_INTEREST_ID("UserInterestId", false),
    USER_INTEREST_NAME("UserInterestName", false),
    USER_LIST_ID("UserListId", false),
    USER_LIST_MEMBERSHIP_STATUS("UserListMembershipStatus", true),
    USER_LIST_NAME("UserListName", false),
    VERTICAL_ID("VerticalId", false),
    VERTICAL_PARENT_ID("VerticalParentId", false),
    VERTICES("Vertices", false);

    private String field;
    private boolean filterable;

    private CampaignCriterion(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

    public boolean getFilterable() {
      return filterable;
    }

    public static ImmutableList<CampaignCriterion> all() {
      return ImmutableList.copyOf(SelectorFields.CampaignCriterion.values());
    }
  }

  /**
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.CampaignFeed}.
   */
  public enum CampaignFeed
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.CampaignFeed> {
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

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.ConversionTracker}.
   */
  public enum ConversionTracker
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.ConversionTracker> {
    APP_ID("AppId", true),
    APP_PLATFORM("AppPlatform", true),
    BACKGROUND_COLOR("BackgroundColor", true),
    CATEGORY("Category", true),
    CONVERSION_PAGE_LANGUAGE("ConversionPageLanguage", true),
    CONVERSION_VALUE("ConversionValue", true),
    ID("Id", true),
    IS_PRODUCT_ADS_CHARGEABLE("IsProductAdsChargeable", true),
    MARKUP_LANGUAGE("MarkupLanguage", true),
    MOST_RECENT_CONVERSION_DATE("MostRecentConversionDate", true),
    NAME("Name", true),
    NUM_CONVERSION_EVENTS("NumConversionEvents", true),
    NUM_CONVERTED_CLICKS("NumConvertedClicks", true),
    PRODUCT_ADS_CHARGEABLE_CONVERSION_WINDOW("ProductAdsChargeableConversionWindow", true),
    STATUS("Status", true),
    TEXT_FORMAT("TextFormat", true),
    TRACKING_CODE_TYPE("TrackingCodeType", true),
    VIEWTHROUGH_LOOKBACK_WINDOW("ViewthroughLookbackWindow", true);

    private String field;
    private boolean filterable;

    private ConversionTracker(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.AdGroupBidLandscape}.
   */
  public enum AdGroupBidLandscape
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.AdGroupBidLandscape> {
    ADGROUP_ID("AdGroupId", true),
    BID("Bid", true),
    CAMPAIGN_ID("CampaignId", true),
    END_DATE("EndDate", false),
    LANDSCAPE_CURRENT("LandscapeCurrent", true),
    LANDSCAPE_TYPE("LandscapeType", true),
    LOCAL_CLICKS("LocalClicks", true),
    LOCAL_COST("LocalCost", true),
    LOCAL_IMPRESSIONS("LocalImpressions", true),
    MARGINAL_CPC("MarginalCpc", true),
    PROMOTED_IMPRESSIONS("PromotedImpressions", true),
    START_DATE("StartDate", false);

    private String field;
    private boolean filterable;

    private AdGroupBidLandscape(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.CriterionBidLandscape}.
   */
  public enum CriterionBidLandscape
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.CriterionBidLandscape> {
    ADGROUP_ID("AdGroupId", true),
    BID("Bid", true),
    CAMPAIGN_ID("CampaignId", true),
    CRITERION_ID("CriterionId", true),
    END_DATE("EndDate", false),
    LOCAL_CLICKS("LocalClicks", true),
    LOCAL_COST("LocalCost", true),
    LOCAL_IMPRESSIONS("LocalImpressions", true),
    MARGINAL_CPC("MarginalCpc", true),
    PROMOTED_IMPRESSIONS("PromotedImpressions", true),
    START_DATE("StartDate", false);

    private String field;
    private boolean filterable;

    private CriterionBidLandscape(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.Experiment}.
   */
  public enum Experiment
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.Experiment> {
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

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.Feed}.
   */
  public enum Feed implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.Feed> {
    ATTRIBUTES("Attributes", false),
    FEED_STATUS("FeedStatus", true),
    ID("Id", true),
    NAME("Name", false),
    ORIGIN("Origin", true);

    private String field;
    private boolean filterable;

    private Feed(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.FeedItem}.
   */
  public enum FeedItem implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.FeedItem> {
    ATTRIBUTE_VALUES("AttributeValues", false),
    DEVICE_PREFERENCE("DevicePreference", true),
    END_TIME("EndTime", false),
    FEED_ID("FeedId", true),
    FEED_ITEM_ID("FeedItemId", true),
    START_TIME("StartTime", false),
    STATUS("Status", true),
    VALIDATION_DETAILS("ValidationDetails", false);

    private String field;
    private boolean filterable;

    private FeedItem(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.FeedMapping}.
   */
  public enum FeedMapping
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.FeedMapping> {
    ATTRIBUTE_FIELD_MAPPINGS("AttributeFieldMappings", true),
    FEED_ID("FeedId", true),
    FEED_MAPPING_ID("FeedMappingId", true),
    STATUS("Status", true);

    private String field;
    private boolean filterable;

    private FeedMapping(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.LocationCriterion}.
   */
  public enum LocationCriterion
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.LocationCriterion> {
    CANONICAL_NAME("CanonicalName", false),
    CRITERIA_TYPE("CriteriaType", true),
    DISPLAY_TYPE("DisplayType", false),
    ID("Id", true),
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

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.Media}.
   */
  public enum Media implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.Media> {
    ADVERTISING_ID("AdvertisingId", true),
    CREATION_TIME("CreationTime", true),
    DIMENSIONS("Dimensions", false),
    DURATION_MILLIS("DurationMillis", true),
    FILE_SIZE("FileSize", true),
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
    YOUTUBE_VIDEO_ID_STRING("YouTubeVideoIdString", true);

    private String field;
    private boolean filterable;

    private Media(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.rm.UserList}.
   */
  public enum UserList implements FieldType<com.google.api.ads.adwords.axis.v201402.rm.UserList> {
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
    TYPE("Type", true);

    private String field;
    private boolean filterable;

    private UserList(String field, boolean filterable) {
      this.field = field;
      this.filterable = filterable;
    }

    public String getField() {
      return field;
    }

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
   * SelectorFields for {@link com.google.api.ads.adwords.axis.v201402.cm.AdGroupBidModifier}.
   */
  public enum AdGroupBidModifier
      implements FieldType<com.google.api.ads.adwords.axis.v201402.cm.AdGroupBidModifier> {
    ADGROUP_ID("AdGroupId", true),
    BID_MODIFIER("BidModifier", true),
    BID_MODIFIER_SORUCE("BidModifierSource", true),
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

    public String getField() {
      return field;
    }
 
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
}
