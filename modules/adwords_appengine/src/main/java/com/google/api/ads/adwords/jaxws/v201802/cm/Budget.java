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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Budgets are used for managing the amount of money spent on AdWords.
 *           
 * 
 * <p>Java class for Budget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Budget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="deliveryMethod" type="{https://adwords.google.com/api/adwords/cm/v201802}Budget.BudgetDeliveryMethod" minOccurs="0"/>
 *         &lt;element name="referenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isExplicitlyShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}Budget.BudgetStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Budget", propOrder = {
    "budgetId",
    "name",
    "amount",
    "deliveryMethod",
    "referenceCount",
    "isExplicitlyShared",
    "status"
})
public class Budget {

    protected Long budgetId;
    protected String name;
    protected Money amount;
    @XmlSchemaType(name = "string")
    protected BudgetBudgetDeliveryMethod deliveryMethod;
    protected Integer referenceCount;
    protected Boolean isExplicitlyShared;
    @XmlSchemaType(name = "string")
    protected BudgetBudgetStatus status;

    /**
     * Gets the value of the budgetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetId() {
        return budgetId;
    }

    /**
     * Sets the value of the budgetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetId(Long value) {
        this.budgetId = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetBudgetDeliveryMethod }
     *     
     */
    public BudgetBudgetDeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetBudgetDeliveryMethod }
     *     
     */
    public void setDeliveryMethod(BudgetBudgetDeliveryMethod value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the referenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceCount() {
        return referenceCount;
    }

    /**
     * Sets the value of the referenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceCount(Integer value) {
        this.referenceCount = value;
    }

    /**
     * Gets the value of the isExplicitlyShared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExplicitlyShared() {
        return isExplicitlyShared;
    }

    /**
     * Sets the value of the isExplicitlyShared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExplicitlyShared(Boolean value) {
        this.isExplicitlyShared = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetBudgetStatus }
     *     
     */
    public BudgetBudgetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetBudgetStatus }
     *     
     */
    public void setStatus(BudgetBudgetStatus value) {
        this.status = value;
    }

}
