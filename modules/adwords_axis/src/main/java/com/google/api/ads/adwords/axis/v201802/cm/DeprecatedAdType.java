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
 * DeprecatedAdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class DeprecatedAdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeprecatedAdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VIDEO = "VIDEO";
    public static final java.lang.String _CLICK_TO_CALL = "CLICK_TO_CALL";
    public static final java.lang.String _IN_STREAM_VIDEO = "IN_STREAM_VIDEO";
    public static final java.lang.String _FROOGLE = "FROOGLE";
    public static final java.lang.String _TEXT_LINK = "TEXT_LINK";
    public static final java.lang.String _GADGET = "GADGET";
    public static final java.lang.String _PRINT = "PRINT";
    public static final java.lang.String _TEXT_WIDE = "TEXT_WIDE";
    public static final java.lang.String _GADGET_TEMPLATE = "GADGET_TEMPLATE";
    public static final java.lang.String _TEXT_WITH_VIDEO = "TEXT_WITH_VIDEO";
    public static final java.lang.String _AUDIO = "AUDIO";
    public static final java.lang.String _LOCAL_BUSINESS_AD = "LOCAL_BUSINESS_AD";
    public static final java.lang.String _AUDIO_TEMPLATE = "AUDIO_TEMPLATE";
    public static final java.lang.String _MOBILE_AD = "MOBILE_AD";
    public static final java.lang.String _MOBILE_IMAGE_AD = "MOBILE_IMAGE_AD";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DeprecatedAdType VIDEO = new DeprecatedAdType(_VIDEO);
    public static final DeprecatedAdType CLICK_TO_CALL = new DeprecatedAdType(_CLICK_TO_CALL);
    public static final DeprecatedAdType IN_STREAM_VIDEO = new DeprecatedAdType(_IN_STREAM_VIDEO);
    public static final DeprecatedAdType FROOGLE = new DeprecatedAdType(_FROOGLE);
    public static final DeprecatedAdType TEXT_LINK = new DeprecatedAdType(_TEXT_LINK);
    public static final DeprecatedAdType GADGET = new DeprecatedAdType(_GADGET);
    public static final DeprecatedAdType PRINT = new DeprecatedAdType(_PRINT);
    public static final DeprecatedAdType TEXT_WIDE = new DeprecatedAdType(_TEXT_WIDE);
    public static final DeprecatedAdType GADGET_TEMPLATE = new DeprecatedAdType(_GADGET_TEMPLATE);
    public static final DeprecatedAdType TEXT_WITH_VIDEO = new DeprecatedAdType(_TEXT_WITH_VIDEO);
    public static final DeprecatedAdType AUDIO = new DeprecatedAdType(_AUDIO);
    public static final DeprecatedAdType LOCAL_BUSINESS_AD = new DeprecatedAdType(_LOCAL_BUSINESS_AD);
    public static final DeprecatedAdType AUDIO_TEMPLATE = new DeprecatedAdType(_AUDIO_TEMPLATE);
    public static final DeprecatedAdType MOBILE_AD = new DeprecatedAdType(_MOBILE_AD);
    public static final DeprecatedAdType MOBILE_IMAGE_AD = new DeprecatedAdType(_MOBILE_IMAGE_AD);
    public static final DeprecatedAdType UNKNOWN = new DeprecatedAdType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DeprecatedAdType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DeprecatedAdType enumeration = (DeprecatedAdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeprecatedAdType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeprecatedAdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DeprecatedAd.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
