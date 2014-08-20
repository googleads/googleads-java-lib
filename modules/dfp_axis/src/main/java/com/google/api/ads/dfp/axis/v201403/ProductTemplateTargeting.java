/**
 * ProductTemplateTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;


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
    private com.google.api.ads.dfp.axis.v201403.GeoTargeting geoTargeting;

    /* Allows customization by salespeople of geographical targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowGeoTargetingCustomization;

    /* Specifies what inventory is targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201403.InventoryTargeting inventoryTargeting;

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
    private com.google.api.ads.dfp.axis.v201403.CustomCriteriaSet customTargeting;

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

    /* Specifies what user domains are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.UserDomainTargeting userDomainTargeting;

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
    private com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting bandwidthGroupTargeting;

    /* Allows customization by salespeople of bandwidth group targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowBandwidthGroupTargetingCustomization;

    /* Specifies what browsers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.BrowserTargeting browserTargeting;

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
    private com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting browserLanguageTargeting;

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
    private com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting operatingSystemTargeting;

    /* Allows customization by salespeople of operating system targeting
     * when creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false. */
    private java.lang.Boolean allowOperatingSystemTargetingCustomization;

    public ProductTemplateTargeting() {
    }

    public ProductTemplateTargeting(
           com.google.api.ads.dfp.axis.v201403.GeoTargeting geoTargeting,
           java.lang.Boolean allowGeoTargetingCustomization,
           com.google.api.ads.dfp.axis.v201403.InventoryTargeting inventoryTargeting,
           java.lang.Boolean allowAdUnitTargetingCustomization,
           java.lang.Boolean allowPlacementTargetingCustomization,
           com.google.api.ads.dfp.axis.v201403.CustomCriteriaSet customTargeting,
           long[] customizableCustomTargetingKeyIds,
           com.google.api.ads.dfp.axis.v201403.UserDomainTargeting userDomainTargeting,
           java.lang.Boolean allowUserDomainTargetingCustomization,
           com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting bandwidthGroupTargeting,
           java.lang.Boolean allowBandwidthGroupTargetingCustomization,
           com.google.api.ads.dfp.axis.v201403.BrowserTargeting browserTargeting,
           java.lang.Boolean allowBrowserTargetingCustomization,
           com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting browserLanguageTargeting,
           java.lang.Boolean allowBrowserLanguageTargetingCustomization,
           com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting operatingSystemTargeting,
           java.lang.Boolean allowOperatingSystemTargetingCustomization) {
           this.geoTargeting = geoTargeting;
           this.allowGeoTargetingCustomization = allowGeoTargetingCustomization;
           this.inventoryTargeting = inventoryTargeting;
           this.allowAdUnitTargetingCustomization = allowAdUnitTargetingCustomization;
           this.allowPlacementTargetingCustomization = allowPlacementTargetingCustomization;
           this.customTargeting = customTargeting;
           this.customizableCustomTargetingKeyIds = customizableCustomTargetingKeyIds;
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
    public com.google.api.ads.dfp.axis.v201403.GeoTargeting getGeoTargeting() {
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
    public void setGeoTargeting(com.google.api.ads.dfp.axis.v201403.GeoTargeting geoTargeting) {
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
    public com.google.api.ads.dfp.axis.v201403.InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }


    /**
     * Sets the inventoryTargeting value for this ProductTemplateTargeting.
     * 
     * @param inventoryTargeting   * Specifies what inventory is targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is required.
     */
    public void setInventoryTargeting(com.google.api.ads.dfp.axis.v201403.InventoryTargeting inventoryTargeting) {
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
    public com.google.api.ads.dfp.axis.v201403.CustomCriteriaSet getCustomTargeting() {
        return customTargeting;
    }


    /**
     * Sets the customTargeting value for this ProductTemplateTargeting.
     * 
     * @param customTargeting   * Specifies what custom criteria are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setCustomTargeting(com.google.api.ads.dfp.axis.v201403.CustomCriteriaSet customTargeting) {
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
     * Gets the userDomainTargeting value for this ProductTemplateTargeting.
     * 
     * @return userDomainTargeting   * Specifies what user domains are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.UserDomainTargeting getUserDomainTargeting() {
        return userDomainTargeting;
    }


    /**
     * Sets the userDomainTargeting value for this ProductTemplateTargeting.
     * 
     * @param userDomainTargeting   * Specifies what user domains are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setUserDomainTargeting(com.google.api.ads.dfp.axis.v201403.UserDomainTargeting userDomainTargeting) {
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
    public com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting getBandwidthGroupTargeting() {
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
    public void setBandwidthGroupTargeting(com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting bandwidthGroupTargeting) {
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
    public com.google.api.ads.dfp.axis.v201403.BrowserTargeting getBrowserTargeting() {
        return browserTargeting;
    }


    /**
     * Sets the browserTargeting value for this ProductTemplateTargeting.
     * 
     * @param browserTargeting   * Specifies what browsers are targeted by the {@link ProductTemplate}.
     * 
     *                 This attribute is optional.
     */
    public void setBrowserTargeting(com.google.api.ads.dfp.axis.v201403.BrowserTargeting browserTargeting) {
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
    public com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting getBrowserLanguageTargeting() {
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
    public void setBrowserLanguageTargeting(com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting browserLanguageTargeting) {
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
    public com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting getOperatingSystemTargeting() {
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
    public void setOperatingSystemTargeting(com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting operatingSystemTargeting) {
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
              this.allowOperatingSystemTargetingCustomization.equals(other.getAllowOperatingSystemTargetingCustomization())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductTemplateTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ProductTemplateTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "geoTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowGeoTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowGeoTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "inventoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "InventoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAdUnitTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowAdUnitTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPlacementTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowPlacementTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "customTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CustomCriteriaSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizableCustomTargetingKeyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "customizableCustomTargetingKeyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDomainTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "userDomainTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "UserDomainTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUserDomainTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowUserDomainTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthGroupTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "bandwidthGroupTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "BandwidthGroupTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBandwidthGroupTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowBandwidthGroupTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "browserTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "BrowserTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBrowserTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowBrowserTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserLanguageTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "browserLanguageTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "BrowserLanguageTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowBrowserLanguageTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowBrowserLanguageTargetingCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "operatingSystemTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "OperatingSystemTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOperatingSystemTargetingCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "allowOperatingSystemTargetingCustomization"));
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
