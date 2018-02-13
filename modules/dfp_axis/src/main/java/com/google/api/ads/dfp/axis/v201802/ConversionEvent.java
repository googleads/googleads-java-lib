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
 * ConversionEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ConversionEvent implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConversionEvent(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _CREATIVE_VIEW = "CREATIVE_VIEW";
    public static final java.lang.String _START = "START";
    public static final java.lang.String _SKIP_SHOWN = "SKIP_SHOWN";
    public static final java.lang.String _FIRST_QUARTILE = "FIRST_QUARTILE";
    public static final java.lang.String _MIDPOINT = "MIDPOINT";
    public static final java.lang.String _THIRD_QUARTILE = "THIRD_QUARTILE";
    public static final java.lang.String _ENGAGED_VIEW = "ENGAGED_VIEW";
    public static final java.lang.String _COMPLETE = "COMPLETE";
    public static final java.lang.String _MUTE = "MUTE";
    public static final java.lang.String _UNMUTE = "UNMUTE";
    public static final java.lang.String _PAUSE = "PAUSE";
    public static final java.lang.String _REWIND = "REWIND";
    public static final java.lang.String _RESUME = "RESUME";
    public static final java.lang.String _SKIPPED = "SKIPPED";
    public static final java.lang.String _FULLSCREEN = "FULLSCREEN";
    public static final java.lang.String _EXPAND = "EXPAND";
    public static final java.lang.String _COLLAPSE = "COLLAPSE";
    public static final java.lang.String _ACCEPT_INVITATION = "ACCEPT_INVITATION";
    public static final java.lang.String _CLOSE = "CLOSE";
    public static final java.lang.String _CLICK_TRACKING = "CLICK_TRACKING";
    public static final java.lang.String _SURVEY = "SURVEY";
    public static final java.lang.String _CUSTOM_CLICK = "CUSTOM_CLICK";
    public static final java.lang.String _MEASURABLE_IMPRESSION = "MEASURABLE_IMPRESSION";
    public static final java.lang.String _VIEWABLE_IMPRESSION = "VIEWABLE_IMPRESSION";
    public static final java.lang.String _VIDEO_ABANDON = "VIDEO_ABANDON";
    public static final java.lang.String _FULLY_VIEWABLE_AUDIBLE_HALF_DURATION_IMPRESSION = "FULLY_VIEWABLE_AUDIBLE_HALF_DURATION_IMPRESSION";
    public static final ConversionEvent UNKNOWN = new ConversionEvent(_UNKNOWN);
    public static final ConversionEvent CREATIVE_VIEW = new ConversionEvent(_CREATIVE_VIEW);
    public static final ConversionEvent START = new ConversionEvent(_START);
    public static final ConversionEvent SKIP_SHOWN = new ConversionEvent(_SKIP_SHOWN);
    public static final ConversionEvent FIRST_QUARTILE = new ConversionEvent(_FIRST_QUARTILE);
    public static final ConversionEvent MIDPOINT = new ConversionEvent(_MIDPOINT);
    public static final ConversionEvent THIRD_QUARTILE = new ConversionEvent(_THIRD_QUARTILE);
    public static final ConversionEvent ENGAGED_VIEW = new ConversionEvent(_ENGAGED_VIEW);
    public static final ConversionEvent COMPLETE = new ConversionEvent(_COMPLETE);
    public static final ConversionEvent MUTE = new ConversionEvent(_MUTE);
    public static final ConversionEvent UNMUTE = new ConversionEvent(_UNMUTE);
    public static final ConversionEvent PAUSE = new ConversionEvent(_PAUSE);
    public static final ConversionEvent REWIND = new ConversionEvent(_REWIND);
    public static final ConversionEvent RESUME = new ConversionEvent(_RESUME);
    public static final ConversionEvent SKIPPED = new ConversionEvent(_SKIPPED);
    public static final ConversionEvent FULLSCREEN = new ConversionEvent(_FULLSCREEN);
    public static final ConversionEvent EXPAND = new ConversionEvent(_EXPAND);
    public static final ConversionEvent COLLAPSE = new ConversionEvent(_COLLAPSE);
    public static final ConversionEvent ACCEPT_INVITATION = new ConversionEvent(_ACCEPT_INVITATION);
    public static final ConversionEvent CLOSE = new ConversionEvent(_CLOSE);
    public static final ConversionEvent CLICK_TRACKING = new ConversionEvent(_CLICK_TRACKING);
    public static final ConversionEvent SURVEY = new ConversionEvent(_SURVEY);
    public static final ConversionEvent CUSTOM_CLICK = new ConversionEvent(_CUSTOM_CLICK);
    public static final ConversionEvent MEASURABLE_IMPRESSION = new ConversionEvent(_MEASURABLE_IMPRESSION);
    public static final ConversionEvent VIEWABLE_IMPRESSION = new ConversionEvent(_VIEWABLE_IMPRESSION);
    public static final ConversionEvent VIDEO_ABANDON = new ConversionEvent(_VIDEO_ABANDON);
    public static final ConversionEvent FULLY_VIEWABLE_AUDIBLE_HALF_DURATION_IMPRESSION = new ConversionEvent(_FULLY_VIEWABLE_AUDIBLE_HALF_DURATION_IMPRESSION);
    public java.lang.String getValue() { return _value_;}
    public static ConversionEvent fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConversionEvent enumeration = (ConversionEvent)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConversionEvent fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConversionEvent.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ConversionEvent"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
