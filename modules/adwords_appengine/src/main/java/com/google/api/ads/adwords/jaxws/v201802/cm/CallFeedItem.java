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
 *             Represents a Call extension.
 *           
 * 
 * <p>Java class for CallFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="callPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callConversionType" type="{https://adwords.google.com/api/adwords/cm/v201802}CallConversionType" minOccurs="0"/>
 *         &lt;element name="disableCallConversionTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallFeedItem", propOrder = {
    "callPhoneNumber",
    "callCountryCode",
    "callTracking",
    "callConversionType",
    "disableCallConversionTracking"
})
public class CallFeedItem
    extends ExtensionFeedItem
{

    protected String callPhoneNumber;
    protected String callCountryCode;
    protected Boolean callTracking;
    protected CallConversionType callConversionType;
    protected Boolean disableCallConversionTracking;

    /**
     * Gets the value of the callPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPhoneNumber() {
        return callPhoneNumber;
    }

    /**
     * Sets the value of the callPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPhoneNumber(String value) {
        this.callPhoneNumber = value;
    }

    /**
     * Gets the value of the callCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCountryCode() {
        return callCountryCode;
    }

    /**
     * Sets the value of the callCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCountryCode(String value) {
        this.callCountryCode = value;
    }

    /**
     * Gets the value of the callTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallTracking() {
        return callTracking;
    }

    /**
     * Sets the value of the callTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallTracking(Boolean value) {
        this.callTracking = value;
    }

    /**
     * Gets the value of the callConversionType property.
     * 
     * @return
     *     possible object is
     *     {@link CallConversionType }
     *     
     */
    public CallConversionType getCallConversionType() {
        return callConversionType;
    }

    /**
     * Sets the value of the callConversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallConversionType }
     *     
     */
    public void setCallConversionType(CallConversionType value) {
        this.callConversionType = value;
    }

    /**
     * Gets the value of the disableCallConversionTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableCallConversionTracking() {
        return disableCallConversionTracking;
    }

    /**
     * Sets the value of the disableCallConversionTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableCallConversionTracking(Boolean value) {
        this.disableCallConversionTracking = value;
    }

}
