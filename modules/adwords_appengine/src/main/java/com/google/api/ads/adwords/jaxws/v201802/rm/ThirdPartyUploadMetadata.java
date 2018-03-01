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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Metadata for a Third party Store Sales upload.
 *             Note: This is a whitelisted only product. Please contact your Google business development
 *             representative for details on upload configuration.
 *           
 * 
 * <p>Java class for ThirdPartyUploadMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyUploadMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201802}StoreSalesUploadCommonMetadata">
 *       &lt;sequence>
 *         &lt;element name="advertiserUploadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validTransactionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="partnerMatchRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="partnerUploadRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bridgeMapVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyUploadMetadata", propOrder = {
    "advertiserUploadTime",
    "validTransactionRate",
    "partnerMatchRate",
    "partnerUploadRate",
    "bridgeMapVersionId",
    "partnerId"
})
public class ThirdPartyUploadMetadata
    extends StoreSalesUploadCommonMetadata
{

    protected String advertiserUploadTime;
    protected Double validTransactionRate;
    protected Double partnerMatchRate;
    protected Double partnerUploadRate;
    protected String bridgeMapVersionId;
    protected Integer partnerId;

    /**
     * Gets the value of the advertiserUploadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiserUploadTime() {
        return advertiserUploadTime;
    }

    /**
     * Sets the value of the advertiserUploadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiserUploadTime(String value) {
        this.advertiserUploadTime = value;
    }

    /**
     * Gets the value of the validTransactionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValidTransactionRate() {
        return validTransactionRate;
    }

    /**
     * Sets the value of the validTransactionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValidTransactionRate(Double value) {
        this.validTransactionRate = value;
    }

    /**
     * Gets the value of the partnerMatchRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPartnerMatchRate() {
        return partnerMatchRate;
    }

    /**
     * Sets the value of the partnerMatchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPartnerMatchRate(Double value) {
        this.partnerMatchRate = value;
    }

    /**
     * Gets the value of the partnerUploadRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPartnerUploadRate() {
        return partnerUploadRate;
    }

    /**
     * Sets the value of the partnerUploadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPartnerUploadRate(Double value) {
        this.partnerUploadRate = value;
    }

    /**
     * Gets the value of the bridgeMapVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgeMapVersionId() {
        return bridgeMapVersionId;
    }

    /**
     * Sets the value of the bridgeMapVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgeMapVersionId(String value) {
        this.bridgeMapVersionId = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartnerId(Integer value) {
        this.partnerId = value;
    }

}
