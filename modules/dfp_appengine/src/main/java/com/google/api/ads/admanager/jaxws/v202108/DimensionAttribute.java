// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202108;

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
 *     &lt;enumeration value="LINE_ITEM_AVERAGE_NUMBER_OF_VIEWERS"/>
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
     *                 <p>Corresponds to "Line item labels" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_LABELS,

    /**
     * 
     *                 Represents {@link LineItem#effectiveAppliedLabels} as a comma separated list of
     *                 {@link Label#id} for {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_LABEL_IDS,

    /**
     * 
     *                 Generated as {@code true} for {@link Dimension#LINE_ITEM_NAME} which is eligible
     *                 for optimization, {@code false} otherwise.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Optimizable" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
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
     *                 <p>Corresponds to "Delivery Indicator" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_DELIVERY_INDICATOR,

    /**
     * 
     *                 Represents {@link LineItem#deliveryRateType} for {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Delivery pacing" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
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
     *                 <p>Corresponds to "Frequency cap" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_FREQUENCY_CAP,

    /**
     * 
     *                 Represents the monthly reconciliation status of the line item for
     *                 {@link Dimension#LINE_ITEM_NAME} and {@link Dimension#MONTH_YEAR}.
     *                 <p>Corresponds to "Line item reconciliation status" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_RECONCILIATION_STATUS,

    /**
     * 
     *                 Represents the monthly last reconciliation date time of the line item for
     *                 {@link Dimension#LINE_ITEM_NAME} and {@link Dimension#MONTH_YEAR}.
     *                 <p>Corresponds to "Line item last reconciliation time" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_LAST_RECONCILIATION_DATE_TIME,

    /**
     * 
     *                 Represents {@link Company#externalId} for {@link Dimension#ADVERTISER_NAME}.
     *                 <p>Corresponds to "External advertiser ID" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ADVERTISER_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link Company#type} for {@link Dimension#ADVERTISER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Advertiser type" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    ADVERTISER_TYPE,

    /**
     * 
     *                 Represents {@link Company#creditStatus} for {@link Dimension#ADVERTISER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Advertiser credit status" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    ADVERTISER_CREDIT_STATUS,

    /**
     * 
     *                 Represents name and email address in the form of name(email) of primary contact for {@link
     *                 Dimension#ADVERTISER_NAME}.
     *                 <p>Corresponds to "Advertiser primary contact" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ADVERTISER_PRIMARY_CONTACT,

    /**
     * 
     *                 Represents the start date (in YYYY-MM-DD format) for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Order start date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    ORDER_START_DATE_TIME,

    /**
     * 
     *                 Represents the end date (in YYYY-MM-DD format) for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Order end date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    ORDER_END_DATE_TIME,

    /**
     * 
     *                 Represents {@link Order#externalOrderId} for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "External order ID" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link Order#poNumber} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Order PO number" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    ORDER_PO_NUMBER,

    /**
     * 
     *                 Represents {@link Order#orderIsProgrammatic} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Programmatic order" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_IS_PROGRAMMATIC,

    /**
     * 
     *                 Represents the name of {@link Order#agencyId} for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Agency" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_AGENCY,

    /**
     * 
     *                 Represents {@link Order#agencyId} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Agency ID" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_AGENCY_ID,

    /**
     * 
     *                 Represents {@link Order#effectiveAppliedLabels} as a comma separated list of
     *                 {@link Label#name} for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Order labels" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_LABELS,

    /**
     * 
     *                 Represents {@link Order#effectiveAppliedLabels} as a comma separated list of
     *                 {@link Label#id} for {@link Dimension#ORDER_NAME}.
     *                 <p>Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_LABEL_IDS,

    /**
     * 
     *                 The name and email address in the form of name(email) of the trafficker for
     *                 {@link Dimension#ORDER_NAME}
     *                 <p>Corresponds to "Trafficker" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_TRAFFICKER,

    /**
     * 
     *                 Represents {@link Order#traffickerId} for {@link Dimension#ORDER_NAME}.
     *                 Can be used for filtering.
     *                 <p>Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_TRAFFICKER_ID,

    /**
     * 
     *                 The names and email addresses as a comma separated list of name(email) of the
     *                 {@link Order#secondaryTraffickerIds} for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Secondary traffickers" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_SECONDARY_TRAFFICKERS,

    /**
     * 
     *                 The name and email address in the form of name(email) of the
     *                 {@link Order#salespersonId} for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Salesperson" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_SALESPERSON,

    /**
     * 
     *                 The names and email addresses as a comma separated list of name(email) of the
     *                 {@link Order#secondarySalespersonIds} for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Secondary salespeople" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_SECONDARY_SALESPEOPLE,

    /**
     * 
     *                 The total number of impressions delivered over the lifetime of an
     *                 {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Order lifetime impressions" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    ORDER_LIFETIME_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered over the lifetime of an
     *                 {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Order lifetime clicks" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    ORDER_LIFETIME_CLICKS,

    /**
     * 
     *                 The cost of booking all the CPM ads for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Booked CPM" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_BOOKED_CPM,

    /**
     * 
     *                 The cost of booking all the CPC ads for {@link Dimension#ORDER_NAME}.
     *                 <p>Corresponds to "Booked CPC" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ORDER_BOOKED_CPC,

    /**
     * 
     *                 Represents the start date (in YYYY-MM-DD format) for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Line item start date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_START_DATE_TIME,

    /**
     * 
     *                 Represents the end date (in YYYY-MM-DD format) for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Line item end date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_END_DATE_TIME,

    /**
     * 
     *                 Represents {@link LineItem#externalId} for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "External Line Item ID" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_EXTERNAL_ID,

    /**
     * 
     *                 Represents {@link LineItem#costType} for {@link Dimension#LINE_ITEM_NAME}.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Cost type" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_COST_TYPE,

    /**
     * 
     *                 Represents {@link LineItem#costPerUnit} for {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Rate" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_COST_PER_UNIT,

    /**
     * 
     *                 Represents the 3 letter currency code for {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Currency code" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_CURRENCY_CODE,

    /**
     * 
     *                 The total number of impressions, clicks or days that is reserved
     *                 for {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Goal quantity" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_GOAL_QUANTITY,

    /**
     * 
     *                 <p>Corresponds to "Nielsen Average Number Of Viewers" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_AVERAGE_NUMBER_OF_VIEWERS,

    /**
     * 
     *                 The ratio between the goal quantity for {@link Dimension#LINE_ITEM_NAME} of
     *                 {@link LineItemType#SPONSORSHIP} and the {@link #LINE_ITEM_GOAL_QUANTITY}.
     *                 Represented as a number between 0..100.
     *                 <p>Corresponds to "Sponsorship goal (%)" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_SPONSORSHIP_GOAL_PERCENTAGE,

    /**
     * 
     *                 The total number of impressions delivered over the lifetime of a
     *                 {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Line item lifetime impressions" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_LIFETIME_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered over the lifetime of a
     *                 {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Line item lifetime clicks" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_LIFETIME_CLICKS,

    /**
     * 
     *                 Represents {@link LineItem#priority} for {@link Dimension#LINE_ITEM_NAME} as
     *                 a value between 1 and 16.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Line item priority" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Data protection, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_PRIORITY,

    /**
     * 
     *                 Indicates if a creative is a regular creative or creative set.
     *                 Values will be 'Creative' or 'Creative set'
     *                 <p>Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    CREATIVE_OR_CREATIVE_SET,

    /**
     * 
     *                 The type of creative in a creative set - master or companion.
     *                 <p>Corresponds to "Master or Companion" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    MASTER_COMPANION_TYPE,

    /**
     * 
     *                 Represents the {@link LineItem#contractedUnitsBought} quantity
     *                 for {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Contracted quantity" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_CONTRACTED_QUANTITY,

    /**
     * 
     *                 Represents the {@link LineItem#discount} for {@link Dimension#LINE_ITEM_NAME}.
     *                 The number is either a percentage or an absolute value depending on
     *                 {@link LineItem#discountType}.
     *                 <p>Corresponds to "Discount" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_DISCOUNT,

    /**
     * 
     *                 The cost of booking for a non-CPD {@link Dimension#LINE_ITEM_NAME}.
     *                 <p>Corresponds to "Booked revenue (exclude CPD)" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_NON_CPD_BOOKED_REVENUE,

    /**
     * 
     *                 Represents {@link Company#appliedLabels} as a comma separated list of
     *                 {@link Label#name} for {@link Dimension#ADVERTISER_NAME}.
     *                 <p>Corresponds to "Advertiser labels" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ADVERTISER_LABELS,

    /**
     * 
     *                 Represents {@link Company#appliedLabels} as a comma separated list of
     *                 {@link Label#id} for {@link Dimension#ADVERTISER_NAME}.
     *                 <p>Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    ADVERTISER_LABEL_IDS,

    /**
     * 
     *                 Represents the click-through URL for {@link Dimension#CREATIVE_NAME}.
     *                 <p>Corresponds to "Click-through URL" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    CREATIVE_CLICK_THROUGH_URL,

    /**
     * 
     *                 Represents whether a creative is SSL-compliant.
     *                 <p>Corresponds to "Creative SSL scan result" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    CREATIVE_SSL_SCAN_RESULT,

    /**
     * 
     *                 Represents whether a creative's SSL status was overridden.
     *                 <p>Corresponds to "Creative SSL compliance override" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    CREATIVE_SSL_COMPLIANCE_OVERRIDE,

    /**
     * 
     *                 Represents a {@link LineItemCreativeAssociation#startDateTime} for a
     *                 {@link Dimension#LINE_ITEM_NAME} and a {@link Dimension#CREATIVE_NAME}.
     *                 Includes the date without the time.
     *                 <p>Corresponds to "Creative start date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_CREATIVE_START_DATE,

    /**
     * 
     *                 Represents a {@link LineItemCreativeAssociation#endDateTime} for a
     *                 {@link Dimension#LINE_ITEM_NAME} and a {@link Dimension#CREATIVE_NAME}.
     *                 Includes the date without the time.
     *                 <p>Corresponds to "Creative end date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    LINE_ITEM_CREATIVE_END_DATE,

    /**
     * 
     *                 Represents the {@link CmsContent#displayName} within the first element of
     *                 {@link Content#cmsContent} for {@link Dimension#CONTENT_NAME}.
     *                 <p>Corresponds to "Content source name" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    CONTENT_CMS_NAME,

    /**
     * 
     *                 Represents the {@link CmsContent#cmsContentId} within the first element of
     *                 {@link Content#cmsContent} for {@link Dimension#CONTENT_NAME}.
     *                 <p>Corresponds to "ID of the video in the content source" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    CONTENT_CMS_VIDEO_ID,

    /**
     * 
     *                 Represents {@link AdUnit#adUnitCode} for {@link Dimension#AD_UNIT_NAME}.
     *                 <p>Corresponds to "Ad unit code" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
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
