/**
 * ServingIssueReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class ServingIssueReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServingIssueReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED";
    public static final java.lang.String _ACCOUNT_CLOSED = "ACCOUNT_CLOSED";
    public static final java.lang.String _ACCOUNT_DISABLED = "ACCOUNT_DISABLED";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final java.lang.String _LIMITED_BY_BUDGET = "LIMITED_BY_BUDGET";
    public static final java.lang.String _INSTREAM_TOO_HIGH = "INSTREAM_TOO_HIGH";
    public static final java.lang.String _ALL_CREATIVES_UNHEALTHY = "ALL_CREATIVES_UNHEALTHY";
    public static final java.lang.String _SOME_CREATIVES_DISAPPROVED = "SOME_CREATIVES_DISAPPROVED";
    public static final java.lang.String _ALL_CREATIVES_DISAPPROVED = "ALL_CREATIVES_DISAPPROVED";
    public static final java.lang.String _SOME_CREATIVES_LABELED = "SOME_CREATIVES_LABELED";
    public static final java.lang.String _ALL_CREATIVES_LABELED = "ALL_CREATIVES_LABELED";
    public static final java.lang.String _SOME_CREATIVES_UNREVIEWED = "SOME_CREATIVES_UNREVIEWED";
    public static final java.lang.String _ALL_CREATIVES_UNREVIEWED = "ALL_CREATIVES_UNREVIEWED";
    public static final java.lang.String _SOME_CREATIVES_ELIGIBLE = "SOME_CREATIVES_ELIGIBLE";
    public static final java.lang.String _ALL_CREATIVES_ELIGIBLE = "ALL_CREATIVES_ELIGIBLE";
    public static final java.lang.String _VIDEO_ADS_WITHOUT_TARGETING = "VIDEO_ADS_WITHOUT_TARGETING";
    public static final java.lang.String _ACTIVE_AD_WITH_ALL_FORMATS_PAUSED = "ACTIVE_AD_WITH_ALL_FORMATS_PAUSED";
    public static final java.lang.String _TARGETING_BID_REQUIRED = "TARGETING_BID_REQUIRED";
    public static final java.lang.String _INSLATE_DEPRECATED = "INSLATE_DEPRECATED";
    public static final java.lang.String _TARGETING_DUPLICATE_NAME = "TARGETING_DUPLICATE_NAME";
    public static final java.lang.String _TARGETING_MISMATCH = "TARGETING_MISMATCH";
    public static final java.lang.String _TARGETING_NO_VIDEOAD = "TARGETING_NO_VIDEOAD";
    public static final java.lang.String _STUDY_INVITATION = "STUDY_INVITATION";
    public static final java.lang.String _SURVEY_INVITATION = "SURVEY_INVITATION";
    public static final java.lang.String _NO_VIDEO_AD_SERVING = "NO_VIDEO_AD_SERVING";
    public static final java.lang.String _ALL_VIDEO_ADS_PENDING = "ALL_VIDEO_ADS_PENDING";
    public static final java.lang.String _SOME_VIDEO_ADS_PENDING = "SOME_VIDEO_ADS_PENDING";
    public static final java.lang.String _ALL_VIDEO_ADS_UNHEALTHY = "ALL_VIDEO_ADS_UNHEALTHY";
    public static final java.lang.String _SOME_VIDEO_ADS_UNHEALTHY = "SOME_VIDEO_ADS_UNHEALTHY";
    public static final java.lang.String _NO_VIDEO = "NO_VIDEO";
    public static final java.lang.String _NO_TARGETING = "NO_TARGETING";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ServingIssueReason ACCOUNT_SUSPENDED = new ServingIssueReason(_ACCOUNT_SUSPENDED);
    public static final ServingIssueReason ACCOUNT_CLOSED = new ServingIssueReason(_ACCOUNT_CLOSED);
    public static final ServingIssueReason ACCOUNT_DISABLED = new ServingIssueReason(_ACCOUNT_DISABLED);
    public static final ServingIssueReason SUSPENDED = new ServingIssueReason(_SUSPENDED);
    public static final ServingIssueReason LIMITED_BY_BUDGET = new ServingIssueReason(_LIMITED_BY_BUDGET);
    public static final ServingIssueReason INSTREAM_TOO_HIGH = new ServingIssueReason(_INSTREAM_TOO_HIGH);
    public static final ServingIssueReason ALL_CREATIVES_UNHEALTHY = new ServingIssueReason(_ALL_CREATIVES_UNHEALTHY);
    public static final ServingIssueReason SOME_CREATIVES_DISAPPROVED = new ServingIssueReason(_SOME_CREATIVES_DISAPPROVED);
    public static final ServingIssueReason ALL_CREATIVES_DISAPPROVED = new ServingIssueReason(_ALL_CREATIVES_DISAPPROVED);
    public static final ServingIssueReason SOME_CREATIVES_LABELED = new ServingIssueReason(_SOME_CREATIVES_LABELED);
    public static final ServingIssueReason ALL_CREATIVES_LABELED = new ServingIssueReason(_ALL_CREATIVES_LABELED);
    public static final ServingIssueReason SOME_CREATIVES_UNREVIEWED = new ServingIssueReason(_SOME_CREATIVES_UNREVIEWED);
    public static final ServingIssueReason ALL_CREATIVES_UNREVIEWED = new ServingIssueReason(_ALL_CREATIVES_UNREVIEWED);
    public static final ServingIssueReason SOME_CREATIVES_ELIGIBLE = new ServingIssueReason(_SOME_CREATIVES_ELIGIBLE);
    public static final ServingIssueReason ALL_CREATIVES_ELIGIBLE = new ServingIssueReason(_ALL_CREATIVES_ELIGIBLE);
    public static final ServingIssueReason VIDEO_ADS_WITHOUT_TARGETING = new ServingIssueReason(_VIDEO_ADS_WITHOUT_TARGETING);
    public static final ServingIssueReason ACTIVE_AD_WITH_ALL_FORMATS_PAUSED = new ServingIssueReason(_ACTIVE_AD_WITH_ALL_FORMATS_PAUSED);
    public static final ServingIssueReason TARGETING_BID_REQUIRED = new ServingIssueReason(_TARGETING_BID_REQUIRED);
    public static final ServingIssueReason INSLATE_DEPRECATED = new ServingIssueReason(_INSLATE_DEPRECATED);
    public static final ServingIssueReason TARGETING_DUPLICATE_NAME = new ServingIssueReason(_TARGETING_DUPLICATE_NAME);
    public static final ServingIssueReason TARGETING_MISMATCH = new ServingIssueReason(_TARGETING_MISMATCH);
    public static final ServingIssueReason TARGETING_NO_VIDEOAD = new ServingIssueReason(_TARGETING_NO_VIDEOAD);
    public static final ServingIssueReason STUDY_INVITATION = new ServingIssueReason(_STUDY_INVITATION);
    public static final ServingIssueReason SURVEY_INVITATION = new ServingIssueReason(_SURVEY_INVITATION);
    public static final ServingIssueReason NO_VIDEO_AD_SERVING = new ServingIssueReason(_NO_VIDEO_AD_SERVING);
    public static final ServingIssueReason ALL_VIDEO_ADS_PENDING = new ServingIssueReason(_ALL_VIDEO_ADS_PENDING);
    public static final ServingIssueReason SOME_VIDEO_ADS_PENDING = new ServingIssueReason(_SOME_VIDEO_ADS_PENDING);
    public static final ServingIssueReason ALL_VIDEO_ADS_UNHEALTHY = new ServingIssueReason(_ALL_VIDEO_ADS_UNHEALTHY);
    public static final ServingIssueReason SOME_VIDEO_ADS_UNHEALTHY = new ServingIssueReason(_SOME_VIDEO_ADS_UNHEALTHY);
    public static final ServingIssueReason NO_VIDEO = new ServingIssueReason(_NO_VIDEO);
    public static final ServingIssueReason NO_TARGETING = new ServingIssueReason(_NO_TARGETING);
    public static final ServingIssueReason UNKNOWN = new ServingIssueReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ServingIssueReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServingIssueReason enumeration = (ServingIssueReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServingIssueReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ServingIssueReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingIssue.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
