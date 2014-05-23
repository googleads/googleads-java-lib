/**
 * VideoEntityStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Statistics about video API entities.
 */
public class VideoEntityStats  implements java.io.Serializable {
    /* The type of summary rollup that this is, if present
     *                 in a summary stats list.  Null if not part of a rollup. */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStatsSummaryType summaryType;

    /* The segment which the stats are for. */
    private com.google.api.ads.adwords.axis.v201402.video.SegmentKey segmentKey;

    /* Start date (inclusive) of the statistics.
     *                 The format for the date is YYYYMMDD. */
    private java.lang.String startDate;

    /* End date (inclusive) of the statistics.
     *                 The format for the date is YYYYMMDD. */
    private java.lang.String endDate;

    /* Number of views.
     *                 
     *                 Views are a segmented subset of clicks. The definition
     * of a view varies
     *                 for each format. For instance, for promoted video
     * ads, a view might be
     *                 defined as 'watching 5 seconds of the video after
     * clicking on an ad'. */
    private java.lang.Long views;

    /* Cost. */
    private com.google.api.ads.adwords.axis.v201402.cm.Money cost;

    /* Cost per click. */
    private com.google.api.ads.adwords.axis.v201402.cm.Money averageCpc;

    /* Cost per view. */
    private com.google.api.ads.adwords.axis.v201402.cm.Money averageCpv;

    /* Cost per mille. */
    private com.google.api.ads.adwords.axis.v201402.cm.Money averageCpm;

    /* Number of unique user (ie., cookies) reached by frequency (for
     * impression events). */
    private com.google.api.ads.adwords.axis.v201402.video.Integer_LongMapEntry[] impressionReachFrequencies;

    /* Average number of unique user (ie., cookies) reached (for impression
     * events). */
    private java.lang.Double averageImpressionFrequency;

    /* Average number of unique user (ie., cookies) reached (for view
     * events). */
    private java.lang.Double averageViewFrequency;

    /* Number of people (ie., cookies) reached (for view events). */
    private java.lang.Long uniqueViews;

    /* Number of thumbnail impressions as recorded by AdWords. */
    private java.lang.Long thumbnailImpressions;

    /* Number of video impressions as recorded by AdWords. */
    private java.lang.Long videoImpressions;

    /* Number of total impressions, as recorded by AdWords. */
    private java.lang.Long totalImpressions;

    /* Number of website clicks as recorded by AdWords. */
    private java.lang.Long websiteClicks;

    /* Number of conversions as recorded by AdWords. */
    private java.lang.Long conversions;

    private com.google.api.ads.adwords.axis.v201402.cm.Money costPerConversion;

    /* Percentage of clicks that convert. */
    private java.lang.Double conversionRate;

    /* Conversions that result from impressions rather than clicks. */
    private java.lang.Long viewThroughConversions;

    /* Number of conversions, allowing many per view, as recorded
     * by AdWords. */
    private java.lang.Long conversionsManyPerView;

    /* Cost per conversion, allowing many conversions per view, as
     * recorded by AdWords. */
    private com.google.api.ads.adwords.axis.v201402.cm.Money costPerConversionManyPerView;

    /* Percentage of clicks that convert, allowing many conversions
     * per view. */
    private java.lang.Double conversionRateManyPerView;

    /* Total conversion value as recorded by AdWords. */
    private java.lang.Double totalConversionValue;

    /* Value per conversion as recorded by AdWords. */
    private java.lang.Double valuePerConv;

    /* Value per conversion, allowing many conversions per view, as
     * recorded by AdWords. */
    private java.lang.Double valuePerConvManyPerView;

    /* Number of follow on views */
    private java.lang.Long followOnViews;

    /* Percent of views that result in a follow on view */
    private java.lang.Double followOnViewRate;

    /* Number of follow on subscribes */
    private java.lang.Long followOnSubscribes;

    /* Percent of views that result in a follow on subscribe */
    private java.lang.Double followOnSubscribeRate;

    /* Number of follow on likes */
    private java.lang.Long followOnLikes;

    /* Number of follow on comments */
    private java.lang.Long followOnComments;

    /* Number of follow on shares */
    private java.lang.Long followOnShares;

    /* Number of follow on add-to-playlist */
    private java.lang.Long followOnAddToPlaylist;

    /* Click through rate. */
    private java.lang.Double ctr;

    /* View through rate. */
    private java.lang.Double vtr;

    /* Number of times the video started playing. */
    private java.lang.Long videoStarts;

    /* Number of times the 25% mark of the video was reached. */
    private java.lang.Long quartile25S;

    /* Number of times the 50% mark of the video was reached. */
    private java.lang.Long quartile50S;

    /* Number of times the 75% mark of the video was reached. */
    private java.lang.Long quartile75S;

    /* Number of times the 100% mark of the video was reached. */
    private java.lang.Long quartile100S;

    /* Percentage of views that reached the 25% mark of the video. */
    private java.lang.Double quartile25Percents;

    /* Percentage of views that reached the 50% mark of the video. */
    private java.lang.Double quartile50Percents;

    /* Percentage of views that reached the 75% mark of the video. */
    private java.lang.Double quartile75Percents;

    /* Percentage of views that reached the 100% mark of the video. */
    private java.lang.Double quartile100Percents;

    /* Percent served. */
    private java.lang.Double percentServed;

    /* Clicks that are eligible for follow on conversions. Used to
     * compute FOC conversion rates. */
    private java.lang.Long eligibleFollowOnClicks;

    /* Score calculated by dividing all follow on actions by eligible
     * follow on clicks. */
    private java.lang.Double engagementScore;

    /* Score calculated as an average between all the quartile percentages. */
    private java.lang.Double retentionScore;

    /* Number of total views. */
    private java.lang.Long totalViews;

    /* Number of impressions of call-to-action (aka. CTA or annotations). */
    private java.lang.Long ctaImpressions;

    /* Number of call-to-action clicks. */
    private java.lang.Long ctaClicks;

    /* Call-to-action click through rate. */
    private java.lang.Double ctaCtr;

    public VideoEntityStats() {
    }

    public VideoEntityStats(
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStatsSummaryType summaryType,
           com.google.api.ads.adwords.axis.v201402.video.SegmentKey segmentKey,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Long views,
           com.google.api.ads.adwords.axis.v201402.cm.Money cost,
           com.google.api.ads.adwords.axis.v201402.cm.Money averageCpc,
           com.google.api.ads.adwords.axis.v201402.cm.Money averageCpv,
           com.google.api.ads.adwords.axis.v201402.cm.Money averageCpm,
           com.google.api.ads.adwords.axis.v201402.video.Integer_LongMapEntry[] impressionReachFrequencies,
           java.lang.Double averageImpressionFrequency,
           java.lang.Double averageViewFrequency,
           java.lang.Long uniqueViews,
           java.lang.Long thumbnailImpressions,
           java.lang.Long videoImpressions,
           java.lang.Long totalImpressions,
           java.lang.Long websiteClicks,
           java.lang.Long conversions,
           com.google.api.ads.adwords.axis.v201402.cm.Money costPerConversion,
           java.lang.Double conversionRate,
           java.lang.Long viewThroughConversions,
           java.lang.Long conversionsManyPerView,
           com.google.api.ads.adwords.axis.v201402.cm.Money costPerConversionManyPerView,
           java.lang.Double conversionRateManyPerView,
           java.lang.Double totalConversionValue,
           java.lang.Double valuePerConv,
           java.lang.Double valuePerConvManyPerView,
           java.lang.Long followOnViews,
           java.lang.Double followOnViewRate,
           java.lang.Long followOnSubscribes,
           java.lang.Double followOnSubscribeRate,
           java.lang.Long followOnLikes,
           java.lang.Long followOnComments,
           java.lang.Long followOnShares,
           java.lang.Long followOnAddToPlaylist,
           java.lang.Double ctr,
           java.lang.Double vtr,
           java.lang.Long videoStarts,
           java.lang.Long quartile25S,
           java.lang.Long quartile50S,
           java.lang.Long quartile75S,
           java.lang.Long quartile100S,
           java.lang.Double quartile25Percents,
           java.lang.Double quartile50Percents,
           java.lang.Double quartile75Percents,
           java.lang.Double quartile100Percents,
           java.lang.Double percentServed,
           java.lang.Long eligibleFollowOnClicks,
           java.lang.Double engagementScore,
           java.lang.Double retentionScore,
           java.lang.Long totalViews,
           java.lang.Long ctaImpressions,
           java.lang.Long ctaClicks,
           java.lang.Double ctaCtr) {
           this.summaryType = summaryType;
           this.segmentKey = segmentKey;
           this.startDate = startDate;
           this.endDate = endDate;
           this.views = views;
           this.cost = cost;
           this.averageCpc = averageCpc;
           this.averageCpv = averageCpv;
           this.averageCpm = averageCpm;
           this.impressionReachFrequencies = impressionReachFrequencies;
           this.averageImpressionFrequency = averageImpressionFrequency;
           this.averageViewFrequency = averageViewFrequency;
           this.uniqueViews = uniqueViews;
           this.thumbnailImpressions = thumbnailImpressions;
           this.videoImpressions = videoImpressions;
           this.totalImpressions = totalImpressions;
           this.websiteClicks = websiteClicks;
           this.conversions = conversions;
           this.costPerConversion = costPerConversion;
           this.conversionRate = conversionRate;
           this.viewThroughConversions = viewThroughConversions;
           this.conversionsManyPerView = conversionsManyPerView;
           this.costPerConversionManyPerView = costPerConversionManyPerView;
           this.conversionRateManyPerView = conversionRateManyPerView;
           this.totalConversionValue = totalConversionValue;
           this.valuePerConv = valuePerConv;
           this.valuePerConvManyPerView = valuePerConvManyPerView;
           this.followOnViews = followOnViews;
           this.followOnViewRate = followOnViewRate;
           this.followOnSubscribes = followOnSubscribes;
           this.followOnSubscribeRate = followOnSubscribeRate;
           this.followOnLikes = followOnLikes;
           this.followOnComments = followOnComments;
           this.followOnShares = followOnShares;
           this.followOnAddToPlaylist = followOnAddToPlaylist;
           this.ctr = ctr;
           this.vtr = vtr;
           this.videoStarts = videoStarts;
           this.quartile25S = quartile25S;
           this.quartile50S = quartile50S;
           this.quartile75S = quartile75S;
           this.quartile100S = quartile100S;
           this.quartile25Percents = quartile25Percents;
           this.quartile50Percents = quartile50Percents;
           this.quartile75Percents = quartile75Percents;
           this.quartile100Percents = quartile100Percents;
           this.percentServed = percentServed;
           this.eligibleFollowOnClicks = eligibleFollowOnClicks;
           this.engagementScore = engagementScore;
           this.retentionScore = retentionScore;
           this.totalViews = totalViews;
           this.ctaImpressions = ctaImpressions;
           this.ctaClicks = ctaClicks;
           this.ctaCtr = ctaCtr;
    }


    /**
     * Gets the summaryType value for this VideoEntityStats.
     * 
     * @return summaryType   * The type of summary rollup that this is, if present
     *                 in a summary stats list.  Null if not part of a rollup.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStatsSummaryType getSummaryType() {
        return summaryType;
    }


    /**
     * Sets the summaryType value for this VideoEntityStats.
     * 
     * @param summaryType   * The type of summary rollup that this is, if present
     *                 in a summary stats list.  Null if not part of a rollup.
     */
    public void setSummaryType(com.google.api.ads.adwords.axis.v201402.video.VideoEntityStatsSummaryType summaryType) {
        this.summaryType = summaryType;
    }


    /**
     * Gets the segmentKey value for this VideoEntityStats.
     * 
     * @return segmentKey   * The segment which the stats are for.
     */
    public com.google.api.ads.adwords.axis.v201402.video.SegmentKey getSegmentKey() {
        return segmentKey;
    }


    /**
     * Sets the segmentKey value for this VideoEntityStats.
     * 
     * @param segmentKey   * The segment which the stats are for.
     */
    public void setSegmentKey(com.google.api.ads.adwords.axis.v201402.video.SegmentKey segmentKey) {
        this.segmentKey = segmentKey;
    }


    /**
     * Gets the startDate value for this VideoEntityStats.
     * 
     * @return startDate   * Start date (inclusive) of the statistics.
     *                 The format for the date is YYYYMMDD.
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this VideoEntityStats.
     * 
     * @param startDate   * Start date (inclusive) of the statistics.
     *                 The format for the date is YYYYMMDD.
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this VideoEntityStats.
     * 
     * @return endDate   * End date (inclusive) of the statistics.
     *                 The format for the date is YYYYMMDD.
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this VideoEntityStats.
     * 
     * @param endDate   * End date (inclusive) of the statistics.
     *                 The format for the date is YYYYMMDD.
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the views value for this VideoEntityStats.
     * 
     * @return views   * Number of views.
     *                 
     *                 Views are a segmented subset of clicks. The definition
     * of a view varies
     *                 for each format. For instance, for promoted video
     * ads, a view might be
     *                 defined as 'watching 5 seconds of the video after
     * clicking on an ad'.
     */
    public java.lang.Long getViews() {
        return views;
    }


    /**
     * Sets the views value for this VideoEntityStats.
     * 
     * @param views   * Number of views.
     *                 
     *                 Views are a segmented subset of clicks. The definition
     * of a view varies
     *                 for each format. For instance, for promoted video
     * ads, a view might be
     *                 defined as 'watching 5 seconds of the video after
     * clicking on an ad'.
     */
    public void setViews(java.lang.Long views) {
        this.views = views;
    }


    /**
     * Gets the cost value for this VideoEntityStats.
     * 
     * @return cost   * Cost.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this VideoEntityStats.
     * 
     * @param cost   * Cost.
     */
    public void setCost(com.google.api.ads.adwords.axis.v201402.cm.Money cost) {
        this.cost = cost;
    }


    /**
     * Gets the averageCpc value for this VideoEntityStats.
     * 
     * @return averageCpc   * Cost per click.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getAverageCpc() {
        return averageCpc;
    }


    /**
     * Sets the averageCpc value for this VideoEntityStats.
     * 
     * @param averageCpc   * Cost per click.
     */
    public void setAverageCpc(com.google.api.ads.adwords.axis.v201402.cm.Money averageCpc) {
        this.averageCpc = averageCpc;
    }


    /**
     * Gets the averageCpv value for this VideoEntityStats.
     * 
     * @return averageCpv   * Cost per view.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getAverageCpv() {
        return averageCpv;
    }


    /**
     * Sets the averageCpv value for this VideoEntityStats.
     * 
     * @param averageCpv   * Cost per view.
     */
    public void setAverageCpv(com.google.api.ads.adwords.axis.v201402.cm.Money averageCpv) {
        this.averageCpv = averageCpv;
    }


    /**
     * Gets the averageCpm value for this VideoEntityStats.
     * 
     * @return averageCpm   * Cost per mille.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getAverageCpm() {
        return averageCpm;
    }


    /**
     * Sets the averageCpm value for this VideoEntityStats.
     * 
     * @param averageCpm   * Cost per mille.
     */
    public void setAverageCpm(com.google.api.ads.adwords.axis.v201402.cm.Money averageCpm) {
        this.averageCpm = averageCpm;
    }


    /**
     * Gets the impressionReachFrequencies value for this VideoEntityStats.
     * 
     * @return impressionReachFrequencies   * Number of unique user (ie., cookies) reached by frequency (for
     * impression events).
     */
    public com.google.api.ads.adwords.axis.v201402.video.Integer_LongMapEntry[] getImpressionReachFrequencies() {
        return impressionReachFrequencies;
    }


    /**
     * Sets the impressionReachFrequencies value for this VideoEntityStats.
     * 
     * @param impressionReachFrequencies   * Number of unique user (ie., cookies) reached by frequency (for
     * impression events).
     */
    public void setImpressionReachFrequencies(com.google.api.ads.adwords.axis.v201402.video.Integer_LongMapEntry[] impressionReachFrequencies) {
        this.impressionReachFrequencies = impressionReachFrequencies;
    }

    public com.google.api.ads.adwords.axis.v201402.video.Integer_LongMapEntry getImpressionReachFrequencies(int i) {
        return this.impressionReachFrequencies[i];
    }

    public void setImpressionReachFrequencies(int i, com.google.api.ads.adwords.axis.v201402.video.Integer_LongMapEntry _value) {
        this.impressionReachFrequencies[i] = _value;
    }


    /**
     * Gets the averageImpressionFrequency value for this VideoEntityStats.
     * 
     * @return averageImpressionFrequency   * Average number of unique user (ie., cookies) reached (for impression
     * events).
     */
    public java.lang.Double getAverageImpressionFrequency() {
        return averageImpressionFrequency;
    }


    /**
     * Sets the averageImpressionFrequency value for this VideoEntityStats.
     * 
     * @param averageImpressionFrequency   * Average number of unique user (ie., cookies) reached (for impression
     * events).
     */
    public void setAverageImpressionFrequency(java.lang.Double averageImpressionFrequency) {
        this.averageImpressionFrequency = averageImpressionFrequency;
    }


    /**
     * Gets the averageViewFrequency value for this VideoEntityStats.
     * 
     * @return averageViewFrequency   * Average number of unique user (ie., cookies) reached (for view
     * events).
     */
    public java.lang.Double getAverageViewFrequency() {
        return averageViewFrequency;
    }


    /**
     * Sets the averageViewFrequency value for this VideoEntityStats.
     * 
     * @param averageViewFrequency   * Average number of unique user (ie., cookies) reached (for view
     * events).
     */
    public void setAverageViewFrequency(java.lang.Double averageViewFrequency) {
        this.averageViewFrequency = averageViewFrequency;
    }


    /**
     * Gets the uniqueViews value for this VideoEntityStats.
     * 
     * @return uniqueViews   * Number of people (ie., cookies) reached (for view events).
     */
    public java.lang.Long getUniqueViews() {
        return uniqueViews;
    }


    /**
     * Sets the uniqueViews value for this VideoEntityStats.
     * 
     * @param uniqueViews   * Number of people (ie., cookies) reached (for view events).
     */
    public void setUniqueViews(java.lang.Long uniqueViews) {
        this.uniqueViews = uniqueViews;
    }


    /**
     * Gets the thumbnailImpressions value for this VideoEntityStats.
     * 
     * @return thumbnailImpressions   * Number of thumbnail impressions as recorded by AdWords.
     */
    public java.lang.Long getThumbnailImpressions() {
        return thumbnailImpressions;
    }


    /**
     * Sets the thumbnailImpressions value for this VideoEntityStats.
     * 
     * @param thumbnailImpressions   * Number of thumbnail impressions as recorded by AdWords.
     */
    public void setThumbnailImpressions(java.lang.Long thumbnailImpressions) {
        this.thumbnailImpressions = thumbnailImpressions;
    }


    /**
     * Gets the videoImpressions value for this VideoEntityStats.
     * 
     * @return videoImpressions   * Number of video impressions as recorded by AdWords.
     */
    public java.lang.Long getVideoImpressions() {
        return videoImpressions;
    }


    /**
     * Sets the videoImpressions value for this VideoEntityStats.
     * 
     * @param videoImpressions   * Number of video impressions as recorded by AdWords.
     */
    public void setVideoImpressions(java.lang.Long videoImpressions) {
        this.videoImpressions = videoImpressions;
    }


    /**
     * Gets the totalImpressions value for this VideoEntityStats.
     * 
     * @return totalImpressions   * Number of total impressions, as recorded by AdWords.
     */
    public java.lang.Long getTotalImpressions() {
        return totalImpressions;
    }


    /**
     * Sets the totalImpressions value for this VideoEntityStats.
     * 
     * @param totalImpressions   * Number of total impressions, as recorded by AdWords.
     */
    public void setTotalImpressions(java.lang.Long totalImpressions) {
        this.totalImpressions = totalImpressions;
    }


    /**
     * Gets the websiteClicks value for this VideoEntityStats.
     * 
     * @return websiteClicks   * Number of website clicks as recorded by AdWords.
     */
    public java.lang.Long getWebsiteClicks() {
        return websiteClicks;
    }


    /**
     * Sets the websiteClicks value for this VideoEntityStats.
     * 
     * @param websiteClicks   * Number of website clicks as recorded by AdWords.
     */
    public void setWebsiteClicks(java.lang.Long websiteClicks) {
        this.websiteClicks = websiteClicks;
    }


    /**
     * Gets the conversions value for this VideoEntityStats.
     * 
     * @return conversions   * Number of conversions as recorded by AdWords.
     */
    public java.lang.Long getConversions() {
        return conversions;
    }


    /**
     * Sets the conversions value for this VideoEntityStats.
     * 
     * @param conversions   * Number of conversions as recorded by AdWords.
     */
    public void setConversions(java.lang.Long conversions) {
        this.conversions = conversions;
    }


    /**
     * Gets the costPerConversion value for this VideoEntityStats.
     * 
     * @return costPerConversion
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getCostPerConversion() {
        return costPerConversion;
    }


    /**
     * Sets the costPerConversion value for this VideoEntityStats.
     * 
     * @param costPerConversion
     */
    public void setCostPerConversion(com.google.api.ads.adwords.axis.v201402.cm.Money costPerConversion) {
        this.costPerConversion = costPerConversion;
    }


    /**
     * Gets the conversionRate value for this VideoEntityStats.
     * 
     * @return conversionRate   * Percentage of clicks that convert.
     */
    public java.lang.Double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this VideoEntityStats.
     * 
     * @param conversionRate   * Percentage of clicks that convert.
     */
    public void setConversionRate(java.lang.Double conversionRate) {
        this.conversionRate = conversionRate;
    }


    /**
     * Gets the viewThroughConversions value for this VideoEntityStats.
     * 
     * @return viewThroughConversions   * Conversions that result from impressions rather than clicks.
     */
    public java.lang.Long getViewThroughConversions() {
        return viewThroughConversions;
    }


    /**
     * Sets the viewThroughConversions value for this VideoEntityStats.
     * 
     * @param viewThroughConversions   * Conversions that result from impressions rather than clicks.
     */
    public void setViewThroughConversions(java.lang.Long viewThroughConversions) {
        this.viewThroughConversions = viewThroughConversions;
    }


    /**
     * Gets the conversionsManyPerView value for this VideoEntityStats.
     * 
     * @return conversionsManyPerView   * Number of conversions, allowing many per view, as recorded
     * by AdWords.
     */
    public java.lang.Long getConversionsManyPerView() {
        return conversionsManyPerView;
    }


    /**
     * Sets the conversionsManyPerView value for this VideoEntityStats.
     * 
     * @param conversionsManyPerView   * Number of conversions, allowing many per view, as recorded
     * by AdWords.
     */
    public void setConversionsManyPerView(java.lang.Long conversionsManyPerView) {
        this.conversionsManyPerView = conversionsManyPerView;
    }


    /**
     * Gets the costPerConversionManyPerView value for this VideoEntityStats.
     * 
     * @return costPerConversionManyPerView   * Cost per conversion, allowing many conversions per view, as
     * recorded by AdWords.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getCostPerConversionManyPerView() {
        return costPerConversionManyPerView;
    }


    /**
     * Sets the costPerConversionManyPerView value for this VideoEntityStats.
     * 
     * @param costPerConversionManyPerView   * Cost per conversion, allowing many conversions per view, as
     * recorded by AdWords.
     */
    public void setCostPerConversionManyPerView(com.google.api.ads.adwords.axis.v201402.cm.Money costPerConversionManyPerView) {
        this.costPerConversionManyPerView = costPerConversionManyPerView;
    }


    /**
     * Gets the conversionRateManyPerView value for this VideoEntityStats.
     * 
     * @return conversionRateManyPerView   * Percentage of clicks that convert, allowing many conversions
     * per view.
     */
    public java.lang.Double getConversionRateManyPerView() {
        return conversionRateManyPerView;
    }


    /**
     * Sets the conversionRateManyPerView value for this VideoEntityStats.
     * 
     * @param conversionRateManyPerView   * Percentage of clicks that convert, allowing many conversions
     * per view.
     */
    public void setConversionRateManyPerView(java.lang.Double conversionRateManyPerView) {
        this.conversionRateManyPerView = conversionRateManyPerView;
    }


    /**
     * Gets the totalConversionValue value for this VideoEntityStats.
     * 
     * @return totalConversionValue   * Total conversion value as recorded by AdWords.
     */
    public java.lang.Double getTotalConversionValue() {
        return totalConversionValue;
    }


    /**
     * Sets the totalConversionValue value for this VideoEntityStats.
     * 
     * @param totalConversionValue   * Total conversion value as recorded by AdWords.
     */
    public void setTotalConversionValue(java.lang.Double totalConversionValue) {
        this.totalConversionValue = totalConversionValue;
    }


    /**
     * Gets the valuePerConv value for this VideoEntityStats.
     * 
     * @return valuePerConv   * Value per conversion as recorded by AdWords.
     */
    public java.lang.Double getValuePerConv() {
        return valuePerConv;
    }


    /**
     * Sets the valuePerConv value for this VideoEntityStats.
     * 
     * @param valuePerConv   * Value per conversion as recorded by AdWords.
     */
    public void setValuePerConv(java.lang.Double valuePerConv) {
        this.valuePerConv = valuePerConv;
    }


    /**
     * Gets the valuePerConvManyPerView value for this VideoEntityStats.
     * 
     * @return valuePerConvManyPerView   * Value per conversion, allowing many conversions per view, as
     * recorded by AdWords.
     */
    public java.lang.Double getValuePerConvManyPerView() {
        return valuePerConvManyPerView;
    }


    /**
     * Sets the valuePerConvManyPerView value for this VideoEntityStats.
     * 
     * @param valuePerConvManyPerView   * Value per conversion, allowing many conversions per view, as
     * recorded by AdWords.
     */
    public void setValuePerConvManyPerView(java.lang.Double valuePerConvManyPerView) {
        this.valuePerConvManyPerView = valuePerConvManyPerView;
    }


    /**
     * Gets the followOnViews value for this VideoEntityStats.
     * 
     * @return followOnViews   * Number of follow on views
     */
    public java.lang.Long getFollowOnViews() {
        return followOnViews;
    }


    /**
     * Sets the followOnViews value for this VideoEntityStats.
     * 
     * @param followOnViews   * Number of follow on views
     */
    public void setFollowOnViews(java.lang.Long followOnViews) {
        this.followOnViews = followOnViews;
    }


    /**
     * Gets the followOnViewRate value for this VideoEntityStats.
     * 
     * @return followOnViewRate   * Percent of views that result in a follow on view
     */
    public java.lang.Double getFollowOnViewRate() {
        return followOnViewRate;
    }


    /**
     * Sets the followOnViewRate value for this VideoEntityStats.
     * 
     * @param followOnViewRate   * Percent of views that result in a follow on view
     */
    public void setFollowOnViewRate(java.lang.Double followOnViewRate) {
        this.followOnViewRate = followOnViewRate;
    }


    /**
     * Gets the followOnSubscribes value for this VideoEntityStats.
     * 
     * @return followOnSubscribes   * Number of follow on subscribes
     */
    public java.lang.Long getFollowOnSubscribes() {
        return followOnSubscribes;
    }


    /**
     * Sets the followOnSubscribes value for this VideoEntityStats.
     * 
     * @param followOnSubscribes   * Number of follow on subscribes
     */
    public void setFollowOnSubscribes(java.lang.Long followOnSubscribes) {
        this.followOnSubscribes = followOnSubscribes;
    }


    /**
     * Gets the followOnSubscribeRate value for this VideoEntityStats.
     * 
     * @return followOnSubscribeRate   * Percent of views that result in a follow on subscribe
     */
    public java.lang.Double getFollowOnSubscribeRate() {
        return followOnSubscribeRate;
    }


    /**
     * Sets the followOnSubscribeRate value for this VideoEntityStats.
     * 
     * @param followOnSubscribeRate   * Percent of views that result in a follow on subscribe
     */
    public void setFollowOnSubscribeRate(java.lang.Double followOnSubscribeRate) {
        this.followOnSubscribeRate = followOnSubscribeRate;
    }


    /**
     * Gets the followOnLikes value for this VideoEntityStats.
     * 
     * @return followOnLikes   * Number of follow on likes
     */
    public java.lang.Long getFollowOnLikes() {
        return followOnLikes;
    }


    /**
     * Sets the followOnLikes value for this VideoEntityStats.
     * 
     * @param followOnLikes   * Number of follow on likes
     */
    public void setFollowOnLikes(java.lang.Long followOnLikes) {
        this.followOnLikes = followOnLikes;
    }


    /**
     * Gets the followOnComments value for this VideoEntityStats.
     * 
     * @return followOnComments   * Number of follow on comments
     */
    public java.lang.Long getFollowOnComments() {
        return followOnComments;
    }


    /**
     * Sets the followOnComments value for this VideoEntityStats.
     * 
     * @param followOnComments   * Number of follow on comments
     */
    public void setFollowOnComments(java.lang.Long followOnComments) {
        this.followOnComments = followOnComments;
    }


    /**
     * Gets the followOnShares value for this VideoEntityStats.
     * 
     * @return followOnShares   * Number of follow on shares
     */
    public java.lang.Long getFollowOnShares() {
        return followOnShares;
    }


    /**
     * Sets the followOnShares value for this VideoEntityStats.
     * 
     * @param followOnShares   * Number of follow on shares
     */
    public void setFollowOnShares(java.lang.Long followOnShares) {
        this.followOnShares = followOnShares;
    }


    /**
     * Gets the followOnAddToPlaylist value for this VideoEntityStats.
     * 
     * @return followOnAddToPlaylist   * Number of follow on add-to-playlist
     */
    public java.lang.Long getFollowOnAddToPlaylist() {
        return followOnAddToPlaylist;
    }


    /**
     * Sets the followOnAddToPlaylist value for this VideoEntityStats.
     * 
     * @param followOnAddToPlaylist   * Number of follow on add-to-playlist
     */
    public void setFollowOnAddToPlaylist(java.lang.Long followOnAddToPlaylist) {
        this.followOnAddToPlaylist = followOnAddToPlaylist;
    }


    /**
     * Gets the ctr value for this VideoEntityStats.
     * 
     * @return ctr   * Click through rate.
     */
    public java.lang.Double getCtr() {
        return ctr;
    }


    /**
     * Sets the ctr value for this VideoEntityStats.
     * 
     * @param ctr   * Click through rate.
     */
    public void setCtr(java.lang.Double ctr) {
        this.ctr = ctr;
    }


    /**
     * Gets the vtr value for this VideoEntityStats.
     * 
     * @return vtr   * View through rate.
     */
    public java.lang.Double getVtr() {
        return vtr;
    }


    /**
     * Sets the vtr value for this VideoEntityStats.
     * 
     * @param vtr   * View through rate.
     */
    public void setVtr(java.lang.Double vtr) {
        this.vtr = vtr;
    }


    /**
     * Gets the videoStarts value for this VideoEntityStats.
     * 
     * @return videoStarts   * Number of times the video started playing.
     */
    public java.lang.Long getVideoStarts() {
        return videoStarts;
    }


    /**
     * Sets the videoStarts value for this VideoEntityStats.
     * 
     * @param videoStarts   * Number of times the video started playing.
     */
    public void setVideoStarts(java.lang.Long videoStarts) {
        this.videoStarts = videoStarts;
    }


    /**
     * Gets the quartile25S value for this VideoEntityStats.
     * 
     * @return quartile25S   * Number of times the 25% mark of the video was reached.
     */
    public java.lang.Long getQuartile25S() {
        return quartile25S;
    }


    /**
     * Sets the quartile25S value for this VideoEntityStats.
     * 
     * @param quartile25S   * Number of times the 25% mark of the video was reached.
     */
    public void setQuartile25S(java.lang.Long quartile25S) {
        this.quartile25S = quartile25S;
    }


    /**
     * Gets the quartile50S value for this VideoEntityStats.
     * 
     * @return quartile50S   * Number of times the 50% mark of the video was reached.
     */
    public java.lang.Long getQuartile50S() {
        return quartile50S;
    }


    /**
     * Sets the quartile50S value for this VideoEntityStats.
     * 
     * @param quartile50S   * Number of times the 50% mark of the video was reached.
     */
    public void setQuartile50S(java.lang.Long quartile50S) {
        this.quartile50S = quartile50S;
    }


    /**
     * Gets the quartile75S value for this VideoEntityStats.
     * 
     * @return quartile75S   * Number of times the 75% mark of the video was reached.
     */
    public java.lang.Long getQuartile75S() {
        return quartile75S;
    }


    /**
     * Sets the quartile75S value for this VideoEntityStats.
     * 
     * @param quartile75S   * Number of times the 75% mark of the video was reached.
     */
    public void setQuartile75S(java.lang.Long quartile75S) {
        this.quartile75S = quartile75S;
    }


    /**
     * Gets the quartile100S value for this VideoEntityStats.
     * 
     * @return quartile100S   * Number of times the 100% mark of the video was reached.
     */
    public java.lang.Long getQuartile100S() {
        return quartile100S;
    }


    /**
     * Sets the quartile100S value for this VideoEntityStats.
     * 
     * @param quartile100S   * Number of times the 100% mark of the video was reached.
     */
    public void setQuartile100S(java.lang.Long quartile100S) {
        this.quartile100S = quartile100S;
    }


    /**
     * Gets the quartile25Percents value for this VideoEntityStats.
     * 
     * @return quartile25Percents   * Percentage of views that reached the 25% mark of the video.
     */
    public java.lang.Double getQuartile25Percents() {
        return quartile25Percents;
    }


    /**
     * Sets the quartile25Percents value for this VideoEntityStats.
     * 
     * @param quartile25Percents   * Percentage of views that reached the 25% mark of the video.
     */
    public void setQuartile25Percents(java.lang.Double quartile25Percents) {
        this.quartile25Percents = quartile25Percents;
    }


    /**
     * Gets the quartile50Percents value for this VideoEntityStats.
     * 
     * @return quartile50Percents   * Percentage of views that reached the 50% mark of the video.
     */
    public java.lang.Double getQuartile50Percents() {
        return quartile50Percents;
    }


    /**
     * Sets the quartile50Percents value for this VideoEntityStats.
     * 
     * @param quartile50Percents   * Percentage of views that reached the 50% mark of the video.
     */
    public void setQuartile50Percents(java.lang.Double quartile50Percents) {
        this.quartile50Percents = quartile50Percents;
    }


    /**
     * Gets the quartile75Percents value for this VideoEntityStats.
     * 
     * @return quartile75Percents   * Percentage of views that reached the 75% mark of the video.
     */
    public java.lang.Double getQuartile75Percents() {
        return quartile75Percents;
    }


    /**
     * Sets the quartile75Percents value for this VideoEntityStats.
     * 
     * @param quartile75Percents   * Percentage of views that reached the 75% mark of the video.
     */
    public void setQuartile75Percents(java.lang.Double quartile75Percents) {
        this.quartile75Percents = quartile75Percents;
    }


    /**
     * Gets the quartile100Percents value for this VideoEntityStats.
     * 
     * @return quartile100Percents   * Percentage of views that reached the 100% mark of the video.
     */
    public java.lang.Double getQuartile100Percents() {
        return quartile100Percents;
    }


    /**
     * Sets the quartile100Percents value for this VideoEntityStats.
     * 
     * @param quartile100Percents   * Percentage of views that reached the 100% mark of the video.
     */
    public void setQuartile100Percents(java.lang.Double quartile100Percents) {
        this.quartile100Percents = quartile100Percents;
    }


    /**
     * Gets the percentServed value for this VideoEntityStats.
     * 
     * @return percentServed   * Percent served.
     */
    public java.lang.Double getPercentServed() {
        return percentServed;
    }


    /**
     * Sets the percentServed value for this VideoEntityStats.
     * 
     * @param percentServed   * Percent served.
     */
    public void setPercentServed(java.lang.Double percentServed) {
        this.percentServed = percentServed;
    }


    /**
     * Gets the eligibleFollowOnClicks value for this VideoEntityStats.
     * 
     * @return eligibleFollowOnClicks   * Clicks that are eligible for follow on conversions. Used to
     * compute FOC conversion rates.
     */
    public java.lang.Long getEligibleFollowOnClicks() {
        return eligibleFollowOnClicks;
    }


    /**
     * Sets the eligibleFollowOnClicks value for this VideoEntityStats.
     * 
     * @param eligibleFollowOnClicks   * Clicks that are eligible for follow on conversions. Used to
     * compute FOC conversion rates.
     */
    public void setEligibleFollowOnClicks(java.lang.Long eligibleFollowOnClicks) {
        this.eligibleFollowOnClicks = eligibleFollowOnClicks;
    }


    /**
     * Gets the engagementScore value for this VideoEntityStats.
     * 
     * @return engagementScore   * Score calculated by dividing all follow on actions by eligible
     * follow on clicks.
     */
    public java.lang.Double getEngagementScore() {
        return engagementScore;
    }


    /**
     * Sets the engagementScore value for this VideoEntityStats.
     * 
     * @param engagementScore   * Score calculated by dividing all follow on actions by eligible
     * follow on clicks.
     */
    public void setEngagementScore(java.lang.Double engagementScore) {
        this.engagementScore = engagementScore;
    }


    /**
     * Gets the retentionScore value for this VideoEntityStats.
     * 
     * @return retentionScore   * Score calculated as an average between all the quartile percentages.
     */
    public java.lang.Double getRetentionScore() {
        return retentionScore;
    }


    /**
     * Sets the retentionScore value for this VideoEntityStats.
     * 
     * @param retentionScore   * Score calculated as an average between all the quartile percentages.
     */
    public void setRetentionScore(java.lang.Double retentionScore) {
        this.retentionScore = retentionScore;
    }


    /**
     * Gets the totalViews value for this VideoEntityStats.
     * 
     * @return totalViews   * Number of total views.
     */
    public java.lang.Long getTotalViews() {
        return totalViews;
    }


    /**
     * Sets the totalViews value for this VideoEntityStats.
     * 
     * @param totalViews   * Number of total views.
     */
    public void setTotalViews(java.lang.Long totalViews) {
        this.totalViews = totalViews;
    }


    /**
     * Gets the ctaImpressions value for this VideoEntityStats.
     * 
     * @return ctaImpressions   * Number of impressions of call-to-action (aka. CTA or annotations).
     */
    public java.lang.Long getCtaImpressions() {
        return ctaImpressions;
    }


    /**
     * Sets the ctaImpressions value for this VideoEntityStats.
     * 
     * @param ctaImpressions   * Number of impressions of call-to-action (aka. CTA or annotations).
     */
    public void setCtaImpressions(java.lang.Long ctaImpressions) {
        this.ctaImpressions = ctaImpressions;
    }


    /**
     * Gets the ctaClicks value for this VideoEntityStats.
     * 
     * @return ctaClicks   * Number of call-to-action clicks.
     */
    public java.lang.Long getCtaClicks() {
        return ctaClicks;
    }


    /**
     * Sets the ctaClicks value for this VideoEntityStats.
     * 
     * @param ctaClicks   * Number of call-to-action clicks.
     */
    public void setCtaClicks(java.lang.Long ctaClicks) {
        this.ctaClicks = ctaClicks;
    }


    /**
     * Gets the ctaCtr value for this VideoEntityStats.
     * 
     * @return ctaCtr   * Call-to-action click through rate.
     */
    public java.lang.Double getCtaCtr() {
        return ctaCtr;
    }


    /**
     * Sets the ctaCtr value for this VideoEntityStats.
     * 
     * @param ctaCtr   * Call-to-action click through rate.
     */
    public void setCtaCtr(java.lang.Double ctaCtr) {
        this.ctaCtr = ctaCtr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoEntityStats)) return false;
        VideoEntityStats other = (VideoEntityStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.summaryType==null && other.getSummaryType()==null) || 
             (this.summaryType!=null &&
              this.summaryType.equals(other.getSummaryType()))) &&
            ((this.segmentKey==null && other.getSegmentKey()==null) || 
             (this.segmentKey!=null &&
              this.segmentKey.equals(other.getSegmentKey()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.views==null && other.getViews()==null) || 
             (this.views!=null &&
              this.views.equals(other.getViews()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.averageCpc==null && other.getAverageCpc()==null) || 
             (this.averageCpc!=null &&
              this.averageCpc.equals(other.getAverageCpc()))) &&
            ((this.averageCpv==null && other.getAverageCpv()==null) || 
             (this.averageCpv!=null &&
              this.averageCpv.equals(other.getAverageCpv()))) &&
            ((this.averageCpm==null && other.getAverageCpm()==null) || 
             (this.averageCpm!=null &&
              this.averageCpm.equals(other.getAverageCpm()))) &&
            ((this.impressionReachFrequencies==null && other.getImpressionReachFrequencies()==null) || 
             (this.impressionReachFrequencies!=null &&
              java.util.Arrays.equals(this.impressionReachFrequencies, other.getImpressionReachFrequencies()))) &&
            ((this.averageImpressionFrequency==null && other.getAverageImpressionFrequency()==null) || 
             (this.averageImpressionFrequency!=null &&
              this.averageImpressionFrequency.equals(other.getAverageImpressionFrequency()))) &&
            ((this.averageViewFrequency==null && other.getAverageViewFrequency()==null) || 
             (this.averageViewFrequency!=null &&
              this.averageViewFrequency.equals(other.getAverageViewFrequency()))) &&
            ((this.uniqueViews==null && other.getUniqueViews()==null) || 
             (this.uniqueViews!=null &&
              this.uniqueViews.equals(other.getUniqueViews()))) &&
            ((this.thumbnailImpressions==null && other.getThumbnailImpressions()==null) || 
             (this.thumbnailImpressions!=null &&
              this.thumbnailImpressions.equals(other.getThumbnailImpressions()))) &&
            ((this.videoImpressions==null && other.getVideoImpressions()==null) || 
             (this.videoImpressions!=null &&
              this.videoImpressions.equals(other.getVideoImpressions()))) &&
            ((this.totalImpressions==null && other.getTotalImpressions()==null) || 
             (this.totalImpressions!=null &&
              this.totalImpressions.equals(other.getTotalImpressions()))) &&
            ((this.websiteClicks==null && other.getWebsiteClicks()==null) || 
             (this.websiteClicks!=null &&
              this.websiteClicks.equals(other.getWebsiteClicks()))) &&
            ((this.conversions==null && other.getConversions()==null) || 
             (this.conversions!=null &&
              this.conversions.equals(other.getConversions()))) &&
            ((this.costPerConversion==null && other.getCostPerConversion()==null) || 
             (this.costPerConversion!=null &&
              this.costPerConversion.equals(other.getCostPerConversion()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              this.conversionRate.equals(other.getConversionRate()))) &&
            ((this.viewThroughConversions==null && other.getViewThroughConversions()==null) || 
             (this.viewThroughConversions!=null &&
              this.viewThroughConversions.equals(other.getViewThroughConversions()))) &&
            ((this.conversionsManyPerView==null && other.getConversionsManyPerView()==null) || 
             (this.conversionsManyPerView!=null &&
              this.conversionsManyPerView.equals(other.getConversionsManyPerView()))) &&
            ((this.costPerConversionManyPerView==null && other.getCostPerConversionManyPerView()==null) || 
             (this.costPerConversionManyPerView!=null &&
              this.costPerConversionManyPerView.equals(other.getCostPerConversionManyPerView()))) &&
            ((this.conversionRateManyPerView==null && other.getConversionRateManyPerView()==null) || 
             (this.conversionRateManyPerView!=null &&
              this.conversionRateManyPerView.equals(other.getConversionRateManyPerView()))) &&
            ((this.totalConversionValue==null && other.getTotalConversionValue()==null) || 
             (this.totalConversionValue!=null &&
              this.totalConversionValue.equals(other.getTotalConversionValue()))) &&
            ((this.valuePerConv==null && other.getValuePerConv()==null) || 
             (this.valuePerConv!=null &&
              this.valuePerConv.equals(other.getValuePerConv()))) &&
            ((this.valuePerConvManyPerView==null && other.getValuePerConvManyPerView()==null) || 
             (this.valuePerConvManyPerView!=null &&
              this.valuePerConvManyPerView.equals(other.getValuePerConvManyPerView()))) &&
            ((this.followOnViews==null && other.getFollowOnViews()==null) || 
             (this.followOnViews!=null &&
              this.followOnViews.equals(other.getFollowOnViews()))) &&
            ((this.followOnViewRate==null && other.getFollowOnViewRate()==null) || 
             (this.followOnViewRate!=null &&
              this.followOnViewRate.equals(other.getFollowOnViewRate()))) &&
            ((this.followOnSubscribes==null && other.getFollowOnSubscribes()==null) || 
             (this.followOnSubscribes!=null &&
              this.followOnSubscribes.equals(other.getFollowOnSubscribes()))) &&
            ((this.followOnSubscribeRate==null && other.getFollowOnSubscribeRate()==null) || 
             (this.followOnSubscribeRate!=null &&
              this.followOnSubscribeRate.equals(other.getFollowOnSubscribeRate()))) &&
            ((this.followOnLikes==null && other.getFollowOnLikes()==null) || 
             (this.followOnLikes!=null &&
              this.followOnLikes.equals(other.getFollowOnLikes()))) &&
            ((this.followOnComments==null && other.getFollowOnComments()==null) || 
             (this.followOnComments!=null &&
              this.followOnComments.equals(other.getFollowOnComments()))) &&
            ((this.followOnShares==null && other.getFollowOnShares()==null) || 
             (this.followOnShares!=null &&
              this.followOnShares.equals(other.getFollowOnShares()))) &&
            ((this.followOnAddToPlaylist==null && other.getFollowOnAddToPlaylist()==null) || 
             (this.followOnAddToPlaylist!=null &&
              this.followOnAddToPlaylist.equals(other.getFollowOnAddToPlaylist()))) &&
            ((this.ctr==null && other.getCtr()==null) || 
             (this.ctr!=null &&
              this.ctr.equals(other.getCtr()))) &&
            ((this.vtr==null && other.getVtr()==null) || 
             (this.vtr!=null &&
              this.vtr.equals(other.getVtr()))) &&
            ((this.videoStarts==null && other.getVideoStarts()==null) || 
             (this.videoStarts!=null &&
              this.videoStarts.equals(other.getVideoStarts()))) &&
            ((this.quartile25S==null && other.getQuartile25S()==null) || 
             (this.quartile25S!=null &&
              this.quartile25S.equals(other.getQuartile25S()))) &&
            ((this.quartile50S==null && other.getQuartile50S()==null) || 
             (this.quartile50S!=null &&
              this.quartile50S.equals(other.getQuartile50S()))) &&
            ((this.quartile75S==null && other.getQuartile75S()==null) || 
             (this.quartile75S!=null &&
              this.quartile75S.equals(other.getQuartile75S()))) &&
            ((this.quartile100S==null && other.getQuartile100S()==null) || 
             (this.quartile100S!=null &&
              this.quartile100S.equals(other.getQuartile100S()))) &&
            ((this.quartile25Percents==null && other.getQuartile25Percents()==null) || 
             (this.quartile25Percents!=null &&
              this.quartile25Percents.equals(other.getQuartile25Percents()))) &&
            ((this.quartile50Percents==null && other.getQuartile50Percents()==null) || 
             (this.quartile50Percents!=null &&
              this.quartile50Percents.equals(other.getQuartile50Percents()))) &&
            ((this.quartile75Percents==null && other.getQuartile75Percents()==null) || 
             (this.quartile75Percents!=null &&
              this.quartile75Percents.equals(other.getQuartile75Percents()))) &&
            ((this.quartile100Percents==null && other.getQuartile100Percents()==null) || 
             (this.quartile100Percents!=null &&
              this.quartile100Percents.equals(other.getQuartile100Percents()))) &&
            ((this.percentServed==null && other.getPercentServed()==null) || 
             (this.percentServed!=null &&
              this.percentServed.equals(other.getPercentServed()))) &&
            ((this.eligibleFollowOnClicks==null && other.getEligibleFollowOnClicks()==null) || 
             (this.eligibleFollowOnClicks!=null &&
              this.eligibleFollowOnClicks.equals(other.getEligibleFollowOnClicks()))) &&
            ((this.engagementScore==null && other.getEngagementScore()==null) || 
             (this.engagementScore!=null &&
              this.engagementScore.equals(other.getEngagementScore()))) &&
            ((this.retentionScore==null && other.getRetentionScore()==null) || 
             (this.retentionScore!=null &&
              this.retentionScore.equals(other.getRetentionScore()))) &&
            ((this.totalViews==null && other.getTotalViews()==null) || 
             (this.totalViews!=null &&
              this.totalViews.equals(other.getTotalViews()))) &&
            ((this.ctaImpressions==null && other.getCtaImpressions()==null) || 
             (this.ctaImpressions!=null &&
              this.ctaImpressions.equals(other.getCtaImpressions()))) &&
            ((this.ctaClicks==null && other.getCtaClicks()==null) || 
             (this.ctaClicks!=null &&
              this.ctaClicks.equals(other.getCtaClicks()))) &&
            ((this.ctaCtr==null && other.getCtaCtr()==null) || 
             (this.ctaCtr!=null &&
              this.ctaCtr.equals(other.getCtaCtr())));
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
        if (getSummaryType() != null) {
            _hashCode += getSummaryType().hashCode();
        }
        if (getSegmentKey() != null) {
            _hashCode += getSegmentKey().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getViews() != null) {
            _hashCode += getViews().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getAverageCpc() != null) {
            _hashCode += getAverageCpc().hashCode();
        }
        if (getAverageCpv() != null) {
            _hashCode += getAverageCpv().hashCode();
        }
        if (getAverageCpm() != null) {
            _hashCode += getAverageCpm().hashCode();
        }
        if (getImpressionReachFrequencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImpressionReachFrequencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImpressionReachFrequencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAverageImpressionFrequency() != null) {
            _hashCode += getAverageImpressionFrequency().hashCode();
        }
        if (getAverageViewFrequency() != null) {
            _hashCode += getAverageViewFrequency().hashCode();
        }
        if (getUniqueViews() != null) {
            _hashCode += getUniqueViews().hashCode();
        }
        if (getThumbnailImpressions() != null) {
            _hashCode += getThumbnailImpressions().hashCode();
        }
        if (getVideoImpressions() != null) {
            _hashCode += getVideoImpressions().hashCode();
        }
        if (getTotalImpressions() != null) {
            _hashCode += getTotalImpressions().hashCode();
        }
        if (getWebsiteClicks() != null) {
            _hashCode += getWebsiteClicks().hashCode();
        }
        if (getConversions() != null) {
            _hashCode += getConversions().hashCode();
        }
        if (getCostPerConversion() != null) {
            _hashCode += getCostPerConversion().hashCode();
        }
        if (getConversionRate() != null) {
            _hashCode += getConversionRate().hashCode();
        }
        if (getViewThroughConversions() != null) {
            _hashCode += getViewThroughConversions().hashCode();
        }
        if (getConversionsManyPerView() != null) {
            _hashCode += getConversionsManyPerView().hashCode();
        }
        if (getCostPerConversionManyPerView() != null) {
            _hashCode += getCostPerConversionManyPerView().hashCode();
        }
        if (getConversionRateManyPerView() != null) {
            _hashCode += getConversionRateManyPerView().hashCode();
        }
        if (getTotalConversionValue() != null) {
            _hashCode += getTotalConversionValue().hashCode();
        }
        if (getValuePerConv() != null) {
            _hashCode += getValuePerConv().hashCode();
        }
        if (getValuePerConvManyPerView() != null) {
            _hashCode += getValuePerConvManyPerView().hashCode();
        }
        if (getFollowOnViews() != null) {
            _hashCode += getFollowOnViews().hashCode();
        }
        if (getFollowOnViewRate() != null) {
            _hashCode += getFollowOnViewRate().hashCode();
        }
        if (getFollowOnSubscribes() != null) {
            _hashCode += getFollowOnSubscribes().hashCode();
        }
        if (getFollowOnSubscribeRate() != null) {
            _hashCode += getFollowOnSubscribeRate().hashCode();
        }
        if (getFollowOnLikes() != null) {
            _hashCode += getFollowOnLikes().hashCode();
        }
        if (getFollowOnComments() != null) {
            _hashCode += getFollowOnComments().hashCode();
        }
        if (getFollowOnShares() != null) {
            _hashCode += getFollowOnShares().hashCode();
        }
        if (getFollowOnAddToPlaylist() != null) {
            _hashCode += getFollowOnAddToPlaylist().hashCode();
        }
        if (getCtr() != null) {
            _hashCode += getCtr().hashCode();
        }
        if (getVtr() != null) {
            _hashCode += getVtr().hashCode();
        }
        if (getVideoStarts() != null) {
            _hashCode += getVideoStarts().hashCode();
        }
        if (getQuartile25S() != null) {
            _hashCode += getQuartile25S().hashCode();
        }
        if (getQuartile50S() != null) {
            _hashCode += getQuartile50S().hashCode();
        }
        if (getQuartile75S() != null) {
            _hashCode += getQuartile75S().hashCode();
        }
        if (getQuartile100S() != null) {
            _hashCode += getQuartile100S().hashCode();
        }
        if (getQuartile25Percents() != null) {
            _hashCode += getQuartile25Percents().hashCode();
        }
        if (getQuartile50Percents() != null) {
            _hashCode += getQuartile50Percents().hashCode();
        }
        if (getQuartile75Percents() != null) {
            _hashCode += getQuartile75Percents().hashCode();
        }
        if (getQuartile100Percents() != null) {
            _hashCode += getQuartile100Percents().hashCode();
        }
        if (getPercentServed() != null) {
            _hashCode += getPercentServed().hashCode();
        }
        if (getEligibleFollowOnClicks() != null) {
            _hashCode += getEligibleFollowOnClicks().hashCode();
        }
        if (getEngagementScore() != null) {
            _hashCode += getEngagementScore().hashCode();
        }
        if (getRetentionScore() != null) {
            _hashCode += getRetentionScore().hashCode();
        }
        if (getTotalViews() != null) {
            _hashCode += getTotalViews().hashCode();
        }
        if (getCtaImpressions() != null) {
            _hashCode += getCtaImpressions().hashCode();
        }
        if (getCtaClicks() != null) {
            _hashCode += getCtaClicks().hashCode();
        }
        if (getCtaCtr() != null) {
            _hashCode += getCtaCtr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoEntityStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoEntityStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "summaryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoEntityStats.SummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "segmentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "SegmentKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("views");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "views"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "averageCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCpv");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "averageCpv"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCpm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "averageCpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionReachFrequencies");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "impressionReachFrequencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Integer_LongMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageImpressionFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "averageImpressionFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageViewFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "averageViewFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueViews");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "uniqueViews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbnailImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "thumbnailImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "videoImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "totalImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("websiteClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "websiteClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "conversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "costPerConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "conversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewThroughConversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "viewThroughConversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionsManyPerView");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "conversionsManyPerView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerConversionManyPerView");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "costPerConversionManyPerView"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRateManyPerView");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "conversionRateManyPerView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalConversionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "totalConversionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuePerConv");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "valuePerConv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuePerConvManyPerView");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "valuePerConvManyPerView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnViews");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnViews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnViewRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnViewRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnSubscribes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnSubscribes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnSubscribeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnSubscribeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnLikes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnLikes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnComments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnShares");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnShares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followOnAddToPlaylist");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "followOnAddToPlaylist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ctr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vtr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "vtr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoStarts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "videoStarts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile25S");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile25s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile50S");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile50s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile75S");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile75s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile100S");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile100s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile25Percents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile25Percents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile50Percents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile50Percents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile75Percents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile75Percents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quartile100Percents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "quartile100Percents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentServed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "percentServed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleFollowOnClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "eligibleFollowOnClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engagementScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "engagementScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retentionScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "retentionScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalViews");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "totalViews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctaImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ctaImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctaClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ctaClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctaCtr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ctaCtr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
