// Copyright 2024 Google LLC
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
 * ThirdPartyCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;


/**
 * A {@code Creative} that is served by a 3rd-party vendor.
 */
public class ThirdPartyCreative  extends com.google.api.ads.admanager.axis.v202411.Creative  implements java.io.Serializable {
    /* The HTML snippet that this creative delivers. This attribute
     * is required. */
    private java.lang.String snippet;

    /* The HTML snippet that this creative delivers with macros expanded.
     * This attribute is read-only
     *                     and is set by Google. */
    private java.lang.String expandedSnippet;

    /* The SSL compatibility scan result for this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google. */
    private com.google.api.ads.admanager.axis.v202411.SslScanResult sslScanResult;

    /* The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}. */
    private com.google.api.ads.admanager.axis.v202411.SslManualOverride sslManualOverride;

    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.admanager.axis.v202411.LockedOrientation lockedOrientation;

    /* Whether the {@link Creative} is compatible for SafeFrame rendering.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@code true}. */
    private java.lang.Boolean isSafeFrameCompatible;

    /* A list of impression tracking URLs to ping when this creative
     * is displayed. This field is
     *                     optional. */
    private java.lang.String[] thirdPartyImpressionTrackingUrls;

    /* The URL of the AMP creative. */
    private java.lang.String ampRedirectUrl;

    public ThirdPartyCreative() {
    }

    public ThirdPartyCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202411.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202411.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202411.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202411.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202411.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.Boolean adBadgingEnabled,
           java.lang.String snippet,
           java.lang.String expandedSnippet,
           com.google.api.ads.admanager.axis.v202411.SslScanResult sslScanResult,
           com.google.api.ads.admanager.axis.v202411.SslManualOverride sslManualOverride,
           com.google.api.ads.admanager.axis.v202411.LockedOrientation lockedOrientation,
           java.lang.Boolean isSafeFrameCompatible,
           java.lang.String[] thirdPartyImpressionTrackingUrls,
           java.lang.String ampRedirectUrl) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyLabels,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            thirdPartyDataDeclaration,
            adBadgingEnabled);
        this.snippet = snippet;
        this.expandedSnippet = expandedSnippet;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
        this.lockedOrientation = lockedOrientation;
        this.isSafeFrameCompatible = isSafeFrameCompatible;
        this.thirdPartyImpressionTrackingUrls = thirdPartyImpressionTrackingUrls;
        this.ampRedirectUrl = ampRedirectUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBadgingEnabled", getAdBadgingEnabled())
            .add("advertiserId", getAdvertiserId())
            .add("ampRedirectUrl", getAmpRedirectUrl())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("expandedSnippet", getExpandedSnippet())
            .add("id", getId())
            .add("isSafeFrameCompatible", getIsSafeFrameCompatible())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lockedOrientation", getLockedOrientation())
            .add("name", getName())
            .add("policyLabels", getPolicyLabels())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("snippet", getSnippet())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .add("thirdPartyImpressionTrackingUrls", getThirdPartyImpressionTrackingUrls())
            .toString();
    }

    /**
     * Gets the snippet value for this ThirdPartyCreative.
     * 
     * @return snippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this ThirdPartyCreative.
     * 
     * @param snippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the expandedSnippet value for this ThirdPartyCreative.
     * 
     * @return expandedSnippet   * The HTML snippet that this creative delivers with macros expanded.
     * This attribute is read-only
     *                     and is set by Google.
     */
    public java.lang.String getExpandedSnippet() {
        return expandedSnippet;
    }


    /**
     * Sets the expandedSnippet value for this ThirdPartyCreative.
     * 
     * @param expandedSnippet   * The HTML snippet that this creative delivers with macros expanded.
     * This attribute is read-only
     *                     and is set by Google.
     */
    public void setExpandedSnippet(java.lang.String expandedSnippet) {
        this.expandedSnippet = expandedSnippet;
    }


    /**
     * Gets the sslScanResult value for this ThirdPartyCreative.
     * 
     * @return sslScanResult   * The SSL compatibility scan result for this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public com.google.api.ads.admanager.axis.v202411.SslScanResult getSslScanResult() {
        return sslScanResult;
    }


    /**
     * Sets the sslScanResult value for this ThirdPartyCreative.
     * 
     * @param sslScanResult   * The SSL compatibility scan result for this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public void setSslScanResult(com.google.api.ads.admanager.axis.v202411.SslScanResult sslScanResult) {
        this.sslScanResult = sslScanResult;
    }


    /**
     * Gets the sslManualOverride value for this ThirdPartyCreative.
     * 
     * @return sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public com.google.api.ads.admanager.axis.v202411.SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }


    /**
     * Sets the sslManualOverride value for this ThirdPartyCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public void setSslManualOverride(com.google.api.ads.admanager.axis.v202411.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }


    /**
     * Gets the lockedOrientation value for this ThirdPartyCreative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.admanager.axis.v202411.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this ThirdPartyCreative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.admanager.axis.v202411.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }


    /**
     * Gets the isSafeFrameCompatible value for this ThirdPartyCreative.
     * 
     * @return isSafeFrameCompatible   * Whether the {@link Creative} is compatible for SafeFrame rendering.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@code true}.
     */
    public java.lang.Boolean getIsSafeFrameCompatible() {
        return isSafeFrameCompatible;
    }


    /**
     * Sets the isSafeFrameCompatible value for this ThirdPartyCreative.
     * 
     * @param isSafeFrameCompatible   * Whether the {@link Creative} is compatible for SafeFrame rendering.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@code true}.
     */
    public void setIsSafeFrameCompatible(java.lang.Boolean isSafeFrameCompatible) {
        this.isSafeFrameCompatible = isSafeFrameCompatible;
    }


    /**
     * Gets the thirdPartyImpressionTrackingUrls value for this ThirdPartyCreative.
     * 
     * @return thirdPartyImpressionTrackingUrls   * A list of impression tracking URLs to ping when this creative
     * is displayed. This field is
     *                     optional.
     */
    public java.lang.String[] getThirdPartyImpressionTrackingUrls() {
        return thirdPartyImpressionTrackingUrls;
    }


    /**
     * Sets the thirdPartyImpressionTrackingUrls value for this ThirdPartyCreative.
     * 
     * @param thirdPartyImpressionTrackingUrls   * A list of impression tracking URLs to ping when this creative
     * is displayed. This field is
     *                     optional.
     */
    public void setThirdPartyImpressionTrackingUrls(java.lang.String[] thirdPartyImpressionTrackingUrls) {
        this.thirdPartyImpressionTrackingUrls = thirdPartyImpressionTrackingUrls;
    }

    public java.lang.String getThirdPartyImpressionTrackingUrls(int i) {
        return this.thirdPartyImpressionTrackingUrls[i];
    }

    public void setThirdPartyImpressionTrackingUrls(int i, java.lang.String _value) {
        this.thirdPartyImpressionTrackingUrls[i] = _value;
    }


    /**
     * Gets the ampRedirectUrl value for this ThirdPartyCreative.
     * 
     * @return ampRedirectUrl   * The URL of the AMP creative.
     */
    public java.lang.String getAmpRedirectUrl() {
        return ampRedirectUrl;
    }


    /**
     * Sets the ampRedirectUrl value for this ThirdPartyCreative.
     * 
     * @param ampRedirectUrl   * The URL of the AMP creative.
     */
    public void setAmpRedirectUrl(java.lang.String ampRedirectUrl) {
        this.ampRedirectUrl = ampRedirectUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyCreative)) return false;
        ThirdPartyCreative other = (ThirdPartyCreative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.expandedSnippet==null && other.getExpandedSnippet()==null) || 
             (this.expandedSnippet!=null &&
              this.expandedSnippet.equals(other.getExpandedSnippet()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride()))) &&
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation()))) &&
            ((this.isSafeFrameCompatible==null && other.getIsSafeFrameCompatible()==null) || 
             (this.isSafeFrameCompatible!=null &&
              this.isSafeFrameCompatible.equals(other.getIsSafeFrameCompatible()))) &&
            ((this.thirdPartyImpressionTrackingUrls==null && other.getThirdPartyImpressionTrackingUrls()==null) || 
             (this.thirdPartyImpressionTrackingUrls!=null &&
              java.util.Arrays.equals(this.thirdPartyImpressionTrackingUrls, other.getThirdPartyImpressionTrackingUrls()))) &&
            ((this.ampRedirectUrl==null && other.getAmpRedirectUrl()==null) || 
             (this.ampRedirectUrl!=null &&
              this.ampRedirectUrl.equals(other.getAmpRedirectUrl())));
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
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getExpandedSnippet() != null) {
            _hashCode += getExpandedSnippet().hashCode();
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
        }
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        if (getIsSafeFrameCompatible() != null) {
            _hashCode += getIsSafeFrameCompatible().hashCode();
        }
        if (getThirdPartyImpressionTrackingUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThirdPartyImpressionTrackingUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThirdPartyImpressionTrackingUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmpRedirectUrl() != null) {
            _hashCode += getAmpRedirectUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "ThirdPartyCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "expandedSnippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslScanResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "sslScanResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "SslScanResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslManualOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "sslManualOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "SslManualOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "lockedOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "LockedOrientation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSafeFrameCompatible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "isSafeFrameCompatible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionTrackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "thirdPartyImpressionTrackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampRedirectUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "ampRedirectUrl"));
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
