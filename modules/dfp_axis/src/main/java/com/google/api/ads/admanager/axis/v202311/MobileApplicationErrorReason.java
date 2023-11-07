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
 * MobileApplicationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;

public class MobileApplicationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MobileApplicationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_APP_ID = "INVALID_APP_ID";
    public static final java.lang.String _INVALID_EXCHANGE_PARTNER_SETTINGS = "INVALID_EXCHANGE_PARTNER_SETTINGS";
    public static final java.lang.String _INTERNAL = "INTERNAL";
    public static final java.lang.String _NAME_OR_STORE_ID_MUST_BE_SET = "NAME_OR_STORE_ID_MUST_BE_SET";
    public static final java.lang.String _PUBLISHER_HAS_TOO_MANY_ACTIVE_APPS = "PUBLISHER_HAS_TOO_MANY_ACTIVE_APPS";
    public static final java.lang.String _LINKED_APPLICATION_STORE_ID_TOO_LONG = "LINKED_APPLICATION_STORE_ID_TOO_LONG";
    public static final java.lang.String _MANUAL_APP_NAME_TOO_LONG = "MANUAL_APP_NAME_TOO_LONG";
    public static final java.lang.String _MANUAL_APP_NAME_EMPTY = "MANUAL_APP_NAME_EMPTY";
    public static final java.lang.String _INVALID_COMBINED_PRODUCT_KEY = "INVALID_COMBINED_PRODUCT_KEY";
    public static final java.lang.String _LINKED_APP_SKIPPING_ID_VERIFICATION_MUST_BE_ANDROID_APP = "LINKED_APP_SKIPPING_ID_VERIFICATION_MUST_BE_ANDROID_APP";
    public static final java.lang.String _MISSING_APP_STORE_ENTRY = "MISSING_APP_STORE_ENTRY";
    public static final java.lang.String _CANNOT_SET_STORE_ID_MISSING_STORE_ENTRY = "CANNOT_SET_STORE_ID_MISSING_STORE_ENTRY";
    public static final java.lang.String _CANNOT_SET_STORE_ID_INVALID_APP_STORE = "CANNOT_SET_STORE_ID_INVALID_APP_STORE";
    public static final java.lang.String _CANNOT_SET_STORE_ID_INVALID_STORE_ID = "CANNOT_SET_STORE_ID_INVALID_STORE_ID";
    public static final java.lang.String _CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID = "CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID";
    public static final java.lang.String _CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID_WITHIN_PLATFORM = "CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID_WITHIN_PLATFORM";
    public static final java.lang.String _CANNOT_SET_STORE_ID_INVALID_ANDROID_PACKAGE_NAME = "CANNOT_SET_STORE_ID_INVALID_ANDROID_PACKAGE_NAME";
    public static final java.lang.String _INCOMPATIBLE_APP_STORE_LIST = "INCOMPATIBLE_APP_STORE_LIST";
    public static final java.lang.String _APP_STORE_LIST_CANNOT_HAVE_UNKNOWN_APP_STORE = "APP_STORE_LIST_CANNOT_HAVE_UNKNOWN_APP_STORE";
    public static final java.lang.String _APP_STORE_LIST_CANNOT_REMOVE_FIRST_PARTY_APP_STORE = "APP_STORE_LIST_CANNOT_REMOVE_FIRST_PARTY_APP_STORE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final MobileApplicationErrorReason INVALID_APP_ID = new MobileApplicationErrorReason(_INVALID_APP_ID);
    public static final MobileApplicationErrorReason INVALID_EXCHANGE_PARTNER_SETTINGS = new MobileApplicationErrorReason(_INVALID_EXCHANGE_PARTNER_SETTINGS);
    public static final MobileApplicationErrorReason INTERNAL = new MobileApplicationErrorReason(_INTERNAL);
    public static final MobileApplicationErrorReason NAME_OR_STORE_ID_MUST_BE_SET = new MobileApplicationErrorReason(_NAME_OR_STORE_ID_MUST_BE_SET);
    public static final MobileApplicationErrorReason PUBLISHER_HAS_TOO_MANY_ACTIVE_APPS = new MobileApplicationErrorReason(_PUBLISHER_HAS_TOO_MANY_ACTIVE_APPS);
    public static final MobileApplicationErrorReason LINKED_APPLICATION_STORE_ID_TOO_LONG = new MobileApplicationErrorReason(_LINKED_APPLICATION_STORE_ID_TOO_LONG);
    public static final MobileApplicationErrorReason MANUAL_APP_NAME_TOO_LONG = new MobileApplicationErrorReason(_MANUAL_APP_NAME_TOO_LONG);
    public static final MobileApplicationErrorReason MANUAL_APP_NAME_EMPTY = new MobileApplicationErrorReason(_MANUAL_APP_NAME_EMPTY);
    public static final MobileApplicationErrorReason INVALID_COMBINED_PRODUCT_KEY = new MobileApplicationErrorReason(_INVALID_COMBINED_PRODUCT_KEY);
    public static final MobileApplicationErrorReason LINKED_APP_SKIPPING_ID_VERIFICATION_MUST_BE_ANDROID_APP = new MobileApplicationErrorReason(_LINKED_APP_SKIPPING_ID_VERIFICATION_MUST_BE_ANDROID_APP);
    public static final MobileApplicationErrorReason MISSING_APP_STORE_ENTRY = new MobileApplicationErrorReason(_MISSING_APP_STORE_ENTRY);
    public static final MobileApplicationErrorReason CANNOT_SET_STORE_ID_MISSING_STORE_ENTRY = new MobileApplicationErrorReason(_CANNOT_SET_STORE_ID_MISSING_STORE_ENTRY);
    public static final MobileApplicationErrorReason CANNOT_SET_STORE_ID_INVALID_APP_STORE = new MobileApplicationErrorReason(_CANNOT_SET_STORE_ID_INVALID_APP_STORE);
    public static final MobileApplicationErrorReason CANNOT_SET_STORE_ID_INVALID_STORE_ID = new MobileApplicationErrorReason(_CANNOT_SET_STORE_ID_INVALID_STORE_ID);
    public static final MobileApplicationErrorReason CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID = new MobileApplicationErrorReason(_CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID);
    public static final MobileApplicationErrorReason CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID_WITHIN_PLATFORM = new MobileApplicationErrorReason(_CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID_WITHIN_PLATFORM);
    public static final MobileApplicationErrorReason CANNOT_SET_STORE_ID_INVALID_ANDROID_PACKAGE_NAME = new MobileApplicationErrorReason(_CANNOT_SET_STORE_ID_INVALID_ANDROID_PACKAGE_NAME);
    public static final MobileApplicationErrorReason INCOMPATIBLE_APP_STORE_LIST = new MobileApplicationErrorReason(_INCOMPATIBLE_APP_STORE_LIST);
    public static final MobileApplicationErrorReason APP_STORE_LIST_CANNOT_HAVE_UNKNOWN_APP_STORE = new MobileApplicationErrorReason(_APP_STORE_LIST_CANNOT_HAVE_UNKNOWN_APP_STORE);
    public static final MobileApplicationErrorReason APP_STORE_LIST_CANNOT_REMOVE_FIRST_PARTY_APP_STORE = new MobileApplicationErrorReason(_APP_STORE_LIST_CANNOT_REMOVE_FIRST_PARTY_APP_STORE);
    public static final MobileApplicationErrorReason UNKNOWN = new MobileApplicationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static MobileApplicationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MobileApplicationErrorReason enumeration = (MobileApplicationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MobileApplicationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MobileApplicationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "MobileApplicationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
