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

/**
 * ProductSegmentation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Segmentations used to create products. Within a product template,
 * for each segmentation,
 *             a product will be created for the combination of all other
 * segments within other segmentations.
 *             <p>
 *             For example, a product with 3 segmentations with only
 * 1 segment for each will produce
 *             {@code 1 x 1 x 1 = 1} product.
 *             A product with 3 segmentations with 2 segments for each
 * will produce {@code 2 x 2 x 2 = 8}
 *             products.
 */
public class ProductSegmentation  implements java.io.Serializable {
    /* The geographic segmentation. Segments should be set on the
     *                 {@link GeoTargeting#targetedLocations} field.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.GeoTargeting geoSegment;

    /* The ad unit targeting segmentation. For each ad unit segment,
     * {@link AdUnitTargeting#includeDescendants} must be true.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] adUnitSegments;

    /* The placement targeting segmentation.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.PlacementTargeting placementSegment;

    /* The custom targeting segmentation.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.CustomCriteria[] customTargetingSegment;

    /* The user domain segmentation. {@link UserDomainTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.UserDomainTargeting userDomainSegment;

    /* The bandwidth segmentation. {@link BandwidthGroupTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting bandwidthSegment;

    /* The browser segmentation. {@link BrowserTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.BrowserTargeting browserSegment;

    /* The browser language segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting browserLanguageSegment;

    /* The operating system segmentation. {@link OperatingSystemTargeting#isTargeted}
     * must be {@code true}.
     *                 We only allow segment by Operating_System, not Operating_System_Version
     * (will be ignored).
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting operatingSystemSegment;

    /* The operating system version segmentation. {@link OperatingSystemVersionTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting operatingSystemVersionSegment;

    /* The mobile carrier segmentation. {@link MobileCarrierTargeting#isTargeted}
     * must be {@code
     *                 true}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting mobileCarrierSegment;

    /* The device capability segmentation. {@link
     *                 DeviceCapabilityTargeting#excludedDeviceCapabilities}
     * must be empty or null.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting deviceCapabilitySegment;

    /* The device category segmentation. {@link DeviceCategoryTargeting#excludedDeviceCategories}
     * must
     *                 be empty or null.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting deviceCategorySegment;

    /* The device manufacturer segmentation. {@link DeviceFamilyTargeting#isTargeted}
     * must be {@code
     *                 true}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting deviceManufacturerSegment;

    /* The mobile device segmentation. {@link MobileDeviceTargeting#excludedMobileDevices}
     * must be
     *                 empty or null.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting mobileDeviceSegment;

    /* The mobile device submodel segmentation. {@link
     *                 MobileDeviceSubmodelTargeting#excludedMobileDeviceSubmodels}
     * must be empty or null. */
    private com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting mobileDeviceSubmodelSegment;

    /* The creative size segmentation.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] sizeSegment;

    /* The mobile application segmentation.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.MobileApplicationTargeting mobileApplicationSegment;

    /* The video position segmentation.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.VideoPositionTargeting videoPositionSegment;

    public ProductSegmentation() {
    }

    public ProductSegmentation(
           com.google.api.ads.dfp.axis.v201802.GeoTargeting geoSegment,
           com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] adUnitSegments,
           com.google.api.ads.dfp.axis.v201802.PlacementTargeting placementSegment,
           com.google.api.ads.dfp.axis.v201802.CustomCriteria[] customTargetingSegment,
           com.google.api.ads.dfp.axis.v201802.UserDomainTargeting userDomainSegment,
           com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting bandwidthSegment,
           com.google.api.ads.dfp.axis.v201802.BrowserTargeting browserSegment,
           com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting browserLanguageSegment,
           com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting operatingSystemSegment,
           com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting operatingSystemVersionSegment,
           com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting mobileCarrierSegment,
           com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting deviceCapabilitySegment,
           com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting deviceCategorySegment,
           com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting deviceManufacturerSegment,
           com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting mobileDeviceSegment,
           com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting mobileDeviceSubmodelSegment,
           com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] sizeSegment,
           com.google.api.ads.dfp.axis.v201802.MobileApplicationTargeting mobileApplicationSegment,
           com.google.api.ads.dfp.axis.v201802.VideoPositionTargeting videoPositionSegment) {
           this.geoSegment = geoSegment;
           this.adUnitSegments = adUnitSegments;
           this.placementSegment = placementSegment;
           this.customTargetingSegment = customTargetingSegment;
           this.userDomainSegment = userDomainSegment;
           this.bandwidthSegment = bandwidthSegment;
           this.browserSegment = browserSegment;
           this.browserLanguageSegment = browserLanguageSegment;
           this.operatingSystemSegment = operatingSystemSegment;
           this.operatingSystemVersionSegment = operatingSystemVersionSegment;
           this.mobileCarrierSegment = mobileCarrierSegment;
           this.deviceCapabilitySegment = deviceCapabilitySegment;
           this.deviceCategorySegment = deviceCategorySegment;
           this.deviceManufacturerSegment = deviceManufacturerSegment;
           this.mobileDeviceSegment = mobileDeviceSegment;
           this.mobileDeviceSubmodelSegment = mobileDeviceSubmodelSegment;
           this.sizeSegment = sizeSegment;
           this.mobileApplicationSegment = mobileApplicationSegment;
           this.videoPositionSegment = videoPositionSegment;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adUnitSegments", getAdUnitSegments())
            .add("bandwidthSegment", getBandwidthSegment())
            .add("browserLanguageSegment", getBrowserLanguageSegment())
            .add("browserSegment", getBrowserSegment())
            .add("customTargetingSegment", getCustomTargetingSegment())
            .add("deviceCapabilitySegment", getDeviceCapabilitySegment())
            .add("deviceCategorySegment", getDeviceCategorySegment())
            .add("deviceManufacturerSegment", getDeviceManufacturerSegment())
            .add("geoSegment", getGeoSegment())
            .add("mobileApplicationSegment", getMobileApplicationSegment())
            .add("mobileCarrierSegment", getMobileCarrierSegment())
            .add("mobileDeviceSegment", getMobileDeviceSegment())
            .add("mobileDeviceSubmodelSegment", getMobileDeviceSubmodelSegment())
            .add("operatingSystemSegment", getOperatingSystemSegment())
            .add("operatingSystemVersionSegment", getOperatingSystemVersionSegment())
            .add("placementSegment", getPlacementSegment())
            .add("sizeSegment", getSizeSegment())
            .add("userDomainSegment", getUserDomainSegment())
            .add("videoPositionSegment", getVideoPositionSegment())
            .toString();
    }

    /**
     * Gets the geoSegment value for this ProductSegmentation.
     * 
     * @return geoSegment   * The geographic segmentation. Segments should be set on the
     *                 {@link GeoTargeting#targetedLocations} field.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.GeoTargeting getGeoSegment() {
        return geoSegment;
    }


    /**
     * Sets the geoSegment value for this ProductSegmentation.
     * 
     * @param geoSegment   * The geographic segmentation. Segments should be set on the
     *                 {@link GeoTargeting#targetedLocations} field.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setGeoSegment(com.google.api.ads.dfp.axis.v201802.GeoTargeting geoSegment) {
        this.geoSegment = geoSegment;
    }


    /**
     * Gets the adUnitSegments value for this ProductSegmentation.
     * 
     * @return adUnitSegments   * The ad unit targeting segmentation. For each ad unit segment,
     * {@link AdUnitTargeting#includeDescendants} must be true.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] getAdUnitSegments() {
        return adUnitSegments;
    }


    /**
     * Sets the adUnitSegments value for this ProductSegmentation.
     * 
     * @param adUnitSegments   * The ad unit targeting segmentation. For each ad unit segment,
     * {@link AdUnitTargeting#includeDescendants} must be true.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setAdUnitSegments(com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] adUnitSegments) {
        this.adUnitSegments = adUnitSegments;
    }

    public com.google.api.ads.dfp.axis.v201802.AdUnitTargeting getAdUnitSegments(int i) {
        return this.adUnitSegments[i];
    }

    public void setAdUnitSegments(int i, com.google.api.ads.dfp.axis.v201802.AdUnitTargeting _value) {
        this.adUnitSegments[i] = _value;
    }


    /**
     * Gets the placementSegment value for this ProductSegmentation.
     * 
     * @return placementSegment   * The placement targeting segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.PlacementTargeting getPlacementSegment() {
        return placementSegment;
    }


    /**
     * Sets the placementSegment value for this ProductSegmentation.
     * 
     * @param placementSegment   * The placement targeting segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setPlacementSegment(com.google.api.ads.dfp.axis.v201802.PlacementTargeting placementSegment) {
        this.placementSegment = placementSegment;
    }


    /**
     * Gets the customTargetingSegment value for this ProductSegmentation.
     * 
     * @return customTargetingSegment   * The custom targeting segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.CustomCriteria[] getCustomTargetingSegment() {
        return customTargetingSegment;
    }


    /**
     * Sets the customTargetingSegment value for this ProductSegmentation.
     * 
     * @param customTargetingSegment   * The custom targeting segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setCustomTargetingSegment(com.google.api.ads.dfp.axis.v201802.CustomCriteria[] customTargetingSegment) {
        this.customTargetingSegment = customTargetingSegment;
    }

    public com.google.api.ads.dfp.axis.v201802.CustomCriteria getCustomTargetingSegment(int i) {
        return this.customTargetingSegment[i];
    }

    public void setCustomTargetingSegment(int i, com.google.api.ads.dfp.axis.v201802.CustomCriteria _value) {
        this.customTargetingSegment[i] = _value;
    }


    /**
     * Gets the userDomainSegment value for this ProductSegmentation.
     * 
     * @return userDomainSegment   * The user domain segmentation. {@link UserDomainTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.UserDomainTargeting getUserDomainSegment() {
        return userDomainSegment;
    }


    /**
     * Sets the userDomainSegment value for this ProductSegmentation.
     * 
     * @param userDomainSegment   * The user domain segmentation. {@link UserDomainTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setUserDomainSegment(com.google.api.ads.dfp.axis.v201802.UserDomainTargeting userDomainSegment) {
        this.userDomainSegment = userDomainSegment;
    }


    /**
     * Gets the bandwidthSegment value for this ProductSegmentation.
     * 
     * @return bandwidthSegment   * The bandwidth segmentation. {@link BandwidthGroupTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting getBandwidthSegment() {
        return bandwidthSegment;
    }


    /**
     * Sets the bandwidthSegment value for this ProductSegmentation.
     * 
     * @param bandwidthSegment   * The bandwidth segmentation. {@link BandwidthGroupTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setBandwidthSegment(com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting bandwidthSegment) {
        this.bandwidthSegment = bandwidthSegment;
    }


    /**
     * Gets the browserSegment value for this ProductSegmentation.
     * 
     * @return browserSegment   * The browser segmentation. {@link BrowserTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.BrowserTargeting getBrowserSegment() {
        return browserSegment;
    }


    /**
     * Sets the browserSegment value for this ProductSegmentation.
     * 
     * @param browserSegment   * The browser segmentation. {@link BrowserTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setBrowserSegment(com.google.api.ads.dfp.axis.v201802.BrowserTargeting browserSegment) {
        this.browserSegment = browserSegment;
    }


    /**
     * Gets the browserLanguageSegment value for this ProductSegmentation.
     * 
     * @return browserLanguageSegment   * The browser language segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting getBrowserLanguageSegment() {
        return browserLanguageSegment;
    }


    /**
     * Sets the browserLanguageSegment value for this ProductSegmentation.
     * 
     * @param browserLanguageSegment   * The browser language segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setBrowserLanguageSegment(com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting browserLanguageSegment) {
        this.browserLanguageSegment = browserLanguageSegment;
    }


    /**
     * Gets the operatingSystemSegment value for this ProductSegmentation.
     * 
     * @return operatingSystemSegment   * The operating system segmentation. {@link OperatingSystemTargeting#isTargeted}
     * must be {@code true}.
     *                 We only allow segment by Operating_System, not Operating_System_Version
     * (will be ignored).
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting getOperatingSystemSegment() {
        return operatingSystemSegment;
    }


    /**
     * Sets the operatingSystemSegment value for this ProductSegmentation.
     * 
     * @param operatingSystemSegment   * The operating system segmentation. {@link OperatingSystemTargeting#isTargeted}
     * must be {@code true}.
     *                 We only allow segment by Operating_System, not Operating_System_Version
     * (will be ignored).
     *                 
     *                 <p>This attribute is optional.
     */
    public void setOperatingSystemSegment(com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting operatingSystemSegment) {
        this.operatingSystemSegment = operatingSystemSegment;
    }


    /**
     * Gets the operatingSystemVersionSegment value for this ProductSegmentation.
     * 
     * @return operatingSystemVersionSegment   * The operating system version segmentation. {@link OperatingSystemVersionTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting getOperatingSystemVersionSegment() {
        return operatingSystemVersionSegment;
    }


    /**
     * Sets the operatingSystemVersionSegment value for this ProductSegmentation.
     * 
     * @param operatingSystemVersionSegment   * The operating system version segmentation. {@link OperatingSystemVersionTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setOperatingSystemVersionSegment(com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting operatingSystemVersionSegment) {
        this.operatingSystemVersionSegment = operatingSystemVersionSegment;
    }


    /**
     * Gets the mobileCarrierSegment value for this ProductSegmentation.
     * 
     * @return mobileCarrierSegment   * The mobile carrier segmentation. {@link MobileCarrierTargeting#isTargeted}
     * must be {@code
     *                 true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting getMobileCarrierSegment() {
        return mobileCarrierSegment;
    }


    /**
     * Sets the mobileCarrierSegment value for this ProductSegmentation.
     * 
     * @param mobileCarrierSegment   * The mobile carrier segmentation. {@link MobileCarrierTargeting#isTargeted}
     * must be {@code
     *                 true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setMobileCarrierSegment(com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting mobileCarrierSegment) {
        this.mobileCarrierSegment = mobileCarrierSegment;
    }


    /**
     * Gets the deviceCapabilitySegment value for this ProductSegmentation.
     * 
     * @return deviceCapabilitySegment   * The device capability segmentation. {@link
     *                 DeviceCapabilityTargeting#excludedDeviceCapabilities}
     * must be empty or null.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting getDeviceCapabilitySegment() {
        return deviceCapabilitySegment;
    }


    /**
     * Sets the deviceCapabilitySegment value for this ProductSegmentation.
     * 
     * @param deviceCapabilitySegment   * The device capability segmentation. {@link
     *                 DeviceCapabilityTargeting#excludedDeviceCapabilities}
     * must be empty or null.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setDeviceCapabilitySegment(com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting deviceCapabilitySegment) {
        this.deviceCapabilitySegment = deviceCapabilitySegment;
    }


    /**
     * Gets the deviceCategorySegment value for this ProductSegmentation.
     * 
     * @return deviceCategorySegment   * The device category segmentation. {@link DeviceCategoryTargeting#excludedDeviceCategories}
     * must
     *                 be empty or null.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting getDeviceCategorySegment() {
        return deviceCategorySegment;
    }


    /**
     * Sets the deviceCategorySegment value for this ProductSegmentation.
     * 
     * @param deviceCategorySegment   * The device category segmentation. {@link DeviceCategoryTargeting#excludedDeviceCategories}
     * must
     *                 be empty or null.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setDeviceCategorySegment(com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting deviceCategorySegment) {
        this.deviceCategorySegment = deviceCategorySegment;
    }


    /**
     * Gets the deviceManufacturerSegment value for this ProductSegmentation.
     * 
     * @return deviceManufacturerSegment   * The device manufacturer segmentation. {@link DeviceFamilyTargeting#isTargeted}
     * must be {@code
     *                 true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting getDeviceManufacturerSegment() {
        return deviceManufacturerSegment;
    }


    /**
     * Sets the deviceManufacturerSegment value for this ProductSegmentation.
     * 
     * @param deviceManufacturerSegment   * The device manufacturer segmentation. {@link DeviceFamilyTargeting#isTargeted}
     * must be {@code
     *                 true}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setDeviceManufacturerSegment(com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting deviceManufacturerSegment) {
        this.deviceManufacturerSegment = deviceManufacturerSegment;
    }


    /**
     * Gets the mobileDeviceSegment value for this ProductSegmentation.
     * 
     * @return mobileDeviceSegment   * The mobile device segmentation. {@link MobileDeviceTargeting#excludedMobileDevices}
     * must be
     *                 empty or null.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting getMobileDeviceSegment() {
        return mobileDeviceSegment;
    }


    /**
     * Sets the mobileDeviceSegment value for this ProductSegmentation.
     * 
     * @param mobileDeviceSegment   * The mobile device segmentation. {@link MobileDeviceTargeting#excludedMobileDevices}
     * must be
     *                 empty or null.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setMobileDeviceSegment(com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting mobileDeviceSegment) {
        this.mobileDeviceSegment = mobileDeviceSegment;
    }


    /**
     * Gets the mobileDeviceSubmodelSegment value for this ProductSegmentation.
     * 
     * @return mobileDeviceSubmodelSegment   * The mobile device submodel segmentation. {@link
     *                 MobileDeviceSubmodelTargeting#excludedMobileDeviceSubmodels}
     * must be empty or null.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting getMobileDeviceSubmodelSegment() {
        return mobileDeviceSubmodelSegment;
    }


    /**
     * Sets the mobileDeviceSubmodelSegment value for this ProductSegmentation.
     * 
     * @param mobileDeviceSubmodelSegment   * The mobile device submodel segmentation. {@link
     *                 MobileDeviceSubmodelTargeting#excludedMobileDeviceSubmodels}
     * must be empty or null.
     */
    public void setMobileDeviceSubmodelSegment(com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting mobileDeviceSubmodelSegment) {
        this.mobileDeviceSubmodelSegment = mobileDeviceSubmodelSegment;
    }


    /**
     * Gets the sizeSegment value for this ProductSegmentation.
     * 
     * @return sizeSegment   * The creative size segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] getSizeSegment() {
        return sizeSegment;
    }


    /**
     * Sets the sizeSegment value for this ProductSegmentation.
     * 
     * @param sizeSegment   * The creative size segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setSizeSegment(com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] sizeSegment) {
        this.sizeSegment = sizeSegment;
    }

    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder getSizeSegment(int i) {
        return this.sizeSegment[i];
    }

    public void setSizeSegment(int i, com.google.api.ads.dfp.axis.v201802.CreativePlaceholder _value) {
        this.sizeSegment[i] = _value;
    }


    /**
     * Gets the mobileApplicationSegment value for this ProductSegmentation.
     * 
     * @return mobileApplicationSegment   * The mobile application segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileApplicationTargeting getMobileApplicationSegment() {
        return mobileApplicationSegment;
    }


    /**
     * Sets the mobileApplicationSegment value for this ProductSegmentation.
     * 
     * @param mobileApplicationSegment   * The mobile application segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setMobileApplicationSegment(com.google.api.ads.dfp.axis.v201802.MobileApplicationTargeting mobileApplicationSegment) {
        this.mobileApplicationSegment = mobileApplicationSegment;
    }


    /**
     * Gets the videoPositionSegment value for this ProductSegmentation.
     * 
     * @return videoPositionSegment   * The video position segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.VideoPositionTargeting getVideoPositionSegment() {
        return videoPositionSegment;
    }


    /**
     * Sets the videoPositionSegment value for this ProductSegmentation.
     * 
     * @param videoPositionSegment   * The video position segmentation.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setVideoPositionSegment(com.google.api.ads.dfp.axis.v201802.VideoPositionTargeting videoPositionSegment) {
        this.videoPositionSegment = videoPositionSegment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSegmentation)) return false;
        ProductSegmentation other = (ProductSegmentation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoSegment==null && other.getGeoSegment()==null) || 
             (this.geoSegment!=null &&
              this.geoSegment.equals(other.getGeoSegment()))) &&
            ((this.adUnitSegments==null && other.getAdUnitSegments()==null) || 
             (this.adUnitSegments!=null &&
              java.util.Arrays.equals(this.adUnitSegments, other.getAdUnitSegments()))) &&
            ((this.placementSegment==null && other.getPlacementSegment()==null) || 
             (this.placementSegment!=null &&
              this.placementSegment.equals(other.getPlacementSegment()))) &&
            ((this.customTargetingSegment==null && other.getCustomTargetingSegment()==null) || 
             (this.customTargetingSegment!=null &&
              java.util.Arrays.equals(this.customTargetingSegment, other.getCustomTargetingSegment()))) &&
            ((this.userDomainSegment==null && other.getUserDomainSegment()==null) || 
             (this.userDomainSegment!=null &&
              this.userDomainSegment.equals(other.getUserDomainSegment()))) &&
            ((this.bandwidthSegment==null && other.getBandwidthSegment()==null) || 
             (this.bandwidthSegment!=null &&
              this.bandwidthSegment.equals(other.getBandwidthSegment()))) &&
            ((this.browserSegment==null && other.getBrowserSegment()==null) || 
             (this.browserSegment!=null &&
              this.browserSegment.equals(other.getBrowserSegment()))) &&
            ((this.browserLanguageSegment==null && other.getBrowserLanguageSegment()==null) || 
             (this.browserLanguageSegment!=null &&
              this.browserLanguageSegment.equals(other.getBrowserLanguageSegment()))) &&
            ((this.operatingSystemSegment==null && other.getOperatingSystemSegment()==null) || 
             (this.operatingSystemSegment!=null &&
              this.operatingSystemSegment.equals(other.getOperatingSystemSegment()))) &&
            ((this.operatingSystemVersionSegment==null && other.getOperatingSystemVersionSegment()==null) || 
             (this.operatingSystemVersionSegment!=null &&
              this.operatingSystemVersionSegment.equals(other.getOperatingSystemVersionSegment()))) &&
            ((this.mobileCarrierSegment==null && other.getMobileCarrierSegment()==null) || 
             (this.mobileCarrierSegment!=null &&
              this.mobileCarrierSegment.equals(other.getMobileCarrierSegment()))) &&
            ((this.deviceCapabilitySegment==null && other.getDeviceCapabilitySegment()==null) || 
             (this.deviceCapabilitySegment!=null &&
              this.deviceCapabilitySegment.equals(other.getDeviceCapabilitySegment()))) &&
            ((this.deviceCategorySegment==null && other.getDeviceCategorySegment()==null) || 
             (this.deviceCategorySegment!=null &&
              this.deviceCategorySegment.equals(other.getDeviceCategorySegment()))) &&
            ((this.deviceManufacturerSegment==null && other.getDeviceManufacturerSegment()==null) || 
             (this.deviceManufacturerSegment!=null &&
              this.deviceManufacturerSegment.equals(other.getDeviceManufacturerSegment()))) &&
            ((this.mobileDeviceSegment==null && other.getMobileDeviceSegment()==null) || 
             (this.mobileDeviceSegment!=null &&
              this.mobileDeviceSegment.equals(other.getMobileDeviceSegment()))) &&
            ((this.mobileDeviceSubmodelSegment==null && other.getMobileDeviceSubmodelSegment()==null) || 
             (this.mobileDeviceSubmodelSegment!=null &&
              this.mobileDeviceSubmodelSegment.equals(other.getMobileDeviceSubmodelSegment()))) &&
            ((this.sizeSegment==null && other.getSizeSegment()==null) || 
             (this.sizeSegment!=null &&
              java.util.Arrays.equals(this.sizeSegment, other.getSizeSegment()))) &&
            ((this.mobileApplicationSegment==null && other.getMobileApplicationSegment()==null) || 
             (this.mobileApplicationSegment!=null &&
              this.mobileApplicationSegment.equals(other.getMobileApplicationSegment()))) &&
            ((this.videoPositionSegment==null && other.getVideoPositionSegment()==null) || 
             (this.videoPositionSegment!=null &&
              this.videoPositionSegment.equals(other.getVideoPositionSegment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGeoSegment() != null) {
            _hashCode += getGeoSegment().hashCode();
        }
        if (getAdUnitSegments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdUnitSegments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdUnitSegments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlacementSegment() != null) {
            _hashCode += getPlacementSegment().hashCode();
        }
        if (getCustomTargetingSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomTargetingSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomTargetingSegment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDomainSegment() != null) {
            _hashCode += getUserDomainSegment().hashCode();
        }
        if (getBandwidthSegment() != null) {
            _hashCode += getBandwidthSegment().hashCode();
        }
        if (getBrowserSegment() != null) {
            _hashCode += getBrowserSegment().hashCode();
        }
        if (getBrowserLanguageSegment() != null) {
            _hashCode += getBrowserLanguageSegment().hashCode();
        }
        if (getOperatingSystemSegment() != null) {
            _hashCode += getOperatingSystemSegment().hashCode();
        }
        if (getOperatingSystemVersionSegment() != null) {
            _hashCode += getOperatingSystemVersionSegment().hashCode();
        }
        if (getMobileCarrierSegment() != null) {
            _hashCode += getMobileCarrierSegment().hashCode();
        }
        if (getDeviceCapabilitySegment() != null) {
            _hashCode += getDeviceCapabilitySegment().hashCode();
        }
        if (getDeviceCategorySegment() != null) {
            _hashCode += getDeviceCategorySegment().hashCode();
        }
        if (getDeviceManufacturerSegment() != null) {
            _hashCode += getDeviceManufacturerSegment().hashCode();
        }
        if (getMobileDeviceSegment() != null) {
            _hashCode += getMobileDeviceSegment().hashCode();
        }
        if (getMobileDeviceSubmodelSegment() != null) {
            _hashCode += getMobileDeviceSubmodelSegment().hashCode();
        }
        if (getSizeSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSizeSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSizeSegment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMobileApplicationSegment() != null) {
            _hashCode += getMobileApplicationSegment().hashCode();
        }
        if (getVideoPositionSegment() != null) {
            _hashCode += getVideoPositionSegment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductSegmentation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductSegmentation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "geoSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitSegments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adUnitSegments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdUnitTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "placementSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PlacementTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customTargetingSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDomainSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "userDomainSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "UserDomainTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "bandwidthSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BandwidthGroupTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "browserSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BrowserTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserLanguageSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "browserLanguageSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BrowserLanguageTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "operatingSystemSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "OperatingSystemTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemVersionSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "operatingSystemVersionSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "OperatingSystemVersionTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCarrierSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileCarrierSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileCarrierTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCapabilitySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deviceCapabilitySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeviceCapabilityTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCategorySegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deviceCategorySegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeviceCategoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceManufacturerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deviceManufacturerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeviceManufacturerTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileDeviceSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileDeviceTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceSubmodelSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileDeviceSubmodelSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileDeviceSubmodelTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sizeSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileApplicationSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileApplicationSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileApplicationTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPositionSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "videoPositionSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoPositionTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
