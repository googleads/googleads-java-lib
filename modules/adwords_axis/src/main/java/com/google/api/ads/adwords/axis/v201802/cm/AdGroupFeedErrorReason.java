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
 * AdGroupFeedErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class AdGroupFeedErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdGroupFeedErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = "FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _INVALID_ID = "INVALID_ID";
    public static final java.lang.String _CANNOT_ADD_FOR_DELETED_FEED = "CANNOT_ADD_FOR_DELETED_FEED";
    public static final java.lang.String _CANNOT_ADD_ALREADY_EXISTING_ADGROUP_FEED = "CANNOT_ADD_ALREADY_EXISTING_ADGROUP_FEED";
    public static final java.lang.String _CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED = "CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED";
    public static final java.lang.String _INVALID_PLACEHOLDER_TYPES = "INVALID_PLACEHOLDER_TYPES";
    public static final java.lang.String _MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE = "MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _NO_EXISTING_LOCATION_CUSTOMER_FEED = "NO_EXISTING_LOCATION_CUSTOMER_FEED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdGroupFeedErrorReason FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = new AdGroupFeedErrorReason(_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE);
    public static final AdGroupFeedErrorReason INVALID_ID = new AdGroupFeedErrorReason(_INVALID_ID);
    public static final AdGroupFeedErrorReason CANNOT_ADD_FOR_DELETED_FEED = new AdGroupFeedErrorReason(_CANNOT_ADD_FOR_DELETED_FEED);
    public static final AdGroupFeedErrorReason CANNOT_ADD_ALREADY_EXISTING_ADGROUP_FEED = new AdGroupFeedErrorReason(_CANNOT_ADD_ALREADY_EXISTING_ADGROUP_FEED);
    public static final AdGroupFeedErrorReason CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED = new AdGroupFeedErrorReason(_CANNOT_OPERATE_ON_REMOVED_ADGROUP_FEED);
    public static final AdGroupFeedErrorReason INVALID_PLACEHOLDER_TYPES = new AdGroupFeedErrorReason(_INVALID_PLACEHOLDER_TYPES);
    public static final AdGroupFeedErrorReason MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE = new AdGroupFeedErrorReason(_MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE);
    public static final AdGroupFeedErrorReason NO_EXISTING_LOCATION_CUSTOMER_FEED = new AdGroupFeedErrorReason(_NO_EXISTING_LOCATION_CUSTOMER_FEED);
    public static final AdGroupFeedErrorReason UNKNOWN = new AdGroupFeedErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdGroupFeedErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdGroupFeedErrorReason enumeration = (AdGroupFeedErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdGroupFeedErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdGroupFeedErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupFeedError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
