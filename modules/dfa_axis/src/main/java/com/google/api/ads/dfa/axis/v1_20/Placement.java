/**
 * Placement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class Placement  extends com.google.api.ads.dfa.axis.v1_20.PlacementBase  implements java.io.Serializable {
    private boolean archived;

    private long campaignId;

    private java.lang.String comments;

    private long contentCategoryId;

    private long dfaSiteId;

    private java.lang.String keyname;

    private com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow;

    private boolean paymentAccepted;

    private long placementGroupId;

    private long placementStrategyId;

    private int placementType;

    private com.google.api.ads.dfa.axis.v1_20.PricingSchedule pricingSchedule;

    private long siteId;

    private long sizeId;

    private long spotlightActivityId;

    private com.google.api.ads.dfa.axis.v1_20.TagSettings tagSettings;

    public Placement() {
    }

    public Placement(
           long id,
           java.lang.String name,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           long contentCategoryId,
           long dfaSiteId,
           java.lang.String keyname,
           com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow,
           boolean paymentAccepted,
           long placementGroupId,
           long placementStrategyId,
           int placementType,
           com.google.api.ads.dfa.axis.v1_20.PricingSchedule pricingSchedule,
           long siteId,
           long sizeId,
           long spotlightActivityId,
           com.google.api.ads.dfa.axis.v1_20.TagSettings tagSettings) {
        super(
            id,
            name);
        this.archived = archived;
        this.campaignId = campaignId;
        this.comments = comments;
        this.contentCategoryId = contentCategoryId;
        this.dfaSiteId = dfaSiteId;
        this.keyname = keyname;
        this.lookbackWindow = lookbackWindow;
        this.paymentAccepted = paymentAccepted;
        this.placementGroupId = placementGroupId;
        this.placementStrategyId = placementStrategyId;
        this.placementType = placementType;
        this.pricingSchedule = pricingSchedule;
        this.siteId = siteId;
        this.sizeId = sizeId;
        this.spotlightActivityId = spotlightActivityId;
        this.tagSettings = tagSettings;
    }


    /**
     * Gets the archived value for this Placement.
     * 
     * @return archived
     */
    public boolean isArchived() {
        return archived;
    }


    /**
     * Sets the archived value for this Placement.
     * 
     * @param archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }


    /**
     * Gets the campaignId value for this Placement.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this Placement.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the comments value for this Placement.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Placement.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the contentCategoryId value for this Placement.
     * 
     * @return contentCategoryId
     */
    public long getContentCategoryId() {
        return contentCategoryId;
    }


    /**
     * Sets the contentCategoryId value for this Placement.
     * 
     * @param contentCategoryId
     */
    public void setContentCategoryId(long contentCategoryId) {
        this.contentCategoryId = contentCategoryId;
    }


    /**
     * Gets the dfaSiteId value for this Placement.
     * 
     * @return dfaSiteId
     */
    public long getDfaSiteId() {
        return dfaSiteId;
    }


    /**
     * Sets the dfaSiteId value for this Placement.
     * 
     * @param dfaSiteId
     */
    public void setDfaSiteId(long dfaSiteId) {
        this.dfaSiteId = dfaSiteId;
    }


    /**
     * Gets the keyname value for this Placement.
     * 
     * @return keyname
     */
    public java.lang.String getKeyname() {
        return keyname;
    }


    /**
     * Sets the keyname value for this Placement.
     * 
     * @param keyname
     */
    public void setKeyname(java.lang.String keyname) {
        this.keyname = keyname;
    }


    /**
     * Gets the lookbackWindow value for this Placement.
     * 
     * @return lookbackWindow
     */
    public com.google.api.ads.dfa.axis.v1_20.LookbackWindow getLookbackWindow() {
        return lookbackWindow;
    }


    /**
     * Sets the lookbackWindow value for this Placement.
     * 
     * @param lookbackWindow
     */
    public void setLookbackWindow(com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
    }


    /**
     * Gets the paymentAccepted value for this Placement.
     * 
     * @return paymentAccepted
     */
    public boolean isPaymentAccepted() {
        return paymentAccepted;
    }


    /**
     * Sets the paymentAccepted value for this Placement.
     * 
     * @param paymentAccepted
     */
    public void setPaymentAccepted(boolean paymentAccepted) {
        this.paymentAccepted = paymentAccepted;
    }


    /**
     * Gets the placementGroupId value for this Placement.
     * 
     * @return placementGroupId
     */
    public long getPlacementGroupId() {
        return placementGroupId;
    }


    /**
     * Sets the placementGroupId value for this Placement.
     * 
     * @param placementGroupId
     */
    public void setPlacementGroupId(long placementGroupId) {
        this.placementGroupId = placementGroupId;
    }


    /**
     * Gets the placementStrategyId value for this Placement.
     * 
     * @return placementStrategyId
     */
    public long getPlacementStrategyId() {
        return placementStrategyId;
    }


    /**
     * Sets the placementStrategyId value for this Placement.
     * 
     * @param placementStrategyId
     */
    public void setPlacementStrategyId(long placementStrategyId) {
        this.placementStrategyId = placementStrategyId;
    }


    /**
     * Gets the placementType value for this Placement.
     * 
     * @return placementType
     */
    public int getPlacementType() {
        return placementType;
    }


    /**
     * Sets the placementType value for this Placement.
     * 
     * @param placementType
     */
    public void setPlacementType(int placementType) {
        this.placementType = placementType;
    }


    /**
     * Gets the pricingSchedule value for this Placement.
     * 
     * @return pricingSchedule
     */
    public com.google.api.ads.dfa.axis.v1_20.PricingSchedule getPricingSchedule() {
        return pricingSchedule;
    }


    /**
     * Sets the pricingSchedule value for this Placement.
     * 
     * @param pricingSchedule
     */
    public void setPricingSchedule(com.google.api.ads.dfa.axis.v1_20.PricingSchedule pricingSchedule) {
        this.pricingSchedule = pricingSchedule;
    }


    /**
     * Gets the siteId value for this Placement.
     * 
     * @return siteId
     */
    public long getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Placement.
     * 
     * @param siteId
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the sizeId value for this Placement.
     * 
     * @return sizeId
     */
    public long getSizeId() {
        return sizeId;
    }


    /**
     * Sets the sizeId value for this Placement.
     * 
     * @param sizeId
     */
    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }


    /**
     * Gets the spotlightActivityId value for this Placement.
     * 
     * @return spotlightActivityId
     */
    public long getSpotlightActivityId() {
        return spotlightActivityId;
    }


    /**
     * Sets the spotlightActivityId value for this Placement.
     * 
     * @param spotlightActivityId
     */
    public void setSpotlightActivityId(long spotlightActivityId) {
        this.spotlightActivityId = spotlightActivityId;
    }


    /**
     * Gets the tagSettings value for this Placement.
     * 
     * @return tagSettings
     */
    public com.google.api.ads.dfa.axis.v1_20.TagSettings getTagSettings() {
        return tagSettings;
    }


    /**
     * Sets the tagSettings value for this Placement.
     * 
     * @param tagSettings
     */
    public void setTagSettings(com.google.api.ads.dfa.axis.v1_20.TagSettings tagSettings) {
        this.tagSettings = tagSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Placement)) return false;
        Placement other = (Placement) obj;
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
            ((this.keyname==null && other.getKeyname()==null) || 
             (this.keyname!=null &&
              this.keyname.equals(other.getKeyname()))) &&
            ((this.lookbackWindow==null && other.getLookbackWindow()==null) || 
             (this.lookbackWindow!=null &&
              this.lookbackWindow.equals(other.getLookbackWindow()))) &&
            this.paymentAccepted == other.isPaymentAccepted() &&
            this.placementGroupId == other.getPlacementGroupId() &&
            this.placementStrategyId == other.getPlacementStrategyId() &&
            this.placementType == other.getPlacementType() &&
            ((this.pricingSchedule==null && other.getPricingSchedule()==null) || 
             (this.pricingSchedule!=null &&
              this.pricingSchedule.equals(other.getPricingSchedule()))) &&
            this.siteId == other.getSiteId() &&
            this.sizeId == other.getSizeId() &&
            this.spotlightActivityId == other.getSpotlightActivityId() &&
            ((this.tagSettings==null && other.getTagSettings()==null) || 
             (this.tagSettings!=null &&
              this.tagSettings.equals(other.getTagSettings())));
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
        if (getKeyname() != null) {
            _hashCode += getKeyname().hashCode();
        }
        if (getLookbackWindow() != null) {
            _hashCode += getLookbackWindow().hashCode();
        }
        _hashCode += (isPaymentAccepted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getPlacementGroupId()).hashCode();
        _hashCode += new Long(getPlacementStrategyId()).hashCode();
        _hashCode += getPlacementType();
        if (getPricingSchedule() != null) {
            _hashCode += getPricingSchedule().hashCode();
        }
        _hashCode += new Long(getSiteId()).hashCode();
        _hashCode += new Long(getSizeId()).hashCode();
        _hashCode += new Long(getSpotlightActivityId()).hashCode();
        if (getTagSettings() != null) {
            _hashCode += getTagSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Placement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Placement"));
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
        elemField.setFieldName("keyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "LookbackWindow"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAccepted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentAccepted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementStrategyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementStrategyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PricingSchedule"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spotlightActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spotlightActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TagSettings"));
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
