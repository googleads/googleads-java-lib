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
 * AttributeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;

public class AttributeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AttributeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _CATEGORY_PRODUCTS_AND_SERVICES = "CATEGORY_PRODUCTS_AND_SERVICES";
    public static final java.lang.String _COMPETITION = "COMPETITION";
    public static final java.lang.String _EXTRACTED_FROM_WEBPAGE = "EXTRACTED_FROM_WEBPAGE";
    public static final java.lang.String _IDEA_TYPE = "IDEA_TYPE";
    public static final java.lang.String _KEYWORD_TEXT = "KEYWORD_TEXT";
    public static final java.lang.String _SEARCH_VOLUME = "SEARCH_VOLUME";
    public static final java.lang.String _AVERAGE_CPC = "AVERAGE_CPC";
    public static final java.lang.String _TARGETED_MONTHLY_SEARCHES = "TARGETED_MONTHLY_SEARCHES";
    public static final AttributeType UNKNOWN = new AttributeType(_UNKNOWN);
    public static final AttributeType CATEGORY_PRODUCTS_AND_SERVICES = new AttributeType(_CATEGORY_PRODUCTS_AND_SERVICES);
    public static final AttributeType COMPETITION = new AttributeType(_COMPETITION);
    public static final AttributeType EXTRACTED_FROM_WEBPAGE = new AttributeType(_EXTRACTED_FROM_WEBPAGE);
    public static final AttributeType IDEA_TYPE = new AttributeType(_IDEA_TYPE);
    public static final AttributeType KEYWORD_TEXT = new AttributeType(_KEYWORD_TEXT);
    public static final AttributeType SEARCH_VOLUME = new AttributeType(_SEARCH_VOLUME);
    public static final AttributeType AVERAGE_CPC = new AttributeType(_AVERAGE_CPC);
    public static final AttributeType TARGETED_MONTHLY_SEARCHES = new AttributeType(_TARGETED_MONTHLY_SEARCHES);
    public java.lang.String getValue() { return _value_;}
    public static AttributeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AttributeType enumeration = (AttributeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AttributeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AttributeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "AttributeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
