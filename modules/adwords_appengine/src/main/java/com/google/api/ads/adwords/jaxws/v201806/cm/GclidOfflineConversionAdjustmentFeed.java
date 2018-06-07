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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A conversion adjustment record for conversions uploaded with
 *             gclid and conversion occurrence time.
 *             Inherits from abstract class OfflineConversionAdjustmentFeed.
 *           
 * 
 * <p>Java class for GclidOfflineConversionAdjustmentFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GclidOfflineConversionAdjustmentFeed">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201806}OfflineConversionAdjustmentFeed">
 *       &lt;sequence>
 *         &lt;element name="googleClickId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GclidOfflineConversionAdjustmentFeed", propOrder = {
    "googleClickId",
    "conversionTime"
})
public class GclidOfflineConversionAdjustmentFeed
    extends OfflineConversionAdjustmentFeed
{

    protected String googleClickId;
    protected String conversionTime;

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

}
