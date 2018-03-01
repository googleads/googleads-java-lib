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
 *             Signals that a call failed because a measured rate exceeded.
 *           
 * 
 * <p>Java class for RateExceededError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateExceededError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201802}RateExceededError.Reason" minOccurs="0"/>
 *         &lt;element name="rateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retryAfterSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateExceededError", propOrder = {
    "reason",
    "rateName",
    "rateScope",
    "retryAfterSeconds"
})
public class RateExceededError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected RateExceededErrorReason reason;
    protected String rateName;
    protected String rateScope;
    protected Integer retryAfterSeconds;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RateExceededErrorReason }
     *     
     */
    public RateExceededErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateExceededErrorReason }
     *     
     */
    public void setReason(RateExceededErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the rateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateName() {
        return rateName;
    }

    /**
     * Sets the value of the rateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateName(String value) {
        this.rateName = value;
    }

    /**
     * Gets the value of the rateScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateScope() {
        return rateScope;
    }

    /**
     * Sets the value of the rateScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateScope(String value) {
        this.rateScope = value;
    }

    /**
     * Gets the value of the retryAfterSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    /**
     * Sets the value of the retryAfterSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetryAfterSeconds(Integer value) {
        this.retryAfterSeconds = value;
    }

}
