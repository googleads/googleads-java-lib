
package com.google.api.ads.dfp.jaxws.v201306;

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
 *     &lt;enumeration value="AD_SERVER_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_CTR"/>
 *     &lt;enumeration value="AD_SERVER_CPM_AND_CPC_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_CPD_REVENUE"/>
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
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_CLICKS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_CLICKS"/>
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
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_CLICKS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CLICKS"/>
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
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS"/>
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
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_CONVERSION_TIME_VALUE"/>
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_CONVERSION_COUNT_VALUE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_START"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_FIRST_QUARTILE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_MIDPOINT"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_THIRD_QUARTILE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_COMPLETE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_VIEW_RATE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_AVERAGE_VIEW_RATE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_COMPLETION_RATE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_ERROR_COUNT"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_VIDEO_LENGTH"/>
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
 *     &lt;enumeration value="VIDEO_INTERACTION_VIDEO_SKIP_SHOWN"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_ENGAGED_VIEW"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_VIEW_THROUGH_RATE"/>
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
 *     &lt;enumeration value="SALES_DFP_REVENUE"/>
 *     &lt;enumeration value="SALES_FORECASTED_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_CONTRACTED_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_CONTRACTED_PLACEMENT_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_CONTRACTED_IMPRESSIONS"/>
 *     &lt;enumeration value="SALES_CONTRACTED_CLICKS"/>
 *     &lt;enumeration value="SALES_CONTRACTED_VOLUME"/>
 *     &lt;enumeration value="SALES_BUDGET"/>
 *     &lt;enumeration value="SALES_REMAINING_BUDGET"/>
 *     &lt;enumeration value="SALES_UNIFIED_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_PIPELINE_NET_REVENUE"/>
 *     &lt;enumeration value="BILLING_AND_RECONCILIATION_LAST_DATE_TIME"/>
 *     &lt;enumeration value="BILLING_AND_RECONCILIATION_RECONCILIATION_STATUS"/>
 *     &lt;enumeration value="BILLING_AND_RECONCILIATION_DFP_VOLUME"/>
 *     &lt;enumeration value="BILLING_AND_RECONCILIATION_THIRD_PARTY_VOLUME"/>
 *     &lt;enumeration value="BILLING_AND_RECONCILIATION_RECONCILED_VOLUME"/>
 *     &lt;enumeration value="BILLING_AND_RECONCILIATION_BILLABLE_NET_REVENUE"/>
 *     &lt;enumeration value="SALES_ADDITIONAL_ADJUSTMENT"/>
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
     *                 The number of clicks delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_CLICKS,

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
     *                 The number of clicks an Ad Exchange ad delivered for line item-level dynamic allocation.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS,

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
     *                 The total number of missed impressions due to the ad servers' inability to
     *                 find ads to serve, including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS,

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
     *                 Replaced with {@code RICH_MEDIA_CUSTOM_EVENT_TIME} beginning in V201311.
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_CONVERSION_TIME_VALUE,

    /**
     * 
     *                 The number of times a user views and interacts with a specified part of a rich media ad.
     *                 Replaced with {@code RICH_MEDIA_CUSTOM_EVENT_COUNT} beginning in V201311.
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_CONVERSION_COUNT_VALUE,

    /**
     * 
     *                 Video interaction event: The number of impressions where the video was played.
     *               
     * 
     */
    VIDEO_INTERACTION_START,

    /**
     * 
     *                 Video interaction event: The number of times the video played to 25% of its length.
     *               
     * 
     */
    VIDEO_INTERACTION_FIRST_QUARTILE,

    /**
     * 
     *                 Video interaction event: The number of times the video reached its midpoint during play.
     *               
     * 
     */
    VIDEO_INTERACTION_MIDPOINT,

    /**
     * 
     *                 Video interaction event: The number of times the video played to 75% of its length.
     *               
     * 
     */
    VIDEO_INTERACTION_THIRD_QUARTILE,

    /**
     * 
     *                 Video interaction event: The number of times the video played to completion.
     *               
     * 
     */
    VIDEO_INTERACTION_COMPLETE,

    /**
     * 
     *                 Video interaction event: Percentage of the video watched by users.
     *               
     * 
     */
    VIDEO_INTERACTION_VIEW_RATE,

    /**
     * 
     *                 Video interaction event: Average time users watched the video.
     *               
     * 
     */
    VIDEO_INTERACTION_AVERAGE_VIEW_RATE,

    /**
     * 
     *                 Video interaction event: Percentage of times the video played to the end.
     *               
     * 
     */
    VIDEO_INTERACTION_COMPLETION_RATE,

    /**
     * 
     *                 Video interaction event: The number of times an error occurred, such as a VAST redirect error,
     *                 a video playback error, or an invalid response error.
     *               
     * 
     */
    VIDEO_INTERACTION_ERROR_COUNT,

    /**
     * 
     *                 Video interaction event: Duration of the video creative.
     *               
     * 
     */
    VIDEO_INTERACTION_VIDEO_LENGTH,

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
     *                 Video interaction event: The number of times a skip button is shown in video.
     *               
     * 
     */
    VIDEO_INTERACTION_VIDEO_SKIP_SHOWN,

    /**
     * 
     *                 Video interaction event: The number of engaged views i.e. ad is viewed to completion
     *                 or for 30s, whichever comes first.
     *               
     * 
     */
    VIDEO_INTERACTION_ENGAGED_VIEW,

    /**
     * 
     *                 Video interaction event: View-through rate represented as a percentage.
     *               
     * 
     */
    VIDEO_INTERACTION_VIEW_THROUGH_RATE,

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
     *                 The CPM, CPC and CPD revenue earned, calculated in publisher currency,
     *                 for the ads delivered by the ad server.
     *                 <p>
     *                 Note: this column is the same as {@link #AD_SERVER_ALL_REVENUE}.
     *                 <p>
     *                 This is no longer supported after v201306.
     *               
     * 
     */
    SALES_DFP_REVENUE,

    /**
     * 
     *                 The forecasted net revenue of the {@link ProposalLineItem}. It is calculated from forecasted
     *                 volume and rate, with cap applied.
     *                 <p>
     *                 This is no longer supported after v201306.
     *                 <p>
     *                 Replaced with {@link #UNIFIED_REVENUE_FORECASTED_NET_REVENUE} beginning in v201405.
     *               
     * 
     */
    SALES_FORECASTED_NET_REVENUE,

    /**
     * 
     *                 The contracted net revenue of the {@link ProposalLineItem}. When revenue is summed up to
     *                 proposal level additional adjustment is applied.
     *                 <p>
     *                 Replaced with {@code CONTRACTED_REVENUE_CONTRACTED_NET_REVENUE} beginning in v201308.
     *               
     * 
     */
    SALES_CONTRACTED_NET_REVENUE,

    /**
     * 
     *                 The contracted net revenue of the {@link ProposalLineItem}. This revenue is the raw revenue
     *                 without proposal additional adjustment applied.
     *                 <p>
     *                 Replaced with {@code CONTRACTED_REVENUE_CONTRACTED_PLACEMENT_NET_REVENUE} beginning in v201308.
     *               
     * 
     */
    SALES_CONTRACTED_PLACEMENT_NET_REVENUE,

    /**
     * 
     *                 The contracted impressions of the {@link ProposalLineItem}.
     *                 <p>
     *                 Replaced with {@code SALES_CONTRACT_CONTRACTED_IMPRESSIONS} beginning in v201308.
     *               
     * 
     */
    SALES_CONTRACTED_IMPRESSIONS,

    /**
     * 
     *                 The contracted clicks of the {@link ProposalLineItem}.
     *                 <p>
     *                 Replaced with {@code SALES_CONTRACT_CONTRACTED_CLICKS} beginning in v201308.
     *               
     * 
     */
    SALES_CONTRACTED_CLICKS,

    /**
     * 
     *                 The contracted volume of the {@link ProposalLineItem}. Volume represents impressions for
     *                 cost type CPM, clicks for CPC, and days for CPD.
     *                 <p>
     *                 Replaced with {@code SALES_CONTRACT_CONTRACTED_VOLUME} beginning in v201308.
     *               
     * 
     */
    SALES_CONTRACTED_VOLUME,

    /**
     * 
     *                 The budget of the {@link Proposal}.
     *                 <p>
     *                 Replaced with {@code SALES_CONTRACT_BUDGET} beginning in v201308.
     *               
     * 
     */
    SALES_BUDGET,

    /**
     * 
     *                 The remaining budget of the {@link Proposal}. It is calculated by subtracting the contracted
     *                 net revenue from the budget.
     *                 <p>
     *                 Replaced with {@code SALES_CONTRACT_REMAINING_BUDGET} beginning in v201308.
     *               
     * 
     */
    SALES_REMAINING_BUDGET,

    /**
     * 
     *                 The unified net revenue of the {@link ProposalLineItem}. It is a combination of billable
     *                 revenue, unreconciled revenue and forecasted revenue.
     *                 <p>
     *                 Replaced with {@code UNIFIED_REVENUE_UNIFIED_NET_REVENUE} beginning in v201308.
     *               
     * 
     */
    SALES_UNIFIED_NET_REVENUE,

    /**
     * 
     *                 The pipeline net revenue of the {@link ProposalLineItem}. It is calculated by multiplying
     *                 probability to close by the contracted revenue for those unsold {@link ProposalLineItem}s.
     *                 There is no revenue for those sold {@link ProposalLineItem}s.
     *                 <p>
     *                 Replaced with {@code SALES_PIPELINE_PIPELINE_NET_REVENUE} beginning in v201308.
     *               
     * 
     */
    SALES_PIPELINE_NET_REVENUE,

    /**
     * 
     *                 The last reconciliation date of the {@link ProposalLineItem}.
     *                 <p>
     *                 Replaced with {@code RECONCILIATION_LAST_DATE_TIME} beginning in v201308.
     *               
     * 
     */
    BILLING_AND_RECONCILIATION_LAST_DATE_TIME,

    /**
     * 
     *                 The reconciliation status of the {@link ProposalLineItem}.
     *                 <p>
     *                 Replaced with {@code RECONCILIATION_RECONCILIATION_STATUS} beginning in v201308.
     *               
     * 
     */
    BILLING_AND_RECONCILIATION_RECONCILIATION_STATUS,

    /**
     * 
     *                 The DFP volume of the {@link ProposalLineItem}, which is used for reconciliation. Volume
     *                 represents impressions for rate type CPM, clicks for CPC and days for CPD.
     *                 <p>
     *                 Replaced with {@code RECONCILIATION_DFP_VOLUME} beginning in v201308.
     *               
     * 
     */
    BILLING_AND_RECONCILIATION_DFP_VOLUME,

    /**
     * 
     *                 The third party volume of the {@link ProposalLineItem}, which is used for reconciliation.
     *                 Volume represents impressions for rate type CPM, clicks for CPC and days for CPD.
     *                 <p>
     *                 Replaced with {@code RECONCILIATION_THIRD_PARTY_VOLUME} beginning in v201308.
     *               
     * 
     */
    BILLING_AND_RECONCILIATION_THIRD_PARTY_VOLUME,

    /**
     * 
     *                 The reconciled volume of the {@link ProposalLineItem}, which is used for reconciliation. Volume
     *                 represents impressions for rate type CPM, clicks for CPC and days for CPD.
     *                 <p>
     *                 Replaced with {@code RECONCILIATION_RECONCILED_VOLUME} beginning in v201308.
     *               
     * 
     */
    BILLING_AND_RECONCILIATION_RECONCILED_VOLUME,

    /**
     * 
     *                 The billable net revenue of the {@link ProposalLineItem}. It is calculated from reconciled
     *                 volume and rate, with cap applied.
     *                 <p>
     *                 Replaced with {@code BILLING_BILLABLE_NET_REVENUE} beginning in v201308.
     *               
     * 
     */
    BILLING_AND_RECONCILIATION_BILLABLE_NET_REVENUE,

    /**
     * 
     *                 The additional adjustment of the {@link Proposal}.
     *                 <p>
     *                 Replaced with {@code DISCOUNTS_BREAKDOWN_ADDITIONAL_ADJUSTMENT} beginning in v201308.
     *               
     * 
     */
    SALES_ADDITIONAL_ADJUSTMENT;

    public String value() {
        return name();
    }

    public static Column fromValue(String v) {
        return valueOf(v);
    }

}
