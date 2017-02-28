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
 * AdUrlUpgrade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201702.cm;


/**
 * Represents an upgrade operation to upgrade Ad.url.
 */
public class AdUrlUpgrade  implements java.io.Serializable {
    /* ID of ad to upgrade.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adId;

    /* Final url of the ad. This is required for all Ad types, except
     * for DynamicSearchAd and
     *                 ProductAd. */
    private java.lang.String finalUrl;

    /* Mobile final url of the ad. This field is optional. */
    private java.lang.String finalMobileUrl;

    /* Tracking url template of the Ad. */
    private java.lang.String trackingUrlTemplate;

    public AdUrlUpgrade() {
    }

    public AdUrlUpgrade(
           java.lang.Long adId,
           java.lang.String finalUrl,
           java.lang.String finalMobileUrl,
           java.lang.String trackingUrlTemplate) {
           this.adId = adId;
           this.finalUrl = finalUrl;
           this.finalMobileUrl = finalMobileUrl;
           this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the adId value for this AdUrlUpgrade.
     * 
     * @return adId   * ID of ad to upgrade.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdId() {
        return adId;
    }


    /**
     * Sets the adId value for this AdUrlUpgrade.
     * 
     * @param adId   * ID of ad to upgrade.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdId(java.lang.Long adId) {
        this.adId = adId;
    }


    /**
     * Gets the finalUrl value for this AdUrlUpgrade.
     * 
     * @return finalUrl   * Final url of the ad. This is required for all Ad types, except
     * for DynamicSearchAd and
     *                 ProductAd.
     */
    public java.lang.String getFinalUrl() {
        return finalUrl;
    }


    /**
     * Sets the finalUrl value for this AdUrlUpgrade.
     * 
     * @param finalUrl   * Final url of the ad. This is required for all Ad types, except
     * for DynamicSearchAd and
     *                 ProductAd.
     */
    public void setFinalUrl(java.lang.String finalUrl) {
        this.finalUrl = finalUrl;
    }


    /**
     * Gets the finalMobileUrl value for this AdUrlUpgrade.
     * 
     * @return finalMobileUrl   * Mobile final url of the ad. This field is optional.
     */
    public java.lang.String getFinalMobileUrl() {
        return finalMobileUrl;
    }


    /**
     * Sets the finalMobileUrl value for this AdUrlUpgrade.
     * 
     * @param finalMobileUrl   * Mobile final url of the ad. This field is optional.
     */
    public void setFinalMobileUrl(java.lang.String finalMobileUrl) {
        this.finalMobileUrl = finalMobileUrl;
    }


    /**
     * Gets the trackingUrlTemplate value for this AdUrlUpgrade.
     * 
     * @return trackingUrlTemplate   * Tracking url template of the Ad.
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this AdUrlUpgrade.
     * 
     * @param trackingUrlTemplate   * Tracking url template of the Ad.
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdUrlUpgrade)) return false;
        AdUrlUpgrade other = (AdUrlUpgrade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adId==null && other.getAdId()==null) || 
             (this.adId!=null &&
              this.adId.equals(other.getAdId()))) &&
            ((this.finalUrl==null && other.getFinalUrl()==null) || 
             (this.finalUrl!=null &&
              this.finalUrl.equals(other.getFinalUrl()))) &&
            ((this.finalMobileUrl==null && other.getFinalMobileUrl()==null) || 
             (this.finalMobileUrl!=null &&
              this.finalMobileUrl.equals(other.getFinalMobileUrl()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) || 
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate())));
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
        if (getAdId() != null) {
            _hashCode += getAdId().hashCode();
        }
        if (getFinalUrl() != null) {
            _hashCode += getFinalUrl().hashCode();
        }
        if (getFinalMobileUrl() != null) {
            _hashCode += getFinalMobileUrl().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdUrlUpgrade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "AdUrlUpgrade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "adId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "finalUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "finalMobileUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "trackingUrlTemplate"));
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
