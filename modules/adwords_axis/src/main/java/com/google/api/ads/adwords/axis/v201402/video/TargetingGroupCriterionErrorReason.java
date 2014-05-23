/**
 * TargetingGroupCriterionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class TargetingGroupCriterionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TargetingGroupCriterionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _WEBSITE_NOT_ALLOWED_FOR_NETWORK = "WEBSITE_NOT_ALLOWED_FOR_NETWORK";
    public static final java.lang.String _NETWORK_NOT_SUPPORTED = "NETWORK_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_KEYWORD_TEXT = "INVALID_KEYWORD_TEXT";
    public static final java.lang.String _KEYWORD_TEXT_TOO_LONG = "KEYWORD_TEXT_TOO_LONG";
    public static final java.lang.String _KEYWORD_HAS_TOO_MANY_WORDS = "KEYWORD_HAS_TOO_MANY_WORDS";
    public static final java.lang.String _KEYWORD_HAS_INVALID_CHARS = "KEYWORD_HAS_INVALID_CHARS";
    public static final java.lang.String _INVALID_WEBSITE_URL = "INVALID_WEBSITE_URL";
    public static final java.lang.String _INVALID_FORMAT_FOR_WEBSITE_URL = "INVALID_FORMAT_FOR_WEBSITE_URL";
    public static final java.lang.String _WEBSITE_URL_IS_TOO_LONG = "WEBSITE_URL_IS_TOO_LONG";
    public static final java.lang.String _WEBSITE_URL_HAS_ILLEGAL_CHAR = "WEBSITE_URL_HAS_ILLEGAL_CHAR";
    public static final java.lang.String _WEBSITE_URL_HAS_MULTIPLE_SITES_IN_LINE = "WEBSITE_URL_HAS_MULTIPLE_SITES_IN_LINE";
    public static final java.lang.String _WEBSITE_DOMAIN_BLACKLISTED = "WEBSITE_DOMAIN_BLACKLISTED";
    public static final java.lang.String _INVALID_VIDEO_ID = "INVALID_VIDEO_ID";
    public static final java.lang.String _INVALID_CHANNEL_ID = "INVALID_CHANNEL_ID";
    public static final java.lang.String _INVALID_VERTICAL_PATH = "INVALID_VERTICAL_PATH";
    public static final java.lang.String _INVALID_USER_LIST_ID = "INVALID_USER_LIST_ID";
    public static final java.lang.String _KEYWORD_UNSUPPORTED = "KEYWORD_UNSUPPORTED";
    public static final java.lang.String _INVALID_TARGETING_GROUP_ID = "INVALID_TARGETING_GROUP_ID";
    public static final java.lang.String _INVALID_CRITERION_ID = "INVALID_CRITERION_ID";
    public static final java.lang.String _IMMUTABLE_NEGATIVE = "IMMUTABLE_NEGATIVE";
    public static final java.lang.String _WEBSITE_URL_HAS_SCHEMA = "WEBSITE_URL_HAS_SCHEMA";
    public static final java.lang.String _USER_ID_OF_CHANNEL_MISSING = "USER_ID_OF_CHANNEL_MISSING";
    public static final java.lang.String _TOO_MANY_CRITERIONS_PER_TARGETING_GROUP = "TOO_MANY_CRITERIONS_PER_TARGETING_GROUP";
    public static final java.lang.String _INVALID_STATUS = "INVALID_STATUS";
    public static final java.lang.String _MUTATING_REPORTED_TGC = "MUTATING_REPORTED_TGC";
    public static final java.lang.String _UNSUPPORTED_BID_OVERRIDE = "UNSUPPORTED_BID_OVERRIDE";
    public static final java.lang.String _CANNOT_TARGET_AND_EXCLUDE = "CANNOT_TARGET_AND_EXCLUDE";
    public static final java.lang.String _CANNOT_REMOVE_CRITERION = "CANNOT_REMOVE_CRITERION";
    public static final java.lang.String _CANNOT_TARGET_CRITERION = "CANNOT_TARGET_CRITERION";
    public static final java.lang.String _CANNOT_TARGET_OBSOLETE_CRITERION = "CANNOT_TARGET_OBSOLETE_CRITERION";
    public static final TargetingGroupCriterionErrorReason UNKNOWN = new TargetingGroupCriterionErrorReason(_UNKNOWN);
    public static final TargetingGroupCriterionErrorReason WEBSITE_NOT_ALLOWED_FOR_NETWORK = new TargetingGroupCriterionErrorReason(_WEBSITE_NOT_ALLOWED_FOR_NETWORK);
    public static final TargetingGroupCriterionErrorReason NETWORK_NOT_SUPPORTED = new TargetingGroupCriterionErrorReason(_NETWORK_NOT_SUPPORTED);
    public static final TargetingGroupCriterionErrorReason INVALID_KEYWORD_TEXT = new TargetingGroupCriterionErrorReason(_INVALID_KEYWORD_TEXT);
    public static final TargetingGroupCriterionErrorReason KEYWORD_TEXT_TOO_LONG = new TargetingGroupCriterionErrorReason(_KEYWORD_TEXT_TOO_LONG);
    public static final TargetingGroupCriterionErrorReason KEYWORD_HAS_TOO_MANY_WORDS = new TargetingGroupCriterionErrorReason(_KEYWORD_HAS_TOO_MANY_WORDS);
    public static final TargetingGroupCriterionErrorReason KEYWORD_HAS_INVALID_CHARS = new TargetingGroupCriterionErrorReason(_KEYWORD_HAS_INVALID_CHARS);
    public static final TargetingGroupCriterionErrorReason INVALID_WEBSITE_URL = new TargetingGroupCriterionErrorReason(_INVALID_WEBSITE_URL);
    public static final TargetingGroupCriterionErrorReason INVALID_FORMAT_FOR_WEBSITE_URL = new TargetingGroupCriterionErrorReason(_INVALID_FORMAT_FOR_WEBSITE_URL);
    public static final TargetingGroupCriterionErrorReason WEBSITE_URL_IS_TOO_LONG = new TargetingGroupCriterionErrorReason(_WEBSITE_URL_IS_TOO_LONG);
    public static final TargetingGroupCriterionErrorReason WEBSITE_URL_HAS_ILLEGAL_CHAR = new TargetingGroupCriterionErrorReason(_WEBSITE_URL_HAS_ILLEGAL_CHAR);
    public static final TargetingGroupCriterionErrorReason WEBSITE_URL_HAS_MULTIPLE_SITES_IN_LINE = new TargetingGroupCriterionErrorReason(_WEBSITE_URL_HAS_MULTIPLE_SITES_IN_LINE);
    public static final TargetingGroupCriterionErrorReason WEBSITE_DOMAIN_BLACKLISTED = new TargetingGroupCriterionErrorReason(_WEBSITE_DOMAIN_BLACKLISTED);
    public static final TargetingGroupCriterionErrorReason INVALID_VIDEO_ID = new TargetingGroupCriterionErrorReason(_INVALID_VIDEO_ID);
    public static final TargetingGroupCriterionErrorReason INVALID_CHANNEL_ID = new TargetingGroupCriterionErrorReason(_INVALID_CHANNEL_ID);
    public static final TargetingGroupCriterionErrorReason INVALID_VERTICAL_PATH = new TargetingGroupCriterionErrorReason(_INVALID_VERTICAL_PATH);
    public static final TargetingGroupCriterionErrorReason INVALID_USER_LIST_ID = new TargetingGroupCriterionErrorReason(_INVALID_USER_LIST_ID);
    public static final TargetingGroupCriterionErrorReason KEYWORD_UNSUPPORTED = new TargetingGroupCriterionErrorReason(_KEYWORD_UNSUPPORTED);
    public static final TargetingGroupCriterionErrorReason INVALID_TARGETING_GROUP_ID = new TargetingGroupCriterionErrorReason(_INVALID_TARGETING_GROUP_ID);
    public static final TargetingGroupCriterionErrorReason INVALID_CRITERION_ID = new TargetingGroupCriterionErrorReason(_INVALID_CRITERION_ID);
    public static final TargetingGroupCriterionErrorReason IMMUTABLE_NEGATIVE = new TargetingGroupCriterionErrorReason(_IMMUTABLE_NEGATIVE);
    public static final TargetingGroupCriterionErrorReason WEBSITE_URL_HAS_SCHEMA = new TargetingGroupCriterionErrorReason(_WEBSITE_URL_HAS_SCHEMA);
    public static final TargetingGroupCriterionErrorReason USER_ID_OF_CHANNEL_MISSING = new TargetingGroupCriterionErrorReason(_USER_ID_OF_CHANNEL_MISSING);
    public static final TargetingGroupCriterionErrorReason TOO_MANY_CRITERIONS_PER_TARGETING_GROUP = new TargetingGroupCriterionErrorReason(_TOO_MANY_CRITERIONS_PER_TARGETING_GROUP);
    public static final TargetingGroupCriterionErrorReason INVALID_STATUS = new TargetingGroupCriterionErrorReason(_INVALID_STATUS);
    public static final TargetingGroupCriterionErrorReason MUTATING_REPORTED_TGC = new TargetingGroupCriterionErrorReason(_MUTATING_REPORTED_TGC);
    public static final TargetingGroupCriterionErrorReason UNSUPPORTED_BID_OVERRIDE = new TargetingGroupCriterionErrorReason(_UNSUPPORTED_BID_OVERRIDE);
    public static final TargetingGroupCriterionErrorReason CANNOT_TARGET_AND_EXCLUDE = new TargetingGroupCriterionErrorReason(_CANNOT_TARGET_AND_EXCLUDE);
    public static final TargetingGroupCriterionErrorReason CANNOT_REMOVE_CRITERION = new TargetingGroupCriterionErrorReason(_CANNOT_REMOVE_CRITERION);
    public static final TargetingGroupCriterionErrorReason CANNOT_TARGET_CRITERION = new TargetingGroupCriterionErrorReason(_CANNOT_TARGET_CRITERION);
    public static final TargetingGroupCriterionErrorReason CANNOT_TARGET_OBSOLETE_CRITERION = new TargetingGroupCriterionErrorReason(_CANNOT_TARGET_OBSOLETE_CRITERION);
    public java.lang.String getValue() { return _value_;}
    public static TargetingGroupCriterionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TargetingGroupCriterionErrorReason enumeration = (TargetingGroupCriterionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TargetingGroupCriterionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TargetingGroupCriterionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupCriterionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
