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
 * ExpandedDynamicSearchAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an ExpandedDynamicSearchAd. This ad will have its headline,
 * final URLs and display URL
 *             auto-generated at serving time according to domain name
 * specific information provided by
 *             DynamicSearchAdsSetting linked at the campaign level.
 *             
 *             <p>Auto-generated fields: headline, final URLs and display
 * URL.</p>
 *             
 *             <p><b>Required fields:</b> {@code description}.</p>
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
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ExpandedDynamicSearchAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* The descriptive text of the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String description;

    public ExpandedDynamicSearchAd() {
    }

    public ExpandedDynamicSearchAd(
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
           java.lang.String description) {
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
        this.description = description;
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
     * Gets the description value for this ExpandedDynamicSearchAd.
     * 
     * @return description   * The descriptive text of the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExpandedDynamicSearchAd.
     * 
     * @param description   * The descriptive text of the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpandedDynamicSearchAd)) return false;
        ExpandedDynamicSearchAd other = (ExpandedDynamicSearchAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpandedDynamicSearchAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExpandedDynamicSearchAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description"));
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
