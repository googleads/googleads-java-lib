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


package com.google.api.ads.adwords.jaxws.v201802.billing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Money;


/**
 * 
 *             A <a href="https://support.google.com/adwords/answer/2393037">budget order</a>
 *             links an account-wide budget with a {@link BillingAccount}.
 *           
 * 
 * <p>Java class for BudgetOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billingAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetOrderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryBillingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryBillingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spendingLimit" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="totalAdjustments" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastRequest" type="{https://adwords.google.com/api/adwords/billing/v201802}BudgetOrderRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetOrder", propOrder = {
    "billingAccountId",
    "id",
    "billingAccountName",
    "poNumber",
    "budgetOrderName",
    "primaryBillingId",
    "secondaryBillingId",
    "spendingLimit",
    "totalAdjustments",
    "startDateTime",
    "endDateTime",
    "lastRequest"
})
public class BudgetOrder {

    protected String billingAccountId;
    protected Long id;
    protected String billingAccountName;
    protected String poNumber;
    protected String budgetOrderName;
    protected String primaryBillingId;
    protected String secondaryBillingId;
    protected Money spendingLimit;
    protected Money totalAdjustments;
    protected String startDateTime;
    protected String endDateTime;
    protected BudgetOrderRequest lastRequest;

    /**
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountId(String value) {
        this.billingAccountId = value;
    }

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
     * Gets the value of the billingAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountName() {
        return billingAccountName;
    }

    /**
     * Sets the value of the billingAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountName(String value) {
        this.billingAccountName = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the budgetOrderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetOrderName() {
        return budgetOrderName;
    }

    /**
     * Sets the value of the budgetOrderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetOrderName(String value) {
        this.budgetOrderName = value;
    }

    /**
     * Gets the value of the primaryBillingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillingId() {
        return primaryBillingId;
    }

    /**
     * Sets the value of the primaryBillingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillingId(String value) {
        this.primaryBillingId = value;
    }

    /**
     * Gets the value of the secondaryBillingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryBillingId() {
        return secondaryBillingId;
    }

    /**
     * Sets the value of the secondaryBillingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryBillingId(String value) {
        this.secondaryBillingId = value;
    }

    /**
     * Gets the value of the spendingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSpendingLimit() {
        return spendingLimit;
    }

    /**
     * Sets the value of the spendingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSpendingLimit(Money value) {
        this.spendingLimit = value;
    }

    /**
     * Gets the value of the totalAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalAdjustments() {
        return totalAdjustments;
    }

    /**
     * Sets the value of the totalAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalAdjustments(Money value) {
        this.totalAdjustments = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the lastRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetOrderRequest }
     *     
     */
    public BudgetOrderRequest getLastRequest() {
        return lastRequest;
    }

    /**
     * Sets the value of the lastRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetOrderRequest }
     *     
     */
    public void setLastRequest(BudgetOrderRequest value) {
        this.lastRequest = value;
    }

}
