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
 * DateRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class DateRangeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateRangeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TODAY = "TODAY";
    public static final java.lang.String _YESTERDAY = "YESTERDAY";
    public static final java.lang.String _LAST_WEEK = "LAST_WEEK";
    public static final java.lang.String _LAST_MONTH = "LAST_MONTH";
    public static final java.lang.String _LAST_3_MONTHS = "LAST_3_MONTHS";
    public static final java.lang.String _REACH_LIFETIME = "REACH_LIFETIME";
    public static final java.lang.String _CUSTOM_DATE = "CUSTOM_DATE";
    public static final java.lang.String _NEXT_DAY = "NEXT_DAY";
    public static final java.lang.String _NEXT_90_DAYS = "NEXT_90_DAYS";
    public static final java.lang.String _NEXT_WEEK = "NEXT_WEEK";
    public static final java.lang.String _NEXT_MONTH = "NEXT_MONTH";
    public static final java.lang.String _CURRENT_AND_NEXT_MONTH = "CURRENT_AND_NEXT_MONTH";
    public static final java.lang.String _NEXT_QUARTER = "NEXT_QUARTER";
    public static final java.lang.String _NEXT_3_MONTHS = "NEXT_3_MONTHS";
    public static final java.lang.String _NEXT_12_MONTHS = "NEXT_12_MONTHS";
    public static final DateRangeType TODAY = new DateRangeType(_TODAY);
    public static final DateRangeType YESTERDAY = new DateRangeType(_YESTERDAY);
    public static final DateRangeType LAST_WEEK = new DateRangeType(_LAST_WEEK);
    public static final DateRangeType LAST_MONTH = new DateRangeType(_LAST_MONTH);
    public static final DateRangeType LAST_3_MONTHS = new DateRangeType(_LAST_3_MONTHS);
    public static final DateRangeType REACH_LIFETIME = new DateRangeType(_REACH_LIFETIME);
    public static final DateRangeType CUSTOM_DATE = new DateRangeType(_CUSTOM_DATE);
    public static final DateRangeType NEXT_DAY = new DateRangeType(_NEXT_DAY);
    public static final DateRangeType NEXT_90_DAYS = new DateRangeType(_NEXT_90_DAYS);
    public static final DateRangeType NEXT_WEEK = new DateRangeType(_NEXT_WEEK);
    public static final DateRangeType NEXT_MONTH = new DateRangeType(_NEXT_MONTH);
    public static final DateRangeType CURRENT_AND_NEXT_MONTH = new DateRangeType(_CURRENT_AND_NEXT_MONTH);
    public static final DateRangeType NEXT_QUARTER = new DateRangeType(_NEXT_QUARTER);
    public static final DateRangeType NEXT_3_MONTHS = new DateRangeType(_NEXT_3_MONTHS);
    public static final DateRangeType NEXT_12_MONTHS = new DateRangeType(_NEXT_12_MONTHS);
    public java.lang.String getValue() { return _value_;}
    public static DateRangeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateRangeType enumeration = (DateRangeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateRangeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateRangeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateRangeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
