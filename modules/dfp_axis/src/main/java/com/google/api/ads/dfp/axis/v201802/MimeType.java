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
 * MimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class MimeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MimeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _ASP = "ASP";
    public static final java.lang.String _AUDIO_AIFF = "AUDIO_AIFF";
    public static final java.lang.String _AUDIO_BASIC = "AUDIO_BASIC";
    public static final java.lang.String _AUDIO_FLAC = "AUDIO_FLAC";
    public static final java.lang.String _AUDIO_MID = "AUDIO_MID";
    public static final java.lang.String _AUDIO_MP3 = "AUDIO_MP3";
    public static final java.lang.String _AUDIO_MP4 = "AUDIO_MP4";
    public static final java.lang.String _AUDIO_MPEG_URL = "AUDIO_MPEG_URL";
    public static final java.lang.String _AUDIO_MS_WMA = "AUDIO_MS_WMA";
    public static final java.lang.String _AUDIO_OGG = "AUDIO_OGG";
    public static final java.lang.String _AUDIO_REAL_AUDIO_PLUGIN = "AUDIO_REAL_AUDIO_PLUGIN";
    public static final java.lang.String _AUDIO_WAV = "AUDIO_WAV";
    public static final java.lang.String _BINARY = "BINARY";
    public static final java.lang.String _DASH = "DASH";
    public static final java.lang.String _DIRECTOR = "DIRECTOR";
    public static final java.lang.String _FLASH = "FLASH";
    public static final java.lang.String _GRAPHIC_CONVERTER = "GRAPHIC_CONVERTER";
    public static final java.lang.String _JAVASCRIPT = "JAVASCRIPT";
    public static final java.lang.String _JSON = "JSON";
    public static final java.lang.String _IMAGE_BITMAP = "IMAGE_BITMAP";
    public static final java.lang.String _IMAGE_BMP = "IMAGE_BMP";
    public static final java.lang.String _IMAGE_GIF = "IMAGE_GIF";
    public static final java.lang.String _IMAGE_JPEG = "IMAGE_JPEG";
    public static final java.lang.String _IMAGE_PHOTOSHOP = "IMAGE_PHOTOSHOP";
    public static final java.lang.String _IMAGE_PNG = "IMAGE_PNG";
    public static final java.lang.String _IMAGE_TIFF = "IMAGE_TIFF";
    public static final java.lang.String _IMAGE_WBMP = "IMAGE_WBMP";
    public static final java.lang.String _M3U8 = "M3U8";
    public static final java.lang.String _MAC_BIN_HEX_40 = "MAC_BIN_HEX_40";
    public static final java.lang.String _MS_EXCEL = "MS_EXCEL";
    public static final java.lang.String _MS_POWERPOINT = "MS_POWERPOINT";
    public static final java.lang.String _MS_WORD = "MS_WORD";
    public static final java.lang.String _OCTET_STREAM = "OCTET_STREAM";
    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _POSTSCRIPT = "POSTSCRIPT";
    public static final java.lang.String _RN_REAL_MEDIA = "RN_REAL_MEDIA";
    public static final java.lang.String _RFC_822 = "RFC_822";
    public static final java.lang.String _RTF = "RTF";
    public static final java.lang.String _TEXT_CALENDAR = "TEXT_CALENDAR";
    public static final java.lang.String _TEXT_CSS = "TEXT_CSS";
    public static final java.lang.String _TEXT_CSV = "TEXT_CSV";
    public static final java.lang.String _TEXT_HTML = "TEXT_HTML";
    public static final java.lang.String _TEXT_JAVA = "TEXT_JAVA";
    public static final java.lang.String _TEXT_PLAIN = "TEXT_PLAIN";
    public static final java.lang.String _VIDEO_3GPP = "VIDEO_3GPP";
    public static final java.lang.String _VIDEO_3GPP2 = "VIDEO_3GPP2";
    public static final java.lang.String _VIDEO_AVI = "VIDEO_AVI";
    public static final java.lang.String _VIDEO_FLV = "VIDEO_FLV";
    public static final java.lang.String _VIDEO_MP4 = "VIDEO_MP4";
    public static final java.lang.String _VIDEO_MP4V_ES = "VIDEO_MP4V_ES";
    public static final java.lang.String _VIDEO_MPEG = "VIDEO_MPEG";
    public static final java.lang.String _VIDEO_MS_ASF = "VIDEO_MS_ASF";
    public static final java.lang.String _VIDEO_MS_WM = "VIDEO_MS_WM";
    public static final java.lang.String _VIDEO_MS_WMV = "VIDEO_MS_WMV";
    public static final java.lang.String _VIDEO_MS_WVX = "VIDEO_MS_WVX";
    public static final java.lang.String _VIDEO_OGG = "VIDEO_OGG";
    public static final java.lang.String _VIDEO_QUICKTIME = "VIDEO_QUICKTIME";
    public static final java.lang.String _VIDEO_WEBM = "VIDEO_WEBM";
    public static final java.lang.String _XAML = "XAML";
    public static final java.lang.String _XHTML = "XHTML";
    public static final java.lang.String _XML = "XML";
    public static final java.lang.String _ZIP = "ZIP";
    public static final MimeType UNKNOWN = new MimeType(_UNKNOWN);
    public static final MimeType ASP = new MimeType(_ASP);
    public static final MimeType AUDIO_AIFF = new MimeType(_AUDIO_AIFF);
    public static final MimeType AUDIO_BASIC = new MimeType(_AUDIO_BASIC);
    public static final MimeType AUDIO_FLAC = new MimeType(_AUDIO_FLAC);
    public static final MimeType AUDIO_MID = new MimeType(_AUDIO_MID);
    public static final MimeType AUDIO_MP3 = new MimeType(_AUDIO_MP3);
    public static final MimeType AUDIO_MP4 = new MimeType(_AUDIO_MP4);
    public static final MimeType AUDIO_MPEG_URL = new MimeType(_AUDIO_MPEG_URL);
    public static final MimeType AUDIO_MS_WMA = new MimeType(_AUDIO_MS_WMA);
    public static final MimeType AUDIO_OGG = new MimeType(_AUDIO_OGG);
    public static final MimeType AUDIO_REAL_AUDIO_PLUGIN = new MimeType(_AUDIO_REAL_AUDIO_PLUGIN);
    public static final MimeType AUDIO_WAV = new MimeType(_AUDIO_WAV);
    public static final MimeType BINARY = new MimeType(_BINARY);
    public static final MimeType DASH = new MimeType(_DASH);
    public static final MimeType DIRECTOR = new MimeType(_DIRECTOR);
    public static final MimeType FLASH = new MimeType(_FLASH);
    public static final MimeType GRAPHIC_CONVERTER = new MimeType(_GRAPHIC_CONVERTER);
    public static final MimeType JAVASCRIPT = new MimeType(_JAVASCRIPT);
    public static final MimeType JSON = new MimeType(_JSON);
    public static final MimeType IMAGE_BITMAP = new MimeType(_IMAGE_BITMAP);
    public static final MimeType IMAGE_BMP = new MimeType(_IMAGE_BMP);
    public static final MimeType IMAGE_GIF = new MimeType(_IMAGE_GIF);
    public static final MimeType IMAGE_JPEG = new MimeType(_IMAGE_JPEG);
    public static final MimeType IMAGE_PHOTOSHOP = new MimeType(_IMAGE_PHOTOSHOP);
    public static final MimeType IMAGE_PNG = new MimeType(_IMAGE_PNG);
    public static final MimeType IMAGE_TIFF = new MimeType(_IMAGE_TIFF);
    public static final MimeType IMAGE_WBMP = new MimeType(_IMAGE_WBMP);
    public static final MimeType M3U8 = new MimeType(_M3U8);
    public static final MimeType MAC_BIN_HEX_40 = new MimeType(_MAC_BIN_HEX_40);
    public static final MimeType MS_EXCEL = new MimeType(_MS_EXCEL);
    public static final MimeType MS_POWERPOINT = new MimeType(_MS_POWERPOINT);
    public static final MimeType MS_WORD = new MimeType(_MS_WORD);
    public static final MimeType OCTET_STREAM = new MimeType(_OCTET_STREAM);
    public static final MimeType PDF = new MimeType(_PDF);
    public static final MimeType POSTSCRIPT = new MimeType(_POSTSCRIPT);
    public static final MimeType RN_REAL_MEDIA = new MimeType(_RN_REAL_MEDIA);
    public static final MimeType RFC_822 = new MimeType(_RFC_822);
    public static final MimeType RTF = new MimeType(_RTF);
    public static final MimeType TEXT_CALENDAR = new MimeType(_TEXT_CALENDAR);
    public static final MimeType TEXT_CSS = new MimeType(_TEXT_CSS);
    public static final MimeType TEXT_CSV = new MimeType(_TEXT_CSV);
    public static final MimeType TEXT_HTML = new MimeType(_TEXT_HTML);
    public static final MimeType TEXT_JAVA = new MimeType(_TEXT_JAVA);
    public static final MimeType TEXT_PLAIN = new MimeType(_TEXT_PLAIN);
    public static final MimeType VIDEO_3GPP = new MimeType(_VIDEO_3GPP);
    public static final MimeType VIDEO_3GPP2 = new MimeType(_VIDEO_3GPP2);
    public static final MimeType VIDEO_AVI = new MimeType(_VIDEO_AVI);
    public static final MimeType VIDEO_FLV = new MimeType(_VIDEO_FLV);
    public static final MimeType VIDEO_MP4 = new MimeType(_VIDEO_MP4);
    public static final MimeType VIDEO_MP4V_ES = new MimeType(_VIDEO_MP4V_ES);
    public static final MimeType VIDEO_MPEG = new MimeType(_VIDEO_MPEG);
    public static final MimeType VIDEO_MS_ASF = new MimeType(_VIDEO_MS_ASF);
    public static final MimeType VIDEO_MS_WM = new MimeType(_VIDEO_MS_WM);
    public static final MimeType VIDEO_MS_WMV = new MimeType(_VIDEO_MS_WMV);
    public static final MimeType VIDEO_MS_WVX = new MimeType(_VIDEO_MS_WVX);
    public static final MimeType VIDEO_OGG = new MimeType(_VIDEO_OGG);
    public static final MimeType VIDEO_QUICKTIME = new MimeType(_VIDEO_QUICKTIME);
    public static final MimeType VIDEO_WEBM = new MimeType(_VIDEO_WEBM);
    public static final MimeType XAML = new MimeType(_XAML);
    public static final MimeType XHTML = new MimeType(_XHTML);
    public static final MimeType XML = new MimeType(_XML);
    public static final MimeType ZIP = new MimeType(_ZIP);
    public java.lang.String getValue() { return _value_;}
    public static MimeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MimeType enumeration = (MimeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MimeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MimeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MimeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
