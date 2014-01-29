/**
 * AdvancedReportsConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class AdvancedReportsConfiguration  implements java.io.Serializable {
    private int crossSiteDuplication;

    private int frequencyToConversion;

    private int timeLagToConversion;

    public AdvancedReportsConfiguration() {
    }

    public AdvancedReportsConfiguration(
           int crossSiteDuplication,
           int frequencyToConversion,
           int timeLagToConversion) {
           this.crossSiteDuplication = crossSiteDuplication;
           this.frequencyToConversion = frequencyToConversion;
           this.timeLagToConversion = timeLagToConversion;
    }


    /**
     * Gets the crossSiteDuplication value for this AdvancedReportsConfiguration.
     * 
     * @return crossSiteDuplication
     */
    public int getCrossSiteDuplication() {
        return crossSiteDuplication;
    }


    /**
     * Sets the crossSiteDuplication value for this AdvancedReportsConfiguration.
     * 
     * @param crossSiteDuplication
     */
    public void setCrossSiteDuplication(int crossSiteDuplication) {
        this.crossSiteDuplication = crossSiteDuplication;
    }


    /**
     * Gets the frequencyToConversion value for this AdvancedReportsConfiguration.
     * 
     * @return frequencyToConversion
     */
    public int getFrequencyToConversion() {
        return frequencyToConversion;
    }


    /**
     * Sets the frequencyToConversion value for this AdvancedReportsConfiguration.
     * 
     * @param frequencyToConversion
     */
    public void setFrequencyToConversion(int frequencyToConversion) {
        this.frequencyToConversion = frequencyToConversion;
    }


    /**
     * Gets the timeLagToConversion value for this AdvancedReportsConfiguration.
     * 
     * @return timeLagToConversion
     */
    public int getTimeLagToConversion() {
        return timeLagToConversion;
    }


    /**
     * Sets the timeLagToConversion value for this AdvancedReportsConfiguration.
     * 
     * @param timeLagToConversion
     */
    public void setTimeLagToConversion(int timeLagToConversion) {
        this.timeLagToConversion = timeLagToConversion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvancedReportsConfiguration)) return false;
        AdvancedReportsConfiguration other = (AdvancedReportsConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.crossSiteDuplication == other.getCrossSiteDuplication() &&
            this.frequencyToConversion == other.getFrequencyToConversion() &&
            this.timeLagToConversion == other.getTimeLagToConversion();
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
        _hashCode += getCrossSiteDuplication();
        _hashCode += getFrequencyToConversion();
        _hashCode += getTimeLagToConversion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancedReportsConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdvancedReportsConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossSiteDuplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crossSiteDuplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyToConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyToConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLagToConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLagToConversion"));
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
