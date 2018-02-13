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
 * CreativeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class CreativeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FLASH_AND_FALLBACK_URL_ARE_SAME = "FLASH_AND_FALLBACK_URL_ARE_SAME";
    public static final java.lang.String _INVALID_INTERNAL_REDIRECT_URL = "INVALID_INTERNAL_REDIRECT_URL";
    public static final java.lang.String _DESTINATION_URL_REQUIRED = "DESTINATION_URL_REQUIRED";
    public static final java.lang.String _DESTINATION_URL_NOT_EMPTY = "DESTINATION_URL_NOT_EMPTY";
    public static final java.lang.String _DESTINATION_URL_TYPE_NOT_SUPPORTED = "DESTINATION_URL_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE = "CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE = "CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE";
    public static final java.lang.String _MISSING_FEATURE = "MISSING_FEATURE";
    public static final java.lang.String _INVALID_COMPANY_TYPE = "INVALID_COMPANY_TYPE";
    public static final java.lang.String _INVALID_ADSENSE_CREATIVE_SIZE = "INVALID_ADSENSE_CREATIVE_SIZE";
    public static final java.lang.String _INVALID_AD_EXCHANGE_CREATIVE_SIZE = "INVALID_AD_EXCHANGE_CREATIVE_SIZE";
    public static final java.lang.String _DUPLICATE_ASSET_IN_CREATIVE = "DUPLICATE_ASSET_IN_CREATIVE";
    public static final java.lang.String _CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY = "CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY";
    public static final java.lang.String _CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE = "CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE";
    public static final java.lang.String _CANNOT_CREATE_PROGRAMMATIC_CREATIVES = "CANNOT_CREATE_PROGRAMMATIC_CREATIVES";
    public static final java.lang.String _INVALID_SIZE_FOR_THIRD_PARTY_IMPRESSION_TRACKER = "INVALID_SIZE_FOR_THIRD_PARTY_IMPRESSION_TRACKER";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativeErrorReason FLASH_AND_FALLBACK_URL_ARE_SAME = new CreativeErrorReason(_FLASH_AND_FALLBACK_URL_ARE_SAME);
    public static final CreativeErrorReason INVALID_INTERNAL_REDIRECT_URL = new CreativeErrorReason(_INVALID_INTERNAL_REDIRECT_URL);
    public static final CreativeErrorReason DESTINATION_URL_REQUIRED = new CreativeErrorReason(_DESTINATION_URL_REQUIRED);
    public static final CreativeErrorReason DESTINATION_URL_NOT_EMPTY = new CreativeErrorReason(_DESTINATION_URL_NOT_EMPTY);
    public static final CreativeErrorReason DESTINATION_URL_TYPE_NOT_SUPPORTED = new CreativeErrorReason(_DESTINATION_URL_TYPE_NOT_SUPPORTED);
    public static final CreativeErrorReason CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE = new CreativeErrorReason(_CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE);
    public static final CreativeErrorReason CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE = new CreativeErrorReason(_CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE);
    public static final CreativeErrorReason MISSING_FEATURE = new CreativeErrorReason(_MISSING_FEATURE);
    public static final CreativeErrorReason INVALID_COMPANY_TYPE = new CreativeErrorReason(_INVALID_COMPANY_TYPE);
    public static final CreativeErrorReason INVALID_ADSENSE_CREATIVE_SIZE = new CreativeErrorReason(_INVALID_ADSENSE_CREATIVE_SIZE);
    public static final CreativeErrorReason INVALID_AD_EXCHANGE_CREATIVE_SIZE = new CreativeErrorReason(_INVALID_AD_EXCHANGE_CREATIVE_SIZE);
    public static final CreativeErrorReason DUPLICATE_ASSET_IN_CREATIVE = new CreativeErrorReason(_DUPLICATE_ASSET_IN_CREATIVE);
    public static final CreativeErrorReason CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY = new CreativeErrorReason(_CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY);
    public static final CreativeErrorReason CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE = new CreativeErrorReason(_CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE);
    public static final CreativeErrorReason CANNOT_CREATE_PROGRAMMATIC_CREATIVES = new CreativeErrorReason(_CANNOT_CREATE_PROGRAMMATIC_CREATIVES);
    public static final CreativeErrorReason INVALID_SIZE_FOR_THIRD_PARTY_IMPRESSION_TRACKER = new CreativeErrorReason(_INVALID_SIZE_FOR_THIRD_PARTY_IMPRESSION_TRACKER);
    public static final CreativeErrorReason UNKNOWN = new CreativeErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CreativeErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeErrorReason enumeration = (CreativeErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativeErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
