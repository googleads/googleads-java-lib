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
 * GmailAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents Gmail ad.
 *             
 *             <p class="caution"><b>Caution:</b> Gmail ads do not use
 * {@link #url url}, {@link #displayUrl
 *             displayUrl}, {@link #finalAppUrls finalAppUrls}, or {@link
 * #devicePreference devicePreference};
 *             Setting these fields on a Gmail ad will cause an error.
 * <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 */
public class GmailAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* Gmail teaser info.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.GmailTeaser teaser;

    /* Header image. An image must first be created using the MediaService,
     * and Image.mediaId must be
     *                     populated when creating a {@link "GmailAd"}. Valid
     * image types are GIF, JPEG, and PNG. The
     *                     minimum size is 300x100 and the aspect ratio must
     * be in 3:1 to 5:1 (+-1%). */
    private com.google.api.ads.adwords.axis.v201802.cm.Image headerImage;

    /* Marketing image. An image must first be created using the MediaService,
     * and Image.mediaId must
     *                     be populated when creating a {@link "GmailAd"}.Valid
     * image types are GIF, JPEG, and PNG. The
     *                     minimum size is 600x314 and the aspect ratio must
     * be 600:314 (+-1%). For square marketing
     *                     image, the minimum size is 300x300 and the aspect
     * ratio must be 1:1 (+-1%). Either
     *                     productVideos or marketingImage must be specified. */
    private com.google.api.ads.adwords.axis.v201802.cm.Image marketingImage;

    /* Headline of the marketing image. Maximum display width is 25
     * characters.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String marketingImageHeadline;

    /* Description of the marketing image. Maximum display width is
     * 90 characters.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String marketingImageDescription;

    /* Display-call-to-action of the marketing image. The DisplayCallToAction.urlId
     * field cannot be
     *                     set when setting this field. */
    private com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction marketingImageDisplayCallToAction;

    /* Product images. Support up to 15 product images. */
    private com.google.api.ads.adwords.axis.v201802.cm.ProductImage[] productImages;

    /* Product Videos. Either productVideoList or marketingImage must
     * be specified. Supports up to 7
     *                     product videos. It must be a YouTube hosted video
     * and mediaId must be populated. The YouTube
     *                     hosted video can be added to AdWords through either
     * the AdWords UI or through AdWords Scripts
     *                     (https://developers.google.com/adwords/scripts/docs/reference/adwordsapp/adwordsapp_videobuilder). */
    private com.google.api.ads.adwords.axis.v201802.cm.Video[] productVideoList;

    public GmailAd() {
    }

    public GmailAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201802.cm.UrlData[] urlData,
           java.lang.Boolean automated,
           com.google.api.ads.adwords.axis.v201802.cm.AdType type,
           java.lang.Long devicePreference,
           com.google.api.ads.adwords.axis.v201802.cm.SystemManagedEntitySource systemManagedEntitySource,
           java.lang.String adType,
           com.google.api.ads.adwords.axis.v201802.cm.GmailTeaser teaser,
           com.google.api.ads.adwords.axis.v201802.cm.Image headerImage,
           com.google.api.ads.adwords.axis.v201802.cm.Image marketingImage,
           java.lang.String marketingImageHeadline,
           java.lang.String marketingImageDescription,
           com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction marketingImageDisplayCallToAction,
           com.google.api.ads.adwords.axis.v201802.cm.ProductImage[] productImages,
           com.google.api.ads.adwords.axis.v201802.cm.Video[] productVideoList) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            finalUrlSuffix,
            urlCustomParameters,
            urlData,
            automated,
            type,
            devicePreference,
            systemManagedEntitySource,
            adType);
        this.teaser = teaser;
        this.headerImage = headerImage;
        this.marketingImage = marketingImage;
        this.marketingImageHeadline = marketingImageHeadline;
        this.marketingImageDescription = marketingImageDescription;
        this.marketingImageDisplayCallToAction = marketingImageDisplayCallToAction;
        this.productImages = productImages;
        this.productVideoList = productVideoList;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("headerImage", getHeaderImage())
            .add("id", getId())
            .add("marketingImage", getMarketingImage())
            .add("marketingImageDescription", getMarketingImageDescription())
            .add("marketingImageDisplayCallToAction", getMarketingImageDisplayCallToAction())
            .add("marketingImageHeadline", getMarketingImageHeadline())
            .add("productImages", getProductImages())
            .add("productVideoList", getProductVideoList())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("teaser", getTeaser())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the teaser value for this GmailAd.
     * 
     * @return teaser   * Gmail teaser info.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.GmailTeaser getTeaser() {
        return teaser;
    }


    /**
     * Sets the teaser value for this GmailAd.
     * 
     * @param teaser   * Gmail teaser info.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setTeaser(com.google.api.ads.adwords.axis.v201802.cm.GmailTeaser teaser) {
        this.teaser = teaser;
    }


    /**
     * Gets the headerImage value for this GmailAd.
     * 
     * @return headerImage   * Header image. An image must first be created using the MediaService,
     * and Image.mediaId must be
     *                     populated when creating a {@link "GmailAd"}. Valid
     * image types are GIF, JPEG, and PNG. The
     *                     minimum size is 300x100 and the aspect ratio must
     * be in 3:1 to 5:1 (+-1%).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getHeaderImage() {
        return headerImage;
    }


    /**
     * Sets the headerImage value for this GmailAd.
     * 
     * @param headerImage   * Header image. An image must first be created using the MediaService,
     * and Image.mediaId must be
     *                     populated when creating a {@link "GmailAd"}. Valid
     * image types are GIF, JPEG, and PNG. The
     *                     minimum size is 300x100 and the aspect ratio must
     * be in 3:1 to 5:1 (+-1%).
     */
    public void setHeaderImage(com.google.api.ads.adwords.axis.v201802.cm.Image headerImage) {
        this.headerImage = headerImage;
    }


    /**
     * Gets the marketingImage value for this GmailAd.
     * 
     * @return marketingImage   * Marketing image. An image must first be created using the MediaService,
     * and Image.mediaId must
     *                     be populated when creating a {@link "GmailAd"}.Valid
     * image types are GIF, JPEG, and PNG. The
     *                     minimum size is 600x314 and the aspect ratio must
     * be 600:314 (+-1%). For square marketing
     *                     image, the minimum size is 300x300 and the aspect
     * ratio must be 1:1 (+-1%). Either
     *                     productVideos or marketingImage must be specified.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getMarketingImage() {
        return marketingImage;
    }


    /**
     * Sets the marketingImage value for this GmailAd.
     * 
     * @param marketingImage   * Marketing image. An image must first be created using the MediaService,
     * and Image.mediaId must
     *                     be populated when creating a {@link "GmailAd"}.Valid
     * image types are GIF, JPEG, and PNG. The
     *                     minimum size is 600x314 and the aspect ratio must
     * be 600:314 (+-1%). For square marketing
     *                     image, the minimum size is 300x300 and the aspect
     * ratio must be 1:1 (+-1%). Either
     *                     productVideos or marketingImage must be specified.
     */
    public void setMarketingImage(com.google.api.ads.adwords.axis.v201802.cm.Image marketingImage) {
        this.marketingImage = marketingImage;
    }


    /**
     * Gets the marketingImageHeadline value for this GmailAd.
     * 
     * @return marketingImageHeadline   * Headline of the marketing image. Maximum display width is 25
     * characters.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getMarketingImageHeadline() {
        return marketingImageHeadline;
    }


    /**
     * Sets the marketingImageHeadline value for this GmailAd.
     * 
     * @param marketingImageHeadline   * Headline of the marketing image. Maximum display width is 25
     * characters.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMarketingImageHeadline(java.lang.String marketingImageHeadline) {
        this.marketingImageHeadline = marketingImageHeadline;
    }


    /**
     * Gets the marketingImageDescription value for this GmailAd.
     * 
     * @return marketingImageDescription   * Description of the marketing image. Maximum display width is
     * 90 characters.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getMarketingImageDescription() {
        return marketingImageDescription;
    }


    /**
     * Sets the marketingImageDescription value for this GmailAd.
     * 
     * @param marketingImageDescription   * Description of the marketing image. Maximum display width is
     * 90 characters.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMarketingImageDescription(java.lang.String marketingImageDescription) {
        this.marketingImageDescription = marketingImageDescription;
    }


    /**
     * Gets the marketingImageDisplayCallToAction value for this GmailAd.
     * 
     * @return marketingImageDisplayCallToAction   * Display-call-to-action of the marketing image. The DisplayCallToAction.urlId
     * field cannot be
     *                     set when setting this field.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction getMarketingImageDisplayCallToAction() {
        return marketingImageDisplayCallToAction;
    }


    /**
     * Sets the marketingImageDisplayCallToAction value for this GmailAd.
     * 
     * @param marketingImageDisplayCallToAction   * Display-call-to-action of the marketing image. The DisplayCallToAction.urlId
     * field cannot be
     *                     set when setting this field.
     */
    public void setMarketingImageDisplayCallToAction(com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction marketingImageDisplayCallToAction) {
        this.marketingImageDisplayCallToAction = marketingImageDisplayCallToAction;
    }


    /**
     * Gets the productImages value for this GmailAd.
     * 
     * @return productImages   * Product images. Support up to 15 product images.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProductImage[] getProductImages() {
        return productImages;
    }


    /**
     * Sets the productImages value for this GmailAd.
     * 
     * @param productImages   * Product images. Support up to 15 product images.
     */
    public void setProductImages(com.google.api.ads.adwords.axis.v201802.cm.ProductImage[] productImages) {
        this.productImages = productImages;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.ProductImage getProductImages(int i) {
        return this.productImages[i];
    }

    public void setProductImages(int i, com.google.api.ads.adwords.axis.v201802.cm.ProductImage _value) {
        this.productImages[i] = _value;
    }


    /**
     * Gets the productVideoList value for this GmailAd.
     * 
     * @return productVideoList   * Product Videos. Either productVideoList or marketingImage must
     * be specified. Supports up to 7
     *                     product videos. It must be a YouTube hosted video
     * and mediaId must be populated. The YouTube
     *                     hosted video can be added to AdWords through either
     * the AdWords UI or through AdWords Scripts
     *                     (https://developers.google.com/adwords/scripts/docs/reference/adwordsapp/adwordsapp_videobuilder).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Video[] getProductVideoList() {
        return productVideoList;
    }


    /**
     * Sets the productVideoList value for this GmailAd.
     * 
     * @param productVideoList   * Product Videos. Either productVideoList or marketingImage must
     * be specified. Supports up to 7
     *                     product videos. It must be a YouTube hosted video
     * and mediaId must be populated. The YouTube
     *                     hosted video can be added to AdWords through either
     * the AdWords UI or through AdWords Scripts
     *                     (https://developers.google.com/adwords/scripts/docs/reference/adwordsapp/adwordsapp_videobuilder).
     */
    public void setProductVideoList(com.google.api.ads.adwords.axis.v201802.cm.Video[] productVideoList) {
        this.productVideoList = productVideoList;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Video getProductVideoList(int i) {
        return this.productVideoList[i];
    }

    public void setProductVideoList(int i, com.google.api.ads.adwords.axis.v201802.cm.Video _value) {
        this.productVideoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GmailAd)) return false;
        GmailAd other = (GmailAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.teaser==null && other.getTeaser()==null) || 
             (this.teaser!=null &&
              this.teaser.equals(other.getTeaser()))) &&
            ((this.headerImage==null && other.getHeaderImage()==null) || 
             (this.headerImage!=null &&
              this.headerImage.equals(other.getHeaderImage()))) &&
            ((this.marketingImage==null && other.getMarketingImage()==null) || 
             (this.marketingImage!=null &&
              this.marketingImage.equals(other.getMarketingImage()))) &&
            ((this.marketingImageHeadline==null && other.getMarketingImageHeadline()==null) || 
             (this.marketingImageHeadline!=null &&
              this.marketingImageHeadline.equals(other.getMarketingImageHeadline()))) &&
            ((this.marketingImageDescription==null && other.getMarketingImageDescription()==null) || 
             (this.marketingImageDescription!=null &&
              this.marketingImageDescription.equals(other.getMarketingImageDescription()))) &&
            ((this.marketingImageDisplayCallToAction==null && other.getMarketingImageDisplayCallToAction()==null) || 
             (this.marketingImageDisplayCallToAction!=null &&
              this.marketingImageDisplayCallToAction.equals(other.getMarketingImageDisplayCallToAction()))) &&
            ((this.productImages==null && other.getProductImages()==null) || 
             (this.productImages!=null &&
              java.util.Arrays.equals(this.productImages, other.getProductImages()))) &&
            ((this.productVideoList==null && other.getProductVideoList()==null) || 
             (this.productVideoList!=null &&
              java.util.Arrays.equals(this.productVideoList, other.getProductVideoList())));
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
        if (getTeaser() != null) {
            _hashCode += getTeaser().hashCode();
        }
        if (getHeaderImage() != null) {
            _hashCode += getHeaderImage().hashCode();
        }
        if (getMarketingImage() != null) {
            _hashCode += getMarketingImage().hashCode();
        }
        if (getMarketingImageHeadline() != null) {
            _hashCode += getMarketingImageHeadline().hashCode();
        }
        if (getMarketingImageDescription() != null) {
            _hashCode += getMarketingImageDescription().hashCode();
        }
        if (getMarketingImageDisplayCallToAction() != null) {
            _hashCode += getMarketingImageDisplayCallToAction().hashCode();
        }
        if (getProductImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductVideoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductVideoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductVideoList(), i);
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
        new org.apache.axis.description.TypeDesc(GmailAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GmailAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teaser");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "teaser"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GmailTeaser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "headerImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "marketingImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingImageHeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "marketingImageHeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingImageDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "marketingImageDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingImageDisplayCallToAction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "marketingImageDisplayCallToAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayCallToAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "productImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVideoList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "productVideoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Video"));
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
