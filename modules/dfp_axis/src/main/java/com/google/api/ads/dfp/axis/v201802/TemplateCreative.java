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
 * TemplateCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} that is created by the specified creative template.
 */
public class TemplateCreative  extends com.google.api.ads.dfp.axis.v201802.Creative  implements java.io.Serializable {
    /* Creative template ID that this creative is created from. */
    private java.lang.Long creativeTemplateId;

    /* {@code true} if this template instantiated creative is interstitial.
     * This attribute is read-only and is assigned by Google based on
     *                     the creative template. */
    private java.lang.Boolean isInterstitial;

    /* {@code true} if this template instantiated creative is eligible
     * for native
     *                     adserving. This attribute is read-only and is
     * assigned by Google based on
     *                     the creative template. */
    private java.lang.Boolean isNativeEligible;

    /* Whether the {@link Creative} is compatible for SafeFrame rendering.
     * 
     *                     <p>This attribute is read-only and is assigned
     * by Google based on the {@link CreativeTemplate}. */
    private java.lang.Boolean isSafeFrameCompatible;

    /* The URL the user is directed to if they click on the creative.
     * This
     *                     attribute is only required if the template snippet
     * contains the {@code %u}
     *                     or {@code %%DEST_URL%%} macro. It has a maximum
     * length of 1024 characters. */
    private java.lang.String destinationUrl;

    /* Stores values of {@link CreativeTemplateVariable} in the {@link
     * CreativeTemplate}. */
    private com.google.api.ads.dfp.axis.v201802.BaseCreativeTemplateVariableValue[] creativeTemplateVariableValues;

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

    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation;

    public TemplateCreative() {
    }

    public TemplateCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.Long creativeTemplateId,
           java.lang.Boolean isInterstitial,
           java.lang.Boolean isNativeEligible,
           java.lang.Boolean isSafeFrameCompatible,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201802.BaseCreativeTemplateVariableValue[] creativeTemplateVariableValues,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride,
           com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation) {
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
        this.creativeTemplateId = creativeTemplateId;
        this.isInterstitial = isInterstitial;
        this.isNativeEligible = isNativeEligible;
        this.isSafeFrameCompatible = isSafeFrameCompatible;
        this.destinationUrl = destinationUrl;
        this.creativeTemplateVariableValues = creativeTemplateVariableValues;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
        this.lockedOrientation = lockedOrientation;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("creativeTemplateId", getCreativeTemplateId())
            .add("creativeTemplateVariableValues", getCreativeTemplateVariableValues())
            .add("customFieldValues", getCustomFieldValues())
            .add("destinationUrl", getDestinationUrl())
            .add("id", getId())
            .add("isInterstitial", getIsInterstitial())
            .add("isNativeEligible", getIsNativeEligible())
            .add("isSafeFrameCompatible", getIsSafeFrameCompatible())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lockedOrientation", getLockedOrientation())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .toString();
    }

    /**
     * Gets the creativeTemplateId value for this TemplateCreative.
     * 
     * @return creativeTemplateId   * Creative template ID that this creative is created from.
     */
    public java.lang.Long getCreativeTemplateId() {
        return creativeTemplateId;
    }


    /**
     * Sets the creativeTemplateId value for this TemplateCreative.
     * 
     * @param creativeTemplateId   * Creative template ID that this creative is created from.
     */
    public void setCreativeTemplateId(java.lang.Long creativeTemplateId) {
        this.creativeTemplateId = creativeTemplateId;
    }


    /**
     * Gets the isInterstitial value for this TemplateCreative.
     * 
     * @return isInterstitial   * {@code true} if this template instantiated creative is interstitial.
     * This attribute is read-only and is assigned by Google based on
     *                     the creative template.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this TemplateCreative.
     * 
     * @param isInterstitial   * {@code true} if this template instantiated creative is interstitial.
     * This attribute is read-only and is assigned by Google based on
     *                     the creative template.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the isNativeEligible value for this TemplateCreative.
     * 
     * @return isNativeEligible   * {@code true} if this template instantiated creative is eligible
     * for native
     *                     adserving. This attribute is read-only and is
     * assigned by Google based on
     *                     the creative template.
     */
    public java.lang.Boolean getIsNativeEligible() {
        return isNativeEligible;
    }


    /**
     * Sets the isNativeEligible value for this TemplateCreative.
     * 
     * @param isNativeEligible   * {@code true} if this template instantiated creative is eligible
     * for native
     *                     adserving. This attribute is read-only and is
     * assigned by Google based on
     *                     the creative template.
     */
    public void setIsNativeEligible(java.lang.Boolean isNativeEligible) {
        this.isNativeEligible = isNativeEligible;
    }


    /**
     * Gets the isSafeFrameCompatible value for this TemplateCreative.
     * 
     * @return isSafeFrameCompatible   * Whether the {@link Creative} is compatible for SafeFrame rendering.
     * 
     *                     <p>This attribute is read-only and is assigned
     * by Google based on the {@link CreativeTemplate}.
     */
    public java.lang.Boolean getIsSafeFrameCompatible() {
        return isSafeFrameCompatible;
    }


    /**
     * Sets the isSafeFrameCompatible value for this TemplateCreative.
     * 
     * @param isSafeFrameCompatible   * Whether the {@link Creative} is compatible for SafeFrame rendering.
     * 
     *                     <p>This attribute is read-only and is assigned
     * by Google based on the {@link CreativeTemplate}.
     */
    public void setIsSafeFrameCompatible(java.lang.Boolean isSafeFrameCompatible) {
        this.isSafeFrameCompatible = isSafeFrameCompatible;
    }


    /**
     * Gets the destinationUrl value for this TemplateCreative.
     * 
     * @return destinationUrl   * The URL the user is directed to if they click on the creative.
     * This
     *                     attribute is only required if the template snippet
     * contains the {@code %u}
     *                     or {@code %%DEST_URL%%} macro. It has a maximum
     * length of 1024 characters.
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this TemplateCreative.
     * 
     * @param destinationUrl   * The URL the user is directed to if they click on the creative.
     * This
     *                     attribute is only required if the template snippet
     * contains the {@code %u}
     *                     or {@code %%DEST_URL%%} macro. It has a maximum
     * length of 1024 characters.
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the creativeTemplateVariableValues value for this TemplateCreative.
     * 
     * @return creativeTemplateVariableValues   * Stores values of {@link CreativeTemplateVariable} in the {@link
     * CreativeTemplate}.
     */
    public com.google.api.ads.dfp.axis.v201802.BaseCreativeTemplateVariableValue[] getCreativeTemplateVariableValues() {
        return creativeTemplateVariableValues;
    }


    /**
     * Sets the creativeTemplateVariableValues value for this TemplateCreative.
     * 
     * @param creativeTemplateVariableValues   * Stores values of {@link CreativeTemplateVariable} in the {@link
     * CreativeTemplate}.
     */
    public void setCreativeTemplateVariableValues(com.google.api.ads.dfp.axis.v201802.BaseCreativeTemplateVariableValue[] creativeTemplateVariableValues) {
        this.creativeTemplateVariableValues = creativeTemplateVariableValues;
    }

    public com.google.api.ads.dfp.axis.v201802.BaseCreativeTemplateVariableValue getCreativeTemplateVariableValues(int i) {
        return this.creativeTemplateVariableValues[i];
    }

    public void setCreativeTemplateVariableValues(int i, com.google.api.ads.dfp.axis.v201802.BaseCreativeTemplateVariableValue _value) {
        this.creativeTemplateVariableValues[i] = _value;
    }


    /**
     * Gets the sslScanResult value for this TemplateCreative.
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
     * Sets the sslScanResult value for this TemplateCreative.
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
     * Gets the sslManualOverride value for this TemplateCreative.
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
     * Sets the sslManualOverride value for this TemplateCreative.
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
     * Gets the lockedOrientation value for this TemplateCreative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.dfp.axis.v201802.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this TemplateCreative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateCreative)) return false;
        TemplateCreative other = (TemplateCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creativeTemplateId==null && other.getCreativeTemplateId()==null) || 
             (this.creativeTemplateId!=null &&
              this.creativeTemplateId.equals(other.getCreativeTemplateId()))) &&
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial()))) &&
            ((this.isNativeEligible==null && other.getIsNativeEligible()==null) || 
             (this.isNativeEligible!=null &&
              this.isNativeEligible.equals(other.getIsNativeEligible()))) &&
            ((this.isSafeFrameCompatible==null && other.getIsSafeFrameCompatible()==null) || 
             (this.isSafeFrameCompatible!=null &&
              this.isSafeFrameCompatible.equals(other.getIsSafeFrameCompatible()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.creativeTemplateVariableValues==null && other.getCreativeTemplateVariableValues()==null) || 
             (this.creativeTemplateVariableValues!=null &&
              java.util.Arrays.equals(this.creativeTemplateVariableValues, other.getCreativeTemplateVariableValues()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride()))) &&
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation())));
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
        if (getCreativeTemplateId() != null) {
            _hashCode += getCreativeTemplateId().hashCode();
        }
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        if (getIsNativeEligible() != null) {
            _hashCode += getIsNativeEligible().hashCode();
        }
        if (getIsSafeFrameCompatible() != null) {
            _hashCode += getIsSafeFrameCompatible().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getCreativeTemplateVariableValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeTemplateVariableValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeTemplateVariableValues(), i);
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
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TemplateCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("isNativeEligible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isNativeEligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTemplateVariableValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeTemplateVariableValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseCreativeTemplateVariableValue"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lockedOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LockedOrientation"));
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
