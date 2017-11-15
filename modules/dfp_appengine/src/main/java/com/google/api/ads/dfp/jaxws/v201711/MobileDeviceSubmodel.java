// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a mobile device submodel.
 *           
 * 
 * <p>Java class for MobileDeviceSubmodel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceSubmodel">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}Technology">
 *       &lt;sequence>
 *         &lt;element name="mobileDeviceCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deviceManufacturerCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceSubmodel", propOrder = {
    "mobileDeviceCriterionId",
    "deviceManufacturerCriterionId"
})
public class MobileDeviceSubmodel
    extends Technology
{

    protected Long mobileDeviceCriterionId;
    protected Long deviceManufacturerCriterionId;

    /**
     * Gets the value of the mobileDeviceCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileDeviceCriterionId() {
        return mobileDeviceCriterionId;
    }

    /**
     * Sets the value of the mobileDeviceCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileDeviceCriterionId(Long value) {
        this.mobileDeviceCriterionId = value;
    }

    /**
     * Gets the value of the deviceManufacturerCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceManufacturerCriterionId() {
        return deviceManufacturerCriterionId;
    }

    /**
     * Sets the value of the deviceManufacturerCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceManufacturerCriterionId(Long value) {
        this.deviceManufacturerCriterionId = value;
    }

}
