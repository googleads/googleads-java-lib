/**
 * CreativeAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeAd  extends com.google.api.ads.dfa.axis.v1_20.TargetableAdBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.ClickThroughUrl clickThroughUrl;

    private com.google.api.ads.dfa.axis.v1_20.CreativeGroupAssignment creativeGroupAssignment;

    private long creativeId;

    public CreativeAd() {
    }

    public CreativeAd(
           long id,
           java.lang.String name,
           boolean active,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           java.util.Calendar endTime,
           com.google.api.ads.dfa.axis.v1_20.PlacementAssignment[] placementAssignments,
           long sizeId,
           java.util.Calendar startTime,
           long typeId,
           com.google.api.ads.dfa.axis.v1_20.ISP[] ISPs,
           com.google.api.ads.dfa.axis.v1_20.OSP[] OSPs,
           com.google.api.ads.dfa.axis.v1_20.AreaCode[] areaCodes,
           long audienceSegmentId,
           com.google.api.ads.dfa.axis.v1_20.Bandwidth[] bandwidths,
           com.google.api.ads.dfa.axis.v1_20.BrowserVersion[] browserVersions,
           com.google.api.ads.dfa.axis.v1_20.City[] cities,
           int costType,
           com.google.api.ads.dfa.axis.v1_20.CountryTargetingCriteria countryTargetingCriteria,
           int[] daysOfWeek,
           int deliveryLimit,
           boolean deliveryLimitEnabled,
           com.google.api.ads.dfa.axis.v1_20.DesignatedMarketArea[] designatedMarketAreas,
           com.google.api.ads.dfa.axis.v1_20.DomainNameBase[] domainNames,
           com.google.api.ads.dfa.axis.v1_20.DomainType[] domainTypes,
           int frequencyCap,
           long frequencyCapPeriod,
           boolean hardCutOff,
           int[] hoursOfDay,
           java.lang.String keywordExpression,
           com.google.api.ads.dfa.axis.v1_20.OperatingSystem[] operatingSystems,
           java.lang.String[] postalCodes,
           int priority,
           int ratio,
           com.google.api.ads.dfa.axis.v1_20.State[] states,
           com.google.api.ads.dfa.axis.v1_20.UserListExpression userListExpression,
           boolean userLocalTime,
           com.google.api.ads.dfa.axis.v1_20.ClickThroughUrl clickThroughUrl,
           com.google.api.ads.dfa.axis.v1_20.CreativeGroupAssignment creativeGroupAssignment,
           long creativeId) {
        super(
            id,
            name,
            active,
            archived,
            campaignId,
            comments,
            endTime,
            placementAssignments,
            sizeId,
            startTime,
            typeId,
            ISPs,
            OSPs,
            areaCodes,
            audienceSegmentId,
            bandwidths,
            browserVersions,
            cities,
            costType,
            countryTargetingCriteria,
            daysOfWeek,
            deliveryLimit,
            deliveryLimitEnabled,
            designatedMarketAreas,
            domainNames,
            domainTypes,
            frequencyCap,
            frequencyCapPeriod,
            hardCutOff,
            hoursOfDay,
            keywordExpression,
            operatingSystems,
            postalCodes,
            priority,
            ratio,
            states,
            userListExpression,
            userLocalTime);
        this.clickThroughUrl = clickThroughUrl;
        this.creativeGroupAssignment = creativeGroupAssignment;
        this.creativeId = creativeId;
    }


    /**
     * Gets the clickThroughUrl value for this CreativeAd.
     * 
     * @return clickThroughUrl
     */
    public com.google.api.ads.dfa.axis.v1_20.ClickThroughUrl getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this CreativeAd.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(com.google.api.ads.dfa.axis.v1_20.ClickThroughUrl clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the creativeGroupAssignment value for this CreativeAd.
     * 
     * @return creativeGroupAssignment
     */
    public com.google.api.ads.dfa.axis.v1_20.CreativeGroupAssignment getCreativeGroupAssignment() {
        return creativeGroupAssignment;
    }


    /**
     * Sets the creativeGroupAssignment value for this CreativeAd.
     * 
     * @param creativeGroupAssignment
     */
    public void setCreativeGroupAssignment(com.google.api.ads.dfa.axis.v1_20.CreativeGroupAssignment creativeGroupAssignment) {
        this.creativeGroupAssignment = creativeGroupAssignment;
    }


    /**
     * Gets the creativeId value for this CreativeAd.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativeAd.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeAd)) return false;
        CreativeAd other = (CreativeAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clickThroughUrl==null && other.getClickThroughUrl()==null) || 
             (this.clickThroughUrl!=null &&
              this.clickThroughUrl.equals(other.getClickThroughUrl()))) &&
            ((this.creativeGroupAssignment==null && other.getCreativeGroupAssignment()==null) || 
             (this.creativeGroupAssignment!=null &&
              this.creativeGroupAssignment.equals(other.getCreativeGroupAssignment()))) &&
            this.creativeId == other.getCreativeId();
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
        if (getClickThroughUrl() != null) {
            _hashCode += getClickThroughUrl().hashCode();
        }
        if (getCreativeGroupAssignment() != null) {
            _hashCode += getCreativeGroupAssignment().hashCode();
        }
        _hashCode += new Long(getCreativeId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ClickThroughUrl"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeGroupAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeGroupAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeGroupAssignment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
