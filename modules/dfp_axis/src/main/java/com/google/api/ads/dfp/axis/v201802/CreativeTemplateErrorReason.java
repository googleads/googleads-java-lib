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
 * CreativeTemplateErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class CreativeTemplateErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeTemplateErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_PARSE_CREATIVE_TEMPLATE = "CANNOT_PARSE_CREATIVE_TEMPLATE";
    public static final java.lang.String _VARIABLE_DUPLICATE_UNIQUE_NAME = "VARIABLE_DUPLICATE_UNIQUE_NAME";
    public static final java.lang.String _VARIABLE_INVALID_UNIQUE_NAME = "VARIABLE_INVALID_UNIQUE_NAME";
    public static final java.lang.String _LIST_CHOICE_DUPLICATE_VALUE = "LIST_CHOICE_DUPLICATE_VALUE";
    public static final java.lang.String _LIST_CHOICE_NEEDS_DEFAULT = "LIST_CHOICE_NEEDS_DEFAULT";
    public static final java.lang.String _LIST_CHOICES_EMPTY = "LIST_CHOICES_EMPTY";
    public static final java.lang.String _NO_TARGET_PLATFORMS = "NO_TARGET_PLATFORMS";
    public static final java.lang.String _MULTIPLE_TARGET_PLATFORMS = "MULTIPLE_TARGET_PLATFORMS";
    public static final java.lang.String _UNRECOGNIZED_PLACEHOLDER = "UNRECOGNIZED_PLACEHOLDER";
    public static final java.lang.String _PLACEHOLDERS_NOT_IN_FORMATTER = "PLACEHOLDERS_NOT_IN_FORMATTER";
    public static final java.lang.String _MISSING_INTERSTITIAL_MACRO = "MISSING_INTERSTITIAL_MACRO";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativeTemplateErrorReason CANNOT_PARSE_CREATIVE_TEMPLATE = new CreativeTemplateErrorReason(_CANNOT_PARSE_CREATIVE_TEMPLATE);
    public static final CreativeTemplateErrorReason VARIABLE_DUPLICATE_UNIQUE_NAME = new CreativeTemplateErrorReason(_VARIABLE_DUPLICATE_UNIQUE_NAME);
    public static final CreativeTemplateErrorReason VARIABLE_INVALID_UNIQUE_NAME = new CreativeTemplateErrorReason(_VARIABLE_INVALID_UNIQUE_NAME);
    public static final CreativeTemplateErrorReason LIST_CHOICE_DUPLICATE_VALUE = new CreativeTemplateErrorReason(_LIST_CHOICE_DUPLICATE_VALUE);
    public static final CreativeTemplateErrorReason LIST_CHOICE_NEEDS_DEFAULT = new CreativeTemplateErrorReason(_LIST_CHOICE_NEEDS_DEFAULT);
    public static final CreativeTemplateErrorReason LIST_CHOICES_EMPTY = new CreativeTemplateErrorReason(_LIST_CHOICES_EMPTY);
    public static final CreativeTemplateErrorReason NO_TARGET_PLATFORMS = new CreativeTemplateErrorReason(_NO_TARGET_PLATFORMS);
    public static final CreativeTemplateErrorReason MULTIPLE_TARGET_PLATFORMS = new CreativeTemplateErrorReason(_MULTIPLE_TARGET_PLATFORMS);
    public static final CreativeTemplateErrorReason UNRECOGNIZED_PLACEHOLDER = new CreativeTemplateErrorReason(_UNRECOGNIZED_PLACEHOLDER);
    public static final CreativeTemplateErrorReason PLACEHOLDERS_NOT_IN_FORMATTER = new CreativeTemplateErrorReason(_PLACEHOLDERS_NOT_IN_FORMATTER);
    public static final CreativeTemplateErrorReason MISSING_INTERSTITIAL_MACRO = new CreativeTemplateErrorReason(_MISSING_INTERSTITIAL_MACRO);
    public static final CreativeTemplateErrorReason UNKNOWN = new CreativeTemplateErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CreativeTemplateErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeTemplateErrorReason enumeration = (CreativeTemplateErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeTemplateErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativeTemplateErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeTemplateError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
