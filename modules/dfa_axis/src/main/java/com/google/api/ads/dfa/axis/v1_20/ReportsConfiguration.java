/**
 * ReportsConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class ReportsConfiguration  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.AdvancedReportsConfiguration advancedReportsConfiguration;

    private com.google.api.ads.dfa.axis.v1_20.ExposureToConversionConfiguration exposureToConversionConfiguration;

    private com.google.api.ads.dfa.axis.v1_20.LookbackConfiguration lookbackConfiguration;

    private int minimumClickRate;

    private int minimumClicks;

    private int minimumDays;

    private int minimumImpressions;

    private com.google.api.ads.dfa.axis.v1_20.ReachReportConfiguration reachReportConfiguration;

    public ReportsConfiguration() {
    }

    public ReportsConfiguration(
           com.google.api.ads.dfa.axis.v1_20.AdvancedReportsConfiguration advancedReportsConfiguration,
           com.google.api.ads.dfa.axis.v1_20.ExposureToConversionConfiguration exposureToConversionConfiguration,
           com.google.api.ads.dfa.axis.v1_20.LookbackConfiguration lookbackConfiguration,
           int minimumClickRate,
           int minimumClicks,
           int minimumDays,
           int minimumImpressions,
           com.google.api.ads.dfa.axis.v1_20.ReachReportConfiguration reachReportConfiguration) {
           this.advancedReportsConfiguration = advancedReportsConfiguration;
           this.exposureToConversionConfiguration = exposureToConversionConfiguration;
           this.lookbackConfiguration = lookbackConfiguration;
           this.minimumClickRate = minimumClickRate;
           this.minimumClicks = minimumClicks;
           this.minimumDays = minimumDays;
           this.minimumImpressions = minimumImpressions;
           this.reachReportConfiguration = reachReportConfiguration;
    }


    /**
     * Gets the advancedReportsConfiguration value for this ReportsConfiguration.
     * 
     * @return advancedReportsConfiguration
     */
    public com.google.api.ads.dfa.axis.v1_20.AdvancedReportsConfiguration getAdvancedReportsConfiguration() {
        return advancedReportsConfiguration;
    }


    /**
     * Sets the advancedReportsConfiguration value for this ReportsConfiguration.
     * 
     * @param advancedReportsConfiguration
     */
    public void setAdvancedReportsConfiguration(com.google.api.ads.dfa.axis.v1_20.AdvancedReportsConfiguration advancedReportsConfiguration) {
        this.advancedReportsConfiguration = advancedReportsConfiguration;
    }


    /**
     * Gets the exposureToConversionConfiguration value for this ReportsConfiguration.
     * 
     * @return exposureToConversionConfiguration
     */
    public com.google.api.ads.dfa.axis.v1_20.ExposureToConversionConfiguration getExposureToConversionConfiguration() {
        return exposureToConversionConfiguration;
    }


    /**
     * Sets the exposureToConversionConfiguration value for this ReportsConfiguration.
     * 
     * @param exposureToConversionConfiguration
     */
    public void setExposureToConversionConfiguration(com.google.api.ads.dfa.axis.v1_20.ExposureToConversionConfiguration exposureToConversionConfiguration) {
        this.exposureToConversionConfiguration = exposureToConversionConfiguration;
    }


    /**
     * Gets the lookbackConfiguration value for this ReportsConfiguration.
     * 
     * @return lookbackConfiguration
     */
    public com.google.api.ads.dfa.axis.v1_20.LookbackConfiguration getLookbackConfiguration() {
        return lookbackConfiguration;
    }


    /**
     * Sets the lookbackConfiguration value for this ReportsConfiguration.
     * 
     * @param lookbackConfiguration
     */
    public void setLookbackConfiguration(com.google.api.ads.dfa.axis.v1_20.LookbackConfiguration lookbackConfiguration) {
        this.lookbackConfiguration = lookbackConfiguration;
    }


    /**
     * Gets the minimumClickRate value for this ReportsConfiguration.
     * 
     * @return minimumClickRate
     */
    public int getMinimumClickRate() {
        return minimumClickRate;
    }


    /**
     * Sets the minimumClickRate value for this ReportsConfiguration.
     * 
     * @param minimumClickRate
     */
    public void setMinimumClickRate(int minimumClickRate) {
        this.minimumClickRate = minimumClickRate;
    }


    /**
     * Gets the minimumClicks value for this ReportsConfiguration.
     * 
     * @return minimumClicks
     */
    public int getMinimumClicks() {
        return minimumClicks;
    }


    /**
     * Sets the minimumClicks value for this ReportsConfiguration.
     * 
     * @param minimumClicks
     */
    public void setMinimumClicks(int minimumClicks) {
        this.minimumClicks = minimumClicks;
    }


    /**
     * Gets the minimumDays value for this ReportsConfiguration.
     * 
     * @return minimumDays
     */
    public int getMinimumDays() {
        return minimumDays;
    }


    /**
     * Sets the minimumDays value for this ReportsConfiguration.
     * 
     * @param minimumDays
     */
    public void setMinimumDays(int minimumDays) {
        this.minimumDays = minimumDays;
    }


    /**
     * Gets the minimumImpressions value for this ReportsConfiguration.
     * 
     * @return minimumImpressions
     */
    public int getMinimumImpressions() {
        return minimumImpressions;
    }


    /**
     * Sets the minimumImpressions value for this ReportsConfiguration.
     * 
     * @param minimumImpressions
     */
    public void setMinimumImpressions(int minimumImpressions) {
        this.minimumImpressions = minimumImpressions;
    }


    /**
     * Gets the reachReportConfiguration value for this ReportsConfiguration.
     * 
     * @return reachReportConfiguration
     */
    public com.google.api.ads.dfa.axis.v1_20.ReachReportConfiguration getReachReportConfiguration() {
        return reachReportConfiguration;
    }


    /**
     * Sets the reachReportConfiguration value for this ReportsConfiguration.
     * 
     * @param reachReportConfiguration
     */
    public void setReachReportConfiguration(com.google.api.ads.dfa.axis.v1_20.ReachReportConfiguration reachReportConfiguration) {
        this.reachReportConfiguration = reachReportConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportsConfiguration)) return false;
        ReportsConfiguration other = (ReportsConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advancedReportsConfiguration==null && other.getAdvancedReportsConfiguration()==null) || 
             (this.advancedReportsConfiguration!=null &&
              this.advancedReportsConfiguration.equals(other.getAdvancedReportsConfiguration()))) &&
            ((this.exposureToConversionConfiguration==null && other.getExposureToConversionConfiguration()==null) || 
             (this.exposureToConversionConfiguration!=null &&
              this.exposureToConversionConfiguration.equals(other.getExposureToConversionConfiguration()))) &&
            ((this.lookbackConfiguration==null && other.getLookbackConfiguration()==null) || 
             (this.lookbackConfiguration!=null &&
              this.lookbackConfiguration.equals(other.getLookbackConfiguration()))) &&
            this.minimumClickRate == other.getMinimumClickRate() &&
            this.minimumClicks == other.getMinimumClicks() &&
            this.minimumDays == other.getMinimumDays() &&
            this.minimumImpressions == other.getMinimumImpressions() &&
            ((this.reachReportConfiguration==null && other.getReachReportConfiguration()==null) || 
             (this.reachReportConfiguration!=null &&
              this.reachReportConfiguration.equals(other.getReachReportConfiguration())));
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
        if (getAdvancedReportsConfiguration() != null) {
            _hashCode += getAdvancedReportsConfiguration().hashCode();
        }
        if (getExposureToConversionConfiguration() != null) {
            _hashCode += getExposureToConversionConfiguration().hashCode();
        }
        if (getLookbackConfiguration() != null) {
            _hashCode += getLookbackConfiguration().hashCode();
        }
        _hashCode += getMinimumClickRate();
        _hashCode += getMinimumClicks();
        _hashCode += getMinimumDays();
        _hashCode += getMinimumImpressions();
        if (getReachReportConfiguration() != null) {
            _hashCode += getReachReportConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportsConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ReportsConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedReportsConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advancedReportsConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "AdvancedReportsConfiguration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposureToConversionConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposureToConversionConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ExposureToConversionConfiguration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookbackConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookbackConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "LookbackConfiguration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumClickRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumClickRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reachReportConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reachReportConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ReachReportConfiguration"));
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
