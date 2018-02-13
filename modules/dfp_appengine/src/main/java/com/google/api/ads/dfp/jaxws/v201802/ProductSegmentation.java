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


package com.google.api.ads.dfp.jaxws.v201802;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Segmentations used to create products. Within a product template, for each segmentation,
 *             a product will be created for the combination of all other segments within other segmentations.
 *             <p>
 *             For example, a product with 3 segmentations with only 1 segment for each will produce
 *             {@code 1 x 1 x 1 = 1} product.
 *             A product with 3 segmentations with 2 segments for each will produce {@code 2 x 2 x 2 = 8}
 *             products.
 *           
 * 
 * <p>Java class for ProductSegmentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSegmentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoSegment" type="{https://www.google.com/apis/ads/publisher/v201802}GeoTargeting" minOccurs="0"/>
 *         &lt;element name="adUnitSegments" type="{https://www.google.com/apis/ads/publisher/v201802}AdUnitTargeting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="placementSegment" type="{https://www.google.com/apis/ads/publisher/v201802}PlacementTargeting" minOccurs="0"/>
 *         &lt;element name="customTargetingSegment" type="{https://www.google.com/apis/ads/publisher/v201802}CustomCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userDomainSegment" type="{https://www.google.com/apis/ads/publisher/v201802}UserDomainTargeting" minOccurs="0"/>
 *         &lt;element name="bandwidthSegment" type="{https://www.google.com/apis/ads/publisher/v201802}BandwidthGroupTargeting" minOccurs="0"/>
 *         &lt;element name="browserSegment" type="{https://www.google.com/apis/ads/publisher/v201802}BrowserTargeting" minOccurs="0"/>
 *         &lt;element name="browserLanguageSegment" type="{https://www.google.com/apis/ads/publisher/v201802}BrowserLanguageTargeting" minOccurs="0"/>
 *         &lt;element name="operatingSystemSegment" type="{https://www.google.com/apis/ads/publisher/v201802}OperatingSystemTargeting" minOccurs="0"/>
 *         &lt;element name="operatingSystemVersionSegment" type="{https://www.google.com/apis/ads/publisher/v201802}OperatingSystemVersionTargeting" minOccurs="0"/>
 *         &lt;element name="mobileCarrierSegment" type="{https://www.google.com/apis/ads/publisher/v201802}MobileCarrierTargeting" minOccurs="0"/>
 *         &lt;element name="deviceCapabilitySegment" type="{https://www.google.com/apis/ads/publisher/v201802}DeviceCapabilityTargeting" minOccurs="0"/>
 *         &lt;element name="deviceCategorySegment" type="{https://www.google.com/apis/ads/publisher/v201802}DeviceCategoryTargeting" minOccurs="0"/>
 *         &lt;element name="deviceManufacturerSegment" type="{https://www.google.com/apis/ads/publisher/v201802}DeviceManufacturerTargeting" minOccurs="0"/>
 *         &lt;element name="mobileDeviceSegment" type="{https://www.google.com/apis/ads/publisher/v201802}MobileDeviceTargeting" minOccurs="0"/>
 *         &lt;element name="mobileDeviceSubmodelSegment" type="{https://www.google.com/apis/ads/publisher/v201802}MobileDeviceSubmodelTargeting" minOccurs="0"/>
 *         &lt;element name="sizeSegment" type="{https://www.google.com/apis/ads/publisher/v201802}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mobileApplicationSegment" type="{https://www.google.com/apis/ads/publisher/v201802}MobileApplicationTargeting" minOccurs="0"/>
 *         &lt;element name="videoPositionSegment" type="{https://www.google.com/apis/ads/publisher/v201802}VideoPositionTargeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSegmentation", propOrder = {
    "geoSegment",
    "adUnitSegments",
    "placementSegment",
    "customTargetingSegment",
    "userDomainSegment",
    "bandwidthSegment",
    "browserSegment",
    "browserLanguageSegment",
    "operatingSystemSegment",
    "operatingSystemVersionSegment",
    "mobileCarrierSegment",
    "deviceCapabilitySegment",
    "deviceCategorySegment",
    "deviceManufacturerSegment",
    "mobileDeviceSegment",
    "mobileDeviceSubmodelSegment",
    "sizeSegment",
    "mobileApplicationSegment",
    "videoPositionSegment"
})
public class ProductSegmentation {

    protected GeoTargeting geoSegment;
    protected List<AdUnitTargeting> adUnitSegments;
    protected PlacementTargeting placementSegment;
    protected List<CustomCriteria> customTargetingSegment;
    protected UserDomainTargeting userDomainSegment;
    protected BandwidthGroupTargeting bandwidthSegment;
    protected BrowserTargeting browserSegment;
    protected BrowserLanguageTargeting browserLanguageSegment;
    protected OperatingSystemTargeting operatingSystemSegment;
    protected OperatingSystemVersionTargeting operatingSystemVersionSegment;
    protected MobileCarrierTargeting mobileCarrierSegment;
    protected DeviceCapabilityTargeting deviceCapabilitySegment;
    protected DeviceCategoryTargeting deviceCategorySegment;
    protected DeviceManufacturerTargeting deviceManufacturerSegment;
    protected MobileDeviceTargeting mobileDeviceSegment;
    protected MobileDeviceSubmodelTargeting mobileDeviceSubmodelSegment;
    protected List<CreativePlaceholder> sizeSegment;
    protected MobileApplicationTargeting mobileApplicationSegment;
    protected VideoPositionTargeting videoPositionSegment;

    /**
     * Gets the value of the geoSegment property.
     * 
     * @return
     *     possible object is
     *     {@link GeoTargeting }
     *     
     */
    public GeoTargeting getGeoSegment() {
        return geoSegment;
    }

    /**
     * Sets the value of the geoSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTargeting }
     *     
     */
    public void setGeoSegment(GeoTargeting value) {
        this.geoSegment = value;
    }

    /**
     * Gets the value of the adUnitSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adUnitSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdUnitSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitTargeting }
     * 
     * 
     */
    public List<AdUnitTargeting> getAdUnitSegments() {
        if (adUnitSegments == null) {
            adUnitSegments = new ArrayList<AdUnitTargeting>();
        }
        return this.adUnitSegments;
    }

    /**
     * Gets the value of the placementSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementTargeting }
     *     
     */
    public PlacementTargeting getPlacementSegment() {
        return placementSegment;
    }

    /**
     * Sets the value of the placementSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementTargeting }
     *     
     */
    public void setPlacementSegment(PlacementTargeting value) {
        this.placementSegment = value;
    }

    /**
     * Gets the value of the customTargetingSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTargetingSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTargetingSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomCriteria }
     * 
     * 
     */
    public List<CustomCriteria> getCustomTargetingSegment() {
        if (customTargetingSegment == null) {
            customTargetingSegment = new ArrayList<CustomCriteria>();
        }
        return this.customTargetingSegment;
    }

    /**
     * Gets the value of the userDomainSegment property.
     * 
     * @return
     *     possible object is
     *     {@link UserDomainTargeting }
     *     
     */
    public UserDomainTargeting getUserDomainSegment() {
        return userDomainSegment;
    }

    /**
     * Sets the value of the userDomainSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDomainTargeting }
     *     
     */
    public void setUserDomainSegment(UserDomainTargeting value) {
        this.userDomainSegment = value;
    }

    /**
     * Gets the value of the bandwidthSegment property.
     * 
     * @return
     *     possible object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public BandwidthGroupTargeting getBandwidthSegment() {
        return bandwidthSegment;
    }

    /**
     * Sets the value of the bandwidthSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandwidthGroupTargeting }
     *     
     */
    public void setBandwidthSegment(BandwidthGroupTargeting value) {
        this.bandwidthSegment = value;
    }

    /**
     * Gets the value of the browserSegment property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserTargeting }
     *     
     */
    public BrowserTargeting getBrowserSegment() {
        return browserSegment;
    }

    /**
     * Sets the value of the browserSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserTargeting }
     *     
     */
    public void setBrowserSegment(BrowserTargeting value) {
        this.browserSegment = value;
    }

    /**
     * Gets the value of the browserLanguageSegment property.
     * 
     * @return
     *     possible object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public BrowserLanguageTargeting getBrowserLanguageSegment() {
        return browserLanguageSegment;
    }

    /**
     * Sets the value of the browserLanguageSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowserLanguageTargeting }
     *     
     */
    public void setBrowserLanguageSegment(BrowserLanguageTargeting value) {
        this.browserLanguageSegment = value;
    }

    /**
     * Gets the value of the operatingSystemSegment property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public OperatingSystemTargeting getOperatingSystemSegment() {
        return operatingSystemSegment;
    }

    /**
     * Sets the value of the operatingSystemSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemTargeting }
     *     
     */
    public void setOperatingSystemSegment(OperatingSystemTargeting value) {
        this.operatingSystemSegment = value;
    }

    /**
     * Gets the value of the operatingSystemVersionSegment property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemVersionTargeting }
     *     
     */
    public OperatingSystemVersionTargeting getOperatingSystemVersionSegment() {
        return operatingSystemVersionSegment;
    }

    /**
     * Sets the value of the operatingSystemVersionSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemVersionTargeting }
     *     
     */
    public void setOperatingSystemVersionSegment(OperatingSystemVersionTargeting value) {
        this.operatingSystemVersionSegment = value;
    }

    /**
     * Gets the value of the mobileCarrierSegment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCarrierTargeting }
     *     
     */
    public MobileCarrierTargeting getMobileCarrierSegment() {
        return mobileCarrierSegment;
    }

    /**
     * Sets the value of the mobileCarrierSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCarrierTargeting }
     *     
     */
    public void setMobileCarrierSegment(MobileCarrierTargeting value) {
        this.mobileCarrierSegment = value;
    }

    /**
     * Gets the value of the deviceCapabilitySegment property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilityTargeting }
     *     
     */
    public DeviceCapabilityTargeting getDeviceCapabilitySegment() {
        return deviceCapabilitySegment;
    }

    /**
     * Sets the value of the deviceCapabilitySegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilityTargeting }
     *     
     */
    public void setDeviceCapabilitySegment(DeviceCapabilityTargeting value) {
        this.deviceCapabilitySegment = value;
    }

    /**
     * Gets the value of the deviceCategorySegment property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCategoryTargeting }
     *     
     */
    public DeviceCategoryTargeting getDeviceCategorySegment() {
        return deviceCategorySegment;
    }

    /**
     * Sets the value of the deviceCategorySegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCategoryTargeting }
     *     
     */
    public void setDeviceCategorySegment(DeviceCategoryTargeting value) {
        this.deviceCategorySegment = value;
    }

    /**
     * Gets the value of the deviceManufacturerSegment property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManufacturerTargeting }
     *     
     */
    public DeviceManufacturerTargeting getDeviceManufacturerSegment() {
        return deviceManufacturerSegment;
    }

    /**
     * Sets the value of the deviceManufacturerSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManufacturerTargeting }
     *     
     */
    public void setDeviceManufacturerSegment(DeviceManufacturerTargeting value) {
        this.deviceManufacturerSegment = value;
    }

    /**
     * Gets the value of the mobileDeviceSegment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceTargeting }
     *     
     */
    public MobileDeviceTargeting getMobileDeviceSegment() {
        return mobileDeviceSegment;
    }

    /**
     * Sets the value of the mobileDeviceSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceTargeting }
     *     
     */
    public void setMobileDeviceSegment(MobileDeviceTargeting value) {
        this.mobileDeviceSegment = value;
    }

    /**
     * Gets the value of the mobileDeviceSubmodelSegment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceSubmodelTargeting }
     *     
     */
    public MobileDeviceSubmodelTargeting getMobileDeviceSubmodelSegment() {
        return mobileDeviceSubmodelSegment;
    }

    /**
     * Sets the value of the mobileDeviceSubmodelSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceSubmodelTargeting }
     *     
     */
    public void setMobileDeviceSubmodelSegment(MobileDeviceSubmodelTargeting value) {
        this.mobileDeviceSubmodelSegment = value;
    }

    /**
     * Gets the value of the sizeSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativePlaceholder }
     * 
     * 
     */
    public List<CreativePlaceholder> getSizeSegment() {
        if (sizeSegment == null) {
            sizeSegment = new ArrayList<CreativePlaceholder>();
        }
        return this.sizeSegment;
    }

    /**
     * Gets the value of the mobileApplicationSegment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileApplicationTargeting }
     *     
     */
    public MobileApplicationTargeting getMobileApplicationSegment() {
        return mobileApplicationSegment;
    }

    /**
     * Sets the value of the mobileApplicationSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileApplicationTargeting }
     *     
     */
    public void setMobileApplicationSegment(MobileApplicationTargeting value) {
        this.mobileApplicationSegment = value;
    }

    /**
     * Gets the value of the videoPositionSegment property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPositionTargeting }
     *     
     */
    public VideoPositionTargeting getVideoPositionSegment() {
        return videoPositionSegment;
    }

    /**
     * Sets the value of the videoPositionSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPositionTargeting }
     *     
     */
    public void setVideoPositionSegment(VideoPositionTargeting value) {
        this.videoPositionSegment = value;
    }

}
