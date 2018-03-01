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
 * MediaErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class MediaErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MediaErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_ADD_STANDARD_ICON = "CANNOT_ADD_STANDARD_ICON";
    public static final java.lang.String _CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES = "CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES";
    public static final java.lang.String _CANNOT_SPECIFY_MEDIA_ID_AND_DATA = "CANNOT_SPECIFY_MEDIA_ID_AND_DATA";
    public static final java.lang.String _DUPLICATE_MEDIA = "DUPLICATE_MEDIA";
    public static final java.lang.String _EMPTY_FIELD = "EMPTY_FIELD";
    public static final java.lang.String _ENTITY_REFERENCED_IN_MULTIPLE_OPS = "ENTITY_REFERENCED_IN_MULTIPLE_OPS";
    public static final java.lang.String _FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE = "FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE";
    public static final java.lang.String _INVALID_MEDIA_ID = "INVALID_MEDIA_ID";
    public static final java.lang.String _INVALID_MEDIA_SUB_TYPE = "INVALID_MEDIA_SUB_TYPE";
    public static final java.lang.String _INVALID_MEDIA_TYPE = "INVALID_MEDIA_TYPE";
    public static final java.lang.String _INVALID_MIME_TYPE = "INVALID_MIME_TYPE";
    public static final java.lang.String _INVALID_REFERENCE_ID = "INVALID_REFERENCE_ID";
    public static final java.lang.String _INVALID_YOU_TUBE_ID = "INVALID_YOU_TUBE_ID";
    public static final java.lang.String _MEDIA_FAILED_TRANSCODING = "MEDIA_FAILED_TRANSCODING";
    public static final java.lang.String _MEDIA_NOT_TRANSCODED = "MEDIA_NOT_TRANSCODED";
    public static final java.lang.String _MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE = "MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE";
    public static final java.lang.String _NO_FIELDS_SPECIFIED = "NO_FIELDS_SPECIFIED";
    public static final java.lang.String _NULL_REFERENCE_ID_AND_MEDIA_ID = "NULL_REFERENCE_ID_AND_MEDIA_ID";
    public static final java.lang.String _TOO_LONG = "TOO_LONG";
    public static final java.lang.String _UNSUPPORTED_OPERATION = "UNSUPPORTED_OPERATION";
    public static final java.lang.String _UNSUPPORTED_TYPE = "UNSUPPORTED_TYPE";
    public static final java.lang.String _YOU_TUBE_SERVICE_UNAVAILABLE = "YOU_TUBE_SERVICE_UNAVAILABLE";
    public static final java.lang.String _YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION = "YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION";
    public static final java.lang.String _YOU_TUBE_VIDEO_NOT_FOUND = "YOU_TUBE_VIDEO_NOT_FOUND";
    public static final MediaErrorReason CANNOT_ADD_STANDARD_ICON = new MediaErrorReason(_CANNOT_ADD_STANDARD_ICON);
    public static final MediaErrorReason CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES = new MediaErrorReason(_CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES);
    public static final MediaErrorReason CANNOT_SPECIFY_MEDIA_ID_AND_DATA = new MediaErrorReason(_CANNOT_SPECIFY_MEDIA_ID_AND_DATA);
    public static final MediaErrorReason DUPLICATE_MEDIA = new MediaErrorReason(_DUPLICATE_MEDIA);
    public static final MediaErrorReason EMPTY_FIELD = new MediaErrorReason(_EMPTY_FIELD);
    public static final MediaErrorReason ENTITY_REFERENCED_IN_MULTIPLE_OPS = new MediaErrorReason(_ENTITY_REFERENCED_IN_MULTIPLE_OPS);
    public static final MediaErrorReason FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE = new MediaErrorReason(_FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE);
    public static final MediaErrorReason INVALID_MEDIA_ID = new MediaErrorReason(_INVALID_MEDIA_ID);
    public static final MediaErrorReason INVALID_MEDIA_SUB_TYPE = new MediaErrorReason(_INVALID_MEDIA_SUB_TYPE);
    public static final MediaErrorReason INVALID_MEDIA_TYPE = new MediaErrorReason(_INVALID_MEDIA_TYPE);
    public static final MediaErrorReason INVALID_MIME_TYPE = new MediaErrorReason(_INVALID_MIME_TYPE);
    public static final MediaErrorReason INVALID_REFERENCE_ID = new MediaErrorReason(_INVALID_REFERENCE_ID);
    public static final MediaErrorReason INVALID_YOU_TUBE_ID = new MediaErrorReason(_INVALID_YOU_TUBE_ID);
    public static final MediaErrorReason MEDIA_FAILED_TRANSCODING = new MediaErrorReason(_MEDIA_FAILED_TRANSCODING);
    public static final MediaErrorReason MEDIA_NOT_TRANSCODED = new MediaErrorReason(_MEDIA_NOT_TRANSCODED);
    public static final MediaErrorReason MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE = new MediaErrorReason(_MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE);
    public static final MediaErrorReason NO_FIELDS_SPECIFIED = new MediaErrorReason(_NO_FIELDS_SPECIFIED);
    public static final MediaErrorReason NULL_REFERENCE_ID_AND_MEDIA_ID = new MediaErrorReason(_NULL_REFERENCE_ID_AND_MEDIA_ID);
    public static final MediaErrorReason TOO_LONG = new MediaErrorReason(_TOO_LONG);
    public static final MediaErrorReason UNSUPPORTED_OPERATION = new MediaErrorReason(_UNSUPPORTED_OPERATION);
    public static final MediaErrorReason UNSUPPORTED_TYPE = new MediaErrorReason(_UNSUPPORTED_TYPE);
    public static final MediaErrorReason YOU_TUBE_SERVICE_UNAVAILABLE = new MediaErrorReason(_YOU_TUBE_SERVICE_UNAVAILABLE);
    public static final MediaErrorReason YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION = new MediaErrorReason(_YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION);
    public static final MediaErrorReason YOU_TUBE_VIDEO_NOT_FOUND = new MediaErrorReason(_YOU_TUBE_VIDEO_NOT_FOUND);
    public java.lang.String getValue() { return _value_;}
    public static MediaErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MediaErrorReason enumeration = (MediaErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MediaErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MediaErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
