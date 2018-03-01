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
 * UniversalAppBiddingStrategyGoalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class UniversalAppBiddingStrategyGoalType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UniversalAppBiddingStrategyGoalType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME = "OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME";
    public static final java.lang.String _OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME = "OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME";
    public static final java.lang.String _OPTIMIZE_FOR_TOTAL_CONVERSION_VALUE = "OPTIMIZE_FOR_TOTAL_CONVERSION_VALUE";
    public static final java.lang.String _OPTIMIZE_FOR_TARGET_IN_APP_CONVERSION = "OPTIMIZE_FOR_TARGET_IN_APP_CONVERSION";
    public static final java.lang.String _OPTIMIZE_FOR_RETURN_ON_ADVERTISING_SPEND = "OPTIMIZE_FOR_RETURN_ON_ADVERTISING_SPEND";
    public static final UniversalAppBiddingStrategyGoalType UNKNOWN = new UniversalAppBiddingStrategyGoalType(_UNKNOWN);
    public static final UniversalAppBiddingStrategyGoalType OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME = new UniversalAppBiddingStrategyGoalType(_OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME);
    public static final UniversalAppBiddingStrategyGoalType OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME = new UniversalAppBiddingStrategyGoalType(_OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME);
    public static final UniversalAppBiddingStrategyGoalType OPTIMIZE_FOR_TOTAL_CONVERSION_VALUE = new UniversalAppBiddingStrategyGoalType(_OPTIMIZE_FOR_TOTAL_CONVERSION_VALUE);
    public static final UniversalAppBiddingStrategyGoalType OPTIMIZE_FOR_TARGET_IN_APP_CONVERSION = new UniversalAppBiddingStrategyGoalType(_OPTIMIZE_FOR_TARGET_IN_APP_CONVERSION);
    public static final UniversalAppBiddingStrategyGoalType OPTIMIZE_FOR_RETURN_ON_ADVERTISING_SPEND = new UniversalAppBiddingStrategyGoalType(_OPTIMIZE_FOR_RETURN_ON_ADVERTISING_SPEND);
    public java.lang.String getValue() { return _value_;}
    public static UniversalAppBiddingStrategyGoalType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UniversalAppBiddingStrategyGoalType enumeration = (UniversalAppBiddingStrategyGoalType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UniversalAppBiddingStrategyGoalType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UniversalAppBiddingStrategyGoalType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppBiddingStrategyGoalType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
