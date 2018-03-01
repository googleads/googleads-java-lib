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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An abstract Conversion base class.
 *           
 * 
 * <p>Java class for ConversionTracker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionTracker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="originalConversionTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}ConversionTracker.Status" minOccurs="0"/>
 *         &lt;element name="category" type="{https://adwords.google.com/api/adwords/cm/v201802}ConversionTracker.Category" minOccurs="0"/>
 *         &lt;element name="googleEventSnippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="googleGlobalSiteTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDrivenModelStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}DataDrivenModelStatus" minOccurs="0"/>
 *         &lt;element name="conversionTypeOwnerCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="viewthroughLookbackWindow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ctcLookbackWindow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countingType" type="{https://adwords.google.com/api/adwords/cm/v201802}ConversionDeduplicationMode" minOccurs="0"/>
 *         &lt;element name="defaultRevenueValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="defaultRevenueCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alwaysUseDefaultRevenueValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludeFromBidding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attributionModelType" type="{https://adwords.google.com/api/adwords/cm/v201802}AttributionModelType" minOccurs="0"/>
 *         &lt;element name="mostRecentConversionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReceivedRequestTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversionTracker.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionTracker", propOrder = {
    "id",
    "originalConversionTypeId",
    "name",
    "status",
    "category",
    "googleEventSnippet",
    "googleGlobalSiteTag",
    "dataDrivenModelStatus",
    "conversionTypeOwnerCustomerId",
    "viewthroughLookbackWindow",
    "ctcLookbackWindow",
    "countingType",
    "defaultRevenueValue",
    "defaultRevenueCurrencyCode",
    "alwaysUseDefaultRevenueValue",
    "excludeFromBidding",
    "attributionModelType",
    "mostRecentConversionDate",
    "lastReceivedRequestTime",
    "conversionTrackerType"
})
@XmlSeeAlso({
    UploadConversion.class,
    AppConversion.class,
    WebsiteCallMetricsConversion.class,
    AdCallMetricsConversion.class,
    AdWordsConversionTracker.class,
    UploadCallConversion.class
})
public abstract class ConversionTracker {

    protected Long id;
    protected Long originalConversionTypeId;
    protected String name;
    @XmlSchemaType(name = "string")
    protected ConversionTrackerStatus status;
    @XmlSchemaType(name = "string")
    protected ConversionTrackerCategory category;
    protected String googleEventSnippet;
    protected String googleGlobalSiteTag;
    @XmlSchemaType(name = "string")
    protected DataDrivenModelStatus dataDrivenModelStatus;
    protected Long conversionTypeOwnerCustomerId;
    protected Integer viewthroughLookbackWindow;
    protected Integer ctcLookbackWindow;
    @XmlSchemaType(name = "string")
    protected ConversionDeduplicationMode countingType;
    protected Double defaultRevenueValue;
    protected String defaultRevenueCurrencyCode;
    protected Boolean alwaysUseDefaultRevenueValue;
    protected Boolean excludeFromBidding;
    @XmlSchemaType(name = "string")
    protected AttributionModelType attributionModelType;
    protected String mostRecentConversionDate;
    protected String lastReceivedRequestTime;
    @XmlElement(name = "ConversionTracker.Type")
    protected String conversionTrackerType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the originalConversionTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalConversionTypeId() {
        return originalConversionTypeId;
    }

    /**
     * Sets the value of the originalConversionTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalConversionTypeId(Long value) {
        this.originalConversionTypeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionTrackerStatus }
     *     
     */
    public ConversionTrackerStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionTrackerStatus }
     *     
     */
    public void setStatus(ConversionTrackerStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionTrackerCategory }
     *     
     */
    public ConversionTrackerCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionTrackerCategory }
     *     
     */
    public void setCategory(ConversionTrackerCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the googleEventSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleEventSnippet() {
        return googleEventSnippet;
    }

    /**
     * Sets the value of the googleEventSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleEventSnippet(String value) {
        this.googleEventSnippet = value;
    }

    /**
     * Gets the value of the googleGlobalSiteTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleGlobalSiteTag() {
        return googleGlobalSiteTag;
    }

    /**
     * Sets the value of the googleGlobalSiteTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleGlobalSiteTag(String value) {
        this.googleGlobalSiteTag = value;
    }

    /**
     * Gets the value of the dataDrivenModelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DataDrivenModelStatus }
     *     
     */
    public DataDrivenModelStatus getDataDrivenModelStatus() {
        return dataDrivenModelStatus;
    }

    /**
     * Sets the value of the dataDrivenModelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataDrivenModelStatus }
     *     
     */
    public void setDataDrivenModelStatus(DataDrivenModelStatus value) {
        this.dataDrivenModelStatus = value;
    }

    /**
     * Gets the value of the conversionTypeOwnerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionTypeOwnerCustomerId() {
        return conversionTypeOwnerCustomerId;
    }

    /**
     * Sets the value of the conversionTypeOwnerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionTypeOwnerCustomerId(Long value) {
        this.conversionTypeOwnerCustomerId = value;
    }

    /**
     * Gets the value of the viewthroughLookbackWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViewthroughLookbackWindow() {
        return viewthroughLookbackWindow;
    }

    /**
     * Sets the value of the viewthroughLookbackWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViewthroughLookbackWindow(Integer value) {
        this.viewthroughLookbackWindow = value;
    }

    /**
     * Gets the value of the ctcLookbackWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCtcLookbackWindow() {
        return ctcLookbackWindow;
    }

    /**
     * Sets the value of the ctcLookbackWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCtcLookbackWindow(Integer value) {
        this.ctcLookbackWindow = value;
    }

    /**
     * Gets the value of the countingType property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionDeduplicationMode }
     *     
     */
    public ConversionDeduplicationMode getCountingType() {
        return countingType;
    }

    /**
     * Sets the value of the countingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionDeduplicationMode }
     *     
     */
    public void setCountingType(ConversionDeduplicationMode value) {
        this.countingType = value;
    }

    /**
     * Gets the value of the defaultRevenueValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultRevenueValue() {
        return defaultRevenueValue;
    }

    /**
     * Sets the value of the defaultRevenueValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultRevenueValue(Double value) {
        this.defaultRevenueValue = value;
    }

    /**
     * Gets the value of the defaultRevenueCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRevenueCurrencyCode() {
        return defaultRevenueCurrencyCode;
    }

    /**
     * Sets the value of the defaultRevenueCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRevenueCurrencyCode(String value) {
        this.defaultRevenueCurrencyCode = value;
    }

    /**
     * Gets the value of the alwaysUseDefaultRevenueValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysUseDefaultRevenueValue() {
        return alwaysUseDefaultRevenueValue;
    }

    /**
     * Sets the value of the alwaysUseDefaultRevenueValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysUseDefaultRevenueValue(Boolean value) {
        this.alwaysUseDefaultRevenueValue = value;
    }

    /**
     * Gets the value of the excludeFromBidding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFromBidding() {
        return excludeFromBidding;
    }

    /**
     * Sets the value of the excludeFromBidding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFromBidding(Boolean value) {
        this.excludeFromBidding = value;
    }

    /**
     * Gets the value of the attributionModelType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributionModelType }
     *     
     */
    public AttributionModelType getAttributionModelType() {
        return attributionModelType;
    }

    /**
     * Sets the value of the attributionModelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributionModelType }
     *     
     */
    public void setAttributionModelType(AttributionModelType value) {
        this.attributionModelType = value;
    }

    /**
     * Gets the value of the mostRecentConversionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMostRecentConversionDate() {
        return mostRecentConversionDate;
    }

    /**
     * Sets the value of the mostRecentConversionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMostRecentConversionDate(String value) {
        this.mostRecentConversionDate = value;
    }

    /**
     * Gets the value of the lastReceivedRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReceivedRequestTime() {
        return lastReceivedRequestTime;
    }

    /**
     * Sets the value of the lastReceivedRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReceivedRequestTime(String value) {
        this.lastReceivedRequestTime = value;
    }

    /**
     * Gets the value of the conversionTrackerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionTrackerType() {
        return conversionTrackerType;
    }

    /**
     * Sets the value of the conversionTrackerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionTrackerType(String value) {
        this.conversionTrackerType = value;
    }

}
