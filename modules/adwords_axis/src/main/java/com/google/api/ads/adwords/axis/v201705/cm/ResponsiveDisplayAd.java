// Copyright 2017 Google Inc. All Rights Reserved.
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
 * ResponsiveDisplayAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201705.cm;


/**
 * Enhanced display ad format.
 *             
 *             <p class="caution"><b>Caution:</b> Responsive display
 * ads do not use {@link #url url},
 *             {@link #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls},
 * or
 *             {@link #devicePreference devicePreference};
 *             setting these fields on a responsive display ad will cause
 * an error.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ResponsiveDisplayAd  extends com.google.api.ads.adwords.axis.v201705.cm.Ad  implements java.io.Serializable {
    /* Marketing image to be used in the ad. This ad format does not
     * allow the creation of an image
     *                     using the Image.data field. An image must first
     * be created using the MediaService, and
     *                     Image.mediaId must be populated when creating
     * a {@link "ResponsiveDisplayAd"}. Valid image
     *                     types are GIF, JPEG, and PNG. The minimum size
     * is 600x314 and the aspect ratio must be 600:314
     *                     (+-1%).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201705.cm.Image marketingImage;

    /* Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the Image.data field. An image must first be created
     * using the MediaService, and Image.mediaId
     *                     must be populated when creating a {@link "ResponsiveDisplayAd"}.
     * Valid image types are GIF,
     *                     JPEG, and PNG. The minimum size is 128x128 and
     * the aspect ratio must be 1:1 (+-1%). */
    private com.google.api.ads.adwords.axis.v201705.cm.Image logoImage;

    /* Short format of the headline of the ad. Maximum display width
     * is 25.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String shortHeadline;

    /* Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String longHeadline;

    /* The descriptive text of the ad. Maximum display width is 90.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Description".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String description;

    /* The business name. Maximum display width is 25. <span class="constraint
     * Required">This field is
     *                     required and should not be {@code null} when it
     * is contained within {@link Operator}s :
     *                     ADD.</span> */
    private java.lang.String businessName;

    public ResponsiveDisplayAd() {
    }

    public ResponsiveDisplayAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201705.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201705.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201705.cm.UrlData[] urlData,
           com.google.api.ads.adwords.axis.v201705.cm.AdType type,
           java.lang.Long devicePreference,
           java.lang.String adType,
           com.google.api.ads.adwords.axis.v201705.cm.Image marketingImage,
           com.google.api.ads.adwords.axis.v201705.cm.Image logoImage,
           java.lang.String shortHeadline,
           java.lang.String longHeadline,
           java.lang.String description,
           java.lang.String businessName) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            urlCustomParameters,
            urlData,
            type,
            devicePreference,
            adType);
        this.marketingImage = marketingImage;
        this.logoImage = logoImage;
        this.shortHeadline = shortHeadline;
        this.longHeadline = longHeadline;
        this.description = description;
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adType", getAdType())
            .add("businessName", getBusinessName())
            .add("description", getDescription())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrls", getFinalUrls())
            .add("id", getId())
            .add("logoImage", getLogoImage())
            .add("longHeadline", getLongHeadline())
            .add("marketingImage", getMarketingImage())
            .add("shortHeadline", getShortHeadline())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the marketingImage value for this ResponsiveDisplayAd.
     * 
     * @return marketingImage   * Marketing image to be used in the ad. This ad format does not
     * allow the creation of an image
     *                     using the Image.data field. An image must first
     * be created using the MediaService, and
     *                     Image.mediaId must be populated when creating
     * a {@link "ResponsiveDisplayAd"}. Valid image
     *                     types are GIF, JPEG, and PNG. The minimum size
     * is 600x314 and the aspect ratio must be 600:314
     *                     (+-1%).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201705.cm.Image getMarketingImage() {
        return marketingImage;
    }


    /**
     * Sets the marketingImage value for this ResponsiveDisplayAd.
     * 
     * @param marketingImage   * Marketing image to be used in the ad. This ad format does not
     * allow the creation of an image
     *                     using the Image.data field. An image must first
     * be created using the MediaService, and
     *                     Image.mediaId must be populated when creating
     * a {@link "ResponsiveDisplayAd"}. Valid image
     *                     types are GIF, JPEG, and PNG. The minimum size
     * is 600x314 and the aspect ratio must be 600:314
     *                     (+-1%).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMarketingImage(com.google.api.ads.adwords.axis.v201705.cm.Image marketingImage) {
        this.marketingImage = marketingImage;
    }


    /**
     * Gets the logoImage value for this ResponsiveDisplayAd.
     * 
     * @return logoImage   * Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the Image.data field. An image must first be created
     * using the MediaService, and Image.mediaId
     *                     must be populated when creating a {@link "ResponsiveDisplayAd"}.
     * Valid image types are GIF,
     *                     JPEG, and PNG. The minimum size is 128x128 and
     * the aspect ratio must be 1:1 (+-1%).
     */
    public com.google.api.ads.adwords.axis.v201705.cm.Image getLogoImage() {
        return logoImage;
    }


    /**
     * Sets the logoImage value for this ResponsiveDisplayAd.
     * 
     * @param logoImage   * Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the Image.data field. An image must first be created
     * using the MediaService, and Image.mediaId
     *                     must be populated when creating a {@link "ResponsiveDisplayAd"}.
     * Valid image types are GIF,
     *                     JPEG, and PNG. The minimum size is 128x128 and
     * the aspect ratio must be 1:1 (+-1%).
     */
    public void setLogoImage(com.google.api.ads.adwords.axis.v201705.cm.Image logoImage) {
        this.logoImage = logoImage;
    }


    /**
     * Gets the shortHeadline value for this ResponsiveDisplayAd.
     * 
     * @return shortHeadline   * Short format of the headline of the ad. Maximum display width
     * is 25.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getShortHeadline() {
        return shortHeadline;
    }


    /**
     * Sets the shortHeadline value for this ResponsiveDisplayAd.
     * 
     * @param shortHeadline   * Short format of the headline of the ad. Maximum display width
     * is 25.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setShortHeadline(java.lang.String shortHeadline) {
        this.shortHeadline = shortHeadline;
    }


    /**
     * Gets the longHeadline value for this ResponsiveDisplayAd.
     * 
     * @return longHeadline   * Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getLongHeadline() {
        return longHeadline;
    }


    /**
     * Sets the longHeadline value for this ResponsiveDisplayAd.
     * 
     * @param longHeadline   * Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setLongHeadline(java.lang.String longHeadline) {
        this.longHeadline = longHeadline;
    }


    /**
     * Gets the description value for this ResponsiveDisplayAd.
     * 
     * @return description   * The descriptive text of the ad. Maximum display width is 90.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Description".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResponsiveDisplayAd.
     * 
     * @param description   * The descriptive text of the ad. Maximum display width is 90.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Description".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the businessName value for this ResponsiveDisplayAd.
     * 
     * @return businessName   * The business name. Maximum display width is 25. <span class="constraint
     * Required">This field is
     *                     required and should not be {@code null} when it
     * is contained within {@link Operator}s :
     *                     ADD.</span>
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this ResponsiveDisplayAd.
     * 
     * @param businessName   * The business name. Maximum display width is 25. <span class="constraint
     * Required">This field is
     *                     required and should not be {@code null} when it
     * is contained within {@link Operator}s :
     *                     ADD.</span>
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponsiveDisplayAd)) return false;
        ResponsiveDisplayAd other = (ResponsiveDisplayAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.marketingImage==null && other.getMarketingImage()==null) || 
             (this.marketingImage!=null &&
              this.marketingImage.equals(other.getMarketingImage()))) &&
            ((this.logoImage==null && other.getLogoImage()==null) || 
             (this.logoImage!=null &&
              this.logoImage.equals(other.getLogoImage()))) &&
            ((this.shortHeadline==null && other.getShortHeadline()==null) || 
             (this.shortHeadline!=null &&
              this.shortHeadline.equals(other.getShortHeadline()))) &&
            ((this.longHeadline==null && other.getLongHeadline()==null) || 
             (this.longHeadline!=null &&
              this.longHeadline.equals(other.getLongHeadline()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName())));
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
        if (getMarketingImage() != null) {
            _hashCode += getMarketingImage().hashCode();
        }
        if (getLogoImage() != null) {
            _hashCode += getLogoImage().hashCode();
        }
        if (getShortHeadline() != null) {
            _hashCode += getShortHeadline().hashCode();
        }
        if (getLongHeadline() != null) {
            _hashCode += getLongHeadline().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponsiveDisplayAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "ResponsiveDisplayAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "marketingImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "logoImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortHeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "shortHeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longHeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "longHeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "businessName"));
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
