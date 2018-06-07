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
 * ResponsiveSearchAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;


/**
 * Represents a responsive search ad
 *             
 *             <p class="caution"><b>Caution:</b> Responsive search ads
 * do not use {@link #url url}, {@link
 *             #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls},
 * or {@link #devicePreference
 *             devicePreference}; setting these fields on a responsive
 * search ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ResponsiveSearchAd  extends com.google.api.ads.adwords.axis.v201806.cm.Ad  implements java.io.Serializable {
    /* Headlines. When the Ad serves, the headlines will be selected
     * from this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdHeadlines".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] headlines;

    /* Descriptions. When the Ad serves, the descriptions will be
     * selected from this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] descriptions;

    /* Text that appears in the ad with the displayed URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdPath1".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String path1;

    /* In addition to {@link #path1}, more text that appears with
     * the displayed URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdPath2".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String path2;

    public ResponsiveSearchAd() {
    }

    public ResponsiveSearchAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201806.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           com.google.api.ads.adwords.axis.v201806.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201806.cm.UrlData[] urlData,
           java.lang.Boolean automated,
           com.google.api.ads.adwords.axis.v201806.cm.AdType type,
           java.lang.Long devicePreference,
           com.google.api.ads.adwords.axis.v201806.cm.SystemManagedEntitySource systemManagedEntitySource,
           java.lang.String adType,
           com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] headlines,
           com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] descriptions,
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
        this.headlines = headlines;
        this.descriptions = descriptions;
        this.path1 = path1;
        this.path2 = path2;
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
     * Gets the headlines value for this ResponsiveSearchAd.
     * 
     * @return headlines   * Headlines. When the Ad serves, the headlines will be selected
     * from this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdHeadlines".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] getHeadlines() {
        return headlines;
    }


    /**
     * Sets the headlines value for this ResponsiveSearchAd.
     * 
     * @param headlines   * Headlines. When the Ad serves, the headlines will be selected
     * from this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdHeadlines".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setHeadlines(com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] headlines) {
        this.headlines = headlines;
    }

    public com.google.api.ads.adwords.axis.v201806.cm.AssetLink getHeadlines(int i) {
        return this.headlines[i];
    }

    public void setHeadlines(int i, com.google.api.ads.adwords.axis.v201806.cm.AssetLink _value) {
        this.headlines[i] = _value;
    }


    /**
     * Gets the descriptions value for this ResponsiveSearchAd.
     * 
     * @return descriptions   * Descriptions. When the Ad serves, the descriptions will be
     * selected from this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] getDescriptions() {
        return descriptions;
    }


    /**
     * Sets the descriptions value for this ResponsiveSearchAd.
     * 
     * @param descriptions   * Descriptions. When the Ad serves, the descriptions will be
     * selected from this list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setDescriptions(com.google.api.ads.adwords.axis.v201806.cm.AssetLink[] descriptions) {
        this.descriptions = descriptions;
    }

    public com.google.api.ads.adwords.axis.v201806.cm.AssetLink getDescriptions(int i) {
        return this.descriptions[i];
    }

    public void setDescriptions(int i, com.google.api.ads.adwords.axis.v201806.cm.AssetLink _value) {
        this.descriptions[i] = _value;
    }


    /**
     * Gets the path1 value for this ResponsiveSearchAd.
     * 
     * @return path1   * Text that appears in the ad with the displayed URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdPath1".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getPath1() {
        return path1;
    }


    /**
     * Sets the path1 value for this ResponsiveSearchAd.
     * 
     * @param path1   * Text that appears in the ad with the displayed URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdPath1".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setPath1(java.lang.String path1) {
        this.path1 = path1;
    }


    /**
     * Gets the path2 value for this ResponsiveSearchAd.
     * 
     * @return path2   * In addition to {@link #path1}, more text that appears with
     * the displayed URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdPath2".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getPath2() {
        return path2;
    }


    /**
     * Sets the path2 value for this ResponsiveSearchAd.
     * 
     * @param path2   * In addition to {@link #path1}, more text that appears with
     * the displayed URL.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ResponsiveSearchAdPath2".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setPath2(java.lang.String path2) {
        this.path2 = path2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponsiveSearchAd)) return false;
        ResponsiveSearchAd other = (ResponsiveSearchAd) obj;
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
        new org.apache.axis.description.TypeDesc(ResponsiveSearchAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "ResponsiveSearchAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headlines");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "headlines"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "descriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "path1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "path2"));
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
