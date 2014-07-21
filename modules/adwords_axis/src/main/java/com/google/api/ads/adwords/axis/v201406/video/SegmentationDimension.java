/**
 * SegmentationDimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class SegmentationDimension implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SegmentationDimension(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _CONVERSION_CATEGORY = "CONVERSION_CATEGORY";
    public static final java.lang.String _DATE_DAY = "DATE_DAY";
    public static final java.lang.String _DATE_WEEK = "DATE_WEEK";
    public static final java.lang.String _DATE_MONTH = "DATE_MONTH";
    public static final java.lang.String _DATE_QUARTER = "DATE_QUARTER";
    public static final java.lang.String _DATE_YEAR = "DATE_YEAR";
    public static final java.lang.String _DAY_OF_WEEK = "DAY_OF_WEEK";
    public static final java.lang.String _DEVICE_TYPE = "DEVICE_TYPE";
    public static final java.lang.String _DISPLAY_FORMAT = "DISPLAY_FORMAT";
    public static final java.lang.String _DISPLAY_FORMATxNETWORK = "DISPLAY_FORMATxNETWORK";
    public static final java.lang.String _HOUR_OF_DAY = "HOUR_OF_DAY";
    public static final java.lang.String _NETWORK = "NETWORK";
    public static final java.lang.String _TARGETING_GROUP = "TARGETING_GROUP";
    public static final java.lang.String _VIDEO_AD = "VIDEO_AD";
    public static final java.lang.String _CONVERSION_TYPE = "CONVERSION_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SegmentationDimension NONE = new SegmentationDimension(_NONE);
    public static final SegmentationDimension CONVERSION_CATEGORY = new SegmentationDimension(_CONVERSION_CATEGORY);
    public static final SegmentationDimension DATE_DAY = new SegmentationDimension(_DATE_DAY);
    public static final SegmentationDimension DATE_WEEK = new SegmentationDimension(_DATE_WEEK);
    public static final SegmentationDimension DATE_MONTH = new SegmentationDimension(_DATE_MONTH);
    public static final SegmentationDimension DATE_QUARTER = new SegmentationDimension(_DATE_QUARTER);
    public static final SegmentationDimension DATE_YEAR = new SegmentationDimension(_DATE_YEAR);
    public static final SegmentationDimension DAY_OF_WEEK = new SegmentationDimension(_DAY_OF_WEEK);
    public static final SegmentationDimension DEVICE_TYPE = new SegmentationDimension(_DEVICE_TYPE);
    public static final SegmentationDimension DISPLAY_FORMAT = new SegmentationDimension(_DISPLAY_FORMAT);
    public static final SegmentationDimension DISPLAY_FORMATxNETWORK = new SegmentationDimension(_DISPLAY_FORMATxNETWORK);
    public static final SegmentationDimension HOUR_OF_DAY = new SegmentationDimension(_HOUR_OF_DAY);
    public static final SegmentationDimension NETWORK = new SegmentationDimension(_NETWORK);
    public static final SegmentationDimension TARGETING_GROUP = new SegmentationDimension(_TARGETING_GROUP);
    public static final SegmentationDimension VIDEO_AD = new SegmentationDimension(_VIDEO_AD);
    public static final SegmentationDimension CONVERSION_TYPE = new SegmentationDimension(_CONVERSION_TYPE);
    public static final SegmentationDimension UNKNOWN = new SegmentationDimension(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SegmentationDimension fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SegmentationDimension enumeration = (SegmentationDimension)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SegmentationDimension fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SegmentationDimension.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "SegmentationDimension"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
