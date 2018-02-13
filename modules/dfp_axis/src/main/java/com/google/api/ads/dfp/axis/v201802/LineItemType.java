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
 * LineItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class LineItemType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineItemType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SPONSORSHIP = "SPONSORSHIP";
    public static final java.lang.String _STANDARD = "STANDARD";
    public static final java.lang.String _NETWORK = "NETWORK";
    public static final java.lang.String _BULK = "BULK";
    public static final java.lang.String _PRICE_PRIORITY = "PRICE_PRIORITY";
    public static final java.lang.String _HOUSE = "HOUSE";
    public static final java.lang.String _LEGACY_DFP = "LEGACY_DFP";
    public static final java.lang.String _CLICK_TRACKING = "CLICK_TRACKING";
    public static final java.lang.String _ADSENSE = "ADSENSE";
    public static final java.lang.String _AD_EXCHANGE = "AD_EXCHANGE";
    public static final java.lang.String _BUMPER = "BUMPER";
    public static final java.lang.String _ADMOB = "ADMOB";
    public static final java.lang.String _PREFERRED_DEAL = "PREFERRED_DEAL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final LineItemType SPONSORSHIP = new LineItemType(_SPONSORSHIP);
    public static final LineItemType STANDARD = new LineItemType(_STANDARD);
    public static final LineItemType NETWORK = new LineItemType(_NETWORK);
    public static final LineItemType BULK = new LineItemType(_BULK);
    public static final LineItemType PRICE_PRIORITY = new LineItemType(_PRICE_PRIORITY);
    public static final LineItemType HOUSE = new LineItemType(_HOUSE);
    public static final LineItemType LEGACY_DFP = new LineItemType(_LEGACY_DFP);
    public static final LineItemType CLICK_TRACKING = new LineItemType(_CLICK_TRACKING);
    public static final LineItemType ADSENSE = new LineItemType(_ADSENSE);
    public static final LineItemType AD_EXCHANGE = new LineItemType(_AD_EXCHANGE);
    public static final LineItemType BUMPER = new LineItemType(_BUMPER);
    public static final LineItemType ADMOB = new LineItemType(_ADMOB);
    public static final LineItemType PREFERRED_DEAL = new LineItemType(_PREFERRED_DEAL);
    public static final LineItemType UNKNOWN = new LineItemType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static LineItemType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LineItemType enumeration = (LineItemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineItemType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LineItemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
