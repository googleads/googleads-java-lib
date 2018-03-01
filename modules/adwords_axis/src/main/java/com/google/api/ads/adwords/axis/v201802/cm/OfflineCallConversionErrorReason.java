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
 * OfflineCallConversionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class OfflineCallConversionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OfflineCallConversionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONVERSION_PRECEDES_CALL = "CONVERSION_PRECEDES_CALL";
    public static final java.lang.String _FUTURE_CALL_START_TIME = "FUTURE_CALL_START_TIME";
    public static final java.lang.String _FUTURE_CONVERSION_TIME = "FUTURE_CONVERSION_TIME";
    public static final java.lang.String _EXPIRED_CALL = "EXPIRED_CALL";
    public static final java.lang.String _TOO_RECENT_CALL = "TOO_RECENT_CALL";
    public static final java.lang.String _UNPARSEABLE_CALLERS_PHONE_NUMBER = "UNPARSEABLE_CALLERS_PHONE_NUMBER";
    public static final java.lang.String _INVALID_CALL = "INVALID_CALL";
    public static final java.lang.String _UNAUTHORIZED_USER = "UNAUTHORIZED_USER";
    public static final java.lang.String _INVALID_CONVERSION_TYPE = "INVALID_CONVERSION_TYPE";
    public static final java.lang.String _TOO_RECENT_CONVERSION_TYPE = "TOO_RECENT_CONVERSION_TYPE";
    public static final java.lang.String _CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME = "CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME";
    public static final java.lang.String _DESKTOP_CALL_NOT_SUPPORTED = "DESKTOP_CALL_NOT_SUPPORTED";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final OfflineCallConversionErrorReason CONVERSION_PRECEDES_CALL = new OfflineCallConversionErrorReason(_CONVERSION_PRECEDES_CALL);
    public static final OfflineCallConversionErrorReason FUTURE_CALL_START_TIME = new OfflineCallConversionErrorReason(_FUTURE_CALL_START_TIME);
    public static final OfflineCallConversionErrorReason FUTURE_CONVERSION_TIME = new OfflineCallConversionErrorReason(_FUTURE_CONVERSION_TIME);
    public static final OfflineCallConversionErrorReason EXPIRED_CALL = new OfflineCallConversionErrorReason(_EXPIRED_CALL);
    public static final OfflineCallConversionErrorReason TOO_RECENT_CALL = new OfflineCallConversionErrorReason(_TOO_RECENT_CALL);
    public static final OfflineCallConversionErrorReason UNPARSEABLE_CALLERS_PHONE_NUMBER = new OfflineCallConversionErrorReason(_UNPARSEABLE_CALLERS_PHONE_NUMBER);
    public static final OfflineCallConversionErrorReason INVALID_CALL = new OfflineCallConversionErrorReason(_INVALID_CALL);
    public static final OfflineCallConversionErrorReason UNAUTHORIZED_USER = new OfflineCallConversionErrorReason(_UNAUTHORIZED_USER);
    public static final OfflineCallConversionErrorReason INVALID_CONVERSION_TYPE = new OfflineCallConversionErrorReason(_INVALID_CONVERSION_TYPE);
    public static final OfflineCallConversionErrorReason TOO_RECENT_CONVERSION_TYPE = new OfflineCallConversionErrorReason(_TOO_RECENT_CONVERSION_TYPE);
    public static final OfflineCallConversionErrorReason CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME = new OfflineCallConversionErrorReason(_CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME);
    public static final OfflineCallConversionErrorReason DESKTOP_CALL_NOT_SUPPORTED = new OfflineCallConversionErrorReason(_DESKTOP_CALL_NOT_SUPPORTED);
    public static final OfflineCallConversionErrorReason INTERNAL_ERROR = new OfflineCallConversionErrorReason(_INTERNAL_ERROR);
    public static final OfflineCallConversionErrorReason UNKNOWN = new OfflineCallConversionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static OfflineCallConversionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OfflineCallConversionErrorReason enumeration = (OfflineCallConversionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OfflineCallConversionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OfflineCallConversionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OfflineCallConversionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
