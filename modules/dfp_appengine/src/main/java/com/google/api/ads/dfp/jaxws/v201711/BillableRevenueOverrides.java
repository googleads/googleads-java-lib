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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Billable revenue overrides for a {@link ReconciliationLineItemReport} to be
 *             used instead of the Google calculated ones.
 *           
 * 
 * <p>Java class for BillableRevenueOverrides complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillableRevenueOverrides">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netBillableRevenueOverride" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *         &lt;element name="grossBillableRevenueOverride" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *         &lt;element name="billableRevenueOverride" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillableRevenueOverrides", propOrder = {
    "netBillableRevenueOverride",
    "grossBillableRevenueOverride",
    "billableRevenueOverride"
})
public class BillableRevenueOverrides {

    protected Money netBillableRevenueOverride;
    protected Money grossBillableRevenueOverride;
    protected Money billableRevenueOverride;

    /**
     * Gets the value of the netBillableRevenueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetBillableRevenueOverride() {
        return netBillableRevenueOverride;
    }

    /**
     * Sets the value of the netBillableRevenueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetBillableRevenueOverride(Money value) {
        this.netBillableRevenueOverride = value;
    }

    /**
     * Gets the value of the grossBillableRevenueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getGrossBillableRevenueOverride() {
        return grossBillableRevenueOverride;
    }

    /**
     * Sets the value of the grossBillableRevenueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setGrossBillableRevenueOverride(Money value) {
        this.grossBillableRevenueOverride = value;
    }

    /**
     * Gets the value of the billableRevenueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBillableRevenueOverride() {
        return billableRevenueOverride;
    }

    /**
     * Sets the value of the billableRevenueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBillableRevenueOverride(Money value) {
        this.billableRevenueOverride = value;
    }

}
