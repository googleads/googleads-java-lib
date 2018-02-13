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
 * CrossSellErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class CrossSellErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CrossSellErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMPANY_IS_NOT_DISTRIBUTION_PARTNER = "COMPANY_IS_NOT_DISTRIBUTION_PARTNER";
    public static final java.lang.String _CHANGING_PARTNER_NETWORK_IS_NOT_SUPPORTED = "CHANGING_PARTNER_NETWORK_IS_NOT_SUPPORTED";
    public static final java.lang.String _MISSING_DISTRIBUTOR_PARTNER_NAME = "MISSING_DISTRIBUTOR_PARTNER_NAME";
    public static final java.lang.String _DISTRIBUTOR_NETWORK_MISSING_PUBLISHER_FEATURE = "DISTRIBUTOR_NETWORK_MISSING_PUBLISHER_FEATURE";
    public static final java.lang.String _CONTENT_PROVIDER_NETWORK_MISSING_PUBLISHER_FEATURE = "CONTENT_PROVIDER_NETWORK_MISSING_PUBLISHER_FEATURE";
    public static final java.lang.String _INVALID_DISTRIBUTOR_PARTNER_NAME = "INVALID_DISTRIBUTOR_PARTNER_NAME";
    public static final java.lang.String _INVALID_CONTENT_PROVIDER_NETWORK = "INVALID_CONTENT_PROVIDER_NETWORK";
    public static final java.lang.String _CONTENT_PROVIDER_NETWORK_CANNOT_BE_ACTIVE_NETWORK = "CONTENT_PROVIDER_NETWORK_CANNOT_BE_ACTIVE_NETWORK";
    public static final java.lang.String _CONTENT_PROVIDER_NETWORK_ALREADY_ENABLED_FOR_CROSS_SELLING = "CONTENT_PROVIDER_NETWORK_ALREADY_ENABLED_FOR_CROSS_SELLING";
    public static final java.lang.String _DISTRIBUTOR_RULE_VIOLATION_ERROR = "DISTRIBUTOR_RULE_VIOLATION_ERROR";
    public static final java.lang.String _DISTRIBUTOR_RULE_VIOLATION_WARNING = "DISTRIBUTOR_RULE_VIOLATION_WARNING";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CrossSellErrorReason COMPANY_IS_NOT_DISTRIBUTION_PARTNER = new CrossSellErrorReason(_COMPANY_IS_NOT_DISTRIBUTION_PARTNER);
    public static final CrossSellErrorReason CHANGING_PARTNER_NETWORK_IS_NOT_SUPPORTED = new CrossSellErrorReason(_CHANGING_PARTNER_NETWORK_IS_NOT_SUPPORTED);
    public static final CrossSellErrorReason MISSING_DISTRIBUTOR_PARTNER_NAME = new CrossSellErrorReason(_MISSING_DISTRIBUTOR_PARTNER_NAME);
    public static final CrossSellErrorReason DISTRIBUTOR_NETWORK_MISSING_PUBLISHER_FEATURE = new CrossSellErrorReason(_DISTRIBUTOR_NETWORK_MISSING_PUBLISHER_FEATURE);
    public static final CrossSellErrorReason CONTENT_PROVIDER_NETWORK_MISSING_PUBLISHER_FEATURE = new CrossSellErrorReason(_CONTENT_PROVIDER_NETWORK_MISSING_PUBLISHER_FEATURE);
    public static final CrossSellErrorReason INVALID_DISTRIBUTOR_PARTNER_NAME = new CrossSellErrorReason(_INVALID_DISTRIBUTOR_PARTNER_NAME);
    public static final CrossSellErrorReason INVALID_CONTENT_PROVIDER_NETWORK = new CrossSellErrorReason(_INVALID_CONTENT_PROVIDER_NETWORK);
    public static final CrossSellErrorReason CONTENT_PROVIDER_NETWORK_CANNOT_BE_ACTIVE_NETWORK = new CrossSellErrorReason(_CONTENT_PROVIDER_NETWORK_CANNOT_BE_ACTIVE_NETWORK);
    public static final CrossSellErrorReason CONTENT_PROVIDER_NETWORK_ALREADY_ENABLED_FOR_CROSS_SELLING = new CrossSellErrorReason(_CONTENT_PROVIDER_NETWORK_ALREADY_ENABLED_FOR_CROSS_SELLING);
    public static final CrossSellErrorReason DISTRIBUTOR_RULE_VIOLATION_ERROR = new CrossSellErrorReason(_DISTRIBUTOR_RULE_VIOLATION_ERROR);
    public static final CrossSellErrorReason DISTRIBUTOR_RULE_VIOLATION_WARNING = new CrossSellErrorReason(_DISTRIBUTOR_RULE_VIOLATION_WARNING);
    public static final CrossSellErrorReason UNKNOWN = new CrossSellErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CrossSellErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CrossSellErrorReason enumeration = (CrossSellErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CrossSellErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CrossSellErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CrossSellError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
