/**
 * FeedErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public class FeedErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ATTRIBUTE_NAMES_NOT_UNIQUE = "ATTRIBUTE_NAMES_NOT_UNIQUE";
    public static final java.lang.String _ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES = "ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES";
    public static final java.lang.String _CANNOT_CHANGE_FEED_NAME = "CANNOT_CHANGE_FEED_NAME";
    public static final java.lang.String _CANNOT_CHANGE_ORIGIN = "CANNOT_CHANGE_ORIGIN";
    public static final java.lang.String _CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED = "CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED";
    public static final java.lang.String _CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED = "CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED";
    public static final java.lang.String _CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED = "CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED";
    public static final java.lang.String _CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS = "CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS";
    public static final java.lang.String _FEED_DELETED = "FEED_DELETED";
    public static final java.lang.String _INVALID_ORIGIN_VALUE = "INVALID_ORIGIN_VALUE";
    public static final java.lang.String _FEED_ORIGIN_IS_NOT_USER = "FEED_ORIGIN_IS_NOT_USER";
    public static final java.lang.String _NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY = "NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY";
    public static final java.lang.String _TOO_MANY_FEED_ATTRIBUTES_FOR_FEED = "TOO_MANY_FEED_ATTRIBUTES_FOR_FEED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FeedErrorReason ATTRIBUTE_NAMES_NOT_UNIQUE = new FeedErrorReason(_ATTRIBUTE_NAMES_NOT_UNIQUE);
    public static final FeedErrorReason ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES = new FeedErrorReason(_ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES);
    public static final FeedErrorReason CANNOT_CHANGE_FEED_NAME = new FeedErrorReason(_CANNOT_CHANGE_FEED_NAME);
    public static final FeedErrorReason CANNOT_CHANGE_ORIGIN = new FeedErrorReason(_CANNOT_CHANGE_ORIGIN);
    public static final FeedErrorReason CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED = new FeedErrorReason(_CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED);
    public static final FeedErrorReason CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED = new FeedErrorReason(_CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED);
    public static final FeedErrorReason CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED = new FeedErrorReason(_CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED);
    public static final FeedErrorReason CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS = new FeedErrorReason(_CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS);
    public static final FeedErrorReason FEED_DELETED = new FeedErrorReason(_FEED_DELETED);
    public static final FeedErrorReason INVALID_ORIGIN_VALUE = new FeedErrorReason(_INVALID_ORIGIN_VALUE);
    public static final FeedErrorReason FEED_ORIGIN_IS_NOT_USER = new FeedErrorReason(_FEED_ORIGIN_IS_NOT_USER);
    public static final FeedErrorReason NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY = new FeedErrorReason(_NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY);
    public static final FeedErrorReason TOO_MANY_FEED_ATTRIBUTES_FOR_FEED = new FeedErrorReason(_TOO_MANY_FEED_ATTRIBUTES_FOR_FEED);
    public static final FeedErrorReason UNKNOWN = new FeedErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FeedErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedErrorReason enumeration = (FeedErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "FeedError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
