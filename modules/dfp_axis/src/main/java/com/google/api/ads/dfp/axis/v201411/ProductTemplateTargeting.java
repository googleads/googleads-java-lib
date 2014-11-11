/**
 * ProductTemplateTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * Contains targeting criteria for {@link ProductTemplate} objects.
 * {@link ProposalLineItem Proposal line items} created from {@link Product
 * products}
 *             of this template will have this criteria added to {@link
 * ProposalLineItem#targeting}.
 */
public class ProductTemplateTargeting  implements java.io.Serializable {
    /* Specifies what geographical locations are targeted by the {@link
     * ProductTemplate}.
     *                 <p>
     *                 The following rules apply for geographical targeting:
     * </p>
     *                 <ul>
     *                 <li>You cannot target and exclude the same location</li>
     * <li>You cannot target a child whose parent has been excluded. So if
     * the state
     *                 of Illinois has been excluded, then you cannot target
     * Chicago</li>
     *                 <li>You must not target a location if you are also
     * targeting its parent.
     *                 So if you are targeting New York City, you must not
     * have the state of New
     *                 York as one of the targeted locations.</li>
     *                 <li>You must not exclude a location if you are also
     * excluding its parent.
     *                 So if you are excluding New York City, you must not
     * have the state of New
     *                 York as one of the excluded locations.</li>
     *                 <li>You cannot exclude locations directly if you don't
     * have their parents as one of
     *                 the targeted locations.</li>
     *                 </ul>
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.GeoTargeting geoTargeting;

    /* Allows customization by salespeople of geographical targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowGeoTargetingCustomization;

    /* Specifies what inventory is targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201411.InventoryTargeting inventoryTargeting;

    /* Allows customization by salespeople of ad unit targeting in
     * {@link #inventoryTargeting} when creating proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowAdUnitTargetingCustomization;

    /* Allows customization by salespeople of placement targeting
     * in
     *                 {@link #inventoryTargeting} when creating proposal
     * line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowPlacementTargetingCustomization;

    /* Specifies what custom criteria are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.CustomCriteriaSet customTargeting;

    /* Specifies what custom criteria salespeople are allow to customize.
     * It refers the key id of customizable custom criteria here.
     *                 
     *                 If {@link #isAllCustomTargetingKeysCustomizable} is
     * {@code true}, then this attribute is
     *                 ignored. The attribute {@link #isAllCustomTargetingKeysCustomizable}
     * is available beginning in
     *                 V201411.
     *                 
     *                 This attribute is optional. */
    private long[] customizableCustomTargetingKeyIds;

    /* Allows customization by salespeople of audience segment targeting
     * when creating proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowAudienceSegmentTargetingCustomization;

    /* Specifies whether all custom targeting keys (except those used
     * in
     *                 {@link ProductSegmentation#customTargetingSegment})
     * are allowed to be customized by
     *                 salespeople.
     *                 
     *                 If it's true, then {@link #customizableCustomTargetingKeyIds}
     * is ignored.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean isAllCustomTargetingKeysCustomizable;

    /* Specifies what user domains are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.UserDomainTargeting userDomainTargeting;

    /* Allows customization by salespeople of user domain targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowUserDomainTargetingCustomization;

    /* Specifies what bandwidth groups are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.BandwidthGroupTargeting bandwidthGroupTargeting;

    /* Allows customization by salespeople of bandwidth group targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowBandwidthGroupTargetingCustomization;

    /* Specifies what browsers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.BrowserTargeting browserTargeting;

    /* Allows customization by salespeople of browser targeting when
     * creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowBrowserTargetingCustomization;

    /* Specifies what browser languages are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.BrowserLanguageTargeting browserLanguageTargeting;

    /* Allows customization by salespeople of browser language targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowBrowserLanguageTargetingCustomization;

    /* Specifies what operating systems targeting are targeted by
     * the {@link ProductTemplate}.
     *                 Only allow target on {@link OperatingSystem}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.OperatingSystemTargeting operatingSystemTargeting;

    /* Allows customization by salespeople of operating system targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowOperatingSystemTargetingCustomization;

    /* Specifies what device capabilities are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.DeviceCapabilityTargeting deviceCapabilityTargeting;

    /* Allows customization by salespeople of device capability targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowDeviceCapabilityTargetingCustomization;

    /* Specifies what device categories are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.DeviceCategoryTargeting deviceCategoryTargeting;

    /* Allows customization by salespeople of device category targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowDeviceCategoryTargetingCustomization;

    /* Specifies what mobile carriers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.MobileCarrierTargeting mobileCarrierTargeting;

    /* Allows customization by salespeople of mobile carrier targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowMobileCarrierTargetingCustomization;

    /* Specifies what device manufacturers are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.DeviceManufacturerTargeting deviceManufacturerTargeting;

    /* Specifies what mobile devices are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.MobileDeviceTargeting mobileDeviceTargeting;

    /* Specifies what mobile device sub-models are targeted by the
     * {@link ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting;

    /* Allows customization by salespeople of device manufacturer,
     * mobile device,
     *                 and mobile device sub-model targeting when creating
     * proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowMobileDeviceAndManufacturerTargetingCustomization;

    /* Specifies what content is targeted by the {@link ProductTemplate}.
     * 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.ContentTargeting contentTargeting;

    /* Specifies what video positions are targeted by the {@link ProductTemplate}.
     * 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201411.VideoPositionTargeting videoPositionTargeting;

    public ProductTemplateTargeting() {
    }

    public ProductTemplateTargeting(
           com.google.api.ads.dfp.axis.v201411.GeoTargeting geoTargeting,
           java.lang.Boolean allowGeoTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.InventoryTargeting inventoryTargeting,
           java.lang.Boolean allowAdUnitTargetingCustomization,
           java.lang.Boolean allowPlacementTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.CustomCriteriaSet customTargeting,
           long[] customizableCustomTargetingKeyIds,
           java.lang.Boolean allowAudienceSegmentTargetingCustomization,
           java.lang.Boolean isAllCustomTargetingKeysCustomizable,
           com.google.api.ads.dfp.axis.v201411.UserDomainTargeting userDomainTargeting,
           java.lang.Boolean allowUserDomainTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.BandwidthGroupTargeting bandwidthGroupTargeting,
           java.lang.Boolean allowBandwidthGroupTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.BrowserTargeting browserTargeting,
           java.lang.Boolean allowBrowserTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.BrowserLanguageTargeting browserLanguageTargeting,
           java.lang.Boolean allowBrowserLanguageTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.OperatingSystemTargeting operatingSystemTargeting,
           java.lang.Boolean allowOperatingSystemTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.DeviceCapabilityTargeting deviceCapabilityTargeting,
           java.lang.Boolean allowDeviceCapabilityTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.DeviceCategoryTargeting deviceCategoryTargeting,
           java.lang.Boolean allowDeviceCategoryTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.MobileCarrierTargeting mobileCarrierTargeting,
           java.lang.Boolean allowMobileCarrierTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.DeviceManufacturerTargeting deviceManufacturerTargeting,
           com.google.api.ads.dfp.axis.v201411.MobileDeviceTargeting mobileDeviceTargeting,
           com.google.api.ads.dfp.axis.v201411.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting,
           java.lang.Boolean allowMobileDeviceAndManufacturerTargetingCustomization,
           com.google.api.ads.dfp.axis.v201411.ContentTargeting contentTargeting,
           com.google.api.ads.dfp.axis.v201411.VideoPositionTargeting videoPositionTargeting) {
           this.geoTargeting = geoTargeting;
           this.allowGeoTargetingCustomization = allowGeoTargetingCustomization;
           this.inventoryTargeting = inventoryTargeting;
           this.allowAdUnitTargetingCustomization = allowAdUnitTargetingCustomization;
           this.allowPlacementTargetingCustomization = allowPlacementTargetingCustomization;
           this.customTargeting = customTargeting;
           this.customizableCustomTargetingKeyIds = customizableCustomTargetingKeyIds;
           this.allowAudienceSegmentTargetingCustomization = allowAudienceSegmentTargetingCustomization;
           this.isAllCustomTargetingKeysCustomizable = isAllCustomTargetingKeysCustomizable;
           this.userDomainTargeting = userDomainTargeting;
           this.allowUserDomainTargetingCustomization = allowUserDomainTargetingCustomization;
           this.bandwidthGroupTargeting = bandwidthGroupTargeting;
           this.allowBandwidthGroupTargetingCustomization = allowBandwidthGroupTargetingCustomization;
           this.browserTargeting = browserTargeting;
           this.allowBrowserTargetingCustomization = allowBrowserTargetingCustomization;
           this.browserLanguageTargeting = browserLanguageTargeting;
           this.allowBrowserLanguageTargetingCustomization = allowBrowserLanguageTargetingCustomization;
           this.operatingSystemTargeting = operatingSystemTargeting;
           this.allowOperatingSystemTargetingCustomization = allowOperatingSystemTargetingCustomization;
           this.deviceCapabilityTargeting = deviceCapabilityTargeting;
           this.allowDeviceCapabilityTargetingCustomization = allowDeviceCapabilityTargetingCustomization;
           this.deviceCategoryTargeting = deviceCategoryTargeting;
           this.allowDeviceCategoryTargetingCustomization = allowDeviceCategoryTargetingCustomization;
           this.mobileCarrierTargeting = mobileCarrierTargeting;
           this.allowMobileCarrierTargetingCustomization = allowMobileCarrierTargetingCustomization;
           this.deviceManufacturerTargeting = deviceManufacturerTargeting;
           this.mobileDeviceTargeting = mobileDeviceTargeting;
           this.mobileDeviceSubmodelTargeting = mobileDeviceSubmodelTargeting;
           this.allowMobileDeviceAndManufacturerTargetingCustomization = allowMobileDeviceAndManufacturerTargetingCustomization;
           this.contentTargeting = contentTargeting;
           this.videoPositionTargeting = videoPositionTargeting;
    }


    /**
     * Gets the geoTargeting value for this ProductTemplateTargeting.
     * 
     * @return geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * ProductTemplate}.
     *                 <p>
     *                 The following rules apply for geographical targeting:
     * </p>
     *                 <ul>
     *                 <li>You cannot target and exclude the same location</li>
     * <li>You cannot target a child whose parent has been excluded. So if
     * the state
     *                 of Illinois has been excluded, then you cannot target
     * Chicago</li>
     *                 <li>You must not target a location if you are also
     * targeting its parent.
     *                 So if you are targeting New York City, you must not
     * have the state of New
     *                 York as one of the targeted locations.</li>
     *                 <li>You must not exclude a location if you are also
     * excluding its parent.
     *                 So if you are excluding New York City, you must not
     * have the state of New
     *                 York as one of the excluded locations.</li>
     *                 <li>You cannot exclude locations directly if you don't
     * have their parents as one of
     *                 the targeted locations.</li>
     *                 </ul>
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.GeoTargeting getGeoTargeting() {
        return geoTargeting;
    }


    /**
     * Sets the geoTargeting value for this ProductTemplateTargeting.
     * 
     * @param geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * ProductTemplate}.
     *                 <p>
     *                 The following rules apply for geographical targeting:
     * </p>
     *                 <ul>
     *                 <li>You cannot target and exclude the same location</li>
     * <li>You cannot target a child whose parent has been excluded. So if
     * the state
     *                 of Illinois has been excluded, then you cannot target
     * Chicago</li>
     *                 <li>You must not target a location if you are also
     * targeting its parent.
     *                 So if you are targeting New York City, you must not
     * have the state of New
     *                 York as one of the targeted locations.</li>
     *                 <li>You must not exclude a location if you are also
     * excluding its parent.
     *                 So if you are excluding New York City, you must not
     * have the state of New
     *                 York as one of the excluded locations.</li>
     *                 <li>You cannot exclude locations directly if you don't
     * have their parents as one of
     *                 the targeted locations.</li>
     *                 </ul>
     *                 This attribute is optional.
     */
    public void setGeoTargeting(com.google.api.ads.dfp.axis.v201411.GeoTargeting geoTargeting) {
        this.geoTargeting = geoTargeting;
    }


    /**
     * Gets the allowGeoTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowGeoTargetingCustomization   * Allows customization by salespeople of geographical targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowGeoTargetingCustomization() {
        return allowGeoTargetingCustomization;
    }


    /**
     * Sets the allowGeoTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowGeoTargetingCustomization   * Allows customization by salespeople of geographical targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowGeoTargetingCustomization(java.lang.Boolean allowGeoTargetingCustomization) {
        this.allowGeoTargetingCustomization = allowGeoTargetingCustomization;
    }


    /**
     * Gets the inventoryTargeting value for this ProductTemplateTargeting.
     * 
     * @return inventoryTargeting   * Specifies what inventory is targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201411.InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }


    /**
     * Sets the inventoryTargeting value for this ProductTemplateTargeting.
     * 
     * @param inventoryTargeting   * Specifies what inventory is targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is required.
     */
    public void setInventoryTargeting(com.google.api.ads.dfp.axis.v201411.InventoryTargeting inventoryTargeting) {
        this.inventoryTargeting = inventoryTargeting;
    }


    /**
     * Gets the allowAdUnitTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowAdUnitTargetingCustomization   * Allows customization by salespeople of ad unit targeting in
     * {@link #inventoryTargeting} when creating proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowAdUnitTargetingCustomization() {
        return allowAdUnitTargetingCustomization;
    }


    /**
     * Sets the allowAdUnitTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowAdUnitTargetingCustomization   * Allows customization by salespeople of ad unit targeting in
     * {@link #inventoryTargeting} when creating proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowAdUnitTargetingCustomization(java.lang.Boolean allowAdUnitTargetingCustomization) {
        this.allowAdUnitTargetingCustomization = allowAdUnitTargetingCustomization;
    }


    /**
     * Gets the allowPlacementTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowPlacementTargetingCustomization   * Allows customization by salespeople of placement targeting
     * in
     *                 {@link #inventoryTargeting} when creating proposal
     * line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowPlacementTargetingCustomization() {
        return allowPlacementTargetingCustomization;
    }


    /**
     * Sets the allowPlacementTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowPlacementTargetingCustomization   * Allows customization by salespeople of placement targeting
     * in
     *                 {@link #inventoryTargeting} when creating proposal
     * line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowPlacementTargetingCustomization(java.lang.Boolean allowPlacementTargetingCustomization) {
        this.allowPlacementTargetingCustomization = allowPlacementTargetingCustomization;
    }


    /**
     * Gets the customTargeting value for this ProductTemplateTargeting.
     * 
     * @return customTargeting   * Specifies what custom criteria are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.CustomCriteriaSet getCustomTargeting() {
        return customTargeting;
    }


    /**
     * Sets the customTargeting value for this ProductTemplateTargeting.
     * 
     * @param customTargeting   * Specifies what custom criteria are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setCustomTargeting(com.google.api.ads.dfp.axis.v201411.CustomCriteriaSet customTargeting) {
        this.customTargeting = customTargeting;
    }


    /**
     * Gets the customizableCustomTargetingKeyIds value for this ProductTemplateTargeting.
     * 
     * @return customizableCustomTargetingKeyIds   * Specifies what custom criteria salespeople are allow to customize.
     * It refers the key id of customizable custom criteria here.
     *                 
     *                 If {@link #isAllCustomTargetingKeysCustomizable} is
     * {@code true}, then this attribute is
     *                 ignored. The attribute {@link #isAllCustomTargetingKeysCustomizable}
     * is available beginning in
     *                 V201411.
     *                 
     *                 This attribute is optional.
     */
    public long[] getCustomizableCustomTargetingKeyIds() {
        return customizableCustomTargetingKeyIds;
    }


    /**
     * Sets the customizableCustomTargetingKeyIds value for this ProductTemplateTargeting.
     * 
     * @param customizableCustomTargetingKeyIds   * Specifies what custom criteria salespeople are allow to customize.
     * It refers the key id of customizable custom criteria here.
     *                 
     *                 If {@link #isAllCustomTargetingKeysCustomizable} is
     * {@code true}, then this attribute is
     *                 ignored. The attribute {@link #isAllCustomTargetingKeysCustomizable}
     * is available beginning in
     *                 V201411.
     *                 
     *                 This attribute is optional.
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
     * Gets the allowAudienceSegmentTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowAudienceSegmentTargetingCustomization   * Allows customization by salespeople of audience segment targeting
     * when creating proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowAudienceSegmentTargetingCustomization() {
        return allowAudienceSegmentTargetingCustomization;
    }


    /**
     * Sets the allowAudienceSegmentTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowAudienceSegmentTargetingCustomization   * Allows customization by salespeople of audience segment targeting
     * when creating proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowAudienceSegmentTargetingCustomization(java.lang.Boolean allowAudienceSegmentTargetingCustomization) {
        this.allowAudienceSegmentTargetingCustomization = allowAudienceSegmentTargetingCustomization;
    }


    /**
     * Gets the isAllCustomTargetingKeysCustomizable value for this ProductTemplateTargeting.
     * 
     * @return isAllCustomTargetingKeysCustomizable   * Specifies whether all custom targeting keys (except those used
     * in
     *                 {@link ProductSegmentation#customTargetingSegment})
     * are allowed to be customized by
     *                 salespeople.
     *                 
     *                 If it's true, then {@link #customizableCustomTargetingKeyIds}
     * is ignored.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getIsAllCustomTargetingKeysCustomizable() {
        return isAllCustomTargetingKeysCustomizable;
    }


    /**
     * Sets the isAllCustomTargetingKeysCustomizable value for this ProductTemplateTargeting.
     * 
     * @param isAllCustomTargetingKeysCustomizable   * Specifies whether all custom targeting keys (except those used
     * in
     *                 {@link ProductSegmentation#customTargetingSegment})
     * are allowed to be customized by
     *                 salespeople.
     *                 
     *                 If it's true, then {@link #customizableCustomTargetingKeyIds}
     * is ignored.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setIsAllCustomTargetingKeysCustomizable(java.lang.Boolean isAllCustomTargetingKeysCustomizable) {
        this.isAllCustomTargetingKeysCustomizable = isAllCustomTargetingKeysCustomizable;
    }


    /**
     * Gets the userDomainTargeting value for this ProductTemplateTargeting.
     * 
     * @return userDomainTargeting   * Specifies what user domains are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.UserDomainTargeting getUserDomainTargeting() {
        return userDomainTargeting;
    }


    /**
     * Sets the userDomainTargeting value for this ProductTemplateTargeting.
     * 
     * @param userDomainTargeting   * Specifies what user domains are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setUserDomainTargeting(com.google.api.ads.dfp.axis.v201411.UserDomainTargeting userDomainTargeting) {
        this.userDomainTargeting = userDomainTargeting;
    }


    /**
     * Gets the allowUserDomainTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowUserDomainTargetingCustomization   * Allows customization by salespeople of user domain targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowUserDomainTargetingCustomization() {
        return allowUserDomainTargetingCustomization;
    }


    /**
     * Sets the allowUserDomainTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowUserDomainTargetingCustomization   * Allows customization by salespeople of user domain targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowUserDomainTargetingCustomization(java.lang.Boolean allowUserDomainTargetingCustomization) {
        this.allowUserDomainTargetingCustomization = allowUserDomainTargetingCustomization;
    }


    /**
     * Gets the bandwidthGroupTargeting value for this ProductTemplateTargeting.
     * 
     * @return bandwidthGroupTargeting   * Specifies what bandwidth groups are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.BandwidthGroupTargeting getBandwidthGroupTargeting() {
        return bandwidthGroupTargeting;
    }


    /**
     * Sets the bandwidthGroupTargeting value for this ProductTemplateTargeting.
     * 
     * @param bandwidthGroupTargeting   * Specifies what bandwidth groups are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public void setBandwidthGroupTargeting(com.google.api.ads.dfp.axis.v201411.BandwidthGroupTargeting bandwidthGroupTargeting) {
        this.bandwidthGroupTargeting = bandwidthGroupTargeting;
    }


    /**
     * Gets the allowBandwidthGroupTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowBandwidthGroupTargetingCustomization   * Allows customization by salespeople of bandwidth group targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowBandwidthGroupTargetingCustomization() {
        return allowBandwidthGroupTargetingCustomization;
    }


    /**
     * Sets the allowBandwidthGroupTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowBandwidthGroupTargetingCustomization   * Allows customization by salespeople of bandwidth group targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowBandwidthGroupTargetingCustomization(java.lang.Boolean allowBandwidthGroupTargetingCustomization) {
        this.allowBandwidthGroupTargetingCustomization = allowBandwidthGroupTargetingCustomization;
    }


    /**
     * Gets the browserTargeting value for this ProductTemplateTargeting.
     * 
     * @return browserTargeting   * Specifies what browsers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.BrowserTargeting getBrowserTargeting() {
        return browserTargeting;
    }


    /**
     * Sets the browserTargeting value for this ProductTemplateTargeting.
     * 
     * @param browserTargeting   * Specifies what browsers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setBrowserTargeting(com.google.api.ads.dfp.axis.v201411.BrowserTargeting browserTargeting) {
        this.browserTargeting = browserTargeting;
    }


    /**
     * Gets the allowBrowserTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowBrowserTargetingCustomization   * Allows customization by salespeople of browser targeting when
     * creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowBrowserTargetingCustomization() {
        return allowBrowserTargetingCustomization;
    }


    /**
     * Sets the allowBrowserTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowBrowserTargetingCustomization   * Allows customization by salespeople of browser targeting when
     * creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowBrowserTargetingCustomization(java.lang.Boolean allowBrowserTargetingCustomization) {
        this.allowBrowserTargetingCustomization = allowBrowserTargetingCustomization;
    }


    /**
     * Gets the browserLanguageTargeting value for this ProductTemplateTargeting.
     * 
     * @return browserLanguageTargeting   * Specifies what browser languages are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.BrowserLanguageTargeting getBrowserLanguageTargeting() {
        return browserLanguageTargeting;
    }


    /**
     * Sets the browserLanguageTargeting value for this ProductTemplateTargeting.
     * 
     * @param browserLanguageTargeting   * Specifies what browser languages are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public void setBrowserLanguageTargeting(com.google.api.ads.dfp.axis.v201411.BrowserLanguageTargeting browserLanguageTargeting) {
        this.browserLanguageTargeting = browserLanguageTargeting;
    }


    /**
     * Gets the allowBrowserLanguageTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowBrowserLanguageTargetingCustomization   * Allows customization by salespeople of browser language targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowBrowserLanguageTargetingCustomization() {
        return allowBrowserLanguageTargetingCustomization;
    }


    /**
     * Sets the allowBrowserLanguageTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowBrowserLanguageTargetingCustomization   * Allows customization by salespeople of browser language targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowBrowserLanguageTargetingCustomization(java.lang.Boolean allowBrowserLanguageTargetingCustomization) {
        this.allowBrowserLanguageTargetingCustomization = allowBrowserLanguageTargetingCustomization;
    }


    /**
     * Gets the operatingSystemTargeting value for this ProductTemplateTargeting.
     * 
     * @return operatingSystemTargeting   * Specifies what operating systems targeting are targeted by
     * the {@link ProductTemplate}.
     *                 Only allow target on {@link OperatingSystem}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.OperatingSystemTargeting getOperatingSystemTargeting() {
        return operatingSystemTargeting;
    }


    /**
     * Sets the operatingSystemTargeting value for this ProductTemplateTargeting.
     * 
     * @param operatingSystemTargeting   * Specifies what operating systems targeting are targeted by
     * the {@link ProductTemplate}.
     *                 Only allow target on {@link OperatingSystem}.
     *                 
     *                 This attribute is optional.
     */
    public void setOperatingSystemTargeting(com.google.api.ads.dfp.axis.v201411.OperatingSystemTargeting operatingSystemTargeting) {
        this.operatingSystemTargeting = operatingSystemTargeting;
    }


    /**
     * Gets the allowOperatingSystemTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowOperatingSystemTargetingCustomization   * Allows customization by salespeople of operating system targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowOperatingSystemTargetingCustomization() {
        return allowOperatingSystemTargetingCustomization;
    }


    /**
     * Sets the allowOperatingSystemTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowOperatingSystemTargetingCustomization   * Allows customization by salespeople of operating system targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowOperatingSystemTargetingCustomization(java.lang.Boolean allowOperatingSystemTargetingCustomization) {
        this.allowOperatingSystemTargetingCustomization = allowOperatingSystemTargetingCustomization;
    }


    /**
     * Gets the deviceCapabilityTargeting value for this ProductTemplateTargeting.
     * 
     * @return deviceCapabilityTargeting   * Specifies what device capabilities are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.DeviceCapabilityTargeting getDeviceCapabilityTargeting() {
        return deviceCapabilityTargeting;
    }


    /**
     * Sets the deviceCapabilityTargeting value for this ProductTemplateTargeting.
     * 
     * @param deviceCapabilityTargeting   * Specifies what device capabilities are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public void setDeviceCapabilityTargeting(com.google.api.ads.dfp.axis.v201411.DeviceCapabilityTargeting deviceCapabilityTargeting) {
        this.deviceCapabilityTargeting = deviceCapabilityTargeting;
    }


    /**
     * Gets the allowDeviceCapabilityTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowDeviceCapabilityTargetingCustomization   * Allows customization by salespeople of device capability targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowDeviceCapabilityTargetingCustomization() {
        return allowDeviceCapabilityTargetingCustomization;
    }


    /**
     * Sets the allowDeviceCapabilityTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowDeviceCapabilityTargetingCustomization   * Allows customization by salespeople of device capability targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowDeviceCapabilityTargetingCustomization(java.lang.Boolean allowDeviceCapabilityTargetingCustomization) {
        this.allowDeviceCapabilityTargetingCustomization = allowDeviceCapabilityTargetingCustomization;
    }


    /**
     * Gets the deviceCategoryTargeting value for this ProductTemplateTargeting.
     * 
     * @return deviceCategoryTargeting   * Specifies what device categories are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.DeviceCategoryTargeting getDeviceCategoryTargeting() {
        return deviceCategoryTargeting;
    }


    /**
     * Sets the deviceCategoryTargeting value for this ProductTemplateTargeting.
     * 
     * @param deviceCategoryTargeting   * Specifies what device categories are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public void setDeviceCategoryTargeting(com.google.api.ads.dfp.axis.v201411.DeviceCategoryTargeting deviceCategoryTargeting) {
        this.deviceCategoryTargeting = deviceCategoryTargeting;
    }


    /**
     * Gets the allowDeviceCategoryTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowDeviceCategoryTargetingCustomization   * Allows customization by salespeople of device category targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowDeviceCategoryTargetingCustomization() {
        return allowDeviceCategoryTargetingCustomization;
    }


    /**
     * Sets the allowDeviceCategoryTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowDeviceCategoryTargetingCustomization   * Allows customization by salespeople of device category targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowDeviceCategoryTargetingCustomization(java.lang.Boolean allowDeviceCategoryTargetingCustomization) {
        this.allowDeviceCategoryTargetingCustomization = allowDeviceCategoryTargetingCustomization;
    }


    /**
     * Gets the mobileCarrierTargeting value for this ProductTemplateTargeting.
     * 
     * @return mobileCarrierTargeting   * Specifies what mobile carriers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.MobileCarrierTargeting getMobileCarrierTargeting() {
        return mobileCarrierTargeting;
    }


    /**
     * Sets the mobileCarrierTargeting value for this ProductTemplateTargeting.
     * 
     * @param mobileCarrierTargeting   * Specifies what mobile carriers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setMobileCarrierTargeting(com.google.api.ads.dfp.axis.v201411.MobileCarrierTargeting mobileCarrierTargeting) {
        this.mobileCarrierTargeting = mobileCarrierTargeting;
    }


    /**
     * Gets the allowMobileCarrierTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowMobileCarrierTargetingCustomization   * Allows customization by salespeople of mobile carrier targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowMobileCarrierTargetingCustomization() {
        return allowMobileCarrierTargetingCustomization;
    }


    /**
     * Sets the allowMobileCarrierTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowMobileCarrierTargetingCustomization   * Allows customization by salespeople of mobile carrier targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowMobileCarrierTargetingCustomization(java.lang.Boolean allowMobileCarrierTargetingCustomization) {
        this.allowMobileCarrierTargetingCustomization = allowMobileCarrierTargetingCustomization;
    }


    /**
     * Gets the deviceManufacturerTargeting value for this ProductTemplateTargeting.
     * 
     * @return deviceManufacturerTargeting   * Specifies what device manufacturers are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.DeviceManufacturerTargeting getDeviceManufacturerTargeting() {
        return deviceManufacturerTargeting;
    }


    /**
     * Sets the deviceManufacturerTargeting value for this ProductTemplateTargeting.
     * 
     * @param deviceManufacturerTargeting   * Specifies what device manufacturers are targeted by the {@link
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public void setDeviceManufacturerTargeting(com.google.api.ads.dfp.axis.v201411.DeviceManufacturerTargeting deviceManufacturerTargeting) {
        this.deviceManufacturerTargeting = deviceManufacturerTargeting;
    }


    /**
     * Gets the mobileDeviceTargeting value for this ProductTemplateTargeting.
     * 
     * @return mobileDeviceTargeting   * Specifies what mobile devices are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.MobileDeviceTargeting getMobileDeviceTargeting() {
        return mobileDeviceTargeting;
    }


    /**
     * Sets the mobileDeviceTargeting value for this ProductTemplateTargeting.
     * 
     * @param mobileDeviceTargeting   * Specifies what mobile devices are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setMobileDeviceTargeting(com.google.api.ads.dfp.axis.v201411.MobileDeviceTargeting mobileDeviceTargeting) {
        this.mobileDeviceTargeting = mobileDeviceTargeting;
    }


    /**
     * Gets the mobileDeviceSubmodelTargeting value for this ProductTemplateTargeting.
     * 
     * @return mobileDeviceSubmodelTargeting   * Specifies what mobile device sub-models are targeted by the
     * {@link ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.MobileDeviceSubmodelTargeting getMobileDeviceSubmodelTargeting() {
        return mobileDeviceSubmodelTargeting;
    }


    /**
     * Sets the mobileDeviceSubmodelTargeting value for this ProductTemplateTargeting.
     * 
     * @param mobileDeviceSubmodelTargeting   * Specifies what mobile device sub-models are targeted by the
     * {@link ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public void setMobileDeviceSubmodelTargeting(com.google.api.ads.dfp.axis.v201411.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting) {
        this.mobileDeviceSubmodelTargeting = mobileDeviceSubmodelTargeting;
    }


    /**
     * Gets the allowMobileDeviceAndManufacturerTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @return allowMobileDeviceAndManufacturerTargetingCustomization   * Allows customization by salespeople of device manufacturer,
     * mobile device,
     *                 and mobile device sub-model targeting when creating
     * proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getAllowMobileDeviceAndManufacturerTargetingCustomization() {
        return allowMobileDeviceAndManufacturerTargetingCustomization;
    }


    /**
     * Sets the allowMobileDeviceAndManufacturerTargetingCustomization value for this ProductTemplateTargeting.
     * 
     * @param allowMobileDeviceAndManufacturerTargetingCustomization   * Allows customization by salespeople of device manufacturer,
     * mobile device,
     *                 and mobile device sub-model targeting when creating
     * proposal line items.
     *                 
     *                 This attribute is optional and defaults to false.
     */
    public void setAllowMobileDeviceAndManufacturerTargetingCustomization(java.lang.Boolean allowMobileDeviceAndManufacturerTargetingCustomization) {
        this.allowMobileDeviceAndManufacturerTargetingCustomization = allowMobileDeviceAndManufacturerTargetingCustomization;
    }


    /**
     * Gets the contentTargeting value for this ProductTemplateTargeting.
     * 
     * @return contentTargeting   * Specifies what content is targeted by the {@link ProductTemplate}.
     * 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.ContentTargeting getContentTargeting() {
        return contentTargeting;
    }


    /**
     * Sets the contentTargeting value for this ProductTemplateTargeting.
     * 
     * @param contentTargeting   * Specifies what content is targeted by the {@link ProductTemplate}.
     * 
     *                 <p>This attribute is optional.
     */
    public void setContentTargeting(com.google.api.ads.dfp.axis.v201411.ContentTargeting contentTargeting) {
        this.contentTargeting = contentTargeting;
    }


    /**
     * Gets the videoPositionTargeting value for this ProductTemplateTargeting.
     * 
     * @return videoPositionTargeting   * Specifies what video positions are targeted by the {@link ProductTemplate}.
     * 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201411.VideoPositionTargeting getVideoPositionTargeting() {
        return videoPositionTargeting;
    }


    /**
     * Sets the videoPositionTargeting value for this ProductTemplateTargeting.
     * 
     * @param videoPositionTargeting   * Specifies what video positions are targeted by the {@link ProductTemplate}.
     * 
     *                 <p>This attribute is optional.
     */
    public void setVideoPositionTargeting(com.google.api.ads.dfp.axis.v201411.VideoPositionTargeting videoPositionTargeting) {
        this.videoPositionTargeting = videoPositionTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductTemplateTargeting)) return false;
        ProductTemplateTargeting other = (ProductTemplateTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoTargeting==null && other.getGeoTargeting()==null) || 
             (this.geoTargeting!=null &&
              this.geoTargeting.equals(other.getGeoTargeting()))) &&
            ((this.allowGeoTargetingCustomization==null && other.getAllowGeoTargetingCustomization()==null) || 
             (this.allowGeoTargetingCustomization!=null &&
              this.allowGeoTargetingCustomization.equals(other.getAllowGeoTargetingCustomization()))) &&
            ((this.inventoryTargeting==null && other.getInventoryTargeting()==null) || 
             (this.inventoryTargeting!=null &&
              this.inventoryTargeting.equals(other.getInventoryTargeting()))) &&
            ((this.allowAdUnitTargetingCustomization==null && other.getAllowAdUnitTargetingCustomization()==null) || 
             (this.allowAdUnitTargetingCustomization!=null &&
              this.allowAdUnitTargetingCustomization.equals(other.getAllowAdUnitTargetingCustomization()))) &&
            ((this.allowPlacementTargetingCustomization==null && other.getAllowPlacementTargetingCustomization()==null) || 
             (this.allowPlacementTargetingCustomization!=null &&
              this.allowPlacementTargetingCustomization.equals(other.getAllowPlacementTargetingCustomization()))) &&
            ((this.customTargeting==null && other.getCustomTargeting()==null) || 
             (this.customTargeting!=null &&
              this.customTargeting.equals(other.getCustomTargeting()))) &&
            ((this.customizableCustomTargetingKeyIds==null && other.getCustomizableCustomTargetingKeyIds()==null) || 
             (this.customizableCustomTargetingKeyIds!=null &&
              java.util.Arrays.equals(this.customizableCustomTargetingKeyIds, other.getCustomizableCustomTargetingKeyIds()))) &&
            ((this.allowAudienceSegmentTargetingCustomization==null && other.getAllowAudienceSegmentTargetingCustomization()==null) || 
             (this.allowAudienceSegmentTargetingCustomization!=null &&
              this.allowAudienceSegmentTargetingCustomization.equals(other.getAllowAudienceSegmentTargetingCustomization()))) &&
            ((this.isAllCustomTargetingKeysCustomizable==null && other.getIsAllCustomTargetingKeysCustomizable()==null) || 
             (this.isAllCustomTargetingKeysCustomizable!=null &&
              this.isAllCustomTargetingKeysCustomizable.equals(other.getIsAllCustomTargetingKeysCustomizable()))) &&
            ((this.userDomainTargeting==null && other.getUserDomainTargeting()==null) || 
             (this.userDomainTargeting!=null &&
              this.userDomainTargeting.equals(other.getUserDomainTargeting()))) &&
            ((this.allowUserDomainTargetingCustomization==null && other.getAllowUserDomainTargetingCustomization()==null) || 
             (this.allowUserDomainTargetingCustomization!=null &&
              this.allowUserDomainTargetingCustomization.equals(other.getAllowUserDomainTargetingCustomization()))) &&
            ((this.bandwidthGroupTargeting==null && other.getBandwidthGroupTargeting()==null) || 
             (this.bandwidthGroupTargeting!=null &&
              this.bandwidthGroupTargeting.equals(other.getBandwidthGroupTargeting()))) &&
            ((this.allowBandwidthGroupTargetingCustomization==null && other.getAllowBandwidthGroupTargetingCustomization()==null) || 
             (this.allowBandwidthGroupTargetingCustomization!=null &&
              this.allowBandwidthGroupTargetingCustomization.equals(other.getAllowBandwidthGroupTargetingCustomization()))) &&
            ((this.browserTargeting==null && other.getBrowserTargeting()==null) || 
             (this.browserTargeting!=null &&
              this.browserTargeting.equals(other.getBrowserTargeting()))) &&
            ((this.allowBrowserTargetingCustomization==null && other.getAllowBrowserTargetingCustomization()==null) || 
             (this.allowBrowserTargetingCustomization!=null &&
              this.allowBrowserTargetingCustomization.equals(other.getAllowBrowserTargetingCustomization()))) &&
            ((this.browserLanguageTargeting==null && other.getBrowserLanguageTargeting()==null) || 
             (this.browserLanguageTargeting!=null &&
              this.browserLanguageTargeting.equals(other.getBrowserLanguageTargeting()))) &&
            ((this.allowBrowserLanguageTargetingCustomization==null && other.getAllowBrowserLanguageTargetingCustomization()==null) || 
             (this.allowBrowserLanguageTargetingCustomization!=null &&
              this.allowBrowserLanguageTargetingCustomization.equals(other.getAllowBrowserLanguageTargetingCustomization()))) &&
            ((this.operatingSystemTargeting==null && other.getOperatingSystemTargeting()==null) || 
             (this.operatingSystemTargeting!=null &&
              this.operatingSystemTargeting.equals(other.getOperatingSystemTargeting()))) &&
            ((this.allowOperatingSystemTargetingCustomization==null && other.getAllowOperatingSystemTargetingCustomization()==null) || 
             (this.allowOperatingSystemTargetingCustomization!=null &&
              this.allowOperatingSystemTargetingCustomization.equals(other.getAllowOperatingSystemTargetingCustomization()))) &&
            ((this.deviceCapabilityTargeting==null && other.getDeviceCapabilityTargeting()==null) || 
             (this.deviceCapabilityTargeting!=null &&
              this.deviceCapabilityTargeting.equals(other.getDeviceCapabilityTargeting()))) &&
            ((this.allowDeviceCapabilityTargetingCustomization==null && other.getAllowDeviceCapabilityTargetingCustomization()==null) || 
             (this.allowDeviceCapabilityTargetingCustomization!=null &&
              this.allowDeviceCapabilityTargetingCustomization.equals(other.getAllowDeviceCapabilityTargetingCustomization()))) &&
            ((this.deviceCategoryTargeting==null && other.getDeviceCategoryTargeting()==null) || 
             (this.deviceCategoryTargeting!=null &&
              this.deviceCategoryTargeting.equals(other.getDeviceCategoryTargeting()))) &&
            ((this.allowDeviceCategoryTargetingCustomization==null && other.getAllowDeviceCategoryTargetingCustomization()==null) || 
             (this.allowDeviceCategoryTargetingCustomization!=null &&
              this.allowDeviceCategoryTargetingCustomization.equals(other.getAllowDeviceCategoryTargetingCustomization()))) &&
            ((this.mobileCarrierTargeting==null && other.getMobileCarrierTargeting()==null) || 
             (this.mobileCarrierTargeting!=null &&
              this.mobileCarrierTargeting.equals(other.getMobileCarrierTargeting()))) &&
            ((this.allowMobileCarrierTargetingCustomization==null && other.getAllowMobileCarrierTargetingCustomization()==null) || 
             (this.allowMobileCarrierTargetingCustomization!=null &&
              this.allowMobileCarrierTargetingCustomization.equals(other.getAllowMobileCarrierTargetingCustomization()))) &&
            ((this.deviceManufacturerTargeting==null && other.getDeviceManufacturerTargeting()==null) || 
             (this.deviceManufacturerTargeting!=null &&
              this.deviceManufacturerTargeting.equals(other.getDeviceManufacturerTargeting()))) &&
            ((this.mobileDeviceTargeting==null && other.getMobileDeviceTargeting()==null) || 
             (this.mobileDeviceTargeting!=null &&
              this.mobileDeviceTargeting.equals(other.getMobileDeviceTargeting()))) &&
            ((this.mobileDeviceSubmodelTargeting==null && other.getMobileDeviceSubmodelTargeting()==null) || 
             (this.mobileDeviceSubmodelTargeting!=null &&
              this.mobileDeviceSubmodelTargeting.equals(other.getMobileDeviceSubmodelTargeting()))) &&
            ((this.allowMobileDeviceAndManufacturerTargetingCustomization==null && other.getAllowMobileDeviceAndManufacturerTargetingCustomization()==null) || 
             (this.allowMobileDeviceAndManufacturerTargetingCustomization!=null &&
              this.allowMobileDeviceAndManufacturerTargetingCustomization.equals(other.getAllowMobileDeviceAndManufacturerTargetingCustomization()))) &&
            ((this.contentTargeting==null && other.getContentTargeting()==null) || 
             (this.contentTargeting!=null &&
              this.contentTargeting.equals(other.getContentTargeting()))) &&
            ((this.videoPositionTargeting==null && other.getVideoPositionTargeting()==null) || 
             (this.videoPositionTargeting!=null &&
              this.videoPositionTargeting.equals(other.getVideoPositionTargeting())));
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
        if (getGeoTargeting() != null) {
            _hashCode += getGeoTargeting().hashCode();
        }
        if (getAllowGeoTargetingCustomization() != null) {
            _hashCode += getAllowGeoTargetingCustomization().hashCode();
        }
        if (getInventoryTargeting() != null) {
            _hashCode += getInventoryTargeting().hashCode();
        }
        if (getAllowAdUnitTargetingCustomization() != null) {
            _hashCode += getAllowAdUnitTargetingCustomization().hashCode();
        }
        if (getAllowPlacementTargetingCustomization() != null) {
            _hashCode += getAllowPlacementTargetingCustomization().hashCode();
        }
        if (getCustomTargeting() != null) {
            _hashCode += getCustomTargeting().hashCode();
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
        if (getAllowAudienceSegmentTargetingCustomization() != null) {
            _hashCode += getAllowAudienceSegmentTargetingCustomization().hashCode();
        }
        if (getIsAllCustomTargetingKeysCustomizable() != null) {
            _hashCode += getIsAllCustomTargetingKeysCustomizable().hashCode();
        }
        if (getUserDomainTargeting() != null) {
            _hashCode += getUserDomainTargeting().hashCode();
        }
        if (getAllowUserDomainTargetingCustomization() != null) {
            _hashCode += getAllowUserDomainTargetingCustomization().hashCode();
        }
        if (getBandwidthGroupTargeting() != null) {
            _hashCode += getBandwidthGroupTargeting().hashCode();
        }
        if (getAllowBandwidthGroupTargetingCustomization() != null) {
            _hashCode += getAllowBandwidthGroupTargetingCustomization().hashCode();
        }
        if (getBrowserTargeting() != null) {
            _hashCode += getBrowserTargeting().hashCode();
        }
        if (getAllowBrowserTargetingCustomization() != null) {
            _hashCode += getAllowBrowserTargetingCustomization().hashCode();
        }
        if (getBrowserLanguageTargeting() != null) {
            _hashCode += getBrowserLanguageTargeting().hashCode();
        }
        if (getAllowBrowserLanguageTargetingCustomization() != null) {
            _hashCode += getAllowBrowserLanguageTargetingCustomization().hashCode();
        }
        if (getOperatingSystemTargeting() != null) {
            _hashCode += getOperatingSystemTargeting().hashCode();
        }
        if (getAllowOperatingSystemTargetingCustomization() != null) {
            _hashCode += getAllowOperatingSystemTargetingCustomization().hashCode();
        }
        if (getDeviceCapabilityTargeting() != null) {
            _hashCode += getDeviceCapabilityTargeting().hashCode();
        }
        if (getAllowDeviceCapabilityTargetingCustomization() != null) {
            _hashCode += getAllowDeviceCapabilityTargetingCustomization().hashCode();
        }
        if (getDeviceCategoryTargeting() != null) {
            _hashCode += getDeviceCategoryTargeting().hashCode();
        }
        if (getAllowDeviceCategoryTargetingCustomization() != null) {
            _hashCode += getAllowDeviceCategoryTargetingCustomization().hashCode();
        }
        if (getMobileCarrierTargeting() != null) {
            _hashCode += getMobileCarrierTargeting().hashCode();
        }
        if (getAllowMobileCarrierTargetingCustomization() != null) {
            _hashCode += getAllowMobileCarrierTargetingCustomization().hashCode();
        }
        if (getDeviceManufacturerTargeting() != null) {
            _hashCode += getDeviceManufacturerTargeting().hashCode();
        }
        if (getMobileDeviceTargeting() != null) {
            _hashCode += getMobileDeviceTargeting().hashCode();
        }
        if (getMobileDeviceSubmodelTargeting() != null) {
            _hashCode += getMobileDeviceSubmodelTargeting().hashCode();
        }
        if (getAllowMobileDeviceAndManufacturerTargetingCustomization() != null) {
            _hashCode += getAllowMobileDeviceAndManufacturerTargetingCustomization().hashCode();
        }
        if (getContentTargeting() != null) {
            _hashCode += getContentTargeting().hashCode();
        }
        if (getVideoPositionTargeting() != null) {
            _hashCode += getVideoPositionTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductTemplateTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "ProductTemplateTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "geoTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowGeoTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowGeoTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "inventoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "InventoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAdUnitTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowAdUnitTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPlacementTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowPlacementTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "customTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "CustomCriteriaSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizableCustomTargetingKeyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "customizableCustomTargetingKeyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAudienceSegmentTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowAudienceSegmentTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllCustomTargetingKeysCustomizable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "isAllCustomTargetingKeysCustomizable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDomainTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "userDomainTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "UserDomainTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUserDomainTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowUserDomainTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthGroupTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "bandwidthGroupTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "BandwidthGroupTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBandwidthGroupTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowBandwidthGroupTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "browserTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "BrowserTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBrowserTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowBrowserTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserLanguageTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "browserLanguageTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "BrowserLanguageTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBrowserLanguageTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowBrowserLanguageTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "operatingSystemTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "OperatingSystemTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOperatingSystemTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowOperatingSystemTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCapabilityTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "deviceCapabilityTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "DeviceCapabilityTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDeviceCapabilityTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowDeviceCapabilityTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCategoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "deviceCategoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "DeviceCategoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDeviceCategoryTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowDeviceCategoryTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCarrierTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "mobileCarrierTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "MobileCarrierTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMobileCarrierTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowMobileCarrierTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceManufacturerTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "deviceManufacturerTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "DeviceManufacturerTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "mobileDeviceTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "MobileDeviceTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceSubmodelTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "mobileDeviceSubmodelTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "MobileDeviceSubmodelTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMobileDeviceAndManufacturerTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "allowMobileDeviceAndManufacturerTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "contentTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "ContentTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPositionTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "videoPositionTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "VideoPositionTargeting"));
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
