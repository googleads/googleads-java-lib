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

package com.google.api.ads.adwords.axis.v201802.cm;

public class ImageErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ImageErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_IMAGE = "INVALID_IMAGE";
    public static final java.lang.String _STORAGE_ERROR = "STORAGE_ERROR";
    public static final java.lang.String _BAD_REQUEST = "BAD_REQUEST";
    public static final java.lang.String _UNEXPECTED_SIZE = "UNEXPECTED_SIZE";
    public static final java.lang.String _ANIMATED_NOT_ALLOWED = "ANIMATED_NOT_ALLOWED";
    public static final java.lang.String _ANIMATION_TOO_LONG = "ANIMATION_TOO_LONG";
    public static final java.lang.String _SERVER_ERROR = "SERVER_ERROR";
    public static final java.lang.String _CMYK_JPEG_NOT_ALLOWED = "CMYK_JPEG_NOT_ALLOWED";
    public static final java.lang.String _FLASH_NOT_ALLOWED = "FLASH_NOT_ALLOWED";
    public static final java.lang.String _FLASH_WITHOUT_CLICKTAG = "FLASH_WITHOUT_CLICKTAG";
    public static final java.lang.String _FLASH_ERROR_AFTER_FIXING_CLICK_TAG = "FLASH_ERROR_AFTER_FIXING_CLICK_TAG";
    public static final java.lang.String _ANIMATED_VISUAL_EFFECT = "ANIMATED_VISUAL_EFFECT";
    public static final java.lang.String _FLASH_ERROR = "FLASH_ERROR";
    public static final java.lang.String _LAYOUT_PROBLEM = "LAYOUT_PROBLEM";
    public static final java.lang.String _PROBLEM_READING_IMAGE_FILE = "PROBLEM_READING_IMAGE_FILE";
    public static final java.lang.String _ERROR_STORING_IMAGE = "ERROR_STORING_IMAGE";
    public static final java.lang.String _ASPECT_RATIO_NOT_ALLOWED = "ASPECT_RATIO_NOT_ALLOWED";
    public static final java.lang.String _FLASH_HAS_NETWORK_OBJECTS = "FLASH_HAS_NETWORK_OBJECTS";
    public static final java.lang.String _FLASH_HAS_NETWORK_METHODS = "FLASH_HAS_NETWORK_METHODS";
    public static final java.lang.String _FLASH_HAS_URL = "FLASH_HAS_URL";
    public static final java.lang.String _FLASH_HAS_MOUSE_TRACKING = "FLASH_HAS_MOUSE_TRACKING";
    public static final java.lang.String _FLASH_HAS_RANDOM_NUM = "FLASH_HAS_RANDOM_NUM";
    public static final java.lang.String _FLASH_SELF_TARGETS = "FLASH_SELF_TARGETS";
    public static final java.lang.String _FLASH_BAD_GETURL_TARGET = "FLASH_BAD_GETURL_TARGET";
    public static final java.lang.String _FLASH_VERSION_NOT_SUPPORTED = "FLASH_VERSION_NOT_SUPPORTED";
    public static final java.lang.String _FLASH_WITHOUT_HARD_CODED_CLICK_URL = "FLASH_WITHOUT_HARD_CODED_CLICK_URL";
    public static final java.lang.String _INVALID_FLASH_FILE = "INVALID_FLASH_FILE";
    public static final java.lang.String _FAILED_TO_FIX_CLICK_TAG_IN_FLASH = "FAILED_TO_FIX_CLICK_TAG_IN_FLASH";
    public static final java.lang.String _FLASH_ACCESSES_NETWORK_RESOURCES = "FLASH_ACCESSES_NETWORK_RESOURCES";
    public static final java.lang.String _FLASH_EXTERNAL_JS_CALL = "FLASH_EXTERNAL_JS_CALL";
    public static final java.lang.String _FLASH_EXTERNAL_FS_CALL = "FLASH_EXTERNAL_FS_CALL";
    public static final java.lang.String _FILE_TOO_LARGE = "FILE_TOO_LARGE";
    public static final java.lang.String _IMAGE_DATA_TOO_LARGE = "IMAGE_DATA_TOO_LARGE";
    public static final java.lang.String _IMAGE_PROCESSING_ERROR = "IMAGE_PROCESSING_ERROR";
    public static final java.lang.String _IMAGE_TOO_SMALL = "IMAGE_TOO_SMALL";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _PROBLEM_READING_FILE = "PROBLEM_READING_FILE";
    public static final ImageErrorReason INVALID_IMAGE = new ImageErrorReason(_INVALID_IMAGE);
    public static final ImageErrorReason STORAGE_ERROR = new ImageErrorReason(_STORAGE_ERROR);
    public static final ImageErrorReason BAD_REQUEST = new ImageErrorReason(_BAD_REQUEST);
    public static final ImageErrorReason UNEXPECTED_SIZE = new ImageErrorReason(_UNEXPECTED_SIZE);
    public static final ImageErrorReason ANIMATED_NOT_ALLOWED = new ImageErrorReason(_ANIMATED_NOT_ALLOWED);
    public static final ImageErrorReason ANIMATION_TOO_LONG = new ImageErrorReason(_ANIMATION_TOO_LONG);
    public static final ImageErrorReason SERVER_ERROR = new ImageErrorReason(_SERVER_ERROR);
    public static final ImageErrorReason CMYK_JPEG_NOT_ALLOWED = new ImageErrorReason(_CMYK_JPEG_NOT_ALLOWED);
    public static final ImageErrorReason FLASH_NOT_ALLOWED = new ImageErrorReason(_FLASH_NOT_ALLOWED);
    public static final ImageErrorReason FLASH_WITHOUT_CLICKTAG = new ImageErrorReason(_FLASH_WITHOUT_CLICKTAG);
    public static final ImageErrorReason FLASH_ERROR_AFTER_FIXING_CLICK_TAG = new ImageErrorReason(_FLASH_ERROR_AFTER_FIXING_CLICK_TAG);
    public static final ImageErrorReason ANIMATED_VISUAL_EFFECT = new ImageErrorReason(_ANIMATED_VISUAL_EFFECT);
    public static final ImageErrorReason FLASH_ERROR = new ImageErrorReason(_FLASH_ERROR);
    public static final ImageErrorReason LAYOUT_PROBLEM = new ImageErrorReason(_LAYOUT_PROBLEM);
    public static final ImageErrorReason PROBLEM_READING_IMAGE_FILE = new ImageErrorReason(_PROBLEM_READING_IMAGE_FILE);
    public static final ImageErrorReason ERROR_STORING_IMAGE = new ImageErrorReason(_ERROR_STORING_IMAGE);
    public static final ImageErrorReason ASPECT_RATIO_NOT_ALLOWED = new ImageErrorReason(_ASPECT_RATIO_NOT_ALLOWED);
    public static final ImageErrorReason FLASH_HAS_NETWORK_OBJECTS = new ImageErrorReason(_FLASH_HAS_NETWORK_OBJECTS);
    public static final ImageErrorReason FLASH_HAS_NETWORK_METHODS = new ImageErrorReason(_FLASH_HAS_NETWORK_METHODS);
    public static final ImageErrorReason FLASH_HAS_URL = new ImageErrorReason(_FLASH_HAS_URL);
    public static final ImageErrorReason FLASH_HAS_MOUSE_TRACKING = new ImageErrorReason(_FLASH_HAS_MOUSE_TRACKING);
    public static final ImageErrorReason FLASH_HAS_RANDOM_NUM = new ImageErrorReason(_FLASH_HAS_RANDOM_NUM);
    public static final ImageErrorReason FLASH_SELF_TARGETS = new ImageErrorReason(_FLASH_SELF_TARGETS);
    public static final ImageErrorReason FLASH_BAD_GETURL_TARGET = new ImageErrorReason(_FLASH_BAD_GETURL_TARGET);
    public static final ImageErrorReason FLASH_VERSION_NOT_SUPPORTED = new ImageErrorReason(_FLASH_VERSION_NOT_SUPPORTED);
    public static final ImageErrorReason FLASH_WITHOUT_HARD_CODED_CLICK_URL = new ImageErrorReason(_FLASH_WITHOUT_HARD_CODED_CLICK_URL);
    public static final ImageErrorReason INVALID_FLASH_FILE = new ImageErrorReason(_INVALID_FLASH_FILE);
    public static final ImageErrorReason FAILED_TO_FIX_CLICK_TAG_IN_FLASH = new ImageErrorReason(_FAILED_TO_FIX_CLICK_TAG_IN_FLASH);
    public static final ImageErrorReason FLASH_ACCESSES_NETWORK_RESOURCES = new ImageErrorReason(_FLASH_ACCESSES_NETWORK_RESOURCES);
    public static final ImageErrorReason FLASH_EXTERNAL_JS_CALL = new ImageErrorReason(_FLASH_EXTERNAL_JS_CALL);
    public static final ImageErrorReason FLASH_EXTERNAL_FS_CALL = new ImageErrorReason(_FLASH_EXTERNAL_FS_CALL);
    public static final ImageErrorReason FILE_TOO_LARGE = new ImageErrorReason(_FILE_TOO_LARGE);
    public static final ImageErrorReason IMAGE_DATA_TOO_LARGE = new ImageErrorReason(_IMAGE_DATA_TOO_LARGE);
    public static final ImageErrorReason IMAGE_PROCESSING_ERROR = new ImageErrorReason(_IMAGE_PROCESSING_ERROR);
    public static final ImageErrorReason IMAGE_TOO_SMALL = new ImageErrorReason(_IMAGE_TOO_SMALL);
    public static final ImageErrorReason INVALID_INPUT = new ImageErrorReason(_INVALID_INPUT);
    public static final ImageErrorReason PROBLEM_READING_FILE = new ImageErrorReason(_PROBLEM_READING_FILE);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ImageError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
