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
 * CommonErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;

public class CommonErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CommonErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_FOUND = "NOT_FOUND";
    public static final java.lang.String _ALREADY_EXISTS = "ALREADY_EXISTS";
    public static final java.lang.String _NOT_APPLICABLE = "NOT_APPLICABLE";
    public static final java.lang.String _DUPLICATE_OBJECT = "DUPLICATE_OBJECT";
    public static final java.lang.String _CANNOT_UPDATE = "CANNOT_UPDATE";
    public static final java.lang.String _UNSUPPORTED_OPERATION = "UNSUPPORTED_OPERATION";
    public static final java.lang.String _CONCURRENT_MODIFICATION = "CONCURRENT_MODIFICATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CommonErrorReason NOT_FOUND = new CommonErrorReason(_NOT_FOUND);
    public static final CommonErrorReason ALREADY_EXISTS = new CommonErrorReason(_ALREADY_EXISTS);
    public static final CommonErrorReason NOT_APPLICABLE = new CommonErrorReason(_NOT_APPLICABLE);
    public static final CommonErrorReason DUPLICATE_OBJECT = new CommonErrorReason(_DUPLICATE_OBJECT);
    public static final CommonErrorReason CANNOT_UPDATE = new CommonErrorReason(_CANNOT_UPDATE);
    public static final CommonErrorReason UNSUPPORTED_OPERATION = new CommonErrorReason(_UNSUPPORTED_OPERATION);
    public static final CommonErrorReason CONCURRENT_MODIFICATION = new CommonErrorReason(_CONCURRENT_MODIFICATION);
    public static final CommonErrorReason UNKNOWN = new CommonErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CommonErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CommonErrorReason enumeration = (CommonErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CommonErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CommonErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "CommonError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
