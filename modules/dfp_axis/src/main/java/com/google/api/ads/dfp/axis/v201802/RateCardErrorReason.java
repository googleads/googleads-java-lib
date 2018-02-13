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
 * RateCardErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class RateCardErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RateCardErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_CURRENCY_CODE = "INVALID_CURRENCY_CODE";
    public static final java.lang.String _INVALID_PRICING_MODEL = "INVALID_PRICING_MODEL";
    public static final java.lang.String _PRODUCT_PACKAGE_NOT_APPLICABLE_ON_MARKETPLACE_RATE_CARD = "PRODUCT_PACKAGE_NOT_APPLICABLE_ON_MARKETPLACE_RATE_CARD";
    public static final java.lang.String _UNSUPPORTED_CURRENCY_CODE = "UNSUPPORTED_CURRENCY_CODE";
    public static final java.lang.String _UNCHANGEABLE_CURRENCY_CODE = "UNCHANGEABLE_CURRENCY_CODE";
    public static final java.lang.String _UNCHANGEABLE_PRICING_MODEL = "UNCHANGEABLE_PRICING_MODEL";
    public static final java.lang.String _MARKETPLACE_RATE_CARD_NOT_UNIQUE = "MARKETPLACE_RATE_CARD_NOT_UNIQUE";
    public static final java.lang.String _NOT_ACCEPT_DEALS_SALES_ON_LEGAL_AGREEMENT = "NOT_ACCEPT_DEALS_SALES_ON_LEGAL_AGREEMENT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final RateCardErrorReason INVALID_CURRENCY_CODE = new RateCardErrorReason(_INVALID_CURRENCY_CODE);
    public static final RateCardErrorReason INVALID_PRICING_MODEL = new RateCardErrorReason(_INVALID_PRICING_MODEL);
    public static final RateCardErrorReason PRODUCT_PACKAGE_NOT_APPLICABLE_ON_MARKETPLACE_RATE_CARD = new RateCardErrorReason(_PRODUCT_PACKAGE_NOT_APPLICABLE_ON_MARKETPLACE_RATE_CARD);
    public static final RateCardErrorReason UNSUPPORTED_CURRENCY_CODE = new RateCardErrorReason(_UNSUPPORTED_CURRENCY_CODE);
    public static final RateCardErrorReason UNCHANGEABLE_CURRENCY_CODE = new RateCardErrorReason(_UNCHANGEABLE_CURRENCY_CODE);
    public static final RateCardErrorReason UNCHANGEABLE_PRICING_MODEL = new RateCardErrorReason(_UNCHANGEABLE_PRICING_MODEL);
    public static final RateCardErrorReason MARKETPLACE_RATE_CARD_NOT_UNIQUE = new RateCardErrorReason(_MARKETPLACE_RATE_CARD_NOT_UNIQUE);
    public static final RateCardErrorReason NOT_ACCEPT_DEALS_SALES_ON_LEGAL_AGREEMENT = new RateCardErrorReason(_NOT_ACCEPT_DEALS_SALES_ON_LEGAL_AGREEMENT);
    public static final RateCardErrorReason UNKNOWN = new RateCardErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static RateCardErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RateCardErrorReason enumeration = (RateCardErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RateCardErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RateCardErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RateCardError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
