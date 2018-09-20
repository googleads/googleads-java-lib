// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a record in the offline conversion adjustments feed that advertisers upload.
 *             This class is inherited by GclidOfflineConversionAdjustmentFeed and
 *             OrderIdOfflineConversionAdjustmentFeed because advertisers upload conversion name and
 *             either (order id) or (gclid, conversion time) to identify a conversion.
 *           
 * 
 * <p>Java class for OfflineConversionAdjustmentFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineConversionAdjustmentFeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adjustmentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adjustmentType" type="{https://adwords.google.com/api/adwords/cm/v201809}OfflineConversionAdjustmentType" minOccurs="0"/>
 *         &lt;element name="adjustedValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="adjustedValueCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfflineConversionAdjustmentFeed.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionAdjustmentFeed", propOrder = {
    "conversionName",
    "adjustmentTime",
    "adjustmentType",
    "adjustedValue",
    "adjustedValueCurrencyCode",
    "offlineConversionAdjustmentFeedType"
})
@XmlSeeAlso({
    GclidOfflineConversionAdjustmentFeed.class,
    OrderIdOfflineConversionAdjustmentFeed.class
})
public abstract class OfflineConversionAdjustmentFeed {

    protected String conversionName;
    protected String adjustmentTime;
    @XmlSchemaType(name = "string")
    protected OfflineConversionAdjustmentType adjustmentType;
    protected Double adjustedValue;
    protected String adjustedValueCurrencyCode;
    @XmlElement(name = "OfflineConversionAdjustmentFeed.Type")
    protected String offlineConversionAdjustmentFeedType;

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
     * Gets the value of the adjustmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentTime() {
        return adjustmentTime;
    }

    /**
     * Sets the value of the adjustmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentTime(String value) {
        this.adjustmentTime = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineConversionAdjustmentType }
     *     
     */
    public OfflineConversionAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineConversionAdjustmentType }
     *     
     */
    public void setAdjustmentType(OfflineConversionAdjustmentType value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustedValue() {
        return adjustedValue;
    }

    /**
     * Sets the value of the adjustedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustedValue(Double value) {
        this.adjustedValue = value;
    }

    /**
     * Gets the value of the adjustedValueCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedValueCurrencyCode() {
        return adjustedValueCurrencyCode;
    }

    /**
     * Sets the value of the adjustedValueCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedValueCurrencyCode(String value) {
        this.adjustedValueCurrencyCode = value;
    }

    /**
     * Gets the value of the offlineConversionAdjustmentFeedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineConversionAdjustmentFeedType() {
        return offlineConversionAdjustmentFeedType;
    }

    /**
     * Sets the value of the offlineConversionAdjustmentFeedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineConversionAdjustmentFeedType(String value) {
        this.offlineConversionAdjustmentFeedType = value;
    }

}
