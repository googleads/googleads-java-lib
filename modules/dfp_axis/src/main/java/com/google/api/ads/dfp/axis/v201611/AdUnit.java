// Copyright 2016 Google Inc. All Rights Reserved.
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
 * AdUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201611;


/**
 * An {@code AdUnit} represents a chunk of identified inventory for
 * the
 *             publisher. It contains all the settings that need to be
 * associated with
 *             inventory in order to serve ads to it. An {@code AdUnit}
 * can also be the
 *             parent of other ad units in the inventory hierarchy.
 */
public class AdUnit  implements java.io.Serializable {
    /* Uniquely identifies the {@code AdUnit}. This value is read-only
     * and is
     *                 assigned by Google when an ad unit is created. This
     * attribute is required
     *                 for updates. */
    private java.lang.String id;

    /* The ID of the ad unit's parent. Every ad unit has a parent
     * except for the
     *                 root ad unit, which is created by Google. This attribute
     * is required when
     *                 creating the ad unit. Once the ad unit is created
     * this value will be read-only. */
    private java.lang.String parentId;

    /* This field is set to {@code true} if the ad unit has any children.
     * This attribute is read-only
     *                 and is populated by Google. */
    private java.lang.Boolean hasChildren;

    /* The path to this ad unit in the ad unit hierarchy represented
     * as a list from the root to this
     *                 ad unit's parent. For root ad units, this list is
     * empty. This attribute is read-only and is
     *                 populated by Google. */
    private com.google.api.ads.dfp.axis.v201611.AdUnitParent[] parentPath;

    /* The name of the ad unit. This attribute is required and its
     * maximum length is 255 characters.
     *                 This attribute must also be case-insensitive unique. */
    private java.lang.String name;

    /* A description of the ad unit. This value is optional and its
     * maximum length
     *                 is 65,535 characters. */
    private java.lang.String description;

    /* The value to use for the HTML link's {@code target} attribute.
     * This value
     *                 is optional and will be interpreted as {@link TargetWindow#TOP}
     * if left
     *                 blank. */
    private com.google.api.ads.dfp.axis.v201611.AdUnitTargetWindow targetWindow;

    /* The status of this ad unit.  It defaults to {@link InventoryStatus#ACTIVE}.
     * This value cannot be updated directly using {@link InventoryService#updateAdUnit}.
     * It can only be modified by performing actions via
     *                 {@link InventoryService#performAdUnitAction}. */
    private com.google.api.ads.dfp.axis.v201611.InventoryStatus status;

    /* A string used to uniquely identify the ad unit for the purposes
     * of serving the ad. This
     *                 attribute is optional and can be set during ad unit
     * creation. If it is not
     *                 provided, it will be assigned by Google based off
     * of the inventory unit ID. Once an ad
     *                 unit is created, its {@code adUnitCode} cannot be
     * changed. */
    private java.lang.String adUnitCode;

    /* The permissible creative sizes that can be served inside this
     * ad unit. This
     *                 attribute is optional. This attribute replaces the
     * {@code sizes}
     *                 attribute. */
    private com.google.api.ads.dfp.axis.v201611.AdUnitSize[] adUnitSizes;

    /* The platform associated with a mobile {@code AdUnit}, i.e.
     * whether this ad unit
     *                 appears in a mobile application or in a mobile web
     * site. This attribute can
     *                 only be used with {@link TargetPlatform#MOBILE} ad
     * units. This attribute is
     *                 optional and defaults to {@link MobilePlatform#SITE}. */
    private com.google.api.ads.dfp.axis.v201611.MobilePlatform mobilePlatform;

    /* If this field is set to {@code true}, then the {@code AdUnit}
     * will not be
     *                 implicitly targeted when its parent is. Traffickers
     * must explicitly
     *                 target such an ad unit or else no line items will
     * serve to it. This
     *                 feature is only available for DFP Premium accounts. */
    private java.lang.Boolean explicitlyTargeted;

    /* AdSense specific settings. This value is optional and if left
     * blank will be
     *                 inherited from the parent ad unit. */
    private com.google.api.ads.dfp.axis.v201611.AdSenseSettingsInheritedProperty inheritedAdSenseSettings;

    /* The unique ID of the {@link Company}, which is of type
     *                 {@link Company.Type#AFFILIATE_DISTRIBUTION_PARTNER},
     * to which this ad unit belongs.
     *                 This attribute is optional. Setting this attribute
     * to {@code null} will disassociate
     *                 the partner from this ad unit. */
    private java.lang.Long partnerId;

    /* The set of label frequency caps applied directly to this ad
     * unit.  There
     *                 is a limit of 10 label frequency caps per ad unit. */
    private com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] appliedLabelFrequencyCaps;

    /* Contains the set of labels applied directly to the ad unit
     * as well as
     *                 those inherited from parent ad units.  This field
     * is readonly and is
     *                 assigned by Google. */
    private com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] effectiveLabelFrequencyCaps;

    /* The set of labels applied directly to this ad unit. */
    private com.google.api.ads.dfp.axis.v201611.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the ad unit
     * as well as
     *                 those inherited from the parent ad units. If a label
     * has been negated, only the
     *                 negated label is returned. This field is readonly
     * and is assigned by
     *                 Google. */
    private com.google.api.ads.dfp.axis.v201611.AppliedLabel[] effectiveAppliedLabels;

    /* The IDs of all teams that this ad unit is on as well as those
     * inherited
     *                 from parent ad units. This value is read-only and
     * is set by Google. */
    private long[] effectiveTeamIds;

    /* The IDs of all teams that this ad unit is on directly. */
    private long[] appliedTeamIds;

    /* The date and time this ad unit was last modified. */
    private com.google.api.ads.dfp.axis.v201611.DateTime lastModifiedDateTime;

    /* The smart size mode for this ad unit. This attribute is optional
     * and
     *                 defaults to {@link SmartSizeMode#NONE} for fixed sizes. */
    private com.google.api.ads.dfp.axis.v201611.SmartSizeMode smartSizeMode;

    /* The interval in seconds which ad units in mobile apps automatically
     * refresh. Valid values are between 30 and 120 seconds. This attribute
     * is
     *                 optional and only applies to ad units in mobile apps.
     * If this value is
     *                 not set, then the mobile app ad will not refresh. */
    private java.lang.Integer refreshRate;

    /* Whether this ad unit is shared by a distributor network. When
     * this field is {@code true}, then
     *                 {@code crossSellingDistributor} will contain data
     * for the distributor network.
     *                 This attribute is read-only. */
    private java.lang.Boolean isSharedByDistributor;

    /* If this ad unit is shared by a distributor network, then this
     * field will contain data
     *                 describing that distributor network.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201611.CrossSellingDistributor crossSellingDistributor;

    /* Specifies an ID for a channel in an external set-top box campaign
     * management system. This
     *                 attribute is only meaningful if {@link #isSetTopBoxEnabled}
     * is {@code true}.
     *                 This attribute is read-only. */
    private java.lang.String externalSetTopBoxChannelId;

    /* Flag that specifies whether this ad unit represents an external
     * set-top box channel.
     *                 This attribute is read-only. */
    private java.lang.Boolean isSetTopBoxEnabled;

    public AdUnit() {
    }

    public AdUnit(
           java.lang.String id,
           java.lang.String parentId,
           java.lang.Boolean hasChildren,
           com.google.api.ads.dfp.axis.v201611.AdUnitParent[] parentPath,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201611.AdUnitTargetWindow targetWindow,
           com.google.api.ads.dfp.axis.v201611.InventoryStatus status,
           java.lang.String adUnitCode,
           com.google.api.ads.dfp.axis.v201611.AdUnitSize[] adUnitSizes,
           com.google.api.ads.dfp.axis.v201611.MobilePlatform mobilePlatform,
           java.lang.Boolean explicitlyTargeted,
           com.google.api.ads.dfp.axis.v201611.AdSenseSettingsInheritedProperty inheritedAdSenseSettings,
           java.lang.Long partnerId,
           com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] appliedLabelFrequencyCaps,
           com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] effectiveLabelFrequencyCaps,
           com.google.api.ads.dfp.axis.v201611.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201611.AppliedLabel[] effectiveAppliedLabels,
           long[] effectiveTeamIds,
           long[] appliedTeamIds,
           com.google.api.ads.dfp.axis.v201611.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201611.SmartSizeMode smartSizeMode,
           java.lang.Integer refreshRate,
           java.lang.Boolean isSharedByDistributor,
           com.google.api.ads.dfp.axis.v201611.CrossSellingDistributor crossSellingDistributor,
           java.lang.String externalSetTopBoxChannelId,
           java.lang.Boolean isSetTopBoxEnabled) {
           this.id = id;
           this.parentId = parentId;
           this.hasChildren = hasChildren;
           this.parentPath = parentPath;
           this.name = name;
           this.description = description;
           this.targetWindow = targetWindow;
           this.status = status;
           this.adUnitCode = adUnitCode;
           this.adUnitSizes = adUnitSizes;
           this.mobilePlatform = mobilePlatform;
           this.explicitlyTargeted = explicitlyTargeted;
           this.inheritedAdSenseSettings = inheritedAdSenseSettings;
           this.partnerId = partnerId;
           this.appliedLabelFrequencyCaps = appliedLabelFrequencyCaps;
           this.effectiveLabelFrequencyCaps = effectiveLabelFrequencyCaps;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.effectiveTeamIds = effectiveTeamIds;
           this.appliedTeamIds = appliedTeamIds;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.smartSizeMode = smartSizeMode;
           this.refreshRate = refreshRate;
           this.isSharedByDistributor = isSharedByDistributor;
           this.crossSellingDistributor = crossSellingDistributor;
           this.externalSetTopBoxChannelId = externalSetTopBoxChannelId;
           this.isSetTopBoxEnabled = isSetTopBoxEnabled;
    }


    /**
     * Gets the id value for this AdUnit.
     * 
     * @return id   * Uniquely identifies the {@code AdUnit}. This value is read-only
     * and is
     *                 assigned by Google when an ad unit is created. This
     * attribute is required
     *                 for updates.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AdUnit.
     * 
     * @param id   * Uniquely identifies the {@code AdUnit}. This value is read-only
     * and is
     *                 assigned by Google when an ad unit is created. This
     * attribute is required
     *                 for updates.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the parentId value for this AdUnit.
     * 
     * @return parentId   * The ID of the ad unit's parent. Every ad unit has a parent
     * except for the
     *                 root ad unit, which is created by Google. This attribute
     * is required when
     *                 creating the ad unit. Once the ad unit is created
     * this value will be read-only.
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this AdUnit.
     * 
     * @param parentId   * The ID of the ad unit's parent. Every ad unit has a parent
     * except for the
     *                 root ad unit, which is created by Google. This attribute
     * is required when
     *                 creating the ad unit. Once the ad unit is created
     * this value will be read-only.
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the hasChildren value for this AdUnit.
     * 
     * @return hasChildren   * This field is set to {@code true} if the ad unit has any children.
     * This attribute is read-only
     *                 and is populated by Google.
     */
    public java.lang.Boolean getHasChildren() {
        return hasChildren;
    }


    /**
     * Sets the hasChildren value for this AdUnit.
     * 
     * @param hasChildren   * This field is set to {@code true} if the ad unit has any children.
     * This attribute is read-only
     *                 and is populated by Google.
     */
    public void setHasChildren(java.lang.Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }


    /**
     * Gets the parentPath value for this AdUnit.
     * 
     * @return parentPath   * The path to this ad unit in the ad unit hierarchy represented
     * as a list from the root to this
     *                 ad unit's parent. For root ad units, this list is
     * empty. This attribute is read-only and is
     *                 populated by Google.
     */
    public com.google.api.ads.dfp.axis.v201611.AdUnitParent[] getParentPath() {
        return parentPath;
    }


    /**
     * Sets the parentPath value for this AdUnit.
     * 
     * @param parentPath   * The path to this ad unit in the ad unit hierarchy represented
     * as a list from the root to this
     *                 ad unit's parent. For root ad units, this list is
     * empty. This attribute is read-only and is
     *                 populated by Google.
     */
    public void setParentPath(com.google.api.ads.dfp.axis.v201611.AdUnitParent[] parentPath) {
        this.parentPath = parentPath;
    }

    public com.google.api.ads.dfp.axis.v201611.AdUnitParent getParentPath(int i) {
        return this.parentPath[i];
    }

    public void setParentPath(int i, com.google.api.ads.dfp.axis.v201611.AdUnitParent _value) {
        this.parentPath[i] = _value;
    }


    /**
     * Gets the name value for this AdUnit.
     * 
     * @return name   * The name of the ad unit. This attribute is required and its
     * maximum length is 255 characters.
     *                 This attribute must also be case-insensitive unique.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdUnit.
     * 
     * @param name   * The name of the ad unit. This attribute is required and its
     * maximum length is 255 characters.
     *                 This attribute must also be case-insensitive unique.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this AdUnit.
     * 
     * @return description   * A description of the ad unit. This value is optional and its
     * maximum length
     *                 is 65,535 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AdUnit.
     * 
     * @param description   * A description of the ad unit. This value is optional and its
     * maximum length
     *                 is 65,535 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the targetWindow value for this AdUnit.
     * 
     * @return targetWindow   * The value to use for the HTML link's {@code target} attribute.
     * This value
     *                 is optional and will be interpreted as {@link TargetWindow#TOP}
     * if left
     *                 blank.
     */
    public com.google.api.ads.dfp.axis.v201611.AdUnitTargetWindow getTargetWindow() {
        return targetWindow;
    }


    /**
     * Sets the targetWindow value for this AdUnit.
     * 
     * @param targetWindow   * The value to use for the HTML link's {@code target} attribute.
     * This value
     *                 is optional and will be interpreted as {@link TargetWindow#TOP}
     * if left
     *                 blank.
     */
    public void setTargetWindow(com.google.api.ads.dfp.axis.v201611.AdUnitTargetWindow targetWindow) {
        this.targetWindow = targetWindow;
    }


    /**
     * Gets the status value for this AdUnit.
     * 
     * @return status   * The status of this ad unit.  It defaults to {@link InventoryStatus#ACTIVE}.
     * This value cannot be updated directly using {@link InventoryService#updateAdUnit}.
     * It can only be modified by performing actions via
     *                 {@link InventoryService#performAdUnitAction}.
     */
    public com.google.api.ads.dfp.axis.v201611.InventoryStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdUnit.
     * 
     * @param status   * The status of this ad unit.  It defaults to {@link InventoryStatus#ACTIVE}.
     * This value cannot be updated directly using {@link InventoryService#updateAdUnit}.
     * It can only be modified by performing actions via
     *                 {@link InventoryService#performAdUnitAction}.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201611.InventoryStatus status) {
        this.status = status;
    }


    /**
     * Gets the adUnitCode value for this AdUnit.
     * 
     * @return adUnitCode   * A string used to uniquely identify the ad unit for the purposes
     * of serving the ad. This
     *                 attribute is optional and can be set during ad unit
     * creation. If it is not
     *                 provided, it will be assigned by Google based off
     * of the inventory unit ID. Once an ad
     *                 unit is created, its {@code adUnitCode} cannot be
     * changed.
     */
    public java.lang.String getAdUnitCode() {
        return adUnitCode;
    }


    /**
     * Sets the adUnitCode value for this AdUnit.
     * 
     * @param adUnitCode   * A string used to uniquely identify the ad unit for the purposes
     * of serving the ad. This
     *                 attribute is optional and can be set during ad unit
     * creation. If it is not
     *                 provided, it will be assigned by Google based off
     * of the inventory unit ID. Once an ad
     *                 unit is created, its {@code adUnitCode} cannot be
     * changed.
     */
    public void setAdUnitCode(java.lang.String adUnitCode) {
        this.adUnitCode = adUnitCode;
    }


    /**
     * Gets the adUnitSizes value for this AdUnit.
     * 
     * @return adUnitSizes   * The permissible creative sizes that can be served inside this
     * ad unit. This
     *                 attribute is optional. This attribute replaces the
     * {@code sizes}
     *                 attribute.
     */
    public com.google.api.ads.dfp.axis.v201611.AdUnitSize[] getAdUnitSizes() {
        return adUnitSizes;
    }


    /**
     * Sets the adUnitSizes value for this AdUnit.
     * 
     * @param adUnitSizes   * The permissible creative sizes that can be served inside this
     * ad unit. This
     *                 attribute is optional. This attribute replaces the
     * {@code sizes}
     *                 attribute.
     */
    public void setAdUnitSizes(com.google.api.ads.dfp.axis.v201611.AdUnitSize[] adUnitSizes) {
        this.adUnitSizes = adUnitSizes;
    }

    public com.google.api.ads.dfp.axis.v201611.AdUnitSize getAdUnitSizes(int i) {
        return this.adUnitSizes[i];
    }

    public void setAdUnitSizes(int i, com.google.api.ads.dfp.axis.v201611.AdUnitSize _value) {
        this.adUnitSizes[i] = _value;
    }


    /**
     * Gets the mobilePlatform value for this AdUnit.
     * 
     * @return mobilePlatform   * The platform associated with a mobile {@code AdUnit}, i.e.
     * whether this ad unit
     *                 appears in a mobile application or in a mobile web
     * site. This attribute can
     *                 only be used with {@link TargetPlatform#MOBILE} ad
     * units. This attribute is
     *                 optional and defaults to {@link MobilePlatform#SITE}.
     */
    public com.google.api.ads.dfp.axis.v201611.MobilePlatform getMobilePlatform() {
        return mobilePlatform;
    }


    /**
     * Sets the mobilePlatform value for this AdUnit.
     * 
     * @param mobilePlatform   * The platform associated with a mobile {@code AdUnit}, i.e.
     * whether this ad unit
     *                 appears in a mobile application or in a mobile web
     * site. This attribute can
     *                 only be used with {@link TargetPlatform#MOBILE} ad
     * units. This attribute is
     *                 optional and defaults to {@link MobilePlatform#SITE}.
     */
    public void setMobilePlatform(com.google.api.ads.dfp.axis.v201611.MobilePlatform mobilePlatform) {
        this.mobilePlatform = mobilePlatform;
    }


    /**
     * Gets the explicitlyTargeted value for this AdUnit.
     * 
     * @return explicitlyTargeted   * If this field is set to {@code true}, then the {@code AdUnit}
     * will not be
     *                 implicitly targeted when its parent is. Traffickers
     * must explicitly
     *                 target such an ad unit or else no line items will
     * serve to it. This
     *                 feature is only available for DFP Premium accounts.
     */
    public java.lang.Boolean getExplicitlyTargeted() {
        return explicitlyTargeted;
    }


    /**
     * Sets the explicitlyTargeted value for this AdUnit.
     * 
     * @param explicitlyTargeted   * If this field is set to {@code true}, then the {@code AdUnit}
     * will not be
     *                 implicitly targeted when its parent is. Traffickers
     * must explicitly
     *                 target such an ad unit or else no line items will
     * serve to it. This
     *                 feature is only available for DFP Premium accounts.
     */
    public void setExplicitlyTargeted(java.lang.Boolean explicitlyTargeted) {
        this.explicitlyTargeted = explicitlyTargeted;
    }


    /**
     * Gets the inheritedAdSenseSettings value for this AdUnit.
     * 
     * @return inheritedAdSenseSettings   * AdSense specific settings. This value is optional and if left
     * blank will be
     *                 inherited from the parent ad unit.
     */
    public com.google.api.ads.dfp.axis.v201611.AdSenseSettingsInheritedProperty getInheritedAdSenseSettings() {
        return inheritedAdSenseSettings;
    }


    /**
     * Sets the inheritedAdSenseSettings value for this AdUnit.
     * 
     * @param inheritedAdSenseSettings   * AdSense specific settings. This value is optional and if left
     * blank will be
     *                 inherited from the parent ad unit.
     */
    public void setInheritedAdSenseSettings(com.google.api.ads.dfp.axis.v201611.AdSenseSettingsInheritedProperty inheritedAdSenseSettings) {
        this.inheritedAdSenseSettings = inheritedAdSenseSettings;
    }


    /**
     * Gets the partnerId value for this AdUnit.
     * 
     * @return partnerId   * The unique ID of the {@link Company}, which is of type
     *                 {@link Company.Type#AFFILIATE_DISTRIBUTION_PARTNER},
     * to which this ad unit belongs.
     *                 This attribute is optional. Setting this attribute
     * to {@code null} will disassociate
     *                 the partner from this ad unit.
     */
    public java.lang.Long getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this AdUnit.
     * 
     * @param partnerId   * The unique ID of the {@link Company}, which is of type
     *                 {@link Company.Type#AFFILIATE_DISTRIBUTION_PARTNER},
     * to which this ad unit belongs.
     *                 This attribute is optional. Setting this attribute
     * to {@code null} will disassociate
     *                 the partner from this ad unit.
     */
    public void setPartnerId(java.lang.Long partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * Gets the appliedLabelFrequencyCaps value for this AdUnit.
     * 
     * @return appliedLabelFrequencyCaps   * The set of label frequency caps applied directly to this ad
     * unit.  There
     *                 is a limit of 10 label frequency caps per ad unit.
     */
    public com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] getAppliedLabelFrequencyCaps() {
        return appliedLabelFrequencyCaps;
    }


    /**
     * Sets the appliedLabelFrequencyCaps value for this AdUnit.
     * 
     * @param appliedLabelFrequencyCaps   * The set of label frequency caps applied directly to this ad
     * unit.  There
     *                 is a limit of 10 label frequency caps per ad unit.
     */
    public void setAppliedLabelFrequencyCaps(com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] appliedLabelFrequencyCaps) {
        this.appliedLabelFrequencyCaps = appliedLabelFrequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap getAppliedLabelFrequencyCaps(int i) {
        return this.appliedLabelFrequencyCaps[i];
    }

    public void setAppliedLabelFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap _value) {
        this.appliedLabelFrequencyCaps[i] = _value;
    }


    /**
     * Gets the effectiveLabelFrequencyCaps value for this AdUnit.
     * 
     * @return effectiveLabelFrequencyCaps   * Contains the set of labels applied directly to the ad unit
     * as well as
     *                 those inherited from parent ad units.  This field
     * is readonly and is
     *                 assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] getEffectiveLabelFrequencyCaps() {
        return effectiveLabelFrequencyCaps;
    }


    /**
     * Sets the effectiveLabelFrequencyCaps value for this AdUnit.
     * 
     * @param effectiveLabelFrequencyCaps   * Contains the set of labels applied directly to the ad unit
     * as well as
     *                 those inherited from parent ad units.  This field
     * is readonly and is
     *                 assigned by Google.
     */
    public void setEffectiveLabelFrequencyCaps(com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap[] effectiveLabelFrequencyCaps) {
        this.effectiveLabelFrequencyCaps = effectiveLabelFrequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap getEffectiveLabelFrequencyCaps(int i) {
        return this.effectiveLabelFrequencyCaps[i];
    }

    public void setEffectiveLabelFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201611.LabelFrequencyCap _value) {
        this.effectiveLabelFrequencyCaps[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this AdUnit.
     * 
     * @return appliedLabels   * The set of labels applied directly to this ad unit.
     */
    public com.google.api.ads.dfp.axis.v201611.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this AdUnit.
     * 
     * @param appliedLabels   * The set of labels applied directly to this ad unit.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201611.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201611.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201611.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this AdUnit.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the ad unit
     * as well as
     *                 those inherited from the parent ad units. If a label
     * has been negated, only the
     *                 negated label is returned. This field is readonly
     * and is assigned by
     *                 Google.
     */
    public com.google.api.ads.dfp.axis.v201611.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this AdUnit.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to the ad unit
     * as well as
     *                 those inherited from the parent ad units. If a label
     * has been negated, only the
     *                 negated label is returned. This field is readonly
     * and is assigned by
     *                 Google.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201611.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201611.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201611.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveTeamIds value for this AdUnit.
     * 
     * @return effectiveTeamIds   * The IDs of all teams that this ad unit is on as well as those
     * inherited
     *                 from parent ad units. This value is read-only and
     * is set by Google.
     */
    public long[] getEffectiveTeamIds() {
        return effectiveTeamIds;
    }


    /**
     * Sets the effectiveTeamIds value for this AdUnit.
     * 
     * @param effectiveTeamIds   * The IDs of all teams that this ad unit is on as well as those
     * inherited
     *                 from parent ad units. This value is read-only and
     * is set by Google.
     */
    public void setEffectiveTeamIds(long[] effectiveTeamIds) {
        this.effectiveTeamIds = effectiveTeamIds;
    }

    public long getEffectiveTeamIds(int i) {
        return this.effectiveTeamIds[i];
    }

    public void setEffectiveTeamIds(int i, long _value) {
        this.effectiveTeamIds[i] = _value;
    }


    /**
     * Gets the appliedTeamIds value for this AdUnit.
     * 
     * @return appliedTeamIds   * The IDs of all teams that this ad unit is on directly.
     */
    public long[] getAppliedTeamIds() {
        return appliedTeamIds;
    }


    /**
     * Sets the appliedTeamIds value for this AdUnit.
     * 
     * @param appliedTeamIds   * The IDs of all teams that this ad unit is on directly.
     */
    public void setAppliedTeamIds(long[] appliedTeamIds) {
        this.appliedTeamIds = appliedTeamIds;
    }

    public long getAppliedTeamIds(int i) {
        return this.appliedTeamIds[i];
    }

    public void setAppliedTeamIds(int i, long _value) {
        this.appliedTeamIds[i] = _value;
    }


    /**
     * Gets the lastModifiedDateTime value for this AdUnit.
     * 
     * @return lastModifiedDateTime   * The date and time this ad unit was last modified.
     */
    public com.google.api.ads.dfp.axis.v201611.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this AdUnit.
     * 
     * @param lastModifiedDateTime   * The date and time this ad unit was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201611.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the smartSizeMode value for this AdUnit.
     * 
     * @return smartSizeMode   * The smart size mode for this ad unit. This attribute is optional
     * and
     *                 defaults to {@link SmartSizeMode#NONE} for fixed sizes.
     */
    public com.google.api.ads.dfp.axis.v201611.SmartSizeMode getSmartSizeMode() {
        return smartSizeMode;
    }


    /**
     * Sets the smartSizeMode value for this AdUnit.
     * 
     * @param smartSizeMode   * The smart size mode for this ad unit. This attribute is optional
     * and
     *                 defaults to {@link SmartSizeMode#NONE} for fixed sizes.
     */
    public void setSmartSizeMode(com.google.api.ads.dfp.axis.v201611.SmartSizeMode smartSizeMode) {
        this.smartSizeMode = smartSizeMode;
    }


    /**
     * Gets the refreshRate value for this AdUnit.
     * 
     * @return refreshRate   * The interval in seconds which ad units in mobile apps automatically
     * refresh. Valid values are between 30 and 120 seconds. This attribute
     * is
     *                 optional and only applies to ad units in mobile apps.
     * If this value is
     *                 not set, then the mobile app ad will not refresh.
     */
    public java.lang.Integer getRefreshRate() {
        return refreshRate;
    }


    /**
     * Sets the refreshRate value for this AdUnit.
     * 
     * @param refreshRate   * The interval in seconds which ad units in mobile apps automatically
     * refresh. Valid values are between 30 and 120 seconds. This attribute
     * is
     *                 optional and only applies to ad units in mobile apps.
     * If this value is
     *                 not set, then the mobile app ad will not refresh.
     */
    public void setRefreshRate(java.lang.Integer refreshRate) {
        this.refreshRate = refreshRate;
    }


    /**
     * Gets the isSharedByDistributor value for this AdUnit.
     * 
     * @return isSharedByDistributor   * Whether this ad unit is shared by a distributor network. When
     * this field is {@code true}, then
     *                 {@code crossSellingDistributor} will contain data
     * for the distributor network.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsSharedByDistributor() {
        return isSharedByDistributor;
    }


    /**
     * Sets the isSharedByDistributor value for this AdUnit.
     * 
     * @param isSharedByDistributor   * Whether this ad unit is shared by a distributor network. When
     * this field is {@code true}, then
     *                 {@code crossSellingDistributor} will contain data
     * for the distributor network.
     *                 This attribute is read-only.
     */
    public void setIsSharedByDistributor(java.lang.Boolean isSharedByDistributor) {
        this.isSharedByDistributor = isSharedByDistributor;
    }


    /**
     * Gets the crossSellingDistributor value for this AdUnit.
     * 
     * @return crossSellingDistributor   * If this ad unit is shared by a distributor network, then this
     * field will contain data
     *                 describing that distributor network.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201611.CrossSellingDistributor getCrossSellingDistributor() {
        return crossSellingDistributor;
    }


    /**
     * Sets the crossSellingDistributor value for this AdUnit.
     * 
     * @param crossSellingDistributor   * If this ad unit is shared by a distributor network, then this
     * field will contain data
     *                 describing that distributor network.
     *                 This attribute is read-only.
     */
    public void setCrossSellingDistributor(com.google.api.ads.dfp.axis.v201611.CrossSellingDistributor crossSellingDistributor) {
        this.crossSellingDistributor = crossSellingDistributor;
    }


    /**
     * Gets the externalSetTopBoxChannelId value for this AdUnit.
     * 
     * @return externalSetTopBoxChannelId   * Specifies an ID for a channel in an external set-top box campaign
     * management system. This
     *                 attribute is only meaningful if {@link #isSetTopBoxEnabled}
     * is {@code true}.
     *                 This attribute is read-only.
     */
    public java.lang.String getExternalSetTopBoxChannelId() {
        return externalSetTopBoxChannelId;
    }


    /**
     * Sets the externalSetTopBoxChannelId value for this AdUnit.
     * 
     * @param externalSetTopBoxChannelId   * Specifies an ID for a channel in an external set-top box campaign
     * management system. This
     *                 attribute is only meaningful if {@link #isSetTopBoxEnabled}
     * is {@code true}.
     *                 This attribute is read-only.
     */
    public void setExternalSetTopBoxChannelId(java.lang.String externalSetTopBoxChannelId) {
        this.externalSetTopBoxChannelId = externalSetTopBoxChannelId;
    }


    /**
     * Gets the isSetTopBoxEnabled value for this AdUnit.
     * 
     * @return isSetTopBoxEnabled   * Flag that specifies whether this ad unit represents an external
     * set-top box channel.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsSetTopBoxEnabled() {
        return isSetTopBoxEnabled;
    }


    /**
     * Sets the isSetTopBoxEnabled value for this AdUnit.
     * 
     * @param isSetTopBoxEnabled   * Flag that specifies whether this ad unit represents an external
     * set-top box channel.
     *                 This attribute is read-only.
     */
    public void setIsSetTopBoxEnabled(java.lang.Boolean isSetTopBoxEnabled) {
        this.isSetTopBoxEnabled = isSetTopBoxEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdUnit)) return false;
        AdUnit other = (AdUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.hasChildren==null && other.getHasChildren()==null) || 
             (this.hasChildren!=null &&
              this.hasChildren.equals(other.getHasChildren()))) &&
            ((this.parentPath==null && other.getParentPath()==null) || 
             (this.parentPath!=null &&
              java.util.Arrays.equals(this.parentPath, other.getParentPath()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.targetWindow==null && other.getTargetWindow()==null) || 
             (this.targetWindow!=null &&
              this.targetWindow.equals(other.getTargetWindow()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.adUnitCode==null && other.getAdUnitCode()==null) || 
             (this.adUnitCode!=null &&
              this.adUnitCode.equals(other.getAdUnitCode()))) &&
            ((this.adUnitSizes==null && other.getAdUnitSizes()==null) || 
             (this.adUnitSizes!=null &&
              java.util.Arrays.equals(this.adUnitSizes, other.getAdUnitSizes()))) &&
            ((this.mobilePlatform==null && other.getMobilePlatform()==null) || 
             (this.mobilePlatform!=null &&
              this.mobilePlatform.equals(other.getMobilePlatform()))) &&
            ((this.explicitlyTargeted==null && other.getExplicitlyTargeted()==null) || 
             (this.explicitlyTargeted!=null &&
              this.explicitlyTargeted.equals(other.getExplicitlyTargeted()))) &&
            ((this.inheritedAdSenseSettings==null && other.getInheritedAdSenseSettings()==null) || 
             (this.inheritedAdSenseSettings!=null &&
              this.inheritedAdSenseSettings.equals(other.getInheritedAdSenseSettings()))) &&
            ((this.partnerId==null && other.getPartnerId()==null) || 
             (this.partnerId!=null &&
              this.partnerId.equals(other.getPartnerId()))) &&
            ((this.appliedLabelFrequencyCaps==null && other.getAppliedLabelFrequencyCaps()==null) || 
             (this.appliedLabelFrequencyCaps!=null &&
              java.util.Arrays.equals(this.appliedLabelFrequencyCaps, other.getAppliedLabelFrequencyCaps()))) &&
            ((this.effectiveLabelFrequencyCaps==null && other.getEffectiveLabelFrequencyCaps()==null) || 
             (this.effectiveLabelFrequencyCaps!=null &&
              java.util.Arrays.equals(this.effectiveLabelFrequencyCaps, other.getEffectiveLabelFrequencyCaps()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.effectiveAppliedLabels==null && other.getEffectiveAppliedLabels()==null) || 
             (this.effectiveAppliedLabels!=null &&
              java.util.Arrays.equals(this.effectiveAppliedLabels, other.getEffectiveAppliedLabels()))) &&
            ((this.effectiveTeamIds==null && other.getEffectiveTeamIds()==null) || 
             (this.effectiveTeamIds!=null &&
              java.util.Arrays.equals(this.effectiveTeamIds, other.getEffectiveTeamIds()))) &&
            ((this.appliedTeamIds==null && other.getAppliedTeamIds()==null) || 
             (this.appliedTeamIds!=null &&
              java.util.Arrays.equals(this.appliedTeamIds, other.getAppliedTeamIds()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.smartSizeMode==null && other.getSmartSizeMode()==null) || 
             (this.smartSizeMode!=null &&
              this.smartSizeMode.equals(other.getSmartSizeMode()))) &&
            ((this.refreshRate==null && other.getRefreshRate()==null) || 
             (this.refreshRate!=null &&
              this.refreshRate.equals(other.getRefreshRate()))) &&
            ((this.isSharedByDistributor==null && other.getIsSharedByDistributor()==null) || 
             (this.isSharedByDistributor!=null &&
              this.isSharedByDistributor.equals(other.getIsSharedByDistributor()))) &&
            ((this.crossSellingDistributor==null && other.getCrossSellingDistributor()==null) || 
             (this.crossSellingDistributor!=null &&
              this.crossSellingDistributor.equals(other.getCrossSellingDistributor()))) &&
            ((this.externalSetTopBoxChannelId==null && other.getExternalSetTopBoxChannelId()==null) || 
             (this.externalSetTopBoxChannelId!=null &&
              this.externalSetTopBoxChannelId.equals(other.getExternalSetTopBoxChannelId()))) &&
            ((this.isSetTopBoxEnabled==null && other.getIsSetTopBoxEnabled()==null) || 
             (this.isSetTopBoxEnabled!=null &&
              this.isSetTopBoxEnabled.equals(other.getIsSetTopBoxEnabled())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getHasChildren() != null) {
            _hashCode += getHasChildren().hashCode();
        }
        if (getParentPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentPath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTargetWindow() != null) {
            _hashCode += getTargetWindow().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAdUnitCode() != null) {
            _hashCode += getAdUnitCode().hashCode();
        }
        if (getAdUnitSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdUnitSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdUnitSizes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMobilePlatform() != null) {
            _hashCode += getMobilePlatform().hashCode();
        }
        if (getExplicitlyTargeted() != null) {
            _hashCode += getExplicitlyTargeted().hashCode();
        }
        if (getInheritedAdSenseSettings() != null) {
            _hashCode += getInheritedAdSenseSettings().hashCode();
        }
        if (getPartnerId() != null) {
            _hashCode += getPartnerId().hashCode();
        }
        if (getAppliedLabelFrequencyCaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabelFrequencyCaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabelFrequencyCaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveLabelFrequencyCaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveLabelFrequencyCaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveLabelFrequencyCaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getSmartSizeMode() != null) {
            _hashCode += getSmartSizeMode().hashCode();
        }
        if (getRefreshRate() != null) {
            _hashCode += getRefreshRate().hashCode();
        }
        if (getIsSharedByDistributor() != null) {
            _hashCode += getIsSharedByDistributor().hashCode();
        }
        if (getCrossSellingDistributor() != null) {
            _hashCode += getCrossSellingDistributor().hashCode();
        }
        if (getExternalSetTopBoxChannelId() != null) {
            _hashCode += getExternalSetTopBoxChannelId().hashCode();
        }
        if (getIsSetTopBoxEnabled() != null) {
            _hashCode += getIsSetTopBoxEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "AdUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "hasChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "parentPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "AdUnitParent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "targetWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "AdUnit.TargetWindow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "InventoryStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "adUnitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "adUnitSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "AdUnitSize"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "mobilePlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "MobilePlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explicitlyTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "explicitlyTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritedAdSenseSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "inheritedAdSenseSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "AdSenseSettingsInheritedProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "partnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabelFrequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "appliedLabelFrequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "LabelFrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveLabelFrequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "effectiveLabelFrequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "LabelFrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "effectiveTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "appliedTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartSizeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "smartSizeMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "SmartSizeMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "refreshRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSharedByDistributor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "isSharedByDistributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossSellingDistributor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "crossSellingDistributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "CrossSellingDistributor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSetTopBoxChannelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "externalSetTopBoxChannelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSetTopBoxEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "isSetTopBoxEnabled"));
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
