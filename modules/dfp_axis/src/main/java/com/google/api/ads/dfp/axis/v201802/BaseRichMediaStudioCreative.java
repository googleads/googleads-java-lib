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
 * BaseRichMediaStudioCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} that is created by a Rich Media Studio.
 */
public abstract class BaseRichMediaStudioCreative  extends com.google.api.ads.dfp.axis.v201802.Creative  implements java.io.Serializable {
    /* The creative ID as known by Rich Media Studio creative. This
     * attribute is readonly. */
    private java.lang.Long studioCreativeId;

    /* The creative format of the Rich Media Studio creative. This
     * attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeFormat creativeFormat;

    /* The type of artwork used in this creative. This attribute is
     * readonly. */
    private com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeArtworkType artworkType;

    /* The total size of all assets in bytes. This attribute is readonly. */
    private java.lang.Long totalFileSize;

    /* Ad tag keys. This attribute is optional and updatable. */
    private java.lang.String[] adTagKeys;

    /* Custom key values. This attribute is optional and updatable. */
    private java.lang.String[] customKeyValues;

    /* The survey URL for this creative. This attribute is optional
     * and updatable. */
    private java.lang.String surveyUrl;

    /* The tracking URL to be triggered when an ad starts to play,
     * whether Rich Media or backup
     *                     content is displayed. Behaves like the {@code
     * /imp} URL that DART used to track impressions.
     *                     This URL can't exceed 1024 characters and must
     * start with http:// or https://.
     *                     This attribute is optional and updatable. */
    private java.lang.String allImpressionsUrl;

    /* The tracking URL to be triggered when any rich media artwork
     * is displayed in an ad. Behaves
     *                     like the {@code /imp} URL that DART used to track
     * impressions. This URL can't exceed 1024
     *                     characters and must start with http:// or https://.
     * This attribute is optional and updatable. */
    private java.lang.String richMediaImpressionsUrl;

    /* The tracking URL to be triggered when the Rich Media backup
     * image is served.
     *                     This attribute is optional and updatable. */
    private java.lang.String backupImageImpressionsUrl;

    /* The override CSS. You can put custom CSS code here to repair
     * creative styling;
     *                     e.g. {@code tr td { background-color:#FBB; }}.
     * This attribute is optional and updatable. */
    private java.lang.String overrideCss;

    /* The Flash plugin version required to view this creative; e.g.
     * {@code Flash 10.2/AS 3}.
     *                     This attribute is read only. */
    private java.lang.String requiredFlashPluginVersion;

    /* The duration of the creative in milliseconds. This attribute
     * is optional and updatable. */
    private java.lang.Integer duration;

    /* The billing attribute associated with this creative. This attribute
     * is read only. */
    private com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeBillingAttribute billingAttribute;

    /* The list of child assets associated with this creative. This
     * attribute is read only. */
    private com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetProperty[] richMediaStudioChildAssetProperties;

    /* The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google. */
    private com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult;

    /* The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}. */
    private com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride;

    public BaseRichMediaStudioCreative() {
    }

    public BaseRichMediaStudioCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.Long studioCreativeId,
           com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeFormat creativeFormat,
           com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeArtworkType artworkType,
           java.lang.Long totalFileSize,
           java.lang.String[] adTagKeys,
           java.lang.String[] customKeyValues,
           java.lang.String surveyUrl,
           java.lang.String allImpressionsUrl,
           java.lang.String richMediaImpressionsUrl,
           java.lang.String backupImageImpressionsUrl,
           java.lang.String overrideCss,
           java.lang.String requiredFlashPluginVersion,
           java.lang.Integer duration,
           com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeBillingAttribute billingAttribute,
           com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetProperty[] richMediaStudioChildAssetProperties,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues);
        this.studioCreativeId = studioCreativeId;
        this.creativeFormat = creativeFormat;
        this.artworkType = artworkType;
        this.totalFileSize = totalFileSize;
        this.adTagKeys = adTagKeys;
        this.customKeyValues = customKeyValues;
        this.surveyUrl = surveyUrl;
        this.allImpressionsUrl = allImpressionsUrl;
        this.richMediaImpressionsUrl = richMediaImpressionsUrl;
        this.backupImageImpressionsUrl = backupImageImpressionsUrl;
        this.overrideCss = overrideCss;
        this.requiredFlashPluginVersion = requiredFlashPluginVersion;
        this.duration = duration;
        this.billingAttribute = billingAttribute;
        this.richMediaStudioChildAssetProperties = richMediaStudioChildAssetProperties;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adTagKeys", getAdTagKeys())
            .add("advertiserId", getAdvertiserId())
            .add("allImpressionsUrl", getAllImpressionsUrl())
            .add("appliedLabels", getAppliedLabels())
            .add("artworkType", getArtworkType())
            .add("backupImageImpressionsUrl", getBackupImageImpressionsUrl())
            .add("billingAttribute", getBillingAttribute())
            .add("creativeFormat", getCreativeFormat())
            .add("customFieldValues", getCustomFieldValues())
            .add("customKeyValues", getCustomKeyValues())
            .add("duration", getDuration())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("overrideCss", getOverrideCss())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("requiredFlashPluginVersion", getRequiredFlashPluginVersion())
            .add("richMediaImpressionsUrl", getRichMediaImpressionsUrl())
            .add("richMediaStudioChildAssetProperties", getRichMediaStudioChildAssetProperties())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("studioCreativeId", getStudioCreativeId())
            .add("surveyUrl", getSurveyUrl())
            .add("totalFileSize", getTotalFileSize())
            .toString();
    }

    /**
     * Gets the studioCreativeId value for this BaseRichMediaStudioCreative.
     * 
     * @return studioCreativeId   * The creative ID as known by Rich Media Studio creative. This
     * attribute is readonly.
     */
    public java.lang.Long getStudioCreativeId() {
        return studioCreativeId;
    }


    /**
     * Sets the studioCreativeId value for this BaseRichMediaStudioCreative.
     * 
     * @param studioCreativeId   * The creative ID as known by Rich Media Studio creative. This
     * attribute is readonly.
     */
    public void setStudioCreativeId(java.lang.Long studioCreativeId) {
        this.studioCreativeId = studioCreativeId;
    }


    /**
     * Gets the creativeFormat value for this BaseRichMediaStudioCreative.
     * 
     * @return creativeFormat   * The creative format of the Rich Media Studio creative. This
     * attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeFormat getCreativeFormat() {
        return creativeFormat;
    }


    /**
     * Sets the creativeFormat value for this BaseRichMediaStudioCreative.
     * 
     * @param creativeFormat   * The creative format of the Rich Media Studio creative. This
     * attribute is readonly.
     */
    public void setCreativeFormat(com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeFormat creativeFormat) {
        this.creativeFormat = creativeFormat;
    }


    /**
     * Gets the artworkType value for this BaseRichMediaStudioCreative.
     * 
     * @return artworkType   * The type of artwork used in this creative. This attribute is
     * readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeArtworkType getArtworkType() {
        return artworkType;
    }


    /**
     * Sets the artworkType value for this BaseRichMediaStudioCreative.
     * 
     * @param artworkType   * The type of artwork used in this creative. This attribute is
     * readonly.
     */
    public void setArtworkType(com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeArtworkType artworkType) {
        this.artworkType = artworkType;
    }


    /**
     * Gets the totalFileSize value for this BaseRichMediaStudioCreative.
     * 
     * @return totalFileSize   * The total size of all assets in bytes. This attribute is readonly.
     */
    public java.lang.Long getTotalFileSize() {
        return totalFileSize;
    }


    /**
     * Sets the totalFileSize value for this BaseRichMediaStudioCreative.
     * 
     * @param totalFileSize   * The total size of all assets in bytes. This attribute is readonly.
     */
    public void setTotalFileSize(java.lang.Long totalFileSize) {
        this.totalFileSize = totalFileSize;
    }


    /**
     * Gets the adTagKeys value for this BaseRichMediaStudioCreative.
     * 
     * @return adTagKeys   * Ad tag keys. This attribute is optional and updatable.
     */
    public java.lang.String[] getAdTagKeys() {
        return adTagKeys;
    }


    /**
     * Sets the adTagKeys value for this BaseRichMediaStudioCreative.
     * 
     * @param adTagKeys   * Ad tag keys. This attribute is optional and updatable.
     */
    public void setAdTagKeys(java.lang.String[] adTagKeys) {
        this.adTagKeys = adTagKeys;
    }

    public java.lang.String getAdTagKeys(int i) {
        return this.adTagKeys[i];
    }

    public void setAdTagKeys(int i, java.lang.String _value) {
        this.adTagKeys[i] = _value;
    }


    /**
     * Gets the customKeyValues value for this BaseRichMediaStudioCreative.
     * 
     * @return customKeyValues   * Custom key values. This attribute is optional and updatable.
     */
    public java.lang.String[] getCustomKeyValues() {
        return customKeyValues;
    }


    /**
     * Sets the customKeyValues value for this BaseRichMediaStudioCreative.
     * 
     * @param customKeyValues   * Custom key values. This attribute is optional and updatable.
     */
    public void setCustomKeyValues(java.lang.String[] customKeyValues) {
        this.customKeyValues = customKeyValues;
    }

    public java.lang.String getCustomKeyValues(int i) {
        return this.customKeyValues[i];
    }

    public void setCustomKeyValues(int i, java.lang.String _value) {
        this.customKeyValues[i] = _value;
    }


    /**
     * Gets the surveyUrl value for this BaseRichMediaStudioCreative.
     * 
     * @return surveyUrl   * The survey URL for this creative. This attribute is optional
     * and updatable.
     */
    public java.lang.String getSurveyUrl() {
        return surveyUrl;
    }


    /**
     * Sets the surveyUrl value for this BaseRichMediaStudioCreative.
     * 
     * @param surveyUrl   * The survey URL for this creative. This attribute is optional
     * and updatable.
     */
    public void setSurveyUrl(java.lang.String surveyUrl) {
        this.surveyUrl = surveyUrl;
    }


    /**
     * Gets the allImpressionsUrl value for this BaseRichMediaStudioCreative.
     * 
     * @return allImpressionsUrl   * The tracking URL to be triggered when an ad starts to play,
     * whether Rich Media or backup
     *                     content is displayed. Behaves like the {@code
     * /imp} URL that DART used to track impressions.
     *                     This URL can't exceed 1024 characters and must
     * start with http:// or https://.
     *                     This attribute is optional and updatable.
     */
    public java.lang.String getAllImpressionsUrl() {
        return allImpressionsUrl;
    }


    /**
     * Sets the allImpressionsUrl value for this BaseRichMediaStudioCreative.
     * 
     * @param allImpressionsUrl   * The tracking URL to be triggered when an ad starts to play,
     * whether Rich Media or backup
     *                     content is displayed. Behaves like the {@code
     * /imp} URL that DART used to track impressions.
     *                     This URL can't exceed 1024 characters and must
     * start with http:// or https://.
     *                     This attribute is optional and updatable.
     */
    public void setAllImpressionsUrl(java.lang.String allImpressionsUrl) {
        this.allImpressionsUrl = allImpressionsUrl;
    }


    /**
     * Gets the richMediaImpressionsUrl value for this BaseRichMediaStudioCreative.
     * 
     * @return richMediaImpressionsUrl   * The tracking URL to be triggered when any rich media artwork
     * is displayed in an ad. Behaves
     *                     like the {@code /imp} URL that DART used to track
     * impressions. This URL can't exceed 1024
     *                     characters and must start with http:// or https://.
     * This attribute is optional and updatable.
     */
    public java.lang.String getRichMediaImpressionsUrl() {
        return richMediaImpressionsUrl;
    }


    /**
     * Sets the richMediaImpressionsUrl value for this BaseRichMediaStudioCreative.
     * 
     * @param richMediaImpressionsUrl   * The tracking URL to be triggered when any rich media artwork
     * is displayed in an ad. Behaves
     *                     like the {@code /imp} URL that DART used to track
     * impressions. This URL can't exceed 1024
     *                     characters and must start with http:// or https://.
     * This attribute is optional and updatable.
     */
    public void setRichMediaImpressionsUrl(java.lang.String richMediaImpressionsUrl) {
        this.richMediaImpressionsUrl = richMediaImpressionsUrl;
    }


    /**
     * Gets the backupImageImpressionsUrl value for this BaseRichMediaStudioCreative.
     * 
     * @return backupImageImpressionsUrl   * The tracking URL to be triggered when the Rich Media backup
     * image is served.
     *                     This attribute is optional and updatable.
     */
    public java.lang.String getBackupImageImpressionsUrl() {
        return backupImageImpressionsUrl;
    }


    /**
     * Sets the backupImageImpressionsUrl value for this BaseRichMediaStudioCreative.
     * 
     * @param backupImageImpressionsUrl   * The tracking URL to be triggered when the Rich Media backup
     * image is served.
     *                     This attribute is optional and updatable.
     */
    public void setBackupImageImpressionsUrl(java.lang.String backupImageImpressionsUrl) {
        this.backupImageImpressionsUrl = backupImageImpressionsUrl;
    }


    /**
     * Gets the overrideCss value for this BaseRichMediaStudioCreative.
     * 
     * @return overrideCss   * The override CSS. You can put custom CSS code here to repair
     * creative styling;
     *                     e.g. {@code tr td { background-color:#FBB; }}.
     * This attribute is optional and updatable.
     */
    public java.lang.String getOverrideCss() {
        return overrideCss;
    }


    /**
     * Sets the overrideCss value for this BaseRichMediaStudioCreative.
     * 
     * @param overrideCss   * The override CSS. You can put custom CSS code here to repair
     * creative styling;
     *                     e.g. {@code tr td { background-color:#FBB; }}.
     * This attribute is optional and updatable.
     */
    public void setOverrideCss(java.lang.String overrideCss) {
        this.overrideCss = overrideCss;
    }


    /**
     * Gets the requiredFlashPluginVersion value for this BaseRichMediaStudioCreative.
     * 
     * @return requiredFlashPluginVersion   * The Flash plugin version required to view this creative; e.g.
     * {@code Flash 10.2/AS 3}.
     *                     This attribute is read only.
     */
    public java.lang.String getRequiredFlashPluginVersion() {
        return requiredFlashPluginVersion;
    }


    /**
     * Sets the requiredFlashPluginVersion value for this BaseRichMediaStudioCreative.
     * 
     * @param requiredFlashPluginVersion   * The Flash plugin version required to view this creative; e.g.
     * {@code Flash 10.2/AS 3}.
     *                     This attribute is read only.
     */
    public void setRequiredFlashPluginVersion(java.lang.String requiredFlashPluginVersion) {
        this.requiredFlashPluginVersion = requiredFlashPluginVersion;
    }


    /**
     * Gets the duration value for this BaseRichMediaStudioCreative.
     * 
     * @return duration   * The duration of the creative in milliseconds. This attribute
     * is optional and updatable.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this BaseRichMediaStudioCreative.
     * 
     * @param duration   * The duration of the creative in milliseconds. This attribute
     * is optional and updatable.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the billingAttribute value for this BaseRichMediaStudioCreative.
     * 
     * @return billingAttribute   * The billing attribute associated with this creative. This attribute
     * is read only.
     */
    public com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeBillingAttribute getBillingAttribute() {
        return billingAttribute;
    }


    /**
     * Sets the billingAttribute value for this BaseRichMediaStudioCreative.
     * 
     * @param billingAttribute   * The billing attribute associated with this creative. This attribute
     * is read only.
     */
    public void setBillingAttribute(com.google.api.ads.dfp.axis.v201802.RichMediaStudioCreativeBillingAttribute billingAttribute) {
        this.billingAttribute = billingAttribute;
    }


    /**
     * Gets the richMediaStudioChildAssetProperties value for this BaseRichMediaStudioCreative.
     * 
     * @return richMediaStudioChildAssetProperties   * The list of child assets associated with this creative. This
     * attribute is read only.
     */
    public com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetProperty[] getRichMediaStudioChildAssetProperties() {
        return richMediaStudioChildAssetProperties;
    }


    /**
     * Sets the richMediaStudioChildAssetProperties value for this BaseRichMediaStudioCreative.
     * 
     * @param richMediaStudioChildAssetProperties   * The list of child assets associated with this creative. This
     * attribute is read only.
     */
    public void setRichMediaStudioChildAssetProperties(com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetProperty[] richMediaStudioChildAssetProperties) {
        this.richMediaStudioChildAssetProperties = richMediaStudioChildAssetProperties;
    }

    public com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetProperty getRichMediaStudioChildAssetProperties(int i) {
        return this.richMediaStudioChildAssetProperties[i];
    }

    public void setRichMediaStudioChildAssetProperties(int i, com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetProperty _value) {
        this.richMediaStudioChildAssetProperties[i] = _value;
    }


    /**
     * Gets the sslScanResult value for this BaseRichMediaStudioCreative.
     * 
     * @return sslScanResult   * The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.SslScanResult getSslScanResult() {
        return sslScanResult;
    }


    /**
     * Sets the sslScanResult value for this BaseRichMediaStudioCreative.
     * 
     * @param sslScanResult   * The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public void setSslScanResult(com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult) {
        this.sslScanResult = sslScanResult;
    }


    /**
     * Gets the sslManualOverride value for this BaseRichMediaStudioCreative.
     * 
     * @return sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public com.google.api.ads.dfp.axis.v201802.SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }


    /**
     * Sets the sslManualOverride value for this BaseRichMediaStudioCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public void setSslManualOverride(com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseRichMediaStudioCreative)) return false;
        BaseRichMediaStudioCreative other = (BaseRichMediaStudioCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.studioCreativeId==null && other.getStudioCreativeId()==null) || 
             (this.studioCreativeId!=null &&
              this.studioCreativeId.equals(other.getStudioCreativeId()))) &&
            ((this.creativeFormat==null && other.getCreativeFormat()==null) || 
             (this.creativeFormat!=null &&
              this.creativeFormat.equals(other.getCreativeFormat()))) &&
            ((this.artworkType==null && other.getArtworkType()==null) || 
             (this.artworkType!=null &&
              this.artworkType.equals(other.getArtworkType()))) &&
            ((this.totalFileSize==null && other.getTotalFileSize()==null) || 
             (this.totalFileSize!=null &&
              this.totalFileSize.equals(other.getTotalFileSize()))) &&
            ((this.adTagKeys==null && other.getAdTagKeys()==null) || 
             (this.adTagKeys!=null &&
              java.util.Arrays.equals(this.adTagKeys, other.getAdTagKeys()))) &&
            ((this.customKeyValues==null && other.getCustomKeyValues()==null) || 
             (this.customKeyValues!=null &&
              java.util.Arrays.equals(this.customKeyValues, other.getCustomKeyValues()))) &&
            ((this.surveyUrl==null && other.getSurveyUrl()==null) || 
             (this.surveyUrl!=null &&
              this.surveyUrl.equals(other.getSurveyUrl()))) &&
            ((this.allImpressionsUrl==null && other.getAllImpressionsUrl()==null) || 
             (this.allImpressionsUrl!=null &&
              this.allImpressionsUrl.equals(other.getAllImpressionsUrl()))) &&
            ((this.richMediaImpressionsUrl==null && other.getRichMediaImpressionsUrl()==null) || 
             (this.richMediaImpressionsUrl!=null &&
              this.richMediaImpressionsUrl.equals(other.getRichMediaImpressionsUrl()))) &&
            ((this.backupImageImpressionsUrl==null && other.getBackupImageImpressionsUrl()==null) || 
             (this.backupImageImpressionsUrl!=null &&
              this.backupImageImpressionsUrl.equals(other.getBackupImageImpressionsUrl()))) &&
            ((this.overrideCss==null && other.getOverrideCss()==null) || 
             (this.overrideCss!=null &&
              this.overrideCss.equals(other.getOverrideCss()))) &&
            ((this.requiredFlashPluginVersion==null && other.getRequiredFlashPluginVersion()==null) || 
             (this.requiredFlashPluginVersion!=null &&
              this.requiredFlashPluginVersion.equals(other.getRequiredFlashPluginVersion()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.billingAttribute==null && other.getBillingAttribute()==null) || 
             (this.billingAttribute!=null &&
              this.billingAttribute.equals(other.getBillingAttribute()))) &&
            ((this.richMediaStudioChildAssetProperties==null && other.getRichMediaStudioChildAssetProperties()==null) || 
             (this.richMediaStudioChildAssetProperties!=null &&
              java.util.Arrays.equals(this.richMediaStudioChildAssetProperties, other.getRichMediaStudioChildAssetProperties()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride())));
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
        if (getStudioCreativeId() != null) {
            _hashCode += getStudioCreativeId().hashCode();
        }
        if (getCreativeFormat() != null) {
            _hashCode += getCreativeFormat().hashCode();
        }
        if (getArtworkType() != null) {
            _hashCode += getArtworkType().hashCode();
        }
        if (getTotalFileSize() != null) {
            _hashCode += getTotalFileSize().hashCode();
        }
        if (getAdTagKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdTagKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdTagKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomKeyValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomKeyValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomKeyValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurveyUrl() != null) {
            _hashCode += getSurveyUrl().hashCode();
        }
        if (getAllImpressionsUrl() != null) {
            _hashCode += getAllImpressionsUrl().hashCode();
        }
        if (getRichMediaImpressionsUrl() != null) {
            _hashCode += getRichMediaImpressionsUrl().hashCode();
        }
        if (getBackupImageImpressionsUrl() != null) {
            _hashCode += getBackupImageImpressionsUrl().hashCode();
        }
        if (getOverrideCss() != null) {
            _hashCode += getOverrideCss().hashCode();
        }
        if (getRequiredFlashPluginVersion() != null) {
            _hashCode += getRequiredFlashPluginVersion().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getBillingAttribute() != null) {
            _hashCode += getBillingAttribute().hashCode();
        }
        if (getRichMediaStudioChildAssetProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRichMediaStudioChildAssetProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRichMediaStudioChildAssetProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseRichMediaStudioCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseRichMediaStudioCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studioCreativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "studioCreativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioCreativeFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artworkType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "artworkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioCreativeArtworkType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "totalFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTagKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adTagKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customKeyValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customKeyValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "surveyUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allImpressionsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allImpressionsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richMediaImpressionsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "richMediaImpressionsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupImageImpressionsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "backupImageImpressionsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideCss");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "overrideCss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredFlashPluginVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "requiredFlashPluginVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioCreativeBillingAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richMediaStudioChildAssetProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "richMediaStudioChildAssetProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioChildAssetProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslScanResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sslScanResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SslScanResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslManualOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sslManualOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SslManualOverride"));
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
