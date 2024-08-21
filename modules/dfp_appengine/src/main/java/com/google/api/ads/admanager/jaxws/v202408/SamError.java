// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samErrorType" type="{https://www.google.com/apis/ads/publisher/v202408}SamErrorType" minOccurs="0"/&gt;
 *         &lt;element name="errorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamError", propOrder = {
    "samErrorType",
    "errorDetails"
})
public class SamError {

    @XmlSchemaType(name = "string")
    protected SamErrorType samErrorType;
    protected String errorDetails;

    /**
     * Gets the value of the samErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link SamErrorType }
     *     
     */
    public SamErrorType getSamErrorType() {
        return samErrorType;
    }

    /**
     * Sets the value of the samErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamErrorType }
     *     
     */
    public void setSamErrorType(SamErrorType value) {
        this.samErrorType = value;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDetails(String value) {
        this.errorDetails = value;
    }

}
