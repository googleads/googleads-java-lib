/**
 * VideoAdErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoAdErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoAdErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _INVALID_FORMAT = "INVALID_FORMAT";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _EMPTY_FIELD = "EMPTY_FIELD";
    public static final java.lang.String _URL_INVALID_TOP_LEVEL_DOMAIN = "URL_INVALID_TOP_LEVEL_DOMAIN";
    public static final java.lang.String _URL_MALFORMED = "URL_MALFORMED";
    public static final java.lang.String _URL_NO_HOST = "URL_NO_HOST";
    public static final java.lang.String _URL_NO_SCHEME = "URL_NO_SCHEME";
    public static final java.lang.String _TOO_LONG = "TOO_LONG";
    public static final java.lang.String _LINE_TOO_WIDE = "LINE_TOO_WIDE";
    public static final java.lang.String _INVALID_IMAGE_MEDIA_ID = "INVALID_IMAGE_MEDIA_ID";
    public static final java.lang.String _INVALID_COMPANION_BANNER_IMAGE_TYPE = "INVALID_COMPANION_BANNER_IMAGE_TYPE";
    public static final java.lang.String _UNSUPPORTED_COMPANION_IMAGE_SIZE = "UNSUPPORTED_COMPANION_IMAGE_SIZE";
    public static final java.lang.String _TOO_MANY_TARGETING_GROUP_ASSOCIATIONS = "TOO_MANY_TARGETING_GROUP_ASSOCIATIONS";
    public static final java.lang.String _TOO_MANY_VIDEO_ADS_PER_CUSTOMER = "TOO_MANY_VIDEO_ADS_PER_CUSTOMER";
    public static final java.lang.String _TOO_MANY_VIDEO_ADS_PER_CAMPAIGN = "TOO_MANY_VIDEO_ADS_PER_CAMPAIGN";
    public static final java.lang.String _CANNOT_OPERATE_ON_DELETED_AD = "CANNOT_OPERATE_ON_DELETED_AD";
    public static final java.lang.String _UNSUPPORTED_SCOPE_STATUS = "UNSUPPORTED_SCOPE_STATUS";
    public static final java.lang.String _NO_SCOPE_STATUSES_SPECIFIED = "NO_SCOPE_STATUSES_SPECIFIED";
    public static final java.lang.String _TARGETING_GROUP_FROM_DIFFERENT_CAMPAIGN = "TARGETING_GROUP_FROM_DIFFERENT_CAMPAIGN";
    public static final java.lang.String _APPROXIMATELY_TOO_LONG = "APPROXIMATELY_TOO_LONG";
    public static final java.lang.String _APPROXIMATELY_TOO_SHORT = "APPROXIMATELY_TOO_SHORT";
    public static final java.lang.String _BAD_SNIPPET = "BAD_SNIPPET";
    public static final java.lang.String _CUSTOMER_NOT_APPROVED_MOBILEADS = "CUSTOMER_NOT_APPROVED_MOBILEADS";
    public static final java.lang.String _CUSTOMER_NOT_ELIGIBLE = "CUSTOMER_NOT_ELIGIBLE";
    public static final java.lang.String _INCORRECT_LENGTH = "INCORRECT_LENGTH";
    public static final java.lang.String _INVALID_AD_ADDRESS_CAMPAIGN_TARGET = "INVALID_AD_ADDRESS_CAMPAIGN_TARGET";
    public static final java.lang.String _INVALID_CHARACTER_FOR_URL = "INVALID_CHARACTER_FOR_URL";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_MARKUP_LANGUAGE = "INVALID_MARKUP_LANGUAGE";
    public static final java.lang.String _INVALID_MOBILE_CARRIER = "INVALID_MOBILE_CARRIER";
    public static final java.lang.String _INVALID_MOBILE_CARRIER_TARGET = "INVALID_MOBILE_CARRIER_TARGET";
    public static final java.lang.String _TOO_SHORT = "TOO_SHORT";
    public static final java.lang.String _URL_INVALID_SCHEME = "URL_INVALID_SCHEME";
    public static final java.lang.String _URL_HOST_NAME_TOO_LONG = "URL_HOST_NAME_TOO_LONG";
    public static final java.lang.String _URL_NO_TOP_LEVEL_DOMAIN = "URL_NO_TOP_LEVEL_DOMAIN";
    public static final java.lang.String _URL_PATH_NOT_ALLOWED = "URL_PATH_NOT_ALLOWED";
    public static final java.lang.String _URL_PORT_NOT_ALLOWED = "URL_PORT_NOT_ALLOWED";
    public static final java.lang.String _URL_QUERY_NOT_ALLOWED = "URL_QUERY_NOT_ALLOWED";
    public static final java.lang.String _URL_SCHEME_BEFORE_DSA_TAG = "URL_SCHEME_BEFORE_DSA_TAG";
    public static final java.lang.String _USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE = "USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE";
    public static final java.lang.String _INVALID_FIELD_TEXT = "INVALID_FIELD_TEXT";
    public static final java.lang.String _IMAGE_ERROR = "IMAGE_ERROR";
    public static final java.lang.String _VIDEO_RETRIEVAL_ERROR = "VIDEO_RETRIEVAL_ERROR";
    public static final java.lang.String _AUDIO_ERROR = "AUDIO_ERROR";
    public static final java.lang.String _DEPRECATED_FORMAT_ERROR = "DEPRECATED_FORMAT_ERROR";
    public static final VideoAdErrorReason UNKNOWN = new VideoAdErrorReason(_UNKNOWN);
    public static final VideoAdErrorReason INVALID_FORMAT = new VideoAdErrorReason(_INVALID_FORMAT);
    public static final VideoAdErrorReason INVALID_INPUT = new VideoAdErrorReason(_INVALID_INPUT);
    public static final VideoAdErrorReason EMPTY_FIELD = new VideoAdErrorReason(_EMPTY_FIELD);
    public static final VideoAdErrorReason URL_INVALID_TOP_LEVEL_DOMAIN = new VideoAdErrorReason(_URL_INVALID_TOP_LEVEL_DOMAIN);
    public static final VideoAdErrorReason URL_MALFORMED = new VideoAdErrorReason(_URL_MALFORMED);
    public static final VideoAdErrorReason URL_NO_HOST = new VideoAdErrorReason(_URL_NO_HOST);
    public static final VideoAdErrorReason URL_NO_SCHEME = new VideoAdErrorReason(_URL_NO_SCHEME);
    public static final VideoAdErrorReason TOO_LONG = new VideoAdErrorReason(_TOO_LONG);
    public static final VideoAdErrorReason LINE_TOO_WIDE = new VideoAdErrorReason(_LINE_TOO_WIDE);
    public static final VideoAdErrorReason INVALID_IMAGE_MEDIA_ID = new VideoAdErrorReason(_INVALID_IMAGE_MEDIA_ID);
    public static final VideoAdErrorReason INVALID_COMPANION_BANNER_IMAGE_TYPE = new VideoAdErrorReason(_INVALID_COMPANION_BANNER_IMAGE_TYPE);
    public static final VideoAdErrorReason UNSUPPORTED_COMPANION_IMAGE_SIZE = new VideoAdErrorReason(_UNSUPPORTED_COMPANION_IMAGE_SIZE);
    public static final VideoAdErrorReason TOO_MANY_TARGETING_GROUP_ASSOCIATIONS = new VideoAdErrorReason(_TOO_MANY_TARGETING_GROUP_ASSOCIATIONS);
    public static final VideoAdErrorReason TOO_MANY_VIDEO_ADS_PER_CUSTOMER = new VideoAdErrorReason(_TOO_MANY_VIDEO_ADS_PER_CUSTOMER);
    public static final VideoAdErrorReason TOO_MANY_VIDEO_ADS_PER_CAMPAIGN = new VideoAdErrorReason(_TOO_MANY_VIDEO_ADS_PER_CAMPAIGN);
    public static final VideoAdErrorReason CANNOT_OPERATE_ON_DELETED_AD = new VideoAdErrorReason(_CANNOT_OPERATE_ON_DELETED_AD);
    public static final VideoAdErrorReason UNSUPPORTED_SCOPE_STATUS = new VideoAdErrorReason(_UNSUPPORTED_SCOPE_STATUS);
    public static final VideoAdErrorReason NO_SCOPE_STATUSES_SPECIFIED = new VideoAdErrorReason(_NO_SCOPE_STATUSES_SPECIFIED);
    public static final VideoAdErrorReason TARGETING_GROUP_FROM_DIFFERENT_CAMPAIGN = new VideoAdErrorReason(_TARGETING_GROUP_FROM_DIFFERENT_CAMPAIGN);
    public static final VideoAdErrorReason APPROXIMATELY_TOO_LONG = new VideoAdErrorReason(_APPROXIMATELY_TOO_LONG);
    public static final VideoAdErrorReason APPROXIMATELY_TOO_SHORT = new VideoAdErrorReason(_APPROXIMATELY_TOO_SHORT);
    public static final VideoAdErrorReason BAD_SNIPPET = new VideoAdErrorReason(_BAD_SNIPPET);
    public static final VideoAdErrorReason CUSTOMER_NOT_APPROVED_MOBILEADS = new VideoAdErrorReason(_CUSTOMER_NOT_APPROVED_MOBILEADS);
    public static final VideoAdErrorReason CUSTOMER_NOT_ELIGIBLE = new VideoAdErrorReason(_CUSTOMER_NOT_ELIGIBLE);
    public static final VideoAdErrorReason INCORRECT_LENGTH = new VideoAdErrorReason(_INCORRECT_LENGTH);
    public static final VideoAdErrorReason INVALID_AD_ADDRESS_CAMPAIGN_TARGET = new VideoAdErrorReason(_INVALID_AD_ADDRESS_CAMPAIGN_TARGET);
    public static final VideoAdErrorReason INVALID_CHARACTER_FOR_URL = new VideoAdErrorReason(_INVALID_CHARACTER_FOR_URL);
    public static final VideoAdErrorReason INVALID_COUNTRY_CODE = new VideoAdErrorReason(_INVALID_COUNTRY_CODE);
    public static final VideoAdErrorReason INVALID_MARKUP_LANGUAGE = new VideoAdErrorReason(_INVALID_MARKUP_LANGUAGE);
    public static final VideoAdErrorReason INVALID_MOBILE_CARRIER = new VideoAdErrorReason(_INVALID_MOBILE_CARRIER);
    public static final VideoAdErrorReason INVALID_MOBILE_CARRIER_TARGET = new VideoAdErrorReason(_INVALID_MOBILE_CARRIER_TARGET);
    public static final VideoAdErrorReason TOO_SHORT = new VideoAdErrorReason(_TOO_SHORT);
    public static final VideoAdErrorReason URL_INVALID_SCHEME = new VideoAdErrorReason(_URL_INVALID_SCHEME);
    public static final VideoAdErrorReason URL_HOST_NAME_TOO_LONG = new VideoAdErrorReason(_URL_HOST_NAME_TOO_LONG);
    public static final VideoAdErrorReason URL_NO_TOP_LEVEL_DOMAIN = new VideoAdErrorReason(_URL_NO_TOP_LEVEL_DOMAIN);
    public static final VideoAdErrorReason URL_PATH_NOT_ALLOWED = new VideoAdErrorReason(_URL_PATH_NOT_ALLOWED);
    public static final VideoAdErrorReason URL_PORT_NOT_ALLOWED = new VideoAdErrorReason(_URL_PORT_NOT_ALLOWED);
    public static final VideoAdErrorReason URL_QUERY_NOT_ALLOWED = new VideoAdErrorReason(_URL_QUERY_NOT_ALLOWED);
    public static final VideoAdErrorReason URL_SCHEME_BEFORE_DSA_TAG = new VideoAdErrorReason(_URL_SCHEME_BEFORE_DSA_TAG);
    public static final VideoAdErrorReason USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE = new VideoAdErrorReason(_USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE);
    public static final VideoAdErrorReason INVALID_FIELD_TEXT = new VideoAdErrorReason(_INVALID_FIELD_TEXT);
    public static final VideoAdErrorReason IMAGE_ERROR = new VideoAdErrorReason(_IMAGE_ERROR);
    public static final VideoAdErrorReason VIDEO_RETRIEVAL_ERROR = new VideoAdErrorReason(_VIDEO_RETRIEVAL_ERROR);
    public static final VideoAdErrorReason AUDIO_ERROR = new VideoAdErrorReason(_AUDIO_ERROR);
    public static final VideoAdErrorReason DEPRECATED_FORMAT_ERROR = new VideoAdErrorReason(_DEPRECATED_FORMAT_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static VideoAdErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoAdErrorReason enumeration = (VideoAdErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoAdErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoAdErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
