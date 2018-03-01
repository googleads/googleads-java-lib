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
 * AppFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an App extension.
 */
public class AppFeedItem  extends com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* The application store that the target application belongs to. */
    private com.google.api.ads.adwords.axis.v201802.cm.AppFeedItemAppStore appStore;

    /* The store-specific ID for the target application.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String appId;

    /* The visible text displayed when the link is rendered in an
     * ad.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String appLinkText;

    /* The destination URL of the in-app link.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 2076, inclusive, (trimmed).</span> */
    private java.lang.String appUrl;

    /* A list of possible final URLs after all cross domain redirects. */
    private com.google.api.ads.adwords.axis.v201802.cm.UrlList appFinalUrls;

    /* A list of possible final mobile URLs after all cross domain
     * redirects. */
    private com.google.api.ads.adwords.axis.v201802.cm.UrlList appFinalMobileUrls;

    /* URL template for constructing a tracking URL. To clear this
     * field, set its value to the empty
     *                     string. */
    private java.lang.String appTrackingUrlTemplate;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls. */
    private com.google.api.ads.adwords.axis.v201802.cm.CustomParameters appUrlCustomParameters;

    public AppFeedItem() {
    }

    public AppFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting campaignTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting adGroupTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Keyword keywordTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Location geoTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction geoTargetingRestriction,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           com.google.api.ads.adwords.axis.v201802.cm.AppFeedItemAppStore appStore,
           java.lang.String appId,
           java.lang.String appLinkText,
           java.lang.String appUrl,
           com.google.api.ads.adwords.axis.v201802.cm.UrlList appFinalUrls,
           com.google.api.ads.adwords.axis.v201802.cm.UrlList appFinalMobileUrls,
           java.lang.String appTrackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201802.cm.CustomParameters appUrlCustomParameters) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            campaignTargeting,
            adGroupTargeting,
            keywordTargeting,
            geoTargeting,
            geoTargetingRestriction,
            policyData,
            extensionFeedItemType);
        this.appStore = appStore;
        this.appId = appId;
        this.appLinkText = appLinkText;
        this.appUrl = appUrl;
        this.appFinalUrls = appFinalUrls;
        this.appFinalMobileUrls = appFinalMobileUrls;
        this.appTrackingUrlTemplate = appTrackingUrlTemplate;
        this.appUrlCustomParameters = appUrlCustomParameters;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupTargeting", getAdGroupTargeting())
            .add("appFinalMobileUrls", getAppFinalMobileUrls())
            .add("appFinalUrls", getAppFinalUrls())
            .add("appId", getAppId())
            .add("appLinkText", getAppLinkText())
            .add("appStore", getAppStore())
            .add("appTrackingUrlTemplate", getAppTrackingUrlTemplate())
            .add("appUrl", getAppUrl())
            .add("appUrlCustomParameters", getAppUrlCustomParameters())
            .add("campaignTargeting", getCampaignTargeting())
            .add("devicePreference", getDevicePreference())
            .add("endTime", getEndTime())
            .add("extensionFeedItemType", getExtensionFeedItemType())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedType", getFeedType())
            .add("geoTargeting", getGeoTargeting())
            .add("geoTargetingRestriction", getGeoTargetingRestriction())
            .add("keywordTargeting", getKeywordTargeting())
            .add("policyData", getPolicyData())
            .add("scheduling", getScheduling())
            .add("startTime", getStartTime())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the appStore value for this AppFeedItem.
     * 
     * @return appStore   * The application store that the target application belongs to.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AppFeedItemAppStore getAppStore() {
        return appStore;
    }


    /**
     * Sets the appStore value for this AppFeedItem.
     * 
     * @param appStore   * The application store that the target application belongs to.
     */
    public void setAppStore(com.google.api.ads.adwords.axis.v201802.cm.AppFeedItemAppStore appStore) {
        this.appStore = appStore;
    }


    /**
     * Gets the appId value for this AppFeedItem.
     * 
     * @return appId   * The store-specific ID for the target application.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this AppFeedItem.
     * 
     * @param appId   * The store-specific ID for the target application.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the appLinkText value for this AppFeedItem.
     * 
     * @return appLinkText   * The visible text displayed when the link is rendered in an
     * ad.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getAppLinkText() {
        return appLinkText;
    }


    /**
     * Sets the appLinkText value for this AppFeedItem.
     * 
     * @param appLinkText   * The visible text displayed when the link is rendered in an
     * ad.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setAppLinkText(java.lang.String appLinkText) {
        this.appLinkText = appLinkText;
    }


    /**
     * Gets the appUrl value for this AppFeedItem.
     * 
     * @return appUrl   * The destination URL of the in-app link.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 2076, inclusive, (trimmed).</span>
     */
    public java.lang.String getAppUrl() {
        return appUrl;
    }


    /**
     * Sets the appUrl value for this AppFeedItem.
     * 
     * @param appUrl   * The destination URL of the in-app link.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 2076, inclusive, (trimmed).</span>
     */
    public void setAppUrl(java.lang.String appUrl) {
        this.appUrl = appUrl;
    }


    /**
     * Gets the appFinalUrls value for this AppFeedItem.
     * 
     * @return appFinalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UrlList getAppFinalUrls() {
        return appFinalUrls;
    }


    /**
     * Sets the appFinalUrls value for this AppFeedItem.
     * 
     * @param appFinalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public void setAppFinalUrls(com.google.api.ads.adwords.axis.v201802.cm.UrlList appFinalUrls) {
        this.appFinalUrls = appFinalUrls;
    }


    /**
     * Gets the appFinalMobileUrls value for this AppFeedItem.
     * 
     * @return appFinalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UrlList getAppFinalMobileUrls() {
        return appFinalMobileUrls;
    }


    /**
     * Sets the appFinalMobileUrls value for this AppFeedItem.
     * 
     * @param appFinalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public void setAppFinalMobileUrls(com.google.api.ads.adwords.axis.v201802.cm.UrlList appFinalMobileUrls) {
        this.appFinalMobileUrls = appFinalMobileUrls;
    }


    /**
     * Gets the appTrackingUrlTemplate value for this AppFeedItem.
     * 
     * @return appTrackingUrlTemplate   * URL template for constructing a tracking URL. To clear this
     * field, set its value to the empty
     *                     string.
     */
    public java.lang.String getAppTrackingUrlTemplate() {
        return appTrackingUrlTemplate;
    }


    /**
     * Sets the appTrackingUrlTemplate value for this AppFeedItem.
     * 
     * @param appTrackingUrlTemplate   * URL template for constructing a tracking URL. To clear this
     * field, set its value to the empty
     *                     string.
     */
    public void setAppTrackingUrlTemplate(java.lang.String appTrackingUrlTemplate) {
        this.appTrackingUrlTemplate = appTrackingUrlTemplate;
    }


    /**
     * Gets the appUrlCustomParameters value for this AppFeedItem.
     * 
     * @return appUrlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomParameters getAppUrlCustomParameters() {
        return appUrlCustomParameters;
    }


    /**
     * Sets the appUrlCustomParameters value for this AppFeedItem.
     * 
     * @param appUrlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public void setAppUrlCustomParameters(com.google.api.ads.adwords.axis.v201802.cm.CustomParameters appUrlCustomParameters) {
        this.appUrlCustomParameters = appUrlCustomParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppFeedItem)) return false;
        AppFeedItem other = (AppFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appStore==null && other.getAppStore()==null) || 
             (this.appStore!=null &&
              this.appStore.equals(other.getAppStore()))) &&
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.appLinkText==null && other.getAppLinkText()==null) || 
             (this.appLinkText!=null &&
              this.appLinkText.equals(other.getAppLinkText()))) &&
            ((this.appUrl==null && other.getAppUrl()==null) || 
             (this.appUrl!=null &&
              this.appUrl.equals(other.getAppUrl()))) &&
            ((this.appFinalUrls==null && other.getAppFinalUrls()==null) || 
             (this.appFinalUrls!=null &&
              this.appFinalUrls.equals(other.getAppFinalUrls()))) &&
            ((this.appFinalMobileUrls==null && other.getAppFinalMobileUrls()==null) || 
             (this.appFinalMobileUrls!=null &&
              this.appFinalMobileUrls.equals(other.getAppFinalMobileUrls()))) &&
            ((this.appTrackingUrlTemplate==null && other.getAppTrackingUrlTemplate()==null) || 
             (this.appTrackingUrlTemplate!=null &&
              this.appTrackingUrlTemplate.equals(other.getAppTrackingUrlTemplate()))) &&
            ((this.appUrlCustomParameters==null && other.getAppUrlCustomParameters()==null) || 
             (this.appUrlCustomParameters!=null &&
              this.appUrlCustomParameters.equals(other.getAppUrlCustomParameters())));
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
        if (getAppStore() != null) {
            _hashCode += getAppStore().hashCode();
        }
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getAppLinkText() != null) {
            _hashCode += getAppLinkText().hashCode();
        }
        if (getAppUrl() != null) {
            _hashCode += getAppUrl().hashCode();
        }
        if (getAppFinalUrls() != null) {
            _hashCode += getAppFinalUrls().hashCode();
        }
        if (getAppFinalMobileUrls() != null) {
            _hashCode += getAppFinalMobileUrls().hashCode();
        }
        if (getAppTrackingUrlTemplate() != null) {
            _hashCode += getAppTrackingUrlTemplate().hashCode();
        }
        if (getAppUrlCustomParameters() != null) {
            _hashCode += getAppUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppFeedItem.AppStore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appLinkText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appLinkText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appFinalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appFinalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appFinalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appFinalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appTrackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appTrackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appUrlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appUrlCustomParameters"));
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
