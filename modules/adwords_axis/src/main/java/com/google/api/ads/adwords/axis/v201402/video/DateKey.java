/**
 * DateKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Segment key for segmenting by a time-based dimension.
 */
public class DateKey  implements java.io.Serializable {
    /* The starting date for the time range covered by this key.
     *                 The format for the date is YYYYMMDD. */
    private java.lang.String date;

    private com.google.api.ads.adwords.axis.v201402.video.SegmentationDimension dimension;

    public DateKey() {
    }

    public DateKey(
           java.lang.String date,
           com.google.api.ads.adwords.axis.v201402.video.SegmentationDimension dimension) {
           this.date = date;
           this.dimension = dimension;
    }


    /**
     * Gets the date value for this DateKey.
     * 
     * @return date   * The starting date for the time range covered by this key.
     *                 The format for the date is YYYYMMDD.
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this DateKey.
     * 
     * @param date   * The starting date for the time range covered by this key.
     *                 The format for the date is YYYYMMDD.
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the dimension value for this DateKey.
     * 
     * @return dimension
     */
    public com.google.api.ads.adwords.axis.v201402.video.SegmentationDimension getDimension() {
        return dimension;
    }


    /**
     * Sets the dimension value for this DateKey.
     * 
     * @param dimension
     */
    public void setDimension(com.google.api.ads.adwords.axis.v201402.video.SegmentationDimension dimension) {
        this.dimension = dimension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateKey)) return false;
        DateKey other = (DateKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.dimension==null && other.getDimension()==null) || 
             (this.dimension!=null &&
              this.dimension.equals(other.getDimension())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDimension() != null) {
            _hashCode += getDimension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DateKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "SegmentationDimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
