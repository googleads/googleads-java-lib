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
 * DynamicSearchAdsSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Setting for controlling Dynamic Search Ads (DSA). Contains the
 * domain name and the language
 *             used by the DSA system to automatically generate landing
 * pages and keywords for a campaign.
 */
public class DynamicSearchAdsSetting  extends com.google.api.ads.adwords.axis.v201802.cm.Setting  implements java.io.Serializable {
    /* The Internet domain name that this setting represents. E.g.
     * "google.com" or "www.google.com".
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String domainName;

    /* A language code that indicates what language the contents of
     * the domain is in. E.g. "en"
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String languageCode;

    /* A toggle for the advertiser to decide if they want this campaign
     * to use the advertiser supplied
     *                     URLs only. */
    private java.lang.Boolean useSuppliedUrlsOnly;

    /* Page feeds associated with this campaign. */
    private com.google.api.ads.adwords.axis.v201802.cm.PageFeed pageFeed;

    public DynamicSearchAdsSetting() {
    }

    public DynamicSearchAdsSetting(
           java.lang.String settingType,
           java.lang.String domainName,
           java.lang.String languageCode,
           java.lang.Boolean useSuppliedUrlsOnly,
           com.google.api.ads.adwords.axis.v201802.cm.PageFeed pageFeed) {
        super(
            settingType);
        this.domainName = domainName;
        this.languageCode = languageCode;
        this.useSuppliedUrlsOnly = useSuppliedUrlsOnly;
        this.pageFeed = pageFeed;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("domainName", getDomainName())
            .add("languageCode", getLanguageCode())
            .add("pageFeed", getPageFeed())
            .add("settingType", getSettingType())
            .add("useSuppliedUrlsOnly", getUseSuppliedUrlsOnly())
            .toString();
    }

    /**
     * Gets the domainName value for this DynamicSearchAdsSetting.
     * 
     * @return domainName   * The Internet domain name that this setting represents. E.g.
     * "google.com" or "www.google.com".
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this DynamicSearchAdsSetting.
     * 
     * @param domainName   * The Internet domain name that this setting represents. E.g.
     * "google.com" or "www.google.com".
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the languageCode value for this DynamicSearchAdsSetting.
     * 
     * @return languageCode   * A language code that indicates what language the contents of
     * the domain is in. E.g. "en"
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this DynamicSearchAdsSetting.
     * 
     * @param languageCode   * A language code that indicates what language the contents of
     * the domain is in. E.g. "en"
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the useSuppliedUrlsOnly value for this DynamicSearchAdsSetting.
     * 
     * @return useSuppliedUrlsOnly   * A toggle for the advertiser to decide if they want this campaign
     * to use the advertiser supplied
     *                     URLs only.
     */
    public java.lang.Boolean getUseSuppliedUrlsOnly() {
        return useSuppliedUrlsOnly;
    }


    /**
     * Sets the useSuppliedUrlsOnly value for this DynamicSearchAdsSetting.
     * 
     * @param useSuppliedUrlsOnly   * A toggle for the advertiser to decide if they want this campaign
     * to use the advertiser supplied
     *                     URLs only.
     */
    public void setUseSuppliedUrlsOnly(java.lang.Boolean useSuppliedUrlsOnly) {
        this.useSuppliedUrlsOnly = useSuppliedUrlsOnly;
    }


    /**
     * Gets the pageFeed value for this DynamicSearchAdsSetting.
     * 
     * @return pageFeed   * Page feeds associated with this campaign.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PageFeed getPageFeed() {
        return pageFeed;
    }


    /**
     * Sets the pageFeed value for this DynamicSearchAdsSetting.
     * 
     * @param pageFeed   * Page feeds associated with this campaign.
     */
    public void setPageFeed(com.google.api.ads.adwords.axis.v201802.cm.PageFeed pageFeed) {
        this.pageFeed = pageFeed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicSearchAdsSetting)) return false;
        DynamicSearchAdsSetting other = (DynamicSearchAdsSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.useSuppliedUrlsOnly==null && other.getUseSuppliedUrlsOnly()==null) || 
             (this.useSuppliedUrlsOnly!=null &&
              this.useSuppliedUrlsOnly.equals(other.getUseSuppliedUrlsOnly()))) &&
            ((this.pageFeed==null && other.getPageFeed()==null) || 
             (this.pageFeed!=null &&
              this.pageFeed.equals(other.getPageFeed())));
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
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getUseSuppliedUrlsOnly() != null) {
            _hashCode += getUseSuppliedUrlsOnly().hashCode();
        }
        if (getPageFeed() != null) {
            _hashCode += getPageFeed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DynamicSearchAdsSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DynamicSearchAdsSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "languageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSuppliedUrlsOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "useSuppliedUrlsOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "pageFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PageFeed"));
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
