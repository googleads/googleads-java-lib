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
 * ContentLabelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class ContentLabelType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ContentLabelType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADULTISH = "ADULTISH";
    public static final java.lang.String _AFE = "AFE";
    public static final java.lang.String _BELOW_THE_FOLD = "BELOW_THE_FOLD";
    public static final java.lang.String _CONFLICT = "CONFLICT";
    public static final java.lang.String _DP = "DP";
    public static final java.lang.String _EMBEDDED_VIDEO = "EMBEDDED_VIDEO";
    public static final java.lang.String _GAMES = "GAMES";
    public static final java.lang.String _JUVENILE = "JUVENILE";
    public static final java.lang.String _PROFANITY = "PROFANITY";
    public static final java.lang.String _UGC_FORUMS = "UGC_FORUMS";
    public static final java.lang.String _UGC_IMAGES = "UGC_IMAGES";
    public static final java.lang.String _UGC_SOCIAL = "UGC_SOCIAL";
    public static final java.lang.String _UGC_VIDEOS = "UGC_VIDEOS";
    public static final java.lang.String _SIRENS = "SIRENS";
    public static final java.lang.String _TRAGEDY = "TRAGEDY";
    public static final java.lang.String _VIDEO = "VIDEO";
    public static final java.lang.String _VIDEO_RATING_DV_G = "VIDEO_RATING_DV_G";
    public static final java.lang.String _VIDEO_RATING_DV_PG = "VIDEO_RATING_DV_PG";
    public static final java.lang.String _VIDEO_RATING_DV_T = "VIDEO_RATING_DV_T";
    public static final java.lang.String _VIDEO_RATING_DV_MA = "VIDEO_RATING_DV_MA";
    public static final java.lang.String _VIDEO_NOT_YET_RATED = "VIDEO_NOT_YET_RATED";
    public static final java.lang.String _LIVE_STREAMING_VIDEO = "LIVE_STREAMING_VIDEO";
    public static final java.lang.String _ALLOWED_GAMBLING_CONTENT = "ALLOWED_GAMBLING_CONTENT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ContentLabelType ADULTISH = new ContentLabelType(_ADULTISH);
    public static final ContentLabelType AFE = new ContentLabelType(_AFE);
    public static final ContentLabelType BELOW_THE_FOLD = new ContentLabelType(_BELOW_THE_FOLD);
    public static final ContentLabelType CONFLICT = new ContentLabelType(_CONFLICT);
    public static final ContentLabelType DP = new ContentLabelType(_DP);
    public static final ContentLabelType EMBEDDED_VIDEO = new ContentLabelType(_EMBEDDED_VIDEO);
    public static final ContentLabelType GAMES = new ContentLabelType(_GAMES);
    public static final ContentLabelType JUVENILE = new ContentLabelType(_JUVENILE);
    public static final ContentLabelType PROFANITY = new ContentLabelType(_PROFANITY);
    public static final ContentLabelType UGC_FORUMS = new ContentLabelType(_UGC_FORUMS);
    public static final ContentLabelType UGC_IMAGES = new ContentLabelType(_UGC_IMAGES);
    public static final ContentLabelType UGC_SOCIAL = new ContentLabelType(_UGC_SOCIAL);
    public static final ContentLabelType UGC_VIDEOS = new ContentLabelType(_UGC_VIDEOS);
    public static final ContentLabelType SIRENS = new ContentLabelType(_SIRENS);
    public static final ContentLabelType TRAGEDY = new ContentLabelType(_TRAGEDY);
    public static final ContentLabelType VIDEO = new ContentLabelType(_VIDEO);
    public static final ContentLabelType VIDEO_RATING_DV_G = new ContentLabelType(_VIDEO_RATING_DV_G);
    public static final ContentLabelType VIDEO_RATING_DV_PG = new ContentLabelType(_VIDEO_RATING_DV_PG);
    public static final ContentLabelType VIDEO_RATING_DV_T = new ContentLabelType(_VIDEO_RATING_DV_T);
    public static final ContentLabelType VIDEO_RATING_DV_MA = new ContentLabelType(_VIDEO_RATING_DV_MA);
    public static final ContentLabelType VIDEO_NOT_YET_RATED = new ContentLabelType(_VIDEO_NOT_YET_RATED);
    public static final ContentLabelType LIVE_STREAMING_VIDEO = new ContentLabelType(_LIVE_STREAMING_VIDEO);
    public static final ContentLabelType ALLOWED_GAMBLING_CONTENT = new ContentLabelType(_ALLOWED_GAMBLING_CONTENT);
    public static final ContentLabelType UNKNOWN = new ContentLabelType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ContentLabelType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ContentLabelType enumeration = (ContentLabelType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ContentLabelType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ContentLabelType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ContentLabelType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
