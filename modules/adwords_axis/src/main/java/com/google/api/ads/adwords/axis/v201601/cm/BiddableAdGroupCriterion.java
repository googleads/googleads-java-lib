/**
 * BiddableAdGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;


/**
 * A biddable (positive) criterion in an adgroup.
 */
public class BiddableAdGroupCriterion  extends com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterion  implements java.io.Serializable {
    /* Current user-set state of criterion.
     *                     UserStatus may not be set to {@code REMOVED}.
     * On add, defaults to
     *                     {@code ENABLED} if unspecified. */
    private com.google.api.ads.adwords.axis.v201601.cm.UserStatus userStatus;

    /* Serving status.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.SystemServingStatus systemServingStatus;

    /* Approval status.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.ApprovalStatus approvalStatus;

    /* List of disapproval reasons.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String[] disapprovalReasons;

    /* Destination URL override when Ad is triggered by this criterion.
     * 
     *                     <p>Some sample valid URLs are: "http://www.website.com",
     * "http://www.domain.com/somepath".
     *                     <p>Set to the empty string ("") to clear the destination
     * URL. */
    private java.lang.String destinationUrl;

    /* The campaign bidding strategy specific experiment data for
     *                     this criterion. */
    private com.google.api.ads.adwords.axis.v201601.cm.BiddableAdGroupCriterionExperimentData experimentData;

    /* First page Cpc for this criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Bid firstPageCpc;

    /* An estimate of the cpc bid needed for your ad to appear above
     * the
     *                     first page of Google search results when a query
     * matches the keywords exactly.
     *                     Note that meeting this estimate is not a guarantee
     * of ad position,
     *                     which may depend on other factors.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Bid topOfPageCpc;

    /* An estimate of the cpc bid needed for your ad to regularly
     * appear in the top position above
     *                     the search results on google.com when a query
     * matches the keywords exactly.  Note that meeting
     *                     this estimate is not a guarantee of ad position,
     * which may depend on other factors.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Bid firstPositionCpc;

    /* Contains quality information about the criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.QualityInfo qualityInfo;

    /* Bidding configuration for this ad group criterion. To set the
     * bids on the ad groups
     *                     use {@link BiddingStrategyConfiguration#bids}.
     * Multiple bids can be set on
     *                     ad group criterion at the same time. Only the
     * bids that apply to the campaign's bidding
     *                     strategy {@linkplain Campaign#biddingStrategyConfiguration
     * bidding strategy}
     *                     will be used. */
    private com.google.api.ads.adwords.axis.v201601.cm.BiddingStrategyConfiguration biddingStrategyConfiguration;

    /* Bid modifier of the criterion which is used when the criterion
     * is not in an absolute bidding
     *                     dimension. */
    private java.lang.Double bidModifier;

    /* A list of possible final URLs after all cross domain redirects. */
    private com.google.api.ads.adwords.axis.v201601.cm.UrlList finalUrls;

    /* A list of possible final mobile URLs after all cross domain
     * redirects. */
    private com.google.api.ads.adwords.axis.v201601.cm.UrlList finalMobileUrls;

    /* A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                     installed. */
    private com.google.api.ads.adwords.axis.v201601.cm.AppUrlList finalAppUrls;

    /* URL template for constructing a tracking URL.
     *                     
     *                     <p>On update, empty string ("") indicates to clear
     * the field. */
    private java.lang.String trackingUrlTemplate;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls. */
    private com.google.api.ads.adwords.axis.v201601.cm.CustomParameters urlCustomParameters;

    public BiddableAdGroupCriterion() {
    }

    public BiddableAdGroupCriterion(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201601.cm.CriterionUse criterionUse,
           com.google.api.ads.adwords.axis.v201601.cm.Criterion criterion,
           com.google.api.ads.adwords.axis.v201601.cm.Label[] labels,
           com.google.api.ads.adwords.axis.v201601.cm.String_StringMapEntry[] forwardCompatibilityMap,
           java.lang.String adGroupCriterionType,
           com.google.api.ads.adwords.axis.v201601.cm.UserStatus userStatus,
           com.google.api.ads.adwords.axis.v201601.cm.SystemServingStatus systemServingStatus,
           com.google.api.ads.adwords.axis.v201601.cm.ApprovalStatus approvalStatus,
           java.lang.String[] disapprovalReasons,
           java.lang.String destinationUrl,
           com.google.api.ads.adwords.axis.v201601.cm.BiddableAdGroupCriterionExperimentData experimentData,
           com.google.api.ads.adwords.axis.v201601.cm.Bid firstPageCpc,
           com.google.api.ads.adwords.axis.v201601.cm.Bid topOfPageCpc,
           com.google.api.ads.adwords.axis.v201601.cm.Bid firstPositionCpc,
           com.google.api.ads.adwords.axis.v201601.cm.QualityInfo qualityInfo,
           com.google.api.ads.adwords.axis.v201601.cm.BiddingStrategyConfiguration biddingStrategyConfiguration,
           java.lang.Double bidModifier,
           com.google.api.ads.adwords.axis.v201601.cm.UrlList finalUrls,
           com.google.api.ads.adwords.axis.v201601.cm.UrlList finalMobileUrls,
           com.google.api.ads.adwords.axis.v201601.cm.AppUrlList finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201601.cm.CustomParameters urlCustomParameters) {
        super(
            adGroupId,
            criterionUse,
            criterion,
            labels,
            forwardCompatibilityMap,
            adGroupCriterionType);
        this.userStatus = userStatus;
        this.systemServingStatus = systemServingStatus;
        this.approvalStatus = approvalStatus;
        this.disapprovalReasons = disapprovalReasons;
        this.destinationUrl = destinationUrl;
        this.experimentData = experimentData;
        this.firstPageCpc = firstPageCpc;
        this.topOfPageCpc = topOfPageCpc;
        this.firstPositionCpc = firstPositionCpc;
        this.qualityInfo = qualityInfo;
        this.biddingStrategyConfiguration = biddingStrategyConfiguration;
        this.bidModifier = bidModifier;
        this.finalUrls = finalUrls;
        this.finalMobileUrls = finalMobileUrls;
        this.finalAppUrls = finalAppUrls;
        this.trackingUrlTemplate = trackingUrlTemplate;
        this.urlCustomParameters = urlCustomParameters;
    }


    /**
     * Gets the userStatus value for this BiddableAdGroupCriterion.
     * 
     * @return userStatus   * Current user-set state of criterion.
     *                     UserStatus may not be set to {@code REMOVED}.
     * On add, defaults to
     *                     {@code ENABLED} if unspecified.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.UserStatus getUserStatus() {
        return userStatus;
    }


    /**
     * Sets the userStatus value for this BiddableAdGroupCriterion.
     * 
     * @param userStatus   * Current user-set state of criterion.
     *                     UserStatus may not be set to {@code REMOVED}.
     * On add, defaults to
     *                     {@code ENABLED} if unspecified.
     */
    public void setUserStatus(com.google.api.ads.adwords.axis.v201601.cm.UserStatus userStatus) {
        this.userStatus = userStatus;
    }


    /**
     * Gets the systemServingStatus value for this BiddableAdGroupCriterion.
     * 
     * @return systemServingStatus   * Serving status.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.SystemServingStatus getSystemServingStatus() {
        return systemServingStatus;
    }


    /**
     * Sets the systemServingStatus value for this BiddableAdGroupCriterion.
     * 
     * @param systemServingStatus   * Serving status.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSystemServingStatus(com.google.api.ads.adwords.axis.v201601.cm.SystemServingStatus systemServingStatus) {
        this.systemServingStatus = systemServingStatus;
    }


    /**
     * Gets the approvalStatus value for this BiddableAdGroupCriterion.
     * 
     * @return approvalStatus   * Approval status.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this BiddableAdGroupCriterion.
     * 
     * @param approvalStatus   * Approval status.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setApprovalStatus(com.google.api.ads.adwords.axis.v201601.cm.ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the disapprovalReasons value for this BiddableAdGroupCriterion.
     * 
     * @return disapprovalReasons   * List of disapproval reasons.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String[] getDisapprovalReasons() {
        return disapprovalReasons;
    }


    /**
     * Sets the disapprovalReasons value for this BiddableAdGroupCriterion.
     * 
     * @param disapprovalReasons   * List of disapproval reasons.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setDisapprovalReasons(java.lang.String[] disapprovalReasons) {
        this.disapprovalReasons = disapprovalReasons;
    }

    public java.lang.String getDisapprovalReasons(int i) {
        return this.disapprovalReasons[i];
    }

    public void setDisapprovalReasons(int i, java.lang.String _value) {
        this.disapprovalReasons[i] = _value;
    }


    /**
     * Gets the destinationUrl value for this BiddableAdGroupCriterion.
     * 
     * @return destinationUrl   * Destination URL override when Ad is triggered by this criterion.
     * 
     *                     <p>Some sample valid URLs are: "http://www.website.com",
     * "http://www.domain.com/somepath".
     *                     <p>Set to the empty string ("") to clear the destination
     * URL.
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this BiddableAdGroupCriterion.
     * 
     * @param destinationUrl   * Destination URL override when Ad is triggered by this criterion.
     * 
     *                     <p>Some sample valid URLs are: "http://www.website.com",
     * "http://www.domain.com/somepath".
     *                     <p>Set to the empty string ("") to clear the destination
     * URL.
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the experimentData value for this BiddableAdGroupCriterion.
     * 
     * @return experimentData   * The campaign bidding strategy specific experiment data for
     *                     this criterion.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BiddableAdGroupCriterionExperimentData getExperimentData() {
        return experimentData;
    }


    /**
     * Sets the experimentData value for this BiddableAdGroupCriterion.
     * 
     * @param experimentData   * The campaign bidding strategy specific experiment data for
     *                     this criterion.
     */
    public void setExperimentData(com.google.api.ads.adwords.axis.v201601.cm.BiddableAdGroupCriterionExperimentData experimentData) {
        this.experimentData = experimentData;
    }


    /**
     * Gets the firstPageCpc value for this BiddableAdGroupCriterion.
     * 
     * @return firstPageCpc   * First page Cpc for this criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Bid getFirstPageCpc() {
        return firstPageCpc;
    }


    /**
     * Sets the firstPageCpc value for this BiddableAdGroupCriterion.
     * 
     * @param firstPageCpc   * First page Cpc for this criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setFirstPageCpc(com.google.api.ads.adwords.axis.v201601.cm.Bid firstPageCpc) {
        this.firstPageCpc = firstPageCpc;
    }


    /**
     * Gets the topOfPageCpc value for this BiddableAdGroupCriterion.
     * 
     * @return topOfPageCpc   * An estimate of the cpc bid needed for your ad to appear above
     * the
     *                     first page of Google search results when a query
     * matches the keywords exactly.
     *                     Note that meeting this estimate is not a guarantee
     * of ad position,
     *                     which may depend on other factors.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Bid getTopOfPageCpc() {
        return topOfPageCpc;
    }


    /**
     * Sets the topOfPageCpc value for this BiddableAdGroupCriterion.
     * 
     * @param topOfPageCpc   * An estimate of the cpc bid needed for your ad to appear above
     * the
     *                     first page of Google search results when a query
     * matches the keywords exactly.
     *                     Note that meeting this estimate is not a guarantee
     * of ad position,
     *                     which may depend on other factors.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setTopOfPageCpc(com.google.api.ads.adwords.axis.v201601.cm.Bid topOfPageCpc) {
        this.topOfPageCpc = topOfPageCpc;
    }


    /**
     * Gets the firstPositionCpc value for this BiddableAdGroupCriterion.
     * 
     * @return firstPositionCpc   * An estimate of the cpc bid needed for your ad to regularly
     * appear in the top position above
     *                     the search results on google.com when a query
     * matches the keywords exactly.  Note that meeting
     *                     this estimate is not a guarantee of ad position,
     * which may depend on other factors.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Bid getFirstPositionCpc() {
        return firstPositionCpc;
    }


    /**
     * Sets the firstPositionCpc value for this BiddableAdGroupCriterion.
     * 
     * @param firstPositionCpc   * An estimate of the cpc bid needed for your ad to regularly
     * appear in the top position above
     *                     the search results on google.com when a query
     * matches the keywords exactly.  Note that meeting
     *                     this estimate is not a guarantee of ad position,
     * which may depend on other factors.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setFirstPositionCpc(com.google.api.ads.adwords.axis.v201601.cm.Bid firstPositionCpc) {
        this.firstPositionCpc = firstPositionCpc;
    }


    /**
     * Gets the qualityInfo value for this BiddableAdGroupCriterion.
     * 
     * @return qualityInfo   * Contains quality information about the criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.QualityInfo getQualityInfo() {
        return qualityInfo;
    }


    /**
     * Sets the qualityInfo value for this BiddableAdGroupCriterion.
     * 
     * @param qualityInfo   * Contains quality information about the criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setQualityInfo(com.google.api.ads.adwords.axis.v201601.cm.QualityInfo qualityInfo) {
        this.qualityInfo = qualityInfo;
    }


    /**
     * Gets the biddingStrategyConfiguration value for this BiddableAdGroupCriterion.
     * 
     * @return biddingStrategyConfiguration   * Bidding configuration for this ad group criterion. To set the
     * bids on the ad groups
     *                     use {@link BiddingStrategyConfiguration#bids}.
     * Multiple bids can be set on
     *                     ad group criterion at the same time. Only the
     * bids that apply to the campaign's bidding
     *                     strategy {@linkplain Campaign#biddingStrategyConfiguration
     * bidding strategy}
     *                     will be used.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }


    /**
     * Sets the biddingStrategyConfiguration value for this BiddableAdGroupCriterion.
     * 
     * @param biddingStrategyConfiguration   * Bidding configuration for this ad group criterion. To set the
     * bids on the ad groups
     *                     use {@link BiddingStrategyConfiguration#bids}.
     * Multiple bids can be set on
     *                     ad group criterion at the same time. Only the
     * bids that apply to the campaign's bidding
     *                     strategy {@linkplain Campaign#biddingStrategyConfiguration
     * bidding strategy}
     *                     will be used.
     */
    public void setBiddingStrategyConfiguration(com.google.api.ads.adwords.axis.v201601.cm.BiddingStrategyConfiguration biddingStrategyConfiguration) {
        this.biddingStrategyConfiguration = biddingStrategyConfiguration;
    }


    /**
     * Gets the bidModifier value for this BiddableAdGroupCriterion.
     * 
     * @return bidModifier   * Bid modifier of the criterion which is used when the criterion
     * is not in an absolute bidding
     *                     dimension.
     */
    public java.lang.Double getBidModifier() {
        return bidModifier;
    }


    /**
     * Sets the bidModifier value for this BiddableAdGroupCriterion.
     * 
     * @param bidModifier   * Bid modifier of the criterion which is used when the criterion
     * is not in an absolute bidding
     *                     dimension.
     */
    public void setBidModifier(java.lang.Double bidModifier) {
        this.bidModifier = bidModifier;
    }


    /**
     * Gets the finalUrls value for this BiddableAdGroupCriterion.
     * 
     * @return finalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.UrlList getFinalUrls() {
        return finalUrls;
    }


    /**
     * Sets the finalUrls value for this BiddableAdGroupCriterion.
     * 
     * @param finalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public void setFinalUrls(com.google.api.ads.adwords.axis.v201601.cm.UrlList finalUrls) {
        this.finalUrls = finalUrls;
    }


    /**
     * Gets the finalMobileUrls value for this BiddableAdGroupCriterion.
     * 
     * @return finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.UrlList getFinalMobileUrls() {
        return finalMobileUrls;
    }


    /**
     * Sets the finalMobileUrls value for this BiddableAdGroupCriterion.
     * 
     * @param finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public void setFinalMobileUrls(com.google.api.ads.adwords.axis.v201601.cm.UrlList finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }


    /**
     * Gets the finalAppUrls value for this BiddableAdGroupCriterion.
     * 
     * @return finalAppUrls   * A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                     installed.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AppUrlList getFinalAppUrls() {
        return finalAppUrls;
    }


    /**
     * Sets the finalAppUrls value for this BiddableAdGroupCriterion.
     * 
     * @param finalAppUrls   * A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                     installed.
     */
    public void setFinalAppUrls(com.google.api.ads.adwords.axis.v201601.cm.AppUrlList finalAppUrls) {
        this.finalAppUrls = finalAppUrls;
    }


    /**
     * Gets the trackingUrlTemplate value for this BiddableAdGroupCriterion.
     * 
     * @return trackingUrlTemplate   * URL template for constructing a tracking URL.
     *                     
     *                     <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this BiddableAdGroupCriterion.
     * 
     * @param trackingUrlTemplate   * URL template for constructing a tracking URL.
     *                     
     *                     <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the urlCustomParameters value for this BiddableAdGroupCriterion.
     * 
     * @return urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }


    /**
     * Sets the urlCustomParameters value for this BiddableAdGroupCriterion.
     * 
     * @param urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public void setUrlCustomParameters(com.google.api.ads.adwords.axis.v201601.cm.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiddableAdGroupCriterion)) return false;
        BiddableAdGroupCriterion other = (BiddableAdGroupCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userStatus==null && other.getUserStatus()==null) || 
             (this.userStatus!=null &&
              this.userStatus.equals(other.getUserStatus()))) &&
            ((this.systemServingStatus==null && other.getSystemServingStatus()==null) || 
             (this.systemServingStatus!=null &&
              this.systemServingStatus.equals(other.getSystemServingStatus()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.disapprovalReasons==null && other.getDisapprovalReasons()==null) || 
             (this.disapprovalReasons!=null &&
              java.util.Arrays.equals(this.disapprovalReasons, other.getDisapprovalReasons()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.experimentData==null && other.getExperimentData()==null) || 
             (this.experimentData!=null &&
              this.experimentData.equals(other.getExperimentData()))) &&
            ((this.firstPageCpc==null && other.getFirstPageCpc()==null) || 
             (this.firstPageCpc!=null &&
              this.firstPageCpc.equals(other.getFirstPageCpc()))) &&
            ((this.topOfPageCpc==null && other.getTopOfPageCpc()==null) || 
             (this.topOfPageCpc!=null &&
              this.topOfPageCpc.equals(other.getTopOfPageCpc()))) &&
            ((this.firstPositionCpc==null && other.getFirstPositionCpc()==null) || 
             (this.firstPositionCpc!=null &&
              this.firstPositionCpc.equals(other.getFirstPositionCpc()))) &&
            ((this.qualityInfo==null && other.getQualityInfo()==null) || 
             (this.qualityInfo!=null &&
              this.qualityInfo.equals(other.getQualityInfo()))) &&
            ((this.biddingStrategyConfiguration==null && other.getBiddingStrategyConfiguration()==null) || 
             (this.biddingStrategyConfiguration!=null &&
              this.biddingStrategyConfiguration.equals(other.getBiddingStrategyConfiguration()))) &&
            ((this.bidModifier==null && other.getBidModifier()==null) || 
             (this.bidModifier!=null &&
              this.bidModifier.equals(other.getBidModifier()))) &&
            ((this.finalUrls==null && other.getFinalUrls()==null) || 
             (this.finalUrls!=null &&
              this.finalUrls.equals(other.getFinalUrls()))) &&
            ((this.finalMobileUrls==null && other.getFinalMobileUrls()==null) || 
             (this.finalMobileUrls!=null &&
              this.finalMobileUrls.equals(other.getFinalMobileUrls()))) &&
            ((this.finalAppUrls==null && other.getFinalAppUrls()==null) || 
             (this.finalAppUrls!=null &&
              this.finalAppUrls.equals(other.getFinalAppUrls()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) || 
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.urlCustomParameters==null && other.getUrlCustomParameters()==null) || 
             (this.urlCustomParameters!=null &&
              this.urlCustomParameters.equals(other.getUrlCustomParameters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUserStatus() != null) {
            _hashCode += getUserStatus().hashCode();
        }
        if (getSystemServingStatus() != null) {
            _hashCode += getSystemServingStatus().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
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
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getExperimentData() != null) {
            _hashCode += getExperimentData().hashCode();
        }
        if (getFirstPageCpc() != null) {
            _hashCode += getFirstPageCpc().hashCode();
        }
        if (getTopOfPageCpc() != null) {
            _hashCode += getTopOfPageCpc().hashCode();
        }
        if (getFirstPositionCpc() != null) {
            _hashCode += getFirstPositionCpc().hashCode();
        }
        if (getQualityInfo() != null) {
            _hashCode += getQualityInfo().hashCode();
        }
        if (getBiddingStrategyConfiguration() != null) {
            _hashCode += getBiddingStrategyConfiguration().hashCode();
        }
        if (getBidModifier() != null) {
            _hashCode += getBidModifier().hashCode();
        }
        if (getFinalUrls() != null) {
            _hashCode += getFinalUrls().hashCode();
        }
        if (getFinalMobileUrls() != null) {
            _hashCode += getFinalMobileUrls().hashCode();
        }
        if (getFinalAppUrls() != null) {
            _hashCode += getFinalAppUrls().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiddableAdGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddableAdGroupCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "userStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "UserStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemServingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "systemServingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SystemServingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "disapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "experimentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddableAdGroupCriterionExperimentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstPageCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "firstPageCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topOfPageCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "topOfPageCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstPositionCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "firstPositionCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Bid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "qualityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "QualityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "biddingStrategyConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddingStrategyConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "bidModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "finalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "finalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalAppUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "finalAppUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AppUrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "trackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "urlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CustomParameters"));
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
