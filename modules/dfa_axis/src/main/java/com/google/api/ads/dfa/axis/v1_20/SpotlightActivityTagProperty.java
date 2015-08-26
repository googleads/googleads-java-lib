/**
 * SpotlightActivityTagProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class SpotlightActivityTagProperty  implements java.io.Serializable {
    private int averageNumEvents;

    private boolean error;

    private int lastDayNumEvents;

    private java.lang.String topReferrerURL;

    public SpotlightActivityTagProperty() {
    }

    public SpotlightActivityTagProperty(
           int averageNumEvents,
           boolean error,
           int lastDayNumEvents,
           java.lang.String topReferrerURL) {
           this.averageNumEvents = averageNumEvents;
           this.error = error;
           this.lastDayNumEvents = lastDayNumEvents;
           this.topReferrerURL = topReferrerURL;
    }


    /**
     * Gets the averageNumEvents value for this SpotlightActivityTagProperty.
     * 
     * @return averageNumEvents
     */
    public int getAverageNumEvents() {
        return averageNumEvents;
    }


    /**
     * Sets the averageNumEvents value for this SpotlightActivityTagProperty.
     * 
     * @param averageNumEvents
     */
    public void setAverageNumEvents(int averageNumEvents) {
        this.averageNumEvents = averageNumEvents;
    }


    /**
     * Gets the error value for this SpotlightActivityTagProperty.
     * 
     * @return error
     */
    public boolean isError() {
        return error;
    }


    /**
     * Sets the error value for this SpotlightActivityTagProperty.
     * 
     * @param error
     */
    public void setError(boolean error) {
        this.error = error;
    }


    /**
     * Gets the lastDayNumEvents value for this SpotlightActivityTagProperty.
     * 
     * @return lastDayNumEvents
     */
    public int getLastDayNumEvents() {
        return lastDayNumEvents;
    }


    /**
     * Sets the lastDayNumEvents value for this SpotlightActivityTagProperty.
     * 
     * @param lastDayNumEvents
     */
    public void setLastDayNumEvents(int lastDayNumEvents) {
        this.lastDayNumEvents = lastDayNumEvents;
    }


    /**
     * Gets the topReferrerURL value for this SpotlightActivityTagProperty.
     * 
     * @return topReferrerURL
     */
    public java.lang.String getTopReferrerURL() {
        return topReferrerURL;
    }


    /**
     * Sets the topReferrerURL value for this SpotlightActivityTagProperty.
     * 
     * @param topReferrerURL
     */
    public void setTopReferrerURL(java.lang.String topReferrerURL) {
        this.topReferrerURL = topReferrerURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpotlightActivityTagProperty)) return false;
        SpotlightActivityTagProperty other = (SpotlightActivityTagProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.averageNumEvents == other.getAverageNumEvents() &&
            this.error == other.isError() &&
            this.lastDayNumEvents == other.getLastDayNumEvents() &&
            ((this.topReferrerURL==null && other.getTopReferrerURL()==null) || 
             (this.topReferrerURL!=null &&
              this.topReferrerURL.equals(other.getTopReferrerURL())));
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
        _hashCode += getAverageNumEvents();
        _hashCode += (isError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLastDayNumEvents();
        if (getTopReferrerURL() != null) {
            _hashCode += getTopReferrerURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpotlightActivityTagProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SpotlightActivityTagProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageNumEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "averageNumEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDayNumEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastDayNumEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topReferrerURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topReferrerURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
