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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_CUSTOMIZERS_NOT_SUPPORTED_FOR_AD_TYPE"/>
 *     &lt;enumeration value="APPROXIMATELY_TOO_LONG"/>
 *     &lt;enumeration value="APPROXIMATELY_TOO_SHORT"/>
 *     &lt;enumeration value="BAD_SNIPPET"/>
 *     &lt;enumeration value="CANNOT_MODIFY_AD"/>
 *     &lt;enumeration value="CANNOT_SET_BUSINESS_NAME_IF_URL_SET"/>
 *     &lt;enumeration value="CANNOT_SET_FIELD"/>
 *     &lt;enumeration value="CANNOT_SET_FIELD_WITH_ORIGIN_AD_ID_SET"/>
 *     &lt;enumeration value="CANNOT_SET_FIELD_WITH_AD_ID_SET_FOR_SHARING"/>
 *     &lt;enumeration value="CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE"/>
 *     &lt;enumeration value="CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE_FORMAT_SETTING"/>
 *     &lt;enumeration value="CANNOT_SET_URL"/>
 *     &lt;enumeration value="CANNOT_SET_WITHOUT_FINAL_URLS"/>
 *     &lt;enumeration value="CANNOT_SET_WITH_FINAL_URLS"/>
 *     &lt;enumeration value="CANNOT_SET_WITH_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="CANNOT_SET_WITH_URL_DATA"/>
 *     &lt;enumeration value="CANNOT_USE_AD_SUBCLASS_FOR_OPERATOR"/>
 *     &lt;enumeration value="CUSTOMER_NOT_APPROVED_MOBILEADS"/>
 *     &lt;enumeration value="CUSTOMER_NOT_APPROVED_THIRDPARTY_ADS"/>
 *     &lt;enumeration value="CUSTOMER_NOT_APPROVED_THIRDPARTY_REDIRECT_ADS"/>
 *     &lt;enumeration value="CUSTOMER_NOT_ELIGIBLE"/>
 *     &lt;enumeration value="CUSTOMER_NOT_ELIGIBLE_FOR_UPDATING_BEACON_URL"/>
 *     &lt;enumeration value="DIMENSION_ALREADY_IN_UNION"/>
 *     &lt;enumeration value="DIMENSION_MUST_BE_SET"/>
 *     &lt;enumeration value="DIMENSION_NOT_IN_UNION"/>
 *     &lt;enumeration value="DISPLAY_URL_CANNOT_BE_SPECIFIED"/>
 *     &lt;enumeration value="DOMESTIC_PHONE_NUMBER_FORMAT"/>
 *     &lt;enumeration value="EMERGENCY_PHONE_NUMBER"/>
 *     &lt;enumeration value="EMPTY_FIELD"/>
 *     &lt;enumeration value="FEED_ATTRIBUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID"/>
 *     &lt;enumeration value="FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH"/>
 *     &lt;enumeration value="ILLEGAL_AD_CUSTOMIZER_TAG_USE"/>
 *     &lt;enumeration value="ILLEGAL_TAG_USE"/>
 *     &lt;enumeration value="INCONSISTENT_DIMENSIONS"/>
 *     &lt;enumeration value="INCONSISTENT_STATUS_IN_TEMPLATE_UNION"/>
 *     &lt;enumeration value="INCORRECT_LENGTH"/>
 *     &lt;enumeration value="INELIGIBLE_FOR_UPGRADE"/>
 *     &lt;enumeration value="INVALID_AD_ADDRESS_CAMPAIGN_TARGET"/>
 *     &lt;enumeration value="INVALID_AD_TYPE"/>
 *     &lt;enumeration value="INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE"/>
 *     &lt;enumeration value="INVALID_ATTRIBUTES_FOR_MOBILE_TEXT"/>
 *     &lt;enumeration value="INVALID_CALL_TO_ACTION_TEXT"/>
 *     &lt;enumeration value="INVALID_CHARACTER_FOR_URL"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_DSA_URL_TAG"/>
 *     &lt;enumeration value="INVALID_EXPANDED_DYNAMIC_SEARCH_AD_TAG"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="INVALID_MARKUP_LANGUAGE"/>
 *     &lt;enumeration value="INVALID_MOBILE_CARRIER"/>
 *     &lt;enumeration value="INVALID_MOBILE_CARRIER_TARGET"/>
 *     &lt;enumeration value="INVALID_NUMBER_OF_ELEMENTS"/>
 *     &lt;enumeration value="INVALID_PHONE_NUMBER_FORMAT"/>
 *     &lt;enumeration value="INVALID_RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID"/>
 *     &lt;enumeration value="INVALID_TEMPLATE_DATA"/>
 *     &lt;enumeration value="INVALID_TEMPLATE_ELEMENT_FIELD_TYPE"/>
 *     &lt;enumeration value="INVALID_TEMPLATE_ID"/>
 *     &lt;enumeration value="LINE_TOO_WIDE"/>
 *     &lt;enumeration value="MISSING_AD_CUSTOMIZER_MAPPING"/>
 *     &lt;enumeration value="MISSING_ADDRESS_COMPONENT"/>
 *     &lt;enumeration value="MISSING_ADVERTISEMENT_NAME"/>
 *     &lt;enumeration value="MISSING_BUSINESS_NAME"/>
 *     &lt;enumeration value="MISSING_DESCRIPTION1"/>
 *     &lt;enumeration value="MISSING_DESCRIPTION2"/>
 *     &lt;enumeration value="MISSING_DESTINATION_URL_TAG"/>
 *     &lt;enumeration value="MISSING_LANDING_PAGE_URL_TAG"/>
 *     &lt;enumeration value="MISSING_DIMENSION"/>
 *     &lt;enumeration value="MISSING_DISPLAY_URL"/>
 *     &lt;enumeration value="MISSING_HEADLINE"/>
 *     &lt;enumeration value="MISSING_HEIGHT"/>
 *     &lt;enumeration value="MISSING_IMAGE"/>
 *     &lt;enumeration value="MISSING_MARKETING_IMAGE_OR_PRODUCT_VIDEOS"/>
 *     &lt;enumeration value="MISSING_MARKUP_LANGUAGES"/>
 *     &lt;enumeration value="MISSING_MOBILE_CARRIER"/>
 *     &lt;enumeration value="MISSING_PHONE"/>
 *     &lt;enumeration value="MISSING_REQUIRED_TEMPLATE_FIELDS"/>
 *     &lt;enumeration value="MISSING_TEMPLATE_FIELD_VALUE"/>
 *     &lt;enumeration value="MISSING_TEXT"/>
 *     &lt;enumeration value="MISSING_VISIBLE_URL"/>
 *     &lt;enumeration value="MISSING_WIDTH"/>
 *     &lt;enumeration value="MULTIPLE_DISTINCT_FEEDS_UNSUPPORTED"/>
 *     &lt;enumeration value="MUST_USE_TEMP_AD_UNION_ID_ON_ADD"/>
 *     &lt;enumeration value="TOO_LONG"/>
 *     &lt;enumeration value="TOO_SHORT"/>
 *     &lt;enumeration value="UNION_DIMENSIONS_CANNOT_CHANGE"/>
 *     &lt;enumeration value="UNKNOWN_ADDRESS_COMPONENT"/>
 *     &lt;enumeration value="UNKNOWN_FIELD_NAME"/>
 *     &lt;enumeration value="UNKNOWN_UNIQUE_NAME"/>
 *     &lt;enumeration value="UNSUPPORTED_DIMENSIONS"/>
 *     &lt;enumeration value="URL_INVALID_SCHEME"/>
 *     &lt;enumeration value="URL_INVALID_TOP_LEVEL_DOMAIN"/>
 *     &lt;enumeration value="URL_MALFORMED"/>
 *     &lt;enumeration value="URL_NO_HOST"/>
 *     &lt;enumeration value="URL_NOT_EQUIVALENT"/>
 *     &lt;enumeration value="URL_HOST_NAME_TOO_LONG"/>
 *     &lt;enumeration value="URL_NO_SCHEME"/>
 *     &lt;enumeration value="URL_NO_TOP_LEVEL_DOMAIN"/>
 *     &lt;enumeration value="URL_PATH_NOT_ALLOWED"/>
 *     &lt;enumeration value="URL_PORT_NOT_ALLOWED"/>
 *     &lt;enumeration value="URL_QUERY_NOT_ALLOWED"/>
 *     &lt;enumeration value="URL_SCHEME_BEFORE_DSA_TAG"/>
 *     &lt;enumeration value="URL_SCHEME_BEFORE_EXPANDED_DYNAMIC_SEARCH_AD_TAG"/>
 *     &lt;enumeration value="USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE"/>
 *     &lt;enumeration value="INCONSISTENT_EXPANDABLE_SETTINGS"/>
 *     &lt;enumeration value="INVALID_FORMAT"/>
 *     &lt;enumeration value="INVALID_FIELD_TEXT"/>
 *     &lt;enumeration value="ELEMENT_NOT_PRESENT"/>
 *     &lt;enumeration value="IMAGE_ERROR"/>
 *     &lt;enumeration value="VALUE_NOT_IN_RANGE"/>
 *     &lt;enumeration value="FIELD_NOT_PRESENT"/>
 *     &lt;enumeration value="ADDRESS_NOT_COMPLETE"/>
 *     &lt;enumeration value="ADDRESS_INVALID"/>
 *     &lt;enumeration value="VIDEO_RETRIEVAL_ERROR"/>
 *     &lt;enumeration value="AUDIO_ERROR"/>
 *     &lt;enumeration value="INVALID_YOUTUBE_DISPLAY_URL"/>
 *     &lt;enumeration value="TOO_MANY_PRODUCT_IMAGES"/>
 *     &lt;enumeration value="TOO_MANY_PRODUCT_VIDEOS"/>
 *     &lt;enumeration value="INCOMPATIBLE_AD_TYPE_AND_DEVICE_PREFERENCE"/>
 *     &lt;enumeration value="CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY"/>
 *     &lt;enumeration value="CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="DISALLOWED_NUMBER_TYPE"/>
 *     &lt;enumeration value="PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY"/>
 *     &lt;enumeration value="PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY"/>
 *     &lt;enumeration value="PREMIUM_RATE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="VANITY_PHONE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_CALL_CONVERSION_TYPE_ID"/>
 *     &lt;enumeration value="CANNOT_DISABLE_CALL_CONVERSION_AND_SET_CONVERSION_TYPE_ID"/>
 *     &lt;enumeration value="CANNOT_SET_PATH2_WITHOUT_PATH1"/>
 *     &lt;enumeration value="MISSING_DYNAMIC_SEARCH_ADS_SETTING_DOMAIN_NAME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdError.Reason")
@XmlEnum
public enum AdErrorReason {


    /**
     * 
     *                 Ad customizers are not supported for ad type.
     *               
     * 
     */
    AD_CUSTOMIZERS_NOT_SUPPORTED_FOR_AD_TYPE("AD_CUSTOMIZERS_NOT_SUPPORTED_FOR_AD_TYPE"),

    /**
     * 
     *                 Estimating character sizes the string is too long.
     *               
     * 
     */
    APPROXIMATELY_TOO_LONG("APPROXIMATELY_TOO_LONG"),

    /**
     * 
     *                 Estimating character sizes the string is too short.
     *               
     * 
     */
    APPROXIMATELY_TOO_SHORT("APPROXIMATELY_TOO_SHORT"),

    /**
     * 
     *                 There is a problem with the snippet.
     *               
     * 
     */
    BAD_SNIPPET("BAD_SNIPPET"),

    /**
     * 
     *                 Cannot modify an ad.
     *               
     * 
     */
    CANNOT_MODIFY_AD("CANNOT_MODIFY_AD"),

    /**
     * 
     *                 business name and url cannot be set at the same time
     *               
     * 
     */
    CANNOT_SET_BUSINESS_NAME_IF_URL_SET("CANNOT_SET_BUSINESS_NAME_IF_URL_SET"),

    /**
     * 
     *                 The specified field is incompatible with this ad's type or settings.
     *               
     * 
     */
    CANNOT_SET_FIELD("CANNOT_SET_FIELD"),

    /**
     * 
     *                 Cannot set field when originAdId is set.
     *               
     * 
     */
    CANNOT_SET_FIELD_WITH_ORIGIN_AD_ID_SET("CANNOT_SET_FIELD_WITH_ORIGIN_AD_ID_SET"),

    /**
     * 
     *                 Cannot set field when an existing ad id is set for sharing.
     *               
     * 
     */
    CANNOT_SET_FIELD_WITH_AD_ID_SET_FOR_SHARING("CANNOT_SET_FIELD_WITH_AD_ID_SET_FOR_SHARING"),

    /**
     * 
     *                 Cannot set allowFlexibleColor false if no color is provided by user.
     *               
     * 
     */
    CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE("CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE"),

    /**
     * 
     *                 When user select native, no color control is allowed because we will always respect publisher
     *                 color for native format serving.
     *               
     * 
     */
    CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE_FORMAT_SETTING("CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE_FORMAT_SETTING"),

    /**
     * 
     *                 Cannot specify a url for the ad type
     *               
     * 
     */
    CANNOT_SET_URL("CANNOT_SET_URL"),

    /**
     * 
     *                 Cannot specify a tracking or mobile url without also setting final urls
     *               
     * 
     */
    CANNOT_SET_WITHOUT_FINAL_URLS("CANNOT_SET_WITHOUT_FINAL_URLS"),

    /**
     * 
     *                 Cannot specify a legacy url and a final url simultaneously
     *               
     * 
     */
    CANNOT_SET_WITH_FINAL_URLS("CANNOT_SET_WITH_FINAL_URLS"),

    /**
     * 
     *                 Cannot specify a legacy url and a tracking url template simultaneously in a DSA.
     *               
     * 
     */
    CANNOT_SET_WITH_TRACKING_URL_TEMPLATE("CANNOT_SET_WITH_TRACKING_URL_TEMPLATE"),

    /**
     * 
     *                 Cannot specify a urls in UrlData and in template fields simultaneously.
     *               
     * 
     */
    CANNOT_SET_WITH_URL_DATA("CANNOT_SET_WITH_URL_DATA"),

    /**
     * 
     *                 This operator cannot be used with a subclass of Ad.
     *               
     * 
     */
    CANNOT_USE_AD_SUBCLASS_FOR_OPERATOR("CANNOT_USE_AD_SUBCLASS_FOR_OPERATOR"),

    /**
     * 
     *                 Customer is not approved for mobile ads.
     *               
     * 
     */
    CUSTOMER_NOT_APPROVED_MOBILEADS("CUSTOMER_NOT_APPROVED_MOBILEADS"),

    /**
     * 
     *                 Customer is not approved for 3PAS richmedia ads.
     *               
     * 
     */
    CUSTOMER_NOT_APPROVED_THIRDPARTY_ADS("CUSTOMER_NOT_APPROVED_THIRDPARTY_ADS"),

    /**
     * 
     *                 Customer is not approved for 3PAS redirect richmedia (Ad Exchange) ads.
     *               
     * 
     */
    CUSTOMER_NOT_APPROVED_THIRDPARTY_REDIRECT_ADS("CUSTOMER_NOT_APPROVED_THIRDPARTY_REDIRECT_ADS"),

    /**
     * 
     *                 Not an eligible customer
     *               
     * 
     */
    CUSTOMER_NOT_ELIGIBLE("CUSTOMER_NOT_ELIGIBLE"),

    /**
     * 
     *                 Customer is not eligible for updating beacon url
     *               
     * 
     */
    CUSTOMER_NOT_ELIGIBLE_FOR_UPDATING_BEACON_URL("CUSTOMER_NOT_ELIGIBLE_FOR_UPDATING_BEACON_URL"),

    /**
     * 
     *                 There already exists an ad with the same dimensions in the union.
     *               
     * 
     */
    DIMENSION_ALREADY_IN_UNION("DIMENSION_ALREADY_IN_UNION"),

    /**
     * 
     *                 Ad's dimension must be set before setting union dimension.
     *               
     * 
     */
    DIMENSION_MUST_BE_SET("DIMENSION_MUST_BE_SET"),

    /**
     * 
     *                 Ad's dimension must be included in the union dimensions.
     *               
     * 
     */
    DIMENSION_NOT_IN_UNION("DIMENSION_NOT_IN_UNION"),

    /**
     * 
     *                 Display Url cannot be specified (applies to Ad Exchange Ads)
     *               
     * 
     */
    DISPLAY_URL_CANNOT_BE_SPECIFIED("DISPLAY_URL_CANNOT_BE_SPECIFIED"),

    /**
     * 
     *                 Telephone number contains invalid characters or invalid format.
     *                 Please re-enter your number using digits (0-9), dashes (-), and parentheses only.
     *               
     * 
     */
    DOMESTIC_PHONE_NUMBER_FORMAT("DOMESTIC_PHONE_NUMBER_FORMAT"),

    /**
     * 
     *                 Emergency telephone numbers are not allowed.
     *                 Please enter a valid domestic phone number to connect customers to your business.
     *               
     * 
     */
    EMERGENCY_PHONE_NUMBER("EMERGENCY_PHONE_NUMBER"),

    /**
     * 
     *                 A required field was not specified or is an empty string.
     *               
     * 
     */
    EMPTY_FIELD("EMPTY_FIELD"),

    /**
     * 
     *                 A feed attribute referenced in an ad customizer tag is not in the ad customizer mapping for
     *                 the feed.
     *               
     * 
     */
    FEED_ATTRIBUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID("FEED_ATTRIBUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID"),

    /**
     * 
     *                 The ad customizer field mapping for the feed attribute does not match the expected field
     *                 type.
     *               
     * 
     */
    FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH("FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH"),

    /**
     * 
     *                 The use of ad customizer tags in the ad text is disallowed. Details in trigger.
     *               
     * 
     */
    ILLEGAL_AD_CUSTOMIZER_TAG_USE("ILLEGAL_AD_CUSTOMIZER_TAG_USE"),

    /**
     * 
     *                 Tags of the form {PH_x}, where x is a number, are disallowed in ad text.
     *               
     * 
     */
    ILLEGAL_TAG_USE("ILLEGAL_TAG_USE"),

    /**
     * 
     *                 The dimensions of the ad are specified or derived in multiple ways and are not consistent.
     *               
     * 
     */
    INCONSISTENT_DIMENSIONS("INCONSISTENT_DIMENSIONS"),

    /**
     * 
     *                 The status cannot differ among template ads of the same union.
     *               
     * 
     */
    INCONSISTENT_STATUS_IN_TEMPLATE_UNION("INCONSISTENT_STATUS_IN_TEMPLATE_UNION"),

    /**
     * 
     *                 The length of the string is not valid.
     *               
     * 
     */
    INCORRECT_LENGTH("INCORRECT_LENGTH"),

    /**
     * 
     *                 The ad is ineligible for upgrade.
     *               
     * 
     */
    INELIGIBLE_FOR_UPGRADE("INELIGIBLE_FOR_UPGRADE"),

    /**
     * 
     *                 User cannot create mobile ad for countries targeted in specified campaign.
     *               
     * 
     */
    INVALID_AD_ADDRESS_CAMPAIGN_TARGET("INVALID_AD_ADDRESS_CAMPAIGN_TARGET"),

    /**
     * 
     *                 Invalid Ad type. A specific type of Ad is required.
     *               
     * 
     */
    INVALID_AD_TYPE("INVALID_AD_TYPE"),

    /**
     * 
     *                 Headline, description or phone cannot be present when creating mobile image ad.
     *               
     * 
     */
    INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE("INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE"),

    /**
     * 
     *                 Image cannot be present when creating mobile text ad.
     *               
     * 
     */
    INVALID_ATTRIBUTES_FOR_MOBILE_TEXT("INVALID_ATTRIBUTES_FOR_MOBILE_TEXT"),

    /**
     * 
     *                 Invalid call to action text.
     *               
     * 
     */
    INVALID_CALL_TO_ACTION_TEXT("INVALID_CALL_TO_ACTION_TEXT"),

    /**
     * 
     *                 Invalid character in URL.
     *               
     * 
     */
    INVALID_CHARACTER_FOR_URL("INVALID_CHARACTER_FOR_URL"),

    /**
     * 
     *                 Creative's country code is not valid.
     *               
     * 
     */
    INVALID_COUNTRY_CODE("INVALID_COUNTRY_CODE"),

    /**
     * 
     *                 Invalid use of Dynamic Search Ads tags ({lpurl} etc.)
     *               
     * 
     */
    INVALID_DSA_URL_TAG("INVALID_DSA_URL_TAG"),

    /**
     * 
     *                 Invalid use of Expanded Dynamic Search Ads tags ({lpurl} etc.)
     *               
     * 
     */
    INVALID_EXPANDED_DYNAMIC_SEARCH_AD_TAG("INVALID_EXPANDED_DYNAMIC_SEARCH_AD_TAG"),

    /**
     * 
     *                 An input error whose real reason was not properly mapped (should not happen).
     *               
     * 
     */
    INVALID_INPUT("INVALID_INPUT"),

    /**
     * 
     *                 An invalid markup language was entered.
     *               
     * 
     */
    INVALID_MARKUP_LANGUAGE("INVALID_MARKUP_LANGUAGE"),

    /**
     * 
     *                 An invalid mobile carrier was entered.
     *               
     * 
     */
    INVALID_MOBILE_CARRIER("INVALID_MOBILE_CARRIER"),

    /**
     * 
     *                 Specified mobile carriers target a country not targeted by the campaign.
     *               
     * 
     */
    INVALID_MOBILE_CARRIER_TARGET("INVALID_MOBILE_CARRIER_TARGET"),

    /**
     * 
     *                 Wrong number of elements for given element type
     *               
     * 
     */
    INVALID_NUMBER_OF_ELEMENTS("INVALID_NUMBER_OF_ELEMENTS"),

    /**
     * 
     *                 The format of the telephone number is incorrect.
     *                 Please re-enter the number using the correct format.
     *               
     * 
     */
    INVALID_PHONE_NUMBER_FORMAT("INVALID_PHONE_NUMBER_FORMAT"),

    /**
     * 
     *                 The certified vendor format id is incorrect.
     *               
     * 
     */
    INVALID_RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID("INVALID_RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID"),

    /**
     * 
     *                 The template ad data contains validation errors.
     *               
     * 
     */
    INVALID_TEMPLATE_DATA("INVALID_TEMPLATE_DATA"),

    /**
     * 
     *                 The template field doesn't have have the correct type.
     *               
     * 
     */
    INVALID_TEMPLATE_ELEMENT_FIELD_TYPE("INVALID_TEMPLATE_ELEMENT_FIELD_TYPE"),

    /**
     * 
     *                 Invalid template id.
     *               
     * 
     */
    INVALID_TEMPLATE_ID("INVALID_TEMPLATE_ID"),

    /**
     * 
     *                 After substituting replacement strings, the line is too wide.
     *               
     * 
     */
    LINE_TOO_WIDE("LINE_TOO_WIDE"),

    /**
     * 
     *                 The feed referenced must have ad customizer mapping to be used in a customizer tag.
     *               
     * 
     */
    MISSING_AD_CUSTOMIZER_MAPPING("MISSING_AD_CUSTOMIZER_MAPPING"),

    /**
     * 
     *                 Missing address component in template element address field.
     *               
     * 
     */
    MISSING_ADDRESS_COMPONENT("MISSING_ADDRESS_COMPONENT"),

    /**
     * 
     *                 An ad name must be entered.
     *               
     * 
     */
    MISSING_ADVERTISEMENT_NAME("MISSING_ADVERTISEMENT_NAME"),

    /**
     * 
     *                 Business name must be entered.
     *               
     * 
     */
    MISSING_BUSINESS_NAME("MISSING_BUSINESS_NAME"),

    /**
     * 
     *                 Description (line 2) must be entered.
     *               
     * 
     */
    @XmlEnumValue("MISSING_DESCRIPTION1")
    MISSING_DESCRIPTION_1("MISSING_DESCRIPTION1"),

    /**
     * 
     *                 Description (line 3) must be entered.
     *               
     * 
     */
    @XmlEnumValue("MISSING_DESCRIPTION2")
    MISSING_DESCRIPTION_2("MISSING_DESCRIPTION2"),

    /**
     * 
     *                 The destination url must contain at least one tag (e.g. {lpurl})
     *               
     * 
     */
    MISSING_DESTINATION_URL_TAG("MISSING_DESTINATION_URL_TAG"),

    /**
     * 
     *                 The tracking url template of ExpandedDynamicSearchAd must contain at least one tag.
     *                 (e.g. {lpurl})
     *               
     * 
     */
    MISSING_LANDING_PAGE_URL_TAG("MISSING_LANDING_PAGE_URL_TAG"),

    /**
     * 
     *                 A valid dimension must be specified for this ad.
     *               
     * 
     */
    MISSING_DIMENSION("MISSING_DIMENSION"),

    /**
     * 
     *                 A display URL must be entered.
     *               
     * 
     */
    MISSING_DISPLAY_URL("MISSING_DISPLAY_URL"),

    /**
     * 
     *                 Headline must be entered.
     *               
     * 
     */
    MISSING_HEADLINE("MISSING_HEADLINE"),

    /**
     * 
     *                 A height must be entered.
     *               
     * 
     */
    MISSING_HEIGHT("MISSING_HEIGHT"),

    /**
     * 
     *                 An image must be entered.
     *               
     * 
     */
    MISSING_IMAGE("MISSING_IMAGE"),

    /**
     * 
     *                 Marketing image or product videos are required.
     *               
     * 
     */
    MISSING_MARKETING_IMAGE_OR_PRODUCT_VIDEOS("MISSING_MARKETING_IMAGE_OR_PRODUCT_VIDEOS"),

    /**
     * 
     *                 The markup language in which your site is written must be entered.
     *               
     * 
     */
    MISSING_MARKUP_LANGUAGES("MISSING_MARKUP_LANGUAGES"),

    /**
     * 
     *                 A mobile carrier must be entered.
     *               
     * 
     */
    MISSING_MOBILE_CARRIER("MISSING_MOBILE_CARRIER"),

    /**
     * 
     *                 Phone number must be entered.
     *               
     * 
     */
    MISSING_PHONE("MISSING_PHONE"),

    /**
     * 
     *                 Missing required template fields
     *               
     * 
     */
    MISSING_REQUIRED_TEMPLATE_FIELDS("MISSING_REQUIRED_TEMPLATE_FIELDS"),

    /**
     * 
     *                 Missing a required field value
     *               
     * 
     */
    MISSING_TEMPLATE_FIELD_VALUE("MISSING_TEMPLATE_FIELD_VALUE"),

    /**
     * 
     *                 The ad must have text.
     *               
     * 
     */
    MISSING_TEXT("MISSING_TEXT"),

    /**
     * 
     *                 A visible URL must be entered.
     *               
     * 
     */
    MISSING_VISIBLE_URL("MISSING_VISIBLE_URL"),

    /**
     * 
     *                 A width must be entered.
     *               
     * 
     */
    MISSING_WIDTH("MISSING_WIDTH"),

    /**
     * 
     *                 Only 1 feed can be used as the source of ad customizer substitutions in a single ad.
     *               
     * 
     */
    MULTIPLE_DISTINCT_FEEDS_UNSUPPORTED("MULTIPLE_DISTINCT_FEEDS_UNSUPPORTED"),

    /**
     * 
     *                 TempAdUnionId must be use when adding template ads.
     *               
     * 
     */
    MUST_USE_TEMP_AD_UNION_ID_ON_ADD("MUST_USE_TEMP_AD_UNION_ID_ON_ADD"),

    /**
     * 
     *                 The string has too many characters.
     *               
     * 
     */
    TOO_LONG("TOO_LONG"),

    /**
     * 
     *                 The string has too few characters.
     *               
     * 
     */
    TOO_SHORT("TOO_SHORT"),

    /**
     * 
     *                 Ad union dimensions cannot change for saved ads.
     *               
     * 
     */
    UNION_DIMENSIONS_CANNOT_CHANGE("UNION_DIMENSIONS_CANNOT_CHANGE"),

    /**
     * 
     *                 Address component is not {country, lat, lng}.
     *               
     * 
     */
    UNKNOWN_ADDRESS_COMPONENT("UNKNOWN_ADDRESS_COMPONENT"),

    /**
     * 
     *                 Unknown unique field name
     *               
     * 
     */
    UNKNOWN_FIELD_NAME("UNKNOWN_FIELD_NAME"),

    /**
     * 
     *                 Unknown unique name (template element type specifier)
     *               
     * 
     */
    UNKNOWN_UNIQUE_NAME("UNKNOWN_UNIQUE_NAME"),

    /**
     * 
     *                 Unsupported ad dimension
     *               
     * 
     */
    UNSUPPORTED_DIMENSIONS("UNSUPPORTED_DIMENSIONS"),

    /**
     * 
     *                 URL starts with an invalid scheme.
     *               
     * 
     */
    URL_INVALID_SCHEME("URL_INVALID_SCHEME"),

    /**
     * 
     *                 URL ends with an invalid top-level domain name.
     *               
     * 
     */
    URL_INVALID_TOP_LEVEL_DOMAIN("URL_INVALID_TOP_LEVEL_DOMAIN"),

    /**
     * 
     *                 URL contains illegal characters.
     *               
     * 
     */
    URL_MALFORMED("URL_MALFORMED"),

    /**
     * 
     *                 URL must contain a host name.
     *               
     * 
     */
    URL_NO_HOST("URL_NO_HOST"),

    /**
     * 
     *                 URL not equivalent during upgrade.
     *               
     * 
     */
    URL_NOT_EQUIVALENT("URL_NOT_EQUIVALENT"),

    /**
     * 
     *                 URL host name too long to be stored as visible URL (applies to Ad Exchange ads)
     *               
     * 
     */
    URL_HOST_NAME_TOO_LONG("URL_HOST_NAME_TOO_LONG"),

    /**
     * 
     *                 URL must start with a scheme.
     *               
     * 
     */
    URL_NO_SCHEME("URL_NO_SCHEME"),

    /**
     * 
     *                 URL should end in a valid domain extension, such as .com or .net.
     *               
     * 
     */
    URL_NO_TOP_LEVEL_DOMAIN("URL_NO_TOP_LEVEL_DOMAIN"),

    /**
     * 
     *                 URL must not end with a path.
     *               
     * 
     */
    URL_PATH_NOT_ALLOWED("URL_PATH_NOT_ALLOWED"),

    /**
     * 
     *                 URL must not specify a port.
     *               
     * 
     */
    URL_PORT_NOT_ALLOWED("URL_PORT_NOT_ALLOWED"),

    /**
     * 
     *                 URL must not contain a query.
     *               
     * 
     */
    URL_QUERY_NOT_ALLOWED("URL_QUERY_NOT_ALLOWED"),

    /**
     * 
     *                 A url scheme is not allowed in front of tag in dest url (e.g. http://{lpurl})
     *               
     * 
     */
    URL_SCHEME_BEFORE_DSA_TAG("URL_SCHEME_BEFORE_DSA_TAG"),

    /**
     * 
     *                 A url scheme is not allowed in front of tag in tracking url template (e.g. http://{lpurl})
     *               
     * 
     */
    URL_SCHEME_BEFORE_EXPANDED_DYNAMIC_SEARCH_AD_TAG("URL_SCHEME_BEFORE_EXPANDED_DYNAMIC_SEARCH_AD_TAG"),

    /**
     * 
     *                 The user does not have permissions to create a template ad for the given
     *                 template.
     *               
     * 
     */
    USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE("USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE"),

    /**
     * 
     *                 Expandable setting is inconsistent/wrong. For example, an AdX ad is
     *                 invalid if it has a expandable vendor format but no expanding directions
     *                 specified, or expanding directions is specified, but the vendor format
     *                 is not expandable.
     *               
     * 
     */
    INCONSISTENT_EXPANDABLE_SETTINGS("INCONSISTENT_EXPANDABLE_SETTINGS"),

    /**
     * 
     *                 Format is invalid
     *               
     * 
     */
    INVALID_FORMAT("INVALID_FORMAT"),

    /**
     * 
     *                 The text of this field did not match a pattern of allowed values.
     *               
     * 
     */
    INVALID_FIELD_TEXT("INVALID_FIELD_TEXT"),

    /**
     * 
     *                 Template element is mising
     *               
     * 
     */
    ELEMENT_NOT_PRESENT("ELEMENT_NOT_PRESENT"),

    /**
     * 
     *                 Error occurred during image processing
     *               
     * 
     */
    IMAGE_ERROR("IMAGE_ERROR"),

    /**
     * 
     *                 The value is not within the valid range
     *               
     * 
     */
    VALUE_NOT_IN_RANGE("VALUE_NOT_IN_RANGE"),

    /**
     * 
     *                 Template element field is not present
     *               
     * 
     */
    FIELD_NOT_PRESENT("FIELD_NOT_PRESENT"),

    /**
     * 
     *                 Address is incomplete
     *               
     * 
     */
    ADDRESS_NOT_COMPLETE("ADDRESS_NOT_COMPLETE"),

    /**
     * 
     *                 Invalid address
     *               
     * 
     */
    ADDRESS_INVALID("ADDRESS_INVALID"),

    /**
     * 
     *                 Error retrieving specified video
     *               
     * 
     */
    VIDEO_RETRIEVAL_ERROR("VIDEO_RETRIEVAL_ERROR"),

    /**
     * 
     *                 Error processing audio
     *               
     * 
     */
    AUDIO_ERROR("AUDIO_ERROR"),

    /**
     * 
     *                 Display URL is incorrect for YouTube PYV ads
     *               
     * 
     */
    INVALID_YOUTUBE_DISPLAY_URL("INVALID_YOUTUBE_DISPLAY_URL"),

    /**
     * 
     *                 Too many product Images in GmailAd
     *               
     * 
     */
    TOO_MANY_PRODUCT_IMAGES("TOO_MANY_PRODUCT_IMAGES"),

    /**
     * 
     *                 Too many product Videos in GmailAd
     *               
     * 
     */
    TOO_MANY_PRODUCT_VIDEOS("TOO_MANY_PRODUCT_VIDEOS"),

    /**
     * 
     *                 The device preference is not compatible with the ad type
     *               
     * 
     */
    INCOMPATIBLE_AD_TYPE_AND_DEVICE_PREFERENCE("INCOMPATIBLE_AD_TYPE_AND_DEVICE_PREFERENCE"),

    /**
     * 
     *                 Call tracking is not supported for specified country.
     *               
     * 
     */
    CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY("CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY"),

    /**
     * 
     *                 Carrier specific short number is not allowed.
     *               
     * 
     */
    CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED("CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED"),

    /**
     * 
     *                 Specified phone number type is disallowed.
     *               
     * 
     */
    DISALLOWED_NUMBER_TYPE("DISALLOWED_NUMBER_TYPE"),

    /**
     * 
     *                 Phone number not supported for country.
     *               
     * 
     */
    PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY("PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY"),

    /**
     * 
     *                 Phone number not supported with call tracking enabled for country.
     *               
     * 
     */
    PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY("PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY"),

    /**
     * 
     *                 Premium rate phone number is not allowed.
     *               
     * 
     */
    PREMIUM_RATE_NUMBER_NOT_ALLOWED("PREMIUM_RATE_NUMBER_NOT_ALLOWED"),

    /**
     * 
     *                 Vanity phone number is not allowed.
     *               
     * 
     */
    VANITY_PHONE_NUMBER_NOT_ALLOWED("VANITY_PHONE_NUMBER_NOT_ALLOWED"),

    /**
     * 
     *                 Invalid call conversion type id.
     *               
     * 
     */
    INVALID_CALL_CONVERSION_TYPE_ID("INVALID_CALL_CONVERSION_TYPE_ID"),
    CANNOT_DISABLE_CALL_CONVERSION_AND_SET_CONVERSION_TYPE_ID("CANNOT_DISABLE_CALL_CONVERSION_AND_SET_CONVERSION_TYPE_ID"),

    /**
     * 
     *                 Cannot set path2 without path1.
     *               
     * 
     */
    @XmlEnumValue("CANNOT_SET_PATH2_WITHOUT_PATH1")
    CANNOT_SET_PATH_2_WITHOUT_PATH_1("CANNOT_SET_PATH2_WITHOUT_PATH1"),

    /**
     * 
     *                 Missing domain name in campaign setting when adding expanded dynamic search ad.
     *               
     * 
     */
    MISSING_DYNAMIC_SEARCH_ADS_SETTING_DOMAIN_NAME("MISSING_DYNAMIC_SEARCH_ADS_SETTING_DOMAIN_NAME"),

    /**
     * 
     *                 An unexpected or unknown error occurred.
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    AdErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdErrorReason fromValue(String v) {
        for (AdErrorReason c: AdErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
