// Copyright 2023 Google LLC
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
 * ExchangeSignupApiErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public class ExchangeSignupApiErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExchangeSignupApiErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADSENSE_ACCOUNT_CREATION_ERROR = "ADSENSE_ACCOUNT_CREATION_ERROR";
    public static final java.lang.String _ADSENSE_ACCOUNT_ALREADY_HAS_EXCHANGE = "ADSENSE_ACCOUNT_ALREADY_HAS_EXCHANGE";
    public static final java.lang.String _FAILED_TO_ADD_WEBSITE_TO_PROPERTY = "FAILED_TO_ADD_WEBSITE_TO_PROPERTY";
    public static final java.lang.String _FAILED_TO_CREATE_LINK_FOR_NEW_ACCOUNT = "FAILED_TO_CREATE_LINK_FOR_NEW_ACCOUNT";
    public static final java.lang.String _CANNOT_CREATE_NEW_ACCOUNT_FOR_MAPPED_CUSTOMER = "CANNOT_CREATE_NEW_ACCOUNT_FOR_MAPPED_CUSTOMER";
    public static final java.lang.String _FAILED_TO_CREATE_EXCHANGE_SETTINGS = "FAILED_TO_CREATE_EXCHANGE_SETTINGS";
    public static final java.lang.String _DUPLICATE_PRODUCT_TYPE = "DUPLICATE_PRODUCT_TYPE";
    public static final java.lang.String _INVALID_SIGNUP_PRODUCT = "INVALID_SIGNUP_PRODUCT";
    public static final java.lang.String _UNKNOWN_PRODUCT = "UNKNOWN_PRODUCT";
    public static final java.lang.String _BAD_SITE_VERIFICATION_UPDATE_REQUEST = "BAD_SITE_VERIFICATION_UPDATE_REQUEST";
    public static final java.lang.String _NO_EXCHANGE_ACCOUNT = "NO_EXCHANGE_ACCOUNT";
    public static final java.lang.String _SINGLE_SYNDICATION_PRODUCT = "SINGLE_SYNDICATION_PRODUCT";
    public static final java.lang.String _ACCOUNT_NOT_YET_READY = "ACCOUNT_NOT_YET_READY";
    public static final java.lang.String _MULTIPLE_ADSENSE_ACCOUNTS_NOT_ALLOWED = "MULTIPLE_ADSENSE_ACCOUNTS_NOT_ALLOWED";
    public static final java.lang.String _MISSING_LEGAL_ENTITY_NAME = "MISSING_LEGAL_ENTITY_NAME";
    public static final java.lang.String _MISSING_ACTIVE_BILLING_PROFILE = "MISSING_ACTIVE_BILLING_PROFILE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ExchangeSignupApiErrorReason ADSENSE_ACCOUNT_CREATION_ERROR = new ExchangeSignupApiErrorReason(_ADSENSE_ACCOUNT_CREATION_ERROR);
    public static final ExchangeSignupApiErrorReason ADSENSE_ACCOUNT_ALREADY_HAS_EXCHANGE = new ExchangeSignupApiErrorReason(_ADSENSE_ACCOUNT_ALREADY_HAS_EXCHANGE);
    public static final ExchangeSignupApiErrorReason FAILED_TO_ADD_WEBSITE_TO_PROPERTY = new ExchangeSignupApiErrorReason(_FAILED_TO_ADD_WEBSITE_TO_PROPERTY);
    public static final ExchangeSignupApiErrorReason FAILED_TO_CREATE_LINK_FOR_NEW_ACCOUNT = new ExchangeSignupApiErrorReason(_FAILED_TO_CREATE_LINK_FOR_NEW_ACCOUNT);
    public static final ExchangeSignupApiErrorReason CANNOT_CREATE_NEW_ACCOUNT_FOR_MAPPED_CUSTOMER = new ExchangeSignupApiErrorReason(_CANNOT_CREATE_NEW_ACCOUNT_FOR_MAPPED_CUSTOMER);
    public static final ExchangeSignupApiErrorReason FAILED_TO_CREATE_EXCHANGE_SETTINGS = new ExchangeSignupApiErrorReason(_FAILED_TO_CREATE_EXCHANGE_SETTINGS);
    public static final ExchangeSignupApiErrorReason DUPLICATE_PRODUCT_TYPE = new ExchangeSignupApiErrorReason(_DUPLICATE_PRODUCT_TYPE);
    public static final ExchangeSignupApiErrorReason INVALID_SIGNUP_PRODUCT = new ExchangeSignupApiErrorReason(_INVALID_SIGNUP_PRODUCT);
    public static final ExchangeSignupApiErrorReason UNKNOWN_PRODUCT = new ExchangeSignupApiErrorReason(_UNKNOWN_PRODUCT);
    public static final ExchangeSignupApiErrorReason BAD_SITE_VERIFICATION_UPDATE_REQUEST = new ExchangeSignupApiErrorReason(_BAD_SITE_VERIFICATION_UPDATE_REQUEST);
    public static final ExchangeSignupApiErrorReason NO_EXCHANGE_ACCOUNT = new ExchangeSignupApiErrorReason(_NO_EXCHANGE_ACCOUNT);
    public static final ExchangeSignupApiErrorReason SINGLE_SYNDICATION_PRODUCT = new ExchangeSignupApiErrorReason(_SINGLE_SYNDICATION_PRODUCT);
    public static final ExchangeSignupApiErrorReason ACCOUNT_NOT_YET_READY = new ExchangeSignupApiErrorReason(_ACCOUNT_NOT_YET_READY);
    public static final ExchangeSignupApiErrorReason MULTIPLE_ADSENSE_ACCOUNTS_NOT_ALLOWED = new ExchangeSignupApiErrorReason(_MULTIPLE_ADSENSE_ACCOUNTS_NOT_ALLOWED);
    public static final ExchangeSignupApiErrorReason MISSING_LEGAL_ENTITY_NAME = new ExchangeSignupApiErrorReason(_MISSING_LEGAL_ENTITY_NAME);
    public static final ExchangeSignupApiErrorReason MISSING_ACTIVE_BILLING_PROFILE = new ExchangeSignupApiErrorReason(_MISSING_ACTIVE_BILLING_PROFILE);
    public static final ExchangeSignupApiErrorReason UNKNOWN = new ExchangeSignupApiErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ExchangeSignupApiErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExchangeSignupApiErrorReason enumeration = (ExchangeSignupApiErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExchangeSignupApiErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExchangeSignupApiErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "ExchangeSignupApiError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
