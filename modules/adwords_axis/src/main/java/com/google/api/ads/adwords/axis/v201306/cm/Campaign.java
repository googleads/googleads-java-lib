/**
 * Campaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Data representing an AdWords campaign.
 */
public class Campaign  implements java.io.Serializable {
    /* ID of this campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* Name of this campaign. On add, defaults to <code>Campaign #<var>N</var></code>
     * prior to v201309.
     *                 This field is required and should not be {@code null}
     * for ADD operations from
     *                 v201309 versions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String name;

    /* Status of this campaign. On add, defaults to <code>ACTIVE</code>.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.CampaignStatus status;

    /* Serving status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ServingStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.ServingStatus servingStatus;

    /* Date the campaign begins. On add, defaults to the current day
     * in the parent account's local timezone. The date's format should be
     * YYYYMMDD.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String startDate;

    /* Date the campaign ends. On add, defaults to <code>20371231</code>,
     * which means the
     *                 campaign will run indefinitely. To set an existing
     * campaign to run indefinitely, set this
     *                 field to <code>203712<b>30</b></code>. The date's
     * format should be YYYYMMDD.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String endDate;

    /* Current base budget of campaign; default if no custom budgets
     * are active. */
    private com.google.api.ads.adwords.axis.v201306.cm.Budget budget;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.ConversionOptimizerEligibility conversionOptimizerEligibility;

    /* Statistics for this campaign, returned by {@link CampaignService#get
     * get()} only if
     *                 requested in the selector.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.CampaignStats campaignStats;

    /* Ad serving optimization status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdServingOptimizationStatus".</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.AdServingOptimizationStatus adServingOptimizationStatus;

    /* Frequency cap for this campaign. */
    private com.google.api.ads.adwords.axis.v201306.cm.FrequencyCap frequencyCap;

    /* List of settings for the campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Settings".</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.Setting[] settings;

    /* Network settings for the campaign indicating where the campaign
     * will serve. */
    private com.google.api.ads.adwords.axis.v201306.cm.NetworkSetting networkSetting;

    /* Bidding configuration for this campaign. To change an existing
     * campaign's
     *                 bidding strategy, set the {@link BiddingStrategyConfiguration#biddingStrategyType}
     * or {@link BiddingStrategyConfiguration#biddingScheme}.
     *                 This field is required and should not be {@code null}
     * when it is contained within
     *                 {@link Operator}s : ADD */
    private com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration biddingStrategyConfiguration;

    /* This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value. */
    private com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] forwardCompatibilityMap;

    /* Indicates if a campaign is an enhanced campaign.
     *                 
     *                 New campaigns are created as enhanced by default.
     * Once set to {@code true},
     *                 this value cannot be set to {@code false}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Enhanced".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean enhanced;

    public Campaign() {
    }

    public Campaign(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201306.cm.CampaignStatus status,
           com.google.api.ads.adwords.axis.v201306.cm.ServingStatus servingStatus,
           java.lang.String startDate,
           java.lang.String endDate,
           com.google.api.ads.adwords.axis.v201306.cm.Budget budget,
           com.google.api.ads.adwords.axis.v201306.cm.ConversionOptimizerEligibility conversionOptimizerEligibility,
           com.google.api.ads.adwords.axis.v201306.cm.CampaignStats campaignStats,
           com.google.api.ads.adwords.axis.v201306.cm.AdServingOptimizationStatus adServingOptimizationStatus,
           com.google.api.ads.adwords.axis.v201306.cm.FrequencyCap frequencyCap,
           com.google.api.ads.adwords.axis.v201306.cm.Setting[] settings,
           com.google.api.ads.adwords.axis.v201306.cm.NetworkSetting networkSetting,
           com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration biddingStrategyConfiguration,
           com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] forwardCompatibilityMap,
           java.lang.Boolean enhanced) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.servingStatus = servingStatus;
           this.startDate = startDate;
           this.endDate = endDate;
           this.budget = budget;
           this.conversionOptimizerEligibility = conversionOptimizerEligibility;
           this.campaignStats = campaignStats;
           this.adServingOptimizationStatus = adServingOptimizationStatus;
           this.frequencyCap = frequencyCap;
           this.settings = settings;
           this.networkSetting = networkSetting;
           this.biddingStrategyConfiguration = biddingStrategyConfiguration;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.enhanced = enhanced;
    }


    /**
     * Gets the id value for this Campaign.
     * 
     * @return id   * ID of this campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Campaign.
     * 
     * @param id   * ID of this campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Campaign.
     * 
     * @return name   * Name of this campaign. On add, defaults to <code>Campaign #<var>N</var></code>
     * prior to v201309.
     *                 This field is required and should not be {@code null}
     * for ADD operations from
     *                 v201309 versions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Campaign.
     * 
     * @param name   * Name of this campaign. On add, defaults to <code>Campaign #<var>N</var></code>
     * prior to v201309.
     *                 This field is required and should not be {@code null}
     * for ADD operations from
     *                 v201309 versions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Campaign.
     * 
     * @return status   * Status of this campaign. On add, defaults to <code>ACTIVE</code>.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CampaignStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Campaign.
     * 
     * @param status   * Status of this campaign. On add, defaults to <code>ACTIVE</code>.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201306.cm.CampaignStatus status) {
        this.status = status;
    }


    /**
     * Gets the servingStatus value for this Campaign.
     * 
     * @return servingStatus   * Serving status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ServingStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.ServingStatus getServingStatus() {
        return servingStatus;
    }


    /**
     * Sets the servingStatus value for this Campaign.
     * 
     * @param servingStatus   * Serving status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ServingStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setServingStatus(com.google.api.ads.adwords.axis.v201306.cm.ServingStatus servingStatus) {
        this.servingStatus = servingStatus;
    }


    /**
     * Gets the startDate value for this Campaign.
     * 
     * @return startDate   * Date the campaign begins. On add, defaults to the current day
     * in the parent account's local timezone. The date's format should be
     * YYYYMMDD.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
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
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Campaign.
     * 
     * @return endDate   * Date the campaign ends. On add, defaults to <code>20371231</code>,
     * which means the
     *                 campaign will run indefinitely. To set an existing
     * campaign to run indefinitely, set this
     *                 field to <code>203712<b>30</b></code>. The date's
     * format should be YYYYMMDD.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Campaign.
     * 
     * @param endDate   * Date the campaign ends. On add, defaults to <code>20371231</code>,
     * which means the
     *                 campaign will run indefinitely. To set an existing
     * campaign to run indefinitely, set this
     *                 field to <code>203712<b>30</b></code>. The date's
     * format should be YYYYMMDD.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the budget value for this Campaign.
     * 
     * @return budget   * Current base budget of campaign; default if no custom budgets
     * are active.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Budget getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this Campaign.
     * 
     * @param budget   * Current base budget of campaign; default if no custom budgets
     * are active.
     */
    public void setBudget(com.google.api.ads.adwords.axis.v201306.cm.Budget budget) {
        this.budget = budget;
    }


    /**
     * Gets the conversionOptimizerEligibility value for this Campaign.
     * 
     * @return conversionOptimizerEligibility   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.ConversionOptimizerEligibility getConversionOptimizerEligibility() {
        return conversionOptimizerEligibility;
    }


    /**
     * Sets the conversionOptimizerEligibility value for this Campaign.
     * 
     * @param conversionOptimizerEligibility   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setConversionOptimizerEligibility(com.google.api.ads.adwords.axis.v201306.cm.ConversionOptimizerEligibility conversionOptimizerEligibility) {
        this.conversionOptimizerEligibility = conversionOptimizerEligibility;
    }


    /**
     * Gets the campaignStats value for this Campaign.
     * 
     * @return campaignStats   * Statistics for this campaign, returned by {@link CampaignService#get
     * get()} only if
     *                 requested in the selector.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CampaignStats getCampaignStats() {
        return campaignStats;
    }


    /**
     * Sets the campaignStats value for this Campaign.
     * 
     * @param campaignStats   * Statistics for this campaign, returned by {@link CampaignService#get
     * get()} only if
     *                 requested in the selector.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignStats(com.google.api.ads.adwords.axis.v201306.cm.CampaignStats campaignStats) {
        this.campaignStats = campaignStats;
    }


    /**
     * Gets the adServingOptimizationStatus value for this Campaign.
     * 
     * @return adServingOptimizationStatus   * Ad serving optimization status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdServingOptimizationStatus".</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdServingOptimizationStatus getAdServingOptimizationStatus() {
        return adServingOptimizationStatus;
    }


    /**
     * Sets the adServingOptimizationStatus value for this Campaign.
     * 
     * @param adServingOptimizationStatus   * Ad serving optimization status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdServingOptimizationStatus".</span>
     */
    public void setAdServingOptimizationStatus(com.google.api.ads.adwords.axis.v201306.cm.AdServingOptimizationStatus adServingOptimizationStatus) {
        this.adServingOptimizationStatus = adServingOptimizationStatus;
    }


    /**
     * Gets the frequencyCap value for this Campaign.
     * 
     * @return frequencyCap   * Frequency cap for this campaign.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FrequencyCap getFrequencyCap() {
        return frequencyCap;
    }


    /**
     * Sets the frequencyCap value for this Campaign.
     * 
     * @param frequencyCap   * Frequency cap for this campaign.
     */
    public void setFrequencyCap(com.google.api.ads.adwords.axis.v201306.cm.FrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
    }


    /**
     * Gets the settings value for this Campaign.
     * 
     * @return settings   * List of settings for the campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Settings".</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Setting[] getSettings() {
        return settings;
    }


    /**
     * Sets the settings value for this Campaign.
     * 
     * @param settings   * List of settings for the campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Settings".</span>
     */
    public void setSettings(com.google.api.ads.adwords.axis.v201306.cm.Setting[] settings) {
        this.settings = settings;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.Setting getSettings(int i) {
        return this.settings[i];
    }

    public void setSettings(int i, com.google.api.ads.adwords.axis.v201306.cm.Setting _value) {
        this.settings[i] = _value;
    }


    /**
     * Gets the networkSetting value for this Campaign.
     * 
     * @return networkSetting   * Network settings for the campaign indicating where the campaign
     * will serve.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.NetworkSetting getNetworkSetting() {
        return networkSetting;
    }


    /**
     * Sets the networkSetting value for this Campaign.
     * 
     * @param networkSetting   * Network settings for the campaign indicating where the campaign
     * will serve.
     */
    public void setNetworkSetting(com.google.api.ads.adwords.axis.v201306.cm.NetworkSetting networkSetting) {
        this.networkSetting = networkSetting;
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
    public com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
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
    public void setBiddingStrategyConfiguration(com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration biddingStrategyConfiguration) {
        this.biddingStrategyConfiguration = biddingStrategyConfiguration;
    }


    /**
     * Gets the forwardCompatibilityMap value for this Campaign.
     * 
     * @return forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this Campaign.
     * 
     * @param forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }


    /**
     * Gets the enhanced value for this Campaign.
     * 
     * @return enhanced   * Indicates if a campaign is an enhanced campaign.
     *                 
     *                 New campaigns are created as enhanced by default.
     * Once set to {@code true},
     *                 this value cannot be set to {@code false}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Enhanced".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getEnhanced() {
        return enhanced;
    }


    /**
     * Sets the enhanced value for this Campaign.
     * 
     * @param enhanced   * Indicates if a campaign is an enhanced campaign.
     *                 
     *                 New campaigns are created as enhanced by default.
     * Once set to {@code true},
     *                 this value cannot be set to {@code false}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Enhanced".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setEnhanced(java.lang.Boolean enhanced) {
        this.enhanced = enhanced;
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
            ((this.campaignStats==null && other.getCampaignStats()==null) || 
             (this.campaignStats!=null &&
              this.campaignStats.equals(other.getCampaignStats()))) &&
            ((this.adServingOptimizationStatus==null && other.getAdServingOptimizationStatus()==null) || 
             (this.adServingOptimizationStatus!=null &&
              this.adServingOptimizationStatus.equals(other.getAdServingOptimizationStatus()))) &&
            ((this.frequencyCap==null && other.getFrequencyCap()==null) || 
             (this.frequencyCap!=null &&
              this.frequencyCap.equals(other.getFrequencyCap()))) &&
            ((this.settings==null && other.getSettings()==null) || 
             (this.settings!=null &&
              java.util.Arrays.equals(this.settings, other.getSettings()))) &&
            ((this.networkSetting==null && other.getNetworkSetting()==null) || 
             (this.networkSetting!=null &&
              this.networkSetting.equals(other.getNetworkSetting()))) &&
            ((this.biddingStrategyConfiguration==null && other.getBiddingStrategyConfiguration()==null) || 
             (this.biddingStrategyConfiguration!=null &&
              this.biddingStrategyConfiguration.equals(other.getBiddingStrategyConfiguration()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.enhanced==null && other.getEnhanced()==null) || 
             (this.enhanced!=null &&
              this.enhanced.equals(other.getEnhanced())));
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
        if (getCampaignStats() != null) {
            _hashCode += getCampaignStats().hashCode();
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
        if (getNetworkSetting() != null) {
            _hashCode += getNetworkSetting().hashCode();
        }
        if (getBiddingStrategyConfiguration() != null) {
            _hashCode += getBiddingStrategyConfiguration().hashCode();
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
        if (getEnhanced() != null) {
            _hashCode += getEnhanced().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Campaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Campaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "servingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "ServingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Budget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionOptimizerEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "conversionOptimizerEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "ConversionOptimizerEligibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "campaignStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adServingOptimizationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "adServingOptimizationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdServingOptimizationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "frequencyCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Setting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "networkSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "NetworkSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "biddingStrategyConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "BiddingStrategyConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "String_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhanced");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "enhanced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
