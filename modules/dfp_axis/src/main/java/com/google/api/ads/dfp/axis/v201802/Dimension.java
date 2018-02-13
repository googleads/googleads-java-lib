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
 * Dimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class Dimension implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Dimension(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MONTH_AND_YEAR = "MONTH_AND_YEAR";
    public static final java.lang.String _WEEK = "WEEK";
    public static final java.lang.String _DATE = "DATE";
    public static final java.lang.String _DAY = "DAY";
    public static final java.lang.String _HOUR = "HOUR";
    public static final java.lang.String _LINE_ITEM_ID = "LINE_ITEM_ID";
    public static final java.lang.String _LINE_ITEM_NAME = "LINE_ITEM_NAME";
    public static final java.lang.String _LINE_ITEM_TYPE = "LINE_ITEM_TYPE";
    public static final java.lang.String _AGGREGATED_DEMAND_CHANNEL = "AGGREGATED_DEMAND_CHANNEL";
    public static final java.lang.String _ORDER_ID = "ORDER_ID";
    public static final java.lang.String _ORDER_NAME = "ORDER_NAME";
    public static final java.lang.String _ORDER_DELIVERY_STATUS = "ORDER_DELIVERY_STATUS";
    public static final java.lang.String _ADVERTISER_ID = "ADVERTISER_ID";
    public static final java.lang.String _ADVERTISER_NAME = "ADVERTISER_NAME";
    public static final java.lang.String _AD_NETWORK_ID = "AD_NETWORK_ID";
    public static final java.lang.String _AD_NETWORK_NAME = "AD_NETWORK_NAME";
    public static final java.lang.String _SALESPERSON_ID = "SALESPERSON_ID";
    public static final java.lang.String _SALESPERSON_NAME = "SALESPERSON_NAME";
    public static final java.lang.String _CREATIVE_ID = "CREATIVE_ID";
    public static final java.lang.String _CREATIVE_NAME = "CREATIVE_NAME";
    public static final java.lang.String _CREATIVE_TYPE = "CREATIVE_TYPE";
    public static final java.lang.String _CREATIVE_BILLING_TYPE = "CREATIVE_BILLING_TYPE";
    public static final java.lang.String _CUSTOM_EVENT_ID = "CUSTOM_EVENT_ID";
    public static final java.lang.String _CUSTOM_EVENT_NAME = "CUSTOM_EVENT_NAME";
    public static final java.lang.String _CUSTOM_EVENT_TYPE = "CUSTOM_EVENT_TYPE";
    public static final java.lang.String _CREATIVE_SIZE = "CREATIVE_SIZE";
    public static final java.lang.String _AD_UNIT_ID = "AD_UNIT_ID";
    public static final java.lang.String _AD_UNIT_NAME = "AD_UNIT_NAME";
    public static final java.lang.String _PARENT_AD_UNIT_ID = "PARENT_AD_UNIT_ID";
    public static final java.lang.String _PARENT_AD_UNIT_NAME = "PARENT_AD_UNIT_NAME";
    public static final java.lang.String _PLACEMENT_ID = "PLACEMENT_ID";
    public static final java.lang.String _PLACEMENT_NAME = "PLACEMENT_NAME";
    public static final java.lang.String _PLACEMENT_STATUS = "PLACEMENT_STATUS";
    public static final java.lang.String _TARGETING = "TARGETING";
    public static final java.lang.String _DEVICE_CATEGORY_ID = "DEVICE_CATEGORY_ID";
    public static final java.lang.String _DEVICE_CATEGORY_NAME = "DEVICE_CATEGORY_NAME";
    public static final java.lang.String _COUNTRY_CRITERIA_ID = "COUNTRY_CRITERIA_ID";
    public static final java.lang.String _COUNTRY_NAME = "COUNTRY_NAME";
    public static final java.lang.String _REGION_CRITERIA_ID = "REGION_CRITERIA_ID";
    public static final java.lang.String _REGION_NAME = "REGION_NAME";
    public static final java.lang.String _CITY_CRITERIA_ID = "CITY_CRITERIA_ID";
    public static final java.lang.String _CITY_NAME = "CITY_NAME";
    public static final java.lang.String _METRO_CRITERIA_ID = "METRO_CRITERIA_ID";
    public static final java.lang.String _METRO_NAME = "METRO_NAME";
    public static final java.lang.String _POSTAL_CODE_CRITERIA_ID = "POSTAL_CODE_CRITERIA_ID";
    public static final java.lang.String _POSTAL_CODE = "POSTAL_CODE";
    public static final java.lang.String _CUSTOM_TARGETING_VALUE_ID = "CUSTOM_TARGETING_VALUE_ID";
    public static final java.lang.String _CUSTOM_CRITERIA = "CUSTOM_CRITERIA";
    public static final java.lang.String _ACTIVITY_ID = "ACTIVITY_ID";
    public static final java.lang.String _ACTIVITY_NAME = "ACTIVITY_NAME";
    public static final java.lang.String _ACTIVITY_GROUP_ID = "ACTIVITY_GROUP_ID";
    public static final java.lang.String _ACTIVITY_GROUP_NAME = "ACTIVITY_GROUP_NAME";
    public static final java.lang.String _CONTENT_ID = "CONTENT_ID";
    public static final java.lang.String _CONTENT_NAME = "CONTENT_NAME";
    public static final java.lang.String _CONTENT_BUNDLE_ID = "CONTENT_BUNDLE_ID";
    public static final java.lang.String _CONTENT_BUNDLE_NAME = "CONTENT_BUNDLE_NAME";
    public static final java.lang.String _CONTENT_HIERARCHY = "CONTENT_HIERARCHY";
    public static final java.lang.String _VIDEO_FALLBACK_POSITION = "VIDEO_FALLBACK_POSITION";
    public static final java.lang.String _POSITION_OF_POD = "POSITION_OF_POD";
    public static final java.lang.String _POSITION_IN_POD = "POSITION_IN_POD";
    public static final java.lang.String _PARTNER_MANAGEMENT_PARTNER_ID = "PARTNER_MANAGEMENT_PARTNER_ID";
    public static final java.lang.String _PARTNER_MANAGEMENT_PARTNER_NAME = "PARTNER_MANAGEMENT_PARTNER_NAME";
    public static final java.lang.String _PARTNER_MANAGEMENT_PARTNER_LABEL_ID = "PARTNER_MANAGEMENT_PARTNER_LABEL_ID";
    public static final java.lang.String _PARTNER_MANAGEMENT_PARTNER_LABEL_NAME = "PARTNER_MANAGEMENT_PARTNER_LABEL_NAME";
    public static final java.lang.String _PARTNER_MANAGEMENT_ASSIGNMENT_ID = "PARTNER_MANAGEMENT_ASSIGNMENT_ID";
    public static final java.lang.String _PARTNER_MANAGEMENT_ASSIGNMENT_NAME = "PARTNER_MANAGEMENT_ASSIGNMENT_NAME";
    public static final java.lang.String _GRP_DEMOGRAPHICS = "GRP_DEMOGRAPHICS";
    public static final java.lang.String _AD_REQUEST_SIZE = "AD_REQUEST_SIZE";
    public static final java.lang.String _AD_REQUEST_AD_UNIT_SIZES = "AD_REQUEST_AD_UNIT_SIZES";
    public static final java.lang.String _AD_REQUEST_CUSTOM_CRITERIA = "AD_REQUEST_CUSTOM_CRITERIA";
    public static final java.lang.String _BUYER_ID = "BUYER_ID";
    public static final java.lang.String _BUYER_NAME = "BUYER_NAME";
    public static final java.lang.String _IS_FIRST_LOOK_DEAL = "IS_FIRST_LOOK_DEAL";
    public static final java.lang.String _MEDIATION_GROUP_ID = "MEDIATION_GROUP_ID";
    public static final java.lang.String _MEDIATION_GROUP_NAME = "MEDIATION_GROUP_NAME";
    public static final java.lang.String _YIELD_GROUP_ID = "YIELD_GROUP_ID";
    public static final java.lang.String _YIELD_GROUP_NAME = "YIELD_GROUP_NAME";
    public static final java.lang.String _YIELD_PARTNER = "YIELD_PARTNER";
    public static final java.lang.String _YIELD_PARTNER_TAG = "YIELD_PARTNER_TAG";
    public static final java.lang.String _MEDIATION_NETWORK = "MEDIATION_NETWORK";
    public static final java.lang.String _MEDIATION_NETWORK_TAG = "MEDIATION_NETWORK_TAG";
    public static final java.lang.String _MEDIATION_TYPE = "MEDIATION_TYPE";
    public static final java.lang.String _NATIVE_TEMPLATE_ID = "NATIVE_TEMPLATE_ID";
    public static final java.lang.String _NATIVE_TEMPLATE_NAME = "NATIVE_TEMPLATE_NAME";
    public static final java.lang.String _NATIVE_STYLE_ID = "NATIVE_STYLE_ID";
    public static final java.lang.String _NATIVE_STYLE_NAME = "NATIVE_STYLE_NAME";
    public static final java.lang.String _MOBILE_APP_NAME = "MOBILE_APP_NAME";
    public static final java.lang.String _MOBILE_DEVICE_NAME = "MOBILE_DEVICE_NAME";
    public static final java.lang.String _MOBILE_INVENTORY_TYPE = "MOBILE_INVENTORY_TYPE";
    public static final java.lang.String _REQUEST_TYPE = "REQUEST_TYPE";
    public static final java.lang.String _VERIFIED_ADVERTISER_ID = "VERIFIED_ADVERTISER_ID";
    public static final java.lang.String _VERIFIED_ADVERTISER_NAME = "VERIFIED_ADVERTISER_NAME";
    public static final java.lang.String _AD_UNIT_STATUS = "AD_UNIT_STATUS";
    public static final java.lang.String _MASTER_COMPANION_CREATIVE_ID = "MASTER_COMPANION_CREATIVE_ID";
    public static final java.lang.String _MASTER_COMPANION_CREATIVE_NAME = "MASTER_COMPANION_CREATIVE_NAME";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_ID = "PROPOSAL_LINE_ITEM_ID";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_NAME = "PROPOSAL_LINE_ITEM_NAME";
    public static final java.lang.String _PROPOSAL_ID = "PROPOSAL_ID";
    public static final java.lang.String _PROPOSAL_NAME = "PROPOSAL_NAME";
    public static final java.lang.String _ALL_SALESPEOPLE_ID = "ALL_SALESPEOPLE_ID";
    public static final java.lang.String _ALL_SALESPEOPLE_NAME = "ALL_SALESPEOPLE_NAME";
    public static final java.lang.String _SALES_TEAM_ID = "SALES_TEAM_ID";
    public static final java.lang.String _SALES_TEAM_NAME = "SALES_TEAM_NAME";
    public static final java.lang.String _PROPOSAL_AGENCY_ID = "PROPOSAL_AGENCY_ID";
    public static final java.lang.String _PROPOSAL_AGENCY_NAME = "PROPOSAL_AGENCY_NAME";
    public static final java.lang.String _PRODUCT_ID = "PRODUCT_ID";
    public static final java.lang.String _PRODUCT_NAME = "PRODUCT_NAME";
    public static final java.lang.String _PRODUCT_TEMPLATE_ID = "PRODUCT_TEMPLATE_ID";
    public static final java.lang.String _PRODUCT_TEMPLATE_NAME = "PRODUCT_TEMPLATE_NAME";
    public static final java.lang.String _RATE_CARD_ID = "RATE_CARD_ID";
    public static final java.lang.String _RATE_CARD_NAME = "RATE_CARD_NAME";
    public static final java.lang.String _WORKFLOW_ID = "WORKFLOW_ID";
    public static final java.lang.String _WORKFLOW_NAME = "WORKFLOW_NAME";
    public static final java.lang.String _PACKAGE_ID = "PACKAGE_ID";
    public static final java.lang.String _PACKAGE_NAME = "PACKAGE_NAME";
    public static final java.lang.String _PRODUCT_PACKAGE_ID = "PRODUCT_PACKAGE_ID";
    public static final java.lang.String _PRODUCT_PACKAGE_NAME = "PRODUCT_PACKAGE_NAME";
    public static final java.lang.String _AUDIENCE_SEGMENT_ID = "AUDIENCE_SEGMENT_ID";
    public static final java.lang.String _AUDIENCE_SEGMENT_NAME = "AUDIENCE_SEGMENT_NAME";
    public static final java.lang.String _AUDIENCE_SEGMENT_DATA_PROVIDER_NAME = "AUDIENCE_SEGMENT_DATA_PROVIDER_NAME";
    public static final java.lang.String _AD_EXCHANGE_INVENTORY_SIZE = "AD_EXCHANGE_INVENTORY_SIZE";
    public static final java.lang.String _AD_EXCHANGE_INVENTORY_SIZE_CODE = "AD_EXCHANGE_INVENTORY_SIZE_CODE";
    public static final java.lang.String _AD_EXCHANGE_DEVICE_CATEGORY = "AD_EXCHANGE_DEVICE_CATEGORY";
    public static final java.lang.String _AD_EXCHANGE_PRICING_RULE_ID = "AD_EXCHANGE_PRICING_RULE_ID";
    public static final java.lang.String _AD_EXCHANGE_PRICING_RULE_NAME = "AD_EXCHANGE_PRICING_RULE_NAME";
    public static final java.lang.String _AD_EXCHANGE_TAG_NAME = "AD_EXCHANGE_TAG_NAME";
    public static final java.lang.String _AD_EXCHANGE_URL = "AD_EXCHANGE_URL";
    public static final java.lang.String _AD_EXCHANGE_WEB_PROPERTY_CODE = "AD_EXCHANGE_WEB_PROPERTY_CODE";
    public static final java.lang.String _AD_EXCHANGE_CREATIVE_SIZES = "AD_EXCHANGE_CREATIVE_SIZES";
    public static final java.lang.String _AD_EXCHANGE_AD_TYPE = "AD_EXCHANGE_AD_TYPE";
    public static final java.lang.String _AD_EXCHANGE_CHANNEL_NAME = "AD_EXCHANGE_CHANNEL_NAME";
    public static final java.lang.String _AD_EXCHANGE_PRODUCT_NAME = "AD_EXCHANGE_PRODUCT_NAME";
    public static final java.lang.String _AD_EXCHANGE_PRODUCT_CODE = "AD_EXCHANGE_PRODUCT_CODE";
    public static final java.lang.String _AD_EXCHANGE_SITE_NAME = "AD_EXCHANGE_SITE_NAME";
    public static final java.lang.String _AD_EXCHANGE_REQUEST_SOURCES = "AD_EXCHANGE_REQUEST_SOURCES";
    public static final java.lang.String _AD_EXCHANGE_ADVERTISER_NAME = "AD_EXCHANGE_ADVERTISER_NAME";
    public static final java.lang.String _AD_EXCHANGE_BRAND_NAME = "AD_EXCHANGE_BRAND_NAME";
    public static final java.lang.String _AD_EXCHANGE_AGENCY = "AD_EXCHANGE_AGENCY";
    public static final java.lang.String _AD_EXCHANGE_BID_TYPE_CODE = "AD_EXCHANGE_BID_TYPE_CODE";
    public static final java.lang.String _AD_EXCHANGE_BRANDING_TYPE_CODE = "AD_EXCHANGE_BRANDING_TYPE_CODE";
    public static final java.lang.String _AD_EXCHANGE_BRANDING_TYPE = "AD_EXCHANGE_BRANDING_TYPE";
    public static final java.lang.String _AD_EXCHANGE_BUYER_NETWORK_NAME = "AD_EXCHANGE_BUYER_NETWORK_NAME";
    public static final java.lang.String _AD_EXCHANGE_BUYER_NETWORK_ID = "AD_EXCHANGE_BUYER_NETWORK_ID";
    public static final java.lang.String _AD_EXCHANGE_CUSTOM_CHANNEL_CODE = "AD_EXCHANGE_CUSTOM_CHANNEL_CODE";
    public static final java.lang.String _AD_EXCHANGE_CUSTOM_CHANNEL_ID = "AD_EXCHANGE_CUSTOM_CHANNEL_ID";
    public static final java.lang.String _AD_EXCHANGE_DATE = "AD_EXCHANGE_DATE";
    public static final java.lang.String _AD_EXCHANGE_DEAL_ID = "AD_EXCHANGE_DEAL_ID";
    public static final java.lang.String _AD_EXCHANGE_DEAL_NAME = "AD_EXCHANGE_DEAL_NAME";
    public static final java.lang.String _AD_EXCHANGE_TRANSACTION_TYPE = "AD_EXCHANGE_TRANSACTION_TYPE";
    public static final java.lang.String _AD_EXCHANGE_DSP_BUYER_NETWORK_NAME = "AD_EXCHANGE_DSP_BUYER_NETWORK_NAME";
    public static final java.lang.String _AD_EXCHANGE_EXPANSION_TYPE = "AD_EXCHANGE_EXPANSION_TYPE";
    public static final java.lang.String _AD_EXCHANGE_COUNTRY_CODE = "AD_EXCHANGE_COUNTRY_CODE";
    public static final java.lang.String _AD_EXCHANGE_COUNTRY_NAME = "AD_EXCHANGE_COUNTRY_NAME";
    public static final java.lang.String _AD_EXCHANGE_DFP_AD_UNIT_ID = "AD_EXCHANGE_DFP_AD_UNIT_ID";
    public static final java.lang.String _AD_EXCHANGE_DFP_AD_UNIT = "AD_EXCHANGE_DFP_AD_UNIT";
    public static final java.lang.String _AD_EXCHANGE_INVENTORY_OWNERSHIP = "AD_EXCHANGE_INVENTORY_OWNERSHIP";
    public static final java.lang.String _AD_EXCHANGE_ADVERTISER_DOMAIN = "AD_EXCHANGE_ADVERTISER_DOMAIN";
    public static final java.lang.String _AD_EXCHANGE_MOBILE_APP_NAME = "AD_EXCHANGE_MOBILE_APP_NAME";
    public static final java.lang.String _AD_EXCHANGE_MOBILE_CARRIER_NAME = "AD_EXCHANGE_MOBILE_CARRIER_NAME";
    public static final java.lang.String _AD_EXCHANGE_MOBILE_DEVICE_NAME = "AD_EXCHANGE_MOBILE_DEVICE_NAME";
    public static final java.lang.String _AD_EXCHANGE_MOBILE_INVENTORY_TYPE = "AD_EXCHANGE_MOBILE_INVENTORY_TYPE";
    public static final java.lang.String _AD_EXCHANGE_MONTH = "AD_EXCHANGE_MONTH";
    public static final java.lang.String _AD_EXCHANGE_NETWORK_PARTNER_NAME = "AD_EXCHANGE_NETWORK_PARTNER_NAME";
    public static final java.lang.String _AD_EXCHANGE_OPERATING_SYSTEM = "AD_EXCHANGE_OPERATING_SYSTEM";
    public static final java.lang.String _AD_EXCHANGE_TAG_CODE = "AD_EXCHANGE_TAG_CODE";
    public static final java.lang.String _AD_EXCHANGE_TARGETING_TYPE_CODE = "AD_EXCHANGE_TARGETING_TYPE_CODE";
    public static final java.lang.String _AD_EXCHANGE_TARGETING_TYPE = "AD_EXCHANGE_TARGETING_TYPE";
    public static final java.lang.String _AD_EXCHANGE_TRANSACTION_TYPE_CODE = "AD_EXCHANGE_TRANSACTION_TYPE_CODE";
    public static final java.lang.String _AD_EXCHANGE_URL_ID = "AD_EXCHANGE_URL_ID";
    public static final java.lang.String _AD_EXCHANGE_USER_BANDWIDTH_NAME = "AD_EXCHANGE_USER_BANDWIDTH_NAME";
    public static final java.lang.String _AD_EXCHANGE_VIDEO_AD_DURATION = "AD_EXCHANGE_VIDEO_AD_DURATION";
    public static final java.lang.String _AD_EXCHANGE_VIDEO_AD_DURATION_RAW = "AD_EXCHANGE_VIDEO_AD_DURATION_RAW";
    public static final java.lang.String _AD_EXCHANGE_VIDEO_AD_TYPE = "AD_EXCHANGE_VIDEO_AD_TYPE";
    public static final java.lang.String _AD_EXCHANGE_WEEK = "AD_EXCHANGE_WEEK";
    public static final java.lang.String _AD_EXCHANGE_AD_LOCATION = "AD_EXCHANGE_AD_LOCATION";
    public static final java.lang.String _AD_EXCHANGE_ADVERTISER_VERTICAL = "AD_EXCHANGE_ADVERTISER_VERTICAL";
    public static final java.lang.String _NIELSEN_SEGMENT = "NIELSEN_SEGMENT";
    public static final java.lang.String _NIELSEN_DEMOGRAPHICS = "NIELSEN_DEMOGRAPHICS";
    public static final java.lang.String _NIELSEN_RESTATEMENT_DATE = "NIELSEN_RESTATEMENT_DATE";
    public static final java.lang.String _PROGRAMMATIC_BUYER_ID = "PROGRAMMATIC_BUYER_ID";
    public static final java.lang.String _PROGRAMMATIC_BUYER_NAME = "PROGRAMMATIC_BUYER_NAME";
    public static final java.lang.String _REQUESTED_AD_SIZES = "REQUESTED_AD_SIZES";
    public static final java.lang.String _CREATIVE_SIZE_DELIVERED = "CREATIVE_SIZE_DELIVERED";
    public static final java.lang.String _DEMAND_CHANNEL_ID = "DEMAND_CHANNEL_ID";
    public static final java.lang.String _DEMAND_CHANNEL_NAME = "DEMAND_CHANNEL_NAME";
    public static final Dimension MONTH_AND_YEAR = new Dimension(_MONTH_AND_YEAR);
    public static final Dimension WEEK = new Dimension(_WEEK);
    public static final Dimension DATE = new Dimension(_DATE);
    public static final Dimension DAY = new Dimension(_DAY);
    public static final Dimension HOUR = new Dimension(_HOUR);
    public static final Dimension LINE_ITEM_ID = new Dimension(_LINE_ITEM_ID);
    public static final Dimension LINE_ITEM_NAME = new Dimension(_LINE_ITEM_NAME);
    public static final Dimension LINE_ITEM_TYPE = new Dimension(_LINE_ITEM_TYPE);
    public static final Dimension AGGREGATED_DEMAND_CHANNEL = new Dimension(_AGGREGATED_DEMAND_CHANNEL);
    public static final Dimension ORDER_ID = new Dimension(_ORDER_ID);
    public static final Dimension ORDER_NAME = new Dimension(_ORDER_NAME);
    public static final Dimension ORDER_DELIVERY_STATUS = new Dimension(_ORDER_DELIVERY_STATUS);
    public static final Dimension ADVERTISER_ID = new Dimension(_ADVERTISER_ID);
    public static final Dimension ADVERTISER_NAME = new Dimension(_ADVERTISER_NAME);
    public static final Dimension AD_NETWORK_ID = new Dimension(_AD_NETWORK_ID);
    public static final Dimension AD_NETWORK_NAME = new Dimension(_AD_NETWORK_NAME);
    public static final Dimension SALESPERSON_ID = new Dimension(_SALESPERSON_ID);
    public static final Dimension SALESPERSON_NAME = new Dimension(_SALESPERSON_NAME);
    public static final Dimension CREATIVE_ID = new Dimension(_CREATIVE_ID);
    public static final Dimension CREATIVE_NAME = new Dimension(_CREATIVE_NAME);
    public static final Dimension CREATIVE_TYPE = new Dimension(_CREATIVE_TYPE);
    public static final Dimension CREATIVE_BILLING_TYPE = new Dimension(_CREATIVE_BILLING_TYPE);
    public static final Dimension CUSTOM_EVENT_ID = new Dimension(_CUSTOM_EVENT_ID);
    public static final Dimension CUSTOM_EVENT_NAME = new Dimension(_CUSTOM_EVENT_NAME);
    public static final Dimension CUSTOM_EVENT_TYPE = new Dimension(_CUSTOM_EVENT_TYPE);
    public static final Dimension CREATIVE_SIZE = new Dimension(_CREATIVE_SIZE);
    public static final Dimension AD_UNIT_ID = new Dimension(_AD_UNIT_ID);
    public static final Dimension AD_UNIT_NAME = new Dimension(_AD_UNIT_NAME);
    public static final Dimension PARENT_AD_UNIT_ID = new Dimension(_PARENT_AD_UNIT_ID);
    public static final Dimension PARENT_AD_UNIT_NAME = new Dimension(_PARENT_AD_UNIT_NAME);
    public static final Dimension PLACEMENT_ID = new Dimension(_PLACEMENT_ID);
    public static final Dimension PLACEMENT_NAME = new Dimension(_PLACEMENT_NAME);
    public static final Dimension PLACEMENT_STATUS = new Dimension(_PLACEMENT_STATUS);
    public static final Dimension TARGETING = new Dimension(_TARGETING);
    public static final Dimension DEVICE_CATEGORY_ID = new Dimension(_DEVICE_CATEGORY_ID);
    public static final Dimension DEVICE_CATEGORY_NAME = new Dimension(_DEVICE_CATEGORY_NAME);
    public static final Dimension COUNTRY_CRITERIA_ID = new Dimension(_COUNTRY_CRITERIA_ID);
    public static final Dimension COUNTRY_NAME = new Dimension(_COUNTRY_NAME);
    public static final Dimension REGION_CRITERIA_ID = new Dimension(_REGION_CRITERIA_ID);
    public static final Dimension REGION_NAME = new Dimension(_REGION_NAME);
    public static final Dimension CITY_CRITERIA_ID = new Dimension(_CITY_CRITERIA_ID);
    public static final Dimension CITY_NAME = new Dimension(_CITY_NAME);
    public static final Dimension METRO_CRITERIA_ID = new Dimension(_METRO_CRITERIA_ID);
    public static final Dimension METRO_NAME = new Dimension(_METRO_NAME);
    public static final Dimension POSTAL_CODE_CRITERIA_ID = new Dimension(_POSTAL_CODE_CRITERIA_ID);
    public static final Dimension POSTAL_CODE = new Dimension(_POSTAL_CODE);
    public static final Dimension CUSTOM_TARGETING_VALUE_ID = new Dimension(_CUSTOM_TARGETING_VALUE_ID);
    public static final Dimension CUSTOM_CRITERIA = new Dimension(_CUSTOM_CRITERIA);
    public static final Dimension ACTIVITY_ID = new Dimension(_ACTIVITY_ID);
    public static final Dimension ACTIVITY_NAME = new Dimension(_ACTIVITY_NAME);
    public static final Dimension ACTIVITY_GROUP_ID = new Dimension(_ACTIVITY_GROUP_ID);
    public static final Dimension ACTIVITY_GROUP_NAME = new Dimension(_ACTIVITY_GROUP_NAME);
    public static final Dimension CONTENT_ID = new Dimension(_CONTENT_ID);
    public static final Dimension CONTENT_NAME = new Dimension(_CONTENT_NAME);
    public static final Dimension CONTENT_BUNDLE_ID = new Dimension(_CONTENT_BUNDLE_ID);
    public static final Dimension CONTENT_BUNDLE_NAME = new Dimension(_CONTENT_BUNDLE_NAME);
    public static final Dimension CONTENT_HIERARCHY = new Dimension(_CONTENT_HIERARCHY);
    public static final Dimension VIDEO_FALLBACK_POSITION = new Dimension(_VIDEO_FALLBACK_POSITION);
    public static final Dimension POSITION_OF_POD = new Dimension(_POSITION_OF_POD);
    public static final Dimension POSITION_IN_POD = new Dimension(_POSITION_IN_POD);
    public static final Dimension PARTNER_MANAGEMENT_PARTNER_ID = new Dimension(_PARTNER_MANAGEMENT_PARTNER_ID);
    public static final Dimension PARTNER_MANAGEMENT_PARTNER_NAME = new Dimension(_PARTNER_MANAGEMENT_PARTNER_NAME);
    public static final Dimension PARTNER_MANAGEMENT_PARTNER_LABEL_ID = new Dimension(_PARTNER_MANAGEMENT_PARTNER_LABEL_ID);
    public static final Dimension PARTNER_MANAGEMENT_PARTNER_LABEL_NAME = new Dimension(_PARTNER_MANAGEMENT_PARTNER_LABEL_NAME);
    public static final Dimension PARTNER_MANAGEMENT_ASSIGNMENT_ID = new Dimension(_PARTNER_MANAGEMENT_ASSIGNMENT_ID);
    public static final Dimension PARTNER_MANAGEMENT_ASSIGNMENT_NAME = new Dimension(_PARTNER_MANAGEMENT_ASSIGNMENT_NAME);
    public static final Dimension GRP_DEMOGRAPHICS = new Dimension(_GRP_DEMOGRAPHICS);
    public static final Dimension AD_REQUEST_SIZE = new Dimension(_AD_REQUEST_SIZE);
    public static final Dimension AD_REQUEST_AD_UNIT_SIZES = new Dimension(_AD_REQUEST_AD_UNIT_SIZES);
    public static final Dimension AD_REQUEST_CUSTOM_CRITERIA = new Dimension(_AD_REQUEST_CUSTOM_CRITERIA);
    public static final Dimension BUYER_ID = new Dimension(_BUYER_ID);
    public static final Dimension BUYER_NAME = new Dimension(_BUYER_NAME);
    public static final Dimension IS_FIRST_LOOK_DEAL = new Dimension(_IS_FIRST_LOOK_DEAL);
    public static final Dimension MEDIATION_GROUP_ID = new Dimension(_MEDIATION_GROUP_ID);
    public static final Dimension MEDIATION_GROUP_NAME = new Dimension(_MEDIATION_GROUP_NAME);
    public static final Dimension YIELD_GROUP_ID = new Dimension(_YIELD_GROUP_ID);
    public static final Dimension YIELD_GROUP_NAME = new Dimension(_YIELD_GROUP_NAME);
    public static final Dimension YIELD_PARTNER = new Dimension(_YIELD_PARTNER);
    public static final Dimension YIELD_PARTNER_TAG = new Dimension(_YIELD_PARTNER_TAG);
    public static final Dimension MEDIATION_NETWORK = new Dimension(_MEDIATION_NETWORK);
    public static final Dimension MEDIATION_NETWORK_TAG = new Dimension(_MEDIATION_NETWORK_TAG);
    public static final Dimension MEDIATION_TYPE = new Dimension(_MEDIATION_TYPE);
    public static final Dimension NATIVE_TEMPLATE_ID = new Dimension(_NATIVE_TEMPLATE_ID);
    public static final Dimension NATIVE_TEMPLATE_NAME = new Dimension(_NATIVE_TEMPLATE_NAME);
    public static final Dimension NATIVE_STYLE_ID = new Dimension(_NATIVE_STYLE_ID);
    public static final Dimension NATIVE_STYLE_NAME = new Dimension(_NATIVE_STYLE_NAME);
    public static final Dimension MOBILE_APP_NAME = new Dimension(_MOBILE_APP_NAME);
    public static final Dimension MOBILE_DEVICE_NAME = new Dimension(_MOBILE_DEVICE_NAME);
    public static final Dimension MOBILE_INVENTORY_TYPE = new Dimension(_MOBILE_INVENTORY_TYPE);
    public static final Dimension REQUEST_TYPE = new Dimension(_REQUEST_TYPE);
    public static final Dimension VERIFIED_ADVERTISER_ID = new Dimension(_VERIFIED_ADVERTISER_ID);
    public static final Dimension VERIFIED_ADVERTISER_NAME = new Dimension(_VERIFIED_ADVERTISER_NAME);
    public static final Dimension AD_UNIT_STATUS = new Dimension(_AD_UNIT_STATUS);
    public static final Dimension MASTER_COMPANION_CREATIVE_ID = new Dimension(_MASTER_COMPANION_CREATIVE_ID);
    public static final Dimension MASTER_COMPANION_CREATIVE_NAME = new Dimension(_MASTER_COMPANION_CREATIVE_NAME);
    public static final Dimension PROPOSAL_LINE_ITEM_ID = new Dimension(_PROPOSAL_LINE_ITEM_ID);
    public static final Dimension PROPOSAL_LINE_ITEM_NAME = new Dimension(_PROPOSAL_LINE_ITEM_NAME);
    public static final Dimension PROPOSAL_ID = new Dimension(_PROPOSAL_ID);
    public static final Dimension PROPOSAL_NAME = new Dimension(_PROPOSAL_NAME);
    public static final Dimension ALL_SALESPEOPLE_ID = new Dimension(_ALL_SALESPEOPLE_ID);
    public static final Dimension ALL_SALESPEOPLE_NAME = new Dimension(_ALL_SALESPEOPLE_NAME);
    public static final Dimension SALES_TEAM_ID = new Dimension(_SALES_TEAM_ID);
    public static final Dimension SALES_TEAM_NAME = new Dimension(_SALES_TEAM_NAME);
    public static final Dimension PROPOSAL_AGENCY_ID = new Dimension(_PROPOSAL_AGENCY_ID);
    public static final Dimension PROPOSAL_AGENCY_NAME = new Dimension(_PROPOSAL_AGENCY_NAME);
    public static final Dimension PRODUCT_ID = new Dimension(_PRODUCT_ID);
    public static final Dimension PRODUCT_NAME = new Dimension(_PRODUCT_NAME);
    public static final Dimension PRODUCT_TEMPLATE_ID = new Dimension(_PRODUCT_TEMPLATE_ID);
    public static final Dimension PRODUCT_TEMPLATE_NAME = new Dimension(_PRODUCT_TEMPLATE_NAME);
    public static final Dimension RATE_CARD_ID = new Dimension(_RATE_CARD_ID);
    public static final Dimension RATE_CARD_NAME = new Dimension(_RATE_CARD_NAME);
    public static final Dimension WORKFLOW_ID = new Dimension(_WORKFLOW_ID);
    public static final Dimension WORKFLOW_NAME = new Dimension(_WORKFLOW_NAME);
    public static final Dimension PACKAGE_ID = new Dimension(_PACKAGE_ID);
    public static final Dimension PACKAGE_NAME = new Dimension(_PACKAGE_NAME);
    public static final Dimension PRODUCT_PACKAGE_ID = new Dimension(_PRODUCT_PACKAGE_ID);
    public static final Dimension PRODUCT_PACKAGE_NAME = new Dimension(_PRODUCT_PACKAGE_NAME);
    public static final Dimension AUDIENCE_SEGMENT_ID = new Dimension(_AUDIENCE_SEGMENT_ID);
    public static final Dimension AUDIENCE_SEGMENT_NAME = new Dimension(_AUDIENCE_SEGMENT_NAME);
    public static final Dimension AUDIENCE_SEGMENT_DATA_PROVIDER_NAME = new Dimension(_AUDIENCE_SEGMENT_DATA_PROVIDER_NAME);
    public static final Dimension AD_EXCHANGE_INVENTORY_SIZE = new Dimension(_AD_EXCHANGE_INVENTORY_SIZE);
    public static final Dimension AD_EXCHANGE_INVENTORY_SIZE_CODE = new Dimension(_AD_EXCHANGE_INVENTORY_SIZE_CODE);
    public static final Dimension AD_EXCHANGE_DEVICE_CATEGORY = new Dimension(_AD_EXCHANGE_DEVICE_CATEGORY);
    public static final Dimension AD_EXCHANGE_PRICING_RULE_ID = new Dimension(_AD_EXCHANGE_PRICING_RULE_ID);
    public static final Dimension AD_EXCHANGE_PRICING_RULE_NAME = new Dimension(_AD_EXCHANGE_PRICING_RULE_NAME);
    public static final Dimension AD_EXCHANGE_TAG_NAME = new Dimension(_AD_EXCHANGE_TAG_NAME);
    public static final Dimension AD_EXCHANGE_URL = new Dimension(_AD_EXCHANGE_URL);
    public static final Dimension AD_EXCHANGE_WEB_PROPERTY_CODE = new Dimension(_AD_EXCHANGE_WEB_PROPERTY_CODE);
    public static final Dimension AD_EXCHANGE_CREATIVE_SIZES = new Dimension(_AD_EXCHANGE_CREATIVE_SIZES);
    public static final Dimension AD_EXCHANGE_AD_TYPE = new Dimension(_AD_EXCHANGE_AD_TYPE);
    public static final Dimension AD_EXCHANGE_CHANNEL_NAME = new Dimension(_AD_EXCHANGE_CHANNEL_NAME);
    public static final Dimension AD_EXCHANGE_PRODUCT_NAME = new Dimension(_AD_EXCHANGE_PRODUCT_NAME);
    public static final Dimension AD_EXCHANGE_PRODUCT_CODE = new Dimension(_AD_EXCHANGE_PRODUCT_CODE);
    public static final Dimension AD_EXCHANGE_SITE_NAME = new Dimension(_AD_EXCHANGE_SITE_NAME);
    public static final Dimension AD_EXCHANGE_REQUEST_SOURCES = new Dimension(_AD_EXCHANGE_REQUEST_SOURCES);
    public static final Dimension AD_EXCHANGE_ADVERTISER_NAME = new Dimension(_AD_EXCHANGE_ADVERTISER_NAME);
    public static final Dimension AD_EXCHANGE_BRAND_NAME = new Dimension(_AD_EXCHANGE_BRAND_NAME);
    public static final Dimension AD_EXCHANGE_AGENCY = new Dimension(_AD_EXCHANGE_AGENCY);
    public static final Dimension AD_EXCHANGE_BID_TYPE_CODE = new Dimension(_AD_EXCHANGE_BID_TYPE_CODE);
    public static final Dimension AD_EXCHANGE_BRANDING_TYPE_CODE = new Dimension(_AD_EXCHANGE_BRANDING_TYPE_CODE);
    public static final Dimension AD_EXCHANGE_BRANDING_TYPE = new Dimension(_AD_EXCHANGE_BRANDING_TYPE);
    public static final Dimension AD_EXCHANGE_BUYER_NETWORK_NAME = new Dimension(_AD_EXCHANGE_BUYER_NETWORK_NAME);
    public static final Dimension AD_EXCHANGE_BUYER_NETWORK_ID = new Dimension(_AD_EXCHANGE_BUYER_NETWORK_ID);
    public static final Dimension AD_EXCHANGE_CUSTOM_CHANNEL_CODE = new Dimension(_AD_EXCHANGE_CUSTOM_CHANNEL_CODE);
    public static final Dimension AD_EXCHANGE_CUSTOM_CHANNEL_ID = new Dimension(_AD_EXCHANGE_CUSTOM_CHANNEL_ID);
    public static final Dimension AD_EXCHANGE_DATE = new Dimension(_AD_EXCHANGE_DATE);
    public static final Dimension AD_EXCHANGE_DEAL_ID = new Dimension(_AD_EXCHANGE_DEAL_ID);
    public static final Dimension AD_EXCHANGE_DEAL_NAME = new Dimension(_AD_EXCHANGE_DEAL_NAME);
    public static final Dimension AD_EXCHANGE_TRANSACTION_TYPE = new Dimension(_AD_EXCHANGE_TRANSACTION_TYPE);
    public static final Dimension AD_EXCHANGE_DSP_BUYER_NETWORK_NAME = new Dimension(_AD_EXCHANGE_DSP_BUYER_NETWORK_NAME);
    public static final Dimension AD_EXCHANGE_EXPANSION_TYPE = new Dimension(_AD_EXCHANGE_EXPANSION_TYPE);
    public static final Dimension AD_EXCHANGE_COUNTRY_CODE = new Dimension(_AD_EXCHANGE_COUNTRY_CODE);
    public static final Dimension AD_EXCHANGE_COUNTRY_NAME = new Dimension(_AD_EXCHANGE_COUNTRY_NAME);
    public static final Dimension AD_EXCHANGE_DFP_AD_UNIT_ID = new Dimension(_AD_EXCHANGE_DFP_AD_UNIT_ID);
    public static final Dimension AD_EXCHANGE_DFP_AD_UNIT = new Dimension(_AD_EXCHANGE_DFP_AD_UNIT);
    public static final Dimension AD_EXCHANGE_INVENTORY_OWNERSHIP = new Dimension(_AD_EXCHANGE_INVENTORY_OWNERSHIP);
    public static final Dimension AD_EXCHANGE_ADVERTISER_DOMAIN = new Dimension(_AD_EXCHANGE_ADVERTISER_DOMAIN);
    public static final Dimension AD_EXCHANGE_MOBILE_APP_NAME = new Dimension(_AD_EXCHANGE_MOBILE_APP_NAME);
    public static final Dimension AD_EXCHANGE_MOBILE_CARRIER_NAME = new Dimension(_AD_EXCHANGE_MOBILE_CARRIER_NAME);
    public static final Dimension AD_EXCHANGE_MOBILE_DEVICE_NAME = new Dimension(_AD_EXCHANGE_MOBILE_DEVICE_NAME);
    public static final Dimension AD_EXCHANGE_MOBILE_INVENTORY_TYPE = new Dimension(_AD_EXCHANGE_MOBILE_INVENTORY_TYPE);
    public static final Dimension AD_EXCHANGE_MONTH = new Dimension(_AD_EXCHANGE_MONTH);
    public static final Dimension AD_EXCHANGE_NETWORK_PARTNER_NAME = new Dimension(_AD_EXCHANGE_NETWORK_PARTNER_NAME);
    public static final Dimension AD_EXCHANGE_OPERATING_SYSTEM = new Dimension(_AD_EXCHANGE_OPERATING_SYSTEM);
    public static final Dimension AD_EXCHANGE_TAG_CODE = new Dimension(_AD_EXCHANGE_TAG_CODE);
    public static final Dimension AD_EXCHANGE_TARGETING_TYPE_CODE = new Dimension(_AD_EXCHANGE_TARGETING_TYPE_CODE);
    public static final Dimension AD_EXCHANGE_TARGETING_TYPE = new Dimension(_AD_EXCHANGE_TARGETING_TYPE);
    public static final Dimension AD_EXCHANGE_TRANSACTION_TYPE_CODE = new Dimension(_AD_EXCHANGE_TRANSACTION_TYPE_CODE);
    public static final Dimension AD_EXCHANGE_URL_ID = new Dimension(_AD_EXCHANGE_URL_ID);
    public static final Dimension AD_EXCHANGE_USER_BANDWIDTH_NAME = new Dimension(_AD_EXCHANGE_USER_BANDWIDTH_NAME);
    public static final Dimension AD_EXCHANGE_VIDEO_AD_DURATION = new Dimension(_AD_EXCHANGE_VIDEO_AD_DURATION);
    public static final Dimension AD_EXCHANGE_VIDEO_AD_DURATION_RAW = new Dimension(_AD_EXCHANGE_VIDEO_AD_DURATION_RAW);
    public static final Dimension AD_EXCHANGE_VIDEO_AD_TYPE = new Dimension(_AD_EXCHANGE_VIDEO_AD_TYPE);
    public static final Dimension AD_EXCHANGE_WEEK = new Dimension(_AD_EXCHANGE_WEEK);
    public static final Dimension AD_EXCHANGE_AD_LOCATION = new Dimension(_AD_EXCHANGE_AD_LOCATION);
    public static final Dimension AD_EXCHANGE_ADVERTISER_VERTICAL = new Dimension(_AD_EXCHANGE_ADVERTISER_VERTICAL);
    public static final Dimension NIELSEN_SEGMENT = new Dimension(_NIELSEN_SEGMENT);
    public static final Dimension NIELSEN_DEMOGRAPHICS = new Dimension(_NIELSEN_DEMOGRAPHICS);
    public static final Dimension NIELSEN_RESTATEMENT_DATE = new Dimension(_NIELSEN_RESTATEMENT_DATE);
    public static final Dimension PROGRAMMATIC_BUYER_ID = new Dimension(_PROGRAMMATIC_BUYER_ID);
    public static final Dimension PROGRAMMATIC_BUYER_NAME = new Dimension(_PROGRAMMATIC_BUYER_NAME);
    public static final Dimension REQUESTED_AD_SIZES = new Dimension(_REQUESTED_AD_SIZES);
    public static final Dimension CREATIVE_SIZE_DELIVERED = new Dimension(_CREATIVE_SIZE_DELIVERED);
    public static final Dimension DEMAND_CHANNEL_ID = new Dimension(_DEMAND_CHANNEL_ID);
    public static final Dimension DEMAND_CHANNEL_NAME = new Dimension(_DEMAND_CHANNEL_NAME);
    public java.lang.String getValue() { return _value_;}
    public static Dimension fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Dimension enumeration = (Dimension)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Dimension fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dimension.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Dimension"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
