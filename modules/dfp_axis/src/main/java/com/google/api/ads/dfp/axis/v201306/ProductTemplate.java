/**
 * ProductTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;


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
     *                 This attribute is required and has maximum length
     * of 255 characters. */
    private java.lang.String name;

    /* The creation time of the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is created. */
    private com.google.api.ads.dfp.axis.v201306.DateTime creationDateTime;

    /* The date and time this {@code ProductTemplate} was last modified.
     * 
     *                 This attribute is read-only and is assigned by Google
     * when a {@code ProductTemplate}
     *                 is updated. */
    private com.google.api.ads.dfp.axis.v201306.DateTime lastModifiedDateTime;

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
     *                 
     *                 This attribute is read-only and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201306.ProductTemplateStatus status;

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
     *                 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201306.ProductType productType;

    /* The {@link User#ID id} of the user who created the {@code ProductTemplate}.
     * 
     *                 This attribute is read-only and is assigned by Google. */
    private java.lang.Long creatorId;

    /* The method used for billing the created {@link ProposalLineItem}.
     * 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201306.RateType rateType;

    /* The strategy for serving roadblocked creatives (i.e. instances
     * where multiple creatives
     *                 must be served together on a single web page) for
     * the created {@link ProposalLineItem}.
     *                 Only {@link RoadblockingType#ONE_OR_MORE} and {@link
     * RoadblockingType#CREATIVE_SET} are
     *                 supported. {@link RoadblockingType#CREATIVE_SET} can
     * be used to serve multiple creatives
     *                 on a single web page.
     *                 
     *                 This attribute is optional and defaults to {@link
     * RoadblockingType#ONE_OR_MORE}
     *                 when {@link #productType} is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201306.RoadblockingType roadblockingType;

    /* Details about the creatives that are expected to serve for
     * the created {@link ProposalLineItem}.
     *                 <p>For a {@link #roadblockingType} of {@link RoadblockingType#CREATIVE_SET},
     * all
     *                 creative placeholders must have a master and at least
     * one companion size.
     *                 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201306.CreativePlaceholder[] creativePlaceholders;

    /* Indicates the line item type for the created {@link ProposalLineItem}.
     * 
     *                 This attribute is required when {@link #productType}
     * is {@link ProductType#DFP}. */
    private com.google.api.ads.dfp.axis.v201306.LineItemType lineItemType;

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
    private com.google.api.ads.dfp.axis.v201306.FrequencyCap[] frequencyCaps;

    /* Allows customization by salespeople of frequency caps when
     * creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false when
     * {@link #productType} is
     *                 {@link ProductType#DFP}. */
    private java.lang.Boolean allowFrequencyCapsCustomization;

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
    private com.google.api.ads.dfp.axis.v201306.ProductSegmentation productSegmentation;

    /* Targeting to be included in the created {@link ProposalLineItem}.
     * Any type targeted cannot also be used for segmentation.
     *                 If this attribute is not specified, then all targeting
     * is not customizable.
     *                 
     *                 This attribute is optional.
     *                 Note: if {@link #productType} is {@link ProductType#DFP}
     * and {@link #productSegmentation} is
     *                 not specified, this attribute is required. */
    private com.google.api.ads.dfp.axis.v201306.ProductTemplateTargeting targeting;

    /* The values of the custom fields associated with this {@code
     * ProductTemplate}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues;

    public ProductTemplate() {
    }

    public ProductTemplate(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201306.DateTime creationDateTime,
           com.google.api.ads.dfp.axis.v201306.DateTime lastModifiedDateTime,
           java.lang.String description,
           java.lang.String nameMacro,
           com.google.api.ads.dfp.axis.v201306.ProductTemplateStatus status,
           com.google.api.ads.dfp.axis.v201306.ProductType productType,
           java.lang.Long creatorId,
           com.google.api.ads.dfp.axis.v201306.RateType rateType,
           com.google.api.ads.dfp.axis.v201306.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201306.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201306.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.dfp.axis.v201306.FrequencyCap[] frequencyCaps,
           java.lang.Boolean allowFrequencyCapsCustomization,
           com.google.api.ads.dfp.axis.v201306.ProductSegmentation productSegmentation,
           com.google.api.ads.dfp.axis.v201306.ProductTemplateTargeting targeting,
           com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues) {
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
           this.creativePlaceholders = creativePlaceholders;
           this.lineItemType = lineItemType;
           this.priority = priority;
           this.frequencyCaps = frequencyCaps;
           this.allowFrequencyCapsCustomization = allowFrequencyCapsCustomization;
           this.productSegmentation = productSegmentation;
           this.targeting = targeting;
           this.customFieldValues = customFieldValues;
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
     *                 This attribute is required and has maximum length
     * of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductTemplate.
     * 
     * @param name   * The name of the {@code ProductTemplate}.
     *                 
     *                 This attribute is required and has maximum length
     * of 255 characters.
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
    public com.google.api.ads.dfp.axis.v201306.DateTime getCreationDateTime() {
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
    public void setCreationDateTime(com.google.api.ads.dfp.axis.v201306.DateTime creationDateTime) {
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
    public com.google.api.ads.dfp.axis.v201306.DateTime getLastModifiedDateTime() {
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
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201306.DateTime lastModifiedDateTime) {
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
     *                 
     *                 This attribute is read-only and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201306.ProductTemplateStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProductTemplate.
     * 
     * @param status   * The status of the {@code ProductTemplate}.
     *                 
     *                 This attribute is read-only and is assigned by Google.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201306.ProductTemplateStatus status) {
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
     *                 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201306.ProductType getProductType() {
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
     *                 
     *                 This attribute is required.
     */
    public void setProductType(com.google.api.ads.dfp.axis.v201306.ProductType productType) {
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
     * 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201306.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ProductTemplate.
     * 
     * @param rateType   * The method used for billing the created {@link ProposalLineItem}.
     * 
     *                 This attribute is required.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201306.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the roadblockingType value for this ProductTemplate.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives (i.e. instances
     * where multiple creatives
     *                 must be served together on a single web page) for
     * the created {@link ProposalLineItem}.
     *                 Only {@link RoadblockingType#ONE_OR_MORE} and {@link
     * RoadblockingType#CREATIVE_SET} are
     *                 supported. {@link RoadblockingType#CREATIVE_SET} can
     * be used to serve multiple creatives
     *                 on a single web page.
     *                 
     *                 This attribute is optional and defaults to {@link
     * RoadblockingType#ONE_OR_MORE}
     *                 when {@link #productType} is {@link ProductType#DFP}.
     */
    public com.google.api.ads.dfp.axis.v201306.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this ProductTemplate.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives (i.e. instances
     * where multiple creatives
     *                 must be served together on a single web page) for
     * the created {@link ProposalLineItem}.
     *                 Only {@link RoadblockingType#ONE_OR_MORE} and {@link
     * RoadblockingType#CREATIVE_SET} are
     *                 supported. {@link RoadblockingType#CREATIVE_SET} can
     * be used to serve multiple creatives
     *                 on a single web page.
     *                 
     *                 This attribute is optional and defaults to {@link
     * RoadblockingType#ONE_OR_MORE}
     *                 when {@link #productType} is {@link ProductType#DFP}.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201306.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
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
    public com.google.api.ads.dfp.axis.v201306.CreativePlaceholder[] getCreativePlaceholders() {
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
    public void setCreativePlaceholders(com.google.api.ads.dfp.axis.v201306.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.dfp.axis.v201306.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.dfp.axis.v201306.CreativePlaceholder _value) {
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
    public com.google.api.ads.dfp.axis.v201306.LineItemType getLineItemType() {
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
    public void setLineItemType(com.google.api.ads.dfp.axis.v201306.LineItemType lineItemType) {
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
    public com.google.api.ads.dfp.axis.v201306.FrequencyCap[] getFrequencyCaps() {
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
    public void setFrequencyCaps(com.google.api.ads.dfp.axis.v201306.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201306.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201306.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the allowFrequencyCapsCustomization value for this ProductTemplate.
     * 
     * @return allowFrequencyCapsCustomization   * Allows customization by salespeople of frequency caps when
     * creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false when
     * {@link #productType} is
     *                 {@link ProductType#DFP}.
     */
    public java.lang.Boolean getAllowFrequencyCapsCustomization() {
        return allowFrequencyCapsCustomization;
    }


    /**
     * Sets the allowFrequencyCapsCustomization value for this ProductTemplate.
     * 
     * @param allowFrequencyCapsCustomization   * Allows customization by salespeople of frequency caps when
     * creating
     *                 proposal line items.
     *                 
     *                 This attribute is optional and defaults to false when
     * {@link #productType} is
     *                 {@link ProductType#DFP}.
     */
    public void setAllowFrequencyCapsCustomization(java.lang.Boolean allowFrequencyCapsCustomization) {
        this.allowFrequencyCapsCustomization = allowFrequencyCapsCustomization;
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
    public com.google.api.ads.dfp.axis.v201306.ProductSegmentation getProductSegmentation() {
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
    public void setProductSegmentation(com.google.api.ads.dfp.axis.v201306.ProductSegmentation productSegmentation) {
        this.productSegmentation = productSegmentation;
    }


    /**
     * Gets the targeting value for this ProductTemplate.
     * 
     * @return targeting   * Targeting to be included in the created {@link ProposalLineItem}.
     * Any type targeted cannot also be used for segmentation.
     *                 If this attribute is not specified, then all targeting
     * is not customizable.
     *                 
     *                 This attribute is optional.
     *                 Note: if {@link #productType} is {@link ProductType#DFP}
     * and {@link #productSegmentation} is
     *                 not specified, this attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201306.ProductTemplateTargeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this ProductTemplate.
     * 
     * @param targeting   * Targeting to be included in the created {@link ProposalLineItem}.
     * Any type targeted cannot also be used for segmentation.
     *                 If this attribute is not specified, then all targeting
     * is not customizable.
     *                 
     *                 This attribute is optional.
     *                 Note: if {@link #productType} is {@link ProductType#DFP}
     * and {@link #productSegmentation} is
     *                 not specified, this attribute is required.
     */
    public void setTargeting(com.google.api.ads.dfp.axis.v201306.ProductTemplateTargeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the customFieldValues value for this ProductTemplate.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this {@code
     * ProductTemplate}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] getCustomFieldValues() {
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
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
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
            ((this.allowFrequencyCapsCustomization==null && other.getAllowFrequencyCapsCustomization()==null) || 
             (this.allowFrequencyCapsCustomization!=null &&
              this.allowFrequencyCapsCustomization.equals(other.getAllowFrequencyCapsCustomization()))) &&
            ((this.productSegmentation==null && other.getProductSegmentation()==null) || 
             (this.productSegmentation!=null &&
              this.productSegmentation.equals(other.getProductSegmentation()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues())));
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
        if (getAllowFrequencyCapsCustomization() != null) {
            _hashCode += getAllowFrequencyCapsCustomization().hashCode();
        }
        if (getProductSegmentation() != null) {
            _hashCode += getProductSegmentation().hashCode();
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameMacro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "nameMacro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductTemplateStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFrequencyCapsCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "allowFrequencyCapsCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSegmentation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "productSegmentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductSegmentation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductTemplateTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
