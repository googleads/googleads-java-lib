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
 * TrafficEstimatorErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;

public class TrafficEstimatorErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrafficEstimatorErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST = "NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST";
    public static final java.lang.String _NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST = "NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST";
    public static final java.lang.String _NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST = "NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST";
    public static final java.lang.String _TOO_MANY_KEYWORD_ESTIMATE_REQUESTS = "TOO_MANY_KEYWORD_ESTIMATE_REQUESTS";
    public static final java.lang.String _TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS = "TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS";
    public static final java.lang.String _TOO_MANY_ADGROUP_ESTIMATE_REQUESTS = "TOO_MANY_ADGROUP_ESTIMATE_REQUESTS";
    public static final java.lang.String _TOO_MANY_TARGETS = "TOO_MANY_TARGETS";
    public static final java.lang.String _KEYWORD_TOO_LONG = "KEYWORD_TOO_LONG";
    public static final java.lang.String _KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS = "KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE";
    public static final TrafficEstimatorErrorReason NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST = new TrafficEstimatorErrorReason(_NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST);
    public static final TrafficEstimatorErrorReason NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST = new TrafficEstimatorErrorReason(_NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST);
    public static final TrafficEstimatorErrorReason NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST = new TrafficEstimatorErrorReason(_NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST);
    public static final TrafficEstimatorErrorReason TOO_MANY_KEYWORD_ESTIMATE_REQUESTS = new TrafficEstimatorErrorReason(_TOO_MANY_KEYWORD_ESTIMATE_REQUESTS);
    public static final TrafficEstimatorErrorReason TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS = new TrafficEstimatorErrorReason(_TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS);
    public static final TrafficEstimatorErrorReason TOO_MANY_ADGROUP_ESTIMATE_REQUESTS = new TrafficEstimatorErrorReason(_TOO_MANY_ADGROUP_ESTIMATE_REQUESTS);
    public static final TrafficEstimatorErrorReason TOO_MANY_TARGETS = new TrafficEstimatorErrorReason(_TOO_MANY_TARGETS);
    public static final TrafficEstimatorErrorReason KEYWORD_TOO_LONG = new TrafficEstimatorErrorReason(_KEYWORD_TOO_LONG);
    public static final TrafficEstimatorErrorReason KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS = new TrafficEstimatorErrorReason(_KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS);
    public static final TrafficEstimatorErrorReason INVALID_INPUT = new TrafficEstimatorErrorReason(_INVALID_INPUT);
    public static final TrafficEstimatorErrorReason SERVICE_UNAVAILABLE = new TrafficEstimatorErrorReason(_SERVICE_UNAVAILABLE);
    public java.lang.String getValue() { return _value_;}
    public static TrafficEstimatorErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrafficEstimatorErrorReason enumeration = (TrafficEstimatorErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrafficEstimatorErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TrafficEstimatorErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "TrafficEstimatorError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
