/**
 * VideoAdDisplayFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoAdDisplayFormat implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoAdDisplayFormat(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TRUE_VIEW_IN_SEARCH = "TRUE_VIEW_IN_SEARCH";
    public static final java.lang.String _TRUE_VIEW_IN_SLATE = "TRUE_VIEW_IN_SLATE";
    public static final java.lang.String _TRUE_VIEW_IN_DISPLAY = "TRUE_VIEW_IN_DISPLAY";
    public static final java.lang.String _TRUE_VIEW_IN_STREAM = "TRUE_VIEW_IN_STREAM";
    public static final java.lang.String _STANDARD_IN_STREAM = "STANDARD_IN_STREAM";
    public static final java.lang.String _ALL = "ALL";
    public static final VideoAdDisplayFormat TRUE_VIEW_IN_SEARCH = new VideoAdDisplayFormat(_TRUE_VIEW_IN_SEARCH);
    public static final VideoAdDisplayFormat TRUE_VIEW_IN_SLATE = new VideoAdDisplayFormat(_TRUE_VIEW_IN_SLATE);
    public static final VideoAdDisplayFormat TRUE_VIEW_IN_DISPLAY = new VideoAdDisplayFormat(_TRUE_VIEW_IN_DISPLAY);
    public static final VideoAdDisplayFormat TRUE_VIEW_IN_STREAM = new VideoAdDisplayFormat(_TRUE_VIEW_IN_STREAM);
    public static final VideoAdDisplayFormat STANDARD_IN_STREAM = new VideoAdDisplayFormat(_STANDARD_IN_STREAM);
    public static final VideoAdDisplayFormat ALL = new VideoAdDisplayFormat(_ALL);
    public java.lang.String getValue() { return _value_;}
    public static VideoAdDisplayFormat fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoAdDisplayFormat enumeration = (VideoAdDisplayFormat)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoAdDisplayFormat fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoAdDisplayFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdDisplayFormat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
