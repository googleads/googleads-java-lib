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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Data object that represents a managed customer.  Member of {@link ManagedCustomerPage}.
 *           
 * 
 * <p>Java class for ManagedCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="canManageClients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accountLabels" type="{https://adwords.google.com/api/adwords/mcm/v201802}AccountLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludeHiddenAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomer", propOrder = {
    "name",
    "customerId",
    "canManageClients",
    "currencyCode",
    "dateTimeZone",
    "testAccount",
    "accountLabels",
    "excludeHiddenAccounts"
})
public class ManagedCustomer {

    protected String name;
    protected Long customerId;
    protected Boolean canManageClients;
    protected String currencyCode;
    protected String dateTimeZone;
    protected Boolean testAccount;
    protected List<AccountLabel> accountLabels;
    protected Boolean excludeHiddenAccounts;

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
     * Gets the value of the accountLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountLabel }
     * 
     * 
     */
    public List<AccountLabel> getAccountLabels() {
        if (accountLabels == null) {
            accountLabels = new ArrayList<AccountLabel>();
        }
        return this.accountLabels;
    }

    /**
     * Gets the value of the excludeHiddenAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeHiddenAccounts() {
        return excludeHiddenAccounts;
    }

    /**
     * Sets the value of the excludeHiddenAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeHiddenAccounts(Boolean value) {
        this.excludeHiddenAccounts = value;
    }

}
