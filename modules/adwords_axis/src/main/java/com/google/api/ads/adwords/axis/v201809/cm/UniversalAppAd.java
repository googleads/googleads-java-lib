// Copyright 2018 Google LLC
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
 * UniversalAppAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents a universal app ad
 *             
 *             <p class="caution"><b>Caution:</b> Universal app ads do
 * not use #displayUrl displayUrl},
 *             \{@link #finalAppUrls finalAppUrls}, or {@link #devicePreference
 * devicePreference}; setting these
 *             fields on a universal app ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class UniversalAppAd  extends com.google.api.ads.adwords.axis.v201809.cm.Ad  implements java.io.Serializable {
    /* When the Ad serves, the headlines will be selected from this
     * list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdHeadlines".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] headlines;

    /* When the Ad serves, the descriptions will be selected from
     * this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] descriptions;

    /* Ad text that must be displayed when the ad is served.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdMandatoryAdText".</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink mandatoryAdText;

    /* Marketing images to attach to the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdImages".</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] images;

    /* YouTube videos to attach to the ad
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdYouTubeVideos".</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] videos;

    /* HTML5 MediaBundles to attach to the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdHtml5MediaBundles".</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] html5MediaBundles;

    public UniversalAppAd() {
    }

    public UniversalAppAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201809.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           com.google.api.ads.adwords.axis.v201809.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201809.cm.UrlData[] urlData,
           java.lang.Boolean automated,
           com.google.api.ads.adwords.axis.v201809.cm.AdType type,
           java.lang.Long devicePreference,
           com.google.api.ads.adwords.axis.v201809.cm.SystemManagedEntitySource systemManagedEntitySource,
           java.lang.String adType,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] headlines,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] descriptions,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink mandatoryAdText,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] images,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] videos,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] html5MediaBundles) {
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
        this.headlines = headlines;
        this.descriptions = descriptions;
        this.mandatoryAdText = mandatoryAdText;
        this.images = images;
        this.videos = videos;
        this.html5MediaBundles = html5MediaBundles;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("descriptions", getDescriptions())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("headlines", getHeadlines())
            .add("html5MediaBundles", getHtml5MediaBundles())
            .add("id", getId())
            .add("images", getImages())
            .add("mandatoryAdText", getMandatoryAdText())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .add("videos", getVideos())
            .toString();
    }

    /**
     * Gets the headlines value for this UniversalAppAd.
     * 
     * @return headlines   * When the Ad serves, the headlines will be selected from this
     * list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdHeadlines".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getHeadlines() {
        return headlines;
    }


    /**
     * Sets the headlines value for this UniversalAppAd.
     * 
     * @param headlines   * When the Ad serves, the headlines will be selected from this
     * list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdHeadlines".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setHeadlines(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] headlines) {
        this.headlines = headlines;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getHeadlines(int i) {
        return this.headlines[i];
    }

    public void setHeadlines(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.headlines[i] = _value;
    }


    /**
     * Gets the descriptions value for this UniversalAppAd.
     * 
     * @return descriptions   * When the Ad serves, the descriptions will be selected from
     * this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getDescriptions() {
        return descriptions;
    }


    /**
     * Sets the descriptions value for this UniversalAppAd.
     * 
     * @param descriptions   * When the Ad serves, the descriptions will be selected from
     * this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setDescriptions(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] descriptions) {
        this.descriptions = descriptions;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getDescriptions(int i) {
        return this.descriptions[i];
    }

    public void setDescriptions(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.descriptions[i] = _value;
    }


    /**
     * Gets the mandatoryAdText value for this UniversalAppAd.
     * 
     * @return mandatoryAdText   * Ad text that must be displayed when the ad is served.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdMandatoryAdText".</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getMandatoryAdText() {
        return mandatoryAdText;
    }


    /**
     * Sets the mandatoryAdText value for this UniversalAppAd.
     * 
     * @param mandatoryAdText   * Ad text that must be displayed when the ad is served.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdMandatoryAdText".</span>
     */
    public void setMandatoryAdText(com.google.api.ads.adwords.axis.v201809.cm.AssetLink mandatoryAdText) {
        this.mandatoryAdText = mandatoryAdText;
    }


    /**
     * Gets the images value for this UniversalAppAd.
     * 
     * @return images   * Marketing images to attach to the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdImages".</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getImages() {
        return images;
    }


    /**
     * Sets the images value for this UniversalAppAd.
     * 
     * @param images   * Marketing images to attach to the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdImages".</span>
     */
    public void setImages(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] images) {
        this.images = images;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getImages(int i) {
        return this.images[i];
    }

    public void setImages(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.images[i] = _value;
    }


    /**
     * Gets the videos value for this UniversalAppAd.
     * 
     * @return videos   * YouTube videos to attach to the ad
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdYouTubeVideos".</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getVideos() {
        return videos;
    }


    /**
     * Sets the videos value for this UniversalAppAd.
     * 
     * @param videos   * YouTube videos to attach to the ad
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdYouTubeVideos".</span>
     */
    public void setVideos(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] videos) {
        this.videos = videos;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getVideos(int i) {
        return this.videos[i];
    }

    public void setVideos(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.videos[i] = _value;
    }


    /**
     * Gets the html5MediaBundles value for this UniversalAppAd.
     * 
     * @return html5MediaBundles   * HTML5 MediaBundles to attach to the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdHtml5MediaBundles".</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getHtml5MediaBundles() {
        return html5MediaBundles;
    }


    /**
     * Sets the html5MediaBundles value for this UniversalAppAd.
     * 
     * @param html5MediaBundles   * HTML5 MediaBundles to attach to the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UniversalAppAdHtml5MediaBundles".</span>
     */
    public void setHtml5MediaBundles(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] html5MediaBundles) {
        this.html5MediaBundles = html5MediaBundles;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getHtml5MediaBundles(int i) {
        return this.html5MediaBundles[i];
    }

    public void setHtml5MediaBundles(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.html5MediaBundles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UniversalAppAd)) return false;
        UniversalAppAd other = (UniversalAppAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.headlines==null && other.getHeadlines()==null) || 
             (this.headlines!=null &&
              java.util.Arrays.equals(this.headlines, other.getHeadlines()))) &&
            ((this.descriptions==null && other.getDescriptions()==null) || 
             (this.descriptions!=null &&
              java.util.Arrays.equals(this.descriptions, other.getDescriptions()))) &&
            ((this.mandatoryAdText==null && other.getMandatoryAdText()==null) || 
             (this.mandatoryAdText!=null &&
              this.mandatoryAdText.equals(other.getMandatoryAdText()))) &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              java.util.Arrays.equals(this.images, other.getImages()))) &&
            ((this.videos==null && other.getVideos()==null) || 
             (this.videos!=null &&
              java.util.Arrays.equals(this.videos, other.getVideos()))) &&
            ((this.html5MediaBundles==null && other.getHtml5MediaBundles()==null) || 
             (this.html5MediaBundles!=null &&
              java.util.Arrays.equals(this.html5MediaBundles, other.getHtml5MediaBundles())));
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
        if (getHeadlines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeadlines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeadlines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescriptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescriptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescriptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMandatoryAdText() != null) {
            _hashCode += getMandatoryAdText().hashCode();
        }
        if (getImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVideos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHtml5MediaBundles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHtml5MediaBundles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHtml5MediaBundles(), i);
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
        new org.apache.axis.description.TypeDesc(UniversalAppAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UniversalAppAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headlines");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "headlines"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "descriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatoryAdText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "mandatoryAdText"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "images"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videos");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "videos"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("html5MediaBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "html5MediaBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
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
