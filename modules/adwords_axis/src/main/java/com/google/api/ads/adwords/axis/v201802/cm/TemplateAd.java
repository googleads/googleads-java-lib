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
 * TemplateAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a <a href=
 *             "//www.google.com/adwords/displaynetwork/plan-creative-campaigns/display-ad-builder.html"
 * >Display Ad Builder</a> template ad. A template ad is
 *             composed of a template (specified by its ID) and the data
 * that populates
 *             the template's fields. For a list of available templates
 * and their required
 *             fields, see <a href="/adwords/api/docs/appendix/templateads">Template
 * Ads</a>.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class TemplateAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* ID of the template to use. */
    private java.lang.Long templateId;

    /* Group ID of all template ads, which should be created together.
     * Template ads in the same union reference the same data but have different
     * dimensions. Single ads do not have a union ID. If a template ad specifies
     * an ad union with only one ad, no union will be created. */
    private com.google.api.ads.adwords.axis.v201802.cm.AdUnionId adUnionId;

    /* List of elements (each containing a set of fields) for the
     * template
     *                     referenced by {@code templateId}. See
     *                     <a href="/adwords/api/docs/appendix/templateads">Template
     * Ads</a> for the elements and fields required for each template. */
    private com.google.api.ads.adwords.axis.v201802.cm.TemplateElement[] templateElements;

    /* The template ad rendered as an image. */
    private com.google.api.ads.adwords.axis.v201802.cm.Image adAsImage;

    /* The dimensions for this ad. */
    private com.google.api.ads.adwords.axis.v201802.cm.Dimensions dimensions;

    /* Name of this ad.
     *                     <span class="constraint Required">
     *                     This field is required and should not be {@code
     * null}.</span> */
    private java.lang.String name;

    /* Duration of this ad (if it contains playable media).
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Integer duration;

    /* For copies, the ad id of the ad this was or should be copied
     * from. */
    private java.lang.Long originAdId;

    public TemplateAd() {
    }

    public TemplateAd(
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
           java.lang.Long templateId,
           com.google.api.ads.adwords.axis.v201802.cm.AdUnionId adUnionId,
           com.google.api.ads.adwords.axis.v201802.cm.TemplateElement[] templateElements,
           com.google.api.ads.adwords.axis.v201802.cm.Image adAsImage,
           com.google.api.ads.adwords.axis.v201802.cm.Dimensions dimensions,
           java.lang.String name,
           java.lang.Integer duration,
           java.lang.Long originAdId) {
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
        this.templateId = templateId;
        this.adUnionId = adUnionId;
        this.templateElements = templateElements;
        this.adAsImage = adAsImage;
        this.dimensions = dimensions;
        this.name = name;
        this.duration = duration;
        this.originAdId = originAdId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adAsImage", getAdAsImage())
            .add("adType", getAdType())
            .add("adUnionId", getAdUnionId())
            .add("automated", getAutomated())
            .add("devicePreference", getDevicePreference())
            .add("dimensions", getDimensions())
            .add("displayUrl", getDisplayUrl())
            .add("duration", getDuration())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("id", getId())
            .add("name", getName())
            .add("originAdId", getOriginAdId())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("templateElements", getTemplateElements())
            .add("templateId", getTemplateId())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the templateId value for this TemplateAd.
     * 
     * @return templateId   * ID of the template to use.
     */
    public java.lang.Long getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this TemplateAd.
     * 
     * @param templateId   * ID of the template to use.
     */
    public void setTemplateId(java.lang.Long templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the adUnionId value for this TemplateAd.
     * 
     * @return adUnionId   * Group ID of all template ads, which should be created together.
     * Template ads in the same union reference the same data but have different
     * dimensions. Single ads do not have a union ID. If a template ad specifies
     * an ad union with only one ad, no union will be created.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdUnionId getAdUnionId() {
        return adUnionId;
    }


    /**
     * Sets the adUnionId value for this TemplateAd.
     * 
     * @param adUnionId   * Group ID of all template ads, which should be created together.
     * Template ads in the same union reference the same data but have different
     * dimensions. Single ads do not have a union ID. If a template ad specifies
     * an ad union with only one ad, no union will be created.
     */
    public void setAdUnionId(com.google.api.ads.adwords.axis.v201802.cm.AdUnionId adUnionId) {
        this.adUnionId = adUnionId;
    }


    /**
     * Gets the templateElements value for this TemplateAd.
     * 
     * @return templateElements   * List of elements (each containing a set of fields) for the
     * template
     *                     referenced by {@code templateId}. See
     *                     <a href="/adwords/api/docs/appendix/templateads">Template
     * Ads</a> for the elements and fields required for each template.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TemplateElement[] getTemplateElements() {
        return templateElements;
    }


    /**
     * Sets the templateElements value for this TemplateAd.
     * 
     * @param templateElements   * List of elements (each containing a set of fields) for the
     * template
     *                     referenced by {@code templateId}. See
     *                     <a href="/adwords/api/docs/appendix/templateads">Template
     * Ads</a> for the elements and fields required for each template.
     */
    public void setTemplateElements(com.google.api.ads.adwords.axis.v201802.cm.TemplateElement[] templateElements) {
        this.templateElements = templateElements;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.TemplateElement getTemplateElements(int i) {
        return this.templateElements[i];
    }

    public void setTemplateElements(int i, com.google.api.ads.adwords.axis.v201802.cm.TemplateElement _value) {
        this.templateElements[i] = _value;
    }


    /**
     * Gets the adAsImage value for this TemplateAd.
     * 
     * @return adAsImage   * The template ad rendered as an image.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getAdAsImage() {
        return adAsImage;
    }


    /**
     * Sets the adAsImage value for this TemplateAd.
     * 
     * @param adAsImage   * The template ad rendered as an image.
     */
    public void setAdAsImage(com.google.api.ads.adwords.axis.v201802.cm.Image adAsImage) {
        this.adAsImage = adAsImage;
    }


    /**
     * Gets the dimensions value for this TemplateAd.
     * 
     * @return dimensions   * The dimensions for this ad.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Dimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this TemplateAd.
     * 
     * @param dimensions   * The dimensions for this ad.
     */
    public void setDimensions(com.google.api.ads.adwords.axis.v201802.cm.Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the name value for this TemplateAd.
     * 
     * @return name   * Name of this ad.
     *                     <span class="constraint Required">
     *                     This field is required and should not be {@code
     * null}.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TemplateAd.
     * 
     * @param name   * Name of this ad.
     *                     <span class="constraint Required">
     *                     This field is required and should not be {@code
     * null}.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the duration value for this TemplateAd.
     * 
     * @return duration   * Duration of this ad (if it contains playable media).
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TemplateAd.
     * 
     * @param duration   * Duration of this ad (if it contains playable media).
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the originAdId value for this TemplateAd.
     * 
     * @return originAdId   * For copies, the ad id of the ad this was or should be copied
     * from.
     */
    public java.lang.Long getOriginAdId() {
        return originAdId;
    }


    /**
     * Sets the originAdId value for this TemplateAd.
     * 
     * @param originAdId   * For copies, the ad id of the ad this was or should be copied
     * from.
     */
    public void setOriginAdId(java.lang.Long originAdId) {
        this.originAdId = originAdId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateAd)) return false;
        TemplateAd other = (TemplateAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
            ((this.adUnionId==null && other.getAdUnionId()==null) || 
             (this.adUnionId!=null &&
              this.adUnionId.equals(other.getAdUnionId()))) &&
            ((this.templateElements==null && other.getTemplateElements()==null) || 
             (this.templateElements!=null &&
              java.util.Arrays.equals(this.templateElements, other.getTemplateElements()))) &&
            ((this.adAsImage==null && other.getAdAsImage()==null) || 
             (this.adAsImage!=null &&
              this.adAsImage.equals(other.getAdAsImage()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.originAdId==null && other.getOriginAdId()==null) || 
             (this.originAdId!=null &&
              this.originAdId.equals(other.getOriginAdId())));
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
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        if (getAdUnionId() != null) {
            _hashCode += getAdUnionId().hashCode();
        }
        if (getTemplateElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplateElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdAsImage() != null) {
            _hashCode += getAdAsImage().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getOriginAdId() != null) {
            _hashCode += getOriginAdId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "templateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adUnionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdUnionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateElements");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "templateElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adAsImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adAsImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Dimensions"));
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
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originAdId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "originAdId"));
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
