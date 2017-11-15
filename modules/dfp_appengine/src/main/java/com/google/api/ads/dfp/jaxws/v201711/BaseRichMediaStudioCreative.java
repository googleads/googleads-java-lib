// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that is created by a Rich Media Studio.
 *           
 * 
 * <p>Java class for BaseRichMediaStudioCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRichMediaStudioCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}Creative">
 *       &lt;sequence>
 *         &lt;element name="studioCreativeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creativeFormat" type="{https://www.google.com/apis/ads/publisher/v201711}RichMediaStudioCreativeFormat" minOccurs="0"/>
 *         &lt;element name="artworkType" type="{https://www.google.com/apis/ads/publisher/v201711}RichMediaStudioCreativeArtworkType" minOccurs="0"/>
 *         &lt;element name="totalFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adTagKeys" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customKeyValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="surveyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allImpressionsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="richMediaImpressionsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backupImageImpressionsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredFlashPluginVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billingAttribute" type="{https://www.google.com/apis/ads/publisher/v201711}RichMediaStudioCreativeBillingAttribute" minOccurs="0"/>
 *         &lt;element name="richMediaStudioChildAssetProperties" type="{https://www.google.com/apis/ads/publisher/v201711}RichMediaStudioChildAssetProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sslScanResult" type="{https://www.google.com/apis/ads/publisher/v201711}SslScanResult" minOccurs="0"/>
 *         &lt;element name="sslManualOverride" type="{https://www.google.com/apis/ads/publisher/v201711}SslManualOverride" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRichMediaStudioCreative", propOrder = {
    "studioCreativeId",
    "creativeFormat",
    "artworkType",
    "totalFileSize",
    "adTagKeys",
    "customKeyValues",
    "surveyUrl",
    "allImpressionsUrl",
    "richMediaImpressionsUrl",
    "backupImageImpressionsUrl",
    "overrideCss",
    "requiredFlashPluginVersion",
    "duration",
    "billingAttribute",
    "richMediaStudioChildAssetProperties",
    "sslScanResult",
    "sslManualOverride"
})
@XmlSeeAlso({
    RichMediaStudioCreative.class
})
public abstract class BaseRichMediaStudioCreative
    extends Creative
{

    protected Long studioCreativeId;
    @XmlSchemaType(name = "string")
    protected RichMediaStudioCreativeFormat creativeFormat;
    @XmlSchemaType(name = "string")
    protected RichMediaStudioCreativeArtworkType artworkType;
    protected Long totalFileSize;
    protected List<String> adTagKeys;
    protected List<String> customKeyValues;
    protected String surveyUrl;
    protected String allImpressionsUrl;
    protected String richMediaImpressionsUrl;
    protected String backupImageImpressionsUrl;
    protected String overrideCss;
    protected String requiredFlashPluginVersion;
    protected Integer duration;
    @XmlSchemaType(name = "string")
    protected RichMediaStudioCreativeBillingAttribute billingAttribute;
    protected List<RichMediaStudioChildAssetProperty> richMediaStudioChildAssetProperties;
    @XmlSchemaType(name = "string")
    protected SslScanResult sslScanResult;
    @XmlSchemaType(name = "string")
    protected SslManualOverride sslManualOverride;

    /**
     * Gets the value of the studioCreativeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStudioCreativeId() {
        return studioCreativeId;
    }

    /**
     * Sets the value of the studioCreativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStudioCreativeId(Long value) {
        this.studioCreativeId = value;
    }

    /**
     * Gets the value of the creativeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link RichMediaStudioCreativeFormat }
     *     
     */
    public RichMediaStudioCreativeFormat getCreativeFormat() {
        return creativeFormat;
    }

    /**
     * Sets the value of the creativeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichMediaStudioCreativeFormat }
     *     
     */
    public void setCreativeFormat(RichMediaStudioCreativeFormat value) {
        this.creativeFormat = value;
    }

    /**
     * Gets the value of the artworkType property.
     * 
     * @return
     *     possible object is
     *     {@link RichMediaStudioCreativeArtworkType }
     *     
     */
    public RichMediaStudioCreativeArtworkType getArtworkType() {
        return artworkType;
    }

    /**
     * Sets the value of the artworkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichMediaStudioCreativeArtworkType }
     *     
     */
    public void setArtworkType(RichMediaStudioCreativeArtworkType value) {
        this.artworkType = value;
    }

    /**
     * Gets the value of the totalFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalFileSize() {
        return totalFileSize;
    }

    /**
     * Sets the value of the totalFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalFileSize(Long value) {
        this.totalFileSize = value;
    }

    /**
     * Gets the value of the adTagKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adTagKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdTagKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdTagKeys() {
        if (adTagKeys == null) {
            adTagKeys = new ArrayList<String>();
        }
        return this.adTagKeys;
    }

    /**
     * Gets the value of the customKeyValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customKeyValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomKeyValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomKeyValues() {
        if (customKeyValues == null) {
            customKeyValues = new ArrayList<String>();
        }
        return this.customKeyValues;
    }

    /**
     * Gets the value of the surveyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyUrl() {
        return surveyUrl;
    }

    /**
     * Sets the value of the surveyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyUrl(String value) {
        this.surveyUrl = value;
    }

    /**
     * Gets the value of the allImpressionsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllImpressionsUrl() {
        return allImpressionsUrl;
    }

    /**
     * Sets the value of the allImpressionsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllImpressionsUrl(String value) {
        this.allImpressionsUrl = value;
    }

    /**
     * Gets the value of the richMediaImpressionsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichMediaImpressionsUrl() {
        return richMediaImpressionsUrl;
    }

    /**
     * Sets the value of the richMediaImpressionsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichMediaImpressionsUrl(String value) {
        this.richMediaImpressionsUrl = value;
    }

    /**
     * Gets the value of the backupImageImpressionsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupImageImpressionsUrl() {
        return backupImageImpressionsUrl;
    }

    /**
     * Sets the value of the backupImageImpressionsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupImageImpressionsUrl(String value) {
        this.backupImageImpressionsUrl = value;
    }

    /**
     * Gets the value of the overrideCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCss() {
        return overrideCss;
    }

    /**
     * Sets the value of the overrideCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCss(String value) {
        this.overrideCss = value;
    }

    /**
     * Gets the value of the requiredFlashPluginVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredFlashPluginVersion() {
        return requiredFlashPluginVersion;
    }

    /**
     * Sets the value of the requiredFlashPluginVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredFlashPluginVersion(String value) {
        this.requiredFlashPluginVersion = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the billingAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link RichMediaStudioCreativeBillingAttribute }
     *     
     */
    public RichMediaStudioCreativeBillingAttribute getBillingAttribute() {
        return billingAttribute;
    }

    /**
     * Sets the value of the billingAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichMediaStudioCreativeBillingAttribute }
     *     
     */
    public void setBillingAttribute(RichMediaStudioCreativeBillingAttribute value) {
        this.billingAttribute = value;
    }

    /**
     * Gets the value of the richMediaStudioChildAssetProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the richMediaStudioChildAssetProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRichMediaStudioChildAssetProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RichMediaStudioChildAssetProperty }
     * 
     * 
     */
    public List<RichMediaStudioChildAssetProperty> getRichMediaStudioChildAssetProperties() {
        if (richMediaStudioChildAssetProperties == null) {
            richMediaStudioChildAssetProperties = new ArrayList<RichMediaStudioChildAssetProperty>();
        }
        return this.richMediaStudioChildAssetProperties;
    }

    /**
     * Gets the value of the sslScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link SslScanResult }
     *     
     */
    public SslScanResult getSslScanResult() {
        return sslScanResult;
    }

    /**
     * Sets the value of the sslScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslScanResult }
     *     
     */
    public void setSslScanResult(SslScanResult value) {
        this.sslScanResult = value;
    }

    /**
     * Gets the value of the sslManualOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SslManualOverride }
     *     
     */
    public SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }

    /**
     * Sets the value of the sslManualOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslManualOverride }
     *     
     */
    public void setSslManualOverride(SslManualOverride value) {
        this.sslManualOverride = value;
    }

}
