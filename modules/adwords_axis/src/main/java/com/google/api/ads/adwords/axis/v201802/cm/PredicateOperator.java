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
 * PredicateOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class PredicateOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PredicateOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EQUALS = "EQUALS";
    public static final java.lang.String _NOT_EQUALS = "NOT_EQUALS";
    public static final java.lang.String _IN = "IN";
    public static final java.lang.String _NOT_IN = "NOT_IN";
    public static final java.lang.String _GREATER_THAN = "GREATER_THAN";
    public static final java.lang.String _GREATER_THAN_EQUALS = "GREATER_THAN_EQUALS";
    public static final java.lang.String _LESS_THAN = "LESS_THAN";
    public static final java.lang.String _LESS_THAN_EQUALS = "LESS_THAN_EQUALS";
    public static final java.lang.String _STARTS_WITH = "STARTS_WITH";
    public static final java.lang.String _STARTS_WITH_IGNORE_CASE = "STARTS_WITH_IGNORE_CASE";
    public static final java.lang.String _CONTAINS = "CONTAINS";
    public static final java.lang.String _CONTAINS_IGNORE_CASE = "CONTAINS_IGNORE_CASE";
    public static final java.lang.String _DOES_NOT_CONTAIN = "DOES_NOT_CONTAIN";
    public static final java.lang.String _DOES_NOT_CONTAIN_IGNORE_CASE = "DOES_NOT_CONTAIN_IGNORE_CASE";
    public static final java.lang.String _CONTAINS_ANY = "CONTAINS_ANY";
    public static final java.lang.String _CONTAINS_ALL = "CONTAINS_ALL";
    public static final java.lang.String _CONTAINS_NONE = "CONTAINS_NONE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final PredicateOperator EQUALS = new PredicateOperator(_EQUALS);
    public static final PredicateOperator NOT_EQUALS = new PredicateOperator(_NOT_EQUALS);
    public static final PredicateOperator IN = new PredicateOperator(_IN);
    public static final PredicateOperator NOT_IN = new PredicateOperator(_NOT_IN);
    public static final PredicateOperator GREATER_THAN = new PredicateOperator(_GREATER_THAN);
    public static final PredicateOperator GREATER_THAN_EQUALS = new PredicateOperator(_GREATER_THAN_EQUALS);
    public static final PredicateOperator LESS_THAN = new PredicateOperator(_LESS_THAN);
    public static final PredicateOperator LESS_THAN_EQUALS = new PredicateOperator(_LESS_THAN_EQUALS);
    public static final PredicateOperator STARTS_WITH = new PredicateOperator(_STARTS_WITH);
    public static final PredicateOperator STARTS_WITH_IGNORE_CASE = new PredicateOperator(_STARTS_WITH_IGNORE_CASE);
    public static final PredicateOperator CONTAINS = new PredicateOperator(_CONTAINS);
    public static final PredicateOperator CONTAINS_IGNORE_CASE = new PredicateOperator(_CONTAINS_IGNORE_CASE);
    public static final PredicateOperator DOES_NOT_CONTAIN = new PredicateOperator(_DOES_NOT_CONTAIN);
    public static final PredicateOperator DOES_NOT_CONTAIN_IGNORE_CASE = new PredicateOperator(_DOES_NOT_CONTAIN_IGNORE_CASE);
    public static final PredicateOperator CONTAINS_ANY = new PredicateOperator(_CONTAINS_ANY);
    public static final PredicateOperator CONTAINS_ALL = new PredicateOperator(_CONTAINS_ALL);
    public static final PredicateOperator CONTAINS_NONE = new PredicateOperator(_CONTAINS_NONE);
    public static final PredicateOperator UNKNOWN = new PredicateOperator(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static PredicateOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PredicateOperator enumeration = (PredicateOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PredicateOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PredicateOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Predicate.Operator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
