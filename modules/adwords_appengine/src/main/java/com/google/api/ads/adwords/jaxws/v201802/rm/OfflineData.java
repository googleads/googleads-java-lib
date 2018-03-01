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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Interface for all offline data upload rows.
 *           
 * 
 * <p>Java class for OfflineData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="StoreSalesTransaction" type="{https://adwords.google.com/api/adwords/rm/v201802}StoreSalesTransaction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineData", propOrder = {
    "storeSalesTransaction"
})
public class OfflineData {

    @XmlElement(name = "StoreSalesTransaction")
    protected StoreSalesTransaction storeSalesTransaction;

    /**
     * Gets the value of the storeSalesTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link StoreSalesTransaction }
     *     
     */
    public StoreSalesTransaction getStoreSalesTransaction() {
        return storeSalesTransaction;
    }

    /**
     * Sets the value of the storeSalesTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreSalesTransaction }
     *     
     */
    public void setStoreSalesTransaction(StoreSalesTransaction value) {
        this.storeSalesTransaction = value;
    }

}
