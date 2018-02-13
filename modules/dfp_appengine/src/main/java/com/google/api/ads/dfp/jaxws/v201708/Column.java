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


package com.google.api.ads.dfp.jaxws.v201708;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Column.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Column">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_SERVER_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_DOWNLOADED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_TARGETED_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_CTR"/>
 *     &lt;enumeration value="AD_SERVER_CPM_AND_CPC_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_CPD_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_CPA_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_ALL_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="AD_SERVER_WITH_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="AD_SERVER_INVENTORY_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_INVENTORY_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_INVENTORY_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_CODE_SERVED_COUNT"/>
 *     &lt;enumeration value="AD_SERVER_UNFILTERED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_UNFILTERED_CLICKS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_CLICKS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_CLICKS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_CTR"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_CTR"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_REVENUE"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_AVERAGE_ECPM"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_MATCHED_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_ECPM"/>
 *     &lt;enumeration value="AD_EXCHANGE_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ESTIMATED_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_COVERAGE"/>
 *     &lt;enumeration value="AD_EXCHANGE_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_LIFT"/>
 *     &lt;enumeration value="AD_EXCHANGE_CPC"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_REQUEST_ECPM"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_REQUEST_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_DROPOFF_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_ABANDONMENT_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_MATCHED_ECPM"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE"/>
 *     &lt;enumeration value="AD_EXCHANGE_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_ENABLED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_BID_RESPONSES"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_MATCHED_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_AD_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_MATCH_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_QUARTILE_1"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_QUARTILE_3"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TRUEVIEW_SKIP_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TRUEVIEW_VIEWS"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TRUEVIEW_VTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_THIRD_PARTY_FILL_RATE"/>
 *     &lt;enumeration value="MEDIATION_IMPRESSIONS"/>
 *     &lt;enumeration value="MEDIATION_ESTIMATED_REVENUE"/>
 *     &lt;enumeration value="MEDIATION_ECPM"/>
 *     &lt;enumeration value="MEDIATION_THIRD_PARTY_ECPM"/>
 *     &lt;enumeration value="MEDIATION_FILL_RATE"/>
 *     &lt;enumeration value="MEDIATION_PASSBACKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_CLICKS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CLICKS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_CTR"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CTR"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_CPM_AND_CPC_REVENUE"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_ALL_REVENUE"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_WITHOUT_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_WITH_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_CODE_SERVED_COUNT"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_CTR"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_NON_OPTIMIZED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_NON_OPTIMIZED_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_EXTRA_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_CTR"/>
 *     &lt;enumeration value="OPTIMIZATION_LIFT"/>
 *     &lt;enumeration value="OPTIMIZATION_COVERAGE"/>
 *     &lt;enumeration value="OPTIMIZATION_BEHIND_SCHEDULE_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_NO_CLICKS_RECORDED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_SPONSORSHIP_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_AS_FAST_AS_POSSIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_NO_ABSOLUTE_LIFETIME_GOAL_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_REVENUE"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_REVENUE"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_ECPM"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_ECPM"/>
 *     &lt;enumeration value="OPTIMIZATION_FREED_UP_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_ECPM_LIFT"/>
 *     &lt;enumeration value="REACH_FREQUENCY"/>
 *     &lt;enumeration value="REACH_AVERAGE_REVENUE"/>
 *     &lt;enumeration value="REACH"/>
 *     &lt;enumeration value="GRP_POPULATION"/>
 *     &lt;enumeration value="GRP_UNIQUE_AUDIENCE"/>
 *     &lt;enumeration value="GRP_UNIQUE_AUDIENCE_SHARE"/>
 *     &lt;enumeration value="GRP_AUDIENCE_IMPRESSIONS"/>
 *     &lt;enumeration value="GRP_AUDIENCE_IMPRESSIONS_SHARE"/>
 *     &lt;enumeration value="GRP_AUDIENCE_REACH"/>
 *     &lt;enumeration value="GRP_AUDIENCE_AVERAGE_FREQUENCY"/>
 *     &lt;enumeration value="GRP_GROSS_RATING_POINTS"/>
 *     &lt;enumeration value="SDK_MEDIATION_CREATIVE_IMPRESSIONS"/>
 *     &lt;enumeration value="SDK_MEDIATION_CREATIVE_CLICKS"/>
 *     &lt;enumeration value="SELL_THROUGH_FORECASTED_IMPRESSIONS"/>
 *     &lt;enumeration value="SELL_THROUGH_AVAILABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="SELL_THROUGH_RESERVED_IMPRESSIONS"/>
 *     &lt;enumeration value="SELL_THROUGH_SELL_THROUGH_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_BACKUP_IMAGES"/>
 *     &lt;enumeration value="RICH_MEDIA_DISPLAY_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_AVERAGE_DISPLAY_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_EXPANSIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_EXPANDING_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_COUNT"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_AVERAGE_INTERACTION_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_IMPRESSIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_MANUAL_CLOSES"/>
 *     &lt;enumeration value="RICH_MEDIA_FULL_SCREEN_IMPRESSIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_INTERACTIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_INTERACTION_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_MUTES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_PAUSES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_PLAYES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_MIDPOINTS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_COMPLETES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_REPLAYS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_STOPS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_UNMUTES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_VIEW_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_VIEW_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_EVENT_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_EVENT_COUNT"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_START"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_FIRST_QUARTILE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_MIDPOINT"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_THIRD_QUARTILE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_COMPLETE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_COMPLETION_RATE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_VIDEO_LENGTH"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_ENGAGED_VIEW"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AUTO_PLAYS"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_CLICK_TO_PLAYS"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_100_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_101_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_102_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_200_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_201_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_202_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_203_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_300_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_301_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_302_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_303_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_400_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_401_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_402_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_403_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_405_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_500_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_501_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_502_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_503_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_600_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_601_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_602_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_603_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_604_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_900_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_901_COUNT"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_PAUSE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_RESUME"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_REWIND"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_MUTE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_UNMUTE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_COLLAPSE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_EXPAND"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_FULL_SCREEN"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_VIDEO_SKIPS"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_STARTS"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_STARTS"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_COMPLETES"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="AUDIENCE_EXTENSION_COST"/>
 *     &lt;enumeration value="VIEW_THROUGH_CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSIONS_PER_THOUSAND_IMPRESSIONS"/>
 *     &lt;enumeration value="CLICK_THROUGH_CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSIONS_PER_CLICK"/>
 *     &lt;enumeration value="VIEW_THROUGH_REVENUE"/>
 *     &lt;enumeration value="CLICK_THROUGH_REVENUE"/>
 *     &lt;enumeration value="TOTAL_CONVERSIONS"/>
 *     &lt;enumeration value="TOTAL_CONVERSION_REVENUE"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_LOCAL_CONTRACTED_NET_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_LOCAL_CONTRACTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_VAT"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_LOCAL_CONTRACTED_VAT"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_LOCAL_CONTRACTED_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="SALES_CONTRACT_CONTRACTED_IMPRESSIONS"/>
 *     &lt;enumeration value="SALES_CONTRACT_CONTRACTED_CLICKS"/>
 *     &lt;enumeration value="SALES_CONTRACT_CONTRACTED_VOLUME"/>
 *     &lt;enumeration value="SALES_CONTRACT_BUDGET"/>
 *     &lt;enumeration value="SALES_CONTRACT_REMAINING_BUDGET"/>
 *     &lt;enumeration value="SALES_CONTRACT_BUFFERED_IMPRESSIONS"/>
 *     &lt;enumeration value="SALES_CONTRACT_BUFFERED_CLICKS"/>
 *     &lt;enumeration value="SCHEDULED_SCHEDULED_IMPRESSIONS"/>
 *     &lt;enumeration value="SCHEDULED_SCHEDULED_CLICKS"/>
 *     &lt;enumeration value="SCHEDULED_SCHEDULED_VOLUME"/>
 *     &lt;enumeration value="SCHEDULED_SCHEDULED_NET_REVENUE"/>
 *     &lt;enumeration value="SCHEDULED_LOCAL_SCHEDULED_NET_REVENUE"/>
 *     &lt;enumeration value="SCHEDULED_SCHEDULED_GROSS_REVENUE"/>
 *     &lt;enumeration value="SCHEDULED_LOCAL_SCHEDULED_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_BUDGET"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_REMAINING_BUDGET"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_CONTRACTED_VOLUME"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_CONTRACTED_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_CONTRACTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_CONTRACTED_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_CONTRACTED_NET_REVENUE_WITH_VAT"/>
 *     &lt;enumeration value="SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_NET_REVENUE_WITH_VAT"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_SCHEDULED_VOLUME"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_SCHEDULED_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_LOCAL_TOTAL_SCHEDULED_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_TOTAL_SCHEDULED_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALES_TOTAL_LOCAL_TOTAL_SCHEDULED_GROSS_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_UNRECONCILED_NET_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_LOCAL_UNRECONCILED_NET_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_UNRECONCILED_GROSS_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_LOCAL_UNRECONCILED_GROSS_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_FORECASTED_NET_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_LOCAL_FORECASTED_NET_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_FORECASTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_LOCAL_FORECASTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_UNIFIED_NET_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_LOCAL_UNIFIED_NET_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_LOCAL_UNIFIED_GROSS_REVENUE"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_UNIFIED_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_LOCAL_UNIFIED_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_UNRECONCILED_VOLUME"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_FORECASTED_VOLUME"/>
 *     &lt;enumeration value="UNIFIED_REVENUE_UNIFIED_VOLUME"/>
 *     &lt;enumeration value="EXPECTED_REVENUE_EXPECTED_NET_REVENUE"/>
 *     &lt;enumeration value="EXPECTED_REVENUE_LOCAL_EXPECTED_NET_REVENUE"/>
 *     &lt;enumeration value="EXPECTED_REVENUE_EXPECTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="EXPECTED_REVENUE_LOCAL_EXPECTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALES_PIPELINE_PIPELINE_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_PIPELINE_LOCAL_PIPELINE_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_PIPELINE_PIPELINE_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALES_PIPELINE_LOCAL_PIPELINE_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALES_PIPELINE_PIPELINE_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="SALES_PIPELINE_LOCAL_PIPELINE_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="RECONCILIATION_DFP_VOLUME"/>
 *     &lt;enumeration value="RECONCILIATION_THIRD_PARTY_VOLUME"/>
 *     &lt;enumeration value="RECONCILIATION_RECONCILED_VOLUME"/>
 *     &lt;enumeration value="RECONCILIATION_DISCREPANCY_PERCENTAGE"/>
 *     &lt;enumeration value="RECONCILIATION_RECONCILED_REVENUE"/>
 *     &lt;enumeration value="RECONCILIATION_IMPRESSION_DISCREPANCY"/>
 *     &lt;enumeration value="RECONCILIATION_CLICK_DISCREPANCY"/>
 *     &lt;enumeration value="RECONCILIATION_REVENUE_DISCREPANCY"/>
 *     &lt;enumeration value="BILLING_BILLABLE_NET_REVENUE"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_NET_REVENUE"/>
 *     &lt;enumeration value="BILLING_BILLABLE_GROSS_REVENUE"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_GROSS_REVENUE"/>
 *     &lt;enumeration value="BILLING_BILLABLE_NET_REVENUE_BEFORE_MANUAL_ADJUSTMENT"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_NET_REVENUE_BEFORE_MANUAL_ADJUSTMENT"/>
 *     &lt;enumeration value="BILLING_BILLABLE_GROSS_REVENUE_BEFORE_MANUAL_ADJUSTMENT"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_GROSS_REVENUE_BEFORE_MANUAL_ADJUSTMENT"/>
 *     &lt;enumeration value="BILLING_BILLABLE_VAT"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_VAT"/>
 *     &lt;enumeration value="BILLING_BILLABLE_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="BILLING_CAP_QUANTITY"/>
 *     &lt;enumeration value="BILLING_BILLABLE_VOLUME"/>
 *     &lt;enumeration value="BILLING_DELIVERY_ROLLOVER"/>
 *     &lt;enumeration value="BILLING_REALIZED_CPM"/>
 *     &lt;enumeration value="BILLING_REALIZED_RATE"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_OVERALL_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_BILLABLE_NET_OVERALL_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_NON_BILLABLE"/>
 *     &lt;enumeration value="INVOICED_IMPRESSIONS"/>
 *     &lt;enumeration value="INVOICED_UNFILLED_IMPRESSIONS"/>
 *     &lt;enumeration value="NIELSEN_IMPRESSIONS"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_IMPRESSIONS"/>
 *     &lt;enumeration value="NIELSEN_POPULATION_BASE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_POPULATION_BASE"/>
 *     &lt;enumeration value="NIELSEN_UNIQUE_AUDIENCE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_UNIQUE_AUDIENCE"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_AUDIENCE_REACH"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH"/>
 *     &lt;enumeration value="NIELSEN_AVERAGE_FREQUENCY"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_AVERAGE_FREQUENCY"/>
 *     &lt;enumeration value="NIELSEN_GROSS_RATING_POINTS"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_GROSS_RATING_POINTS"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_IMPRESSIONS_SHARE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_POPULATION_SHARE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_AUDIENCE_SHARE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE"/>
 *     &lt;enumeration value="NIELSEN_AUDIENCE_INDEX"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_AUDIENCE_INDEX"/>
 *     &lt;enumeration value="NIELSEN_IMPRESSIONS_INDEX"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_IMPRESSIONS_INDEX"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_IMPRESSIONS"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_CLICKS"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_CTR"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_REVENUE"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_ECPM"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_REVENUE"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_ECPM"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Column")
@XmlEnum
public enum Column {


    /**
     * 
     *                 The number of impressions delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_IMPRESSIONS,

    /**
     * 
     *                 The number of downloaded impressions delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_DOWNLOADED_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by the ad server by explicit custom criteria targeting.
     *               
     * 
     */
    AD_SERVER_TARGETED_IMPRESSIONS,

    /**
     * 
     *                 The number of clicks delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_CLICKS,

    /**
     * 
     *                 The number of clicks delivered by the ad server by explicit custom criteria targeting.
     *               
     * 
     */
    AD_SERVER_TARGETED_CLICKS,

    /**
     * 
     *                 The CTR for an ad delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_CTR,

    /**
     * 
     *                 The CPM and CPC revenue earned, calculated in publisher currency,
     *                 for the ads delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_CPM_AND_CPC_REVENUE,

    /**
     * 
     *                 The CPD revenue earned, calculated in publisher currency,
     *                 for the ads delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_CPD_REVENUE,

    /**
     * 
     *                 The CPA revenue earned, calculated in publisher currency, for the ads delivered by the
     *                 ad server.
     *               
     * 
     */
    AD_SERVER_CPA_REVENUE,

    /**
     * 
     *                 The CPM, CPC and CPD revenue earned, calculated in publisher currency,
     *                 for the ads delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_ALL_REVENUE,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the CPM and CPC ads
     *                 delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the CPM, CPC and CPD ads
     *                 delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_WITH_CPD_AVERAGE_ECPM,

    /**
     * 
     *                 The ratio of the number of impressions delivered to the total impressions
     *                 delivered when no {@link LineItem} reservation could be found by the ad server
     *                 for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_INVENTORY_LEVEL_PERCENT_IMPRESSIONS,

    /**
     * 
     *                 The ratio of the number of impressions delivered to the total impressions
     *                 delivered by the ad server for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS,

    /**
     * 
     *                 The ratio of the number of clicks delivered to the total clicks delivered
     *                 when no {@link LineItem} reservation could be found by the ad server for
     *                 inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_INVENTORY_LEVEL_PERCENT_CLICKS,

    /**
     * 
     *                 The ratio of the number of clicks delivered to the total clicks delivered
     *                 by the ad server for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS,

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM and CPC revenue earned
     *                 by ads delivered when no {@link LineItem} reservation could be found by
     *                 the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_INVENTORY_LEVEL_WITHOUT_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM, CPC and CPD revenue earned
     *                 by ads delivered when no {@link LineItem} reservation could be found by
     *                 the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM and CPC revenue earned by
     *                 the ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM, CPC and CPD revenue earned by
     *                 the ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The number of times that the code for an ad is served by the ad server.
     *               
     * 
     */
    AD_SERVER_CODE_SERVED_COUNT,

    /**
     * 
     *                 The number of downloaded impressions delivered by the ad server including impressions
     *                 recognized as spam.
     *               
     * 
     */
    AD_SERVER_UNFILTERED_IMPRESSIONS,

    /**
     * 
     *                 The number of clicks delivered by the ad server including clicks recognized as spam.
     *               
     * 
     */
    AD_SERVER_UNFILTERED_CLICKS,

    /**
     * 
     *                 The number of impressions a dynamic allocation ad delivered when no {@link LineItem}
     *                 reservation could be found by the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions an AdSense ad delivered for line item-level dynamic allocation.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions an AdSense ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS,

    /**
     * 
     *                 The number of clicks a dynamic allocation ad delivered when no {@link LineItem}
     *                 reservation could be found by the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_CLICKS,

    /**
     * 
     *                 The number of clicks an AdSense ad delivered for line item-level dynamic allocation.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_CLICKS,

    /**
     * 
     *                 The number of clicks an AdSense ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS,

    /**
     * 
     *                 The ratio of clicks a dynamic allocation ad delivered to the number of impressions it
     *                 delivered when no {@link LineItem} reservation could be found by the ad server for
     *                 inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_CTR,

    /**
     * 
     *                 The ratio of clicks an AdSense reservation ad delivered to the number of
     *                 impressions it delivered, including line item-level dynamic allocation.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_CTR,

    /**
     * 
     *                 Revenue generated from ads delivered for dynamic allocation when no {@link LineItem}
     *                 reservation could be found by the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_REVENUE,

    /**
     * 
     *                 Revenue generated from AdSense ads delivered for line item-level dynamic allocation.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_REVENUE,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from dynamic allocation
     *                 ads delivered when no {@link LineItem} reservation could be found by
     *                 the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_AVERAGE_ECPM,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the ads
     *                 delivered by AdSense for line item-level dynamic allocation.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM,

    /**
     * 
     *                 The ratio of the number of impressions delivered by dynamic allocation ads
     *                 to the total impressions delivered when no {@link LineItem} reservation could
     *                 be found by the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_PERCENT_IMPRESSIONS,

    /**
     * 
     *                 The ratio of the number of impressions delivered by AdSense reservation
     *                 ads to the total impressions delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS,

    /**
     * 
     *                 The ratio of the number of clicks delivered by dynamic allocation ads
     *                 to the total clicks delivered when no {@link LineItem} reservation could be
     *                 found by the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_PERCENT_CLICKS,

    /**
     * 
     *                 The ratio of the number of clicks delivered by AdSense reservation ads to
     *                 the total clicks delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS,

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the dynamic allocation
     *                 CPM and CPC ads delivered when no {@link LineItem} reservation could be found
     *                 by the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_WITHOUT_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the dynamic allocation
     *                 CPM, CPC and CPD ads delivered when no {@link LineItem} reservation could be found
     *                 by the ad server for inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the CPM and CPC ads
     *                 delivered by AdSense for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the CPM, CPC and CPD ads
     *                 delivered by AdSense for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The number of impressions an Ad Exchange ad delivered for line item-level dynamic allocation.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS,

    /**
     * 
     *                 Ad Impressions on mapped Ad Exchange properties. When multiple text ads fill a single display
     *                 slot it is only counted once, when the top text ad is recognized. In these cases, the Ad
     *                 Impression is attributed to the top text ad.
     *               
     * 
     */
    AD_EXCHANGE_IMPRESSIONS,

    /**
     * 
     *                 Number of requests where a buyer was matched with the Ad request, for mapped Ad Exchange
     *                 properties.
     *               
     * 
     */
    AD_EXCHANGE_MATCHED_REQUESTS,

    /**
     * 
     *                 Ad revenue per 1000 ad impressions, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_AD_ECPM,

    /**
     * 
     *                 The number of clicks delivered by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_CLICKS,

    /**
     * 
     *                 The estimated net revenue generated by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_ESTIMATED_REVENUE,

    /**
     * 
     *                 The coverage reported by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_COVERAGE,

    /**
     * 
     *                 The matched queries click-through rate delivered by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_CTR,

    /**
     * 
     *                 The total lift generated by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_LIFT,

    /**
     * 
     *                 The cost-per-click generated by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_CPC,

    /**
     * 
     *                 The number of ad requests issued by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_AD_REQUESTS,

    /**
     * 
     *                 The average estimated cost-per-thousand-ad requests earned by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_AD_REQUEST_ECPM,

    /**
     * 
     *                 The click-through rate of ad requests issued by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_AD_REQUEST_CTR,

    /**
     * 
     *                 The click-through rate of impressions issued by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_AD_CTR,

    /**
     * 
     *                 The video drop off rate for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_DROPOFF_RATE,

    /**
     * 
     *                 The video abandonment rate for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_ABANDONMENT_RATE,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions generated by mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_MATCHED_ECPM,

    /**
     * 
     *                 The estimated percentage of impressions generated by mapped Ad Exchange properties that are
     *                 eligible for Active View measurement.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE,

    /**
     * 
     *                 The percentage of viewable impressions out of all measurable impressions generated by mapped
     *                 Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE,

    /**
     * 
     *                 The average time (in seconds) that an individual ad impression generated by mapped Ad Exchange
     *                 properties was viewable.
     *               
     * 
     */
    AD_EXCHANGE_AVERAGE_VIEWABLE_TIME,

    /**
     * 
     *                 Total number of impressions generated by mapped Ad Exchange properties that were eligible to
     *                 measure viewability.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_ENABLED_IMPRESSIONS,

    /**
     * 
     *                 Total number of eligible impressions generated by mapped Ad Exchange properties that were
     *                 measurable by Active View.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURED_IMPRESSIONS,

    /**
     * 
     *                 Total number of Active View measurable impressions generated by mapped Ad Exchange properties
     *                 that were viewable.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWED_IMPRESSIONS,

    /**
     * 
     *                 Number of responses that shows that a buyer is bidding, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_DEALS_BID_RESPONSES,

    /**
     * 
     *                 Deal ad requests for mapped Ad Exchange properties which were ?matched? with demand from the
     *                 buyer associated with the Deal. Each ?Deals matched request? represents one opportunity for the
     *                 Deal Buyer to serve their ad in the context of the Deal.
     *               
     * 
     */
    AD_EXCHANGE_DEALS_MATCHED_REQUESTS,

    /**
     * 
     *                 Total ad requests associated with a given Deal, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_DEALS_AD_REQUESTS,

    /**
     * 
     *                 Deals matched requests divided by Deals ad requests, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_DEALS_MATCH_RATE,

    /**
     * 
     *                 A count of how many users watch the first 25% of a video ad, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_QUARTILE_1,

    /**
     * 
     *                 A count of how many users watch the first 75% of a video ad, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_QUARTILE_3,

    /**
     * 
     *                 Percentage of times a user clicked Skip, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TRUEVIEW_SKIP_RATE,

    /**
     * 
     *                 Number of times a video ad has been viewed to completion or watched to 30 seconds, whichever
     *                 happens first, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TRUEVIEW_VIEWS,

    /**
     * 
     *                 TrueView views divided by TrueView impressions, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TRUEVIEW_VTR,

    /**
     * 
     *                 The third-party fill rate by Ad Exchange properties linked to DFP.
     *                 
     *                 <p><b>This experimental column only works with Ad Exchange web properties linked with an active
     *                 status.</b>
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    AD_EXCHANGE_THIRD_PARTY_FILL_RATE,

    /**
     * 
     *                 Impressions generated for mediation requests.  This includes third-party network and
     *                 Ad Exchange impressions for mediation.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_IMPRESSIONS,

    /**
     * 
     *                 Estimated revenue generated for mediation requests.  This combines estimated revenue from
     *                 third-parties along with Ad Exchange.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_ESTIMATED_REVENUE,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from mediation ads.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_ECPM,

    /**
     * 
     *                 Mediation third-party average cost-per-thousand-impressions.
     *               
     * 
     */
    MEDIATION_THIRD_PARTY_ECPM,

    /**
     * 
     *                 Mediation fill rate indicating how often a network fills an ad request.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_FILL_RATE,

    /**
     * 
     *                 Mediation passbacks recorded when a network does not fill an ad request.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    MEDIATION_PASSBACKS,

    /**
     * 
     *                 The number of impressions an Ad Exchange ad delivered for line item-level dynamic allocation
     *                 by explicit custom criteria targeting.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS,

    /**
     * 
     *                 The number of clicks an Ad Exchange ad delivered for line item-level dynamic allocation.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS,

    /**
     * 
     *                 The number of clicks an Ad Exchange ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS,

    /**
     * 
     *                 The ratio of clicks an Ad Exchange ad delivered to the number of
     *                 impressions it delivered for line item-level dynamic allocation.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_CTR,

    /**
     * 
     *                 The ratio of the number of impressions delivered to the total impressions delivered
     *                 by Ad Exchange for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS,

    /**
     * 
     *                 The ratio of the number of clicks delivered to the total clicks delivered
     *                 by Ad Exchange for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS,

    /**
     * 
     *                 Revenue generated from Ad Exchange ads delivered for line item-level dynamic allocation.
     *                 Represented in publisher currency and time zone.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE,

    /**
     * 
     *                 The ratio of revenue generated by Ad Exchange to the total revenue earned
     *                 by CPM and CPC ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The ratio of revenue generated by Ad Exchange to the total revenue earned
     *                 by CPM, CPC and CPD ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the
     *                 delivery of Ad Exchange ads for line item-level dynamic allocation.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM,

    /**
     * 
     *                 The total number of impressions delivered by the ad servers
     *                 including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_IMPRESSIONS,

    /**
     * 
     *                 The total number of impressions delivered including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,

    /**
     * 
     *                 The total number of impressions delivered including line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered by the ad servers
     *                 including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_CLICKS,

    /**
     * 
     *                 The total number of clicks delivered including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CLICKS,

    /**
     * 
     *                 The total number of clicks delivered including line item-level dynamic allocation by
     *                 explicit custom criteria targeting
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS,

    /**
     * 
     *                 The ratio of total clicks on ads delivered by the ad servers to the total number
     *                 of impressions delivered for an ad including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_CTR,

    /**
     * 
     *                 The ratio of total clicks on ads delivered by the ad servers to the total number
     *                 of impressions delivered for an ad including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CTR,

    /**
     * 
     *                 The total CPM and CPC revenue generated by the ad servers
     *                 including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_CPM_AND_CPC_REVENUE,

    /**
     * 
     *                 The total CPM, CPC and CPD revenue generated by the ad servers
     *                 including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_ALL_REVENUE,

    /**
     * 
     *                 The total CPM and CPC revenue generated by the ad servers
     *                 including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,

    /**
     * 
     *                 The total CPM, CPC and CPD revenue generated by the ad servers
     *                 including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE,

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM and CPC ads delivered by the
     *                 ad servers including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_WITHOUT_CPD_AVERAGE_ECPM,

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM, CPC and CPD ads delivered by the
     *                 ad servers including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_WITH_CPD_AVERAGE_ECPM,

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM and CPC ads delivered by the
     *                 ad servers including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM,

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM, CPC and CPD ads delivered by the
     *                 ad servers including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM,

    /**
     * 
     *                 The total number of times that the code for an ad is served by the ad server including
     *                 inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_CODE_SERVED_COUNT,

    /**
     * 
     *                 The total number of missed impressions due to the ad servers' inability to
     *                 find ads to serve, including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS,

    /**
     * 
     *                 The number of control (unoptimized) impressions delivered for an ad for
     *                 which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_CONTROL_IMPRESSIONS,

    /**
     * 
     *                 Number of clicks resulting from the delivery of control (unoptimized)
     *                 impressions for an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_CONTROL_CLICKS,

    /**
     * 
     *                 The CTR for control (unoptimized) impressions for an order for which the
     *                 optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_CONTROL_CTR,

    /**
     * 
     *                 Number of optimized impressions delivered for an ad for which the
     *                 optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_IMPRESSIONS,

    /**
     * 
     *                 Number of clicks resulting from the delivery of optimized impressions for
     *                 an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_CLICKS,

    /**
     * 
     *                 Number of non-optimized impressions delivered for an ad for which the
     *                 optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_NON_OPTIMIZED_IMPRESSIONS,

    /**
     * 
     *                 Number of clicks resulting from the delivery of non-optimized impressions for
     *                 an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_NON_OPTIMIZED_CLICKS,

    /**
     * 
     *                 Number of extra clicks resulting from the delivery of optimized impressions
     *                 for an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_EXTRA_CLICKS,

    /**
     * 
     *                 The CTR for optimized impressions for an ad for which the optimization
     *                 feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_CTR,

    /**
     * 
     *                 The percentage by which optimized CTRs are greater than the unoptimized
     *                 CTRs. This is calculated as (({@link Column#OPTIMIZATION_OPTIMIZED_CTR}/
     *                 {@link Column#OPTIMIZATION_CONTROL_CTR}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_LIFT,

    /**
     * 
     *                 The line item coverage measures how often the traffic was sent for
     *                 optimization.
     *               
     * 
     */
    OPTIMIZATION_COVERAGE,

    /**
     * 
     *                 The number of impressions that were behind schedule at the time of their delivery.
     *               
     * 
     */
    OPTIMIZATION_BEHIND_SCHEDULE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions that did not have any clicks recorded in the recent past.
     *               
     * 
     */
    OPTIMIZATION_NO_CLICKS_RECORDED_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions that were delivered as sponsorship items.
     *               
     * 
     */
    OPTIMIZATION_SPONSORSHIP_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions that were set to deliver as fast as possible.
     *               
     * 
     */
    OPTIMIZATION_AS_FAST_AS_POSSIBLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions that have no absolute lifetime delivery goals.
     *               
     * 
     */
    OPTIMIZATION_NO_ABSOLUTE_LIFETIME_GOAL_IMPRESSIONS,

    /**
     * 
     *                 Total revenue resulting from the delivery of control (unoptimized)
     *                 impressions for an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_CONTROL_REVENUE,

    /**
     * 
     *                 Total revenue resulting from the delivery of optimized impressions for
     *                 an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_REVENUE,

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of control (unoptimized)
     *                 impressions for an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_CONTROL_ECPM,

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of optimized
     *                 impressions for an ad for which the optimization feature has been enabled.
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_ECPM,

    /**
     * 
     *                 Freed-up impressions as a result of optimization.
     *               
     * 
     */
    OPTIMIZATION_FREED_UP_IMPRESSIONS,

    /**
     * 
     *                 Relative change in eCPM as a result of optimization.
     *               
     * 
     */
    OPTIMIZATION_ECPM_LIFT,

    /**
     * 
     *                 The average number of ads displayed to each unique visitor.
     *               
     * 
     */
    REACH_FREQUENCY,

    /**
     * 
     *                 The average revenue earned per unique visitor.
     *               
     * 
     */
    REACH_AVERAGE_REVENUE,

    /**
     * 
     *                 The number of unique visitors.
     *               
     * 
     */
    REACH,

    /**
     * 
     *                 The number of people in the given demographic bucket.
     *               
     * 
     */
    GRP_POPULATION,

    /**
     * 
     *                 The number of unique users reached in the given demographic bucket.
     *               
     * 
     */
    GRP_UNIQUE_AUDIENCE,

    /**
     * 
     *                 Percentage of the number of unique users reached in the given demographic bucket (out of the
     *                 number of unique users reached in all demographics).
     *               
     * 
     */
    GRP_UNIQUE_AUDIENCE_SHARE,

    /**
     * 
     *                 The number of impressions in the given demographic bucket.
     *               
     * 
     */
    GRP_AUDIENCE_IMPRESSIONS,

    /**
     * 
     *                 Percentage of the number of impressions in the given demographic bucket (out of the number of
     *                 impressions in all demographics).
     *               
     * 
     */
    GRP_AUDIENCE_IMPRESSIONS_SHARE,

    /**
     * 
     *                 The audience reach calculated as {@link #GRP_UNIQUE_AUDIENCE} / {@link #GRP_POPULATION}.
     *               
     * 
     */
    GRP_AUDIENCE_REACH,

    /**
     * 
     *                 The audience average frequency calculated as {@link #GRP_AUDIENCE_IMPRESSIONS} / {@link
     *                 #GRP_UNIQUE_AUDIENCE}.
     *               
     * 
     */
    GRP_AUDIENCE_AVERAGE_FREQUENCY,

    /**
     * 
     *                 The gross rating points (GRP) calculated as {@link #GRP_AUDIENCE_REACH} * {@link
     *                 #GRP_AUDIENCE_AVERAGE_FREQUENCY} * 100.
     *               
     * 
     */
    GRP_GROSS_RATING_POINTS,

    /**
     * 
     *                 The number of impressions for a particular SDK mediation creative.
     *               
     * 
     */
    SDK_MEDIATION_CREATIVE_IMPRESSIONS,

    /**
     * 
     *                 The number of clicks for a particular SDK mediation creative.
     *               
     * 
     */
    SDK_MEDIATION_CREATIVE_CLICKS,

    /**
     * 
     *                 The number of forecasted impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down and for the next 12
     *                 months with a monthly break down.
     *               
     * 
     */
    SELL_THROUGH_FORECASTED_IMPRESSIONS,

    /**
     * 
     *                 The number of available impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *               
     * 
     */
    SELL_THROUGH_AVAILABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of reserved impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *               
     * 
     */
    SELL_THROUGH_RESERVED_IMPRESSIONS,

    /**
     * 
     *                 The sell-through rate for impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *               
     * 
     */
    SELL_THROUGH_SELL_THROUGH_RATE,

    /**
     * 
     *                 The total number of times a backup image is served in place of a rich media ad.
     *               
     * 
     */
    RICH_MEDIA_BACKUP_IMAGES,

    /**
     * 
     *                 The amount of time(seconds) that each rich media ad is displayed to users.
     *               
     * 
     */
    RICH_MEDIA_DISPLAY_TIME,

    /**
     * 
     *                 The average amount of time(seconds) that each rich media ad is displayed to users.
     *               
     * 
     */
    RICH_MEDIA_AVERAGE_DISPLAY_TIME,

    /**
     * 
     *                 The number of times an expanding ad was expanded.
     *               
     * 
     */
    RICH_MEDIA_EXPANSIONS,

    /**
     * 
     *                 The average amount of time(seconds) that an expanding ad is viewed in an expanded state.
     *               
     * 
     */
    RICH_MEDIA_EXPANDING_TIME,

    /**
     * 
     *                 The average amount of time(seconds) that a user interacts with a rich media ad.
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_TIME,

    /**
     * 
     *                 The number of times that a user interacts with a rich media ad.
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_COUNT,

    /**
     * 
     *                 The ratio of rich media ad interactions to the number of times the ad was displayed.
     *                 Represented as a percentage.
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_RATE,

    /**
     * 
     *                 The average amount of time(seconds) that a user interacts with a rich media ad.
     *               
     * 
     */
    RICH_MEDIA_AVERAGE_INTERACTION_TIME,

    /**
     * 
     *                 The number of impressions where a user interacted with a rich media ad.
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_IMPRESSIONS,

    /**
     * 
     *                 The number of times that a user manually closes a floating, expanding,
     *                 in-page with overlay, or in-page with floating ad.
     *               
     * 
     */
    RICH_MEDIA_MANUAL_CLOSES,

    /**
     * 
     *                 A metric that measures an impression only once when a user opens an ad in full screen mode.
     *               
     * 
     */
    RICH_MEDIA_FULL_SCREEN_IMPRESSIONS,

    /**
     * 
     *                 The number of times a user clicked on the graphical controls of a video player.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_INTERACTIONS,

    /**
     * 
     *                 The ratio of video interactions to video plays.
     *                 Represented as a percentage.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_INTERACTION_RATE,

    /**
     * 
     *                 The number of times a rich media video was muted.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_MUTES,

    /**
     * 
     *                 The number of times a rich media video was paused.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_PAUSES,

    /**
     * 
     *                 The number of times a rich media video was played.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_PLAYES,

    /**
     * 
     *                 The number of times a rich media video was played upto midpoint.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_MIDPOINTS,

    /**
     * 
     *                 The number of times a rich media video was fully played.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_COMPLETES,

    /**
     * 
     *                 The number of times a rich media video was restarted.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_REPLAYS,

    /**
     * 
     *                 The number of times a rich media video was stopped.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_STOPS,

    /**
     * 
     *                 The number of times a rich media video was unmuted.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_UNMUTES,

    /**
     * 
     *                 The average amount of time(seconds) that a rich media video was viewed per view.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_VIEW_TIME,

    /**
     * 
     *                 The percentage of a video watched by a user.
     *               
     * 
     */
    RICH_MEDIA_VIDEO_VIEW_RATE,

    /**
     * 
     *                 The amount of time (seconds) that a user interacts with a rich media ad.
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_EVENT_TIME,

    /**
     * 
     *                 The number of times a user views and interacts with a specified part of a rich media ad.
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_EVENT_COUNT,

    /**
     * 
     *                 The number of impressions where the video was played.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_START,

    /**
     * 
     *                 The number of times the video played to 25% of its length.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_FIRST_QUARTILE,

    /**
     * 
     *                 The number of times the video reached its midpoint during play.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_MIDPOINT,

    /**
     * 
     *                 The number of times the video played to 75% of its length.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_THIRD_QUARTILE,

    /**
     * 
     *                 The number of times the video played to completion.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_COMPLETE,

    /**
     * 
     *                 Average percentage of the video watched by users.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE,

    /**
     * 
     *                 Average time(seconds) users watched the video.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME,

    /**
     * 
     *                 Percentage of times the video played to the end.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_COMPLETION_RATE,

    /**
     * 
     *                 The number of times an error occurred, such as a VAST redirect error, a video playback error,
     *                 or an invalid response error.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT,

    /**
     * 
     *                 Duration of the video creative.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_VIDEO_LENGTH,

    /**
     * 
     *                 The number of times a skip button is shown in video.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN,

    /**
     * 
     *                 The number of engaged views i.e. ad is viewed to completion
     *                 or for 30s, whichever comes first.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_ENGAGED_VIEW,

    /**
     * 
     *                 View-through rate represented as a percentage.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE,

    /**
     * 
     *                 Number of times that the publisher specified a video ad played automatically.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AUTO_PLAYS,

    /**
     * 
     *                 Number of times that the publisher specified a video ad was clicked to play.
     *               
     * 
     */
    VIDEO_VIEWERSHIP_CLICK_TO_PLAYS,

    /**
     * 
     *                 Error rate is the percentage of video error count from (error count + total impressions).
     *               
     * 
     */
    VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE,

    /**
     * 
     *                 Number of VAST video errors of type 100.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_100_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 101.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_101_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 102.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_102_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 200.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_200_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 201.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_201_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 202.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_202_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 203.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_203_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 300.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_300_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 301.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_301_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 302.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_302_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 303.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_303_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 400.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_400_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 401.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_401_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 402.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_402_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 403.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_403_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 405.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_405_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 500.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_500_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 501.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_501_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 502.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_502_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 503.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_503_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 600.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_600_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 601.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_601_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 602.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_602_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 603.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_603_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 604.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_604_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 900.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_900_COUNT,

    /**
     * 
     *                 Number of VAST video errors of type 901.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_901_COUNT,

    /**
     * 
     *                 Video interaction event: The number of times user paused ad clip.
     *               
     * 
     */
    VIDEO_INTERACTION_PAUSE,

    /**
     * 
     *                 Video interaction event: The number of times the user unpaused the video.
     *               
     * 
     */
    VIDEO_INTERACTION_RESUME,

    /**
     * 
     *                 Video interaction event: The number of times a user rewinds the video.
     *               
     * 
     */
    VIDEO_INTERACTION_REWIND,

    /**
     * 
     *                 Video interaction event: The number of times video player was in mute state during play
     *                 of ad clip.
     *               
     * 
     */
    VIDEO_INTERACTION_MUTE,

    /**
     * 
     *                 Video interaction event: The number of times a user unmutes the video.
     *               
     * 
     */
    VIDEO_INTERACTION_UNMUTE,

    /**
     * 
     *                 Video interaction event: The number of times a user collapses a video,
     *                 either to its original size or to a different size.
     *               
     * 
     */
    VIDEO_INTERACTION_COLLAPSE,

    /**
     * 
     *                 Video interaction event: The number of times a user expands a video.
     *               
     * 
     */
    VIDEO_INTERACTION_EXPAND,

    /**
     * 
     *                 Video interaction event: The number of times ad clip played in full screen mode.
     *               
     * 
     */
    VIDEO_INTERACTION_FULL_SCREEN,

    /**
     * 
     *                 Video interaction event: The number of user interactions with a video, on average,
     *                 such as pause, full screen, mute, etc.
     *               
     * 
     */
    VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE,

    /**
     * 
     *                 Video interaction event: The number of times a skippable video is skipped.
     *               
     * 
     */
    VIDEO_INTERACTION_VIDEO_SKIPS,

    /**
     * 
     *                 The number of control starts.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_STARTS,

    /**
     * 
     *                 The number of optimized starts.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_STARTS,

    /**
     * 
     *                 The number of control completes.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_COMPLETES,

    /**
     * 
     *                 The number of optimized completes.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES,

    /**
     * 
     *                 The rate of control completions.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE,

    /**
     * 
     *                 The rate of optimized completions.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE,

    /**
     * 
     *                 The percentage by which optimized completion rate is greater than the unoptimized completion
     *                 rate. This is calculated as (( {@link Column#VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE}/
     *                 {@link Column#VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT,

    /**
     * 
     *                 The number of control skip buttons shown.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN,

    /**
     * 
     *                 The number of optimized skip buttons shown.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN,

    /**
     * 
     *                 The number of control engaged views.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW,

    /**
     * 
     *                 The number of optimized engaged views.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW,

    /**
     * 
     *                 The control view-through rate.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE,

    /**
     * 
     *                 The optimized view-through rate.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE,

    /**
     * 
     *                 The percentage by which optimized view-through rate is greater than the unoptimized
     *                 view-through rate. This is calculated as (( {@link
     *                 Column#VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE}/ {@link
     *                 Column#VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *               
     * 
     */
    VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT,

    /**
     * 
     *                 The total number of impressions viewed on the user's screen.
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The total number of impressions that were sampled and measured by active view.
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of total impressions viewed on the user's screen (out of the total impressions
     *                 measurable by active view).
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Total number of impressions that were eligible to measure viewability.
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of total impressions that were measurable by active view (out of all the total
     *                 impressions sampled for active view).
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Active View total average time in seconds that specific impressions are reported as being
     *                 viewable.
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME,

    /**
     * 
     *                 The number of impressions delivered by the ad server viewed on the user's screen.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by the ad server that were sampled, and measurable by
     *                 active view.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by the ad server viewed on the user's screen (out of
     *                 the ad server impressions measurable by active view).
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Total number of impressions delivered by the ad server that were eligible to measure
     *                 viewability.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by the ad server that were measurable by active view (
     *                 out of all the ad server impressions sampled for active view).
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Active View ad server revenue.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_REVENUE,

    /**
     * 
     *                 Active View ad server average time in seconds that specific impressions are reported as being
     *                 viewable.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME,

    /**
     * 
     *                 The number of impressions delivered by AdSense viewed on the user's screen,
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by AdSense that were sampled, and measurable by active
     *                 view.
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by AdSense viewed on the user's screen (out of AdSense
     *                 impressions measurable by active view).
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Total number of impressions delivered by AdSense that were eligible to measure viewability.
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by AdSense that were measurable by active view ( out of
     *                 all AdSense impressions sampled for active view).
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Active View AdSense revenue.
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_REVENUE,

    /**
     * 
     *                 Active View AdSense average time in seconds that specific impressions are reported as being
     *                 viewable.
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME,

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange viewed on the user's screen,
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange that were sampled, and measurable by active
     *                 view.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by Ad Exchange viewed on the user's screen (out of Ad
     *                 Exchange impressions measurable by active view).
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Total number of impressions delivered by Ad Exchange that were eligible to measure viewability.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by Ad Exchange that were measurable by active view (
     *                 out of all Ad Exchange impressions sampled for active view).
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Active View AdExchange revenue.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_REVENUE,

    /**
     * 
     *                 Active View AdExchange average time in seconds that specific impressions are reported as being
     *                 viewable.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME,

    /**
     * 
     *                 Active View total revenue.
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_REVENUE,

    /**
     * 
     *                 Cost for audience extension
     *                 ie. cost the publisher had to pay in order to buy the inventory.
     *                 
     *                 <p>This field is deprecated and will be removed in v201805.
     *               
     * 
     */
    AUDIENCE_EXTENSION_COST,

    /**
     * 
     *                 Number of view-through conversions.
     *               
     * 
     */
    VIEW_THROUGH_CONVERSIONS,

    /**
     * 
     *                 Number of view-through conversions per thousand impressions.
     *               
     * 
     */
    CONVERSIONS_PER_THOUSAND_IMPRESSIONS,

    /**
     * 
     *                 Number of click-through conversions.
     *               
     * 
     */
    CLICK_THROUGH_CONVERSIONS,

    /**
     * 
     *                 Number of click-through conversions per click.
     *               
     * 
     */
    CONVERSIONS_PER_CLICK,

    /**
     * 
     *                 Revenue for view-through conversions.
     *               
     * 
     */
    VIEW_THROUGH_REVENUE,

    /**
     * 
     *                 Revenue for click-through conversions.
     *               
     * 
     */
    CLICK_THROUGH_REVENUE,

    /**
     * 
     *                 Total number of conversions.
     *               
     * 
     */
    TOTAL_CONVERSIONS,

    /**
     * 
     *                 Total revenue for conversions.
     *               
     * 
     */
    TOTAL_CONVERSION_REVENUE,

    /**
     * 
     *                 The number of impressions sent to Ad Exchange / AdSense, regardless of whether they
     *                 won or lost (total number of dynamic allocation impressions).
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL,

    /**
     * 
     *                 The number of unfilled queries that attempted dynamic allocation by Ad Exchange / AdSense.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING,

    /**
     * 
     *                 The number of Ad Exchange / AdSense and DFP impressions.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL,

    /**
     * 
     *                 The difference between eligible impressions and competing impressions in dynamic allocation.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL,

    /**
     * 
     *                 The percentage of eligible impressions that are not competing in dynamic allocation.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL,

    /**
     * 
     *                 The percent of eligible impressions participating in dynamic allocation.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL,

    /**
     * 
     *                 The percent of total dynamic allocation queries that won.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL,

    /**
     * 
     *                 The contracted net revenue of the {@link ProposalLineItem}.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE,

    /**
     * 
     *                 The contracted net revenue in the local currency of the {@link ProposalLineItem}.
     *                 
     *                 See {@link #CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE}
     *               
     * 
     */
    CONTRACTED_REVENUE_LOCAL_CONTRACTED_NET_REVENUE,

    /**
     * 
     *                 The contracted gross revenue of the {@link ProposalLineItem}, including agency commission.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_GROSS_REVENUE,

    /**
     * 
     *                 The contracted gross revenue in the local currency of the {@link ProposalLineItem}, including
     *                 agency commission.
     *                 
     *                 See {@link #CONTRACTED_REVENUE_CONTRACTED_GROSS_REVENUE}
     *               
     * 
     */
    CONTRACTED_REVENUE_LOCAL_CONTRACTED_GROSS_REVENUE,

    /**
     * 
     *                 The value added tax on contracted net revenue of the {@link ProposalLineItem} or
     *                 {@link Proposal}.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_VAT,

    /**
     * 
     *                 The value added tax on contracted net revenue in the local currency of the
     *                 {@link ProposalLineItem} or {@link Proposal}.
     *                 
     *                 See {@link #CONTRACTED_REVENUE_CONTRACTED_VAT}
     *               
     * 
     */
    CONTRACTED_REVENUE_LOCAL_CONTRACTED_VAT,

    /**
     * 
     *                 The contracted agency commission of the {@link ProposalLineItem} or {@link Proposal}.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_AGENCY_COMMISSION,

    /**
     * 
     *                 The contracted agency commission in the local currency of the {@link ProposalLineItem} or
     *                 {@link Proposal}.
     *                 
     *                 See {@link #CONTRACTED_REVENUE_CONTRACTED_AGENCY_COMMISSION}
     *               
     * 
     */
    CONTRACTED_REVENUE_LOCAL_CONTRACTED_AGENCY_COMMISSION,

    /**
     * 
     *                 The contracted impressions of the {@link ProposalLineItem}.
     *               
     * 
     */
    SALES_CONTRACT_CONTRACTED_IMPRESSIONS,

    /**
     * 
     *                 The contracted clicks of the {@link ProposalLineItem}.
     *               
     * 
     */
    SALES_CONTRACT_CONTRACTED_CLICKS,

    /**
     * 
     *                 The contracted volume of the {@link ProposalLineItem}. Volume represents impressions for
     *                 rate type CPM, clicks for CPC, and days for CPD.
     *               
     * 
     */
    SALES_CONTRACT_CONTRACTED_VOLUME,

    /**
     * 
     *                 The budget of the {@link Proposal}.
     *               
     * 
     */
    SALES_CONTRACT_BUDGET,

    /**
     * 
     *                 The remaining budget of the {@link Proposal}. It is calculated by subtracting the contracted
     *                 net revenue from the budget.
     *               
     * 
     */
    SALES_CONTRACT_REMAINING_BUDGET,

    /**
     * 
     *                 The buffered impressions of the {@link ProposalLineItem}.
     *               
     * 
     */
    SALES_CONTRACT_BUFFERED_IMPRESSIONS,

    /**
     * 
     *                 The buffered clicks of the {@link ProposalLineItem}.
     *               
     * 
     */
    SALES_CONTRACT_BUFFERED_CLICKS,

    /**
     * 
     *                 The scheduled impressions of a {@link ProposalLineItem}. It is the sum of
     *                 {@link #SALES_CONTRACT_CONTRACTED_IMPRESSIONS} and
     *                 {@link #SALES_CONTRACT_BUFFERED_IMPRESSIONS}.
     *               
     * 
     */
    SCHEDULED_SCHEDULED_IMPRESSIONS,

    /**
     * 
     *                 The scheduled clicks of a {@link ProposalLineItem}. It is the sum of
     *                 {@link #SALES_CONTRACT_CONTRACTED_CLICKS} and {@link #SALES_CONTRACT_BUFFERED_CLICKS}.
     *               
     * 
     */
    SCHEDULED_SCHEDULED_CLICKS,

    /**
     * 
     *                 The scheduled volume of a {@link ProposalLineItem}. It is the sum of
     *                 {@link #SALES_CONTRACT_CONTRACTED_VOLUME} and buffered volume.
     *               
     * 
     */
    SCHEDULED_SCHEDULED_VOLUME,

    /**
     * 
     *                 The scheduled net revenue of a {@link ProposalLineItem}.
     *               
     * 
     */
    SCHEDULED_SCHEDULED_NET_REVENUE,

    /**
     * 
     *                 The scheduled net revenue in the local currency of a {@link ProposalLineItem}.
     *               
     * 
     */
    SCHEDULED_LOCAL_SCHEDULED_NET_REVENUE,

    /**
     * 
     *                 The scheduled gross revenue of a {@link ProposalLineItem}.
     *               
     * 
     */
    SCHEDULED_SCHEDULED_GROSS_REVENUE,

    /**
     * 
     *                 The scheduled gross revenue in the local currency of a {@link ProposalLineItem}.
     *               
     * 
     */
    SCHEDULED_LOCAL_SCHEDULED_GROSS_REVENUE,

    /**
     * 
     *                 The total budget of the {@link Proposal}. It differs from {@link #SALES_CONTRACT_BUDGET} since
     *                 it always contains the total budget, not the prorated budget.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_BUDGET,

    /**
     * 
     *                 The total remaining budget of the {@link Proposal}. It differs from {@link
     *                 #SALES_CONTRACT_REMAINING_BUDGET} since it always contains the total remaining budget, not the
     *                 prorated remaining budget.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_REMAINING_BUDGET,

    /**
     * 
     *                 The total contracted volume of the {@link ProposalLineItem}. It differs from {@link
     *                 #SALES_CONTRACT_CONTRACTED_VOLUME} that the volume is not prorated with regard to the date
     *                 range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_CONTRACTED_VOLUME,

    /**
     * 
     *                 The total contracted net revenue of the {@link ProposalLineItem}. It differs from {@link
     *                 #CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE} that the revenue is not prorated with regard to the
     *                 date range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_CONTRACTED_NET_REVENUE,

    /**
     * 
     *                 The total contracted net revenue in the local currency of the {@link ProposalLineItem}. It
     *                 differs from {@link #CONTRACTED_REVENUE_LOCAL_CONTRACTED_NET_REVENUE} that the revenue is not
     *                 prorated with regard to the date range.
     *                 
     *                 <p>See {@link #SALES_TOTAL_TOTAL_CONTRACTED_NET_REVENUE}
     *               
     * 
     */
    SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_NET_REVENUE,

    /**
     * 
     *                 The total contracted gross revenue of the {@link ProposalLineItem}. It differs from {@link
     *                 #CONTRACTED_REVENUE_CONTRACTED_GROSS_REVENUE} that the revenue is not prorated with regard to
     *                 the date range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_CONTRACTED_GROSS_REVENUE,

    /**
     * 
     *                 The total contracted gross revenue in the local currency of the {@link ProposalLineItem}. It
     *                 differs from {@link #CONTRACTED_REVENUE_LOCAL_CONTRACTED_GROSS_REVENUE} that the revenue is not
     *                 prorated with regard to the date range.
     *                 
     *                 <p>See {@link #SALES_TOTAL_TOTAL_CONTRACTED_GROSS_REVENUE}
     *               
     * 
     */
    SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_GROSS_REVENUE,

    /**
     * 
     *                 The total contracted agency commission of the {@link ProposalLineItem}. It differs from {@link
     *                 #CONTRACTED_REVENUE_CONTRACTED_AGENCY_COMMISSION} that the revenue is not prorated with regard
     *                 to the date range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_CONTRACTED_AGENCY_COMMISSION,

    /**
     * 
     *                 The total contracted agency commission in the local currency of the {@link ProposalLineItem}.
     *                 It differs from {@link #CONTRACTED_REVENUE_LOCAL_CONTRACTED_AGENCY_COMMISSION} that the revenue
     *                 is not prorated with regard to the date range.
     *                 
     *                 <p>See {@link #SALES_TOTAL_TOTAL_CONTRACTED_AGENCY_COMMISSION}
     *               
     * 
     */
    SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_AGENCY_COMMISSION,

    /**
     * 
     *                 The total net revenue plus its value added tax of the {@link ProposalLineItem}. The revenue is
     *                 not prorated with regard to the date range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_CONTRACTED_NET_REVENUE_WITH_VAT,

    /**
     * 
     *                 The total net revenue plus its value added tax in the local currency of the {@link
     *                 ProposalLineItem}. The revenue is not prorated with regard to the date range.
     *                 
     *                 <p>See {@link #SALES_TOTAL_TOTAL_CONTRACTED_WITH_VAT}
     *               
     * 
     */
    SALES_TOTAL_LOCAL_TOTAL_CONTRACTED_NET_REVENUE_WITH_VAT,

    /**
     * 
     *                 The total scheduled volume of the {@link ProposalLineItem}. It differs from {@link
     *                 #SCHEDULED_SCHEDULED_VOLUME} that the volume is not prorated with regard to the date range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_SCHEDULED_VOLUME,

    /**
     * 
     *                 The total scheduled net revenue of the {@link ProposalLineItem}. It differs from {@link
     *                 #SCHEDULED_SCHEDULED_NET_REVENUE} that the revenue is not prorated with regard to the date
     *                 range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_SCHEDULED_NET_REVENUE,

    /**
     * 
     *                 The total scheduled net revenue in the local currency of the {@link ProposalLineItem}. It
     *                 differs from {@link #SCHEDULED_LOCAL_SCHEDULED_NET_REVENUE} that the revenue is not prorated
     *                 with regard to the date range.
     *                 
     *                 <p>See {@link #SALES_TOTAL_TOTAL_SCHEDULED_NET_REVENUE}
     *               
     * 
     */
    SALES_TOTAL_LOCAL_TOTAL_SCHEDULED_NET_REVENUE,

    /**
     * 
     *                 The total scheduled gross revenue of the {@link ProposalLineItem}. It differs from {@link
     *                 #SCHEDULED_SCHEDULED_GROSS_REVENUE} that the revenue is not prorated with regard to the date
     *                 range.
     *               
     * 
     */
    SALES_TOTAL_TOTAL_SCHEDULED_GROSS_REVENUE,

    /**
     * 
     *                 The total scheduled gross revenue in the local currency of the {@link ProposalLineItem}. It
     *                 differs from {@link #SCHEDULED_LOCAL_SCHEDULED_GROSS_REVENUE} that the revenue is not prorated
     *                 with regard to the date range.
     *                 
     *                 <p>See {@link #SALES_TOTAL_TOTAL_SCHEDULED_GROSS_REVENUE}
     *               
     * 
     */
    SALES_TOTAL_LOCAL_TOTAL_SCHEDULED_GROSS_REVENUE,

    /**
     * 
     *                 The unreconciled net revenue of the {@link ProposalLineItem}. It is the portion of {@link
     *                 #UNIFIED_REVENUE_UNIFIED_NET_REVENUE} coming from unreconciled DFP volume.
     *               
     * 
     */
    UNIFIED_REVENUE_UNRECONCILED_NET_REVENUE,

    /**
     * 
     *                 The unreconciled net revenue of the {@link ProposalLineItem} in local currency. It is the
     *                 portion of {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_NET_REVENUE} coming from unreconciled DFP
     *                 volume.
     *                 
     *                 <p>See {@link #UNIFIED_REVENUE_UNRECONCILED_NET_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_UNRECONCILED_NET_REVENUE,

    /**
     * 
     *                 The unreconciled gross revenue of the {@link ProposalLineItem}. It is the portion of {@link
     *                 #UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE} coming from unreconciled DFP volume.
     *               
     * 
     */
    UNIFIED_REVENUE_UNRECONCILED_GROSS_REVENUE,

    /**
     * 
     *                 The unreconciled gross revenue of the {@link ProposalLineItem} in local currency. It is the
     *                 portion of {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_GROSS_REVENUE} coming from unreconciled DFP
     *                 volume.
     *                 
     *                 <p>See {@link #UNIFIED_REVENUE_UNRECONCILED_GROSS_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_UNRECONCILED_GROSS_REVENUE,

    /**
     * 
     *                 The forecasted net revenue of the {@link ProposalLineItem}. It is the portion of {@link
     *                 #UNIFIED_REVENUE_UNIFIED_NET_REVENUE} coming from forecasted DFP volume.
     *               
     * 
     */
    UNIFIED_REVENUE_FORECASTED_NET_REVENUE,

    /**
     * 
     *                 The forecasted net revenue of the {@link ProposalLineItem} in local currency. It is the portion
     *                 of {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_NET_REVENUE} coming from forecasted DFP volume.
     *                 
     *                 <p>See {@link #UNIFIED_REVENUE_FORECASTED_NET_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_FORECASTED_NET_REVENUE,

    /**
     * 
     *                 The forecasted gross revenue of the {@link ProposalLineItem}. It is the portion of {@link
     *                 #UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE} coming from forecasted DFP volume.
     *               
     * 
     */
    UNIFIED_REVENUE_FORECASTED_GROSS_REVENUE,

    /**
     * 
     *                 The forecasted gross revenue of the {@link ProposalLineItem} in local currency. It is the
     *                 portion of {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_GROSS_REVENUE} coming from forecasted DFP
     *                 volume.
     *                 
     *                 <p>See {@link #UNIFIED_REVENUE_FORECASTED_GROSS_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_FORECASTED_GROSS_REVENUE,

    /**
     * 
     *                 The unified net revenue of the {@link ProposalLineItem}. It is a combination of {@link
     *                 #UNIFIED_REVENUE_UNRECONCILED_NET_REVENUE}, {@link #BILLING_BILLABLE_NET_REVENUE}, and {@link
     *                 #UNIFIED_REVENUE_FORECASTED_NET_REVENUE} when query date range spans historical delivery and
     *                 forecasted delivery.
     *               
     * 
     */
    UNIFIED_REVENUE_UNIFIED_NET_REVENUE,

    /**
     * 
     *                 The unified net revenue of the {@link ProposalLineItem} in local currency. It is a
     *                 combination of {@link #UNIFIED_REVENUE_LOCAL_UNRECONCILED_NET_REVENUE},
     *                 {@link #BILLING_LOCAL_BILLABLE_NET_REVENUE},
     *                 and {@link #UNIFIED_REVENUE_LOCAL_FORECASTED_NET_REVENUE} when query date range spans
     *                 historical delivery and forecasted delivery.
     *                 
     *                 See {@link #UNIFIED_REVENUE_UNIFIED_NET_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_UNIFIED_NET_REVENUE,

    /**
     * 
     *                 The unified net revenue of the {@link ProposalLineItem}. It is a combination of
     *                 {@link #UNIFIED_REVENUE_UNRECONCILED_GROSS_REVENUE}, {@link #BILLING_BILLABLE_GROSS_REVENUE},
     *                 and {@link #UNIFIED_REVENUE_FORECASTED_GROSS_REVENUE} when query date range spans historical
     *                 delivery and forecasted delivery.
     *               
     * 
     */
    UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE,

    /**
     * 
     *                 The unified gross revenue of the {@link ProposalLineItem} in local currency. It is a
     *                 combination of {@link #UNIFIED_REVENUE_LOCAL_UNRECONCILED_GROSS_REVENUE},
     *                 {@link #BILLING_LOCAL_BILLABLE_GROSS_REVENUE}, and
     *                 {@link #UNIFIED_REVENUE_LOCAL_FORECASTED_GROSS_REVENUE} when query date range spans historical
     *                 delivery and forecasted delivery.
     *                 
     *                 See {@link #UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_UNIFIED_GROSS_REVENUE,

    /**
     * 
     *                 The unified agency commission of the {@link ProposalLineItem}. It is a combination of the
     *                 unreconciled agency commission, the {@link #BILLING_BILLABLE_AGENCY_COMMISSION},
     *                 and the forecasted agency commission when query date range spans historical delivery and
     *                 forecasted delivery.
     *               
     * 
     */
    UNIFIED_REVENUE_UNIFIED_AGENCY_COMMISSION,

    /**
     * 
     *                 The unified agency commission of the {@link ProposalLineItem} in local currency. It is a
     *                 combination of the unreconciled agency commission, the
     *                 {@link #BILLING_BILLABLE_AGENCY_COMMISSION}, and the forecasted agency commission when query
     *                 date range spans historical delivery and forecasted delivery.
     *                 
     *                 See {@link #UNIFIED_REVENUE_UNIFIED_AGENCY_COMMISSION}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_UNIFIED_AGENCY_COMMISSION,

    /**
     * 
     *                 The unreconciled volume of the {@link ProposalLineItem} for each cycle. Volume represents
     *                 impressions for rate type CPM, clicks for CPC and days for CPD. This fact can only be run
     *                 in proposal or proposal line item time zone.
     *               
     * 
     */
    UNIFIED_REVENUE_UNRECONCILED_VOLUME,

    /**
     * 
     *                 The forecasted volume of the {@link ProposalLineItem} for each cycle. Volume represents
     *                 impressions for rate type CPM, clicks for CPC and days for CPD. This fact can only be run
     *                 in proposal or proposal line item time zone.
     *               
     * 
     */
    UNIFIED_REVENUE_FORECASTED_VOLUME,

    /**
     * 
     *                 The unified volume of the {@link ProposalLineItem} for each cycle. Volume represents
     *                 impressions for rate type CPM, clicks for CPC and days for CPD. This fact can only be run
     *                 in proposal or proposal line item time zone.
     *               
     * 
     */
    UNIFIED_REVENUE_UNIFIED_VOLUME,

    /**
     * 
     *                 The expected revenue of the {@link ProposalLineItem}. It is equivalent to
     *                 {@link #UNIFIED_REVENUE_UNIFIED_NET_REVENUE} when the {@link ProposalLineItem} is sold and
     *                 {@link #SALES_PIPELINE_PIPELINE_NET_REVENUE} otherwise.
     *               
     * 
     */
    EXPECTED_REVENUE_EXPECTED_NET_REVENUE,

    /**
     * 
     *                 The expected revenue of the {@link ProposalLineItem} in local currency. It is equivalent to
     *                 {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_NET_REVENUE} when the {@link ProposalLineItem} is sold
     *                 and {@link #SALES_PIPELINE_LOCAL_PIPELINE_NET_REVENUE} otherwise.
     *                 
     *                 <p>See {@link #EXPECTED_REVENUE_EXPECTED_NET_REVENUE}
     *               
     * 
     */
    EXPECTED_REVENUE_LOCAL_EXPECTED_NET_REVENUE,

    /**
     * 
     *                 The expected gross revenue of the {@link ProposalLineItem}. It is equivalent to {@link
     *                 #UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE} when the {@link ProposalLineItem} is sold and {@link
     *                 #SALES_PIPELINE_PIPELINE_GROSS_REVENUE} otherwise.
     *               
     * 
     */
    EXPECTED_REVENUE_EXPECTED_GROSS_REVENUE,

    /**
     * 
     *                 The expected gross revenue of the {@link ProposalLineItem} in local currency. It is equivalent
     *                 to {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_GROSS_REVENUE} when the {@link ProposalLineItem} is
     *                 sold and {@link #SALES_PIPELINE_LOCAL_PIPELINE_GROSS_REVENUE} otherwise.
     *                 
     *                 <p>See {@link #EXPECTED_REVENUE_EXPECTED_GROSS_REVENUE}
     *               
     * 
     */
    EXPECTED_REVENUE_LOCAL_EXPECTED_GROSS_REVENUE,

    /**
     * 
     *                 The pipeline net revenue of the {@link ProposalLineItem}. There is no revenue for sold {@link
     *                 ProposalLineItem proposal line items}. For unsold {@link ProposalLineItem proposal line items},
     *                 it is calculated by multiplying {@link Proposal#probabilityOfClose} by the contracted revenue
     *                 when inventory is not reserved; otherwise it is calcualted by multiplying {@link
     *                 Proposal#probabilityOfClose} by the forecasted revenue.
     *               
     * 
     */
    SALES_PIPELINE_PIPELINE_NET_REVENUE,

    /**
     * 
     *                 The pipeline net revenue in the local currency of the {@link ProposalLineItem}. There is no
     *                 revenue for sold {@link ProposalLineItem proposal line items}. For unsold
     *                 {@link ProposalLineItem proposal line items}, it is calculated by multiplying
     *                 {@link Proposal#probabilityOfClose} by the contracted revenue when inventory is not reserved;
     *                 otherwise it is calcualted by multiplying {@link Proposal#probabilityOfClose} by the forecasted
     *                 revenue.
     *                 
     *                 See {@link #SALES_PIPELINE_PIPELINE_NET_REVENUE}
     *               
     * 
     */
    SALES_PIPELINE_LOCAL_PIPELINE_NET_REVENUE,

    /**
     * 
     *                 The pipeline gross revenue of the {@link ProposalLineItem}. There is no revenue for sold
     *                 {@link ProposalLineItem proposal line items}. For unsold
     *                 {@link ProposalLineItem proposal line items}, it is calculated by multiplying
     *                 {@link Proposal#probabilityOfClose} by the contracted revenue including agency commission when
     *                 inventory is not reserved; otherwise it is calcualted by multiplying
     *                 {@link Proposal#probabilityOfClose} by the forecasted revenue including agency commission.
     *               
     * 
     */
    SALES_PIPELINE_PIPELINE_GROSS_REVENUE,

    /**
     * 
     *                 The pipeline gross revenue in the local currency of the {@link ProposalLineItem}. There is no
     *                 revenue for sold {@link ProposalLineItem proposal line items}. For unsold
     *                 {@link ProposalLineItem proposal line items}, it is calculated by multiplying
     *                 {@link Proposal#probabilityOfClose} by the contracted revenue including agency commission when
     *                 inventory is not reserved; otherwise it is calcualted by multiplying
     *                 {@link Proposal#probabilityOfClose} by the forecasted revenue including agency commission.
     *                 
     *                 See {@link #SALES_PIPELINE_PIPELINE_GROSS_REVENUE}
     *               
     * 
     */
    SALES_PIPELINE_LOCAL_PIPELINE_GROSS_REVENUE,

    /**
     * 
     *                 The pipeline agency commission of the {@link ProposalLineItem}. There is no revenue for sold
     *                 {@link ProposalLineItem proposal line items}. For unsold
     *                 {@link ProposalLineItem proposal line items}, it is calculated against gross pipeline revenue.
     *               
     * 
     */
    SALES_PIPELINE_PIPELINE_AGENCY_COMMISSION,

    /**
     * 
     *                 The pipeline agency commission in the local currency of the {@link ProposalLineItem}. There is
     *                 no revenue for sold {@link ProposalLineItem proposal line items}. For unsold
     *                 {@link ProposalLineItem proposal line items}, it is calculated against gross pipeline revenue
     *                 in local currency of the {@link ProposalLineItem}.
     *                 
     *                 See {@link #SALES_PIPELINE_PIPELINE_AGENCY_COMMISSION}
     *               
     * 
     */
    SALES_PIPELINE_LOCAL_PIPELINE_AGENCY_COMMISSION,

    /**
     * 
     *                 The DFP volume of the {@link ProposalLineItem}, which is used for reconciliation. Volume
     *                 represents impressions for rate type CPM, clicks for CPC and days for CPD.
     *               
     * 
     */
    RECONCILIATION_DFP_VOLUME,

    /**
     * 
     *                 The third party volume of the {@link ProposalLineItem}, which is used for reconciliation.
     *                 Volume represents impressions for rate type CPM, clicks for CPC and days for CPD.
     *               
     * 
     */
    RECONCILIATION_THIRD_PARTY_VOLUME,

    /**
     * 
     *                 The reconciled volume of the {@link ProposalLineItem}, which is used for reconciliation. Volume
     *                 represents impressions for rate type CPM, clicks for CPC and days for CPD.
     *               
     * 
     */
    RECONCILIATION_RECONCILED_VOLUME,

    /**
     * 
     *                 The discrepancy percentage between DFP volume and third party volume.
     *               
     * 
     */
    RECONCILIATION_DISCREPANCY_PERCENTAGE,

    /**
     * 
     *                 The reconciled revenue of the {@link LineItem}.
     *               
     * 
     */
    RECONCILIATION_RECONCILED_REVENUE,

    /**
     * 
     *                 The discrepancy between DFP impressions and third party impressions.
     *               
     * 
     */
    RECONCILIATION_IMPRESSION_DISCREPANCY,

    /**
     * 
     *                 The discrepancy between DFP clicks and third party clicks.
     *               
     * 
     */
    RECONCILIATION_CLICK_DISCREPANCY,

    /**
     * 
     *                 The discrepancy between DFP revenue and third party revenue.
     *               
     * 
     */
    RECONCILIATION_REVENUE_DISCREPANCY,

    /**
     * 
     *                 The billable net revenue of the {@link ProposalLineItem}. It is calculated from reconciled
     *                 volume and rate, with cap applied.
     *               
     * 
     */
    BILLING_BILLABLE_NET_REVENUE,

    /**
     * 
     *                 The billable net revenue in the local currency of the {@link ProposalLineItem}. It is
     *                 calculated from reconciled volume and rate, with cap applied.
     *                 
     *                 See {@link #BILLING_BILLABLE_NET_REVENUE}
     *               
     * 
     */
    BILLING_LOCAL_BILLABLE_NET_REVENUE,

    /**
     * 
     *                 The billable gross revenue of the {@link ProposalLineItem}. It is calculated from reconciled
     *                 volume and rate, with cap applied, and including agency commission.
     *               
     * 
     */
    BILLING_BILLABLE_GROSS_REVENUE,

    /**
     * 
     *                 The billable gross revenue in the local currency of the {@link ProposalLineItem}. It is
     *                 calculated from reconciled volume and rate, with cap applied, and including agency commission.
     *                 
     *                 See {@link #BILLING_BILLABLE_GROSS_REVENUE}
     *               
     * 
     */
    BILLING_LOCAL_BILLABLE_GROSS_REVENUE,

    /**
     * 
     *                 The billable net revenue of the {@link ProposalLineItem} before manual adjustment. It is
     *                 calculated from reconciled volume and rate, with cap applied, before manual adjustment.
     *               
     * 
     */
    BILLING_BILLABLE_NET_REVENUE_BEFORE_MANUAL_ADJUSTMENT,

    /**
     * 
     *                 The billable net revenue in local currency of the {@link ProposalLineItem} before manual
     *                 adjustment. It is calculated from reconciled volume and rate, with cap applied, before manual
     *                 adjustment.
     *                 
     *                 <p>See {@link #BILLING_BILLABLE_NET_REVENUE_BEFORE_MANUAL_ADJUSTMENT}
     *               
     * 
     */
    BILLING_LOCAL_BILLABLE_NET_REVENUE_BEFORE_MANUAL_ADJUSTMENT,

    /**
     * 
     *                 The billable gross revenue of the {@link ProposalLineItem} before manual adjustment. It is
     *                 calculated from reconciled volume and rate, with cap applied, before manual adjustment.
     *               
     * 
     */
    BILLING_BILLABLE_GROSS_REVENUE_BEFORE_MANUAL_ADJUSTMENT,

    /**
     * 
     *                 The billable net revenue in local currency of the {@link ProposalLineItem} before manual
     *                 adjustment. It is calculated from reconciled volume and rate, with cap applied, before manual
     *                 adjustment.
     *                 
     *                 <p>See {@link #BILLING_BILLABLE_GROSS_REVENUE_BEFORE_MANUAL_ADJUSTMENT}
     *               
     * 
     */
    BILLING_LOCAL_BILLABLE_GROSS_REVENUE_BEFORE_MANUAL_ADJUSTMENT,

    /**
     * 
     *                 The value added tax on billable net revenue of the {@link ProposalLineItem} or {@link
     *                 Proposal}.
     *               
     * 
     */
    BILLING_BILLABLE_VAT,

    /**
     * 
     *                 The value added tax on billable net revenue in the local currency of the
     *                 {@link ProposalLineItem} or {@link Proposal}.
     *                 
     *                 See {@link #BILLING_BILLABLE_VAT}
     *               
     * 
     */
    BILLING_LOCAL_BILLABLE_VAT,

    /**
     * 
     *                 The billable agency commission of the {@link ProposalLineItem} or {@link Proposal}.
     *               
     * 
     */
    BILLING_BILLABLE_AGENCY_COMMISSION,

    /**
     * 
     *                 The billable agency commission in the local currency of the {@link ProposalLineItem} or
     *                 {@link Proposal}.
     *                 
     *                 See {@link #BILLING_BILLABLE_AGENCY_COMMISSION}
     *               
     * 
     */
    BILLING_LOCAL_BILLABLE_AGENCY_COMMISSION,

    /**
     * 
     *                 The cap quantity of the {@link ProposalLineItem} for each cycle. Quantity represents
     *                 impressions for rate type CPM, clicks for CPC and days for CPD.
     *               
     * 
     */
    BILLING_CAP_QUANTITY,

    /**
     * 
     *                 The billable volume of the {@link ProposalLineItem} for each cycle. Billable volumes are
     *                 calculated by applying cap quantity to reconciled volumes. Volume represents impressions for
     *                 rate type CPM, clicks for CPC and days for CPD.
     *               
     * 
     */
    BILLING_BILLABLE_VOLUME,

    /**
     * 
     *                 The delivery rollover volume of the {@link ProposalLineItem} from previous cycle. Volume
     *                 represents impressions for rate type CPM, clicks for CPC and days for CPD.
     *               
     * 
     */
    BILLING_DELIVERY_ROLLOVER,

    /**
     * 
     *                 The CPM calcuated by {@link #BILLING_BILLABLE_NET_REVENUE} and {@link #AD_SERVER_IMPRESSIONS}.
     *               
     * 
     */
    BILLING_REALIZED_CPM,

    /**
     * 
     *                 The rate calcuated by {@link #BILLING_BILLABLE_NET_REVENUE} and DFP volume.
     *               
     * 
     */
    BILLING_REALIZED_RATE,

    /**
     * 
     *                 The contracted net overall discount of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_CONTRACTED_NET_OVERALL_DISCOUNT,

    /**
     * 
     *                 The billable net overall discount of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_BILLABLE_NET_OVERALL_DISCOUNT,

    /**
     * 
     *                 The contracted non-billable (net) of the {@link ProposalLineItem}.
     *                 The non-billable means revenue that marked as make good, added value or barter.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_CONTRACTED_NET_NON_BILLABLE,

    /**
     * 
     *                 The number of invoiced impressions.
     *               
     * 
     */
    INVOICED_IMPRESSIONS,

    /**
     * 
     *                 The number of invoiced unfilled impressions.
     *               
     * 
     */
    INVOICED_UNFILLED_IMPRESSIONS,

    /**
     * 
     *                 The total number of impressions tracked for Nielsen Digital Ad Ratings measurement.
     *               
     * 
     */
    NIELSEN_IMPRESSIONS,

    /**
     * 
     *                 The total number of impressions for in-target demographic tracked for Nielsen Digital Ad
     *                 Ratings measurement.
     *               
     * 
     */
    NIELSEN_IN_TARGET_IMPRESSIONS,

    /**
     * 
     *                 The population in the demographic.
     *               
     * 
     */
    NIELSEN_POPULATION_BASE,

    /**
     * 
     *                 The total population for all in-target demographics.
     *               
     * 
     */
    NIELSEN_IN_TARGET_POPULATION_BASE,

    /**
     * 
     *                 The total number of different people within the selected demographic who were reached.
     *               
     * 
     */
    NIELSEN_UNIQUE_AUDIENCE,

    /**
     * 
     *                 The total number of different people within all in-target demographics who were reached.
     *               
     * 
     */
    NIELSEN_IN_TARGET_UNIQUE_AUDIENCE,

    /**
     * 
     *                 The unique audience reached as a percentage of the population base.
     *               
     * 
     */
    NIELSEN_PERCENT_AUDIENCE_REACH,

    /**
     * 
     *                 The unique audience reached as a percentage of the population base for all in-target
     *                 demographics.
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH,

    /**
     * 
     *                 The average number of times that a person within the target audience sees an advertisement.
     *               
     * 
     */
    NIELSEN_AVERAGE_FREQUENCY,

    /**
     * 
     *                 The average number of times that a person within the target audience sees an advertisement
     *                 for all in-target demographics.
     *               
     * 
     */
    NIELSEN_IN_TARGET_AVERAGE_FREQUENCY,

    /**
     * 
     *                 The unit of audience volume, which is based on the percentage of the reached target audience
     *                 population multiplied by the average frequency.
     *               
     * 
     */
    NIELSEN_GROSS_RATING_POINTS,

    /**
     * 
     *                 The unit of audience volume, which is based on the percentage of the reached target audience
     *                 population multiplied by the average frequency, for all in-target demographics.
     *               
     * 
     */
    NIELSEN_IN_TARGET_GROSS_RATING_POINTS,

    /**
     * 
     *                 The share of impressions that reached the target demographic.
     *               
     * 
     */
    NIELSEN_PERCENT_IMPRESSIONS_SHARE,

    /**
     * 
     *                 The share of impressions that reached all in-target demographics.
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE,

    /**
     * 
     *                 The share of the total population represented by the population base.
     *               
     * 
     */
    NIELSEN_PERCENT_POPULATION_SHARE,

    /**
     * 
     *                 The share of the total population for all in-target demographics represented by the
     *                 population base.
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE,

    /**
     * 
     *                 The share of the unique audience in the demographic.
     *               
     * 
     */
    NIELSEN_PERCENT_AUDIENCE_SHARE,

    /**
     * 
     *                 The share of the unique audience for all in-target demographics.
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE,

    /**
     * 
     *                 The relative unique audience in the demographic compared with its share of the overall
     *                 population.
     *               
     * 
     */
    NIELSEN_AUDIENCE_INDEX,

    /**
     * 
     *                 The relative unique audience for all in-target demographics compared with its share of the
     *                 overall population.
     *               
     * 
     */
    NIELSEN_IN_TARGET_AUDIENCE_INDEX,

    /**
     * 
     *                 The relative impressions per person in the demographic compared with the impressions per person
     *                 for the overall population.
     *               
     * 
     */
    NIELSEN_IMPRESSIONS_INDEX,

    /**
     * 
     *                 The relative impressions per person for all in-target demographics compared with the
     *                 impressions per person for the overall population.
     *               
     * 
     */
    NIELSEN_IN_TARGET_IMPRESSIONS_INDEX,

    /**
     * 
     *                 The host impressions in the partner management.
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_IMPRESSIONS,

    /**
     * 
     *                 The host clicks in the partner management.
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_CLICKS,

    /**
     * 
     *                 The host CTR in the partner management.
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_CTR,

    /**
     * 
     *                 The host revenue in the partner management.
     *                 <p>
     *                 Starting in v201711, this field is deprecated in favor of PARTNER_FINANCE_HOST_REVENUE.
     *                 Note that the new metric supports fewer dimensions.
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_REVENUE,

    /**
     * 
     *                 The host eCPM in the partner management.
     *                 <p>
     *                 Starting in v201711, this field is deprecated in favor of PARTNER_FINANCE_HOST_ECPM.
     *                 Note that the new metric supports fewer dimensions.
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_ECPM,

    /**
     * 
     *                 The partner revenue in the partner management.
     *                 <p>
     *                 Starting in v201711, this field is deprecated in favor of PARTNER_FINANCE_PARTNER_REVENUE.
     *                 Note that the new metric supports fewer dimensions.
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_REVENUE,

    /**
     * 
     *                 The partner eCPM in the partner management.
     *                 <p>
     *                 Starting in v201711, this field is deprecated in favor of PARTNER_FINANCE_PARTNER_ECPM.
     *                 Note that the new metric supports fewer dimensions.
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_ECPM,

    /**
     * 
     *                 The unfilled impressions in the partner management.
     *               
     * 
     */
    PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS;

    public String value() {
        return name();
    }

    public static Column fromValue(String v) {
        return valueOf(v);
    }

}
