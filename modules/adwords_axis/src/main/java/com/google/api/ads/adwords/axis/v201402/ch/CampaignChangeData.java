/**
 * CampaignChangeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.ch;


/**
 * Holds information about a changed campaign and any ad groups under
 * that have changed.
 */
public class CampaignChangeData  implements java.io.Serializable {
    /* The campaign ID. */
    private java.lang.Long campaignId;

    /* Whether or not the fields of this campaign have changed.  Changes
     * to
     *                 campaign level criteria and ad extensions are enumerated
     * in their
     *                 respective lists and will not be reflected in this
     * status. */
    private com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus campaignChangeStatus;

    /* A list of change information for all changed adgroups belonging
     * to the campaign. */
    private com.google.api.ads.adwords.axis.v201402.ch.AdGroupChangeData[] changedAdGroups;

    /* A list of criteria IDs that have been added as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService. */
    private long[] addedCampaignCriteria;

    /* A list of criteria IDs that have been deleted as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService. */
    private long[] deletedCampaignCriteria;

    /* A list of ad extension IDs that have been added to the campaign. */
    private long[] addedAdExtensions;

    /* A list of ad extension IDs that have been removed from the
     * campaign. */
    private long[] deletedAdExtensions;

    /* A list of feed IDs for CampaignFeeds that have been changed
     * in this campaign.
     *                 If a CampaignFeed is deleted after a modification,
     * it will not be included
     *                 in this list. */
    private long[] changedFeeds;

    /* A list of feed IDs for CampaignFeeds that have been removed
     * from the
     *                 campaign. */
    private long[] deletedFeeds;

    /* Whether there have been campaign targeting changes. */
    private java.lang.Boolean campaignTargetingChanged;

    public CampaignChangeData() {
    }

    public CampaignChangeData(
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus campaignChangeStatus,
           com.google.api.ads.adwords.axis.v201402.ch.AdGroupChangeData[] changedAdGroups,
           long[] addedCampaignCriteria,
           long[] deletedCampaignCriteria,
           long[] addedAdExtensions,
           long[] deletedAdExtensions,
           long[] changedFeeds,
           long[] deletedFeeds,
           java.lang.Boolean campaignTargetingChanged) {
           this.campaignId = campaignId;
           this.campaignChangeStatus = campaignChangeStatus;
           this.changedAdGroups = changedAdGroups;
           this.addedCampaignCriteria = addedCampaignCriteria;
           this.deletedCampaignCriteria = deletedCampaignCriteria;
           this.addedAdExtensions = addedAdExtensions;
           this.deletedAdExtensions = deletedAdExtensions;
           this.changedFeeds = changedFeeds;
           this.deletedFeeds = deletedFeeds;
           this.campaignTargetingChanged = campaignTargetingChanged;
    }


    /**
     * Gets the campaignId value for this CampaignChangeData.
     * 
     * @return campaignId   * The campaign ID.
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignChangeData.
     * 
     * @param campaignId   * The campaign ID.
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaignChangeStatus value for this CampaignChangeData.
     * 
     * @return campaignChangeStatus   * Whether or not the fields of this campaign have changed.  Changes
     * to
     *                 campaign level criteria and ad extensions are enumerated
     * in their
     *                 respective lists and will not be reflected in this
     * status.
     */
    public com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus getCampaignChangeStatus() {
        return campaignChangeStatus;
    }


    /**
     * Sets the campaignChangeStatus value for this CampaignChangeData.
     * 
     * @param campaignChangeStatus   * Whether or not the fields of this campaign have changed.  Changes
     * to
     *                 campaign level criteria and ad extensions are enumerated
     * in their
     *                 respective lists and will not be reflected in this
     * status.
     */
    public void setCampaignChangeStatus(com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus campaignChangeStatus) {
        this.campaignChangeStatus = campaignChangeStatus;
    }


    /**
     * Gets the changedAdGroups value for this CampaignChangeData.
     * 
     * @return changedAdGroups   * A list of change information for all changed adgroups belonging
     * to the campaign.
     */
    public com.google.api.ads.adwords.axis.v201402.ch.AdGroupChangeData[] getChangedAdGroups() {
        return changedAdGroups;
    }


    /**
     * Sets the changedAdGroups value for this CampaignChangeData.
     * 
     * @param changedAdGroups   * A list of change information for all changed adgroups belonging
     * to the campaign.
     */
    public void setChangedAdGroups(com.google.api.ads.adwords.axis.v201402.ch.AdGroupChangeData[] changedAdGroups) {
        this.changedAdGroups = changedAdGroups;
    }

    public com.google.api.ads.adwords.axis.v201402.ch.AdGroupChangeData getChangedAdGroups(int i) {
        return this.changedAdGroups[i];
    }

    public void setChangedAdGroups(int i, com.google.api.ads.adwords.axis.v201402.ch.AdGroupChangeData _value) {
        this.changedAdGroups[i] = _value;
    }


    /**
     * Gets the addedCampaignCriteria value for this CampaignChangeData.
     * 
     * @return addedCampaignCriteria   * A list of criteria IDs that have been added as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public long[] getAddedCampaignCriteria() {
        return addedCampaignCriteria;
    }


    /**
     * Sets the addedCampaignCriteria value for this CampaignChangeData.
     * 
     * @param addedCampaignCriteria   * A list of criteria IDs that have been added as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public void setAddedCampaignCriteria(long[] addedCampaignCriteria) {
        this.addedCampaignCriteria = addedCampaignCriteria;
    }

    public long getAddedCampaignCriteria(int i) {
        return this.addedCampaignCriteria[i];
    }

    public void setAddedCampaignCriteria(int i, long _value) {
        this.addedCampaignCriteria[i] = _value;
    }


    /**
     * Gets the deletedCampaignCriteria value for this CampaignChangeData.
     * 
     * @return deletedCampaignCriteria   * A list of criteria IDs that have been deleted as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public long[] getDeletedCampaignCriteria() {
        return deletedCampaignCriteria;
    }


    /**
     * Sets the deletedCampaignCriteria value for this CampaignChangeData.
     * 
     * @param deletedCampaignCriteria   * A list of criteria IDs that have been deleted as campaign criteria.
     * This
     *                 list includes any criteria that can be downloaded
     * using
     *                 CampaignCriterionService.
     */
    public void setDeletedCampaignCriteria(long[] deletedCampaignCriteria) {
        this.deletedCampaignCriteria = deletedCampaignCriteria;
    }

    public long getDeletedCampaignCriteria(int i) {
        return this.deletedCampaignCriteria[i];
    }

    public void setDeletedCampaignCriteria(int i, long _value) {
        this.deletedCampaignCriteria[i] = _value;
    }


    /**
     * Gets the addedAdExtensions value for this CampaignChangeData.
     * 
     * @return addedAdExtensions   * A list of ad extension IDs that have been added to the campaign.
     */
    public long[] getAddedAdExtensions() {
        return addedAdExtensions;
    }


    /**
     * Sets the addedAdExtensions value for this CampaignChangeData.
     * 
     * @param addedAdExtensions   * A list of ad extension IDs that have been added to the campaign.
     */
    public void setAddedAdExtensions(long[] addedAdExtensions) {
        this.addedAdExtensions = addedAdExtensions;
    }

    public long getAddedAdExtensions(int i) {
        return this.addedAdExtensions[i];
    }

    public void setAddedAdExtensions(int i, long _value) {
        this.addedAdExtensions[i] = _value;
    }


    /**
     * Gets the deletedAdExtensions value for this CampaignChangeData.
     * 
     * @return deletedAdExtensions   * A list of ad extension IDs that have been removed from the
     * campaign.
     */
    public long[] getDeletedAdExtensions() {
        return deletedAdExtensions;
    }


    /**
     * Sets the deletedAdExtensions value for this CampaignChangeData.
     * 
     * @param deletedAdExtensions   * A list of ad extension IDs that have been removed from the
     * campaign.
     */
    public void setDeletedAdExtensions(long[] deletedAdExtensions) {
        this.deletedAdExtensions = deletedAdExtensions;
    }

    public long getDeletedAdExtensions(int i) {
        return this.deletedAdExtensions[i];
    }

    public void setDeletedAdExtensions(int i, long _value) {
        this.deletedAdExtensions[i] = _value;
    }


    /**
     * Gets the changedFeeds value for this CampaignChangeData.
     * 
     * @return changedFeeds   * A list of feed IDs for CampaignFeeds that have been changed
     * in this campaign.
     *                 If a CampaignFeed is deleted after a modification,
     * it will not be included
     *                 in this list.
     */
    public long[] getChangedFeeds() {
        return changedFeeds;
    }


    /**
     * Sets the changedFeeds value for this CampaignChangeData.
     * 
     * @param changedFeeds   * A list of feed IDs for CampaignFeeds that have been changed
     * in this campaign.
     *                 If a CampaignFeed is deleted after a modification,
     * it will not be included
     *                 in this list.
     */
    public void setChangedFeeds(long[] changedFeeds) {
        this.changedFeeds = changedFeeds;
    }

    public long getChangedFeeds(int i) {
        return this.changedFeeds[i];
    }

    public void setChangedFeeds(int i, long _value) {
        this.changedFeeds[i] = _value;
    }


    /**
     * Gets the deletedFeeds value for this CampaignChangeData.
     * 
     * @return deletedFeeds   * A list of feed IDs for CampaignFeeds that have been removed
     * from the
     *                 campaign.
     */
    public long[] getDeletedFeeds() {
        return deletedFeeds;
    }


    /**
     * Sets the deletedFeeds value for this CampaignChangeData.
     * 
     * @param deletedFeeds   * A list of feed IDs for CampaignFeeds that have been removed
     * from the
     *                 campaign.
     */
    public void setDeletedFeeds(long[] deletedFeeds) {
        this.deletedFeeds = deletedFeeds;
    }

    public long getDeletedFeeds(int i) {
        return this.deletedFeeds[i];
    }

    public void setDeletedFeeds(int i, long _value) {
        this.deletedFeeds[i] = _value;
    }


    /**
     * Gets the campaignTargetingChanged value for this CampaignChangeData.
     * 
     * @return campaignTargetingChanged   * Whether there have been campaign targeting changes.
     */
    public java.lang.Boolean getCampaignTargetingChanged() {
        return campaignTargetingChanged;
    }


    /**
     * Sets the campaignTargetingChanged value for this CampaignChangeData.
     * 
     * @param campaignTargetingChanged   * Whether there have been campaign targeting changes.
     */
    public void setCampaignTargetingChanged(java.lang.Boolean campaignTargetingChanged) {
        this.campaignTargetingChanged = campaignTargetingChanged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignChangeData)) return false;
        CampaignChangeData other = (CampaignChangeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignChangeStatus==null && other.getCampaignChangeStatus()==null) || 
             (this.campaignChangeStatus!=null &&
              this.campaignChangeStatus.equals(other.getCampaignChangeStatus()))) &&
            ((this.changedAdGroups==null && other.getChangedAdGroups()==null) || 
             (this.changedAdGroups!=null &&
              java.util.Arrays.equals(this.changedAdGroups, other.getChangedAdGroups()))) &&
            ((this.addedCampaignCriteria==null && other.getAddedCampaignCriteria()==null) || 
             (this.addedCampaignCriteria!=null &&
              java.util.Arrays.equals(this.addedCampaignCriteria, other.getAddedCampaignCriteria()))) &&
            ((this.deletedCampaignCriteria==null && other.getDeletedCampaignCriteria()==null) || 
             (this.deletedCampaignCriteria!=null &&
              java.util.Arrays.equals(this.deletedCampaignCriteria, other.getDeletedCampaignCriteria()))) &&
            ((this.addedAdExtensions==null && other.getAddedAdExtensions()==null) || 
             (this.addedAdExtensions!=null &&
              java.util.Arrays.equals(this.addedAdExtensions, other.getAddedAdExtensions()))) &&
            ((this.deletedAdExtensions==null && other.getDeletedAdExtensions()==null) || 
             (this.deletedAdExtensions!=null &&
              java.util.Arrays.equals(this.deletedAdExtensions, other.getDeletedAdExtensions()))) &&
            ((this.changedFeeds==null && other.getChangedFeeds()==null) || 
             (this.changedFeeds!=null &&
              java.util.Arrays.equals(this.changedFeeds, other.getChangedFeeds()))) &&
            ((this.deletedFeeds==null && other.getDeletedFeeds()==null) || 
             (this.deletedFeeds!=null &&
              java.util.Arrays.equals(this.deletedFeeds, other.getDeletedFeeds()))) &&
            ((this.campaignTargetingChanged==null && other.getCampaignTargetingChanged()==null) || 
             (this.campaignTargetingChanged!=null &&
              this.campaignTargetingChanged.equals(other.getCampaignTargetingChanged())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaignChangeStatus() != null) {
            _hashCode += getCampaignChangeStatus().hashCode();
        }
        if (getChangedAdGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedAdGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedAdGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddedCampaignCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddedCampaignCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddedCampaignCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeletedCampaignCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedCampaignCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedCampaignCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddedAdExtensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddedAdExtensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddedAdExtensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeletedAdExtensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedAdExtensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedAdExtensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangedFeeds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedFeeds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedFeeds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeletedFeeds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedFeeds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedFeeds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignTargetingChanged() != null) {
            _hashCode += getCampaignTargetingChanged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignChangeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "CampaignChangeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignChangeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "campaignChangeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "ChangeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedAdGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "changedAdGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "AdGroupChangeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedCampaignCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "addedCampaignCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedCampaignCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "deletedCampaignCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedAdExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "addedAdExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedAdExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "deletedAdExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "changedFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "deletedFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignTargetingChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "campaignTargetingChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
