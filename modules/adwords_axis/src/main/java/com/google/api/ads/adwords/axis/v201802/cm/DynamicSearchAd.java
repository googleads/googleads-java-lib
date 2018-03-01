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
 * DynamicSearchAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a dynamic search ad. This ad will have its headline
 * and final URL auto-generated at
 *             serving time according to domain name specific information
 * provided by DynamicSearchAdsSetting at
 *             the campaign level.
 *             
 *             <p>Auto-generated fields: headline and final URL.</p>
 *             
 *             <p>Note: we recommend using the ExpandedDynamicSearchAd
 * type, introduced in v201705, rather than
 *             the DynamicSearchAd type.</p>
 *             
 *             <p><b>Required fields:</b> {@code description1}, {@code
 * description2}, {@code displayUrl}.</p>
 *             
 *             <p>The tracking URL field must contain at least one of
 * the following placeholder tags
 *             (URL parameters):</p>
 *             <ul>
 *             <li>{unescapedlpurl}</li>
 *             <li>{escapedlpurl}</li>
 *             <li>{lpurl}</li>
 *             <li>{lpurl+2}</li>
 *             <li>{lpurl+3}</li>
 *             </ul>
 *             
 *             <ul>
 *             <li>{unescapedlpurl} will be replaced with the full landing
 * page URL of the displayed ad.
 *             Extra query parameters can be added to the end, e.g.:
 * "{unescapedlpurl}?lang=en".</li>
 *             
 *             <li>{escapedlpurl} will be replaced with the URL-encoded
 * version of the full
 *             landing page URL. This makes it suitable for use as a
 * query parameter
 *             value (e.g.: "http://www.3rdpartytracker.com/?lp={escapedlpurl}")
 * but
 *             not at the beginning of the URL field.</li>
 *             
 *             <li>{lpurl} encodes the "?" and "=" of the landing page
 * URL making it suitable
 *             for use as a query parameter. If found at the beginning
 * of the URL field, it is
 *             replaced by the {unescapedlpurl} value.
 *             E.g.: "http://tracking.com/redir.php?tracking=xyz&url={lpurl}".</li>
 * 
 *             <li>{lpurl+2} and {lpurl+3}  will be replaced with the
 * landing page URL escaped two or three
 *             times, respectively.  This makes it suitable if there
 * is a chain of redirects in the tracking
 *             URL.</li>
 *             </ul>
 *             
 *             <p class="note">Note that {@code finalUrls} and {@code
 * finalMobileUrls}
 *             cannot be set for dynamic search ads.</p>
 *             
 *             <p>For more information, see the article
 *             <a href="//support.google.com/adwords/answer/2549100">Using
 * dynamic tracking URLs</a>.
 *             </p>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class DynamicSearchAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* The first description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description1".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String description1;

    /* The second description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description2".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String description2;

    public DynamicSearchAd() {
    }

    public DynamicSearchAd(
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
           java.lang.String description1,
           java.lang.String description2) {
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
        this.description1 = description1;
        this.description2 = description2;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("description1", getDescription1())
            .add("description2", getDescription2())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("id", getId())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the description1 value for this DynamicSearchAd.
     * 
     * @return description1   * The first description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description1".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this DynamicSearchAd.
     * 
     * @param description1   * The first description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description1".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this DynamicSearchAd.
     * 
     * @return description2   * The second description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description2".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this DynamicSearchAd.
     * 
     * @param description2   * The second description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description2".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicSearchAd)) return false;
        DynamicSearchAd other = (DynamicSearchAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2())));
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
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DynamicSearchAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DynamicSearchAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description2"));
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
