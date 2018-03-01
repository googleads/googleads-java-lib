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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains store sales transaction information.
 *           
 * 
 * <p>Java class for StoreSalesTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreSalesTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdentifiers" type="{https://adwords.google.com/api/adwords/rm/v201802}UserIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transactionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionAmount" type="{https://adwords.google.com/api/adwords/rm/v201802}MoneyWithCurrency" minOccurs="0"/>
 *         &lt;element name="conversionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreSalesTransaction", propOrder = {
    "userIdentifiers",
    "transactionTime",
    "transactionAmount",
    "conversionName"
})
public class StoreSalesTransaction {

    protected List<UserIdentifier> userIdentifiers;
    protected String transactionTime;
    protected MoneyWithCurrency transactionAmount;
    protected String conversionName;

    /**
     * Gets the value of the userIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserIdentifier }
     * 
     * 
     */
    public List<UserIdentifier> getUserIdentifiers() {
        if (userIdentifiers == null) {
            userIdentifiers = new ArrayList<UserIdentifier>();
        }
        return this.userIdentifiers;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTime(String value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public MoneyWithCurrency getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public void setTransactionAmount(MoneyWithCurrency value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the conversionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionName() {
        return conversionName;
    }

    /**
     * Sets the value of the conversionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionName(String value) {
        this.conversionName = value;
    }

}
