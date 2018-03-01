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

/**
 * AdErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class AdErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_CUSTOMIZERS_NOT_SUPPORTED_FOR_AD_TYPE = "AD_CUSTOMIZERS_NOT_SUPPORTED_FOR_AD_TYPE";
    public static final java.lang.String _APPROXIMATELY_TOO_LONG = "APPROXIMATELY_TOO_LONG";
    public static final java.lang.String _APPROXIMATELY_TOO_SHORT = "APPROXIMATELY_TOO_SHORT";
    public static final java.lang.String _BAD_SNIPPET = "BAD_SNIPPET";
    public static final java.lang.String _CANNOT_MODIFY_AD = "CANNOT_MODIFY_AD";
    public static final java.lang.String _CANNOT_SET_BUSINESS_NAME_IF_URL_SET = "CANNOT_SET_BUSINESS_NAME_IF_URL_SET";
    public static final java.lang.String _CANNOT_SET_FIELD = "CANNOT_SET_FIELD";
    public static final java.lang.String _CANNOT_SET_FIELD_WITH_ORIGIN_AD_ID_SET = "CANNOT_SET_FIELD_WITH_ORIGIN_AD_ID_SET";
    public static final java.lang.String _CANNOT_SET_FIELD_WITH_AD_ID_SET_FOR_SHARING = "CANNOT_SET_FIELD_WITH_AD_ID_SET_FOR_SHARING";
    public static final java.lang.String _CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE = "CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE";
    public static final java.lang.String _CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE_FORMAT_SETTING = "CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE_FORMAT_SETTING";
    public static final java.lang.String _CANNOT_SET_URL = "CANNOT_SET_URL";
    public static final java.lang.String _CANNOT_SET_WITHOUT_FINAL_URLS = "CANNOT_SET_WITHOUT_FINAL_URLS";
    public static final java.lang.String _CANNOT_SET_WITH_FINAL_URLS = "CANNOT_SET_WITH_FINAL_URLS";
    public static final java.lang.String _CANNOT_SET_WITH_TRACKING_URL_TEMPLATE = "CANNOT_SET_WITH_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _CANNOT_SET_WITH_URL_DATA = "CANNOT_SET_WITH_URL_DATA";
    public static final java.lang.String _CANNOT_USE_AD_SUBCLASS_FOR_OPERATOR = "CANNOT_USE_AD_SUBCLASS_FOR_OPERATOR";
    public static final java.lang.String _CUSTOMER_NOT_APPROVED_MOBILEADS = "CUSTOMER_NOT_APPROVED_MOBILEADS";
    public static final java.lang.String _CUSTOMER_NOT_APPROVED_THIRDPARTY_ADS = "CUSTOMER_NOT_APPROVED_THIRDPARTY_ADS";
    public static final java.lang.String _CUSTOMER_NOT_APPROVED_THIRDPARTY_REDIRECT_ADS = "CUSTOMER_NOT_APPROVED_THIRDPARTY_REDIRECT_ADS";
    public static final java.lang.String _CUSTOMER_NOT_ELIGIBLE = "CUSTOMER_NOT_ELIGIBLE";
    public static final java.lang.String _CUSTOMER_NOT_ELIGIBLE_FOR_UPDATING_BEACON_URL = "CUSTOMER_NOT_ELIGIBLE_FOR_UPDATING_BEACON_URL";
    public static final java.lang.String _DIMENSION_ALREADY_IN_UNION = "DIMENSION_ALREADY_IN_UNION";
    public static final java.lang.String _DIMENSION_MUST_BE_SET = "DIMENSION_MUST_BE_SET";
    public static final java.lang.String _DIMENSION_NOT_IN_UNION = "DIMENSION_NOT_IN_UNION";
    public static final java.lang.String _DISPLAY_URL_CANNOT_BE_SPECIFIED = "DISPLAY_URL_CANNOT_BE_SPECIFIED";
    public static final java.lang.String _DOMESTIC_PHONE_NUMBER_FORMAT = "DOMESTIC_PHONE_NUMBER_FORMAT";
    public static final java.lang.String _EMERGENCY_PHONE_NUMBER = "EMERGENCY_PHONE_NUMBER";
    public static final java.lang.String _EMPTY_FIELD = "EMPTY_FIELD";
    public static final java.lang.String _FEED_ATTRIBUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID = "FEED_ATTRIBUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID";
    public static final java.lang.String _FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH = "FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH";
    public static final java.lang.String _ILLEGAL_AD_CUSTOMIZER_TAG_USE = "ILLEGAL_AD_CUSTOMIZER_TAG_USE";
    public static final java.lang.String _ILLEGAL_TAG_USE = "ILLEGAL_TAG_USE";
    public static final java.lang.String _INCONSISTENT_DIMENSIONS = "INCONSISTENT_DIMENSIONS";
    public static final java.lang.String _INCONSISTENT_STATUS_IN_TEMPLATE_UNION = "INCONSISTENT_STATUS_IN_TEMPLATE_UNION";
    public static final java.lang.String _INCORRECT_LENGTH = "INCORRECT_LENGTH";
    public static final java.lang.String _INELIGIBLE_FOR_UPGRADE = "INELIGIBLE_FOR_UPGRADE";
    public static final java.lang.String _INVALID_AD_ADDRESS_CAMPAIGN_TARGET = "INVALID_AD_ADDRESS_CAMPAIGN_TARGET";
    public static final java.lang.String _INVALID_AD_TYPE = "INVALID_AD_TYPE";
    public static final java.lang.String _INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE = "INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE";
    public static final java.lang.String _INVALID_ATTRIBUTES_FOR_MOBILE_TEXT = "INVALID_ATTRIBUTES_FOR_MOBILE_TEXT";
    public static final java.lang.String _INVALID_CALL_TO_ACTION_TEXT = "INVALID_CALL_TO_ACTION_TEXT";
    public static final java.lang.String _INVALID_CHARACTER_FOR_URL = "INVALID_CHARACTER_FOR_URL";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_DSA_URL_TAG = "INVALID_DSA_URL_TAG";
    public static final java.lang.String _INVALID_EXPANDED_DYNAMIC_SEARCH_AD_TAG = "INVALID_EXPANDED_DYNAMIC_SEARCH_AD_TAG";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _INVALID_MARKUP_LANGUAGE = "INVALID_MARKUP_LANGUAGE";
    public static final java.lang.String _INVALID_MOBILE_CARRIER = "INVALID_MOBILE_CARRIER";
    public static final java.lang.String _INVALID_MOBILE_CARRIER_TARGET = "INVALID_MOBILE_CARRIER_TARGET";
    public static final java.lang.String _INVALID_NUMBER_OF_ELEMENTS = "INVALID_NUMBER_OF_ELEMENTS";
    public static final java.lang.String _INVALID_PHONE_NUMBER_FORMAT = "INVALID_PHONE_NUMBER_FORMAT";
    public static final java.lang.String _INVALID_RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID = "INVALID_RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID";
    public static final java.lang.String _INVALID_TEMPLATE_DATA = "INVALID_TEMPLATE_DATA";
    public static final java.lang.String _INVALID_TEMPLATE_ELEMENT_FIELD_TYPE = "INVALID_TEMPLATE_ELEMENT_FIELD_TYPE";
    public static final java.lang.String _INVALID_TEMPLATE_ID = "INVALID_TEMPLATE_ID";
    public static final java.lang.String _LINE_TOO_WIDE = "LINE_TOO_WIDE";
    public static final java.lang.String _MISSING_AD_CUSTOMIZER_MAPPING = "MISSING_AD_CUSTOMIZER_MAPPING";
    public static final java.lang.String _MISSING_ADDRESS_COMPONENT = "MISSING_ADDRESS_COMPONENT";
    public static final java.lang.String _MISSING_ADVERTISEMENT_NAME = "MISSING_ADVERTISEMENT_NAME";
    public static final java.lang.String _MISSING_BUSINESS_NAME = "MISSING_BUSINESS_NAME";
    public static final java.lang.String _MISSING_DESCRIPTION1 = "MISSING_DESCRIPTION1";
    public static final java.lang.String _MISSING_DESCRIPTION2 = "MISSING_DESCRIPTION2";
    public static final java.lang.String _MISSING_DESTINATION_URL_TAG = "MISSING_DESTINATION_URL_TAG";
    public static final java.lang.String _MISSING_LANDING_PAGE_URL_TAG = "MISSING_LANDING_PAGE_URL_TAG";
    public static final java.lang.String _MISSING_DIMENSION = "MISSING_DIMENSION";
    public static final java.lang.String _MISSING_DISPLAY_URL = "MISSING_DISPLAY_URL";
    public static final java.lang.String _MISSING_HEADLINE = "MISSING_HEADLINE";
    public static final java.lang.String _MISSING_HEIGHT = "MISSING_HEIGHT";
    public static final java.lang.String _MISSING_IMAGE = "MISSING_IMAGE";
    public static final java.lang.String _MISSING_MARKETING_IMAGE_OR_PRODUCT_VIDEOS = "MISSING_MARKETING_IMAGE_OR_PRODUCT_VIDEOS";
    public static final java.lang.String _MISSING_MARKUP_LANGUAGES = "MISSING_MARKUP_LANGUAGES";
    public static final java.lang.String _MISSING_MOBILE_CARRIER = "MISSING_MOBILE_CARRIER";
    public static final java.lang.String _MISSING_PHONE = "MISSING_PHONE";
    public static final java.lang.String _MISSING_REQUIRED_TEMPLATE_FIELDS = "MISSING_REQUIRED_TEMPLATE_FIELDS";
    public static final java.lang.String _MISSING_TEMPLATE_FIELD_VALUE = "MISSING_TEMPLATE_FIELD_VALUE";
    public static final java.lang.String _MISSING_TEXT = "MISSING_TEXT";
    public static final java.lang.String _MISSING_VISIBLE_URL = "MISSING_VISIBLE_URL";
    public static final java.lang.String _MISSING_WIDTH = "MISSING_WIDTH";
    public static final java.lang.String _MULTIPLE_DISTINCT_FEEDS_UNSUPPORTED = "MULTIPLE_DISTINCT_FEEDS_UNSUPPORTED";
    public static final java.lang.String _MUST_USE_TEMP_AD_UNION_ID_ON_ADD = "MUST_USE_TEMP_AD_UNION_ID_ON_ADD";
    public static final java.lang.String _TOO_LONG = "TOO_LONG";
    public static final java.lang.String _TOO_SHORT = "TOO_SHORT";
    public static final java.lang.String _UNION_DIMENSIONS_CANNOT_CHANGE = "UNION_DIMENSIONS_CANNOT_CHANGE";
    public static final java.lang.String _UNKNOWN_ADDRESS_COMPONENT = "UNKNOWN_ADDRESS_COMPONENT";
    public static final java.lang.String _UNKNOWN_FIELD_NAME = "UNKNOWN_FIELD_NAME";
    public static final java.lang.String _UNKNOWN_UNIQUE_NAME = "UNKNOWN_UNIQUE_NAME";
    public static final java.lang.String _UNSUPPORTED_DIMENSIONS = "UNSUPPORTED_DIMENSIONS";
    public static final java.lang.String _URL_INVALID_SCHEME = "URL_INVALID_SCHEME";
    public static final java.lang.String _URL_INVALID_TOP_LEVEL_DOMAIN = "URL_INVALID_TOP_LEVEL_DOMAIN";
    public static final java.lang.String _URL_MALFORMED = "URL_MALFORMED";
    public static final java.lang.String _URL_NO_HOST = "URL_NO_HOST";
    public static final java.lang.String _URL_NOT_EQUIVALENT = "URL_NOT_EQUIVALENT";
    public static final java.lang.String _URL_HOST_NAME_TOO_LONG = "URL_HOST_NAME_TOO_LONG";
    public static final java.lang.String _URL_NO_SCHEME = "URL_NO_SCHEME";
    public static final java.lang.String _URL_NO_TOP_LEVEL_DOMAIN = "URL_NO_TOP_LEVEL_DOMAIN";
    public static final java.lang.String _URL_PATH_NOT_ALLOWED = "URL_PATH_NOT_ALLOWED";
    public static final java.lang.String _URL_PORT_NOT_ALLOWED = "URL_PORT_NOT_ALLOWED";
    public static final java.lang.String _URL_QUERY_NOT_ALLOWED = "URL_QUERY_NOT_ALLOWED";
    public static final java.lang.String _URL_SCHEME_BEFORE_DSA_TAG = "URL_SCHEME_BEFORE_DSA_TAG";
    public static final java.lang.String _URL_SCHEME_BEFORE_EXPANDED_DYNAMIC_SEARCH_AD_TAG = "URL_SCHEME_BEFORE_EXPANDED_DYNAMIC_SEARCH_AD_TAG";
    public static final java.lang.String _USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE = "USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE";
    public static final java.lang.String _INCONSISTENT_EXPANDABLE_SETTINGS = "INCONSISTENT_EXPANDABLE_SETTINGS";
    public static final java.lang.String _INVALID_FORMAT = "INVALID_FORMAT";
    public static final java.lang.String _INVALID_FIELD_TEXT = "INVALID_FIELD_TEXT";
    public static final java.lang.String _ELEMENT_NOT_PRESENT = "ELEMENT_NOT_PRESENT";
    public static final java.lang.String _IMAGE_ERROR = "IMAGE_ERROR";
    public static final java.lang.String _VALUE_NOT_IN_RANGE = "VALUE_NOT_IN_RANGE";
    public static final java.lang.String _FIELD_NOT_PRESENT = "FIELD_NOT_PRESENT";
    public static final java.lang.String _ADDRESS_NOT_COMPLETE = "ADDRESS_NOT_COMPLETE";
    public static final java.lang.String _ADDRESS_INVALID = "ADDRESS_INVALID";
    public static final java.lang.String _VIDEO_RETRIEVAL_ERROR = "VIDEO_RETRIEVAL_ERROR";
    public static final java.lang.String _AUDIO_ERROR = "AUDIO_ERROR";
    public static final java.lang.String _INVALID_YOUTUBE_DISPLAY_URL = "INVALID_YOUTUBE_DISPLAY_URL";
    public static final java.lang.String _TOO_MANY_PRODUCT_IMAGES = "TOO_MANY_PRODUCT_IMAGES";
    public static final java.lang.String _TOO_MANY_PRODUCT_VIDEOS = "TOO_MANY_PRODUCT_VIDEOS";
    public static final java.lang.String _INCOMPATIBLE_AD_TYPE_AND_DEVICE_PREFERENCE = "INCOMPATIBLE_AD_TYPE_AND_DEVICE_PREFERENCE";
    public static final java.lang.String _CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY = "CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY";
    public static final java.lang.String _CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED = "CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _DISALLOWED_NUMBER_TYPE = "DISALLOWED_NUMBER_TYPE";
    public static final java.lang.String _PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = "PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY";
    public static final java.lang.String _PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY = "PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY";
    public static final java.lang.String _PREMIUM_RATE_NUMBER_NOT_ALLOWED = "PREMIUM_RATE_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _VANITY_PHONE_NUMBER_NOT_ALLOWED = "VANITY_PHONE_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _INVALID_CALL_CONVERSION_TYPE_ID = "INVALID_CALL_CONVERSION_TYPE_ID";
    public static final java.lang.String _CANNOT_DISABLE_CALL_CONVERSION_AND_SET_CONVERSION_TYPE_ID = "CANNOT_DISABLE_CALL_CONVERSION_AND_SET_CONVERSION_TYPE_ID";
    public static final java.lang.String _CANNOT_SET_PATH2_WITHOUT_PATH1 = "CANNOT_SET_PATH2_WITHOUT_PATH1";
    public static final java.lang.String _MISSING_DYNAMIC_SEARCH_ADS_SETTING_DOMAIN_NAME = "MISSING_DYNAMIC_SEARCH_ADS_SETTING_DOMAIN_NAME";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdErrorReason AD_CUSTOMIZERS_NOT_SUPPORTED_FOR_AD_TYPE = new AdErrorReason(_AD_CUSTOMIZERS_NOT_SUPPORTED_FOR_AD_TYPE);
    public static final AdErrorReason APPROXIMATELY_TOO_LONG = new AdErrorReason(_APPROXIMATELY_TOO_LONG);
    public static final AdErrorReason APPROXIMATELY_TOO_SHORT = new AdErrorReason(_APPROXIMATELY_TOO_SHORT);
    public static final AdErrorReason BAD_SNIPPET = new AdErrorReason(_BAD_SNIPPET);
    public static final AdErrorReason CANNOT_MODIFY_AD = new AdErrorReason(_CANNOT_MODIFY_AD);
    public static final AdErrorReason CANNOT_SET_BUSINESS_NAME_IF_URL_SET = new AdErrorReason(_CANNOT_SET_BUSINESS_NAME_IF_URL_SET);
    public static final AdErrorReason CANNOT_SET_FIELD = new AdErrorReason(_CANNOT_SET_FIELD);
    public static final AdErrorReason CANNOT_SET_FIELD_WITH_ORIGIN_AD_ID_SET = new AdErrorReason(_CANNOT_SET_FIELD_WITH_ORIGIN_AD_ID_SET);
    public static final AdErrorReason CANNOT_SET_FIELD_WITH_AD_ID_SET_FOR_SHARING = new AdErrorReason(_CANNOT_SET_FIELD_WITH_AD_ID_SET_FOR_SHARING);
    public static final AdErrorReason CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE = new AdErrorReason(_CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE);
    public static final AdErrorReason CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE_FORMAT_SETTING = new AdErrorReason(_CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE_FORMAT_SETTING);
    public static final AdErrorReason CANNOT_SET_URL = new AdErrorReason(_CANNOT_SET_URL);
    public static final AdErrorReason CANNOT_SET_WITHOUT_FINAL_URLS = new AdErrorReason(_CANNOT_SET_WITHOUT_FINAL_URLS);
    public static final AdErrorReason CANNOT_SET_WITH_FINAL_URLS = new AdErrorReason(_CANNOT_SET_WITH_FINAL_URLS);
    public static final AdErrorReason CANNOT_SET_WITH_TRACKING_URL_TEMPLATE = new AdErrorReason(_CANNOT_SET_WITH_TRACKING_URL_TEMPLATE);
    public static final AdErrorReason CANNOT_SET_WITH_URL_DATA = new AdErrorReason(_CANNOT_SET_WITH_URL_DATA);
    public static final AdErrorReason CANNOT_USE_AD_SUBCLASS_FOR_OPERATOR = new AdErrorReason(_CANNOT_USE_AD_SUBCLASS_FOR_OPERATOR);
    public static final AdErrorReason CUSTOMER_NOT_APPROVED_MOBILEADS = new AdErrorReason(_CUSTOMER_NOT_APPROVED_MOBILEADS);
    public static final AdErrorReason CUSTOMER_NOT_APPROVED_THIRDPARTY_ADS = new AdErrorReason(_CUSTOMER_NOT_APPROVED_THIRDPARTY_ADS);
    public static final AdErrorReason CUSTOMER_NOT_APPROVED_THIRDPARTY_REDIRECT_ADS = new AdErrorReason(_CUSTOMER_NOT_APPROVED_THIRDPARTY_REDIRECT_ADS);
    public static final AdErrorReason CUSTOMER_NOT_ELIGIBLE = new AdErrorReason(_CUSTOMER_NOT_ELIGIBLE);
    public static final AdErrorReason CUSTOMER_NOT_ELIGIBLE_FOR_UPDATING_BEACON_URL = new AdErrorReason(_CUSTOMER_NOT_ELIGIBLE_FOR_UPDATING_BEACON_URL);
    public static final AdErrorReason DIMENSION_ALREADY_IN_UNION = new AdErrorReason(_DIMENSION_ALREADY_IN_UNION);
    public static final AdErrorReason DIMENSION_MUST_BE_SET = new AdErrorReason(_DIMENSION_MUST_BE_SET);
    public static final AdErrorReason DIMENSION_NOT_IN_UNION = new AdErrorReason(_DIMENSION_NOT_IN_UNION);
    public static final AdErrorReason DISPLAY_URL_CANNOT_BE_SPECIFIED = new AdErrorReason(_DISPLAY_URL_CANNOT_BE_SPECIFIED);
    public static final AdErrorReason DOMESTIC_PHONE_NUMBER_FORMAT = new AdErrorReason(_DOMESTIC_PHONE_NUMBER_FORMAT);
    public static final AdErrorReason EMERGENCY_PHONE_NUMBER = new AdErrorReason(_EMERGENCY_PHONE_NUMBER);
    public static final AdErrorReason EMPTY_FIELD = new AdErrorReason(_EMPTY_FIELD);
    public static final AdErrorReason FEED_ATTRIBUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID = new AdErrorReason(_FEED_ATTRIBUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID);
    public static final AdErrorReason FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH = new AdErrorReason(_FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH);
    public static final AdErrorReason ILLEGAL_AD_CUSTOMIZER_TAG_USE = new AdErrorReason(_ILLEGAL_AD_CUSTOMIZER_TAG_USE);
    public static final AdErrorReason ILLEGAL_TAG_USE = new AdErrorReason(_ILLEGAL_TAG_USE);
    public static final AdErrorReason INCONSISTENT_DIMENSIONS = new AdErrorReason(_INCONSISTENT_DIMENSIONS);
    public static final AdErrorReason INCONSISTENT_STATUS_IN_TEMPLATE_UNION = new AdErrorReason(_INCONSISTENT_STATUS_IN_TEMPLATE_UNION);
    public static final AdErrorReason INCORRECT_LENGTH = new AdErrorReason(_INCORRECT_LENGTH);
    public static final AdErrorReason INELIGIBLE_FOR_UPGRADE = new AdErrorReason(_INELIGIBLE_FOR_UPGRADE);
    public static final AdErrorReason INVALID_AD_ADDRESS_CAMPAIGN_TARGET = new AdErrorReason(_INVALID_AD_ADDRESS_CAMPAIGN_TARGET);
    public static final AdErrorReason INVALID_AD_TYPE = new AdErrorReason(_INVALID_AD_TYPE);
    public static final AdErrorReason INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE = new AdErrorReason(_INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE);
    public static final AdErrorReason INVALID_ATTRIBUTES_FOR_MOBILE_TEXT = new AdErrorReason(_INVALID_ATTRIBUTES_FOR_MOBILE_TEXT);
    public static final AdErrorReason INVALID_CALL_TO_ACTION_TEXT = new AdErrorReason(_INVALID_CALL_TO_ACTION_TEXT);
    public static final AdErrorReason INVALID_CHARACTER_FOR_URL = new AdErrorReason(_INVALID_CHARACTER_FOR_URL);
    public static final AdErrorReason INVALID_COUNTRY_CODE = new AdErrorReason(_INVALID_COUNTRY_CODE);
    public static final AdErrorReason INVALID_DSA_URL_TAG = new AdErrorReason(_INVALID_DSA_URL_TAG);
    public static final AdErrorReason INVALID_EXPANDED_DYNAMIC_SEARCH_AD_TAG = new AdErrorReason(_INVALID_EXPANDED_DYNAMIC_SEARCH_AD_TAG);
    public static final AdErrorReason INVALID_INPUT = new AdErrorReason(_INVALID_INPUT);
    public static final AdErrorReason INVALID_MARKUP_LANGUAGE = new AdErrorReason(_INVALID_MARKUP_LANGUAGE);
    public static final AdErrorReason INVALID_MOBILE_CARRIER = new AdErrorReason(_INVALID_MOBILE_CARRIER);
    public static final AdErrorReason INVALID_MOBILE_CARRIER_TARGET = new AdErrorReason(_INVALID_MOBILE_CARRIER_TARGET);
    public static final AdErrorReason INVALID_NUMBER_OF_ELEMENTS = new AdErrorReason(_INVALID_NUMBER_OF_ELEMENTS);
    public static final AdErrorReason INVALID_PHONE_NUMBER_FORMAT = new AdErrorReason(_INVALID_PHONE_NUMBER_FORMAT);
    public static final AdErrorReason INVALID_RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID = new AdErrorReason(_INVALID_RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID);
    public static final AdErrorReason INVALID_TEMPLATE_DATA = new AdErrorReason(_INVALID_TEMPLATE_DATA);
    public static final AdErrorReason INVALID_TEMPLATE_ELEMENT_FIELD_TYPE = new AdErrorReason(_INVALID_TEMPLATE_ELEMENT_FIELD_TYPE);
    public static final AdErrorReason INVALID_TEMPLATE_ID = new AdErrorReason(_INVALID_TEMPLATE_ID);
    public static final AdErrorReason LINE_TOO_WIDE = new AdErrorReason(_LINE_TOO_WIDE);
    public static final AdErrorReason MISSING_AD_CUSTOMIZER_MAPPING = new AdErrorReason(_MISSING_AD_CUSTOMIZER_MAPPING);
    public static final AdErrorReason MISSING_ADDRESS_COMPONENT = new AdErrorReason(_MISSING_ADDRESS_COMPONENT);
    public static final AdErrorReason MISSING_ADVERTISEMENT_NAME = new AdErrorReason(_MISSING_ADVERTISEMENT_NAME);
    public static final AdErrorReason MISSING_BUSINESS_NAME = new AdErrorReason(_MISSING_BUSINESS_NAME);
    public static final AdErrorReason MISSING_DESCRIPTION1 = new AdErrorReason(_MISSING_DESCRIPTION1);
    public static final AdErrorReason MISSING_DESCRIPTION2 = new AdErrorReason(_MISSING_DESCRIPTION2);
    public static final AdErrorReason MISSING_DESTINATION_URL_TAG = new AdErrorReason(_MISSING_DESTINATION_URL_TAG);
    public static final AdErrorReason MISSING_LANDING_PAGE_URL_TAG = new AdErrorReason(_MISSING_LANDING_PAGE_URL_TAG);
    public static final AdErrorReason MISSING_DIMENSION = new AdErrorReason(_MISSING_DIMENSION);
    public static final AdErrorReason MISSING_DISPLAY_URL = new AdErrorReason(_MISSING_DISPLAY_URL);
    public static final AdErrorReason MISSING_HEADLINE = new AdErrorReason(_MISSING_HEADLINE);
    public static final AdErrorReason MISSING_HEIGHT = new AdErrorReason(_MISSING_HEIGHT);
    public static final AdErrorReason MISSING_IMAGE = new AdErrorReason(_MISSING_IMAGE);
    public static final AdErrorReason MISSING_MARKETING_IMAGE_OR_PRODUCT_VIDEOS = new AdErrorReason(_MISSING_MARKETING_IMAGE_OR_PRODUCT_VIDEOS);
    public static final AdErrorReason MISSING_MARKUP_LANGUAGES = new AdErrorReason(_MISSING_MARKUP_LANGUAGES);
    public static final AdErrorReason MISSING_MOBILE_CARRIER = new AdErrorReason(_MISSING_MOBILE_CARRIER);
    public static final AdErrorReason MISSING_PHONE = new AdErrorReason(_MISSING_PHONE);
    public static final AdErrorReason MISSING_REQUIRED_TEMPLATE_FIELDS = new AdErrorReason(_MISSING_REQUIRED_TEMPLATE_FIELDS);
    public static final AdErrorReason MISSING_TEMPLATE_FIELD_VALUE = new AdErrorReason(_MISSING_TEMPLATE_FIELD_VALUE);
    public static final AdErrorReason MISSING_TEXT = new AdErrorReason(_MISSING_TEXT);
    public static final AdErrorReason MISSING_VISIBLE_URL = new AdErrorReason(_MISSING_VISIBLE_URL);
    public static final AdErrorReason MISSING_WIDTH = new AdErrorReason(_MISSING_WIDTH);
    public static final AdErrorReason MULTIPLE_DISTINCT_FEEDS_UNSUPPORTED = new AdErrorReason(_MULTIPLE_DISTINCT_FEEDS_UNSUPPORTED);
    public static final AdErrorReason MUST_USE_TEMP_AD_UNION_ID_ON_ADD = new AdErrorReason(_MUST_USE_TEMP_AD_UNION_ID_ON_ADD);
    public static final AdErrorReason TOO_LONG = new AdErrorReason(_TOO_LONG);
    public static final AdErrorReason TOO_SHORT = new AdErrorReason(_TOO_SHORT);
    public static final AdErrorReason UNION_DIMENSIONS_CANNOT_CHANGE = new AdErrorReason(_UNION_DIMENSIONS_CANNOT_CHANGE);
    public static final AdErrorReason UNKNOWN_ADDRESS_COMPONENT = new AdErrorReason(_UNKNOWN_ADDRESS_COMPONENT);
    public static final AdErrorReason UNKNOWN_FIELD_NAME = new AdErrorReason(_UNKNOWN_FIELD_NAME);
    public static final AdErrorReason UNKNOWN_UNIQUE_NAME = new AdErrorReason(_UNKNOWN_UNIQUE_NAME);
    public static final AdErrorReason UNSUPPORTED_DIMENSIONS = new AdErrorReason(_UNSUPPORTED_DIMENSIONS);
    public static final AdErrorReason URL_INVALID_SCHEME = new AdErrorReason(_URL_INVALID_SCHEME);
    public static final AdErrorReason URL_INVALID_TOP_LEVEL_DOMAIN = new AdErrorReason(_URL_INVALID_TOP_LEVEL_DOMAIN);
    public static final AdErrorReason URL_MALFORMED = new AdErrorReason(_URL_MALFORMED);
    public static final AdErrorReason URL_NO_HOST = new AdErrorReason(_URL_NO_HOST);
    public static final AdErrorReason URL_NOT_EQUIVALENT = new AdErrorReason(_URL_NOT_EQUIVALENT);
    public static final AdErrorReason URL_HOST_NAME_TOO_LONG = new AdErrorReason(_URL_HOST_NAME_TOO_LONG);
    public static final AdErrorReason URL_NO_SCHEME = new AdErrorReason(_URL_NO_SCHEME);
    public static final AdErrorReason URL_NO_TOP_LEVEL_DOMAIN = new AdErrorReason(_URL_NO_TOP_LEVEL_DOMAIN);
    public static final AdErrorReason URL_PATH_NOT_ALLOWED = new AdErrorReason(_URL_PATH_NOT_ALLOWED);
    public static final AdErrorReason URL_PORT_NOT_ALLOWED = new AdErrorReason(_URL_PORT_NOT_ALLOWED);
    public static final AdErrorReason URL_QUERY_NOT_ALLOWED = new AdErrorReason(_URL_QUERY_NOT_ALLOWED);
    public static final AdErrorReason URL_SCHEME_BEFORE_DSA_TAG = new AdErrorReason(_URL_SCHEME_BEFORE_DSA_TAG);
    public static final AdErrorReason URL_SCHEME_BEFORE_EXPANDED_DYNAMIC_SEARCH_AD_TAG = new AdErrorReason(_URL_SCHEME_BEFORE_EXPANDED_DYNAMIC_SEARCH_AD_TAG);
    public static final AdErrorReason USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE = new AdErrorReason(_USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE);
    public static final AdErrorReason INCONSISTENT_EXPANDABLE_SETTINGS = new AdErrorReason(_INCONSISTENT_EXPANDABLE_SETTINGS);
    public static final AdErrorReason INVALID_FORMAT = new AdErrorReason(_INVALID_FORMAT);
    public static final AdErrorReason INVALID_FIELD_TEXT = new AdErrorReason(_INVALID_FIELD_TEXT);
    public static final AdErrorReason ELEMENT_NOT_PRESENT = new AdErrorReason(_ELEMENT_NOT_PRESENT);
    public static final AdErrorReason IMAGE_ERROR = new AdErrorReason(_IMAGE_ERROR);
    public static final AdErrorReason VALUE_NOT_IN_RANGE = new AdErrorReason(_VALUE_NOT_IN_RANGE);
    public static final AdErrorReason FIELD_NOT_PRESENT = new AdErrorReason(_FIELD_NOT_PRESENT);
    public static final AdErrorReason ADDRESS_NOT_COMPLETE = new AdErrorReason(_ADDRESS_NOT_COMPLETE);
    public static final AdErrorReason ADDRESS_INVALID = new AdErrorReason(_ADDRESS_INVALID);
    public static final AdErrorReason VIDEO_RETRIEVAL_ERROR = new AdErrorReason(_VIDEO_RETRIEVAL_ERROR);
    public static final AdErrorReason AUDIO_ERROR = new AdErrorReason(_AUDIO_ERROR);
    public static final AdErrorReason INVALID_YOUTUBE_DISPLAY_URL = new AdErrorReason(_INVALID_YOUTUBE_DISPLAY_URL);
    public static final AdErrorReason TOO_MANY_PRODUCT_IMAGES = new AdErrorReason(_TOO_MANY_PRODUCT_IMAGES);
    public static final AdErrorReason TOO_MANY_PRODUCT_VIDEOS = new AdErrorReason(_TOO_MANY_PRODUCT_VIDEOS);
    public static final AdErrorReason INCOMPATIBLE_AD_TYPE_AND_DEVICE_PREFERENCE = new AdErrorReason(_INCOMPATIBLE_AD_TYPE_AND_DEVICE_PREFERENCE);
    public static final AdErrorReason CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY = new AdErrorReason(_CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY);
    public static final AdErrorReason CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED = new AdErrorReason(_CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED);
    public static final AdErrorReason DISALLOWED_NUMBER_TYPE = new AdErrorReason(_DISALLOWED_NUMBER_TYPE);
    public static final AdErrorReason PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = new AdErrorReason(_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY);
    public static final AdErrorReason PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY = new AdErrorReason(_PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY);
    public static final AdErrorReason PREMIUM_RATE_NUMBER_NOT_ALLOWED = new AdErrorReason(_PREMIUM_RATE_NUMBER_NOT_ALLOWED);
    public static final AdErrorReason VANITY_PHONE_NUMBER_NOT_ALLOWED = new AdErrorReason(_VANITY_PHONE_NUMBER_NOT_ALLOWED);
    public static final AdErrorReason INVALID_CALL_CONVERSION_TYPE_ID = new AdErrorReason(_INVALID_CALL_CONVERSION_TYPE_ID);
    public static final AdErrorReason CANNOT_DISABLE_CALL_CONVERSION_AND_SET_CONVERSION_TYPE_ID = new AdErrorReason(_CANNOT_DISABLE_CALL_CONVERSION_AND_SET_CONVERSION_TYPE_ID);
    public static final AdErrorReason CANNOT_SET_PATH2_WITHOUT_PATH1 = new AdErrorReason(_CANNOT_SET_PATH2_WITHOUT_PATH1);
    public static final AdErrorReason MISSING_DYNAMIC_SEARCH_ADS_SETTING_DOMAIN_NAME = new AdErrorReason(_MISSING_DYNAMIC_SEARCH_ADS_SETTING_DOMAIN_NAME);
    public static final AdErrorReason UNKNOWN = new AdErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdErrorReason enumeration = (AdErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
