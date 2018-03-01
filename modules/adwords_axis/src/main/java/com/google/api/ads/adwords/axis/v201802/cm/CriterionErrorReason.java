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
 * CriterionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class CriterionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CriterionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONCRETE_TYPE_REQUIRED = "CONCRETE_TYPE_REQUIRED";
    public static final java.lang.String _INVALID_EXCLUDED_CATEGORY = "INVALID_EXCLUDED_CATEGORY";
    public static final java.lang.String _INVALID_KEYWORD_TEXT = "INVALID_KEYWORD_TEXT";
    public static final java.lang.String _KEYWORD_TEXT_TOO_LONG = "KEYWORD_TEXT_TOO_LONG";
    public static final java.lang.String _KEYWORD_HAS_TOO_MANY_WORDS = "KEYWORD_HAS_TOO_MANY_WORDS";
    public static final java.lang.String _KEYWORD_HAS_INVALID_CHARS = "KEYWORD_HAS_INVALID_CHARS";
    public static final java.lang.String _INVALID_PLACEMENT_URL = "INVALID_PLACEMENT_URL";
    public static final java.lang.String _INVALID_USER_LIST = "INVALID_USER_LIST";
    public static final java.lang.String _INVALID_USER_INTEREST = "INVALID_USER_INTEREST";
    public static final java.lang.String _INVALID_FORMAT_FOR_PLACEMENT_URL = "INVALID_FORMAT_FOR_PLACEMENT_URL";
    public static final java.lang.String _PLACEMENT_URL_IS_TOO_LONG = "PLACEMENT_URL_IS_TOO_LONG";
    public static final java.lang.String _PLACEMENT_URL_HAS_ILLEGAL_CHAR = "PLACEMENT_URL_HAS_ILLEGAL_CHAR";
    public static final java.lang.String _PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE = "PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE";
    public static final java.lang.String _PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION = "PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION";
    public static final java.lang.String _INVALID_VERTICAL_PATH = "INVALID_VERTICAL_PATH";
    public static final java.lang.String _YOUTUBE_VERTICAL_CHANNEL_DEPRECATED = "YOUTUBE_VERTICAL_CHANNEL_DEPRECATED";
    public static final java.lang.String _YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED = "YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED";
    public static final java.lang.String _YOUTUBE_URL_UNSUPPORTED = "YOUTUBE_URL_UNSUPPORTED";
    public static final java.lang.String _CANNOT_EXCLUDE_CRITERIA_TYPE = "CANNOT_EXCLUDE_CRITERIA_TYPE";
    public static final java.lang.String _CANNOT_ADD_CRITERIA_TYPE = "CANNOT_ADD_CRITERIA_TYPE";
    public static final java.lang.String _INVALID_PRODUCT_FILTER = "INVALID_PRODUCT_FILTER";
    public static final java.lang.String _PRODUCT_FILTER_TOO_LONG = "PRODUCT_FILTER_TOO_LONG";
    public static final java.lang.String _CANNOT_EXCLUDE_SIMILAR_USER_LIST = "CANNOT_EXCLUDE_SIMILAR_USER_LIST";
    public static final java.lang.String _CANNOT_ADD_CLOSED_USER_LIST = "CANNOT_ADD_CLOSED_USER_LIST";
    public static final java.lang.String _CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS = "CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS";
    public static final java.lang.String _CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_CAMPAIGNS = "CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_CAMPAIGNS";
    public static final java.lang.String _CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPING_CAMPAIGNS = "CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPING_CAMPAIGNS";
    public static final java.lang.String _CANNOT_ADD_USER_INTERESTS_TO_SEARCH_CAMPAIGNS = "CANNOT_ADD_USER_INTERESTS_TO_SEARCH_CAMPAIGNS";
    public static final java.lang.String _CANNOT_SET_BIDS_ON_CRITERION_TYPE_IN_SEARCH_CAMPAIGNS = "CANNOT_SET_BIDS_ON_CRITERION_TYPE_IN_SEARCH_CAMPAIGNS";
    public static final java.lang.String _CANNOT_ADD_URLS_TO_CRITERION_TYPE_FOR_CAMPAIGN_TYPE = "CANNOT_ADD_URLS_TO_CRITERION_TYPE_FOR_CAMPAIGN_TYPE";
    public static final java.lang.String _INVALID_IP_ADDRESS = "INVALID_IP_ADDRESS";
    public static final java.lang.String _INVALID_IP_FORMAT = "INVALID_IP_FORMAT";
    public static final java.lang.String _INVALID_MOBILE_APP = "INVALID_MOBILE_APP";
    public static final java.lang.String _INVALID_MOBILE_APP_CATEGORY = "INVALID_MOBILE_APP_CATEGORY";
    public static final java.lang.String _INVALID_CRITERION_ID = "INVALID_CRITERION_ID";
    public static final java.lang.String _CANNOT_TARGET_CRITERION = "CANNOT_TARGET_CRITERION";
    public static final java.lang.String _CANNOT_TARGET_OBSOLETE_CRITERION = "CANNOT_TARGET_OBSOLETE_CRITERION";
    public static final java.lang.String _CRITERION_ID_AND_TYPE_MISMATCH = "CRITERION_ID_AND_TYPE_MISMATCH";
    public static final java.lang.String _INVALID_PROXIMITY_RADIUS = "INVALID_PROXIMITY_RADIUS";
    public static final java.lang.String _INVALID_PROXIMITY_RADIUS_UNITS = "INVALID_PROXIMITY_RADIUS_UNITS";
    public static final java.lang.String _INVALID_STREETADDRESS_LENGTH = "INVALID_STREETADDRESS_LENGTH";
    public static final java.lang.String _INVALID_CITYNAME_LENGTH = "INVALID_CITYNAME_LENGTH";
    public static final java.lang.String _INVALID_REGIONCODE_LENGTH = "INVALID_REGIONCODE_LENGTH";
    public static final java.lang.String _INVALID_REGIONNAME_LENGTH = "INVALID_REGIONNAME_LENGTH";
    public static final java.lang.String _INVALID_POSTALCODE_LENGTH = "INVALID_POSTALCODE_LENGTH";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_LATITUDE = "INVALID_LATITUDE";
    public static final java.lang.String _INVALID_LONGITUDE = "INVALID_LONGITUDE";
    public static final java.lang.String _PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL = "PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL";
    public static final java.lang.String _INVALID_PROXIMITY_ADDRESS = "INVALID_PROXIMITY_ADDRESS";
    public static final java.lang.String _INVALID_USER_DOMAIN_NAME = "INVALID_USER_DOMAIN_NAME";
    public static final java.lang.String _CRITERION_PARAMETER_TOO_LONG = "CRITERION_PARAMETER_TOO_LONG";
    public static final java.lang.String _AD_SCHEDULE_TIME_INTERVALS_OVERLAP = "AD_SCHEDULE_TIME_INTERVALS_OVERLAP";
    public static final java.lang.String _AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS = "AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS";
    public static final java.lang.String _AD_SCHEDULE_INVALID_TIME_INTERVAL = "AD_SCHEDULE_INVALID_TIME_INTERVAL";
    public static final java.lang.String _AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT = "AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT";
    public static final java.lang.String _AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS = "AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS";
    public static final java.lang.String _CANNOT_BID_MODIFY_CRITERION_TYPE = "CANNOT_BID_MODIFY_CRITERION_TYPE";
    public static final java.lang.String _CANNOT_BID_MODIFY_CRITERION_CAMPAIGN_OPTED_OUT = "CANNOT_BID_MODIFY_CRITERION_CAMPAIGN_OPTED_OUT";
    public static final java.lang.String _CANNOT_BID_MODIFY_NEGATIVE_CRITERION = "CANNOT_BID_MODIFY_NEGATIVE_CRITERION";
    public static final java.lang.String _BID_MODIFIER_ALREADY_EXISTS = "BID_MODIFIER_ALREADY_EXISTS";
    public static final java.lang.String _FEED_ID_NOT_ALLOWED = "FEED_ID_NOT_ALLOWED";
    public static final java.lang.String _ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE = "ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE";
    public static final java.lang.String _CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY = "CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY";
    public static final java.lang.String _CANNOT_EXCLUDE_CRITERION = "CANNOT_EXCLUDE_CRITERION";
    public static final java.lang.String _CANNOT_REMOVE_CRITERION = "CANNOT_REMOVE_CRITERION";
    public static final java.lang.String _PRODUCT_SCOPE_TOO_LONG = "PRODUCT_SCOPE_TOO_LONG";
    public static final java.lang.String _PRODUCT_SCOPE_TOO_MANY_DIMENSIONS = "PRODUCT_SCOPE_TOO_MANY_DIMENSIONS";
    public static final java.lang.String _PRODUCT_PARTITION_TOO_LONG = "PRODUCT_PARTITION_TOO_LONG";
    public static final java.lang.String _PRODUCT_PARTITION_TOO_MANY_DIMENSIONS = "PRODUCT_PARTITION_TOO_MANY_DIMENSIONS";
    public static final java.lang.String _INVALID_PRODUCT_DIMENSION = "INVALID_PRODUCT_DIMENSION";
    public static final java.lang.String _INVALID_PRODUCT_DIMENSION_TYPE = "INVALID_PRODUCT_DIMENSION_TYPE";
    public static final java.lang.String _INVALID_PRODUCT_BIDDING_CATEGORY = "INVALID_PRODUCT_BIDDING_CATEGORY";
    public static final java.lang.String _MISSING_SHOPPING_SETTING = "MISSING_SHOPPING_SETTING";
    public static final java.lang.String _INVALID_MATCHING_FUNCTION = "INVALID_MATCHING_FUNCTION";
    public static final java.lang.String _LOCATION_FILTER_NOT_ALLOWED = "LOCATION_FILTER_NOT_ALLOWED";
    public static final java.lang.String _LOCATION_FILTER_INVALID = "LOCATION_FILTER_INVALID";
    public static final java.lang.String _CANNOT_ATTACH_CRITERIA_AT_CAMPAIGN_AND_ADGROUP = "CANNOT_ATTACH_CRITERIA_AT_CAMPAIGN_AND_ADGROUP";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CriterionErrorReason CONCRETE_TYPE_REQUIRED = new CriterionErrorReason(_CONCRETE_TYPE_REQUIRED);
    public static final CriterionErrorReason INVALID_EXCLUDED_CATEGORY = new CriterionErrorReason(_INVALID_EXCLUDED_CATEGORY);
    public static final CriterionErrorReason INVALID_KEYWORD_TEXT = new CriterionErrorReason(_INVALID_KEYWORD_TEXT);
    public static final CriterionErrorReason KEYWORD_TEXT_TOO_LONG = new CriterionErrorReason(_KEYWORD_TEXT_TOO_LONG);
    public static final CriterionErrorReason KEYWORD_HAS_TOO_MANY_WORDS = new CriterionErrorReason(_KEYWORD_HAS_TOO_MANY_WORDS);
    public static final CriterionErrorReason KEYWORD_HAS_INVALID_CHARS = new CriterionErrorReason(_KEYWORD_HAS_INVALID_CHARS);
    public static final CriterionErrorReason INVALID_PLACEMENT_URL = new CriterionErrorReason(_INVALID_PLACEMENT_URL);
    public static final CriterionErrorReason INVALID_USER_LIST = new CriterionErrorReason(_INVALID_USER_LIST);
    public static final CriterionErrorReason INVALID_USER_INTEREST = new CriterionErrorReason(_INVALID_USER_INTEREST);
    public static final CriterionErrorReason INVALID_FORMAT_FOR_PLACEMENT_URL = new CriterionErrorReason(_INVALID_FORMAT_FOR_PLACEMENT_URL);
    public static final CriterionErrorReason PLACEMENT_URL_IS_TOO_LONG = new CriterionErrorReason(_PLACEMENT_URL_IS_TOO_LONG);
    public static final CriterionErrorReason PLACEMENT_URL_HAS_ILLEGAL_CHAR = new CriterionErrorReason(_PLACEMENT_URL_HAS_ILLEGAL_CHAR);
    public static final CriterionErrorReason PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE = new CriterionErrorReason(_PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE);
    public static final CriterionErrorReason PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION = new CriterionErrorReason(_PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION);
    public static final CriterionErrorReason INVALID_VERTICAL_PATH = new CriterionErrorReason(_INVALID_VERTICAL_PATH);
    public static final CriterionErrorReason YOUTUBE_VERTICAL_CHANNEL_DEPRECATED = new CriterionErrorReason(_YOUTUBE_VERTICAL_CHANNEL_DEPRECATED);
    public static final CriterionErrorReason YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED = new CriterionErrorReason(_YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED);
    public static final CriterionErrorReason YOUTUBE_URL_UNSUPPORTED = new CriterionErrorReason(_YOUTUBE_URL_UNSUPPORTED);
    public static final CriterionErrorReason CANNOT_EXCLUDE_CRITERIA_TYPE = new CriterionErrorReason(_CANNOT_EXCLUDE_CRITERIA_TYPE);
    public static final CriterionErrorReason CANNOT_ADD_CRITERIA_TYPE = new CriterionErrorReason(_CANNOT_ADD_CRITERIA_TYPE);
    public static final CriterionErrorReason INVALID_PRODUCT_FILTER = new CriterionErrorReason(_INVALID_PRODUCT_FILTER);
    public static final CriterionErrorReason PRODUCT_FILTER_TOO_LONG = new CriterionErrorReason(_PRODUCT_FILTER_TOO_LONG);
    public static final CriterionErrorReason CANNOT_EXCLUDE_SIMILAR_USER_LIST = new CriterionErrorReason(_CANNOT_EXCLUDE_SIMILAR_USER_LIST);
    public static final CriterionErrorReason CANNOT_ADD_CLOSED_USER_LIST = new CriterionErrorReason(_CANNOT_ADD_CLOSED_USER_LIST);
    public static final CriterionErrorReason CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS = new CriterionErrorReason(_CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS);
    public static final CriterionErrorReason CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_CAMPAIGNS = new CriterionErrorReason(_CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_CAMPAIGNS);
    public static final CriterionErrorReason CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPING_CAMPAIGNS = new CriterionErrorReason(_CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPING_CAMPAIGNS);
    public static final CriterionErrorReason CANNOT_ADD_USER_INTERESTS_TO_SEARCH_CAMPAIGNS = new CriterionErrorReason(_CANNOT_ADD_USER_INTERESTS_TO_SEARCH_CAMPAIGNS);
    public static final CriterionErrorReason CANNOT_SET_BIDS_ON_CRITERION_TYPE_IN_SEARCH_CAMPAIGNS = new CriterionErrorReason(_CANNOT_SET_BIDS_ON_CRITERION_TYPE_IN_SEARCH_CAMPAIGNS);
    public static final CriterionErrorReason CANNOT_ADD_URLS_TO_CRITERION_TYPE_FOR_CAMPAIGN_TYPE = new CriterionErrorReason(_CANNOT_ADD_URLS_TO_CRITERION_TYPE_FOR_CAMPAIGN_TYPE);
    public static final CriterionErrorReason INVALID_IP_ADDRESS = new CriterionErrorReason(_INVALID_IP_ADDRESS);
    public static final CriterionErrorReason INVALID_IP_FORMAT = new CriterionErrorReason(_INVALID_IP_FORMAT);
    public static final CriterionErrorReason INVALID_MOBILE_APP = new CriterionErrorReason(_INVALID_MOBILE_APP);
    public static final CriterionErrorReason INVALID_MOBILE_APP_CATEGORY = new CriterionErrorReason(_INVALID_MOBILE_APP_CATEGORY);
    public static final CriterionErrorReason INVALID_CRITERION_ID = new CriterionErrorReason(_INVALID_CRITERION_ID);
    public static final CriterionErrorReason CANNOT_TARGET_CRITERION = new CriterionErrorReason(_CANNOT_TARGET_CRITERION);
    public static final CriterionErrorReason CANNOT_TARGET_OBSOLETE_CRITERION = new CriterionErrorReason(_CANNOT_TARGET_OBSOLETE_CRITERION);
    public static final CriterionErrorReason CRITERION_ID_AND_TYPE_MISMATCH = new CriterionErrorReason(_CRITERION_ID_AND_TYPE_MISMATCH);
    public static final CriterionErrorReason INVALID_PROXIMITY_RADIUS = new CriterionErrorReason(_INVALID_PROXIMITY_RADIUS);
    public static final CriterionErrorReason INVALID_PROXIMITY_RADIUS_UNITS = new CriterionErrorReason(_INVALID_PROXIMITY_RADIUS_UNITS);
    public static final CriterionErrorReason INVALID_STREETADDRESS_LENGTH = new CriterionErrorReason(_INVALID_STREETADDRESS_LENGTH);
    public static final CriterionErrorReason INVALID_CITYNAME_LENGTH = new CriterionErrorReason(_INVALID_CITYNAME_LENGTH);
    public static final CriterionErrorReason INVALID_REGIONCODE_LENGTH = new CriterionErrorReason(_INVALID_REGIONCODE_LENGTH);
    public static final CriterionErrorReason INVALID_REGIONNAME_LENGTH = new CriterionErrorReason(_INVALID_REGIONNAME_LENGTH);
    public static final CriterionErrorReason INVALID_POSTALCODE_LENGTH = new CriterionErrorReason(_INVALID_POSTALCODE_LENGTH);
    public static final CriterionErrorReason INVALID_COUNTRY_CODE = new CriterionErrorReason(_INVALID_COUNTRY_CODE);
    public static final CriterionErrorReason INVALID_LATITUDE = new CriterionErrorReason(_INVALID_LATITUDE);
    public static final CriterionErrorReason INVALID_LONGITUDE = new CriterionErrorReason(_INVALID_LONGITUDE);
    public static final CriterionErrorReason PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL = new CriterionErrorReason(_PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL);
    public static final CriterionErrorReason INVALID_PROXIMITY_ADDRESS = new CriterionErrorReason(_INVALID_PROXIMITY_ADDRESS);
    public static final CriterionErrorReason INVALID_USER_DOMAIN_NAME = new CriterionErrorReason(_INVALID_USER_DOMAIN_NAME);
    public static final CriterionErrorReason CRITERION_PARAMETER_TOO_LONG = new CriterionErrorReason(_CRITERION_PARAMETER_TOO_LONG);
    public static final CriterionErrorReason AD_SCHEDULE_TIME_INTERVALS_OVERLAP = new CriterionErrorReason(_AD_SCHEDULE_TIME_INTERVALS_OVERLAP);
    public static final CriterionErrorReason AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS = new CriterionErrorReason(_AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS);
    public static final CriterionErrorReason AD_SCHEDULE_INVALID_TIME_INTERVAL = new CriterionErrorReason(_AD_SCHEDULE_INVALID_TIME_INTERVAL);
    public static final CriterionErrorReason AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT = new CriterionErrorReason(_AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT);
    public static final CriterionErrorReason AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS = new CriterionErrorReason(_AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS);
    public static final CriterionErrorReason CANNOT_BID_MODIFY_CRITERION_TYPE = new CriterionErrorReason(_CANNOT_BID_MODIFY_CRITERION_TYPE);
    public static final CriterionErrorReason CANNOT_BID_MODIFY_CRITERION_CAMPAIGN_OPTED_OUT = new CriterionErrorReason(_CANNOT_BID_MODIFY_CRITERION_CAMPAIGN_OPTED_OUT);
    public static final CriterionErrorReason CANNOT_BID_MODIFY_NEGATIVE_CRITERION = new CriterionErrorReason(_CANNOT_BID_MODIFY_NEGATIVE_CRITERION);
    public static final CriterionErrorReason BID_MODIFIER_ALREADY_EXISTS = new CriterionErrorReason(_BID_MODIFIER_ALREADY_EXISTS);
    public static final CriterionErrorReason FEED_ID_NOT_ALLOWED = new CriterionErrorReason(_FEED_ID_NOT_ALLOWED);
    public static final CriterionErrorReason ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE = new CriterionErrorReason(_ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE);
    public static final CriterionErrorReason CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY = new CriterionErrorReason(_CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY);
    public static final CriterionErrorReason CANNOT_EXCLUDE_CRITERION = new CriterionErrorReason(_CANNOT_EXCLUDE_CRITERION);
    public static final CriterionErrorReason CANNOT_REMOVE_CRITERION = new CriterionErrorReason(_CANNOT_REMOVE_CRITERION);
    public static final CriterionErrorReason PRODUCT_SCOPE_TOO_LONG = new CriterionErrorReason(_PRODUCT_SCOPE_TOO_LONG);
    public static final CriterionErrorReason PRODUCT_SCOPE_TOO_MANY_DIMENSIONS = new CriterionErrorReason(_PRODUCT_SCOPE_TOO_MANY_DIMENSIONS);
    public static final CriterionErrorReason PRODUCT_PARTITION_TOO_LONG = new CriterionErrorReason(_PRODUCT_PARTITION_TOO_LONG);
    public static final CriterionErrorReason PRODUCT_PARTITION_TOO_MANY_DIMENSIONS = new CriterionErrorReason(_PRODUCT_PARTITION_TOO_MANY_DIMENSIONS);
    public static final CriterionErrorReason INVALID_PRODUCT_DIMENSION = new CriterionErrorReason(_INVALID_PRODUCT_DIMENSION);
    public static final CriterionErrorReason INVALID_PRODUCT_DIMENSION_TYPE = new CriterionErrorReason(_INVALID_PRODUCT_DIMENSION_TYPE);
    public static final CriterionErrorReason INVALID_PRODUCT_BIDDING_CATEGORY = new CriterionErrorReason(_INVALID_PRODUCT_BIDDING_CATEGORY);
    public static final CriterionErrorReason MISSING_SHOPPING_SETTING = new CriterionErrorReason(_MISSING_SHOPPING_SETTING);
    public static final CriterionErrorReason INVALID_MATCHING_FUNCTION = new CriterionErrorReason(_INVALID_MATCHING_FUNCTION);
    public static final CriterionErrorReason LOCATION_FILTER_NOT_ALLOWED = new CriterionErrorReason(_LOCATION_FILTER_NOT_ALLOWED);
    public static final CriterionErrorReason LOCATION_FILTER_INVALID = new CriterionErrorReason(_LOCATION_FILTER_INVALID);
    public static final CriterionErrorReason CANNOT_ATTACH_CRITERIA_AT_CAMPAIGN_AND_ADGROUP = new CriterionErrorReason(_CANNOT_ATTACH_CRITERIA_AT_CAMPAIGN_AND_ADGROUP);
    public static final CriterionErrorReason UNKNOWN = new CriterionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CriterionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CriterionErrorReason enumeration = (CriterionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CriterionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CriterionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
