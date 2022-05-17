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
 * <p>Java class for Dimension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dimension">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONTH_AND_YEAR"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="HOUR"/>
 *     &lt;enumeration value="LINE_ITEM_ID"/>
 *     &lt;enumeration value="LINE_ITEM_NAME"/>
 *     &lt;enumeration value="LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="ORDER_ID"/>
 *     &lt;enumeration value="ORDER_NAME"/>
 *     &lt;enumeration value="ORDER_DELIVERY_STATUS"/>
 *     &lt;enumeration value="ADVERTISER_ID"/>
 *     &lt;enumeration value="ADVERTISER_NAME"/>
 *     &lt;enumeration value="AD_NETWORK_ID"/>
 *     &lt;enumeration value="AD_NETWORK_NAME"/>
 *     &lt;enumeration value="SALESPERSON_ID"/>
 *     &lt;enumeration value="SALESPERSON_NAME"/>
 *     &lt;enumeration value="CREATIVE_ID"/>
 *     &lt;enumeration value="CREATIVE_NAME"/>
 *     &lt;enumeration value="CREATIVE_TYPE"/>
 *     &lt;enumeration value="CREATIVE_BILLING_TYPE"/>
 *     &lt;enumeration value="CUSTOM_EVENT_ID"/>
 *     &lt;enumeration value="CUSTOM_EVENT_NAME"/>
 *     &lt;enumeration value="CUSTOM_EVENT_TYPE"/>
 *     &lt;enumeration value="CREATIVE_SIZE"/>
 *     &lt;enumeration value="AD_UNIT_ID"/>
 *     &lt;enumeration value="AD_UNIT_NAME"/>
 *     &lt;enumeration value="PARENT_AD_UNIT_ID"/>
 *     &lt;enumeration value="PARENT_AD_UNIT_NAME"/>
 *     &lt;enumeration value="PLACEMENT_ID"/>
 *     &lt;enumeration value="PLACEMENT_NAME"/>
 *     &lt;enumeration value="PLACEMENT_STATUS"/>
 *     &lt;enumeration value="TARGETING"/>
 *     &lt;enumeration value="BROWSER_NAME"/>
 *     &lt;enumeration value="DEVICE_CATEGORY_ID"/>
 *     &lt;enumeration value="DEVICE_CATEGORY_NAME"/>
 *     &lt;enumeration value="COUNTRY_CRITERIA_ID"/>
 *     &lt;enumeration value="COUNTRY_NAME"/>
 *     &lt;enumeration value="REGION_CRITERIA_ID"/>
 *     &lt;enumeration value="REGION_NAME"/>
 *     &lt;enumeration value="CITY_CRITERIA_ID"/>
 *     &lt;enumeration value="CITY_NAME"/>
 *     &lt;enumeration value="METRO_CRITERIA_ID"/>
 *     &lt;enumeration value="METRO_NAME"/>
 *     &lt;enumeration value="POSTAL_CODE_CRITERIA_ID"/>
 *     &lt;enumeration value="POSTAL_CODE"/>
 *     &lt;enumeration value="CUSTOM_TARGETING_VALUE_ID"/>
 *     &lt;enumeration value="CUSTOM_CRITERIA"/>
 *     &lt;enumeration value="ACTIVITY_ID"/>
 *     &lt;enumeration value="ACTIVITY_NAME"/>
 *     &lt;enumeration value="ACTIVITY_GROUP_ID"/>
 *     &lt;enumeration value="ACTIVITY_GROUP_NAME"/>
 *     &lt;enumeration value="CONTENT_ID"/>
 *     &lt;enumeration value="CONTENT_NAME"/>
 *     &lt;enumeration value="CONTENT_BUNDLE_ID"/>
 *     &lt;enumeration value="CONTENT_BUNDLE_NAME"/>
 *     &lt;enumeration value="VIDEO_METADATA_KEY_ID"/>
 *     &lt;enumeration value="VIDEO_METADATA_KEY_NAME"/>
 *     &lt;enumeration value="CMS_METADATA"/>
 *     &lt;enumeration value="VIDEO_FALLBACK_POSITION"/>
 *     &lt;enumeration value="POSITION_OF_POD"/>
 *     &lt;enumeration value="POSITION_IN_POD"/>
 *     &lt;enumeration value="CUSTOM_SPOT_ID"/>
 *     &lt;enumeration value="CUSTOM_SPOT_NAME"/>
 *     &lt;enumeration value="VIDEO_REDIRECT_THIRD_PARTY"/>
 *     &lt;enumeration value="VIDEO_BREAK_TYPE"/>
 *     &lt;enumeration value="VIDEO_BREAK_TYPE_NAME"/>
 *     &lt;enumeration value="VIDEO_VAST_VERSION"/>
 *     &lt;enumeration value="VIDEO_AD_REQUEST_DURATION_ID"/>
 *     &lt;enumeration value="VIDEO_AD_REQUEST_DURATION"/>
 *     &lt;enumeration value="VIDEO_PLACEMENT_NAME"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_ID"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_NAME"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_LABEL_ID"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_LABEL_NAME"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_ASSIGNMENT_ID"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_ASSIGNMENT_NAME"/>
 *     &lt;enumeration value="INVENTORY_SHARE_ASSIGNMENT_ID"/>
 *     &lt;enumeration value="INVENTORY_SHARE_ASSIGNMENT_NAME"/>
 *     &lt;enumeration value="INVENTORY_SHARE_OUTCOME"/>
 *     &lt;enumeration value="GRP_DEMOGRAPHICS"/>
 *     &lt;enumeration value="AD_REQUEST_AD_UNIT_SIZES"/>
 *     &lt;enumeration value="AD_REQUEST_CUSTOM_CRITERIA"/>
 *     &lt;enumeration value="IS_FIRST_LOOK_DEAL"/>
 *     &lt;enumeration value="YIELD_GROUP_ID"/>
 *     &lt;enumeration value="YIELD_GROUP_NAME"/>
 *     &lt;enumeration value="YIELD_PARTNER"/>
 *     &lt;enumeration value="YIELD_PARTNER_TAG"/>
 *     &lt;enumeration value="CLASSIFIED_ADVERTISER_ID"/>
 *     &lt;enumeration value="CLASSIFIED_ADVERTISER_NAME"/>
 *     &lt;enumeration value="CLASSIFIED_BRAND_ID"/>
 *     &lt;enumeration value="CLASSIFIED_BRAND_NAME"/>
 *     &lt;enumeration value="MEDIATION_TYPE"/>
 *     &lt;enumeration value="NATIVE_TEMPLATE_ID"/>
 *     &lt;enumeration value="NATIVE_TEMPLATE_NAME"/>
 *     &lt;enumeration value="NATIVE_STYLE_ID"/>
 *     &lt;enumeration value="NATIVE_STYLE_NAME"/>
 *     &lt;enumeration value="CHILD_NETWORK_CODE"/>
 *     &lt;enumeration value="MOBILE_APP_RESOLVED_ID"/>
 *     &lt;enumeration value="MOBILE_APP_NAME"/>
 *     &lt;enumeration value="MOBILE_DEVICE_NAME"/>
 *     &lt;enumeration value="MOBILE_INVENTORY_TYPE"/>
 *     &lt;enumeration value="REQUEST_TYPE"/>
 *     &lt;enumeration value="AD_UNIT_STATUS"/>
 *     &lt;enumeration value="MASTER_COMPANION_CREATIVE_ID"/>
 *     &lt;enumeration value="MASTER_COMPANION_CREATIVE_NAME"/>
 *     &lt;enumeration value="AUDIENCE_SEGMENT_ID"/>
 *     &lt;enumeration value="AUDIENCE_SEGMENT_NAME"/>
 *     &lt;enumeration value="AUDIENCE_SEGMENT_DATA_PROVIDER_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_INVENTORY_SIZE"/>
 *     &lt;enumeration value="AD_EXCHANGE_INVENTORY_SIZE_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEVICE_CATEGORY"/>
 *     &lt;enumeration value="AD_EXCHANGE_PRICING_RULE_ID"/>
 *     &lt;enumeration value="AD_EXCHANGE_PRICING_RULE_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_TAG_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_URL"/>
 *     &lt;enumeration value="AD_EXCHANGE_WEB_PROPERTY_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_CREATIVE_SIZES"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_CHANNEL_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_PRODUCT_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_PRODUCT_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_SITE_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_REQUEST_SOURCES"/>
 *     &lt;enumeration value="AD_EXCHANGE_ADVERTISER_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_BRAND_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_AGENCY"/>
 *     &lt;enumeration value="AD_EXCHANGE_BID_TYPE_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_BRANDING_TYPE_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_BRANDING_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_BUYER_NETWORK_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_BUYER_NETWORK_ID"/>
 *     &lt;enumeration value="AD_EXCHANGE_CUSTOM_CHANNEL_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_CUSTOM_CHANNEL_ID"/>
 *     &lt;enumeration value="AD_EXCHANGE_DATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEAL_ID"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEAL_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_TRANSACTION_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_DSP_BUYER_NETWORK_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_EXPANSION_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_COUNTRY_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_COUNTRY_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_DFP_AD_UNIT_ID"/>
 *     &lt;enumeration value="AD_EXCHANGE_DFP_AD_UNIT"/>
 *     &lt;enumeration value="AD_EXCHANGE_INVENTORY_OWNERSHIP"/>
 *     &lt;enumeration value="AD_EXCHANGE_ADVERTISER_DOMAIN"/>
 *     &lt;enumeration value="AD_EXCHANGE_DFP_MOBILE_APP_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_APP_RESOLVED_ID"/>
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_CARRIER_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_DEVICE_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_INVENTORY_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_MONTH"/>
 *     &lt;enumeration value="AD_EXCHANGE_NETWORK_PARTNER_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_OPERATING_SYSTEM"/>
 *     &lt;enumeration value="AD_EXCHANGE_OPTIMIZATION_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_TAG_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_TARGETING_TYPE_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_TARGETING_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_TRANSACTION_TYPE_CODE"/>
 *     &lt;enumeration value="AD_EXCHANGE_URL_ID"/>
 *     &lt;enumeration value="AD_EXCHANGE_USER_BANDWIDTH_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_AD_DURATION"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_AD_DURATION_RAW"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_AD_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_WEEK"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_LOCATION"/>
 *     &lt;enumeration value="AD_EXCHANGE_ADVERTISER_VERTICAL"/>
 *     &lt;enumeration value="NIELSEN_SEGMENT"/>
 *     &lt;enumeration value="NIELSEN_DEMOGRAPHICS"/>
 *     &lt;enumeration value="NIELSEN_RESTATEMENT_DATE"/>
 *     &lt;enumeration value="NIELSEN_DEVICE_ID"/>
 *     &lt;enumeration value="NIELSEN_DEVICE_NAME"/>
 *     &lt;enumeration value="PROGRAMMATIC_BUYER_ID"/>
 *     &lt;enumeration value="PROGRAMMATIC_BUYER_NAME"/>
 *     &lt;enumeration value="REQUESTED_AD_SIZES"/>
 *     &lt;enumeration value="CREATIVE_SIZE_DELIVERED"/>
 *     &lt;enumeration value="PROGRAMMATIC_CHANNEL_ID"/>
 *     &lt;enumeration value="PROGRAMMATIC_CHANNEL_NAME"/>
 *     &lt;enumeration value="CLASSIFIED_YIELD_PARTNER_NAME"/>
 *     &lt;enumeration value="DP_DATE"/>
 *     &lt;enumeration value="DP_WEEK"/>
 *     &lt;enumeration value="DP_MONTH_YEAR"/>
 *     &lt;enumeration value="DP_COUNTRY_CRITERIA_ID"/>
 *     &lt;enumeration value="DP_COUNTRY_NAME"/>
 *     &lt;enumeration value="DP_INVENTORY_TYPE"/>
 *     &lt;enumeration value="DP_CREATIVE_SIZE"/>
 *     &lt;enumeration value="DP_BRAND_NAME"/>
 *     &lt;enumeration value="DP_ADVERTISER_NAME"/>
 *     &lt;enumeration value="DP_ADX_BUYER_NETWORK_NAME"/>
 *     &lt;enumeration value="DP_MOBILE_DEVICE_NAME"/>
 *     &lt;enumeration value="DP_DEVICE_CATEGORY_NAME"/>
 *     &lt;enumeration value="DP_TAG_ID"/>
 *     &lt;enumeration value="DP_DEAL_ID"/>
 *     &lt;enumeration value="DP_APP_ID"/>
 *     &lt;enumeration value="CUSTOM_DIMENSION"/>
 *     &lt;enumeration value="DEMAND_CHANNEL_ID"/>
 *     &lt;enumeration value="DEMAND_CHANNEL_NAME"/>
 *     &lt;enumeration value="DOMAIN"/>
 *     &lt;enumeration value="UNIFIED_PRICING_RULE_ID"/>
 *     &lt;enumeration value="UNIFIED_PRICING_RULE_NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dimension")
@XmlEnum
public enum Dimension {


    /**
     * 
     *                 Breaks down reporting data by month and year in the network time zone. Can be used to filter on
     *                 month using ISO 4601 format 'YYYY-MM'.
     *                 <p>Corresponds to "Month and year" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Partner finance.</p>
     *               
     * 
     */
    MONTH_AND_YEAR,

    /**
     * 
     *                 Breaks down reporting data by week of the year in the network time zone. Cannot be used for
     *                 filtering.
     *                 <p>Corresponds to "Week" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    WEEK,

    /**
     * 
     *                 Breaks down reporting data by date in the network time zone. Can be used to filter by date
     *                 using ISO 8601's format 'YYYY-MM-DD'".
     *                 <p>Corresponds to "Date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    DATE,

    /**
     * 
     *                 Breaks down reporting data by day of the week in the network time zone. Can
     *                 be used to filter by day of the week using the index of the day (from 1 for
     *                 Monday is 1 to 7 for Sunday).
     *                 <p>Corresponds to "Day of week" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    DAY,

    /**
     * 
     *                 Breaks down reporting data by hour of the day in the network time zone. Can
     *                 be used to filter by hour of the day (from 0 to 23).
     *                 <p>Corresponds to "Hour" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    HOUR,

    /**
     * 
     *                 Breaks down reporting data by {@link LineItem#id}. Can be used to
     *                 filter by {@link LineItem#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_ID,

    /**
     * 
     *                 Breaks down reporting data by line item. {@link LineItem#name} and
     *                 {@link LineItem#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link LineItem#name}.
     *                 <p>Corresponds to "Line item" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link LineItem#lineItemType}. Can be used
     *                 to filter by line item type using {@link LineItemType} enumeration names.
     *                 <p>Corresponds to "Line item type" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    LINE_ITEM_TYPE,

    /**
     * 
     *                 Breaks down reporting data by {@link Order#id}. Can be used to filter by
     *                 {@link Order#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    ORDER_ID,

    /**
     * 
     *                 Breaks down reporting data by order. {@link Order#name} and
     *                 {@link Order#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link Order#name}.
     *                 <p>Corresponds to "Order" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    ORDER_NAME,

    /**
     * 
     *                 Delivery status of the order. Not available as a dimension to report on,
     *                 but exists as a dimension in order to filter on it using PQL.
     *                 Valid values are 'STARTED', 'NOT_STARTED' and 'COMPLETED'.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ORDER_DELIVERY_STATUS,

    /**
     * 
     *                 Breaks down reporting data by advertising company {@link Company#id}. Can
     *                 be used to filter by {@link Company#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    ADVERTISER_ID,

    /**
     * 
     *                 Breaks down reporting data by advertising company. {@link Company#name} and
     *                 {@link Company#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link Company#name}.
     *                 <p>Corresponds to "Advertiser" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    ADVERTISER_NAME,

    /**
     * 
     *                 The network that provided the ad for SDK ad mediation.
     *                 
     *                 <p>If selected for a report, that report will include only SDK mediation ads and will not
     *                 contain non-SDK mediation ads.
     *                 
     *                 <p>SDK mediation ads are ads for mobile devices. They have a list of ad networks which can
     *                 provide ads to serve. Not every ad network will have an ad to serve so the device will try each
     *                 network one-by-one until it finds an ad network with an ad to serve. The ad network that ends
     *                 up serving the ad will appear here. Note that this id does not correlate to anything in the
     *                 companies table and is not the same id as is served by {@link #ADVERTISER_ID}.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_NETWORK_ID,

    /**
     * 
     *                 The name of the network defined in {@link #AD_NETWORK_ID}.
     *                 <p>Corresponds to "Ad network name" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_NETWORK_NAME,

    /**
     * 
     *                 Breaks down reporting data by salesperson {@link User#id}. Can be used to
     *                 filter by {@link User#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    SALESPERSON_ID,

    /**
     * 
     *                 Breaks down reporting data by salesperson. {@link User#name} and
     *                 {@link User#id} of the salesperson are automatically included as columns in
     *                 the report. Can be used to filter by {@link User#name}.
     *                 <p>Corresponds to "Salesperson" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    SALESPERSON_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Creative#id} or creative set id
     *                 (master's {@link Creative#id}) if the creative is part of a creative set.
     *                 Can be used to filter by {@link Creative#id}.
     *                 <p>Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    CREATIVE_ID,

    /**
     * 
     *                 Breaks down reporting data by creative. {@link Creative#name} and
     *                 {@link Creative#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link Creative#name}.
     *                 <p>Corresponds to "Creative" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    CREATIVE_NAME,

    /**
     * 
     *                 Breaks down reporting data by creative type.
     *                 <p>Corresponds to "Creative type" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    CREATIVE_TYPE,

    /**
     * 
     *                 Breaks down reporting data by creative billing type.
     *                 <p>Corresponds to "Creative billing type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CREATIVE_BILLING_TYPE,

    /**
     * 
     *                 Breaks down reporting data by custom event ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CUSTOM_EVENT_ID,

    /**
     * 
     *                 Breaks down reporting data by custom event name.
     *                 <p>Corresponds to "Custom event" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CUSTOM_EVENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by custom event type (timer/exit/counter).
     *                 <p>Corresponds to "Custom event type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CUSTOM_EVENT_TYPE,

    /**
     * 
     *                 Breaks down reporting data by {@link Creative#size}. Cannot be used for
     *                 filtering.
     *                 <p>Corresponds to "Creative size" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CREATIVE_SIZE,

    /**
     * 
     *                 Breaks down reporting data by {@link AdUnit#id}. Can be used to filter by
     *                 {@link AdUnit#id}. {@link #AD_UNIT_NAME}, i.e. {@link AdUnit#name}, is
     *                 automatically included as a dimension in the report.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Ad speed.</p>
     *               
     * 
     */
    AD_UNIT_ID,

    /**
     * 
     *                 Breaks down reporting data by ad unit. {@link AdUnit#name} and
     *                 {@link AdUnit#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link AdUnit#name}.
     *                 <p>Corresponds to "Ad unit" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Ad speed.</p>
     *               
     * 
     */
    AD_UNIT_NAME,

    /**
     * 
     *                 Used to filter on all the descendants of an ad unit by {@link AdUnit#id}. Not available as a
     *                 dimension to report on.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    PARENT_AD_UNIT_ID,

    /**
     * 
     *                 Used to filter on all the descendants of an ad unit by {@link AdUnit#name}. Not available as a
     *                 dimension to report on.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    PARENT_AD_UNIT_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Placement#id}. Can be used to filter
     *                 by {@link Placement#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    PLACEMENT_ID,

    /**
     * 
     *                 Breaks down reporting data by placement. {@link Placement#name} and
     *                 {@link Placement#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link Placement#name}.
     *                 <p>Corresponds to "Placement" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach.</p>
     *               
     * 
     */
    PLACEMENT_NAME,

    /**
     * 
     *                 Status of the placement. Not available as a dimension to report on, but
     *                 exists as a dimension in order to filter on it using PQL. Can be used to
     *                 filter on {@link Placement#status} by using {@link InventoryStatus}
     *                 enumeration names.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through.</p>
     *               
     * 
     */
    PLACEMENT_STATUS,

    /**
     * 
     *                 Breaks down reporting data by criteria predefined by Ad Manager like the
     *                 operating system, browser etc. Cannot be used for filtering.
     *                 <p>Corresponds to "Targeting" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TARGETING,

    /**
     * 
     *                 Breaks down reporting data by browser criteria predefined by Ad Manager.
     *                 <p>Corresponds to "Browser" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BROWSER_NAME,

    /**
     * 
     *                 The ID of the device category to which an ad is being targeted.
     *                 
     *                 Can be used to filter by device category ID.
     *                 <p>Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    DEVICE_CATEGORY_ID,

    /**
     * 
     *                 The category of device (smartphone, feature phone, tablet, or desktop) to which an ad is being
     *                 targeted.
     *                 
     *                 Can be used to filter by device category name.
     *                 <p>Corresponds to "Device category" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    DEVICE_CATEGORY_NAME,

    /**
     * 
     *                 Breaks down reporting data by country criteria ID. Can be used to filter by
     *                 country criteria ID.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    COUNTRY_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by country name. The country name and the
     *                 country criteria ID are automatically included as columns in the report.
     *                 Can be used to filter by country name using the US English name.
     *                 <p>Corresponds to "Country" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed.</p>
     *               
     * 
     */
    COUNTRY_NAME,

    /**
     * 
     *                 Breaks down reporting data by region criteria ID. Can be used to filter by
     *                 region criteria ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    REGION_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by region name. The region name and the region
     *                 criteria ID are automatically included as columns in the report. Can be
     *                 used to filter by region name using the US English name.
     *                 <p>Corresponds to "Region" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    REGION_NAME,

    /**
     * 
     *                 Breaks down reporting data by city criteria ID. Can be used to filter by
     *                 city criteria ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CITY_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by city name. The city name and the city
     *                 criteria ID are automatically included as columns in the report. Can be
     *                 used to filter by city name using the US English name.
     *                 <p>Corresponds to "City" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CITY_NAME,

    /**
     * 
     *                 Breaks down reporting data by metro criteria ID. Can be used to filter by
     *                 metro criteria ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    METRO_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by metro name. The metro name and the metro
     *                 criteria ID are automatically included as columns in the report. Can be
     *                 used to filter by metro name using the US English name.
     *                 <p>Corresponds to "Metro" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    METRO_NAME,

    /**
     * 
     *                 Breaks down reporting data by postal code criteria ID. Can be used to
     *                 filter by postal code criteria ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    POSTAL_CODE_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by postal code. The postal code and the postal
     *                 code criteria ID are automatically included as columns in the report. Can
     *                 be used to filter by postal code.
     *                 <p>Corresponds to "Postal code" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    POSTAL_CODE,

    /**
     * 
     *                 Breaks down reporting data by {@link CustomTargetingValue#id}. Can be used
     *                 to filter by {@link CustomTargetingValue#id}.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CUSTOM_TARGETING_VALUE_ID,

    /**
     * 
     *                 Breaks down reporting data by custom criteria. The {@link CustomTargetingValue} is
     *                 displayed in the form:
     *                 <ul>
     *                 <li>
     *                 car=honda when value match type is
     *                 {@link CustomTargetingValue.MatchType#EXACT}
     *                 </li>
     *                 <li>
     *                 car~honda when value match type is
     *                 {@link CustomTargetingValue.MatchType#BROAD}
     *                 </li>
     *                 <li>
     *                 car=*honda when value match type is
     *                 {@link CustomTargetingValue.MatchType#PREFIX}
     *                 </li>
     *                 <li>
     *                 car~*honda when value match type is
     *                 {@link CustomTargetingValue.MatchType#BROAD_PREFIX}
     *                 </li>
     *                 </ul>
     *                 {@link #CUSTOM_TARGETING_VALUE_ID}, i.e. {@link CustomTargetingValue#id} is
     *                 automatically included as a column in the report.
     *                 Cannot be used for filtering; use {@link #CUSTOM_TARGETING_VALUE_ID} instead.
     *                 <p>
     *                 When using this {@code Dimension}, metrics for freeform key values are only
     *                 reported on when they are registered with {@code CustomTargetingService}.
     *                 <p>Corresponds to "Key-values" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CUSTOM_CRITERIA,

    /**
     * 
     *                 Breaks down reporting data by activity ID. Can be used to filter by
     *                 activity ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ACTIVITY_ID,

    /**
     * 
     *                 Breaks down reporting data by activity. The activity name and the activity
     *                 ID are automatically included as columns in the report. Can be used to
     *                 filter by activity name.
     *                 <p>Corresponds to "Activity" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ACTIVITY_NAME,

    /**
     * 
     *                 Breaks down reporting data by activity group ID. Can be used to filter by
     *                 activity group ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ACTIVITY_GROUP_ID,

    /**
     * 
     *                 Breaks down reporting data by activity group. The activity group name and
     *                 the activity group ID are automatically included as columns in the report.
     *                 Can be used to filter by activity group name.
     *                 <p>Corresponds to "Activity group" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ACTIVITY_GROUP_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Content#id}. Can be used to filter by
     *                 {@link Content#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through.</p>
     *               
     * 
     */
    CONTENT_ID,

    /**
     * 
     *                 Breaks down reporting data by content. {@link Content#name} and
     *                 {@link Content#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link Content#name}.
     *                 <p>Corresponds to "Content" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through.</p>
     *               
     * 
     */
    CONTENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link ContentBundle#id}. Can be used to filter
     *                 by {@link ContentBundle#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through.</p>
     *               
     * 
     */
    CONTENT_BUNDLE_ID,

    /**
     * 
     *                 Breaks down reporting data by content bundle. {@link ContentBundle#name} and
     *                 {@link ContentBundle#id} are automatically included as columns in the
     *                 report. Can be used to filter by {@link ContentBundle#name}.
     *                 <p>Corresponds to "Content bundle" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through.</p>
     *               
     * 
     */
    CONTENT_BUNDLE_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link CustomTargetingKey#id}.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_METADATA_KEY_ID,

    /**
     * 
     *                 Breaks down reporting data by custom targeting key. {@link CustomTargetingKey#name} and
     *                 {@link CustomTargetingKey#id} are automatically included as columns in the
     *                 report.
     *                 <p>Corresponds to "Metadata key" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_METADATA_KEY_NAME,

    /**
     * 
     *                 Breaks down reporting data by CMS metadata.
     *                 To use this dimension in API, a list of cms metadata key IDs must be specified in
     *                 {@link ReportQuery#cmsMetadataKeyIds}.
     *                 <p>
     *                 This dimension can be used as a filter in the {@link Statement} in PQL syntax:
     *                 CMS_METADATA_KEY[keyId]_ID =
     *                 {@link CmsMetadataValue#cmsMetadataValueId CMS metadata value ID}
     *                 <p>
     *                 For example: WHERE CMS_METADATA_KEY[4242]_ID = 53423
     *               
     * 
     */
    CMS_METADATA,

    /**
     * 
     *                 Breaks down reporting data by the fallback position of the video ad, i.e.,
     *                 {@code NON_FALLBACK}, {@code FALLBACK_POSITION_1}, {@code FALLBACK_POSITION_2}, etc. Can be
     *                 used for filtering.
     *                 <p>Corresponds to "Fallback position" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_FALLBACK_POSITION,

    /**
     * 
     *                 Breaks down reporting data by the position of the video ad within the video stream, i.e.,
     *                 {@code UNKNOWN_POSITION}, {@code PREROLL}, {@code POSTROLL}, {@code UNKNOWN_MIDROLL},
     *                 {@code MIDROLL_1}, {@code MIDROLL_2}, etc. {@code UNKNOWN_MIDROLL} represents a midroll, but
     *                 which specific midroll is unknown. Can be used for filtering.
     *                 <p>Corresponds to "Position of pod" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    POSITION_OF_POD,

    /**
     * 
     *                 Breaks down reporting data by the position of the video ad within the pod, i.e.,
     *                 {@code UNKNOWN_POSITION}, {@code POSITION_1}, {@code POSITION_2}, etc.
     *                 Can be used for filtering.
     *                 <p>Corresponds to "Position in pod" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    POSITION_IN_POD,

    /**
     * 
     *                 Breaks down reporting data by {@link AdSpot#id}. Can be used to filter by
     *                 {@link AdSpot#id}.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CUSTOM_SPOT_ID,

    /**
     * 
     *                 Breaks down reporting data by content. {@link AdSpot#name} and
     *                 {@link AdSpot#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link AdSpot#name}.
     *                 <p>Corresponds to "Custom spot" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CUSTOM_SPOT_NAME,

    /**
     * 
     *                 Breaks down reporting data by video redirect vendor.
     *                 <p>Corresponds to "Video redirect third party" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_REDIRECT_THIRD_PARTY,

    /**
     * 
     *                 The filter to break down reporting data by video break type.
     *                 Not available as a dimension to report on.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_BREAK_TYPE,

    /**
     * 
     *                 The filter to break down reporting data by video break type.
     *                 Can only be used with the following string values:
     *                 "Unknown", "Single ad video request", "Optimized pod video request".
     *                 Not available as a dimension to report on.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_BREAK_TYPE_NAME,

    /**
     * 
     *                 Breaks down reporting data by vast version type name.
     *                 <p>Corresponds to "VAST version" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VAST_VERSION,

    /**
     * 
     *                 Breaks down reporting data by video request duration bucket.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_AD_REQUEST_DURATION_ID,

    /**
     * 
     *                 Breaks down reporting data by video request duration bucket name.
     *                 <p>Corresponds to "Video ad request duration" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_AD_REQUEST_DURATION,

    /**
     * 
     *                 Breaks down reporting data by video placement.
     *                 <p>Corresponds to "Video Placement" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_PLACEMENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by partner {@link Company#id}.
     *                 <p>Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_ID,

    /**
     * 
     *                 Breaks down reporting data by partner {@link Company#name} and {@link Company#id} are
     *                 automatically included as columns in the report.
     *                 <p>Corresponds to "Partner" in the Ad Manager UI. Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_NAME,

    /**
     * 
     *                 Breaks down reporting data by partner label {@link Label#id}.
     *                 <p>Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_LABEL_ID,

    /**
     * 
     *                 Breaks down reporting data by partner label. {@link Label#name} and {@link Label#id} are
     *                 automatically included as columns in the report.
     *                 <p>Corresponds to "Partner label" in the Ad Manager UI. Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_LABEL_NAME,

    /**
     * 
     *                 Breaks down reporting data by partner assignment id.
     *                 <p>Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_ASSIGNMENT_ID,

    /**
     * 
     *                 Breaks down reporting data by partner assignment name. PartnerAssignment name and id are
     *                 automatically included as columns in the report.
     *                 <p>Corresponds to "Assignment" in the Ad Manager UI. Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_ASSIGNMENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by inventory sharing assignment ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    INVENTORY_SHARE_ASSIGNMENT_ID,

    /**
     * 
     *                 Breaks down reporting data by inventory sharing assignment name.
     *                 <p>Corresponds to "Inventory share assignment" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    INVENTORY_SHARE_ASSIGNMENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by inventory sharing outcome.
     *                 <p>Corresponds to "Inventory share outcome" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    INVENTORY_SHARE_OUTCOME,

    /**
     * 
     *                 Breaks down reporting data by gender and age group, i.e., MALE_13_TO_17, MALE_18_TO_24,
     *                 MALE_25_TO_34, MALE_35_TO_44, MALE_45_TO_54, MALE_55_TO_64, MALE_65_PLUS, FEMALE_13_TO_17,
     *                 FEMALE_18_TO_24, FEMALE_25_TO_34, FEMALE_35_TO_44, FEMALE_45_TO_54, FEMALE_55_TO_64,
     *                 FEMALE_65_PLUS, UNKNOWN_0_TO_17 and UNKNOWN. Whenever this dimension is selected, {@link
     *                 #COUNTRY_NAME} must be selected.
     *                 
     *                 <p>This dimension is supported only for GRP columns.
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Demographics, comScore vCE demographics. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_DEMOGRAPHICS,

    /**
     * 
     *                 Breaks down reporting data by the ad unit sizes specified in ad requests.
     *                 
     *                 <p>Formatted as comma separated values, e.g. "300x250,300x250v,300x60".
     *                 
     *                 <p>This dimension is supported only for sell-through columns.
     *                 <p>Corresponds to "Ad request sizes" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    AD_REQUEST_AD_UNIT_SIZES,

    /**
     * 
     *                 Breaks down reporting data by the custom criteria specified in ad requests.
     *                 
     *                 <p>Formatted as comma separated
     *                 {@link CustomTargetingKey key}-{@link CustomTargetingValue values}, where a key-value is
     *                 formatted as {@code key1=value_1|...|value_n,key2=value_1|...|value_n,...}.
     *                 
     *                 <p>This dimension is supported only for sell-through columns.
     *                 <p>Corresponds to "Key-values" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    AD_REQUEST_CUSTOM_CRITERIA,

    /**
     * 
     *                 Break down the report by a boolean indicator. It's TRUE for Ad Exchange traffic fulfilled by
     *                 First Look Deals. It can be used both as a dimension or dimension filter. As a filter, it can
     *                 only be used with the string values "true" and "false".
     *                 <p>Corresponds to "Is First Look" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    IS_FIRST_LOOK_DEAL,

    /**
     * 
     *                 Breaks down reporting data by yield group ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_ID,

    /**
     * 
     *                 Breaks down reporting data by yield group name.
     *                 <p>Corresponds to "Yield group" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_NAME,

    /**
     * 
     *                 Breaks down reporting data by yield partner.
     *                 <p>Corresponds to "Yield partner" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_PARTNER,

    /**
     * 
     *                 Breaks down reporting data by the tag of a yield partner in a yield group.
     *                 <p>Corresponds to "Yield partner tag" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_PARTNER_TAG,

    /**
     * 
     *                 The ID of a classified advertiser.
     *                 <p>Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CLASSIFIED_ADVERTISER_ID,

    /**
     * 
     *                 The name of a classified advertiser.
     *                 <p>Corresponds to "Advertiser (classified)" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    CLASSIFIED_ADVERTISER_NAME,

    /**
     * 
     *                 The ID of a classified brand.
     *                 <p>Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CLASSIFIED_BRAND_ID,

    /**
     * 
     *                 The name of a classified brand.
     *                 <p>Corresponds to "Brand (classified)" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    CLASSIFIED_BRAND_NAME,

    /**
     * 
     *                 Breaks down reporting data by mediation type.   A mediation type can be web, mobile app or
     *                 video.
     *                 <p>Corresponds to "Mediation type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MEDIATION_TYPE,

    /**
     * 
     *                 Breaks down reporting data by native template (also known as creative template) ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    NATIVE_TEMPLATE_ID,

    /**
     * 
     *                 Breaks down reporting data by native template (also known as creative template) name.
     *                 <p>Corresponds to "Native ad format name" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    NATIVE_TEMPLATE_NAME,

    /**
     * 
     *                 Breaks down reporting data by native style ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    NATIVE_STYLE_ID,

    /**
     * 
     *                 Breaks down reporting data by native style name.
     *                 <p>Corresponds to "Native style name" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    NATIVE_STYLE_NAME,

    /**
     * 
     *                 Breaks down reporting data by child network code in MCM "Manage Inventory".
     *                 
     *                 <p><b>This experimental dimension only works for MCM "Manage Inventory" parent publishers.</b>
     *                 <p>Corresponds to "Child network code" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CHILD_NETWORK_CODE,

    /**
     * 
     *                 Breaks down reporting data by mobile app 'resolved' id - either the app store id or '(Not
     *                 applicable)' if the app is not registered in the app store. Note: app ids are not guaranteed to
     *                 be unique across different app stores. Can be used for filtering.
     *                 <p>Corresponds to "App ID" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MOBILE_APP_RESOLVED_ID,

    /**
     * 
     *                 Breaks down reporting data by mobile app name. Can be used for filtering.
     *                 <p>Corresponds to "App names" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MOBILE_APP_NAME,

    /**
     * 
     *                 Breaks down reporting data by device name. Can be used for filtering.
     *                 <p>Corresponds to "Devices" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MOBILE_DEVICE_NAME,

    /**
     * 
     *                 Breaks down reporting data by inventory type. Can be used for filtering.
     *                 <p>Corresponds to "Inventory types" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    MOBILE_INVENTORY_TYPE,

    /**
     * 
     *                 Breaks down reporting data by request type. Can be used for filtering.
     *                 <p>Corresponds to "Request type" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    REQUEST_TYPE,

    /**
     * 
     *                 Status of the ad unit. Not available as a dimension to report on,
     *                 but exists as a dimension in order to filter on it using PQL.
     *                 Valid values correspond to {@link InventoryStatus}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Ad speed.</p>
     *               
     * 
     */
    AD_UNIT_STATUS,

    /**
     * 
     *                 Breaks down reporting data by {@link Creative#id}. This includes regular creatives,
     *                 and master and companions in case of creative sets.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MASTER_COMPANION_CREATIVE_ID,

    /**
     * 
     *                 Breaks down reporting data by creative. This includes regular creatives,
     *                 and master and companions in case of creative sets.
     *                 <p>Corresponds to "Master and Companion creative" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MASTER_COMPANION_CREATIVE_NAME,

    /**
     * 
     *                 Breaks down reporting data by billable audience segment ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AUDIENCE_SEGMENT_ID,

    /**
     * 
     *                 Breaks down reporting data by billable audience segment name.
     *                 <p>Corresponds to "Audience segment (billable)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AUDIENCE_SEGMENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by audience segment data provider name.
     *                 <p>Corresponds to "Data partner" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AUDIENCE_SEGMENT_DATA_PROVIDER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange inventory size.
     *                 <p>Corresponds to "Inventory sizes" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_INVENTORY_SIZE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange inventory size code.
     *               
     * 
     */
    AD_EXCHANGE_INVENTORY_SIZE_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange device category.
     *                 <p>Corresponds to "Device categories" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DEVICE_CATEGORY,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange pricing rule ID.
     *               
     * 
     */
    AD_EXCHANGE_PRICING_RULE_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange pricing rule.
     *                 <p>Corresponds to "Pricing rules" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_PRICING_RULE_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange tag.
     *                 <p>Corresponds to "Tags" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_TAG_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange URL.
     *                 <p>Corresponds to "URLs" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_URL,

    /**
     * 
     *                 Breaks down data by Ad Exchange mapped web property code.
     *               
     * 
     */
    AD_EXCHANGE_WEB_PROPERTY_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange creative size.
     *                 <p>Corresponds to "Creative sizes" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_CREATIVE_SIZES,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange ad type.
     *                 <p>Corresponds to "Ad Types" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AD_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange channel.
     *                 <p>Corresponds to "Channels" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_CHANNEL_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange product.
     *                 <p>Corresponds to "Products" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_PRODUCT_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange product code.
     *               
     * 
     */
    AD_EXCHANGE_PRODUCT_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange site.
     *                 <p>Corresponds to "Sites" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_SITE_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange request source.
     *                 <p>Corresponds to "Request sources" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_REQUEST_SOURCES,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by the Ad Exchange advertiser name that bids
     *                 on ads.
     *                 <p>Corresponds to "Advertisers" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ADVERTISER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by the Ad Exchange brand name that bids on
     *                 ads.
     *                 <p>Corresponds to "Brands" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_BRAND_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange agency.
     *                 <p>Corresponds to "Agencies" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AGENCY,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange bid type code.
     *               
     * 
     */
    AD_EXCHANGE_BID_TYPE_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange branding type code.
     *               
     * 
     */
    AD_EXCHANGE_BRANDING_TYPE_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange branding type. Examples:
     *                 Branded, Anonymous.
     *                 <p>Corresponds to "Branding types" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_BRANDING_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange ad network name. Example:
     *                 Google Adwords.
     *                 <p>Corresponds to "Buyer networks" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_BUYER_NETWORK_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange ad network ID.
     *               
     * 
     */
    AD_EXCHANGE_BUYER_NETWORK_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange custom channel code.
     *               
     * 
     */
    AD_EXCHANGE_CUSTOM_CHANNEL_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange custom channel ID.
     *               
     * 
     */
    AD_EXCHANGE_CUSTOM_CHANNEL_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange date, in Ad Exchange timezone.
     *                 <p>Corresponds to "Days" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DATE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange deal id.
     *                 <p>Corresponds to "Deal IDs" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DEAL_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange deal name.
     *                 <p>Corresponds to "Deal names" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DEAL_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange deal/transaction type. Example:
     *                 Open auction.
     *                 <p>Corresponds to "Transaction types" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_TRANSACTION_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange DSP buyer network name.
     *                 <p>Corresponds to "DSPs" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DSP_BUYER_NETWORK_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange expansion type.
     *                 <p>Corresponds to "Expandable types" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_EXPANSION_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange country code.
     *               
     * 
     */
    AD_EXCHANGE_COUNTRY_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange country name.
     *                 <p>Corresponds to "Countries" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_COUNTRY_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Manager ad unit ID.
     *                 <p>Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DFP_AD_UNIT_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Manager ad unit.
     *                 <p>Corresponds to "DFP Ad Units" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DFP_AD_UNIT,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange inventory ownership.
     *                 <p>Corresponds to "Inventory ownership" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_INVENTORY_OWNERSHIP,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange advertiser domain.
     *                 <p>Corresponds to "Advertiser domains" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ADVERTISER_DOMAIN,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by mobile app name. Similar to the mobile app
     *                 name dimension available for Historical reports.
     *                 <p>Corresponds to "Mobile App names" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DFP_MOBILE_APP_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by mobile app 'resolved' id - either the app
     *                 store id or '(Not applicable)' if the app is not registered in the app store. Note: app ids
     *                 are not guaranteed to be unique across different app stores. Can be used for filtering.
     *                 <p>Corresponds to "Mobile App ID" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_APP_RESOLVED_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange mobile carrier name.
     *                 <p>Corresponds to "Carrier names" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_CARRIER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange mobile device name.
     *                 <p>Corresponds to "Devices" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_DEVICE_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange mobile inventory type.
     *                 <p>Corresponds to "Inventory types" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_INVENTORY_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange month, in Ad Exchange timezone.
     *                 <p>Corresponds to "Months" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MONTH,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange network partner name.
     *                 <p>Corresponds to "Network partner names" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_NETWORK_PARTNER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange operating system version.
     *                 <p>Corresponds to "Operating systems" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_OPERATING_SYSTEM,

    /**
     * 
     *                 Breaks down reporting data by optimization type.
     *                 <p>Corresponds to "Optimization type" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    AD_EXCHANGE_OPTIMIZATION_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange tags.
     *               
     * 
     */
    AD_EXCHANGE_TAG_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange targeting type code.
     *               
     * 
     */
    AD_EXCHANGE_TARGETING_TYPE_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange targeting type.
     *                 <p>Corresponds to "Targeting types" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_TARGETING_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange transaction type code
     *               
     * 
     */
    AD_EXCHANGE_TRANSACTION_TYPE_CODE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange URL ID.
     *               
     * 
     */
    AD_EXCHANGE_URL_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange user bandwidth.
     *                 <p>Corresponds to "Bandwidth" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_USER_BANDWIDTH_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange video ad duration.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_AD_DURATION,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange raw video ad duration.
     *                 <p>Corresponds to "Video ad durations" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_AD_DURATION_RAW,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange video ad type.
     *                 <p>Corresponds to "Video ad types" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_AD_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange week, in Ad Exchange timezone.
     *                 <p>Corresponds to "Weeks" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_WEEK,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange ad location.
     *                 <p>Corresponds to "Ad locations" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AD_LOCATION,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange advertiser vertical.
     *                 <p>Corresponds to "Advertiser verticals" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ADVERTISER_VERTICAL,

    /**
     * 
     *                 Campaign date segment of Nielsen Digital Ad Ratings reporting.
     *                 <p>Corresponds to "Nielsen Digital Ad Ratings segment" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_SEGMENT,

    /**
     * 
     *                 Breaks down reporting data by gender and age group, i.e., MALE_18_TO_20, MALE_21_TO_24,
     *                 MALE_25_TO_29, MALE_30_TO_35, MALE_35_TO_39, MALE_40_TO_44, MALE_45_TO_49, MALE_50_TO_54,
     *                 MALE_55_TO_64, MALE_65_PLUS, FEMALE_18_TO_20, FEMALE_21_TO_24, FEMALE_25_TO_29,
     *                 FEMALE_30_TO_34, FEMALE_35_TO_39, FEMALE_40_TO_44, FEMALE_45_TO_49, FEMALE_50_TO_54,
     *                 FEMALE_55_TO_64, FEMALE_65_PLUS, and OTHER.
     *               
     * 
     */
    NIELSEN_DEMOGRAPHICS,

    /**
     * 
     *                 Data restatement date of Nielsen Digital Ad Ratings data.
     *                 <p>Corresponds to "Nielsen Digital Ad Ratings restatement date" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_RESTATEMENT_DATE,

    /**
     * 
     *                 Breaks down reporting data by device type, i.e., Computer, Mobile and other types.
     *                 
     *                 <p>
     *                 This dimension is supported only for Nielsen columns.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_DEVICE_ID,

    /**
     * 
     *                 Breaks down reporting data by device type, i.e., Computer, Mobile and other types.
     *                 
     *                 <p>
     *                 This dimension is supported only for Nielsen columns.
     *                 <p>Corresponds to "Nielsen Digital Ad Ratings device" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_DEVICE_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link ProposalMarketplaceInfo#buyerAccountId}.
     *                 <p>Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    PROGRAMMATIC_BUYER_ID,

    /**
     * 
     *                 Breaks down reporting data by programmatic buyer name.
     *                 <p>Corresponds to "Programmatic buyer" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PROGRAMMATIC_BUYER_NAME,

    /**
     * 
     *                 Breaks down reporting data by requested ad size(s).
     *                 This can be a chain of sizes or a single size.
     *                 <p>Corresponds to "Requested ad sizes" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    REQUESTED_AD_SIZES,

    /**
     * 
     *                 Breaks down reporting data by the creative size the ad was delivered to.
     *                 <p>Corresponds to "Creative size (delivered)" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed.</p>
     *               
     * 
     */
    CREATIVE_SIZE_DELIVERED,

    /**
     * 
     *                 Breaks down reporting data by the type of transaction that occurred in Ad Exchange.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PROGRAMMATIC_CHANNEL_ID,

    /**
     * 
     *                 Breaks down reporting data by the type of transaction that occurred in Ad Exchange.
     *                 <p>Corresponds to "Programmatic channel" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach.</p>
     *               
     * 
     */
    PROGRAMMATIC_CHANNEL_NAME,

    /**
     * 
     *                 Breaks down data by detected yield partner name.
     *                 <p>Corresponds to "Yield partner (classified)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CLASSIFIED_YIELD_PARTNER_NAME,

    /**
     * 
     *                 Breaks down Demand reporting data by date in the network time zone. Can be used to
     *                 filter by date using ISO 8601's format 'YYYY-MM-DD'".
     *                 <p>Corresponds to "Date" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_DATE,

    /**
     * 
     *                 Breaks down Demand reporting data by week of the year in the network time zone. Cannot be used
     *                 for filtering.
     *                 <p>Corresponds to "Week" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_WEEK,

    /**
     * 
     *                 Breaks down Demand reporting data by month and year in the network time zone. Cannot be used to
     *                 filter.
     *                 <p>Corresponds to "Month and year" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_MONTH_YEAR,

    /**
     * 
     *                 Breaks down Demand reporting data by country criteria ID. Can be used to filter by
     *                 country criteria ID.
     *                 <p>Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_COUNTRY_CRITERIA_ID,

    /**
     * 
     *                 Breaks down Demand reporting data by country name. The country name and the
     *                 country criteria ID are automatically included as columns in the report.
     *                 Can be used to filter by country name using the US English name.
     *                 <p>Corresponds to "Country" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_COUNTRY_NAME,

    /**
     * 
     *                 Breaks down Demand reporting data by inventory type.
     *                 <p>Corresponds to "Inventory type" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_INVENTORY_TYPE,

    /**
     * 
     *                 Breaks down Demand reporting data by the creative size the ad was delivered to.
     *                 <p>Corresponds to "Creative size" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_CREATIVE_SIZE,

    /**
     * 
     *                 Breaks down Demand reporting data by the brand name that bids on ads.
     *                 <p>Corresponds to "Brand" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_BRAND_NAME,

    /**
     * 
     *                 Breaks down Demand reporting data by the advertiser name that bid on ads.
     *                 <p>Corresponds to "Advertiser" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ADVERTISER_NAME,

    /**
     * 
     *                 Breaks down Demand reporting data by Ad Exchange ad network name. Example:
     *                 Google Adwords.
     *                 <p>Corresponds to "Buyer network" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ADX_BUYER_NETWORK_NAME,

    /**
     * 
     *                 Breaks down reporting data by device name.
     *                 <p>Corresponds to "Device" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_MOBILE_DEVICE_NAME,

    /**
     * 
     *                 Breaks down reporting data by the category of device (smartphone, feature phone, tablet,
     *                 or desktop).
     *                 <p>Corresponds to "Device category" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_DEVICE_CATEGORY_NAME,

    /**
     * 
     *                 Breaks down reporting data by the tag id provided by the publisher in the ad request.
     *                 <p>Corresponds to "Tag ID" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_TAG_ID,

    /**
     * 
     *                 Breaks down reporting data by the deal id provided by the publisher in the ad request.
     *                 <p>Corresponds to "Deal IDs" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_DEAL_ID,

    /**
     * 
     *                 Breaks down reporting data by mobile app ID.
     *                 <p>Corresponds to "App ID" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_APP_ID,

    /**
     * 
     *                 Breaks down reporting data by the {@link CustomTargetingKey}s marked as dimensions in inventory
     *                 key-values setup.  To use this dimension, a list of custom targeting key IDs must be specified
     *                 in {@link ReportQuery#customDimensionKeyIds}.
     *               
     * 
     */
    CUSTOM_DIMENSION,

    /**
     * 
     *                 Breaks down reporting data by demand channels.
     *                 <p>Compatible with any of the following report types: Historical, Reach, Ad speed.</p>
     *               
     * 
     */
    DEMAND_CHANNEL_ID,

    /**
     * 
     *                 Breaks down reporting data by demand channel name.
     *                 <p>Corresponds to "Demand channel" in the Ad Manager UI. Compatible with any of the following report types: Historical, Reach, Ad speed.</p>
     *               
     * 
     */
    DEMAND_CHANNEL_NAME,

    /**
     * 
     *                 Breaks down reporting data by top private domain.
     *                 <p>Corresponds to "Domain" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DOMAIN,

    /**
     * 
     *                 Breaks down reporting data by unified pricing rule id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    UNIFIED_PRICING_RULE_ID,

    /**
     * 
     *                 Breaks down reporting data by unified pricing rule name.
     *                 <p>Corresponds to "Unified pricing rule" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    UNIFIED_PRICING_RULE_NAME;

    public String value() {
        return name();
    }

    public static Dimension fromValue(String v) {
        return valueOf(v);
    }

}
