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
 * ImageRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;


/**
 * A {@code Creative} that loads an image asset from a specified URL.
 */
public class ImageRedirectCreative  extends com.google.api.ads.admanager.axis.v202408.BaseImageRedirectCreative  implements java.io.Serializable {
    /* Alternative text to be rendered along with the creative used
     * mainly for accessibility. This
     *                     field is optional and has a maximum length of
     * 500 characters. */
    private java.lang.String altText;

    /* A list of impression tracking URL to ping when this creative
     * is displayed. This field is
     *                     optional and each string has a maximum length
     * of 1024 characters. */
    private java.lang.String[] thirdPartyImpressionTrackingUrls;

    public ImageRedirectCreative() {
    }

    public ImageRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202408.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202408.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202408.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202408.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202408.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202408.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.Boolean adBadgingEnabled,
           java.lang.String destinationUrl,
           com.google.api.ads.admanager.axis.v202408.DestinationUrlType destinationUrlType,
           java.lang.String imageUrl,
           java.lang.String altText,
           java.lang.String[] thirdPartyImpressionTrackingUrls) {
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
            destinationUrl,
            destinationUrlType,
            imageUrl);
        this.altText = altText;
        this.thirdPartyImpressionTrackingUrls = thirdPartyImpressionTrackingUrls;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBadgingEnabled", getAdBadgingEnabled())
            .add("advertiserId", getAdvertiserId())
            .add("altText", getAltText())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("id", getId())
            .add("imageUrl", getImageUrl())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyLabels", getPolicyLabels())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .add("thirdPartyImpressionTrackingUrls", getThirdPartyImpressionTrackingUrls())
            .toString();
    }

    /**
     * Gets the altText value for this ImageRedirectCreative.
     * 
     * @return altText   * Alternative text to be rendered along with the creative used
     * mainly for accessibility. This
     *                     field is optional and has a maximum length of
     * 500 characters.
     */
    public java.lang.String getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this ImageRedirectCreative.
     * 
     * @param altText   * Alternative text to be rendered along with the creative used
     * mainly for accessibility. This
     *                     field is optional and has a maximum length of
     * 500 characters.
     */
    public void setAltText(java.lang.String altText) {
        this.altText = altText;
    }


    /**
     * Gets the thirdPartyImpressionTrackingUrls value for this ImageRedirectCreative.
     * 
     * @return thirdPartyImpressionTrackingUrls   * A list of impression tracking URL to ping when this creative
     * is displayed. This field is
     *                     optional and each string has a maximum length
     * of 1024 characters.
     */
    public java.lang.String[] getThirdPartyImpressionTrackingUrls() {
        return thirdPartyImpressionTrackingUrls;
    }


    /**
     * Sets the thirdPartyImpressionTrackingUrls value for this ImageRedirectCreative.
     * 
     * @param thirdPartyImpressionTrackingUrls   * A list of impression tracking URL to ping when this creative
     * is displayed. This field is
     *                     optional and each string has a maximum length
     * of 1024 characters.
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
        if (!(obj instanceof ImageRedirectCreative)) return false;
        ImageRedirectCreative other = (ImageRedirectCreative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
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
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
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
        new org.apache.axis.description.TypeDesc(ImageRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "ImageRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "altText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionTrackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "thirdPartyImpressionTrackingUrls"));
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
