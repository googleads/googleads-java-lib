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
 * LabelServiceErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;

public class LabelServiceErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelServiceErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EMPTY_LABEL_NAME = "EMPTY_LABEL_NAME";
    public static final java.lang.String _LABEL_NAME_TOO_LONG = "LABEL_NAME_TOO_LONG";
    public static final java.lang.String _DUPLICATE_LABEL_NAME = "DUPLICATE_LABEL_NAME";
    public static final java.lang.String _RESERVED_LABEL_NAME = "RESERVED_LABEL_NAME";
    public static final java.lang.String _CANNOT_BE_DELETED = "CANNOT_BE_DELETED";
    public static final java.lang.String _TOO_MANY_LABELS = "TOO_MANY_LABELS";
    public static final java.lang.String _INVALID_LABEL_ID = "INVALID_LABEL_ID";
    public static final java.lang.String _CUSTOMER_CANNOT_CREATE_LABELS = "CUSTOMER_CANNOT_CREATE_LABELS";
    public static final java.lang.String _SERVER_CLIENT_VERSION_MISMATCH = "SERVER_CLIENT_VERSION_MISMATCH";
    public static final LabelServiceErrorReason EMPTY_LABEL_NAME = new LabelServiceErrorReason(_EMPTY_LABEL_NAME);
    public static final LabelServiceErrorReason LABEL_NAME_TOO_LONG = new LabelServiceErrorReason(_LABEL_NAME_TOO_LONG);
    public static final LabelServiceErrorReason DUPLICATE_LABEL_NAME = new LabelServiceErrorReason(_DUPLICATE_LABEL_NAME);
    public static final LabelServiceErrorReason RESERVED_LABEL_NAME = new LabelServiceErrorReason(_RESERVED_LABEL_NAME);
    public static final LabelServiceErrorReason CANNOT_BE_DELETED = new LabelServiceErrorReason(_CANNOT_BE_DELETED);
    public static final LabelServiceErrorReason TOO_MANY_LABELS = new LabelServiceErrorReason(_TOO_MANY_LABELS);
    public static final LabelServiceErrorReason INVALID_LABEL_ID = new LabelServiceErrorReason(_INVALID_LABEL_ID);
    public static final LabelServiceErrorReason CUSTOMER_CANNOT_CREATE_LABELS = new LabelServiceErrorReason(_CUSTOMER_CANNOT_CREATE_LABELS);
    public static final LabelServiceErrorReason SERVER_CLIENT_VERSION_MISMATCH = new LabelServiceErrorReason(_SERVER_CLIENT_VERSION_MISMATCH);
    public java.lang.String getValue() { return _value_;}
    public static LabelServiceErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LabelServiceErrorReason enumeration = (LabelServiceErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LabelServiceErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LabelServiceErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "LabelServiceError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
