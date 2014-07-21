/**
 * Metric.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class Metric implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Metric(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VIEWS = "VIEWS";
    public static final java.lang.String _THUMBNAIL_IMPRESSIONS = "THUMBNAIL_IMPRESSIONS";
    public static final java.lang.String _VIDEO_IMPRESSIONS = "VIDEO_IMPRESSIONS";
    public static final java.lang.String _TOTAL_IMPRESSIONS = "TOTAL_IMPRESSIONS";
    public static final java.lang.String _COST = "COST";
    public static final java.lang.String _AVERAGE_CPV = "AVERAGE_CPV";
    public static final java.lang.String _VTR = "VTR";
    public static final java.lang.String _CONVERSIONS = "CONVERSIONS";
    public static final java.lang.String _DAILY_UNIQUE_VIEWERS = "DAILY_UNIQUE_VIEWERS";
    public static final java.lang.String _WEEKLY_UNIQUE_VIEWERS = "WEEKLY_UNIQUE_VIEWERS";
    public static final java.lang.String _MONTHLY_UNIQUE_VIEWERS = "MONTHLY_UNIQUE_VIEWERS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final Metric VIEWS = new Metric(_VIEWS);
    public static final Metric THUMBNAIL_IMPRESSIONS = new Metric(_THUMBNAIL_IMPRESSIONS);
    public static final Metric VIDEO_IMPRESSIONS = new Metric(_VIDEO_IMPRESSIONS);
    public static final Metric TOTAL_IMPRESSIONS = new Metric(_TOTAL_IMPRESSIONS);
    public static final Metric COST = new Metric(_COST);
    public static final Metric AVERAGE_CPV = new Metric(_AVERAGE_CPV);
    public static final Metric VTR = new Metric(_VTR);
    public static final Metric CONVERSIONS = new Metric(_CONVERSIONS);
    public static final Metric DAILY_UNIQUE_VIEWERS = new Metric(_DAILY_UNIQUE_VIEWERS);
    public static final Metric WEEKLY_UNIQUE_VIEWERS = new Metric(_WEEKLY_UNIQUE_VIEWERS);
    public static final Metric MONTHLY_UNIQUE_VIEWERS = new Metric(_MONTHLY_UNIQUE_VIEWERS);
    public static final Metric UNKNOWN = new Metric(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static Metric fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Metric enumeration = (Metric)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Metric fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Metric.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "Metric"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
