/**
 * VideoEntityStatsSummaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class VideoEntityStatsSummaryType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoEntityStatsSummaryType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _ALL_ENABLED = "ALL_ENABLED";
    public static final java.lang.String _ALL_BUT_DELETED = "ALL_BUT_DELETED";
    public static final java.lang.String _ALL_DELETED = "ALL_DELETED";
    public static final java.lang.String _ALL_NON_VIDEO = "ALL_NON_VIDEO";
    public static final java.lang.String _COMBINED_VIDEO_NON_VIDEO = "COMBINED_VIDEO_NON_VIDEO";
    public static final java.lang.String _PERFORMANCE_OTHER = "PERFORMANCE_OTHER";
    public static final java.lang.String _NON_SUMMARY = "NON_SUMMARY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final VideoEntityStatsSummaryType ALL = new VideoEntityStatsSummaryType(_ALL);
    public static final VideoEntityStatsSummaryType ALL_ENABLED = new VideoEntityStatsSummaryType(_ALL_ENABLED);
    public static final VideoEntityStatsSummaryType ALL_BUT_DELETED = new VideoEntityStatsSummaryType(_ALL_BUT_DELETED);
    public static final VideoEntityStatsSummaryType ALL_DELETED = new VideoEntityStatsSummaryType(_ALL_DELETED);
    public static final VideoEntityStatsSummaryType ALL_NON_VIDEO = new VideoEntityStatsSummaryType(_ALL_NON_VIDEO);
    public static final VideoEntityStatsSummaryType COMBINED_VIDEO_NON_VIDEO = new VideoEntityStatsSummaryType(_COMBINED_VIDEO_NON_VIDEO);
    public static final VideoEntityStatsSummaryType PERFORMANCE_OTHER = new VideoEntityStatsSummaryType(_PERFORMANCE_OTHER);
    public static final VideoEntityStatsSummaryType NON_SUMMARY = new VideoEntityStatsSummaryType(_NON_SUMMARY);
    public static final VideoEntityStatsSummaryType UNKNOWN = new VideoEntityStatsSummaryType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static VideoEntityStatsSummaryType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoEntityStatsSummaryType enumeration = (VideoEntityStatsSummaryType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoEntityStatsSummaryType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoEntityStatsSummaryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoEntityStats.SummaryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
