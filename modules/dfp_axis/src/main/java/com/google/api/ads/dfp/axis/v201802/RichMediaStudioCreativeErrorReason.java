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
 * RichMediaStudioCreativeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class RichMediaStudioCreativeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RichMediaStudioCreativeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CREATION_NOT_ALLOWED = "CREATION_NOT_ALLOWED";
    public static final java.lang.String _UKNOWN_ERROR = "UKNOWN_ERROR";
    public static final java.lang.String _INVALID_CODE_GENERATION_REQUEST = "INVALID_CODE_GENERATION_REQUEST";
    public static final java.lang.String _INVALID_CREATIVE_OBJECT = "INVALID_CREATIVE_OBJECT";
    public static final java.lang.String _STUDIO_CONNECTION_ERROR = "STUDIO_CONNECTION_ERROR";
    public static final java.lang.String _PUSHDOWN_DURATION_NOT_ALLOWED = "PUSHDOWN_DURATION_NOT_ALLOWED";
    public static final java.lang.String _INVALID_POSITION = "INVALID_POSITION";
    public static final java.lang.String _INVALID_Z_INDEX = "INVALID_Z_INDEX";
    public static final java.lang.String _INVALID_PUSHDOWN_DURATION = "INVALID_PUSHDOWN_DURATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final RichMediaStudioCreativeErrorReason CREATION_NOT_ALLOWED = new RichMediaStudioCreativeErrorReason(_CREATION_NOT_ALLOWED);
    public static final RichMediaStudioCreativeErrorReason UKNOWN_ERROR = new RichMediaStudioCreativeErrorReason(_UKNOWN_ERROR);
    public static final RichMediaStudioCreativeErrorReason INVALID_CODE_GENERATION_REQUEST = new RichMediaStudioCreativeErrorReason(_INVALID_CODE_GENERATION_REQUEST);
    public static final RichMediaStudioCreativeErrorReason INVALID_CREATIVE_OBJECT = new RichMediaStudioCreativeErrorReason(_INVALID_CREATIVE_OBJECT);
    public static final RichMediaStudioCreativeErrorReason STUDIO_CONNECTION_ERROR = new RichMediaStudioCreativeErrorReason(_STUDIO_CONNECTION_ERROR);
    public static final RichMediaStudioCreativeErrorReason PUSHDOWN_DURATION_NOT_ALLOWED = new RichMediaStudioCreativeErrorReason(_PUSHDOWN_DURATION_NOT_ALLOWED);
    public static final RichMediaStudioCreativeErrorReason INVALID_POSITION = new RichMediaStudioCreativeErrorReason(_INVALID_POSITION);
    public static final RichMediaStudioCreativeErrorReason INVALID_Z_INDEX = new RichMediaStudioCreativeErrorReason(_INVALID_Z_INDEX);
    public static final RichMediaStudioCreativeErrorReason INVALID_PUSHDOWN_DURATION = new RichMediaStudioCreativeErrorReason(_INVALID_PUSHDOWN_DURATION);
    public static final RichMediaStudioCreativeErrorReason UNKNOWN = new RichMediaStudioCreativeErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static RichMediaStudioCreativeErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RichMediaStudioCreativeErrorReason enumeration = (RichMediaStudioCreativeErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RichMediaStudioCreativeErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RichMediaStudioCreativeErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioCreativeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
