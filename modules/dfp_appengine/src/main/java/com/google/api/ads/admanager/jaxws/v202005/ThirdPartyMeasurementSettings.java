// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202005;

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
 * &lt;complexType name="ThirdPartyMeasurementSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewabilityPartner" type="{https://www.google.com/apis/ads/publisher/v202005}ThirdPartyViewabilityIntegrationPartner" minOccurs="0"/>
 *         &lt;element name="viewabilityClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viewabilityReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reachPartner" type="{https://www.google.com/apis/ads/publisher/v202005}ThirdPartyReachIntegrationPartner" minOccurs="0"/>
 *         &lt;element name="reachClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reachReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherReachPartner" type="{https://www.google.com/apis/ads/publisher/v202005}ThirdPartyReachIntegrationPartner" minOccurs="0"/>
 *         &lt;element name="publisherReachClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherReachReportingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyMeasurementSettings", propOrder = {
    "viewabilityPartner",
    "viewabilityClientId",
    "viewabilityReportingId",
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
