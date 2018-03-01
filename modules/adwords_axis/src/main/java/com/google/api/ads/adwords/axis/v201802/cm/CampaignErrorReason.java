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
 * CampaignErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class CampaignErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_GO_BACK_TO_INCOMPLETE = "CANNOT_GO_BACK_TO_INCOMPLETE";
    public static final java.lang.String _CANNOT_TARGET_CONTENT_NETWORK = "CANNOT_TARGET_CONTENT_NETWORK";
    public static final java.lang.String _CANNOT_TARGET_SEARCH_NETWORK = "CANNOT_TARGET_SEARCH_NETWORK";
    public static final java.lang.String _CANNOT_TARGET_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH = "CANNOT_TARGET_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH";
    public static final java.lang.String _CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN = "CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN";
    public static final java.lang.String _CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_NETWORK = "CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_NETWORK";
    public static final java.lang.String _CANNOT_TARGET_PARTNER_SEARCH_NETWORK = "CANNOT_TARGET_PARTNER_SEARCH_NETWORK";
    public static final java.lang.String _CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_STRATEGY = "CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_STRATEGY";
    public static final java.lang.String _CAMPAIGN_DURATION_MUST_CONTAIN_ALL_RUNNABLE_TRIALS = "CAMPAIGN_DURATION_MUST_CONTAIN_ALL_RUNNABLE_TRIALS";
    public static final java.lang.String _CANNOT_MODIFY_FOR_TRIAL_CAMPAIGN = "CANNOT_MODIFY_FOR_TRIAL_CAMPAIGN";
    public static final java.lang.String _DUPLICATE_CAMPAIGN_NAME = "DUPLICATE_CAMPAIGN_NAME";
    public static final java.lang.String _INCOMPATIBLE_CAMPAIGN_FIELD = "INCOMPATIBLE_CAMPAIGN_FIELD";
    public static final java.lang.String _INVALID_CAMPAIGN_NAME = "INVALID_CAMPAIGN_NAME";
    public static final java.lang.String _INVALID_AD_SERVING_OPTIMIZATION_STATUS = "INVALID_AD_SERVING_OPTIMIZATION_STATUS";
    public static final java.lang.String _INVALID_TRACKING_URL = "INVALID_TRACKING_URL";
    public static final java.lang.String _CANNOT_SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRACKING_SETTING = "CANNOT_SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRACKING_SETTING";
    public static final java.lang.String _MAX_IMPRESSIONS_NOT_IN_RANGE = "MAX_IMPRESSIONS_NOT_IN_RANGE";
    public static final java.lang.String _TIME_UNIT_NOT_SUPPORTED = "TIME_UNIT_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED = "INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED";
    public static final java.lang.String _BUDGET_CANNOT_BE_SHARED = "BUDGET_CANNOT_BE_SHARED";
    public static final java.lang.String _CAMPAIGN_CANNOT_USE_SHARED_BUDGET = "CAMPAIGN_CANNOT_USE_SHARED_BUDGET";
    public static final java.lang.String _CANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_TRIALS = "CANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_TRIALS";
    public static final java.lang.String _CAMPAIGN_LABEL_DOES_NOT_EXIST = "CAMPAIGN_LABEL_DOES_NOT_EXIST";
    public static final java.lang.String _CAMPAIGN_LABEL_ALREADY_EXISTS = "CAMPAIGN_LABEL_ALREADY_EXISTS";
    public static final java.lang.String _MISSING_SHOPPING_SETTING = "MISSING_SHOPPING_SETTING";
    public static final java.lang.String _INVALID_SHOPPING_SALES_COUNTRY = "INVALID_SHOPPING_SALES_COUNTRY";
    public static final java.lang.String _SHOPPING_MERCHANT_NOT_ALLOWED_FOR_PURCHASES_ON_GOOGLE = "SHOPPING_MERCHANT_NOT_ALLOWED_FOR_PURCHASES_ON_GOOGLE";
    public static final java.lang.String _PURCHASES_ON_GOOGLE_NOT_SUPPORTED_FOR_SHOPPING_SALES_COUNTRY = "PURCHASES_ON_GOOGLE_NOT_SUPPORTED_FOR_SHOPPING_SALES_COUNTRY";
    public static final java.lang.String _MISSING_UNIVERSAL_APP_CAMPAIGN_SETTING = "MISSING_UNIVERSAL_APP_CAMPAIGN_SETTING";
    public static final java.lang.String _ADVERTISING_CHANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = "ADVERTISING_CHANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_TYPE";
    public static final java.lang.String _INVALID_ADVERTISING_CHANNEL_SUB_TYPE = "INVALID_ADVERTISING_CHANNEL_SUB_TYPE";
    public static final java.lang.String _AT_LEAST_ONE_CONVERSION_MUST_BE_SELECTED = "AT_LEAST_ONE_CONVERSION_MUST_BE_SELECTED";
    public static final java.lang.String _CANNOT_SET_AD_ROTATION_MODE = "CANNOT_SET_AD_ROTATION_MODE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CampaignErrorReason CANNOT_GO_BACK_TO_INCOMPLETE = new CampaignErrorReason(_CANNOT_GO_BACK_TO_INCOMPLETE);
    public static final CampaignErrorReason CANNOT_TARGET_CONTENT_NETWORK = new CampaignErrorReason(_CANNOT_TARGET_CONTENT_NETWORK);
    public static final CampaignErrorReason CANNOT_TARGET_SEARCH_NETWORK = new CampaignErrorReason(_CANNOT_TARGET_SEARCH_NETWORK);
    public static final CampaignErrorReason CANNOT_TARGET_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH = new CampaignErrorReason(_CANNOT_TARGET_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH);
    public static final CampaignErrorReason CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN = new CampaignErrorReason(_CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN);
    public static final CampaignErrorReason CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_NETWORK = new CampaignErrorReason(_CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_NETWORK);
    public static final CampaignErrorReason CANNOT_TARGET_PARTNER_SEARCH_NETWORK = new CampaignErrorReason(_CANNOT_TARGET_PARTNER_SEARCH_NETWORK);
    public static final CampaignErrorReason CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_STRATEGY = new CampaignErrorReason(_CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_STRATEGY);
    public static final CampaignErrorReason CAMPAIGN_DURATION_MUST_CONTAIN_ALL_RUNNABLE_TRIALS = new CampaignErrorReason(_CAMPAIGN_DURATION_MUST_CONTAIN_ALL_RUNNABLE_TRIALS);
    public static final CampaignErrorReason CANNOT_MODIFY_FOR_TRIAL_CAMPAIGN = new CampaignErrorReason(_CANNOT_MODIFY_FOR_TRIAL_CAMPAIGN);
    public static final CampaignErrorReason DUPLICATE_CAMPAIGN_NAME = new CampaignErrorReason(_DUPLICATE_CAMPAIGN_NAME);
    public static final CampaignErrorReason INCOMPATIBLE_CAMPAIGN_FIELD = new CampaignErrorReason(_INCOMPATIBLE_CAMPAIGN_FIELD);
    public static final CampaignErrorReason INVALID_CAMPAIGN_NAME = new CampaignErrorReason(_INVALID_CAMPAIGN_NAME);
    public static final CampaignErrorReason INVALID_AD_SERVING_OPTIMIZATION_STATUS = new CampaignErrorReason(_INVALID_AD_SERVING_OPTIMIZATION_STATUS);
    public static final CampaignErrorReason INVALID_TRACKING_URL = new CampaignErrorReason(_INVALID_TRACKING_URL);
    public static final CampaignErrorReason CANNOT_SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRACKING_SETTING = new CampaignErrorReason(_CANNOT_SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRACKING_SETTING);
    public static final CampaignErrorReason MAX_IMPRESSIONS_NOT_IN_RANGE = new CampaignErrorReason(_MAX_IMPRESSIONS_NOT_IN_RANGE);
    public static final CampaignErrorReason TIME_UNIT_NOT_SUPPORTED = new CampaignErrorReason(_TIME_UNIT_NOT_SUPPORTED);
    public static final CampaignErrorReason INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED = new CampaignErrorReason(_INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED);
    public static final CampaignErrorReason BUDGET_CANNOT_BE_SHARED = new CampaignErrorReason(_BUDGET_CANNOT_BE_SHARED);
    public static final CampaignErrorReason CAMPAIGN_CANNOT_USE_SHARED_BUDGET = new CampaignErrorReason(_CAMPAIGN_CANNOT_USE_SHARED_BUDGET);
    public static final CampaignErrorReason CANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_TRIALS = new CampaignErrorReason(_CANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_TRIALS);
    public static final CampaignErrorReason CAMPAIGN_LABEL_DOES_NOT_EXIST = new CampaignErrorReason(_CAMPAIGN_LABEL_DOES_NOT_EXIST);
    public static final CampaignErrorReason CAMPAIGN_LABEL_ALREADY_EXISTS = new CampaignErrorReason(_CAMPAIGN_LABEL_ALREADY_EXISTS);
    public static final CampaignErrorReason MISSING_SHOPPING_SETTING = new CampaignErrorReason(_MISSING_SHOPPING_SETTING);
    public static final CampaignErrorReason INVALID_SHOPPING_SALES_COUNTRY = new CampaignErrorReason(_INVALID_SHOPPING_SALES_COUNTRY);
    public static final CampaignErrorReason SHOPPING_MERCHANT_NOT_ALLOWED_FOR_PURCHASES_ON_GOOGLE = new CampaignErrorReason(_SHOPPING_MERCHANT_NOT_ALLOWED_FOR_PURCHASES_ON_GOOGLE);
    public static final CampaignErrorReason PURCHASES_ON_GOOGLE_NOT_SUPPORTED_FOR_SHOPPING_SALES_COUNTRY = new CampaignErrorReason(_PURCHASES_ON_GOOGLE_NOT_SUPPORTED_FOR_SHOPPING_SALES_COUNTRY);
    public static final CampaignErrorReason MISSING_UNIVERSAL_APP_CAMPAIGN_SETTING = new CampaignErrorReason(_MISSING_UNIVERSAL_APP_CAMPAIGN_SETTING);
    public static final CampaignErrorReason ADVERTISING_CHANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = new CampaignErrorReason(_ADVERTISING_CHANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_TYPE);
    public static final CampaignErrorReason INVALID_ADVERTISING_CHANNEL_SUB_TYPE = new CampaignErrorReason(_INVALID_ADVERTISING_CHANNEL_SUB_TYPE);
    public static final CampaignErrorReason AT_LEAST_ONE_CONVERSION_MUST_BE_SELECTED = new CampaignErrorReason(_AT_LEAST_ONE_CONVERSION_MUST_BE_SELECTED);
    public static final CampaignErrorReason CANNOT_SET_AD_ROTATION_MODE = new CampaignErrorReason(_CANNOT_SET_AD_ROTATION_MODE);
    public static final CampaignErrorReason UNKNOWN = new CampaignErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CampaignErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignErrorReason enumeration = (CampaignErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
