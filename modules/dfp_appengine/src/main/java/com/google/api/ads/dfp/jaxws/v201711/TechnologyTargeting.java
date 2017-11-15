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
 *             Provides {@link LineItem} objects the ability to target or exclude
 *             technologies.
 *           
 * 
 * <p>Java class for TechnologyTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnologyTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bandwidthGroupTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}BandwidthGroupTargeting" minOccurs="0"/>
 *         &lt;element name="browserTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}BrowserTargeting" minOccurs="0"/>
 *         &lt;element name="browserLanguageTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}BrowserLanguageTargeting" minOccurs="0"/>
 *         &lt;element name="deviceCapabilityTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}DeviceCapabilityTargeting" minOccurs="0"/>
 *         &lt;element name="deviceCategoryTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}DeviceCategoryTargeting" minOccurs="0"/>
 *         &lt;element name="deviceManufacturerTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}DeviceManufacturerTargeting" minOccurs="0"/>
 *         &lt;element name="mobileCarrierTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}MobileCarrierTargeting" minOccurs="0"/>
 *         &lt;element name="mobileDeviceTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}MobileDeviceTargeting" minOccurs="0"/>
 *         &lt;element name="mobileDeviceSubmodelTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}MobileDeviceSubmodelTargeting" minOccurs="0"/>
 *         &lt;element name="operatingSystemTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}OperatingSystemTargeting" minOccurs="0"/>
 *         &lt;element name="operatingSystemVersionTargeting" type="{https://www.google.com/apis/ads/publisher/v201711}OperatingSystemVersionTargeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnologyTargeting", propOrder = {
    "bandwidthGroupTargeting",
    "browserTargeting",
    "browserLanguageTargeting",
    "deviceCapabilityTargeting",
    "deviceCategoryTargeting",
    "deviceManufacturerTargeting",
    "mobileCarrierTargeting",
    "mobileDeviceTargeting",
    "mobileDeviceSubmodelTargeting",
    "operatingSystemTargeting",
    "operatingSystemVersionTargeting"
})
public class TechnologyTargeting {

    protected BandwidthGroupTargeting bandwidthGroupTargeting;
    protected BrowserTargeting browserTargeting;
    protected BrowserLanguageTargeting browserLanguageTargeting;
    protected DeviceCapabilityTargeting deviceCapabilityTargeting;
    protected DeviceCategoryTargeting deviceCategoryTargeting;
    protected DeviceManufacturerTargeting deviceManufacturerTargeting;
    protected MobileCarrierTargeting mobileCarrierTargeting;
    protected MobileDeviceTargeting mobileDeviceTargeting;
    protected MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting;
    protected OperatingSystemTargeting operatingSystemTargeting;
    protected OperatingSystemVersionTargeting operatingSystemVersionTargeting;

    /**
     * Gets the value of the bandwidthGroupTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public BandwidthGroupTargeting getBandwidthGroupTargeting() {
        return bandwidthGroupTargeting;
    }

    /**
     * Sets the value of the bandwidthGroupTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public void setBandwidthGroupTargeting(BandwidthGroupTargeting value) {
        this.bandwidthGroupTargeting = value;
    }

    /**
     * Gets the value of the browserTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserTargeting }
     *     
     */
    public BrowserTargeting getBrowserTargeting() {
        return browserTargeting;
    }

    /**
     * Sets the value of the browserTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserTargeting }
     *     
     */
    public void setBrowserTargeting(BrowserTargeting value) {
        this.browserTargeting = value;
    }

    /**
     * Gets the value of the browserLanguageTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public BrowserLanguageTargeting getBrowserLanguageTargeting() {
        return browserLanguageTargeting;
    }

    /**
     * Sets the value of the browserLanguageTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public void setBrowserLanguageTargeting(BrowserLanguageTargeting value) {
        this.browserLanguageTargeting = value;
    }

    /**
     * Gets the value of the deviceCapabilityTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilityTargeting }
     *     
     */
    public DeviceCapabilityTargeting getDeviceCapabilityTargeting() {
        return deviceCapabilityTargeting;
    }

    /**
     * Sets the value of the deviceCapabilityTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilityTargeting }
     *     
     */
    public void setDeviceCapabilityTargeting(DeviceCapabilityTargeting value) {
        this.deviceCapabilityTargeting = value;
    }

    /**
     * Gets the value of the deviceCategoryTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCategoryTargeting }
     *     
     */
    public DeviceCategoryTargeting getDeviceCategoryTargeting() {
        return deviceCategoryTargeting;
    }

    /**
     * Sets the value of the deviceCategoryTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCategoryTargeting }
     *     
     */
    public void setDeviceCategoryTargeting(DeviceCategoryTargeting value) {
        this.deviceCategoryTargeting = value;
    }

    /**
     * Gets the value of the deviceManufacturerTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManufacturerTargeting }
     *     
     */
    public DeviceManufacturerTargeting getDeviceManufacturerTargeting() {
        return deviceManufacturerTargeting;
    }

    /**
     * Sets the value of the deviceManufacturerTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManufacturerTargeting }
     *     
     */
    public void setDeviceManufacturerTargeting(DeviceManufacturerTargeting value) {
        this.deviceManufacturerTargeting = value;
    }

    /**
     * Gets the value of the mobileCarrierTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCarrierTargeting }
     *     
     */
    public MobileCarrierTargeting getMobileCarrierTargeting() {
        return mobileCarrierTargeting;
    }

    /**
     * Sets the value of the mobileCarrierTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCarrierTargeting }
     *     
     */
    public void setMobileCarrierTargeting(MobileCarrierTargeting value) {
        this.mobileCarrierTargeting = value;
    }

    /**
     * Gets the value of the mobileDeviceTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceTargeting }
     *     
     */
    public MobileDeviceTargeting getMobileDeviceTargeting() {
        return mobileDeviceTargeting;
    }

    /**
     * Sets the value of the mobileDeviceTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceTargeting }
     *     
     */
    public void setMobileDeviceTargeting(MobileDeviceTargeting value) {
        this.mobileDeviceTargeting = value;
    }

    /**
     * Gets the value of the mobileDeviceSubmodelTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceSubmodelTargeting }
     *     
     */
    public MobileDeviceSubmodelTargeting getMobileDeviceSubmodelTargeting() {
        return mobileDeviceSubmodelTargeting;
    }

    /**
     * Sets the value of the mobileDeviceSubmodelTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceSubmodelTargeting }
     *     
     */
    public void setMobileDeviceSubmodelTargeting(MobileDeviceSubmodelTargeting value) {
        this.mobileDeviceSubmodelTargeting = value;
    }

    /**
     * Gets the value of the operatingSystemTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public OperatingSystemTargeting getOperatingSystemTargeting() {
        return operatingSystemTargeting;
    }

    /**
     * Sets the value of the operatingSystemTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public void setOperatingSystemTargeting(OperatingSystemTargeting value) {
        this.operatingSystemTargeting = value;
    }

    /**
     * Gets the value of the operatingSystemVersionTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemVersionTargeting }
     *     
     */
    public OperatingSystemVersionTargeting getOperatingSystemVersionTargeting() {
        return operatingSystemVersionTargeting;
    }

    /**
     * Sets the value of the operatingSystemVersionTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemVersionTargeting }
     *     
     */
    public void setOperatingSystemVersionTargeting(OperatingSystemVersionTargeting value) {
        this.operatingSystemVersionTargeting = value;
    }

}
