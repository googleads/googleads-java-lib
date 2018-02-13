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
 * ProposalLineItemErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ProposalLineItemErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProposalLineItemErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_SAME_RATE_CARD = "NOT_SAME_RATE_CARD";
    public static final java.lang.String _LINE_ITEM_TYPE_NOT_ALLOWED = "LINE_ITEM_TYPE_NOT_ALLOWED";
    public static final java.lang.String _END_DATE_TIME_NOT_AFTER_START_TIME = "END_DATE_TIME_NOT_AFTER_START_TIME";
    public static final java.lang.String _END_DATE_TIME_TOO_LATE = "END_DATE_TIME_TOO_LATE";
    public static final java.lang.String _START_DATE_TIME_IS_IN_PAST = "START_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _END_DATE_TIME_IS_IN_PAST = "END_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _FRONTLOADED_NOT_ALLOWED = "FRONTLOADED_NOT_ALLOWED";
    public static final java.lang.String _ALL_ROADBLOCK_NOT_ALLOWED = "ALL_ROADBLOCK_NOT_ALLOWED";
    public static final java.lang.String _CREATIVE_SET_ROADBLOCK_NOT_ALLOWED = "CREATIVE_SET_ROADBLOCK_NOT_ALLOWED";
    public static final java.lang.String _ALREADY_STARTED = "ALREADY_STARTED";
    public static final java.lang.String _CONFLICT_WITH_PRODUCT = "CONFLICT_WITH_PRODUCT";
    public static final java.lang.String _VIOLATE_BUILT_IN_TARGETING_COMPATIBILITY_RESTRICTION = "VIOLATE_BUILT_IN_TARGETING_COMPATIBILITY_RESTRICTION";
    public static final java.lang.String _VIOLATE_BUILT_IN_TARGETING_LOCKED_RESTRICTION = "VIOLATE_BUILT_IN_TARGETING_LOCKED_RESTRICTION";
    public static final java.lang.String _MOBILE_TECH_CRITERIA_NOT_SUPPORTED = "MOBILE_TECH_CRITERIA_NOT_SUPPORTED";
    public static final java.lang.String _UNSUPPORTED_TARGETING_TYPE = "UNSUPPORTED_TARGETING_TYPE";
    public static final java.lang.String _WRONG_COST = "WRONG_COST";
    public static final java.lang.String _AGENCY_COMMISSION_MISMATCH = "AGENCY_COMMISSION_MISMATCH";
    public static final java.lang.String _CALCULATED_COST_TOO_HIGH = "CALCULATED_COST_TOO_HIGH";
    public static final java.lang.String _INVALID_PRIORITY_FOR_LINE_ITEM_TYPE = "INVALID_PRIORITY_FOR_LINE_ITEM_TYPE";
    public static final java.lang.String _UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED = "UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK = "CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK";
    public static final java.lang.String _SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED = "SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_RESERVATION_NOT_ALLOWED = "UPDATE_RESERVATION_NOT_ALLOWED";
    public static final java.lang.String _INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE = "INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE";
    public static final java.lang.String _INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE = "INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE";
    public static final java.lang.String _INCONSISTENT_ROADBLOCK_TYPE = "INCONSISTENT_ROADBLOCK_TYPE";
    public static final java.lang.String _INVALID_CONTRACTED_QUANTITY_BUFFER = "INVALID_CONTRACTED_QUANTITY_BUFFER";
    public static final java.lang.String _INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE = "INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE";
    public static final java.lang.String _UPDATE_COST_ADJUSTMENT_NOT_ALLOWED = "UPDATE_COST_ADJUSTMENT_NOT_ALLOWED";
    public static final java.lang.String _UNSUPPORTED_RATE_CARD_CURRENCY_CODE = "UNSUPPORTED_RATE_CARD_CURRENCY_CODE";
    public static final java.lang.String _END_DATE_TIME_IS_BEFORE_LAST_PAUSED_TIME = "END_DATE_TIME_IS_BEFORE_LAST_PAUSED_TIME";
    public static final java.lang.String _VIDEO_INVALID_ROADBLOCKING = "VIDEO_INVALID_ROADBLOCKING";
    public static final java.lang.String _UPDATE_TIME_ZONE_NOT_ALLOWED = "UPDATE_TIME_ZONE_NOT_ALLOWED";
    public static final java.lang.String _INVALID_TIME_ZONE_FOR_RATE_TYPE = "INVALID_TIME_ZONE_FOR_RATE_TYPE";
    public static final java.lang.String _INVALID_TIME_ZONE_FOR_DEALS = "INVALID_TIME_ZONE_FOR_DEALS";
    public static final java.lang.String _INVALID_ENVIRONMENT_TYPE = "INVALID_ENVIRONMENT_TYPE";
    public static final java.lang.String _SIZE_REQUIRED = "SIZE_REQUIRED";
    public static final java.lang.String _COMPANION_NOT_ALLOWED = "COMPANION_NOT_ALLOWED";
    public static final java.lang.String _MISSING_COMPANION = "MISSING_COMPANION";
    public static final java.lang.String _DUPLICATED_MASTER_SIZE = "DUPLICATED_MASTER_SIZE";
    public static final java.lang.String _INVALID_EXPECTED_CREATIVE_COUNT = "INVALID_EXPECTED_CREATIVE_COUNT";
    public static final java.lang.String _CANNOT_HAVE_CREATIVE_TEMPLATE = "CANNOT_HAVE_CREATIVE_TEMPLATE";
    public static final java.lang.String _NATIVE_CREATIVE_TEMPLATE_REQUIRED = "NATIVE_CREATIVE_TEMPLATE_REQUIRED";
    public static final java.lang.String _CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID = "CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID";
    public static final java.lang.String _INVALID_CLICK_TRACKING_LINE_ITEM_TYPE = "INVALID_CLICK_TRACKING_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_TARGETING_FOR_CLICK_TRACKING = "INVALID_TARGETING_FOR_CLICK_TRACKING";
    public static final java.lang.String _NOT_SAME_RATE_CARD_PRICING_MODEL = "NOT_SAME_RATE_CARD_PRICING_MODEL";
    public static final java.lang.String _NOT_SAME_RATE_CARD_WORKFLOW = "NOT_SAME_RATE_CARD_WORKFLOW";
    public static final java.lang.String _INVALID_CONTRACTED_UNITS_BOUGHT = "INVALID_CONTRACTED_UNITS_BOUGHT";
    public static final java.lang.String _PLACEHOLDER_CANNOT_CONTAIN_LABELS = "PLACEHOLDER_CANNOT_CONTAIN_LABELS";
    public static final java.lang.String _INVALID_LABEL_TYPE_IN_PLACEHOLDER = "INVALID_LABEL_TYPE_IN_PLACEHOLDER";
    public static final java.lang.String _PLACEHOLDER_CANNOT_CONTAIN_NEGATED_LABELS = "PLACEHOLDER_CANNOT_CONTAIN_NEGATED_LABELS";
    public static final java.lang.String _MARKETPLACE_RATE_CARD_NOT_ALLOWED = "MARKETPLACE_RATE_CARD_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_CREATE_FROM_PRODUCT = "CANNOT_CREATE_FROM_PRODUCT";
    public static final java.lang.String _CONTRACTED_UNITS_LESS_THAN_DELIVERED = "CONTRACTED_UNITS_LESS_THAN_DELIVERED";
    public static final java.lang.String _DISPLAY_ENVIRONMENT_MUST_HAVE_EXCLUDED_MOBILE_APPS_TARGETING = "DISPLAY_ENVIRONMENT_MUST_HAVE_EXCLUDED_MOBILE_APPS_TARGETING";
    public static final java.lang.String _MOBILE_ENVIRONMENT_MUST_HAVE_INCLUDED_MOBILE_APPS_TARGETING = "MOBILE_ENVIRONMENT_MUST_HAVE_INCLUDED_MOBILE_APPS_TARGETING";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProposalLineItemErrorReason NOT_SAME_RATE_CARD = new ProposalLineItemErrorReason(_NOT_SAME_RATE_CARD);
    public static final ProposalLineItemErrorReason LINE_ITEM_TYPE_NOT_ALLOWED = new ProposalLineItemErrorReason(_LINE_ITEM_TYPE_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason END_DATE_TIME_NOT_AFTER_START_TIME = new ProposalLineItemErrorReason(_END_DATE_TIME_NOT_AFTER_START_TIME);
    public static final ProposalLineItemErrorReason END_DATE_TIME_TOO_LATE = new ProposalLineItemErrorReason(_END_DATE_TIME_TOO_LATE);
    public static final ProposalLineItemErrorReason START_DATE_TIME_IS_IN_PAST = new ProposalLineItemErrorReason(_START_DATE_TIME_IS_IN_PAST);
    public static final ProposalLineItemErrorReason END_DATE_TIME_IS_IN_PAST = new ProposalLineItemErrorReason(_END_DATE_TIME_IS_IN_PAST);
    public static final ProposalLineItemErrorReason FRONTLOADED_NOT_ALLOWED = new ProposalLineItemErrorReason(_FRONTLOADED_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason ALL_ROADBLOCK_NOT_ALLOWED = new ProposalLineItemErrorReason(_ALL_ROADBLOCK_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason CREATIVE_SET_ROADBLOCK_NOT_ALLOWED = new ProposalLineItemErrorReason(_CREATIVE_SET_ROADBLOCK_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason ALREADY_STARTED = new ProposalLineItemErrorReason(_ALREADY_STARTED);
    public static final ProposalLineItemErrorReason CONFLICT_WITH_PRODUCT = new ProposalLineItemErrorReason(_CONFLICT_WITH_PRODUCT);
    public static final ProposalLineItemErrorReason VIOLATE_BUILT_IN_TARGETING_COMPATIBILITY_RESTRICTION = new ProposalLineItemErrorReason(_VIOLATE_BUILT_IN_TARGETING_COMPATIBILITY_RESTRICTION);
    public static final ProposalLineItemErrorReason VIOLATE_BUILT_IN_TARGETING_LOCKED_RESTRICTION = new ProposalLineItemErrorReason(_VIOLATE_BUILT_IN_TARGETING_LOCKED_RESTRICTION);
    public static final ProposalLineItemErrorReason MOBILE_TECH_CRITERIA_NOT_SUPPORTED = new ProposalLineItemErrorReason(_MOBILE_TECH_CRITERIA_NOT_SUPPORTED);
    public static final ProposalLineItemErrorReason UNSUPPORTED_TARGETING_TYPE = new ProposalLineItemErrorReason(_UNSUPPORTED_TARGETING_TYPE);
    public static final ProposalLineItemErrorReason WRONG_COST = new ProposalLineItemErrorReason(_WRONG_COST);
    public static final ProposalLineItemErrorReason AGENCY_COMMISSION_MISMATCH = new ProposalLineItemErrorReason(_AGENCY_COMMISSION_MISMATCH);
    public static final ProposalLineItemErrorReason CALCULATED_COST_TOO_HIGH = new ProposalLineItemErrorReason(_CALCULATED_COST_TOO_HIGH);
    public static final ProposalLineItemErrorReason INVALID_PRIORITY_FOR_LINE_ITEM_TYPE = new ProposalLineItemErrorReason(_INVALID_PRIORITY_FOR_LINE_ITEM_TYPE);
    public static final ProposalLineItemErrorReason UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED = new ProposalLineItemErrorReason(_UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK = new ProposalLineItemErrorReason(_CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK);
    public static final ProposalLineItemErrorReason SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED = new ProposalLineItemErrorReason(_SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason UPDATE_RESERVATION_NOT_ALLOWED = new ProposalLineItemErrorReason(_UPDATE_RESERVATION_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE = new ProposalLineItemErrorReason(_INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE);
    public static final ProposalLineItemErrorReason INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE = new ProposalLineItemErrorReason(_INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE);
    public static final ProposalLineItemErrorReason INCONSISTENT_ROADBLOCK_TYPE = new ProposalLineItemErrorReason(_INCONSISTENT_ROADBLOCK_TYPE);
    public static final ProposalLineItemErrorReason INVALID_CONTRACTED_QUANTITY_BUFFER = new ProposalLineItemErrorReason(_INVALID_CONTRACTED_QUANTITY_BUFFER);
    public static final ProposalLineItemErrorReason INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE = new ProposalLineItemErrorReason(_INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE);
    public static final ProposalLineItemErrorReason UPDATE_COST_ADJUSTMENT_NOT_ALLOWED = new ProposalLineItemErrorReason(_UPDATE_COST_ADJUSTMENT_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason UNSUPPORTED_RATE_CARD_CURRENCY_CODE = new ProposalLineItemErrorReason(_UNSUPPORTED_RATE_CARD_CURRENCY_CODE);
    public static final ProposalLineItemErrorReason END_DATE_TIME_IS_BEFORE_LAST_PAUSED_TIME = new ProposalLineItemErrorReason(_END_DATE_TIME_IS_BEFORE_LAST_PAUSED_TIME);
    public static final ProposalLineItemErrorReason VIDEO_INVALID_ROADBLOCKING = new ProposalLineItemErrorReason(_VIDEO_INVALID_ROADBLOCKING);
    public static final ProposalLineItemErrorReason UPDATE_TIME_ZONE_NOT_ALLOWED = new ProposalLineItemErrorReason(_UPDATE_TIME_ZONE_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason INVALID_TIME_ZONE_FOR_RATE_TYPE = new ProposalLineItemErrorReason(_INVALID_TIME_ZONE_FOR_RATE_TYPE);
    public static final ProposalLineItemErrorReason INVALID_TIME_ZONE_FOR_DEALS = new ProposalLineItemErrorReason(_INVALID_TIME_ZONE_FOR_DEALS);
    public static final ProposalLineItemErrorReason INVALID_ENVIRONMENT_TYPE = new ProposalLineItemErrorReason(_INVALID_ENVIRONMENT_TYPE);
    public static final ProposalLineItemErrorReason SIZE_REQUIRED = new ProposalLineItemErrorReason(_SIZE_REQUIRED);
    public static final ProposalLineItemErrorReason COMPANION_NOT_ALLOWED = new ProposalLineItemErrorReason(_COMPANION_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason MISSING_COMPANION = new ProposalLineItemErrorReason(_MISSING_COMPANION);
    public static final ProposalLineItemErrorReason DUPLICATED_MASTER_SIZE = new ProposalLineItemErrorReason(_DUPLICATED_MASTER_SIZE);
    public static final ProposalLineItemErrorReason INVALID_EXPECTED_CREATIVE_COUNT = new ProposalLineItemErrorReason(_INVALID_EXPECTED_CREATIVE_COUNT);
    public static final ProposalLineItemErrorReason CANNOT_HAVE_CREATIVE_TEMPLATE = new ProposalLineItemErrorReason(_CANNOT_HAVE_CREATIVE_TEMPLATE);
    public static final ProposalLineItemErrorReason NATIVE_CREATIVE_TEMPLATE_REQUIRED = new ProposalLineItemErrorReason(_NATIVE_CREATIVE_TEMPLATE_REQUIRED);
    public static final ProposalLineItemErrorReason CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID = new ProposalLineItemErrorReason(_CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID);
    public static final ProposalLineItemErrorReason INVALID_CLICK_TRACKING_LINE_ITEM_TYPE = new ProposalLineItemErrorReason(_INVALID_CLICK_TRACKING_LINE_ITEM_TYPE);
    public static final ProposalLineItemErrorReason INVALID_TARGETING_FOR_CLICK_TRACKING = new ProposalLineItemErrorReason(_INVALID_TARGETING_FOR_CLICK_TRACKING);
    public static final ProposalLineItemErrorReason NOT_SAME_RATE_CARD_PRICING_MODEL = new ProposalLineItemErrorReason(_NOT_SAME_RATE_CARD_PRICING_MODEL);
    public static final ProposalLineItemErrorReason NOT_SAME_RATE_CARD_WORKFLOW = new ProposalLineItemErrorReason(_NOT_SAME_RATE_CARD_WORKFLOW);
    public static final ProposalLineItemErrorReason INVALID_CONTRACTED_UNITS_BOUGHT = new ProposalLineItemErrorReason(_INVALID_CONTRACTED_UNITS_BOUGHT);
    public static final ProposalLineItemErrorReason PLACEHOLDER_CANNOT_CONTAIN_LABELS = new ProposalLineItemErrorReason(_PLACEHOLDER_CANNOT_CONTAIN_LABELS);
    public static final ProposalLineItemErrorReason INVALID_LABEL_TYPE_IN_PLACEHOLDER = new ProposalLineItemErrorReason(_INVALID_LABEL_TYPE_IN_PLACEHOLDER);
    public static final ProposalLineItemErrorReason PLACEHOLDER_CANNOT_CONTAIN_NEGATED_LABELS = new ProposalLineItemErrorReason(_PLACEHOLDER_CANNOT_CONTAIN_NEGATED_LABELS);
    public static final ProposalLineItemErrorReason MARKETPLACE_RATE_CARD_NOT_ALLOWED = new ProposalLineItemErrorReason(_MARKETPLACE_RATE_CARD_NOT_ALLOWED);
    public static final ProposalLineItemErrorReason CANNOT_CREATE_FROM_PRODUCT = new ProposalLineItemErrorReason(_CANNOT_CREATE_FROM_PRODUCT);
    public static final ProposalLineItemErrorReason CONTRACTED_UNITS_LESS_THAN_DELIVERED = new ProposalLineItemErrorReason(_CONTRACTED_UNITS_LESS_THAN_DELIVERED);
    public static final ProposalLineItemErrorReason DISPLAY_ENVIRONMENT_MUST_HAVE_EXCLUDED_MOBILE_APPS_TARGETING = new ProposalLineItemErrorReason(_DISPLAY_ENVIRONMENT_MUST_HAVE_EXCLUDED_MOBILE_APPS_TARGETING);
    public static final ProposalLineItemErrorReason MOBILE_ENVIRONMENT_MUST_HAVE_INCLUDED_MOBILE_APPS_TARGETING = new ProposalLineItemErrorReason(_MOBILE_ENVIRONMENT_MUST_HAVE_INCLUDED_MOBILE_APPS_TARGETING);
    public static final ProposalLineItemErrorReason UNKNOWN = new ProposalLineItemErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProposalLineItemErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProposalLineItemErrorReason enumeration = (ProposalLineItemErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProposalLineItemErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProposalLineItemErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLineItemError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
