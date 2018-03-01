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
 * DateRangeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class DateRangeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateRangeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DATE_RANGE_ERROR = "DATE_RANGE_ERROR";
    public static final java.lang.String _INVALID_DATE = "INVALID_DATE";
    public static final java.lang.String _START_DATE_AFTER_END_DATE = "START_DATE_AFTER_END_DATE";
    public static final java.lang.String _CANNOT_SET_DATE_TO_PAST = "CANNOT_SET_DATE_TO_PAST";
    public static final java.lang.String _AFTER_MAXIMUM_ALLOWABLE_DATE = "AFTER_MAXIMUM_ALLOWABLE_DATE";
    public static final java.lang.String _CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED = "CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED";
    public static final DateRangeErrorReason DATE_RANGE_ERROR = new DateRangeErrorReason(_DATE_RANGE_ERROR);
    public static final DateRangeErrorReason INVALID_DATE = new DateRangeErrorReason(_INVALID_DATE);
    public static final DateRangeErrorReason START_DATE_AFTER_END_DATE = new DateRangeErrorReason(_START_DATE_AFTER_END_DATE);
    public static final DateRangeErrorReason CANNOT_SET_DATE_TO_PAST = new DateRangeErrorReason(_CANNOT_SET_DATE_TO_PAST);
    public static final DateRangeErrorReason AFTER_MAXIMUM_ALLOWABLE_DATE = new DateRangeErrorReason(_AFTER_MAXIMUM_ALLOWABLE_DATE);
    public static final DateRangeErrorReason CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED = new DateRangeErrorReason(_CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED);
    public java.lang.String getValue() { return _value_;}
    public static DateRangeErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateRangeErrorReason enumeration = (DateRangeErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateRangeErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateRangeErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DateRangeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
