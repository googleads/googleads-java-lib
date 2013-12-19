/**
 * SpotlightActivitySearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class SpotlightActivitySearchCriteria  extends com.google.api.ads.dfa.axis.v1_19.PageableSearchCriteriaBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter;

    private int activityType;

    private long advertiserId;

    private long[] spotlightActivityGroupIds;

    public SpotlightActivitySearchCriteria() {
    }

    public SpotlightActivitySearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter,
           int activityType,
           long advertiserId,
           long[] spotlightActivityGroupIds) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.activeFilter = activeFilter;
        this.activityType = activityType;
        this.advertiserId = advertiserId;
        this.spotlightActivityGroupIds = spotlightActivityGroupIds;
    }


    /**
     * Gets the activeFilter value for this SpotlightActivitySearchCriteria.
     * 
     * @return activeFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.ActiveFilter getActiveFilter() {
        return activeFilter;
    }


    /**
     * Sets the activeFilter value for this SpotlightActivitySearchCriteria.
     * 
     * @param activeFilter
     */
    public void setActiveFilter(com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter) {
        this.activeFilter = activeFilter;
    }


    /**
     * Gets the activityType value for this SpotlightActivitySearchCriteria.
     * 
     * @return activityType
     */
    public int getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this SpotlightActivitySearchCriteria.
     * 
     * @param activityType
     */
    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the advertiserId value for this SpotlightActivitySearchCriteria.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this SpotlightActivitySearchCriteria.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the spotlightActivityGroupIds value for this SpotlightActivitySearchCriteria.
     * 
     * @return spotlightActivityGroupIds
     */
    public long[] getSpotlightActivityGroupIds() {
        return spotlightActivityGroupIds;
    }


    /**
     * Sets the spotlightActivityGroupIds value for this SpotlightActivitySearchCriteria.
     * 
     * @param spotlightActivityGroupIds
     */
    public void setSpotlightActivityGroupIds(long[] spotlightActivityGroupIds) {
        this.spotlightActivityGroupIds = spotlightActivityGroupIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpotlightActivitySearchCriteria)) return false;
        SpotlightActivitySearchCriteria other = (SpotlightActivitySearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activeFilter==null && other.getActiveFilter()==null) || 
             (this.activeFilter!=null &&
              this.activeFilter.equals(other.getActiveFilter()))) &&
            this.activityType == other.getActivityType() &&
            this.advertiserId == other.getAdvertiserId() &&
            ((this.spotlightActivityGroupIds==null && other.getSpotlightActivityGroupIds()==null) || 
             (this.spotlightActivityGroupIds!=null &&
              java.util.Arrays.equals(this.spotlightActivityGroupIds, other.getSpotlightActivityGroupIds())));
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
        if (getActiveFilter() != null) {
            _hashCode += getActiveFilter().hashCode();
        }
        _hashCode += getActivityType();
        _hashCode += new Long(getAdvertiserId()).hashCode();
        if (getSpotlightActivityGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpotlightActivityGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpotlightActivityGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpotlightActivitySearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SpotlightActivitySearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ActiveFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spotlightActivityGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spotlightActivityGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
