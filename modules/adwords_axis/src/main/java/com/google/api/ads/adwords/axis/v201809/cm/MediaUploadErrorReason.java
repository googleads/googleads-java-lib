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
 * MediaUploadErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public class MediaUploadErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MediaUploadErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _FILE_TOO_BIG = "FILE_TOO_BIG";
    public static final java.lang.String _INVALID_IMAGE = "INVALID_IMAGE";
    public static final java.lang.String _ANIMATED_NOT_ALLOWED = "ANIMATED_NOT_ALLOWED";
    public static final java.lang.String _SERVER_ERROR = "SERVER_ERROR";
    public static final MediaUploadErrorReason UNKNOWN = new MediaUploadErrorReason(_UNKNOWN);
    public static final MediaUploadErrorReason FILE_TOO_BIG = new MediaUploadErrorReason(_FILE_TOO_BIG);
    public static final MediaUploadErrorReason INVALID_IMAGE = new MediaUploadErrorReason(_INVALID_IMAGE);
    public static final MediaUploadErrorReason ANIMATED_NOT_ALLOWED = new MediaUploadErrorReason(_ANIMATED_NOT_ALLOWED);
    public static final MediaUploadErrorReason SERVER_ERROR = new MediaUploadErrorReason(_SERVER_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static MediaUploadErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MediaUploadErrorReason enumeration = (MediaUploadErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MediaUploadErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MediaUploadErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MediaUploadError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
