// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains third party auto-pixeling settings for cross-sell Partners.
 *           
 * 
 * <p>Java class for ThirdPartyMeasurementSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyMeasurementSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="viewabilityPartner" type="{https://www.google.com/apis/ads/publisher/v202508}ThirdPartyViewabilityIntegrationPartner" minOccurs="0"/&gt;
 *         &lt;element name="viewabilityClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viewabilityReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publisherViewabilityPartner" type="{https://www.google.com/apis/ads/publisher/v202508}ThirdPartyViewabilityIntegrationPartner" minOccurs="0"/&gt;
 *         &lt;element name="publisherViewabilityClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publisherViewabilityReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brandLiftPartner" type="{https://www.google.com/apis/ads/publisher/v202508}ThirdPartyBrandLiftIntegrationPartner" minOccurs="0"/&gt;
 *         &lt;element name="brandLiftClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brandLiftReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reachPartner" type="{https://www.google.com/apis/ads/publisher/v202508}ThirdPartyReachIntegrationPartner" minOccurs="0"/&gt;
 *         &lt;element name="reachClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reachReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publisherReachPartner" type="{https://www.google.com/apis/ads/publisher/v202508}ThirdPartyReachIntegrationPartner" minOccurs="0"/&gt;
 *         &lt;element name="publisherReachClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publisherReachReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyMeasurementSettings", propOrder = {
    "viewabilityPartner",
    "viewabilityClientId",
    "viewabilityReportingId",
    "publisherViewabilityPartner",
    "publisherViewabilityClientId",
    "publisherViewabilityReportingId",
    "brandLiftPartner",
    "brandLiftClientId",
    "brandLiftReportingId",
    "reachPartner",
    "reachClientId",
    "reachReportingId",
    "publisherReachPartner",
    "publisherReachClientId",
    "publisherReachReportingId"
})
public class ThirdPartyMeasurementSettings {

    @XmlSchemaType(name = "string")
    protected ThirdPartyViewabilityIntegrationPartner viewabilityPartner;
    protected String viewabilityClientId;
    protected String viewabilityReportingId;
    @XmlSchemaType(name = "string")
    protected ThirdPartyViewabilityIntegrationPartner publisherViewabilityPartner;
    protected String publisherViewabilityClientId;
    protected String publisherViewabilityReportingId;
    @XmlSchemaType(name = "string")
    protected ThirdPartyBrandLiftIntegrationPartner brandLiftPartner;
    protected String brandLiftClientId;
    protected String brandLiftReportingId;
    @XmlSchemaType(name = "string")
    protected ThirdPartyReachIntegrationPartner reachPartner;
    protected String reachClientId;
    protected String reachReportingId;
    @XmlSchemaType(name = "string")
    protected ThirdPartyReachIntegrationPartner publisherReachPartner;
    protected String publisherReachClientId;
    protected String publisherReachReportingId;

    /**
     * Gets the value of the viewabilityPartner property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyViewabilityIntegrationPartner }
     *     
     */
    public ThirdPartyViewabilityIntegrationPartner getViewabilityPartner() {
        return viewabilityPartner;
    }

    /**
     * Sets the value of the viewabilityPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyViewabilityIntegrationPartner }
     *     
     */
    public void setViewabilityPartner(ThirdPartyViewabilityIntegrationPartner value) {
        this.viewabilityPartner = value;
    }

    /**
     * Gets the value of the viewabilityClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewabilityClientId() {
        return viewabilityClientId;
    }

    /**
     * Sets the value of the viewabilityClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewabilityClientId(String value) {
        this.viewabilityClientId = value;
    }

    /**
     * Gets the value of the viewabilityReportingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewabilityReportingId() {
        return viewabilityReportingId;
    }

    /**
     * Sets the value of the viewabilityReportingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewabilityReportingId(String value) {
        this.viewabilityReportingId = value;
    }

    /**
     * Gets the value of the publisherViewabilityPartner property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyViewabilityIntegrationPartner }
     *     
     */
    public ThirdPartyViewabilityIntegrationPartner getPublisherViewabilityPartner() {
        return publisherViewabilityPartner;
    }

    /**
     * Sets the value of the publisherViewabilityPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyViewabilityIntegrationPartner }
     *     
     */
    public void setPublisherViewabilityPartner(ThirdPartyViewabilityIntegrationPartner value) {
        this.publisherViewabilityPartner = value;
    }

    /**
     * Gets the value of the publisherViewabilityClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherViewabilityClientId() {
        return publisherViewabilityClientId;
    }

    /**
     * Sets the value of the publisherViewabilityClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherViewabilityClientId(String value) {
        this.publisherViewabilityClientId = value;
    }

    /**
     * Gets the value of the publisherViewabilityReportingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherViewabilityReportingId() {
        return publisherViewabilityReportingId;
    }

    /**
     * Sets the value of the publisherViewabilityReportingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherViewabilityReportingId(String value) {
        this.publisherViewabilityReportingId = value;
    }

    /**
     * Gets the value of the brandLiftPartner property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyBrandLiftIntegrationPartner }
     *     
     */
    public ThirdPartyBrandLiftIntegrationPartner getBrandLiftPartner() {
        return brandLiftPartner;
    }

    /**
     * Sets the value of the brandLiftPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyBrandLiftIntegrationPartner }
     *     
     */
    public void setBrandLiftPartner(ThirdPartyBrandLiftIntegrationPartner value) {
        this.brandLiftPartner = value;
    }

    /**
     * Gets the value of the brandLiftClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandLiftClientId() {
        return brandLiftClientId;
    }

    /**
     * Sets the value of the brandLiftClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandLiftClientId(String value) {
        this.brandLiftClientId = value;
    }

    /**
     * Gets the value of the brandLiftReportingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandLiftReportingId() {
        return brandLiftReportingId;
    }

    /**
     * Sets the value of the brandLiftReportingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandLiftReportingId(String value) {
        this.brandLiftReportingId = value;
    }

    /**
     * Gets the value of the reachPartner property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyReachIntegrationPartner }
     *     
     */
    public ThirdPartyReachIntegrationPartner getReachPartner() {
        return reachPartner;
    }

    /**
     * Sets the value of the reachPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyReachIntegrationPartner }
     *     
     */
    public void setReachPartner(ThirdPartyReachIntegrationPartner value) {
        this.reachPartner = value;
    }

    /**
     * Gets the value of the reachClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReachClientId() {
        return reachClientId;
    }

    /**
     * Sets the value of the reachClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReachClientId(String value) {
        this.reachClientId = value;
    }

    /**
     * Gets the value of the reachReportingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReachReportingId() {
        return reachReportingId;
    }

    /**
     * Sets the value of the reachReportingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReachReportingId(String value) {
        this.reachReportingId = value;
    }

    /**
     * Gets the value of the publisherReachPartner property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyReachIntegrationPartner }
     *     
     */
    public ThirdPartyReachIntegrationPartner getPublisherReachPartner() {
        return publisherReachPartner;
    }

    /**
     * Sets the value of the publisherReachPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyReachIntegrationPartner }
     *     
     */
    public void setPublisherReachPartner(ThirdPartyReachIntegrationPartner value) {
        this.publisherReachPartner = value;
    }

    /**
     * Gets the value of the publisherReachClientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherReachClientId() {
        return publisherReachClientId;
    }

    /**
     * Sets the value of the publisherReachClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherReachClientId(String value) {
        this.publisherReachClientId = value;
    }

    /**
     * Gets the value of the publisherReachReportingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherReachReportingId() {
        return publisherReachReportingId;
    }

    /**
     * Sets the value of the publisherReachReportingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherReachReportingId(String value) {
        this.publisherReachReportingId = value;
    }

}
