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
 * ProductTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * {@code ProductTemplate} is used to generate products. All generated
 * products will
 *             inherit all attributes from their {@code ProductTemplate},
 * except for segmentation,
 *             which will be included in the {@link Product#targeting}.
 * The generated products in turn will be
 *             used to create {@link ProposalLineItem proposal line items}
 * so that almost all attributes
 *             in the product template are properties of the proposal
 * line item.
 */
public class ProductTemplate  implements java.io.Serializable {
    /* Uniquely identifies the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is created. */
    private java.lang.Long id;

    /* The name of the {@code ProductTemplate}.
     *                 
     *                 This attribute has maximum length of 255 characters.
     * This attribute is required. */
    private java.lang.String name;

    /* The creation time of the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is created. */
    private com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime;

    /* The date and time this {@code ProductTemplate} was last modified.
     * 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is updated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    /* The description of the {@code ProductTemplate}.
     *                 
     *                 This attribute has maximum length of 511 characters.
     * This attribute is optional. */
    private java.lang.String description;

    /* The name macro of the {@code ProductTemplate}. The name macro
     * is used to generate the {@link
     *                 Product#name}. This attribute is required and has
     * maximum length of 1023 characters.
     *                 
     *                 The name macro can contain plain text and several
     * placeholders that will be replaced with
     *                 values specified in the {@code ProductTemplate} when
     * generating product names.
     *                 Allowed placeholders are:
     *                 <table>
     *                 <tr>
     *                 <th>Placeholder</th>
     *                 <th>Segmentation</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <ad-unit>}</td>
     *                 <td>{@link ProductSegmentation#adUnitSegments}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <placement>}</td>
     *                 <td>{@link ProductSegmentation#placementSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <location>}</td>
     *                 <td>{@link ProductSegmentation#geoSegment}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <user-domain>}</td>
     *                 <td>{@link ProductSegmentation#userDomainSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <bandwidth-group>}</td>
     *                 <td>{@link ProductSegmentation#bandwidthSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <browser>}</td>
     *                 <td>{@link ProductSegmentation#browserSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <browser-language>}</td>
     *                 <td>{@link ProductSegmentation#browserLanguageSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <operating-system>}</td>
     *                 <td>{@link ProductSegmentation#operatingSystemSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <frequency-cap>}</td>
     *                 <td>{@link #frequencyCaps}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <rate-type>}</td>
     *                 <td>{@link #rateType}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <creative-placeholder-size>}</td>
     *                 <td>{@link #creativePlaceholders}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <line-item-type>}</td>
     *                 <td>{@link #lineItemType}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <line-item-priority>}</td>
     *                 <td>{@link #priority}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <template-name>}</td>
     *                 <td>{@link #name}</td>
     *                 </tr>
     *                 </table>
     *                 Each placeholder should appear no more than once and
     * all expanded features must have their
     *                 corresponding placeholders in the name macro.
     *                 
     *                 This attribute is required. */
    private java.lang.String nameMacro;

    /* The status of the {@code ProductTemplate}.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.ProductTemplateStatus status;

    /* The type of generated {@code Product}.
     *                 
     *                 <b>
     *                 Note: if the type is {@link ProductType#OFFLINE},
     * then the following fields must be
     *                 null or empty:
     *                 {@link #roadblockingType}, {@link #lineItemType},
     * {@link #frequencyCaps},
     *                 {@link #productSegmentation} and {@link #targeting}.
     * </b>
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.ProductType productType;

    /* The {@link User#ID id} of the user who created the {@code ProductTemplate}.
     * 
     *                 This attribute is read-only and is assigned by Google. */
    private java.lang.Long creatorId;

    /* The method used for billing the created {@link ProposalLineItem}.
     * This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.RateType rateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}
     * if
     *                 {@link #productType} is {@link ProductType#DFP}, or
     * {@link RoadblockingType#CREATIVE_SET}
     *                 if there are companion sizes in {@link #creativePlaceholders}. */
    private com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType;

    /* The strategy for delivering ads over the course of the line
     * item's duration.
     *                 This attribute is optional and defaults to {@link
     * DeliveryRateType#EVENLY} if
     *                 {@link #productType} is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the created {@code ProposalLineItem}.
     * This attribute is optional and
     *                 defaults to {@link CreativeRotationType#OPTIMIZED}
     * if {@link #productType}
     *                 is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType;

    /* The delivery option for companions. Setting this field is only
     * meaningful
     *                 if the following conditions are met:
     *                 <ol>
     *                 <li>
     *                 The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 </li>
     *                 <li>
     *                 One of the following is true.
     *                 <ul>
     *                 <li>
     *                 The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * </li>
     *                 <li>
     *                 The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </li>
     *                 </ul>
     *                 </li>
     *                 </ol>
     *                 <p>
     *                 This field is optional and defaults to
     *                 {@link CompanionDeliveryOption#OPTIONAL} if the above
     * conditions are met and
     *                 {@link #productType} is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption;

    /* Details about the creatives that are expected to serve for
     * the created {@link ProposalLineItem}.
     *                 <p>For a {@link #roadblockingType} of {@link RoadblockingType#CREATIVE_SET},
     * all
     *                 creative placeholders must have a master and at least
     * one companion size.
     *                 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders;

    /* Indicates the line item type for the created {@link ProposalLineItem}.
     * 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType;

    /* Priority of {@link ProposalLineItem}. The priority is a value
     * between 1 and 16. If not specified, the default priority of the
     *                 {@link LineItemType} will be assigned. The following
     * default, minimum and
     *                 maximum priority values is allowed for each line item
     * type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Default
     * Priority</th>
     *                 <th scope="col">Minimum Priority</th> <th scope="col">Maximum
     * priority</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4</td><td>2</td><td>5</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8</td><td>6</td><td>10</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 Note: it's ignored when {@link #productType} is {@link
     * ProductType#OFFLINE}. */
    private java.lang.Integer priority;

    /* The set of frequency capping units for the created {@link ProposalLineItem}.
     * Each frequency cap in the list must have unique {@link TimeUnit}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps;

    /* The product segmentation. The combination from the segments
     * and the {@link #targeting} will
     *                 produce the targeting on the resulting {@link ProposalLineItem}.
     * Any type of segmentation cannot also be used for targeting.
     *                 
     *                 This attribute is optional.
     *                 
     *                 Note: if you specify {@link ProducSegmentation#geoSegment},
     * then
     *                 {@link ProductTemplateTargeting#geoTargeting} must
     * be null or empty, vice versa. This also
     *                 applies to other targeting and segmentation. */
    private com.google.api.ads.dfp.axis.v201802.ProductSegmentation productSegmentation;

    /* Targeting to be included in the created {@link ProposalLineItem}.
     * Any type targeted cannot also be used for segmentation.
     *                 
     *                 <p>This attribute is optional.
     *                 Note: if {@link #productType} is {@link ProductType#DFP}
     * and {@link #productSegmentation} is
     *                 not specified, this attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.Targeting builtInTargeting;

    /* Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 
     *                 <p>This attribute is optional. If not specified, then
     * no targeting or attributes
     *                 are customizable. */
    private com.google.api.ads.dfp.axis.v201802.CustomizableAttributes customizableAttributes;

    /* The values of the custom fields associated with this {@code
     * ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues;

    /* The environment that the created {@link ProposalLineItem} is
     * targeting. The default value is
     *                 {@link EnvironmentType#BROWSER}. If this value is
     * {@link EnvironmentType#VIDEO_PLAYER}, then
     *                 the {@link ProposalLineItem} can only target {@code
     * AdUnits} that have {@code AdUnitSizes}
     *                 whose {@code environmentType} is also {@code VIDEO_PLAYER}. */
    private com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType;

    /* The max duration of a video creative associated with this {@code
     * ProductTemplate} in
     *                 milliseconds. This attribute is optional, defaults
     * to 0, and only meaningful if this is
     *                 a video product template. */
    private java.lang.Long videoMaxDuration;

    /* Marketplace information of this {@code ProductTemplate}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.ProductTemplateMarketplaceInfo productTemplateMarketplaceInfo;

    public ProductTemplate() {
    }

    public ProductTemplate(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           java.lang.String description,
           java.lang.String nameMacro,
           com.google.api.ads.dfp.axis.v201802.ProductTemplateStatus status,
           com.google.api.ads.dfp.axis.v201802.ProductType productType,
           java.lang.Long creatorId,
           com.google.api.ads.dfp.axis.v201802.RateType rateType,
           com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.axis.v201802.ProductSegmentation productSegmentation,
           com.google.api.ads.dfp.axis.v201802.Targeting builtInTargeting,
           com.google.api.ads.dfp.axis.v201802.CustomizableAttributes customizableAttributes,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType,
           java.lang.Long videoMaxDuration,
           com.google.api.ads.dfp.axis.v201802.ProductTemplateMarketplaceInfo productTemplateMarketplaceInfo) {
           this.id = id;
           this.name = name;
           this.creationDateTime = creationDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.description = description;
           this.nameMacro = nameMacro;
           this.status = status;
           this.productType = productType;
           this.creatorId = creatorId;
           this.rateType = rateType;
           this.roadblockingType = roadblockingType;
           this.deliveryRateType = deliveryRateType;
           this.creativeRotationType = creativeRotationType;
           this.companionDeliveryOption = companionDeliveryOption;
           this.creativePlaceholders = creativePlaceholders;
           this.lineItemType = lineItemType;
           this.priority = priority;
           this.frequencyCaps = frequencyCaps;
           this.productSegmentation = productSegmentation;
           this.builtInTargeting = builtInTargeting;
           this.customizableAttributes = customizableAttributes;
           this.customFieldValues = customFieldValues;
           this.environmentType = environmentType;
           this.videoMaxDuration = videoMaxDuration;
           this.productTemplateMarketplaceInfo = productTemplateMarketplaceInfo;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("builtInTargeting", getBuiltInTargeting())
            .add("companionDeliveryOption", getCompanionDeliveryOption())
            .add("creationDateTime", getCreationDateTime())
            .add("creativePlaceholders", getCreativePlaceholders())
            .add("creativeRotationType", getCreativeRotationType())
            .add("creatorId", getCreatorId())
            .add("customFieldValues", getCustomFieldValues())
            .add("customizableAttributes", getCustomizableAttributes())
            .add("deliveryRateType", getDeliveryRateType())
            .add("description", getDescription())
            .add("environmentType", getEnvironmentType())
            .add("frequencyCaps", getFrequencyCaps())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lineItemType", getLineItemType())
            .add("name", getName())
            .add("nameMacro", getNameMacro())
            .add("priority", getPriority())
            .add("productSegmentation", getProductSegmentation())
            .add("productTemplateMarketplaceInfo", getProductTemplateMarketplaceInfo())
            .add("productType", getProductType())
            .add("rateType", getRateType())
            .add("roadblockingType", getRoadblockingType())
            .add("status", getStatus())
            .add("videoMaxDuration", getVideoMaxDuration())
            .toString();
    }

    /**
     * Gets the id value for this ProductTemplate.
     * 
     * @return id   * Uniquely identifies the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ProductTemplate.
     * 
     * @param id   * Uniquely identifies the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ProductTemplate.
     * 
     * @return name   * The name of the {@code ProductTemplate}.
     *                 
     *                 This attribute has maximum length of 255 characters.
     * This attribute is required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductTemplate.
     * 
     * @param name   * The name of the {@code ProductTemplate}.
     *                 
     *                 This attribute has maximum length of 255 characters.
     * This attribute is required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the creationDateTime value for this ProductTemplate.
     * 
     * @return creationDateTime   * The creation time of the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is created.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this ProductTemplate.
     * 
     * @param creationDateTime   * The creation time of the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is created.
     */
    public void setCreationDateTime(com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this ProductTemplate.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code ProductTemplate} was last modified.
     * 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is updated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this ProductTemplate.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code ProductTemplate} was last modified.
     * 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is updated.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the description value for this ProductTemplate.
     * 
     * @return description   * The description of the {@code ProductTemplate}.
     *                 
     *                 This attribute has maximum length of 511 characters.
     * This attribute is optional.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductTemplate.
     * 
     * @param description   * The description of the {@code ProductTemplate}.
     *                 
     *                 This attribute has maximum length of 511 characters.
     * This attribute is optional.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the nameMacro value for this ProductTemplate.
     * 
     * @return nameMacro   * The name macro of the {@code ProductTemplate}. The name macro
     * is used to generate the {@link
     *                 Product#name}. This attribute is required and has
     * maximum length of 1023 characters.
     *                 
     *                 The name macro can contain plain text and several
     * placeholders that will be replaced with
     *                 values specified in the {@code ProductTemplate} when
     * generating product names.
     *                 Allowed placeholders are:
     *                 <table>
     *                 <tr>
     *                 <th>Placeholder</th>
     *                 <th>Segmentation</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <ad-unit>}</td>
     *                 <td>{@link ProductSegmentation#adUnitSegments}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <placement>}</td>
     *                 <td>{@link ProductSegmentation#placementSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <location>}</td>
     *                 <td>{@link ProductSegmentation#geoSegment}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <user-domain>}</td>
     *                 <td>{@link ProductSegmentation#userDomainSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <bandwidth-group>}</td>
     *                 <td>{@link ProductSegmentation#bandwidthSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <browser>}</td>
     *                 <td>{@link ProductSegmentation#browserSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <browser-language>}</td>
     *                 <td>{@link ProductSegmentation#browserLanguageSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <operating-system>}</td>
     *                 <td>{@link ProductSegmentation#operatingSystemSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <frequency-cap>}</td>
     *                 <td>{@link #frequencyCaps}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <rate-type>}</td>
     *                 <td>{@link #rateType}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <creative-placeholder-size>}</td>
     *                 <td>{@link #creativePlaceholders}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <line-item-type>}</td>
     *                 <td>{@link #lineItemType}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <line-item-priority>}</td>
     *                 <td>{@link #priority}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <template-name>}</td>
     *                 <td>{@link #name}</td>
     *                 </tr>
     *                 </table>
     *                 Each placeholder should appear no more than once and
     * all expanded features must have their
     *                 corresponding placeholders in the name macro.
     *                 
     *                 This attribute is required.
     */
    public java.lang.String getNameMacro() {
        return nameMacro;
    }


    /**
     * Sets the nameMacro value for this ProductTemplate.
     * 
     * @param nameMacro   * The name macro of the {@code ProductTemplate}. The name macro
     * is used to generate the {@link
     *                 Product#name}. This attribute is required and has
     * maximum length of 1023 characters.
     *                 
     *                 The name macro can contain plain text and several
     * placeholders that will be replaced with
     *                 values specified in the {@code ProductTemplate} when
     * generating product names.
     *                 Allowed placeholders are:
     *                 <table>
     *                 <tr>
     *                 <th>Placeholder</th>
     *                 <th>Segmentation</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <ad-unit>}</td>
     *                 <td>{@link ProductSegmentation#adUnitSegments}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <placement>}</td>
     *                 <td>{@link ProductSegmentation#placementSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <location>}</td>
     *                 <td>{@link ProductSegmentation#geoSegment}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <user-domain>}</td>
     *                 <td>{@link ProductSegmentation#userDomainSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <bandwidth-group>}</td>
     *                 <td>{@link ProductSegmentation#bandwidthSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <browser>}</td>
     *                 <td>{@link ProductSegmentation#browserSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <browser-language>}</td>
     *                 <td>{@link ProductSegmentation#browserLanguageSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <operating-system>}</td>
     *                 <td>{@link ProductSegmentation#operatingSystemSegment}</td>
     * </tr>
     *                 <tr>
     *                 <td>{@code <frequency-cap>}</td>
     *                 <td>{@link #frequencyCaps}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <rate-type>}</td>
     *                 <td>{@link #rateType}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <creative-placeholder-size>}</td>
     *                 <td>{@link #creativePlaceholders}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <line-item-type>}</td>
     *                 <td>{@link #lineItemType}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <line-item-priority>}</td>
     *                 <td>{@link #priority}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@code <template-name>}</td>
     *                 <td>{@link #name}</td>
     *                 </tr>
     *                 </table>
     *                 Each placeholder should appear no more than once and
     * all expanded features must have their
     *                 corresponding placeholders in the name macro.
     *                 
     *                 This attribute is required.
     */
    public void setNameMacro(java.lang.String nameMacro) {
        this.nameMacro = nameMacro;
    }


    /**
     * Gets the status value for this ProductTemplate.
     * 
     * @return status   * The status of the {@code ProductTemplate}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.ProductTemplateStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProductTemplate.
     * 
     * @param status   * The status of the {@code ProductTemplate}.
     *                 This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ProductTemplateStatus status) {
        this.status = status;
    }


    /**
     * Gets the productType value for this ProductTemplate.
     * 
     * @return productType   * The type of generated {@code Product}.
     *                 
     *                 <b>
     *                 Note: if the type is {@link ProductType#OFFLINE},
     * then the following fields must be
     *                 null or empty:
     *                 {@link #roadblockingType}, {@link #lineItemType},
     * {@link #frequencyCaps},
     *                 {@link #productSegmentation} and {@link #targeting}.
     * </b>
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this ProductTemplate.
     * 
     * @param productType   * The type of generated {@code Product}.
     *                 
     *                 <b>
     *                 Note: if the type is {@link ProductType#OFFLINE},
     * then the following fields must be
     *                 null or empty:
     *                 {@link #roadblockingType}, {@link #lineItemType},
     * {@link #frequencyCaps},
     *                 {@link #productSegmentation} and {@link #targeting}.
     * </b>
     *                 This attribute is required.
     */
    public void setProductType(com.google.api.ads.dfp.axis.v201802.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the creatorId value for this ProductTemplate.
     * 
     * @return creatorId   * The {@link User#ID id} of the user who created the {@code ProductTemplate}.
     * 
     *                 This attribute is read-only and is assigned by Google.
     */
    public java.lang.Long getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this ProductTemplate.
     * 
     * @param creatorId   * The {@link User#ID id} of the user who created the {@code ProductTemplate}.
     * 
     *                 This attribute is read-only and is assigned by Google.
     */
    public void setCreatorId(java.lang.Long creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the rateType value for this ProductTemplate.
     * 
     * @return rateType   * The method used for billing the created {@link ProposalLineItem}.
     * This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ProductTemplate.
     * 
     * @param rateType   * The method used for billing the created {@link ProposalLineItem}.
     * This attribute is required.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201802.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the roadblockingType value for this ProductTemplate.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}
     * if
     *                 {@link #productType} is {@link ProductType#DFP}, or
     * {@link RoadblockingType#CREATIVE_SET}
     *                 if there are companion sizes in {@link #creativePlaceholders}.
     */
    public com.google.api.ads.dfp.axis.v201802.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this ProductTemplate.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}
     * if
     *                 {@link #productType} is {@link ProductType#DFP}, or
     * {@link RoadblockingType#CREATIVE_SET}
     *                 if there are companion sizes in {@link #creativePlaceholders}.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the deliveryRateType value for this ProductTemplate.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration.
     *                 This attribute is optional and defaults to {@link
     * DeliveryRateType#EVENLY} if
     *                 {@link #productType} is {@link ProductType#DFP}.
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this ProductTemplate.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration.
     *                 This attribute is optional and defaults to {@link
     * DeliveryRateType#EVENLY} if
     *                 {@link #productType} is {@link ProductType#DFP}.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the creativeRotationType value for this ProductTemplate.
     * 
     * @return creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the created {@code ProposalLineItem}.
     * This attribute is optional and
     *                 defaults to {@link CreativeRotationType#OPTIMIZED}
     * if {@link #productType}
     *                 is {@link ProductType#DFP}.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this ProductTemplate.
     * 
     * @param creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the created {@code ProposalLineItem}.
     * This attribute is optional and
     *                 defaults to {@link CreativeRotationType#OPTIMIZED}
     * if {@link #productType}
     *                 is {@link ProductType#DFP}.
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }


    /**
     * Gets the companionDeliveryOption value for this ProductTemplate.
     * 
     * @return companionDeliveryOption   * The delivery option for companions. Setting this field is only
     * meaningful
     *                 if the following conditions are met:
     *                 <ol>
     *                 <li>
     *                 The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 </li>
     *                 <li>
     *                 One of the following is true.
     *                 <ul>
     *                 <li>
     *                 The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * </li>
     *                 <li>
     *                 The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </li>
     *                 </ul>
     *                 </li>
     *                 </ol>
     *                 <p>
     *                 This field is optional and defaults to
     *                 {@link CompanionDeliveryOption#OPTIONAL} if the above
     * conditions are met and
     *                 {@link #productType} is {@link ProductType#DFP}.
     */
    public com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }


    /**
     * Sets the companionDeliveryOption value for this ProductTemplate.
     * 
     * @param companionDeliveryOption   * The delivery option for companions. Setting this field is only
     * meaningful
     *                 if the following conditions are met:
     *                 <ol>
     *                 <li>
     *                 The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 </li>
     *                 <li>
     *                 One of the following is true.
     *                 <ul>
     *                 <li>
     *                 The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * </li>
     *                 <li>
     *                 The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </li>
     *                 </ul>
     *                 </li>
     *                 </ol>
     *                 <p>
     *                 This field is optional and defaults to
     *                 {@link CompanionDeliveryOption#OPTIONAL} if the above
     * conditions are met and
     *                 {@link #productType} is {@link ProductType#DFP}.
     */
    public void setCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption) {
        this.companionDeliveryOption = companionDeliveryOption;
    }


    /**
     * Gets the creativePlaceholders value for this ProductTemplate.
     * 
     * @return creativePlaceholders   * Details about the creatives that are expected to serve for
     * the created {@link ProposalLineItem}.
     *                 <p>For a {@link #roadblockingType} of {@link RoadblockingType#CREATIVE_SET},
     * all
     *                 creative placeholders must have a master and at least
     * one companion size.
     *                 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this ProductTemplate.
     * 
     * @param creativePlaceholders   * Details about the creatives that are expected to serve for
     * the created {@link ProposalLineItem}.
     *                 <p>For a {@link #roadblockingType} of {@link RoadblockingType#CREATIVE_SET},
     * all
     *                 creative placeholders must have a master and at least
     * one companion size.
     *                 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}.
     */
    public void setCreativePlaceholders(com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.dfp.axis.v201802.CreativePlaceholder _value) {
        this.creativePlaceholders[i] = _value;
    }


    /**
     * Gets the lineItemType value for this ProductTemplate.
     * 
     * @return lineItemType   * Indicates the line item type for the created {@link ProposalLineItem}.
     * 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this ProductTemplate.
     * 
     * @param lineItemType   * Indicates the line item type for the created {@link ProposalLineItem}.
     * 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}.
     */
    public void setLineItemType(com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the priority value for this ProductTemplate.
     * 
     * @return priority   * Priority of {@link ProposalLineItem}. The priority is a value
     * between 1 and 16. If not specified, the default priority of the
     *                 {@link LineItemType} will be assigned. The following
     * default, minimum and
     *                 maximum priority values is allowed for each line item
     * type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Default
     * Priority</th>
     *                 <th scope="col">Minimum Priority</th> <th scope="col">Maximum
     * priority</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4</td><td>2</td><td>5</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8</td><td>6</td><td>10</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 Note: it's ignored when {@link #productType} is {@link
     * ProductType#OFFLINE}.
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ProductTemplate.
     * 
     * @param priority   * Priority of {@link ProposalLineItem}. The priority is a value
     * between 1 and 16. If not specified, the default priority of the
     *                 {@link LineItemType} will be assigned. The following
     * default, minimum and
     *                 maximum priority values is allowed for each line item
     * type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Default
     * Priority</th>
     *                 <th scope="col">Minimum Priority</th> <th scope="col">Maximum
     * priority</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4</td><td>2</td><td>5</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8</td><td>6</td><td>10</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 Note: it's ignored when {@link #productType} is {@link
     * ProductType#OFFLINE}.
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the frequencyCaps value for this ProductTemplate.
     * 
     * @return frequencyCaps   * The set of frequency capping units for the created {@link ProposalLineItem}.
     * Each frequency cap in the list must have unique {@link TimeUnit}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this ProductTemplate.
     * 
     * @param frequencyCaps   * The set of frequency capping units for the created {@link ProposalLineItem}.
     * Each frequency cap in the list must have unique {@link TimeUnit}.
     *                 
     *                 This attribute is optional.
     */
    public void setFrequencyCaps(com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201802.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201802.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the productSegmentation value for this ProductTemplate.
     * 
     * @return productSegmentation   * The product segmentation. The combination from the segments
     * and the {@link #targeting} will
     *                 produce the targeting on the resulting {@link ProposalLineItem}.
     * Any type of segmentation cannot also be used for targeting.
     *                 
     *                 This attribute is optional.
     *                 
     *                 Note: if you specify {@link ProducSegmentation#geoSegment},
     * then
     *                 {@link ProductTemplateTargeting#geoTargeting} must
     * be null or empty, vice versa. This also
     *                 applies to other targeting and segmentation.
     */
    public com.google.api.ads.dfp.axis.v201802.ProductSegmentation getProductSegmentation() {
        return productSegmentation;
    }


    /**
     * Sets the productSegmentation value for this ProductTemplate.
     * 
     * @param productSegmentation   * The product segmentation. The combination from the segments
     * and the {@link #targeting} will
     *                 produce the targeting on the resulting {@link ProposalLineItem}.
     * Any type of segmentation cannot also be used for targeting.
     *                 
     *                 This attribute is optional.
     *                 
     *                 Note: if you specify {@link ProducSegmentation#geoSegment},
     * then
     *                 {@link ProductTemplateTargeting#geoTargeting} must
     * be null or empty, vice versa. This also
     *                 applies to other targeting and segmentation.
     */
    public void setProductSegmentation(com.google.api.ads.dfp.axis.v201802.ProductSegmentation productSegmentation) {
        this.productSegmentation = productSegmentation;
    }


    /**
     * Gets the builtInTargeting value for this ProductTemplate.
     * 
     * @return builtInTargeting   * Targeting to be included in the created {@link ProposalLineItem}.
     * Any type targeted cannot also be used for segmentation.
     *                 
     *                 <p>This attribute is optional.
     *                 Note: if {@link #productType} is {@link ProductType#DFP}
     * and {@link #productSegmentation} is
     *                 not specified, this attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.Targeting getBuiltInTargeting() {
        return builtInTargeting;
    }


    /**
     * Sets the builtInTargeting value for this ProductTemplate.
     * 
     * @param builtInTargeting   * Targeting to be included in the created {@link ProposalLineItem}.
     * Any type targeted cannot also be used for segmentation.
     *                 
     *                 <p>This attribute is optional.
     *                 Note: if {@link #productType} is {@link ProductType#DFP}
     * and {@link #productSegmentation} is
     *                 not specified, this attribute is required.
     */
    public void setBuiltInTargeting(com.google.api.ads.dfp.axis.v201802.Targeting builtInTargeting) {
        this.builtInTargeting = builtInTargeting;
    }


    /**
     * Gets the customizableAttributes value for this ProductTemplate.
     * 
     * @return customizableAttributes   * Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 
     *                 <p>This attribute is optional. If not specified, then
     * no targeting or attributes
     *                 are customizable.
     */
    public com.google.api.ads.dfp.axis.v201802.CustomizableAttributes getCustomizableAttributes() {
        return customizableAttributes;
    }


    /**
     * Sets the customizableAttributes value for this ProductTemplate.
     * 
     * @param customizableAttributes   * Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 
     *                 <p>This attribute is optional. If not specified, then
     * no targeting or attributes
     *                 are customizable.
     */
    public void setCustomizableAttributes(com.google.api.ads.dfp.axis.v201802.CustomizableAttributes customizableAttributes) {
        this.customizableAttributes = customizableAttributes;
    }


    /**
     * Gets the customFieldValues value for this ProductTemplate.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this {@code
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this ProductTemplate.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this {@code
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the environmentType value for this ProductTemplate.
     * 
     * @return environmentType   * The environment that the created {@link ProposalLineItem} is
     * targeting. The default value is
     *                 {@link EnvironmentType#BROWSER}. If this value is
     * {@link EnvironmentType#VIDEO_PLAYER}, then
     *                 the {@link ProposalLineItem} can only target {@code
     * AdUnits} that have {@code AdUnitSizes}
     *                 whose {@code environmentType} is also {@code VIDEO_PLAYER}.
     */
    public com.google.api.ads.dfp.axis.v201802.EnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this ProductTemplate.
     * 
     * @param environmentType   * The environment that the created {@link ProposalLineItem} is
     * targeting. The default value is
     *                 {@link EnvironmentType#BROWSER}. If this value is
     * {@link EnvironmentType#VIDEO_PLAYER}, then
     *                 the {@link ProposalLineItem} can only target {@code
     * AdUnits} that have {@code AdUnitSizes}
     *                 whose {@code environmentType} is also {@code VIDEO_PLAYER}.
     */
    public void setEnvironmentType(com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the videoMaxDuration value for this ProductTemplate.
     * 
     * @return videoMaxDuration   * The max duration of a video creative associated with this {@code
     * ProductTemplate} in
     *                 milliseconds. This attribute is optional, defaults
     * to 0, and only meaningful if this is
     *                 a video product template.
     */
    public java.lang.Long getVideoMaxDuration() {
        return videoMaxDuration;
    }


    /**
     * Sets the videoMaxDuration value for this ProductTemplate.
     * 
     * @param videoMaxDuration   * The max duration of a video creative associated with this {@code
     * ProductTemplate} in
     *                 milliseconds. This attribute is optional, defaults
     * to 0, and only meaningful if this is
     *                 a video product template.
     */
    public void setVideoMaxDuration(java.lang.Long videoMaxDuration) {
        this.videoMaxDuration = videoMaxDuration;
    }


    /**
     * Gets the productTemplateMarketplaceInfo value for this ProductTemplate.
     * 
     * @return productTemplateMarketplaceInfo   * Marketplace information of this {@code ProductTemplate}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.ProductTemplateMarketplaceInfo getProductTemplateMarketplaceInfo() {
        return productTemplateMarketplaceInfo;
    }


    /**
     * Sets the productTemplateMarketplaceInfo value for this ProductTemplate.
     * 
     * @param productTemplateMarketplaceInfo   * Marketplace information of this {@code ProductTemplate}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li></ul></span>
     */
    public void setProductTemplateMarketplaceInfo(com.google.api.ads.dfp.axis.v201802.ProductTemplateMarketplaceInfo productTemplateMarketplaceInfo) {
        this.productTemplateMarketplaceInfo = productTemplateMarketplaceInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductTemplate)) return false;
        ProductTemplate other = (ProductTemplate) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.nameMacro==null && other.getNameMacro()==null) || 
             (this.nameMacro!=null &&
              this.nameMacro.equals(other.getNameMacro()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
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
            ((this.productSegmentation==null && other.getProductSegmentation()==null) || 
             (this.productSegmentation!=null &&
              this.productSegmentation.equals(other.getProductSegmentation()))) &&
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
              this.videoMaxDuration.equals(other.getVideoMaxDuration()))) &&
            ((this.productTemplateMarketplaceInfo==null && other.getProductTemplateMarketplaceInfo()==null) || 
             (this.productTemplateMarketplaceInfo!=null &&
              this.productTemplateMarketplaceInfo.equals(other.getProductTemplateMarketplaceInfo())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getNameMacro() != null) {
            _hashCode += getNameMacro().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getCreatorId() != null) {
            _hashCode += getCreatorId().hashCode();
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
        if (getProductSegmentation() != null) {
            _hashCode += getProductSegmentation().hashCode();
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
        if (getProductTemplateMarketplaceInfo() != null) {
            _hashCode += getProductTemplateMarketplaceInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameMacro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "nameMacro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductTemplateStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSegmentation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productSegmentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductSegmentation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "builtInTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizableAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customizableAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomizableAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMaxDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "videoMaxDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTemplateMarketplaceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productTemplateMarketplaceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductTemplateMarketplaceInfo"));
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
