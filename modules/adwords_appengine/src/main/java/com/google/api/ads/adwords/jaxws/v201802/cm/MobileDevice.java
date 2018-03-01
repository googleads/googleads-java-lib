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
 *             Represents a Mobile Device Criterion.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for MobileDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{https://adwords.google.com/api/adwords/cm/v201802}MobileDevice.DeviceType" minOccurs="0"/>
 *         &lt;element name="operatingSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDevice", propOrder = {
    "deviceName",
    "manufacturerName",
    "deviceType",
    "operatingSystemName"
})
public class MobileDevice
    extends Criterion
{

    protected String deviceName;
    protected String manufacturerName;
    @XmlSchemaType(name = "string")
    protected MobileDeviceDeviceType deviceType;
    protected String operatingSystemName;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceDeviceType }
     *     
     */
    public MobileDeviceDeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceDeviceType }
     *     
     */
    public void setDeviceType(MobileDeviceDeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the operatingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    /**
     * Sets the value of the operatingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystemName(String value) {
        this.operatingSystemName = value;
    }

}
