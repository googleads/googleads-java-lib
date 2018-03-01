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
 * PerformanceTargetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class PerformanceTargetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PerformanceTargetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SPEND_TARGET_REQUIRES_DATE_RANGE = "SPEND_TARGET_REQUIRES_DATE_RANGE";
    public static final java.lang.String _VOLUME_TARGET_VALUE_REQUIRES_DATE_RANGE = "VOLUME_TARGET_VALUE_REQUIRES_DATE_RANGE";
    public static final java.lang.String _START_DATE_AFTER_END_DATE = "START_DATE_AFTER_END_DATE";
    public static final java.lang.String _INCOMPATIBLE_EFFICIENCY_TARGET_TYPE = "INCOMPATIBLE_EFFICIENCY_TARGET_TYPE";
    public static final java.lang.String _EFFICIENCY_TARGET_VALUE_AND_TYPE_ARE_MUTUALLY_REQUIRED = "EFFICIENCY_TARGET_VALUE_AND_TYPE_ARE_MUTUALLY_REQUIRED";
    public static final java.lang.String _OVERLAPPING_DATE_RANGE = "OVERLAPPING_DATE_RANGE";
    public static final java.lang.String _HISTORICAL_PERFORMANCE_TARGETS_CANNOT_BE_MODIFIED = "HISTORICAL_PERFORMANCE_TARGETS_CANNOT_BE_MODIFIED";
    public static final java.lang.String _SPEND_TARGET_AND_SPEND_TARGET_TYPE_ARE_MUTUALLY_REQUIRED = "SPEND_TARGET_AND_SPEND_TARGET_TYPE_ARE_MUTUALLY_REQUIRED";
    public static final java.lang.String _PERFORMANCE_TARGET_ERROR = "PERFORMANCE_TARGET_ERROR";
    public static final PerformanceTargetErrorReason SPEND_TARGET_REQUIRES_DATE_RANGE = new PerformanceTargetErrorReason(_SPEND_TARGET_REQUIRES_DATE_RANGE);
    public static final PerformanceTargetErrorReason VOLUME_TARGET_VALUE_REQUIRES_DATE_RANGE = new PerformanceTargetErrorReason(_VOLUME_TARGET_VALUE_REQUIRES_DATE_RANGE);
    public static final PerformanceTargetErrorReason START_DATE_AFTER_END_DATE = new PerformanceTargetErrorReason(_START_DATE_AFTER_END_DATE);
    public static final PerformanceTargetErrorReason INCOMPATIBLE_EFFICIENCY_TARGET_TYPE = new PerformanceTargetErrorReason(_INCOMPATIBLE_EFFICIENCY_TARGET_TYPE);
    public static final PerformanceTargetErrorReason EFFICIENCY_TARGET_VALUE_AND_TYPE_ARE_MUTUALLY_REQUIRED = new PerformanceTargetErrorReason(_EFFICIENCY_TARGET_VALUE_AND_TYPE_ARE_MUTUALLY_REQUIRED);
    public static final PerformanceTargetErrorReason OVERLAPPING_DATE_RANGE = new PerformanceTargetErrorReason(_OVERLAPPING_DATE_RANGE);
    public static final PerformanceTargetErrorReason HISTORICAL_PERFORMANCE_TARGETS_CANNOT_BE_MODIFIED = new PerformanceTargetErrorReason(_HISTORICAL_PERFORMANCE_TARGETS_CANNOT_BE_MODIFIED);
    public static final PerformanceTargetErrorReason SPEND_TARGET_AND_SPEND_TARGET_TYPE_ARE_MUTUALLY_REQUIRED = new PerformanceTargetErrorReason(_SPEND_TARGET_AND_SPEND_TARGET_TYPE_ARE_MUTUALLY_REQUIRED);
    public static final PerformanceTargetErrorReason PERFORMANCE_TARGET_ERROR = new PerformanceTargetErrorReason(_PERFORMANCE_TARGET_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static PerformanceTargetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PerformanceTargetErrorReason enumeration = (PerformanceTargetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PerformanceTargetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PerformanceTargetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PerformanceTargetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
