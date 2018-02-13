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
 * InternalRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} hosted by DoubleClick for Advertisers (DFA).
 * 
 *             <p>Similar to third-party creatives, a DoubleClick tag
 * is used to retrieve a creative asset.
 *             However, DoubleClick tags are not sent to the user's browser.
 * Instead, they are processed
 *             internally within the DoubleClick system..
 */
public class InternalRedirectCreative  extends com.google.api.ads.dfp.axis.v201802.Creative  implements java.io.Serializable {
    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation;

    /* The asset size of an internal redirect creative.
     *                     Note that this may differ from {@code size} if
     * users set {@code overrideSize} to true.
     *                     This attribute is read-only and is populated 
     * by Google. */
    private com.google.api.ads.dfp.axis.v201802.Size assetSize;

    /* The internal redirect URL of the DFA or DART for Publishers
     * hosted creative.
     *                     This attribute is required and has a maximum length
     * of 1024 characters. */
    private java.lang.String internalRedirectUrl;

    /* Allows the creative size to differ from the actual size specified
     * in the
     *                     internal redirect's url. This attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* {@code true} if this internal redirect creative is interstitial. */
    private java.lang.Boolean isInterstitial;

    /* The SSL compatibility scan result for this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google. */
    private com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult;

    /* The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}. */
    private com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride;

    /* A list of impression tracking URLs to ping when this creative
     * is displayed. This field is
     *                     optional. */
    private java.lang.String[] thirdPartyImpressionTrackingUrls;

    public InternalRedirectCreative() {
    }

    public InternalRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation,
           com.google.api.ads.dfp.axis.v201802.Size assetSize,
           java.lang.String internalRedirectUrl,
           java.lang.Boolean overrideSize,
           java.lang.Boolean isInterstitial,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride,
           java.lang.String[] thirdPartyImpressionTrackingUrls) {
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
        this.lockedOrientation = lockedOrientation;
        this.assetSize = assetSize;
        this.internalRedirectUrl = internalRedirectUrl;
        this.overrideSize = overrideSize;
        this.isInterstitial = isInterstitial;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
        this.thirdPartyImpressionTrackingUrls = thirdPartyImpressionTrackingUrls;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("assetSize", getAssetSize())
            .add("customFieldValues", getCustomFieldValues())
            .add("id", getId())
            .add("internalRedirectUrl", getInternalRedirectUrl())
            .add("isInterstitial", getIsInterstitial())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lockedOrientation", getLockedOrientation())
            .add("name", getName())
            .add("overrideSize", getOverrideSize())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("thirdPartyImpressionTrackingUrls", getThirdPartyImpressionTrackingUrls())
            .toString();
    }

    /**
     * Gets the lockedOrientation value for this InternalRedirectCreative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.dfp.axis.v201802.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this InternalRedirectCreative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }


    /**
     * Gets the assetSize value for this InternalRedirectCreative.
     * 
     * @return assetSize   * The asset size of an internal redirect creative.
     *                     Note that this may differ from {@code size} if
     * users set {@code overrideSize} to true.
     *                     This attribute is read-only and is populated 
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.Size getAssetSize() {
        return assetSize;
    }


    /**
     * Sets the assetSize value for this InternalRedirectCreative.
     * 
     * @param assetSize   * The asset size of an internal redirect creative.
     *                     Note that this may differ from {@code size} if
     * users set {@code overrideSize} to true.
     *                     This attribute is read-only and is populated 
     * by Google.
     */
    public void setAssetSize(com.google.api.ads.dfp.axis.v201802.Size assetSize) {
        this.assetSize = assetSize;
    }


    /**
     * Gets the internalRedirectUrl value for this InternalRedirectCreative.
     * 
     * @return internalRedirectUrl   * The internal redirect URL of the DFA or DART for Publishers
     * hosted creative.
     *                     This attribute is required and has a maximum length
     * of 1024 characters.
     */
    public java.lang.String getInternalRedirectUrl() {
        return internalRedirectUrl;
    }


    /**
     * Sets the internalRedirectUrl value for this InternalRedirectCreative.
     * 
     * @param internalRedirectUrl   * The internal redirect URL of the DFA or DART for Publishers
     * hosted creative.
     *                     This attribute is required and has a maximum length
     * of 1024 characters.
     */
    public void setInternalRedirectUrl(java.lang.String internalRedirectUrl) {
        this.internalRedirectUrl = internalRedirectUrl;
    }


    /**
     * Gets the overrideSize value for this InternalRedirectCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual size specified
     * in the
     *                     internal redirect's url. This attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this InternalRedirectCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual size specified
     * in the
     *                     internal redirect's url. This attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the isInterstitial value for this InternalRedirectCreative.
     * 
     * @return isInterstitial   * {@code true} if this internal redirect creative is interstitial.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this InternalRedirectCreative.
     * 
     * @param isInterstitial   * {@code true} if this internal redirect creative is interstitial.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the sslScanResult value for this InternalRedirectCreative.
     * 
     * @return sslScanResult   * The SSL compatibility scan result for this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.SslScanResult getSslScanResult() {
        return sslScanResult;
    }


    /**
     * Sets the sslScanResult value for this InternalRedirectCreative.
     * 
     * @param sslScanResult   * The SSL compatibility scan result for this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public void setSslScanResult(com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult) {
        this.sslScanResult = sslScanResult;
    }


    /**
     * Gets the sslManualOverride value for this InternalRedirectCreative.
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
     * Sets the sslManualOverride value for this InternalRedirectCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public void setSslManualOverride(com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }


    /**
     * Gets the thirdPartyImpressionTrackingUrls value for this InternalRedirectCreative.
     * 
     * @return thirdPartyImpressionTrackingUrls   * A list of impression tracking URLs to ping when this creative
     * is displayed. This field is
     *                     optional.
     */
    public java.lang.String[] getThirdPartyImpressionTrackingUrls() {
        return thirdPartyImpressionTrackingUrls;
    }


    /**
     * Sets the thirdPartyImpressionTrackingUrls value for this InternalRedirectCreative.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternalRedirectCreative)) return false;
        InternalRedirectCreative other = (InternalRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation()))) &&
            ((this.assetSize==null && other.getAssetSize()==null) || 
             (this.assetSize!=null &&
              this.assetSize.equals(other.getAssetSize()))) &&
            ((this.internalRedirectUrl==null && other.getInternalRedirectUrl()==null) || 
             (this.internalRedirectUrl!=null &&
              this.internalRedirectUrl.equals(other.getInternalRedirectUrl()))) &&
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride()))) &&
            ((this.thirdPartyImpressionTrackingUrls==null && other.getThirdPartyImpressionTrackingUrls()==null) || 
             (this.thirdPartyImpressionTrackingUrls!=null &&
              java.util.Arrays.equals(this.thirdPartyImpressionTrackingUrls, other.getThirdPartyImpressionTrackingUrls())));
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
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        if (getAssetSize() != null) {
            _hashCode += getAssetSize().hashCode();
        }
        if (getInternalRedirectUrl() != null) {
            _hashCode += getInternalRedirectUrl().hashCode();
        }
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternalRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "InternalRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lockedOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LockedOrientation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "assetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalRedirectUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "internalRedirectUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInterstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isInterstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionTrackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "thirdPartyImpressionTrackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
