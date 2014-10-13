
package com.google.api.ads.dfp.jaxws.v201405;

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
 *     &lt;enumeration value="AD_SERVER_DELIVERY_INDICATOR"/>
 *     &lt;enumeration value="AD_SERVER_CODE_SERVED_COUNT"/>
 *     &lt;enumeration value="AD_SERVER_IMPRESSIONS_OUT_OF_NETWORK"/>
 *     &lt;enumeration value="AD_SERVER_CLICKS_OUT_OF_NETWORK"/>
 *     &lt;enumeration value="AD_SERVER_CTR_OUT_OF_NETWORK"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_DYNAMIC_ALLOCATION_IMPRESSIONS_OUT_OF_NETWORK"/>
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
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS_INCLUDING_OUT_OF_NETWORK_DELIVERY"/>
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
 *     &lt;enumeration value="TOTAL_UNFILLED_IMPRESSIONS_INCLUDING_OUT_OF_NETWORK_DELIVERY"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_DELIVERY_INDICATOR"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_IMPRESSIONS"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_CLICKS"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_CTR"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_CPM_AND_CPC_REVENUE"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_ALL_REVENUE"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="MERGED_AD_SERVER_WITH_CPD_AVERAGE_ECPM"/>
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
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_2_ERROR_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_100_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_101_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_102_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_200_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_201_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_202_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_203_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_300_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_301_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_302_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_303_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_400_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_401_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_402_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_403_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_405_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_500_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_501_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_502_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_503_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_600_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_601_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_602_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_603_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_604_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_900_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_3_ERROR_901_COUNT"/>
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
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_IMPRESSIONS"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_CLICKS"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_CTR"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_GROSS_REVENUE"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_HOST_REVENUE"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_HOST_ECPM"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_PARTNER_REVENUE"/>
 *     &lt;enumeration value="DISTRIBUTION_PARTNER_PARTNER_ECPM"/>
 *     &lt;enumeration value="CONTENT_PARTNER_IMPRESSIONS"/>
 *     &lt;enumeration value="CONTENT_PARTNER_CLICKS"/>
 *     &lt;enumeration value="CONTENT_PARTNER_CTR"/>
 *     &lt;enumeration value="CONTENT_PARTNER_GROSS_REVENUE"/>
 *     &lt;enumeration value="CONTENT_PARTNER_HOST_REVENUE"/>
 *     &lt;enumeration value="CONTENT_PARTNER_HOST_ECPM"/>
 *     &lt;enumeration value="CONTENT_PARTNER_PARTNER_REVENUE"/>
 *     &lt;enumeration value="CONTENT_PARTNER_PARTNER_ECPM"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_IMPRESSIONS"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_CLICKS"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_CTR"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_GROSS_REVENUE"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_HOST_REVENUE"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_HOST_ECPM"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_PARTNER_REVENUE"/>
 *     &lt;enumeration value="RIGHTS_HOLDER_PARTNER_ECPM"/>
 *     &lt;enumeration value="VIEW_THROUGH_CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSIONS_PER_THOUSAND_IMPRESSIONS"/>
 *     &lt;enumeration value="CLICK_THROUGH_CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSIONS_PER_CLICK"/>
 *     &lt;enumeration value="VIEW_THROUGH_REVENUE"/>
 *     &lt;enumeration value="CLICK_THROUGH_REVENUE"/>
 *     &lt;enumeration value="TOTAL_CONVERSIONS"/>
 *     &lt;enumeration value="TOTAL_CONVERSION_REVENUE"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_LOCAL_CONTRACTED_NET_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_LOCAL_CONTRACTED_GROSS_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_PLACEMENT_NET_REVENUE"/>
 *     &lt;enumeration value="CONTRACTED_REVENUE_CONTRACTED_PLACEMENT_GROSS_REVENUE"/>
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
 *     &lt;enumeration value="RECONCILIATION_LAST_DATE_TIME"/>
 *     &lt;enumeration value="RECONCILIATION_RECONCILIATION_STATUS"/>
 *     &lt;enumeration value="RECONCILIATION_DFP_VOLUME"/>
 *     &lt;enumeration value="RECONCILIATION_THIRD_PARTY_VOLUME"/>
 *     &lt;enumeration value="RECONCILIATION_RECONCILED_VOLUME"/>
 *     &lt;enumeration value="RECONCILIATION_DISCREPANCY"/>
 *     &lt;enumeration value="RECONCILIATION_RECONCILED_REVENUE"/>
 *     &lt;enumeration value="BILLING_BILLABLE_NET_REVENUE"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_NET_REVENUE"/>
 *     &lt;enumeration value="BILLING_BILLABLE_GROSS_REVENUE"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_GROSS_REVENUE"/>
 *     &lt;enumeration value="BILLING_BILLABLE_VAT"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_VAT"/>
 *     &lt;enumeration value="BILLING_BILLABLE_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="BILLING_LOCAL_BILLABLE_AGENCY_COMMISSION"/>
 *     &lt;enumeration value="BILLING_CAP_QUANTITY"/>
 *     &lt;enumeration value="BILLING_BILLABLE_VOLUME"/>
 *     &lt;enumeration value="BILLING_DELIVERY_ROLLOVER_FROM_PREVIOUS"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_ADDITIONAL_ADJUSTMENT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_OVERALL_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_BILLABLE_NET_OVERALL_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_BILLABLE_NET_EXCLUDED_PREMIUMS"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_BILLABLE_NET_ADVERTISER_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_BILLABLE_NET_PRODUCT_ADJUSTMENT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_BILLABLE_NET_PROPOSAL_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_EXCLUDED_PREMIUMS"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_ADVERTISER_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_PRODUCT_ADJUSTMENT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_PROPOSAL_DISCOUNT"/>
 *     &lt;enumeration value="DISCOUNTS_BREAKDOWN_CONTRACTED_NET_NON_BILLABLE"/>
 *     &lt;enumeration value="SALESPERSON_PERFORMANCE_SHARED_PIPELINE_NET_REVENUE"/>
 *     &lt;enumeration value="SALESPERSON_PERFORMANCE_SHARED_PIPELINE_GROSS_REVENUE"/>
 *     &lt;enumeration value="SALESPERSON_PERFORMANCE_SHARED_UNIFIED_NET_REVENUE"/>
 *     &lt;enumeration value="SALESPERSON_PERFORMANCE_SHARED_UNIFIED_GROSS_REVENUE"/>
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
     *                 Indicates the progress made for the delivery of the {@link LineItem}.
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
    AD_SERVER_DELIVERY_INDICATOR,

    /**
     * 
     *                 The number of times that the code for an ad is served by the ad server.
     *               
     * 
     */
    AD_SERVER_CODE_SERVED_COUNT,

    /**
     * 
     *                 The number of impressions delivered by the ad server on shared inventory unit
     *                 in a partner's network.
     *               
     * 
     */
    AD_SERVER_IMPRESSIONS_OUT_OF_NETWORK,

    /**
     * 
     *                 The number of clicks delivered by the ad server on shared inventory unit
     *                 in a partner's network.
     *               
     * 
     */
    AD_SERVER_CLICKS_OUT_OF_NETWORK,

    /**
     * 
     *                 The CTR for an ad delivered by the ad server on shared inventory unit
     *                 in a partner's network.
     *               
     * 
     */
    AD_SERVER_CTR_OUT_OF_NETWORK,

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
     *                 The number of partner network impressions a dynamic allocation ad delivered when
     *                 no {@link LineItem} reservation could be found by the ad server for shared
     *                 inventory-level dynamic allocation.
     *                 For premium networks, this includes line item-level dynamic allocation as well.
     *               
     * 
     */
    TOTAL_DYNAMIC_ALLOCATION_IMPRESSIONS_OUT_OF_NETWORK,

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
     *                 The total number of impressions delivered by the ad server on a shared inventory unit in a
     *                 partner's network and through line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS_INCLUDING_OUT_OF_NETWORK_DELIVERY,

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
     *                 The total number of times that the code for an ad is served by the ad server
     *                 including inventory-level dynamic allocation.
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
     *                 The total number of missed impressions due to the ad servers' inability to
     *                 find ads to serve, including inventory-level dynamic allocation on
     *                 shared inventory units.
     *               
     * 
     */
    TOTAL_UNFILLED_IMPRESSIONS_INCLUDING_OUT_OF_NETWORK_DELIVERY,

    /**
     * 
     *                 Indicates the progress made for the delivery of the {@link LineItem} based
     *                 on the units delivered by both DART and DoubleClick For Publishers ad
     *                 servers. This is only available for networks that have been upgraded from
     *                 the old to the new system.
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
    MERGED_AD_SERVER_DELIVERY_INDICATOR,

    /**
     * 
     *                 The total number of impressions delivered by both DART and DoubleClick For
     *                 Publishers ad servers. This is only available for networks that have been
     *                 upgraded from the old to the new system.
     *                 <p>
     *                 DART data is available for the following timeframes:
     *                 <ul><li>6 months before upgrade date for daily reports.</li>
     *                 <li>16 months before upgrade date for monthly reports.</li>
     *               
     * 
     */
    MERGED_AD_SERVER_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered by both DART and DoubleClick For
     *                 Publishers ad servers. This is only available for networks that
     *                 have been upgraded from the old to the new system.
     *                 <p>
     *                 DART data is available for the following timeframes:
     *                 <ul><li>6 months before upgrade date for daily reports.</li>
     *                 <li>16 months before upgrade date for monthly reports.</li>
     *               
     * 
     */
    MERGED_AD_SERVER_CLICKS,

    /**
     * 
     *                 The sum of the CTR achieved from both DART and DoubleClick For Publishers
     *                 ad servers. This is only available for networks that have been upgraded
     *                 from the old to the new system.
     *                 <p>
     *                 DART data is available for the following timeframes:
     *                 <ul><li>6 months before upgrade date for daily reports.</li>
     *                 <li>16 months before upgrade date for monthly reports.</li>
     *               
     * 
     */
    MERGED_AD_SERVER_CTR,

    /**
     * 
     *                 The sum of the CPM and CPC revenue generated from both DART and DoubleClick For
     *                 Publishers ad servers. This is only available for networks that have been
     *                 upgraded from the old to the new system.
     *                 <p>
     *                 DART data is available for the following timeframes:
     *                 <ul><li>6 months before upgrade date for daily reports.</li>
     *                 <li>16 months before upgrade date for monthly reports.</li>
     *               
     * 
     */
    MERGED_AD_SERVER_CPM_AND_CPC_REVENUE,

    /**
     * 
     *                 The sum of the CPM, CPC and CPD revenue generated from both DART and DoubleClick For
     *                 Publishers ad servers. This is only available for networks that have been
     *                 upgraded from the old to the new system.
     *                 <p>
     *                 DART data is available for the following timeframes:
     *                 <ul><li>6 months before upgrade date for daily reports.</li>
     *                 <li>16 months before upgrade date for monthly reports.</li>
     *               
     * 
     */
    MERGED_AD_SERVER_ALL_REVENUE,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the CPM and CPC ads
     *                 delivered by both DART and DoubleClick For Publishers ad servers.
     *                 This is only available for networks that have been
     *                 upgraded from the old to the new system.
     *                 <p>
     *                 DART data is available for the following timeframes:
     *                 <ul><li>6 months before upgrade date for daily reports.</li>
     *                 <li>16 months before upgrade date for monthly reports.</li>
     *               
     * 
     */
    MERGED_AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM,

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the CPM, CPC and CPD ads
     *                 delivered by both DART and DoubleClick For Publishers ad servers.
     *                 This is only available for networks that have been
     *                 upgraded from the old to the new system.
     *                 <p>
     *                 DART data is available for the following timeframes:
     *                 <ul><li>6 months before upgrade date for daily reports.</li>
     *                 <li>16 months before upgrade date for monthly reports.</li>
     *               
     * 
     */
    MERGED_AD_SERVER_WITH_CPD_AVERAGE_ECPM,

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
     *                 The audience average frequency calculated as {@link #GRP_AUDIENCE_IMPRESSIONS} /
     *                 {@link #GRP_UNIQUE_AUDIENCE}.
     *               
     * 
     */
    GRP_AUDIENCE_AVERAGE_FREQUENCY,

    /**
     * 
     *                 The gross rating points (GRP) calculated as {@link #GRP_AUDIENCE_REACH} *
     *                 {@link #GRP_AUDIENCE_AVERAGE_FREQUENCY}.
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
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
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
     *                 Error rate is the percentage of video error count from (error count + total impressions).
     *               
     * 
     */
    VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE,

    /**
     * 
     *                 Number of VAST2 video errors.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_2_ERROR_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 100.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_100_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 101.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_101_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 102.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_102_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 200.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_200_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 201.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_201_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 202.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_202_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 203.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_203_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 300.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_300_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 301.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_301_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 302.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_302_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 303.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_303_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 400.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_400_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 401.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_401_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 402.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_402_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 403.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_403_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 405.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_405_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 500.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_500_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 501.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_501_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 502.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_502_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 503.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_503_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 600.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_600_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 601.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_601_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 602.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_602_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 603.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_603_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 604.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_604_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 900.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_900_COUNT,

    /**
     * 
     *                 Number of VAST3 video errors of type 901.
     *               
     * 
     */
    VIDEO_ERRORS_VAST_3_ERROR_901_COUNT,

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
     *                 view-through rate. This is calculated as ((
     *                 {@link Column#VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE}/
     *                 {@link Column#VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE}) - 1) * 100 for an ad for which the
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
     *                 The total number of impressions not viewed on the user's screen.
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The total number of impressions that were sampled, but unmeasurable by active view.
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS,

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
     *                 The number of impressions delivered by the ad server viewed on the user's screen.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by the ad server not viewed on the user's screen.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by the ad server that were sampled, but unmeasurable by
     *                 active view.
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS,

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
     *                 The number of impressions delivered by AdSense viewed on the user's screen,
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by AdSense not viewed on the user's screen.
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by AdSense that were sampled, but unmeasurable by
     *                 active view.
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by AdSense viewed on the user's screen (out of
     *                 AdSense impressions measurable by active view).
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Total number of impressions delivered by AdSense that were eligible to measure
     *                 viewability.
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by AdSense that were measurable by active view (
     *                 out of all AdSense impressions sampled for active view).
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange viewed on the user's screen,
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange not viewed on the user's screen.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_NOT_VIEWABLE_IMPRESSIONS,

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange that were sampled, but unmeasurable by
     *                 active view.
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_NOT_MEASURABLE_IMPRESSIONS,

    /**
     * 
     *                 The percentage of impressions delivered by Ad Exchange viewed on the user's screen (out of
     *                 Ad Exchange impressions measurable by active view).
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE,

    /**
     * 
     *                 Total number of impressions delivered by Ad Exchange that were eligible to measure
     *                 viewability.
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
     *                 The total number of impressions delivered by the network to the distribution partner.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered by the network to the distribution partner.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_CLICKS,

    /**
     * 
     *                 The ratio of clicks to the total number of impressions delivered by the
     *                 network to the distribution partner.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_CTR,

    /**
     * 
     *                 The total revenue generated by the network to the distribution partner.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_GROSS_REVENUE,

    /**
     * 
     *                 The host revenue generated by the network host through the distribution partner
     *                 inventory units.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_HOST_REVENUE,

    /**
     * 
     *                 Cost-per-thousand-impressions (eCPM) generated by the network host through the
     *                 distribution partner inventory units.
     *                 It could be estimated or reconiled eCPM according to current stage.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_HOST_ECPM,

    /**
     * 
     *                 The revenue generated by the network distribution partner.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_PARTNER_REVENUE,

    /**
     * 
     *                 Cost-per-thousand-impressions (eCPM) generated by the distribution partner.
     *                 It could be estimated or reconiled eCPM according to current stage.
     *               
     * 
     */
    DISTRIBUTION_PARTNER_PARTNER_ECPM,

    /**
     * 
     *                 The total number of impressions delivered by the network to the content partner.
     *               
     * 
     */
    CONTENT_PARTNER_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered by the network to the content partner.
     *               
     * 
     */
    CONTENT_PARTNER_CLICKS,

    /**
     * 
     *                 The ratio of clicks to the total number of impressions delivered by the
     *                 network to the content partner.
     *               
     * 
     */
    CONTENT_PARTNER_CTR,

    /**
     * 
     *                 The total revenue generated by the network to the content partner.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    CONTENT_PARTNER_GROSS_REVENUE,

    /**
     * 
     *                 The host revenue generated by the network host through the content partner's
     *                 contents.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    CONTENT_PARTNER_HOST_REVENUE,

    /**
     * 
     *                 Cost-per-thousand-impressions (eCPM) generated by the network host to the
     *                 content partner's contents.
     *                 It could be estimated or reconiled eCPM according to current stage.
     *               
     * 
     */
    CONTENT_PARTNER_HOST_ECPM,

    /**
     * 
     *                 The revenue generated by the network content partner.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    CONTENT_PARTNER_PARTNER_REVENUE,

    /**
     * 
     *                 Cost-per-thousand-impressions (eCPM) generated by the content partner.
     *                 It could be estimated or reconiled eCPM according to current stage.
     *               
     * 
     */
    CONTENT_PARTNER_PARTNER_ECPM,

    /**
     * 
     *                 The total number of impressions delivered by the network to the rights holder.
     *               
     * 
     */
    RIGHTS_HOLDER_IMPRESSIONS,

    /**
     * 
     *                 The total number of clicks delivered by the network to the rights holder.
     *               
     * 
     */
    RIGHTS_HOLDER_CLICKS,

    /**
     * 
     *                 The ratio of clicks to the total number of impressions delivered by the
     *                 network to the rights holder.
     *               
     * 
     */
    RIGHTS_HOLDER_CTR,

    /**
     * 
     *                 The total revenue generated by the network to the rights holder.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    RIGHTS_HOLDER_GROSS_REVENUE,

    /**
     * 
     *                 The host revenue generated by the network host through the rights holder's
     *                 contents.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    RIGHTS_HOLDER_HOST_REVENUE,

    /**
     * 
     *                 Cost-per-thousand-impressions (eCPM) generated by the network host
     *                 through the rights holder's contents.
     *                 It could be estimated or reconiled eCPM according to current stage.
     *               
     * 
     */
    RIGHTS_HOLDER_HOST_ECPM,

    /**
     * 
     *                 The revenue generated by the network rights holder.
     *                 It could be estimated or reconiled revenue according to current stage.
     *               
     * 
     */
    RIGHTS_HOLDER_PARTNER_REVENUE,

    /**
     * 
     *                 Cost-per-thousand-impressions (eCPM) generated by the rights holder.
     *                 It could be estimated or reconiled eCPM according to current stage.
     *               
     * 
     */
    RIGHTS_HOLDER_PARTNER_ECPM,

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
     *                 Replaced with {@code DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL} beginning in
     *                 V201408.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING,

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
     *                 Replaced with {@code DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL} beginning in
     *                 V201408.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS,

    /**
     * 
     *                 The difference between eligible impressions and competing impressions in dynamic allocation.
     *                 Replaced with {@code DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL} beginning
     *                 in V201408.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING,

    /**
     * 
     *                 The percentage of eligible impressions that are not competing in dynamic allocation.
     *                 Replaced with {@code DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL}
     *                 beginning in V201408.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT,

    /**
     * 
     *                 The percent of eligible impressions participating in dynamic allocation.
     *                 Replaced with {@code DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL}
     *                 beginning in V201408.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE,

    /**
     * 
     *                 The percent of total dynamic allocation queries that won.
     *                 Replaced with {@code DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL} beginning in V201408.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE,

    /**
     * 
     *                 The contracted net revenue of the {@link ProposalLineItem}. When revenue is summed up to
     *                 the {@link Proposal} level, an additional adjustment is applied.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE,

    /**
     * 
     *                 The contracted net revenue in the local currency of the {@link ProposalLineItem}. When revenue
     *                 is summed up to the {@link Proposal} level, an additional adjustment is applied.
     *                 
     *                 See {@link #CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE}
     *               
     * 
     */
    CONTRACTED_REVENUE_LOCAL_CONTRACTED_NET_REVENUE,

    /**
     * 
     *                 The contracted gross revenue of the {@link ProposalLineItem}, including agency commission. When
     *                 revenue is summed up to the {@link Proposal} level, an additional adjustment is applied.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_GROSS_REVENUE,

    /**
     * 
     *                 The contracted gross revenue in the local currency of the {@link ProposalLineItem}, including
     *                 agency commission. When revenue is summed up to the {@link Proposal} level, an additional
     *                 adjustment is applied.
     *                 
     *                 See {@link #CONTRACTED_REVENUE_CONTRACTED_GROSS_REVENUE}
     *               
     * 
     */
    CONTRACTED_REVENUE_LOCAL_CONTRACTED_GROSS_REVENUE,

    /**
     * 
     *                 The contracted net revenue of the {@link ProposalLineItem}. This revenue is the raw revenue
     *                 without a {@link Proposal} level additional adjustment applied.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_PLACEMENT_NET_REVENUE,

    /**
     * 
     *                 The contracted gross revenue of the {@link ProposalLineItem}. This revenue is the raw revenue
     *                 without a {@link Proposal} level additional adjustment applied, and including agency
     *                 commission.
     *               
     * 
     */
    CONTRACTED_REVENUE_CONTRACTED_PLACEMENT_GROSS_REVENUE,

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
     *                 The unreconciled net revenue of the {@link ProposalLineItem}. It is the portion of
     *                 {@link #UNIFIED_REVENUE_UNIFIED_NET_REVENUE} comming from unreconciled DFP volume.
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
     *                 See {@link #UNIFIED_REVENUE_UNRECONCILED_NET_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_UNRECONCILED_NET_REVENUE,

    /**
     * 
     *                 The unreconciled gross revenue of the {@link ProposalLineItem}. It is the portion of
     *                 {@link #UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE} coming from unreconciled DFP volume.
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
     *                 See {@link #UNIFIED_REVENUE_UNRECONCILED_GROSS_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_UNRECONCILED_GROSS_REVENUE,

    /**
     * 
     *                 The forecasted net revenue of the {@link ProposalLineItem}. It is the portion of
     *                 {@link #UNIFIED_REVENUE_UNIFIED_NET_REVENUE} coming from forecasted DFP volume.
     *               
     * 
     */
    UNIFIED_REVENUE_FORECASTED_NET_REVENUE,

    /**
     * 
     *                 The forecasted net revenue of the {@link ProposalLineItem} in local currency. It is the portion
     *                 of {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_NET_REVENUE} coming from forecasted DFP volume.
     *                 
     *                 See {@link #UNIFIED_REVENUE_FORECASTED_NET_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_FORECASTED_NET_REVENUE,

    /**
     * 
     *                 The forecasted gross revenue of the {@link ProposalLineItem}. It is the portion of
     *                 {@link #UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE} coming from forecasted DFP volume.
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
     *                 See {@link #UNIFIED_REVENUE_FORECASTED_GROSS_REVENUE}
     *               
     * 
     */
    UNIFIED_REVENUE_LOCAL_FORECASTED_GROSS_REVENUE,

    /**
     * 
     *                 The unified net revenue of the {@link ProposalLineItem}. It is a combination of
     *                 {@link #UNIFIED_REVENUE_UNRECONCILED_NET_REVENUE}, {@link #BILLING_BILLABLE_NET_REVENUE},
     *                 and {@link #UNIFIED_REVENUE_FORECASTED_NET_REVENUE} when query date range spans historical
     *                 delivery and forecasted delivery.
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
     *                 See {@link #EXPECTED_REVENUE_EXPECTED_NET_REVENUE}
     *               
     * 
     */
    EXPECTED_REVENUE_LOCAL_EXPECTED_NET_REVENUE,

    /**
     * 
     *                 The expected gross revenue of the {@link ProposalLineItem}. It is equivalent to
     *                 {@link #UNIFIED_REVENUE_UNIFIED_GROSS_REVENUE} when the {@link ProposalLineItem} is sold and
     *                 {@link #SALES_PIPELINE_PIPELINE_GROSS_REVENUE} otherwise.
     *               
     * 
     */
    EXPECTED_REVENUE_EXPECTED_GROSS_REVENUE,

    /**
     * 
     *                 The expected gross revenue of the {@link ProposalLineItem} in local currency. It is
     *                 equivalent to {@link #UNIFIED_REVENUE_LOCAL_UNIFIED_GROSS_REVENUE} when the
     *                 {@link ProposalLineItem} is sold and {@link #SALES_PIPELINE_LOCAL_PIPELINE_GROSS_REVENUE}
     *                 otherwise.
     *                 
     *                 See {@link #EXPECTED_REVENUE_EXPECTED_GROSS_REVENUE}
     *               
     * 
     */
    EXPECTED_REVENUE_LOCAL_EXPECTED_GROSS_REVENUE,

    /**
     * 
     *                 The pipeline net revenue of the {@link ProposalLineItem}. It is calculated by multiplying
     *                 probability to close by the contracted revenue for those unsold {@link ProposalLineItem}s.
     *                 There is no revenue for those sold {@link ProposalLineItem}s.
     *               
     * 
     */
    SALES_PIPELINE_PIPELINE_NET_REVENUE,

    /**
     * 
     *                 The pipeline net revenue in the local currency of the {@link ProposalLineItem}. It is
     *                 calculated by multiplying probability to close by the contracted revenue for those unsold
     *                 {@link ProposalLineItem}s. There is no revenue for those sold {@link ProposalLineItem}s.
     *                 
     *                 See {@link #SALES_PIPELINE_PIPELINE_NET_REVENUE}
     *               
     * 
     */
    SALES_PIPELINE_LOCAL_PIPELINE_NET_REVENUE,

    /**
     * 
     *                 The pipeline gross revenue of the {@link ProposalLineItem}. It is calculated by multiplying
     *                 probability to close by the contracted revenue including agency commission for those
     *                 unsold {@link ProposalLineItem}s. There is no revenue for those sold {@link ProposalLineItem}s.
     *               
     * 
     */
    SALES_PIPELINE_PIPELINE_GROSS_REVENUE,

    /**
     * 
     *                 The pipeline gross revenue in the local currency of the {@link ProposalLineItem}. It is
     *                 calculated by multiplying probability to close by the contracted revenue including agency
     *                 commission for those unsold {@link ProposalLineItem}s. There is no revenue for those sold
     *                 {@link ProposalLineItem}s.
     *                 
     *                 See {@link #SALES_PIPELINE_PIPELINE_GROSS_REVENUE}
     *               
     * 
     */
    SALES_PIPELINE_LOCAL_PIPELINE_GROSS_REVENUE,

    /**
     * 
     *                 The pipeline agency commission of the {@link ProposalLineItem}. It is calculated by multiplying
     *                 probability to close by the contracted agency commission for those unsold
     *                 {@link ProposalLineItem}s. There is no revenue for those sold {@link ProposalLineItem}s.
     *               
     * 
     */
    SALES_PIPELINE_PIPELINE_AGENCY_COMMISSION,

    /**
     * 
     *                 The pipeline agency commission in the local currency of the {@link ProposalLineItem}. It is
     *                 calculated by multiplying probability to close by the contracted agency commission for those
     *                 unsold {@link ProposalLineItem}s. There is no revenue for those sold {@link ProposalLineItem}s.
     *                 
     *                 See {@link #SALES_PIPELINE_PIPELINE_AGENCY_COMMISSION}
     *               
     * 
     */
    SALES_PIPELINE_LOCAL_PIPELINE_AGENCY_COMMISSION,

    /**
     * 
     *                 The last reconciliation date of the {@link ProposalLineItem}.
     *               
     * 
     */
    RECONCILIATION_LAST_DATE_TIME,

    /**
     * 
     *                 The reconciliation status of the {@link ProposalLineItem}.
     *               
     * 
     */
    RECONCILIATION_RECONCILIATION_STATUS,

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
     *                 The discrepancy between DFP volume and third party volume.
     *               
     * 
     */
    RECONCILIATION_DISCREPANCY,

    /**
     * 
     *                 The reconciled revenue of the {@link LineItem}.
     *               
     * 
     */
    RECONCILIATION_RECONCILED_REVENUE,

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
     *                 The value added tax on billable net revenue of the {@link ProposalLineItem} or
     *                 {@link Proposal}.
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
    BILLING_DELIVERY_ROLLOVER_FROM_PREVIOUS,

    /**
     * 
     *                 The additional adjustment of the {@link Proposal}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_ADDITIONAL_ADJUSTMENT,

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
     *                 The billable net excluded premiums of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_BILLABLE_NET_EXCLUDED_PREMIUMS,

    /**
     * 
     *                 The billable net advertiser discount of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_BILLABLE_NET_ADVERTISER_DISCOUNT,

    /**
     * 
     *                 The billable net product adjustment of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_BILLABLE_NET_PRODUCT_ADJUSTMENT,

    /**
     * 
     *                 The billable net proposal discount of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_BILLABLE_NET_PROPOSAL_DISCOUNT,

    /**
     * 
     *                 The contracted net excluded premiums of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_CONTRACTED_NET_EXCLUDED_PREMIUMS,

    /**
     * 
     *                 The contracted net advertiser discount of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_CONTRACTED_NET_ADVERTISER_DISCOUNT,

    /**
     * 
     *                 The contracted net product adjustment of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_CONTRACTED_NET_PRODUCT_ADJUSTMENT,

    /**
     * 
     *                 The contracted net proposal discount of the {@link ProposalLineItem}.
     *               
     * 
     */
    DISCOUNTS_BREAKDOWN_CONTRACTED_NET_PROPOSAL_DISCOUNT,

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
     *                 The shared pipeline net revenue of the {@link ProposalLineItem}. It is calculated by
     *                 multiplying salesperson credit by the pipeline net revenue.
     *               
     * 
     */
    SALESPERSON_PERFORMANCE_SHARED_PIPELINE_NET_REVENUE,

    /**
     * 
     *                 The shared pipeline gross revenue of the {@link ProposalLineItem}. It is calculated by
     *                 multiplying salesperson credit by the pipeline gross revenue.
     *               
     * 
     */
    SALESPERSON_PERFORMANCE_SHARED_PIPELINE_GROSS_REVENUE,

    /**
     * 
     *                 The shared unified net revenue of the {@link ProposalLineItem}. It is calculated by multiplying
     *                 salesperson credit by the unified net revenue.
     *               
     * 
     */
    SALESPERSON_PERFORMANCE_SHARED_UNIFIED_NET_REVENUE,

    /**
     * 
     *                 The shared unified gross revenue of the {@link ProposalLineItem}. It is calculated by
     *                 multiplying salesperson credit by the unified gross revenue.
     *               
     * 
     */
    SALESPERSON_PERFORMANCE_SHARED_UNIFIED_GROSS_REVENUE;

    public String value() {
        return name();
    }

    public static Column fromValue(String v) {
        return valueOf(v);
    }

}
