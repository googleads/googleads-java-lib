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
 * PriceExtensionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class PriceExtensionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PriceExtensionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _BRANDS = "BRANDS";
    public static final java.lang.String _EVENTS = "EVENTS";
    public static final java.lang.String _LOCATIONS = "LOCATIONS";
    public static final java.lang.String _NEIGHBORHOODS = "NEIGHBORHOODS";
    public static final java.lang.String _PRODUCT_CATEGORIES = "PRODUCT_CATEGORIES";
    public static final java.lang.String _PRODUCT_TIERS = "PRODUCT_TIERS";
    public static final java.lang.String _SERVICES = "SERVICES";
    public static final java.lang.String _SERVICE_CATEGORIES = "SERVICE_CATEGORIES";
    public static final java.lang.String _SERVICE_TIERS = "SERVICE_TIERS";
    public static final PriceExtensionType UNKNOWN = new PriceExtensionType(_UNKNOWN);
    public static final PriceExtensionType BRANDS = new PriceExtensionType(_BRANDS);
    public static final PriceExtensionType EVENTS = new PriceExtensionType(_EVENTS);
    public static final PriceExtensionType LOCATIONS = new PriceExtensionType(_LOCATIONS);
    public static final PriceExtensionType NEIGHBORHOODS = new PriceExtensionType(_NEIGHBORHOODS);
    public static final PriceExtensionType PRODUCT_CATEGORIES = new PriceExtensionType(_PRODUCT_CATEGORIES);
    public static final PriceExtensionType PRODUCT_TIERS = new PriceExtensionType(_PRODUCT_TIERS);
    public static final PriceExtensionType SERVICES = new PriceExtensionType(_SERVICES);
    public static final PriceExtensionType SERVICE_CATEGORIES = new PriceExtensionType(_SERVICE_CATEGORIES);
    public static final PriceExtensionType SERVICE_TIERS = new PriceExtensionType(_SERVICE_TIERS);
    public java.lang.String getValue() { return _value_;}
    public static PriceExtensionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PriceExtensionType enumeration = (PriceExtensionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PriceExtensionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PriceExtensionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceExtensionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
