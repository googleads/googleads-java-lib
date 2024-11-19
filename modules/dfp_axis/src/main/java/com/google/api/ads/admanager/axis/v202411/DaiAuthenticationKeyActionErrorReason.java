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
 * DaiAuthenticationKeyActionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;

public class DaiAuthenticationKeyActionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DaiAuthenticationKeyActionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_STATUS_TRANSITION = "INVALID_STATUS_TRANSITION";
    public static final java.lang.String _CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_CONTENT_SOURCES = "CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_CONTENT_SOURCES";
    public static final java.lang.String _CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_LIVE_STREAMS = "CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_LIVE_STREAMS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DaiAuthenticationKeyActionErrorReason INVALID_STATUS_TRANSITION = new DaiAuthenticationKeyActionErrorReason(_INVALID_STATUS_TRANSITION);
    public static final DaiAuthenticationKeyActionErrorReason CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_CONTENT_SOURCES = new DaiAuthenticationKeyActionErrorReason(_CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_CONTENT_SOURCES);
    public static final DaiAuthenticationKeyActionErrorReason CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_LIVE_STREAMS = new DaiAuthenticationKeyActionErrorReason(_CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_LIVE_STREAMS);
    public static final DaiAuthenticationKeyActionErrorReason UNKNOWN = new DaiAuthenticationKeyActionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DaiAuthenticationKeyActionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DaiAuthenticationKeyActionErrorReason enumeration = (DaiAuthenticationKeyActionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DaiAuthenticationKeyActionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DaiAuthenticationKeyActionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DaiAuthenticationKeyActionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
