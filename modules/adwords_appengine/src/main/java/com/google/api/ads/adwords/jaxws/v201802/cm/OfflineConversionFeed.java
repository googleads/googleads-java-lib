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
 *             Represents an entire record in the offline conversions feed that the advertiser uploads.
 *           
 * 
 * <p>Java class for OfflineConversionFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineConversionFeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="googleClickId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="conversionCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalAttributionCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="externalAttributionModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionFeed", propOrder = {
    "googleClickId",
    "conversionName",
    "conversionTime",
    "conversionValue",
    "conversionCurrencyCode",
    "externalAttributionCredit",
    "externalAttributionModel"
})
public class OfflineConversionFeed {

    protected String googleClickId;
    protected String conversionName;
    protected String conversionTime;
    protected Double conversionValue;
    protected String conversionCurrencyCode;
    protected Double externalAttributionCredit;
    protected String externalAttributionModel;

    /**
     * Gets the value of the googleClickId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleClickId() {
        return googleClickId;
    }

    /**
     * Sets the value of the googleClickId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleClickId(String value) {
        this.googleClickId = value;
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

    /**
     * Gets the value of the conversionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionTime() {
        return conversionTime;
    }

    /**
     * Sets the value of the conversionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionTime(String value) {
        this.conversionTime = value;
    }

    /**
     * Gets the value of the conversionValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionValue() {
        return conversionValue;
    }

    /**
     * Sets the value of the conversionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionValue(Double value) {
        this.conversionValue = value;
    }

    /**
     * Gets the value of the conversionCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionCurrencyCode() {
        return conversionCurrencyCode;
    }

    /**
     * Sets the value of the conversionCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionCurrencyCode(String value) {
        this.conversionCurrencyCode = value;
    }

    /**
     * Gets the value of the externalAttributionCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExternalAttributionCredit() {
        return externalAttributionCredit;
    }

    /**
     * Sets the value of the externalAttributionCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExternalAttributionCredit(Double value) {
        this.externalAttributionCredit = value;
    }

    /**
     * Gets the value of the externalAttributionModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAttributionModel() {
        return externalAttributionModel;
    }

    /**
     * Sets the value of the externalAttributionModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAttributionModel(String value) {
        this.externalAttributionModel = value;
    }

}
