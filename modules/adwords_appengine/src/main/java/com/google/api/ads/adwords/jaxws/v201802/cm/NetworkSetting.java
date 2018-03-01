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
 *             Network settings for a Campaign.
 *           
 * 
 * <p>Java class for NetworkSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetGoogleSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetSearchNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetContentNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetPartnerSearchNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSetting", propOrder = {
    "targetGoogleSearch",
    "targetSearchNetwork",
    "targetContentNetwork",
    "targetPartnerSearchNetwork"
})
public class NetworkSetting {

    protected Boolean targetGoogleSearch;
    protected Boolean targetSearchNetwork;
    protected Boolean targetContentNetwork;
    protected Boolean targetPartnerSearchNetwork;

    /**
     * Gets the value of the targetGoogleSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetGoogleSearch() {
        return targetGoogleSearch;
    }

    /**
     * Sets the value of the targetGoogleSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetGoogleSearch(Boolean value) {
        this.targetGoogleSearch = value;
    }

    /**
     * Gets the value of the targetSearchNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetSearchNetwork() {
        return targetSearchNetwork;
    }

    /**
     * Sets the value of the targetSearchNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetSearchNetwork(Boolean value) {
        this.targetSearchNetwork = value;
    }

    /**
     * Gets the value of the targetContentNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetContentNetwork() {
        return targetContentNetwork;
    }

    /**
     * Sets the value of the targetContentNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetContentNetwork(Boolean value) {
        this.targetContentNetwork = value;
    }

    /**
     * Gets the value of the targetPartnerSearchNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetPartnerSearchNetwork() {
        return targetPartnerSearchNetwork;
    }

    /**
     * Sets the value of the targetPartnerSearchNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetPartnerSearchNetwork(Boolean value) {
        this.targetPartnerSearchNetwork = value;
    }

}
