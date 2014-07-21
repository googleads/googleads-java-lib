/**
 * VideoServiceErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoServiceErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoServiceErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _INVALID_VIDEO_ID = "INVALID_VIDEO_ID";
    public static final java.lang.String _VIDEO_NOT_FOUND = "VIDEO_NOT_FOUND";
    public static final java.lang.String _INVALID_CHANNEL = "INVALID_CHANNEL";
    public static final java.lang.String _VIDEO_LOOKUP_SERVICE_UNAVAILABLE = "VIDEO_LOOKUP_SERVICE_UNAVAILABLE";
    public static final java.lang.String _VIDEO_SEARCH_SERVICE_UNAVAILABLE = "VIDEO_SEARCH_SERVICE_UNAVAILABLE";
    public static final java.lang.String _CHANNEL_SEARCH_SERVICE_UNAVAILABLE = "CHANNEL_SEARCH_SERVICE_UNAVAILABLE";
    public static final java.lang.String _YOUTUBE_ANALYTICS_SERVICE_UNAVAILABLE = "YOUTUBE_ANALYTICS_SERVICE_UNAVAILABLE";
    public static final java.lang.String _VIDEO_NOT_OWNED_BY_LINKED_ACCOUNT = "VIDEO_NOT_OWNED_BY_LINKED_ACCOUNT";
    public static final java.lang.String _VIDEO_NOT_ENABLED_FOR_CALL_TO_ACTION = "VIDEO_NOT_ENABLED_FOR_CALL_TO_ACTION";
    public static final java.lang.String _CALL_TO_ACTION_NOT_FOUND = "CALL_TO_ACTION_NOT_FOUND";
    public static final java.lang.String _INVALID_CALL_TO_ACTION = "INVALID_CALL_TO_ACTION";
    public static final java.lang.String _UNKNOWN_CALL_TO_ACTION_ERROR = "UNKNOWN_CALL_TO_ACTION_ERROR";
    public static final java.lang.String _CALL_TO_ACTION_TOO_LONG = "CALL_TO_ACTION_TOO_LONG";
    public static final java.lang.String _CALL_TO_ACTION_INVALID_FORMAT = "CALL_TO_ACTION_INVALID_FORMAT";
    public static final java.lang.String _CALL_TO_ACTION_INVALID_CHARS = "CALL_TO_ACTION_INVALID_CHARS";
    public static final java.lang.String _CALL_TO_ACTION_INVALID_INPUT = "CALL_TO_ACTION_INVALID_INPUT";
    public static final java.lang.String _INVALID_FORMAT = "INVALID_FORMAT";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _INVALID_IMAGE_FILESIZE = "INVALID_IMAGE_FILESIZE";
    public static final java.lang.String _UNSUPPORTED_IMAGE_FORMAT = "UNSUPPORTED_IMAGE_FORMAT";
    public static final java.lang.String _DUPLICATE_VIDEO_ID = "DUPLICATE_VIDEO_ID";
    public static final java.lang.String _TOO_LONG = "TOO_LONG";
    public static final VideoServiceErrorReason UNKNOWN = new VideoServiceErrorReason(_UNKNOWN);
    public static final VideoServiceErrorReason INVALID_VIDEO_ID = new VideoServiceErrorReason(_INVALID_VIDEO_ID);
    public static final VideoServiceErrorReason VIDEO_NOT_FOUND = new VideoServiceErrorReason(_VIDEO_NOT_FOUND);
    public static final VideoServiceErrorReason INVALID_CHANNEL = new VideoServiceErrorReason(_INVALID_CHANNEL);
    public static final VideoServiceErrorReason VIDEO_LOOKUP_SERVICE_UNAVAILABLE = new VideoServiceErrorReason(_VIDEO_LOOKUP_SERVICE_UNAVAILABLE);
    public static final VideoServiceErrorReason VIDEO_SEARCH_SERVICE_UNAVAILABLE = new VideoServiceErrorReason(_VIDEO_SEARCH_SERVICE_UNAVAILABLE);
    public static final VideoServiceErrorReason CHANNEL_SEARCH_SERVICE_UNAVAILABLE = new VideoServiceErrorReason(_CHANNEL_SEARCH_SERVICE_UNAVAILABLE);
    public static final VideoServiceErrorReason YOUTUBE_ANALYTICS_SERVICE_UNAVAILABLE = new VideoServiceErrorReason(_YOUTUBE_ANALYTICS_SERVICE_UNAVAILABLE);
    public static final VideoServiceErrorReason VIDEO_NOT_OWNED_BY_LINKED_ACCOUNT = new VideoServiceErrorReason(_VIDEO_NOT_OWNED_BY_LINKED_ACCOUNT);
    public static final VideoServiceErrorReason VIDEO_NOT_ENABLED_FOR_CALL_TO_ACTION = new VideoServiceErrorReason(_VIDEO_NOT_ENABLED_FOR_CALL_TO_ACTION);
    public static final VideoServiceErrorReason CALL_TO_ACTION_NOT_FOUND = new VideoServiceErrorReason(_CALL_TO_ACTION_NOT_FOUND);
    public static final VideoServiceErrorReason INVALID_CALL_TO_ACTION = new VideoServiceErrorReason(_INVALID_CALL_TO_ACTION);
    public static final VideoServiceErrorReason UNKNOWN_CALL_TO_ACTION_ERROR = new VideoServiceErrorReason(_UNKNOWN_CALL_TO_ACTION_ERROR);
    public static final VideoServiceErrorReason CALL_TO_ACTION_TOO_LONG = new VideoServiceErrorReason(_CALL_TO_ACTION_TOO_LONG);
    public static final VideoServiceErrorReason CALL_TO_ACTION_INVALID_FORMAT = new VideoServiceErrorReason(_CALL_TO_ACTION_INVALID_FORMAT);
    public static final VideoServiceErrorReason CALL_TO_ACTION_INVALID_CHARS = new VideoServiceErrorReason(_CALL_TO_ACTION_INVALID_CHARS);
    public static final VideoServiceErrorReason CALL_TO_ACTION_INVALID_INPUT = new VideoServiceErrorReason(_CALL_TO_ACTION_INVALID_INPUT);
    public static final VideoServiceErrorReason INVALID_FORMAT = new VideoServiceErrorReason(_INVALID_FORMAT);
    public static final VideoServiceErrorReason INVALID_INPUT = new VideoServiceErrorReason(_INVALID_INPUT);
    public static final VideoServiceErrorReason INVALID_IMAGE_FILESIZE = new VideoServiceErrorReason(_INVALID_IMAGE_FILESIZE);
    public static final VideoServiceErrorReason UNSUPPORTED_IMAGE_FORMAT = new VideoServiceErrorReason(_UNSUPPORTED_IMAGE_FORMAT);
    public static final VideoServiceErrorReason DUPLICATE_VIDEO_ID = new VideoServiceErrorReason(_DUPLICATE_VIDEO_ID);
    public static final VideoServiceErrorReason TOO_LONG = new VideoServiceErrorReason(_TOO_LONG);
    public java.lang.String getValue() { return _value_;}
    public static VideoServiceErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoServiceErrorReason enumeration = (VideoServiceErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoServiceErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoServiceErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoServiceError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
