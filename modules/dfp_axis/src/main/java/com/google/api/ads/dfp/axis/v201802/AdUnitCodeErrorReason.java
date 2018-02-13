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
 * AdUnitCodeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class AdUnitCodeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdUnitCodeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_CHARACTERS = "INVALID_CHARACTERS";
    public static final java.lang.String _INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED = "INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED";
    public static final java.lang.String _LEADING_FORWARD_SLASH = "LEADING_FORWARD_SLASH";
    public static final java.lang.String _RESERVED_CODE = "RESERVED_CODE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdUnitCodeErrorReason INVALID_CHARACTERS = new AdUnitCodeErrorReason(_INVALID_CHARACTERS);
    public static final AdUnitCodeErrorReason INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED = new AdUnitCodeErrorReason(_INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED);
    public static final AdUnitCodeErrorReason LEADING_FORWARD_SLASH = new AdUnitCodeErrorReason(_LEADING_FORWARD_SLASH);
    public static final AdUnitCodeErrorReason RESERVED_CODE = new AdUnitCodeErrorReason(_RESERVED_CODE);
    public static final AdUnitCodeErrorReason UNKNOWN = new AdUnitCodeErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdUnitCodeErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdUnitCodeErrorReason enumeration = (AdUnitCodeErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdUnitCodeErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdUnitCodeErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdUnitCodeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
