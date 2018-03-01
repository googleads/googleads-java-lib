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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Common metadata for Store Sales uploads.
 *           
 * 
 * <p>Java class for StoreSalesUploadCommonMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreSalesUploadCommonMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loyaltyRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="transactionUploadRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="StoreSalesUploadCommonMetadata.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreSalesUploadCommonMetadata", propOrder = {
    "loyaltyRate",
    "transactionUploadRate",
    "storeSalesUploadCommonMetadataType"
})
@XmlSeeAlso({
    FirstPartyUploadMetadata.class,
    ThirdPartyUploadMetadata.class
})
public abstract class StoreSalesUploadCommonMetadata {

    protected Double loyaltyRate;
    protected Double transactionUploadRate;
    @XmlElement(name = "StoreSalesUploadCommonMetadata.Type")
    protected String storeSalesUploadCommonMetadataType;

    /**
     * Gets the value of the loyaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoyaltyRate() {
        return loyaltyRate;
    }

    /**
     * Sets the value of the loyaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoyaltyRate(Double value) {
        this.loyaltyRate = value;
    }

    /**
     * Gets the value of the transactionUploadRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransactionUploadRate() {
        return transactionUploadRate;
    }

    /**
     * Sets the value of the transactionUploadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransactionUploadRate(Double value) {
        this.transactionUploadRate = value;
    }

    /**
     * Gets the value of the storeSalesUploadCommonMetadataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreSalesUploadCommonMetadataType() {
        return storeSalesUploadCommonMetadataType;
    }

    /**
     * Sets the value of the storeSalesUploadCommonMetadataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreSalesUploadCommonMetadataType(String value) {
        this.storeSalesUploadCommonMetadataType = value;
    }

}
