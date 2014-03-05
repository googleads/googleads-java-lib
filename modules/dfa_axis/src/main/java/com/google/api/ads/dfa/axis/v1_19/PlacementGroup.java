/**
 * PlacementGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class PlacementGroup  extends com.google.api.ads.dfa.axis.v1_19.PlacementGroupBase  implements java.io.Serializable {
    private boolean archived;

    private long campaignId;

    private java.lang.String comments;

    private long contentCategoryId;

    private long dfaSiteId;

    private int placementGroupType;

    private long[] placementIds;

    private long placementStrategyId;

    private com.google.api.ads.dfa.axis.v1_19.PricingSchedule pricingSchedule;

    private long primaryPlacementId;

    private long siteId;

    public PlacementGroup() {
    }

    public PlacementGroup(
           long id,
           java.lang.String name,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           long contentCategoryId,
           long dfaSiteId,
           int placementGroupType,
           long[] placementIds,
           long placementStrategyId,
           com.google.api.ads.dfa.axis.v1_19.PricingSchedule pricingSchedule,
           long primaryPlacementId,
           long siteId) {
        super(
            id,
            name);
        this.archived = archived;
        this.campaignId = campaignId;
        this.comments = comments;
        this.contentCategoryId = contentCategoryId;
        this.dfaSiteId = dfaSiteId;
        this.placementGroupType = placementGroupType;
        this.placementIds = placementIds;
        this.placementStrategyId = placementStrategyId;
        this.pricingSchedule = pricingSchedule;
        this.primaryPlacementId = primaryPlacementId;
        this.siteId = siteId;
    }


    /**
     * Gets the archived value for this PlacementGroup.
     * 
     * @return archived
     */
    public boolean isArchived() {
        return archived;
    }


    /**
     * Sets the archived value for this PlacementGroup.
     * 
     * @param archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }


    /**
     * Gets the campaignId value for this PlacementGroup.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this PlacementGroup.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the comments value for this PlacementGroup.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this PlacementGroup.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the contentCategoryId value for this PlacementGroup.
     * 
     * @return contentCategoryId
     */
    public long getContentCategoryId() {
        return contentCategoryId;
    }


    /**
     * Sets the contentCategoryId value for this PlacementGroup.
     * 
     * @param contentCategoryId
     */
    public void setContentCategoryId(long contentCategoryId) {
        this.contentCategoryId = contentCategoryId;
    }


    /**
     * Gets the dfaSiteId value for this PlacementGroup.
     * 
     * @return dfaSiteId
     */
    public long getDfaSiteId() {
        return dfaSiteId;
    }


    /**
     * Sets the dfaSiteId value for this PlacementGroup.
     * 
     * @param dfaSiteId
     */
    public void setDfaSiteId(long dfaSiteId) {
        this.dfaSiteId = dfaSiteId;
    }


    /**
     * Gets the placementGroupType value for this PlacementGroup.
     * 
     * @return placementGroupType
     */
    public int getPlacementGroupType() {
        return placementGroupType;
    }


    /**
     * Sets the placementGroupType value for this PlacementGroup.
     * 
     * @param placementGroupType
     */
    public void setPlacementGroupType(int placementGroupType) {
        this.placementGroupType = placementGroupType;
    }


    /**
     * Gets the placementIds value for this PlacementGroup.
     * 
     * @return placementIds
     */
    public long[] getPlacementIds() {
        return placementIds;
    }


    /**
     * Sets the placementIds value for this PlacementGroup.
     * 
     * @param placementIds
     */
    public void setPlacementIds(long[] placementIds) {
        this.placementIds = placementIds;
    }


    /**
     * Gets the placementStrategyId value for this PlacementGroup.
     * 
     * @return placementStrategyId
     */
    public long getPlacementStrategyId() {
        return placementStrategyId;
    }


    /**
     * Sets the placementStrategyId value for this PlacementGroup.
     * 
     * @param placementStrategyId
     */
    public void setPlacementStrategyId(long placementStrategyId) {
        this.placementStrategyId = placementStrategyId;
    }


    /**
     * Gets the pricingSchedule value for this PlacementGroup.
     * 
     * @return pricingSchedule
     */
    public com.google.api.ads.dfa.axis.v1_19.PricingSchedule getPricingSchedule() {
        return pricingSchedule;
    }


    /**
     * Sets the pricingSchedule value for this PlacementGroup.
     * 
     * @param pricingSchedule
     */
    public void setPricingSchedule(com.google.api.ads.dfa.axis.v1_19.PricingSchedule pricingSchedule) {
        this.pricingSchedule = pricingSchedule;
    }


    /**
     * Gets the primaryPlacementId value for this PlacementGroup.
     * 
     * @return primaryPlacementId
     */
    public long getPrimaryPlacementId() {
        return primaryPlacementId;
    }


    /**
     * Sets the primaryPlacementId value for this PlacementGroup.
     * 
     * @param primaryPlacementId
     */
    public void setPrimaryPlacementId(long primaryPlacementId) {
        this.primaryPlacementId = primaryPlacementId;
    }


    /**
     * Gets the siteId value for this PlacementGroup.
     * 
     * @return siteId
     */
    public long getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this PlacementGroup.
     * 
     * @param siteId
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementGroup)) return false;
        PlacementGroup other = (PlacementGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.archived == other.isArchived() &&
            this.campaignId == other.getCampaignId() &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.contentCategoryId == other.getContentCategoryId() &&
            this.dfaSiteId == other.getDfaSiteId() &&
            this.placementGroupType == other.getPlacementGroupType() &&
            ((this.placementIds==null && other.getPlacementIds()==null) || 
             (this.placementIds!=null &&
              java.util.Arrays.equals(this.placementIds, other.getPlacementIds()))) &&
            this.placementStrategyId == other.getPlacementStrategyId() &&
            ((this.pricingSchedule==null && other.getPricingSchedule()==null) || 
             (this.pricingSchedule!=null &&
              this.pricingSchedule.equals(other.getPricingSchedule()))) &&
            this.primaryPlacementId == other.getPrimaryPlacementId() &&
            this.siteId == other.getSiteId();
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
        _hashCode += (isArchived() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCampaignId()).hashCode();
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += new Long(getContentCategoryId()).hashCode();
        _hashCode += new Long(getDfaSiteId()).hashCode();
        _hashCode += getPlacementGroupType();
        if (getPlacementIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getPlacementStrategyId()).hashCode();
        if (getPricingSchedule() != null) {
            _hashCode += getPricingSchedule().hashCode();
        }
        _hashCode += new Long(getPrimaryPlacementId()).hashCode();
        _hashCode += new Long(getSiteId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfaSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfaSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementStrategyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementStrategyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PricingSchedule"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPlacementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryPlacementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteId"));
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
