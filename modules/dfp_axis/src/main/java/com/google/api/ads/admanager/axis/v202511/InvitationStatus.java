// Copyright 2025 Google LLC
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
 * InvitationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;

public class InvitationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InvitationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _ACCEPTED = "ACCEPTED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _REJECTED = "REJECTED";
    public static final java.lang.String _WITHDRAWN = "WITHDRAWN";
    public static final java.lang.String _DEACTIVATED_BY_AD_MANAGER = "DEACTIVATED_BY_AD_MANAGER";
    public static final InvitationStatus UNKNOWN = new InvitationStatus(_UNKNOWN);
    public static final InvitationStatus ACCEPTED = new InvitationStatus(_ACCEPTED);
    public static final InvitationStatus EXPIRED = new InvitationStatus(_EXPIRED);
    public static final InvitationStatus PENDING = new InvitationStatus(_PENDING);
    public static final InvitationStatus REJECTED = new InvitationStatus(_REJECTED);
    public static final InvitationStatus WITHDRAWN = new InvitationStatus(_WITHDRAWN);
    public static final InvitationStatus DEACTIVATED_BY_AD_MANAGER = new InvitationStatus(_DEACTIVATED_BY_AD_MANAGER);
    public java.lang.String getValue() { return _value_;}
    public static InvitationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InvitationStatus enumeration = (InvitationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InvitationStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InvitationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "InvitationStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
