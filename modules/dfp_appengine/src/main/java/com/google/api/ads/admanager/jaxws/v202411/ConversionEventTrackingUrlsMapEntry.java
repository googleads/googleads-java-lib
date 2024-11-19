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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This represents an entry in a map with a key of type ConversionEvent
 *             and value of type TrackingUrls.
 *           
 * 
 * <p>Java class for ConversionEvent_TrackingUrlsMapEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionEvent_TrackingUrlsMapEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{https://www.google.com/apis/ads/publisher/v202411}ConversionEvent" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{https://www.google.com/apis/ads/publisher/v202411}TrackingUrls" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionEvent_TrackingUrlsMapEntry", propOrder = {
    "key",
    "value"
})
public class ConversionEventTrackingUrlsMapEntry {

    @XmlSchemaType(name = "string")
    protected ConversionEvent key;
    protected TrackingUrls value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionEvent }
     *     
     */
    public ConversionEvent getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionEvent }
     *     
     */
    public void setKey(ConversionEvent value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingUrls }
     *     
     */
    public TrackingUrls getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingUrls }
     *     
     */
    public void setValue(TrackingUrls value) {
        this.value = value;
    }

}
