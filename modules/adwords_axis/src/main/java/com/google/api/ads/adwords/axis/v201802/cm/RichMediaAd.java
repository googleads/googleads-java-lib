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
 * RichMediaAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data associated with a rich media ad.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public abstract class RichMediaAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* Name of the rich media ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String name;

    /* Dimensions (height and width) of the ad.
     *                     
     *                     This field is optional for ThirdPartyRedirectAd.
     * Ad Exchange traditional
     *                     yield management creatives do not specify the
     * dimension on the
     *                     ThirdPartyRedirectAd; instead, the size is specified
     * in the publisher
     *                     front end when creating a mediation chain. */
    private com.google.api.ads.adwords.axis.v201802.cm.Dimensions dimensions;

    /* Snippet for this ad. Required for standard third-party ads.
     * <p>The length of the string should be between 1 and 3072, inclusive. */
    private java.lang.String snippet;

    /* Impression beacon URL for the ad. */
    private java.lang.String impressionBeaconUrl;

    /* Duration for the ad (in milliseconds). Default is 0.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private java.lang.Integer adDuration;

    /* <a href="/adwords/api/docs/appendix/richmediacodes">
     *                     Certified Vendor Format ID</a>.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Long certifiedVendorFormatId;

    /* SourceUrl pointing to the third party snippet.
     *                     For third party in-stream video ads, this stores
     * the VAST URL. For DFA ads,
     *                     it stores the InRed URL. */
    private java.lang.String sourceUrl;

    /* Type of this rich media ad, the default is Standard. */
    private com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdRichMediaAdType richMediaAdType;

    /* A list of attributes that describe the rich media ad capabilities. */
    private com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute[] adAttributes;

    public RichMediaAd() {
    }

    public RichMediaAd(
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
           java.lang.String adType,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.Dimensions dimensions,
           java.lang.String snippet,
           java.lang.String impressionBeaconUrl,
           java.lang.Integer adDuration,
           java.lang.Long certifiedVendorFormatId,
           java.lang.String sourceUrl,
           com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdRichMediaAdType richMediaAdType,
           com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute[] adAttributes) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            finalUrlSuffix,
            urlCustomParameters,
            urlData,
            automated,
            type,
            devicePreference,
            systemManagedEntitySource,
            adType);
        this.name = name;
        this.dimensions = dimensions;
        this.snippet = snippet;
        this.impressionBeaconUrl = impressionBeaconUrl;
        this.adDuration = adDuration;
        this.certifiedVendorFormatId = certifiedVendorFormatId;
        this.sourceUrl = sourceUrl;
        this.richMediaAdType = richMediaAdType;
        this.adAttributes = adAttributes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adAttributes", getAdAttributes())
            .add("adDuration", getAdDuration())
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("certifiedVendorFormatId", getCertifiedVendorFormatId())
            .add("devicePreference", getDevicePreference())
            .add("dimensions", getDimensions())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("id", getId())
            .add("impressionBeaconUrl", getImpressionBeaconUrl())
            .add("name", getName())
            .add("richMediaAdType", getRichMediaAdType())
            .add("snippet", getSnippet())
            .add("sourceUrl", getSourceUrl())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the name value for this RichMediaAd.
     * 
     * @return name   * Name of the rich media ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RichMediaAd.
     * 
     * @param name   * Name of the rich media ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dimensions value for this RichMediaAd.
     * 
     * @return dimensions   * Dimensions (height and width) of the ad.
     *                     
     *                     This field is optional for ThirdPartyRedirectAd.
     * Ad Exchange traditional
     *                     yield management creatives do not specify the
     * dimension on the
     *                     ThirdPartyRedirectAd; instead, the size is specified
     * in the publisher
     *                     front end when creating a mediation chain.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Dimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this RichMediaAd.
     * 
     * @param dimensions   * Dimensions (height and width) of the ad.
     *                     
     *                     This field is optional for ThirdPartyRedirectAd.
     * Ad Exchange traditional
     *                     yield management creatives do not specify the
     * dimension on the
     *                     ThirdPartyRedirectAd; instead, the size is specified
     * in the publisher
     *                     front end when creating a mediation chain.
     */
    public void setDimensions(com.google.api.ads.adwords.axis.v201802.cm.Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the snippet value for this RichMediaAd.
     * 
     * @return snippet   * Snippet for this ad. Required for standard third-party ads.
     * <p>The length of the string should be between 1 and 3072, inclusive.
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this RichMediaAd.
     * 
     * @param snippet   * Snippet for this ad. Required for standard third-party ads.
     * <p>The length of the string should be between 1 and 3072, inclusive.
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the impressionBeaconUrl value for this RichMediaAd.
     * 
     * @return impressionBeaconUrl   * Impression beacon URL for the ad.
     */
    public java.lang.String getImpressionBeaconUrl() {
        return impressionBeaconUrl;
    }


    /**
     * Sets the impressionBeaconUrl value for this RichMediaAd.
     * 
     * @param impressionBeaconUrl   * Impression beacon URL for the ad.
     */
    public void setImpressionBeaconUrl(java.lang.String impressionBeaconUrl) {
        this.impressionBeaconUrl = impressionBeaconUrl;
    }


    /**
     * Gets the adDuration value for this RichMediaAd.
     * 
     * @return adDuration   * Duration for the ad (in milliseconds). Default is 0.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public java.lang.Integer getAdDuration() {
        return adDuration;
    }


    /**
     * Sets the adDuration value for this RichMediaAd.
     * 
     * @param adDuration   * Duration for the ad (in milliseconds). Default is 0.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setAdDuration(java.lang.Integer adDuration) {
        this.adDuration = adDuration;
    }


    /**
     * Gets the certifiedVendorFormatId value for this RichMediaAd.
     * 
     * @return certifiedVendorFormatId   * <a href="/adwords/api/docs/appendix/richmediacodes">
     *                     Certified Vendor Format ID</a>.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Long getCertifiedVendorFormatId() {
        return certifiedVendorFormatId;
    }


    /**
     * Sets the certifiedVendorFormatId value for this RichMediaAd.
     * 
     * @param certifiedVendorFormatId   * <a href="/adwords/api/docs/appendix/richmediacodes">
     *                     Certified Vendor Format ID</a>.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setCertifiedVendorFormatId(java.lang.Long certifiedVendorFormatId) {
        this.certifiedVendorFormatId = certifiedVendorFormatId;
    }


    /**
     * Gets the sourceUrl value for this RichMediaAd.
     * 
     * @return sourceUrl   * SourceUrl pointing to the third party snippet.
     *                     For third party in-stream video ads, this stores
     * the VAST URL. For DFA ads,
     *                     it stores the InRed URL.
     */
    public java.lang.String getSourceUrl() {
        return sourceUrl;
    }


    /**
     * Sets the sourceUrl value for this RichMediaAd.
     * 
     * @param sourceUrl   * SourceUrl pointing to the third party snippet.
     *                     For third party in-stream video ads, this stores
     * the VAST URL. For DFA ads,
     *                     it stores the InRed URL.
     */
    public void setSourceUrl(java.lang.String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }


    /**
     * Gets the richMediaAdType value for this RichMediaAd.
     * 
     * @return richMediaAdType   * Type of this rich media ad, the default is Standard.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdRichMediaAdType getRichMediaAdType() {
        return richMediaAdType;
    }


    /**
     * Sets the richMediaAdType value for this RichMediaAd.
     * 
     * @param richMediaAdType   * Type of this rich media ad, the default is Standard.
     */
    public void setRichMediaAdType(com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdRichMediaAdType richMediaAdType) {
        this.richMediaAdType = richMediaAdType;
    }


    /**
     * Gets the adAttributes value for this RichMediaAd.
     * 
     * @return adAttributes   * A list of attributes that describe the rich media ad capabilities.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute[] getAdAttributes() {
        return adAttributes;
    }


    /**
     * Sets the adAttributes value for this RichMediaAd.
     * 
     * @param adAttributes   * A list of attributes that describe the rich media ad capabilities.
     */
    public void setAdAttributes(com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute[] adAttributes) {
        this.adAttributes = adAttributes;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute getAdAttributes(int i) {
        return this.adAttributes[i];
    }

    public void setAdAttributes(int i, com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute _value) {
        this.adAttributes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaAd)) return false;
        RichMediaAd other = (RichMediaAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.impressionBeaconUrl==null && other.getImpressionBeaconUrl()==null) || 
             (this.impressionBeaconUrl!=null &&
              this.impressionBeaconUrl.equals(other.getImpressionBeaconUrl()))) &&
            ((this.adDuration==null && other.getAdDuration()==null) || 
             (this.adDuration!=null &&
              this.adDuration.equals(other.getAdDuration()))) &&
            ((this.certifiedVendorFormatId==null && other.getCertifiedVendorFormatId()==null) || 
             (this.certifiedVendorFormatId!=null &&
              this.certifiedVendorFormatId.equals(other.getCertifiedVendorFormatId()))) &&
            ((this.sourceUrl==null && other.getSourceUrl()==null) || 
             (this.sourceUrl!=null &&
              this.sourceUrl.equals(other.getSourceUrl()))) &&
            ((this.richMediaAdType==null && other.getRichMediaAdType()==null) || 
             (this.richMediaAdType!=null &&
              this.richMediaAdType.equals(other.getRichMediaAdType()))) &&
            ((this.adAttributes==null && other.getAdAttributes()==null) || 
             (this.adAttributes!=null &&
              java.util.Arrays.equals(this.adAttributes, other.getAdAttributes())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getImpressionBeaconUrl() != null) {
            _hashCode += getImpressionBeaconUrl().hashCode();
        }
        if (getAdDuration() != null) {
            _hashCode += getAdDuration().hashCode();
        }
        if (getCertifiedVendorFormatId() != null) {
            _hashCode += getCertifiedVendorFormatId().hashCode();
        }
        if (getSourceUrl() != null) {
            _hashCode += getSourceUrl().hashCode();
        }
        if (getRichMediaAdType() != null) {
            _hashCode += getRichMediaAdType().hashCode();
        }
        if (getAdAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(RichMediaAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RichMediaAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionBeaconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "impressionBeaconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certifiedVendorFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "certifiedVendorFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "sourceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richMediaAdType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "richMediaAdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RichMediaAd.RichMediaAdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RichMediaAd.AdAttribute"));
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
