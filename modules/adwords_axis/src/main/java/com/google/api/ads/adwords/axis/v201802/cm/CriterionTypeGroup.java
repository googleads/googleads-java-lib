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
 * CriterionTypeGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class CriterionTypeGroup implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CriterionTypeGroup(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _KEYWORD = "KEYWORD";
    public static final java.lang.String _USER_INTEREST_AND_LIST = "USER_INTEREST_AND_LIST";
    public static final java.lang.String _VERTICAL = "VERTICAL";
    public static final java.lang.String _GENDER = "GENDER";
    public static final java.lang.String _AGE_RANGE = "AGE_RANGE";
    public static final java.lang.String _PLACEMENT = "PLACEMENT";
    public static final java.lang.String _PARENT = "PARENT";
    public static final java.lang.String _INCOME_RANGE = "INCOME_RANGE";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CriterionTypeGroup KEYWORD = new CriterionTypeGroup(_KEYWORD);
    public static final CriterionTypeGroup USER_INTEREST_AND_LIST = new CriterionTypeGroup(_USER_INTEREST_AND_LIST);
    public static final CriterionTypeGroup VERTICAL = new CriterionTypeGroup(_VERTICAL);
    public static final CriterionTypeGroup GENDER = new CriterionTypeGroup(_GENDER);
    public static final CriterionTypeGroup AGE_RANGE = new CriterionTypeGroup(_AGE_RANGE);
    public static final CriterionTypeGroup PLACEMENT = new CriterionTypeGroup(_PLACEMENT);
    public static final CriterionTypeGroup PARENT = new CriterionTypeGroup(_PARENT);
    public static final CriterionTypeGroup INCOME_RANGE = new CriterionTypeGroup(_INCOME_RANGE);
    public static final CriterionTypeGroup NONE = new CriterionTypeGroup(_NONE);
    public static final CriterionTypeGroup UNKNOWN = new CriterionTypeGroup(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CriterionTypeGroup fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CriterionTypeGroup enumeration = (CriterionTypeGroup)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CriterionTypeGroup fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CriterionTypeGroup.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionTypeGroup"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
