/**
 * VideoSortable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoSortable implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoSortable(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TITLE = "TITLE";
    public static final java.lang.String _DATE_UPLOADED = "DATE_UPLOADED";
    public static final java.lang.String _DURATION = "DURATION";
    public static final java.lang.String _CHANNEL = "CHANNEL";
    public static final java.lang.String _VIEW_COUNT = "VIEW_COUNT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final VideoSortable TITLE = new VideoSortable(_TITLE);
    public static final VideoSortable DATE_UPLOADED = new VideoSortable(_DATE_UPLOADED);
    public static final VideoSortable DURATION = new VideoSortable(_DURATION);
    public static final VideoSortable CHANNEL = new VideoSortable(_CHANNEL);
    public static final VideoSortable VIEW_COUNT = new VideoSortable(_VIEW_COUNT);
    public static final VideoSortable UNKNOWN = new VideoSortable(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static VideoSortable fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoSortable enumeration = (VideoSortable)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoSortable fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoSortable.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoSortable"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
