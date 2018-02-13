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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Settings for a {@link Company}.
 *           
 * 
 * <p>Java class for CompanySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanySettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingCap" type="{https://www.google.com/apis/ads/publisher/v201802}BillingCap" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{https://www.google.com/apis/ads/publisher/v201802}BillingSchedule" minOccurs="0"/>
 *         &lt;element name="billingSource" type="{https://www.google.com/apis/ads/publisher/v201802}BillingSource" minOccurs="0"/>
 *         &lt;element name="advertiserDiscount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valueAddedTax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="agencyCommission" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanySettings", propOrder = {
    "billingCap",
    "billingSchedule",
    "billingSource",
    "advertiserDiscount",
    "valueAddedTax",
    "agencyCommission"
})
public class CompanySettings {

    @XmlSchemaType(name = "string")
    protected BillingCap billingCap;
    @XmlSchemaType(name = "string")
    protected BillingSchedule billingSchedule;
    @XmlSchemaType(name = "string")
    protected BillingSource billingSource;
    protected Long advertiserDiscount;
    protected Long valueAddedTax;
    protected Long agencyCommission;

    /**
     * Gets the value of the billingCap property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCap }
     *     
     */
    public BillingCap getBillingCap() {
        return billingCap;
    }

    /**
     * Sets the value of the billingCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCap }
     *     
     */
    public void setBillingCap(BillingCap value) {
        this.billingCap = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSchedule }
     *     
     */
    public BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSchedule }
     *     
     */
    public void setBillingSchedule(BillingSchedule value) {
        this.billingSchedule = value;
    }

    /**
     * Gets the value of the billingSource property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSource }
     *     
     */
    public BillingSource getBillingSource() {
        return billingSource;
    }

    /**
     * Sets the value of the billingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSource }
     *     
     */
    public void setBillingSource(BillingSource value) {
        this.billingSource = value;
    }

    /**
     * Gets the value of the advertiserDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvertiserDiscount() {
        return advertiserDiscount;
    }

    /**
     * Sets the value of the advertiserDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvertiserDiscount(Long value) {
        this.advertiserDiscount = value;
    }

    /**
     * Gets the value of the valueAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueAddedTax() {
        return valueAddedTax;
    }

    /**
     * Sets the value of the valueAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueAddedTax(Long value) {
        this.valueAddedTax = value;
    }

    /**
     * Gets the value of the agencyCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgencyCommission() {
        return agencyCommission;
    }

    /**
     * Sets the value of the agencyCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgencyCommission(Long value) {
        this.agencyCommission = value;
    }

}
