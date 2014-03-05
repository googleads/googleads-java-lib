/**
 * CreativeSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.ActiveFilter activeStatus;

    private long advertiserId;

    private long archiveStatusFilter;

    private long campaignId;

    private com.google.api.ads.dfa.axis.v1_20.DateInterval creativeCreationDateRange;

    private long[] renderingIds;

    private boolean studioCreative;

    public CreativeSearchCriteria() {
    }

    public CreativeSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           com.google.api.ads.dfa.axis.v1_20.ActiveFilter activeStatus,
           long advertiserId,
           long archiveStatusFilter,
           long campaignId,
           com.google.api.ads.dfa.axis.v1_20.DateInterval creativeCreationDateRange,
           long[] renderingIds,
           boolean studioCreative) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.activeStatus = activeStatus;
        this.advertiserId = advertiserId;
        this.archiveStatusFilter = archiveStatusFilter;
        this.campaignId = campaignId;
        this.creativeCreationDateRange = creativeCreationDateRange;
        this.renderingIds = renderingIds;
        this.studioCreative = studioCreative;
    }


    /**
     * Gets the activeStatus value for this CreativeSearchCriteria.
     * 
     * @return activeStatus
     */
    public com.google.api.ads.dfa.axis.v1_20.ActiveFilter getActiveStatus() {
        return activeStatus;
    }


    /**
     * Sets the activeStatus value for this CreativeSearchCriteria.
     * 
     * @param activeStatus
     */
    public void setActiveStatus(com.google.api.ads.dfa.axis.v1_20.ActiveFilter activeStatus) {
        this.activeStatus = activeStatus;
    }


    /**
     * Gets the advertiserId value for this CreativeSearchCriteria.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this CreativeSearchCriteria.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the archiveStatusFilter value for this CreativeSearchCriteria.
     * 
     * @return archiveStatusFilter
     */
    public long getArchiveStatusFilter() {
        return archiveStatusFilter;
    }


    /**
     * Sets the archiveStatusFilter value for this CreativeSearchCriteria.
     * 
     * @param archiveStatusFilter
     */
    public void setArchiveStatusFilter(long archiveStatusFilter) {
        this.archiveStatusFilter = archiveStatusFilter;
    }


    /**
     * Gets the campaignId value for this CreativeSearchCriteria.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CreativeSearchCriteria.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the creativeCreationDateRange value for this CreativeSearchCriteria.
     * 
     * @return creativeCreationDateRange
     */
    public com.google.api.ads.dfa.axis.v1_20.DateInterval getCreativeCreationDateRange() {
        return creativeCreationDateRange;
    }


    /**
     * Sets the creativeCreationDateRange value for this CreativeSearchCriteria.
     * 
     * @param creativeCreationDateRange
     */
    public void setCreativeCreationDateRange(com.google.api.ads.dfa.axis.v1_20.DateInterval creativeCreationDateRange) {
        this.creativeCreationDateRange = creativeCreationDateRange;
    }


    /**
     * Gets the renderingIds value for this CreativeSearchCriteria.
     * 
     * @return renderingIds
     */
    public long[] getRenderingIds() {
        return renderingIds;
    }


    /**
     * Sets the renderingIds value for this CreativeSearchCriteria.
     * 
     * @param renderingIds
     */
    public void setRenderingIds(long[] renderingIds) {
        this.renderingIds = renderingIds;
    }


    /**
     * Gets the studioCreative value for this CreativeSearchCriteria.
     * 
     * @return studioCreative
     */
    public boolean isStudioCreative() {
        return studioCreative;
    }


    /**
     * Sets the studioCreative value for this CreativeSearchCriteria.
     * 
     * @param studioCreative
     */
    public void setStudioCreative(boolean studioCreative) {
        this.studioCreative = studioCreative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeSearchCriteria)) return false;
        CreativeSearchCriteria other = (CreativeSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activeStatus==null && other.getActiveStatus()==null) || 
             (this.activeStatus!=null &&
              this.activeStatus.equals(other.getActiveStatus()))) &&
            this.advertiserId == other.getAdvertiserId() &&
            this.archiveStatusFilter == other.getArchiveStatusFilter() &&
            this.campaignId == other.getCampaignId() &&
            ((this.creativeCreationDateRange==null && other.getCreativeCreationDateRange()==null) || 
             (this.creativeCreationDateRange!=null &&
              this.creativeCreationDateRange.equals(other.getCreativeCreationDateRange()))) &&
            ((this.renderingIds==null && other.getRenderingIds()==null) || 
             (this.renderingIds!=null &&
              java.util.Arrays.equals(this.renderingIds, other.getRenderingIds()))) &&
            this.studioCreative == other.isStudioCreative();
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
        if (getActiveStatus() != null) {
            _hashCode += getActiveStatus().hashCode();
        }
        _hashCode += new Long(getAdvertiserId()).hashCode();
        _hashCode += new Long(getArchiveStatusFilter()).hashCode();
        _hashCode += new Long(getCampaignId()).hashCode();
        if (getCreativeCreationDateRange() != null) {
            _hashCode += getCreativeCreationDateRange().hashCode();
        }
        if (getRenderingIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRenderingIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRenderingIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isStudioCreative() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ActiveFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveStatusFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveStatusFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeCreationDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeCreationDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DateInterval"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "renderingIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studioCreative");
        elemField.setXmlName(new javax.xml.namespace.QName("", "studioCreative"));
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
