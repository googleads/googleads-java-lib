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
 * FeedErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class FeedErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ATTRIBUTE_NAMES_NOT_UNIQUE = "ATTRIBUTE_NAMES_NOT_UNIQUE";
    public static final java.lang.String _ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES = "ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES";
    public static final java.lang.String _CANNOT_CHANGE_ORIGIN = "CANNOT_CHANGE_ORIGIN";
    public static final java.lang.String _CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED = "CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED";
    public static final java.lang.String _CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED = "CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED";
    public static final java.lang.String _CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED = "CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED";
    public static final java.lang.String _CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS = "CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS";
    public static final java.lang.String _FEED_REMOVED = "FEED_REMOVED";
    public static final java.lang.String _INVALID_ORIGIN_VALUE = "INVALID_ORIGIN_VALUE";
    public static final java.lang.String _FEED_ORIGIN_IS_NOT_USER = "FEED_ORIGIN_IS_NOT_USER";
    public static final java.lang.String _INVALID_AUTH_TOKEN_FOR_EMAIL = "INVALID_AUTH_TOKEN_FOR_EMAIL";
    public static final java.lang.String _INVALID_EMAIL = "INVALID_EMAIL";
    public static final java.lang.String _DUPLICATE_FEED_NAME = "DUPLICATE_FEED_NAME";
    public static final java.lang.String _INVALID_FEED_NAME = "INVALID_FEED_NAME";
    public static final java.lang.String _MISSING_OAUTH_INFO = "MISSING_OAUTH_INFO";
    public static final java.lang.String _NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY = "NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY";
    public static final java.lang.String _TOO_MANY_FEED_ATTRIBUTES_FOR_FEED = "TOO_MANY_FEED_ATTRIBUTES_FOR_FEED";
    public static final java.lang.String _INVALID_BUSINESS_ACCOUNT = "INVALID_BUSINESS_ACCOUNT";
    public static final java.lang.String _BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT = "BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT";
    public static final java.lang.String _INVALID_AFFILIATE_CHAIN_ID = "INVALID_AFFILIATE_CHAIN_ID";
    public static final java.lang.String _CANNOT_CHANGE_SYSTEM_FEED_GENERATION_DATA_TYPE = "CANNOT_CHANGE_SYSTEM_FEED_GENERATION_DATA_TYPE";
    public static final java.lang.String _UNSUPPORTED_AFFILIATE_LOCATION_RELATIONSHIP_TYPE = "UNSUPPORTED_AFFILIATE_LOCATION_RELATIONSHIP_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FeedErrorReason ATTRIBUTE_NAMES_NOT_UNIQUE = new FeedErrorReason(_ATTRIBUTE_NAMES_NOT_UNIQUE);
    public static final FeedErrorReason ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES = new FeedErrorReason(_ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES);
    public static final FeedErrorReason CANNOT_CHANGE_ORIGIN = new FeedErrorReason(_CANNOT_CHANGE_ORIGIN);
    public static final FeedErrorReason CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED = new FeedErrorReason(_CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED);
    public static final FeedErrorReason CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED = new FeedErrorReason(_CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED);
    public static final FeedErrorReason CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED = new FeedErrorReason(_CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED);
    public static final FeedErrorReason CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS = new FeedErrorReason(_CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS);
    public static final FeedErrorReason FEED_REMOVED = new FeedErrorReason(_FEED_REMOVED);
    public static final FeedErrorReason INVALID_ORIGIN_VALUE = new FeedErrorReason(_INVALID_ORIGIN_VALUE);
    public static final FeedErrorReason FEED_ORIGIN_IS_NOT_USER = new FeedErrorReason(_FEED_ORIGIN_IS_NOT_USER);
    public static final FeedErrorReason INVALID_AUTH_TOKEN_FOR_EMAIL = new FeedErrorReason(_INVALID_AUTH_TOKEN_FOR_EMAIL);
    public static final FeedErrorReason INVALID_EMAIL = new FeedErrorReason(_INVALID_EMAIL);
    public static final FeedErrorReason DUPLICATE_FEED_NAME = new FeedErrorReason(_DUPLICATE_FEED_NAME);
    public static final FeedErrorReason INVALID_FEED_NAME = new FeedErrorReason(_INVALID_FEED_NAME);
    public static final FeedErrorReason MISSING_OAUTH_INFO = new FeedErrorReason(_MISSING_OAUTH_INFO);
    public static final FeedErrorReason NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY = new FeedErrorReason(_NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY);
    public static final FeedErrorReason TOO_MANY_FEED_ATTRIBUTES_FOR_FEED = new FeedErrorReason(_TOO_MANY_FEED_ATTRIBUTES_FOR_FEED);
    public static final FeedErrorReason INVALID_BUSINESS_ACCOUNT = new FeedErrorReason(_INVALID_BUSINESS_ACCOUNT);
    public static final FeedErrorReason BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT = new FeedErrorReason(_BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT);
    public static final FeedErrorReason INVALID_AFFILIATE_CHAIN_ID = new FeedErrorReason(_INVALID_AFFILIATE_CHAIN_ID);
    public static final FeedErrorReason CANNOT_CHANGE_SYSTEM_FEED_GENERATION_DATA_TYPE = new FeedErrorReason(_CANNOT_CHANGE_SYSTEM_FEED_GENERATION_DATA_TYPE);
    public static final FeedErrorReason UNSUPPORTED_AFFILIATE_LOCATION_RELATIONSHIP_TYPE = new FeedErrorReason(_UNSUPPORTED_AFFILIATE_LOCATION_RELATIONSHIP_TYPE);
    public static final FeedErrorReason UNKNOWN = new FeedErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FeedErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedErrorReason enumeration = (FeedErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
