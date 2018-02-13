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
 * AdExchangeCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An Ad Exchange dynamic allocation creative.
 */
public class AdExchangeCreative  extends com.google.api.ads.dfp.axis.v201802.HasHtmlSnippetDynamicAllocationCreative  implements java.io.Serializable {
    /* Whether this creative is eligible for native ad-serving. This
     * value is
     *                     optional and defaults to {@code false}. */
    private java.lang.Boolean isNativeEligible;

    /* {@code true} if this creative is interstitial. An interstitial
     * creative will not consider an impression served until it is fully
     * rendered
     *                     in the browser. */
    private java.lang.Boolean isInterstitial;

    public AdExchangeCreative() {
    }

    public AdExchangeCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.String codeSnippet,
           java.lang.Boolean isNativeEligible,
           java.lang.Boolean isInterstitial) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            codeSnippet);
        this.isNativeEligible = isNativeEligible;
        this.isInterstitial = isInterstitial;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("codeSnippet", getCodeSnippet())
            .add("customFieldValues", getCustomFieldValues())
            .add("id", getId())
            .add("isInterstitial", getIsInterstitial())
            .add("isNativeEligible", getIsNativeEligible())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .toString();
    }

    /**
     * Gets the isNativeEligible value for this AdExchangeCreative.
     * 
     * @return isNativeEligible   * Whether this creative is eligible for native ad-serving. This
     * value is
     *                     optional and defaults to {@code false}.
     */
    public java.lang.Boolean getIsNativeEligible() {
        return isNativeEligible;
    }


    /**
     * Sets the isNativeEligible value for this AdExchangeCreative.
     * 
     * @param isNativeEligible   * Whether this creative is eligible for native ad-serving. This
     * value is
     *                     optional and defaults to {@code false}.
     */
    public void setIsNativeEligible(java.lang.Boolean isNativeEligible) {
        this.isNativeEligible = isNativeEligible;
    }


    /**
     * Gets the isInterstitial value for this AdExchangeCreative.
     * 
     * @return isInterstitial   * {@code true} if this creative is interstitial. An interstitial
     * creative will not consider an impression served until it is fully
     * rendered
     *                     in the browser.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this AdExchangeCreative.
     * 
     * @param isInterstitial   * {@code true} if this creative is interstitial. An interstitial
     * creative will not consider an impression served until it is fully
     * rendered
     *                     in the browser.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExchangeCreative)) return false;
        AdExchangeCreative other = (AdExchangeCreative) obj;
        if (obj == null) return false;
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
              this.isInterstitial.equals(other.getIsInterstitial())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExchangeCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdExchangeCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNativeEligible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isNativeEligible"));
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
