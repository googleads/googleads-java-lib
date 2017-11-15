// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

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
 *     &lt;enumeration value="LINE_ITEM_DELIVERY_INDICATOR"/>
 *     &lt;enumeration value="LINE_ITEM_DELIVERY_PACING"/>
 *     &lt;enumeration value="LINE_ITEM_FREQUENCY_CAP"/>
 *     &lt;enumeration value="LINE_ITEM_RECONCILIATION_STATUS"/>
 *     &lt;enumeration value="LINE_ITEM_LAST_RECONCILIATION_DATE_TIME"/>
 *     &lt;enumeration value="ADVERTISER_EXTERNAL_ID"/>
 *     &lt;enumeration value="ADVERTISER_TYPE"/>
 *     &lt;enumeration value="ADVERTISER_CREDIT_STATUS"/>
 *     &lt;enumeration value="ADVERTISER_PRIMARY_CONTACT"/>
 *     &lt;enumeration value="ORDER_START_DATE_TIME"/>
 *     &lt;enumeration value="ORDER_END_DATE_TIME"/>
 *     &lt;enumeration value="ORDER_EXTERNAL_ID"/>
 *     &lt;enumeration value="ORDER_PO_NUMBER"/>
 *     &lt;enumeration value="ORDER_IS_PROGRAMMATIC"/>
 *     &lt;enumeration value="ORDER_AGENCY"/>
 *     &lt;enumeration value="ORDER_AGENCY_ID"/>
 *     &lt;enumeration value="ORDER_LABELS"/>
 *     &lt;enumeration value="ORDER_LABEL_IDS"/>
 *     &lt;enumeration value="ORDER_TRAFFICKER"/>
 *     &lt;enumeration value="ORDER_TRAFFICKER_ID"/>
 *     &lt;enumeration value="ORDER_SECONDARY_TRAFFICKERS"/>
 *     &lt;enumeration value="ORDER_SALESPERSON"/>
 *     &lt;enumeration value="ORDER_SECONDARY_SALESPEOPLE"/>
 *     &lt;enumeration value="ORDER_LIFETIME_IMPRESSIONS"/>
 *     &lt;enumeration value="ORDER_LIFETIME_CLICKS"/>
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
 *     &lt;enumeration value="LINE_ITEM_PRIORITY"/>
 *     &lt;enumeration value="CREATIVE_OR_CREATIVE_SET"/>
 *     &lt;enumeration value="MASTER_COMPANION_TYPE"/>
 *     &lt;enumeration value="LINE_ITEM_CONTRACTED_QUANTITY"/>
 *     &lt;enumeration value="LINE_ITEM_DISCOUNT"/>
 *     &lt;enumeration value="LINE_ITEM_NON_CPD_BOOKED_REVENUE"/>
 *     &lt;enumeration value="ADVERTISER_LABELS"/>
 *     &lt;enumeration value="ADVERTISER_LABEL_IDS"/>
 *     &lt;enumeration value="CREATIVE_CLICK_THROUGH_URL"/>
 *     &lt;enumeration value="CREATIVE_SSL_SCAN_RESULT"/>
 *     &lt;enumeration value="CREATIVE_SSL_COMPLIANCE_OVERRIDE"/>
 *     &lt;enumeration value="LINE_ITEM_CREATIVE_START_DATE"/>
 *     &lt;enumeration value="LINE_ITEM_CREATIVE_END_DATE"/>
 *     &lt;enumeration value="PROPOSAL_START_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_END_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_CREATION_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_SOLD_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_IS_SOLD"/>
 *     &lt;enumeration value="PROPOSAL_PROBABILITY_OF_CLOSE"/>
 *     &lt;enumeration value="PROPOSAL_STATUS"/>
 *     &lt;enumeration value="PROPOSAL_ARCHIVAL_STATUS"/>
 *     &lt;enumeration value="PROPOSAL_CURRENCY"/>
 *     &lt;enumeration value="PROPOSAL_EXCHANGE_RATE"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_COMMISSION_RATE"/>
 *     &lt;enumeration value="PROPOSAL_VAT_RATE"/>
 *     &lt;enumeration value="PROPOSAL_DISCOUNT"/>
 *     &lt;enumeration value="PROPOSAL_ADVERTISER_DISCOUNT"/>
 *     &lt;enumeration value="PROPOSAL_ADVERTISER"/>
 *     &lt;enumeration value="PROPOSAL_ADVERTISER_ID"/>
 *     &lt;enumeration value="PROPOSAL_AGENCIES"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_IDS"/>
 *     &lt;enumeration value="PROPOSAL_PO_NUMBER"/>
 *     &lt;enumeration value="PROPOSAL_PRIMARY_SALESPERSON"/>
 *     &lt;enumeration value="PROPOSAL_SECONDARY_SALESPEOPLE"/>
 *     &lt;enumeration value="PROPOSAL_CREATOR"/>
 *     &lt;enumeration value="PROPOSAL_SALES_PLANNERS"/>
 *     &lt;enumeration value="PROPOSAL_PRICING_MODEL"/>
 *     &lt;enumeration value="PROPOSAL_BILLING_SOURCE"/>
 *     &lt;enumeration value="PROPOSAL_BILLING_CAP"/>
 *     &lt;enumeration value="PROPOSAL_BILLING_SCHEDULE"/>
 *     &lt;enumeration value="PROPOSAL_APPLIED_TEAM_NAMES"/>
 *     &lt;enumeration value="PROPOSAL_APPROVAL_STAGE"/>
 *     &lt;enumeration value="PROPOSAL_INVENTORY_RELEASE_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_LOCAL_BUDGET"/>
 *     &lt;enumeration value="PROPOSAL_LOCAL_REMAINING_BUDGET"/>
 *     &lt;enumeration value="PROPOSAL_FLAT_FEE"/>
 *     &lt;enumeration value="PROPOSAL_IS_PROGRAMMATIC"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_START_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_END_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_RATE_TYPE"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_RESERVATION_STATUS"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_COST_PER_UNIT"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_COST_PER_UNIT_GROSS"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT_GROSS"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_TYPE_AND_PRIORITY"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_SIZE"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_ARCHIVAL_STATUS"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_PRODUCT_ADJUSTMENT"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_BUFFER"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_LISTING_RATE_NET"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_BILLING_SOURCE"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_BILLING_CAP"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_BILLING_SCHEDULE"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_GOAL_PERCENTAGE"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_COST_ADJUSTMENT"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_COMMENTS"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_RECONCILIATION_STATUS"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_LAST_RECONCILIATION_DATE_TIME"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_FLAT_FEE"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_ITEM_ARCHIVAL_STATUS"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_RATE_TYPE"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_STATUS"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_TYPE_AND_PRIORITY"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_PRODUCT_TYPE"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_DESCRIPTION"/>
 *     &lt;enumeration value="PRODUCT_PRODUCT_TEMPLATE_NAME"/>
 *     &lt;enumeration value="PRODUCT_RATE_TYPE"/>
 *     &lt;enumeration value="PRODUCT_STATUS"/>
 *     &lt;enumeration value="PRODUCT_TYPE_AND_PRIORITY"/>
 *     &lt;enumeration value="PRODUCT_PRODUCT_TYPE"/>
 *     &lt;enumeration value="PRODUCT_NOTES"/>
 *     &lt;enumeration value="PRODUCT_INVENTORY_SIZES"/>
 *     &lt;enumeration value="PRODUCT_RATE"/>
 *     &lt;enumeration value="PACKAGED_PRODUCT_RATE"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_TYPE"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_CREDIT_STATUS"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_EXTERNAL_ID"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_COMMENT"/>
 *     &lt;enumeration value="SALESPEOPLE_PROPOSAL_CONTRIBUTION"/>
 *     &lt;enumeration value="SALESPERSON_PROPOSAL_CONTRIBUTION"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_NOTES"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_ITEMS"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_STATUS"/>
 *     &lt;enumeration value="PACKAGE_COMMENTS"/>
 *     &lt;enumeration value="PACKAGE_START_DATE_TIME"/>
 *     &lt;enumeration value="PACKAGE_END_DATE_TIME"/>
 *     &lt;enumeration value="CONTENT_CMS_NAME"/>
 *     &lt;enumeration value="CONTENT_CMS_VIDEO_ID"/>
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
     *                 Indicates the progress made for the delivery of the {@link Dimension#LINE_ITEM_NAME}.
     *                 
     *                 <table>
     *                 <tr>
     *                 <th scope="col">Progress</th> <th scope="col">Definition</th>
     *                 </tr>
     *                 <tr>
     *                 <td>100%</td>
     *                 <td>The {@link LineItem} is on track to deliver in full as per
     *                 {@link LineItem#unitsBought}.</td>
     *                 </tr>
     *                 <tr>
     *                 <td>&gt; 100%</td>
     *                 <td>The {@link LineItem} is on track to overdeliver.</td>
     *                 </tr>
     *                 <tr>
     *                 <td>&lt; 100%</td>
     *                 <td>The {@link LineItem} is on track to underdeliver.</td>
     *                 </tr>
     *                 <tr>
     *                 <td>N/A</td>
     *                 <td>The {@link LineItem} does not have any quantity goals, or there is
     *                 insufficient information about the {@link LineItem}.</td>
     *                 </tr>
     *                 </table>
     *               
     * 
     */
    LINE_ITEM_DELIVERY_INDICATOR,

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
     *                 Represents the monthly reconciliation status of the line item for
     *                 {@link Dimension#LINE_ITEM_NAME} and {@link Dimension#MONTH_YEAR}.
     *               
     * 
     */
    LINE_ITEM_RECONCILIATION_STATUS,

    /**
     * 
     *                 Represents the monthly last reconciliation date time of the line item for
     *                 {@link Dimension#LINE_ITEM_NAME} and {@link Dimension#MONTH_YEAR}.
     *               
     * 
     */
    LINE_ITEM_LAST_RECONCILIATION_DATE_TIME,

    /**
     * 
     *                 Represents {@link Company#externalId} for {@link Dimension#ADVERTISER_NAME}.
     *               
     * 
     */
    ADVERTISER_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link Company#type} for {@link Dimension#ADVERTISER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ADVERTISER_TYPE,

    /**
     * 
     *                 Represents {@link Company#creditStatus} for {@link Dimension#ADVERTISER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ADVERTISER_CREDIT_STATUS,

    /**
     * 
     *                 Represents name and email address in the form of name(email) of primary contact for {@link
     *                 Dimension#ADVERTISER_NAME}.
     *               
     * 
     */
    ADVERTISER_PRIMARY_CONTACT,

    /**
     * 
     *                 Represents the start date (in YYYY-MM-DD format) for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ORDER_START_DATE_TIME,

    /**
     * 
     *                 Represents the end date (in YYYY-MM-DD format) for {@link Dimension#ORDER_NAME}.
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
     *                 Represents {@link Order#orderIsProgrammatic} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ORDER_IS_PROGRAMMATIC,

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
     *                 Represents {@link Order#traffickerId} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    ORDER_TRAFFICKER_ID,

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
     *                 Represents the start date (in YYYY-MM-DD format) for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *               
     * 
     */
    LINE_ITEM_START_DATE_TIME,

    /**
     * 
     *                 Represents the end date (in YYYY-MM-DD format) for {@link Dimension#LINE_ITEM_NAME}.
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
     *                 Represents whether a creative is SSL-compliant.
     *               
     * 
     */
    CREATIVE_SSL_SCAN_RESULT,

    /**
     * 
     *                 Represents whether a creative's SSL status was overridden.
     *               
     * 
     */
    CREATIVE_SSL_COMPLIANCE_OVERRIDE,

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
     *                 Represents {@link Proposal#creationDateTime} for {@link Dimension#PROPOSAL_NAME}. Can be used
     *                 for filtering.
     *               
     * 
     */
    PROPOSAL_CREATION_DATE_TIME,

    /**
     * 
     *                 Represents the sold time for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_SOLD_DATE_TIME,

    /**
     * 
     *                 Represents {@link Proposal#isSold} for {@link Dimension#PROPOSAL_NAME}. Can be used for
     *                 filtering.
     *               
     * 
     */
    PROPOSAL_IS_SOLD,

    /**
     * 
     *                 Represents {@link Proposal#probabilityOfClose} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_PROBABILITY_OF_CLOSE,

    /**
     * 
     *                 Represents {@link Proposal#status} for {@link Dimension#PROPOSAL_NAME}.
     *                 This attribute includes post-sold statuses, e.g. DRAFT(SOLD) until v201611.
     *                 Starting from v201702, it will not include post-sold statuses.
     *                 Can be used for filtering.
     *               
     * 
     */
    PROPOSAL_STATUS,

    /**
     * 
     *                 Represents archival status for {@link Dimension#PROPOSAL_NAME}, the values are ARCHIVED
     *                 and NOT_ARCHIVED. Can be used for filtering.
     *               
     * 
     */
    PROPOSAL_ARCHIVAL_STATUS,

    /**
     * 
     *                 Represents {@link Proposal#currency} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_CURRENCY,

    /**
     * 
     *                 Represents {@link Proposal#exchangeRate} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_EXCHANGE_RATE,

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
     *                 Represents {@link Proposal#proposalDiscount} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_DISCOUNT,

    /**
     * 
     *                 Represents {@link Proposal#advertiserDiscount} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_ADVERTISER_DISCOUNT,

    /**
     * 
     *                 Represents the advertiser name of {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_ADVERTISER,

    /**
     * 
     *                 Represents the advertiser id of {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_ADVERTISER_ID,

    /**
     * 
     *                 Represents the agency names as a comma separated string for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_AGENCIES,

    /**
     * 
     *                 Represents the agency ids as a comma separated string for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_AGENCY_IDS,

    /**
     * 
     *                 Represents {@link Proposal#poNumber} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_PO_NUMBER,

    /**
     * 
     *                 Represents name and email address in the form of name(email) of primary salesperson for
     *                 {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_PRIMARY_SALESPERSON,

    /**
     * 
     *                 Represents name and email addresses in the form of name(email) of secondary salespeople as a
     *                 comma separated string for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_SECONDARY_SALESPEOPLE,

    /**
     * 
     *                 Represents name and email address in the form of name(email) of creator for {@link
     *                 Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_CREATOR,

    /**
     * 
     *                 Represents name and email addresses in the form of name(email) of {@link
     *                 Proposal#salesPlannerIds} as a comma separated list string for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_SALES_PLANNERS,

    /**
     * 
     *                 Represents {@link Proposal#pricingModel} for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_PRICING_MODEL,

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
     *                 Represents {@link Proposal#appliedTeamIds} as a comma separated list of {@link Team#name}s for
     *                 {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_APPLIED_TEAM_NAMES,

    /**
     * 
     *                 Represents the approval stage for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_APPROVAL_STAGE,

    /**
     * 
     *                 Represents the inventory release date time for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_INVENTORY_RELEASE_DATE_TIME,

    /**
     * 
     *                 Represents {@link Proposal#budget} in local currency for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_LOCAL_BUDGET,

    /**
     * 
     *                 Represents the remaining budget in local currency for {@link Dimension#PROPOSAL_NAME}.
     *               
     * 
     */
    PROPOSAL_LOCAL_REMAINING_BUDGET,

    /**
     * 
     *                 Represents whether the {@link Proposal#billingBase} is {@link BillingBase#REVENUE}.
     *               
     * 
     */
    PROPOSAL_FLAT_FEE,

    /**
     * 
     *                 Represents {@link Proposal#isProgrammatic} for {@link Dimension#PROPOSAL_NAME}. Not available
     *                 as an attribute to report on, but exists as an attribute for filtering using PQL.
     *               
     * 
     */
    PROPOSAL_IS_PROGRAMMATIC,

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
     *                 Represents the reservation status of {@link Dimension#PROPOSAL_LINE_ITEM_NAME}. Can be used for
     *                 filtering.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_RESERVATION_STATUS,

    /**
     * 
     *                 Represents {@link ProposalLineItem#costPerUnit} for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_COST_PER_UNIT,

    /**
     * 
     *                 Represents {@link ProposalLineItem#costPerUnit} in local currency for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *                 
     *                 See {@link #PROPOSAL_LINE_ITEM_COST_PER_UNIT}
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT,

    /**
     * 
     *                 Represents gross cost per unit for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_COST_PER_UNIT_GROSS,

    /**
     * 
     *                 Represents gross cost per unit in local currency for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *                 
     *                 See {@link #PROPOSAL_LINE_ITEM_COST_PER_UNIT_GROSS}
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_LOCAL_COST_PER_UNIT_GROSS,

    /**
     * 
     *                 Represents line item type (if applicable) and line item priority (if applicable) for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_TYPE_AND_PRIORITY,

    /**
     * 
     *                 Represents the size of {@link ProposalLineItem#creativePlaceholders}
     *                 for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_SIZE,

    /**
     * 
     *                 Represents archival status for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}, the values are
     *                 ARCHIVED and NOT_ARCHIVED. Can be used for filtering.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_ARCHIVAL_STATUS,

    /**
     * 
     *                 Represents the product adjustment of {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_PRODUCT_ADJUSTMENT,

    /**
     * 
     *                 Represents {@link ProposalLineItem#contractedQuantityBuffer} for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_BUFFER,

    /**
     * 
     *                 Represents the listing rate (net) of {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_LISTING_RATE_NET,

    /**
     * 
     *                 Represents {@link ProposalLineItem#billingSource} for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_BILLING_SOURCE,

    /**
     * 
     *                 Represents {@link ProposalLineItem#billingCap} for {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_BILLING_CAP,

    /**
     * 
     *                 Represents {@link ProposalLineItem#billingSchedule} for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_BILLING_SCHEDULE,

    /**
     * 
     *                 Represents {@link Goal#units} of {@link ProposalLineItem#goal} for {@link
     *                 Dimension#PROPOSAL_LINE_ITEM_NAME} The attribute is available only if {@link
     *                 ProposalLineItem#lineItemType} is of type {@link LineItemType#SPONSORSHIP}, {@link
     *                 LineItemType#HOUSE}, {@link LineItemType#NETWORK}, or {@link LineItemType#BUMPER}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_GOAL_PERCENTAGE,

    /**
     * 
     *                 Represents {@link ProposalLineItem#costAdjustment} for {@link
     *                 Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_COST_ADJUSTMENT,

    /**
     * 
     *                 Represents the {@link ProposalLineItem#notes comments} for {@link
     *                 Dimension#PROPOSAL_LINE_ITEM_NAME}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_COMMENTS,

    /**
     * 
     *                 Represents the monthly reconciliation status of the proposal line item for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME} and {@link Dimension#MONTH_YEAR}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_RECONCILIATION_STATUS,

    /**
     * 
     *                 Represents the monthly last reconciliation date time of the proposal line item for
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME} and {@link Dimension#MONTH_YEAR}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_LAST_RECONCILIATION_DATE_TIME,

    /**
     * 
     *                 Represents whether the {@link ProposalLineItem#billingBase} is {@link BillingBase#REVENUE}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_FLAT_FEE,

    /**
     * 
     *                 Represents the corresponding product package item's archival status of
     *                 {@link Dimension#PROPOSAL_LINE_ITEM_NAME}. Not available as an attribute
     *                 to report on, but exists as an attribute for filtering using PQL.
     *               
     * 
     */
    PRODUCT_PACKAGE_ITEM_ARCHIVAL_STATUS,

    /**
     * 
     *                 Represents {@link ProductTemplate#rateType} for {@link Dimension#PRODUCT_TEMPLATE_NAME}.
     *               
     * 
     */
    PRODUCT_TEMPLATE_RATE_TYPE,

    /**
     * 
     *                 Represents {@link ProductTemplate#status} for {@link Dimension#PRODUCT_TEMPLATE_NAME}.
     *               
     * 
     */
    PRODUCT_TEMPLATE_STATUS,

    /**
     * 
     *                 Represents the line item type (if applicable) and line item priority
     *                 (if applicable) of {@link Dimension#PRODUCT_TEMPLATE_NAME}.
     *               
     * 
     */
    PRODUCT_TEMPLATE_TYPE_AND_PRIORITY,

    /**
     * 
     *                 Represents {@link ProductTemplate#productType} for {@link Dimension#PRODUCT_TEMPLATE_NAME}.
     *               
     * 
     */
    PRODUCT_TEMPLATE_PRODUCT_TYPE,

    /**
     * 
     *                 Represents {@link ProductTemplate#description} for {@link Dimension#PRODUCT_TEMPLATE_NAME}.
     *               
     * 
     */
    PRODUCT_TEMPLATE_DESCRIPTION,

    /**
     * 
     *                 Represents the product template's name of {@link Dimension#PRODUCT_NAME}.
     *               
     * 
     */
    PRODUCT_PRODUCT_TEMPLATE_NAME,

    /**
     * 
     *                 Represents {@link Product#rateType} for {@link Dimension#PRODUCT_NAME}.
     *               
     * 
     */
    PRODUCT_RATE_TYPE,

    /**
     * 
     *                 Represents {@link Product#status} for {@link Dimension#PRODUCT_NAME}.
     *               
     * 
     */
    PRODUCT_STATUS,

    /**
     * 
     *                 Represents the line item type (if applicable) and line item priority
     *                 (if applicable) of {@link Dimension#PRODUCT_NAME}.
     *               
     * 
     */
    PRODUCT_TYPE_AND_PRIORITY,

    /**
     * 
     *                 Represents the product type of {@link Dimension#PRODUCT_NAME}.
     *               
     * 
     */
    PRODUCT_PRODUCT_TYPE,

    /**
     * 
     *                 Represents {@link Product#notes} for {@link Dimension#PRODUCT_NAME}.
     *               
     * 
     */
    PRODUCT_NOTES,

    /**
     * 
     *                 Represents {@link Product#creativePlaceholders} for {@link Dimension#PRODUCT_NAME}.
     *               
     * 
     */
    PRODUCT_INVENTORY_SIZES,

    /**
     * 
     *                 Represents the {@link Dimension#PRODUCT_NAME}'s rate in a {@link Dimension#RATE_CARD_NAME}.
     *               
     * 
     */
    PRODUCT_RATE,

    /**
     * 
     *                 Represents the {@link Dimension#PRODUCT_NAME}'s rate in a {@link Dimension#RATE_CARD_NAME}
     *                 and {@link Dimension#PRODUCT_PACKAGE_NAME}.
     *               
     * 
     */
    PACKAGED_PRODUCT_RATE,

    /**
     * 
     *                 Represents the {@link Company#type} of {@link Dimension#PROPOSAL_AGENCY_NAME}.
     *               
     * 
     */
    PROPOSAL_AGENCY_TYPE,

    /**
     * 
     *                 Represents the {@link Company#creditStatus} of {@link Dimension#PROPOSAL_AGENCY_NAME}.
     *               
     * 
     */
    PROPOSAL_AGENCY_CREDIT_STATUS,

    /**
     * 
     *                 Represents {@link Company#externalId} for {@link Dimension#PROPOSAL_AGENCY_NAME}.
     *               
     * 
     */
    PROPOSAL_AGENCY_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link Company#comment} for {@link Dimension#PROPOSAL_AGENCY_NAME}.
     *               
     * 
     */
    PROPOSAL_AGENCY_COMMENT,

    /**
     * 
     *                 Represents the {@link Dimension#ALL_SALESPEOPLE_NAME}'s contribution to a {@link
     *                 Dimension#PROPOSAL_NAME}. This is different from {@link #SALESPERSON_PROPOSAL_CONTRIBUTION} as
     *                 this will include both primary and secondary salespeople.
     *               
     * 
     */
    SALESPEOPLE_PROPOSAL_CONTRIBUTION,

    /**
     * 
     *                 Represents the {@link Dimension#SALESPERSON_NAME}'s contribution to a {@link
     *                 Dimension#PROPOSAL_NAME}.
     *                 
     *                 <p>See {@link #SALESPERSON_PROPOSAL_CONTRIBUTION}.
     *               
     * 
     */
    SALESPERSON_PROPOSAL_CONTRIBUTION,

    /**
     * 
     *                 Represents {@link ProductPackage#notes} for {@link Dimension#PRODUCT_PACKAGE_NAME}.
     *               
     * 
     */
    PRODUCT_PACKAGE_NOTES,

    /**
     * 
     *                 Represents the products as a comma separated list of name for
     *                 {@link Dimension#PRODUCT_PACKAGE_NAME}.
     *               
     * 
     */
    PRODUCT_PACKAGE_ITEMS,

    /**
     * 
     *                 Represents {@link ProductPackage#status} for {@link Dimension#PRODUCT_PACKAGE_NAME}.
     *               
     * 
     */
    PRODUCT_PACKAGE_STATUS,

    /**
     * 
     *                 Represents {@link Package#comments} for {@link Dimension#PACKAGE_NAME}.
     *               
     * 
     */
    PACKAGE_COMMENTS,

    /**
     * 
     *                 Represents {@link Package#startDateTime} for {@Dimension#PACKAGE_NAME}.
     *               
     * 
     */
    PACKAGE_START_DATE_TIME,

    /**
     * 
     *                 Represents {@link Package#endDateTime} for {@Dimension#PACKAGE_NAME}.
     *               
     * 
     */
    PACKAGE_END_DATE_TIME,

    /**
     * 
     *                 Represents the {@link CmsContent#displayName} within the first element of
     *                 {@link Content#cmsContent} for {@link Dimension#CONTENT_NAME}.
     *               
     * 
     */
    CONTENT_CMS_NAME,

    /**
     * 
     *                 Represents the {@link CmsContent#cmsContentId} within the first element of
     *                 {@link Content#cmsContent} for {@link Dimension#CONTENT_NAME}.
     *               
     * 
     */
    CONTENT_CMS_VIDEO_ID,

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
