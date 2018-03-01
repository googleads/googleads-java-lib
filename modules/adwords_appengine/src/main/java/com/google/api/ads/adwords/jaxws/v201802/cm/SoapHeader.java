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
 *             Defines the required and optional elements within the header of a SOAP request.
 *           
 * 
 * <p>Java class for SoapHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoapHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developerToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="partialFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapHeader", propOrder = {
    "clientCustomerId",
    "developerToken",
    "userAgent",
    "validateOnly",
    "partialFailure"
})
public class SoapHeader {

    protected String clientCustomerId;
    protected String developerToken;
    protected String userAgent;
    protected Boolean validateOnly;
    protected Boolean partialFailure;

    /**
     * Gets the value of the clientCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCustomerId() {
        return clientCustomerId;
    }

    /**
     * Sets the value of the clientCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCustomerId(String value) {
        this.clientCustomerId = value;
    }

    /**
     * Gets the value of the developerToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperToken() {
        return developerToken;
    }

    /**
     * Sets the value of the developerToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperToken(String value) {
        this.developerToken = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the validateOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateOnly() {
        return validateOnly;
    }

    /**
     * Sets the value of the validateOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateOnly(Boolean value) {
        this.validateOnly = value;
    }

    /**
     * Gets the value of the partialFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialFailure() {
        return partialFailure;
    }

    /**
     * Sets the value of the partialFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialFailure(Boolean value) {
        this.partialFailure = value;
    }

}
