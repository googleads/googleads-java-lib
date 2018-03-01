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
 * BiddingErrorsReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class BiddingErrorsReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BiddingErrorsReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED = "BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_OVERRIDES = "BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_OVERRIDES";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_CRITERIA_OVERRIDES = "BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_CRITERIA_OVERRIDES";
    public static final java.lang.String _CAMPAIGN_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN = "CAMPAIGN_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN";
    public static final java.lang.String _ADGROUP_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN = "ADGROUP_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN";
    public static final java.lang.String _CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN = "CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN";
    public static final java.lang.String _CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP = "CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP";
    public static final java.lang.String _CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP_CRITERIA = "CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP_CRITERIA";
    public static final java.lang.String _INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE = "INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE";
    public static final java.lang.String _BIDS_NOT_ALLLOWED = "BIDS_NOT_ALLLOWED";
    public static final java.lang.String _DUPLICATE_BIDS = "DUPLICATE_BIDS";
    public static final java.lang.String _INVALID_BIDDING_SCHEME = "INVALID_BIDDING_SCHEME";
    public static final java.lang.String _INVALID_BIDDING_STRATEGY_TYPE = "INVALID_BIDDING_STRATEGY_TYPE";
    public static final java.lang.String _MISSING_BIDDING_STRATEGY_TYPE = "MISSING_BIDDING_STRATEGY_TYPE";
    public static final java.lang.String _NULL_BID = "NULL_BID";
    public static final java.lang.String _INVALID_BID = "INVALID_BID";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = "BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE";
    public static final java.lang.String _CONVERSION_TRACKING_NOT_ENABLED = "CONVERSION_TRACKING_NOT_ENABLED";
    public static final java.lang.String _NOT_ENOUGH_CONVERSIONS = "NOT_ENOUGH_CONVERSIONS";
    public static final java.lang.String _CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY = "CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY";
    public static final java.lang.String _CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_AD_GROUP_LEVEL_POP_BIDDING_STRATEGY = "CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_AD_GROUP_LEVEL_POP_BIDDING_STRATEGY";
    public static final java.lang.String _CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY = "CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE = "BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE";
    public static final java.lang.String _PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER = "PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER";
    public static final java.lang.String _PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA = "PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS = "BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS = "BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS";
    public static final java.lang.String _BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION = "BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION";
    public static final java.lang.String _BID_TOO_SMALL = "BID_TOO_SMALL";
    public static final java.lang.String _BID_TOO_BIG = "BID_TOO_BIG";
    public static final java.lang.String _BID_TOO_MANY_FRACTIONAL_DIGITS = "BID_TOO_MANY_FRACTIONAL_DIGITS";
    public static final java.lang.String _ENHANCED_CPC_ENABLED_NOT_SUPPORTED_ON_PORTFOLIO_TARGET_SPEND_STRATEGY = "ENHANCED_CPC_ENABLED_NOT_SUPPORTED_ON_PORTFOLIO_TARGET_SPEND_STRATEGY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BiddingErrorsReason BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED = new BiddingErrorsReason(_BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED);
    public static final BiddingErrorsReason BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_OVERRIDES = new BiddingErrorsReason(_BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_OVERRIDES);
    public static final BiddingErrorsReason BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_CRITERIA_OVERRIDES = new BiddingErrorsReason(_BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_CRITERIA_OVERRIDES);
    public static final BiddingErrorsReason CAMPAIGN_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN = new BiddingErrorsReason(_CAMPAIGN_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN);
    public static final BiddingErrorsReason ADGROUP_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN = new BiddingErrorsReason(_ADGROUP_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN);
    public static final BiddingErrorsReason CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN = new BiddingErrorsReason(_CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN);
    public static final BiddingErrorsReason CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP = new BiddingErrorsReason(_CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP);
    public static final BiddingErrorsReason CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP_CRITERIA = new BiddingErrorsReason(_CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP_CRITERIA);
    public static final BiddingErrorsReason INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE = new BiddingErrorsReason(_INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE);
    public static final BiddingErrorsReason BIDS_NOT_ALLLOWED = new BiddingErrorsReason(_BIDS_NOT_ALLLOWED);
    public static final BiddingErrorsReason DUPLICATE_BIDS = new BiddingErrorsReason(_DUPLICATE_BIDS);
    public static final BiddingErrorsReason INVALID_BIDDING_SCHEME = new BiddingErrorsReason(_INVALID_BIDDING_SCHEME);
    public static final BiddingErrorsReason INVALID_BIDDING_STRATEGY_TYPE = new BiddingErrorsReason(_INVALID_BIDDING_STRATEGY_TYPE);
    public static final BiddingErrorsReason MISSING_BIDDING_STRATEGY_TYPE = new BiddingErrorsReason(_MISSING_BIDDING_STRATEGY_TYPE);
    public static final BiddingErrorsReason NULL_BID = new BiddingErrorsReason(_NULL_BID);
    public static final BiddingErrorsReason INVALID_BID = new BiddingErrorsReason(_INVALID_BID);
    public static final BiddingErrorsReason BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = new BiddingErrorsReason(_BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE);
    public static final BiddingErrorsReason CONVERSION_TRACKING_NOT_ENABLED = new BiddingErrorsReason(_CONVERSION_TRACKING_NOT_ENABLED);
    public static final BiddingErrorsReason NOT_ENOUGH_CONVERSIONS = new BiddingErrorsReason(_NOT_ENOUGH_CONVERSIONS);
    public static final BiddingErrorsReason CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY = new BiddingErrorsReason(_CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY);
    public static final BiddingErrorsReason CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_AD_GROUP_LEVEL_POP_BIDDING_STRATEGY = new BiddingErrorsReason(_CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_AD_GROUP_LEVEL_POP_BIDDING_STRATEGY);
    public static final BiddingErrorsReason CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY = new BiddingErrorsReason(_CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY);
    public static final BiddingErrorsReason BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE = new BiddingErrorsReason(_BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE);
    public static final BiddingErrorsReason PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER = new BiddingErrorsReason(_PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER);
    public static final BiddingErrorsReason PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA = new BiddingErrorsReason(_PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA);
    public static final BiddingErrorsReason BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS = new BiddingErrorsReason(_BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS);
    public static final BiddingErrorsReason BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS = new BiddingErrorsReason(_BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS);
    public static final BiddingErrorsReason BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION = new BiddingErrorsReason(_BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION);
    public static final BiddingErrorsReason BID_TOO_SMALL = new BiddingErrorsReason(_BID_TOO_SMALL);
    public static final BiddingErrorsReason BID_TOO_BIG = new BiddingErrorsReason(_BID_TOO_BIG);
    public static final BiddingErrorsReason BID_TOO_MANY_FRACTIONAL_DIGITS = new BiddingErrorsReason(_BID_TOO_MANY_FRACTIONAL_DIGITS);
    public static final BiddingErrorsReason ENHANCED_CPC_ENABLED_NOT_SUPPORTED_ON_PORTFOLIO_TARGET_SPEND_STRATEGY = new BiddingErrorsReason(_ENHANCED_CPC_ENABLED_NOT_SUPPORTED_ON_PORTFOLIO_TARGET_SPEND_STRATEGY);
    public static final BiddingErrorsReason UNKNOWN = new BiddingErrorsReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BiddingErrorsReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BiddingErrorsReason enumeration = (BiddingErrorsReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BiddingErrorsReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BiddingErrorsReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingErrors.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
