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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a CallOnlyAd.
 *             
 *             <p class="caution"><b>Caution:</b> Call only ads do not use {@link #url url},
 *             {@link #finalUrls finalUrls}, {@link #finalMobileUrls finalMobileUrls},
 *             {@link #finalAppUrls finalAppUrls}, {@link #urlCustomParameters urlCustomParameters},
 *             or {@link #trackingUrlTemplate trackingUrlTemplate};
 *             setting these fields on a call only ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for CallOnlyAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallOnlyAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callTracked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disableCallConversion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conversionTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phoneNumberVerificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallOnlyAd", propOrder = {
    "countryCode",
    "phoneNumber",
    "businessName",
    "description1",
    "description2",
    "callTracked",
    "disableCallConversion",
    "conversionTypeId",
    "phoneNumberVerificationUrl"
})
public class CallOnlyAd
    extends Ad
{

    protected String countryCode;
    protected String phoneNumber;
    protected String businessName;
    protected String description1;
    protected String description2;
    protected Boolean callTracked;
    protected Boolean disableCallConversion;
    protected Long conversionTypeId;
    protected String phoneNumberVerificationUrl;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the description1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Sets the value of the description1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the callTracked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallTracked() {
        return callTracked;
    }

    /**
     * Sets the value of the callTracked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallTracked(Boolean value) {
        this.callTracked = value;
    }

    /**
     * Gets the value of the disableCallConversion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableCallConversion() {
        return disableCallConversion;
    }

    /**
     * Sets the value of the disableCallConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableCallConversion(Boolean value) {
        this.disableCallConversion = value;
    }

    /**
     * Gets the value of the conversionTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionTypeId() {
        return conversionTypeId;
    }

    /**
     * Sets the value of the conversionTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionTypeId(Long value) {
        this.conversionTypeId = value;
    }

    /**
     * Gets the value of the phoneNumberVerificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberVerificationUrl() {
        return phoneNumberVerificationUrl;
    }

    /**
     * Sets the value of the phoneNumberVerificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberVerificationUrl(String value) {
        this.phoneNumberVerificationUrl = value;
    }

}
