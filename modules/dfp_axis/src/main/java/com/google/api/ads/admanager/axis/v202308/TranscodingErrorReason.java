// Copyright 2023 Google LLC
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
 * TranscodingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public class TranscodingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TranscodingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_COPY_CREATIVE_PENDING_TRANSCODE = "CANNOT_COPY_CREATIVE_PENDING_TRANSCODE";
    public static final java.lang.String _CANNOT_COPY_INVALID_CREATIVE = "CANNOT_COPY_INVALID_CREATIVE";
    public static final java.lang.String _TRANSCODING_IS_IN_PROGRESS = "TRANSCODING_IS_IN_PROGRESS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TranscodingErrorReason CANNOT_COPY_CREATIVE_PENDING_TRANSCODE = new TranscodingErrorReason(_CANNOT_COPY_CREATIVE_PENDING_TRANSCODE);
    public static final TranscodingErrorReason CANNOT_COPY_INVALID_CREATIVE = new TranscodingErrorReason(_CANNOT_COPY_INVALID_CREATIVE);
    public static final TranscodingErrorReason TRANSCODING_IS_IN_PROGRESS = new TranscodingErrorReason(_TRANSCODING_IS_IN_PROGRESS);
    public static final TranscodingErrorReason UNKNOWN = new TranscodingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TranscodingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TranscodingErrorReason enumeration = (TranscodingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TranscodingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TranscodingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "TranscodingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
