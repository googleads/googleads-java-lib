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
 * DynamicSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents Dynamic Settings.
 */
public class DynamicSettings  implements java.io.Serializable {
    /* Landscape logo image. This ad format does not allow the creation
     * of an image using the
     *                 Image.data field. An image must first be created using
     * the MediaService, and Image.mediaId must
     *                 be populated when creating a {@link "DynamicSettings"}.
     * Valid image types are GIF, JPEG, and
     *                 PNG. The minimum size is 512x128 the aspect ratio
     * must be 512:128 (+-1%). */
    private com.google.api.ads.adwords.axis.v201802.cm.Image landscapeLogoImage;

    /* Prefix before price. Maximum display width is 10. example,
     * "as low as". */
    private java.lang.String pricePrefix;

    /* Promotion text used for dynamic formats of responsive ads.
     * Maximum display width is 25. For
     *                 example, "Free two-day shipping". */
    private java.lang.String promoText;

    public DynamicSettings() {
    }

    public DynamicSettings(
           com.google.api.ads.adwords.axis.v201802.cm.Image landscapeLogoImage,
           java.lang.String pricePrefix,
           java.lang.String promoText) {
           this.landscapeLogoImage = landscapeLogoImage;
           this.pricePrefix = pricePrefix;
           this.promoText = promoText;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("landscapeLogoImage", getLandscapeLogoImage())
            .add("pricePrefix", getPricePrefix())
            .add("promoText", getPromoText())
            .toString();
    }

    /**
     * Gets the landscapeLogoImage value for this DynamicSettings.
     * 
     * @return landscapeLogoImage   * Landscape logo image. This ad format does not allow the creation
     * of an image using the
     *                 Image.data field. An image must first be created using
     * the MediaService, and Image.mediaId must
     *                 be populated when creating a {@link "DynamicSettings"}.
     * Valid image types are GIF, JPEG, and
     *                 PNG. The minimum size is 512x128 the aspect ratio
     * must be 512:128 (+-1%).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getLandscapeLogoImage() {
        return landscapeLogoImage;
    }


    /**
     * Sets the landscapeLogoImage value for this DynamicSettings.
     * 
     * @param landscapeLogoImage   * Landscape logo image. This ad format does not allow the creation
     * of an image using the
     *                 Image.data field. An image must first be created using
     * the MediaService, and Image.mediaId must
     *                 be populated when creating a {@link "DynamicSettings"}.
     * Valid image types are GIF, JPEG, and
     *                 PNG. The minimum size is 512x128 the aspect ratio
     * must be 512:128 (+-1%).
     */
    public void setLandscapeLogoImage(com.google.api.ads.adwords.axis.v201802.cm.Image landscapeLogoImage) {
        this.landscapeLogoImage = landscapeLogoImage;
    }


    /**
     * Gets the pricePrefix value for this DynamicSettings.
     * 
     * @return pricePrefix   * Prefix before price. Maximum display width is 10. example,
     * "as low as".
     */
    public java.lang.String getPricePrefix() {
        return pricePrefix;
    }


    /**
     * Sets the pricePrefix value for this DynamicSettings.
     * 
     * @param pricePrefix   * Prefix before price. Maximum display width is 10. example,
     * "as low as".
     */
    public void setPricePrefix(java.lang.String pricePrefix) {
        this.pricePrefix = pricePrefix;
    }


    /**
     * Gets the promoText value for this DynamicSettings.
     * 
     * @return promoText   * Promotion text used for dynamic formats of responsive ads.
     * Maximum display width is 25. For
     *                 example, "Free two-day shipping".
     */
    public java.lang.String getPromoText() {
        return promoText;
    }


    /**
     * Sets the promoText value for this DynamicSettings.
     * 
     * @param promoText   * Promotion text used for dynamic formats of responsive ads.
     * Maximum display width is 25. For
     *                 example, "Free two-day shipping".
     */
    public void setPromoText(java.lang.String promoText) {
        this.promoText = promoText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicSettings)) return false;
        DynamicSettings other = (DynamicSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.landscapeLogoImage==null && other.getLandscapeLogoImage()==null) || 
             (this.landscapeLogoImage!=null &&
              this.landscapeLogoImage.equals(other.getLandscapeLogoImage()))) &&
            ((this.pricePrefix==null && other.getPricePrefix()==null) || 
             (this.pricePrefix!=null &&
              this.pricePrefix.equals(other.getPricePrefix()))) &&
            ((this.promoText==null && other.getPromoText()==null) || 
             (this.promoText!=null &&
              this.promoText.equals(other.getPromoText())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLandscapeLogoImage() != null) {
            _hashCode += getLandscapeLogoImage().hashCode();
        }
        if (getPricePrefix() != null) {
            _hashCode += getPricePrefix().hashCode();
        }
        if (getPromoText() != null) {
            _hashCode += getPromoText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DynamicSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DynamicSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landscapeLogoImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "landscapeLogoImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "pricePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "promoText"));
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
