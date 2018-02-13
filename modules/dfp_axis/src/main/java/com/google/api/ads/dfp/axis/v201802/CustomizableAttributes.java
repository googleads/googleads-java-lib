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
 * CustomizableAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Specifies what targeting or attributes are customizable on a {@link
 * ProductTemplate}.
 */
public class CustomizableAttributes  implements java.io.Serializable {
    /* Allows customization by salespeople of geographical targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowGeoTargetingCustomization;

    /* Allows customization by salespeople of ad unit targeting in
     * {@link Targeting#inventoryTargeting} when creating proposal line items.
     * 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowAdUnitTargetingCustomization;

    /* Allows customization by salespeople of placement targeting
     * in
     *                 {@link Targeting#inventoryTargeting} when creating
     * proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowPlacementTargetingCustomization;

    /* Allows customization by salespeople of user domain targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowUserDomainTargetingCustomization;

    /* Allows customization by salespeople of bandwidth group targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowBandwidthGroupTargetingCustomization;

    /* Allows customization by salespeople of browser targeting when
     * creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowBrowserTargetingCustomization;

    /* Allows customization by salespeople of browser language targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowBrowserLanguageTargetingCustomization;

    /* Allows customization by salespeople of operating system targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowOperatingSystemTargetingCustomization;

    /* Allows customization by salespeople of device capability targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowDeviceCapabilityTargetingCustomization;

    /* Allows customization by salespeople of device category targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowDeviceCategoryTargetingCustomization;

    /* Allows customization by salespeople of mobile application targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowMobileApplicationTargetingCustomization;

    /* Allows customization by salespeople of mobile carrier targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowMobileCarrierTargetingCustomization;

    /* Allows customization by salespeople of device manufacturer,
     * mobile device,
     *                 and mobile device sub-model targeting when creating
     * proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowMobileDeviceAndManufacturerTargetingCustomization;

    /* Allows customization by salespeople of audience segment targeting
     * when creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowAudienceSegmentTargetingCustomization;

    /* Specifies whether all custom targeting keys (except those used
     * in
     *                 {@link ProductSegmentation#customTargetingSegment})
     * are allowed to be customized by
     *                 salespeople.
     *                 
     *                 <p>If it's true, then {@link #customizableCustomTargetingKeyIds}
     * is ignored.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean isAllCustomTargetingKeysCustomizable;

    /* Specifies what custom criteria salespeople are allow to customize.
     * It refers the key id of customizable custom criteria here.
     *                 
     *                 <p>If {@link #isAllCustomTargetingKeysCustomizable}
     * is {@code true}, then this attribute is
     *                 ignored.
     *                 
     *                 <p>This attribute is optional. */
    private long[] customizableCustomTargetingKeyIds;

    /* Allows customization by salespeople of daypart targeting when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowDaypartTargetingCustomization;

    /* Allows customization by salespeople of frequency caps when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false
     * when {@link ProductTemplate#productType} is
     *                 {@link ProductType#DFP}. */
    private java.lang.Boolean allowFrequencyCapsCustomization;

    /* Allows customization by salespeople of delivery settings when
     * creating
     *                 proposal line items.
     *                 
     *                 <p>The delivery settings of a {@link ProductTemplate}
     * include
     *                 {@link ProductTemplate#roadblockingType}, {@link ProductTemplate#deliveryRateType},
     * {@link ProductTemplate#creativeRotationType} and
     *                 {@link ProductTemplate#companionDeliveryOption}.
     *                 
     *                 <p>This attribute is optional and defaults to false
     * when {@link ProductTemplate#productType} is
     *                 {@link ProductType#DFP}. */
    private java.lang.Boolean allowDeliverySettingsCustomization;

    /* Allows customization of {@link CreativePlaceholder creative
     * placeholders} when creating
     *                 {@link ProposalLineItem proposal line items}.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean allowCreativePlaceholdersCustomization;

    public CustomizableAttributes() {
    }

    public CustomizableAttributes(
           java.lang.Boolean allowGeoTargetingCustomization,
           java.lang.Boolean allowAdUnitTargetingCustomization,
           java.lang.Boolean allowPlacementTargetingCustomization,
           java.lang.Boolean allowUserDomainTargetingCustomization,
           java.lang.Boolean allowBandwidthGroupTargetingCustomization,
           java.lang.Boolean allowBrowserTargetingCustomization,
           java.lang.Boolean allowBrowserLanguageTargetingCustomization,
           java.lang.Boolean allowOperatingSystemTargetingCustomization,
           java.lang.Boolean allowDeviceCapabilityTargetingCustomization,
           java.lang.Boolean allowDeviceCategoryTargetingCustomization,
           java.lang.Boolean allowMobileApplicationTargetingCustomization,
           java.lang.Boolean allowMobileCarrierTargetingCustomization,
           java.lang.Boolean allowMobileDeviceAndManufacturerTargetingCustomization,
           java.lang.Boolean allowAudienceSegmentTargetingCustomization,
           java.lang.Boolean isAllCustomTargetingKeysCustomizable,
           long[] customizableCustomTargetingKeyIds,
           java.lang.Boolean allowDaypartTargetingCustomization,
           java.lang.Boolean allowFrequencyCapsCustomization,
           java.lang.Boolean allowDeliverySettingsCustomization,
           java.lang.Boolean allowCreativePlaceholdersCustomization) {
           this.allowGeoTargetingCustomization = allowGeoTargetingCustomization;
           this.allowAdUnitTargetingCustomization = allowAdUnitTargetingCustomization;
           this.allowPlacementTargetingCustomization = allowPlacementTargetingCustomization;
           this.allowUserDomainTargetingCustomization = allowUserDomainTargetingCustomization;
           this.allowBandwidthGroupTargetingCustomization = allowBandwidthGroupTargetingCustomization;
           this.allowBrowserTargetingCustomization = allowBrowserTargetingCustomization;
           this.allowBrowserLanguageTargetingCustomization = allowBrowserLanguageTargetingCustomization;
           this.allowOperatingSystemTargetingCustomization = allowOperatingSystemTargetingCustomization;
           this.allowDeviceCapabilityTargetingCustomization = allowDeviceCapabilityTargetingCustomization;
           this.allowDeviceCategoryTargetingCustomization = allowDeviceCategoryTargetingCustomization;
           this.allowMobileApplicationTargetingCustomization = allowMobileApplicationTargetingCustomization;
           this.allowMobileCarrierTargetingCustomization = allowMobileCarrierTargetingCustomization;
           this.allowMobileDeviceAndManufacturerTargetingCustomization = allowMobileDeviceAndManufacturerTargetingCustomization;
           this.allowAudienceSegmentTargetingCustomization = allowAudienceSegmentTargetingCustomization;
           this.isAllCustomTargetingKeysCustomizable = isAllCustomTargetingKeysCustomizable;
           this.customizableCustomTargetingKeyIds = customizableCustomTargetingKeyIds;
           this.allowDaypartTargetingCustomization = allowDaypartTargetingCustomization;
           this.allowFrequencyCapsCustomization = allowFrequencyCapsCustomization;
           this.allowDeliverySettingsCustomization = allowDeliverySettingsCustomization;
           this.allowCreativePlaceholdersCustomization = allowCreativePlaceholdersCustomization;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("allowAdUnitTargetingCustomization", getAllowAdUnitTargetingCustomization())
            .add("allowAudienceSegmentTargetingCustomization", getAllowAudienceSegmentTargetingCustomization())
            .add("allowBandwidthGroupTargetingCustomization", getAllowBandwidthGroupTargetingCustomization())
            .add("allowBrowserLanguageTargetingCustomization", getAllowBrowserLanguageTargetingCustomization())
            .add("allowBrowserTargetingCustomization", getAllowBrowserTargetingCustomization())
            .add("allowCreativePlaceholdersCustomization", getAllowCreativePlaceholdersCustomization())
            .add("allowDaypartTargetingCustomization", getAllowDaypartTargetingCustomization())
            .add("allowDeliverySettingsCustomization", getAllowDeliverySettingsCustomization())
            .add("allowDeviceCapabilityTargetingCustomization", getAllowDeviceCapabilityTargetingCustomization())
            .add("allowDeviceCategoryTargetingCustomization", getAllowDeviceCategoryTargetingCustomization())
            .add("allowFrequencyCapsCustomization", getAllowFrequencyCapsCustomization())
            .add("allowGeoTargetingCustomization", getAllowGeoTargetingCustomization())
            .add("allowMobileApplicationTargetingCustomization", getAllowMobileApplicationTargetingCustomization())
            .add("allowMobileCarrierTargetingCustomization", getAllowMobileCarrierTargetingCustomization())
            .add("allowMobileDeviceAndManufacturerTargetingCustomization", getAllowMobileDeviceAndManufacturerTargetingCustomization())
            .add("allowOperatingSystemTargetingCustomization", getAllowOperatingSystemTargetingCustomization())
            .add("allowPlacementTargetingCustomization", getAllowPlacementTargetingCustomization())
            .add("allowUserDomainTargetingCustomization", getAllowUserDomainTargetingCustomization())
            .add("customizableCustomTargetingKeyIds", getCustomizableCustomTargetingKeyIds())
            .add("isAllCustomTargetingKeysCustomizable", getIsAllCustomTargetingKeysCustomizable())
            .toString();
    }

    /**
     * Gets the allowGeoTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowGeoTargetingCustomization   * Allows customization by salespeople of geographical targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowGeoTargetingCustomization() {
        return allowGeoTargetingCustomization;
    }


    /**
     * Sets the allowGeoTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowGeoTargetingCustomization   * Allows customization by salespeople of geographical targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowGeoTargetingCustomization(java.lang.Boolean allowGeoTargetingCustomization) {
        this.allowGeoTargetingCustomization = allowGeoTargetingCustomization;
    }


    /**
     * Gets the allowAdUnitTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowAdUnitTargetingCustomization   * Allows customization by salespeople of ad unit targeting in
     * {@link Targeting#inventoryTargeting} when creating proposal line items.
     * 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowAdUnitTargetingCustomization() {
        return allowAdUnitTargetingCustomization;
    }


    /**
     * Sets the allowAdUnitTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowAdUnitTargetingCustomization   * Allows customization by salespeople of ad unit targeting in
     * {@link Targeting#inventoryTargeting} when creating proposal line items.
     * 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowAdUnitTargetingCustomization(java.lang.Boolean allowAdUnitTargetingCustomization) {
        this.allowAdUnitTargetingCustomization = allowAdUnitTargetingCustomization;
    }


    /**
     * Gets the allowPlacementTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowPlacementTargetingCustomization   * Allows customization by salespeople of placement targeting
     * in
     *                 {@link Targeting#inventoryTargeting} when creating
     * proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowPlacementTargetingCustomization() {
        return allowPlacementTargetingCustomization;
    }


    /**
     * Sets the allowPlacementTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowPlacementTargetingCustomization   * Allows customization by salespeople of placement targeting
     * in
     *                 {@link Targeting#inventoryTargeting} when creating
     * proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowPlacementTargetingCustomization(java.lang.Boolean allowPlacementTargetingCustomization) {
        this.allowPlacementTargetingCustomization = allowPlacementTargetingCustomization;
    }


    /**
     * Gets the allowUserDomainTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowUserDomainTargetingCustomization   * Allows customization by salespeople of user domain targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowUserDomainTargetingCustomization() {
        return allowUserDomainTargetingCustomization;
    }


    /**
     * Sets the allowUserDomainTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowUserDomainTargetingCustomization   * Allows customization by salespeople of user domain targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowUserDomainTargetingCustomization(java.lang.Boolean allowUserDomainTargetingCustomization) {
        this.allowUserDomainTargetingCustomization = allowUserDomainTargetingCustomization;
    }


    /**
     * Gets the allowBandwidthGroupTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowBandwidthGroupTargetingCustomization   * Allows customization by salespeople of bandwidth group targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowBandwidthGroupTargetingCustomization() {
        return allowBandwidthGroupTargetingCustomization;
    }


    /**
     * Sets the allowBandwidthGroupTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowBandwidthGroupTargetingCustomization   * Allows customization by salespeople of bandwidth group targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowBandwidthGroupTargetingCustomization(java.lang.Boolean allowBandwidthGroupTargetingCustomization) {
        this.allowBandwidthGroupTargetingCustomization = allowBandwidthGroupTargetingCustomization;
    }


    /**
     * Gets the allowBrowserTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowBrowserTargetingCustomization   * Allows customization by salespeople of browser targeting when
     * creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowBrowserTargetingCustomization() {
        return allowBrowserTargetingCustomization;
    }


    /**
     * Sets the allowBrowserTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowBrowserTargetingCustomization   * Allows customization by salespeople of browser targeting when
     * creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowBrowserTargetingCustomization(java.lang.Boolean allowBrowserTargetingCustomization) {
        this.allowBrowserTargetingCustomization = allowBrowserTargetingCustomization;
    }


    /**
     * Gets the allowBrowserLanguageTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowBrowserLanguageTargetingCustomization   * Allows customization by salespeople of browser language targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowBrowserLanguageTargetingCustomization() {
        return allowBrowserLanguageTargetingCustomization;
    }


    /**
     * Sets the allowBrowserLanguageTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowBrowserLanguageTargetingCustomization   * Allows customization by salespeople of browser language targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowBrowserLanguageTargetingCustomization(java.lang.Boolean allowBrowserLanguageTargetingCustomization) {
        this.allowBrowserLanguageTargetingCustomization = allowBrowserLanguageTargetingCustomization;
    }


    /**
     * Gets the allowOperatingSystemTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowOperatingSystemTargetingCustomization   * Allows customization by salespeople of operating system targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowOperatingSystemTargetingCustomization() {
        return allowOperatingSystemTargetingCustomization;
    }


    /**
     * Sets the allowOperatingSystemTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowOperatingSystemTargetingCustomization   * Allows customization by salespeople of operating system targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowOperatingSystemTargetingCustomization(java.lang.Boolean allowOperatingSystemTargetingCustomization) {
        this.allowOperatingSystemTargetingCustomization = allowOperatingSystemTargetingCustomization;
    }


    /**
     * Gets the allowDeviceCapabilityTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowDeviceCapabilityTargetingCustomization   * Allows customization by salespeople of device capability targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowDeviceCapabilityTargetingCustomization() {
        return allowDeviceCapabilityTargetingCustomization;
    }


    /**
     * Sets the allowDeviceCapabilityTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowDeviceCapabilityTargetingCustomization   * Allows customization by salespeople of device capability targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowDeviceCapabilityTargetingCustomization(java.lang.Boolean allowDeviceCapabilityTargetingCustomization) {
        this.allowDeviceCapabilityTargetingCustomization = allowDeviceCapabilityTargetingCustomization;
    }


    /**
     * Gets the allowDeviceCategoryTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowDeviceCategoryTargetingCustomization   * Allows customization by salespeople of device category targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowDeviceCategoryTargetingCustomization() {
        return allowDeviceCategoryTargetingCustomization;
    }


    /**
     * Sets the allowDeviceCategoryTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowDeviceCategoryTargetingCustomization   * Allows customization by salespeople of device category targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowDeviceCategoryTargetingCustomization(java.lang.Boolean allowDeviceCategoryTargetingCustomization) {
        this.allowDeviceCategoryTargetingCustomization = allowDeviceCategoryTargetingCustomization;
    }


    /**
     * Gets the allowMobileApplicationTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowMobileApplicationTargetingCustomization   * Allows customization by salespeople of mobile application targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowMobileApplicationTargetingCustomization() {
        return allowMobileApplicationTargetingCustomization;
    }


    /**
     * Sets the allowMobileApplicationTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowMobileApplicationTargetingCustomization   * Allows customization by salespeople of mobile application targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowMobileApplicationTargetingCustomization(java.lang.Boolean allowMobileApplicationTargetingCustomization) {
        this.allowMobileApplicationTargetingCustomization = allowMobileApplicationTargetingCustomization;
    }


    /**
     * Gets the allowMobileCarrierTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowMobileCarrierTargetingCustomization   * Allows customization by salespeople of mobile carrier targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowMobileCarrierTargetingCustomization() {
        return allowMobileCarrierTargetingCustomization;
    }


    /**
     * Sets the allowMobileCarrierTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowMobileCarrierTargetingCustomization   * Allows customization by salespeople of mobile carrier targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowMobileCarrierTargetingCustomization(java.lang.Boolean allowMobileCarrierTargetingCustomization) {
        this.allowMobileCarrierTargetingCustomization = allowMobileCarrierTargetingCustomization;
    }


    /**
     * Gets the allowMobileDeviceAndManufacturerTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowMobileDeviceAndManufacturerTargetingCustomization   * Allows customization by salespeople of device manufacturer,
     * mobile device,
     *                 and mobile device sub-model targeting when creating
     * proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowMobileDeviceAndManufacturerTargetingCustomization() {
        return allowMobileDeviceAndManufacturerTargetingCustomization;
    }


    /**
     * Sets the allowMobileDeviceAndManufacturerTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowMobileDeviceAndManufacturerTargetingCustomization   * Allows customization by salespeople of device manufacturer,
     * mobile device,
     *                 and mobile device sub-model targeting when creating
     * proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowMobileDeviceAndManufacturerTargetingCustomization(java.lang.Boolean allowMobileDeviceAndManufacturerTargetingCustomization) {
        this.allowMobileDeviceAndManufacturerTargetingCustomization = allowMobileDeviceAndManufacturerTargetingCustomization;
    }


    /**
     * Gets the allowAudienceSegmentTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowAudienceSegmentTargetingCustomization   * Allows customization by salespeople of audience segment targeting
     * when creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowAudienceSegmentTargetingCustomization() {
        return allowAudienceSegmentTargetingCustomization;
    }


    /**
     * Sets the allowAudienceSegmentTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowAudienceSegmentTargetingCustomization   * Allows customization by salespeople of audience segment targeting
     * when creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowAudienceSegmentTargetingCustomization(java.lang.Boolean allowAudienceSegmentTargetingCustomization) {
        this.allowAudienceSegmentTargetingCustomization = allowAudienceSegmentTargetingCustomization;
    }


    /**
     * Gets the isAllCustomTargetingKeysCustomizable value for this CustomizableAttributes.
     * 
     * @return isAllCustomTargetingKeysCustomizable   * Specifies whether all custom targeting keys (except those used
     * in
     *                 {@link ProductSegmentation#customTargetingSegment})
     * are allowed to be customized by
     *                 salespeople.
     *                 
     *                 <p>If it's true, then {@link #customizableCustomTargetingKeyIds}
     * is ignored.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getIsAllCustomTargetingKeysCustomizable() {
        return isAllCustomTargetingKeysCustomizable;
    }


    /**
     * Sets the isAllCustomTargetingKeysCustomizable value for this CustomizableAttributes.
     * 
     * @param isAllCustomTargetingKeysCustomizable   * Specifies whether all custom targeting keys (except those used
     * in
     *                 {@link ProductSegmentation#customTargetingSegment})
     * are allowed to be customized by
     *                 salespeople.
     *                 
     *                 <p>If it's true, then {@link #customizableCustomTargetingKeyIds}
     * is ignored.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setIsAllCustomTargetingKeysCustomizable(java.lang.Boolean isAllCustomTargetingKeysCustomizable) {
        this.isAllCustomTargetingKeysCustomizable = isAllCustomTargetingKeysCustomizable;
    }


    /**
     * Gets the customizableCustomTargetingKeyIds value for this CustomizableAttributes.
     * 
     * @return customizableCustomTargetingKeyIds   * Specifies what custom criteria salespeople are allow to customize.
     * It refers the key id of customizable custom criteria here.
     *                 
     *                 <p>If {@link #isAllCustomTargetingKeysCustomizable}
     * is {@code true}, then this attribute is
     *                 ignored.
     *                 
     *                 <p>This attribute is optional.
     */
    public long[] getCustomizableCustomTargetingKeyIds() {
        return customizableCustomTargetingKeyIds;
    }


    /**
     * Sets the customizableCustomTargetingKeyIds value for this CustomizableAttributes.
     * 
     * @param customizableCustomTargetingKeyIds   * Specifies what custom criteria salespeople are allow to customize.
     * It refers the key id of customizable custom criteria here.
     *                 
     *                 <p>If {@link #isAllCustomTargetingKeysCustomizable}
     * is {@code true}, then this attribute is
     *                 ignored.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setCustomizableCustomTargetingKeyIds(long[] customizableCustomTargetingKeyIds) {
        this.customizableCustomTargetingKeyIds = customizableCustomTargetingKeyIds;
    }

    public long getCustomizableCustomTargetingKeyIds(int i) {
        return this.customizableCustomTargetingKeyIds[i];
    }

    public void setCustomizableCustomTargetingKeyIds(int i, long _value) {
        this.customizableCustomTargetingKeyIds[i] = _value;
    }


    /**
     * Gets the allowDaypartTargetingCustomization value for this CustomizableAttributes.
     * 
     * @return allowDaypartTargetingCustomization   * Allows customization by salespeople of daypart targeting when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowDaypartTargetingCustomization() {
        return allowDaypartTargetingCustomization;
    }


    /**
     * Sets the allowDaypartTargetingCustomization value for this CustomizableAttributes.
     * 
     * @param allowDaypartTargetingCustomization   * Allows customization by salespeople of daypart targeting when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowDaypartTargetingCustomization(java.lang.Boolean allowDaypartTargetingCustomization) {
        this.allowDaypartTargetingCustomization = allowDaypartTargetingCustomization;
    }


    /**
     * Gets the allowFrequencyCapsCustomization value for this CustomizableAttributes.
     * 
     * @return allowFrequencyCapsCustomization   * Allows customization by salespeople of frequency caps when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false
     * when {@link ProductTemplate#productType} is
     *                 {@link ProductType#DFP}.
     */
    public java.lang.Boolean getAllowFrequencyCapsCustomization() {
        return allowFrequencyCapsCustomization;
    }


    /**
     * Sets the allowFrequencyCapsCustomization value for this CustomizableAttributes.
     * 
     * @param allowFrequencyCapsCustomization   * Allows customization by salespeople of frequency caps when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is optional and defaults to false
     * when {@link ProductTemplate#productType} is
     *                 {@link ProductType#DFP}.
     */
    public void setAllowFrequencyCapsCustomization(java.lang.Boolean allowFrequencyCapsCustomization) {
        this.allowFrequencyCapsCustomization = allowFrequencyCapsCustomization;
    }


    /**
     * Gets the allowDeliverySettingsCustomization value for this CustomizableAttributes.
     * 
     * @return allowDeliverySettingsCustomization   * Allows customization by salespeople of delivery settings when
     * creating
     *                 proposal line items.
     *                 
     *                 <p>The delivery settings of a {@link ProductTemplate}
     * include
     *                 {@link ProductTemplate#roadblockingType}, {@link ProductTemplate#deliveryRateType},
     * {@link ProductTemplate#creativeRotationType} and
     *                 {@link ProductTemplate#companionDeliveryOption}.
     *                 
     *                 <p>This attribute is optional and defaults to false
     * when {@link ProductTemplate#productType} is
     *                 {@link ProductType#DFP}.
     */
    public java.lang.Boolean getAllowDeliverySettingsCustomization() {
        return allowDeliverySettingsCustomization;
    }


    /**
     * Sets the allowDeliverySettingsCustomization value for this CustomizableAttributes.
     * 
     * @param allowDeliverySettingsCustomization   * Allows customization by salespeople of delivery settings when
     * creating
     *                 proposal line items.
     *                 
     *                 <p>The delivery settings of a {@link ProductTemplate}
     * include
     *                 {@link ProductTemplate#roadblockingType}, {@link ProductTemplate#deliveryRateType},
     * {@link ProductTemplate#creativeRotationType} and
     *                 {@link ProductTemplate#companionDeliveryOption}.
     *                 
     *                 <p>This attribute is optional and defaults to false
     * when {@link ProductTemplate#productType} is
     *                 {@link ProductType#DFP}.
     */
    public void setAllowDeliverySettingsCustomization(java.lang.Boolean allowDeliverySettingsCustomization) {
        this.allowDeliverySettingsCustomization = allowDeliverySettingsCustomization;
    }


    /**
     * Gets the allowCreativePlaceholdersCustomization value for this CustomizableAttributes.
     * 
     * @return allowCreativePlaceholdersCustomization   * Allows customization of {@link CreativePlaceholder creative
     * placeholders} when creating
     *                 {@link ProposalLineItem proposal line items}.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowCreativePlaceholdersCustomization() {
        return allowCreativePlaceholdersCustomization;
    }


    /**
     * Sets the allowCreativePlaceholdersCustomization value for this CustomizableAttributes.
     * 
     * @param allowCreativePlaceholdersCustomization   * Allows customization of {@link CreativePlaceholder creative
     * placeholders} when creating
     *                 {@link ProposalLineItem proposal line items}.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setAllowCreativePlaceholdersCustomization(java.lang.Boolean allowCreativePlaceholdersCustomization) {
        this.allowCreativePlaceholdersCustomization = allowCreativePlaceholdersCustomization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizableAttributes)) return false;
        CustomizableAttributes other = (CustomizableAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowGeoTargetingCustomization==null && other.getAllowGeoTargetingCustomization()==null) || 
             (this.allowGeoTargetingCustomization!=null &&
              this.allowGeoTargetingCustomization.equals(other.getAllowGeoTargetingCustomization()))) &&
            ((this.allowAdUnitTargetingCustomization==null && other.getAllowAdUnitTargetingCustomization()==null) || 
             (this.allowAdUnitTargetingCustomization!=null &&
              this.allowAdUnitTargetingCustomization.equals(other.getAllowAdUnitTargetingCustomization()))) &&
            ((this.allowPlacementTargetingCustomization==null && other.getAllowPlacementTargetingCustomization()==null) || 
             (this.allowPlacementTargetingCustomization!=null &&
              this.allowPlacementTargetingCustomization.equals(other.getAllowPlacementTargetingCustomization()))) &&
            ((this.allowUserDomainTargetingCustomization==null && other.getAllowUserDomainTargetingCustomization()==null) || 
             (this.allowUserDomainTargetingCustomization!=null &&
              this.allowUserDomainTargetingCustomization.equals(other.getAllowUserDomainTargetingCustomization()))) &&
            ((this.allowBandwidthGroupTargetingCustomization==null && other.getAllowBandwidthGroupTargetingCustomization()==null) || 
             (this.allowBandwidthGroupTargetingCustomization!=null &&
              this.allowBandwidthGroupTargetingCustomization.equals(other.getAllowBandwidthGroupTargetingCustomization()))) &&
            ((this.allowBrowserTargetingCustomization==null && other.getAllowBrowserTargetingCustomization()==null) || 
             (this.allowBrowserTargetingCustomization!=null &&
              this.allowBrowserTargetingCustomization.equals(other.getAllowBrowserTargetingCustomization()))) &&
            ((this.allowBrowserLanguageTargetingCustomization==null && other.getAllowBrowserLanguageTargetingCustomization()==null) || 
             (this.allowBrowserLanguageTargetingCustomization!=null &&
              this.allowBrowserLanguageTargetingCustomization.equals(other.getAllowBrowserLanguageTargetingCustomization()))) &&
            ((this.allowOperatingSystemTargetingCustomization==null && other.getAllowOperatingSystemTargetingCustomization()==null) || 
             (this.allowOperatingSystemTargetingCustomization!=null &&
              this.allowOperatingSystemTargetingCustomization.equals(other.getAllowOperatingSystemTargetingCustomization()))) &&
            ((this.allowDeviceCapabilityTargetingCustomization==null && other.getAllowDeviceCapabilityTargetingCustomization()==null) || 
             (this.allowDeviceCapabilityTargetingCustomization!=null &&
              this.allowDeviceCapabilityTargetingCustomization.equals(other.getAllowDeviceCapabilityTargetingCustomization()))) &&
            ((this.allowDeviceCategoryTargetingCustomization==null && other.getAllowDeviceCategoryTargetingCustomization()==null) || 
             (this.allowDeviceCategoryTargetingCustomization!=null &&
              this.allowDeviceCategoryTargetingCustomization.equals(other.getAllowDeviceCategoryTargetingCustomization()))) &&
            ((this.allowMobileApplicationTargetingCustomization==null && other.getAllowMobileApplicationTargetingCustomization()==null) || 
             (this.allowMobileApplicationTargetingCustomization!=null &&
              this.allowMobileApplicationTargetingCustomization.equals(other.getAllowMobileApplicationTargetingCustomization()))) &&
            ((this.allowMobileCarrierTargetingCustomization==null && other.getAllowMobileCarrierTargetingCustomization()==null) || 
             (this.allowMobileCarrierTargetingCustomization!=null &&
              this.allowMobileCarrierTargetingCustomization.equals(other.getAllowMobileCarrierTargetingCustomization()))) &&
            ((this.allowMobileDeviceAndManufacturerTargetingCustomization==null && other.getAllowMobileDeviceAndManufacturerTargetingCustomization()==null) || 
             (this.allowMobileDeviceAndManufacturerTargetingCustomization!=null &&
              this.allowMobileDeviceAndManufacturerTargetingCustomization.equals(other.getAllowMobileDeviceAndManufacturerTargetingCustomization()))) &&
            ((this.allowAudienceSegmentTargetingCustomization==null && other.getAllowAudienceSegmentTargetingCustomization()==null) || 
             (this.allowAudienceSegmentTargetingCustomization!=null &&
              this.allowAudienceSegmentTargetingCustomization.equals(other.getAllowAudienceSegmentTargetingCustomization()))) &&
            ((this.isAllCustomTargetingKeysCustomizable==null && other.getIsAllCustomTargetingKeysCustomizable()==null) || 
             (this.isAllCustomTargetingKeysCustomizable!=null &&
              this.isAllCustomTargetingKeysCustomizable.equals(other.getIsAllCustomTargetingKeysCustomizable()))) &&
            ((this.customizableCustomTargetingKeyIds==null && other.getCustomizableCustomTargetingKeyIds()==null) || 
             (this.customizableCustomTargetingKeyIds!=null &&
              java.util.Arrays.equals(this.customizableCustomTargetingKeyIds, other.getCustomizableCustomTargetingKeyIds()))) &&
            ((this.allowDaypartTargetingCustomization==null && other.getAllowDaypartTargetingCustomization()==null) || 
             (this.allowDaypartTargetingCustomization!=null &&
              this.allowDaypartTargetingCustomization.equals(other.getAllowDaypartTargetingCustomization()))) &&
            ((this.allowFrequencyCapsCustomization==null && other.getAllowFrequencyCapsCustomization()==null) || 
             (this.allowFrequencyCapsCustomization!=null &&
              this.allowFrequencyCapsCustomization.equals(other.getAllowFrequencyCapsCustomization()))) &&
            ((this.allowDeliverySettingsCustomization==null && other.getAllowDeliverySettingsCustomization()==null) || 
             (this.allowDeliverySettingsCustomization!=null &&
              this.allowDeliverySettingsCustomization.equals(other.getAllowDeliverySettingsCustomization()))) &&
            ((this.allowCreativePlaceholdersCustomization==null && other.getAllowCreativePlaceholdersCustomization()==null) || 
             (this.allowCreativePlaceholdersCustomization!=null &&
              this.allowCreativePlaceholdersCustomization.equals(other.getAllowCreativePlaceholdersCustomization())));
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
        if (getAllowGeoTargetingCustomization() != null) {
            _hashCode += getAllowGeoTargetingCustomization().hashCode();
        }
        if (getAllowAdUnitTargetingCustomization() != null) {
            _hashCode += getAllowAdUnitTargetingCustomization().hashCode();
        }
        if (getAllowPlacementTargetingCustomization() != null) {
            _hashCode += getAllowPlacementTargetingCustomization().hashCode();
        }
        if (getAllowUserDomainTargetingCustomization() != null) {
            _hashCode += getAllowUserDomainTargetingCustomization().hashCode();
        }
        if (getAllowBandwidthGroupTargetingCustomization() != null) {
            _hashCode += getAllowBandwidthGroupTargetingCustomization().hashCode();
        }
        if (getAllowBrowserTargetingCustomization() != null) {
            _hashCode += getAllowBrowserTargetingCustomization().hashCode();
        }
        if (getAllowBrowserLanguageTargetingCustomization() != null) {
            _hashCode += getAllowBrowserLanguageTargetingCustomization().hashCode();
        }
        if (getAllowOperatingSystemTargetingCustomization() != null) {
            _hashCode += getAllowOperatingSystemTargetingCustomization().hashCode();
        }
        if (getAllowDeviceCapabilityTargetingCustomization() != null) {
            _hashCode += getAllowDeviceCapabilityTargetingCustomization().hashCode();
        }
        if (getAllowDeviceCategoryTargetingCustomization() != null) {
            _hashCode += getAllowDeviceCategoryTargetingCustomization().hashCode();
        }
        if (getAllowMobileApplicationTargetingCustomization() != null) {
            _hashCode += getAllowMobileApplicationTargetingCustomization().hashCode();
        }
        if (getAllowMobileCarrierTargetingCustomization() != null) {
            _hashCode += getAllowMobileCarrierTargetingCustomization().hashCode();
        }
        if (getAllowMobileDeviceAndManufacturerTargetingCustomization() != null) {
            _hashCode += getAllowMobileDeviceAndManufacturerTargetingCustomization().hashCode();
        }
        if (getAllowAudienceSegmentTargetingCustomization() != null) {
            _hashCode += getAllowAudienceSegmentTargetingCustomization().hashCode();
        }
        if (getIsAllCustomTargetingKeysCustomizable() != null) {
            _hashCode += getIsAllCustomTargetingKeysCustomizable().hashCode();
        }
        if (getCustomizableCustomTargetingKeyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomizableCustomTargetingKeyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomizableCustomTargetingKeyIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowDaypartTargetingCustomization() != null) {
            _hashCode += getAllowDaypartTargetingCustomization().hashCode();
        }
        if (getAllowFrequencyCapsCustomization() != null) {
            _hashCode += getAllowFrequencyCapsCustomization().hashCode();
        }
        if (getAllowDeliverySettingsCustomization() != null) {
            _hashCode += getAllowDeliverySettingsCustomization().hashCode();
        }
        if (getAllowCreativePlaceholdersCustomization() != null) {
            _hashCode += getAllowCreativePlaceholdersCustomization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomizableAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomizableAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowGeoTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowGeoTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAdUnitTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowAdUnitTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPlacementTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowPlacementTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUserDomainTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowUserDomainTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBandwidthGroupTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowBandwidthGroupTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBrowserTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowBrowserTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBrowserLanguageTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowBrowserLanguageTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOperatingSystemTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowOperatingSystemTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDeviceCapabilityTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowDeviceCapabilityTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDeviceCategoryTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowDeviceCategoryTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMobileApplicationTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowMobileApplicationTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMobileCarrierTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowMobileCarrierTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMobileDeviceAndManufacturerTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowMobileDeviceAndManufacturerTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAudienceSegmentTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowAudienceSegmentTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllCustomTargetingKeysCustomizable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isAllCustomTargetingKeysCustomizable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizableCustomTargetingKeyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customizableCustomTargetingKeyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDaypartTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowDaypartTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFrequencyCapsCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowFrequencyCapsCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDeliverySettingsCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowDeliverySettingsCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCreativePlaceholdersCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowCreativePlaceholdersCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
