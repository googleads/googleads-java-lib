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
 * MultiplierErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class MultiplierErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MultiplierErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MULTIPLIER_TOO_HIGH = "MULTIPLIER_TOO_HIGH";
    public static final java.lang.String _MULTIPLIER_TOO_LOW = "MULTIPLIER_TOO_LOW";
    public static final java.lang.String _TOO_MANY_FRACTIONAL_DIGITS = "TOO_MANY_FRACTIONAL_DIGITS";
    public static final java.lang.String _MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY = "MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY";
    public static final java.lang.String _MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING = "MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING";
    public static final java.lang.String _NO_MULTIPLIER_SPECIFIED = "NO_MULTIPLIER_SPECIFIED";
    public static final java.lang.String _MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET = "MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET";
    public static final java.lang.String _MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET = "MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET";
    public static final java.lang.String _MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET = "MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET";
    public static final java.lang.String _MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID = "MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID";
    public static final java.lang.String _BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER = "BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER";
    public static final java.lang.String _MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH = "MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH";
    public static final java.lang.String _MULTIPLIER_ERROR = "MULTIPLIER_ERROR";
    public static final MultiplierErrorReason MULTIPLIER_TOO_HIGH = new MultiplierErrorReason(_MULTIPLIER_TOO_HIGH);
    public static final MultiplierErrorReason MULTIPLIER_TOO_LOW = new MultiplierErrorReason(_MULTIPLIER_TOO_LOW);
    public static final MultiplierErrorReason TOO_MANY_FRACTIONAL_DIGITS = new MultiplierErrorReason(_TOO_MANY_FRACTIONAL_DIGITS);
    public static final MultiplierErrorReason MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY = new MultiplierErrorReason(_MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY);
    public static final MultiplierErrorReason MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING = new MultiplierErrorReason(_MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING);
    public static final MultiplierErrorReason NO_MULTIPLIER_SPECIFIED = new MultiplierErrorReason(_NO_MULTIPLIER_SPECIFIED);
    public static final MultiplierErrorReason MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET = new MultiplierErrorReason(_MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET);
    public static final MultiplierErrorReason MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET = new MultiplierErrorReason(_MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET);
    public static final MultiplierErrorReason MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET = new MultiplierErrorReason(_MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET);
    public static final MultiplierErrorReason MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID = new MultiplierErrorReason(_MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID);
    public static final MultiplierErrorReason BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER = new MultiplierErrorReason(_BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER);
    public static final MultiplierErrorReason MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH = new MultiplierErrorReason(_MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH);
    public static final MultiplierErrorReason MULTIPLIER_ERROR = new MultiplierErrorReason(_MULTIPLIER_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static MultiplierErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MultiplierErrorReason enumeration = (MultiplierErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MultiplierErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MultiplierErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MultiplierError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
