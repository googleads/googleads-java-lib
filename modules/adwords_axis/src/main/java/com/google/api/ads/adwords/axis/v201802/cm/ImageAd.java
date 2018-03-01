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
 * ImageAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an ImageAd.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ImageAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* The image data for the ad. */
    private com.google.api.ads.adwords.axis.v201802.cm.Image image;

    /* The name label for this ad.
     *                     <span class="constraint Required">
     *                     This field is required and should not be {@code
     * null}.</span> */
    private java.lang.String name;

    /* For ADD operations only: use this field to specify an existing
     * image ad to copy the image from, in which case the "image" field
     *                     can be left empty. This is the preferred way of
     * copying images
     *                     over re-uploading the same image.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored
     *                     when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private java.lang.Long adToCopyImageFrom;

    public ImageAd() {
    }

    public ImageAd(
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
           com.google.api.ads.adwords.axis.v201802.cm.Image image,
           java.lang.String name,
           java.lang.Long adToCopyImageFrom) {
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
        this.image = image;
        this.name = name;
        this.adToCopyImageFrom = adToCopyImageFrom;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adToCopyImageFrom", getAdToCopyImageFrom())
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("id", getId())
            .add("image", getImage())
            .add("name", getName())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the image value for this ImageAd.
     * 
     * @return image   * The image data for the ad.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getImage() {
        return image;
    }


    /**
     * Sets the image value for this ImageAd.
     * 
     * @param image   * The image data for the ad.
     */
    public void setImage(com.google.api.ads.adwords.axis.v201802.cm.Image image) {
        this.image = image;
    }


    /**
     * Gets the name value for this ImageAd.
     * 
     * @return name   * The name label for this ad.
     *                     <span class="constraint Required">
     *                     This field is required and should not be {@code
     * null}.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ImageAd.
     * 
     * @param name   * The name label for this ad.
     *                     <span class="constraint Required">
     *                     This field is required and should not be {@code
     * null}.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the adToCopyImageFrom value for this ImageAd.
     * 
     * @return adToCopyImageFrom   * For ADD operations only: use this field to specify an existing
     * image ad to copy the image from, in which case the "image" field
     *                     can be left empty. This is the preferred way of
     * copying images
     *                     over re-uploading the same image.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored
     *                     when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public java.lang.Long getAdToCopyImageFrom() {
        return adToCopyImageFrom;
    }


    /**
     * Sets the adToCopyImageFrom value for this ImageAd.
     * 
     * @param adToCopyImageFrom   * For ADD operations only: use this field to specify an existing
     * image ad to copy the image from, in which case the "image" field
     *                     can be left empty. This is the preferred way of
     * copying images
     *                     over re-uploading the same image.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored
     *                     when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setAdToCopyImageFrom(java.lang.Long adToCopyImageFrom) {
        this.adToCopyImageFrom = adToCopyImageFrom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageAd)) return false;
        ImageAd other = (ImageAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.adToCopyImageFrom==null && other.getAdToCopyImageFrom()==null) || 
             (this.adToCopyImageFrom!=null &&
              this.adToCopyImageFrom.equals(other.getAdToCopyImageFrom())));
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
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAdToCopyImageFrom() != null) {
            _hashCode += getAdToCopyImageFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ImageAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adToCopyImageFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adToCopyImageFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
