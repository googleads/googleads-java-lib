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
 * OfflineConversionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class OfflineConversionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OfflineConversionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNPARSEABLE_GCLID = "UNPARSEABLE_GCLID";
    public static final java.lang.String _CONVERSION_PRECEDES_CLICK = "CONVERSION_PRECEDES_CLICK";
    public static final java.lang.String _FUTURE_CONVERSION_TIME = "FUTURE_CONVERSION_TIME";
    public static final java.lang.String _EXPIRED_CLICK = "EXPIRED_CLICK";
    public static final java.lang.String _TOO_RECENT_CLICK = "TOO_RECENT_CLICK";
    public static final java.lang.String _INVALID_CLICK = "INVALID_CLICK";
    public static final java.lang.String _UNAUTHORIZED_USER = "UNAUTHORIZED_USER";
    public static final java.lang.String _INVALID_CONVERSION_TYPE = "INVALID_CONVERSION_TYPE";
    public static final java.lang.String _TOO_RECENT_CONVERSION_TYPE = "TOO_RECENT_CONVERSION_TYPE";
    public static final java.lang.String _CLICK_MISSING_CONVERSION_LABEL = "CLICK_MISSING_CONVERSION_LABEL";
    public static final java.lang.String _ATTRIBUTED_CREDIT_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = "ATTRIBUTED_CREDIT_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION";
    public static final java.lang.String _ATTRIBUTION_MODEL_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = "ATTRIBUTION_MODEL_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION";
    public static final java.lang.String _ATTRIBUTED_CREDIT_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = "ATTRIBUTED_CREDIT_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION";
    public static final java.lang.String _ATTRIBUTED_CREDIT_ZERO_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = "ATTRIBUTED_CREDIT_ZERO_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION";
    public static final java.lang.String _ATTRIBUTION_MODEL_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = "ATTRIBUTION_MODEL_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION";
    public static final java.lang.String _ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = "ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final OfflineConversionErrorReason UNPARSEABLE_GCLID = new OfflineConversionErrorReason(_UNPARSEABLE_GCLID);
    public static final OfflineConversionErrorReason CONVERSION_PRECEDES_CLICK = new OfflineConversionErrorReason(_CONVERSION_PRECEDES_CLICK);
    public static final OfflineConversionErrorReason FUTURE_CONVERSION_TIME = new OfflineConversionErrorReason(_FUTURE_CONVERSION_TIME);
    public static final OfflineConversionErrorReason EXPIRED_CLICK = new OfflineConversionErrorReason(_EXPIRED_CLICK);
    public static final OfflineConversionErrorReason TOO_RECENT_CLICK = new OfflineConversionErrorReason(_TOO_RECENT_CLICK);
    public static final OfflineConversionErrorReason INVALID_CLICK = new OfflineConversionErrorReason(_INVALID_CLICK);
    public static final OfflineConversionErrorReason UNAUTHORIZED_USER = new OfflineConversionErrorReason(_UNAUTHORIZED_USER);
    public static final OfflineConversionErrorReason INVALID_CONVERSION_TYPE = new OfflineConversionErrorReason(_INVALID_CONVERSION_TYPE);
    public static final OfflineConversionErrorReason TOO_RECENT_CONVERSION_TYPE = new OfflineConversionErrorReason(_TOO_RECENT_CONVERSION_TYPE);
    public static final OfflineConversionErrorReason CLICK_MISSING_CONVERSION_LABEL = new OfflineConversionErrorReason(_CLICK_MISSING_CONVERSION_LABEL);
    public static final OfflineConversionErrorReason ATTRIBUTED_CREDIT_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = new OfflineConversionErrorReason(_ATTRIBUTED_CREDIT_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION);
    public static final OfflineConversionErrorReason ATTRIBUTION_MODEL_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = new OfflineConversionErrorReason(_ATTRIBUTION_MODEL_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION);
    public static final OfflineConversionErrorReason ATTRIBUTED_CREDIT_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = new OfflineConversionErrorReason(_ATTRIBUTED_CREDIT_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION);
    public static final OfflineConversionErrorReason ATTRIBUTED_CREDIT_ZERO_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = new OfflineConversionErrorReason(_ATTRIBUTED_CREDIT_ZERO_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION);
    public static final OfflineConversionErrorReason ATTRIBUTION_MODEL_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = new OfflineConversionErrorReason(_ATTRIBUTION_MODEL_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION);
    public static final OfflineConversionErrorReason ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = new OfflineConversionErrorReason(_ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION);
    public static final OfflineConversionErrorReason UNKNOWN = new OfflineConversionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static OfflineConversionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OfflineConversionErrorReason enumeration = (OfflineConversionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OfflineConversionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OfflineConversionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OfflineConversionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
