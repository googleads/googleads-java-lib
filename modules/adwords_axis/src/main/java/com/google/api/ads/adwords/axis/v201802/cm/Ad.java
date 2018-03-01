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
 * Ad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * The base class of all ad types. {@code Ad} objects themselves cannot
 * be modified. If you want to
 *             make a change to an {@code Ad} object, you must REMOVE
 * its AdGroupAd and ADD a new AdGroupAd with
 *             the new {@code Ad}. This will result in a new {@code Ad}
 * ID, so stats for the original {@code Ad}
 *             and the new {@code Ad} will appear under separate IDs
 * in reports.
 *             
 *             <p>When calling {@code AdGroupAdService} to update the
 * {@code status} of an {@code AdGroupAd},
 *             you can construct an {@code Ad} object (instead of the
 * {@code Ad}'s concrete type) with the
 *             {@link #id} field set.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class Ad  implements java.io.Serializable {
    /* ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}. */
    private java.lang.Long id;

    /* Destination URL.
     *                 <p>Do not set this field if you are using upgraded
     * URLs, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls */
    private java.lang.String url;

    /* Visible URL. */
    private java.lang.String displayUrl;

    /* A list of possible final URLs after all cross domain redirects.
     * <p>This field is used for upgraded urls only, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 10.</span> */
    private java.lang.String[] finalUrls;

    /* A list of possible final mobile URLs after all cross domain
     * redirects.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 10.</span> */
    private java.lang.String[] finalMobileUrls;

    /* A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                 installed.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls */
    private com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] finalAppUrls;

    /* URL template for constructing a tracking URL.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls */
    private java.lang.String trackingUrlTemplate;

    /* URL template for appending params to Final URL.
     *                 
     *                 <p>On update, empty string ("") indicates to clear
     * the field. */
    private java.lang.String finalUrlSuffix;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     * <p>This field is used for upgraded urls only, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls */
    private com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters;

    /* Additional urls for the ad that are tagged with a unique identifier.
     * Currently only used for
     *                 TemplateAds for specific template IDs. For all other
     * ad types, use finalUrls,
     *                 finalMobileUrls and finalAppUrls instead. */
    private com.google.api.ads.adwords.axis.v201802.cm.UrlData[] urlData;

    /* Indicates if this ad was added by AdWords. */
    private java.lang.Boolean automated;

    /* Type of ad. */
    private com.google.api.ads.adwords.axis.v201802.cm.AdType type;

    /* The device preference for the ad. You can only specify a preference
     * for
     *                 mobile devices (CriterionId 30001). If unspecified
     * (no device preference),
     *                 all devices are targeted. */
    private java.lang.Long devicePreference;

    /* The source of this system-managed ad.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.SystemManagedEntitySource systemManagedEntitySource;

    /* Indicates that this instance is a subtype of Ad.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String adType;

    public Ad() {
    }

    public Ad(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201802.cm.UrlData[] urlData,
           java.lang.Boolean automated,
           com.google.api.ads.adwords.axis.v201802.cm.AdType type,
           java.lang.Long devicePreference,
           com.google.api.ads.adwords.axis.v201802.cm.SystemManagedEntitySource systemManagedEntitySource,
           java.lang.String adType) {
           this.id = id;
           this.url = url;
           this.displayUrl = displayUrl;
           this.finalUrls = finalUrls;
           this.finalMobileUrls = finalMobileUrls;
           this.finalAppUrls = finalAppUrls;
           this.trackingUrlTemplate = trackingUrlTemplate;
           this.finalUrlSuffix = finalUrlSuffix;
           this.urlCustomParameters = urlCustomParameters;
           this.urlData = urlData;
           this.automated = automated;
           this.type = type;
           this.devicePreference = devicePreference;
           this.systemManagedEntitySource = systemManagedEntitySource;
           this.adType = adType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("id", getId())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the id value for this Ad.
     * 
     * @return id   * ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Ad.
     * 
     * @param id   * ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the url value for this Ad.
     * 
     * @return url   * Destination URL.
     *                 <p>Do not set this field if you are using upgraded
     * URLs, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Ad.
     * 
     * @param url   * Destination URL.
     *                 <p>Do not set this field if you are using upgraded
     * URLs, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the displayUrl value for this Ad.
     * 
     * @return displayUrl   * Visible URL.
     */
    public java.lang.String getDisplayUrl() {
        return displayUrl;
    }


    /**
     * Sets the displayUrl value for this Ad.
     * 
     * @param displayUrl   * Visible URL.
     */
    public void setDisplayUrl(java.lang.String displayUrl) {
        this.displayUrl = displayUrl;
    }


    /**
     * Gets the finalUrls value for this Ad.
     * 
     * @return finalUrls   * A list of possible final URLs after all cross domain redirects.
     * <p>This field is used for upgraded urls only, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 10.</span>
     */
    public java.lang.String[] getFinalUrls() {
        return finalUrls;
    }


    /**
     * Sets the finalUrls value for this Ad.
     * 
     * @param finalUrls   * A list of possible final URLs after all cross domain redirects.
     * <p>This field is used for upgraded urls only, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 10.</span>
     */
    public void setFinalUrls(java.lang.String[] finalUrls) {
        this.finalUrls = finalUrls;
    }

    public java.lang.String getFinalUrls(int i) {
        return this.finalUrls[i];
    }

    public void setFinalUrls(int i, java.lang.String _value) {
        this.finalUrls[i] = _value;
    }


    /**
     * Gets the finalMobileUrls value for this Ad.
     * 
     * @return finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 10.</span>
     */
    public java.lang.String[] getFinalMobileUrls() {
        return finalMobileUrls;
    }


    /**
     * Sets the finalMobileUrls value for this Ad.
     * 
     * @param finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 10.</span>
     */
    public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }

    public java.lang.String getFinalMobileUrls(int i) {
        return this.finalMobileUrls[i];
    }

    public void setFinalMobileUrls(int i, java.lang.String _value) {
        this.finalMobileUrls[i] = _value;
    }


    /**
     * Gets the finalAppUrls value for this Ad.
     * 
     * @return finalAppUrls   * A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                 installed.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] getFinalAppUrls() {
        return finalAppUrls;
    }


    /**
     * Sets the finalAppUrls value for this Ad.
     * 
     * @param finalAppUrls   * A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                 installed.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public void setFinalAppUrls(com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] finalAppUrls) {
        this.finalAppUrls = finalAppUrls;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.AppUrl getFinalAppUrls(int i) {
        return this.finalAppUrls[i];
    }

    public void setFinalAppUrls(int i, com.google.api.ads.adwords.axis.v201802.cm.AppUrl _value) {
        this.finalAppUrls[i] = _value;
    }


    /**
     * Gets the trackingUrlTemplate value for this Ad.
     * 
     * @return trackingUrlTemplate   * URL template for constructing a tracking URL.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this Ad.
     * 
     * @param trackingUrlTemplate   * URL template for constructing a tracking URL.
     *                 <p>This field is used for upgraded urls only, as described
     * at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the finalUrlSuffix value for this Ad.
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
     * Sets the finalUrlSuffix value for this Ad.
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
     * Gets the urlCustomParameters value for this Ad.
     * 
     * @return urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     * <p>This field is used for upgraded urls only, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }


    /**
     * Sets the urlCustomParameters value for this Ad.
     * 
     * @param urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     * <p>This field is used for upgraded urls only, as described at:
     *                 https://developers.google.com/adwords/api/docs/guides/upgraded-urls
     */
    public void setUrlCustomParameters(com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }


    /**
     * Gets the urlData value for this Ad.
     * 
     * @return urlData   * Additional urls for the ad that are tagged with a unique identifier.
     * Currently only used for
     *                 TemplateAds for specific template IDs. For all other
     * ad types, use finalUrls,
     *                 finalMobileUrls and finalAppUrls instead.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UrlData[] getUrlData() {
        return urlData;
    }


    /**
     * Sets the urlData value for this Ad.
     * 
     * @param urlData   * Additional urls for the ad that are tagged with a unique identifier.
     * Currently only used for
     *                 TemplateAds for specific template IDs. For all other
     * ad types, use finalUrls,
     *                 finalMobileUrls and finalAppUrls instead.
     */
    public void setUrlData(com.google.api.ads.adwords.axis.v201802.cm.UrlData[] urlData) {
        this.urlData = urlData;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.UrlData getUrlData(int i) {
        return this.urlData[i];
    }

    public void setUrlData(int i, com.google.api.ads.adwords.axis.v201802.cm.UrlData _value) {
        this.urlData[i] = _value;
    }


    /**
     * Gets the automated value for this Ad.
     * 
     * @return automated   * Indicates if this ad was added by AdWords.
     */
    public java.lang.Boolean getAutomated() {
        return automated;
    }


    /**
     * Sets the automated value for this Ad.
     * 
     * @param automated   * Indicates if this ad was added by AdWords.
     */
    public void setAutomated(java.lang.Boolean automated) {
        this.automated = automated;
    }


    /**
     * Gets the type value for this Ad.
     * 
     * @return type   * Type of ad.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdType getType() {
        return type;
    }


    /**
     * Sets the type value for this Ad.
     * 
     * @param type   * Type of ad.
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.AdType type) {
        this.type = type;
    }


    /**
     * Gets the devicePreference value for this Ad.
     * 
     * @return devicePreference   * The device preference for the ad. You can only specify a preference
     * for
     *                 mobile devices (CriterionId 30001). If unspecified
     * (no device preference),
     *                 all devices are targeted.
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this Ad.
     * 
     * @param devicePreference   * The device preference for the ad. You can only specify a preference
     * for
     *                 mobile devices (CriterionId 30001). If unspecified
     * (no device preference),
     *                 all devices are targeted.
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the systemManagedEntitySource value for this Ad.
     * 
     * @return systemManagedEntitySource   * The source of this system-managed ad.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SystemManagedEntitySource getSystemManagedEntitySource() {
        return systemManagedEntitySource;
    }


    /**
     * Sets the systemManagedEntitySource value for this Ad.
     * 
     * @param systemManagedEntitySource   * The source of this system-managed ad.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSystemManagedEntitySource(com.google.api.ads.adwords.axis.v201802.cm.SystemManagedEntitySource systemManagedEntitySource) {
        this.systemManagedEntitySource = systemManagedEntitySource;
    }


    /**
     * Gets the adType value for this Ad.
     * 
     * @return adType   * Indicates that this instance is a subtype of Ad.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getAdType() {
        return adType;
    }


    /**
     * Sets the adType value for this Ad.
     * 
     * @param adType   * Indicates that this instance is a subtype of Ad.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setAdType(java.lang.String adType) {
        this.adType = adType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ad)) return false;
        Ad other = (Ad) obj;
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
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.displayUrl==null && other.getDisplayUrl()==null) || 
             (this.displayUrl!=null &&
              this.displayUrl.equals(other.getDisplayUrl()))) &&
            ((this.finalUrls==null && other.getFinalUrls()==null) || 
             (this.finalUrls!=null &&
              java.util.Arrays.equals(this.finalUrls, other.getFinalUrls()))) &&
            ((this.finalMobileUrls==null && other.getFinalMobileUrls()==null) || 
             (this.finalMobileUrls!=null &&
              java.util.Arrays.equals(this.finalMobileUrls, other.getFinalMobileUrls()))) &&
            ((this.finalAppUrls==null && other.getFinalAppUrls()==null) || 
             (this.finalAppUrls!=null &&
              java.util.Arrays.equals(this.finalAppUrls, other.getFinalAppUrls()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) || 
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.finalUrlSuffix==null && other.getFinalUrlSuffix()==null) || 
             (this.finalUrlSuffix!=null &&
              this.finalUrlSuffix.equals(other.getFinalUrlSuffix()))) &&
            ((this.urlCustomParameters==null && other.getUrlCustomParameters()==null) || 
             (this.urlCustomParameters!=null &&
              this.urlCustomParameters.equals(other.getUrlCustomParameters()))) &&
            ((this.urlData==null && other.getUrlData()==null) || 
             (this.urlData!=null &&
              java.util.Arrays.equals(this.urlData, other.getUrlData()))) &&
            ((this.automated==null && other.getAutomated()==null) || 
             (this.automated!=null &&
              this.automated.equals(other.getAutomated()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.systemManagedEntitySource==null && other.getSystemManagedEntitySource()==null) || 
             (this.systemManagedEntitySource!=null &&
              this.systemManagedEntitySource.equals(other.getSystemManagedEntitySource()))) &&
            ((this.adType==null && other.getAdType()==null) || 
             (this.adType!=null &&
              this.adType.equals(other.getAdType())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getDisplayUrl() != null) {
            _hashCode += getDisplayUrl().hashCode();
        }
        if (getFinalUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalMobileUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalMobileUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalMobileUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalAppUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalAppUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalAppUrls(), i);
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
        if (getUrlData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutomated() != null) {
            _hashCode += getAutomated().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getSystemManagedEntitySource() != null) {
            _hashCode += getSystemManagedEntitySource().hashCode();
        }
        if (getAdType() != null) {
            _hashCode += getAdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Ad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "displayUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "finalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "finalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalAppUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "finalAppUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppUrl"));
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
        elemField.setFieldName("urlData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "urlData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "automated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Ad.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "devicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemManagedEntitySource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "systemManagedEntitySource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SystemManagedEntitySource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Ad.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
