// Copyright 2018 Google LLC
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
 * AssetLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents an asset link. This class contains an asset and information
 * that is specific to an
 *             asset-entity link (e.g. policy information).
 */
public class AssetLink  implements java.io.Serializable {
    /* Asset contained in this AssetLink.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.Asset asset;

    /* The pinned field of the Asset.
     *                 This restricts the Asset to only serve within this
     * field.
     *                 Multiple Assets can be pinned to the same field.
     *                 An Asset that is unpinned or pinned to a different
     * field will not serve in a field that has
     *                 at least one asset pinned to it.
     *                 This field is optional. */
    private com.google.api.ads.adwords.axis.v201809.cm.ServedAssetFieldType pinnedField;

    /* Approval information contained in this AssetLink.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetPolicySummaryInfo assetPolicySummaryInfo;

    /* Performance label for the asset.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetPerformanceLabel assetPerformanceLabel;

    public AssetLink() {
    }

    public AssetLink(
           com.google.api.ads.adwords.axis.v201809.cm.Asset asset,
           com.google.api.ads.adwords.axis.v201809.cm.ServedAssetFieldType pinnedField,
           com.google.api.ads.adwords.axis.v201809.cm.AssetPolicySummaryInfo assetPolicySummaryInfo,
           com.google.api.ads.adwords.axis.v201809.cm.AssetPerformanceLabel assetPerformanceLabel) {
           this.asset = asset;
           this.pinnedField = pinnedField;
           this.assetPolicySummaryInfo = assetPolicySummaryInfo;
           this.assetPerformanceLabel = assetPerformanceLabel;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("asset", getAsset())
            .add("assetPerformanceLabel", getAssetPerformanceLabel())
            .add("assetPolicySummaryInfo", getAssetPolicySummaryInfo())
            .add("pinnedField", getPinnedField())
            .toString();
    }

    /**
     * Gets the asset value for this AssetLink.
     * 
     * @return asset   * Asset contained in this AssetLink.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.Asset getAsset() {
        return asset;
    }


    /**
     * Sets the asset value for this AssetLink.
     * 
     * @param asset   * Asset contained in this AssetLink.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAsset(com.google.api.ads.adwords.axis.v201809.cm.Asset asset) {
        this.asset = asset;
    }


    /**
     * Gets the pinnedField value for this AssetLink.
     * 
     * @return pinnedField   * The pinned field of the Asset.
     *                 This restricts the Asset to only serve within this
     * field.
     *                 Multiple Assets can be pinned to the same field.
     *                 An Asset that is unpinned or pinned to a different
     * field will not serve in a field that has
     *                 at least one asset pinned to it.
     *                 This field is optional.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.ServedAssetFieldType getPinnedField() {
        return pinnedField;
    }


    /**
     * Sets the pinnedField value for this AssetLink.
     * 
     * @param pinnedField   * The pinned field of the Asset.
     *                 This restricts the Asset to only serve within this
     * field.
     *                 Multiple Assets can be pinned to the same field.
     *                 An Asset that is unpinned or pinned to a different
     * field will not serve in a field that has
     *                 at least one asset pinned to it.
     *                 This field is optional.
     */
    public void setPinnedField(com.google.api.ads.adwords.axis.v201809.cm.ServedAssetFieldType pinnedField) {
        this.pinnedField = pinnedField;
    }


    /**
     * Gets the assetPolicySummaryInfo value for this AssetLink.
     * 
     * @return assetPolicySummaryInfo   * Approval information contained in this AssetLink.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetPolicySummaryInfo getAssetPolicySummaryInfo() {
        return assetPolicySummaryInfo;
    }


    /**
     * Sets the assetPolicySummaryInfo value for this AssetLink.
     * 
     * @param assetPolicySummaryInfo   * Approval information contained in this AssetLink.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAssetPolicySummaryInfo(com.google.api.ads.adwords.axis.v201809.cm.AssetPolicySummaryInfo assetPolicySummaryInfo) {
        this.assetPolicySummaryInfo = assetPolicySummaryInfo;
    }


    /**
     * Gets the assetPerformanceLabel value for this AssetLink.
     * 
     * @return assetPerformanceLabel   * Performance label for the asset.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetPerformanceLabel getAssetPerformanceLabel() {
        return assetPerformanceLabel;
    }


    /**
     * Sets the assetPerformanceLabel value for this AssetLink.
     * 
     * @param assetPerformanceLabel   * Performance label for the asset.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAssetPerformanceLabel(com.google.api.ads.adwords.axis.v201809.cm.AssetPerformanceLabel assetPerformanceLabel) {
        this.assetPerformanceLabel = assetPerformanceLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetLink)) return false;
        AssetLink other = (AssetLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asset==null && other.getAsset()==null) || 
             (this.asset!=null &&
              this.asset.equals(other.getAsset()))) &&
            ((this.pinnedField==null && other.getPinnedField()==null) || 
             (this.pinnedField!=null &&
              this.pinnedField.equals(other.getPinnedField()))) &&
            ((this.assetPolicySummaryInfo==null && other.getAssetPolicySummaryInfo()==null) || 
             (this.assetPolicySummaryInfo!=null &&
              this.assetPolicySummaryInfo.equals(other.getAssetPolicySummaryInfo()))) &&
            ((this.assetPerformanceLabel==null && other.getAssetPerformanceLabel()==null) || 
             (this.assetPerformanceLabel!=null &&
              this.assetPerformanceLabel.equals(other.getAssetPerformanceLabel())));
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
        if (getAsset() != null) {
            _hashCode += getAsset().hashCode();
        }
        if (getPinnedField() != null) {
            _hashCode += getPinnedField().hashCode();
        }
        if (getAssetPolicySummaryInfo() != null) {
            _hashCode += getAssetPolicySummaryInfo().hashCode();
        }
        if (getAssetPerformanceLabel() != null) {
            _hashCode += getAssetPerformanceLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssetLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "asset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Asset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinnedField");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "pinnedField"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ServedAssetFieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetPolicySummaryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "assetPolicySummaryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetPolicySummaryInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetPerformanceLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "assetPerformanceLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetPerformanceLabel"));
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
