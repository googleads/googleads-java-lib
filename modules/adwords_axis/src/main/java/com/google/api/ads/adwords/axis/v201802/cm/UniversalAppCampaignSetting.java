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
 * UniversalAppCampaignSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Setting for storing the mobile app to advertise and creative assets
 * for Universal app campaigns.
 *             This setting is required for Campaigns with advertising
 * channel subtype UNIVERSAL_APP_CAMPAIGN
 *             and can only be attached to such Campaigns.
 */
public class UniversalAppCampaignSetting  extends com.google.api.ads.adwords.axis.v201802.cm.Setting  implements java.io.Serializable {
    /* A string that uniquely identifies a mobile application. The
     * appId should be the same as the
     *                     vendor native id for the app. For example the
     * Android Application "Color Drips"
     *                     (https://play.google.com/store/apps/details?id=com.labpixies.colordrips)
     * would have the appId -
     *                     "com.labpixies.colordrips".
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String appId;

    /* The vendor, i.e. application store that distributes this specific
     * app, as identified by the
     *                     app_id.
     *                     <p>This field is required and should not be null
     * when it is contained within Operators : ADD.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.MobileApplicationVendor appVendor;

    /* A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String description1;

    /* A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String description2;

    /* A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String description3;

    /* A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String description4;

    /* MediaIds for YouTube videos to be shown to users when advertising
     * on video networks. */
    private long[] youtubeVideoMediaIds;

    /* MediaIds for landscape images to be used in creatives to be
     * shown to users when advertising on
     *                     display networks. */
    private long[] imageMediaIds;

    /* Represents the goal towards which the bidding strategy, of
     * this universal app campaign, should
     *                     optimize for. */
    private com.google.api.ads.adwords.axis.v201802.cm.UniversalAppBiddingStrategyGoalType universalAppBiddingStrategyGoalType;

    /* Operations for YouTube Video MediaIds. */
    private com.google.api.ads.adwords.axis.v201802.cm.ListOperations youtubeVideoMediaIdsOps;

    /* Operations for Image MediaIds. */
    private com.google.api.ads.adwords.axis.v201802.cm.ListOperations imageMediaIdsOps;

    /* Ads policy decisions associated with asset(s). */
    private com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAdsPolicyDecisions[] adsPolicyDecisions;

    public UniversalAppCampaignSetting() {
    }

    public UniversalAppCampaignSetting(
           java.lang.String settingType,
           java.lang.String appId,
           com.google.api.ads.adwords.axis.v201802.cm.MobileApplicationVendor appVendor,
           java.lang.String description1,
           java.lang.String description2,
           java.lang.String description3,
           java.lang.String description4,
           long[] youtubeVideoMediaIds,
           long[] imageMediaIds,
           com.google.api.ads.adwords.axis.v201802.cm.UniversalAppBiddingStrategyGoalType universalAppBiddingStrategyGoalType,
           com.google.api.ads.adwords.axis.v201802.cm.ListOperations youtubeVideoMediaIdsOps,
           com.google.api.ads.adwords.axis.v201802.cm.ListOperations imageMediaIdsOps,
           com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAdsPolicyDecisions[] adsPolicyDecisions) {
        super(
            settingType);
        this.appId = appId;
        this.appVendor = appVendor;
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
        this.description4 = description4;
        this.youtubeVideoMediaIds = youtubeVideoMediaIds;
        this.imageMediaIds = imageMediaIds;
        this.universalAppBiddingStrategyGoalType = universalAppBiddingStrategyGoalType;
        this.youtubeVideoMediaIdsOps = youtubeVideoMediaIdsOps;
        this.imageMediaIdsOps = imageMediaIdsOps;
        this.adsPolicyDecisions = adsPolicyDecisions;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adsPolicyDecisions", getAdsPolicyDecisions())
            .add("appId", getAppId())
            .add("appVendor", getAppVendor())
            .add("description1", getDescription1())
            .add("description2", getDescription2())
            .add("description3", getDescription3())
            .add("description4", getDescription4())
            .add("imageMediaIds", getImageMediaIds())
            .add("imageMediaIdsOps", getImageMediaIdsOps())
            .add("settingType", getSettingType())
            .add("universalAppBiddingStrategyGoalType", getUniversalAppBiddingStrategyGoalType())
            .add("youtubeVideoMediaIds", getYoutubeVideoMediaIds())
            .add("youtubeVideoMediaIdsOps", getYoutubeVideoMediaIdsOps())
            .toString();
    }

    /**
     * Gets the appId value for this UniversalAppCampaignSetting.
     * 
     * @return appId   * A string that uniquely identifies a mobile application. The
     * appId should be the same as the
     *                     vendor native id for the app. For example the
     * Android Application "Color Drips"
     *                     (https://play.google.com/store/apps/details?id=com.labpixies.colordrips)
     * would have the appId -
     *                     "com.labpixies.colordrips".
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this UniversalAppCampaignSetting.
     * 
     * @param appId   * A string that uniquely identifies a mobile application. The
     * appId should be the same as the
     *                     vendor native id for the app. For example the
     * Android Application "Color Drips"
     *                     (https://play.google.com/store/apps/details?id=com.labpixies.colordrips)
     * would have the appId -
     *                     "com.labpixies.colordrips".
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the appVendor value for this UniversalAppCampaignSetting.
     * 
     * @return appVendor   * The vendor, i.e. application store that distributes this specific
     * app, as identified by the
     *                     app_id.
     *                     <p>This field is required and should not be null
     * when it is contained within Operators : ADD.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MobileApplicationVendor getAppVendor() {
        return appVendor;
    }


    /**
     * Sets the appVendor value for this UniversalAppCampaignSetting.
     * 
     * @param appVendor   * The vendor, i.e. application store that distributes this specific
     * app, as identified by the
     *                     app_id.
     *                     <p>This field is required and should not be null
     * when it is contained within Operators : ADD.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE.</span>
     */
    public void setAppVendor(com.google.api.ads.adwords.axis.v201802.cm.MobileApplicationVendor appVendor) {
        this.appVendor = appVendor;
    }


    /**
     * Gets the description1 value for this UniversalAppCampaignSetting.
     * 
     * @return description1   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this UniversalAppCampaignSetting.
     * 
     * @param description1   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this UniversalAppCampaignSetting.
     * 
     * @return description2   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this UniversalAppCampaignSetting.
     * 
     * @param description2   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }


    /**
     * Gets the description3 value for this UniversalAppCampaignSetting.
     * 
     * @return description3   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getDescription3() {
        return description3;
    }


    /**
     * Sets the description3 value for this UniversalAppCampaignSetting.
     * 
     * @param description3   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setDescription3(java.lang.String description3) {
        this.description3 = description3;
    }


    /**
     * Gets the description4 value for this UniversalAppCampaignSetting.
     * 
     * @return description4   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getDescription4() {
        return description4;
    }


    /**
     * Sets the description4 value for this UniversalAppCampaignSetting.
     * 
     * @param description4   * A description line of your mobile application promotion ad(s).
     * <span class="constraint MatchesRegex">Description must not contain
     * any '{' or '}' characters. This is checked by the regular expression
     * '[^\{\}]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setDescription4(java.lang.String description4) {
        this.description4 = description4;
    }


    /**
     * Gets the youtubeVideoMediaIds value for this UniversalAppCampaignSetting.
     * 
     * @return youtubeVideoMediaIds   * MediaIds for YouTube videos to be shown to users when advertising
     * on video networks.
     */
    public long[] getYoutubeVideoMediaIds() {
        return youtubeVideoMediaIds;
    }


    /**
     * Sets the youtubeVideoMediaIds value for this UniversalAppCampaignSetting.
     * 
     * @param youtubeVideoMediaIds   * MediaIds for YouTube videos to be shown to users when advertising
     * on video networks.
     */
    public void setYoutubeVideoMediaIds(long[] youtubeVideoMediaIds) {
        this.youtubeVideoMediaIds = youtubeVideoMediaIds;
    }

    public long getYoutubeVideoMediaIds(int i) {
        return this.youtubeVideoMediaIds[i];
    }

    public void setYoutubeVideoMediaIds(int i, long _value) {
        this.youtubeVideoMediaIds[i] = _value;
    }


    /**
     * Gets the imageMediaIds value for this UniversalAppCampaignSetting.
     * 
     * @return imageMediaIds   * MediaIds for landscape images to be used in creatives to be
     * shown to users when advertising on
     *                     display networks.
     */
    public long[] getImageMediaIds() {
        return imageMediaIds;
    }


    /**
     * Sets the imageMediaIds value for this UniversalAppCampaignSetting.
     * 
     * @param imageMediaIds   * MediaIds for landscape images to be used in creatives to be
     * shown to users when advertising on
     *                     display networks.
     */
    public void setImageMediaIds(long[] imageMediaIds) {
        this.imageMediaIds = imageMediaIds;
    }

    public long getImageMediaIds(int i) {
        return this.imageMediaIds[i];
    }

    public void setImageMediaIds(int i, long _value) {
        this.imageMediaIds[i] = _value;
    }


    /**
     * Gets the universalAppBiddingStrategyGoalType value for this UniversalAppCampaignSetting.
     * 
     * @return universalAppBiddingStrategyGoalType   * Represents the goal towards which the bidding strategy, of
     * this universal app campaign, should
     *                     optimize for.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UniversalAppBiddingStrategyGoalType getUniversalAppBiddingStrategyGoalType() {
        return universalAppBiddingStrategyGoalType;
    }


    /**
     * Sets the universalAppBiddingStrategyGoalType value for this UniversalAppCampaignSetting.
     * 
     * @param universalAppBiddingStrategyGoalType   * Represents the goal towards which the bidding strategy, of
     * this universal app campaign, should
     *                     optimize for.
     */
    public void setUniversalAppBiddingStrategyGoalType(com.google.api.ads.adwords.axis.v201802.cm.UniversalAppBiddingStrategyGoalType universalAppBiddingStrategyGoalType) {
        this.universalAppBiddingStrategyGoalType = universalAppBiddingStrategyGoalType;
    }


    /**
     * Gets the youtubeVideoMediaIdsOps value for this UniversalAppCampaignSetting.
     * 
     * @return youtubeVideoMediaIdsOps   * Operations for YouTube Video MediaIds.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ListOperations getYoutubeVideoMediaIdsOps() {
        return youtubeVideoMediaIdsOps;
    }


    /**
     * Sets the youtubeVideoMediaIdsOps value for this UniversalAppCampaignSetting.
     * 
     * @param youtubeVideoMediaIdsOps   * Operations for YouTube Video MediaIds.
     */
    public void setYoutubeVideoMediaIdsOps(com.google.api.ads.adwords.axis.v201802.cm.ListOperations youtubeVideoMediaIdsOps) {
        this.youtubeVideoMediaIdsOps = youtubeVideoMediaIdsOps;
    }


    /**
     * Gets the imageMediaIdsOps value for this UniversalAppCampaignSetting.
     * 
     * @return imageMediaIdsOps   * Operations for Image MediaIds.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ListOperations getImageMediaIdsOps() {
        return imageMediaIdsOps;
    }


    /**
     * Sets the imageMediaIdsOps value for this UniversalAppCampaignSetting.
     * 
     * @param imageMediaIdsOps   * Operations for Image MediaIds.
     */
    public void setImageMediaIdsOps(com.google.api.ads.adwords.axis.v201802.cm.ListOperations imageMediaIdsOps) {
        this.imageMediaIdsOps = imageMediaIdsOps;
    }


    /**
     * Gets the adsPolicyDecisions value for this UniversalAppCampaignSetting.
     * 
     * @return adsPolicyDecisions   * Ads policy decisions associated with asset(s).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAdsPolicyDecisions[] getAdsPolicyDecisions() {
        return adsPolicyDecisions;
    }


    /**
     * Sets the adsPolicyDecisions value for this UniversalAppCampaignSetting.
     * 
     * @param adsPolicyDecisions   * Ads policy decisions associated with asset(s).
     */
    public void setAdsPolicyDecisions(com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAdsPolicyDecisions[] adsPolicyDecisions) {
        this.adsPolicyDecisions = adsPolicyDecisions;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAdsPolicyDecisions getAdsPolicyDecisions(int i) {
        return this.adsPolicyDecisions[i];
    }

    public void setAdsPolicyDecisions(int i, com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAdsPolicyDecisions _value) {
        this.adsPolicyDecisions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UniversalAppCampaignSetting)) return false;
        UniversalAppCampaignSetting other = (UniversalAppCampaignSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.appVendor==null && other.getAppVendor()==null) || 
             (this.appVendor!=null &&
              this.appVendor.equals(other.getAppVendor()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2()))) &&
            ((this.description3==null && other.getDescription3()==null) || 
             (this.description3!=null &&
              this.description3.equals(other.getDescription3()))) &&
            ((this.description4==null && other.getDescription4()==null) || 
             (this.description4!=null &&
              this.description4.equals(other.getDescription4()))) &&
            ((this.youtubeVideoMediaIds==null && other.getYoutubeVideoMediaIds()==null) || 
             (this.youtubeVideoMediaIds!=null &&
              java.util.Arrays.equals(this.youtubeVideoMediaIds, other.getYoutubeVideoMediaIds()))) &&
            ((this.imageMediaIds==null && other.getImageMediaIds()==null) || 
             (this.imageMediaIds!=null &&
              java.util.Arrays.equals(this.imageMediaIds, other.getImageMediaIds()))) &&
            ((this.universalAppBiddingStrategyGoalType==null && other.getUniversalAppBiddingStrategyGoalType()==null) || 
             (this.universalAppBiddingStrategyGoalType!=null &&
              this.universalAppBiddingStrategyGoalType.equals(other.getUniversalAppBiddingStrategyGoalType()))) &&
            ((this.youtubeVideoMediaIdsOps==null && other.getYoutubeVideoMediaIdsOps()==null) || 
             (this.youtubeVideoMediaIdsOps!=null &&
              this.youtubeVideoMediaIdsOps.equals(other.getYoutubeVideoMediaIdsOps()))) &&
            ((this.imageMediaIdsOps==null && other.getImageMediaIdsOps()==null) || 
             (this.imageMediaIdsOps!=null &&
              this.imageMediaIdsOps.equals(other.getImageMediaIdsOps()))) &&
            ((this.adsPolicyDecisions==null && other.getAdsPolicyDecisions()==null) || 
             (this.adsPolicyDecisions!=null &&
              java.util.Arrays.equals(this.adsPolicyDecisions, other.getAdsPolicyDecisions())));
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
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getAppVendor() != null) {
            _hashCode += getAppVendor().hashCode();
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        if (getDescription3() != null) {
            _hashCode += getDescription3().hashCode();
        }
        if (getDescription4() != null) {
            _hashCode += getDescription4().hashCode();
        }
        if (getYoutubeVideoMediaIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYoutubeVideoMediaIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getYoutubeVideoMediaIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImageMediaIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageMediaIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageMediaIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUniversalAppBiddingStrategyGoalType() != null) {
            _hashCode += getUniversalAppBiddingStrategyGoalType().hashCode();
        }
        if (getYoutubeVideoMediaIdsOps() != null) {
            _hashCode += getYoutubeVideoMediaIdsOps().hashCode();
        }
        if (getImageMediaIdsOps() != null) {
            _hashCode += getImageMediaIdsOps().hashCode();
        }
        if (getAdsPolicyDecisions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdsPolicyDecisions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdsPolicyDecisions(), i);
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
        new org.apache.axis.description.TypeDesc(UniversalAppCampaignSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppCampaignSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileApplicationVendor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description3");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description4");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youtubeVideoMediaIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "youtubeVideoMediaIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageMediaIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "imageMediaIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("universalAppBiddingStrategyGoalType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "universalAppBiddingStrategyGoalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppBiddingStrategyGoalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youtubeVideoMediaIdsOps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "youtubeVideoMediaIdsOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListOperations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageMediaIdsOps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "imageMediaIdsOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListOperations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adsPolicyDecisions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adsPolicyDecisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppCampaignAdsPolicyDecisions"));
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
