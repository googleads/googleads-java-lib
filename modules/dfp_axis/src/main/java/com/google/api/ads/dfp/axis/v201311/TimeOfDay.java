/**
 * TimeOfDay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * Represents a specific time in a day.
 */
public class TimeOfDay  implements java.io.Serializable {
    /* Hour in 24 hour time (0..24). This field must be between 0
     * and 24,
     *                 inclusive. This field is required. */
    private java.lang.Integer hour;

    /* Minutes in an hour. Currently, only 0, 15, 30, and 45 are supported.
     * This
     *                 field is required. */
    private com.google.api.ads.dfp.axis.v201311.MinuteOfHour minute;

    public TimeOfDay() {
    }

    public TimeOfDay(
           java.lang.Integer hour,
           com.google.api.ads.dfp.axis.v201311.MinuteOfHour minute) {
           this.hour = hour;
           this.minute = minute;
    }


    /**
     * Gets the hour value for this TimeOfDay.
     * 
     * @return hour   * Hour in 24 hour time (0..24). This field must be between 0
     * and 24,
     *                 inclusive. This field is required.
     */
    public java.lang.Integer getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this TimeOfDay.
     * 
     * @param hour   * Hour in 24 hour time (0..24). This field must be between 0
     * and 24,
     *                 inclusive. This field is required.
     */
    public void setHour(java.lang.Integer hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this TimeOfDay.
     * 
     * @return minute   * Minutes in an hour. Currently, only 0, 15, 30, and 45 are supported.
     * This
     *                 field is required.
     */
    public com.google.api.ads.dfp.axis.v201311.MinuteOfHour getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this TimeOfDay.
     * 
     * @param minute   * Minutes in an hour. Currently, only 0, 15, 30, and 45 are supported.
     * This
     *                 field is required.
     */
    public void setMinute(com.google.api.ads.dfp.axis.v201311.MinuteOfHour minute) {
        this.minute = minute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeOfDay)) return false;
        TimeOfDay other = (TimeOfDay) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute())));
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
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeOfDay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "TimeOfDay"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "MinuteOfHour"));
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
