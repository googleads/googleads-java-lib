// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A conversion tracker created through AdWords Conversion Tracking.
 *           
 * 
 * <p>Java class for AdWordsConversionTracker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdWordsConversionTracker">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="snippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textFormat" type="{https://adwords.google.com/api/adwords/cm/v201607}AdWordsConversionTracker.TextFormat" minOccurs="0"/>
 *         &lt;element name="conversionPageLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingCodeType" type="{https://adwords.google.com/api/adwords/cm/v201607}AdWordsConversionTracker.TrackingCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdWordsConversionTracker", propOrder = {
    "snippet",
    "textFormat",
    "conversionPageLanguage",
    "backgroundColor",
    "trackingCodeType"
})
public class AdWordsConversionTracker
    extends ConversionTracker
{

    protected String snippet;
    @XmlSchemaType(name = "string")
    protected AdWordsConversionTrackerTextFormat textFormat;
    protected String conversionPageLanguage;
    protected String backgroundColor;
    @XmlSchemaType(name = "string")
    protected AdWordsConversionTrackerTrackingCodeType trackingCodeType;

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippet(String value) {
        this.snippet = value;
    }

    /**
     * Gets the value of the textFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AdWordsConversionTrackerTextFormat }
     *     
     */
    public AdWordsConversionTrackerTextFormat getTextFormat() {
        return textFormat;
    }

    /**
     * Sets the value of the textFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdWordsConversionTrackerTextFormat }
     *     
     */
    public void setTextFormat(AdWordsConversionTrackerTextFormat value) {
        this.textFormat = value;
    }

    /**
     * Gets the value of the conversionPageLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionPageLanguage() {
        return conversionPageLanguage;
    }

    /**
     * Sets the value of the conversionPageLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionPageLanguage(String value) {
        this.conversionPageLanguage = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the trackingCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link AdWordsConversionTrackerTrackingCodeType }
     *     
     */
    public AdWordsConversionTrackerTrackingCodeType getTrackingCodeType() {
        return trackingCodeType;
    }

    /**
     * Sets the value of the trackingCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdWordsConversionTrackerTrackingCodeType }
     *     
     */
    public void setTrackingCodeType(AdWordsConversionTrackerTrackingCodeType value) {
        this.trackingCodeType = value;
    }

}
