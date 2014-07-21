/**
 * SegmentationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class SegmentationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SegmentationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INCOMPATIBLE_DIMENSIONS = "INCOMPATIBLE_DIMENSIONS";
    public static final java.lang.String _UNSUPPORTED_SEGMENTATION = "UNSUPPORTED_SEGMENTATION";
    public static final java.lang.String _MAXIMUM_SEGMENTATION_DIMENSIONS_EXCEEDED = "MAXIMUM_SEGMENTATION_DIMENSIONS_EXCEEDED";
    public static final java.lang.String _DATE_RANGE_TOO_LONG = "DATE_RANGE_TOO_LONG";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SegmentationErrorReason INCOMPATIBLE_DIMENSIONS = new SegmentationErrorReason(_INCOMPATIBLE_DIMENSIONS);
    public static final SegmentationErrorReason UNSUPPORTED_SEGMENTATION = new SegmentationErrorReason(_UNSUPPORTED_SEGMENTATION);
    public static final SegmentationErrorReason MAXIMUM_SEGMENTATION_DIMENSIONS_EXCEEDED = new SegmentationErrorReason(_MAXIMUM_SEGMENTATION_DIMENSIONS_EXCEEDED);
    public static final SegmentationErrorReason DATE_RANGE_TOO_LONG = new SegmentationErrorReason(_DATE_RANGE_TOO_LONG);
    public static final SegmentationErrorReason UNKNOWN = new SegmentationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SegmentationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SegmentationErrorReason enumeration = (SegmentationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SegmentationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SegmentationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "SegmentationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
