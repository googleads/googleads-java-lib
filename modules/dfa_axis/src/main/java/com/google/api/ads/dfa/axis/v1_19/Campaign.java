/**
 * Campaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class Campaign  extends com.google.api.ads.dfa.axis.v1_19.CampaignBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.AudienceSegmentGroup[] audienceSegmentGroups;

    private long[] creativeGroupIds;

    private com.google.api.ads.dfa.axis.v1_19.CreativeOptimizationConfiguration creativeOptimizationConfiguration;

    private long[] landingPageIds;

    private com.google.api.ads.dfa.axis.v1_19.LookbackWindow lookbackWindow;

    private com.google.api.ads.dfa.axis.v1_19.ReachReportConfiguration reachReportConfiguration;

    public Campaign() {
    }

    public Campaign(
           long id,
           java.lang.String name,
           long advertiserId,
           boolean archived,
           java.lang.String billingInvoiceNotation,
           java.lang.String comments,
           long defaultLandingPageId,
           java.util.Calendar endDate,
           java.util.Calendar startDate,
           com.google.api.ads.dfa.axis.v1_19.AudienceSegmentGroup[] audienceSegmentGroups,
           long[] creativeGroupIds,
           com.google.api.ads.dfa.axis.v1_19.CreativeOptimizationConfiguration creativeOptimizationConfiguration,
           long[] landingPageIds,
           com.google.api.ads.dfa.axis.v1_19.LookbackWindow lookbackWindow,
           com.google.api.ads.dfa.axis.v1_19.ReachReportConfiguration reachReportConfiguration) {
        super(
            id,
            name,
            advertiserId,
            archived,
            billingInvoiceNotation,
            comments,
            defaultLandingPageId,
            endDate,
            startDate);
        this.audienceSegmentGroups = audienceSegmentGroups;
        this.creativeGroupIds = creativeGroupIds;
        this.creativeOptimizationConfiguration = creativeOptimizationConfiguration;
        this.landingPageIds = landingPageIds;
        this.lookbackWindow = lookbackWindow;
        this.reachReportConfiguration = reachReportConfiguration;
    }


    /**
     * Gets the audienceSegmentGroups value for this Campaign.
     * 
     * @return audienceSegmentGroups
     */
    public com.google.api.ads.dfa.axis.v1_19.AudienceSegmentGroup[] getAudienceSegmentGroups() {
        return audienceSegmentGroups;
    }


    /**
     * Sets the audienceSegmentGroups value for this Campaign.
     * 
     * @param audienceSegmentGroups
     */
    public void setAudienceSegmentGroups(com.google.api.ads.dfa.axis.v1_19.AudienceSegmentGroup[] audienceSegmentGroups) {
        this.audienceSegmentGroups = audienceSegmentGroups;
    }


    /**
     * Gets the creativeGroupIds value for this Campaign.
     * 
     * @return creativeGroupIds
     */
    public long[] getCreativeGroupIds() {
        return creativeGroupIds;
    }


    /**
     * Sets the creativeGroupIds value for this Campaign.
     * 
     * @param creativeGroupIds
     */
    public void setCreativeGroupIds(long[] creativeGroupIds) {
        this.creativeGroupIds = creativeGroupIds;
    }


    /**
     * Gets the creativeOptimizationConfiguration value for this Campaign.
     * 
     * @return creativeOptimizationConfiguration
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeOptimizationConfiguration getCreativeOptimizationConfiguration() {
        return creativeOptimizationConfiguration;
    }


    /**
     * Sets the creativeOptimizationConfiguration value for this Campaign.
     * 
     * @param creativeOptimizationConfiguration
     */
    public void setCreativeOptimizationConfiguration(com.google.api.ads.dfa.axis.v1_19.CreativeOptimizationConfiguration creativeOptimizationConfiguration) {
        this.creativeOptimizationConfiguration = creativeOptimizationConfiguration;
    }


    /**
     * Gets the landingPageIds value for this Campaign.
     * 
     * @return landingPageIds
     */
    public long[] getLandingPageIds() {
        return landingPageIds;
    }


    /**
     * Sets the landingPageIds value for this Campaign.
     * 
     * @param landingPageIds
     */
    public void setLandingPageIds(long[] landingPageIds) {
        this.landingPageIds = landingPageIds;
    }


    /**
     * Gets the lookbackWindow value for this Campaign.
     * 
     * @return lookbackWindow
     */
    public com.google.api.ads.dfa.axis.v1_19.LookbackWindow getLookbackWindow() {
        return lookbackWindow;
    }


    /**
     * Sets the lookbackWindow value for this Campaign.
     * 
     * @param lookbackWindow
     */
    public void setLookbackWindow(com.google.api.ads.dfa.axis.v1_19.LookbackWindow lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
    }


    /**
     * Gets the reachReportConfiguration value for this Campaign.
     * 
     * @return reachReportConfiguration
     */
    public com.google.api.ads.dfa.axis.v1_19.ReachReportConfiguration getReachReportConfiguration() {
        return reachReportConfiguration;
    }


    /**
     * Sets the reachReportConfiguration value for this Campaign.
     * 
     * @param reachReportConfiguration
     */
    public void setReachReportConfiguration(com.google.api.ads.dfa.axis.v1_19.ReachReportConfiguration reachReportConfiguration) {
        this.reachReportConfiguration = reachReportConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Campaign)) return false;
        Campaign other = (Campaign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audienceSegmentGroups==null && other.getAudienceSegmentGroups()==null) || 
             (this.audienceSegmentGroups!=null &&
              java.util.Arrays.equals(this.audienceSegmentGroups, other.getAudienceSegmentGroups()))) &&
            ((this.creativeGroupIds==null && other.getCreativeGroupIds()==null) || 
             (this.creativeGroupIds!=null &&
              java.util.Arrays.equals(this.creativeGroupIds, other.getCreativeGroupIds()))) &&
            ((this.creativeOptimizationConfiguration==null && other.getCreativeOptimizationConfiguration()==null) || 
             (this.creativeOptimizationConfiguration!=null &&
              this.creativeOptimizationConfiguration.equals(other.getCreativeOptimizationConfiguration()))) &&
            ((this.landingPageIds==null && other.getLandingPageIds()==null) || 
             (this.landingPageIds!=null &&
              java.util.Arrays.equals(this.landingPageIds, other.getLandingPageIds()))) &&
            ((this.lookbackWindow==null && other.getLookbackWindow()==null) || 
             (this.lookbackWindow!=null &&
              this.lookbackWindow.equals(other.getLookbackWindow()))) &&
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
        int _hashCode = super.hashCode();
        if (getAudienceSegmentGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudienceSegmentGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceSegmentGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreativeGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreativeOptimizationConfiguration() != null) {
            _hashCode += getCreativeOptimizationConfiguration().hashCode();
        }
        if (getLandingPageIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandingPageIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandingPageIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLookbackWindow() != null) {
            _hashCode += getLookbackWindow().hashCode();
        }
        if (getReachReportConfiguration() != null) {
            _hashCode += getReachReportConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Campaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Campaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceSegmentGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audienceSegmentGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AudienceSegmentGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeOptimizationConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeOptimizationConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeOptimizationConfiguration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingPageIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "landingPageIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LookbackWindow"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reachReportConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reachReportConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ReachReportConfiguration"));
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
