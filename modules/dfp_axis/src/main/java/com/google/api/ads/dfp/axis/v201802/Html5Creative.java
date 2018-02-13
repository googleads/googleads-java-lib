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
 * Html5Creative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} that contains a zipped HTML5 bundle asset, a
 * list of third party impression
 *             trackers, and a third party click tracker.
 */
public class Html5Creative  extends com.google.api.ads.dfp.axis.v201802.Creative  implements java.io.Serializable {
    /* Allows the creative size to differ from the actual HTML5 asset
     * size. This
     *                     attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* Impression tracking URLs to ping when this creative is displayed.
     * This field is optional. */
    private java.lang.String[] thirdPartyImpressionTrackingUrls;

    /* A click tracking URL to ping when this creative is clicked.
     * This field is optional. */
    private java.lang.String thirdPartyClickTrackingUrl;

    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation;

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

    /* Whether the {@link Creative} is compatible for SafeFrame rendering.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@code true}. */
    private java.lang.Boolean isSafeFrameCompatible;

    /* The HTML5 asset. To preview the HTML5 asset, use the {@link
     * CreativeAsset#assetUrl}.
     *                     In this field, the {@link CreativeAsset#assetByteArray}
     * must be a zip bundle and the
     *                     {@link CreativeAsset#fileName} must have a zip
     * extension. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.CreativeAsset html5Asset;

    public Html5Creative() {
    }

    public Html5Creative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.Boolean overrideSize,
           java.lang.String[] thirdPartyImpressionTrackingUrls,
           java.lang.String thirdPartyClickTrackingUrl,
           com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride,
           java.lang.Boolean isSafeFrameCompatible,
           com.google.api.ads.dfp.axis.v201802.CreativeAsset html5Asset) {
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
        this.overrideSize = overrideSize;
        this.thirdPartyImpressionTrackingUrls = thirdPartyImpressionTrackingUrls;
        this.thirdPartyClickTrackingUrl = thirdPartyClickTrackingUrl;
        this.lockedOrientation = lockedOrientation;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
        this.isSafeFrameCompatible = isSafeFrameCompatible;
        this.html5Asset = html5Asset;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("html5Asset", getHtml5Asset())
            .add("id", getId())
            .add("isSafeFrameCompatible", getIsSafeFrameCompatible())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lockedOrientation", getLockedOrientation())
            .add("name", getName())
            .add("overrideSize", getOverrideSize())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("thirdPartyClickTrackingUrl", getThirdPartyClickTrackingUrl())
            .add("thirdPartyImpressionTrackingUrls", getThirdPartyImpressionTrackingUrls())
            .toString();
    }

    /**
     * Gets the overrideSize value for this Html5Creative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual HTML5 asset
     * size. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this Html5Creative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual HTML5 asset
     * size. This
     *                     attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the thirdPartyImpressionTrackingUrls value for this Html5Creative.
     * 
     * @return thirdPartyImpressionTrackingUrls   * Impression tracking URLs to ping when this creative is displayed.
     * This field is optional.
     */
    public java.lang.String[] getThirdPartyImpressionTrackingUrls() {
        return thirdPartyImpressionTrackingUrls;
    }


    /**
     * Sets the thirdPartyImpressionTrackingUrls value for this Html5Creative.
     * 
     * @param thirdPartyImpressionTrackingUrls   * Impression tracking URLs to ping when this creative is displayed.
     * This field is optional.
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
     * Gets the thirdPartyClickTrackingUrl value for this Html5Creative.
     * 
     * @return thirdPartyClickTrackingUrl   * A click tracking URL to ping when this creative is clicked.
     * This field is optional.
     */
    public java.lang.String getThirdPartyClickTrackingUrl() {
        return thirdPartyClickTrackingUrl;
    }


    /**
     * Sets the thirdPartyClickTrackingUrl value for this Html5Creative.
     * 
     * @param thirdPartyClickTrackingUrl   * A click tracking URL to ping when this creative is clicked.
     * This field is optional.
     */
    public void setThirdPartyClickTrackingUrl(java.lang.String thirdPartyClickTrackingUrl) {
        this.thirdPartyClickTrackingUrl = thirdPartyClickTrackingUrl;
    }


    /**
     * Gets the lockedOrientation value for this Html5Creative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.dfp.axis.v201802.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this Html5Creative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }


    /**
     * Gets the sslScanResult value for this Html5Creative.
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
     * Sets the sslScanResult value for this Html5Creative.
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
     * Gets the sslManualOverride value for this Html5Creative.
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
     * Sets the sslManualOverride value for this Html5Creative.
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
     * Gets the isSafeFrameCompatible value for this Html5Creative.
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
     * Sets the isSafeFrameCompatible value for this Html5Creative.
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
     * Gets the html5Asset value for this Html5Creative.
     * 
     * @return html5Asset   * The HTML5 asset. To preview the HTML5 asset, use the {@link
     * CreativeAsset#assetUrl}.
     *                     In this field, the {@link CreativeAsset#assetByteArray}
     * must be a zip bundle and the
     *                     {@link CreativeAsset#fileName} must have a zip
     * extension. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeAsset getHtml5Asset() {
        return html5Asset;
    }


    /**
     * Sets the html5Asset value for this Html5Creative.
     * 
     * @param html5Asset   * The HTML5 asset. To preview the HTML5 asset, use the {@link
     * CreativeAsset#assetUrl}.
     *                     In this field, the {@link CreativeAsset#assetByteArray}
     * must be a zip bundle and the
     *                     {@link CreativeAsset#fileName} must have a zip
     * extension. This attribute is required.
     */
    public void setHtml5Asset(com.google.api.ads.dfp.axis.v201802.CreativeAsset html5Asset) {
        this.html5Asset = html5Asset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Html5Creative)) return false;
        Html5Creative other = (Html5Creative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.thirdPartyImpressionTrackingUrls==null && other.getThirdPartyImpressionTrackingUrls()==null) || 
             (this.thirdPartyImpressionTrackingUrls!=null &&
              java.util.Arrays.equals(this.thirdPartyImpressionTrackingUrls, other.getThirdPartyImpressionTrackingUrls()))) &&
            ((this.thirdPartyClickTrackingUrl==null && other.getThirdPartyClickTrackingUrl()==null) || 
             (this.thirdPartyClickTrackingUrl!=null &&
              this.thirdPartyClickTrackingUrl.equals(other.getThirdPartyClickTrackingUrl()))) &&
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride()))) &&
            ((this.isSafeFrameCompatible==null && other.getIsSafeFrameCompatible()==null) || 
             (this.isSafeFrameCompatible!=null &&
              this.isSafeFrameCompatible.equals(other.getIsSafeFrameCompatible()))) &&
            ((this.html5Asset==null && other.getHtml5Asset()==null) || 
             (this.html5Asset!=null &&
              this.html5Asset.equals(other.getHtml5Asset())));
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
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
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
        if (getThirdPartyClickTrackingUrl() != null) {
            _hashCode += getThirdPartyClickTrackingUrl().hashCode();
        }
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
        }
        if (getIsSafeFrameCompatible() != null) {
            _hashCode += getIsSafeFrameCompatible().hashCode();
        }
        if (getHtml5Asset() != null) {
            _hashCode += getHtml5Asset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Html5Creative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Html5Creative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyClickTrackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "thirdPartyClickTrackingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lockedOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LockedOrientation"));
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
        elemField.setFieldName("isSafeFrameCompatible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isSafeFrameCompatible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("html5Asset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "html5Asset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeAsset"));
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
