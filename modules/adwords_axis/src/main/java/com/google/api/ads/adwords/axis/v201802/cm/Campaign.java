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
 * Campaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data representing an AdWords campaign.
 */
public class Campaign  implements java.io.Serializable {
    /* ID of this campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.Long id;

    /* Id of the campaign group this campaign belongs to. */
    private java.lang.Long campaignGroupId;

    /* Name of this campaign.
     *                 This field is required and should not be {@code null}
     * for ADD operations.
     *
     *                 For SET and REMOVE operations, this can be used to
     * address the campaign
     *                 by name when the campaign is ENABLED or PAUSED. Removed
     * campaigns cannot
     *                 be addressed by name. If you wish to rename a campaign,
     * you must provide
     *                 the ID.
     *                 <span class="constraint MatchesRegex">Campaign names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String name;

    /* Status of this campaign. On add, defaults to {@code ENABLED}. */
    private com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus status;

    /* Serving status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ServingStatus servingStatus;

    /* Date the campaign begins. On add, defaults to the current day
     * in the parent account's local timezone. The date's format should be
     * YYYYMMDD. */
    private java.lang.String startDate;

    /* Date the campaign ends. On add, defaults to <code>20371230</code>,
     * which means the
     *                 campaign will run indefinitely. To set an existing
     * campaign to run indefinitely, set this
     *                 field to <code>203712<b>30</b></code>. The date's
     * format should be YYYYMMDD. */
    private java.lang.String endDate;

    /* Current base budget of campaign; default if no custom budgets
     * are enabled.
     *                 This field is readonly for draft campaigns and will
     * be ignored when sent to the API. */
    private com.google.api.ads.adwords.axis.v201802.cm.Budget budget;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibility conversionOptimizerEligibility;

    /* Ad serving optimization status.
     *                 <span class="constraint CampaignType">This field may
     * only be set to CONVERSION_OPTIMIZE for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AdServingOptimizationStatus adServingOptimizationStatus;

    /* Frequency cap for this campaign.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtypes: UNIVERSAL_APP_CAMPAIGN,
     * SEARCH_MOBILE_APP.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FrequencyCap frequencyCap;

    /* List of settings for the campaign. */
    private com.google.api.ads.adwords.axis.v201802.cm.Setting[] settings;

    /* The primary serving target for ads within this campaign. The
     * targeting options can be refined
     *                 in NetworkSetting. May only be set for new campaigns.
     * This field is required and should not be {@code null} when it is contained
     * within
     *                 {@link Operator}s : ADD
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType advertisingChannelType;

    /* Optional refinement of advertisingChannelType. Must be a valid
     * sub-type of the parent channel
     *                 type. May only be set for new campaigns and cannot
     * be changed once set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelSubType advertisingChannelSubType;

    /* Network settings for the campaign indicating where the campaign
     * will serve. */
    private com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting networkSetting;

    /* Labels that are attached to the campaign. To associate an existing
     * {@link Label} to an
     *                 existing {@link Campaign}, use {@link CampaignService#mutateLabel}
     * with the ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link Campaign}, use
     *                 {@link CampaignService#mutateLabel} with the REMOVE
     * operator. To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Label[] labels;

    /* Bidding configuration for this campaign. To change an existing
     * campaign's
     *                 bidding strategy, set the {@link BiddingStrategyConfiguration#biddingStrategyType}
     * or {@link BiddingStrategyConfiguration#biddingScheme}.
     *                 This field is required and should not be {@code null}
     * when it is contained within
     *                 {@link Operator}s : ADD */
    private com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration biddingStrategyConfiguration;

    /* Indicates if this campaign is a normal campaign, a draft campaign,
     * or a trial campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.CampaignTrialType campaignTrialType;

    /* ID of the base campaign of the draft or trial campaign. For
     * base campaigns, this is equal to
     *                 the campaign ID.  This field is only returned on get
     * requests.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseCampaignId;

    private com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] forwardCompatibilityMap;

    /* URL template for constructing a tracking URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span> */
    private java.lang.String trackingUrlTemplate;

    /* URL template for appending params to Final URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field. */
    private java.lang.String finalUrlSuffix;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     * <span class="constraint CampaignType">This field may not be set for
     * campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters;

    /* Describes how unbranded pharma ads will be displayed.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.VanityPharma vanityPharma;

    /* Selective optimization setting for this campaign, which includes
     * a set of conversion
     *                 types to optimize this campaign towards.
     *                 <span class="constraint CampaignType">This field may
     * only be set for campaign channel type MULTI_CHANNEL.</span>
     * <span class="constraint CampaignType">This field may not be set.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.SelectiveOptimization selectiveOptimization;

    public Campaign() {
    }

    public Campaign(
           java.lang.Long id,
           java.lang.Long campaignGroupId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.ServingStatus servingStatus,
           java.lang.String startDate,
           java.lang.String endDate,
           com.google.api.ads.adwords.axis.v201802.cm.Budget budget,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibility conversionOptimizerEligibility,
           com.google.api.ads.adwords.axis.v201802.cm.AdServingOptimizationStatus adServingOptimizationStatus,
           com.google.api.ads.adwords.axis.v201802.cm.FrequencyCap frequencyCap,
           com.google.api.ads.adwords.axis.v201802.cm.Setting[] settings,
           com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType advertisingChannelType,
           com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelSubType advertisingChannelSubType,
           com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting networkSetting,
           com.google.api.ads.adwords.axis.v201802.cm.Label[] labels,
           com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration biddingStrategyConfiguration,
           com.google.api.ads.adwords.axis.v201802.cm.CampaignTrialType campaignTrialType,
           java.lang.Long baseCampaignId,
           com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] forwardCompatibilityMap,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201802.cm.VanityPharma vanityPharma,
           com.google.api.ads.adwords.axis.v201802.cm.SelectiveOptimization selectiveOptimization) {
           this.id = id;
           this.campaignGroupId = campaignGroupId;
           this.name = name;
           this.status = status;
           this.servingStatus = servingStatus;
           this.startDate = startDate;
           this.endDate = endDate;
           this.budget = budget;
           this.conversionOptimizerEligibility = conversionOptimizerEligibility;
           this.adServingOptimizationStatus = adServingOptimizationStatus;
           this.frequencyCap = frequencyCap;
           this.settings = settings;
           this.advertisingChannelType = advertisingChannelType;
           this.advertisingChannelSubType = advertisingChannelSubType;
           this.networkSetting = networkSetting;
           this.labels = labels;
           this.biddingStrategyConfiguration = biddingStrategyConfiguration;
           this.campaignTrialType = campaignTrialType;
           this.baseCampaignId = baseCampaignId;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.trackingUrlTemplate = trackingUrlTemplate;
           this.finalUrlSuffix = finalUrlSuffix;
           this.urlCustomParameters = urlCustomParameters;
           this.vanityPharma = vanityPharma;
           this.selectiveOptimization = selectiveOptimization;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adServingOptimizationStatus", getAdServingOptimizationStatus())
            .add("advertisingChannelSubType", getAdvertisingChannelSubType())
            .add("advertisingChannelType", getAdvertisingChannelType())
            .add("baseCampaignId", getBaseCampaignId())
            .add("biddingStrategyConfiguration", getBiddingStrategyConfiguration())
            .add("budget", getBudget())
            .add("campaignGroupId", getCampaignGroupId())
            .add("campaignTrialType", getCampaignTrialType())
            .add("conversionOptimizerEligibility", getConversionOptimizerEligibility())
            .add("endDate", getEndDate())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("forwardCompatibilityMap", getForwardCompatibilityMap())
            .add("frequencyCap", getFrequencyCap())
            .add("id", getId())
            .add("labels", getLabels())
            .add("name", getName())
            .add("networkSetting", getNetworkSetting())
            .add("selectiveOptimization", getSelectiveOptimization())
            .add("servingStatus", getServingStatus())
            .add("settings", getSettings())
            .add("startDate", getStartDate())
            .add("status", getStatus())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("vanityPharma", getVanityPharma())
            .toString();
    }

    /**
     * Gets the id value for this Campaign.
     *
     * @return id   * ID of this campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Campaign.
     *
     * @param id   * ID of this campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the campaignGroupId value for this Campaign.
     *
     * @return campaignGroupId   * Id of the campaign group this campaign belongs to.
     */
    public java.lang.Long getCampaignGroupId() {
        return campaignGroupId;
    }


    /**
     * Sets the campaignGroupId value for this Campaign.
     *
     * @param campaignGroupId   * Id of the campaign group this campaign belongs to.
     */
    public void setCampaignGroupId(java.lang.Long campaignGroupId) {
        this.campaignGroupId = campaignGroupId;
    }


    /**
     * Gets the name value for this Campaign.
     *
     * @return name   * Name of this campaign.
     *                 This field is required and should not be {@code null}
     * for ADD operations.
     *
     *                 For SET and REMOVE operations, this can be used to
     * address the campaign
     *                 by name when the campaign is ENABLED or PAUSED. Removed
     * campaigns cannot
     *                 be addressed by name. If you wish to rename a campaign,
     * you must provide
     *                 the ID.
     *                 <span class="constraint MatchesRegex">Campaign names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Campaign.
     *
     * @param name   * Name of this campaign.
     *                 This field is required and should not be {@code null}
     * for ADD operations.
     *
     *                 For SET and REMOVE operations, this can be used to
     * address the campaign
     *                 by name when the campaign is ENABLED or PAUSED. Removed
     * campaigns cannot
     *                 be addressed by name. If you wish to rename a campaign,
     * you must provide
     *                 the ID.
     *                 <span class="constraint MatchesRegex">Campaign names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Campaign.
     *
     * @return status   * Status of this campaign. On add, defaults to {@code ENABLED}.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Campaign.
     *
     * @param status   * Status of this campaign. On add, defaults to {@code ENABLED}.
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus status) {
        this.status = status;
    }


    /**
     * Gets the servingStatus value for this Campaign.
     *
     * @return servingStatus   * Serving status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ServingStatus getServingStatus() {
        return servingStatus;
    }


    /**
     * Sets the servingStatus value for this Campaign.
     *
     * @param servingStatus   * Serving status.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setServingStatus(com.google.api.ads.adwords.axis.v201802.cm.ServingStatus servingStatus) {
        this.servingStatus = servingStatus;
    }


    /**
     * Gets the startDate value for this Campaign.
     *
     * @return startDate   * Date the campaign begins. On add, defaults to the current day
     * in the parent account's local timezone. The date's format should be
     * YYYYMMDD.
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Campaign.
     *
     * @param startDate   * Date the campaign begins. On add, defaults to the current day
     * in the parent account's local timezone. The date's format should be
     * YYYYMMDD.
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Campaign.
     *
     * @return endDate   * Date the campaign ends. On add, defaults to <code>20371230</code>,
     * which means the
     *                 campaign will run indefinitely. To set an existing
     * campaign to run indefinitely, set this
     *                 field to <code>203712<b>30</b></code>. The date's
     * format should be YYYYMMDD.
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Campaign.
     *
     * @param endDate   * Date the campaign ends. On add, defaults to <code>20371230</code>,
     * which means the
     *                 campaign will run indefinitely. To set an existing
     * campaign to run indefinitely, set this
     *                 field to <code>203712<b>30</b></code>. The date's
     * format should be YYYYMMDD.
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the budget value for this Campaign.
     *
     * @return budget   * Current base budget of campaign; default if no custom budgets
     * are enabled.
     *                 This field is readonly for draft campaigns and will
     * be ignored when sent to the API.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Budget getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this Campaign.
     *
     * @param budget   * Current base budget of campaign; default if no custom budgets
     * are enabled.
     *                 This field is readonly for draft campaigns and will
     * be ignored when sent to the API.
     */
    public void setBudget(com.google.api.ads.adwords.axis.v201802.cm.Budget budget) {
        this.budget = budget;
    }


    /**
     * Gets the conversionOptimizerEligibility value for this Campaign.
     *
     * @return conversionOptimizerEligibility   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibility getConversionOptimizerEligibility() {
        return conversionOptimizerEligibility;
    }


    /**
     * Sets the conversionOptimizerEligibility value for this Campaign.
     *
     * @param conversionOptimizerEligibility   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setConversionOptimizerEligibility(com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibility conversionOptimizerEligibility) {
        this.conversionOptimizerEligibility = conversionOptimizerEligibility;
    }


    /**
     * Gets the adServingOptimizationStatus value for this Campaign.
     *
     * @return adServingOptimizationStatus   * Ad serving optimization status.
     *                 <span class="constraint CampaignType">This field may
     * only be set to CONVERSION_OPTIMIZE for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdServingOptimizationStatus getAdServingOptimizationStatus() {
        return adServingOptimizationStatus;
    }


    /**
     * Sets the adServingOptimizationStatus value for this Campaign.
     *
     * @param adServingOptimizationStatus   * Ad serving optimization status.
     *                 <span class="constraint CampaignType">This field may
     * only be set to CONVERSION_OPTIMIZE for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public void setAdServingOptimizationStatus(com.google.api.ads.adwords.axis.v201802.cm.AdServingOptimizationStatus adServingOptimizationStatus) {
        this.adServingOptimizationStatus = adServingOptimizationStatus;
    }


    /**
     * Gets the frequencyCap value for this Campaign.
     *
     * @return frequencyCap   * Frequency cap for this campaign.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtypes: UNIVERSAL_APP_CAMPAIGN,
     * SEARCH_MOBILE_APP.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FrequencyCap getFrequencyCap() {
        return frequencyCap;
    }


    /**
     * Sets the frequencyCap value for this Campaign.
     *
     * @param frequencyCap   * Frequency cap for this campaign.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtypes: UNIVERSAL_APP_CAMPAIGN,
     * SEARCH_MOBILE_APP.</span>
     */
    public void setFrequencyCap(com.google.api.ads.adwords.axis.v201802.cm.FrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
    }


    /**
     * Gets the settings value for this Campaign.
     *
     * @return settings   * List of settings for the campaign.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Setting[] getSettings() {
        return settings;
    }


    /**
     * Sets the settings value for this Campaign.
     *
     * @param settings   * List of settings for the campaign.
     */
    public void setSettings(com.google.api.ads.adwords.axis.v201802.cm.Setting[] settings) {
        this.settings = settings;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Setting getSettings(int i) {
        return this.settings[i];
    }

    public void setSettings(int i, com.google.api.ads.adwords.axis.v201802.cm.Setting _value) {
        this.settings[i] = _value;
    }


    /**
     * Gets the advertisingChannelType value for this Campaign.
     *
     * @return advertisingChannelType   * The primary serving target for ads within this campaign. The
     * targeting options can be refined
     *                 in NetworkSetting. May only be set for new campaigns.
     * This field is required and should not be {@code null} when it is contained
     * within
     *                 {@link Operator}s : ADD
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType getAdvertisingChannelType() {
        return advertisingChannelType;
    }


    /**
     * Sets the advertisingChannelType value for this Campaign.
     *
     * @param advertisingChannelType   * The primary serving target for ads within this campaign. The
     * targeting options can be refined
     *                 in NetworkSetting. May only be set for new campaigns.
     * This field is required and should not be {@code null} when it is contained
     * within
     *                 {@link Operator}s : ADD
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     */
    public void setAdvertisingChannelType(com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType advertisingChannelType) {
        this.advertisingChannelType = advertisingChannelType;
    }


    /**
     * Gets the advertisingChannelSubType value for this Campaign.
     *
     * @return advertisingChannelSubType   * Optional refinement of advertisingChannelType. Must be a valid
     * sub-type of the parent channel
     *                 type. May only be set for new campaigns and cannot
     * be changed once set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelSubType getAdvertisingChannelSubType() {
        return advertisingChannelSubType;
    }


    /**
     * Sets the advertisingChannelSubType value for this Campaign.
     *
     * @param advertisingChannelSubType   * Optional refinement of advertisingChannelType. Must be a valid
     * sub-type of the parent channel
     *                 type. May only be set for new campaigns and cannot
     * be changed once set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     */
    public void setAdvertisingChannelSubType(com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelSubType advertisingChannelSubType) {
        this.advertisingChannelSubType = advertisingChannelSubType;
    }


    /**
     * Gets the networkSetting value for this Campaign.
     *
     * @return networkSetting   * Network settings for the campaign indicating where the campaign
     * will serve.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting getNetworkSetting() {
        return networkSetting;
    }


    /**
     * Sets the networkSetting value for this Campaign.
     *
     * @param networkSetting   * Network settings for the campaign indicating where the campaign
     * will serve.
     */
    public void setNetworkSetting(com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting networkSetting) {
        this.networkSetting = networkSetting;
    }


    /**
     * Gets the labels value for this Campaign.
     *
     * @return labels   * Labels that are attached to the campaign. To associate an existing
     * {@link Label} to an
     *                 existing {@link Campaign}, use {@link CampaignService#mutateLabel}
     * with the ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link Campaign}, use
     *                 {@link CampaignService#mutateLabel} with the REMOVE
     * operator. To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Label[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this Campaign.
     *
     * @param labels   * Labels that are attached to the campaign. To associate an existing
     * {@link Label} to an
     *                 existing {@link Campaign}, use {@link CampaignService#mutateLabel}
     * with the ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link Campaign}, use
     *                 {@link CampaignService#mutateLabel} with the REMOVE
     * operator. To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setLabels(com.google.api.ads.adwords.axis.v201802.cm.Label[] labels) {
        this.labels = labels;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Label getLabels(int i) {
        return this.labels[i];
    }

    public void setLabels(int i, com.google.api.ads.adwords.axis.v201802.cm.Label _value) {
        this.labels[i] = _value;
    }


    /**
     * Gets the biddingStrategyConfiguration value for this Campaign.
     *
     * @return biddingStrategyConfiguration   * Bidding configuration for this campaign. To change an existing
     * campaign's
     *                 bidding strategy, set the {@link BiddingStrategyConfiguration#biddingStrategyType}
     * or {@link BiddingStrategyConfiguration#biddingScheme}.
     *                 This field is required and should not be {@code null}
     * when it is contained within
     *                 {@link Operator}s : ADD
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }


    /**
     * Sets the biddingStrategyConfiguration value for this Campaign.
     *
     * @param biddingStrategyConfiguration   * Bidding configuration for this campaign. To change an existing
     * campaign's
     *                 bidding strategy, set the {@link BiddingStrategyConfiguration#biddingStrategyType}
     * or {@link BiddingStrategyConfiguration#biddingScheme}.
     *                 This field is required and should not be {@code null}
     * when it is contained within
     *                 {@link Operator}s : ADD
     */
    public void setBiddingStrategyConfiguration(com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration biddingStrategyConfiguration) {
        this.biddingStrategyConfiguration = biddingStrategyConfiguration;
    }


    /**
     * Gets the campaignTrialType value for this Campaign.
     *
     * @return campaignTrialType   * Indicates if this campaign is a normal campaign, a draft campaign,
     * or a trial campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignTrialType getCampaignTrialType() {
        return campaignTrialType;
    }


    /**
     * Sets the campaignTrialType value for this Campaign.
     *
     * @param campaignTrialType   * Indicates if this campaign is a normal campaign, a draft campaign,
     * or a trial campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignTrialType(com.google.api.ads.adwords.axis.v201802.cm.CampaignTrialType campaignTrialType) {
        this.campaignTrialType = campaignTrialType;
    }


    /**
     * Gets the baseCampaignId value for this Campaign.
     *
     * @return baseCampaignId   * ID of the base campaign of the draft or trial campaign. For
     * base campaigns, this is equal to
     *                 the campaign ID.  This field is only returned on get
     * requests.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this Campaign.
     *
     * @param baseCampaignId   * ID of the base campaign of the draft or trial campaign. For
     * base campaigns, this is equal to
     *                 the campaign ID.  This field is only returned on get
     * requests.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }


    public com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }


    /**
     * Gets the trackingUrlTemplate value for this Campaign.
     *
     * @return trackingUrlTemplate   * URL template for constructing a tracking URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this Campaign.
     *
     * @param trackingUrlTemplate   * URL template for constructing a tracking URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the finalUrlSuffix value for this Campaign.
     *
     * @return finalUrlSuffix   * URL template for appending params to Final URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public java.lang.String getFinalUrlSuffix() {
        return finalUrlSuffix;
    }


    /**
     * Sets the finalUrlSuffix value for this Campaign.
     *
     * @param finalUrlSuffix   * URL template for appending params to Final URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public void setFinalUrlSuffix(java.lang.String finalUrlSuffix) {
        this.finalUrlSuffix = finalUrlSuffix;
    }


    /**
     * Gets the urlCustomParameters value for this Campaign.
     *
     * @return urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     * <span class="constraint CampaignType">This field may not be set for
     * campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }


    /**
     * Sets the urlCustomParameters value for this Campaign.
     *
     * @param urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     * <span class="constraint CampaignType">This field may not be set for
     * campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public void setUrlCustomParameters(com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }


    /**
     * Gets the vanityPharma value for this Campaign.
     *
     * @return vanityPharma   * Describes how unbranded pharma ads will be displayed.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.VanityPharma getVanityPharma() {
        return vanityPharma;
    }


    /**
     * Sets the vanityPharma value for this Campaign.
     *
     * @param vanityPharma   * Describes how unbranded pharma ads will be displayed.
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public void setVanityPharma(com.google.api.ads.adwords.axis.v201802.cm.VanityPharma vanityPharma) {
        this.vanityPharma = vanityPharma;
    }


    /**
     * Gets the selectiveOptimization value for this Campaign.
     *
     * @return selectiveOptimization   * Selective optimization setting for this campaign, which includes
     * a set of conversion
     *                 types to optimize this campaign towards.
     *                 <span class="constraint CampaignType">This field may
     * only be set for campaign channel type MULTI_CHANNEL.</span>
     * <span class="constraint CampaignType">This field may not be set.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SelectiveOptimization getSelectiveOptimization() {
        return selectiveOptimization;
    }


    /**
     * Sets the selectiveOptimization value for this Campaign.
     *
     * @param selectiveOptimization   * Selective optimization setting for this campaign, which includes
     * a set of conversion
     *                 types to optimize this campaign towards.
     *                 <span class="constraint CampaignType">This field may
     * only be set for campaign channel type MULTI_CHANNEL.</span>
     * <span class="constraint CampaignType">This field may not be set.</span>
     */
    public void setSelectiveOptimization(com.google.api.ads.adwords.axis.v201802.cm.SelectiveOptimization selectiveOptimization) {
        this.selectiveOptimization = selectiveOptimization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Campaign)) return false;
        Campaign other = (Campaign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.id==null && other.getId()==null) ||
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.campaignGroupId==null && other.getCampaignGroupId()==null) ||
             (this.campaignGroupId!=null &&
              this.campaignGroupId.equals(other.getCampaignGroupId()))) &&
            ((this.name==null && other.getName()==null) ||
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) ||
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.servingStatus==null && other.getServingStatus()==null) ||
             (this.servingStatus!=null &&
              this.servingStatus.equals(other.getServingStatus()))) &&
            ((this.startDate==null && other.getStartDate()==null) ||
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) ||
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.budget==null && other.getBudget()==null) ||
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.conversionOptimizerEligibility==null && other.getConversionOptimizerEligibility()==null) ||
             (this.conversionOptimizerEligibility!=null &&
              this.conversionOptimizerEligibility.equals(other.getConversionOptimizerEligibility()))) &&
            ((this.adServingOptimizationStatus==null && other.getAdServingOptimizationStatus()==null) ||
             (this.adServingOptimizationStatus!=null &&
              this.adServingOptimizationStatus.equals(other.getAdServingOptimizationStatus()))) &&
            ((this.frequencyCap==null && other.getFrequencyCap()==null) ||
             (this.frequencyCap!=null &&
              this.frequencyCap.equals(other.getFrequencyCap()))) &&
            ((this.settings==null && other.getSettings()==null) ||
             (this.settings!=null &&
              java.util.Arrays.equals(this.settings, other.getSettings()))) &&
            ((this.advertisingChannelType==null && other.getAdvertisingChannelType()==null) ||
             (this.advertisingChannelType!=null &&
              this.advertisingChannelType.equals(other.getAdvertisingChannelType()))) &&
            ((this.advertisingChannelSubType==null && other.getAdvertisingChannelSubType()==null) ||
             (this.advertisingChannelSubType!=null &&
              this.advertisingChannelSubType.equals(other.getAdvertisingChannelSubType()))) &&
            ((this.networkSetting==null && other.getNetworkSetting()==null) ||
             (this.networkSetting!=null &&
              this.networkSetting.equals(other.getNetworkSetting()))) &&
            ((this.labels==null && other.getLabels()==null) ||
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.biddingStrategyConfiguration==null && other.getBiddingStrategyConfiguration()==null) ||
             (this.biddingStrategyConfiguration!=null &&
              this.biddingStrategyConfiguration.equals(other.getBiddingStrategyConfiguration()))) &&
            ((this.campaignTrialType==null && other.getCampaignTrialType()==null) ||
             (this.campaignTrialType!=null &&
              this.campaignTrialType.equals(other.getCampaignTrialType()))) &&
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) ||
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) ||
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) ||
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.finalUrlSuffix==null && other.getFinalUrlSuffix()==null) ||
             (this.finalUrlSuffix!=null &&
              this.finalUrlSuffix.equals(other.getFinalUrlSuffix()))) &&
            ((this.urlCustomParameters==null && other.getUrlCustomParameters()==null) ||
             (this.urlCustomParameters!=null &&
              this.urlCustomParameters.equals(other.getUrlCustomParameters()))) &&
            ((this.vanityPharma==null && other.getVanityPharma()==null) ||
             (this.vanityPharma!=null &&
              this.vanityPharma.equals(other.getVanityPharma()))) &&
            ((this.selectiveOptimization==null && other.getSelectiveOptimization()==null) ||
             (this.selectiveOptimization!=null &&
              this.selectiveOptimization.equals(other.getSelectiveOptimization())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCampaignGroupId() != null) {
            _hashCode += getCampaignGroupId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getServingStatus() != null) {
            _hashCode += getServingStatus().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getConversionOptimizerEligibility() != null) {
            _hashCode += getConversionOptimizerEligibility().hashCode();
        }
        if (getAdServingOptimizationStatus() != null) {
            _hashCode += getAdServingOptimizationStatus().hashCode();
        }
        if (getFrequencyCap() != null) {
            _hashCode += getFrequencyCap().hashCode();
        }
        if (getSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdvertisingChannelType() != null) {
            _hashCode += getAdvertisingChannelType().hashCode();
        }
        if (getAdvertisingChannelSubType() != null) {
            _hashCode += getAdvertisingChannelSubType().hashCode();
        }
        if (getNetworkSetting() != null) {
            _hashCode += getNetworkSetting().hashCode();
        }
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBiddingStrategyConfiguration() != null) {
            _hashCode += getBiddingStrategyConfiguration().hashCode();
        }
        if (getCampaignTrialType() != null) {
            _hashCode += getCampaignTrialType().hashCode();
        }
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getFinalUrlSuffix() != null) {
            _hashCode += getFinalUrlSuffix().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        if (getVanityPharma() != null) {
            _hashCode += getVanityPharma().hashCode();
        }
        if (getSelectiveOptimization() != null) {
            _hashCode += getSelectiveOptimization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Campaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Campaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "servingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ServingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Budget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionOptimizerEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionOptimizerEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionOptimizerEligibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adServingOptimizationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adServingOptimizationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdServingOptimizationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "frequencyCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Setting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertisingChannelType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "advertisingChannelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdvertisingChannelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertisingChannelSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "advertisingChannelSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdvertisingChannelSubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "networkSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NetworkSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddingStrategyConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategyConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignTrialType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignTrialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignTrialType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "String_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "trackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrlSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "finalUrlSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "urlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CustomParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vanityPharma");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "vanityPharma"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VanityPharma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectiveOptimization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "selectiveOptimization"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SelectiveOptimization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
