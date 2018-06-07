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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an asset link. This class contains an asset and information that is specific to an
 *             asset-entity link (e.g. policy information).
 *           
 * 
 * <p>Java class for AssetLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{https://adwords.google.com/api/adwords/cm/v201806}Asset" minOccurs="0"/>
 *         &lt;element name="pinnedField" type="{https://adwords.google.com/api/adwords/cm/v201806}ServedAssetFieldType" minOccurs="0"/>
 *         &lt;element name="assetPolicySummaryInfo" type="{https://adwords.google.com/api/adwords/cm/v201806}AssetPolicySummaryInfo" minOccurs="0"/>
 *         &lt;element name="assetPerformanceLabel" type="{https://adwords.google.com/api/adwords/cm/v201806}AssetPerformanceLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetLink", propOrder = {
    "asset",
    "pinnedField",
    "assetPolicySummaryInfo",
    "assetPerformanceLabel"
})
public class AssetLink {

    protected Asset asset;
    @XmlSchemaType(name = "string")
    protected ServedAssetFieldType pinnedField;
    protected AssetPolicySummaryInfo assetPolicySummaryInfo;
    @XmlSchemaType(name = "string")
    protected AssetPerformanceLabel assetPerformanceLabel;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    public Asset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    public void setAsset(Asset value) {
        this.asset = value;
    }

    /**
     * Gets the value of the pinnedField property.
     * 
     * @return
     *     possible object is
     *     {@link ServedAssetFieldType }
     *     
     */
    public ServedAssetFieldType getPinnedField() {
        return pinnedField;
    }

    /**
     * Sets the value of the pinnedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServedAssetFieldType }
     *     
     */
    public void setPinnedField(ServedAssetFieldType value) {
        this.pinnedField = value;
    }

    /**
     * Gets the value of the assetPolicySummaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AssetPolicySummaryInfo }
     *     
     */
    public AssetPolicySummaryInfo getAssetPolicySummaryInfo() {
        return assetPolicySummaryInfo;
    }

    /**
     * Sets the value of the assetPolicySummaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetPolicySummaryInfo }
     *     
     */
    public void setAssetPolicySummaryInfo(AssetPolicySummaryInfo value) {
        this.assetPolicySummaryInfo = value;
    }

    /**
     * Gets the value of the assetPerformanceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link AssetPerformanceLabel }
     *     
     */
    public AssetPerformanceLabel getAssetPerformanceLabel() {
        return assetPerformanceLabel;
    }

    /**
     * Sets the value of the assetPerformanceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetPerformanceLabel }
     *     
     */
    public void setAssetPerformanceLabel(AssetPerformanceLabel value) {
        this.assetPerformanceLabel = value;
    }

}
