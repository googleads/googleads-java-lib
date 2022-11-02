// Copyright 2022 Google LLC
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
 * CreativeTranscodeIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;

public class CreativeTranscodeIdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeTranscodeIdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_ID = "AD_ID";
    public static final java.lang.String _CREATIVE_ID = "CREATIVE_ID";
    public static final java.lang.String _CREATIVE_ADID = "CREATIVE_ADID";
    public static final java.lang.String _UNIVERSAL_AD_ID = "UNIVERSAL_AD_ID";
    public static final java.lang.String _MEDIA_URI = "MEDIA_URI";
    public static final java.lang.String _MEDIA_URI_PATH = "MEDIA_URI_PATH";
    public static final java.lang.String _CREATIVE_ADID_WITH_FALLBACK = "CREATIVE_ADID_WITH_FALLBACK";
    public static final java.lang.String _CANONICALIZED_MEDIA_URI = "CANONICALIZED_MEDIA_URI";
    public static final java.lang.String _GV_REGISTRY_ID = "GV_REGISTRY_ID";
    public static final java.lang.String _UNKNOWN_ID_TYPE = "UNKNOWN_ID_TYPE";
    public static final java.lang.String _MEDIA_URI_HASH = "MEDIA_URI_HASH";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativeTranscodeIdType AD_ID = new CreativeTranscodeIdType(_AD_ID);
    public static final CreativeTranscodeIdType CREATIVE_ID = new CreativeTranscodeIdType(_CREATIVE_ID);
    public static final CreativeTranscodeIdType CREATIVE_ADID = new CreativeTranscodeIdType(_CREATIVE_ADID);
    public static final CreativeTranscodeIdType UNIVERSAL_AD_ID = new CreativeTranscodeIdType(_UNIVERSAL_AD_ID);
    public static final CreativeTranscodeIdType MEDIA_URI = new CreativeTranscodeIdType(_MEDIA_URI);
    public static final CreativeTranscodeIdType MEDIA_URI_PATH = new CreativeTranscodeIdType(_MEDIA_URI_PATH);
    public static final CreativeTranscodeIdType CREATIVE_ADID_WITH_FALLBACK = new CreativeTranscodeIdType(_CREATIVE_ADID_WITH_FALLBACK);
    public static final CreativeTranscodeIdType CANONICALIZED_MEDIA_URI = new CreativeTranscodeIdType(_CANONICALIZED_MEDIA_URI);
    public static final CreativeTranscodeIdType GV_REGISTRY_ID = new CreativeTranscodeIdType(_GV_REGISTRY_ID);
    public static final CreativeTranscodeIdType UNKNOWN_ID_TYPE = new CreativeTranscodeIdType(_UNKNOWN_ID_TYPE);
    public static final CreativeTranscodeIdType MEDIA_URI_HASH = new CreativeTranscodeIdType(_MEDIA_URI_HASH);
    public static final CreativeTranscodeIdType UNKNOWN = new CreativeTranscodeIdType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CreativeTranscodeIdType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeTranscodeIdType enumeration = (CreativeTranscodeIdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeTranscodeIdType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativeTranscodeIdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "CreativeTranscode.IdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
