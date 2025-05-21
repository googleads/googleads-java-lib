// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Column.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Column"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD_SERVER_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_BEGIN_TO_RENDER_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_TARGETED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_CLICKS"/&gt;
 *     &lt;enumeration value="AD_SERVER_TARGETED_CLICKS"/&gt;
 *     &lt;enumeration value="AD_SERVER_CTR"/&gt;
 *     &lt;enumeration value="AD_SERVER_CPM_AND_CPC_REVENUE"/&gt;
 *     &lt;enumeration value="AD_SERVER_CPM_AND_CPC_REVENUE_GROSS"/&gt;
 *     &lt;enumeration value="AD_SERVER_CPD_REVENUE"/&gt;
 *     &lt;enumeration value="AD_SERVER_ALL_REVENUE"/&gt;
 *     &lt;enumeration value="AD_SERVER_ALL_REVENUE_GROSS"/&gt;
 *     &lt;enumeration value="AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM"/&gt;
 *     &lt;enumeration value="AD_SERVER_WITH_CPD_AVERAGE_ECPM"/&gt;
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS"/&gt;
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/&gt;
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/&gt;
 *     &lt;enumeration value="AD_SERVER_UNFILTERED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_UNFILTERED_BEGIN_TO_RENDER_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_UNFILTERED_CLICKS"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_CLICKS"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_CTR"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_REVENUE"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/&gt;
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="BID_COUNT"/&gt;
 *     &lt;enumeration value="BID_AVERAGE_CPM"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_CALLOUTS"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_SUCCESSFUL_RESPONSES"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_BIDS"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_BIDS_IN_AUCTION"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_AUCTIONS_WON"/&gt;
 *     &lt;enumeration value="DEALS_BID_REQUESTS"/&gt;
 *     &lt;enumeration value="DEALS_BIDS"/&gt;
 *     &lt;enumeration value="DEALS_BID_RATE"/&gt;
 *     &lt;enumeration value="DEALS_WINNING_BIDS"/&gt;
 *     &lt;enumeration value="DEALS_WIN_RATE"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_ESTIMATED_REVENUE"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_ESTIMATED_CPM"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_MEDIATION_FILL_RATE"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_MEDIATION_PASSBACKS"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_MEDIATION_THIRD_PARTY_ECPM"/&gt;
 *     &lt;enumeration value="YIELD_GROUP_MEDIATION_CHAINS_SERVED"/&gt;
 *     &lt;enumeration value="MEDIATION_THIRD_PARTY_ECPM"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CTR"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CLICKS"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CTR"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM"/&gt;
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM"/&gt;
 *     &lt;enumeration value="TOTAL_CODE_SERVED_COUNT"/&gt;
 *     &lt;enumeration value="TOTAL_AD_REQUESTS"/&gt;
 *     &lt;enumeration value="TOTAL_RESPONSES_SERVED"/&gt;
 *     &lt;enumeration value="TOTAL_UNMATCHED_AD_REQUESTS"/&gt;
 *     &lt;enumeration value="TOTAL_FILL_RATE"/&gt;
 *     &lt;enumeration value="AD_SERVER_RESPONSES_SERVED"/&gt;
 *     &lt;enumeration value="ADSENSE_RESPONSES_SERVED"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_RESPONSES_SERVED"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_RESPONSES_SERVED"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_MATCH_RATE"/&gt;
 *     &lt;enumeration value="TOTAL_PROGRAMMATIC_ELIGIBLE_AD_REQUESTS"/&gt;
 *     &lt;enumeration value="TOTAL_VIDEO_OPPORTUNITIES"/&gt;
 *     &lt;enumeration value="TOTAL_VIDEO_CAPPED_OPPORTUNITIES"/&gt;
 *     &lt;enumeration value="TOTAL_VIDEO_MATCHED_OPPORTUNITIES"/&gt;
 *     &lt;enumeration value="TOTAL_VIDEO_MATCHED_DURATION"/&gt;
 *     &lt;enumeration value="TOTAL_VIDEO_DURATION"/&gt;
 *     &lt;enumeration value="TOTAL_VIDEO_BREAK_START"/&gt;
 *     &lt;enumeration value="TOTAL_VIDEO_BREAK_END"/&gt;
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="UNIQUE_REACH_FREQUENCY"/&gt;
 *     &lt;enumeration value="UNIQUE_REACH_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="UNIQUE_REACH"/&gt;
 *     &lt;enumeration value="SDK_MEDIATION_CREATIVE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="SDK_MEDIATION_CREATIVE_CLICKS"/&gt;
 *     &lt;enumeration value="SELL_THROUGH_FORECASTED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_PARTNER_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_PARTNER_CODE_SERVED"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_GOOGLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_GOOGLE_RESERVATION_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_GOOGLE_AUCTION_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_QUERIES"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_FILLED_QUERIES"/&gt;
 *     &lt;enumeration value="PARTNER_SALES_SELL_THROUGH_RATE"/&gt;
 *     &lt;enumeration value="SELL_THROUGH_AVAILABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="SELL_THROUGH_RESERVED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="SELL_THROUGH_SELL_THROUGH_RATE"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_BACKUP_IMAGES"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_DISPLAY_TIME"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_AVERAGE_DISPLAY_TIME"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_EXPANSIONS"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_EXPANDING_TIME"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_TIME"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_COUNT"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_RATE"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_AVERAGE_INTERACTION_TIME"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_MANUAL_CLOSES"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_FULL_SCREEN_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_INTERACTIONS"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_INTERACTION_RATE"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_MUTES"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_PAUSES"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_PLAYES"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_MIDPOINTS"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_COMPLETES"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_REPLAYS"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_STOPS"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_UNMUTES"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_VIEW_TIME"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_VIEW_RATE"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_EVENT_TIME"/&gt;
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_EVENT_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_START"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_FIRST_QUARTILE"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_MIDPOINT"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_THIRD_QUARTILE"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_COMPLETE"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_COMPLETION_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_VIDEO_LENGTH"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_ENGAGED_VIEW"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AUTO_PLAYS"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_CLICK_TO_PLAYS"/&gt;
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE"/&gt;
 *     &lt;enumeration value="DROPOFF_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_TRUEVIEW_VIEWS"/&gt;
 *     &lt;enumeration value="VIDEO_TRUEVIEW_SKIP_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_TRUEVIEW_VTR"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_100_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_101_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_102_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_200_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_201_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_202_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_203_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_300_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_301_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_302_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_303_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_400_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_401_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_402_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_403_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_405_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_500_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_501_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_502_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_503_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_600_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_601_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_602_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_603_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_604_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_900_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_901_COUNT"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_PAUSE"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_RESUME"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_REWIND"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_MUTE"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_UNMUTE"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_COLLAPSE"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_EXPAND"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_FULL_SCREEN"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_INTERACTION_VIDEO_SKIPS"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_STARTS"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_STARTS"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_COMPLETES"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE"/&gt;
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT"/&gt;
 *     &lt;enumeration value="VIDEO_IMPRESSIONS_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_MATCHED_QUERIES_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_UNMATCHED_QUERIES_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_TOTAL_QUERIES_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_CREATIVE_SERVE_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_100_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_101_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_102_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_200_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_201_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_202_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_203_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_300_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_301_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_302_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_303_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_400_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_401_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_402_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_403_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_405_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_500_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_501_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_502_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_503_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_600_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_601_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_602_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_603_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_604_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_900_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST3_ERROR_901_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST4_ERROR_406_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST4_ERROR_407_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST4_ERROR_408_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST4_ERROR_409_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST4_ERROR_410_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_VAST_TOTAL_ERROR_COUNT_REAL_TIME"/&gt;
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/&gt;
 *     &lt;enumeration value="ACTIVE_VIEW_PERCENT_AUDIBLE_START_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="ACTIVE_VIEW_PERCENT_EVER_AUDIBLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_REVENUE"/&gt;
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/&gt;
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_TOTAL_REQUESTS"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_MATCH_RATE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_COST_PER_CLICK"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_TOTAL_REQUEST_CTR"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_MATCHED_REQUEST_CTR"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_TOTAL_REQUEST_ECPM"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_MATCHED_REQUEST_ECPM"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE_LIFT_EARNINGS"/&gt;
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_REVENUE"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL"/&gt;
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL"/&gt;
 *     &lt;enumeration value="INVOICED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="INVOICED_UNFILLED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="NIELSEN_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="NIELSEN_POPULATION_BASE"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_POPULATION_BASE"/&gt;
 *     &lt;enumeration value="NIELSEN_UNIQUE_AUDIENCE"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_UNIQUE_AUDIENCE"/&gt;
 *     &lt;enumeration value="NIELSEN_PERCENT_AUDIENCE_REACH"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH"/&gt;
 *     &lt;enumeration value="NIELSEN_AVERAGE_FREQUENCY"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_AVERAGE_FREQUENCY"/&gt;
 *     &lt;enumeration value="NIELSEN_GROSS_RATING_POINTS"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_GROSS_RATING_POINTS"/&gt;
 *     &lt;enumeration value="NIELSEN_PERCENT_IMPRESSIONS_SHARE"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE"/&gt;
 *     &lt;enumeration value="NIELSEN_PERCENT_POPULATION_SHARE"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE"/&gt;
 *     &lt;enumeration value="NIELSEN_PERCENT_AUDIENCE_SHARE"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE"/&gt;
 *     &lt;enumeration value="NIELSEN_AUDIENCE_INDEX"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_AUDIENCE_INDEX"/&gt;
 *     &lt;enumeration value="NIELSEN_IMPRESSIONS_INDEX"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_IMPRESSIONS_INDEX"/&gt;
 *     &lt;enumeration value="NIELSEN_IN_TARGET_RATIO"/&gt;
 *     &lt;enumeration value="DP_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="DP_CLICKS"/&gt;
 *     &lt;enumeration value="DP_QUERIES"/&gt;
 *     &lt;enumeration value="DP_MATCHED_QUERIES"/&gt;
 *     &lt;enumeration value="DP_COST"/&gt;
 *     &lt;enumeration value="DP_ECPM"/&gt;
 *     &lt;enumeration value="DP_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_CLICKS"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_CTR"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_CLICKS"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_CTR"/&gt;
 *     &lt;enumeration value="PARTNER_MANAGEMENT_GROSS_REVENUE"/&gt;
 *     &lt;enumeration value="PARTNER_FINANCE_HOST_IMPRESSIONS"/&gt;
 *     &lt;enumeration value="PARTNER_FINANCE_HOST_REVENUE"/&gt;
 *     &lt;enumeration value="PARTNER_FINANCE_HOST_ECPM"/&gt;
 *     &lt;enumeration value="PARTNER_FINANCE_PARTNER_REVENUE"/&gt;
 *     &lt;enumeration value="PARTNER_FINANCE_PARTNER_ECPM"/&gt;
 *     &lt;enumeration value="PARTNER_FINANCE_GROSS_REVENUE"/&gt;
 *     &lt;enumeration value="CREATIVE_LOAD_TIME_0_500_MS_PERCENT"/&gt;
 *     &lt;enumeration value="CREATIVE_LOAD_TIME_500_1000_MS_PERCENT"/&gt;
 *     &lt;enumeration value="CREATIVE_LOAD_TIME_1_2_S_PERCENT"/&gt;
 *     &lt;enumeration value="CREATIVE_LOAD_TIME_2_4_S_PERCENT"/&gt;
 *     &lt;enumeration value="CREATIVE_LOAD_TIME_4_8_S_PERCENT"/&gt;
 *     &lt;enumeration value="CREATIVE_LOAD_TIME_GREATER_THAN_8_S_PERCENT"/&gt;
 *     &lt;enumeration value="UNVIEWED_REASON_SLOT_NEVER_ENTERED_VIEWPORT_PERCENT"/&gt;
 *     &lt;enumeration value="UNVIEWED_REASON_USER_SCROLLED_BEFORE_AD_FILLED_PERCENT"/&gt;
 *     &lt;enumeration value="UNVIEWED_REASON_USER_SCROLLED_BEFORE_AD_LOADED_PERCENT"/&gt;
 *     &lt;enumeration value="UNVIEWED_REASON_USER_SCROLLED_BEFORE_1_S_PERCENT"/&gt;
 *     &lt;enumeration value="UNVIEWED_REASON_OTHER_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_TAG_LOADED_TIME_0_500_MS_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_TAG_LOADED_TIME_500_1000_MS_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_TAG_LOADED_TIME_1_2_S_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_TAG_LOADED_TIME_2_4_S_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_TAG_LOADED_TIME_4_8_S_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_TAG_LOADED_TIME_GREATER_THAN_8_S_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_0_500_MS_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_500_1000_MS_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_1_2_S_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_2_4_S_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_4_8_S_PERCENT"/&gt;
 *     &lt;enumeration value="PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_GREATER_THAN_8_S_PERCENT"/&gt;
 *     &lt;enumeration value="TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_0_500_MS_PERCENT"/&gt;
 *     &lt;enumeration value="TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_500_1000_MS_PERCENT"/&gt;
 *     &lt;enumeration value="TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_1_2_S_PERCENT"/&gt;
 *     &lt;enumeration value="TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_2_4_S_PERCENT"/&gt;
 *     &lt;enumeration value="TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_4_8_S_PERCENT"/&gt;
 *     &lt;enumeration value="TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_GREATER_THAN_8_S_PERCENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Column")
@XmlEnum
public enum Column {


    /**
     * 
     *                 The number of impressions delivered by the ad server.
     *                 <p>Corresponds to "Ad server impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_IMPRESSIONS("AD_SERVER_IMPRESSIONS"),

    /**
     * 
     *                 The number of begin-to-render impressions delivered by the ad server.
     *                 <p>Corresponds to "Ad server begin to render impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_BEGIN_TO_RENDER_IMPRESSIONS("AD_SERVER_BEGIN_TO_RENDER_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by the ad server by explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad server targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_TARGETED_IMPRESSIONS("AD_SERVER_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks delivered by the ad server.
     *                 <p>Corresponds to "Ad server clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CLICKS("AD_SERVER_CLICKS"),

    /**
     * 
     *                 The number of clicks delivered by the ad server by explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad server targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_TARGETED_CLICKS("AD_SERVER_TARGETED_CLICKS"),

    /**
     * 
     *                 The CTR for an ad delivered by the ad server.
     *                 <p>Corresponds to "Ad server CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CTR("AD_SERVER_CTR"),

    /**
     * 
     *                 The CPM and CPC revenue earned, calculated in publisher currency, for the ads delivered by the
     *                 ad server.
     *                 <p>Corresponds to "Ad server CPM and CPC revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CPM_AND_CPC_REVENUE("AD_SERVER_CPM_AND_CPC_REVENUE"),

    /**
     * 
     *                 The CPM and CPC revenue earned, calculated in publisher currency, for the ads delivered by the
     *                 ad server. This includes pre-rev-share revenue for Programmatic traffic. This is a temporary
     *                 metric to help with the transition from gross to net revenue reporting.
     *                 <p>Corresponds to "Ad server CPM and CPC revenue (gross)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CPM_AND_CPC_REVENUE_GROSS("AD_SERVER_CPM_AND_CPC_REVENUE_GROSS"),

    /**
     * 
     *                 The CPD revenue earned, calculated in publisher currency, for the ads delivered by the ad
     *                 server.
     *                 <p>Corresponds to "Ad server CPD revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CPD_REVENUE("AD_SERVER_CPD_REVENUE"),

    /**
     * 
     *                 All revenue earned, calculated in publisher currency, for the ads delivered by the ad server.
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Ad server total revenue, Ad server CPM, CPC, CPD, and vCPM revenue. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ALL_REVENUE("AD_SERVER_ALL_REVENUE"),

    /**
     * 
     *                 All gross revenue earned, calculated in publisher currency, for the ads delivered by the ad
     *                 server. This includes pre-rev-share revenue for Programmatic traffic. This is a temporary
     *                 metric to help with the transition from gross to net revenue reporting.
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Ad server total revenue (gross), Ad server CPM, CPC, CPD, and vCPM revenue (gross). Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ALL_REVENUE_GROSS("AD_SERVER_ALL_REVENUE_GROSS"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the CPM and CPC ads delivered
     *                 by the ad server.
     *                 <p>Corresponds to "Ad server average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM("AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from all ads delivered by the ad
     *                 server.
     *               
     * 
     */
    AD_SERVER_WITH_CPD_AVERAGE_ECPM("AD_SERVER_WITH_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 The ratio of the number of impressions delivered to the total impressions
     *                 delivered by the ad server for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad server impressions (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS("AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"),

    /**
     * 
     *                 The ratio of the number of clicks delivered to the total clicks delivered by the ad server for
     *                 line item-level dynamic allocation. Represented as a percentage.
     *                 <p>Corresponds to "Ad server clicks (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS("AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS"),

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM and CPC revenue earned by
     *                 the ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad server revenue (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE("AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM, CPC and CPD revenue earned by
     *                 the ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE("AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The number of downloaded impressions delivered by the ad server including impressions
     *                 recognized as spam.
     *                 <p>Corresponds to "Ad server unfiltered downloaded impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_UNFILTERED_IMPRESSIONS("AD_SERVER_UNFILTERED_IMPRESSIONS"),

    /**
     * 
     *                 The number of begin to render impressions delivered by the ad server including impressions
     *                 recognized as spam.
     *                 <p>Corresponds to "Ad server unfiltered begin to render impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_UNFILTERED_BEGIN_TO_RENDER_IMPRESSIONS("AD_SERVER_UNFILTERED_BEGIN_TO_RENDER_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks delivered by the ad server including clicks recognized as spam.
     *                 <p>Corresponds to "Ad server unfiltered clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_UNFILTERED_CLICKS("AD_SERVER_UNFILTERED_CLICKS"),

    /**
     * 
     *                 The number of impressions an AdSense ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS("ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions an AdSense ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *                 <p>Corresponds to "AdSense targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS("ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks an AdSense ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_CLICKS("ADSENSE_LINE_ITEM_LEVEL_CLICKS"),

    /**
     * 
     *                 The number of clicks an AdSense ad delivered for line item-level dynamic allocation by explicit
     *                 custom criteria targeting.
     *                 <p>Corresponds to "AdSense targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS("ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS"),

    /**
     * 
     *                 The ratio of clicks an AdSense reservation ad delivered to the number of impressions it
     *                 delivered, including line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_CTR("ADSENSE_LINE_ITEM_LEVEL_CTR"),

    /**
     * 
     *                 Revenue generated from AdSense ads delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_REVENUE("ADSENSE_LINE_ITEM_LEVEL_REVENUE"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the ads delivered by AdSense
     *                 for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM("ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM"),

    /**
     * 
     *                 The ratio of the number of impressions delivered by AdSense reservation ads to the total
     *                 impressions delivered for line item-level dynamic allocation. Represented as a percentage.
     *                 <p>Corresponds to "AdSense impressions (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS("ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"),

    /**
     * 
     *                 The ratio of the number of clicks delivered by AdSense reservation ads to the total clicks
     *                 delivered for line item-level dynamic allocation. Represented as a percentage.
     *                 <p>Corresponds to "AdSense clicks (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS("ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS"),

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the CPM and CPC ads
     *                 delivered by AdSense for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "AdSense revenue (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE("ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from all ads delivered by AdSense for line
     *                 item-level dynamic allocation. Represented as a percentage.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE("ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The number of impressions an Ad Exchange ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS("AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS"),

    /**
     * 
     *                 The number of bids associated with the selected dimensions.
     *                 <p>Corresponds to "Bids" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BID_COUNT("BID_COUNT"),

    /**
     * 
     *                 The average CPM associated with these bids.
     *                 <p>Corresponds to "Average bid CPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    BID_AVERAGE_CPM("BID_AVERAGE_CPM"),

    /**
     * 
     *                 Number of times a yield partner is asked to return bid to fill a yield group request.
     *                 
     *                 <p>Only applies to Open Bidding; not Mediation.
     *                 
     *                 <p>This data is available for 45 days after the event.
     *                 <p>Corresponds to "Yield group callouts" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_CALLOUTS("YIELD_GROUP_CALLOUTS"),

    /**
     * 
     *                 Number of times a yield group buyer successfully returned a bid in response to a yield group
     *                 callout, even if that response is "no bids."
     *                 
     *                 <p>Only applies to Open Bidding; not Mediation.
     *                 
     *                 <p>This data is available for 45 days after the event.
     *                 <p>Corresponds to "Yield group successful responses" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_SUCCESSFUL_RESPONSES("YIELD_GROUP_SUCCESSFUL_RESPONSES"),

    /**
     * 
     *                 Number of bids received from Open Bidding buyers, regardless of whether the returned bid
     *                 competes in an auction. This number might be greater than Yield group callouts because a buyer
     *                 can return multiple bids.
     *                 
     *                 <p>Only applies to Open Bidding; not Mediation.
     *                 
     *                 <p>This data is available for 45 days after the event.
     *                 <p>Corresponds to "Yield group bids" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_BIDS("YIELD_GROUP_BIDS"),

    /**
     * 
     *                 Number of bids received from Open Bidding buyers that competed in the auction.
     *                 
     *                 <p>Some bids may be filtered out before the auction runs if the bidder's response omits
     *                 required fields or contains a creative that violates Google's policies. Learn more about
     *                 policies and enforcement.
     *                 
     *                 <p>Only applies to Open Bidding; not Mediation.
     *                 
     *                 <p>This data is available for 45 days after the event.
     *                 <p>Corresponds to "Yield group bids in auction" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_BIDS_IN_AUCTION("YIELD_GROUP_BIDS_IN_AUCTION"),

    /**
     * 
     *                 Number of winning bids received from Open Bidding buyers, even when the winning bid is placed
     *                 at the end of a mediation for mobile apps chain.
     *                 
     *                 <p>Only applies to Open Bidding; not Mediation.
     *                 
     *                 <p>This data is available for 45 days after the event.
     *                 <p>Corresponds to "Yield group auctions won" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_AUCTIONS_WON("YIELD_GROUP_AUCTIONS_WON"),

    /**
     * 
     *                 Number of bid requests sent for each deal.
     *                 
     *                 <p>Must be broken down by {@code PROGRAMMATIC_DEAL_ID} or {@code PROGRAMMATIC_DEAL_NAME}.
     *                 
     *                 <p>Not tracked for Programmatic Guaranteed deals (will show zero on those rows).
     *                 <p>Corresponds to "Deals bid requests" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DEALS_BID_REQUESTS("DEALS_BID_REQUESTS"),

    /**
     * 
     *                 Number of bids placed on each deal.
     *                 
     *                 <p>Not tracked for Programmatic Guaranteed deals (will show zero on those rows).
     *                 <p>Corresponds to "Deals bids" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DEALS_BIDS("DEALS_BIDS"),

    /**
     * 
     *                 Bid rate for each deal.
     *                 
     *                 <p>Must be broken down by {@code PROGRAMMATIC_DEAL_ID} or {@code PROGRAMMATIC_DEAL_NAME}.
     *                 
     *                 <p>Not tracked for Programmatic Guaranteed deals (will show N/A on those rows).
     *                 <p>Corresponds to "Deals bid rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DEALS_BID_RATE("DEALS_BID_RATE"),

    /**
     * 
     *                 Number of winning bids for each deal.
     *                 
     *                 <p>Not tracked for Programmatic Guaranteed deals (will show zero on those rows).
     *                 <p>Corresponds to "Deals winning bids" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DEALS_WINNING_BIDS("DEALS_WINNING_BIDS"),

    /**
     * 
     *                 Win rate for each deal.
     *                 
     *                 <p>Not tracked for Programmatic Guaranteed deals (will show N/A on those rows).
     *                 <p>Corresponds to "Deals win rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DEALS_WIN_RATE("DEALS_WIN_RATE"),

    /**
     * 
     *                 Number of matched yield group requests where a yield partner delivered their ad to publisher
     *                 inventory.
     *                 <p>Corresponds to "Yield group impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_IMPRESSIONS("YIELD_GROUP_IMPRESSIONS"),

    /**
     * 
     *                 Total net revenue earned by a yield group, based upon the yield group estimated CPM and yield
     *                 group impressions recorded. This revenue already excludes Google revenue share.
     *                 <p>Corresponds to "Yield group estimated revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_ESTIMATED_REVENUE("YIELD_GROUP_ESTIMATED_REVENUE"),

    /**
     * 
     *                 The estimated net rate for yield groups or individual yield group partners.
     *                 <p>Corresponds to "Yield group estimated CPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_ESTIMATED_CPM("YIELD_GROUP_ESTIMATED_CPM"),

    /**
     * 
     *                 Yield group Mediation fill rate indicating how often a network fills an ad request.
     *                 <p>Corresponds to "Mediation fill rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_MEDIATION_FILL_RATE("YIELD_GROUP_MEDIATION_FILL_RATE"),

    /**
     * 
     *                 Passbacks are counted when an ad network is given a chance to serve but does not deliver an
     *                 impression, and Ad Manager Mediation moves on to the next ad network in the mediation chain.
     *                 
     *                 <p>Passbacks are not currently counted for the "Ad server" demand channel.
     *                 <p>Corresponds to "Mediation passbacks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_MEDIATION_PASSBACKS("YIELD_GROUP_MEDIATION_PASSBACKS"),

    /**
     * 
     *                 Revenue per thousand impressions based on data collected by Ad Manager from third-party ad
     *                 network reports. Displays zero if data collection is not enabled.
     *                 <p>Corresponds to "Mediation third-party eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_MEDIATION_THIRD_PARTY_ECPM("YIELD_GROUP_MEDIATION_THIRD_PARTY_ECPM"),

    /**
     * 
     *                 Total requests where a Mediation chain was served, even if none of the ad networks delivered an
     *                 impression.
     *                 <p>Corresponds to "Mediation chains served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    YIELD_GROUP_MEDIATION_CHAINS_SERVED("YIELD_GROUP_MEDIATION_CHAINS_SERVED"),

    /**
     * 
     *                 Mediation third-party average cost-per-thousand-impressions.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MEDIATION_THIRD_PARTY_ECPM("MEDIATION_THIRD_PARTY_ECPM"),

    /**
     * 
     *                 The number of impressions an Ad Exchange ad delivered for line item-level dynamic allocation
     *                 by explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad Exchange targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS("AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks an Ad Exchange ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS("AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS"),

    /**
     * 
     *                 The number of clicks an Ad Exchange ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad Exchange targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS("AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS"),

    /**
     * 
     *                 The ratio of clicks an Ad Exchange ad delivered to the number of impressions it delivered for
     *                 line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_CTR("AD_EXCHANGE_LINE_ITEM_LEVEL_CTR"),

    /**
     * 
     *                 The ratio of the number of impressions delivered to the total impressions delivered by Ad
     *                 Exchange for line item-level dynamic allocation. Represented as a percentage.
     *                 <p>Corresponds to "Ad Exchange impressions (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS("AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"),

    /**
     * 
     *                 The ratio of the number of clicks delivered to the total clicks delivered by Ad Exchange for
     *                 line item-level dynamic allocation. Represented as a percentage.
     *                 <p>Corresponds to "Ad Exchange clicks (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS("AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS"),

    /**
     * 
     *                 Revenue generated from Ad Exchange ads delivered for line item-level dynamic allocation.
     *                 Represented in publisher currency and time zone.
     *                 <p>Corresponds to "Ad Exchange revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE("AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE"),

    /**
     * 
     *                 The ratio of revenue generated by Ad Exchange to the total revenue earned
     *                 by CPM and CPC ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad Exchange revenue (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE("AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue generated by Ad Exchange to the total revenue earned
     *                 by CPM, CPC and CPD ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE("AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the delivery of Ad Exchange ads
     *                 for line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM("AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM"),

    /**
     * 
     *                 The total number of impressions delivered including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS("TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions delivered including line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *                 <p>Corresponds to "Total targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS("TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The total number of clicks delivered including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CLICKS("TOTAL_LINE_ITEM_LEVEL_CLICKS"),

    /**
     * 
     *                 The total number of clicks delivered including line item-level dynamic allocation by explicit
     *                 custom criteria targeting
     *                 <p>Corresponds to "Total targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS("TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS"),

    /**
     * 
     *                 The ratio of total clicks on ads delivered by the ad servers to the total number
     *                 of impressions delivered for an ad including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CTR("TOTAL_LINE_ITEM_LEVEL_CTR"),

    /**
     * 
     *                 The total CPM and CPC revenue generated by the ad servers
     *                 including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total CPM and CPC revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE("TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE"),

    /**
     * 
     *                 The total CPM, CPC and CPD revenue generated by the ad servers
     *                 including line item-level dynamic allocation.
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Total revenue, Total CPM, CPC, CPD, and vCPM revenue. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE("TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE"),

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM and CPC ads delivered by the
     *                 ad servers including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM("TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM, CPC and CPD ads delivered by the
     *                 ad servers including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM("TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 The total number of times that the code for an ad is served by the ad server including
     *                 inventory-level dynamic allocation.
     *                 <p>Corresponds to "Total code served count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_CODE_SERVED_COUNT("TOTAL_CODE_SERVED_COUNT"),

    /**
     * 
     *                 The total number of times that an ad request is sent to the ad server including dynamic
     *                 allocation.
     *                 <p>Corresponds to "Total ad requests" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_AD_REQUESTS("TOTAL_AD_REQUESTS"),

    /**
     * 
     *                 The total number of times that an ad is served by the ad server including dynamic allocation.
     *                 <p>Corresponds to "Total responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_RESPONSES_SERVED("TOTAL_RESPONSES_SERVED"),

    /**
     * 
     *                 The total number of times that an ad is not returned by the ad server.
     *                 <p>Corresponds to "Total unmatched ad requests" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_UNMATCHED_AD_REQUESTS("TOTAL_UNMATCHED_AD_REQUESTS"),

    /**
     * 
     *                 The fill rate indicating how often an ad request is filled by the ad server including dynamic
     *                 allocation.
     *                 <p>Corresponds to "Total fill rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_FILL_RATE("TOTAL_FILL_RATE"),

    /**
     * 
     *                 The total number of times that an ad is served by the ad server.
     *                 <p>Corresponds to "Ad server responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_RESPONSES_SERVED("AD_SERVER_RESPONSES_SERVED"),

    /**
     * 
     *                 The total number of times that an AdSense ad is delivered.
     *                 <p>Corresponds to "AdSense responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_RESPONSES_SERVED("ADSENSE_RESPONSES_SERVED"),

    /**
     * 
     *                 The total number of times that an Ad Exchange ad is delivered.
     *                 <p>Corresponds to "Ad Exchange responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_RESPONSES_SERVED("AD_EXCHANGE_RESPONSES_SERVED"),

    /**
     * 
     *                 Total number of ad responses served from programmatic demand sources. Includes Ad Exchange,
     *                 Open Bidding, and Preferred Deals.
     *                 
     *                 <p>Differs from Ad Exchange responses served, which doesn't include Open Bidding matched ad
     *                 requests.
     *                 <p>Corresponds to "Programmatic responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PROGRAMMATIC_RESPONSES_SERVED("PROGRAMMATIC_RESPONSES_SERVED"),

    /**
     * 
     *                 The number of programmatic responses served divided by the number of requests eligible for
     *                 programmatic. Includes Ad Exchange, Open Bidding, and Preferred Deals.
     *                 <p>Corresponds to "Programmatic match rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PROGRAMMATIC_MATCH_RATE("PROGRAMMATIC_MATCH_RATE"),

    /**
     * 
     *                 The total number of ad requests eligible for programmatic inventory, including Programmatic
     *                 Guaranteed, Preferred Deals, backfill, and open auction.
     *                 
     *                 <p>For optimized pods, this metric will count a single opportunity when the pod doesn't fill
     *                 with programmatic demand. When it does fill, it will count each matched query.
     *                 <p>Corresponds to "Programmatic eligible ad requests" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_PROGRAMMATIC_ELIGIBLE_AD_REQUESTS("TOTAL_PROGRAMMATIC_ELIGIBLE_AD_REQUESTS"),

    /**
     * 
     *                 The total number of video opportunities.
     *                 <p>Corresponds to "True opportunities" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_OPPORTUNITIES("TOTAL_VIDEO_OPPORTUNITIES"),

    /**
     * 
     *                 The total number of video capped opportunities.
     *                 <p>Corresponds to "Capped opportunities" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_CAPPED_OPPORTUNITIES("TOTAL_VIDEO_CAPPED_OPPORTUNITIES"),

    /**
     * 
     *                 The total number of video matched opportunities.
     *                 <p>Corresponds to "Matched opportunities" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_MATCHED_OPPORTUNITIES("TOTAL_VIDEO_MATCHED_OPPORTUNITIES"),

    /**
     * 
     *                 The total filled duration in ad breaks.
     *                 <p>Corresponds to "Matched duration (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_MATCHED_DURATION("TOTAL_VIDEO_MATCHED_DURATION"),

    /**
     * 
     *                 The total duration in ad breaks.
     *                 <p>Corresponds to "Total duration (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_DURATION("TOTAL_VIDEO_DURATION"),

    /**
     * 
     *                 The total number of break starts.
     *                 <p>Corresponds to "Break start" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_BREAK_START("TOTAL_VIDEO_BREAK_START"),

    /**
     * 
     *                 The total number of break ends.
     *                 <p>Corresponds to "Break end" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_BREAK_END("TOTAL_VIDEO_BREAK_END"),

    /**
     * 
     *                 The total number of missed impressions due to the ad servers' inability to
     *                 find ads to serve, including inventory-level dynamic allocation.
     *                 <p>Corresponds to "Unfilled impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS("TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS"),

    /**
     * 
     *                 <p>Corresponds to "Average impressions/unique visitor" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    UNIQUE_REACH_FREQUENCY("UNIQUE_REACH_FREQUENCY"),

    /**
     * 
     *                 <p>Corresponds to "Total reach impressions" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    UNIQUE_REACH_IMPRESSIONS("UNIQUE_REACH_IMPRESSIONS"),

    /**
     * 
     *                 <p>Corresponds to "Total unique visitors" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    UNIQUE_REACH("UNIQUE_REACH"),

    /**
     * 
     *                 The number of impressions for a particular SDK mediation creative.
     *                 <p>Corresponds to "SDK mediation creative impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    SDK_MEDIATION_CREATIVE_IMPRESSIONS("SDK_MEDIATION_CREATIVE_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks for a particular SDK mediation creative.
     *                 <p>Corresponds to "SDK mediation creative clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    SDK_MEDIATION_CREATIVE_CLICKS("SDK_MEDIATION_CREATIVE_CLICKS"),

    /**
     * 
     *                 The number of forecasted impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down and for the next 12
     *                 months with a monthly break down.
     *                 <p>Corresponds to "Forecasted impressions" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_FORECASTED_IMPRESSIONS("SELL_THROUGH_FORECASTED_IMPRESSIONS"),

    /**
     * 
     *                 The number of partner-sold impressions served to the YouTube partner ad inventory.
     *                 <p>Corresponds to "Partner-sold impressions" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_PARTNER_IMPRESSIONS("PARTNER_SALES_PARTNER_IMPRESSIONS"),

    /**
     * 
     *                 The number of times the ad server responded to a request for the YouTube partner ad inventory.
     *                 <p>Corresponds to "Partner-sold code served count" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_PARTNER_CODE_SERVED("PARTNER_SALES_PARTNER_CODE_SERVED"),

    /**
     * 
     *                 The number of Google-sold impressions served to the YouTube partner ad inventory.
     *                 <p>Corresponds to "Google-sold impressions" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_GOOGLE_IMPRESSIONS("PARTNER_SALES_GOOGLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of Google-sold reservation impressions served to the YouTube partner ad inventory.
     *                 <p>Corresponds to "Google-sold reservation impressions" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_GOOGLE_RESERVATION_IMPRESSIONS("PARTNER_SALES_GOOGLE_RESERVATION_IMPRESSIONS"),

    /**
     * 
     *                 The number of Google-sold auction impressions served to the YouTube partner ad inventory.
     *                 <p>Corresponds to "Google-sold auction impressions" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_GOOGLE_AUCTION_IMPRESSIONS("PARTNER_SALES_GOOGLE_AUCTION_IMPRESSIONS"),

    /**
     * 
     *                 The total number of ad requests that were eligible to serve to the YouTube partner ad
     *                 inventory.
     *                 <p>Corresponds to "Total ad requests" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_QUERIES("PARTNER_SALES_QUERIES"),

    /**
     * 
     *                 The number of ad requests for the YouTube partner ad inventory that were filled with at least 1
     *                 ad. This includes both partner-sold and Google-sold requests.
     *                 
     *                 <p>Google-sold can fill at most 2 ads, while partner-sold can fill at most 1 ad.
     *                 <p>Corresponds to "Filled ad requests" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_FILLED_QUERIES("PARTNER_SALES_FILLED_QUERIES"),

    /**
     * 
     *                 The fill rate percentage of filled requests to total ad requests.
     *                 <p>Corresponds to "Fill rate" in the Ad Manager UI. Compatible with the "YouTube consolidated" report type.</p>
     *               
     * 
     */
    PARTNER_SALES_SELL_THROUGH_RATE("PARTNER_SALES_SELL_THROUGH_RATE"),

    /**
     * 
     *                 The number of available impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *                 <p>Corresponds to "Available impressions" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_AVAILABLE_IMPRESSIONS("SELL_THROUGH_AVAILABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of reserved impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *                 <p>Corresponds to "Reserved impressions" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_RESERVED_IMPRESSIONS("SELL_THROUGH_RESERVED_IMPRESSIONS"),

    /**
     * 
     *                 The sell-through rate for impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *                 <p>Corresponds to "Sell-through rate" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_SELL_THROUGH_RATE("SELL_THROUGH_SELL_THROUGH_RATE"),

    /**
     * 
     *                 The total number of times a backup image is served in place of a rich media ad.
     *                 <p>Corresponds to "Backup image impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_BACKUP_IMAGES("RICH_MEDIA_BACKUP_IMAGES"),

    /**
     * 
     *                 The amount of time(seconds) that each rich media ad is displayed to users.
     *                 <p>Corresponds to "Total display time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_DISPLAY_TIME("RICH_MEDIA_DISPLAY_TIME"),

    /**
     * 
     *                 The average amount of time(seconds) that each rich media ad is displayed to users.
     *                 <p>Corresponds to "Average display time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_AVERAGE_DISPLAY_TIME("RICH_MEDIA_AVERAGE_DISPLAY_TIME"),

    /**
     * 
     *                 The number of times an expanding ad was expanded.
     *                 <p>Corresponds to "Total expansions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_EXPANSIONS("RICH_MEDIA_EXPANSIONS"),

    /**
     * 
     *                 The average amount of time(seconds) that an expanding ad is viewed in an expanded state.
     *                 <p>Corresponds to "Average expanding time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_EXPANDING_TIME("RICH_MEDIA_EXPANDING_TIME"),

    /**
     * 
     *                 The average amount of time(seconds) that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Interaction time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_TIME("RICH_MEDIA_INTERACTION_TIME"),

    /**
     * 
     *                 The number of times that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Total interactions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_COUNT("RICH_MEDIA_INTERACTION_COUNT"),

    /**
     * 
     *                 The ratio of rich media ad interactions to the number of times the ad was displayed.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Interaction rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_RATE("RICH_MEDIA_INTERACTION_RATE"),

    /**
     * 
     *                 The average amount of time(seconds) that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Average interaction time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_AVERAGE_INTERACTION_TIME("RICH_MEDIA_AVERAGE_INTERACTION_TIME"),

    /**
     * 
     *                 The number of impressions where a user interacted with a rich media ad.
     *                 <p>Corresponds to "Interactive impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_IMPRESSIONS("RICH_MEDIA_INTERACTION_IMPRESSIONS"),

    /**
     * 
     *                 The number of times that a user manually closes a floating, expanding,
     *                 in-page with overlay, or in-page with floating ad.
     *                 <p>Corresponds to "Manual closes" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_MANUAL_CLOSES("RICH_MEDIA_MANUAL_CLOSES"),

    /**
     * 
     *                 A metric that measures an impression only once when a user opens an ad in full screen mode.
     *                 <p>Corresponds to "Full-screen impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_FULL_SCREEN_IMPRESSIONS("RICH_MEDIA_FULL_SCREEN_IMPRESSIONS"),

    /**
     * 
     *                 The number of times a user clicked on the graphical controls of a video player.
     *                 <p>Corresponds to "Total video interactions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_INTERACTIONS("RICH_MEDIA_VIDEO_INTERACTIONS"),

    /**
     * 
     *                 The ratio of video interactions to video plays.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Video interaction rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_INTERACTION_RATE("RICH_MEDIA_VIDEO_INTERACTION_RATE"),

    /**
     * 
     *                 The number of times a rich media video was muted.
     *                 <p>Corresponds to "Mute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_MUTES("RICH_MEDIA_VIDEO_MUTES"),

    /**
     * 
     *                 The number of times a rich media video was paused.
     *                 <p>Corresponds to "Pause" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_PAUSES("RICH_MEDIA_VIDEO_PAUSES"),

    /**
     * 
     *                 The number of times a rich media video was played.
     *                 <p>Corresponds to "Plays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_PLAYES("RICH_MEDIA_VIDEO_PLAYES"),

    /**
     * 
     *                 The number of times a rich media video was played up to midpoint.
     *                 <p>Corresponds to "Midpoint" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_MIDPOINTS("RICH_MEDIA_VIDEO_MIDPOINTS"),

    /**
     * 
     *                 The number of times a rich media video was fully played.
     *                 <p>Corresponds to "Complete" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_COMPLETES("RICH_MEDIA_VIDEO_COMPLETES"),

    /**
     * 
     *                 The number of times a rich media video was restarted.
     *                 <p>Corresponds to "Replays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_REPLAYS("RICH_MEDIA_VIDEO_REPLAYS"),

    /**
     * 
     *                 The number of times a rich media video was stopped.
     *                 <p>Corresponds to "Stops" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_STOPS("RICH_MEDIA_VIDEO_STOPS"),

    /**
     * 
     *                 The number of times a rich media video was unmuted.
     *                 <p>Corresponds to "Unmute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_UNMUTES("RICH_MEDIA_VIDEO_UNMUTES"),

    /**
     * 
     *                 The average amount of time(seconds) that a rich media video was viewed per view.
     *                 <p>Corresponds to "Average view time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_VIEW_TIME("RICH_MEDIA_VIDEO_VIEW_TIME"),

    /**
     * 
     *                 The percentage of a video watched by a user.
     *                 <p>Corresponds to "View rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_VIEW_RATE("RICH_MEDIA_VIDEO_VIEW_RATE"),

    /**
     * 
     *                 The amount of time (seconds) that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Custom event - time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_EVENT_TIME("RICH_MEDIA_CUSTOM_EVENT_TIME"),

    /**
     * 
     *                 The number of times a user views and interacts with a specified part of a rich media ad.
     *                 <p>Corresponds to "Custom event - count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_EVENT_COUNT("RICH_MEDIA_CUSTOM_EVENT_COUNT"),

    /**
     * 
     *                 The number of impressions where the video was played.
     *                 <p>Corresponds to "Start" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_START("VIDEO_VIEWERSHIP_START"),

    /**
     * 
     *                 The number of times the video played to 25% of its length.
     *                 <p>Corresponds to "First quartile" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_FIRST_QUARTILE("VIDEO_VIEWERSHIP_FIRST_QUARTILE"),

    /**
     * 
     *                 The number of times the video reached its midpoint during play.
     *                 <p>Corresponds to "Midpoint" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_MIDPOINT("VIDEO_VIEWERSHIP_MIDPOINT"),

    /**
     * 
     *                 The number of times the video played to 75% of its length.
     *                 <p>Corresponds to "Third quartile" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_THIRD_QUARTILE("VIDEO_VIEWERSHIP_THIRD_QUARTILE"),

    /**
     * 
     *                 The number of times the video played to completion.
     *                 <p>Corresponds to "Complete" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_COMPLETE("VIDEO_VIEWERSHIP_COMPLETE"),

    /**
     * 
     *                 Average percentage of the video watched by users.
     *                 <p>Corresponds to "Average view rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE("VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE"),

    /**
     * 
     *                 Average time(seconds) users watched the video.
     *                 <p>Corresponds to "Average view time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME("VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME"),

    /**
     * 
     *                 Percentage of times the video played to the end.
     *                 <p>Corresponds to "Completion rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_COMPLETION_RATE("VIDEO_VIEWERSHIP_COMPLETION_RATE"),

    /**
     * 
     *                 The number of times an error occurred, such as a VAST redirect error, a video playback error,
     *                 or an invalid response error.
     *                 <p>Corresponds to "Total error count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT("VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT"),

    /**
     * 
     *                 Duration of the video creative.
     *                 <p>Corresponds to "Video length" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_VIDEO_LENGTH("VIDEO_VIEWERSHIP_VIDEO_LENGTH"),

    /**
     * 
     *                 The number of times a skip button is shown in video.
     *                 <p>Corresponds to "Skip button shown" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN("VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN"),

    /**
     * 
     *                 The number of engaged views i.e. ad is viewed to completion or for 30s, whichever comes first.
     *                 <p>Corresponds to "Engaged view" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_ENGAGED_VIEW("VIDEO_VIEWERSHIP_ENGAGED_VIEW"),

    /**
     * 
     *                 View-through rate represented as a percentage.
     *                 <p>Corresponds to "View-through rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE("VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE"),

    /**
     * 
     *                 Number of times that the publisher specified a video ad played automatically.
     *                 <p>Corresponds to "Auto-plays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AUTO_PLAYS("VIDEO_VIEWERSHIP_AUTO_PLAYS"),

    /**
     * 
     *                 Number of times that the publisher specified a video ad was clicked to play.
     *                 <p>Corresponds to "Click-to-plays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_CLICK_TO_PLAYS("VIDEO_VIEWERSHIP_CLICK_TO_PLAYS"),

    /**
     * 
     *                 Error rate is the percentage of video error count from (error count + total impressions).
     *                 <p>Corresponds to "Total error rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE("VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE"),

    /**
     * 
     *                 The drop-off rate.
     *                 <p>Corresponds to "Drop-off rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DROPOFF_RATE("DROPOFF_RATE"),

    /**
     * 
     *                 Number of times a video ad has been viewed to completion or watched to 30 seconds, whichever
     *                 happens first.
     *                 <p>Corresponds to "TrueView views" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_TRUEVIEW_VIEWS("VIDEO_TRUEVIEW_VIEWS"),

    /**
     * 
     *                 Percentage of times a user clicked Skip.
     *                 <p>Corresponds to "TrueView skip rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_TRUEVIEW_SKIP_RATE("VIDEO_TRUEVIEW_SKIP_RATE"),

    /**
     * 
     *                 TrueView views divided by TrueView impressions.
     *                 <p>Corresponds to "TrueView VTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_TRUEVIEW_VTR("VIDEO_TRUEVIEW_VTR"),

    /**
     * 
     *                 Number of VAST video errors of type 100.
     *                 <p>Corresponds to "VAST error 100 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_100_COUNT("VIDEO_ERRORS_VAST_ERROR_100_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 101.
     *                 <p>Corresponds to "VAST error 101 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_101_COUNT("VIDEO_ERRORS_VAST_ERROR_101_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 102.
     *                 <p>Corresponds to "VAST error 102 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_102_COUNT("VIDEO_ERRORS_VAST_ERROR_102_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 200.
     *                 <p>Corresponds to "VAST error 200 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_200_COUNT("VIDEO_ERRORS_VAST_ERROR_200_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 201.
     *                 <p>Corresponds to "VAST error 201 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_201_COUNT("VIDEO_ERRORS_VAST_ERROR_201_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 202.
     *                 <p>Corresponds to "VAST error 202 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_202_COUNT("VIDEO_ERRORS_VAST_ERROR_202_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 203.
     *                 <p>Corresponds to "VAST error 203 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_203_COUNT("VIDEO_ERRORS_VAST_ERROR_203_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 300.
     *                 <p>Corresponds to "VAST error 300 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_300_COUNT("VIDEO_ERRORS_VAST_ERROR_300_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 301.
     *                 <p>Corresponds to "VAST error 301 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_301_COUNT("VIDEO_ERRORS_VAST_ERROR_301_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 302.
     *                 <p>Corresponds to "VAST error 302 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_302_COUNT("VIDEO_ERRORS_VAST_ERROR_302_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 303.
     *                 <p>Corresponds to "VAST error 303 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_303_COUNT("VIDEO_ERRORS_VAST_ERROR_303_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 400.
     *                 <p>Corresponds to "VAST error 400 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_400_COUNT("VIDEO_ERRORS_VAST_ERROR_400_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 401.
     *                 <p>Corresponds to "VAST error 401 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_401_COUNT("VIDEO_ERRORS_VAST_ERROR_401_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 402.
     *                 <p>Corresponds to "VAST error 402 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_402_COUNT("VIDEO_ERRORS_VAST_ERROR_402_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 403.
     *                 <p>Corresponds to "VAST error 403 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_403_COUNT("VIDEO_ERRORS_VAST_ERROR_403_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 405.
     *                 <p>Corresponds to "VAST error 405 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_405_COUNT("VIDEO_ERRORS_VAST_ERROR_405_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 500.
     *                 <p>Corresponds to "VAST error 500 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_500_COUNT("VIDEO_ERRORS_VAST_ERROR_500_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 501.
     *                 <p>Corresponds to "VAST error 501 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_501_COUNT("VIDEO_ERRORS_VAST_ERROR_501_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 502.
     *                 <p>Corresponds to "VAST error 502 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_502_COUNT("VIDEO_ERRORS_VAST_ERROR_502_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 503.
     *                 <p>Corresponds to "VAST error 503 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_503_COUNT("VIDEO_ERRORS_VAST_ERROR_503_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 600.
     *                 <p>Corresponds to "VAST error 600 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_600_COUNT("VIDEO_ERRORS_VAST_ERROR_600_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 601.
     *                 <p>Corresponds to "VAST error 601 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_601_COUNT("VIDEO_ERRORS_VAST_ERROR_601_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 602.
     *                 <p>Corresponds to "VAST error 602 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_602_COUNT("VIDEO_ERRORS_VAST_ERROR_602_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 603.
     *                 <p>Corresponds to "VAST error 603 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_603_COUNT("VIDEO_ERRORS_VAST_ERROR_603_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 604.
     *                 <p>Corresponds to "VAST error 604 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_604_COUNT("VIDEO_ERRORS_VAST_ERROR_604_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 900.
     *                 <p>Corresponds to "VAST error 900 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_900_COUNT("VIDEO_ERRORS_VAST_ERROR_900_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 901.
     *                 <p>Corresponds to "VAST error 901 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_901_COUNT("VIDEO_ERRORS_VAST_ERROR_901_COUNT"),

    /**
     * 
     *                 Video interaction event: The number of times user paused ad clip.
     *                 <p>Corresponds to "Pause" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_PAUSE("VIDEO_INTERACTION_PAUSE"),

    /**
     * 
     *                 Video interaction event: The number of times the user unpaused the video.
     *                 <p>Corresponds to "Resume" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_RESUME("VIDEO_INTERACTION_RESUME"),

    /**
     * 
     *                 Video interaction event: The number of times a user rewinds the video.
     *                 <p>Corresponds to "Rewind" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_REWIND("VIDEO_INTERACTION_REWIND"),

    /**
     * 
     *                 Video interaction event: The number of times video player was in mute state during play
     *                 of ad clip.
     *                 <p>Corresponds to "Mute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_MUTE("VIDEO_INTERACTION_MUTE"),

    /**
     * 
     *                 Video interaction event: The number of times a user unmutes the video.
     *                 <p>Corresponds to "Unmute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_UNMUTE("VIDEO_INTERACTION_UNMUTE"),

    /**
     * 
     *                 Video interaction event: The number of times a user collapses a video,
     *                 either to its original size or to a different size.
     *                 <p>Corresponds to "Collapse" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_COLLAPSE("VIDEO_INTERACTION_COLLAPSE"),

    /**
     * 
     *                 Video interaction event: The number of times a user expands a video.
     *                 <p>Corresponds to "Expand" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_EXPAND("VIDEO_INTERACTION_EXPAND"),

    /**
     * 
     *                 Video interaction event: The number of times ad clip played in full screen mode.
     *                 <p>Corresponds to "Full screen" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_FULL_SCREEN("VIDEO_INTERACTION_FULL_SCREEN"),

    /**
     * 
     *                 Video interaction event: The number of user interactions with a video, on average,
     *                 such as pause, full screen, mute, etc.
     *                 <p>Corresponds to "Average interaction rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE("VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE"),

    /**
     * 
     *                 Video interaction event: The number of times a skippable video is skipped.
     *                 <p>Corresponds to "Video skipped" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_VIDEO_SKIPS("VIDEO_INTERACTION_VIDEO_SKIPS"),

    /**
     * 
     *                 The number of control starts.
     *                 <p>Corresponds to "Control starts" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_STARTS("VIDEO_OPTIMIZATION_CONTROL_STARTS"),

    /**
     * 
     *                 The number of optimized starts.
     *                 <p>Corresponds to "Optimized starts" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_STARTS("VIDEO_OPTIMIZATION_OPTIMIZED_STARTS"),

    /**
     * 
     *                 The number of control completes.
     *                 <p>Corresponds to "Control completes" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_COMPLETES("VIDEO_OPTIMIZATION_CONTROL_COMPLETES"),

    /**
     * 
     *                 The number of optimized completes.
     *                 <p>Corresponds to "Optimized completes" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES("VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES"),

    /**
     * 
     *                 The rate of control completions.
     *                 <p>Corresponds to "Control completion rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE("VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE"),

    /**
     * 
     *                 The rate of optimized completions.
     *                 <p>Corresponds to "Optimized completion rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE("VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE"),

    /**
     * 
     *                 The percentage by which optimized completion rate is greater than the unoptimized completion
     *                 rate. This is calculated as (( {@link Column#VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE}/
     *                 {@link Column#VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "Completion rate lift" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT("VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT"),

    /**
     * 
     *                 The number of control skip buttons shown.
     *                 <p>Corresponds to "Control skip button shown" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN("VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN"),

    /**
     * 
     *                 The number of optimized skip buttons shown.
     *                 <p>Corresponds to "Optimized skip button shown" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN("VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN"),

    /**
     * 
     *                 The number of control engaged views.
     *                 <p>Corresponds to "Control engaged view" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW("VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW"),

    /**
     * 
     *                 The number of optimized engaged views.
     *                 <p>Corresponds to "Optimized engaged view" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW("VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW"),

    /**
     * 
     *                 The control view-through rate.
     *                 <p>Corresponds to "Control view-through rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE("VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE"),

    /**
     * 
     *                 The optimized view-through rate.
     *                 <p>Corresponds to "Optimized view-through rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE("VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE"),

    /**
     * 
     *                 The percentage by which optimized view-through rate is greater than the unoptimized
     *                 view-through rate. This is calculated as (( {@link
     *                 Column#VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE}/ {@link
     *                 Column#VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "View-through rate lift" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT("VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT"),

    /**
     * 
     *                 Total impressions from the Google Ad Manager server, AdSense, Ad Exchange, and yield group
     *                 partners.
     *                 <p>Corresponds to "Total impressions" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    VIDEO_IMPRESSIONS_REAL_TIME("VIDEO_IMPRESSIONS_REAL_TIME"),

    /**
     * 
     *                 Total number of matched queries.
     *                 <p>Corresponds to "Total responses served" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    VIDEO_MATCHED_QUERIES_REAL_TIME("VIDEO_MATCHED_QUERIES_REAL_TIME"),

    /**
     * 
     *                 Total number of unmatched queries.
     *                 <p>Corresponds to "Total unmatched ad requests" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    VIDEO_UNMATCHED_QUERIES_REAL_TIME("VIDEO_UNMATCHED_QUERIES_REAL_TIME"),

    /**
     * 
     *                 Total number of ad requests.
     *                 <p>Corresponds to "Total ad requests" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    VIDEO_TOTAL_QUERIES_REAL_TIME("VIDEO_TOTAL_QUERIES_REAL_TIME"),

    /**
     * 
     *                 Total number of creatives served.
     *                 <p>Corresponds to "Total creative serves" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    VIDEO_CREATIVE_SERVE_REAL_TIME("VIDEO_CREATIVE_SERVE_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 100.
     *                 <p>Corresponds to "VAST error 100 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_100_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_100_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_100_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 101.
     *                 <p>Corresponds to "VAST error 101 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_101_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_101_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_101_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 102.
     *                 <p>Corresponds to "VAST error 102 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_102_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_102_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_102_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 200.
     *                 <p>Corresponds to "VAST error 200 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_200_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_200_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_200_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 201.
     *                 <p>Corresponds to "VAST error 201 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_201_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_201_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_201_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 202.
     *                 <p>Corresponds to "VAST error 202 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_202_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_202_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_202_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 203.
     *                 <p>Corresponds to "VAST error 203 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_203_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_203_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_203_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 300.
     *                 <p>Corresponds to "VAST error 300 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_300_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_300_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_300_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 301.
     *                 <p>Corresponds to "VAST error 301 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_301_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_301_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_301_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 302.
     *                 <p>Corresponds to "VAST error 302 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_302_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_302_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_302_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 303.
     *                 <p>Corresponds to "VAST error 303 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_303_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_303_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_303_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 400.
     *                 <p>Corresponds to "VAST error 400 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_400_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_400_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_400_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 401.
     *                 <p>Corresponds to "VAST error 401 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_401_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_401_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_401_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 402.
     *                 <p>Corresponds to "VAST error 402 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_402_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_402_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_402_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 403.
     *                 <p>Corresponds to "VAST error 403 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_403_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_403_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_403_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 405.
     *                 <p>Corresponds to "VAST error 405 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_405_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_405_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_405_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 500.
     *                 <p>Corresponds to "VAST error 500 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_500_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_500_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_500_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 501.
     *                 <p>Corresponds to "VAST error 501 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_501_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_501_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_501_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 502.
     *                 <p>Corresponds to "VAST error 502 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_502_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_502_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_502_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 503.
     *                 <p>Corresponds to "VAST error 503 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_503_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_503_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_503_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 600.
     *                 <p>Corresponds to "VAST error 600 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_600_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_600_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_600_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 601.
     *                 <p>Corresponds to "VAST error 601 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_601_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_601_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_601_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 602.
     *                 <p>Corresponds to "VAST error 602 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_602_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_602_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_602_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 603.
     *                 <p>Corresponds to "VAST error 603 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_603_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_603_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_603_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 604.
     *                 <p>Corresponds to "VAST error 604 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_604_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_604_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_604_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 900.
     *                 <p>Corresponds to "VAST error 900 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_900_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_900_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_900_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 901.
     *                 <p>Corresponds to "VAST error 901 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST3_ERROR_901_COUNT_REAL_TIME")
    VIDEO_VAST_3_ERROR_901_COUNT_REAL_TIME("VIDEO_VAST3_ERROR_901_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 406.
     *                 <p>Corresponds to "VAST error 406 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST4_ERROR_406_COUNT_REAL_TIME")
    VIDEO_VAST_4_ERROR_406_COUNT_REAL_TIME("VIDEO_VAST4_ERROR_406_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 407.
     *                 <p>Corresponds to "VAST error 407 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST4_ERROR_407_COUNT_REAL_TIME")
    VIDEO_VAST_4_ERROR_407_COUNT_REAL_TIME("VIDEO_VAST4_ERROR_407_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 408.
     *                 <p>Corresponds to "VAST error 408 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST4_ERROR_408_COUNT_REAL_TIME")
    VIDEO_VAST_4_ERROR_408_COUNT_REAL_TIME("VIDEO_VAST4_ERROR_408_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 409.
     *                 <p>Corresponds to "VAST error 409 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST4_ERROR_409_COUNT_REAL_TIME")
    VIDEO_VAST_4_ERROR_409_COUNT_REAL_TIME("VIDEO_VAST4_ERROR_409_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of VAST video errors of type 410.
     *                 <p>Corresponds to "VAST error 410 count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("VIDEO_VAST4_ERROR_410_COUNT_REAL_TIME")
    VIDEO_VAST_4_ERROR_410_COUNT_REAL_TIME("VIDEO_VAST4_ERROR_410_COUNT_REAL_TIME"),

    /**
     * 
     *                 Number of total VAST video errors.
     *                 <p>Corresponds to "Total error count" in the Ad Manager UI. Compatible with the "Real-time video" report type.</p>
     *               
     * 
     */
    VIDEO_VAST_TOTAL_ERROR_COUNT_REAL_TIME("VIDEO_VAST_TOTAL_ERROR_COUNT_REAL_TIME"),

    /**
     * 
     *                 The total number of impressions viewed on the user's screen.
     *                 <p>Corresponds to "Total Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions that were sampled and measured by active view.
     *                 <p>Corresponds to "Total Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of total impressions viewed on the user's screen (out of the total impressions
     *                 measurable by active view).
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions that were eligible to measure viewability.
     *                 <p>Corresponds to "Total Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of total impressions that were measurable by active view (out of all the total
     *                 impressions sampled for active view).
     *                 <p>Corresponds to "Total Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View total average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "Total Active View average viewable time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 The percentage of total impressions from video creatives with audible playback at start, from
     *                 all total measurable impressions for Active View.
     *                 <p>Corresponds to "Active View % audible at start" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ACTIVE_VIEW_PERCENT_AUDIBLE_START_IMPRESSIONS("ACTIVE_VIEW_PERCENT_AUDIBLE_START_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of total impressions from video creatives where volume > 0 at any point, from
     *                 all total impressions measurable for Active View.
     *                 <p>Corresponds to "Active View % ever audible" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ACTIVE_VIEW_PERCENT_EVER_AUDIBLE_IMPRESSIONS("ACTIVE_VIEW_PERCENT_EVER_AUDIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by the ad server viewed on the user's screen.
     *                 <p>Corresponds to "Ad server Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by the ad server that were sampled, and measurable by
     *                 active view.
     *                 <p>Corresponds to "Ad server Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by the ad server viewed on the user's screen (out of
     *                 the ad server impressions measurable by active view).
     *                 <p>Corresponds to "Ad server Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions delivered by the ad server that were eligible to measure
     *                 viewability.
     *                 <p>Corresponds to "Ad server Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by the ad server that were measurable by active view (
     *                 out of all the ad server impressions sampled for active view).
     *                 <p>Corresponds to "Ad server Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View ad server revenue.
     *                 <p>Corresponds to "Ad server Active View revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_REVENUE("AD_SERVER_ACTIVE_VIEW_REVENUE"),

    /**
     * 
     *                 Active View ad server average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "Ad server Active View average viewable time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 The number of impressions delivered by AdSense viewed on the user's screen,
     *                 <p>Corresponds to "AdSense Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by AdSense that were sampled, and measurable by active
     *                 view.
     *                 <p>Corresponds to "AdSense Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by AdSense viewed on the user's screen (out of AdSense
     *                 impressions measurable by active view).
     *                 <p>Corresponds to "AdSense Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions delivered by AdSense that were eligible to measure viewability.
     *                 <p>Corresponds to "AdSense Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by AdSense that were measurable by active view ( out of
     *                 all AdSense impressions sampled for active view).
     *                 <p>Corresponds to "AdSense Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View AdSense average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "AdSense Active View average viewable time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange viewed on the user's screen,
     *                 <p>Corresponds to "Ad Exchange Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange that were sampled, and measurable by active
     *                 view.
     *                 <p>Corresponds to "Ad Exchange Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by Ad Exchange viewed on the user's screen (out of Ad
     *                 Exchange impressions measurable by active view).
     *                 <p>Corresponds to "Ad Exchange Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions delivered by Ad Exchange that were eligible to measure viewability.
     *                 <p>Corresponds to "Ad Exchange Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by Ad Exchange that were measurable by active view (
     *                 out of all Ad Exchange impressions sampled for active view).
     *                 <p>Corresponds to "Ad Exchange Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View AdExchange average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "Ad Exchange Active View average viewable time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 The total number of queries sent to Ad Exchange.
     *                 <p>Corresponds to "Ad Exchange ad requests" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_TOTAL_REQUESTS("AD_EXCHANGE_TOTAL_REQUESTS"),

    /**
     * 
     *                 The fraction of Ad Exchange queries that result in a matched query. Also known as "Coverage".
     *                 <p>Corresponds to "Ad Exchange match rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MATCH_RATE("AD_EXCHANGE_MATCH_RATE"),

    /**
     * 
     *                 The amount earned per click on Ad Exchange.
     *                 <p>Corresponds to "Ad Exchange CPC" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_COST_PER_CLICK("AD_EXCHANGE_COST_PER_CLICK"),

    /**
     * 
     *                 The fraction of Ad Exchange requests that result in a click.
     *                 <p>Corresponds to "Ad Exchange ad request CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_TOTAL_REQUEST_CTR("AD_EXCHANGE_TOTAL_REQUEST_CTR"),

    /**
     * 
     *                 The fraction of Ad Exchange matched requests that result in a click.
     *                 <p>Corresponds to "Ad Exchange matched request CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MATCHED_REQUEST_CTR("AD_EXCHANGE_MATCHED_REQUEST_CTR"),

    /**
     * 
     *                 The amount earned per thousand Ad Exchange requests.
     *                 <p>Corresponds to "Ad Exchange ad request eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_TOTAL_REQUEST_ECPM("AD_EXCHANGE_TOTAL_REQUEST_ECPM"),

    /**
     * 
     *                 The amount earned per thousand Ad Exchange matched requests.
     *                 <p>Corresponds to "Ad Exchange matched request eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MATCHED_REQUEST_ECPM("AD_EXCHANGE_MATCHED_REQUEST_ECPM"),

    /**
     * 
     *                 The increase in Ad Exchange revenue gained for won impressions over the applicable minimum CPM
     *                 or the best price specified during dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange lift" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LIFT_EARNINGS("AD_EXCHANGE_LIFT_EARNINGS"),

    /**
     * 
     *                 Active View total revenue.
     *                 <p>Corresponds to "Total Active View revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_REVENUE("TOTAL_ACTIVE_VIEW_REVENUE"),

    /**
     * 
     *                 The number of impressions sent to Ad Exchange / AdSense, regardless of whether they
     *                 won or lost (total number of dynamic allocation impressions).
     *                 <p>Corresponds to "Impressions competing" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL"),

    /**
     * 
     *                 The number of unfilled queries that attempted dynamic allocation by Ad Exchange / AdSense.
     *                 <p>Corresponds to "Unfilled competing impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING("DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING"),

    /**
     * 
     *                 The number of Ad Exchange / AdSense and Ad Manager impressions.
     *                 <p>Corresponds to "Eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL"),

    /**
     * 
     *                 The difference between eligible impressions and competing impressions in dynamic allocation.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL"),

    /**
     * 
     *                 The percentage of eligible impressions that are not competing in dynamic allocation.
     *                 <p>Corresponds to "Impressions not competing (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL"),

    /**
     * 
     *                 The percent of eligible impressions participating in dynamic allocation.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL"),

    /**
     * 
     *                 The percent of total dynamic allocation queries that won.
     *                 <p>Corresponds to "Dynamic allocation match rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL"),

    /**
     * 
     *                 The number of invoiced impressions.
     *                 <p>Corresponds to "Invoiced impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    INVOICED_IMPRESSIONS("INVOICED_IMPRESSIONS"),

    /**
     * 
     *                 The number of invoiced unfilled impressions.
     *                 <p>Corresponds to "Invoiced unfilled impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    INVOICED_UNFILLED_IMPRESSIONS("INVOICED_UNFILLED_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions tracked for Nielsen Digital Ad Ratings measurement.
     *                 <p>Corresponds to "Impressions" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IMPRESSIONS("NIELSEN_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions for in-target demographic tracked for Nielsen Digital Ad
     *                 Ratings measurement.
     *                 <p>Corresponds to "In-target impressions" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_IMPRESSIONS("NIELSEN_IN_TARGET_IMPRESSIONS"),

    /**
     * 
     *                 The population in the demographic.
     *                 <p>Corresponds to "Population base" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_POPULATION_BASE("NIELSEN_POPULATION_BASE"),

    /**
     * 
     *                 The total population for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_POPULATION_BASE("NIELSEN_IN_TARGET_POPULATION_BASE"),

    /**
     * 
     *                 The total number of different people within the selected demographic who were reached.
     *                 <p>Corresponds to "Unique audience" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_UNIQUE_AUDIENCE("NIELSEN_UNIQUE_AUDIENCE"),

    /**
     * 
     *                 The total number of different people within all in-target demographics who were reached.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_UNIQUE_AUDIENCE("NIELSEN_IN_TARGET_UNIQUE_AUDIENCE"),

    /**
     * 
     *                 The unique audience reached as a percentage of the population base.
     *                 <p>Corresponds to "% audience reach" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_AUDIENCE_REACH("NIELSEN_PERCENT_AUDIENCE_REACH"),

    /**
     * 
     *                 The unique audience reached as a percentage of the population base for all in-target
     *                 demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH("NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH"),

    /**
     * 
     *                 The average number of times that a person within the target audience sees an advertisement.
     *                 <p>Corresponds to "Average frequency" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_AVERAGE_FREQUENCY("NIELSEN_AVERAGE_FREQUENCY"),

    /**
     * 
     *                 The average number of times that a person within the target audience sees an advertisement
     *                 for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_AVERAGE_FREQUENCY("NIELSEN_IN_TARGET_AVERAGE_FREQUENCY"),

    /**
     * 
     *                 The unit of audience volume, which is based on the percentage of the reached target audience
     *                 population multiplied by the average frequency.
     *                 <p>Corresponds to "Gross rating points" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_GROSS_RATING_POINTS("NIELSEN_GROSS_RATING_POINTS"),

    /**
     * 
     *                 The unit of audience volume, which is based on the percentage of the reached target audience
     *                 population multiplied by the average frequency, for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_GROSS_RATING_POINTS("NIELSEN_IN_TARGET_GROSS_RATING_POINTS"),

    /**
     * 
     *                 The share of impressions that reached the target demographic.
     *                 <p>Corresponds to "% impression share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_IMPRESSIONS_SHARE("NIELSEN_PERCENT_IMPRESSIONS_SHARE"),

    /**
     * 
     *                 The share of impressions that reached all in-target demographics.
     *                 <p>Corresponds to "In-target % impression share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE("NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE"),

    /**
     * 
     *                 The share of the total population represented by the population base.
     *                 <p>Corresponds to "% population share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_POPULATION_SHARE("NIELSEN_PERCENT_POPULATION_SHARE"),

    /**
     * 
     *                 The share of the total population for all in-target demographics represented by the
     *                 population base.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE("NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE"),

    /**
     * 
     *                 The share of the unique audience in the demographic.
     *                 <p>Corresponds to "% audience share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_AUDIENCE_SHARE("NIELSEN_PERCENT_AUDIENCE_SHARE"),

    /**
     * 
     *                 The share of the unique audience for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE("NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE"),

    /**
     * 
     *                 The relative unique audience in the demographic compared with its share of the overall
     *                 population.
     *                 <p>Corresponds to "Audience index" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_AUDIENCE_INDEX("NIELSEN_AUDIENCE_INDEX"),

    /**
     * 
     *                 The relative unique audience for all in-target demographics compared with its share of the
     *                 overall population.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_AUDIENCE_INDEX("NIELSEN_IN_TARGET_AUDIENCE_INDEX"),

    /**
     * 
     *                 The relative impressions per person in the demographic compared with the impressions per person
     *                 for the overall population.
     *                 <p>Corresponds to "Impressions index" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IMPRESSIONS_INDEX("NIELSEN_IMPRESSIONS_INDEX"),

    /**
     * 
     *                 The relative impressions per person for all in-target demographics compared with the
     *                 impressions per person for the overall population.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_IMPRESSIONS_INDEX("NIELSEN_IN_TARGET_IMPRESSIONS_INDEX"),

    /**
     * 
     *                 The adjusted in-target impression share used for pacing and billing, based on the GRP pacing
     *                 preferences indicated in your line item settings.
     *                 <p>Corresponds to "Processed Nielsen in-target rate" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_RATIO("NIELSEN_IN_TARGET_RATIO"),

    /**
     * 
     *                 Number of impressions delivered.
     *                 <p>Corresponds to "Impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_IMPRESSIONS("DP_IMPRESSIONS"),

    /**
     * 
     *                 Number of clicks delivered
     *                 <p>Corresponds to "Clicks" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_CLICKS("DP_CLICKS"),

    /**
     * 
     *                 Number of requests.
     *                 <p>Corresponds to "Queries" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_QUERIES("DP_QUERIES"),

    /**
     * 
     *                 Number of requests where a buyer was matched with the Ad request.
     *                 <p>Corresponds to "Matched queries" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_MATCHED_QUERIES("DP_MATCHED_QUERIES"),

    /**
     * 
     *                 The revenue earned, calculated in publisher currency, for the ads delivered.
     *                 <p>Corresponds to "Cost" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_COST("DP_COST"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from ads delivered.
     *                 <p>Corresponds to "Total Average eCPM" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ECPM("DP_ECPM"),

    /**
     * 
     *                 Total number of impressions delivered by the ad server that were eligible to measure
     *                 viewability.
     *                 <p>Corresponds to "Total Active View eligible impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("DP_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered that were sampled and measurable by active view.
     *                 <p>Corresponds to "Total Active View measurable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered that were viewed on the user's screen.
     *                 <p>Corresponds to "Total Active View viewable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered that were measurable by active view (out of all the
     *                 impressions sampled for active view).
     *                 <p>Corresponds to "Total Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 The percentage of impressions delivered thar were viewed on the user's screen (out of the
     *                 impressions measurable by active view).
     *                 <p>Corresponds to "Total Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 The host impressions in the partner management.
     *                 <p>Corresponds to "Host impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_IMPRESSIONS("PARTNER_MANAGEMENT_HOST_IMPRESSIONS"),

    /**
     * 
     *                 The host clicks in the partner management.
     *                 <p>Corresponds to "Host clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_CLICKS("PARTNER_MANAGEMENT_HOST_CLICKS"),

    /**
     * 
     *                 The host CTR in the partner management.
     *                 <p>Corresponds to "Host CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_CTR("PARTNER_MANAGEMENT_HOST_CTR"),

    /**
     * 
     *                 The unfilled impressions in the partner management.
     *                 <p>Corresponds to "Unfilled impressions" in the Ad Manager UI. Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS("PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS"),

    /**
     * 
     *                 The partner impressions in the partner management.
     *                 <p>Corresponds to "Partner impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_IMPRESSIONS("PARTNER_MANAGEMENT_PARTNER_IMPRESSIONS"),

    /**
     * 
     *                 The partner clicks in the partner management.
     *                 <p>Corresponds to "Partner clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_CLICKS("PARTNER_MANAGEMENT_PARTNER_CLICKS"),

    /**
     * 
     *                 The partner CTR in the partner management.
     *                 <p>Corresponds to "Partner CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_CTR("PARTNER_MANAGEMENT_PARTNER_CTR"),

    /**
     * 
     *                 The gross revenue in the partner management.
     *                 <p>Corresponds to "Gross revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_GROSS_REVENUE("PARTNER_MANAGEMENT_GROSS_REVENUE"),

    /**
     * 
     *                 Monthly host impressions for partner finance reports.
     *                 <p>Corresponds to "Host impressions" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_HOST_IMPRESSIONS("PARTNER_FINANCE_HOST_IMPRESSIONS"),

    /**
     * 
     *                 Monthly host revenue for partner finance reports.
     *                 <p>Corresponds to "Host revenue" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_HOST_REVENUE("PARTNER_FINANCE_HOST_REVENUE"),

    /**
     * 
     *                 Monthly host eCPM for partner finance reports.
     *                 <p>Corresponds to "Host eCPM" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_HOST_ECPM("PARTNER_FINANCE_HOST_ECPM"),

    /**
     * 
     *                 Monthly partner revenue for partner finance reports.
     *                 <p>Corresponds to "Partner revenue" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_PARTNER_REVENUE("PARTNER_FINANCE_PARTNER_REVENUE"),

    /**
     * 
     *                 Monthly partner eCPM for partner finance reports.
     *                 <p>Corresponds to "Partner eCPM" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_PARTNER_ECPM("PARTNER_FINANCE_PARTNER_ECPM"),

    /**
     * 
     *                 Monthly gross revenue for partner finance reports.
     *                 <p>Corresponds to "Gross revenue" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_GROSS_REVENUE("PARTNER_FINANCE_GROSS_REVENUE"),

    /**
     * 
     *                 The ratio of the number of impressions for which the creative load time is between 0 and 500 ms
     *                 to the total number of impressions that have ad latency data, represented as a percentage.
     *                 <p>Corresponds to "Creative load time 0 - 500ms (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CREATIVE_LOAD_TIME_0_500_MS_PERCENT("CREATIVE_LOAD_TIME_0_500_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the creative load time is between 500
     *                 milliseconds and 1 second to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Creative load time 500ms - 1s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CREATIVE_LOAD_TIME_500_1000_MS_PERCENT("CREATIVE_LOAD_TIME_500_1000_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the creative load time is between 1 second and
     *                 2 seconds to the total number of impressions that have ad latency data, represented as a
     *                 percentage.
     *                 <p>Corresponds to "Creative load time 1s - 2s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CREATIVE_LOAD_TIME_1_2_S_PERCENT("CREATIVE_LOAD_TIME_1_2_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the creative load time is between 2 seconds
     *                 and 4 seconds to the total number of impressions that have ad latency data, represented as a
     *                 percentage.
     *                 <p>Corresponds to "Creative load time 2s - 4s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CREATIVE_LOAD_TIME_2_4_S_PERCENT("CREATIVE_LOAD_TIME_2_4_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the creative load time is between 4 seconds
     *                 and 8 seconds to the total number of impressions that have ad latency data, represented as a
     *                 percentage.
     *                 <p>Corresponds to "Creative load time 4s - 8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CREATIVE_LOAD_TIME_4_8_S_PERCENT("CREATIVE_LOAD_TIME_4_8_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the creative load time is greater than 8
     *                 seconds to the total number of impressions that have ad latency data, represented as a
     *                 percentage.
     *                 <p>Corresponds to "Creative load time >8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    CREATIVE_LOAD_TIME_GREATER_THAN_8_S_PERCENT("CREATIVE_LOAD_TIME_GREATER_THAN_8_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions which are unviewed because the ad slot never
     *                 entered the viewport to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Slot never entered viewport (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    UNVIEWED_REASON_SLOT_NEVER_ENTERED_VIEWPORT_PERCENT("UNVIEWED_REASON_SLOT_NEVER_ENTERED_VIEWPORT_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions which are unviewed because the user scrolled before
     *                 the ad filled to the total number of impressions that have ad latency data, represented as a
     *                 percentage.
     *                 <p>Corresponds to "User scrolled before ad filled (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    UNVIEWED_REASON_USER_SCROLLED_BEFORE_AD_FILLED_PERCENT("UNVIEWED_REASON_USER_SCROLLED_BEFORE_AD_FILLED_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions which are unviewed because the user scrolled or
     *                 navigated before the ad loaded to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "User scrolled/navigated before ad loaded (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    UNVIEWED_REASON_USER_SCROLLED_BEFORE_AD_LOADED_PERCENT("UNVIEWED_REASON_USER_SCROLLED_BEFORE_AD_LOADED_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions which are unviewed because the user scrolled or
     *                 navigated before one second to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "User scrolled/navigated before 1 second (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    UNVIEWED_REASON_USER_SCROLLED_BEFORE_1_S_PERCENT("UNVIEWED_REASON_USER_SCROLLED_BEFORE_1_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions which are unviewed because the of another
     *                 non-viewable-impression reason to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Other non-viewable impression reasons (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    UNVIEWED_REASON_OTHER_PERCENT("UNVIEWED_REASON_OTHER_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to tag log time is between 0 and
     *                 500 milliseconds to the total number of impressions that have ad latency data, represented as a
     *                 percentage.
     *                 <p>Corresponds to "Page navigation to tag loaded time 0 - 500ms (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_TAG_LOADED_TIME_0_500_MS_PERCENT("PAGE_NAVIGATION_TO_TAG_LOADED_TIME_0_500_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to tag log time is between 500
     *                 milliseconds and 1 second to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Page navigation to tag loaded time 500ms - 1s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_TAG_LOADED_TIME_500_1000_MS_PERCENT("PAGE_NAVIGATION_TO_TAG_LOADED_TIME_500_1000_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to tag log time is between 1
     *                 second and 2 seconds to the total number of impressions that have ad latency data, represented
     *                 as a percentage.
     *                 <p>Corresponds to "Page navigation to tag loaded time 1s - 2s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_TAG_LOADED_TIME_1_2_S_PERCENT("PAGE_NAVIGATION_TO_TAG_LOADED_TIME_1_2_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to tag log time is between 2
     *                 seconds and 4 seconds to the total number of impressions that have ad latency data, represented
     *                 as a percentage.
     *                 <p>Corresponds to "Page navigation to tag loaded time 2s - 4s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_TAG_LOADED_TIME_2_4_S_PERCENT("PAGE_NAVIGATION_TO_TAG_LOADED_TIME_2_4_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to tag log time is between 4
     *                 seconds and 8 seconds to the total number of impressions that have ad latency data, represented
     *                 as a percentage.
     *                 <p>Corresponds to "Page navigation to tag loaded time 4s - 8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_TAG_LOADED_TIME_4_8_S_PERCENT("PAGE_NAVIGATION_TO_TAG_LOADED_TIME_4_8_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to tag log time is greater than 8
     *                 seconds to the total number of impressions that have ad latency data, represented as a
     *                 percentage.
     *                 <p>Corresponds to "Page navigation to tag loaded time >8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_TAG_LOADED_TIME_GREATER_THAN_8_S_PERCENT("PAGE_NAVIGATION_TO_TAG_LOADED_TIME_GREATER_THAN_8_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to first ad request time is
     *                 between 0 and 500 milliseconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Page navigation to first ad request time 0 - 500ms (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_0_500_MS_PERCENT("PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_0_500_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to first ad request time is
     *                 between 500 milliseconds and 1 second to the total number of impressions that have ad latency
     *                 data, represented as a percentage.
     *                 <p>Corresponds to "Page navigation to first ad request time 500ms - 1s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_500_1000_MS_PERCENT("PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_500_1000_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to first ad request time is
     *                 between 1 second and 2 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Page navigation to first ad request time 1s - 2s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_1_2_S_PERCENT("PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_1_2_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to first ad request time is
     *                 between 2 seconds and 4 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Page navigation to first ad request time 2s - 4s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_2_4_S_PERCENT("PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_2_4_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to first ad request time is
     *                 between 4 seconds and 8 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Page navigation to first ad request time 4s - 8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_4_8_S_PERCENT("PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_4_8_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the DOM load to first ad request time is
     *                 greater than 8 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Page navigation to first ad request time >8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_GREATER_THAN_8_S_PERCENT("PAGE_NAVIGATION_TO_FIRST_AD_REQUEST_TIME_GREATER_THAN_8_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the tag load to first ad request time is
     *                 between 0 and 500 milliseconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Tag loaded to first ad request time 0 - 500ms (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_0_500_MS_PERCENT("TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_0_500_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the tag load to first ad request time is
     *                 between 500 milliseconds and 1 second to the total number of impressions that have ad latency
     *                 data, represented as a percentage.
     *                 <p>Corresponds to "Tag loaded to first ad request time 500ms - 1s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_500_1000_MS_PERCENT("TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_500_1000_MS_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the tag load to first ad request time is
     *                 between 1 second and 2 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Tag loaded to first ad request time 1s - 2s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_1_2_S_PERCENT("TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_1_2_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the tag load to first ad request time is
     *                 between 2 seconds and 4 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Tag loaded to first ad request time 2s - 4s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_2_4_S_PERCENT("TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_2_4_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the tag load to first ad request time is
     *                 between 4 seconds and 8 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Tag loaded to first ad request time 4s - 8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_4_8_S_PERCENT("TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_4_8_S_PERCENT"),

    /**
     * 
     *                 The ratio of the number of impressions for which the tag load to first ad request time is
     *                 greater than 8 seconds to the total number of impressions that have ad latency data,
     *                 represented as a percentage.
     *                 <p>Corresponds to "Tag loaded to first ad request time >8s (%)" in the Ad Manager UI. Compatible with the "Ad speed" report type.</p>
     *               
     * 
     */
    TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_GREATER_THAN_8_S_PERCENT("TAG_LOAD_TO_FIRST_AD_REQUEST_TIME_GREATER_THAN_8_S_PERCENT");
    private final String value;

    Column(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Column fromValue(String v) {
        for (Column c: Column.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
