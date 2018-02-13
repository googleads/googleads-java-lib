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
 * SetTopBoxLineItemErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class SetTopBoxLineItemErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SetTopBoxLineItemErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NON_SET_TOP_BOX_AD_UNIT_TARGETED = "NON_SET_TOP_BOX_AD_UNIT_TARGETED";
    public static final java.lang.String _AT_LEAST_ONE_AD_UNIT_MUST_BE_TARGETED = "AT_LEAST_ONE_AD_UNIT_MUST_BE_TARGETED";
    public static final java.lang.String _CANNOT_EXCLUDE_AD_UNITS = "CANNOT_EXCLUDE_AD_UNITS";
    public static final java.lang.String _POD_POSITION_OUT_OF_RANGE = "POD_POSITION_OUT_OF_RANGE";
    public static final java.lang.String _MIDROLL_POSITION_OUT_OF_RANGE = "MIDROLL_POSITION_OUT_OF_RANGE";
    public static final java.lang.String _FEATURE_NOT_ENABLED = "FEATURE_NOT_ENABLED";
    public static final java.lang.String _INVALID_ENVIRONMENT_TYPE = "INVALID_ENVIRONMENT_TYPE";
    public static final java.lang.String _COMPANIONS_NOT_SUPPORTED = "COMPANIONS_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_CREATIVE_SIZE = "INVALID_CREATIVE_SIZE";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE = "INVALID_LINE_ITEM_TYPE";
    public static final java.lang.String _ORDERS_WITH_STANDARD_LINE_ITEMS_CANNOT_CONTAIN_HOUSE_OR_SPONSORSHIP_LINE_ITEMS = "ORDERS_WITH_STANDARD_LINE_ITEMS_CANNOT_CONTAIN_HOUSE_OR_SPONSORSHIP_LINE_ITEMS";
    public static final java.lang.String _INVALID_COST_TYPE = "INVALID_COST_TYPE";
    public static final java.lang.String _COST_PER_UNIT_NOT_ALLOWED = "COST_PER_UNIT_NOT_ALLOWED";
    public static final java.lang.String _DISCOUNT_NOT_ALLOWED = "DISCOUNT_NOT_ALLOWED";
    public static final java.lang.String _FRONTLOADED_DELIVERY_RATE_NOT_SUPPORTED = "FRONTLOADED_DELIVERY_RATE_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_LINE_ITEM_STATUS_CHANGE = "INVALID_LINE_ITEM_STATUS_CHANGE";
    public static final java.lang.String _INVALID_LINE_ITEM_PRIORITY = "INVALID_LINE_ITEM_PRIORITY";
    public static final java.lang.String _SYNC_REVISION_NOT_INCREASING = "SYNC_REVISION_NOT_INCREASING";
    public static final java.lang.String _SYNC_REVISION_MUST_BE_GREATER_THAN_ZERO = "SYNC_REVISION_MUST_BE_GREATER_THAN_ZERO";
    public static final java.lang.String _CANNOT_UNARCHIVE_SET_TOP_BOX_LINE_ITEMS = "CANNOT_UNARCHIVE_SET_TOP_BOX_LINE_ITEMS";
    public static final java.lang.String _COPY_SET_TOP_BOX_ENABLED_LINE_ITEM_NOT_ALLOWED = "COPY_SET_TOP_BOX_ENABLED_LINE_ITEM_NOT_ALLOWED";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE_CHANGE = "INVALID_LINE_ITEM_TYPE_CHANGE";
    public static final java.lang.String _CREATIVE_ROTATION_TYPE_MUST_BE_EVENLY_OR_WEIGHTED = "CREATIVE_ROTATION_TYPE_MUST_BE_EVENLY_OR_WEIGHTED";
    public static final java.lang.String _INVALID_FREQUENCY_CAP_TIME_UNIT = "INVALID_FREQUENCY_CAP_TIME_UNIT";
    public static final java.lang.String _INVALID_FREQUENCY_CAP_TIME_RANGE = "INVALID_FREQUENCY_CAP_TIME_RANGE";
    public static final java.lang.String _INVALID_PRIMARY_GOAL_UNIT_TYPE = "INVALID_PRIMARY_GOAL_UNIT_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SetTopBoxLineItemErrorReason NON_SET_TOP_BOX_AD_UNIT_TARGETED = new SetTopBoxLineItemErrorReason(_NON_SET_TOP_BOX_AD_UNIT_TARGETED);
    public static final SetTopBoxLineItemErrorReason AT_LEAST_ONE_AD_UNIT_MUST_BE_TARGETED = new SetTopBoxLineItemErrorReason(_AT_LEAST_ONE_AD_UNIT_MUST_BE_TARGETED);
    public static final SetTopBoxLineItemErrorReason CANNOT_EXCLUDE_AD_UNITS = new SetTopBoxLineItemErrorReason(_CANNOT_EXCLUDE_AD_UNITS);
    public static final SetTopBoxLineItemErrorReason POD_POSITION_OUT_OF_RANGE = new SetTopBoxLineItemErrorReason(_POD_POSITION_OUT_OF_RANGE);
    public static final SetTopBoxLineItemErrorReason MIDROLL_POSITION_OUT_OF_RANGE = new SetTopBoxLineItemErrorReason(_MIDROLL_POSITION_OUT_OF_RANGE);
    public static final SetTopBoxLineItemErrorReason FEATURE_NOT_ENABLED = new SetTopBoxLineItemErrorReason(_FEATURE_NOT_ENABLED);
    public static final SetTopBoxLineItemErrorReason INVALID_ENVIRONMENT_TYPE = new SetTopBoxLineItemErrorReason(_INVALID_ENVIRONMENT_TYPE);
    public static final SetTopBoxLineItemErrorReason COMPANIONS_NOT_SUPPORTED = new SetTopBoxLineItemErrorReason(_COMPANIONS_NOT_SUPPORTED);
    public static final SetTopBoxLineItemErrorReason INVALID_CREATIVE_SIZE = new SetTopBoxLineItemErrorReason(_INVALID_CREATIVE_SIZE);
    public static final SetTopBoxLineItemErrorReason INVALID_LINE_ITEM_TYPE = new SetTopBoxLineItemErrorReason(_INVALID_LINE_ITEM_TYPE);
    public static final SetTopBoxLineItemErrorReason ORDERS_WITH_STANDARD_LINE_ITEMS_CANNOT_CONTAIN_HOUSE_OR_SPONSORSHIP_LINE_ITEMS = new SetTopBoxLineItemErrorReason(_ORDERS_WITH_STANDARD_LINE_ITEMS_CANNOT_CONTAIN_HOUSE_OR_SPONSORSHIP_LINE_ITEMS);
    public static final SetTopBoxLineItemErrorReason INVALID_COST_TYPE = new SetTopBoxLineItemErrorReason(_INVALID_COST_TYPE);
    public static final SetTopBoxLineItemErrorReason COST_PER_UNIT_NOT_ALLOWED = new SetTopBoxLineItemErrorReason(_COST_PER_UNIT_NOT_ALLOWED);
    public static final SetTopBoxLineItemErrorReason DISCOUNT_NOT_ALLOWED = new SetTopBoxLineItemErrorReason(_DISCOUNT_NOT_ALLOWED);
    public static final SetTopBoxLineItemErrorReason FRONTLOADED_DELIVERY_RATE_NOT_SUPPORTED = new SetTopBoxLineItemErrorReason(_FRONTLOADED_DELIVERY_RATE_NOT_SUPPORTED);
    public static final SetTopBoxLineItemErrorReason INVALID_LINE_ITEM_STATUS_CHANGE = new SetTopBoxLineItemErrorReason(_INVALID_LINE_ITEM_STATUS_CHANGE);
    public static final SetTopBoxLineItemErrorReason INVALID_LINE_ITEM_PRIORITY = new SetTopBoxLineItemErrorReason(_INVALID_LINE_ITEM_PRIORITY);
    public static final SetTopBoxLineItemErrorReason SYNC_REVISION_NOT_INCREASING = new SetTopBoxLineItemErrorReason(_SYNC_REVISION_NOT_INCREASING);
    public static final SetTopBoxLineItemErrorReason SYNC_REVISION_MUST_BE_GREATER_THAN_ZERO = new SetTopBoxLineItemErrorReason(_SYNC_REVISION_MUST_BE_GREATER_THAN_ZERO);
    public static final SetTopBoxLineItemErrorReason CANNOT_UNARCHIVE_SET_TOP_BOX_LINE_ITEMS = new SetTopBoxLineItemErrorReason(_CANNOT_UNARCHIVE_SET_TOP_BOX_LINE_ITEMS);
    public static final SetTopBoxLineItemErrorReason COPY_SET_TOP_BOX_ENABLED_LINE_ITEM_NOT_ALLOWED = new SetTopBoxLineItemErrorReason(_COPY_SET_TOP_BOX_ENABLED_LINE_ITEM_NOT_ALLOWED);
    public static final SetTopBoxLineItemErrorReason INVALID_LINE_ITEM_TYPE_CHANGE = new SetTopBoxLineItemErrorReason(_INVALID_LINE_ITEM_TYPE_CHANGE);
    public static final SetTopBoxLineItemErrorReason CREATIVE_ROTATION_TYPE_MUST_BE_EVENLY_OR_WEIGHTED = new SetTopBoxLineItemErrorReason(_CREATIVE_ROTATION_TYPE_MUST_BE_EVENLY_OR_WEIGHTED);
    public static final SetTopBoxLineItemErrorReason INVALID_FREQUENCY_CAP_TIME_UNIT = new SetTopBoxLineItemErrorReason(_INVALID_FREQUENCY_CAP_TIME_UNIT);
    public static final SetTopBoxLineItemErrorReason INVALID_FREQUENCY_CAP_TIME_RANGE = new SetTopBoxLineItemErrorReason(_INVALID_FREQUENCY_CAP_TIME_RANGE);
    public static final SetTopBoxLineItemErrorReason INVALID_PRIMARY_GOAL_UNIT_TYPE = new SetTopBoxLineItemErrorReason(_INVALID_PRIMARY_GOAL_UNIT_TYPE);
    public static final SetTopBoxLineItemErrorReason UNKNOWN = new SetTopBoxLineItemErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SetTopBoxLineItemErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SetTopBoxLineItemErrorReason enumeration = (SetTopBoxLineItemErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SetTopBoxLineItemErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SetTopBoxLineItemErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SetTopBoxLineItemError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
