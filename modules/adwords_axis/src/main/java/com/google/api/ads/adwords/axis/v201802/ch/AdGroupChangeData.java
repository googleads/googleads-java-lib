// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * AdGroupChangeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.ch;


/**
 * Holds information about a changed adgroup
 */
public class AdGroupChangeData  implements java.io.Serializable {
    /* The ad group ID. */
    private java.lang.Long adGroupId;

    /* Whether or not the fields of this adgroup have changed, for
     * example the AdGroup name. Changes
     *                 to the Ads and Criteria are enumerated in their respective
     * lists and will not be reflected in
     *                 this status. */
    private com.google.api.ads.adwords.axis.v201802.ch.ChangeStatus adGroupChangeStatus;

    /* The IDs of any changed ads of this ad group. This includes
     * ads that have been deleted. */
    private long[] changedAds;

    /* The IDs of any changed criterion of this ad group. */
    private long[] changedCriteria;

    /* The IDs of any deleted criterion of this ad group. */
    private long[] removedCriteria;

    /* A list of feed IDs for AdGroupFeeds that have been changed
     * in this ad group. If an AdGroupFeed
     *                 is deleted after a modification, it will not be included
     * in this list. */
    private long[] changedFeeds;

    /* A list of feed IDs for AdGroupFeeds that have been removed
     * from the ad group. */
    private long[] removedFeeds;

    /* Set of campaign criterion that have a bid modifier override
     * at ad group level. If the
     *                 associated bid modifier override is deleted after
     * a modification, it will not be included in
     *                 this list. */
    private long[] changedAdGroupBidModifierCriteria;

    /* Set of campaign criterion whose bid modifier override at ad
     * group level has been removed. */
    private long[] removedAdGroupBidModifierCriteria;

    public AdGroupChangeData() {
    }

    public AdGroupChangeData(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201802.ch.ChangeStatus adGroupChangeStatus,
           long[] changedAds,
           long[] changedCriteria,
           long[] removedCriteria,
           long[] changedFeeds,
           long[] removedFeeds,
           long[] changedAdGroupBidModifierCriteria,
           long[] removedAdGroupBidModifierCriteria) {
           this.adGroupId = adGroupId;
           this.adGroupChangeStatus = adGroupChangeStatus;
           this.changedAds = changedAds;
           this.changedCriteria = changedCriteria;
           this.removedCriteria = removedCriteria;
           this.changedFeeds = changedFeeds;
           this.removedFeeds = removedFeeds;
           this.changedAdGroupBidModifierCriteria = changedAdGroupBidModifierCriteria;
           this.removedAdGroupBidModifierCriteria = removedAdGroupBidModifierCriteria;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupChangeStatus", getAdGroupChangeStatus())
            .add("adGroupId", getAdGroupId())
            .add("changedAdGroupBidModifierCriteria", getChangedAdGroupBidModifierCriteria())
            .add("changedAds", getChangedAds())
            .add("changedCriteria", getChangedCriteria())
            .add("changedFeeds", getChangedFeeds())
            .add("removedAdGroupBidModifierCriteria", getRemovedAdGroupBidModifierCriteria())
            .add("removedCriteria", getRemovedCriteria())
            .add("removedFeeds", getRemovedFeeds())
            .toString();
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
     * example the AdGroup name. Changes
     *                 to the Ads and Criteria are enumerated in their respective
     * lists and will not be reflected in
     *                 this status.
     */
    public com.google.api.ads.adwords.axis.v201802.ch.ChangeStatus getAdGroupChangeStatus() {
        return adGroupChangeStatus;
    }


    /**
     * Sets the adGroupChangeStatus value for this AdGroupChangeData.
     * 
     * @param adGroupChangeStatus   * Whether or not the fields of this adgroup have changed, for
     * example the AdGroup name. Changes
     *                 to the Ads and Criteria are enumerated in their respective
     * lists and will not be reflected in
     *                 this status.
     */
    public void setAdGroupChangeStatus(com.google.api.ads.adwords.axis.v201802.ch.ChangeStatus adGroupChangeStatus) {
        this.adGroupChangeStatus = adGroupChangeStatus;
    }


    /**
     * Gets the changedAds value for this AdGroupChangeData.
     * 
     * @return changedAds   * The IDs of any changed ads of this ad group. This includes
     * ads that have been deleted.
     */
    public long[] getChangedAds() {
        return changedAds;
    }


    /**
     * Sets the changedAds value for this AdGroupChangeData.
     * 
     * @param changedAds   * The IDs of any changed ads of this ad group. This includes
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
     * Gets the removedCriteria value for this AdGroupChangeData.
     * 
     * @return removedCriteria   * The IDs of any deleted criterion of this ad group.
     */
    public long[] getRemovedCriteria() {
        return removedCriteria;
    }


    /**
     * Sets the removedCriteria value for this AdGroupChangeData.
     * 
     * @param removedCriteria   * The IDs of any deleted criterion of this ad group.
     */
    public void setRemovedCriteria(long[] removedCriteria) {
        this.removedCriteria = removedCriteria;
    }

    public long getRemovedCriteria(int i) {
        return this.removedCriteria[i];
    }

    public void setRemovedCriteria(int i, long _value) {
        this.removedCriteria[i] = _value;
    }


    /**
     * Gets the changedFeeds value for this AdGroupChangeData.
     * 
     * @return changedFeeds   * A list of feed IDs for AdGroupFeeds that have been changed
     * in this ad group. If an AdGroupFeed
     *                 is deleted after a modification, it will not be included
     * in this list.
     */
    public long[] getChangedFeeds() {
        return changedFeeds;
    }


    /**
     * Sets the changedFeeds value for this AdGroupChangeData.
     * 
     * @param changedFeeds   * A list of feed IDs for AdGroupFeeds that have been changed
     * in this ad group. If an AdGroupFeed
     *                 is deleted after a modification, it will not be included
     * in this list.
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
     * Gets the removedFeeds value for this AdGroupChangeData.
     * 
     * @return removedFeeds   * A list of feed IDs for AdGroupFeeds that have been removed
     * from the ad group.
     */
    public long[] getRemovedFeeds() {
        return removedFeeds;
    }


    /**
     * Sets the removedFeeds value for this AdGroupChangeData.
     * 
     * @param removedFeeds   * A list of feed IDs for AdGroupFeeds that have been removed
     * from the ad group.
     */
    public void setRemovedFeeds(long[] removedFeeds) {
        this.removedFeeds = removedFeeds;
    }

    public long getRemovedFeeds(int i) {
        return this.removedFeeds[i];
    }

    public void setRemovedFeeds(int i, long _value) {
        this.removedFeeds[i] = _value;
    }


    /**
     * Gets the changedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @return changedAdGroupBidModifierCriteria   * Set of campaign criterion that have a bid modifier override
     * at ad group level. If the
     *                 associated bid modifier override is deleted after
     * a modification, it will not be included in
     *                 this list.
     */
    public long[] getChangedAdGroupBidModifierCriteria() {
        return changedAdGroupBidModifierCriteria;
    }


    /**
     * Sets the changedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @param changedAdGroupBidModifierCriteria   * Set of campaign criterion that have a bid modifier override
     * at ad group level. If the
     *                 associated bid modifier override is deleted after
     * a modification, it will not be included in
     *                 this list.
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
     * Gets the removedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @return removedAdGroupBidModifierCriteria   * Set of campaign criterion whose bid modifier override at ad
     * group level has been removed.
     */
    public long[] getRemovedAdGroupBidModifierCriteria() {
        return removedAdGroupBidModifierCriteria;
    }


    /**
     * Sets the removedAdGroupBidModifierCriteria value for this AdGroupChangeData.
     * 
     * @param removedAdGroupBidModifierCriteria   * Set of campaign criterion whose bid modifier override at ad
     * group level has been removed.
     */
    public void setRemovedAdGroupBidModifierCriteria(long[] removedAdGroupBidModifierCriteria) {
        this.removedAdGroupBidModifierCriteria = removedAdGroupBidModifierCriteria;
    }

    public long getRemovedAdGroupBidModifierCriteria(int i) {
        return this.removedAdGroupBidModifierCriteria[i];
    }

    public void setRemovedAdGroupBidModifierCriteria(int i, long _value) {
        this.removedAdGroupBidModifierCriteria[i] = _value;
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
            ((this.removedCriteria==null && other.getRemovedCriteria()==null) || 
             (this.removedCriteria!=null &&
              java.util.Arrays.equals(this.removedCriteria, other.getRemovedCriteria()))) &&
            ((this.changedFeeds==null && other.getChangedFeeds()==null) || 
             (this.changedFeeds!=null &&
              java.util.Arrays.equals(this.changedFeeds, other.getChangedFeeds()))) &&
            ((this.removedFeeds==null && other.getRemovedFeeds()==null) || 
             (this.removedFeeds!=null &&
              java.util.Arrays.equals(this.removedFeeds, other.getRemovedFeeds()))) &&
            ((this.changedAdGroupBidModifierCriteria==null && other.getChangedAdGroupBidModifierCriteria()==null) || 
             (this.changedAdGroupBidModifierCriteria!=null &&
              java.util.Arrays.equals(this.changedAdGroupBidModifierCriteria, other.getChangedAdGroupBidModifierCriteria()))) &&
            ((this.removedAdGroupBidModifierCriteria==null && other.getRemovedAdGroupBidModifierCriteria()==null) || 
             (this.removedAdGroupBidModifierCriteria!=null &&
              java.util.Arrays.equals(this.removedAdGroupBidModifierCriteria, other.getRemovedAdGroupBidModifierCriteria())));
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
        if (getRemovedCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedCriteria(), i);
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
        if (getRemovedFeeds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedFeeds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedFeeds(), i);
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
        if (getRemovedAdGroupBidModifierCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedAdGroupBidModifierCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedAdGroupBidModifierCriteria(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "AdGroupChangeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupChangeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "adGroupChangeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "ChangeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedAds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "changedAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "changedCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "removedCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "changedFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "removedFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedAdGroupBidModifierCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "changedAdGroupBidModifierCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedAdGroupBidModifierCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "removedAdGroupBidModifierCriteria"));
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
