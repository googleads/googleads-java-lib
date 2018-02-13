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
 * CompanyCreditStatusErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class CompanyCreditStatusErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompanyCreditStatusErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED = "COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_USE_CREDIT_STATUS_SETTING = "CANNOT_USE_CREDIT_STATUS_SETTING";
    public static final java.lang.String _CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING = "CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING";
    public static final java.lang.String _UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER = "UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER";
    public static final java.lang.String _UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM = "UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM";
    public static final java.lang.String _CANNOT_BLOCK_COMPANY_TOO_MANY_APPROVED_ORDERS = "CANNOT_BLOCK_COMPANY_TOO_MANY_APPROVED_ORDERS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CompanyCreditStatusErrorReason COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED = new CompanyCreditStatusErrorReason(_COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED);
    public static final CompanyCreditStatusErrorReason CANNOT_USE_CREDIT_STATUS_SETTING = new CompanyCreditStatusErrorReason(_CANNOT_USE_CREDIT_STATUS_SETTING);
    public static final CompanyCreditStatusErrorReason CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING = new CompanyCreditStatusErrorReason(_CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING);
    public static final CompanyCreditStatusErrorReason UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER = new CompanyCreditStatusErrorReason(_UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER);
    public static final CompanyCreditStatusErrorReason UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM = new CompanyCreditStatusErrorReason(_UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM);
    public static final CompanyCreditStatusErrorReason CANNOT_BLOCK_COMPANY_TOO_MANY_APPROVED_ORDERS = new CompanyCreditStatusErrorReason(_CANNOT_BLOCK_COMPANY_TOO_MANY_APPROVED_ORDERS);
    public static final CompanyCreditStatusErrorReason UNKNOWN = new CompanyCreditStatusErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CompanyCreditStatusErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompanyCreditStatusErrorReason enumeration = (CompanyCreditStatusErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompanyCreditStatusErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CompanyCreditStatusErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CompanyCreditStatusError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
