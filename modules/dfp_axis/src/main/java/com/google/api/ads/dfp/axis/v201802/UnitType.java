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
 * UnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class UnitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UnitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IMPRESSIONS = "IMPRESSIONS";
    public static final java.lang.String _CLICKS = "CLICKS";
    public static final java.lang.String _CLICK_THROUGH_CPA_CONVERSIONS = "CLICK_THROUGH_CPA_CONVERSIONS";
    public static final java.lang.String _VIEW_THROUGH_CPA_CONVERSIONS = "VIEW_THROUGH_CPA_CONVERSIONS";
    public static final java.lang.String _TOTAL_CPA_CONVERSIONS = "TOTAL_CPA_CONVERSIONS";
    public static final java.lang.String _VIEWABLE_IMPRESSIONS = "VIEWABLE_IMPRESSIONS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final UnitType IMPRESSIONS = new UnitType(_IMPRESSIONS);
    public static final UnitType CLICKS = new UnitType(_CLICKS);
    public static final UnitType CLICK_THROUGH_CPA_CONVERSIONS = new UnitType(_CLICK_THROUGH_CPA_CONVERSIONS);
    public static final UnitType VIEW_THROUGH_CPA_CONVERSIONS = new UnitType(_VIEW_THROUGH_CPA_CONVERSIONS);
    public static final UnitType TOTAL_CPA_CONVERSIONS = new UnitType(_TOTAL_CPA_CONVERSIONS);
    public static final UnitType VIEWABLE_IMPRESSIONS = new UnitType(_VIEWABLE_IMPRESSIONS);
    public static final UnitType UNKNOWN = new UnitType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static UnitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UnitType enumeration = (UnitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UnitType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UnitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "UnitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
