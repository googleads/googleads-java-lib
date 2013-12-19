/**
 * RotationGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class RotationGroup  extends com.google.api.ads.dfa.axis.v1_19.TargetableAdBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] assignedFrequencyCapGroups;

    private com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] creativeAssignments;

    private boolean creativeOptimizationEnabled;

    private int rotationType;

    public RotationGroup() {
    }

    public RotationGroup(
           long id,
           java.lang.String name,
           boolean active,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           java.util.Calendar endTime,
           com.google.api.ads.dfa.axis.v1_19.PlacementAssignment[] placementAssignments,
           long sizeId,
           java.util.Calendar startTime,
           long typeId,
           com.google.api.ads.dfa.axis.v1_19.ISP[] ISPs,
           com.google.api.ads.dfa.axis.v1_19.OSP[] OSPs,
           com.google.api.ads.dfa.axis.v1_19.AreaCode[] areaCodes,
           long audienceSegmentId,
           com.google.api.ads.dfa.axis.v1_19.Bandwidth[] bandwidths,
           com.google.api.ads.dfa.axis.v1_19.BrowserVersion[] browserVersions,
           com.google.api.ads.dfa.axis.v1_19.City[] cities,
           int costType,
           com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria countryTargetingCriteria,
           int[] daysOfWeek,
           int deliveryLimit,
           boolean deliveryLimitEnabled,
           com.google.api.ads.dfa.axis.v1_19.DesignatedMarketArea[] designatedMarketAreas,
           com.google.api.ads.dfa.axis.v1_19.DomainNameBase[] domainNames,
           com.google.api.ads.dfa.axis.v1_19.DomainType[] domainTypes,
           int frequencyCap,
           long frequencyCapPeriod,
           boolean hardCutOff,
           int[] hoursOfDay,
           java.lang.String keywordExpression,
           com.google.api.ads.dfa.axis.v1_19.OperatingSystem[] operatingSystems,
           java.lang.String[] postalCodes,
           int priority,
           int ratio,
           com.google.api.ads.dfa.axis.v1_19.State[] states,
           com.google.api.ads.dfa.axis.v1_19.UserListExpression userListExpression,
           boolean userLocalTime,
           com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] assignedFrequencyCapGroups,
           com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] creativeAssignments,
           boolean creativeOptimizationEnabled,
           int rotationType) {
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
        this.assignedFrequencyCapGroups = assignedFrequencyCapGroups;
        this.creativeAssignments = creativeAssignments;
        this.creativeOptimizationEnabled = creativeOptimizationEnabled;
        this.rotationType = rotationType;
    }


    /**
     * Gets the assignedFrequencyCapGroups value for this RotationGroup.
     * 
     * @return assignedFrequencyCapGroups
     */
    public com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] getAssignedFrequencyCapGroups() {
        return assignedFrequencyCapGroups;
    }


    /**
     * Sets the assignedFrequencyCapGroups value for this RotationGroup.
     * 
     * @param assignedFrequencyCapGroups
     */
    public void setAssignedFrequencyCapGroups(com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] assignedFrequencyCapGroups) {
        this.assignedFrequencyCapGroups = assignedFrequencyCapGroups;
    }


    /**
     * Gets the creativeAssignments value for this RotationGroup.
     * 
     * @return creativeAssignments
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] getCreativeAssignments() {
        return creativeAssignments;
    }


    /**
     * Sets the creativeAssignments value for this RotationGroup.
     * 
     * @param creativeAssignments
     */
    public void setCreativeAssignments(com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] creativeAssignments) {
        this.creativeAssignments = creativeAssignments;
    }


    /**
     * Gets the creativeOptimizationEnabled value for this RotationGroup.
     * 
     * @return creativeOptimizationEnabled
     */
    public boolean isCreativeOptimizationEnabled() {
        return creativeOptimizationEnabled;
    }


    /**
     * Sets the creativeOptimizationEnabled value for this RotationGroup.
     * 
     * @param creativeOptimizationEnabled
     */
    public void setCreativeOptimizationEnabled(boolean creativeOptimizationEnabled) {
        this.creativeOptimizationEnabled = creativeOptimizationEnabled;
    }


    /**
     * Gets the rotationType value for this RotationGroup.
     * 
     * @return rotationType
     */
    public int getRotationType() {
        return rotationType;
    }


    /**
     * Sets the rotationType value for this RotationGroup.
     * 
     * @param rotationType
     */
    public void setRotationType(int rotationType) {
        this.rotationType = rotationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RotationGroup)) return false;
        RotationGroup other = (RotationGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignedFrequencyCapGroups==null && other.getAssignedFrequencyCapGroups()==null) || 
             (this.assignedFrequencyCapGroups!=null &&
              java.util.Arrays.equals(this.assignedFrequencyCapGroups, other.getAssignedFrequencyCapGroups()))) &&
            ((this.creativeAssignments==null && other.getCreativeAssignments()==null) || 
             (this.creativeAssignments!=null &&
              java.util.Arrays.equals(this.creativeAssignments, other.getCreativeAssignments()))) &&
            this.creativeOptimizationEnabled == other.isCreativeOptimizationEnabled() &&
            this.rotationType == other.getRotationType();
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
        if (getAssignedFrequencyCapGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedFrequencyCapGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedFrequencyCapGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreativeAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isCreativeOptimizationEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getRotationType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RotationGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RotationGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedFrequencyCapGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedFrequencyCapGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "FrequencyCapGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeAssignment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeOptimizationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeOptimizationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rotationType"));
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
