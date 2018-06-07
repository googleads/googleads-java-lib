// Copyright 2018 Google LLC
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
 * OfflineConversionAdjustmentErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public class OfflineConversionAdjustmentErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OfflineConversionAdjustmentErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RETRACTION_WITH_VALUE_OR_CURRENCY = "RETRACTION_WITH_VALUE_OR_CURRENCY";
    public static final java.lang.String _RESTATEMENT_WITHOUT_VALUE = "RESTATEMENT_WITHOUT_VALUE";
    public static final java.lang.String _FUTURE_CONVERSION_TIME = "FUTURE_CONVERSION_TIME";
    public static final java.lang.String _FUTURE_ADJUSTMENT_TIME = "FUTURE_ADJUSTMENT_TIME";
    public static final java.lang.String _TOO_RECENT_CONVERSION_TYPE = "TOO_RECENT_CONVERSION_TYPE";
    public static final java.lang.String _INVALID_CONVERSION_TYPE = "INVALID_CONVERSION_TYPE";
    public static final java.lang.String _CONVERSION_ALREADY_CANCELED = "CONVERSION_ALREADY_CANCELED";
    public static final java.lang.String _CONVERSION_NOT_FOUND = "CONVERSION_NOT_FOUND";
    public static final java.lang.String _CONVERSION_EXPIRED = "CONVERSION_EXPIRED";
    public static final java.lang.String _ADJUSTMENT_PRECEDES_CONVERSION = "ADJUSTMENT_PRECEDES_CONVERSION";
    public static final java.lang.String _MORE_RECENT_RESTATEMENT_FOUND = "MORE_RECENT_RESTATEMENT_FOUND";
    public static final java.lang.String _ATTRIBUTED_CONVERSION_NOT_SUPPORTED = "ATTRIBUTED_CONVERSION_NOT_SUPPORTED";
    public static final java.lang.String _TOO_RECENT_CONVERSION = "TOO_RECENT_CONVERSION";
    public static final java.lang.String _INVALID_ORDER_ID = "INVALID_ORDER_ID";
    public static final java.lang.String _CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE = "CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final OfflineConversionAdjustmentErrorReason RETRACTION_WITH_VALUE_OR_CURRENCY = new OfflineConversionAdjustmentErrorReason(_RETRACTION_WITH_VALUE_OR_CURRENCY);
    public static final OfflineConversionAdjustmentErrorReason RESTATEMENT_WITHOUT_VALUE = new OfflineConversionAdjustmentErrorReason(_RESTATEMENT_WITHOUT_VALUE);
    public static final OfflineConversionAdjustmentErrorReason FUTURE_CONVERSION_TIME = new OfflineConversionAdjustmentErrorReason(_FUTURE_CONVERSION_TIME);
    public static final OfflineConversionAdjustmentErrorReason FUTURE_ADJUSTMENT_TIME = new OfflineConversionAdjustmentErrorReason(_FUTURE_ADJUSTMENT_TIME);
    public static final OfflineConversionAdjustmentErrorReason TOO_RECENT_CONVERSION_TYPE = new OfflineConversionAdjustmentErrorReason(_TOO_RECENT_CONVERSION_TYPE);
    public static final OfflineConversionAdjustmentErrorReason INVALID_CONVERSION_TYPE = new OfflineConversionAdjustmentErrorReason(_INVALID_CONVERSION_TYPE);
    public static final OfflineConversionAdjustmentErrorReason CONVERSION_ALREADY_CANCELED = new OfflineConversionAdjustmentErrorReason(_CONVERSION_ALREADY_CANCELED);
    public static final OfflineConversionAdjustmentErrorReason CONVERSION_NOT_FOUND = new OfflineConversionAdjustmentErrorReason(_CONVERSION_NOT_FOUND);
    public static final OfflineConversionAdjustmentErrorReason CONVERSION_EXPIRED = new OfflineConversionAdjustmentErrorReason(_CONVERSION_EXPIRED);
    public static final OfflineConversionAdjustmentErrorReason ADJUSTMENT_PRECEDES_CONVERSION = new OfflineConversionAdjustmentErrorReason(_ADJUSTMENT_PRECEDES_CONVERSION);
    public static final OfflineConversionAdjustmentErrorReason MORE_RECENT_RESTATEMENT_FOUND = new OfflineConversionAdjustmentErrorReason(_MORE_RECENT_RESTATEMENT_FOUND);
    public static final OfflineConversionAdjustmentErrorReason ATTRIBUTED_CONVERSION_NOT_SUPPORTED = new OfflineConversionAdjustmentErrorReason(_ATTRIBUTED_CONVERSION_NOT_SUPPORTED);
    public static final OfflineConversionAdjustmentErrorReason TOO_RECENT_CONVERSION = new OfflineConversionAdjustmentErrorReason(_TOO_RECENT_CONVERSION);
    public static final OfflineConversionAdjustmentErrorReason INVALID_ORDER_ID = new OfflineConversionAdjustmentErrorReason(_INVALID_ORDER_ID);
    public static final OfflineConversionAdjustmentErrorReason CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE = new OfflineConversionAdjustmentErrorReason(_CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE);
    public static final OfflineConversionAdjustmentErrorReason UNKNOWN = new OfflineConversionAdjustmentErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static OfflineConversionAdjustmentErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OfflineConversionAdjustmentErrorReason enumeration = (OfflineConversionAdjustmentErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OfflineConversionAdjustmentErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OfflineConversionAdjustmentErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "OfflineConversionAdjustmentError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
