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
 * AdvertisingChannelSubType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class AdvertisingChannelSubType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdvertisingChannelSubType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _SEARCH_MOBILE_APP = "SEARCH_MOBILE_APP";
    public static final java.lang.String _DISPLAY_MOBILE_APP = "DISPLAY_MOBILE_APP";
    public static final java.lang.String _SEARCH_EXPRESS = "SEARCH_EXPRESS";
    public static final java.lang.String _DISPLAY_EXPRESS = "DISPLAY_EXPRESS";
    public static final java.lang.String _UNIVERSAL_APP_CAMPAIGN = "UNIVERSAL_APP_CAMPAIGN";
    public static final java.lang.String _SHOPPING_UNIVERSAL_ADS = "SHOPPING_UNIVERSAL_ADS";
    public static final java.lang.String _DISPLAY_GMAIL_AD = "DISPLAY_GMAIL_AD";
    public static final AdvertisingChannelSubType UNKNOWN = new AdvertisingChannelSubType(_UNKNOWN);
    public static final AdvertisingChannelSubType SEARCH_MOBILE_APP = new AdvertisingChannelSubType(_SEARCH_MOBILE_APP);
    public static final AdvertisingChannelSubType DISPLAY_MOBILE_APP = new AdvertisingChannelSubType(_DISPLAY_MOBILE_APP);
    public static final AdvertisingChannelSubType SEARCH_EXPRESS = new AdvertisingChannelSubType(_SEARCH_EXPRESS);
    public static final AdvertisingChannelSubType DISPLAY_EXPRESS = new AdvertisingChannelSubType(_DISPLAY_EXPRESS);
    public static final AdvertisingChannelSubType UNIVERSAL_APP_CAMPAIGN = new AdvertisingChannelSubType(_UNIVERSAL_APP_CAMPAIGN);
    public static final AdvertisingChannelSubType SHOPPING_UNIVERSAL_ADS = new AdvertisingChannelSubType(_SHOPPING_UNIVERSAL_ADS);
    public static final AdvertisingChannelSubType DISPLAY_GMAIL_AD = new AdvertisingChannelSubType(_DISPLAY_GMAIL_AD);
    public java.lang.String getValue() { return _value_;}
    public static AdvertisingChannelSubType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdvertisingChannelSubType enumeration = (AdvertisingChannelSubType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdvertisingChannelSubType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdvertisingChannelSubType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdvertisingChannelSubType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
