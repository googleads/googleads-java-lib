// Copyright 2022 Google LLC
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
 * YieldErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202208;

public class YieldErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected YieldErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_BACKEND_DATA = "INVALID_BACKEND_DATA";
    public static final java.lang.String _INVALID_REQUEST_DATA = "INVALID_REQUEST_DATA";
    public static final java.lang.String _AD_SOURCE_COMPANY_CHANGE = "AD_SOURCE_COMPANY_CHANGE";
    public static final java.lang.String _UNSUPPORTED_COMPANY_INTEGRATION_TYPE = "UNSUPPORTED_COMPANY_INTEGRATION_TYPE";
    public static final java.lang.String _UNSUPPORTED_BUYER_SETTINGS = "UNSUPPORTED_BUYER_SETTINGS";
    public static final java.lang.String _DEPRECATED_AD_NETWORK_ADAPTER = "DEPRECATED_AD_NETWORK_ADAPTER";
    public static final java.lang.String _TOO_MANY_UPDATES = "TOO_MANY_UPDATES";
    public static final java.lang.String _DUPLICATE_YIELD_PARTNER = "DUPLICATE_YIELD_PARTNER";
    public static final java.lang.String _DUPLICATE_HEADER_BIDDER = "DUPLICATE_HEADER_BIDDER";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _INVALID_EXCHANGE_STATUS = "INVALID_EXCHANGE_STATUS";
    public static final java.lang.String _INVALID_AD_SOURCE_STATUS = "INVALID_AD_SOURCE_STATUS";
    public static final java.lang.String _INVALID_SDK_ADAPTER_KEY_NAME = "INVALID_SDK_ADAPTER_KEY_NAME";
    public static final java.lang.String _INVENTORY_UNIT_MAPPING_NOT_FOUND = "INVENTORY_UNIT_MAPPING_NOT_FOUND";
    public static final java.lang.String _NO_COMPANIES_PERMISSION = "NO_COMPANIES_PERMISSION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final YieldErrorReason INVALID_BACKEND_DATA = new YieldErrorReason(_INVALID_BACKEND_DATA);
    public static final YieldErrorReason INVALID_REQUEST_DATA = new YieldErrorReason(_INVALID_REQUEST_DATA);
    public static final YieldErrorReason AD_SOURCE_COMPANY_CHANGE = new YieldErrorReason(_AD_SOURCE_COMPANY_CHANGE);
    public static final YieldErrorReason UNSUPPORTED_COMPANY_INTEGRATION_TYPE = new YieldErrorReason(_UNSUPPORTED_COMPANY_INTEGRATION_TYPE);
    public static final YieldErrorReason UNSUPPORTED_BUYER_SETTINGS = new YieldErrorReason(_UNSUPPORTED_BUYER_SETTINGS);
    public static final YieldErrorReason DEPRECATED_AD_NETWORK_ADAPTER = new YieldErrorReason(_DEPRECATED_AD_NETWORK_ADAPTER);
    public static final YieldErrorReason TOO_MANY_UPDATES = new YieldErrorReason(_TOO_MANY_UPDATES);
    public static final YieldErrorReason DUPLICATE_YIELD_PARTNER = new YieldErrorReason(_DUPLICATE_YIELD_PARTNER);
    public static final YieldErrorReason DUPLICATE_HEADER_BIDDER = new YieldErrorReason(_DUPLICATE_HEADER_BIDDER);
    public static final YieldErrorReason INTERNAL_ERROR = new YieldErrorReason(_INTERNAL_ERROR);
    public static final YieldErrorReason INVALID_EXCHANGE_STATUS = new YieldErrorReason(_INVALID_EXCHANGE_STATUS);
    public static final YieldErrorReason INVALID_AD_SOURCE_STATUS = new YieldErrorReason(_INVALID_AD_SOURCE_STATUS);
    public static final YieldErrorReason INVALID_SDK_ADAPTER_KEY_NAME = new YieldErrorReason(_INVALID_SDK_ADAPTER_KEY_NAME);
    public static final YieldErrorReason INVENTORY_UNIT_MAPPING_NOT_FOUND = new YieldErrorReason(_INVENTORY_UNIT_MAPPING_NOT_FOUND);
    public static final YieldErrorReason NO_COMPANIES_PERMISSION = new YieldErrorReason(_NO_COMPANIES_PERMISSION);
    public static final YieldErrorReason UNKNOWN = new YieldErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static YieldErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        YieldErrorReason enumeration = (YieldErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static YieldErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(YieldErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202208", "YieldError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
