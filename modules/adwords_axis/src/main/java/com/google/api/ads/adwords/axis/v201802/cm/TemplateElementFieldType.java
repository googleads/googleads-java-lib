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
 * TemplateElementFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class TemplateElementFieldType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TemplateElementFieldType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADDRESS = "ADDRESS";
    public static final java.lang.String _AUDIO = "AUDIO";
    public static final java.lang.String _ENUM = "ENUM";
    public static final java.lang.String _IMAGE = "IMAGE";
    public static final java.lang.String _BACKGROUND_IMAGE = "BACKGROUND_IMAGE";
    public static final java.lang.String _NUMBER = "NUMBER";
    public static final java.lang.String _TEXT = "TEXT";
    public static final java.lang.String _URL = "URL";
    public static final java.lang.String _VIDEO = "VIDEO";
    public static final java.lang.String _VISIBLE_URL = "VISIBLE_URL";
    public static final java.lang.String _MEDIA_BUNDLE = "MEDIA_BUNDLE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TemplateElementFieldType ADDRESS = new TemplateElementFieldType(_ADDRESS);
    public static final TemplateElementFieldType AUDIO = new TemplateElementFieldType(_AUDIO);
    public static final TemplateElementFieldType ENUM = new TemplateElementFieldType(_ENUM);
    public static final TemplateElementFieldType IMAGE = new TemplateElementFieldType(_IMAGE);
    public static final TemplateElementFieldType BACKGROUND_IMAGE = new TemplateElementFieldType(_BACKGROUND_IMAGE);
    public static final TemplateElementFieldType NUMBER = new TemplateElementFieldType(_NUMBER);
    public static final TemplateElementFieldType TEXT = new TemplateElementFieldType(_TEXT);
    public static final TemplateElementFieldType URL = new TemplateElementFieldType(_URL);
    public static final TemplateElementFieldType VIDEO = new TemplateElementFieldType(_VIDEO);
    public static final TemplateElementFieldType VISIBLE_URL = new TemplateElementFieldType(_VISIBLE_URL);
    public static final TemplateElementFieldType MEDIA_BUNDLE = new TemplateElementFieldType(_MEDIA_BUNDLE);
    public static final TemplateElementFieldType UNKNOWN = new TemplateElementFieldType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TemplateElementFieldType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TemplateElementFieldType enumeration = (TemplateElementFieldType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TemplateElementFieldType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TemplateElementFieldType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElementField.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
