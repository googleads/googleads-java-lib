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
 * CreativeWrapperErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class CreativeWrapperErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeWrapperErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LABEL_ALREADY_ASSOCIATED_WITH_CREATIVE_WRAPPER = "LABEL_ALREADY_ASSOCIATED_WITH_CREATIVE_WRAPPER";
    public static final java.lang.String _INVALID_LABEL_TYPE = "INVALID_LABEL_TYPE";
    public static final java.lang.String _UNRECOGNIZED_MACRO = "UNRECOGNIZED_MACRO";
    public static final java.lang.String _NEITHER_HEADER_NOR_FOOTER_SPECIFIED = "NEITHER_HEADER_NOR_FOOTER_SPECIFIED";
    public static final java.lang.String _CANNOT_USE_CREATIVE_WRAPPER_TYPE = "CANNOT_USE_CREATIVE_WRAPPER_TYPE";
    public static final java.lang.String _CANNOT_UPDATE_LABEL_ID = "CANNOT_UPDATE_LABEL_ID";
    public static final java.lang.String _CANNOT_APPLY_TO_AD_UNIT_WITH_VIDEO_SIZES = "CANNOT_APPLY_TO_AD_UNIT_WITH_VIDEO_SIZES";
    public static final java.lang.String _CANNOT_APPLY_TO_MOBILE_AD_UNIT = "CANNOT_APPLY_TO_MOBILE_AD_UNIT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativeWrapperErrorReason LABEL_ALREADY_ASSOCIATED_WITH_CREATIVE_WRAPPER = new CreativeWrapperErrorReason(_LABEL_ALREADY_ASSOCIATED_WITH_CREATIVE_WRAPPER);
    public static final CreativeWrapperErrorReason INVALID_LABEL_TYPE = new CreativeWrapperErrorReason(_INVALID_LABEL_TYPE);
    public static final CreativeWrapperErrorReason UNRECOGNIZED_MACRO = new CreativeWrapperErrorReason(_UNRECOGNIZED_MACRO);
    public static final CreativeWrapperErrorReason NEITHER_HEADER_NOR_FOOTER_SPECIFIED = new CreativeWrapperErrorReason(_NEITHER_HEADER_NOR_FOOTER_SPECIFIED);
    public static final CreativeWrapperErrorReason CANNOT_USE_CREATIVE_WRAPPER_TYPE = new CreativeWrapperErrorReason(_CANNOT_USE_CREATIVE_WRAPPER_TYPE);
    public static final CreativeWrapperErrorReason CANNOT_UPDATE_LABEL_ID = new CreativeWrapperErrorReason(_CANNOT_UPDATE_LABEL_ID);
    public static final CreativeWrapperErrorReason CANNOT_APPLY_TO_AD_UNIT_WITH_VIDEO_SIZES = new CreativeWrapperErrorReason(_CANNOT_APPLY_TO_AD_UNIT_WITH_VIDEO_SIZES);
    public static final CreativeWrapperErrorReason CANNOT_APPLY_TO_MOBILE_AD_UNIT = new CreativeWrapperErrorReason(_CANNOT_APPLY_TO_MOBILE_AD_UNIT);
    public static final CreativeWrapperErrorReason UNKNOWN = new CreativeWrapperErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CreativeWrapperErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeWrapperErrorReason enumeration = (CreativeWrapperErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeWrapperErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativeWrapperErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeWrapperError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
