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
 * ShowcaseAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a Showcase shopping ad.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ShowcaseAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* The name label for this ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String name;

    /* Headline displayed in the Showcase shopping ad. */
    private java.lang.String headline;

    /* Description displayed in the expanded view of the Showcase
     * shopping ad. */
    private java.lang.String description;

    /* Image displayed in the collapsed view of the Showcase shopping
     * ad.
     *                     <p>The format of the image must be either JPEG
     * or PNG and the size of the image must be
     *                     270x270 px. */
    private com.google.api.ads.adwords.axis.v201802.cm.Image collapsedImage;

    /* Image displayed in the expanded view of the Showcase shopping
     * ad.
     *                     <p>The format of the image must be either JPEG
     * or PNG and the size of the image must be
     *                     1080x566 px.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Image expandedImage;

    public ShowcaseAd() {
    }

    public ShowcaseAd(
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
           java.lang.String name,
           java.lang.String headline,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201802.cm.Image collapsedImage,
           com.google.api.ads.adwords.axis.v201802.cm.Image expandedImage) {
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
        this.name = name;
        this.headline = headline;
        this.description = description;
        this.collapsedImage = collapsedImage;
        this.expandedImage = expandedImage;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("collapsedImage", getCollapsedImage())
            .add("description", getDescription())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("expandedImage", getExpandedImage())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("headline", getHeadline())
            .add("id", getId())
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
     * Gets the name value for this ShowcaseAd.
     * 
     * @return name   * The name label for this ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ShowcaseAd.
     * 
     * @param name   * The name label for this ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the headline value for this ShowcaseAd.
     * 
     * @return headline   * Headline displayed in the Showcase shopping ad.
     */
    public java.lang.String getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this ShowcaseAd.
     * 
     * @param headline   * Headline displayed in the Showcase shopping ad.
     */
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }


    /**
     * Gets the description value for this ShowcaseAd.
     * 
     * @return description   * Description displayed in the expanded view of the Showcase
     * shopping ad.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ShowcaseAd.
     * 
     * @param description   * Description displayed in the expanded view of the Showcase
     * shopping ad.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the collapsedImage value for this ShowcaseAd.
     * 
     * @return collapsedImage   * Image displayed in the collapsed view of the Showcase shopping
     * ad.
     *                     <p>The format of the image must be either JPEG
     * or PNG and the size of the image must be
     *                     270x270 px.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getCollapsedImage() {
        return collapsedImage;
    }


    /**
     * Sets the collapsedImage value for this ShowcaseAd.
     * 
     * @param collapsedImage   * Image displayed in the collapsed view of the Showcase shopping
     * ad.
     *                     <p>The format of the image must be either JPEG
     * or PNG and the size of the image must be
     *                     270x270 px.
     */
    public void setCollapsedImage(com.google.api.ads.adwords.axis.v201802.cm.Image collapsedImage) {
        this.collapsedImage = collapsedImage;
    }


    /**
     * Gets the expandedImage value for this ShowcaseAd.
     * 
     * @return expandedImage   * Image displayed in the expanded view of the Showcase shopping
     * ad.
     *                     <p>The format of the image must be either JPEG
     * or PNG and the size of the image must be
     *                     1080x566 px.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getExpandedImage() {
        return expandedImage;
    }


    /**
     * Sets the expandedImage value for this ShowcaseAd.
     * 
     * @param expandedImage   * Image displayed in the expanded view of the Showcase shopping
     * ad.
     *                     <p>The format of the image must be either JPEG
     * or PNG and the size of the image must be
     *                     1080x566 px.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setExpandedImage(com.google.api.ads.adwords.axis.v201802.cm.Image expandedImage) {
        this.expandedImage = expandedImage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowcaseAd)) return false;
        ShowcaseAd other = (ShowcaseAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.collapsedImage==null && other.getCollapsedImage()==null) || 
             (this.collapsedImage!=null &&
              this.collapsedImage.equals(other.getCollapsedImage()))) &&
            ((this.expandedImage==null && other.getExpandedImage()==null) || 
             (this.expandedImage!=null &&
              this.expandedImage.equals(other.getExpandedImage())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCollapsedImage() != null) {
            _hashCode += getCollapsedImage().hashCode();
        }
        if (getExpandedImage() != null) {
            _hashCode += getExpandedImage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowcaseAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShowcaseAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "headline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "collapsedImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "expandedImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
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
