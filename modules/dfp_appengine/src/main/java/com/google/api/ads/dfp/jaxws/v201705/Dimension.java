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


package com.google.api.ads.dfp.jaxws.v201705;

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
 *     &lt;enumeration value="AGGREGATED_DEMAND_CHANNEL"/>
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
 *     &lt;enumeration value="CONTENT_HIERARCHY"/>
 *     &lt;enumeration value="VIDEO_FALLBACK_POSITION"/>
 *     &lt;enumeration value="POSITION_OF_POD"/>
 *     &lt;enumeration value="POSITION_IN_POD"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_ID"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_NAME"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_LABEL_ID"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_LABEL_NAME"/>
 *     &lt;enumeration value="GRP_DEMOGRAPHICS"/>
 *     &lt;enumeration value="AD_REQUEST_SIZE"/>
 *     &lt;enumeration value="AD_REQUEST_AD_UNIT_SIZES"/>
 *     &lt;enumeration value="AD_REQUEST_CUSTOM_CRITERIA"/>
 *     &lt;enumeration value="BUYER_ID"/>
 *     &lt;enumeration value="BUYER_NAME"/>
 *     &lt;enumeration value="IS_FIRST_LOOK_DEAL"/>
 *     &lt;enumeration value="MEDIATION_GROUP_ID"/>
 *     &lt;enumeration value="MEDIATION_GROUP_NAME"/>
 *     &lt;enumeration value="MEDIATION_NETWORK"/>
 *     &lt;enumeration value="MEDIATION_NETWORK_TAG"/>
 *     &lt;enumeration value="MEDIATION_TYPE"/>
 *     &lt;enumeration value="NATIVE_TEMPLATE_ID"/>
 *     &lt;enumeration value="NATIVE_TEMPLATE_NAME"/>
 *     &lt;enumeration value="NATIVE_STYLE_ID"/>
 *     &lt;enumeration value="NATIVE_STYLE_NAME"/>
 *     &lt;enumeration value="MOBILE_APP_NAME"/>
 *     &lt;enumeration value="MOBILE_DEVICE_NAME"/>
 *     &lt;enumeration value="MOBILE_INVENTORY_TYPE"/>
 *     &lt;enumeration value="VERIFIED_ADVERTISER_ID"/>
 *     &lt;enumeration value="VERIFIED_ADVERTISER_NAME"/>
 *     &lt;enumeration value="AD_UNIT_STATUS"/>
 *     &lt;enumeration value="MASTER_COMPANION_CREATIVE_ID"/>
 *     &lt;enumeration value="MASTER_COMPANION_CREATIVE_NAME"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_ID"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_NAME"/>
 *     &lt;enumeration value="PROPOSAL_ID"/>
 *     &lt;enumeration value="PROPOSAL_NAME"/>
 *     &lt;enumeration value="ALL_SALESPEOPLE_ID"/>
 *     &lt;enumeration value="ALL_SALESPEOPLE_NAME"/>
 *     &lt;enumeration value="SALES_TEAM_ID"/>
 *     &lt;enumeration value="SALES_TEAM_NAME"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_ID"/>
 *     &lt;enumeration value="PROPOSAL_AGENCY_NAME"/>
 *     &lt;enumeration value="PRODUCT_ID"/>
 *     &lt;enumeration value="PRODUCT_NAME"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_ID"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_NAME"/>
 *     &lt;enumeration value="RATE_CARD_ID"/>
 *     &lt;enumeration value="RATE_CARD_NAME"/>
 *     &lt;enumeration value="WORKFLOW_ID"/>
 *     &lt;enumeration value="WORKFLOW_NAME"/>
 *     &lt;enumeration value="PACKAGE_ID"/>
 *     &lt;enumeration value="PACKAGE_NAME"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_ID"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_NAME"/>
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
 *     &lt;enumeration value="AD_EXCHANGE_BID_TYPE"/>
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
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_APP_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_CARRIER_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_DEVICE_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_MOBILE_INVENTORY_TYPE"/>
 *     &lt;enumeration value="AD_EXCHANGE_MONTH"/>
 *     &lt;enumeration value="AD_EXCHANGE_NETWORK_PARTNER_NAME"/>
 *     &lt;enumeration value="AD_EXCHANGE_OPERATING_SYSTEM"/>
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
 *     &lt;enumeration value="PROGRAMMATIC_BUYER_ID"/>
 *     &lt;enumeration value="PROGRAMMATIC_BUYER_NAME"/>
 *     &lt;enumeration value="REQUESTED_AD_SIZES"/>
 *     &lt;enumeration value="CREATIVE_SIZE_DELIVERED"/>
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
     *                 Breaks down reporting data by month and year in the network time zone. Can
     *                 be used to filter on month using ISO 4601 format 'YYYY-MM'.
     *                 
     *                 <p><b>Note:</b> In v201802 and later, this dimension is compatible with the following
     *                 time zone types:
     *                 <ul>
     *                 <li> {@link TimeZoneType.PUBLISHER}
     *                 <li> {@link TimeZoneType.PROPOSAL_LOCAL}
     *                 </ul>
     *               
     * 
     */
    MONTH_AND_YEAR,

    /**
     * 
     *                 Breaks down reporting data by week of the year in the network time zone.
     *                 Cannot be used for filtering.
     *                 
     *                 <p><b>Note:</b> In v201802 and later, this dimension is compatible with the following
     *                 time zone types:
     *                 <ul>
     *                 <li> {@link TimeZoneType.PUBLISHER}
     *                 <li> {@link TimeZoneType.PROPOSAL_LOCAL}
     *                 </ul>
     *               
     * 
     */
    WEEK,

    /**
     * 
     *                 Breaks down reporting data by date in the network time zone. Can be used to
     *                 filter by date using ISO 8601's format 'YYYY-MM-DD'".
     *                 
     *                 <p><b>Note:</b> In v201802 and later, this dimension is compatible with the following
     *                 time zone types:
     *                 <ul>
     *                 <li> {@link TimeZoneType.PUBLISHER}
     *                 <li> {@link TimeZoneType.PROPOSAL_LOCAL}
     *                 </ul>
     *               
     * 
     */
    DATE,

    /**
     * 
     *                 Breaks down reporting data by day of the week in the network time zone. Can
     *                 be used to filter by day of the week using the index of the day (from 1 for
     *                 Monday is 1 to 7 for Sunday).
     *               
     * 
     */
    DAY,

    /**
     * 
     *                 Breaks down reporting data by hour of the day in the network time zone. Can
     *                 be used to filter by hour of the day (from 0 to 23).
     *               
     * 
     */
    HOUR,

    /**
     * 
     *                 Breaks down reporting data by {@link LineItem#id}. Can be used to
     *                 filter by {@link LineItem#id}.
     *               
     * 
     */
    LINE_ITEM_ID,

    /**
     * 
     *                 Breaks down reporting data by line item. {@link LineItem#name} and
     *                 {@link LineItem#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link LineItem#name}.
     *               
     * 
     */
    LINE_ITEM_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link LineItem#lineItemType}. Can be used
     *                 to filter by line item type using {@link LineItemType} enumeration names.
     *               
     * 
     */
    LINE_ITEM_TYPE,

    /**
     * 
     *                 Breaks down reporting data by aggregated demand channel type.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    AGGREGATED_DEMAND_CHANNEL,

    /**
     * 
     *                 Breaks down reporting data by {@link Order#id}. Can be used to filter by
     *                 {@link Order#id}.
     *               
     * 
     */
    ORDER_ID,

    /**
     * 
     *                 Breaks down reporting data by order. {@link Order#name} and
     *                 {@link Order#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link Order#name}.
     *               
     * 
     */
    ORDER_NAME,

    /**
     * 
     *                 Delivery status of the order. Not available as a dimension to report on,
     *                 but exists as a dimension in order to filter on it using PQL.
     *                 Valid values are 'STARTED', 'NOT_STARTED' and 'COMPLETED'.
     *               
     * 
     */
    ORDER_DELIVERY_STATUS,

    /**
     * 
     *                 Breaks down reporting data by advertising company {@link Company#id}. Can
     *                 be used to filter by {@link Company#id}.
     *               
     * 
     */
    ADVERTISER_ID,

    /**
     * 
     *                 Breaks down reporting data by advertising company. {@link Company#name} and
     *                 {@link Company#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link Company#name}.
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
     *               
     * 
     */
    AD_NETWORK_ID,

    /**
     * 
     *                 The name of the network defined in {@link #AD_NETWORK_ID}.
     *               
     * 
     */
    AD_NETWORK_NAME,

    /**
     * 
     *                 Breaks down reporting data by salesperson {@link User#id}. Can be used to
     *                 filter by {@link User#id}.
     *               
     * 
     */
    SALESPERSON_ID,

    /**
     * 
     *                 Breaks down reporting data by salesperson. {@link User#name} and
     *                 {@link User#id} of the salesperson are automatically included as columns in
     *                 the report. Can be used to filter by {@link User#name}.
     *               
     * 
     */
    SALESPERSON_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Creative#id} or creative set id
     *                 (master's {@link Creative#id}) if the creative is part of a creative set.
     *                 Can be used to filter by {@link Creative#id}.
     *               
     * 
     */
    CREATIVE_ID,

    /**
     * 
     *                 Breaks down reporting data by creative. {@link Creative#name} and
     *                 {@link Creative#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link Creative#name}.
     *               
     * 
     */
    CREATIVE_NAME,

    /**
     * 
     *                 Breaks down reporting data by creative type.
     *               
     * 
     */
    CREATIVE_TYPE,

    /**
     * 
     *                 Breaks down reporting data by creative billing type.
     *               
     * 
     */
    CREATIVE_BILLING_TYPE,

    /**
     * 
     *                 Breaks down reporting data by custom event ID.
     *               
     * 
     */
    CUSTOM_EVENT_ID,

    /**
     * 
     *                 Breaks down reporting data by custom event name.
     *               
     * 
     */
    CUSTOM_EVENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by custom event type (timer/exit/counter).
     *               
     * 
     */
    CUSTOM_EVENT_TYPE,

    /**
     * 
     *                 Breaks down reporting data by {@link Creative#size}. Cannot be used for
     *                 filtering.
     *               
     * 
     */
    CREATIVE_SIZE,

    /**
     * 
     *                 Breaks down reporting data by {@link AdUnit#id}. Can be used to filter by
     *                 {@link AdUnit#id}. {@link #AD_UNIT_NAME}, i.e. {@link AdUnit#name}, is
     *                 automatically included as a dimension in the report.
     *               
     * 
     */
    AD_UNIT_ID,

    /**
     * 
     *                 Breaks down reporting data by ad unit. {@link AdUnit#name} and
     *                 {@link AdUnit#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link AdUnit#name}.
     *               
     * 
     */
    AD_UNIT_NAME,

    /**
     * 
     *                 Used to filter on all the descendants of an ad unit by {@link AdUnit#id}. Not available as a
     *                 dimension to report on.
     *               
     * 
     */
    PARENT_AD_UNIT_ID,

    /**
     * 
     *                 Used to filter on all the descendants of an ad unit by {@link AdUnit#name}. Not available as a
     *                 dimension to report on.
     *               
     * 
     */
    PARENT_AD_UNIT_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Placement#id}. Can be used to filter
     *                 by {@link Placement#id}.
     *               
     * 
     */
    PLACEMENT_ID,

    /**
     * 
     *                 Breaks down reporting data by placement. {@link Placement#name} and
     *                 {@link Placement#id} are automatically included as columns in the report.
     *                 Can be used to filter by {@link Placement#name}.
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
     *               
     * 
     */
    PLACEMENT_STATUS,

    /**
     * 
     *                 Breaks down reporting data by criteria predefined by DoubleClick For Publishers like the
     *                 operating system, browser etc. Cannot be used for filtering.
     *               
     * 
     */
    TARGETING,

    /**
     * 
     *                 The ID of the device category to which an ad is being targeted.
     *                 
     *                 Can be used to filter by device category ID.
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
     *               
     * 
     */
    DEVICE_CATEGORY_NAME,

    /**
     * 
     *                 Breaks down reporting data by country criteria ID. Can be used to filter by
     *                 country criteria ID.
     *               
     * 
     */
    COUNTRY_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by country name. The country name and the
     *                 country criteria ID are automatically included as columns in the report.
     *                 Can be used to filter by country name using the US English name.
     *               
     * 
     */
    COUNTRY_NAME,

    /**
     * 
     *                 Breaks down reporting data by region criteria ID. Can be used to filter by
     *                 region criteria ID.
     *               
     * 
     */
    REGION_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by region name. The region name and the region
     *                 criteria ID are automatically included as columns in the report. Can be
     *                 used to filter by region name using the US English name.
     *               
     * 
     */
    REGION_NAME,

    /**
     * 
     *                 Breaks down reporting data by city criteria ID. Can be used to filter by
     *                 city criteria ID.
     *               
     * 
     */
    CITY_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by city name. The city name and the city
     *                 criteria ID are automatically included as columns in the report. Can be
     *                 used to filter by city name using the US English name.
     *               
     * 
     */
    CITY_NAME,

    /**
     * 
     *                 Breaks down reporting data by metro criteria ID. Can be used to filter by
     *                 metro criteria ID.
     *               
     * 
     */
    METRO_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by metro name. The metro name and the metro
     *                 criteria ID are automatically included as columns in the report. Can be
     *                 used to filter by metro name using the US English name.
     *               
     * 
     */
    METRO_NAME,

    /**
     * 
     *                 Breaks down reporting data by postal code criteria ID. Can be used to
     *                 filter by postal code criteria ID.
     *               
     * 
     */
    POSTAL_CODE_CRITERIA_ID,

    /**
     * 
     *                 Breaks down reporting data by postal code. The postal code and the postal
     *                 code criteria ID are automatically included as columns in the report. Can
     *                 be used to filter by postal code.
     *               
     * 
     */
    POSTAL_CODE,

    /**
     * 
     *                 Breaks down reporting data by {@link CustomTargetingValue#id}. Can be used
     *                 to filter by {@link CustomTargetingValue#id}.
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
     *               
     * 
     */
    CUSTOM_CRITERIA,

    /**
     * 
     *                 Breaks down reporting data by activity ID. Can be used to filter by
     *                 activity ID.
     *               
     * 
     */
    ACTIVITY_ID,

    /**
     * 
     *                 Breaks down reporting data by activity. The activity name and the activity
     *                 ID are automatically included as columns in the report. Can be used to
     *                 filter by activity name.
     *               
     * 
     */
    ACTIVITY_NAME,

    /**
     * 
     *                 Breaks down reporting data by activity group ID. Can be used to filter by
     *                 activity group ID.
     *               
     * 
     */
    ACTIVITY_GROUP_ID,

    /**
     * 
     *                 Breaks down reporting data by activity group. The activity group name and
     *                 the activity group ID are automatically included as columns in the report.
     *                 Can be used to filter by activity group name.
     *               
     * 
     */
    ACTIVITY_GROUP_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Content#id}. Can be used to filter by
     *                 {@link Content#id}.
     *               
     * 
     */
    CONTENT_ID,

    /**
     * 
     *                 Breaks down reporting data by content. {@link Content#name} and
     *                 {@link Content#id} are automatically included as columns in the report. Can
     *                 be used to filter by {@link Content#name}.
     *               
     * 
     */
    CONTENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link ContentBundle#id}. Can be used to filter
     *                 by {@link ContentBundle#id}.
     *               
     * 
     */
    CONTENT_BUNDLE_ID,

    /**
     * 
     *                 Breaks down reporting data by content bundle. {@link ContentBundle#name} and
     *                 {@link ContentBundle#id} are automatically included as columns in the
     *                 report. Can be used to filter by {@link ContentBundle#name}.
     *               
     * 
     */
    CONTENT_BUNDLE_NAME,

    /**
     * 
     *                 Breaks down reporting data by the content hierarchy. To use this dimension, a list of custom
     *                 targeting key IDs must be specified in
     *                 {@link ReportQuery#contentMetadataKeyHierarchyCustomTargetingKeyIds}.
     *                 <p>
     *                 This dimension can be used as a filter in the {@link Statement} in PQL syntax:
     *                 CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[contentMetadataKeyHierarchyCustomTargetingKeyId]_ID =
     *                 {@link CustomTargetingValue#id custom targeting value ID}
     *                 <p>
     *                 For example: WHERE CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[4242]_ID = 53423
     *               
     * 
     */
    CONTENT_HIERARCHY,

    /**
     * 
     *                 Breaks down reporting data by the fallback position of the video ad, i.e.,
     *                 {@code NON_FALLBACK}, {@code FALLBACK_POSITION_1}, {@code FALLBACK_POSITION_2}, etc. Can be
     *                 used for filtering.
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
     *               
     * 
     */
    POSITION_OF_POD,

    /**
     * 
     *                 Breaks down reporting data by the position of the video ad within the pod, i.e.,
     *                 {@code UNKNOWN_POSITION}, {@code POSITION_1}, {@code POSITION_2}, etc.
     *                 Can be used for filtering.
     *               
     * 
     */
    POSITION_IN_POD,

    /**
     * 
     *                 Breaks down reporting data by partner {@link Company#id}.
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_ID,

    /**
     * 
     *                 Breaks down reporting data by partner {@link Company#name} and {@link Company#id} are
     *                 automatically included as columns in the report.
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_NAME,

    /**
     * 
     *                 Breaks down reporting data by partner label {@link Label#id}.
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_LABEL_ID,

    /**
     * 
     *                 Breaks down reporting data by partner label. {@link Label#name} and {@link Label#id} are
     *                 automatically included as columns in the report.
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_LABEL_NAME,

    /**
     * 
     *                 Breaks down reporting data by gender and age group, i.e., MALE_13_TO_17, MALE_18_TO_24,
     *                 MALE_25_TO_34, MALE_35_TO_44, MALE_45_TO_54, MALE_55_TO_64, MALE_65_PLUS, FEMALE_13_TO_17,
     *                 FEMALE_18_TO_24, FEMALE_25_TO_34, FEMALE_35_TO_44, FEMALE_45_TO_54, FEMALE_55_TO_64,
     *                 FEMALE_65_PLUS, UNKNOWN_0_TO_17 and UNKNOWN. Whenever this dimension is selected, {@link
     *                 #COUNTRY_NAME} must be selected.
     *                 
     *                 <p>This dimension is supported only for GRP columns.
     *               
     * 
     */
    GRP_DEMOGRAPHICS,

    /**
     * 
     *                 Size of the creative requested for an ad.
     *               
     * 
     */
    AD_REQUEST_SIZE,

    /**
     * 
     *                 Breaks down reporting data by the ad unit sizes specified in ad requests.
     *                 
     *                 <p>Formatted as comma separated values, e.g. "300x250,300x250v,300x60".
     *                 
     *                 <p>This dimension is supported only for sell-through columns.
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
     *               
     * 
     */
    AD_REQUEST_CUSTOM_CRITERIA,

    /**
     * 
     *                 The unique identifier used for an ad network that is associated with the company that the ad is
     *                 served for.
     *               
     * 
     */
    BUYER_ID,

    /**
     * 
     *                 The name of the ad network that is associated with the company that the ad is served for.
     *               
     * 
     */
    BUYER_NAME,

    /**
     * 
     *                 Whether the report contains only Ad Exchange traffic fulfilled by First Look Deals
     *                 or omits it. If this filter isn't included, the report will include
     *                 First Look Deals traffic in addition to any other traffic.
     *                 Not available as a dimension to report on.
     *               
     * 
     */
    IS_FIRST_LOOK_DEAL,

    /**
     * 
     *                 Breaks down reporting data by mediation group ID.  A mediation group is an abstraction of
     *                 inventory used in the DFP Mediation.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_GROUP_ID,

    /**
     * 
     *                 Breaks down reporting data by mediation group name.  A mediation group is an abstraction of
     *                 inventory used in the DFP Mediation.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_GROUP_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by mediation network.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_NETWORK,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange network tag name.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_NETWORK_TAG,

    /**
     * 
     *                 Breaks down reporting data by mediation type.   A mediation type can be web, mobile app or
     *                 video.
     *               
     * 
     */
    MEDIATION_TYPE,

    /**
     * 
     *                 Breaks down reporting data by native template (also known as creative template) ID.
     *               
     * 
     */
    NATIVE_TEMPLATE_ID,

    /**
     * 
     *                 Breaks down reporting data by native template (also known as creative template) name.
     *               
     * 
     */
    NATIVE_TEMPLATE_NAME,

    /**
     * 
     *                 Breaks down reporting data by native style ID.
     *               
     * 
     */
    NATIVE_STYLE_ID,

    /**
     * 
     *                 Breaks down reporting data by native style name.
     *               
     * 
     */
    NATIVE_STYLE_NAME,

    /**
     * 
     *                 Breaks down reporting data by mobile app name. Can be used for filtering.
     *               
     * 
     */
    MOBILE_APP_NAME,

    /**
     * 
     *                 Breaks down reporting data by device name. Can be used for filtering.
     *               
     * 
     */
    MOBILE_DEVICE_NAME,

    /**
     * 
     *                 Breaks down reporting data by inventory type. Can be used for filtering.
     *               
     * 
     */
    MOBILE_INVENTORY_TYPE,

    /**
     * 
     *                 ID of the advertiser that filled the ad either directly (through DFP) or indirectly via
     *                 Google Ad Exchange or another ad network or exchange.
     *               
     * 
     */
    VERIFIED_ADVERTISER_ID,

    /**
     * 
     *                 Name of the advertiser that filled the ad either directly (through DFP) or indirectly via
     *                 Google Ad Exchange or another ad network or exchange.
     *               
     * 
     */
    VERIFIED_ADVERTISER_NAME,

    /**
     * 
     *                 Status of the ad unit. Not available as a dimension to report on,
     *                 but exists as a dimension in order to filter on it using PQL.
     *                 Valid values correspond to {@link InventoryStatus}.
     *               
     * 
     */
    AD_UNIT_STATUS,

    /**
     * 
     *                 Breaks down reporting data by {@link Creative#id}. This includes regular creatives,
     *                 and master and companions in case of creative sets.
     *               
     * 
     */
    MASTER_COMPANION_CREATIVE_ID,

    /**
     * 
     *                 Breaks down reporting data by creative. This includes regular creatives,
     *                 and master and companions in case of creative sets.
     *               
     * 
     */
    MASTER_COMPANION_CREATIVE_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link ProposalLineItem#id}. Can be used to filter by
     *                 {@link ProposalLineItem#id}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_ID,

    /**
     * 
     *                 Breaks down reporting data by {@link ProposalLineItem#name}. Can be used to filter by
     *                 {@link ProposalLineItem#name}.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Proposal#id}. Can be used to filter by
     *                 {@link Proposal#id}.
     *               
     * 
     */
    PROPOSAL_ID,

    /**
     * 
     *                 Breaks down reporting data by {@link Proposal#name}. Can be used to filter by
     *                 {@link Proposal#name}.
     *               
     * 
     */
    PROPOSAL_NAME,

    /**
     * 
     *                 Breaks down reporting data by salesperson {@link User#id}, including both salesperson and
     *                 secondary salespeople. Can be used to filter by all salespeople {@link User#id}.
     *               
     * 
     */
    ALL_SALESPEOPLE_ID,

    /**
     * 
     *                 Breaks down reporting data by salesperson {@link User#name}, including both salesperson and
     *                 secondary salespeople. Can be used to filter by all salespeople {@link User#name}.
     *               
     * 
     */
    ALL_SALESPEOPLE_NAME,

    /**
     * 
     *                 Used to filter by {@link User#id} in sales team. Sales team includes salesperson, secondary
     *                 salesperson, sales planners. Not available as a dimension to report on.
     *               
     * 
     */
    SALES_TEAM_ID,

    /**
     * 
     *                 Used to filter by {@link User#name} in sales team. Sales team includes salesperson, secondary
     *                 salesperson, sales planners. Not available as a dimension to report on.
     *               
     * 
     */
    SALES_TEAM_NAME,

    /**
     * 
     *                 Breaks down reporting data by proposal agency {@link Company#id}. Can be used to filter by
     *                 proposal agency {@link Company#id}.
     *               
     * 
     */
    PROPOSAL_AGENCY_ID,

    /**
     * 
     *                 Breaks down reporting data by proposal agency {@link Company#name}. Can be used to filter by
     *                 proposal agency {@link Company#name}.
     *               
     * 
     */
    PROPOSAL_AGENCY_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Product#id}. Can be used to filter by {@link Product#id}.
     *               
     * 
     */
    PRODUCT_ID,

    /**
     * 
     *                 Breaks down reporting data by {@link Product#name}.
     *               
     * 
     */
    PRODUCT_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link ProductTemplate#id}. Can be used to filter by
     *                 {@link ProductTemplate#id}.
     *               
     * 
     */
    PRODUCT_TEMPLATE_ID,

    /**
     * 
     *                 Breaks down reporting data by {@link ProductTemplate#name}. Can be used to filter by
     *                 {@link ProductTemplate#name}.
     *               
     * 
     */
    PRODUCT_TEMPLATE_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link RateCard#id}. Can be used to filter by {@link
     *                 RateCard#id}.
     *               
     * 
     */
    RATE_CARD_ID,

    /**
     * 
     *                 Breaks down reporting data by {@link RateCard#name}. Can be used to filter by {@link
     *                 RateCard#name}.
     *               
     * 
     */
    RATE_CARD_NAME,

    /**
     * 
     *                 Used to filter by {@link Workflow#id}. Not available as a dimension to report on.
     *               
     * 
     */
    WORKFLOW_ID,

    /**
     * 
     *                 Used to filter by {@link Workflow#name}. Not available as a dimension to report on.
     *               
     * 
     */
    WORKFLOW_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link Package#id}.
     *               
     * 
     */
    PACKAGE_ID,

    /**
     * 
     *                 Breaks down reporting data by {@link Package#name}.
     *               
     * 
     */
    PACKAGE_NAME,

    /**
     * 
     *                 Breaks down reporting data by {@link ProductPackage#id}. Can be used to filter by
     *                 {@link ProductPackage#id}.
     *               
     * 
     */
    PRODUCT_PACKAGE_ID,

    /**
     * 
     *                 Breaks down reporting data by {@link ProductPackage#name}. Can be used to filter by
     *                 {@link ProductPackage#name}.
     *               
     * 
     */
    PRODUCT_PACKAGE_NAME,

    /**
     * 
     *                 Breaks down reporting data by billable audience segment ID.
     *               
     * 
     */
    AUDIENCE_SEGMENT_ID,

    /**
     * 
     *                 Breaks down reporting data by billable audience segment name.
     *               
     * 
     */
    AUDIENCE_SEGMENT_NAME,

    /**
     * 
     *                 Breaks down reporting data by audience segment data provider name.
     *               
     * 
     */
    AUDIENCE_SEGMENT_DATA_PROVIDER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange inventory size.
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
     *               
     * 
     */
    AD_EXCHANGE_PRICING_RULE_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange tag.
     *               
     * 
     */
    AD_EXCHANGE_TAG_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange URL.
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
     *               
     * 
     */
    AD_EXCHANGE_CREATIVE_SIZES,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange ad type.
     *               
     * 
     */
    AD_EXCHANGE_AD_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange channel.
     *               
     * 
     */
    AD_EXCHANGE_CHANNEL_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange product.
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
     *               
     * 
     */
    AD_EXCHANGE_SITE_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange request source.
     *               
     * 
     */
    AD_EXCHANGE_REQUEST_SOURCES,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by the Ad Exchange advertiser name that bids
     *                 on ads.
     *               
     * 
     */
    AD_EXCHANGE_ADVERTISER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by the Ad Exchange brand name that bids on
     *                 ads.
     *               
     * 
     */
    AD_EXCHANGE_BRAND_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange agency.
     *               
     * 
     */
    AD_EXCHANGE_AGENCY,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange bid type.
     *               
     * 
     */
    AD_EXCHANGE_BID_TYPE,

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
     *               
     * 
     */
    AD_EXCHANGE_BRANDING_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange ad network name. Example:
     *                 Google Adwords.
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
     *                 
     *                 <p><b>Note:</b> In v201802 and later, this dimension is compatible with the following
     *                 time zone types:
     *                 <ul>
     *                 <li> {@link TimeZoneType.AD_EXCHANGE}
     *                 </ul>
     *               
     * 
     */
    AD_EXCHANGE_DATE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange deal id.
     *               
     * 
     */
    AD_EXCHANGE_DEAL_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange deal name.
     *               
     * 
     */
    AD_EXCHANGE_DEAL_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange deal/transaction type. Example:
     *                 Open auction.
     *               
     * 
     */
    AD_EXCHANGE_TRANSACTION_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange DSP buyer network name.
     *               
     * 
     */
    AD_EXCHANGE_DSP_BUYER_NETWORK_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange expansion type.
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
     *               
     * 
     */
    AD_EXCHANGE_COUNTRY_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange DFP ad unit ID.
     *               
     * 
     */
    AD_EXCHANGE_DFP_AD_UNIT_ID,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange DFP ad unit.
     *               
     * 
     */
    AD_EXCHANGE_DFP_AD_UNIT,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange inventory ownership.
     *               
     * 
     */
    AD_EXCHANGE_INVENTORY_OWNERSHIP,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange advertiser domain.
     *               
     * 
     */
    AD_EXCHANGE_ADVERTISER_DOMAIN,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange mobile app name.
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_APP_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange mobile carrier name.
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_CARRIER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange mobile device name.
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_DEVICE_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange mobile inventory type.
     *               
     * 
     */
    AD_EXCHANGE_MOBILE_INVENTORY_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange month, in Ad Exchange timezone.
     *                 
     *                 <p><b>Note:</b> In v201802 and later, this dimension is compatible with the following
     *                 time zone types:
     *                 <ul>
     *                 <li> {@link TimeZoneType.AD_EXCHANGE}
     *                 </ul>
     *               
     * 
     */
    AD_EXCHANGE_MONTH,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange network partner name.
     *               
     * 
     */
    AD_EXCHANGE_NETWORK_PARTNER_NAME,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange operating system version.
     *               
     * 
     */
    AD_EXCHANGE_OPERATING_SYSTEM,

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
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_AD_DURATION_RAW,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange video ad type.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_AD_TYPE,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange week, in Ad Exchange timezone.
     *                 
     *                 <p><b>Note:</b> In v201802 and later, this dimension is compatible with the following
     *                 time zone types:
     *                 <ul>
     *                 <li> {@link TimeZoneType.AD_EXCHANGE}
     *                 </ul>
     *               
     * 
     */
    AD_EXCHANGE_WEEK,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange ad location.
     *               
     * 
     */
    AD_EXCHANGE_AD_LOCATION,

    /**
     * 
     *                 Breaks down mapped Ad Exchange web property data by Ad Exchange advertiser vertical.
     *               
     * 
     */
    AD_EXCHANGE_ADVERTISER_VERTICAL,

    /**
     * 
     *                 Campaign date segment of Nielsen Digital Ad Ratings reporting.
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
     *               
     * 
     */
    NIELSEN_RESTATEMENT_DATE,

    /**
     * 
     *                 Breaks down reporting data by {@link ProposalMarketplaceInfo#buyerAccountId}.
     *               
     * 
     */
    PROGRAMMATIC_BUYER_ID,

    /**
     * 
     *                 Breaks down reporting data by programmatic buyer name.
     *               
     * 
     */
    PROGRAMMATIC_BUYER_NAME,

    /**
     * 
     *                 Breaks down reporting data by requested ad size(s).
     *                 This can be a chain of sizes or a single size.
     *               
     * 
     */
    REQUESTED_AD_SIZES,

    /**
     * 
     *                 Breaks down reporting data by the creative size the ad was delivered to.
     *               
     * 
     */
    CREATIVE_SIZE_DELIVERED;

    public String value() {
        return name();
    }

    public static Dimension fromValue(String v) {
        return valueOf(v);
    }

}
