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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link ExchangeRate} objects.
 *             
 *             For each exchange rate, the following fields are required:
 *             <ul>
 *             <li>{@link ExchangeRate#currencyCode}</li>
 *             <li>{@link ExchangeRate#exchangeRate} when {@link ExchangeRate#refreshRate} is
 *             {@link ExchangeRateRefreshRate#FIXED}</li>
 *             </ul>
 *             
 *             @param exchangeRates the exchange rates to create
 *             @return the created exchange rates with their exchange rate values filled in
 *           
 * 
 * <p>Java class for createExchangeRates element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createExchangeRates">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="exchangeRates" type="{https://www.google.com/apis/ads/publisher/v201802}ExchangeRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchangeRates"
})
@XmlRootElement(name = "createExchangeRates")
public class ExchangeRateServiceInterfacecreateExchangeRates {

    protected List<ExchangeRate> exchangeRates;

    /**
     * Gets the value of the exchangeRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRate }
     * 
     * 
     */
    public List<ExchangeRate> getExchangeRates() {
        if (exchangeRates == null) {
            exchangeRates = new ArrayList<ExchangeRate>();
        }
        return this.exchangeRates;
    }

}
