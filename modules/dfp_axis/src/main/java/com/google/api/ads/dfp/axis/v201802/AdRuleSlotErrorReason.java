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
 * AdRuleSlotErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class AdRuleSlotErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdRuleSlotErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DIFFERENT_STATUS_THAN_AD_RULE = "DIFFERENT_STATUS_THAN_AD_RULE";
    public static final java.lang.String _INVALID_VIDEO_AD_DURATION_RANGE = "INVALID_VIDEO_AD_DURATION_RANGE";
    public static final java.lang.String _INVALID_VIDEO_MIDROLL_FREQUENCY_TYPE = "INVALID_VIDEO_MIDROLL_FREQUENCY_TYPE";
    public static final java.lang.String _MALFORMED_VIDEO_MIDROLL_FREQUENCY_CSV = "MALFORMED_VIDEO_MIDROLL_FREQUENCY_CSV";
    public static final java.lang.String _MALFORMED_VIDEO_MIDROLL_FREQUENCY_SINGLE_NUMBER = "MALFORMED_VIDEO_MIDROLL_FREQUENCY_SINGLE_NUMBER";
    public static final java.lang.String _INVALID_OVERLAY_AD_DURATION_RANGE = "INVALID_OVERLAY_AD_DURATION_RANGE";
    public static final java.lang.String _INVALID_OVERLAY_MIDROLL_FREQUENCY_TYPE = "INVALID_OVERLAY_MIDROLL_FREQUENCY_TYPE";
    public static final java.lang.String _MALFORMED_OVERLAY_MIDROLL_FREQUENCY_CSV = "MALFORMED_OVERLAY_MIDROLL_FREQUENCY_CSV";
    public static final java.lang.String _MALFORMED_OVERLAY_MIDROLL_FREQUENCY_SINGLE_NUMBER = "MALFORMED_OVERLAY_MIDROLL_FREQUENCY_SINGLE_NUMBER";
    public static final java.lang.String _INVALID_BUMPER_MAX_DURATION = "INVALID_BUMPER_MAX_DURATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdRuleSlotErrorReason DIFFERENT_STATUS_THAN_AD_RULE = new AdRuleSlotErrorReason(_DIFFERENT_STATUS_THAN_AD_RULE);
    public static final AdRuleSlotErrorReason INVALID_VIDEO_AD_DURATION_RANGE = new AdRuleSlotErrorReason(_INVALID_VIDEO_AD_DURATION_RANGE);
    public static final AdRuleSlotErrorReason INVALID_VIDEO_MIDROLL_FREQUENCY_TYPE = new AdRuleSlotErrorReason(_INVALID_VIDEO_MIDROLL_FREQUENCY_TYPE);
    public static final AdRuleSlotErrorReason MALFORMED_VIDEO_MIDROLL_FREQUENCY_CSV = new AdRuleSlotErrorReason(_MALFORMED_VIDEO_MIDROLL_FREQUENCY_CSV);
    public static final AdRuleSlotErrorReason MALFORMED_VIDEO_MIDROLL_FREQUENCY_SINGLE_NUMBER = new AdRuleSlotErrorReason(_MALFORMED_VIDEO_MIDROLL_FREQUENCY_SINGLE_NUMBER);
    public static final AdRuleSlotErrorReason INVALID_OVERLAY_AD_DURATION_RANGE = new AdRuleSlotErrorReason(_INVALID_OVERLAY_AD_DURATION_RANGE);
    public static final AdRuleSlotErrorReason INVALID_OVERLAY_MIDROLL_FREQUENCY_TYPE = new AdRuleSlotErrorReason(_INVALID_OVERLAY_MIDROLL_FREQUENCY_TYPE);
    public static final AdRuleSlotErrorReason MALFORMED_OVERLAY_MIDROLL_FREQUENCY_CSV = new AdRuleSlotErrorReason(_MALFORMED_OVERLAY_MIDROLL_FREQUENCY_CSV);
    public static final AdRuleSlotErrorReason MALFORMED_OVERLAY_MIDROLL_FREQUENCY_SINGLE_NUMBER = new AdRuleSlotErrorReason(_MALFORMED_OVERLAY_MIDROLL_FREQUENCY_SINGLE_NUMBER);
    public static final AdRuleSlotErrorReason INVALID_BUMPER_MAX_DURATION = new AdRuleSlotErrorReason(_INVALID_BUMPER_MAX_DURATION);
    public static final AdRuleSlotErrorReason UNKNOWN = new AdRuleSlotErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdRuleSlotErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdRuleSlotErrorReason enumeration = (AdRuleSlotErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdRuleSlotErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdRuleSlotErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdRuleSlotError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
