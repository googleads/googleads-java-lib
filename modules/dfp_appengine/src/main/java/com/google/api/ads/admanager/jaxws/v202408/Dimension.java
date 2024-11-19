// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dimension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dimension"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MONTH_AND_YEAR"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *     &lt;enumeration value="DATE_PT"/&gt;
 *     &lt;enumeration value="WEEK_PT"/&gt;
 *     &lt;enumeration value="MONTH_YEAR_PT"/&gt;
 *     &lt;enumeration value="DAY_OF_WEEK_PT"/&gt;
 *     &lt;enumeration value="LINE_ITEM_ID"/&gt;
 *     &lt;enumeration value="LINE_ITEM_NAME"/&gt;
 *     &lt;enumeration value="LINE_ITEM_TYPE"/&gt;
 *     &lt;enumeration value="ORDER_ID"/&gt;
 *     &lt;enumeration value="ORDER_NAME"/&gt;
 *     &lt;enumeration value="ORDER_DELIVERY_STATUS"/&gt;
 *     &lt;enumeration value="ADVERTISER_ID"/&gt;
 *     &lt;enumeration value="ADVERTISER_NAME"/&gt;
 *     &lt;enumeration value="AD_NETWORK_ID"/&gt;
 *     &lt;enumeration value="AD_NETWORK_NAME"/&gt;
 *     &lt;enumeration value="SALESPERSON_ID"/&gt;
 *     &lt;enumeration value="SALESPERSON_NAME"/&gt;
 *     &lt;enumeration value="CREATIVE_ID"/&gt;
 *     &lt;enumeration value="CREATIVE_NAME"/&gt;
 *     &lt;enumeration value="CREATIVE_TYPE"/&gt;
 *     &lt;enumeration value="CREATIVE_BILLING_TYPE"/&gt;
 *     &lt;enumeration value="CUSTOM_EVENT_ID"/&gt;
 *     &lt;enumeration value="CUSTOM_EVENT_NAME"/&gt;
 *     &lt;enumeration value="CUSTOM_EVENT_TYPE"/&gt;
 *     &lt;enumeration value="CREATIVE_SIZE"/&gt;
 *     &lt;enumeration value="AD_UNIT_ID"/&gt;
 *     &lt;enumeration value="AD_UNIT_NAME"/&gt;
 *     &lt;enumeration value="PARENT_AD_UNIT_ID"/&gt;
 *     &lt;enumeration value="PARENT_AD_UNIT_NAME"/&gt;
 *     &lt;enumeration value="PLACEMENT_ID"/&gt;
 *     &lt;enumeration value="PLACEMENT_NAME"/&gt;
 *     &lt;enumeration value="PLACEMENT_STATUS"/&gt;
 *     &lt;enumeration value="TARGETING"/&gt;
 *     &lt;enumeration value="BROWSER_NAME"/&gt;
 *     &lt;enumeration value="DEVICE_CATEGORY_ID"/&gt;
 *     &lt;enumeration value="DEVICE_CATEGORY_NAME"/&gt;
 *     &lt;enumeration value="COUNTRY_CRITERIA_ID"/&gt;
 *     &lt;enumeration value="COUNTRY_CODE"/&gt;
 *     &lt;enumeration value="COUNTRY_NAME"/&gt;
 *     &lt;enumeration value="REGION_CRITERIA_ID"/&gt;
 *     &lt;enumeration value="REGION_NAME"/&gt;
 *     &lt;enumeration value="CITY_CRITERIA_ID"/&gt;
 *     &lt;enumeration value="CITY_NAME"/&gt;
 *     &lt;enumeration value="METRO_CRITERIA_ID"/&gt;
 *     &lt;enumeration value="METRO_NAME"/&gt;
 *     &lt;enumeration value="POSTAL_CODE_CRITERIA_ID"/&gt;
 *     &lt;enumeration value="POSTAL_CODE"/&gt;
 *     &lt;enumeration value="CUSTOM_TARGETING_VALUE_ID"/&gt;
 *     &lt;enumeration value="CUSTOM_CRITERIA"/&gt;
 *     &lt;enumeration value="CONTENT_ID"/&gt;
 *     &lt;enumeration value="CONTENT_NAME"/&gt;
 *     &lt;enumeration value="CONTENT_BUNDLE_ID"/&gt;
 *     &lt;enumeration value="CONTENT_BUNDLE_NAME"/&gt;
 *     &lt;enumeration value="CMS_METADATA"/&gt;
 *     &lt;enumeration value="VIDEO_FALLBACK_POSITION"/&gt;
 *     &lt;enumeration value="POSITION_OF_POD"/&gt;
 *     &lt;enumeration value="POSITION_IN_POD"/&gt;
 *     &lt;enumeration value="CUSTOM_SPOT_ID"/&gt;
 *     &lt;enumeration value="CUSTOM_SPOT_NAME"/&gt;
 *     &lt;enumeration value="VIDEO_REDIRECT_THIRD_PARTY"/&gt;
 *     &lt;enumeration value="VIDEO_BREAK_TYPE"/&gt;
 *     &lt;enumeration value="VIDEO_BREAK_TYPE_NAME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST_VERSION"/&gt;
 *     &lt;enumeration value="VIDEO_AD_REQUEST_DURATION_ID"/&gt;
 *     &lt;enumeration value="VIDEO_AD_REQUEST_DURATION"/&gt;
 *     &lt;enumeration value="VIDEO_PLCMT_ID"/&gt;
 *     &lt;enumeration value="VIDEO_PLCMT_NAME"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_ID"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_NAME"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_LABEL_ID"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_LABEL_NAME"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_ASSIGNMENT_ID"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_ASSIGNMENT_NAME"/&gt;
 *     &lt;enumeration value="INVENTORY_SHARE_ASSIGNMENT_ID"/&gt;
 *     &lt;enumeration value="INVENTORY_SHARE_ASSIGNMENT_NAME"/&gt;
 *     &lt;enumeration value="INVENTORY_SHARE_OUTCOME"/&gt;
 *     &lt;enumeration value="GRP_DEMOGRAPHICS"/&gt;
 *     &lt;enumeration value="AD_REQUEST_AD_UNIT_SIZES"/&gt;
 *     &lt;enumeration value="AD_REQUEST_CUSTOM_CRITERIA"/&gt;
 *     &lt;enumeration value="IS_FIRST_LOOK_DEAL"/&gt;
 *     &lt;enumeration value="IS_ADX_DIRECT"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_ID"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_NAME"/&gt;
 *     &lt;enumeration value="YIELD_PARTNER"/&gt;
 *     &lt;enumeration value="YIELD_PARTNER_TAG"/&gt;
 *     &lt;enumeration value="EXCHANGE_BIDDING_DEAL_ID"/&gt;
 *     &lt;enumeration value="EXCHANGE_BIDDING_DEAL_TYPE"/&gt;
 *     &lt;enumeration value="CLASSIFIED_ADVERTISER_ID"/&gt;
 *     &lt;enumeration value="CLASSIFIED_ADVERTISER_NAME"/&gt;
 *     &lt;enumeration value="CLASSIFIED_BRAND_ID"/&gt;
 *     &lt;enumeration value="CLASSIFIED_BRAND_NAME"/&gt;
 *     &lt;enumeration value="MEDIATION_TYPE"/&gt;
 *     &lt;enumeration value="NATIVE_TEMPLATE_ID"/&gt;
 *     &lt;enumeration value="NATIVE_TEMPLATE_NAME"/&gt;
 *     &lt;enumeration value="NATIVE_STYLE_ID"/&gt;
 *     &lt;enumeration value="NATIVE_STYLE_NAME"/&gt;
 *     &lt;enumeration value="CHILD_NETWORK_CODE"/&gt;
 *     &lt;enumeration value="MOBILE_APP_RESOLVED_ID"/&gt;
 *     &lt;enumeration value="MOBILE_APP_NAME"/&gt;
 *     &lt;enumeration value="MOBILE_DEVICE_NAME"/&gt;
 *     &lt;enumeration value="MOBILE_INVENTORY_TYPE"/&gt;
 *     &lt;enumeration value="OPERATING_SYSTEM_VERSION_ID"/&gt;
 *     &lt;enumeration value="OPERATING_SYSTEM_VERSION_NAME"/&gt;
 *     &lt;enumeration value="REQUEST_TYPE"/&gt;
 *     &lt;enumeration value="AD_UNIT_STATUS"/&gt;
 *     &lt;enumeration value="MASTER_COMPANION_CREATIVE_ID"/&gt;
 *     &lt;enumeration value="MASTER_COMPANION_CREATIVE_NAME"/&gt;
 *     &lt;enumeration value="AUDIENCE_SEGMENT_ID"/&gt;
 *     &lt;enumeration value="AUDIENCE_SEGMENT_NAME"/&gt;
 *     &lt;enumeration value="AUDIENCE_SEGMENT_DATA_PROVIDER_NAME"/&gt;
 *     &lt;enumeration value="WEB_PROPERTY_CODE"/&gt;
 *     &lt;enumeration value="BUYING_AGENCY_NAME"/&gt;
 *     &lt;enumeration value="BUYER_NETWORK_ID"/&gt;
 *     &lt;enumeration value="BUYER_NETWORK_NAME"/&gt;
 *     &lt;enumeration value="BIDDER_ID"/&gt;
 *     &lt;enumeration value="BIDDER_NAME"/&gt;
 *     &lt;enumeration value="ADVERTISER_DOMAIN_NAME"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_OPTIMIZATION_TYPE"/&gt;
 *     &lt;enumeration value="ADVERTISER_VERTICAL_NAME"/&gt;
 *     &lt;enumeration value="NIELSEN_SEGMENT"/&gt;
 *     &lt;enumeration value="NIELSEN_DEMOGRAPHICS"/&gt;
 *     &lt;enumeration value="NIELSEN_RESTATEMENT_DATE"/&gt;
 *     &lt;enumeration value="NIELSEN_DEVICE_ID"/&gt;
 *     &lt;enumeration value="NIELSEN_DEVICE_NAME"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_BUYER_ID"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_BUYER_NAME"/&gt;
 *     &lt;enumeration value="REQUESTED_AD_SIZES"/&gt;
 *     &lt;enumeration value="CREATIVE_SIZE_DELIVERED"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_CHANNEL_ID"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_CHANNEL_NAME"/&gt;
 *     &lt;enumeration value="CLASSIFIED_YIELD_PARTNER_NAME"/&gt;
 *     &lt;enumeration value="DP_DATE"/&gt;
 *     &lt;enumeration value="DP_WEEK"/&gt;
 *     &lt;enumeration value="DP_MONTH_YEAR"/&gt;
 *     &lt;enumeration value="DP_COUNTRY_CRITERIA_ID"/&gt;
 *     &lt;enumeration value="DP_COUNTRY_NAME"/&gt;
 *     &lt;enumeration value="DP_INVENTORY_TYPE"/&gt;
 *     &lt;enumeration value="DP_CREATIVE_SIZE"/&gt;
 *     &lt;enumeration value="DP_BRAND_NAME"/&gt;
 *     &lt;enumeration value="DP_ADVERTISER_NAME"/&gt;
 *     &lt;enumeration value="DP_ADX_BUYER_NETWORK_NAME"/&gt;
 *     &lt;enumeration value="DP_MOBILE_DEVICE_NAME"/&gt;
 *     &lt;enumeration value="DP_DEVICE_CATEGORY_NAME"/&gt;
 *     &lt;enumeration value="DP_TAG_ID"/&gt;
 *     &lt;enumeration value="DP_DEAL_ID"/&gt;
 *     &lt;enumeration value="DP_APP_ID"/&gt;
 *     &lt;enumeration value="CUSTOM_DIMENSION"/&gt;
 *     &lt;enumeration value="DEMAND_CHANNEL_ID"/&gt;
 *     &lt;enumeration value="DEMAND_CHANNEL_NAME"/&gt;
 *     &lt;enumeration value="DOMAIN"/&gt;
 *     &lt;enumeration value="SERVING_RESTRICTION_ID"/&gt;
 *     &lt;enumeration value="SERVING_RESTRICTION_NAME"/&gt;
 *     &lt;enumeration value="UNIFIED_PRICING_RULE_ID"/&gt;
 *     &lt;enumeration value="UNIFIED_PRICING_RULE_NAME"/&gt;
 *     &lt;enumeration value="FIRST_LOOK_PRICING_RULE_ID"/&gt;
 *     &lt;enumeration value="FIRST_LOOK_PRICING_RULE_NAME"/&gt;
 *     &lt;enumeration value="BID_RANGE"/&gt;
 *     &lt;enumeration value="BID_REJECTION_REASON"/&gt;
 *     &lt;enumeration value="BID_REJECTION_REASON_NAME"/&gt;
 *     &lt;enumeration value="AD_TECHNOLOGY_PROVIDER_DOMAIN"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_DEAL_ID"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_DEAL_NAME"/&gt;
 *     &lt;enumeration value="AD_TECHNOLOGY_PROVIDER_ID"/&gt;
 *     &lt;enumeration value="AD_TECHNOLOGY_PROVIDER_NAME"/&gt;
 *     &lt;enumeration value="TCF_VENDOR_ID"/&gt;
 *     &lt;enumeration value="TCF_VENDOR_NAME"/&gt;
 *     &lt;enumeration value="SITE_NAME"/&gt;
 *     &lt;enumeration value="CHANNEL_NAME"/&gt;
 *     &lt;enumeration value="URL_ID"/&gt;
 *     &lt;enumeration value="URL_NAME"/&gt;
 *     &lt;enumeration value="VIDEO_AD_DURATION"/&gt;
 *     &lt;enumeration value="VIDEO_AD_TYPE_ID"/&gt;
 *     &lt;enumeration value="VIDEO_AD_TYPE_NAME"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_PRODUCT_CODE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_PRODUCT_NAME"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_ID"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_NAME"/&gt;
 *     &lt;enumeration value="AD_TYPE_ID"/&gt;
 *     &lt;enumeration value="AD_TYPE_NAME"/&gt;
 *     &lt;enumeration value="AD_LOCATION_ID"/&gt;
 *     &lt;enumeration value="AD_LOCATION_NAME"/&gt;
 *     &lt;enumeration value="TARGETING_TYPE_CODE"/&gt;
 *     &lt;enumeration value="TARGETING_TYPE_NAME"/&gt;
 *     &lt;enumeration value="BRANDING_TYPE_CODE"/&gt;
 *     &lt;enumeration value="BRANDING_TYPE_NAME"/&gt;
 *     &lt;enumeration value="BANDWIDTH_ID"/&gt;
 *     &lt;enumeration value="BANDWIDTH_NAME"/&gt;
 *     &lt;enumeration value="CARRIER_ID"/&gt;
 *     &lt;enumeration value="CARRIER_NAME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
     *                 <p>Corresponds to "Month and year" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Partner finance, YouTube consolidated.</p>
     *               
     * 
     */
    MONTH_AND_YEAR,

    /**
     * 
     *                 Breaks down reporting data by week of the year in the network time zone. Cannot be used for
     *                 filtering.
     *                 <p>Corresponds to "Week" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, YouTube consolidated.</p>
     *               
     * 
     */
    WEEK,

    /**
     * 
     *                 Breaks down reporting data by date in the network time zone. Can be used to filter by date
     *                 using ISO 8601's format 'YYYY-MM-DD'".
     *                 <p>Corresponds to "Date" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, Real-time video, YouTube consolidated.</p>
     *               
     * 
     */
    DATE,

    /**
     * 
     *                 Breaks down reporting data by day of the week in the network time zone. Can
     *                 be used to filter by day of the week using the index of the day (from 1 for
     *                 Monday is 1 to 7 for Sunday).
     *                 <p>Corresponds to "Day of week" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, YouTube consolidated.</p>
     *               
     * 
     */
    DAY,

    /**
     * 
     *                 Breaks down reporting data by hour of the day in the network time zone. Can
     *                 be used to filter by hour of the day (from 0 to 23).
     *                 <p>Corresponds to "Hour" in the Ad Manager UI. Compatible with any of the following report types: Historical, Real-time video.</p>
     *               
     * 
     */
    HOUR,

    /**
     * 
     *                 Breaks down reporting data by date in the PT time zone. Can be used to filter by date
     *                 using ISO 8601's format 'YYYY-MM-DD'". Can only be used when time zone type is PACIFIC.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DATE_PT,

    /**
     * 
     *                 Breaks down reporting data by week of the year in the PT time zone. Cannot be used for
     *                 filtering. Can only be used when time zone type is PACIFIC.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    WEEK_PT,

    /**
     * 
     *                 Breaks down reporting data by month and year in the PT time zone. Can be used to filter on
     *                 month using ISO 4601 format 'YYYY-MM'. Can only be used when time zone type is PACIFIC.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MONTH_YEAR_PT,

    /**
     * 
     *                 Breaks down reporting data by day of the week in the PT time zone. Can
     *                 be used to filter by day of the week using the index of the day (from 1 for
     *                 Monday is 1 to 7 for Sunday). Can only be used when time zone type is PACIFIC.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DAY_OF_WEEK_PT,

    /**
     * 
     *                 Breaks down reporting data by {@link LineItem#id}. Can be used to
     *                 filter by {@link LineItem#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, Real-time video.</p>
     *               
     * 
     */
    LINE_ITEM_ID,

    /**
     * 
     *                 Breaks down reporting data by line item. {@link LineItem#name} and
     *                 {@link LineItem#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link LineItem#name}.
     *                 <p>Corresponds to "Line item" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, Real-time video.</p>
     *               
     * 
     */
    LINE_ITEM_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link LineItem#lineItemType}. Can be used
     *                 to filter by line item type using {@link LineItemType} enumeration names.
     *                 <p>Corresponds to "Line item type" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, Real-time video.</p>
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
     *                 <p>Compatible with any of the following report types: Historical, Ad speed, Real-time video.</p>
     *               
     * 
     */
    CREATIVE_ID,

    /**
     * 
     *                 Breaks down reporting data by creative. {@link Creative#name} and
     *                 {@link Creative#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link Creative#name}.
     *                 <p>Corresponds to "Creative" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed, Real-time video.</p>
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
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Ad speed, Real-time video.</p>
     *               
     * 
     */
    AD_UNIT_ID,

    /**
     * 
     *                 Breaks down reporting data by ad unit. {@link AdUnit#name} and
     *                 {@link AdUnit#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link AdUnit#name}.
     *                 <p>Corresponds to "Ad unit" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Ad speed, Real-time video.</p>
     *               
     * 
     */
    AD_UNIT_NAME,

    /**
     * 
     *                 Used to filter on all the descendants of an ad unit by {@link AdUnit#id}. Not available as a
     *                 dimension to report on.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, Real-time video.</p>
     *               
     * 
     */
    PARENT_AD_UNIT_ID,

    /**
     * 
     *                 Used to filter on all the descendants of an ad unit by {@link AdUnit#name}. Not available as a
     *                 dimension to report on.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, Real-time video.</p>
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
     *                 <p>Compatible with any of the following report types: Historical, Ad speed, Real-time video.</p>
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
     *                 <p>Corresponds to "Device category" in the Ad Manager UI. Compatible with any of the following report types: Historical, Ad speed, Real-time video.</p>
     *               
     * 
     */
    DEVICE_CATEGORY_NAME,

    /**
     * 
     *                 Breaks down reporting data by country criteria ID. Can be used to filter by country criteria
     *                 ID.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, YouTube consolidated.</p>
     *               
     * 
     */
    COUNTRY_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by country code.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    COUNTRY_CODE,

    /**
     * 
     *                 Breaks down reporting data by country name. The country name and the
     *                 country criteria ID are automatically included as columns in the report.
     *                 Can be used to filter by country name using the US English name.
     *                 <p>Corresponds to "Country" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, Reach, Ad speed, YouTube consolidated.</p>
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
     *                 Breaks down reporting data by {@link Content#id}. Can be used to filter by
     *                 {@link Content#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, YouTube consolidated.</p>
     *               
     * 
     */
    CONTENT_ID,

    /**
     * 
     *                 Breaks down reporting data by content. {@link Content#name} and
     *                 {@link Content#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link Content#name}.
     *                 <p>Corresponds to "Content" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, YouTube consolidated.</p>
     *               
     * 
     */
    CONTENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link ContentBundle#id}. Can be used to filter
     *                 by {@link ContentBundle#id}.
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, YouTube consolidated.</p>
     *               
     * 
     */
    CONTENT_BUNDLE_ID,

    /**
     * 
     *                 Breaks down reporting data by content bundle. {@link ContentBundle#name} and
     *                 {@link ContentBundle#id} are automatically included as columns in the
     *                 report. Can be used to filter by {@link ContentBundle#name}.
     *                 <p>Corresponds to "Content bundle" in the Ad Manager UI. Compatible with any of the following report types: Historical, Future sell-through, YouTube consolidated.</p>
     *               
     * 
     */
    CONTENT_BUNDLE_NAME,

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
     *                 <p>Corresponds to "Position of pod" in the Ad Manager UI. Compatible with any of the following report types: Historical, Real-time video.</p>
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
     *                 Breaks down reporting data by the ID of the type of video placement as defined by the updated
     *                 IAB definition. The values of "in-stream" and "accompanying content" are declared via publisher
     *                 inputted URL parameters. The values of "interstitial" and "no content" are populated
     *                 automatically based on the declared inventory type. The video placement dimension only applies
     *                 to backfill traffic.
     *               
     * 
     */
    VIDEO_PLCMT_ID,

    /**
     * 
     *                 Breaks down reporting data by the name of the type of video placement as defined by the updated
     *                 IAB definition. The values of "in-stream" and "accompanying content" are declared via publisher
     *                 inputted URL parameters. The values of "interstitial" and "no content" are populated
     *                 automatically based on the declared inventory type. The video placement dimension only applies
     *                 to backfill traffic.
     *                 <p>Corresponds to "Video placement (new)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_PLCMT_NAME,

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
     *                 Break down the report by a boolean indicator. It's TRUE for AdX Direct traffic. It can be used
     *                 both as a dimension or dimension filter. As a filter, it can only be used with the string
     *                 values "true" and "false".
     *                 <p>Corresponds to "Is AdX Direct" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    IS_ADX_DIRECT,

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
     *                 The ID of an exchange bidding deal.
     *                 <p>Corresponds to "Exchange bidding deal id" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    EXCHANGE_BIDDING_DEAL_ID,

    /**
     * 
     *                 The type of an exchange bidding deal.
     *                 <p>Corresponds to "Exchange bidding deal type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    EXCHANGE_BIDDING_DEAL_TYPE,

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
     *                 <p><b>This dimension only works for MCM "Manage Inventory" parent publishers.</b>
     *                 <p>Corresponds to "Child network code" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CHILD_NETWORK_CODE,

    /**
     * 
     *                 Breaks down reporting data by mobile app ID received in the ad request (which may be made up).
     *                 If app ID is not available, '(Not applicable)' will be returned. Special values like 'null' and
     *                 'unidentified' will be reported as '(Not applicable)'. Can be used for filtering.
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
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Mobile OS, Devices. Compatible with the "Historical" report type.</p>
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
     *                 Breaks down reporting data by OS version id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPERATING_SYSTEM_VERSION_ID,

    /**
     * 
     *                 Breaks down reporting data by OS version name.
     *                 <p>Corresponds to "Operating system" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPERATING_SYSTEM_VERSION_NAME,

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
     *                 <p>Compatible with any of the following report types: Historical, Future sell-through, Ad speed, Real-time video.</p>
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
     *                 Breaks down data by web property code.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    WEB_PROPERTY_CODE,

    /**
     * 
     *                 Breaks down reporting data by agency.
     *                 <p>Corresponds to "Buying agency" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BUYING_AGENCY_NAME,

    /**
     * 
     *                 Breaks down reporting data by buyer network Id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BUYER_NETWORK_ID,

    /**
     * 
     *                 Breaks down reporting data by buyer network name.
     *                 <p>Corresponds to "Buyer network" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BUYER_NETWORK_NAME,

    /**
     * 
     *                 Breaks down reporting data by Bidder ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BIDDER_ID,

    /**
     * 
     *                 Breaks down reporting data by Bidder name.
     *                 <p>Corresponds to "Bidder" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BIDDER_NAME,

    /**
     * 
     *                 Breaks down reporting data by advertiser domain.
     *                 <p>Corresponds to "Advertiser domain" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADVERTISER_DOMAIN_NAME,

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
     *                 Breaks down reporting data by advertiser vertical.
     *                 <p>Corresponds to "Advertiser vertical" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADVERTISER_VERTICAL_NAME,

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
     *                 Breaks down reporting data by serving restriction id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    SERVING_RESTRICTION_ID,

    /**
     * 
     *                 Breaks down reporting data by serving restriction name.
     *                 <p>Corresponds to "Serving restriction" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    SERVING_RESTRICTION_NAME,

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
    UNIFIED_PRICING_RULE_NAME,

    /**
     * 
     *                 Breaks down reporting data by first price pricing rule id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    FIRST_LOOK_PRICING_RULE_ID,

    /**
     * 
     *                 Breaks down reporting data by first price pricing rule name.
     *                 <p>Corresponds to "First look pricing rule" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    FIRST_LOOK_PRICING_RULE_NAME,

    /**
     * 
     *                 Breaks down reporting data by the range within which the bid falls, divided into $0.10 buckets.
     *                 <p>Corresponds to "Bid range" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BID_RANGE,

    /**
     * 
     *                 Breaks down reporting data by the ID of the reason the bid lost or did not participate in the
     *                 auction.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BID_REJECTION_REASON,

    /**
     * 
     *                 Breaks down reporting data by the reason the bid lost or did not participate in the auction.
     *                 <p>Corresponds to "Bid rejection reason" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BID_REJECTION_REASON_NAME,

    /**
     * 
     *                 Breaks down reporting data by the domain of the ad technology provider (ATP) associated with
     *                 the bid.
     *                 <p>Corresponds to "Ad technology provider domain" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_TECHNOLOGY_PROVIDER_DOMAIN,

    /**
     * 
     *                 Breaks down reporting data by programmatic deal ID.
     *                 <p>Corresponds to "Programmatic deal ID" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PROGRAMMATIC_DEAL_ID,

    /**
     * 
     *                 Breaks down reporting data by programmatic deal name.
     *                 <p>Corresponds to "Programmatic deal name" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PROGRAMMATIC_DEAL_NAME,

    /**
     * 
     *                 Breaks down reporting data by the ID of the ad technology provider (ATP) associated with the
     *                 bid.
     *                 <p>Corresponds to "Ad technology provider ID" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_TECHNOLOGY_PROVIDER_ID,

    /**
     * 
     *                 Breaks down reporting data by the ad technology provider (ATP) associated with the bid.
     *                 <p>Corresponds to "Ad technology provider" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_TECHNOLOGY_PROVIDER_NAME,

    /**
     * 
     *                 Breaks down reporting data by the ID of the ad technology provider as it appears on the Global
     *                 Vendor List (GVL).
     *                 <p>Corresponds to "TCF vendor ID" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TCF_VENDOR_ID,

    /**
     * 
     *                 Breaks down reporting data by the name of the ad technology provider as it appears on the
     *                 Global Vendor List (GVL).
     *                 <p>Corresponds to "TCF vendor" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TCF_VENDOR_NAME,

    /**
     * 
     *                 Breaks down reporting data by site.
     *                 <p>Corresponds to "Site" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    SITE_NAME,

    /**
     * 
     *                 Breaks down reporting data by channels.
     *                 <p>Corresponds to "Channel" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CHANNEL_NAME,

    /**
     * 
     *                 Breaks down reporting data by URL ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    URL_ID,

    /**
     * 
     *                 Breaks down reporting data by URL name.
     *                 <p>Corresponds to "URL" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    URL_NAME,

    /**
     * 
     *                 Breaks down reporting data by video ad duration.
     *                 <p>Corresponds to "Video ad duration" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_AD_DURATION,

    /**
     * 
     *                 Breaks down reporting data by video ad type Id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_AD_TYPE_ID,

    /**
     * 
     *                 Breaks down reporting data by video ad type.
     *                 <p>Corresponds to "Video ad type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_AD_TYPE_NAME,

    /**
     * 
     *                 Breaks down reporting data by Ad Exchange product code.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_PRODUCT_CODE,

    /**
     * 
     *                 Breaks down reporting data by Ad Exchange product.
     *                 <p>Corresponds to "Ad Exchange product" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_PRODUCT_NAME,

    /**
     * 
     *                 Breaks down reporting data by Dynamic allocation ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_ID,

    /**
     * 
     *                 Breaks down reporting data by Dynamic allocation.
     *                 <p>Corresponds to "Dynamic allocation" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_NAME,

    /**
     * 
     *                 Breaks down reporting data by Ad type ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_TYPE_ID,

    /**
     * 
     *                 Breaks down reporting data by Ad type.
     *                 <p>Corresponds to "Ad type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_TYPE_NAME,

    /**
     * 
     *                 Breaks down reporting data by Ad location ID.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_LOCATION_ID,

    /**
     * 
     *                 Breaks down reporting data by Ad location.
     *                 <p>Corresponds to "Ad location" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_LOCATION_NAME,

    /**
     * 
     *                 Breaks down reporting data by Targeting type code.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TARGETING_TYPE_CODE,

    /**
     * 
     *                 Breaks down reporting data by Targeting type.
     *                 <p>Corresponds to "Targeting type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TARGETING_TYPE_NAME,

    /**
     * 
     *                 Breaks down reporting data by Branding type code.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BRANDING_TYPE_CODE,

    /**
     * 
     *                 Breaks down reporting data by Branding type.
     *                 <p>Corresponds to "Branding type" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BRANDING_TYPE_NAME,

    /**
     * 
     *                 Breaks down reporting data by Bandwidth Id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BANDWIDTH_ID,

    /**
     * 
     *                 Breaks down reporting data by Bandwidth name.
     *                 <p>Corresponds to "Bandwidth" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BANDWIDTH_NAME,

    /**
     * 
     *                 Breaks down reporting data by Carrier Id.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CARRIER_ID,

    /**
     * 
     *                 Breaks down reporting data by Carrier name.
     *                 <p>Corresponds to "Carrier" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CARRIER_NAME;

    public String value() {
        return name();
    }

    public static Dimension fromValue(String v) {
        return valueOf(v);
    }

}
