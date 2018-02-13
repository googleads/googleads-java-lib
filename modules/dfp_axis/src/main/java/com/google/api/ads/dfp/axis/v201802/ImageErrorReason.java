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
 * ImageErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ImageErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ImageErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_IMAGE = "INVALID_IMAGE";
    public static final java.lang.String _INVALID_SIZE = "INVALID_SIZE";
    public static final java.lang.String _UNEXPECTED_SIZE = "UNEXPECTED_SIZE";
    public static final java.lang.String _OVERLAY_SIZE_TOO_LARGE = "OVERLAY_SIZE_TOO_LARGE";
    public static final java.lang.String _ANIMATED_NOT_ALLOWED = "ANIMATED_NOT_ALLOWED";
    public static final java.lang.String _ANIMATION_TOO_LONG = "ANIMATION_TOO_LONG";
    public static final java.lang.String _CMYK_JPEG_NOT_ALLOWED = "CMYK_JPEG_NOT_ALLOWED";
    public static final java.lang.String _FLASH_NOT_ALLOWED = "FLASH_NOT_ALLOWED";
    public static final java.lang.String _FLASH_WITHOUT_CLICKTAG = "FLASH_WITHOUT_CLICKTAG";
    public static final java.lang.String _ANIMATED_VISUAL_EFFECT = "ANIMATED_VISUAL_EFFECT";
    public static final java.lang.String _FLASH_ERROR = "FLASH_ERROR";
    public static final java.lang.String _LAYOUT_PROBLEM = "LAYOUT_PROBLEM";
    public static final java.lang.String _FLASH_HAS_NETWORK_OBJECTS = "FLASH_HAS_NETWORK_OBJECTS";
    public static final java.lang.String _FLASH_HAS_NETWORK_METHODS = "FLASH_HAS_NETWORK_METHODS";
    public static final java.lang.String _FLASH_HAS_URL = "FLASH_HAS_URL";
    public static final java.lang.String _FLASH_HAS_MOUSE_TRACKING = "FLASH_HAS_MOUSE_TRACKING";
    public static final java.lang.String _FLASH_HAS_RANDOM_NUM = "FLASH_HAS_RANDOM_NUM";
    public static final java.lang.String _FLASH_SELF_TARGETS = "FLASH_SELF_TARGETS";
    public static final java.lang.String _FLASH_BAD_GETURL_TARGET = "FLASH_BAD_GETURL_TARGET";
    public static final java.lang.String _FLASH_VERSION_NOT_SUPPORTED = "FLASH_VERSION_NOT_SUPPORTED";
    public static final java.lang.String _FILE_TOO_LARGE = "FILE_TOO_LARGE";
    public static final java.lang.String _SYSTEM_ERROR = "SYSTEM_ERROR";
    public static final java.lang.String _UNEXPECTED_PRIMARY_ASSET_DENSITY = "UNEXPECTED_PRIMARY_ASSET_DENSITY";
    public static final java.lang.String _DUPLICATE_ASSET_DENSITY = "DUPLICATE_ASSET_DENSITY";
    public static final java.lang.String _MISSING_DEFAULT_ASSET = "MISSING_DEFAULT_ASSET";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ImageErrorReason INVALID_IMAGE = new ImageErrorReason(_INVALID_IMAGE);
    public static final ImageErrorReason INVALID_SIZE = new ImageErrorReason(_INVALID_SIZE);
    public static final ImageErrorReason UNEXPECTED_SIZE = new ImageErrorReason(_UNEXPECTED_SIZE);
    public static final ImageErrorReason OVERLAY_SIZE_TOO_LARGE = new ImageErrorReason(_OVERLAY_SIZE_TOO_LARGE);
    public static final ImageErrorReason ANIMATED_NOT_ALLOWED = new ImageErrorReason(_ANIMATED_NOT_ALLOWED);
    public static final ImageErrorReason ANIMATION_TOO_LONG = new ImageErrorReason(_ANIMATION_TOO_LONG);
    public static final ImageErrorReason CMYK_JPEG_NOT_ALLOWED = new ImageErrorReason(_CMYK_JPEG_NOT_ALLOWED);
    public static final ImageErrorReason FLASH_NOT_ALLOWED = new ImageErrorReason(_FLASH_NOT_ALLOWED);
    public static final ImageErrorReason FLASH_WITHOUT_CLICKTAG = new ImageErrorReason(_FLASH_WITHOUT_CLICKTAG);
    public static final ImageErrorReason ANIMATED_VISUAL_EFFECT = new ImageErrorReason(_ANIMATED_VISUAL_EFFECT);
    public static final ImageErrorReason FLASH_ERROR = new ImageErrorReason(_FLASH_ERROR);
    public static final ImageErrorReason LAYOUT_PROBLEM = new ImageErrorReason(_LAYOUT_PROBLEM);
    public static final ImageErrorReason FLASH_HAS_NETWORK_OBJECTS = new ImageErrorReason(_FLASH_HAS_NETWORK_OBJECTS);
    public static final ImageErrorReason FLASH_HAS_NETWORK_METHODS = new ImageErrorReason(_FLASH_HAS_NETWORK_METHODS);
    public static final ImageErrorReason FLASH_HAS_URL = new ImageErrorReason(_FLASH_HAS_URL);
    public static final ImageErrorReason FLASH_HAS_MOUSE_TRACKING = new ImageErrorReason(_FLASH_HAS_MOUSE_TRACKING);
    public static final ImageErrorReason FLASH_HAS_RANDOM_NUM = new ImageErrorReason(_FLASH_HAS_RANDOM_NUM);
    public static final ImageErrorReason FLASH_SELF_TARGETS = new ImageErrorReason(_FLASH_SELF_TARGETS);
    public static final ImageErrorReason FLASH_BAD_GETURL_TARGET = new ImageErrorReason(_FLASH_BAD_GETURL_TARGET);
    public static final ImageErrorReason FLASH_VERSION_NOT_SUPPORTED = new ImageErrorReason(_FLASH_VERSION_NOT_SUPPORTED);
    public static final ImageErrorReason FILE_TOO_LARGE = new ImageErrorReason(_FILE_TOO_LARGE);
    public static final ImageErrorReason SYSTEM_ERROR = new ImageErrorReason(_SYSTEM_ERROR);
    public static final ImageErrorReason UNEXPECTED_PRIMARY_ASSET_DENSITY = new ImageErrorReason(_UNEXPECTED_PRIMARY_ASSET_DENSITY);
    public static final ImageErrorReason DUPLICATE_ASSET_DENSITY = new ImageErrorReason(_DUPLICATE_ASSET_DENSITY);
    public static final ImageErrorReason MISSING_DEFAULT_ASSET = new ImageErrorReason(_MISSING_DEFAULT_ASSET);
    public static final ImageErrorReason UNKNOWN = new ImageErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ImageErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ImageErrorReason enumeration = (ImageErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ImageErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ImageErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ImageError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
