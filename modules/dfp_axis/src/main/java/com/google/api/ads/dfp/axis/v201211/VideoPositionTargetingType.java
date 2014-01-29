/**
 * VideoPositionTargetingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;

public class VideoPositionTargetingType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoPositionTargetingType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PREROLL = "PREROLL";
    public static final java.lang.String _MIDROLL = "MIDROLL";
    public static final java.lang.String _POSTROLL = "POSTROLL";
    public static final java.lang.String _BEFORE_PREROLL_BUMPER = "BEFORE_PREROLL_BUMPER";
    public static final java.lang.String _AFTER_PREROLL_BUMPER = "AFTER_PREROLL_BUMPER";
    public static final java.lang.String _BEFORE_MIDROLL_BUMPERS = "BEFORE_MIDROLL_BUMPERS";
    public static final java.lang.String _AFTER_MIDROLL_BUMPERS = "AFTER_MIDROLL_BUMPERS";
    public static final java.lang.String _BEFORE_POSTROLL_BUMPER = "BEFORE_POSTROLL_BUMPER";
    public static final java.lang.String _AFTER_POSTROLL_BUMPER = "AFTER_POSTROLL_BUMPER";
    public static final java.lang.String _FIRST_IN_PREROLL = "FIRST_IN_PREROLL";
    public static final java.lang.String _LAST_IN_PREROLL = "LAST_IN_PREROLL";
    public static final java.lang.String _FIRST_IN_MIDROLL = "FIRST_IN_MIDROLL";
    public static final java.lang.String _LAST_IN_MIDROLL = "LAST_IN_MIDROLL";
    public static final java.lang.String _FIRST_IN_POSTROLL = "FIRST_IN_POSTROLL";
    public static final java.lang.String _LAST_IN_POSTROLL = "LAST_IN_POSTROLL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final VideoPositionTargetingType PREROLL = new VideoPositionTargetingType(_PREROLL);
    public static final VideoPositionTargetingType MIDROLL = new VideoPositionTargetingType(_MIDROLL);
    public static final VideoPositionTargetingType POSTROLL = new VideoPositionTargetingType(_POSTROLL);
    public static final VideoPositionTargetingType BEFORE_PREROLL_BUMPER = new VideoPositionTargetingType(_BEFORE_PREROLL_BUMPER);
    public static final VideoPositionTargetingType AFTER_PREROLL_BUMPER = new VideoPositionTargetingType(_AFTER_PREROLL_BUMPER);
    public static final VideoPositionTargetingType BEFORE_MIDROLL_BUMPERS = new VideoPositionTargetingType(_BEFORE_MIDROLL_BUMPERS);
    public static final VideoPositionTargetingType AFTER_MIDROLL_BUMPERS = new VideoPositionTargetingType(_AFTER_MIDROLL_BUMPERS);
    public static final VideoPositionTargetingType BEFORE_POSTROLL_BUMPER = new VideoPositionTargetingType(_BEFORE_POSTROLL_BUMPER);
    public static final VideoPositionTargetingType AFTER_POSTROLL_BUMPER = new VideoPositionTargetingType(_AFTER_POSTROLL_BUMPER);
    public static final VideoPositionTargetingType FIRST_IN_PREROLL = new VideoPositionTargetingType(_FIRST_IN_PREROLL);
    public static final VideoPositionTargetingType LAST_IN_PREROLL = new VideoPositionTargetingType(_LAST_IN_PREROLL);
    public static final VideoPositionTargetingType FIRST_IN_MIDROLL = new VideoPositionTargetingType(_FIRST_IN_MIDROLL);
    public static final VideoPositionTargetingType LAST_IN_MIDROLL = new VideoPositionTargetingType(_LAST_IN_MIDROLL);
    public static final VideoPositionTargetingType FIRST_IN_POSTROLL = new VideoPositionTargetingType(_FIRST_IN_POSTROLL);
    public static final VideoPositionTargetingType LAST_IN_POSTROLL = new VideoPositionTargetingType(_LAST_IN_POSTROLL);
    public static final VideoPositionTargetingType UNKNOWN = new VideoPositionTargetingType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static VideoPositionTargetingType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoPositionTargetingType enumeration = (VideoPositionTargetingType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoPositionTargetingType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoPositionTargetingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "VideoPositionTargetingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
