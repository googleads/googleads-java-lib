/**
 * VideoAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents a video ad, which promotes a given video in a variety
 * of display formats on a variety of networks.
 */
public class VideoAd  implements java.io.Serializable {
    /* The id of this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* The name of this VideoAd. Used as a helpful reference for the
     * advertiser,
     *                 but is not used when the ad is served.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String name;

    /* The 11-character YouTube video id of this VideoAd (e.g. 9mgjZK46_uw).
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private java.lang.String videoId;

    /* The id of the video campaign containing this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Long campaignId;

    /* All of the TargetingGroups that this VideoAd is associated
     * with.
     *                 The TargetingGroupId is paired with a status to indicate
     * if the VideoAd
     *                 is active or paused within that TargetingGroup.
     *                 On ADDs, if no associations are specified, the ad
     * will be stored in a placeholder
     *                 and will not be eligible for serving until associations
     * are added later.
     *                 On SETs, one may add additional ids to associate an
     * existing VideoAd with, or
     *                 can change the status of an existing association.
     * On SETs, associations with
     *                 TargetingGroups not specified in this list are left
     * unchanged.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociation[] targetingGroupAssociations;

    /* Statistics about this VideoAd (aggregated over all formats
     * and networks).
     *                 Always returned if statsSelector is specified, regardless
     * of segmentation.
     *                 See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats stats;

    /* Statistics about this VideoAd segmented by the dimensions indicated
     * in the
     *                 {@link StatsSelector}, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] segmentedStats;

    /* List of issues reported on this VideoAd. */
    private com.google.api.ads.adwords.axis.v201406.video.ServingInfo issues;

    /* The name of the campaign this VideoAd belongs to.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.String campaignName;

    /* The headline, or first line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display. */
    private java.lang.String headline;

    /* The second line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display. */
    private java.lang.String description1;

    /* The third line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display. */
    private java.lang.String description2;

    /* The image that accompanies this ad when rendered. */
    private com.google.api.ads.adwords.axis.v201406.video.VideoImage image;

    /* The YouTube page (watch page vs channel page) that videos
     *                 will be played back on for ad formats that direct
     * the user to YouTube. */
    private com.google.api.ads.adwords.axis.v201406.video.VideoAdYouTubeDestinationPage youTubeDestinationPage;

    /* Destination url of the advertiser's site, for clicks during
     * or after the video. */
    private java.lang.String destinationUrl;

    /* Display url of the advertiser's site, for clicks during or
     * after the video. */
    private java.lang.String displayUrl;

    /* Companion image that is displayed next to the video on YouTube
     * and publisher sites. */
    private com.google.api.ads.adwords.axis.v201406.video.VideoImage companionBanner;

    /* If true, the video's annotations are displayed when rendered
     * in the context of this ad.
     *                 If unspecified, defaults to false. */
    private java.lang.Boolean showVideoAnnotations;

    /* The summary status of the video ad.
     *                 On reads, this is an aggregation of the individual
     * statuses.
     *                 Setting this on a write is a convenience for setting
     * all other statuses.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoAdStatus status;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalStatusMapEntry[] approvalStatuses;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalLimitMapEntry[] approvalLimits;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.ScopedDisapprovalReason[] disapprovalReasons;

    private com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoAdStatusMapEntry[] statusByFormat;

    public VideoAd() {
    }

    public VideoAd(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String videoId,
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociation[] targetingGroupAssociations,
           com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats stats,
           com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] segmentedStats,
           com.google.api.ads.adwords.axis.v201406.video.ServingInfo issues,
           java.lang.String campaignName,
           java.lang.String headline,
           java.lang.String description1,
           java.lang.String description2,
           com.google.api.ads.adwords.axis.v201406.video.VideoImage image,
           com.google.api.ads.adwords.axis.v201406.video.VideoAdYouTubeDestinationPage youTubeDestinationPage,
           java.lang.String destinationUrl,
           java.lang.String displayUrl,
           com.google.api.ads.adwords.axis.v201406.video.VideoImage companionBanner,
           java.lang.Boolean showVideoAnnotations,
           com.google.api.ads.adwords.axis.v201406.video.VideoAdStatus status,
           com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalStatusMapEntry[] approvalStatuses,
           com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalLimitMapEntry[] approvalLimits,
           com.google.api.ads.adwords.axis.v201406.video.ScopedDisapprovalReason[] disapprovalReasons,
           com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoAdStatusMapEntry[] statusByFormat) {
           this.id = id;
           this.name = name;
           this.videoId = videoId;
           this.campaignId = campaignId;
           this.targetingGroupAssociations = targetingGroupAssociations;
           this.stats = stats;
           this.segmentedStats = segmentedStats;
           this.issues = issues;
           this.campaignName = campaignName;
           this.headline = headline;
           this.description1 = description1;
           this.description2 = description2;
           this.image = image;
           this.youTubeDestinationPage = youTubeDestinationPage;
           this.destinationUrl = destinationUrl;
           this.displayUrl = displayUrl;
           this.companionBanner = companionBanner;
           this.showVideoAnnotations = showVideoAnnotations;
           this.status = status;
           this.approvalStatuses = approvalStatuses;
           this.approvalLimits = approvalLimits;
           this.disapprovalReasons = disapprovalReasons;
           this.statusByFormat = statusByFormat;
    }


    /**
     * Gets the id value for this VideoAd.
     * 
     * @return id   * The id of this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this VideoAd.
     * 
     * @param id   * The id of this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this VideoAd.
     * 
     * @return name   * The name of this VideoAd. Used as a helpful reference for the
     * advertiser,
     *                 but is not used when the ad is served.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VideoAd.
     * 
     * @param name   * The name of this VideoAd. Used as a helpful reference for the
     * advertiser,
     *                 but is not used when the ad is served.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the videoId value for this VideoAd.
     * 
     * @return videoId   * The 11-character YouTube video id of this VideoAd (e.g. 9mgjZK46_uw).
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public java.lang.String getVideoId() {
        return videoId;
    }


    /**
     * Sets the videoId value for this VideoAd.
     * 
     * @param videoId   * The 11-character YouTube video id of this VideoAd (e.g. 9mgjZK46_uw).
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setVideoId(java.lang.String videoId) {
        this.videoId = videoId;
    }


    /**
     * Gets the campaignId value for this VideoAd.
     * 
     * @return campaignId   * The id of the video campaign containing this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this VideoAd.
     * 
     * @param campaignId   * The id of the video campaign containing this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the targetingGroupAssociations value for this VideoAd.
     * 
     * @return targetingGroupAssociations   * All of the TargetingGroups that this VideoAd is associated
     * with.
     *                 The TargetingGroupId is paired with a status to indicate
     * if the VideoAd
     *                 is active or paused within that TargetingGroup.
     *                 On ADDs, if no associations are specified, the ad
     * will be stored in a placeholder
     *                 and will not be eligible for serving until associations
     * are added later.
     *                 On SETs, one may add additional ids to associate an
     * existing VideoAd with, or
     *                 can change the status of an existing association.
     * On SETs, associations with
     *                 TargetingGroups not specified in this list are left
     * unchanged.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociation[] getTargetingGroupAssociations() {
        return targetingGroupAssociations;
    }


    /**
     * Sets the targetingGroupAssociations value for this VideoAd.
     * 
     * @param targetingGroupAssociations   * All of the TargetingGroups that this VideoAd is associated
     * with.
     *                 The TargetingGroupId is paired with a status to indicate
     * if the VideoAd
     *                 is active or paused within that TargetingGroup.
     *                 On ADDs, if no associations are specified, the ad
     * will be stored in a placeholder
     *                 and will not be eligible for serving until associations
     * are added later.
     *                 On SETs, one may add additional ids to associate an
     * existing VideoAd with, or
     *                 can change the status of an existing association.
     * On SETs, associations with
     *                 TargetingGroups not specified in this list are left
     * unchanged.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setTargetingGroupAssociations(com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociation[] targetingGroupAssociations) {
        this.targetingGroupAssociations = targetingGroupAssociations;
    }

    public com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociation getTargetingGroupAssociations(int i) {
        return this.targetingGroupAssociations[i];
    }

    public void setTargetingGroupAssociations(int i, com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociation _value) {
        this.targetingGroupAssociations[i] = _value;
    }


    /**
     * Gets the stats value for this VideoAd.
     * 
     * @return stats   * Statistics about this VideoAd (aggregated over all formats
     * and networks).
     *                 Always returned if statsSelector is specified, regardless
     * of segmentation.
     *                 See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this VideoAd.
     * 
     * @param stats   * Statistics about this VideoAd (aggregated over all formats
     * and networks).
     *                 Always returned if statsSelector is specified, regardless
     * of segmentation.
     *                 See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStats(com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the segmentedStats value for this VideoAd.
     * 
     * @return segmentedStats   * Statistics about this VideoAd segmented by the dimensions indicated
     * in the
     *                 {@link StatsSelector}, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] getSegmentedStats() {
        return segmentedStats;
    }


    /**
     * Sets the segmentedStats value for this VideoAd.
     * 
     * @param segmentedStats   * Statistics about this VideoAd segmented by the dimensions indicated
     * in the
     *                 {@link StatsSelector}, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSegmentedStats(com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] segmentedStats) {
        this.segmentedStats = segmentedStats;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats getSegmentedStats(int i) {
        return this.segmentedStats[i];
    }

    public void setSegmentedStats(int i, com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats _value) {
        this.segmentedStats[i] = _value;
    }


    /**
     * Gets the issues value for this VideoAd.
     * 
     * @return issues   * List of issues reported on this VideoAd.
     */
    public com.google.api.ads.adwords.axis.v201406.video.ServingInfo getIssues() {
        return issues;
    }


    /**
     * Sets the issues value for this VideoAd.
     * 
     * @param issues   * List of issues reported on this VideoAd.
     */
    public void setIssues(com.google.api.ads.adwords.axis.v201406.video.ServingInfo issues) {
        this.issues = issues;
    }


    /**
     * Gets the campaignName value for this VideoAd.
     * 
     * @return campaignName   * The name of the campaign this VideoAd belongs to.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this VideoAd.
     * 
     * @param campaignName   * The name of the campaign this VideoAd belongs to.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the headline value for this VideoAd.
     * 
     * @return headline   * The headline, or first line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display.
     */
    public java.lang.String getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this VideoAd.
     * 
     * @param headline   * The headline, or first line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display.
     */
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }


    /**
     * Gets the description1 value for this VideoAd.
     * 
     * @return description1   * The second line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display.
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this VideoAd.
     * 
     * @param description1   * The second line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display.
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this VideoAd.
     * 
     * @return description2   * The third line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display.
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this VideoAd.
     * 
     * @param description2   * The third line of ad text.
     *                 Required for TrueView in-search, in-slate, and in-display.
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }


    /**
     * Gets the image value for this VideoAd.
     * 
     * @return image   * The image that accompanies this ad when rendered.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoImage getImage() {
        return image;
    }


    /**
     * Sets the image value for this VideoAd.
     * 
     * @param image   * The image that accompanies this ad when rendered.
     */
    public void setImage(com.google.api.ads.adwords.axis.v201406.video.VideoImage image) {
        this.image = image;
    }


    /**
     * Gets the youTubeDestinationPage value for this VideoAd.
     * 
     * @return youTubeDestinationPage   * The YouTube page (watch page vs channel page) that videos
     *                 will be played back on for ad formats that direct
     * the user to YouTube.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoAdYouTubeDestinationPage getYouTubeDestinationPage() {
        return youTubeDestinationPage;
    }


    /**
     * Sets the youTubeDestinationPage value for this VideoAd.
     * 
     * @param youTubeDestinationPage   * The YouTube page (watch page vs channel page) that videos
     *                 will be played back on for ad formats that direct
     * the user to YouTube.
     */
    public void setYouTubeDestinationPage(com.google.api.ads.adwords.axis.v201406.video.VideoAdYouTubeDestinationPage youTubeDestinationPage) {
        this.youTubeDestinationPage = youTubeDestinationPage;
    }


    /**
     * Gets the destinationUrl value for this VideoAd.
     * 
     * @return destinationUrl   * Destination url of the advertiser's site, for clicks during
     * or after the video.
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this VideoAd.
     * 
     * @param destinationUrl   * Destination url of the advertiser's site, for clicks during
     * or after the video.
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the displayUrl value for this VideoAd.
     * 
     * @return displayUrl   * Display url of the advertiser's site, for clicks during or
     * after the video.
     */
    public java.lang.String getDisplayUrl() {
        return displayUrl;
    }


    /**
     * Sets the displayUrl value for this VideoAd.
     * 
     * @param displayUrl   * Display url of the advertiser's site, for clicks during or
     * after the video.
     */
    public void setDisplayUrl(java.lang.String displayUrl) {
        this.displayUrl = displayUrl;
    }


    /**
     * Gets the companionBanner value for this VideoAd.
     * 
     * @return companionBanner   * Companion image that is displayed next to the video on YouTube
     * and publisher sites.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoImage getCompanionBanner() {
        return companionBanner;
    }


    /**
     * Sets the companionBanner value for this VideoAd.
     * 
     * @param companionBanner   * Companion image that is displayed next to the video on YouTube
     * and publisher sites.
     */
    public void setCompanionBanner(com.google.api.ads.adwords.axis.v201406.video.VideoImage companionBanner) {
        this.companionBanner = companionBanner;
    }


    /**
     * Gets the showVideoAnnotations value for this VideoAd.
     * 
     * @return showVideoAnnotations   * If true, the video's annotations are displayed when rendered
     * in the context of this ad.
     *                 If unspecified, defaults to false.
     */
    public java.lang.Boolean getShowVideoAnnotations() {
        return showVideoAnnotations;
    }


    /**
     * Sets the showVideoAnnotations value for this VideoAd.
     * 
     * @param showVideoAnnotations   * If true, the video's annotations are displayed when rendered
     * in the context of this ad.
     *                 If unspecified, defaults to false.
     */
    public void setShowVideoAnnotations(java.lang.Boolean showVideoAnnotations) {
        this.showVideoAnnotations = showVideoAnnotations;
    }


    /**
     * Gets the status value for this VideoAd.
     * 
     * @return status   * The summary status of the video ad.
     *                 On reads, this is an aggregation of the individual
     * statuses.
     *                 Setting this on a write is a convenience for setting
     * all other statuses.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoAdStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this VideoAd.
     * 
     * @param status   * The summary status of the video ad.
     *                 On reads, this is an aggregation of the individual
     * statuses.
     *                 Setting this on a write is a convenience for setting
     * all other statuses.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201406.video.VideoAdStatus status) {
        this.status = status;
    }


    /**
     * Gets the approvalStatuses value for this VideoAd.
     * 
     * @return approvalStatuses   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalStatusMapEntry[] getApprovalStatuses() {
        return approvalStatuses;
    }


    /**
     * Sets the approvalStatuses value for this VideoAd.
     * 
     * @param approvalStatuses   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setApprovalStatuses(com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalStatusMapEntry[] approvalStatuses) {
        this.approvalStatuses = approvalStatuses;
    }

    public com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalStatusMapEntry getApprovalStatuses(int i) {
        return this.approvalStatuses[i];
    }

    public void setApprovalStatuses(int i, com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalStatusMapEntry _value) {
        this.approvalStatuses[i] = _value;
    }


    /**
     * Gets the approvalLimits value for this VideoAd.
     * 
     * @return approvalLimits   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalLimitMapEntry[] getApprovalLimits() {
        return approvalLimits;
    }


    /**
     * Sets the approvalLimits value for this VideoAd.
     * 
     * @param approvalLimits   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setApprovalLimits(com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalLimitMapEntry[] approvalLimits) {
        this.approvalLimits = approvalLimits;
    }

    public com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalLimitMapEntry getApprovalLimits(int i) {
        return this.approvalLimits[i];
    }

    public void setApprovalLimits(int i, com.google.api.ads.adwords.axis.v201406.video.ApprovalContext_VideoAd_ApprovalLimitMapEntry _value) {
        this.approvalLimits[i] = _value;
    }


    /**
     * Gets the disapprovalReasons value for this VideoAd.
     * 
     * @return disapprovalReasons   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.ScopedDisapprovalReason[] getDisapprovalReasons() {
        return disapprovalReasons;
    }


    /**
     * Sets the disapprovalReasons value for this VideoAd.
     * 
     * @param disapprovalReasons   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setDisapprovalReasons(com.google.api.ads.adwords.axis.v201406.video.ScopedDisapprovalReason[] disapprovalReasons) {
        this.disapprovalReasons = disapprovalReasons;
    }

    public com.google.api.ads.adwords.axis.v201406.video.ScopedDisapprovalReason getDisapprovalReasons(int i) {
        return this.disapprovalReasons[i];
    }

    public void setDisapprovalReasons(int i, com.google.api.ads.adwords.axis.v201406.video.ScopedDisapprovalReason _value) {
        this.disapprovalReasons[i] = _value;
    }


    /**
     * Gets the statusByFormat value for this VideoAd.
     * 
     * @return statusByFormat
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoAdStatusMapEntry[] getStatusByFormat() {
        return statusByFormat;
    }


    /**
     * Sets the statusByFormat value for this VideoAd.
     * 
     * @param statusByFormat
     */
    public void setStatusByFormat(com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoAdStatusMapEntry[] statusByFormat) {
        this.statusByFormat = statusByFormat;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoAdStatusMapEntry getStatusByFormat(int i) {
        return this.statusByFormat[i];
    }

    public void setStatusByFormat(int i, com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoAdStatusMapEntry _value) {
        this.statusByFormat[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoAd)) return false;
        VideoAd other = (VideoAd) obj;
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
            ((this.videoId==null && other.getVideoId()==null) || 
             (this.videoId!=null &&
              this.videoId.equals(other.getVideoId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.targetingGroupAssociations==null && other.getTargetingGroupAssociations()==null) || 
             (this.targetingGroupAssociations!=null &&
              java.util.Arrays.equals(this.targetingGroupAssociations, other.getTargetingGroupAssociations()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.segmentedStats==null && other.getSegmentedStats()==null) || 
             (this.segmentedStats!=null &&
              java.util.Arrays.equals(this.segmentedStats, other.getSegmentedStats()))) &&
            ((this.issues==null && other.getIssues()==null) || 
             (this.issues!=null &&
              this.issues.equals(other.getIssues()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.youTubeDestinationPage==null && other.getYouTubeDestinationPage()==null) || 
             (this.youTubeDestinationPage!=null &&
              this.youTubeDestinationPage.equals(other.getYouTubeDestinationPage()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.displayUrl==null && other.getDisplayUrl()==null) || 
             (this.displayUrl!=null &&
              this.displayUrl.equals(other.getDisplayUrl()))) &&
            ((this.companionBanner==null && other.getCompanionBanner()==null) || 
             (this.companionBanner!=null &&
              this.companionBanner.equals(other.getCompanionBanner()))) &&
            ((this.showVideoAnnotations==null && other.getShowVideoAnnotations()==null) || 
             (this.showVideoAnnotations!=null &&
              this.showVideoAnnotations.equals(other.getShowVideoAnnotations()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.approvalStatuses==null && other.getApprovalStatuses()==null) || 
             (this.approvalStatuses!=null &&
              java.util.Arrays.equals(this.approvalStatuses, other.getApprovalStatuses()))) &&
            ((this.approvalLimits==null && other.getApprovalLimits()==null) || 
             (this.approvalLimits!=null &&
              java.util.Arrays.equals(this.approvalLimits, other.getApprovalLimits()))) &&
            ((this.disapprovalReasons==null && other.getDisapprovalReasons()==null) || 
             (this.disapprovalReasons!=null &&
              java.util.Arrays.equals(this.disapprovalReasons, other.getDisapprovalReasons()))) &&
            ((this.statusByFormat==null && other.getStatusByFormat()==null) || 
             (this.statusByFormat!=null &&
              java.util.Arrays.equals(this.statusByFormat, other.getStatusByFormat())));
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
        if (getVideoId() != null) {
            _hashCode += getVideoId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getTargetingGroupAssociations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetingGroupAssociations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetingGroupAssociations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getSegmentedStats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentedStats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentedStats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssues() != null) {
            _hashCode += getIssues().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getYouTubeDestinationPage() != null) {
            _hashCode += getYouTubeDestinationPage().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getDisplayUrl() != null) {
            _hashCode += getDisplayUrl().hashCode();
        }
        if (getCompanionBanner() != null) {
            _hashCode += getCompanionBanner().hashCode();
        }
        if (getShowVideoAnnotations() != null) {
            _hashCode += getShowVideoAnnotations().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getApprovalStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalLimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisapprovalReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisapprovalReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisapprovalReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusByFormat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusByFormat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusByFormat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "videoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "targetingGroupAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingGroupAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentedStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "segmentedStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "issues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "headline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "description2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youTubeDestinationPage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "youTubeDestinationPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAd.YouTubeDestinationPage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "displayUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionBanner");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "companionBanner"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showVideoAnnotations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "showVideoAnnotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "approvalStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ApprovalContext_VideoAd_ApprovalStatusMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "approvalLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ApprovalContext_VideoAd_ApprovalLimitMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "disapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ScopedDisapprovalReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusByFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "statusByFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdDisplayFormat_VideoAdStatusMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
