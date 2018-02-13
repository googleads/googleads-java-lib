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
 * FrequencyCapErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class FrequencyCapErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FrequencyCapErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IMPRESSION_LIMIT_EXCEEDED = "IMPRESSION_LIMIT_EXCEEDED";
    public static final java.lang.String _IMPRESSIONS_TOO_LOW = "IMPRESSIONS_TOO_LOW";
    public static final java.lang.String _RANGE_LIMIT_EXCEEDED = "RANGE_LIMIT_EXCEEDED";
    public static final java.lang.String _RANGE_TOO_LOW = "RANGE_TOO_LOW";
    public static final java.lang.String _DUPLICATE_TIME_RANGE = "DUPLICATE_TIME_RANGE";
    public static final java.lang.String _TOO_MANY_FREQUENCY_CAPS = "TOO_MANY_FREQUENCY_CAPS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FrequencyCapErrorReason IMPRESSION_LIMIT_EXCEEDED = new FrequencyCapErrorReason(_IMPRESSION_LIMIT_EXCEEDED);
    public static final FrequencyCapErrorReason IMPRESSIONS_TOO_LOW = new FrequencyCapErrorReason(_IMPRESSIONS_TOO_LOW);
    public static final FrequencyCapErrorReason RANGE_LIMIT_EXCEEDED = new FrequencyCapErrorReason(_RANGE_LIMIT_EXCEEDED);
    public static final FrequencyCapErrorReason RANGE_TOO_LOW = new FrequencyCapErrorReason(_RANGE_TOO_LOW);
    public static final FrequencyCapErrorReason DUPLICATE_TIME_RANGE = new FrequencyCapErrorReason(_DUPLICATE_TIME_RANGE);
    public static final FrequencyCapErrorReason TOO_MANY_FREQUENCY_CAPS = new FrequencyCapErrorReason(_TOO_MANY_FREQUENCY_CAPS);
    public static final FrequencyCapErrorReason UNKNOWN = new FrequencyCapErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FrequencyCapErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FrequencyCapErrorReason enumeration = (FrequencyCapErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FrequencyCapErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FrequencyCapErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FrequencyCapError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
