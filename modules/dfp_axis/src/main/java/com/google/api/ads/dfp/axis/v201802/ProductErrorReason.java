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
 * ProductErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ProductErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TEMPLATE_NOT_FOUND = "TEMPLATE_NOT_FOUND";
    public static final java.lang.String _MALFORMED_PRODUCT_ID = "MALFORMED_PRODUCT_ID";
    public static final java.lang.String _BAD_PRODUCT_ID_FEATURE = "BAD_PRODUCT_ID_FEATURE";
    public static final java.lang.String _BAD_PRODUCT_TEMPLATE_ID = "BAD_PRODUCT_TEMPLATE_ID";
    public static final java.lang.String _CANNOT_UPDATE_ARCHIVED_PRODUCT = "CANNOT_UPDATE_ARCHIVED_PRODUCT";
    public static final java.lang.String _QUERY_TOO_LARGE = "QUERY_TOO_LARGE";
    public static final java.lang.String _PRODUCT_TEMPLATE_ID_IS_NOT_ZERO = "PRODUCT_TEMPLATE_ID_IS_NOT_ZERO";
    public static final java.lang.String _INVALID_RATE = "INVALID_RATE";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProductErrorReason TEMPLATE_NOT_FOUND = new ProductErrorReason(_TEMPLATE_NOT_FOUND);
    public static final ProductErrorReason MALFORMED_PRODUCT_ID = new ProductErrorReason(_MALFORMED_PRODUCT_ID);
    public static final ProductErrorReason BAD_PRODUCT_ID_FEATURE = new ProductErrorReason(_BAD_PRODUCT_ID_FEATURE);
    public static final ProductErrorReason BAD_PRODUCT_TEMPLATE_ID = new ProductErrorReason(_BAD_PRODUCT_TEMPLATE_ID);
    public static final ProductErrorReason CANNOT_UPDATE_ARCHIVED_PRODUCT = new ProductErrorReason(_CANNOT_UPDATE_ARCHIVED_PRODUCT);
    public static final ProductErrorReason QUERY_TOO_LARGE = new ProductErrorReason(_QUERY_TOO_LARGE);
    public static final ProductErrorReason PRODUCT_TEMPLATE_ID_IS_NOT_ZERO = new ProductErrorReason(_PRODUCT_TEMPLATE_ID_IS_NOT_ZERO);
    public static final ProductErrorReason INVALID_RATE = new ProductErrorReason(_INVALID_RATE);
    public static final ProductErrorReason INVALID_CURRENCY = new ProductErrorReason(_INVALID_CURRENCY);
    public static final ProductErrorReason UNKNOWN = new ProductErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProductErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductErrorReason enumeration = (ProductErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProductErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
