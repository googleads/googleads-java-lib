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
 * BiddingStrategyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class BiddingStrategyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BiddingStrategyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MANUAL_CPC = "MANUAL_CPC";
    public static final java.lang.String _MANUAL_CPM = "MANUAL_CPM";
    public static final java.lang.String _PAGE_ONE_PROMOTED = "PAGE_ONE_PROMOTED";
    public static final java.lang.String _TARGET_SPEND = "TARGET_SPEND";
    public static final java.lang.String _ENHANCED_CPC = "ENHANCED_CPC";
    public static final java.lang.String _TARGET_CPA = "TARGET_CPA";
    public static final java.lang.String _TARGET_ROAS = "TARGET_ROAS";
    public static final java.lang.String _MAXIMIZE_CONVERSIONS = "MAXIMIZE_CONVERSIONS";
    public static final java.lang.String _MAXIMIZE_CONVERSION_VALUE = "MAXIMIZE_CONVERSION_VALUE";
    public static final java.lang.String _TARGET_OUTRANK_SHARE = "TARGET_OUTRANK_SHARE";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BiddingStrategyType MANUAL_CPC = new BiddingStrategyType(_MANUAL_CPC);
    public static final BiddingStrategyType MANUAL_CPM = new BiddingStrategyType(_MANUAL_CPM);
    public static final BiddingStrategyType PAGE_ONE_PROMOTED = new BiddingStrategyType(_PAGE_ONE_PROMOTED);
    public static final BiddingStrategyType TARGET_SPEND = new BiddingStrategyType(_TARGET_SPEND);
    public static final BiddingStrategyType ENHANCED_CPC = new BiddingStrategyType(_ENHANCED_CPC);
    public static final BiddingStrategyType TARGET_CPA = new BiddingStrategyType(_TARGET_CPA);
    public static final BiddingStrategyType TARGET_ROAS = new BiddingStrategyType(_TARGET_ROAS);
    public static final BiddingStrategyType MAXIMIZE_CONVERSIONS = new BiddingStrategyType(_MAXIMIZE_CONVERSIONS);
    public static final BiddingStrategyType MAXIMIZE_CONVERSION_VALUE = new BiddingStrategyType(_MAXIMIZE_CONVERSION_VALUE);
    public static final BiddingStrategyType TARGET_OUTRANK_SHARE = new BiddingStrategyType(_TARGET_OUTRANK_SHARE);
    public static final BiddingStrategyType NONE = new BiddingStrategyType(_NONE);
    public static final BiddingStrategyType UNKNOWN = new BiddingStrategyType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BiddingStrategyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BiddingStrategyType enumeration = (BiddingStrategyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BiddingStrategyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BiddingStrategyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
