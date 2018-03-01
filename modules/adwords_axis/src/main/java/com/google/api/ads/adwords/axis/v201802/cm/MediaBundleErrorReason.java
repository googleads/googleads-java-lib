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
 * MediaBundleErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class MediaBundleErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MediaBundleErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ENTRY_POINT_CANNOT_BE_SET_USING_MEDIA_SERVICE = "ENTRY_POINT_CANNOT_BE_SET_USING_MEDIA_SERVICE";
    public static final java.lang.String _BAD_REQUEST = "BAD_REQUEST";
    public static final java.lang.String _DOUBLECLICK_BUNDLE_NOT_ALLOWED = "DOUBLECLICK_BUNDLE_NOT_ALLOWED";
    public static final java.lang.String _EXTERNAL_URL_NOT_ALLOWED = "EXTERNAL_URL_NOT_ALLOWED";
    public static final java.lang.String _FILE_TOO_LARGE = "FILE_TOO_LARGE";
    public static final java.lang.String _GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED = "GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _INVALID_MEDIA_BUNDLE = "INVALID_MEDIA_BUNDLE";
    public static final java.lang.String _INVALID_MEDIA_BUNDLE_ENTRY = "INVALID_MEDIA_BUNDLE_ENTRY";
    public static final java.lang.String _INVALID_MIME_TYPE = "INVALID_MIME_TYPE";
    public static final java.lang.String _INVALID_PATH = "INVALID_PATH";
    public static final java.lang.String _INVALID_URL_REFERENCE = "INVALID_URL_REFERENCE";
    public static final java.lang.String _MEDIA_DATA_TOO_LARGE = "MEDIA_DATA_TOO_LARGE";
    public static final java.lang.String _MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY = "MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY";
    public static final java.lang.String _SERVER_ERROR = "SERVER_ERROR";
    public static final java.lang.String _STORAGE_ERROR = "STORAGE_ERROR";
    public static final java.lang.String _SWIFFY_BUNDLE_NOT_ALLOWED = "SWIFFY_BUNDLE_NOT_ALLOWED";
    public static final java.lang.String _TOO_MANY_FILES = "TOO_MANY_FILES";
    public static final java.lang.String _UNEXPECTED_SIZE = "UNEXPECTED_SIZE";
    public static final java.lang.String _UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT = "UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT";
    public static final java.lang.String _UNSUPPORTED_HTML5_FEATURE = "UNSUPPORTED_HTML5_FEATURE";
    public static final java.lang.String _URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT = "URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT";
    public static final MediaBundleErrorReason ENTRY_POINT_CANNOT_BE_SET_USING_MEDIA_SERVICE = new MediaBundleErrorReason(_ENTRY_POINT_CANNOT_BE_SET_USING_MEDIA_SERVICE);
    public static final MediaBundleErrorReason BAD_REQUEST = new MediaBundleErrorReason(_BAD_REQUEST);
    public static final MediaBundleErrorReason DOUBLECLICK_BUNDLE_NOT_ALLOWED = new MediaBundleErrorReason(_DOUBLECLICK_BUNDLE_NOT_ALLOWED);
    public static final MediaBundleErrorReason EXTERNAL_URL_NOT_ALLOWED = new MediaBundleErrorReason(_EXTERNAL_URL_NOT_ALLOWED);
    public static final MediaBundleErrorReason FILE_TOO_LARGE = new MediaBundleErrorReason(_FILE_TOO_LARGE);
    public static final MediaBundleErrorReason GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED = new MediaBundleErrorReason(_GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED);
    public static final MediaBundleErrorReason INVALID_INPUT = new MediaBundleErrorReason(_INVALID_INPUT);
    public static final MediaBundleErrorReason INVALID_MEDIA_BUNDLE = new MediaBundleErrorReason(_INVALID_MEDIA_BUNDLE);
    public static final MediaBundleErrorReason INVALID_MEDIA_BUNDLE_ENTRY = new MediaBundleErrorReason(_INVALID_MEDIA_BUNDLE_ENTRY);
    public static final MediaBundleErrorReason INVALID_MIME_TYPE = new MediaBundleErrorReason(_INVALID_MIME_TYPE);
    public static final MediaBundleErrorReason INVALID_PATH = new MediaBundleErrorReason(_INVALID_PATH);
    public static final MediaBundleErrorReason INVALID_URL_REFERENCE = new MediaBundleErrorReason(_INVALID_URL_REFERENCE);
    public static final MediaBundleErrorReason MEDIA_DATA_TOO_LARGE = new MediaBundleErrorReason(_MEDIA_DATA_TOO_LARGE);
    public static final MediaBundleErrorReason MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY = new MediaBundleErrorReason(_MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY);
    public static final MediaBundleErrorReason SERVER_ERROR = new MediaBundleErrorReason(_SERVER_ERROR);
    public static final MediaBundleErrorReason STORAGE_ERROR = new MediaBundleErrorReason(_STORAGE_ERROR);
    public static final MediaBundleErrorReason SWIFFY_BUNDLE_NOT_ALLOWED = new MediaBundleErrorReason(_SWIFFY_BUNDLE_NOT_ALLOWED);
    public static final MediaBundleErrorReason TOO_MANY_FILES = new MediaBundleErrorReason(_TOO_MANY_FILES);
    public static final MediaBundleErrorReason UNEXPECTED_SIZE = new MediaBundleErrorReason(_UNEXPECTED_SIZE);
    public static final MediaBundleErrorReason UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT = new MediaBundleErrorReason(_UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT);
    public static final MediaBundleErrorReason UNSUPPORTED_HTML5_FEATURE = new MediaBundleErrorReason(_UNSUPPORTED_HTML5_FEATURE);
    public static final MediaBundleErrorReason URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT = new MediaBundleErrorReason(_URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT);
    public java.lang.String getValue() { return _value_;}
    public static MediaBundleErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MediaBundleErrorReason enumeration = (MediaBundleErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MediaBundleErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MediaBundleErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaBundleError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
