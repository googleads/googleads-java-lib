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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDefinition.ReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportDefinition.ReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEYWORDS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="AD_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="URL_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="ADGROUP_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="ACCOUNT_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="GEO_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="SEARCH_QUERY_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="AUTOMATIC_PLACEMENTS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_KEYWORDS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_PLACEMENTS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="DESTINATION_URL_REPORT"/>
 *     &lt;enumeration value="SHARED_SET_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_SHARED_SET_REPORT"/>
 *     &lt;enumeration value="SHARED_SET_CRITERIA_REPORT"/>
 *     &lt;enumeration value="CREATIVE_CONVERSION_REPORT"/>
 *     &lt;enumeration value="CALL_METRICS_CALL_DETAILS_REPORT"/>
 *     &lt;enumeration value="KEYWORDLESS_QUERY_REPORT"/>
 *     &lt;enumeration value="KEYWORDLESS_CATEGORY_REPORT"/>
 *     &lt;enumeration value="CRITERIA_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CLICK_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="BUDGET_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="BID_GOAL_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="DISPLAY_KEYWORD_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="PLACEHOLDER_FEED_ITEM_REPORT"/>
 *     &lt;enumeration value="PLACEMENT_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_LOCATIONS_REPORT"/>
 *     &lt;enumeration value="GENDER_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="AGE_RANGE_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_LOCATION_TARGET_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_AD_SCHEDULE_TARGET_REPORT"/>
 *     &lt;enumeration value="PAID_ORGANIC_QUERY_REPORT"/>
 *     &lt;enumeration value="AUDIENCE_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="DISPLAY_TOPICS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="USER_AD_DISTANCE_REPORT"/>
 *     &lt;enumeration value="SHOPPING_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_REPORT"/>
 *     &lt;enumeration value="PARENTAL_STATUS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="PLACEHOLDER_REPORT"/>
 *     &lt;enumeration value="AD_CUSTOMIZERS_FEED_ITEM_REPORT"/>
 *     &lt;enumeration value="LABEL_REPORT"/>
 *     &lt;enumeration value="FINAL_URL_REPORT"/>
 *     &lt;enumeration value="VIDEO_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="TOP_CONTENT_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_CRITERIA_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_GROUP_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="LANDING_PAGE_REPORT"/>
 *     &lt;enumeration value="MARKETPLACE_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportDefinition.ReportType")
@XmlEnum
public enum ReportDefinitionReportType {


    /**
     * 
     *                 Reports performance data for your keywords.
     *               
     * 
     */
    KEYWORDS_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for your ads.
     *               
     * 
     */
    AD_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for URLs which triggered your ad and
     *                 received clicks.
     *               
     * 
     */
    URL_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports ad group performance data for one or more of your campaigns.
     *               
     * 
     */
    ADGROUP_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for your campaigns.
     *               
     * 
     */
    CAMPAIGN_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for your entire account.
     *               
     * 
     */
    ACCOUNT_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data by geographic origin.
     *               
     * 
     */
    GEO_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for search queries which triggered your ad and
     *                 received clicks.
     *               
     * 
     */
    SEARCH_QUERY_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for automatic placements on the content network.
     *               
     * 
     */
    AUTOMATIC_PLACEMENTS_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for negative keywords at the campaign level.
     *               
     * 
     */
    CAMPAIGN_NEGATIVE_KEYWORDS_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for the negative placements at the campaign
     *                 level.
     *               
     * 
     */
    CAMPAIGN_NEGATIVE_PLACEMENTS_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for destination urls.
     *               
     * 
     */
    DESTINATION_URL_REPORT,

    /**
     * 
     *                 Reports data for shared sets.
     *               
     * 
     */
    SHARED_SET_REPORT,

    /**
     * 
     *                 Reports data for campaign shared sets.
     *               
     * 
     */
    CAMPAIGN_SHARED_SET_REPORT,

    /**
     * 
     *                 Provides a downloadable snapshot of shared set criteria.
     *               
     * 
     */
    SHARED_SET_CRITERIA_REPORT,

    /**
     * 
     *                 Reports performance data for creative conversions (e.g. free clicks).
     *               
     * 
     */
    CREATIVE_CONVERSION_REPORT,

    /**
     * 
     *                 Reports per-phone-call details for calls tracked using call metrics.
     *               
     * 
     */
    CALL_METRICS_CALL_DETAILS_REPORT,

    /**
     * 
     *                 Reports performance data for keywordless ads.
     *               
     * 
     */
    KEYWORDLESS_QUERY_REPORT,

    /**
     * 
     *                 Reports performance data for keywordless ads.
     *               
     * 
     */
    KEYWORDLESS_CATEGORY_REPORT,

    /**
     * 
     *                 Reports performance data for all published criteria types including keywords,
     *                 placements, topics, user-lists in a single report.
     *               
     * 
     */
    CRITERIA_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for clicks.
     *               
     * 
     */
    CLICK_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for budgets.
     *               
     * 
     */
    BUDGET_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for your (shared) bid strategies.
     *               
     * 
     */
    BID_GOAL_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for your display keywords.
     *               
     * 
     */
    DISPLAY_KEYWORD_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for your placeholder feed items
     *               
     * 
     */
    PLACEHOLDER_FEED_ITEM_REPORT,

    /**
     * 
     *                 Reports performance data for your placements.
     *               
     * 
     */
    PLACEMENT_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for negative location targets at campaign level.
     *               
     * 
     */
    CAMPAIGN_NEGATIVE_LOCATIONS_REPORT,

    /**
     * 
     *                 Reports performance data for managed and automatic genders in a combined report.
     *               
     * 
     */
    GENDER_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for managed and automatic age ranges in a combined report.
     *               
     * 
     */
    AGE_RANGE_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for campaign level location targets.
     *               
     * 
     */
    CAMPAIGN_LOCATION_TARGET_REPORT,

    /**
     * 
     *                 Reports performance data for campaign level ad schedule targets.
     *               
     * 
     */
    CAMPAIGN_AD_SCHEDULE_TARGET_REPORT,

    /**
     * 
     *                 Paid & organic report
     *               
     * 
     */
    PAID_ORGANIC_QUERY_REPORT,

    /**
     * 
     *                 Reports performance data for your audience criteria.
     *               
     * 
     */
    AUDIENCE_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for your topic criteria.
     *               
     * 
     */
    DISPLAY_TOPICS_PERFORMANCE_REPORT,

    /**
     * 
     *                 Distance report
     *               
     * 
     */
    USER_AD_DISTANCE_REPORT,

    /**
     * 
     *                 Performance data for shopping campaigns.
     *               
     * 
     */
    SHOPPING_PERFORMANCE_REPORT,

    /**
     * 
     *                 Performance data for product partitions in shopping campaigns.
     *               
     * 
     */
    PRODUCT_PARTITION_REPORT,

    /**
     * 
     *                 Reports performance data for managed and automatic parental statuses in a combined report.
     *               
     * 
     */
    PARENTAL_STATUS_PERFORMANCE_REPORT,

    /**
     * 
     *                 Performance data for Extension placeholders
     *               
     * 
     */
    PLACEHOLDER_REPORT,

    /**
     * 
     *                 Reports performance of ad placeholders when instantiated with specific FeedItems.
     *               
     * 
     */
    AD_CUSTOMIZERS_FEED_ITEM_REPORT,

    /**
     * 
     *                 Reports stats and settings details for labels.
     *               
     * 
     */
    LABEL_REPORT,

    /**
     * 
     *                 Reports performance data for final urls.
     *               
     * 
     */
    FINAL_URL_REPORT,

    /**
     * 
     *                 Video performance report.
     *               
     * 
     */
    VIDEO_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for top content bid modifier criteria.
     *               
     * 
     */
    TOP_CONTENT_PERFORMANCE_REPORT,

    /**
     * 
     *                 Report to show campaign criteria structure.
     *               
     * 
     */
    CAMPAIGN_CRITERIA_REPORT,

    /**
     * 
     *                 Report performance data for Campaign Groups.
     *               
     * 
     */
    CAMPAIGN_GROUP_PERFORMANCE_REPORT,

    /**
     * 
     *                 Reports performance data for landing pages on unexpanded and expanded final url levels.
     *               
     * 
     */
    LANDING_PAGE_REPORT,

    /**
     * 
     *                 Report performance data for Marketplace Ads Clients.
     *               
     * 
     */
    MARKETPLACE_PERFORMANCE_REPORT,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ReportDefinitionReportType fromValue(String v) {
        return valueOf(v);
    }

}
