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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Money;


/**
 * 
 *             Holds fields that provide information on the last set of values that were passed in through
 *             the parent BudgetOrder for mutate.add and mutate.set.
 *           
 * 
 * <p>Java class for BudgetOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetOrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/billing/v201802}BudgetOrderRequest.Status" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetOrderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spendingLimit" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetOrderRequest", propOrder = {
    "status",
    "date",
    "billingAccountName",
    "poNumber",
    "budgetOrderName",
    "spendingLimit",
    "startDateTime",
    "endDateTime"
})
public class BudgetOrderRequest {

    @XmlSchemaType(name = "string")
    protected BudgetOrderRequestStatus status;
    protected String date;
    protected String billingAccountName;
    protected String poNumber;
    protected String budgetOrderName;
    protected Money spendingLimit;
    protected String startDateTime;
    protected String endDateTime;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetOrderRequestStatus }
     *     
     */
    public BudgetOrderRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetOrderRequestStatus }
     *     
     */
    public void setStatus(BudgetOrderRequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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

}
