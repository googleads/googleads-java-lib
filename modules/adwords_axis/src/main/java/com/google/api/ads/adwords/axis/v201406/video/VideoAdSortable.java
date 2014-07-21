/**
 * VideoAdSortable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoAdSortable implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoAdSortable(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CAMPAIGN_ID = "CAMPAIGN_ID";
    public static final java.lang.String _CAMPAIGN_NAME = "CAMPAIGN_NAME";
    public static final java.lang.String _NAME = "NAME";
    public static final java.lang.String _STATUS = "STATUS";
    public static final java.lang.String _VIDEOAD_ID = "VIDEOAD_ID";
    public static final java.lang.String _VIDEO_NAME = "VIDEO_NAME";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final VideoAdSortable CAMPAIGN_ID = new VideoAdSortable(_CAMPAIGN_ID);
    public static final VideoAdSortable CAMPAIGN_NAME = new VideoAdSortable(_CAMPAIGN_NAME);
    public static final VideoAdSortable NAME = new VideoAdSortable(_NAME);
    public static final VideoAdSortable STATUS = new VideoAdSortable(_STATUS);
    public static final VideoAdSortable VIDEOAD_ID = new VideoAdSortable(_VIDEOAD_ID);
    public static final VideoAdSortable VIDEO_NAME = new VideoAdSortable(_VIDEO_NAME);
    public static final VideoAdSortable UNKNOWN = new VideoAdSortable(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static VideoAdSortable fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoAdSortable enumeration = (VideoAdSortable)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoAdSortable fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoAdSortable.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdSortable"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
