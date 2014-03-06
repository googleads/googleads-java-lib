/**
 * ExposureToConversionConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class ExposureToConversionConfiguration  implements java.io.Serializable {
    private int activitiesToTrack;

    private boolean exposureToConversionEnabled;

    private int exposuresToTrack;

    public ExposureToConversionConfiguration() {
    }

    public ExposureToConversionConfiguration(
           int activitiesToTrack,
           boolean exposureToConversionEnabled,
           int exposuresToTrack) {
           this.activitiesToTrack = activitiesToTrack;
           this.exposureToConversionEnabled = exposureToConversionEnabled;
           this.exposuresToTrack = exposuresToTrack;
    }


    /**
     * Gets the activitiesToTrack value for this ExposureToConversionConfiguration.
     * 
     * @return activitiesToTrack
     */
    public int getActivitiesToTrack() {
        return activitiesToTrack;
    }


    /**
     * Sets the activitiesToTrack value for this ExposureToConversionConfiguration.
     * 
     * @param activitiesToTrack
     */
    public void setActivitiesToTrack(int activitiesToTrack) {
        this.activitiesToTrack = activitiesToTrack;
    }


    /**
     * Gets the exposureToConversionEnabled value for this ExposureToConversionConfiguration.
     * 
     * @return exposureToConversionEnabled
     */
    public boolean isExposureToConversionEnabled() {
        return exposureToConversionEnabled;
    }


    /**
     * Sets the exposureToConversionEnabled value for this ExposureToConversionConfiguration.
     * 
     * @param exposureToConversionEnabled
     */
    public void setExposureToConversionEnabled(boolean exposureToConversionEnabled) {
        this.exposureToConversionEnabled = exposureToConversionEnabled;
    }


    /**
     * Gets the exposuresToTrack value for this ExposureToConversionConfiguration.
     * 
     * @return exposuresToTrack
     */
    public int getExposuresToTrack() {
        return exposuresToTrack;
    }


    /**
     * Sets the exposuresToTrack value for this ExposureToConversionConfiguration.
     * 
     * @param exposuresToTrack
     */
    public void setExposuresToTrack(int exposuresToTrack) {
        this.exposuresToTrack = exposuresToTrack;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureToConversionConfiguration)) return false;
        ExposureToConversionConfiguration other = (ExposureToConversionConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.activitiesToTrack == other.getActivitiesToTrack() &&
            this.exposureToConversionEnabled == other.isExposureToConversionEnabled() &&
            this.exposuresToTrack == other.getExposuresToTrack();
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
        _hashCode += getActivitiesToTrack();
        _hashCode += (isExposureToConversionEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getExposuresToTrack();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureToConversionConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ExposureToConversionConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activitiesToTrack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activitiesToTrack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposureToConversionEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposureToConversionEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposuresToTrack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposuresToTrack"));
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
