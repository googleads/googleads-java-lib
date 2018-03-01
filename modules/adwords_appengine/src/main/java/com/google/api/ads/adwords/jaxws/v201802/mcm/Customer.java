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


package com.google.api.ads.adwords.jaxws.v201802.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a customer for the CustomerService.
 *           
 * 
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canManageClients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="testAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autoTaggingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parallelTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conversionTrackingSettings" type="{https://adwords.google.com/api/adwords/mcm/v201802}ConversionTrackingSettings" minOccurs="0"/>
 *         &lt;element name="remarketingSettings" type="{https://adwords.google.com/api/adwords/mcm/v201802}RemarketingSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "customerId",
    "currencyCode",
    "dateTimeZone",
    "descriptiveName",
    "canManageClients",
    "testAccount",
    "autoTaggingEnabled",
    "trackingUrlTemplate",
    "finalUrlSuffix",
    "parallelTrackingEnabled",
    "conversionTrackingSettings",
    "remarketingSettings"
})
public class Customer {

    protected Long customerId;
    protected String currencyCode;
    protected String dateTimeZone;
    protected String descriptiveName;
    protected Boolean canManageClients;
    protected Boolean testAccount;
    protected Boolean autoTaggingEnabled;
    protected String trackingUrlTemplate;
    protected String finalUrlSuffix;
    protected Boolean parallelTrackingEnabled;
    protected ConversionTrackingSettings conversionTrackingSettings;
    protected RemarketingSettings remarketingSettings;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the dateTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeZone() {
        return dateTimeZone;
    }

    /**
     * Sets the value of the dateTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeZone(String value) {
        this.dateTimeZone = value;
    }

    /**
     * Gets the value of the descriptiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveName() {
        return descriptiveName;
    }

    /**
     * Sets the value of the descriptiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveName(String value) {
        this.descriptiveName = value;
    }

    /**
     * Gets the value of the canManageClients property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanManageClients() {
        return canManageClients;
    }

    /**
     * Sets the value of the canManageClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanManageClients(Boolean value) {
        this.canManageClients = value;
    }

    /**
     * Gets the value of the testAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestAccount() {
        return testAccount;
    }

    /**
     * Sets the value of the testAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestAccount(Boolean value) {
        this.testAccount = value;
    }

    /**
     * Gets the value of the autoTaggingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoTaggingEnabled() {
        return autoTaggingEnabled;
    }

    /**
     * Sets the value of the autoTaggingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoTaggingEnabled(Boolean value) {
        this.autoTaggingEnabled = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the finalUrlSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalUrlSuffix() {
        return finalUrlSuffix;
    }

    /**
     * Sets the value of the finalUrlSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalUrlSuffix(String value) {
        this.finalUrlSuffix = value;
    }

    /**
     * Gets the value of the parallelTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallelTrackingEnabled() {
        return parallelTrackingEnabled;
    }

    /**
     * Sets the value of the parallelTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelTrackingEnabled(Boolean value) {
        this.parallelTrackingEnabled = value;
    }

    /**
     * Gets the value of the conversionTrackingSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionTrackingSettings }
     *     
     */
    public ConversionTrackingSettings getConversionTrackingSettings() {
        return conversionTrackingSettings;
    }

    /**
     * Sets the value of the conversionTrackingSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionTrackingSettings }
     *     
     */
    public void setConversionTrackingSettings(ConversionTrackingSettings value) {
        this.conversionTrackingSettings = value;
    }

    /**
     * Gets the value of the remarketingSettings property.
     * 
     * @return
     *     possible object is
     *     {@link RemarketingSettings }
     *     
     */
    public RemarketingSettings getRemarketingSettings() {
        return remarketingSettings;
    }

    /**
     * Sets the value of the remarketingSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarketingSettings }
     *     
     */
    public void setRemarketingSettings(RemarketingSettings value) {
        this.remarketingSettings = value;
    }

}
