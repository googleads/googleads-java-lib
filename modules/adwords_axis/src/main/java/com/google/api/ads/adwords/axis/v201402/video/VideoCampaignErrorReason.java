/**
 * VideoCampaignErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class VideoCampaignErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoCampaignErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _AFTER_MAXIMUM_ALLOWABLE_DATE = "AFTER_MAXIMUM_ALLOWABLE_DATE";
    public static final java.lang.String _CANNOT_SET_DATE_TO_PAST = "CANNOT_SET_DATE_TO_PAST";
    public static final java.lang.String _DUPLICATE_CAMPAIGN_NAME = "DUPLICATE_CAMPAIGN_NAME";
    public static final java.lang.String _INVALID_CAMPAIGN_NAME = "INVALID_CAMPAIGN_NAME";
    public static final java.lang.String _START_DATE_AFTER_END_DATE = "START_DATE_AFTER_END_DATE";
    public static final java.lang.String _CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED = "CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED";
    public static final java.lang.String _INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED = "INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED";
    public static final java.lang.String _CAMPAIGN_LIMIT = "CAMPAIGN_LIMIT";
    public static final VideoCampaignErrorReason UNKNOWN = new VideoCampaignErrorReason(_UNKNOWN);
    public static final VideoCampaignErrorReason AFTER_MAXIMUM_ALLOWABLE_DATE = new VideoCampaignErrorReason(_AFTER_MAXIMUM_ALLOWABLE_DATE);
    public static final VideoCampaignErrorReason CANNOT_SET_DATE_TO_PAST = new VideoCampaignErrorReason(_CANNOT_SET_DATE_TO_PAST);
    public static final VideoCampaignErrorReason DUPLICATE_CAMPAIGN_NAME = new VideoCampaignErrorReason(_DUPLICATE_CAMPAIGN_NAME);
    public static final VideoCampaignErrorReason INVALID_CAMPAIGN_NAME = new VideoCampaignErrorReason(_INVALID_CAMPAIGN_NAME);
    public static final VideoCampaignErrorReason START_DATE_AFTER_END_DATE = new VideoCampaignErrorReason(_START_DATE_AFTER_END_DATE);
    public static final VideoCampaignErrorReason CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED = new VideoCampaignErrorReason(_CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED);
    public static final VideoCampaignErrorReason INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED = new VideoCampaignErrorReason(_INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED);
    public static final VideoCampaignErrorReason CAMPAIGN_LIMIT = new VideoCampaignErrorReason(_CAMPAIGN_LIMIT);
    public java.lang.String getValue() { return _value_;}
    public static VideoCampaignErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoCampaignErrorReason enumeration = (VideoCampaignErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoCampaignErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoCampaignErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaignError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
