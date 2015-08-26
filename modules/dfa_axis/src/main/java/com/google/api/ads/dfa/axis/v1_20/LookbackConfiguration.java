/**
 * LookbackConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class LookbackConfiguration  implements java.io.Serializable {
    private int clickDuration;

    private int postImpressionActivitiesDuration;

    private int reportsDays;

    private int richMediaEventsDays;

    public LookbackConfiguration() {
    }

    public LookbackConfiguration(
           int clickDuration,
           int postImpressionActivitiesDuration,
           int reportsDays,
           int richMediaEventsDays) {
           this.clickDuration = clickDuration;
           this.postImpressionActivitiesDuration = postImpressionActivitiesDuration;
           this.reportsDays = reportsDays;
           this.richMediaEventsDays = richMediaEventsDays;
    }


    /**
     * Gets the clickDuration value for this LookbackConfiguration.
     * 
     * @return clickDuration
     */
    public int getClickDuration() {
        return clickDuration;
    }


    /**
     * Sets the clickDuration value for this LookbackConfiguration.
     * 
     * @param clickDuration
     */
    public void setClickDuration(int clickDuration) {
        this.clickDuration = clickDuration;
    }


    /**
     * Gets the postImpressionActivitiesDuration value for this LookbackConfiguration.
     * 
     * @return postImpressionActivitiesDuration
     */
    public int getPostImpressionActivitiesDuration() {
        return postImpressionActivitiesDuration;
    }


    /**
     * Sets the postImpressionActivitiesDuration value for this LookbackConfiguration.
     * 
     * @param postImpressionActivitiesDuration
     */
    public void setPostImpressionActivitiesDuration(int postImpressionActivitiesDuration) {
        this.postImpressionActivitiesDuration = postImpressionActivitiesDuration;
    }


    /**
     * Gets the reportsDays value for this LookbackConfiguration.
     * 
     * @return reportsDays
     */
    public int getReportsDays() {
        return reportsDays;
    }


    /**
     * Sets the reportsDays value for this LookbackConfiguration.
     * 
     * @param reportsDays
     */
    public void setReportsDays(int reportsDays) {
        this.reportsDays = reportsDays;
    }


    /**
     * Gets the richMediaEventsDays value for this LookbackConfiguration.
     * 
     * @return richMediaEventsDays
     */
    public int getRichMediaEventsDays() {
        return richMediaEventsDays;
    }


    /**
     * Sets the richMediaEventsDays value for this LookbackConfiguration.
     * 
     * @param richMediaEventsDays
     */
    public void setRichMediaEventsDays(int richMediaEventsDays) {
        this.richMediaEventsDays = richMediaEventsDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookbackConfiguration)) return false;
        LookbackConfiguration other = (LookbackConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clickDuration == other.getClickDuration() &&
            this.postImpressionActivitiesDuration == other.getPostImpressionActivitiesDuration() &&
            this.reportsDays == other.getReportsDays() &&
            this.richMediaEventsDays == other.getRichMediaEventsDays();
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
        _hashCode += getClickDuration();
        _hashCode += getPostImpressionActivitiesDuration();
        _hashCode += getReportsDays();
        _hashCode += getRichMediaEventsDays();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookbackConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "LookbackConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postImpressionActivitiesDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postImpressionActivitiesDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportsDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportsDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richMediaEventsDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "richMediaEventsDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
