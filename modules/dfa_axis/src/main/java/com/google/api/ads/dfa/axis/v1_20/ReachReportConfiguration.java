/**
 * ReachReportConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class ReachReportConfiguration  implements java.io.Serializable {
    private boolean adTypeFrequencyAndReach;

    private boolean pageLevelFrequency;

    private boolean placementFrequency;

    private boolean siteLevelFrequency;

    public ReachReportConfiguration() {
    }

    public ReachReportConfiguration(
           boolean adTypeFrequencyAndReach,
           boolean pageLevelFrequency,
           boolean placementFrequency,
           boolean siteLevelFrequency) {
           this.adTypeFrequencyAndReach = adTypeFrequencyAndReach;
           this.pageLevelFrequency = pageLevelFrequency;
           this.placementFrequency = placementFrequency;
           this.siteLevelFrequency = siteLevelFrequency;
    }


    /**
     * Gets the adTypeFrequencyAndReach value for this ReachReportConfiguration.
     * 
     * @return adTypeFrequencyAndReach
     */
    public boolean isAdTypeFrequencyAndReach() {
        return adTypeFrequencyAndReach;
    }


    /**
     * Sets the adTypeFrequencyAndReach value for this ReachReportConfiguration.
     * 
     * @param adTypeFrequencyAndReach
     */
    public void setAdTypeFrequencyAndReach(boolean adTypeFrequencyAndReach) {
        this.adTypeFrequencyAndReach = adTypeFrequencyAndReach;
    }


    /**
     * Gets the pageLevelFrequency value for this ReachReportConfiguration.
     * 
     * @return pageLevelFrequency
     */
    public boolean isPageLevelFrequency() {
        return pageLevelFrequency;
    }


    /**
     * Sets the pageLevelFrequency value for this ReachReportConfiguration.
     * 
     * @param pageLevelFrequency
     */
    public void setPageLevelFrequency(boolean pageLevelFrequency) {
        this.pageLevelFrequency = pageLevelFrequency;
    }


    /**
     * Gets the placementFrequency value for this ReachReportConfiguration.
     * 
     * @return placementFrequency
     */
    public boolean isPlacementFrequency() {
        return placementFrequency;
    }


    /**
     * Sets the placementFrequency value for this ReachReportConfiguration.
     * 
     * @param placementFrequency
     */
    public void setPlacementFrequency(boolean placementFrequency) {
        this.placementFrequency = placementFrequency;
    }


    /**
     * Gets the siteLevelFrequency value for this ReachReportConfiguration.
     * 
     * @return siteLevelFrequency
     */
    public boolean isSiteLevelFrequency() {
        return siteLevelFrequency;
    }


    /**
     * Sets the siteLevelFrequency value for this ReachReportConfiguration.
     * 
     * @param siteLevelFrequency
     */
    public void setSiteLevelFrequency(boolean siteLevelFrequency) {
        this.siteLevelFrequency = siteLevelFrequency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReachReportConfiguration)) return false;
        ReachReportConfiguration other = (ReachReportConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.adTypeFrequencyAndReach == other.isAdTypeFrequencyAndReach() &&
            this.pageLevelFrequency == other.isPageLevelFrequency() &&
            this.placementFrequency == other.isPlacementFrequency() &&
            this.siteLevelFrequency == other.isSiteLevelFrequency();
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
        _hashCode += (isAdTypeFrequencyAndReach() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPageLevelFrequency() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPlacementFrequency() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSiteLevelFrequency() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReachReportConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ReachReportConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTypeFrequencyAndReach");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adTypeFrequencyAndReach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageLevelFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageLevelFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteLevelFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteLevelFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
