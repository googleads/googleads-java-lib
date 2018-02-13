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
 * BaseRateErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class BaseRateErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BaseRateErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_CURRENCY_CODE = "INVALID_CURRENCY_CODE";
    public static final java.lang.String _PRODUCT_TEMPLATE_ARCHIVED = "PRODUCT_TEMPLATE_ARCHIVED";
    public static final java.lang.String _PRODUCT_PACKAGE_ITEM_ARCHIVED = "PRODUCT_PACKAGE_ITEM_ARCHIVED";
    public static final java.lang.String _CANNOT_QUERY_ON_MULTIPLE_TYPES = "CANNOT_QUERY_ON_MULTIPLE_TYPES";
    public static final java.lang.String _PRODUCT_PACKAGE_RATE_CARD_ASSOCIATION_MISSING = "PRODUCT_PACKAGE_RATE_CARD_ASSOCIATION_MISSING";
    public static final java.lang.String _UNSUPPORTED_OPERATION = "UNSUPPORTED_OPERATION";
    public static final java.lang.String _PRODUCT_PACKAGE_ACTIVE = "PRODUCT_PACKAGE_ACTIVE";
    public static final java.lang.String _PRODUCT_TEMPLATE_BASE_RATE_NOT_FOUND = "PRODUCT_TEMPLATE_BASE_RATE_NOT_FOUND";
    public static final java.lang.String _PRODUCT_BASE_RATE_EXISTS = "PRODUCT_BASE_RATE_EXISTS";
    public static final java.lang.String _INVALID_RATE_CARD_CHANNEL = "INVALID_RATE_CARD_CHANNEL";
    public static final java.lang.String _ZERO_MARKETPLACE_RATE_NOT_SUPPORTED = "ZERO_MARKETPLACE_RATE_NOT_SUPPORTED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BaseRateErrorReason INVALID_CURRENCY_CODE = new BaseRateErrorReason(_INVALID_CURRENCY_CODE);
    public static final BaseRateErrorReason PRODUCT_TEMPLATE_ARCHIVED = new BaseRateErrorReason(_PRODUCT_TEMPLATE_ARCHIVED);
    public static final BaseRateErrorReason PRODUCT_PACKAGE_ITEM_ARCHIVED = new BaseRateErrorReason(_PRODUCT_PACKAGE_ITEM_ARCHIVED);
    public static final BaseRateErrorReason CANNOT_QUERY_ON_MULTIPLE_TYPES = new BaseRateErrorReason(_CANNOT_QUERY_ON_MULTIPLE_TYPES);
    public static final BaseRateErrorReason PRODUCT_PACKAGE_RATE_CARD_ASSOCIATION_MISSING = new BaseRateErrorReason(_PRODUCT_PACKAGE_RATE_CARD_ASSOCIATION_MISSING);
    public static final BaseRateErrorReason UNSUPPORTED_OPERATION = new BaseRateErrorReason(_UNSUPPORTED_OPERATION);
    public static final BaseRateErrorReason PRODUCT_PACKAGE_ACTIVE = new BaseRateErrorReason(_PRODUCT_PACKAGE_ACTIVE);
    public static final BaseRateErrorReason PRODUCT_TEMPLATE_BASE_RATE_NOT_FOUND = new BaseRateErrorReason(_PRODUCT_TEMPLATE_BASE_RATE_NOT_FOUND);
    public static final BaseRateErrorReason PRODUCT_BASE_RATE_EXISTS = new BaseRateErrorReason(_PRODUCT_BASE_RATE_EXISTS);
    public static final BaseRateErrorReason INVALID_RATE_CARD_CHANNEL = new BaseRateErrorReason(_INVALID_RATE_CARD_CHANNEL);
    public static final BaseRateErrorReason ZERO_MARKETPLACE_RATE_NOT_SUPPORTED = new BaseRateErrorReason(_ZERO_MARKETPLACE_RATE_NOT_SUPPORTED);
    public static final BaseRateErrorReason UNKNOWN = new BaseRateErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BaseRateErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BaseRateErrorReason enumeration = (BaseRateErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BaseRateErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BaseRateErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseRateError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
