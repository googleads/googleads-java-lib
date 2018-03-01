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
 * MediaMimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class MediaMimeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MediaMimeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IMAGE_JPEG = "IMAGE_JPEG";
    public static final java.lang.String _IMAGE_GIF = "IMAGE_GIF";
    public static final java.lang.String _IMAGE_PNG = "IMAGE_PNG";
    public static final java.lang.String _FLASH = "FLASH";
    public static final java.lang.String _TEXT_HTML = "TEXT_HTML";
    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _MSWORD = "MSWORD";
    public static final java.lang.String _MSEXCEL = "MSEXCEL";
    public static final java.lang.String _RTF = "RTF";
    public static final java.lang.String _AUDIO_WAV = "AUDIO_WAV";
    public static final java.lang.String _AUDIO_MP3 = "AUDIO_MP3";
    public static final java.lang.String _HTML5_AD_ZIP = "HTML5_AD_ZIP";
    public static final MediaMimeType IMAGE_JPEG = new MediaMimeType(_IMAGE_JPEG);
    public static final MediaMimeType IMAGE_GIF = new MediaMimeType(_IMAGE_GIF);
    public static final MediaMimeType IMAGE_PNG = new MediaMimeType(_IMAGE_PNG);
    public static final MediaMimeType FLASH = new MediaMimeType(_FLASH);
    public static final MediaMimeType TEXT_HTML = new MediaMimeType(_TEXT_HTML);
    public static final MediaMimeType PDF = new MediaMimeType(_PDF);
    public static final MediaMimeType MSWORD = new MediaMimeType(_MSWORD);
    public static final MediaMimeType MSEXCEL = new MediaMimeType(_MSEXCEL);
    public static final MediaMimeType RTF = new MediaMimeType(_RTF);
    public static final MediaMimeType AUDIO_WAV = new MediaMimeType(_AUDIO_WAV);
    public static final MediaMimeType AUDIO_MP3 = new MediaMimeType(_AUDIO_MP3);
    public static final MediaMimeType HTML5_AD_ZIP = new MediaMimeType(_HTML5_AD_ZIP);
    public java.lang.String getValue() { return _value_;}
    public static MediaMimeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MediaMimeType enumeration = (MediaMimeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MediaMimeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MediaMimeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media.MimeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
