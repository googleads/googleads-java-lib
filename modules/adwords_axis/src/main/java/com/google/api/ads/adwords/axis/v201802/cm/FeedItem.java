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
 * FeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an item in a feed.
 */
public class FeedItem  implements java.io.Serializable {
    /* ID of this feed item's feed
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* ID of this feed item.
     *                 This may be unspecified if the user-defined key attributes
     * are specified. */
    private java.lang.Long feedItemId;

    /* Status of feed item
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus status;

    /* Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.String startTime;

    /* End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.String endTime;

    /* The feed item's attribute values. For any unset/unspecified
     * feed attributes, the value is
     *                 considered unset/null on ADD and unchanged on SET.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue[] attributeValues;

    /* List of details about a feed item's validation and approval
     * state for active feed mappings.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData[] policyData;

    /* Device preference for the feed item. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference devicePreference;

    /* FeedItemScheduling specifying times for when the feed item
     * may serve.
     *                 On retrieval or creation of the feed item, if the
     * field is left null,
     *                 no feed item scheduling restrictions are placed on
     * the feed item.
     *                 On update, if the field is left unspecified, the previous
     * feedItemScheduling state will
     *                 not be changed.
     *                 On update, if the field is set with a FeedItemScheduling
     * with an empty feedItemSchedules
     *                 list, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling scheduling;

    /* Campaign targeting specifying what campaign this feed item
     * can serve with.
     *                 On update, if the field is left unspecified, the previous
     * campaign targeting state
     *                 will not be changed.
     *                 On update, if the field is set with an empty FeedItemCampaignTargeting,
     * the
     *                 campaign targeting will be cleared.
     *                 Note: If adGroupTargeting and campaignTargeting are
     * set (either in the request or pre-existing
     *                 from a previous request), the targeted campaign must
     * match the targeted adgroup's campaign.
     *                 If only adGroupTargeting is specified and there is
     * no campaignTargeting, then a
     *                 campaignTargeting will be set to the targeted adgroup's
     * campaign. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting campaignTargeting;

    /* Adgroup targeting specifying what adgroup this feed item can
     * serve with.
     *                 On update, if the field is left unspecified, the previous
     * adgroup targeting state
     *                 will not be changed.
     *                 On update, if the field is set with an empty FeedItemAdGroupTargeting,
     * the
     *                 adgroup targeting will be cleared.
     *                 Note: If adGroupTargeting and campaignTargeting are
     * set (either in the request or pre-existing
     *                 from a previous request), the targeted campaign must
     * match the targeted adgroup's campaign.
     *                 If only adGroupTargeting is specified and there is
     * no campaignTargeting, then a
     *                 campaignTargeting will be set to the targeted adgroup's
     * campaign. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting adGroupTargeting;

    /* Keyword targeting specifies what keyword this feed item can
     * serve with.
     *                 On update, if the field is left unspecified, the previous
     * keyword targeting state
     *                 will not be changed.
     *                 On update, if the field is set with a Keyword and
     * without Keyword.text set keyword targeting
     *                 will be cleared. */
    private com.google.api.ads.adwords.axis.v201802.cm.Keyword keywordTargeting;

    /* Geo targeting specifies what locations this feed item can serve
     * with.
     *                 On update, if the field is left unspecified, the previous
     * geo targeting state will not
     *                 be changed.
     *                 On update, if the field is set with a null value for
     * criterionId, the geo targeting will be
     *                 cleared. */
    private com.google.api.ads.adwords.axis.v201802.cm.Location geoTargeting;

    /* Geo targeting restriction specifies the type of location that
     * can be used for targeting.
     *                 On update, if the field is left unspecified, the previous
     * geo targeting restriction state
     *                 will not be changed.
     *                 On update, if the field is set with a null GeoRestriction
     * enum, the geo targeting restriction
     *                 will be cleared. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction geoTargetingRestriction;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls. */
    private com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters;

    public FeedItem() {
    }

    public FeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus status,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue[] attributeValues,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData[] policyData,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting campaignTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting adGroupTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Keyword keywordTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Location geoTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction geoTargetingRestriction,
           com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters) {
           this.feedId = feedId;
           this.feedItemId = feedItemId;
           this.status = status;
           this.startTime = startTime;
           this.endTime = endTime;
           this.attributeValues = attributeValues;
           this.policyData = policyData;
           this.devicePreference = devicePreference;
           this.scheduling = scheduling;
           this.campaignTargeting = campaignTargeting;
           this.adGroupTargeting = adGroupTargeting;
           this.keywordTargeting = keywordTargeting;
           this.geoTargeting = geoTargeting;
           this.geoTargetingRestriction = geoTargetingRestriction;
           this.urlCustomParameters = urlCustomParameters;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupTargeting", getAdGroupTargeting())
            .add("attributeValues", getAttributeValues())
            .add("campaignTargeting", getCampaignTargeting())
            .add("devicePreference", getDevicePreference())
            .add("endTime", getEndTime())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("geoTargeting", getGeoTargeting())
            .add("geoTargetingRestriction", getGeoTargetingRestriction())
            .add("keywordTargeting", getKeywordTargeting())
            .add("policyData", getPolicyData())
            .add("scheduling", getScheduling())
            .add("startTime", getStartTime())
            .add("status", getStatus())
            .add("urlCustomParameters", getUrlCustomParameters())
            .toString();
    }

    /**
     * Gets the feedId value for this FeedItem.
     * 
     * @return feedId   * ID of this feed item's feed
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this FeedItem.
     * 
     * @param feedId   * ID of this feed item's feed
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the feedItemId value for this FeedItem.
     * 
     * @return feedItemId   * ID of this feed item.
     *                 This may be unspecified if the user-defined key attributes
     * are specified.
     */
    public java.lang.Long getFeedItemId() {
        return feedItemId;
    }


    /**
     * Sets the feedItemId value for this FeedItem.
     * 
     * @param feedItemId   * ID of this feed item.
     *                 This may be unspecified if the user-defined key attributes
     * are specified.
     */
    public void setFeedItemId(java.lang.Long feedItemId) {
        this.feedItemId = feedItemId;
    }


    /**
     * Gets the status value for this FeedItem.
     * 
     * @return status   * Status of feed item
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FeedItem.
     * 
     * @param status   * Status of feed item
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus status) {
        this.status = status;
    }


    /**
     * Gets the startTime value for this FeedItem.
     * 
     * @return startTime   * Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this FeedItem.
     * 
     * @param startTime   * Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this FeedItem.
     * 
     * @return endTime   * End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this FeedItem.
     * 
     * @param endTime   * End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the attributeValues value for this FeedItem.
     * 
     * @return attributeValues   * The feed item's attribute values. For any unset/unspecified
     * feed attributes, the value is
     *                 considered unset/null on ADD and unchanged on SET.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue[] getAttributeValues() {
        return attributeValues;
    }


    /**
     * Sets the attributeValues value for this FeedItem.
     * 
     * @param attributeValues   * The feed item's attribute values. For any unset/unspecified
     * feed attributes, the value is
     *                 considered unset/null on ADD and unchanged on SET.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setAttributeValues(com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue[] attributeValues) {
        this.attributeValues = attributeValues;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue getAttributeValues(int i) {
        return this.attributeValues[i];
    }

    public void setAttributeValues(int i, com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue _value) {
        this.attributeValues[i] = _value;
    }


    /**
     * Gets the policyData value for this FeedItem.
     * 
     * @return policyData   * List of details about a feed item's validation and approval
     * state for active feed mappings.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData[] getPolicyData() {
        return policyData;
    }


    /**
     * Sets the policyData value for this FeedItem.
     * 
     * @param policyData   * List of details about a feed item's validation and approval
     * state for active feed mappings.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPolicyData(com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData[] policyData) {
        this.policyData = policyData;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData getPolicyData(int i) {
        return this.policyData[i];
    }

    public void setPolicyData(int i, com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData _value) {
        this.policyData[i] = _value;
    }


    /**
     * Gets the devicePreference value for this FeedItem.
     * 
     * @return devicePreference   * Device preference for the feed item.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this FeedItem.
     * 
     * @param devicePreference   * Device preference for the feed item.
     */
    public void setDevicePreference(com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the scheduling value for this FeedItem.
     * 
     * @return scheduling   * FeedItemScheduling specifying times for when the feed item
     * may serve.
     *                 On retrieval or creation of the feed item, if the
     * field is left null,
     *                 no feed item scheduling restrictions are placed on
     * the feed item.
     *                 On update, if the field is left unspecified, the previous
     * feedItemScheduling state will
     *                 not be changed.
     *                 On update, if the field is set with a FeedItemScheduling
     * with an empty feedItemSchedules
     *                 list, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling getScheduling() {
        return scheduling;
    }


    /**
     * Sets the scheduling value for this FeedItem.
     * 
     * @param scheduling   * FeedItemScheduling specifying times for when the feed item
     * may serve.
     *                 On retrieval or creation of the feed item, if the
     * field is left null,
     *                 no feed item scheduling restrictions are placed on
     * the feed item.
     *                 On update, if the field is left unspecified, the previous
     * feedItemScheduling state will
     *                 not be changed.
     *                 On update, if the field is set with a FeedItemScheduling
     * with an empty feedItemSchedules
     *                 list, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions.
     */
    public void setScheduling(com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling scheduling) {
        this.scheduling = scheduling;
    }


    /**
     * Gets the campaignTargeting value for this FeedItem.
     * 
     * @return campaignTargeting   * Campaign targeting specifying what campaign this feed item
     * can serve with.
     *                 On update, if the field is left unspecified, the previous
     * campaign targeting state
     *                 will not be changed.
     *                 On update, if the field is set with an empty FeedItemCampaignTargeting,
     * the
     *                 campaign targeting will be cleared.
     *                 Note: If adGroupTargeting and campaignTargeting are
     * set (either in the request or pre-existing
     *                 from a previous request), the targeted campaign must
     * match the targeted adgroup's campaign.
     *                 If only adGroupTargeting is specified and there is
     * no campaignTargeting, then a
     *                 campaignTargeting will be set to the targeted adgroup's
     * campaign.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting getCampaignTargeting() {
        return campaignTargeting;
    }


    /**
     * Sets the campaignTargeting value for this FeedItem.
     * 
     * @param campaignTargeting   * Campaign targeting specifying what campaign this feed item
     * can serve with.
     *                 On update, if the field is left unspecified, the previous
     * campaign targeting state
     *                 will not be changed.
     *                 On update, if the field is set with an empty FeedItemCampaignTargeting,
     * the
     *                 campaign targeting will be cleared.
     *                 Note: If adGroupTargeting and campaignTargeting are
     * set (either in the request or pre-existing
     *                 from a previous request), the targeted campaign must
     * match the targeted adgroup's campaign.
     *                 If only adGroupTargeting is specified and there is
     * no campaignTargeting, then a
     *                 campaignTargeting will be set to the targeted adgroup's
     * campaign.
     */
    public void setCampaignTargeting(com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting campaignTargeting) {
        this.campaignTargeting = campaignTargeting;
    }


    /**
     * Gets the adGroupTargeting value for this FeedItem.
     * 
     * @return adGroupTargeting   * Adgroup targeting specifying what adgroup this feed item can
     * serve with.
     *                 On update, if the field is left unspecified, the previous
     * adgroup targeting state
     *                 will not be changed.
     *                 On update, if the field is set with an empty FeedItemAdGroupTargeting,
     * the
     *                 adgroup targeting will be cleared.
     *                 Note: If adGroupTargeting and campaignTargeting are
     * set (either in the request or pre-existing
     *                 from a previous request), the targeted campaign must
     * match the targeted adgroup's campaign.
     *                 If only adGroupTargeting is specified and there is
     * no campaignTargeting, then a
     *                 campaignTargeting will be set to the targeted adgroup's
     * campaign.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting getAdGroupTargeting() {
        return adGroupTargeting;
    }


    /**
     * Sets the adGroupTargeting value for this FeedItem.
     * 
     * @param adGroupTargeting   * Adgroup targeting specifying what adgroup this feed item can
     * serve with.
     *                 On update, if the field is left unspecified, the previous
     * adgroup targeting state
     *                 will not be changed.
     *                 On update, if the field is set with an empty FeedItemAdGroupTargeting,
     * the
     *                 adgroup targeting will be cleared.
     *                 Note: If adGroupTargeting and campaignTargeting are
     * set (either in the request or pre-existing
     *                 from a previous request), the targeted campaign must
     * match the targeted adgroup's campaign.
     *                 If only adGroupTargeting is specified and there is
     * no campaignTargeting, then a
     *                 campaignTargeting will be set to the targeted adgroup's
     * campaign.
     */
    public void setAdGroupTargeting(com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting adGroupTargeting) {
        this.adGroupTargeting = adGroupTargeting;
    }


    /**
     * Gets the keywordTargeting value for this FeedItem.
     * 
     * @return keywordTargeting   * Keyword targeting specifies what keyword this feed item can
     * serve with.
     *                 On update, if the field is left unspecified, the previous
     * keyword targeting state
     *                 will not be changed.
     *                 On update, if the field is set with a Keyword and
     * without Keyword.text set keyword targeting
     *                 will be cleared.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Keyword getKeywordTargeting() {
        return keywordTargeting;
    }


    /**
     * Sets the keywordTargeting value for this FeedItem.
     * 
     * @param keywordTargeting   * Keyword targeting specifies what keyword this feed item can
     * serve with.
     *                 On update, if the field is left unspecified, the previous
     * keyword targeting state
     *                 will not be changed.
     *                 On update, if the field is set with a Keyword and
     * without Keyword.text set keyword targeting
     *                 will be cleared.
     */
    public void setKeywordTargeting(com.google.api.ads.adwords.axis.v201802.cm.Keyword keywordTargeting) {
        this.keywordTargeting = keywordTargeting;
    }


    /**
     * Gets the geoTargeting value for this FeedItem.
     * 
     * @return geoTargeting   * Geo targeting specifies what locations this feed item can serve
     * with.
     *                 On update, if the field is left unspecified, the previous
     * geo targeting state will not
     *                 be changed.
     *                 On update, if the field is set with a null value for
     * criterionId, the geo targeting will be
     *                 cleared.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Location getGeoTargeting() {
        return geoTargeting;
    }


    /**
     * Sets the geoTargeting value for this FeedItem.
     * 
     * @param geoTargeting   * Geo targeting specifies what locations this feed item can serve
     * with.
     *                 On update, if the field is left unspecified, the previous
     * geo targeting state will not
     *                 be changed.
     *                 On update, if the field is set with a null value for
     * criterionId, the geo targeting will be
     *                 cleared.
     */
    public void setGeoTargeting(com.google.api.ads.adwords.axis.v201802.cm.Location geoTargeting) {
        this.geoTargeting = geoTargeting;
    }


    /**
     * Gets the geoTargetingRestriction value for this FeedItem.
     * 
     * @return geoTargetingRestriction   * Geo targeting restriction specifies the type of location that
     * can be used for targeting.
     *                 On update, if the field is left unspecified, the previous
     * geo targeting restriction state
     *                 will not be changed.
     *                 On update, if the field is set with a null GeoRestriction
     * enum, the geo targeting restriction
     *                 will be cleared.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction getGeoTargetingRestriction() {
        return geoTargetingRestriction;
    }


    /**
     * Sets the geoTargetingRestriction value for this FeedItem.
     * 
     * @param geoTargetingRestriction   * Geo targeting restriction specifies the type of location that
     * can be used for targeting.
     *                 On update, if the field is left unspecified, the previous
     * geo targeting restriction state
     *                 will not be changed.
     *                 On update, if the field is set with a null GeoRestriction
     * enum, the geo targeting restriction
     *                 will be cleared.
     */
    public void setGeoTargetingRestriction(com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction geoTargetingRestriction) {
        this.geoTargetingRestriction = geoTargetingRestriction;
    }


    /**
     * Gets the urlCustomParameters value for this FeedItem.
     * 
     * @return urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }


    /**
     * Sets the urlCustomParameters value for this FeedItem.
     * 
     * @param urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public void setUrlCustomParameters(com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItem)) return false;
        FeedItem other = (FeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.feedItemId==null && other.getFeedItemId()==null) || 
             (this.feedItemId!=null &&
              this.feedItemId.equals(other.getFeedItemId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.attributeValues==null && other.getAttributeValues()==null) || 
             (this.attributeValues!=null &&
              java.util.Arrays.equals(this.attributeValues, other.getAttributeValues()))) &&
            ((this.policyData==null && other.getPolicyData()==null) || 
             (this.policyData!=null &&
              java.util.Arrays.equals(this.policyData, other.getPolicyData()))) &&
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.scheduling==null && other.getScheduling()==null) || 
             (this.scheduling!=null &&
              this.scheduling.equals(other.getScheduling()))) &&
            ((this.campaignTargeting==null && other.getCampaignTargeting()==null) || 
             (this.campaignTargeting!=null &&
              this.campaignTargeting.equals(other.getCampaignTargeting()))) &&
            ((this.adGroupTargeting==null && other.getAdGroupTargeting()==null) || 
             (this.adGroupTargeting!=null &&
              this.adGroupTargeting.equals(other.getAdGroupTargeting()))) &&
            ((this.keywordTargeting==null && other.getKeywordTargeting()==null) || 
             (this.keywordTargeting!=null &&
              this.keywordTargeting.equals(other.getKeywordTargeting()))) &&
            ((this.geoTargeting==null && other.getGeoTargeting()==null) || 
             (this.geoTargeting!=null &&
              this.geoTargeting.equals(other.getGeoTargeting()))) &&
            ((this.geoTargetingRestriction==null && other.getGeoTargetingRestriction()==null) || 
             (this.geoTargetingRestriction!=null &&
              this.geoTargetingRestriction.equals(other.getGeoTargetingRestriction()))) &&
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
        int _hashCode = 1;
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getFeedItemId() != null) {
            _hashCode += getFeedItemId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getAttributeValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getScheduling() != null) {
            _hashCode += getScheduling().hashCode();
        }
        if (getCampaignTargeting() != null) {
            _hashCode += getCampaignTargeting().hashCode();
        }
        if (getAdGroupTargeting() != null) {
            _hashCode += getAdGroupTargeting().hashCode();
        }
        if (getKeywordTargeting() != null) {
            _hashCode += getKeywordTargeting().hashCode();
        }
        if (getGeoTargeting() != null) {
            _hashCode += getGeoTargeting().hashCode();
        }
        if (getGeoTargetingRestriction() != null) {
            _hashCode += getGeoTargetingRestriction().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItem.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "attributeValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAttributeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemPolicyData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "devicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemDevicePreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "scheduling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemScheduling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemCampaignTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAdGroupTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "keywordTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Keyword"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "geoTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargetingRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "geoTargetingRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemGeoRestriction"));
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
