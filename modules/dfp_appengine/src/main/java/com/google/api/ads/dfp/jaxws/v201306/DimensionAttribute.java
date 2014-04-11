
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DimensionAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DimensionAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LINE_ITEM_LABELS"/>
 *     &lt;enumeration value="LINE_ITEM_LABEL_IDS"/>
 *     &lt;enumeration value="LINE_ITEM_OPTIMIZABLE"/>
 *     &lt;enumeration value="LINE_ITEM_DELIVERY_PACING"/>
 *     &lt;enumeration value="LINE_ITEM_FREQUENCY_CAP"/>
 *     &lt;enumeration value="ADVERTISER_EXTERNAL_ID"/>
 *     &lt;enumeration value="ORDER_START_DATE_TIME"/>
 *     &lt;enumeration value="ORDER_END_DATE_TIME"/>
 *     &lt;enumeration value="ORDER_EXTERNAL_ID"/>
 *     &lt;enumeration value="ORDER_PO_NUMBER"/>
 *     &lt;enumeration value="ORDER_AGENCY"/>
 *     &lt;enumeration value="ORDER_AGENCY_ID"/>
 *     &lt;enumeration value="ORDER_LABELS"/>
 *     &lt;enumeration value="ORDER_LABEL_IDS"/>
 *     &lt;enumeration value="ORDER_TRAFFICKER"/>
 *     &lt;enumeration value="ORDER_SECONDARY_TRAFFICKERS"/>
 *     &lt;enumeration value="ORDER_SALESPERSON"/>
 *     &lt;enumeration value="ORDER_SECONDARY_SALESPEOPLE"/>
 *     &lt;enumeration value="ORDER_LIFETIME_IMPRESSIONS"/>
 *     &lt;enumeration value="ORDER_LIFETIME_CLICKS"/>
 *     &lt;enumeration value="ORDER_LIFETIME_MERGED_IMPRESSIONS"/>
 *     &lt;enumeration value="ORDER_LIFETIME_MERGED_CLICKS"/>
 *     &lt;enumeration value="ORDER_BOOKED_CPM"/>
 *     &lt;enumeration value="ORDER_BOOKED_CPC"/>
 *     &lt;enumeration value="LINE_ITEM_START_DATE_TIME"/>
 *     &lt;enumeration value="LINE_ITEM_END_DATE_TIME"/>
 *     &lt;enumeration value="LINE_ITEM_EXTERNAL_ID"/>
 *     &lt;enumeration value="LINE_ITEM_COST_TYPE"/>
 *     &lt;enumeration value="LINE_ITEM_COST_PER_UNIT"/>
 *     &lt;enumeration value="LINE_ITEM_CURRENCY_CODE"/>
 *     &lt;enumeration value="LINE_ITEM_GOAL_QUANTITY"/>
 *     &lt;enumeration value="LINE_ITEM_SPONSORSHIP_GOAL_PERCENTAGE"/>
 *     &lt;enumeration value="LINE_ITEM_LIFETIME_IMPRESSIONS"/>
 *     &lt;enumeration value="LINE_ITEM_LIFETIME_CLICKS"/>
 *     &lt;enumeration value="LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS"/>
 *     &lt;enumeration value="LINE_ITEM_LIFETIME_MERGED_CLICKS"/>
 *     &lt;enumeration value="LINE_ITEM_PRIORITY"/>
 *     &lt;enumeration value="CREATIVE_OR_CREATIVE_SET"/>
 *     &lt;enumeration value="MASTER_COMPANION_TYPE"/>
 *     &lt;enumeration value="LINE_ITEM_CONTRACTED_QUANTITY"/>
 *     &lt;enumeration value="LINE_ITEM_DISCOUNT"/>
 *     &lt;enumeration value="LINE_ITEM_NON_CPD_BOOKED_REVENUE"/>
 *     &lt;enumeration value="ADVERTISER_LABELS"/>
 *     &lt;enumeration value="ADVERTISER_LABEL_IDS"/>
 *     &lt;enumeration value="CREATIVE_CLICK_THROUGH_URL"/>
 *     &lt;enumeration value="LINE_ITEM_CREATIVE_START_DATE"/>
 *     &lt;enumeration value="LINE_ITEM_CREATIVE_END_DATE"/>
 *     &lt;enumeration value="PROPOSAL_START_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_END_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_CREATION_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_PROBABILITY_TO_CLOSE"/>
 *     &lt;enumeration value="PROPOSAL_STATUS"/>
 *     &lt;enumeration value="PROPOSAL_CURRENCY"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_COMMISSION_RATE"/>
 *     &lt;enumeration value="PROPOSAL_VAT_RATE"/>
 *     &lt;enumeration value="PROPOSAL_BILLING_SOURCE"/>
 *     &lt;enumeration value="PROPOSAL_BILLING_CAP"/>
 *     &lt;enumeration value="PROPOSAL_BILLING_SCHEDULE"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_START_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_END_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_RATE_TYPE"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_COST_PER_UNIT"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_PRODUCT_TYPE"/>
 *     &lt;enumeration value="AD_UNIT_CODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DimensionAttribute")
@XmlEnum
public enum DimensionAttribute {


    /**
     * 
     *                 Represents {@link LineItem#effectiveAppliedLabels} as a comma separated list of
     *                 {@link Label#name} for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_LABELS,

    /**
     * 
     *                 Represents {@link LineItem#effectiveAppliedLabels} as a comma separated list of
     *                 {@link Label#id} for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_LABEL_IDS,

    /**
     * 
     *                 Generated as {@code true} for {@link Dimension#LINE_ITEM_NAME} which is eligible
     *                 for optimization, {@code false} otherwise.
     *                 Can be used for filtering.
     *               
     * 
     */
    LINE_ITEM_OPTIMIZABLE,

    /**
     * 
     *                 Represents {@link LineItem#deliveryRateType} for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_DELIVERY_PACING,

    /**
     * 
     *                 Represents {@link LineItem#frequencyCaps} as a comma separated list of
     *                 "{@link FrequencyCap#maxImpressions} impressions per/every {@link FrequencyCap#numTimeUnits}
     *                 {@link FrequencyCap#timeUnit}" (e.g. "10 impressions every day,500 impressions per lifetime")
     *                 for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_FREQUENCY_CAP,

    /**
     * 
     *                 Represents {@link Company#externalId} for {@link Dimension#ADVERTISER_NAME}.
     *               
     * 
     */
    ADVERTISER_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link Order#startDateTime} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ORDER_START_DATE_TIME,

    /**
     * 
     *                 Represents {@link Order#endDateTime} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ORDER_END_DATE_TIME,

    /**
     * 
     *                 Represents {@link Order#externalOrderId} for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link Order#poNumber} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ORDER_PO_NUMBER,

    /**
     * 
     *                 Represents the name of {@link Order#agencyId} for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_AGENCY,

    /**
     * 
     *                 Represents {@link Order#agencyId} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ORDER_AGENCY_ID,

    /**
     * 
     *                 Represents {@link Order#effectiveAppliedLabels} as a comma separated list of
     *                 {@link Label#name} for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_LABELS,

    /**
     * 
     *                 Represents {@link Order#effectiveAppliedLabels} as a comma separated list of
     *                 {@link Label#id} for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_LABEL_IDS,

    /**
     * 
     *                 The name and email address in the form of name(email) of the trafficker for
     *                 {@link Dimension#ORDER_NAME}
     *               
     * 
     */
    ORDER_TRAFFICKER,

    /**
     * 
     *                 The names and email addresses as a comma separated list of name(email) of the
     *                 {@link Order#secondaryTraffickerIds} for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_SECONDARY_TRAFFICKERS,

    /**
     * 
     *                 The name and email address in the form of name(email) of the
     *                 {@link Order#salespersonId} for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_SALESPERSON,

    /**
     * 
     *                 The names and email addresses as a comma separated list of name(email) of the
     *                 {@link Order#secondarySalespersonIds} for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_SECONDARY_SALESPEOPLE,

    /**
     * 
     *                 The total number of impressions delivered over the lifetime of an
     *                 {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_LIFETIME_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered over the lifetime of an
     *                 {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_LIFETIME_CLICKS,

    /**
     * 
     *                 The lifetime impressions for {@link Dimension#ORDER_NAME} delivered by both DART
     *                 and DoubleClick for Publishers ad servers. This is only available for
     *                 networks that have been upgraded from the old to the new system.
     *               
     * 
     */
    ORDER_LIFETIME_MERGED_IMPRESSIONS,

    /**
     * 
     *                 The lifetime clicks for {@link Dimension#ORDER_NAME} delivered by both DART and
     *                 DoubleClick for Publishers ad servers. This is only available for networks
     *                 that have been upgraded from the old to the new system.
     *               
     * 
     */
    ORDER_LIFETIME_MERGED_CLICKS,

    /**
     * 
     *                 The cost of booking all the CPM ads for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_BOOKED_CPM,

    /**
     * 
     *                 The cost of booking all the CPC ads for {@link Dimension#ORDER_NAME}.
     *               
     * 
     */
    ORDER_BOOKED_CPC,

    /**
     * 
     *                 Represents {@link LineItem#startDateTime} for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    LINE_ITEM_START_DATE_TIME,

    /**
     * 
     *                 Represents {@link LineItem#endDateTime} for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    LINE_ITEM_END_DATE_TIME,

    /**
     * 
     *                 Represents {@link LineItem#externalId} for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    LINE_ITEM_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link LineItem#costType} for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    LINE_ITEM_COST_TYPE,

    /**
     * 
     *                 Represents {@link LineItem#costPerUnit} for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_COST_PER_UNIT,

    /**
     * 
     *                 Represents the 3 letter currency code for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_CURRENCY_CODE,

    /**
     * 
     *                 The total number of impressions, clicks or days that is reserved
     *                 for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_GOAL_QUANTITY,

    /**
     * 
     *                 The ratio between the goal quantity for {@link Dimension#LINE_ITEM_NAME} of
     *                 {@link LineItemType#SPONSORSHIP} and the {@link #LINE_ITEM_GOAL_QUANTITY}.
     *                 Represented as a number between 0..100.
     *               
     * 
     */
    LINE_ITEM_SPONSORSHIP_GOAL_PERCENTAGE,

    /**
     * 
     *                 The total number of impressions delivered over the lifetime of a
     *                 {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_LIFETIME_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered over the lifetime of a
     *                 {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_LIFETIME_CLICKS,

    /**
     * 
     *                 The lifetime impressions for {@link Dimension#LINE_ITEM_NAME} delivered by
     *                 both DART and DoubleClick for Publishers ad servers. This is only available
     *                 for networks that have been upgraded from the old to the new system.
     *               
     * 
     */
    LINE_ITEM_LIFETIME_MERGED_IMPRESSIONS,

    /**
     * 
     *                 The lifetime clicks for {@link Dimension#LINE_ITEM_NAME} delivered by both
     *                 DART and DoubleClick for Publishers ad servers. This is only available for
     *                 networks that have been upgraded from the old to the new system.
     *               
     * 
     */
    LINE_ITEM_LIFETIME_MERGED_CLICKS,

    /**
     * 
     *                 Represents {@link LineItem#priority} for {@link Dimension#LINE_ITEM_NAME} as
     *                 a value between 1 and 16.
     *                 Can be used for filtering.
     *               
     * 
     */
    LINE_ITEM_PRIORITY,

    /**
     * 
     *                 Indicates if a creative is a regular creative or creative set.
     *                 Values will be 'Creative' or 'Creative set'
     *               
     * 
     */
    CREATIVE_OR_CREATIVE_SET,

    /**
     * 
     *                 The type of creative in a creative set - master or companion.
     *               
     * 
     */
    MASTER_COMPANION_TYPE,

    /**
     * 
     *                 Represents the {@link LineItem#contractedUnitsBought} quantity
     *                 for {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_CONTRACTED_QUANTITY,

    /**
     * 
     *                 Represents the {@link LineItem#discount} for {@link Dimension#LINE_ITEM_NAME}.
     *                 The number is either a percentage or an absolute value depending on
     *                 {@link LineItem#discountType}.
     *               
     * 
     */
    LINE_ITEM_DISCOUNT,

    /**
     * 
     *                 The cost of booking for a non-CPD {@link Dimension#LINE_ITEM_NAME}.
     *               
     * 
     */
    LINE_ITEM_NON_CPD_BOOKED_REVENUE,

    /**
     * 
     *                 Represents {@link Company#appliedLabels} as a comma separated list of
     *                 {@link Label#name} for {@link Dimension#ADVERTISER_NAME}.
     *               
     * 
     */
    ADVERTISER_LABELS,

    /**
     * 
     *                 Represents {@link Company#appliedLabels} as a comma separated list of
     *                 {@link Label#id} for {@link Dimension#ADVERTISER_NAME}.
     *               
     * 
     */
    ADVERTISER_LABEL_IDS,

    /**
     * 
     *                 Represents the click-through URL for {@link Dimension#CREATIVE_NAME}.
     *               
     * 
     */
    CREATIVE_CLICK_THROUGH_URL,

    /**
     * 
     *                 Represents a {@link LineItemCreativeAssociation#startDateTime} for a
     *                 {@link Dimension#LINE_ITEM_NAME} and a {@link Dimension#CREATIVE_NAME}.
     *                 Includes the date without the time.
     *               
     * 
     */
    LINE_ITEM_CREATIVE_START_DATE,

    /**
     * 
     *                 Represents a {@link LineItemCreativeAssociation#endDateTime} for a
     *                 {@link Dimension#LINE_ITEM_NAME} and a {@link Dimension#CREATIVE_NAME}.
     *                 Includes the date without the time.
     *               
     * 
     */
    LINE_ITEM_CREATIVE_END_DATE,

    /**
     * 
     *                 Represents {@link Proposal#startDateTime} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_START_DATE_TIME,

    /**
     * 
     *                 Represents {@link Proposal#endDateTime} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_END_DATE_TIME,

    /**
     * 
     *                 Represents {@link Proposal#creationDateTime} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_CREATION_DATE_TIME,

    /**
     * 
     *                 Represents {@link Proposal#probabilityToClose} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_PROBABILITY_TO_CLOSE,

    /**
     * 
     *                 Represents {@link Proposal#status} for {@link Dimension#PROPOSAL_NAME}, including those
     *                 post-sold status, e.g. DRAFT(SOLD). Can be used for filtering.
     *               
     * 
     */
    PROPOSAL_STATUS,

    /**
     * 
     *                 Represents {@link Proposal#currency} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_CURRENCY,

    /**
     * 
     *                 Represents {@link Proposal#agencyCommission} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_AGENCY_COMMISSION_RATE,

    /**
     * 
     *                 Represents {@link Proposal#valueAddedTax} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_VAT_RATE,

    /**
     * 
     *                 Represents {@link Proposal#billingSource} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_BILLING_SOURCE,

    /**
     * 
     *                 Represents {@link Proposal#billingCap} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_BILLING_CAP,

    /**
     * 
     *                 Represents {@link Proposal#billingSchedule} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_BILLING_SCHEDULE,

    /**
     * 
     *                 Represents {@link ProposalLineItem#startDateTime} for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_START_DATE_TIME,

    /**
     * 
     *                 Represents {@link ProposalLineItem#endDateTime} for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_END_DATE_TIME,

    /**
     * 
     *                 Represents {@link ProposalLineItem#rateType} for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_RATE_TYPE,

    /**
     * 
     *                 Represents {@link ProposalLineItem#costPerUnit} for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_COST_PER_UNIT,

    /**
     * 
     *                 Represents {@link ProposalLineItem#prouctType} for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *                 <p>
     *                 Replaced with {@code PROPOSAL_LINE_ITEM_TYPE_AND_PRIORITY} beginning in v201308.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_PRODUCT_TYPE,

    /**
     * 
     *                 Represents {@link AdUnit#adUnitCode} for {@link Dimension#AD_UNIT_NAME}.
     *               
     * 
     */
    AD_UNIT_CODE;

    public String value() {
        return name();
    }

    public static DimensionAttribute fromValue(String v) {
        return valueOf(v);
    }

}
