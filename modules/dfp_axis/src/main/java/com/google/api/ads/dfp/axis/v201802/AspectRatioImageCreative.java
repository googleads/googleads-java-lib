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
 * AspectRatioImageCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} intended for mobile platforms that displays
 * an image,
 *             whose {@link LineItem#creativePlaceholders size} is defined
 * as an
 *             {@link CreativeSizeType#ASPECT_RATIO aspect ratio}, i.e.
 * {@link Size#isAspectRatio}. It can have multiple images whose dimensions
 * conform to that aspect ratio.
 */
public class AspectRatioImageCreative  extends com.google.api.ads.dfp.axis.v201802.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The images associated with this creative. The ad server will
     * choose one
     *                     based on the capabilities of the device. Each
     * asset should have a size
     *                     which is of the same aspect ratio as the {@link
     * Creative#size}. This
     *                     attribute is required and must have at least one
     * asset. */
    private com.google.api.ads.dfp.axis.v201802.CreativeAsset[] imageAssets;

    /* The text that is served along with the image creative, primarily
     * for
     *                     accessibility. If no suitable image size is available
     * for the device, this
     *                     text replaces the image completely. This field
     * is optional and has a
     *                     maximum length of 500 characters. */
    private java.lang.String altText;

    /* An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters. */
    private java.lang.String thirdPartyImpressionUrl;

    /* Allows the actual image asset sizes to differ from the creative
     * size.
     *                     This attribute is optional. */
    private java.lang.Boolean overrideSize;

    public AspectRatioImageCreative() {
    }

    public AspectRatioImageCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201802.DestinationUrlType destinationUrlType,
           com.google.api.ads.dfp.axis.v201802.CreativeAsset[] imageAssets,
           java.lang.String altText,
           java.lang.String thirdPartyImpressionUrl,
           java.lang.Boolean overrideSize) {
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
            destinationUrl,
            destinationUrlType);
        this.imageAssets = imageAssets;
        this.altText = altText;
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
        this.overrideSize = overrideSize;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("altText", getAltText())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("id", getId())
            .add("imageAssets", getImageAssets())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("overrideSize", getOverrideSize())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("thirdPartyImpressionUrl", getThirdPartyImpressionUrl())
            .toString();
    }

    /**
     * Gets the imageAssets value for this AspectRatioImageCreative.
     * 
     * @return imageAssets   * The images associated with this creative. The ad server will
     * choose one
     *                     based on the capabilities of the device. Each
     * asset should have a size
     *                     which is of the same aspect ratio as the {@link
     * Creative#size}. This
     *                     attribute is required and must have at least one
     * asset.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeAsset[] getImageAssets() {
        return imageAssets;
    }


    /**
     * Sets the imageAssets value for this AspectRatioImageCreative.
     * 
     * @param imageAssets   * The images associated with this creative. The ad server will
     * choose one
     *                     based on the capabilities of the device. Each
     * asset should have a size
     *                     which is of the same aspect ratio as the {@link
     * Creative#size}. This
     *                     attribute is required and must have at least one
     * asset.
     */
    public void setImageAssets(com.google.api.ads.dfp.axis.v201802.CreativeAsset[] imageAssets) {
        this.imageAssets = imageAssets;
    }

    public com.google.api.ads.dfp.axis.v201802.CreativeAsset getImageAssets(int i) {
        return this.imageAssets[i];
    }

    public void setImageAssets(int i, com.google.api.ads.dfp.axis.v201802.CreativeAsset _value) {
        this.imageAssets[i] = _value;
    }


    /**
     * Gets the altText value for this AspectRatioImageCreative.
     * 
     * @return altText   * The text that is served along with the image creative, primarily
     * for
     *                     accessibility. If no suitable image size is available
     * for the device, this
     *                     text replaces the image completely. This field
     * is optional and has a
     *                     maximum length of 500 characters.
     */
    public java.lang.String getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this AspectRatioImageCreative.
     * 
     * @param altText   * The text that is served along with the image creative, primarily
     * for
     *                     accessibility. If no suitable image size is available
     * for the device, this
     *                     text replaces the image completely. This field
     * is optional and has a
     *                     maximum length of 500 characters.
     */
    public void setAltText(java.lang.String altText) {
        this.altText = altText;
    }


    /**
     * Gets the thirdPartyImpressionUrl value for this AspectRatioImageCreative.
     * 
     * @return thirdPartyImpressionUrl   * An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters.
     */
    public java.lang.String getThirdPartyImpressionUrl() {
        return thirdPartyImpressionUrl;
    }


    /**
     * Sets the thirdPartyImpressionUrl value for this AspectRatioImageCreative.
     * 
     * @param thirdPartyImpressionUrl   * An impression tracking URL to ping when this creative is displayed.
     * This field is optional has
     *                     a maximum length of 1024 characters.
     */
    public void setThirdPartyImpressionUrl(java.lang.String thirdPartyImpressionUrl) {
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
    }


    /**
     * Gets the overrideSize value for this AspectRatioImageCreative.
     * 
     * @return overrideSize   * Allows the actual image asset sizes to differ from the creative
     * size.
     *                     This attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this AspectRatioImageCreative.
     * 
     * @param overrideSize   * Allows the actual image asset sizes to differ from the creative
     * size.
     *                     This attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AspectRatioImageCreative)) return false;
        AspectRatioImageCreative other = (AspectRatioImageCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.imageAssets==null && other.getImageAssets()==null) || 
             (this.imageAssets!=null &&
              java.util.Arrays.equals(this.imageAssets, other.getImageAssets()))) &&
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
            ((this.thirdPartyImpressionUrl==null && other.getThirdPartyImpressionUrl()==null) || 
             (this.thirdPartyImpressionUrl!=null &&
              this.thirdPartyImpressionUrl.equals(other.getThirdPartyImpressionUrl()))) &&
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize())));
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
        if (getImageAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageAssets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
        }
        if (getThirdPartyImpressionUrl() != null) {
            _hashCode += getThirdPartyImpressionUrl().hashCode();
        }
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AspectRatioImageCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AspectRatioImageCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "imageAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "altText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "thirdPartyImpressionUrl"));
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
