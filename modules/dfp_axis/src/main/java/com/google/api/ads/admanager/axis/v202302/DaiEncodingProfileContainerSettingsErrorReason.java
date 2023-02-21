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
 * DaiEncodingProfileContainerSettingsErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202302;

public class DaiEncodingProfileContainerSettingsErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DaiEncodingProfileContainerSettingsErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TS_MUST_HAVE_AUDIO_OR_VIDEO_SETTINGS = "TS_MUST_HAVE_AUDIO_OR_VIDEO_SETTINGS";
    public static final java.lang.String _FMP4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS = "FMP4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS";
    public static final java.lang.String _HLS_AUDIO_MUST_HAVE_ONLY_AUDIO_SETTINGS = "HLS_AUDIO_MUST_HAVE_ONLY_AUDIO_SETTINGS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DaiEncodingProfileContainerSettingsErrorReason TS_MUST_HAVE_AUDIO_OR_VIDEO_SETTINGS = new DaiEncodingProfileContainerSettingsErrorReason(_TS_MUST_HAVE_AUDIO_OR_VIDEO_SETTINGS);
    public static final DaiEncodingProfileContainerSettingsErrorReason FMP4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS = new DaiEncodingProfileContainerSettingsErrorReason(_FMP4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS);
    public static final DaiEncodingProfileContainerSettingsErrorReason HLS_AUDIO_MUST_HAVE_ONLY_AUDIO_SETTINGS = new DaiEncodingProfileContainerSettingsErrorReason(_HLS_AUDIO_MUST_HAVE_ONLY_AUDIO_SETTINGS);
    public static final DaiEncodingProfileContainerSettingsErrorReason UNKNOWN = new DaiEncodingProfileContainerSettingsErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DaiEncodingProfileContainerSettingsErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DaiEncodingProfileContainerSettingsErrorReason enumeration = (DaiEncodingProfileContainerSettingsErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DaiEncodingProfileContainerSettingsErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DaiEncodingProfileContainerSettingsErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "DaiEncodingProfileContainerSettingsError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
