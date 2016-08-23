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
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;


/**
 * {@link ProposalLineItem Proposal line items} are created from products,
 * from which their properties are copied.
 */
public class Product  implements java.io.Serializable {
    /* The name of the {@code Product}. This attribute is populated
     * by Google, but can be updated.
     *                 To overwrite this, set the {@link #nameSource} to
     * {@link ValueSourceType#DIRECTLY_SPECIFIED}
     *                 when setting the value of this field.
     *                 It has maximum length of 255 characters if overridden
     * via update.
     *                 This attribute is required. */
    private java.lang.String name;

    /* Specifies the source of the {@link Product#name} value.
     *                 To revert an overridden value to its default, set
     * this field to {@link ValueSourceType#PARENT}. */
    private com.google.api.ads.dfp.axis.v201605.ValueSourceType nameSource;

    /* The status of the {@code Product}.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.ProductStatus status;

    /* The type of {@code Product}. This will always be {@link ProductType#DFP}
     * for programmatic
     *                 guaranteed products.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.ProductType productType;

    /* The ID of the {@code ProductTemplate} from which this product
     * is generated.
     *                 This attribute is read-only. */
    private java.lang.Long productTemplateId;

    /* Unique identifier of the {@code Product}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when
     *                 a {@code Product} is created. */
    private java.lang.Long id;

    /* The notes of this product.
     *                 
     *                 This attribute is optional, with a maximum length
     * of 511 characters. */
    private java.lang.String notes;

    /* The description of the {@code ProductTemplate} from which this
     * product is generated.
     *                 This attribute is read-only. */
    private java.lang.String productTemplateDescription;

    /* The date and time this product was last modified.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a product is updated. */
    private com.google.api.ads.dfp.axis.v201605.DateTime lastModifiedDateTime;

    /* The method used for billing the created {@link ProposalLineItem}.
     * This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.RateType rateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.RoadblockingType roadblockingType;

    /* The strategy for delivering ads over the course of the line
     * item's duration.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.DeliveryRateType deliveryRateType;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the created {@code ProposalLineItem}.
     * This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.CreativeRotationType creativeRotationType;

    /* The delivery option for companions.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.CompanionDeliveryOption companionDeliveryOption;

    /* Details about the creatives that are expected to serve for
     * the created
     *                 {@link ProposalLineItem}.
     *                 <p>For a {@link #roadblockingType} of {@link RoadblockingType#CREATIVE_SET},
     * all
     *                 creative placeholders must have a master and at least
     * one companion size.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.CreativePlaceholder[] creativePlaceholders;

    /* Indicates the line item type for the created {@link ProposalLineItem}.
     * This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.LineItemType lineItemType;

    /* The priority for the created {@link ProposalLineItem}. The
     * priority is a value
     *                 between 1 and 16.
     *                 This attribute is read-only. */
    private java.lang.Integer priority;

    /* The set of frequency capping units for the created {@link ProposalLineItem}.
     * Each frequency cap in the list must have unique {@link TimeUnit}.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.FrequencyCap[] frequencyCaps;

    /* The targeting for the created {@link ProposalLineItem}. For
     * those scenarios using sales
     *                 management, it's a combination of {@link ProductTemplate#productSegmentation}
     * and
     *                 {@link ProductTemplate#builtInTargeting}. See details
     * in {@link ProductTemplate}.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.Targeting builtInTargeting;

    /* Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.CustomizableAttributes customizableAttributes;

    /* The values of the custom fields associated with this {@code
     * Product}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201605.BaseCustomFieldValue[] customFieldValues;

    /* The environment that the created {@link ProposalLineItem} will
     * target. The default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is {@link EnvironmentType#VIDEO_PLAYER},
     *                 then the {@link ProposalLineItem} can only target
     * {@link AdUnit ad units} that have
     *                 {@link AdUnitSize sizes} whose {@link AdUnitSize#environmentType}
     * is also
     *                 {@link EnvironmentType#VIDEO_PLAYER}.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201605.EnvironmentType environmentType;

    /* The max duration of a video creative associated with this {@code
     * Product} in milliseconds.
     *                 This value is only meaningful if this is a video product.
     * This attribute is read-only. */
    private java.lang.Long videoMaxDuration;

    public Product() {
    }

    public Product(
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201605.ValueSourceType nameSource,
           com.google.api.ads.dfp.axis.v201605.ProductStatus status,
           com.google.api.ads.dfp.axis.v201605.ProductType productType,
           java.lang.Long productTemplateId,
           java.lang.Long id,
           java.lang.String notes,
           java.lang.String productTemplateDescription,
           com.google.api.ads.dfp.axis.v201605.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201605.RateType rateType,
           com.google.api.ads.dfp.axis.v201605.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201605.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201605.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.axis.v201605.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.axis.v201605.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201605.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.dfp.axis.v201605.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.axis.v201605.Targeting builtInTargeting,
           com.google.api.ads.dfp.axis.v201605.CustomizableAttributes customizableAttributes,
           com.google.api.ads.dfp.axis.v201605.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201605.EnvironmentType environmentType,
           java.lang.Long videoMaxDuration) {
           this.name = name;
           this.nameSource = nameSource;
           this.status = status;
           this.productType = productType;
           this.productTemplateId = productTemplateId;
           this.id = id;
           this.notes = notes;
           this.productTemplateDescription = productTemplateDescription;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.rateType = rateType;
           this.roadblockingType = roadblockingType;
           this.deliveryRateType = deliveryRateType;
           this.creativeRotationType = creativeRotationType;
           this.companionDeliveryOption = companionDeliveryOption;
           this.creativePlaceholders = creativePlaceholders;
           this.lineItemType = lineItemType;
           this.priority = priority;
           this.frequencyCaps = frequencyCaps;
           this.builtInTargeting = builtInTargeting;
           this.customizableAttributes = customizableAttributes;
           this.customFieldValues = customFieldValues;
           this.environmentType = environmentType;
           this.videoMaxDuration = videoMaxDuration;
    }


    /**
     * Gets the name value for this Product.
     * 
     * @return name   * The name of the {@code Product}. This attribute is populated
     * by Google, but can be updated.
     *                 To overwrite this, set the {@link #nameSource} to
     * {@link ValueSourceType#DIRECTLY_SPECIFIED}
     *                 when setting the value of this field.
     *                 It has maximum length of 255 characters if overridden
     * via update.
     *                 This attribute is required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Product.
     * 
     * @param name   * The name of the {@code Product}. This attribute is populated
     * by Google, but can be updated.
     *                 To overwrite this, set the {@link #nameSource} to
     * {@link ValueSourceType#DIRECTLY_SPECIFIED}
     *                 when setting the value of this field.
     *                 It has maximum length of 255 characters if overridden
     * via update.
     *                 This attribute is required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nameSource value for this Product.
     * 
     * @return nameSource   * Specifies the source of the {@link Product#name} value.
     *                 To revert an overridden value to its default, set
     * this field to {@link ValueSourceType#PARENT}.
     */
    public com.google.api.ads.dfp.axis.v201605.ValueSourceType getNameSource() {
        return nameSource;
    }


    /**
     * Sets the nameSource value for this Product.
     * 
     * @param nameSource   * Specifies the source of the {@link Product#name} value.
     *                 To revert an overridden value to its default, set
     * this field to {@link ValueSourceType#PARENT}.
     */
    public void setNameSource(com.google.api.ads.dfp.axis.v201605.ValueSourceType nameSource) {
        this.nameSource = nameSource;
    }


    /**
     * Gets the status value for this Product.
     * 
     * @return status   * The status of the {@code Product}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.ProductStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Product.
     * 
     * @param status   * The status of the {@code Product}.
     *                 This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201605.ProductStatus status) {
        this.status = status;
    }


    /**
     * Gets the productType value for this Product.
     * 
     * @return productType   * The type of {@code Product}. This will always be {@link ProductType#DFP}
     * for programmatic
     *                 guaranteed products.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this Product.
     * 
     * @param productType   * The type of {@code Product}. This will always be {@link ProductType#DFP}
     * for programmatic
     *                 guaranteed products.
     *                 This attribute is read-only.
     */
    public void setProductType(com.google.api.ads.dfp.axis.v201605.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the productTemplateId value for this Product.
     * 
     * @return productTemplateId   * The ID of the {@code ProductTemplate} from which this product
     * is generated.
     *                 This attribute is read-only.
     */
    public java.lang.Long getProductTemplateId() {
        return productTemplateId;
    }


    /**
     * Sets the productTemplateId value for this Product.
     * 
     * @param productTemplateId   * The ID of the {@code ProductTemplate} from which this product
     * is generated.
     *                 This attribute is read-only.
     */
    public void setProductTemplateId(java.lang.Long productTemplateId) {
        this.productTemplateId = productTemplateId;
    }


    /**
     * Gets the id value for this Product.
     * 
     * @return id   * Unique identifier of the {@code Product}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when
     *                 a {@code Product} is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Product.
     * 
     * @param id   * Unique identifier of the {@code Product}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when
     *                 a {@code Product} is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the notes value for this Product.
     * 
     * @return notes   * The notes of this product.
     *                 
     *                 This attribute is optional, with a maximum length
     * of 511 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Product.
     * 
     * @param notes   * The notes of this product.
     *                 
     *                 This attribute is optional, with a maximum length
     * of 511 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the productTemplateDescription value for this Product.
     * 
     * @return productTemplateDescription   * The description of the {@code ProductTemplate} from which this
     * product is generated.
     *                 This attribute is read-only.
     */
    public java.lang.String getProductTemplateDescription() {
        return productTemplateDescription;
    }


    /**
     * Sets the productTemplateDescription value for this Product.
     * 
     * @param productTemplateDescription   * The description of the {@code ProductTemplate} from which this
     * product is generated.
     *                 This attribute is read-only.
     */
    public void setProductTemplateDescription(java.lang.String productTemplateDescription) {
        this.productTemplateDescription = productTemplateDescription;
    }


    /**
     * Gets the lastModifiedDateTime value for this Product.
     * 
     * @return lastModifiedDateTime   * The date and time this product was last modified.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a product is updated.
     */
    public com.google.api.ads.dfp.axis.v201605.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Product.
     * 
     * @param lastModifiedDateTime   * The date and time this product was last modified.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a product is updated.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201605.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the rateType value for this Product.
     * 
     * @return rateType   * The method used for billing the created {@link ProposalLineItem}.
     * This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this Product.
     * 
     * @param rateType   * The method used for billing the created {@link ProposalLineItem}.
     * This attribute is read-only.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201605.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the roadblockingType value for this Product.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this Product.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page.
     *                 This attribute is read-only.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201605.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the deliveryRateType value for this Product.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this Product.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration.
     *                 This attribute is read-only.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201605.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the creativeRotationType value for this Product.
     * 
     * @return creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the created {@code ProposalLineItem}.
     * This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this Product.
     * 
     * @param creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the created {@code ProposalLineItem}.
     * This attribute is read-only.
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201605.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }


    /**
     * Gets the companionDeliveryOption value for this Product.
     * 
     * @return companionDeliveryOption   * The delivery option for companions.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }


    /**
     * Sets the companionDeliveryOption value for this Product.
     * 
     * @param companionDeliveryOption   * The delivery option for companions.
     *                 This attribute is read-only.
     */
    public void setCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201605.CompanionDeliveryOption companionDeliveryOption) {
        this.companionDeliveryOption = companionDeliveryOption;
    }


    /**
     * Gets the creativePlaceholders value for this Product.
     * 
     * @return creativePlaceholders   * Details about the creatives that are expected to serve for
     * the created
     *                 {@link ProposalLineItem}.
     *                 <p>For a {@link #roadblockingType} of {@link RoadblockingType#CREATIVE_SET},
     * all
     *                 creative placeholders must have a master and at least
     * one companion size.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this Product.
     * 
     * @param creativePlaceholders   * Details about the creatives that are expected to serve for
     * the created
     *                 {@link ProposalLineItem}.
     *                 <p>For a {@link #roadblockingType} of {@link RoadblockingType#CREATIVE_SET},
     * all
     *                 creative placeholders must have a master and at least
     * one companion size.
     *                 This attribute is read-only.
     */
    public void setCreativePlaceholders(com.google.api.ads.dfp.axis.v201605.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.dfp.axis.v201605.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.dfp.axis.v201605.CreativePlaceholder _value) {
        this.creativePlaceholders[i] = _value;
    }


    /**
     * Gets the lineItemType value for this Product.
     * 
     * @return lineItemType   * Indicates the line item type for the created {@link ProposalLineItem}.
     * This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this Product.
     * 
     * @param lineItemType   * Indicates the line item type for the created {@link ProposalLineItem}.
     * This attribute is read-only.
     */
    public void setLineItemType(com.google.api.ads.dfp.axis.v201605.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the priority value for this Product.
     * 
     * @return priority   * The priority for the created {@link ProposalLineItem}. The
     * priority is a value
     *                 between 1 and 16.
     *                 This attribute is read-only.
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Product.
     * 
     * @param priority   * The priority for the created {@link ProposalLineItem}. The
     * priority is a value
     *                 between 1 and 16.
     *                 This attribute is read-only.
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the frequencyCaps value for this Product.
     * 
     * @return frequencyCaps   * The set of frequency capping units for the created {@link ProposalLineItem}.
     * Each frequency cap in the list must have unique {@link TimeUnit}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this Product.
     * 
     * @param frequencyCaps   * The set of frequency capping units for the created {@link ProposalLineItem}.
     * Each frequency cap in the list must have unique {@link TimeUnit}.
     *                 This attribute is read-only.
     */
    public void setFrequencyCaps(com.google.api.ads.dfp.axis.v201605.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201605.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201605.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the builtInTargeting value for this Product.
     * 
     * @return builtInTargeting   * The targeting for the created {@link ProposalLineItem}. For
     * those scenarios using sales
     *                 management, it's a combination of {@link ProductTemplate#productSegmentation}
     * and
     *                 {@link ProductTemplate#builtInTargeting}. See details
     * in {@link ProductTemplate}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.Targeting getBuiltInTargeting() {
        return builtInTargeting;
    }


    /**
     * Sets the builtInTargeting value for this Product.
     * 
     * @param builtInTargeting   * The targeting for the created {@link ProposalLineItem}. For
     * those scenarios using sales
     *                 management, it's a combination of {@link ProductTemplate#productSegmentation}
     * and
     *                 {@link ProductTemplate#builtInTargeting}. See details
     * in {@link ProductTemplate}.
     *                 This attribute is read-only.
     */
    public void setBuiltInTargeting(com.google.api.ads.dfp.axis.v201605.Targeting builtInTargeting) {
        this.builtInTargeting = builtInTargeting;
    }


    /**
     * Gets the customizableAttributes value for this Product.
     * 
     * @return customizableAttributes   * Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.CustomizableAttributes getCustomizableAttributes() {
        return customizableAttributes;
    }


    /**
     * Sets the customizableAttributes value for this Product.
     * 
     * @param customizableAttributes   * Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 This attribute is read-only.
     */
    public void setCustomizableAttributes(com.google.api.ads.dfp.axis.v201605.CustomizableAttributes customizableAttributes) {
        this.customizableAttributes = customizableAttributes;
    }


    /**
     * Gets the customFieldValues value for this Product.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this {@code
     * Product}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201605.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this Product.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this {@code
     * Product}.
     *                 
     *                 This attribute is optional.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201605.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201605.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201605.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the environmentType value for this Product.
     * 
     * @return environmentType   * The environment that the created {@link ProposalLineItem} will
     * target. The default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is {@link EnvironmentType#VIDEO_PLAYER},
     *                 then the {@link ProposalLineItem} can only target
     * {@link AdUnit ad units} that have
     *                 {@link AdUnitSize sizes} whose {@link AdUnitSize#environmentType}
     * is also
     *                 {@link EnvironmentType#VIDEO_PLAYER}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201605.EnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this Product.
     * 
     * @param environmentType   * The environment that the created {@link ProposalLineItem} will
     * target. The default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is {@link EnvironmentType#VIDEO_PLAYER},
     *                 then the {@link ProposalLineItem} can only target
     * {@link AdUnit ad units} that have
     *                 {@link AdUnitSize sizes} whose {@link AdUnitSize#environmentType}
     * is also
     *                 {@link EnvironmentType#VIDEO_PLAYER}.
     *                 This attribute is read-only.
     */
    public void setEnvironmentType(com.google.api.ads.dfp.axis.v201605.EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the videoMaxDuration value for this Product.
     * 
     * @return videoMaxDuration   * The max duration of a video creative associated with this {@code
     * Product} in milliseconds.
     *                 This value is only meaningful if this is a video product.
     * This attribute is read-only.
     */
    public java.lang.Long getVideoMaxDuration() {
        return videoMaxDuration;
    }


    /**
     * Sets the videoMaxDuration value for this Product.
     * 
     * @param videoMaxDuration   * The max duration of a video creative associated with this {@code
     * Product} in milliseconds.
     *                 This value is only meaningful if this is a video product.
     * This attribute is read-only.
     */
    public void setVideoMaxDuration(java.lang.Long videoMaxDuration) {
        this.videoMaxDuration = videoMaxDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameSource==null && other.getNameSource()==null) || 
             (this.nameSource!=null &&
              this.nameSource.equals(other.getNameSource()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.productTemplateId==null && other.getProductTemplateId()==null) || 
             (this.productTemplateId!=null &&
              this.productTemplateId.equals(other.getProductTemplateId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.productTemplateDescription==null && other.getProductTemplateDescription()==null) || 
             (this.productTemplateDescription!=null &&
              this.productTemplateDescription.equals(other.getProductTemplateDescription()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
            ((this.deliveryRateType==null && other.getDeliveryRateType()==null) || 
             (this.deliveryRateType!=null &&
              this.deliveryRateType.equals(other.getDeliveryRateType()))) &&
            ((this.creativeRotationType==null && other.getCreativeRotationType()==null) || 
             (this.creativeRotationType!=null &&
              this.creativeRotationType.equals(other.getCreativeRotationType()))) &&
            ((this.companionDeliveryOption==null && other.getCompanionDeliveryOption()==null) || 
             (this.companionDeliveryOption!=null &&
              this.companionDeliveryOption.equals(other.getCompanionDeliveryOption()))) &&
            ((this.creativePlaceholders==null && other.getCreativePlaceholders()==null) || 
             (this.creativePlaceholders!=null &&
              java.util.Arrays.equals(this.creativePlaceholders, other.getCreativePlaceholders()))) &&
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.frequencyCaps==null && other.getFrequencyCaps()==null) || 
             (this.frequencyCaps!=null &&
              java.util.Arrays.equals(this.frequencyCaps, other.getFrequencyCaps()))) &&
            ((this.builtInTargeting==null && other.getBuiltInTargeting()==null) || 
             (this.builtInTargeting!=null &&
              this.builtInTargeting.equals(other.getBuiltInTargeting()))) &&
            ((this.customizableAttributes==null && other.getCustomizableAttributes()==null) || 
             (this.customizableAttributes!=null &&
              this.customizableAttributes.equals(other.getCustomizableAttributes()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.environmentType==null && other.getEnvironmentType()==null) || 
             (this.environmentType!=null &&
              this.environmentType.equals(other.getEnvironmentType()))) &&
            ((this.videoMaxDuration==null && other.getVideoMaxDuration()==null) || 
             (this.videoMaxDuration!=null &&
              this.videoMaxDuration.equals(other.getVideoMaxDuration())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameSource() != null) {
            _hashCode += getNameSource().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getProductTemplateId() != null) {
            _hashCode += getProductTemplateId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getProductTemplateDescription() != null) {
            _hashCode += getProductTemplateDescription().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
        }
        if (getDeliveryRateType() != null) {
            _hashCode += getDeliveryRateType().hashCode();
        }
        if (getCreativeRotationType() != null) {
            _hashCode += getCreativeRotationType().hashCode();
        }
        if (getCompanionDeliveryOption() != null) {
            _hashCode += getCompanionDeliveryOption().hashCode();
        }
        if (getCreativePlaceholders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativePlaceholders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativePlaceholders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getFrequencyCaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequencyCaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequencyCaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuiltInTargeting() != null) {
            _hashCode += getBuiltInTargeting().hashCode();
        }
        if (getCustomizableAttributes() != null) {
            _hashCode += getCustomizableAttributes().hashCode();
        }
        if (getCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnvironmentType() != null) {
            _hashCode += getEnvironmentType().hashCode();
        }
        if (getVideoMaxDuration() != null) {
            _hashCode += getVideoMaxDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "nameSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "ValueSourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "ProductStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "ProductType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "productTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTemplateDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "productTemplateDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "RateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "builtInTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizableAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "customizableAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "CustomizableAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMaxDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "videoMaxDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
