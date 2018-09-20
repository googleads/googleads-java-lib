// Copyright 2018 Google LLC
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
 * PolicyTopicEvidenceDestinationMismatchUrlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public class PolicyTopicEvidenceDestinationMismatchUrlType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PolicyTopicEvidenceDestinationMismatchUrlType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _DISPLAY_URL = "DISPLAY_URL";
    public static final java.lang.String _FINAL_URL = "FINAL_URL";
    public static final java.lang.String _FINAL_MOBILE_URL = "FINAL_MOBILE_URL";
    public static final java.lang.String _TRACKING_URL = "TRACKING_URL";
    public static final java.lang.String _MOBILE_TRACKING_URL = "MOBILE_TRACKING_URL";
    public static final PolicyTopicEvidenceDestinationMismatchUrlType UNKNOWN = new PolicyTopicEvidenceDestinationMismatchUrlType(_UNKNOWN);
    public static final PolicyTopicEvidenceDestinationMismatchUrlType DISPLAY_URL = new PolicyTopicEvidenceDestinationMismatchUrlType(_DISPLAY_URL);
    public static final PolicyTopicEvidenceDestinationMismatchUrlType FINAL_URL = new PolicyTopicEvidenceDestinationMismatchUrlType(_FINAL_URL);
    public static final PolicyTopicEvidenceDestinationMismatchUrlType FINAL_MOBILE_URL = new PolicyTopicEvidenceDestinationMismatchUrlType(_FINAL_MOBILE_URL);
    public static final PolicyTopicEvidenceDestinationMismatchUrlType TRACKING_URL = new PolicyTopicEvidenceDestinationMismatchUrlType(_TRACKING_URL);
    public static final PolicyTopicEvidenceDestinationMismatchUrlType MOBILE_TRACKING_URL = new PolicyTopicEvidenceDestinationMismatchUrlType(_MOBILE_TRACKING_URL);
    public java.lang.String getValue() { return _value_;}
    public static PolicyTopicEvidenceDestinationMismatchUrlType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PolicyTopicEvidenceDestinationMismatchUrlType enumeration = (PolicyTopicEvidenceDestinationMismatchUrlType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PolicyTopicEvidenceDestinationMismatchUrlType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PolicyTopicEvidenceDestinationMismatchUrlType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicyTopicEvidenceDestinationMismatchUrlType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
