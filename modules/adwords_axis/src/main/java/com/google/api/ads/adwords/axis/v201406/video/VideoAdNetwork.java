/**
 * VideoAdNetwork.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoAdNetwork implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoAdNetwork(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _YOUTUBE_SEARCH = "YOUTUBE_SEARCH";
    public static final java.lang.String _YOUTUBE_WATCH = "YOUTUBE_WATCH";
    public static final java.lang.String _GOOGLE_DISPLAY_NETWORK = "GOOGLE_DISPLAY_NETWORK";
    public static final java.lang.String _GOOGLE_SEARCH = "GOOGLE_SEARCH";
    public static final java.lang.String _ALL = "ALL";
    public static final VideoAdNetwork YOUTUBE_SEARCH = new VideoAdNetwork(_YOUTUBE_SEARCH);
    public static final VideoAdNetwork YOUTUBE_WATCH = new VideoAdNetwork(_YOUTUBE_WATCH);
    public static final VideoAdNetwork GOOGLE_DISPLAY_NETWORK = new VideoAdNetwork(_GOOGLE_DISPLAY_NETWORK);
    public static final VideoAdNetwork GOOGLE_SEARCH = new VideoAdNetwork(_GOOGLE_SEARCH);
    public static final VideoAdNetwork ALL = new VideoAdNetwork(_ALL);
    public java.lang.String getValue() { return _value_;}
    public static VideoAdNetwork fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoAdNetwork enumeration = (VideoAdNetwork)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoAdNetwork fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoAdNetwork.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdNetwork"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
