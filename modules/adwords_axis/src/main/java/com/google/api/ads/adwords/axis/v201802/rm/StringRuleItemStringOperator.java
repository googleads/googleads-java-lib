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
 * StringRuleItemStringOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;

public class StringRuleItemStringOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StringRuleItemStringOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _CONTAINS = "CONTAINS";
    public static final java.lang.String _EQUALS = "EQUALS";
    public static final java.lang.String _STARTS_WITH = "STARTS_WITH";
    public static final java.lang.String _ENDS_WITH = "ENDS_WITH";
    public static final java.lang.String _NOT_EQUAL = "NOT_EQUAL";
    public static final java.lang.String _NOT_CONTAIN = "NOT_CONTAIN";
    public static final java.lang.String _NOT_START_WITH = "NOT_START_WITH";
    public static final java.lang.String _NOT_END_WITH = "NOT_END_WITH";
    public static final StringRuleItemStringOperator UNKNOWN = new StringRuleItemStringOperator(_UNKNOWN);
    public static final StringRuleItemStringOperator CONTAINS = new StringRuleItemStringOperator(_CONTAINS);
    public static final StringRuleItemStringOperator EQUALS = new StringRuleItemStringOperator(_EQUALS);
    public static final StringRuleItemStringOperator STARTS_WITH = new StringRuleItemStringOperator(_STARTS_WITH);
    public static final StringRuleItemStringOperator ENDS_WITH = new StringRuleItemStringOperator(_ENDS_WITH);
    public static final StringRuleItemStringOperator NOT_EQUAL = new StringRuleItemStringOperator(_NOT_EQUAL);
    public static final StringRuleItemStringOperator NOT_CONTAIN = new StringRuleItemStringOperator(_NOT_CONTAIN);
    public static final StringRuleItemStringOperator NOT_START_WITH = new StringRuleItemStringOperator(_NOT_START_WITH);
    public static final StringRuleItemStringOperator NOT_END_WITH = new StringRuleItemStringOperator(_NOT_END_WITH);
    public java.lang.String getValue() { return _value_;}
    public static StringRuleItemStringOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StringRuleItemStringOperator enumeration = (StringRuleItemStringOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StringRuleItemStringOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StringRuleItemStringOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "StringRuleItem.StringOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
