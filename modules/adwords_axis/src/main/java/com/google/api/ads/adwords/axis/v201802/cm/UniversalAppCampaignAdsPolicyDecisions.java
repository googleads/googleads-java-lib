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
 * UniversalAppCampaignAdsPolicyDecisions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Contains Universal App Campaign Ads Policy decisions with asset
 * identifier information, where
 *             available.
 */
public class UniversalAppCampaignAdsPolicyDecisions  implements java.io.Serializable {
    /* Used to identify assets that are associated with the Ads Policy
     * decisions. */
    private com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAsset universalAppCampaignAsset;

    /* Unique identifier, which when combined with the UniversalAppCampaignAsset,
     * can be used to
     *                 uniquely identify the exact asset.
     *                 
     *                 <p>For example, in the case of {@link UniversalAppCampaignAsset}.VIDEO
     * - the id could be used
     *                 to identify the individual video. */
    private java.lang.String assetId;

    /* List of policy decisions associated with the asset(s). */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] policyTopicEntries;

    public UniversalAppCampaignAdsPolicyDecisions() {
    }

    public UniversalAppCampaignAdsPolicyDecisions(
           com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAsset universalAppCampaignAsset,
           java.lang.String assetId,
           com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] policyTopicEntries) {
           this.universalAppCampaignAsset = universalAppCampaignAsset;
           this.assetId = assetId;
           this.policyTopicEntries = policyTopicEntries;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("assetId", getAssetId())
            .add("policyTopicEntries", getPolicyTopicEntries())
            .add("universalAppCampaignAsset", getUniversalAppCampaignAsset())
            .toString();
    }

    /**
     * Gets the universalAppCampaignAsset value for this UniversalAppCampaignAdsPolicyDecisions.
     * 
     * @return universalAppCampaignAsset   * Used to identify assets that are associated with the Ads Policy
     * decisions.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAsset getUniversalAppCampaignAsset() {
        return universalAppCampaignAsset;
    }


    /**
     * Sets the universalAppCampaignAsset value for this UniversalAppCampaignAdsPolicyDecisions.
     * 
     * @param universalAppCampaignAsset   * Used to identify assets that are associated with the Ads Policy
     * decisions.
     */
    public void setUniversalAppCampaignAsset(com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAsset universalAppCampaignAsset) {
        this.universalAppCampaignAsset = universalAppCampaignAsset;
    }


    /**
     * Gets the assetId value for this UniversalAppCampaignAdsPolicyDecisions.
     * 
     * @return assetId   * Unique identifier, which when combined with the UniversalAppCampaignAsset,
     * can be used to
     *                 uniquely identify the exact asset.
     *                 
     *                 <p>For example, in the case of {@link UniversalAppCampaignAsset}.VIDEO
     * - the id could be used
     *                 to identify the individual video.
     */
    public java.lang.String getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this UniversalAppCampaignAdsPolicyDecisions.
     * 
     * @param assetId   * Unique identifier, which when combined with the UniversalAppCampaignAsset,
     * can be used to
     *                 uniquely identify the exact asset.
     *                 
     *                 <p>For example, in the case of {@link UniversalAppCampaignAsset}.VIDEO
     * - the id could be used
     *                 to identify the individual video.
     */
    public void setAssetId(java.lang.String assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the policyTopicEntries value for this UniversalAppCampaignAdsPolicyDecisions.
     * 
     * @return policyTopicEntries   * List of policy decisions associated with the asset(s).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] getPolicyTopicEntries() {
        return policyTopicEntries;
    }


    /**
     * Sets the policyTopicEntries value for this UniversalAppCampaignAdsPolicyDecisions.
     * 
     * @param policyTopicEntries   * List of policy decisions associated with the asset(s).
     */
    public void setPolicyTopicEntries(com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] policyTopicEntries) {
        this.policyTopicEntries = policyTopicEntries;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry getPolicyTopicEntries(int i) {
        return this.policyTopicEntries[i];
    }

    public void setPolicyTopicEntries(int i, com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry _value) {
        this.policyTopicEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UniversalAppCampaignAdsPolicyDecisions)) return false;
        UniversalAppCampaignAdsPolicyDecisions other = (UniversalAppCampaignAdsPolicyDecisions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.universalAppCampaignAsset==null && other.getUniversalAppCampaignAsset()==null) || 
             (this.universalAppCampaignAsset!=null &&
              this.universalAppCampaignAsset.equals(other.getUniversalAppCampaignAsset()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.policyTopicEntries==null && other.getPolicyTopicEntries()==null) || 
             (this.policyTopicEntries!=null &&
              java.util.Arrays.equals(this.policyTopicEntries, other.getPolicyTopicEntries())));
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
        if (getUniversalAppCampaignAsset() != null) {
            _hashCode += getUniversalAppCampaignAsset().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getPolicyTopicEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyTopicEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyTopicEntries(), i);
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
        new org.apache.axis.description.TypeDesc(UniversalAppCampaignAdsPolicyDecisions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppCampaignAdsPolicyDecisions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("universalAppCampaignAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "universalAppCampaignAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppCampaignAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEntry"));
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
