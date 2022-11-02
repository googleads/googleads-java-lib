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
 * MobileApplicationStore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;

public class MobileApplicationStore implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MobileApplicationStore(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _APPLE_ITUNES = "APPLE_ITUNES";
    public static final java.lang.String _GOOGLE_PLAY = "GOOGLE_PLAY";
    public static final java.lang.String _ROKU = "ROKU";
    public static final java.lang.String _AMAZON_FIRETV = "AMAZON_FIRETV";
    public static final java.lang.String _PLAYSTATION = "PLAYSTATION";
    public static final java.lang.String _XBOX = "XBOX";
    public static final java.lang.String _SAMSUNG_TV = "SAMSUNG_TV";
    public static final java.lang.String _AMAZON_APP_STORE = "AMAZON_APP_STORE";
    public static final java.lang.String _OPPO_APP_STORE = "OPPO_APP_STORE";
    public static final java.lang.String _SAMSUNG_APP_STORE = "SAMSUNG_APP_STORE";
    public static final java.lang.String _VIVO_APP_STORE = "VIVO_APP_STORE";
    public static final java.lang.String _XIAOMI_APP_STORE = "XIAOMI_APP_STORE";
    public static final MobileApplicationStore UNKNOWN = new MobileApplicationStore(_UNKNOWN);
    public static final MobileApplicationStore APPLE_ITUNES = new MobileApplicationStore(_APPLE_ITUNES);
    public static final MobileApplicationStore GOOGLE_PLAY = new MobileApplicationStore(_GOOGLE_PLAY);
    public static final MobileApplicationStore ROKU = new MobileApplicationStore(_ROKU);
    public static final MobileApplicationStore AMAZON_FIRETV = new MobileApplicationStore(_AMAZON_FIRETV);
    public static final MobileApplicationStore PLAYSTATION = new MobileApplicationStore(_PLAYSTATION);
    public static final MobileApplicationStore XBOX = new MobileApplicationStore(_XBOX);
    public static final MobileApplicationStore SAMSUNG_TV = new MobileApplicationStore(_SAMSUNG_TV);
    public static final MobileApplicationStore AMAZON_APP_STORE = new MobileApplicationStore(_AMAZON_APP_STORE);
    public static final MobileApplicationStore OPPO_APP_STORE = new MobileApplicationStore(_OPPO_APP_STORE);
    public static final MobileApplicationStore SAMSUNG_APP_STORE = new MobileApplicationStore(_SAMSUNG_APP_STORE);
    public static final MobileApplicationStore VIVO_APP_STORE = new MobileApplicationStore(_VIVO_APP_STORE);
    public static final MobileApplicationStore XIAOMI_APP_STORE = new MobileApplicationStore(_XIAOMI_APP_STORE);
    public java.lang.String getValue() { return _value_;}
    public static MobileApplicationStore fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MobileApplicationStore enumeration = (MobileApplicationStore)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MobileApplicationStore fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MobileApplicationStore.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "MobileApplicationStore"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
