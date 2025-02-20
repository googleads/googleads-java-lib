// Copyright 2025 Google LLC
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
 * AdExchangeCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;


/**
 * An Ad Exchange dynamic allocation creative.
 */
public class AdExchangeCreative  extends com.google.api.ads.admanager.axis.v202502.HasHtmlSnippetDynamicAllocationCreative  implements java.io.Serializable {
    /* Whether this creative is eligible for native ad-serving. This
     * value is optional and defaults to
     *                     {@code false}. */
    private java.lang.Boolean isNativeEligible;

    /* {@code true} if this creative is interstitial. An interstitial
     * creative will not consider an
     *                     impression served until it is fully rendered in
     * the browser. */
    private java.lang.Boolean isInterstitial;

    /* {@code true} if this creative is eligible for all requested
     * sizes. */
    private java.lang.Boolean isAllowsAllRequestedSizes;

    public AdExchangeCreative() {
    }

    public AdExchangeCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202502.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202502.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.Boolean adBadgingEnabled,
           java.lang.String codeSnippet,
           java.lang.Boolean isNativeEligible,
           java.lang.Boolean isInterstitial,
           java.lang.Boolean isAllowsAllRequestedSizes) {
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
            adBadgingEnabled,
            codeSnippet);
        this.isNativeEligible = isNativeEligible;
        this.isInterstitial = isInterstitial;
        this.isAllowsAllRequestedSizes = isAllowsAllRequestedSizes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBadgingEnabled", getAdBadgingEnabled())
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("codeSnippet", getCodeSnippet())
            .add("customFieldValues", getCustomFieldValues())
            .add("id", getId())
            .add("isAllowsAllRequestedSizes", getIsAllowsAllRequestedSizes())
            .add("isInterstitial", getIsInterstitial())
            .add("isNativeEligible", getIsNativeEligible())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyLabels", getPolicyLabels())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .toString();
    }

    /**
     * Gets the isNativeEligible value for this AdExchangeCreative.
     * 
     * @return isNativeEligible   * Whether this creative is eligible for native ad-serving. This
     * value is optional and defaults to
     *                     {@code false}.
     */
    public java.lang.Boolean getIsNativeEligible() {
        return isNativeEligible;
    }


    /**
     * Sets the isNativeEligible value for this AdExchangeCreative.
     * 
     * @param isNativeEligible   * Whether this creative is eligible for native ad-serving. This
     * value is optional and defaults to
     *                     {@code false}.
     */
    public void setIsNativeEligible(java.lang.Boolean isNativeEligible) {
        this.isNativeEligible = isNativeEligible;
    }


    /**
     * Gets the isInterstitial value for this AdExchangeCreative.
     * 
     * @return isInterstitial   * {@code true} if this creative is interstitial. An interstitial
     * creative will not consider an
     *                     impression served until it is fully rendered in
     * the browser.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this AdExchangeCreative.
     * 
     * @param isInterstitial   * {@code true} if this creative is interstitial. An interstitial
     * creative will not consider an
     *                     impression served until it is fully rendered in
     * the browser.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the isAllowsAllRequestedSizes value for this AdExchangeCreative.
     * 
     * @return isAllowsAllRequestedSizes   * {@code true} if this creative is eligible for all requested
     * sizes.
     */
    public java.lang.Boolean getIsAllowsAllRequestedSizes() {
        return isAllowsAllRequestedSizes;
    }


    /**
     * Sets the isAllowsAllRequestedSizes value for this AdExchangeCreative.
     * 
     * @param isAllowsAllRequestedSizes   * {@code true} if this creative is eligible for all requested
     * sizes.
     */
    public void setIsAllowsAllRequestedSizes(java.lang.Boolean isAllowsAllRequestedSizes) {
        this.isAllowsAllRequestedSizes = isAllowsAllRequestedSizes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExchangeCreative)) return false;
        AdExchangeCreative other = (AdExchangeCreative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isNativeEligible==null && other.getIsNativeEligible()==null) || 
             (this.isNativeEligible!=null &&
              this.isNativeEligible.equals(other.getIsNativeEligible()))) &&
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial()))) &&
            ((this.isAllowsAllRequestedSizes==null && other.getIsAllowsAllRequestedSizes()==null) || 
             (this.isAllowsAllRequestedSizes!=null &&
              this.isAllowsAllRequestedSizes.equals(other.getIsAllowsAllRequestedSizes())));
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
        if (getIsNativeEligible() != null) {
            _hashCode += getIsNativeEligible().hashCode();
        }
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        if (getIsAllowsAllRequestedSizes() != null) {
            _hashCode += getIsAllowsAllRequestedSizes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExchangeCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "AdExchangeCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNativeEligible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "isNativeEligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInterstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "isInterstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllowsAllRequestedSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "isAllowsAllRequestedSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
