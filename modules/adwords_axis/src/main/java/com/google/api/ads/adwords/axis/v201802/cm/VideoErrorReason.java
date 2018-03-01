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
 * VideoErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class VideoErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_VIDEO = "INVALID_VIDEO";
    public static final java.lang.String _STORAGE_ERROR = "STORAGE_ERROR";
    public static final java.lang.String _BAD_REQUEST = "BAD_REQUEST";
    public static final java.lang.String _ERROR_GENERATING_STREAMING_URL = "ERROR_GENERATING_STREAMING_URL";
    public static final java.lang.String _UNEXPECTED_SIZE = "UNEXPECTED_SIZE";
    public static final java.lang.String _SERVER_ERROR = "SERVER_ERROR";
    public static final java.lang.String _FILE_TOO_LARGE = "FILE_TOO_LARGE";
    public static final java.lang.String _VIDEO_PROCESSING_ERROR = "VIDEO_PROCESSING_ERROR";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _PROBLEM_READING_FILE = "PROBLEM_READING_FILE";
    public static final java.lang.String _INVALID_ISCI = "INVALID_ISCI";
    public static final java.lang.String _INVALID_AD_ID = "INVALID_AD_ID";
    public static final VideoErrorReason INVALID_VIDEO = new VideoErrorReason(_INVALID_VIDEO);
    public static final VideoErrorReason STORAGE_ERROR = new VideoErrorReason(_STORAGE_ERROR);
    public static final VideoErrorReason BAD_REQUEST = new VideoErrorReason(_BAD_REQUEST);
    public static final VideoErrorReason ERROR_GENERATING_STREAMING_URL = new VideoErrorReason(_ERROR_GENERATING_STREAMING_URL);
    public static final VideoErrorReason UNEXPECTED_SIZE = new VideoErrorReason(_UNEXPECTED_SIZE);
    public static final VideoErrorReason SERVER_ERROR = new VideoErrorReason(_SERVER_ERROR);
    public static final VideoErrorReason FILE_TOO_LARGE = new VideoErrorReason(_FILE_TOO_LARGE);
    public static final VideoErrorReason VIDEO_PROCESSING_ERROR = new VideoErrorReason(_VIDEO_PROCESSING_ERROR);
    public static final VideoErrorReason INVALID_INPUT = new VideoErrorReason(_INVALID_INPUT);
    public static final VideoErrorReason PROBLEM_READING_FILE = new VideoErrorReason(_PROBLEM_READING_FILE);
    public static final VideoErrorReason INVALID_ISCI = new VideoErrorReason(_INVALID_ISCI);
    public static final VideoErrorReason INVALID_AD_ID = new VideoErrorReason(_INVALID_AD_ID);
    public java.lang.String getValue() { return _value_;}
    public static VideoErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoErrorReason enumeration = (VideoErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VideoError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
