/**
 * LineItemSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;


/**
 * The {@code LineItemSummary} represents the base class from which
 * a {@code
 *             LineItem} is derived.
 */
public class LineItemSummary  implements java.io.Serializable {
    /* The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required. */
    private java.lang.Long orderId;

    /* Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created. */
    private java.lang.Long id;

    /* The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 127 characters. */
    private java.lang.String name;

    /* An identifier for the {@code LineItem} that is meaningful to
     * the publisher.
     *                 This attribute is optional and has a maximum length
     * of 63 characters. */
    private java.lang.String externalId;

    /* The name of the {@link Order}. This value is read-only. */
    private java.lang.String orderName;

    /* The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future. */
    private com.google.api.ads.dfp.axis.v201306.DateTime startDateTime;

    /* Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}. */
    private com.google.api.ads.dfp.axis.v201306.StartDateTimeType startDateTimeType;

    /* The date and time on which the {@code LineItem} will stop serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. This end date and time does not include
     * auto extension days. */
    private com.google.api.ads.dfp.axis.v201306.DateTime endDateTime;

    /* The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum
     *                 of 7 days is allowed. This is a premium feature available
     * for
     *                 {@link LineItemType#STANDARD} line items. */
    private java.lang.Integer autoExtensionDays;

    /* Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}. */
    private java.lang.Boolean unlimitedEndDateTime;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201306.CreativeRotationType creativeRotationType;

    /* The strategy for delivering ads over the course of the line
     * item's
     *                 duration. This attribute is optional and defaults
     * to
     *                 {@link DeliveryRateType#EVENLY}.
     *                 Starting in v201306, it may default to {@link DeliveryRateType#FRONTLOADED}
     * if specifically configured to on the network. */
    private com.google.api.ads.dfp.axis.v201306.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}. */
    private com.google.api.ads.dfp.axis.v201306.RoadblockingType roadblockingType;

    /* The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional. */
    private com.google.api.ads.dfp.axis.v201306.FrequencyCap[] frequencyCaps;

    /* Indicates the line item type of a {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201306.LineItemType lineItemType;

    /* The priority for the line item. The priority is a value
     *                 between 1 and 16. If not specified, the default priority
     * of the
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
     *                 <tr>
     *                 <td>{@link LineItemType#CLICK_TRACKING}</td>
     *                 <td>16</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#AD_EXCHANGE}</td>
     *                 <td>12</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <td>{@link LineItemType#ADSENSE}</td>
     *                 <td>12</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <td>{@link LineItemType#BUMPER}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 This field can only be edited by certain networks,
     * otherwise a
     *                 {@link PermissionError} will occur. */
    private java.lang.Integer priority;

    /* The unit with which the goal or cap of the {@code LineItem}
     * is defined. If
     *                 this attribute is not explicitly set, Google derives
     * this attribute from
     *                 {@link LineItem#costType}. If {@link LineItem#costType}
     * is {@link
     *                 CostType#CPC}, then {@link UnitType#CLICKS} is assumed,
     * otherwise {@link
     *                 UnitType#IMPRESSIONS} is assumed. */
    private com.google.api.ads.dfp.axis.v201306.UnitType unitType;

    /* The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. For each line
     * item type, the
     *                 following are the valid and default values:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th> <th scope="col">Default duration value</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP SPONSORSHIP}</td>
     * <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK NETWORK}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK BULK}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY PRICE_PRIORITY}</td>
     * <td>{@link Duration#DAILY DAILY},
     *                 {@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE HOUSE}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 </table> */
    private com.google.api.ads.dfp.axis.v201306.LineItemSummaryDuration duration;

    /* The total number of impressions or clicks that will be reserved
     * for the {@code LineItem}. If
     *                 the line item is of type {@link LineItemType#SPONSORSHIP},
     * then it represents the percentage of
     *                 available impressions reserved. If the line item is
     * of type {@link LineItemType#BULK} or
     *                 {@link LineItemType#PRICE_PRIORITY}, then it represents
     * the number of remaining impressions
     *                 reserved. If the line item is of type {@link LineItemType#NETWORK}
     * or
     *                 {@link LineItemType#HOUSE}, then it represents the
     * percentage of remaining impressions
     *                 reserved. This attribute is required and must be greater
     * than 0. */
    private java.lang.Long unitsBought;

    /* The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}. The currency
     * code is readonly. */
    private com.google.api.ads.dfp.axis.v201306.Money costPerUnit;

    /* An amount to help the adserver rank inventory. {@link
     *                 LineItem#valueCostPerUnit} artificially raises the
     * value of
     *                 inventory over the {@link LineItem#costPerUnit} but
     * avoids raising
     *                 the actual {@link LineItem#costPerUnit}. This attribute
     * is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0. The currency code is readonly. */
    private com.google.api.ads.dfp.axis.v201306.Money valueCostPerUnit;

    /* The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required. */
    private com.google.api.ads.dfp.axis.v201306.CostType costType;

    /* The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}. */
    private com.google.api.ads.dfp.axis.v201306.LineItemDiscountType discountType;

    /* The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported. */
    private java.lang.Double discount;

    /* Number of units as specified in the contract that the advertiser
     * has bought
     *                 for this {@code LineItem}. This field is just a "FYI"
     * for the trafficker to
     *                 manually intervene with the {@code LineItem} when
     * needed, it doesn't impact
     *                 adserving or other backend systems. The default value
     * is 0, which means
     *                 contracted units bought is not set */
    private java.lang.Long contractedUnitsBought;

    /* Details about the creatives that are expected to serve through
     * this
     *                 {@code LineItem}. This attribute is required and replaces
     * the
     *                 {@code creativeSizes} attribute. */
    private com.google.api.ads.dfp.axis.v201306.CreativePlaceholder[] creativePlaceholders;

    /* The platform that the {@code LineItem} is targeting, the default
     * value is
     *                 {@link TargetPlatform#WEB}. Line items will only serve
     * to ad units that have the same
     *                 {@link AdUnit#targetPlatform}. */
    private com.google.api.ads.dfp.axis.v201306.TargetPlatform targetPlatform;

    /* The environment that the {@code LineItem} is targeting. The
     * default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is
     *                 {@link EnvironmentType#VIDEO_PLAYER}, then this line
     * item can only target
     *                 {@code AdUnits} that have {@code AdUnitSizes} whose
     * {@code environmentType}
     *                 is also {@code VIDEO_PLAYER}. */
    private com.google.api.ads.dfp.axis.v201306.EnvironmentType environmentType;

    /* The delivery option for companions. This is only valid if the
     * environment type is
     *                 {@link EnvironmentType#VIDEO_PLAYER} or the roadblocking
     * type is
     *                 {@link RoadblockingType#CREATIVE_SET}. The default
     * value for video environments or
     *                 roadblocking creatives is {@link CompanionDeliveryOption#OPTIONAL}.
     * The default
     *                 value in other cases is {@link CompanionDeliveryOption#UNKNOWN}.
     * Providing something
     *                 other than {@link CompanionDeliveryOption#UNKNOWN}
     * will cause an error. */
    private com.google.api.ads.dfp.axis.v201306.CompanionDeliveryOption companionDeliveryOption;

    /* Specifies options to prevent ads from replacing or appearing
     * with this {@code LineItem}. */
    private com.google.api.ads.dfp.axis.v201306.CreativePersistenceType creativePersistenceType;

    /* The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When true, operations on this line
     * item will never trigger a {@link ForecastError}, which corresponds
     * to an
     *                 overbook warning in the UI. The default value is false. */
    private java.lang.Boolean allowOverbook;

    /* The flag indicates whether the inventory check should be skipped
     * when performing an action on
     *                 this line item. The default value is false. */
    private java.lang.Boolean skipInventoryCheck;

    /* The flag indicates whether inventory should be reserved when
     * creating a
     *                 line item of types {@link LineItemType#SPONSORSHIP}
     * and
     *                 {@link LineItemType#STANDARD} in an unapproved {@link
     * Order}. The default
     *                 value is false. */
    private java.lang.Boolean reserveAtCreation;

    /* Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet. */
    private com.google.api.ads.dfp.axis.v201306.Stats stats;

    /* Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol> */
    private com.google.api.ads.dfp.axis.v201306.DeliveryIndicator deliveryIndicator;

    /* Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItem#deliveryIndicator} should be used
     * to track its
     *                 progress in this case.</li> */
    private com.google.api.ads.dfp.axis.v201306.DeliveryData deliveryData;

    /* The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. The currency
     * code is readonly. */
    private com.google.api.ads.dfp.axis.v201306.Money budget;

    /* The status of the {@code LineItem}. This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201306.ComputedStatus status;

    /* Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201306.LineItemSummaryReservationStatus reservationStatus;

    /* The archival status of the {@code LineItem}. This attribute
     * is readonly. */
    private java.lang.Boolean isArchived;

    /* The web property code used for dynamic allocation line items.
     * This web
     *                 property is only required with line item types
     *                 {@link LineItemType#AD_EXCHANGE} and {@link LineItemType#ADSENSE}. */
    private java.lang.String webPropertyCode;

    /* The set of labels applied directly to this line item. */
    private com.google.api.ads.dfp.axis.v201306.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the line item
     * as well as
     *                 those inherited from the order that contains this
     * line item and the
     *                 advertiser that owns the order. If a label has been
     * negated, only the
     *                 negated label is returned. This field is readonly
     * and is assigned by
     *                 Google. */
    private com.google.api.ads.dfp.axis.v201306.AppliedLabel[] effectiveAppliedLabels;

    /* If a line item has a series of competitive exclusions on it,
     * it could be
     *                 blocked from serving with line items from the same
     * advertiser. Setting this
     *                 to {@code true} will allow line items from the same
     * advertiser to serve
     *                 regardless of the other competitive exclusion labels
     * being applied. */
    private java.lang.Boolean disableSameAdvertiserCompetitiveExclusion;

    /* The application that last modified this line item. This attribute
     * is read only
     *                 and is assigned by Google. */
    private java.lang.String lastModifiedByApp;

    /* Provides any additional notes that may annotate the {@code
     * LineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* The date and time this line item was last modified. */
    private com.google.api.ads.dfp.axis.v201306.DateTime lastModifiedDateTime;

    /* This attribute may be {@code null} for line items created before
     * this feature was introduced. */
    private com.google.api.ads.dfp.axis.v201306.DateTime creationDateTime;

    /* The values of the custom fields associated with this line item. */
    private com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues;

    /* Indicates if a {@code LineItem} is missing any {@link Creative
     * creatives} for the
     *                 {@code creativePlaceholders} specified.
     *                 
     *                 {@link Creative Creatives} can be considered missing
     * for several reasons including:
     *                 <ul><li>Not enough {@link Creative creatives} of a
     * certain size have been uploaded, as
     *                 determined by {@link CreativePlaceholder#expectedCreativeCount}.
     * For example a
     *                 {@code LineItem} specifies 750x350, 400x200 but only
     * a 750x350 was uploaded.  Or
     *                 {@code LineItem} specifies 750x350 with an expected
     * count of 2, but only one was uploaded.
     *                 </li>
     *                 <li>The {@link Creative#appliedLabels} of an associated
     * {@code Creative} do not match the
     *                 {@link CreativePlaceholder#effectiveAppliedLabels}
     * of the {@code LineItem}. For example
     *                 {@code LineItem} specifies 750x350 with a Foo {@code
     * AppliedLabel} but a 750x350 creative
     *                 without a {@code AppliedLabel} was uploaded.</li></ul> */
    private java.lang.Boolean isMissingCreatives;

    /* Indicates that this instance is a subtype of LineItemSummary.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String lineItemSummaryType;

    public LineItemSummary() {
    }

    public LineItemSummary(
           java.lang.Long orderId,
           java.lang.Long id,
           java.lang.String name,
           java.lang.String externalId,
           java.lang.String orderName,
           com.google.api.ads.dfp.axis.v201306.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201306.StartDateTimeType startDateTimeType,
           com.google.api.ads.dfp.axis.v201306.DateTime endDateTime,
           java.lang.Integer autoExtensionDays,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.axis.v201306.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.axis.v201306.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201306.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201306.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.axis.v201306.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.dfp.axis.v201306.UnitType unitType,
           com.google.api.ads.dfp.axis.v201306.LineItemSummaryDuration duration,
           java.lang.Long unitsBought,
           com.google.api.ads.dfp.axis.v201306.Money costPerUnit,
           com.google.api.ads.dfp.axis.v201306.Money valueCostPerUnit,
           com.google.api.ads.dfp.axis.v201306.CostType costType,
           com.google.api.ads.dfp.axis.v201306.LineItemDiscountType discountType,
           java.lang.Double discount,
           java.lang.Long contractedUnitsBought,
           com.google.api.ads.dfp.axis.v201306.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201306.TargetPlatform targetPlatform,
           com.google.api.ads.dfp.axis.v201306.EnvironmentType environmentType,
           com.google.api.ads.dfp.axis.v201306.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.axis.v201306.CreativePersistenceType creativePersistenceType,
           java.lang.Boolean allowOverbook,
           java.lang.Boolean skipInventoryCheck,
           java.lang.Boolean reserveAtCreation,
           com.google.api.ads.dfp.axis.v201306.Stats stats,
           com.google.api.ads.dfp.axis.v201306.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.axis.v201306.DeliveryData deliveryData,
           com.google.api.ads.dfp.axis.v201306.Money budget,
           com.google.api.ads.dfp.axis.v201306.ComputedStatus status,
           com.google.api.ads.dfp.axis.v201306.LineItemSummaryReservationStatus reservationStatus,
           java.lang.Boolean isArchived,
           java.lang.String webPropertyCode,
           com.google.api.ads.dfp.axis.v201306.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201306.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Boolean disableSameAdvertiserCompetitiveExclusion,
           java.lang.String lastModifiedByApp,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201306.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201306.DateTime creationDateTime,
           com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues,
           java.lang.Boolean isMissingCreatives,
           java.lang.String lineItemSummaryType) {
           this.orderId = orderId;
           this.id = id;
           this.name = name;
           this.externalId = externalId;
           this.orderName = orderName;
           this.startDateTime = startDateTime;
           this.startDateTimeType = startDateTimeType;
           this.endDateTime = endDateTime;
           this.autoExtensionDays = autoExtensionDays;
           this.unlimitedEndDateTime = unlimitedEndDateTime;
           this.creativeRotationType = creativeRotationType;
           this.deliveryRateType = deliveryRateType;
           this.roadblockingType = roadblockingType;
           this.frequencyCaps = frequencyCaps;
           this.lineItemType = lineItemType;
           this.priority = priority;
           this.unitType = unitType;
           this.duration = duration;
           this.unitsBought = unitsBought;
           this.costPerUnit = costPerUnit;
           this.valueCostPerUnit = valueCostPerUnit;
           this.costType = costType;
           this.discountType = discountType;
           this.discount = discount;
           this.contractedUnitsBought = contractedUnitsBought;
           this.creativePlaceholders = creativePlaceholders;
           this.targetPlatform = targetPlatform;
           this.environmentType = environmentType;
           this.companionDeliveryOption = companionDeliveryOption;
           this.creativePersistenceType = creativePersistenceType;
           this.allowOverbook = allowOverbook;
           this.skipInventoryCheck = skipInventoryCheck;
           this.reserveAtCreation = reserveAtCreation;
           this.stats = stats;
           this.deliveryIndicator = deliveryIndicator;
           this.deliveryData = deliveryData;
           this.budget = budget;
           this.status = status;
           this.reservationStatus = reservationStatus;
           this.isArchived = isArchived;
           this.webPropertyCode = webPropertyCode;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.disableSameAdvertiserCompetitiveExclusion = disableSameAdvertiserCompetitiveExclusion;
           this.lastModifiedByApp = lastModifiedByApp;
           this.notes = notes;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.creationDateTime = creationDateTime;
           this.customFieldValues = customFieldValues;
           this.isMissingCreatives = isMissingCreatives;
           this.lineItemSummaryType = lineItemSummaryType;
    }


    /**
     * Gets the orderId value for this LineItemSummary.
     * 
     * @return orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this LineItemSummary.
     * 
     * @param orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the id value for this LineItemSummary.
     * 
     * @return id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LineItemSummary.
     * 
     * @param id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LineItemSummary.
     * 
     * @return name   * The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 127 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LineItemSummary.
     * 
     * @param name   * The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 127 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the externalId value for this LineItemSummary.
     * 
     * @return externalId   * An identifier for the {@code LineItem} that is meaningful to
     * the publisher.
     *                 This attribute is optional and has a maximum length
     * of 63 characters.
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this LineItemSummary.
     * 
     * @param externalId   * An identifier for the {@code LineItem} that is meaningful to
     * the publisher.
     *                 This attribute is optional and has a maximum length
     * of 63 characters.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the orderName value for this LineItemSummary.
     * 
     * @return orderName   * The name of the {@link Order}. This value is read-only.
     */
    public java.lang.String getOrderName() {
        return orderName;
    }


    /**
     * Sets the orderName value for this LineItemSummary.
     * 
     * @param orderName   * The name of the {@link Order}. This value is read-only.
     */
    public void setOrderName(java.lang.String orderName) {
        this.orderName = orderName;
    }


    /**
     * Gets the startDateTime value for this LineItemSummary.
     * 
     * @return startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future.
     */
    public com.google.api.ads.dfp.axis.v201306.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this LineItemSummary.
     * 
     * @param startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201306.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startDateTimeType value for this LineItemSummary.
     * 
     * @return startDateTimeType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public com.google.api.ads.dfp.axis.v201306.StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }


    /**
     * Sets the startDateTimeType value for this LineItemSummary.
     * 
     * @param startDateTimeType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public void setStartDateTimeType(com.google.api.ads.dfp.axis.v201306.StartDateTimeType startDateTimeType) {
        this.startDateTimeType = startDateTimeType;
    }


    /**
     * Gets the endDateTime value for this LineItemSummary.
     * 
     * @return endDateTime   * The date and time on which the {@code LineItem} will stop serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. This end date and time does not include
     * auto extension days.
     */
    public com.google.api.ads.dfp.axis.v201306.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this LineItemSummary.
     * 
     * @param endDateTime   * The date and time on which the {@code LineItem} will stop serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. This end date and time does not include
     * auto extension days.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201306.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the autoExtensionDays value for this LineItemSummary.
     * 
     * @return autoExtensionDays   * The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum
     *                 of 7 days is allowed. This is a premium feature available
     * for
     *                 {@link LineItemType#STANDARD} line items.
     */
    public java.lang.Integer getAutoExtensionDays() {
        return autoExtensionDays;
    }


    /**
     * Sets the autoExtensionDays value for this LineItemSummary.
     * 
     * @param autoExtensionDays   * The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum
     *                 of 7 days is allowed. This is a premium feature available
     * for
     *                 {@link LineItemType#STANDARD} line items.
     */
    public void setAutoExtensionDays(java.lang.Integer autoExtensionDays) {
        this.autoExtensionDays = autoExtensionDays;
    }


    /**
     * Gets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @return unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}.
     */
    public java.lang.Boolean getUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }


    /**
     * Sets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @param unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}.
     */
    public void setUnlimitedEndDateTime(java.lang.Boolean unlimitedEndDateTime) {
        this.unlimitedEndDateTime = unlimitedEndDateTime;
    }


    /**
     * Gets the creativeRotationType value for this LineItemSummary.
     * 
     * @return creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201306.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this LineItemSummary.
     * 
     * @param creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required.
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201306.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }


    /**
     * Gets the deliveryRateType value for this LineItemSummary.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's
     *                 duration. This attribute is optional and defaults
     * to
     *                 {@link DeliveryRateType#EVENLY}.
     *                 Starting in v201306, it may default to {@link DeliveryRateType#FRONTLOADED}
     * if specifically configured to on the network.
     */
    public com.google.api.ads.dfp.axis.v201306.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this LineItemSummary.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's
     *                 duration. This attribute is optional and defaults
     * to
     *                 {@link DeliveryRateType#EVENLY}.
     *                 Starting in v201306, it may default to {@link DeliveryRateType#FRONTLOADED}
     * if specifically configured to on the network.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201306.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the roadblockingType value for this LineItemSummary.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}.
     */
    public com.google.api.ads.dfp.axis.v201306.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this LineItemSummary.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201306.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the frequencyCaps value for this LineItemSummary.
     * 
     * @return frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201306.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this LineItemSummary.
     * 
     * @param frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
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
     * Gets the lineItemType value for this LineItemSummary.
     * 
     * @return lineItemType   * Indicates the line item type of a {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201306.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this LineItemSummary.
     * 
     * @param lineItemType   * Indicates the line item type of a {@code LineItem}. This attribute
     * is required.
     */
    public void setLineItemType(com.google.api.ads.dfp.axis.v201306.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the priority value for this LineItemSummary.
     * 
     * @return priority   * The priority for the line item. The priority is a value
     *                 between 1 and 16. If not specified, the default priority
     * of the
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
     *                 <tr>
     *                 <td>{@link LineItemType#CLICK_TRACKING}</td>
     *                 <td>16</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#AD_EXCHANGE}</td>
     *                 <td>12</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <td>{@link LineItemType#ADSENSE}</td>
     *                 <td>12</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <td>{@link LineItemType#BUMPER}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 This field can only be edited by certain networks,
     * otherwise a
     *                 {@link PermissionError} will occur.
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this LineItemSummary.
     * 
     * @param priority   * The priority for the line item. The priority is a value
     *                 between 1 and 16. If not specified, the default priority
     * of the
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
     *                 <tr>
     *                 <td>{@link LineItemType#CLICK_TRACKING}</td>
     *                 <td>16</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#AD_EXCHANGE}</td>
     *                 <td>12</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <td>{@link LineItemType#ADSENSE}</td>
     *                 <td>12</td><td>1</td><td>16</td>
     *                 </tr>
     *                 <td>{@link LineItemType#BUMPER}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 This field can only be edited by certain networks,
     * otherwise a
     *                 {@link PermissionError} will occur.
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the unitType value for this LineItemSummary.
     * 
     * @return unitType   * The unit with which the goal or cap of the {@code LineItem}
     * is defined. If
     *                 this attribute is not explicitly set, Google derives
     * this attribute from
     *                 {@link LineItem#costType}. If {@link LineItem#costType}
     * is {@link
     *                 CostType#CPC}, then {@link UnitType#CLICKS} is assumed,
     * otherwise {@link
     *                 UnitType#IMPRESSIONS} is assumed.
     */
    public com.google.api.ads.dfp.axis.v201306.UnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this LineItemSummary.
     * 
     * @param unitType   * The unit with which the goal or cap of the {@code LineItem}
     * is defined. If
     *                 this attribute is not explicitly set, Google derives
     * this attribute from
     *                 {@link LineItem#costType}. If {@link LineItem#costType}
     * is {@link
     *                 CostType#CPC}, then {@link UnitType#CLICKS} is assumed,
     * otherwise {@link
     *                 UnitType#IMPRESSIONS} is assumed.
     */
    public void setUnitType(com.google.api.ads.dfp.axis.v201306.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the duration value for this LineItemSummary.
     * 
     * @return duration   * The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. For each line
     * item type, the
     *                 following are the valid and default values:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th> <th scope="col">Default duration value</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP SPONSORSHIP}</td>
     * <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK NETWORK}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK BULK}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY PRICE_PRIORITY}</td>
     * <td>{@link Duration#DAILY DAILY},
     *                 {@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE HOUSE}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 </table>
     */
    public com.google.api.ads.dfp.axis.v201306.LineItemSummaryDuration getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this LineItemSummary.
     * 
     * @param duration   * The period over which the goal or cap for {@code LineItem}
     * should be
     *                 reached. This attribute is optional. For each line
     * item type, the
     *                 following are the valid and default values:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Valid
     * duration
     *                 values</th> <th scope="col">Default duration value</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP SPONSORSHIP}</td>
     * <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD STANDARD}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK NETWORK}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK BULK}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY PRICE_PRIORITY}</td>
     * <td>{@link Duration#DAILY DAILY},
     *                 {@link Duration#LIFETIME LIFETIME}</td>
     *                 <td>{@link Duration#LIFETIME LIFETIME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE HOUSE}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 <td>{@link Duration#DAILY DAILY}</td>
     *                 </tr>
     *                 </table>
     */
    public void setDuration(com.google.api.ads.dfp.axis.v201306.LineItemSummaryDuration duration) {
        this.duration = duration;
    }


    /**
     * Gets the unitsBought value for this LineItemSummary.
     * 
     * @return unitsBought   * The total number of impressions or clicks that will be reserved
     * for the {@code LineItem}. If
     *                 the line item is of type {@link LineItemType#SPONSORSHIP},
     * then it represents the percentage of
     *                 available impressions reserved. If the line item is
     * of type {@link LineItemType#BULK} or
     *                 {@link LineItemType#PRICE_PRIORITY}, then it represents
     * the number of remaining impressions
     *                 reserved. If the line item is of type {@link LineItemType#NETWORK}
     * or
     *                 {@link LineItemType#HOUSE}, then it represents the
     * percentage of remaining impressions
     *                 reserved. This attribute is required and must be greater
     * than 0.
     */
    public java.lang.Long getUnitsBought() {
        return unitsBought;
    }


    /**
     * Sets the unitsBought value for this LineItemSummary.
     * 
     * @param unitsBought   * The total number of impressions or clicks that will be reserved
     * for the {@code LineItem}. If
     *                 the line item is of type {@link LineItemType#SPONSORSHIP},
     * then it represents the percentage of
     *                 available impressions reserved. If the line item is
     * of type {@link LineItemType#BULK} or
     *                 {@link LineItemType#PRICE_PRIORITY}, then it represents
     * the number of remaining impressions
     *                 reserved. If the line item is of type {@link LineItemType#NETWORK}
     * or
     *                 {@link LineItemType#HOUSE}, then it represents the
     * percentage of remaining impressions
     *                 reserved. This attribute is required and must be greater
     * than 0.
     */
    public void setUnitsBought(java.lang.Long unitsBought) {
        this.unitsBought = unitsBought;
    }


    /**
     * Gets the costPerUnit value for this LineItemSummary.
     * 
     * @return costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}. The currency
     * code is readonly.
     */
    public com.google.api.ads.dfp.axis.v201306.Money getCostPerUnit() {
        return costPerUnit;
    }


    /**
     * Sets the costPerUnit value for this LineItemSummary.
     * 
     * @param costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}. The currency
     * code is readonly.
     */
    public void setCostPerUnit(com.google.api.ads.dfp.axis.v201306.Money costPerUnit) {
        this.costPerUnit = costPerUnit;
    }


    /**
     * Gets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @return valueCostPerUnit   * An amount to help the adserver rank inventory. {@link
     *                 LineItem#valueCostPerUnit} artificially raises the
     * value of
     *                 inventory over the {@link LineItem#costPerUnit} but
     * avoids raising
     *                 the actual {@link LineItem#costPerUnit}. This attribute
     * is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0. The currency code is readonly.
     */
    public com.google.api.ads.dfp.axis.v201306.Money getValueCostPerUnit() {
        return valueCostPerUnit;
    }


    /**
     * Sets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @param valueCostPerUnit   * An amount to help the adserver rank inventory. {@link
     *                 LineItem#valueCostPerUnit} artificially raises the
     * value of
     *                 inventory over the {@link LineItem#costPerUnit} but
     * avoids raising
     *                 the actual {@link LineItem#costPerUnit}. This attribute
     * is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0. The currency code is readonly.
     */
    public void setValueCostPerUnit(com.google.api.ads.dfp.axis.v201306.Money valueCostPerUnit) {
        this.valueCostPerUnit = valueCostPerUnit;
    }


    /**
     * Gets the costType value for this LineItemSummary.
     * 
     * @return costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public com.google.api.ads.dfp.axis.v201306.CostType getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this LineItemSummary.
     * 
     * @param costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public void setCostType(com.google.api.ads.dfp.axis.v201306.CostType costType) {
        this.costType = costType;
    }


    /**
     * Gets the discountType value for this LineItemSummary.
     * 
     * @return discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}.
     */
    public com.google.api.ads.dfp.axis.v201306.LineItemDiscountType getDiscountType() {
        return discountType;
    }


    /**
     * Sets the discountType value for this LineItemSummary.
     * 
     * @param discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}.
     */
    public void setDiscountType(com.google.api.ads.dfp.axis.v201306.LineItemDiscountType discountType) {
        this.discountType = discountType;
    }


    /**
     * Gets the discount value for this LineItemSummary.
     * 
     * @return discount   * The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported.
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this LineItemSummary.
     * 
     * @param discount   * The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported.
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the contractedUnitsBought value for this LineItemSummary.
     * 
     * @return contractedUnitsBought   * Number of units as specified in the contract that the advertiser
     * has bought
     *                 for this {@code LineItem}. This field is just a "FYI"
     * for the trafficker to
     *                 manually intervene with the {@code LineItem} when
     * needed, it doesn't impact
     *                 adserving or other backend systems. The default value
     * is 0, which means
     *                 contracted units bought is not set
     */
    public java.lang.Long getContractedUnitsBought() {
        return contractedUnitsBought;
    }


    /**
     * Sets the contractedUnitsBought value for this LineItemSummary.
     * 
     * @param contractedUnitsBought   * Number of units as specified in the contract that the advertiser
     * has bought
     *                 for this {@code LineItem}. This field is just a "FYI"
     * for the trafficker to
     *                 manually intervene with the {@code LineItem} when
     * needed, it doesn't impact
     *                 adserving or other backend systems. The default value
     * is 0, which means
     *                 contracted units bought is not set
     */
    public void setContractedUnitsBought(java.lang.Long contractedUnitsBought) {
        this.contractedUnitsBought = contractedUnitsBought;
    }


    /**
     * Gets the creativePlaceholders value for this LineItemSummary.
     * 
     * @return creativePlaceholders   * Details about the creatives that are expected to serve through
     * this
     *                 {@code LineItem}. This attribute is required and replaces
     * the
     *                 {@code creativeSizes} attribute.
     */
    public com.google.api.ads.dfp.axis.v201306.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this LineItemSummary.
     * 
     * @param creativePlaceholders   * Details about the creatives that are expected to serve through
     * this
     *                 {@code LineItem}. This attribute is required and replaces
     * the
     *                 {@code creativeSizes} attribute.
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
     * Gets the targetPlatform value for this LineItemSummary.
     * 
     * @return targetPlatform   * The platform that the {@code LineItem} is targeting, the default
     * value is
     *                 {@link TargetPlatform#WEB}. Line items will only serve
     * to ad units that have the same
     *                 {@link AdUnit#targetPlatform}.
     */
    public com.google.api.ads.dfp.axis.v201306.TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }


    /**
     * Sets the targetPlatform value for this LineItemSummary.
     * 
     * @param targetPlatform   * The platform that the {@code LineItem} is targeting, the default
     * value is
     *                 {@link TargetPlatform#WEB}. Line items will only serve
     * to ad units that have the same
     *                 {@link AdUnit#targetPlatform}.
     */
    public void setTargetPlatform(com.google.api.ads.dfp.axis.v201306.TargetPlatform targetPlatform) {
        this.targetPlatform = targetPlatform;
    }


    /**
     * Gets the environmentType value for this LineItemSummary.
     * 
     * @return environmentType   * The environment that the {@code LineItem} is targeting. The
     * default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is
     *                 {@link EnvironmentType#VIDEO_PLAYER}, then this line
     * item can only target
     *                 {@code AdUnits} that have {@code AdUnitSizes} whose
     * {@code environmentType}
     *                 is also {@code VIDEO_PLAYER}.
     */
    public com.google.api.ads.dfp.axis.v201306.EnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this LineItemSummary.
     * 
     * @param environmentType   * The environment that the {@code LineItem} is targeting. The
     * default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is
     *                 {@link EnvironmentType#VIDEO_PLAYER}, then this line
     * item can only target
     *                 {@code AdUnits} that have {@code AdUnitSizes} whose
     * {@code environmentType}
     *                 is also {@code VIDEO_PLAYER}.
     */
    public void setEnvironmentType(com.google.api.ads.dfp.axis.v201306.EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the companionDeliveryOption value for this LineItemSummary.
     * 
     * @return companionDeliveryOption   * The delivery option for companions. This is only valid if the
     * environment type is
     *                 {@link EnvironmentType#VIDEO_PLAYER} or the roadblocking
     * type is
     *                 {@link RoadblockingType#CREATIVE_SET}. The default
     * value for video environments or
     *                 roadblocking creatives is {@link CompanionDeliveryOption#OPTIONAL}.
     * The default
     *                 value in other cases is {@link CompanionDeliveryOption#UNKNOWN}.
     * Providing something
     *                 other than {@link CompanionDeliveryOption#UNKNOWN}
     * will cause an error.
     */
    public com.google.api.ads.dfp.axis.v201306.CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }


    /**
     * Sets the companionDeliveryOption value for this LineItemSummary.
     * 
     * @param companionDeliveryOption   * The delivery option for companions. This is only valid if the
     * environment type is
     *                 {@link EnvironmentType#VIDEO_PLAYER} or the roadblocking
     * type is
     *                 {@link RoadblockingType#CREATIVE_SET}. The default
     * value for video environments or
     *                 roadblocking creatives is {@link CompanionDeliveryOption#OPTIONAL}.
     * The default
     *                 value in other cases is {@link CompanionDeliveryOption#UNKNOWN}.
     * Providing something
     *                 other than {@link CompanionDeliveryOption#UNKNOWN}
     * will cause an error.
     */
    public void setCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201306.CompanionDeliveryOption companionDeliveryOption) {
        this.companionDeliveryOption = companionDeliveryOption;
    }


    /**
     * Gets the creativePersistenceType value for this LineItemSummary.
     * 
     * @return creativePersistenceType   * Specifies options to prevent ads from replacing or appearing
     * with this {@code LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201306.CreativePersistenceType getCreativePersistenceType() {
        return creativePersistenceType;
    }


    /**
     * Sets the creativePersistenceType value for this LineItemSummary.
     * 
     * @param creativePersistenceType   * Specifies options to prevent ads from replacing or appearing
     * with this {@code LineItem}.
     */
    public void setCreativePersistenceType(com.google.api.ads.dfp.axis.v201306.CreativePersistenceType creativePersistenceType) {
        this.creativePersistenceType = creativePersistenceType;
    }


    /**
     * Gets the allowOverbook value for this LineItemSummary.
     * 
     * @return allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When true, operations on this line
     * item will never trigger a {@link ForecastError}, which corresponds
     * to an
     *                 overbook warning in the UI. The default value is false.
     */
    public java.lang.Boolean getAllowOverbook() {
        return allowOverbook;
    }


    /**
     * Sets the allowOverbook value for this LineItemSummary.
     * 
     * @param allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When true, operations on this line
     * item will never trigger a {@link ForecastError}, which corresponds
     * to an
     *                 overbook warning in the UI. The default value is false.
     */
    public void setAllowOverbook(java.lang.Boolean allowOverbook) {
        this.allowOverbook = allowOverbook;
    }


    /**
     * Gets the skipInventoryCheck value for this LineItemSummary.
     * 
     * @return skipInventoryCheck   * The flag indicates whether the inventory check should be skipped
     * when performing an action on
     *                 this line item. The default value is false.
     */
    public java.lang.Boolean getSkipInventoryCheck() {
        return skipInventoryCheck;
    }


    /**
     * Sets the skipInventoryCheck value for this LineItemSummary.
     * 
     * @param skipInventoryCheck   * The flag indicates whether the inventory check should be skipped
     * when performing an action on
     *                 this line item. The default value is false.
     */
    public void setSkipInventoryCheck(java.lang.Boolean skipInventoryCheck) {
        this.skipInventoryCheck = skipInventoryCheck;
    }


    /**
     * Gets the reserveAtCreation value for this LineItemSummary.
     * 
     * @return reserveAtCreation   * The flag indicates whether inventory should be reserved when
     * creating a
     *                 line item of types {@link LineItemType#SPONSORSHIP}
     * and
     *                 {@link LineItemType#STANDARD} in an unapproved {@link
     * Order}. The default
     *                 value is false.
     */
    public java.lang.Boolean getReserveAtCreation() {
        return reserveAtCreation;
    }


    /**
     * Sets the reserveAtCreation value for this LineItemSummary.
     * 
     * @param reserveAtCreation   * The flag indicates whether inventory should be reserved when
     * creating a
     *                 line item of types {@link LineItemType#SPONSORSHIP}
     * and
     *                 {@link LineItemType#STANDARD} in an unapproved {@link
     * Order}. The default
     *                 value is false.
     */
    public void setReserveAtCreation(java.lang.Boolean reserveAtCreation) {
        this.reserveAtCreation = reserveAtCreation;
    }


    /**
     * Gets the stats value for this LineItemSummary.
     * 
     * @return stats   * Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet.
     */
    public com.google.api.ads.dfp.axis.v201306.Stats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this LineItemSummary.
     * 
     * @param stats   * Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet.
     */
    public void setStats(com.google.api.ads.dfp.axis.v201306.Stats stats) {
        this.stats = stats;
    }


    /**
     * Gets the deliveryIndicator value for this LineItemSummary.
     * 
     * @return deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public com.google.api.ads.dfp.axis.v201306.DeliveryIndicator getDeliveryIndicator() {
        return deliveryIndicator;
    }


    /**
     * Sets the deliveryIndicator value for this LineItemSummary.
     * 
     * @param deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public void setDeliveryIndicator(com.google.api.ads.dfp.axis.v201306.DeliveryIndicator deliveryIndicator) {
        this.deliveryIndicator = deliveryIndicator;
    }


    /**
     * Gets the deliveryData value for this LineItemSummary.
     * 
     * @return deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItem#deliveryIndicator} should be used
     * to track its
     *                 progress in this case.</li>
     */
    public com.google.api.ads.dfp.axis.v201306.DeliveryData getDeliveryData() {
        return deliveryData;
    }


    /**
     * Sets the deliveryData value for this LineItemSummary.
     * 
     * @param deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItem#deliveryIndicator} should be used
     * to track its
     *                 progress in this case.</li>
     */
    public void setDeliveryData(com.google.api.ads.dfp.axis.v201306.DeliveryData deliveryData) {
        this.deliveryData = deliveryData;
    }


    /**
     * Gets the budget value for this LineItemSummary.
     * 
     * @return budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. The currency
     * code is readonly.
     */
    public com.google.api.ads.dfp.axis.v201306.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this LineItemSummary.
     * 
     * @param budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. The currency
     * code is readonly.
     */
    public void setBudget(com.google.api.ads.dfp.axis.v201306.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the status value for this LineItemSummary.
     * 
     * @return status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201306.ComputedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItemSummary.
     * 
     * @param status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201306.ComputedStatus status) {
        this.status = status;
    }


    /**
     * Gets the reservationStatus value for this LineItemSummary.
     * 
     * @return reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201306.LineItemSummaryReservationStatus getReservationStatus() {
        return reservationStatus;
    }


    /**
     * Sets the reservationStatus value for this LineItemSummary.
     * 
     * @param reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public void setReservationStatus(com.google.api.ads.dfp.axis.v201306.LineItemSummaryReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }


    /**
     * Gets the isArchived value for this LineItemSummary.
     * 
     * @return isArchived   * The archival status of the {@code LineItem}. This attribute
     * is readonly.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this LineItemSummary.
     * 
     * @param isArchived   * The archival status of the {@code LineItem}. This attribute
     * is readonly.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the webPropertyCode value for this LineItemSummary.
     * 
     * @return webPropertyCode   * The web property code used for dynamic allocation line items.
     * This web
     *                 property is only required with line item types
     *                 {@link LineItemType#AD_EXCHANGE} and {@link LineItemType#ADSENSE}.
     */
    public java.lang.String getWebPropertyCode() {
        return webPropertyCode;
    }


    /**
     * Sets the webPropertyCode value for this LineItemSummary.
     * 
     * @param webPropertyCode   * The web property code used for dynamic allocation line items.
     * This web
     *                 property is only required with line item types
     *                 {@link LineItemType#AD_EXCHANGE} and {@link LineItemType#ADSENSE}.
     */
    public void setWebPropertyCode(java.lang.String webPropertyCode) {
        this.webPropertyCode = webPropertyCode;
    }


    /**
     * Gets the appliedLabels value for this LineItemSummary.
     * 
     * @return appliedLabels   * The set of labels applied directly to this line item.
     */
    public com.google.api.ads.dfp.axis.v201306.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this LineItemSummary.
     * 
     * @param appliedLabels   * The set of labels applied directly to this line item.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201306.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201306.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201306.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this LineItemSummary.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the line item
     * as well as
     *                 those inherited from the order that contains this
     * line item and the
     *                 advertiser that owns the order. If a label has been
     * negated, only the
     *                 negated label is returned. This field is readonly
     * and is assigned by
     *                 Google.
     */
    public com.google.api.ads.dfp.axis.v201306.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this LineItemSummary.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to the line item
     * as well as
     *                 those inherited from the order that contains this
     * line item and the
     *                 advertiser that owns the order. If a label has been
     * negated, only the
     *                 negated label is returned. This field is readonly
     * and is assigned by
     *                 Google.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201306.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201306.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201306.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the disableSameAdvertiserCompetitiveExclusion value for this LineItemSummary.
     * 
     * @return disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be
     *                 blocked from serving with line items from the same
     * advertiser. Setting this
     *                 to {@code true} will allow line items from the same
     * advertiser to serve
     *                 regardless of the other competitive exclusion labels
     * being applied.
     */
    public java.lang.Boolean getDisableSameAdvertiserCompetitiveExclusion() {
        return disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Sets the disableSameAdvertiserCompetitiveExclusion value for this LineItemSummary.
     * 
     * @param disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be
     *                 blocked from serving with line items from the same
     * advertiser. Setting this
     *                 to {@code true} will allow line items from the same
     * advertiser to serve
     *                 regardless of the other competitive exclusion labels
     * being applied.
     */
    public void setDisableSameAdvertiserCompetitiveExclusion(java.lang.Boolean disableSameAdvertiserCompetitiveExclusion) {
        this.disableSameAdvertiserCompetitiveExclusion = disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Gets the lastModifiedByApp value for this LineItemSummary.
     * 
     * @return lastModifiedByApp   * The application that last modified this line item. This attribute
     * is read only
     *                 and is assigned by Google.
     */
    public java.lang.String getLastModifiedByApp() {
        return lastModifiedByApp;
    }


    /**
     * Sets the lastModifiedByApp value for this LineItemSummary.
     * 
     * @param lastModifiedByApp   * The application that last modified this line item. This attribute
     * is read only
     *                 and is assigned by Google.
     */
    public void setLastModifiedByApp(java.lang.String lastModifiedByApp) {
        this.lastModifiedByApp = lastModifiedByApp;
    }


    /**
     * Gets the notes value for this LineItemSummary.
     * 
     * @return notes   * Provides any additional notes that may annotate the {@code
     * LineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this LineItemSummary.
     * 
     * @param notes   * Provides any additional notes that may annotate the {@code
     * LineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the lastModifiedDateTime value for this LineItemSummary.
     * 
     * @return lastModifiedDateTime   * The date and time this line item was last modified.
     */
    public com.google.api.ads.dfp.axis.v201306.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this LineItemSummary.
     * 
     * @param lastModifiedDateTime   * The date and time this line item was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201306.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the creationDateTime value for this LineItemSummary.
     * 
     * @return creationDateTime   * This attribute may be {@code null} for line items created before
     * this feature was introduced.
     */
    public com.google.api.ads.dfp.axis.v201306.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this LineItemSummary.
     * 
     * @param creationDateTime   * This attribute may be {@code null} for line items created before
     * this feature was introduced.
     */
    public void setCreationDateTime(com.google.api.ads.dfp.axis.v201306.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the customFieldValues value for this LineItemSummary.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this line item.
     */
    public com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this LineItemSummary.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this line item.
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


    /**
     * Gets the isMissingCreatives value for this LineItemSummary.
     * 
     * @return isMissingCreatives   * Indicates if a {@code LineItem} is missing any {@link Creative
     * creatives} for the
     *                 {@code creativePlaceholders} specified.
     *                 
     *                 {@link Creative Creatives} can be considered missing
     * for several reasons including:
     *                 <ul><li>Not enough {@link Creative creatives} of a
     * certain size have been uploaded, as
     *                 determined by {@link CreativePlaceholder#expectedCreativeCount}.
     * For example a
     *                 {@code LineItem} specifies 750x350, 400x200 but only
     * a 750x350 was uploaded.  Or
     *                 {@code LineItem} specifies 750x350 with an expected
     * count of 2, but only one was uploaded.
     *                 </li>
     *                 <li>The {@link Creative#appliedLabels} of an associated
     * {@code Creative} do not match the
     *                 {@link CreativePlaceholder#effectiveAppliedLabels}
     * of the {@code LineItem}. For example
     *                 {@code LineItem} specifies 750x350 with a Foo {@code
     * AppliedLabel} but a 750x350 creative
     *                 without a {@code AppliedLabel} was uploaded.</li></ul>
     */
    public java.lang.Boolean getIsMissingCreatives() {
        return isMissingCreatives;
    }


    /**
     * Sets the isMissingCreatives value for this LineItemSummary.
     * 
     * @param isMissingCreatives   * Indicates if a {@code LineItem} is missing any {@link Creative
     * creatives} for the
     *                 {@code creativePlaceholders} specified.
     *                 
     *                 {@link Creative Creatives} can be considered missing
     * for several reasons including:
     *                 <ul><li>Not enough {@link Creative creatives} of a
     * certain size have been uploaded, as
     *                 determined by {@link CreativePlaceholder#expectedCreativeCount}.
     * For example a
     *                 {@code LineItem} specifies 750x350, 400x200 but only
     * a 750x350 was uploaded.  Or
     *                 {@code LineItem} specifies 750x350 with an expected
     * count of 2, but only one was uploaded.
     *                 </li>
     *                 <li>The {@link Creative#appliedLabels} of an associated
     * {@code Creative} do not match the
     *                 {@link CreativePlaceholder#effectiveAppliedLabels}
     * of the {@code LineItem}. For example
     *                 {@code LineItem} specifies 750x350 with a Foo {@code
     * AppliedLabel} but a 750x350 creative
     *                 without a {@code AppliedLabel} was uploaded.</li></ul>
     */
    public void setIsMissingCreatives(java.lang.Boolean isMissingCreatives) {
        this.isMissingCreatives = isMissingCreatives;
    }


    /**
     * Gets the lineItemSummaryType value for this LineItemSummary.
     * 
     * @return lineItemSummaryType   * Indicates that this instance is a subtype of LineItemSummary.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getLineItemSummaryType() {
        return lineItemSummaryType;
    }


    /**
     * Sets the lineItemSummaryType value for this LineItemSummary.
     * 
     * @param lineItemSummaryType   * Indicates that this instance is a subtype of LineItemSummary.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setLineItemSummaryType(java.lang.String lineItemSummaryType) {
        this.lineItemSummaryType = lineItemSummaryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemSummary)) return false;
        LineItemSummary other = (LineItemSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.orderName==null && other.getOrderName()==null) || 
             (this.orderName!=null &&
              this.orderName.equals(other.getOrderName()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startDateTimeType==null && other.getStartDateTimeType()==null) || 
             (this.startDateTimeType!=null &&
              this.startDateTimeType.equals(other.getStartDateTimeType()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.autoExtensionDays==null && other.getAutoExtensionDays()==null) || 
             (this.autoExtensionDays!=null &&
              this.autoExtensionDays.equals(other.getAutoExtensionDays()))) &&
            ((this.unlimitedEndDateTime==null && other.getUnlimitedEndDateTime()==null) || 
             (this.unlimitedEndDateTime!=null &&
              this.unlimitedEndDateTime.equals(other.getUnlimitedEndDateTime()))) &&
            ((this.creativeRotationType==null && other.getCreativeRotationType()==null) || 
             (this.creativeRotationType!=null &&
              this.creativeRotationType.equals(other.getCreativeRotationType()))) &&
            ((this.deliveryRateType==null && other.getDeliveryRateType()==null) || 
             (this.deliveryRateType!=null &&
              this.deliveryRateType.equals(other.getDeliveryRateType()))) &&
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
            ((this.frequencyCaps==null && other.getFrequencyCaps()==null) || 
             (this.frequencyCaps!=null &&
              java.util.Arrays.equals(this.frequencyCaps, other.getFrequencyCaps()))) &&
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.unitsBought==null && other.getUnitsBought()==null) || 
             (this.unitsBought!=null &&
              this.unitsBought.equals(other.getUnitsBought()))) &&
            ((this.costPerUnit==null && other.getCostPerUnit()==null) || 
             (this.costPerUnit!=null &&
              this.costPerUnit.equals(other.getCostPerUnit()))) &&
            ((this.valueCostPerUnit==null && other.getValueCostPerUnit()==null) || 
             (this.valueCostPerUnit!=null &&
              this.valueCostPerUnit.equals(other.getValueCostPerUnit()))) &&
            ((this.costType==null && other.getCostType()==null) || 
             (this.costType!=null &&
              this.costType.equals(other.getCostType()))) &&
            ((this.discountType==null && other.getDiscountType()==null) || 
             (this.discountType!=null &&
              this.discountType.equals(other.getDiscountType()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.contractedUnitsBought==null && other.getContractedUnitsBought()==null) || 
             (this.contractedUnitsBought!=null &&
              this.contractedUnitsBought.equals(other.getContractedUnitsBought()))) &&
            ((this.creativePlaceholders==null && other.getCreativePlaceholders()==null) || 
             (this.creativePlaceholders!=null &&
              java.util.Arrays.equals(this.creativePlaceholders, other.getCreativePlaceholders()))) &&
            ((this.targetPlatform==null && other.getTargetPlatform()==null) || 
             (this.targetPlatform!=null &&
              this.targetPlatform.equals(other.getTargetPlatform()))) &&
            ((this.environmentType==null && other.getEnvironmentType()==null) || 
             (this.environmentType!=null &&
              this.environmentType.equals(other.getEnvironmentType()))) &&
            ((this.companionDeliveryOption==null && other.getCompanionDeliveryOption()==null) || 
             (this.companionDeliveryOption!=null &&
              this.companionDeliveryOption.equals(other.getCompanionDeliveryOption()))) &&
            ((this.creativePersistenceType==null && other.getCreativePersistenceType()==null) || 
             (this.creativePersistenceType!=null &&
              this.creativePersistenceType.equals(other.getCreativePersistenceType()))) &&
            ((this.allowOverbook==null && other.getAllowOverbook()==null) || 
             (this.allowOverbook!=null &&
              this.allowOverbook.equals(other.getAllowOverbook()))) &&
            ((this.skipInventoryCheck==null && other.getSkipInventoryCheck()==null) || 
             (this.skipInventoryCheck!=null &&
              this.skipInventoryCheck.equals(other.getSkipInventoryCheck()))) &&
            ((this.reserveAtCreation==null && other.getReserveAtCreation()==null) || 
             (this.reserveAtCreation!=null &&
              this.reserveAtCreation.equals(other.getReserveAtCreation()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.deliveryIndicator==null && other.getDeliveryIndicator()==null) || 
             (this.deliveryIndicator!=null &&
              this.deliveryIndicator.equals(other.getDeliveryIndicator()))) &&
            ((this.deliveryData==null && other.getDeliveryData()==null) || 
             (this.deliveryData!=null &&
              this.deliveryData.equals(other.getDeliveryData()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.reservationStatus==null && other.getReservationStatus()==null) || 
             (this.reservationStatus!=null &&
              this.reservationStatus.equals(other.getReservationStatus()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.webPropertyCode==null && other.getWebPropertyCode()==null) || 
             (this.webPropertyCode!=null &&
              this.webPropertyCode.equals(other.getWebPropertyCode()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.effectiveAppliedLabels==null && other.getEffectiveAppliedLabels()==null) || 
             (this.effectiveAppliedLabels!=null &&
              java.util.Arrays.equals(this.effectiveAppliedLabels, other.getEffectiveAppliedLabels()))) &&
            ((this.disableSameAdvertiserCompetitiveExclusion==null && other.getDisableSameAdvertiserCompetitiveExclusion()==null) || 
             (this.disableSameAdvertiserCompetitiveExclusion!=null &&
              this.disableSameAdvertiserCompetitiveExclusion.equals(other.getDisableSameAdvertiserCompetitiveExclusion()))) &&
            ((this.lastModifiedByApp==null && other.getLastModifiedByApp()==null) || 
             (this.lastModifiedByApp!=null &&
              this.lastModifiedByApp.equals(other.getLastModifiedByApp()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.isMissingCreatives==null && other.getIsMissingCreatives()==null) || 
             (this.isMissingCreatives!=null &&
              this.isMissingCreatives.equals(other.getIsMissingCreatives()))) &&
            ((this.lineItemSummaryType==null && other.getLineItemSummaryType()==null) || 
             (this.lineItemSummaryType!=null &&
              this.lineItemSummaryType.equals(other.getLineItemSummaryType())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getOrderName() != null) {
            _hashCode += getOrderName().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartDateTimeType() != null) {
            _hashCode += getStartDateTimeType().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getAutoExtensionDays() != null) {
            _hashCode += getAutoExtensionDays().hashCode();
        }
        if (getUnlimitedEndDateTime() != null) {
            _hashCode += getUnlimitedEndDateTime().hashCode();
        }
        if (getCreativeRotationType() != null) {
            _hashCode += getCreativeRotationType().hashCode();
        }
        if (getDeliveryRateType() != null) {
            _hashCode += getDeliveryRateType().hashCode();
        }
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
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
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getUnitsBought() != null) {
            _hashCode += getUnitsBought().hashCode();
        }
        if (getCostPerUnit() != null) {
            _hashCode += getCostPerUnit().hashCode();
        }
        if (getValueCostPerUnit() != null) {
            _hashCode += getValueCostPerUnit().hashCode();
        }
        if (getCostType() != null) {
            _hashCode += getCostType().hashCode();
        }
        if (getDiscountType() != null) {
            _hashCode += getDiscountType().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getContractedUnitsBought() != null) {
            _hashCode += getContractedUnitsBought().hashCode();
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
        if (getTargetPlatform() != null) {
            _hashCode += getTargetPlatform().hashCode();
        }
        if (getEnvironmentType() != null) {
            _hashCode += getEnvironmentType().hashCode();
        }
        if (getCompanionDeliveryOption() != null) {
            _hashCode += getCompanionDeliveryOption().hashCode();
        }
        if (getCreativePersistenceType() != null) {
            _hashCode += getCreativePersistenceType().hashCode();
        }
        if (getAllowOverbook() != null) {
            _hashCode += getAllowOverbook().hashCode();
        }
        if (getSkipInventoryCheck() != null) {
            _hashCode += getSkipInventoryCheck().hashCode();
        }
        if (getReserveAtCreation() != null) {
            _hashCode += getReserveAtCreation().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getDeliveryIndicator() != null) {
            _hashCode += getDeliveryIndicator().hashCode();
        }
        if (getDeliveryData() != null) {
            _hashCode += getDeliveryData().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getReservationStatus() != null) {
            _hashCode += getReservationStatus().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getWebPropertyCode() != null) {
            _hashCode += getWebPropertyCode().hashCode();
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
        if (getDisableSameAdvertiserCompetitiveExclusion() != null) {
            _hashCode += getDisableSameAdvertiserCompetitiveExclusion().hashCode();
        }
        if (getLastModifiedByApp() != null) {
            _hashCode += getLastModifiedByApp().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
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
        if (getIsMissingCreatives() != null) {
            _hashCode += getIsMissingCreatives().hashCode();
        }
        if (getLineItemSummaryType() != null) {
            _hashCode += getLineItemSummaryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "orderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "startDateTimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "StartDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoExtensionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "autoExtensionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "unlimitedEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryRateType"));
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
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FrequencyCap"));
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
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemSummary.Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "unitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueCostPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "valueCostPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "costType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CostType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "discountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractedUnitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "contractedUnitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("targetPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "targetPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TargetPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePersistenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creativePersistenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativePersistenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverbook");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "allowOverbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipInventoryCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "skipInventoryCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveAtCreation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "reserveAtCreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Stats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "deliveryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "deliveryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "reservationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemSummary.ReservationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webPropertyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "webPropertyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableSameAdvertiserCompetitiveExclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "disableSameAdvertiserCompetitiveExclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedByApp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "lastModifiedByApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMissingCreatives");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "isMissingCreatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemSummaryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemSummary.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
