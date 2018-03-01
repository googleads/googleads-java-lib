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
 * ExtensionSettingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class ExtensionSettingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExtensionSettingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EXTENSIONS_REQUIRED = "EXTENSIONS_REQUIRED";
    public static final java.lang.String _FEED_TYPE_EXTENSION_TYPE_MISMATCH = "FEED_TYPE_EXTENSION_TYPE_MISMATCH";
    public static final java.lang.String _INVALID_FEED_TYPE = "INVALID_FEED_TYPE";
    public static final java.lang.String _INVALID_FEED_TYPE_FOR_CUSTOMER_EXTENSION_SETTING = "INVALID_FEED_TYPE_FOR_CUSTOMER_EXTENSION_SETTING";
    public static final java.lang.String _CANNOT_CHANGE_FEED_ITEM_ON_ADD = "CANNOT_CHANGE_FEED_ITEM_ON_ADD";
    public static final java.lang.String _CANNOT_UPDATE_NEWLY_ADDED_EXTENSION = "CANNOT_UPDATE_NEWLY_ADDED_EXTENSION";
    public static final java.lang.String _NO_EXISTING_AD_GROUP_EXTENSION_SETTING_FOR_TYPE = "NO_EXISTING_AD_GROUP_EXTENSION_SETTING_FOR_TYPE";
    public static final java.lang.String _NO_EXISTING_CAMPAIGN_EXTENSION_SETTING_FOR_TYPE = "NO_EXISTING_CAMPAIGN_EXTENSION_SETTING_FOR_TYPE";
    public static final java.lang.String _NO_EXISTING_CUSTOMER_EXTENSION_SETTING_FOR_TYPE = "NO_EXISTING_CUSTOMER_EXTENSION_SETTING_FOR_TYPE";
    public static final java.lang.String _AD_GROUP_EXTENSION_SETTING_ALREADY_EXISTS = "AD_GROUP_EXTENSION_SETTING_ALREADY_EXISTS";
    public static final java.lang.String _CAMPAIGN_EXTENSION_SETTING_ALREADY_EXISTS = "CAMPAIGN_EXTENSION_SETTING_ALREADY_EXISTS";
    public static final java.lang.String _CUSTOMER_EXTENSION_SETTING_ALREADY_EXISTS = "CUSTOMER_EXTENSION_SETTING_ALREADY_EXISTS";
    public static final java.lang.String _AD_GROUP_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = "AD_GROUP_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _CAMPAIGN_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = "CAMPAIGN_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _CUSTOMER_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = "CUSTOMER_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _VALUE_OUT_OF_RANGE = "VALUE_OUT_OF_RANGE";
    public static final java.lang.String _CANNOT_SET_WITH_FINAL_URLS = "CANNOT_SET_WITH_FINAL_URLS";
    public static final java.lang.String _CANNOT_SET_WITHOUT_FINAL_URLS = "CANNOT_SET_WITHOUT_FINAL_URLS";
    public static final java.lang.String _CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE = "CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER";
    public static final java.lang.String _PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = "PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY";
    public static final java.lang.String _CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED = "CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _PREMIUM_RATE_NUMBER_NOT_ALLOWED = "PREMIUM_RATE_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _DISALLOWED_NUMBER_TYPE = "DISALLOWED_NUMBER_TYPE";
    public static final java.lang.String _INVALID_DOMESTIC_PHONE_NUMBER_FORMAT = "INVALID_DOMESTIC_PHONE_NUMBER_FORMAT";
    public static final java.lang.String _VANITY_PHONE_NUMBER_NOT_ALLOWED = "VANITY_PHONE_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_CALL_CONVERSION_TYPE_ID = "INVALID_CALL_CONVERSION_TYPE_ID";
    public static final java.lang.String _CUSTOMER_NOT_WHITELISTED_FOR_CALLTRACKING = "CUSTOMER_NOT_WHITELISTED_FOR_CALLTRACKING";
    public static final java.lang.String _CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY = "CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY";
    public static final java.lang.String _INVALID_APP_ID = "INVALID_APP_ID";
    public static final java.lang.String _QUOTES_IN_REVIEW_EXTENSION_SNIPPET = "QUOTES_IN_REVIEW_EXTENSION_SNIPPET";
    public static final java.lang.String _HYPHENS_IN_REVIEW_EXTENSION_SNIPPET = "HYPHENS_IN_REVIEW_EXTENSION_SNIPPET";
    public static final java.lang.String _REVIEW_EXTENSION_SOURCE_INELIGIBLE = "REVIEW_EXTENSION_SOURCE_INELIGIBLE";
    public static final java.lang.String _SOURCE_NAME_IN_REVIEW_EXTENSION_TEXT = "SOURCE_NAME_IN_REVIEW_EXTENSION_TEXT";
    public static final java.lang.String _MISSING_FIELD = "MISSING_FIELD";
    public static final java.lang.String _INCONSISTENT_CURRENCY_CODES = "INCONSISTENT_CURRENCY_CODES";
    public static final java.lang.String _PRICE_EXTENSION_HAS_DUPLICATED_HEADERS = "PRICE_EXTENSION_HAS_DUPLICATED_HEADERS";
    public static final java.lang.String _PRICE_ITEM_HAS_DUPLICATED_HEADER_AND_DESCRIPTION = "PRICE_ITEM_HAS_DUPLICATED_HEADER_AND_DESCRIPTION";
    public static final java.lang.String _PRICE_EXTENSION_HAS_TOO_FEW_ITEMS = "PRICE_EXTENSION_HAS_TOO_FEW_ITEMS";
    public static final java.lang.String _PRICE_EXTENSION_HAS_TOO_MANY_ITEMS = "PRICE_EXTENSION_HAS_TOO_MANY_ITEMS";
    public static final java.lang.String _UNSUPPORTED_VALUE = "UNSUPPORTED_VALUE";
    public static final java.lang.String _UNSUPPORTED_VALUE_IN_SELECTED_LANGUAGE = "UNSUPPORTED_VALUE_IN_SELECTED_LANGUAGE";
    public static final java.lang.String _INVALID_DEVICE_PREFERENCE = "INVALID_DEVICE_PREFERENCE";
    public static final java.lang.String _INVALID_SCHEDULE_END = "INVALID_SCHEDULE_END";
    public static final java.lang.String _DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE = "DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE";
    public static final java.lang.String _OVERLAPPING_SCHEDULES = "OVERLAPPING_SCHEDULES";
    public static final java.lang.String _SCHEDULE_END_NOT_AFTER_START = "SCHEDULE_END_NOT_AFTER_START";
    public static final java.lang.String _TOO_MANY_SCHEDULES_PER_DAY = "TOO_MANY_SCHEDULES_PER_DAY";
    public static final java.lang.String _DUPLICATE_EXTENSION_FEED_ITEM_EDIT = "DUPLICATE_EXTENSION_FEED_ITEM_EDIT";
    public static final java.lang.String _INVALID_SNIPPETS_HEADER = "INVALID_SNIPPETS_HEADER";
    public static final java.lang.String _PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY = "PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY";
    public static final java.lang.String _CAMPAIGN_TARGETING_MISMATCH = "CAMPAIGN_TARGETING_MISMATCH";
    public static final java.lang.String _CANNOT_OPERATE_ON_DELETED_FEED = "CANNOT_OPERATE_ON_DELETED_FEED";
    public static final java.lang.String _CONCRETE_EXTENSION_TYPE_REQUIRED = "CONCRETE_EXTENSION_TYPE_REQUIRED";
    public static final java.lang.String _INCOMPATIBLE_UNDERLYING_MATCHING_FUNCTION = "INCOMPATIBLE_UNDERLYING_MATCHING_FUNCTION";
    public static final java.lang.String _START_DATE_AFTER_END_DATE = "START_DATE_AFTER_END_DATE";
    public static final java.lang.String _INVALID_PRICE_FORMAT = "INVALID_PRICE_FORMAT";
    public static final java.lang.String _PROMOTION_INVALID_TIME = "PROMOTION_INVALID_TIME";
    public static final java.lang.String _PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF = "PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF";
    public static final java.lang.String _PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT = "PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT";
    public static final java.lang.String _TOO_MANY_DECIMAL_PLACES_SPECIFIED = "TOO_MANY_DECIMAL_PLACES_SPECIFIED";
    public static final java.lang.String _INVALID_LANGUAGE_CODE = "INVALID_LANGUAGE_CODE";
    public static final java.lang.String _UNSUPPORTED_LANGUAGE = "UNSUPPORTED_LANGUAGE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ExtensionSettingErrorReason EXTENSIONS_REQUIRED = new ExtensionSettingErrorReason(_EXTENSIONS_REQUIRED);
    public static final ExtensionSettingErrorReason FEED_TYPE_EXTENSION_TYPE_MISMATCH = new ExtensionSettingErrorReason(_FEED_TYPE_EXTENSION_TYPE_MISMATCH);
    public static final ExtensionSettingErrorReason INVALID_FEED_TYPE = new ExtensionSettingErrorReason(_INVALID_FEED_TYPE);
    public static final ExtensionSettingErrorReason INVALID_FEED_TYPE_FOR_CUSTOMER_EXTENSION_SETTING = new ExtensionSettingErrorReason(_INVALID_FEED_TYPE_FOR_CUSTOMER_EXTENSION_SETTING);
    public static final ExtensionSettingErrorReason CANNOT_CHANGE_FEED_ITEM_ON_ADD = new ExtensionSettingErrorReason(_CANNOT_CHANGE_FEED_ITEM_ON_ADD);
    public static final ExtensionSettingErrorReason CANNOT_UPDATE_NEWLY_ADDED_EXTENSION = new ExtensionSettingErrorReason(_CANNOT_UPDATE_NEWLY_ADDED_EXTENSION);
    public static final ExtensionSettingErrorReason NO_EXISTING_AD_GROUP_EXTENSION_SETTING_FOR_TYPE = new ExtensionSettingErrorReason(_NO_EXISTING_AD_GROUP_EXTENSION_SETTING_FOR_TYPE);
    public static final ExtensionSettingErrorReason NO_EXISTING_CAMPAIGN_EXTENSION_SETTING_FOR_TYPE = new ExtensionSettingErrorReason(_NO_EXISTING_CAMPAIGN_EXTENSION_SETTING_FOR_TYPE);
    public static final ExtensionSettingErrorReason NO_EXISTING_CUSTOMER_EXTENSION_SETTING_FOR_TYPE = new ExtensionSettingErrorReason(_NO_EXISTING_CUSTOMER_EXTENSION_SETTING_FOR_TYPE);
    public static final ExtensionSettingErrorReason AD_GROUP_EXTENSION_SETTING_ALREADY_EXISTS = new ExtensionSettingErrorReason(_AD_GROUP_EXTENSION_SETTING_ALREADY_EXISTS);
    public static final ExtensionSettingErrorReason CAMPAIGN_EXTENSION_SETTING_ALREADY_EXISTS = new ExtensionSettingErrorReason(_CAMPAIGN_EXTENSION_SETTING_ALREADY_EXISTS);
    public static final ExtensionSettingErrorReason CUSTOMER_EXTENSION_SETTING_ALREADY_EXISTS = new ExtensionSettingErrorReason(_CUSTOMER_EXTENSION_SETTING_ALREADY_EXISTS);
    public static final ExtensionSettingErrorReason AD_GROUP_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = new ExtensionSettingErrorReason(_AD_GROUP_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE);
    public static final ExtensionSettingErrorReason CAMPAIGN_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = new ExtensionSettingErrorReason(_CAMPAIGN_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE);
    public static final ExtensionSettingErrorReason CUSTOMER_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = new ExtensionSettingErrorReason(_CUSTOMER_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE);
    public static final ExtensionSettingErrorReason VALUE_OUT_OF_RANGE = new ExtensionSettingErrorReason(_VALUE_OUT_OF_RANGE);
    public static final ExtensionSettingErrorReason CANNOT_SET_WITH_FINAL_URLS = new ExtensionSettingErrorReason(_CANNOT_SET_WITH_FINAL_URLS);
    public static final ExtensionSettingErrorReason CANNOT_SET_WITHOUT_FINAL_URLS = new ExtensionSettingErrorReason(_CANNOT_SET_WITHOUT_FINAL_URLS);
    public static final ExtensionSettingErrorReason CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE = new ExtensionSettingErrorReason(_CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE);
    public static final ExtensionSettingErrorReason INVALID_PHONE_NUMBER = new ExtensionSettingErrorReason(_INVALID_PHONE_NUMBER);
    public static final ExtensionSettingErrorReason PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = new ExtensionSettingErrorReason(_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY);
    public static final ExtensionSettingErrorReason CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED = new ExtensionSettingErrorReason(_CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED);
    public static final ExtensionSettingErrorReason PREMIUM_RATE_NUMBER_NOT_ALLOWED = new ExtensionSettingErrorReason(_PREMIUM_RATE_NUMBER_NOT_ALLOWED);
    public static final ExtensionSettingErrorReason DISALLOWED_NUMBER_TYPE = new ExtensionSettingErrorReason(_DISALLOWED_NUMBER_TYPE);
    public static final ExtensionSettingErrorReason INVALID_DOMESTIC_PHONE_NUMBER_FORMAT = new ExtensionSettingErrorReason(_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT);
    public static final ExtensionSettingErrorReason VANITY_PHONE_NUMBER_NOT_ALLOWED = new ExtensionSettingErrorReason(_VANITY_PHONE_NUMBER_NOT_ALLOWED);
    public static final ExtensionSettingErrorReason INVALID_COUNTRY_CODE = new ExtensionSettingErrorReason(_INVALID_COUNTRY_CODE);
    public static final ExtensionSettingErrorReason INVALID_CALL_CONVERSION_TYPE_ID = new ExtensionSettingErrorReason(_INVALID_CALL_CONVERSION_TYPE_ID);
    public static final ExtensionSettingErrorReason CUSTOMER_NOT_WHITELISTED_FOR_CALLTRACKING = new ExtensionSettingErrorReason(_CUSTOMER_NOT_WHITELISTED_FOR_CALLTRACKING);
    public static final ExtensionSettingErrorReason CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY = new ExtensionSettingErrorReason(_CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY);
    public static final ExtensionSettingErrorReason INVALID_APP_ID = new ExtensionSettingErrorReason(_INVALID_APP_ID);
    public static final ExtensionSettingErrorReason QUOTES_IN_REVIEW_EXTENSION_SNIPPET = new ExtensionSettingErrorReason(_QUOTES_IN_REVIEW_EXTENSION_SNIPPET);
    public static final ExtensionSettingErrorReason HYPHENS_IN_REVIEW_EXTENSION_SNIPPET = new ExtensionSettingErrorReason(_HYPHENS_IN_REVIEW_EXTENSION_SNIPPET);
    public static final ExtensionSettingErrorReason REVIEW_EXTENSION_SOURCE_INELIGIBLE = new ExtensionSettingErrorReason(_REVIEW_EXTENSION_SOURCE_INELIGIBLE);
    public static final ExtensionSettingErrorReason SOURCE_NAME_IN_REVIEW_EXTENSION_TEXT = new ExtensionSettingErrorReason(_SOURCE_NAME_IN_REVIEW_EXTENSION_TEXT);
    public static final ExtensionSettingErrorReason MISSING_FIELD = new ExtensionSettingErrorReason(_MISSING_FIELD);
    public static final ExtensionSettingErrorReason INCONSISTENT_CURRENCY_CODES = new ExtensionSettingErrorReason(_INCONSISTENT_CURRENCY_CODES);
    public static final ExtensionSettingErrorReason PRICE_EXTENSION_HAS_DUPLICATED_HEADERS = new ExtensionSettingErrorReason(_PRICE_EXTENSION_HAS_DUPLICATED_HEADERS);
    public static final ExtensionSettingErrorReason PRICE_ITEM_HAS_DUPLICATED_HEADER_AND_DESCRIPTION = new ExtensionSettingErrorReason(_PRICE_ITEM_HAS_DUPLICATED_HEADER_AND_DESCRIPTION);
    public static final ExtensionSettingErrorReason PRICE_EXTENSION_HAS_TOO_FEW_ITEMS = new ExtensionSettingErrorReason(_PRICE_EXTENSION_HAS_TOO_FEW_ITEMS);
    public static final ExtensionSettingErrorReason PRICE_EXTENSION_HAS_TOO_MANY_ITEMS = new ExtensionSettingErrorReason(_PRICE_EXTENSION_HAS_TOO_MANY_ITEMS);
    public static final ExtensionSettingErrorReason UNSUPPORTED_VALUE = new ExtensionSettingErrorReason(_UNSUPPORTED_VALUE);
    public static final ExtensionSettingErrorReason UNSUPPORTED_VALUE_IN_SELECTED_LANGUAGE = new ExtensionSettingErrorReason(_UNSUPPORTED_VALUE_IN_SELECTED_LANGUAGE);
    public static final ExtensionSettingErrorReason INVALID_DEVICE_PREFERENCE = new ExtensionSettingErrorReason(_INVALID_DEVICE_PREFERENCE);
    public static final ExtensionSettingErrorReason INVALID_SCHEDULE_END = new ExtensionSettingErrorReason(_INVALID_SCHEDULE_END);
    public static final ExtensionSettingErrorReason DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE = new ExtensionSettingErrorReason(_DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE);
    public static final ExtensionSettingErrorReason OVERLAPPING_SCHEDULES = new ExtensionSettingErrorReason(_OVERLAPPING_SCHEDULES);
    public static final ExtensionSettingErrorReason SCHEDULE_END_NOT_AFTER_START = new ExtensionSettingErrorReason(_SCHEDULE_END_NOT_AFTER_START);
    public static final ExtensionSettingErrorReason TOO_MANY_SCHEDULES_PER_DAY = new ExtensionSettingErrorReason(_TOO_MANY_SCHEDULES_PER_DAY);
    public static final ExtensionSettingErrorReason DUPLICATE_EXTENSION_FEED_ITEM_EDIT = new ExtensionSettingErrorReason(_DUPLICATE_EXTENSION_FEED_ITEM_EDIT);
    public static final ExtensionSettingErrorReason INVALID_SNIPPETS_HEADER = new ExtensionSettingErrorReason(_INVALID_SNIPPETS_HEADER);
    public static final ExtensionSettingErrorReason PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY = new ExtensionSettingErrorReason(_PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY);
    public static final ExtensionSettingErrorReason CAMPAIGN_TARGETING_MISMATCH = new ExtensionSettingErrorReason(_CAMPAIGN_TARGETING_MISMATCH);
    public static final ExtensionSettingErrorReason CANNOT_OPERATE_ON_DELETED_FEED = new ExtensionSettingErrorReason(_CANNOT_OPERATE_ON_DELETED_FEED);
    public static final ExtensionSettingErrorReason CONCRETE_EXTENSION_TYPE_REQUIRED = new ExtensionSettingErrorReason(_CONCRETE_EXTENSION_TYPE_REQUIRED);
    public static final ExtensionSettingErrorReason INCOMPATIBLE_UNDERLYING_MATCHING_FUNCTION = new ExtensionSettingErrorReason(_INCOMPATIBLE_UNDERLYING_MATCHING_FUNCTION);
    public static final ExtensionSettingErrorReason START_DATE_AFTER_END_DATE = new ExtensionSettingErrorReason(_START_DATE_AFTER_END_DATE);
    public static final ExtensionSettingErrorReason INVALID_PRICE_FORMAT = new ExtensionSettingErrorReason(_INVALID_PRICE_FORMAT);
    public static final ExtensionSettingErrorReason PROMOTION_INVALID_TIME = new ExtensionSettingErrorReason(_PROMOTION_INVALID_TIME);
    public static final ExtensionSettingErrorReason PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF = new ExtensionSettingErrorReason(_PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF);
    public static final ExtensionSettingErrorReason PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT = new ExtensionSettingErrorReason(_PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT);
    public static final ExtensionSettingErrorReason TOO_MANY_DECIMAL_PLACES_SPECIFIED = new ExtensionSettingErrorReason(_TOO_MANY_DECIMAL_PLACES_SPECIFIED);
    public static final ExtensionSettingErrorReason INVALID_LANGUAGE_CODE = new ExtensionSettingErrorReason(_INVALID_LANGUAGE_CODE);
    public static final ExtensionSettingErrorReason UNSUPPORTED_LANGUAGE = new ExtensionSettingErrorReason(_UNSUPPORTED_LANGUAGE);
    public static final ExtensionSettingErrorReason UNKNOWN = new ExtensionSettingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ExtensionSettingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExtensionSettingErrorReason enumeration = (ExtensionSettingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExtensionSettingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExtensionSettingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionSettingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
