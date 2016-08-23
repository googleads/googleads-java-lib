// Copyright 2016 Google Inc. All Rights Reserved.
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
 * PromotionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.express;

public class PromotionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PromotionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MISSING_BUSINESS_NAME = "MISSING_BUSINESS_NAME";
    public static final java.lang.String _BUSINESS_DELETED = "BUSINESS_DELETED";
    public static final java.lang.String _NOT_BUSINESS_OWNER = "NOT_BUSINESS_OWNER";
    public static final java.lang.String _BUSINESS_OWNER_NOT_FOUND = "BUSINESS_OWNER_NOT_FOUND";
    public static final java.lang.String _BUSINESS_OWNER_ACCOUNT_NOT_MATCHED = "BUSINESS_OWNER_ACCOUNT_NOT_MATCHED";
    public static final java.lang.String _BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT = "BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT";
    public static final java.lang.String _BUSINESS_COUNTRY_NOT_SUPPORTED = "BUSINESS_COUNTRY_NOT_SUPPORTED";
    public static final java.lang.String _BUSINESS_LANGUAGE_NOT_SUPPORTED = "BUSINESS_LANGUAGE_NOT_SUPPORTED";
    public static final java.lang.String _CURRENCY_NOT_SUPPORTED = "CURRENCY_NOT_SUPPORTED";
    public static final java.lang.String _AOL_ACCOUNT = "AOL_ACCOUNT";
    public static final java.lang.String _MANAGER_ACCOUNT = "MANAGER_ACCOUNT";
    public static final java.lang.String _INVALID_DESTINATION_URL = "INVALID_DESTINATION_URL";
    public static final java.lang.String _CALL_TRACKING_NOT_SUPPORTED = "CALL_TRACKING_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER";
    public static final java.lang.String _PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED = "PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _NON_LOCAL_BUSINESS = "NON_LOCAL_BUSINESS";
    public static final java.lang.String _ALREADY_MIGRATED = "ALREADY_MIGRATED";
    public static final java.lang.String _BUSINESS_ACCESS_DENIED = "BUSINESS_ACCESS_DENIED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final PromotionErrorReason MISSING_BUSINESS_NAME = new PromotionErrorReason(_MISSING_BUSINESS_NAME);
    public static final PromotionErrorReason BUSINESS_DELETED = new PromotionErrorReason(_BUSINESS_DELETED);
    public static final PromotionErrorReason NOT_BUSINESS_OWNER = new PromotionErrorReason(_NOT_BUSINESS_OWNER);
    public static final PromotionErrorReason BUSINESS_OWNER_NOT_FOUND = new PromotionErrorReason(_BUSINESS_OWNER_NOT_FOUND);
    public static final PromotionErrorReason BUSINESS_OWNER_ACCOUNT_NOT_MATCHED = new PromotionErrorReason(_BUSINESS_OWNER_ACCOUNT_NOT_MATCHED);
    public static final PromotionErrorReason BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT = new PromotionErrorReason(_BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT);
    public static final PromotionErrorReason BUSINESS_COUNTRY_NOT_SUPPORTED = new PromotionErrorReason(_BUSINESS_COUNTRY_NOT_SUPPORTED);
    public static final PromotionErrorReason BUSINESS_LANGUAGE_NOT_SUPPORTED = new PromotionErrorReason(_BUSINESS_LANGUAGE_NOT_SUPPORTED);
    public static final PromotionErrorReason CURRENCY_NOT_SUPPORTED = new PromotionErrorReason(_CURRENCY_NOT_SUPPORTED);
    public static final PromotionErrorReason AOL_ACCOUNT = new PromotionErrorReason(_AOL_ACCOUNT);
    public static final PromotionErrorReason MANAGER_ACCOUNT = new PromotionErrorReason(_MANAGER_ACCOUNT);
    public static final PromotionErrorReason INVALID_DESTINATION_URL = new PromotionErrorReason(_INVALID_DESTINATION_URL);
    public static final PromotionErrorReason CALL_TRACKING_NOT_SUPPORTED = new PromotionErrorReason(_CALL_TRACKING_NOT_SUPPORTED);
    public static final PromotionErrorReason INVALID_PHONE_NUMBER = new PromotionErrorReason(_INVALID_PHONE_NUMBER);
    public static final PromotionErrorReason PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED = new PromotionErrorReason(_PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED);
    public static final PromotionErrorReason NON_LOCAL_BUSINESS = new PromotionErrorReason(_NON_LOCAL_BUSINESS);
    public static final PromotionErrorReason ALREADY_MIGRATED = new PromotionErrorReason(_ALREADY_MIGRATED);
    public static final PromotionErrorReason BUSINESS_ACCESS_DENIED = new PromotionErrorReason(_BUSINESS_ACCESS_DENIED);
    public static final PromotionErrorReason UNKNOWN = new PromotionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static PromotionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PromotionErrorReason enumeration = (PromotionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PromotionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PromotionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201603", "PromotionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
