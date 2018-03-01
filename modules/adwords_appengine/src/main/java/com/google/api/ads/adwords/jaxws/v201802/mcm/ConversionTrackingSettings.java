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


package com.google.api.ads.adwords.jaxws.v201802.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A collection of customer-wide settings related to AdWords Conversion Tracking. Settings
 *             that apply at the conversion type level can be accessed and modified though
 *             {@code ConversionTrackerService}.
 *           
 * 
 * <p>Java class for ConversionTrackingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionTrackingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectiveConversionTrackingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usesCrossAccountConversionTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="optimizeOnEstimatedConversions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionTrackingSettings", propOrder = {
    "effectiveConversionTrackingId",
    "usesCrossAccountConversionTracking",
    "optimizeOnEstimatedConversions"
})
public class ConversionTrackingSettings {

    protected Long effectiveConversionTrackingId;
    protected Boolean usesCrossAccountConversionTracking;
    protected Boolean optimizeOnEstimatedConversions;

    /**
     * Gets the value of the effectiveConversionTrackingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEffectiveConversionTrackingId() {
        return effectiveConversionTrackingId;
    }

    /**
     * Sets the value of the effectiveConversionTrackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEffectiveConversionTrackingId(Long value) {
        this.effectiveConversionTrackingId = value;
    }

    /**
     * Gets the value of the usesCrossAccountConversionTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesCrossAccountConversionTracking() {
        return usesCrossAccountConversionTracking;
    }

    /**
     * Sets the value of the usesCrossAccountConversionTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesCrossAccountConversionTracking(Boolean value) {
        this.usesCrossAccountConversionTracking = value;
    }

    /**
     * Gets the value of the optimizeOnEstimatedConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimizeOnEstimatedConversions() {
        return optimizeOnEstimatedConversions;
    }

    /**
     * Sets the value of the optimizeOnEstimatedConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimizeOnEstimatedConversions(Boolean value) {
        this.optimizeOnEstimatedConversions = value;
    }

}
