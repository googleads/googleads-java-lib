// Copyright 2024 Google LLC
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
 * ClickTrackingLineItemErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;

public class ClickTrackingLineItemErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ClickTrackingLineItemErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TYPE_IMMUTABLE = "TYPE_IMMUTABLE";
    public static final java.lang.String _INVALID_TARGETING_TYPE = "INVALID_TARGETING_TYPE";
    public static final java.lang.String _INVALID_ROADBLOCKING_TYPE = "INVALID_ROADBLOCKING_TYPE";
    public static final java.lang.String _INVALID_CREATIVEROTATION_TYPE = "INVALID_CREATIVEROTATION_TYPE";
    public static final java.lang.String _INVALID_DELIVERY_RATE_TYPE = "INVALID_DELIVERY_RATE_TYPE";
    public static final java.lang.String _UNSUPPORTED_FIELD = "UNSUPPORTED_FIELD";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ClickTrackingLineItemErrorReason TYPE_IMMUTABLE = new ClickTrackingLineItemErrorReason(_TYPE_IMMUTABLE);
    public static final ClickTrackingLineItemErrorReason INVALID_TARGETING_TYPE = new ClickTrackingLineItemErrorReason(_INVALID_TARGETING_TYPE);
    public static final ClickTrackingLineItemErrorReason INVALID_ROADBLOCKING_TYPE = new ClickTrackingLineItemErrorReason(_INVALID_ROADBLOCKING_TYPE);
    public static final ClickTrackingLineItemErrorReason INVALID_CREATIVEROTATION_TYPE = new ClickTrackingLineItemErrorReason(_INVALID_CREATIVEROTATION_TYPE);
    public static final ClickTrackingLineItemErrorReason INVALID_DELIVERY_RATE_TYPE = new ClickTrackingLineItemErrorReason(_INVALID_DELIVERY_RATE_TYPE);
    public static final ClickTrackingLineItemErrorReason UNSUPPORTED_FIELD = new ClickTrackingLineItemErrorReason(_UNSUPPORTED_FIELD);
    public static final ClickTrackingLineItemErrorReason UNKNOWN = new ClickTrackingLineItemErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ClickTrackingLineItemErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ClickTrackingLineItemErrorReason enumeration = (ClickTrackingLineItemErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ClickTrackingLineItemErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ClickTrackingLineItemErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "ClickTrackingLineItemError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
