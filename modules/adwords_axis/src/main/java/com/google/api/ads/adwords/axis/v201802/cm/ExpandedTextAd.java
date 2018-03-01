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
 * ExpandedTextAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Enhanced text ad format.
 *             
 *             <p class="caution"><b>Caution:</b> Expanded text ads do
 * not use {@link #url url},
 *             {@link #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls},
 * or
 *             {@link #devicePreference devicePreference};
 *             setting these fields on an expanded text ad will cause
 * an error.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ExpandedTextAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* First part of the headline.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String headlinePart1;

    /* Second part of the headline.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String headlinePart2;

    /* The descriptive text of the ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String description;

    /* Text that appears in the ad with the displayed URL. */
    private java.lang.String path1;

    /* In addition to {@link #path1}, more text that appears with
     * the displayed URL. */
    private java.lang.String path2;

    public ExpandedTextAd() {
    }

    public ExpandedTextAd(
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
           java.lang.String headlinePart1,
           java.lang.String headlinePart2,
           java.lang.String description,
           java.lang.String path1,
           java.lang.String path2) {
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
        this.headlinePart1 = headlinePart1;
        this.headlinePart2 = headlinePart2;
        this.description = description;
        this.path1 = path1;
        this.path2 = path2;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("description", getDescription())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("headlinePart1", getHeadlinePart1())
            .add("headlinePart2", getHeadlinePart2())
            .add("id", getId())
            .add("path1", getPath1())
            .add("path2", getPath2())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the headlinePart1 value for this ExpandedTextAd.
     * 
     * @return headlinePart1   * First part of the headline.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getHeadlinePart1() {
        return headlinePart1;
    }


    /**
     * Sets the headlinePart1 value for this ExpandedTextAd.
     * 
     * @param headlinePart1   * First part of the headline.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setHeadlinePart1(java.lang.String headlinePart1) {
        this.headlinePart1 = headlinePart1;
    }


    /**
     * Gets the headlinePart2 value for this ExpandedTextAd.
     * 
     * @return headlinePart2   * Second part of the headline.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getHeadlinePart2() {
        return headlinePart2;
    }


    /**
     * Sets the headlinePart2 value for this ExpandedTextAd.
     * 
     * @param headlinePart2   * Second part of the headline.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setHeadlinePart2(java.lang.String headlinePart2) {
        this.headlinePart2 = headlinePart2;
    }


    /**
     * Gets the description value for this ExpandedTextAd.
     * 
     * @return description   * The descriptive text of the ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExpandedTextAd.
     * 
     * @param description   * The descriptive text of the ad.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the path1 value for this ExpandedTextAd.
     * 
     * @return path1   * Text that appears in the ad with the displayed URL.
     */
    public java.lang.String getPath1() {
        return path1;
    }


    /**
     * Sets the path1 value for this ExpandedTextAd.
     * 
     * @param path1   * Text that appears in the ad with the displayed URL.
     */
    public void setPath1(java.lang.String path1) {
        this.path1 = path1;
    }


    /**
     * Gets the path2 value for this ExpandedTextAd.
     * 
     * @return path2   * In addition to {@link #path1}, more text that appears with
     * the displayed URL.
     */
    public java.lang.String getPath2() {
        return path2;
    }


    /**
     * Sets the path2 value for this ExpandedTextAd.
     * 
     * @param path2   * In addition to {@link #path1}, more text that appears with
     * the displayed URL.
     */
    public void setPath2(java.lang.String path2) {
        this.path2 = path2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpandedTextAd)) return false;
        ExpandedTextAd other = (ExpandedTextAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.headlinePart1==null && other.getHeadlinePart1()==null) || 
             (this.headlinePart1!=null &&
              this.headlinePart1.equals(other.getHeadlinePart1()))) &&
            ((this.headlinePart2==null && other.getHeadlinePart2()==null) || 
             (this.headlinePart2!=null &&
              this.headlinePart2.equals(other.getHeadlinePart2()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.path1==null && other.getPath1()==null) || 
             (this.path1!=null &&
              this.path1.equals(other.getPath1()))) &&
            ((this.path2==null && other.getPath2()==null) || 
             (this.path2!=null &&
              this.path2.equals(other.getPath2())));
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
        if (getHeadlinePart1() != null) {
            _hashCode += getHeadlinePart1().hashCode();
        }
        if (getHeadlinePart2() != null) {
            _hashCode += getHeadlinePart2().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPath1() != null) {
            _hashCode += getPath1().hashCode();
        }
        if (getPath2() != null) {
            _hashCode += getPath2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpandedTextAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExpandedTextAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headlinePart1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "headlinePart1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headlinePart2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "headlinePart2"));
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
        elemField.setFieldName("path1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "path1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "path2"));
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
