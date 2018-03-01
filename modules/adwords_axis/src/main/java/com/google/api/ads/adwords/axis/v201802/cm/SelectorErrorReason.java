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
 * SelectorErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class SelectorErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SelectorErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_FIELD_NAME = "INVALID_FIELD_NAME";
    public static final java.lang.String _MISSING_FIELDS = "MISSING_FIELDS";
    public static final java.lang.String _MISSING_PREDICATES = "MISSING_PREDICATES";
    public static final java.lang.String _OPERATOR_DOES_NOT_SUPPORT_MULTIPLE_VALUES = "OPERATOR_DOES_NOT_SUPPORT_MULTIPLE_VALUES";
    public static final java.lang.String _INVALID_PREDICATE_ENUM_VALUE = "INVALID_PREDICATE_ENUM_VALUE";
    public static final java.lang.String _MISSING_PREDICATE_OPERATOR = "MISSING_PREDICATE_OPERATOR";
    public static final java.lang.String _MISSING_PREDICATE_VALUES = "MISSING_PREDICATE_VALUES";
    public static final java.lang.String _INVALID_PREDICATE_FIELD_NAME = "INVALID_PREDICATE_FIELD_NAME";
    public static final java.lang.String _INVALID_PREDICATE_OPERATOR = "INVALID_PREDICATE_OPERATOR";
    public static final java.lang.String _INVALID_FIELD_SELECTION = "INVALID_FIELD_SELECTION";
    public static final java.lang.String _INVALID_PREDICATE_VALUE = "INVALID_PREDICATE_VALUE";
    public static final java.lang.String _INVALID_SORT_FIELD_NAME = "INVALID_SORT_FIELD_NAME";
    public static final java.lang.String _SELECTOR_ERROR = "SELECTOR_ERROR";
    public static final java.lang.String _FILTER_BY_DATE_RANGE_NOT_SUPPORTED = "FILTER_BY_DATE_RANGE_NOT_SUPPORTED";
    public static final java.lang.String _START_INDEX_IS_TOO_HIGH = "START_INDEX_IS_TOO_HIGH";
    public static final java.lang.String _TOO_MANY_PREDICATE_VALUES = "TOO_MANY_PREDICATE_VALUES";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final SelectorErrorReason INVALID_FIELD_NAME = new SelectorErrorReason(_INVALID_FIELD_NAME);
    public static final SelectorErrorReason MISSING_FIELDS = new SelectorErrorReason(_MISSING_FIELDS);
    public static final SelectorErrorReason MISSING_PREDICATES = new SelectorErrorReason(_MISSING_PREDICATES);
    public static final SelectorErrorReason OPERATOR_DOES_NOT_SUPPORT_MULTIPLE_VALUES = new SelectorErrorReason(_OPERATOR_DOES_NOT_SUPPORT_MULTIPLE_VALUES);
    public static final SelectorErrorReason INVALID_PREDICATE_ENUM_VALUE = new SelectorErrorReason(_INVALID_PREDICATE_ENUM_VALUE);
    public static final SelectorErrorReason MISSING_PREDICATE_OPERATOR = new SelectorErrorReason(_MISSING_PREDICATE_OPERATOR);
    public static final SelectorErrorReason MISSING_PREDICATE_VALUES = new SelectorErrorReason(_MISSING_PREDICATE_VALUES);
    public static final SelectorErrorReason INVALID_PREDICATE_FIELD_NAME = new SelectorErrorReason(_INVALID_PREDICATE_FIELD_NAME);
    public static final SelectorErrorReason INVALID_PREDICATE_OPERATOR = new SelectorErrorReason(_INVALID_PREDICATE_OPERATOR);
    public static final SelectorErrorReason INVALID_FIELD_SELECTION = new SelectorErrorReason(_INVALID_FIELD_SELECTION);
    public static final SelectorErrorReason INVALID_PREDICATE_VALUE = new SelectorErrorReason(_INVALID_PREDICATE_VALUE);
    public static final SelectorErrorReason INVALID_SORT_FIELD_NAME = new SelectorErrorReason(_INVALID_SORT_FIELD_NAME);
    public static final SelectorErrorReason SELECTOR_ERROR = new SelectorErrorReason(_SELECTOR_ERROR);
    public static final SelectorErrorReason FILTER_BY_DATE_RANGE_NOT_SUPPORTED = new SelectorErrorReason(_FILTER_BY_DATE_RANGE_NOT_SUPPORTED);
    public static final SelectorErrorReason START_INDEX_IS_TOO_HIGH = new SelectorErrorReason(_START_INDEX_IS_TOO_HIGH);
    public static final SelectorErrorReason TOO_MANY_PREDICATE_VALUES = new SelectorErrorReason(_TOO_MANY_PREDICATE_VALUES);
    public static final SelectorErrorReason UNKNOWN_ERROR = new SelectorErrorReason(_UNKNOWN_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static SelectorErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SelectorErrorReason enumeration = (SelectorErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SelectorErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SelectorErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SelectorError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
