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
 * FeedItemTargetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class FeedItemTargetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedItemTargetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CRITERION_TYPE_NOT_SUPPORTED = "CRITERION_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _FEED_ITEM_TARGET_ALREADY_EXISTS = "FEED_ITEM_TARGET_ALREADY_EXISTS";
    public static final java.lang.String _NEGATIVE_TARGETING_NOT_SUPPORTED_FOR_CRITERION_TYPE = "NEGATIVE_TARGETING_NOT_SUPPORTED_FOR_CRITERION_TYPE";
    public static final java.lang.String _ONLY_MOBILE_TARGETING_IS_SUPPORTED_FOR_PLATFORM_CRITERION = "ONLY_MOBILE_TARGETING_IS_SUPPORTED_FOR_PLATFORM_CRITERION";
    public static final java.lang.String _FEED_ITEM_SCHEDULES_CANNOT_OVERLAP = "FEED_ITEM_SCHEDULES_CANNOT_OVERLAP";
    public static final java.lang.String _CRITERION_ID_MUST_BE_SET_FOR_GIVEN_TYPE = "CRITERION_ID_MUST_BE_SET_FOR_GIVEN_TYPE";
    public static final java.lang.String _TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE = "TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE";
    public static final java.lang.String _TOO_MANY_SCHEDULES_PER_DAY = "TOO_MANY_SCHEDULES_PER_DAY";
    public static final java.lang.String _CANNOT_HAVE_ACTIVE_CAMPAIGN_AND_ACTIVE_AD_GROUP_TARGETS = "CANNOT_HAVE_ACTIVE_CAMPAIGN_AND_ACTIVE_AD_GROUP_TARGETS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FeedItemTargetErrorReason CRITERION_TYPE_NOT_SUPPORTED = new FeedItemTargetErrorReason(_CRITERION_TYPE_NOT_SUPPORTED);
    public static final FeedItemTargetErrorReason FEED_ITEM_TARGET_ALREADY_EXISTS = new FeedItemTargetErrorReason(_FEED_ITEM_TARGET_ALREADY_EXISTS);
    public static final FeedItemTargetErrorReason NEGATIVE_TARGETING_NOT_SUPPORTED_FOR_CRITERION_TYPE = new FeedItemTargetErrorReason(_NEGATIVE_TARGETING_NOT_SUPPORTED_FOR_CRITERION_TYPE);
    public static final FeedItemTargetErrorReason ONLY_MOBILE_TARGETING_IS_SUPPORTED_FOR_PLATFORM_CRITERION = new FeedItemTargetErrorReason(_ONLY_MOBILE_TARGETING_IS_SUPPORTED_FOR_PLATFORM_CRITERION);
    public static final FeedItemTargetErrorReason FEED_ITEM_SCHEDULES_CANNOT_OVERLAP = new FeedItemTargetErrorReason(_FEED_ITEM_SCHEDULES_CANNOT_OVERLAP);
    public static final FeedItemTargetErrorReason CRITERION_ID_MUST_BE_SET_FOR_GIVEN_TYPE = new FeedItemTargetErrorReason(_CRITERION_ID_MUST_BE_SET_FOR_GIVEN_TYPE);
    public static final FeedItemTargetErrorReason TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE = new FeedItemTargetErrorReason(_TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE);
    public static final FeedItemTargetErrorReason TOO_MANY_SCHEDULES_PER_DAY = new FeedItemTargetErrorReason(_TOO_MANY_SCHEDULES_PER_DAY);
    public static final FeedItemTargetErrorReason CANNOT_HAVE_ACTIVE_CAMPAIGN_AND_ACTIVE_AD_GROUP_TARGETS = new FeedItemTargetErrorReason(_CANNOT_HAVE_ACTIVE_CAMPAIGN_AND_ACTIVE_AD_GROUP_TARGETS);
    public static final FeedItemTargetErrorReason UNKNOWN = new FeedItemTargetErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FeedItemTargetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedItemTargetErrorReason enumeration = (FeedItemTargetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedItemTargetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedItemTargetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
