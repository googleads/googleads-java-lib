/**
 * AdGroupChangeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.ch;


/**
 * Holds information about a changed adgroup
 */
public class AdGroupChangeData  implements java.io.Serializable {
    /* The ad group ID. */
    private java.lang.Long adGroupId;

    /* Whether or not the fields of this adgroup have changed, for
     * example the AdGroup name.
     *                 Changes to the Ads and Criteria are enumerated in
     * their respective lists and will not
     *                 be reflected in this status. */
    private com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus adGroupChangeStatus;

    /* The IDs of any changed ads of this ad group.  This includes
     * ads that have been deleted. */
    private long[] changedAds;

    /* The IDs of any changed criterion of this ad group. */
    private long[] changedCriteria;

    /* The IDs of any deleted criterion of this ad group. */
    private long[] deletedCriteria;

    /* A list of feed IDs for AdGroupFeeds that have been changed
     * in this ad group.
     *                 If an AdGroupFeed is deleted after a modification,
     * it will not be included
     *                 in this list. */
    private long[] changedFeeds;

    /* A list of feed IDs for AdGroupFeeds that have been removed
     * from the ad
     *                 group. */
    private long[] deletedFeeds;

    /* Set of campaign criterion that have a bid modifier override
     * at ad group level.
     *                 If the associated bid modifier override is deleted
     * after a modification, it will
     *                 not be included in this list. */
    private long[] changedAdGroupBidModifierCriteria;

    /* Set of campaign criterion whose bid modifier override at ad
     * group level
     *                 has been removed. */
    private long[] deletedAdGroupBidModifierCriteria;

    public AdGroupChangeData() {
    }

    public AdGroupChangeData(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus adGroupChangeStatus,
           long[] changedAds,
           long[] changedCriteria,
           long[] deletedCriteria,
           long[] changedFeeds,
           long[] deletedFeeds,
           long[] changedAdGroupBidModifierCriteria,
           long[] deletedAdGroupBidModifierCriteria) {
           this.adGroupId = adGroupId;
           this.adGroupChangeStatus = adGroupChangeStatus;
           this.changedAds = changedAds;
           this.changedCriteria = changedCriteria;
           this.deletedCriteria = deletedCriteria;
           this.changedFeeds = changedFeeds;
           this.deletedFeeds = deletedFeeds;
           this.changedAdGroupBidModifierCriteria = changedAdGroupBidModifierCriteria;
           this.deletedAdGroupBidModifierCriteria = deletedAdGroupBidModifierCriteria;
    }


    /**
     * Gets the adGroupId value for this AdGroupChangeData.
     * 
     * @return adGroupId   * The ad group ID.
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupChangeData.
     * 
     * @param adGroupId   * The ad group ID.
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the adGroupChangeStatus value for this AdGroupChangeData.
     * 
     * @return adGroupChangeStatus   * Whether or not the fields of this adgroup have changed, for
     * example the AdGroup name.
     *                 Changes to the Ads and Criteria are enumerated in
     * their respective lists and will not
     *                 be reflected in this status.
     */
    public com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus getAdGroupChangeStatus() {
        return adGroupChangeStatus;
    }


    /**
     * Sets the adGroupChangeStatus value for this AdGroupChangeData.
     * 
     * @param adGroupChangeStatus   * Whether or not the fields of this adgroup have changed, for
     * example the AdGroup name.
     *                 Changes to the Ads and Criteria are enumerated in
     * their respective lists and will not
     *                 be reflected in this status.
     */
    public void setAdGroupChangeStatus(com.google.api.ads.adwords.axis.v201402.ch.ChangeStatus adGroupChangeStatus) {
        this.adGroupChangeStatus = adGroupChangeStatus;
    }


    /**
     * Gets the changedAds value for this AdGroupChangeData.
     * 
     * @return changedAds   * The IDs of any changed ads of this ad group.  This includes
     * ads that have been deleted.
     */
    public long[] getChangedAds() {
        return changedAds;
    }


    /**
     * Sets the changedAds value for this AdGroupChangeData.
     * 
     * @param changedAds   * The IDs of any changed ads of this ad group.  This includes
     * ads that have been deleted.
     */
    public void setChangedAds(long[] changedAds) {
        this.changedAds = changedAds;
    }

    public long getChangedAds(int i) {
        return this.changedAds[i];
    }

    public void setChangedAds(int i, long _value) {
        this.changedAds[i] = _value;
    }


    /**
     * Gets the changedCriteria value for this AdGroupChangeData.
     * 
     * @return changedCriteria   * The IDs of any changed criterion of this ad group.
     */
    public long[] getChangedCriteria() {
        return changedCriteria;
    }


    /**
     * Sets the changedCriteria value for this AdGroupChangeData.
     * 
     * @param changedCriteria   * The IDs of any changed criterion of this ad group.
     */
    public void setChangedCriteria(long[] changedCriteria) {
        this.changedCriteria = changedCriteria;
    }

    public long getChangedCriteria(int i) {
        return this.changedCriteria[i];
    }

    public void setChangedCriteria(int i, long _value) {
        this.changedCriteria[i] = _value;
    }


    /**
     * Gets the deletedCriteria value for this AdGroupChangeData.
     * 
     * @return deletedCriteria   * The IDs of any deleted criterion of this ad group.
     */
    public long[] getDeletedCriteria() {
        return deletedCriteria;
    }


    /**
     * Sets the deletedCriteria value for this AdGroupChangeData.
     * 
     * @param deletedCriteria   * The IDs of any deleted criterion of this ad group.
     */
    public void setDeletedCriteria(long[] deletedCriteria) {
        this.deletedCriteria = deletedCriteria;
    }

    public long getDeletedCriteria(int i) {
        return this.deletedCriteria[i];
    }

    public void setDeletedCriteria(int i, long _value) {
        this.deletedCriteria[i] = _value;
    }


    /**
     * Gets the changedFeeds value for this AdGroupChangeData.
     * 
     * @return changedFeeds   * A list of feed IDs for AdGroupFeeds that have been changed
     * in this ad group.
     *                 If an AdGroupFeed is deleted after a modification,
     * it will not be included
     *                 in this list.
     */
    public long[] getChangedFeeds() {
        return changedFeeds;
    }


    /**
     * Sets the changedFeeds value for this AdGroupChangeData.
     * 
     * @param changedFeeds   * A list of feed IDs for AdGroupFeeds that have been changed
     * in this ad group.
     *                 If an AdGroupFeed is deleted after a modification,
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
     * Gets the deletedFeeds value for this AdGroupChangeData.
     * 
     * @return deletedFeeds   * A list of feed IDs for AdGroupFeeds that have been removed
     * from the ad
     *                 group.
     */
    public long[] getDeletedFeeds() {
        return deletedFeeds;
    }


    /**
     * Sets the deletedFeeds value for this AdGroupChangeData.
     * 
     * @param deletedFeeds   * A list of feed IDs for AdGroupFeeds that have been removed
     * from the ad
     *                 group.
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
     * Gets the changedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @return changedAdGroupBidModifierCriteria   * Set of campaign criterion that have a bid modifier override
     * at ad group level.
     *                 If the associated bid modifier override is deleted
     * after a modification, it will
     *                 not be included in this list.
     */
    public long[] getChangedAdGroupBidModifierCriteria() {
        return changedAdGroupBidModifierCriteria;
    }


    /**
     * Sets the changedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @param changedAdGroupBidModifierCriteria   * Set of campaign criterion that have a bid modifier override
     * at ad group level.
     *                 If the associated bid modifier override is deleted
     * after a modification, it will
     *                 not be included in this list.
     */
    public void setChangedAdGroupBidModifierCriteria(long[] changedAdGroupBidModifierCriteria) {
        this.changedAdGroupBidModifierCriteria = changedAdGroupBidModifierCriteria;
    }

    public long getChangedAdGroupBidModifierCriteria(int i) {
        return this.changedAdGroupBidModifierCriteria[i];
    }

    public void setChangedAdGroupBidModifierCriteria(int i, long _value) {
        this.changedAdGroupBidModifierCriteria[i] = _value;
    }


    /**
     * Gets the deletedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @return deletedAdGroupBidModifierCriteria   * Set of campaign criterion whose bid modifier override at ad
     * group level
     *                 has been removed.
     */
    public long[] getDeletedAdGroupBidModifierCriteria() {
        return deletedAdGroupBidModifierCriteria;
    }


    /**
     * Sets the deletedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @param deletedAdGroupBidModifierCriteria   * Set of campaign criterion whose bid modifier override at ad
     * group level
     *                 has been removed.
     */
    public void setDeletedAdGroupBidModifierCriteria(long[] deletedAdGroupBidModifierCriteria) {
        this.deletedAdGroupBidModifierCriteria = deletedAdGroupBidModifierCriteria;
    }

    public long getDeletedAdGroupBidModifierCriteria(int i) {
        return this.deletedAdGroupBidModifierCriteria[i];
    }

    public void setDeletedAdGroupBidModifierCriteria(int i, long _value) {
        this.deletedAdGroupBidModifierCriteria[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupChangeData)) return false;
        AdGroupChangeData other = (AdGroupChangeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.adGroupChangeStatus==null && other.getAdGroupChangeStatus()==null) || 
             (this.adGroupChangeStatus!=null &&
              this.adGroupChangeStatus.equals(other.getAdGroupChangeStatus()))) &&
            ((this.changedAds==null && other.getChangedAds()==null) || 
             (this.changedAds!=null &&
              java.util.Arrays.equals(this.changedAds, other.getChangedAds()))) &&
            ((this.changedCriteria==null && other.getChangedCriteria()==null) || 
             (this.changedCriteria!=null &&
              java.util.Arrays.equals(this.changedCriteria, other.getChangedCriteria()))) &&
            ((this.deletedCriteria==null && other.getDeletedCriteria()==null) || 
             (this.deletedCriteria!=null &&
              java.util.Arrays.equals(this.deletedCriteria, other.getDeletedCriteria()))) &&
            ((this.changedFeeds==null && other.getChangedFeeds()==null) || 
             (this.changedFeeds!=null &&
              java.util.Arrays.equals(this.changedFeeds, other.getChangedFeeds()))) &&
            ((this.deletedFeeds==null && other.getDeletedFeeds()==null) || 
             (this.deletedFeeds!=null &&
              java.util.Arrays.equals(this.deletedFeeds, other.getDeletedFeeds()))) &&
            ((this.changedAdGroupBidModifierCriteria==null && other.getChangedAdGroupBidModifierCriteria()==null) || 
             (this.changedAdGroupBidModifierCriteria!=null &&
              java.util.Arrays.equals(this.changedAdGroupBidModifierCriteria, other.getChangedAdGroupBidModifierCriteria()))) &&
            ((this.deletedAdGroupBidModifierCriteria==null && other.getDeletedAdGroupBidModifierCriteria()==null) || 
             (this.deletedAdGroupBidModifierCriteria!=null &&
              java.util.Arrays.equals(this.deletedAdGroupBidModifierCriteria, other.getDeletedAdGroupBidModifierCriteria())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getAdGroupChangeStatus() != null) {
            _hashCode += getAdGroupChangeStatus().hashCode();
        }
        if (getChangedAds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedAds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedAds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangedCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeletedCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedCriteria(), i);
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
        if (getChangedAdGroupBidModifierCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedAdGroupBidModifierCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedAdGroupBidModifierCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeletedAdGroupBidModifierCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedAdGroupBidModifierCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedAdGroupBidModifierCriteria(), i);
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
        new org.apache.axis.description.TypeDesc(AdGroupChangeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "AdGroupChangeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupChangeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "adGroupChangeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "ChangeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedAds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "changedAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "changedCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "deletedCriteria"));
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
        elemField.setFieldName("changedAdGroupBidModifierCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "changedAdGroupBidModifierCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedAdGroupBidModifierCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201402", "deletedAdGroupBidModifierCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
