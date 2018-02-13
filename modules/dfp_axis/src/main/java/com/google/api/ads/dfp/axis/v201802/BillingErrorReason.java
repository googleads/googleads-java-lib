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
 * BillingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class BillingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNSUPPORTED_BILLING_SCHEDULE = "UNSUPPORTED_BILLING_SCHEDULE";
    public static final java.lang.String _UNSUPPORTED_BILLING_CAP = "UNSUPPORTED_BILLING_CAP";
    public static final java.lang.String _MISSING_BILLING_SOURCE = "MISSING_BILLING_SOURCE";
    public static final java.lang.String _MISSING_BILLING_SCHEDULE = "MISSING_BILLING_SCHEDULE";
    public static final java.lang.String _MISSING_BILLING_CAP = "MISSING_BILLING_CAP";
    public static final java.lang.String _INVALID_BILLING_SOURCE_FOR_OFFLINE = "INVALID_BILLING_SOURCE_FOR_OFFLINE";
    public static final java.lang.String _UPDATE_BILLING_NOT_ALLOWED = "UPDATE_BILLING_NOT_ALLOWED";
    public static final java.lang.String _MISSING_BILLING_BASE = "MISSING_BILLING_BASE";
    public static final java.lang.String _INVALID_BILLING_BASE = "INVALID_BILLING_BASE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BillingErrorReason UNSUPPORTED_BILLING_SCHEDULE = new BillingErrorReason(_UNSUPPORTED_BILLING_SCHEDULE);
    public static final BillingErrorReason UNSUPPORTED_BILLING_CAP = new BillingErrorReason(_UNSUPPORTED_BILLING_CAP);
    public static final BillingErrorReason MISSING_BILLING_SOURCE = new BillingErrorReason(_MISSING_BILLING_SOURCE);
    public static final BillingErrorReason MISSING_BILLING_SCHEDULE = new BillingErrorReason(_MISSING_BILLING_SCHEDULE);
    public static final BillingErrorReason MISSING_BILLING_CAP = new BillingErrorReason(_MISSING_BILLING_CAP);
    public static final BillingErrorReason INVALID_BILLING_SOURCE_FOR_OFFLINE = new BillingErrorReason(_INVALID_BILLING_SOURCE_FOR_OFFLINE);
    public static final BillingErrorReason UPDATE_BILLING_NOT_ALLOWED = new BillingErrorReason(_UPDATE_BILLING_NOT_ALLOWED);
    public static final BillingErrorReason MISSING_BILLING_BASE = new BillingErrorReason(_MISSING_BILLING_BASE);
    public static final BillingErrorReason INVALID_BILLING_BASE = new BillingErrorReason(_INVALID_BILLING_BASE);
    public static final BillingErrorReason UNKNOWN = new BillingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BillingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingErrorReason enumeration = (BillingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
