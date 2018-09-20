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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an asset.
 *           
 * 
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetSubtype" type="{https://adwords.google.com/api/adwords/cm/v201809}Asset.Type" minOccurs="0"/>
 *         &lt;element name="assetStatus" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetStatus" minOccurs="0"/>
 *         &lt;element name="Asset.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "assetId",
    "assetName",
    "assetSubtype",
    "assetStatus",
    "assetType"
})
@XmlSeeAlso({
    YouTubeVideoAsset.class,
    ImageAsset.class,
    MediaBundleAsset.class,
    TextAsset.class
})
public class Asset {

    protected Long assetId;
    protected String assetName;
    @XmlSchemaType(name = "string")
    protected AssetType assetSubtype;
    @XmlSchemaType(name = "string")
    protected AssetStatus assetStatus;
    @XmlElement(name = "Asset.Type")
    protected String assetType;

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetId(Long value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * Sets the value of the assetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetName(String value) {
        this.assetName = value;
    }

    /**
     * Gets the value of the assetSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType }
     *     
     */
    public AssetType getAssetSubtype() {
        return assetSubtype;
    }

    /**
     * Sets the value of the assetSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType }
     *     
     */
    public void setAssetSubtype(AssetType value) {
        this.assetSubtype = value;
    }

    /**
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssetStatus }
     *     
     */
    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetStatus }
     *     
     */
    public void setAssetStatus(AssetStatus value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the assetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetType(String value) {
        this.assetType = value;
    }

}
