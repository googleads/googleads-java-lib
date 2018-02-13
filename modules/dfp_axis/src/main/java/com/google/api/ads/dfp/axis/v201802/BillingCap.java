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
 * BillingCap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class BillingCap implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingCap(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_CAP = "NO_CAP";
    public static final java.lang.String _CAPPED_CUMULATIVE = "CAPPED_CUMULATIVE";
    public static final java.lang.String _CAPPED_PER_BILLING_CYCLE = "CAPPED_PER_BILLING_CYCLE";
    public static final java.lang.String _CAPPED_CUMULATIVE_PER_BILLING_CYCLE = "CAPPED_CUMULATIVE_PER_BILLING_CYCLE";
    public static final java.lang.String _CAPPED_WITH_ROLLOVER_PER_BILLING_CYCLE = "CAPPED_WITH_ROLLOVER_PER_BILLING_CYCLE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BillingCap NO_CAP = new BillingCap(_NO_CAP);
    public static final BillingCap CAPPED_CUMULATIVE = new BillingCap(_CAPPED_CUMULATIVE);
    public static final BillingCap CAPPED_PER_BILLING_CYCLE = new BillingCap(_CAPPED_PER_BILLING_CYCLE);
    public static final BillingCap CAPPED_CUMULATIVE_PER_BILLING_CYCLE = new BillingCap(_CAPPED_CUMULATIVE_PER_BILLING_CYCLE);
    public static final BillingCap CAPPED_WITH_ROLLOVER_PER_BILLING_CYCLE = new BillingCap(_CAPPED_WITH_ROLLOVER_PER_BILLING_CYCLE);
    public static final BillingCap UNKNOWN = new BillingCap(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BillingCap fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingCap enumeration = (BillingCap)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingCap fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingCap.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingCap"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
