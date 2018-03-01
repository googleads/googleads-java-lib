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
 * ThirdPartyRedirectAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data associated with rich media extension attributes.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ThirdPartyRedirectAd  extends com.google.api.ads.adwords.axis.v201802.cm.RichMediaAd  implements java.io.Serializable {
    /* Defines whether or not the ad is cookie targeted.
     *                     (i.e. user list targeting, or the network's equivalent).
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.Boolean isCookieTargeted;

    /* Defines whether or not the ad is targeting user interest.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Boolean isUserInterestTargeted;

    /* Defines whether or not the ad contains a tracking pixel of
     * any kind.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Boolean isTagged;

    /* Video Types of the ad. (RealMedia, Quick Time etc.) */
    private com.google.api.ads.adwords.axis.v201802.cm.VideoType[] videoTypes;

    /* Allowed expanding directions. These directions are used to
     * match
     *                     publishers' ad slots. For example, if a slot allows
     * expansion toward the
     *                     right, only ads with EXPANDING_RIGHT specified
     * will show up there. */
    private com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAdExpandingDirection[] expandingDirections;

    public ThirdPartyRedirectAd() {
    }

    public ThirdPartyRedirectAd(
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
           com.google.api.ads.adwords.axis.v201802.cm.Dimensions dimensions,
           java.lang.String snippet,
           java.lang.String impressionBeaconUrl,
           java.lang.Integer adDuration,
           java.lang.Long certifiedVendorFormatId,
           java.lang.String sourceUrl,
           com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdRichMediaAdType richMediaAdType,
           com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute[] adAttributes,
           java.lang.Boolean isCookieTargeted,
           java.lang.Boolean isUserInterestTargeted,
           java.lang.Boolean isTagged,
           com.google.api.ads.adwords.axis.v201802.cm.VideoType[] videoTypes,
           com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAdExpandingDirection[] expandingDirections) {
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
            adType,
            name,
            dimensions,
            snippet,
            impressionBeaconUrl,
            adDuration,
            certifiedVendorFormatId,
            sourceUrl,
            richMediaAdType,
            adAttributes);
        this.isCookieTargeted = isCookieTargeted;
        this.isUserInterestTargeted = isUserInterestTargeted;
        this.isTagged = isTagged;
        this.videoTypes = videoTypes;
        this.expandingDirections = expandingDirections;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adAttributes", getAdAttributes())
            .add("adDuration", getAdDuration())
            .add("adType", getAdType())
            .add("automated", getAutomated())
            .add("certifiedVendorFormatId", getCertifiedVendorFormatId())
            .add("devicePreference", getDevicePreference())
            .add("dimensions", getDimensions())
            .add("displayUrl", getDisplayUrl())
            .add("expandingDirections", getExpandingDirections())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("id", getId())
            .add("impressionBeaconUrl", getImpressionBeaconUrl())
            .add("isCookieTargeted", getIsCookieTargeted())
            .add("isTagged", getIsTagged())
            .add("isUserInterestTargeted", getIsUserInterestTargeted())
            .add("name", getName())
            .add("richMediaAdType", getRichMediaAdType())
            .add("snippet", getSnippet())
            .add("sourceUrl", getSourceUrl())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .add("videoTypes", getVideoTypes())
            .toString();
    }

    /**
     * Gets the isCookieTargeted value for this ThirdPartyRedirectAd.
     * 
     * @return isCookieTargeted   * Defines whether or not the ad is cookie targeted.
     *                     (i.e. user list targeting, or the network's equivalent).
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.Boolean getIsCookieTargeted() {
        return isCookieTargeted;
    }


    /**
     * Sets the isCookieTargeted value for this ThirdPartyRedirectAd.
     * 
     * @param isCookieTargeted   * Defines whether or not the ad is cookie targeted.
     *                     (i.e. user list targeting, or the network's equivalent).
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setIsCookieTargeted(java.lang.Boolean isCookieTargeted) {
        this.isCookieTargeted = isCookieTargeted;
    }


    /**
     * Gets the isUserInterestTargeted value for this ThirdPartyRedirectAd.
     * 
     * @return isUserInterestTargeted   * Defines whether or not the ad is targeting user interest.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Boolean getIsUserInterestTargeted() {
        return isUserInterestTargeted;
    }


    /**
     * Sets the isUserInterestTargeted value for this ThirdPartyRedirectAd.
     * 
     * @param isUserInterestTargeted   * Defines whether or not the ad is targeting user interest.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setIsUserInterestTargeted(java.lang.Boolean isUserInterestTargeted) {
        this.isUserInterestTargeted = isUserInterestTargeted;
    }


    /**
     * Gets the isTagged value for this ThirdPartyRedirectAd.
     * 
     * @return isTagged   * Defines whether or not the ad contains a tracking pixel of
     * any kind.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Boolean getIsTagged() {
        return isTagged;
    }


    /**
     * Sets the isTagged value for this ThirdPartyRedirectAd.
     * 
     * @param isTagged   * Defines whether or not the ad contains a tracking pixel of
     * any kind.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setIsTagged(java.lang.Boolean isTagged) {
        this.isTagged = isTagged;
    }


    /**
     * Gets the videoTypes value for this ThirdPartyRedirectAd.
     * 
     * @return videoTypes   * Video Types of the ad. (RealMedia, Quick Time etc.)
     */
    public com.google.api.ads.adwords.axis.v201802.cm.VideoType[] getVideoTypes() {
        return videoTypes;
    }


    /**
     * Sets the videoTypes value for this ThirdPartyRedirectAd.
     * 
     * @param videoTypes   * Video Types of the ad. (RealMedia, Quick Time etc.)
     */
    public void setVideoTypes(com.google.api.ads.adwords.axis.v201802.cm.VideoType[] videoTypes) {
        this.videoTypes = videoTypes;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.VideoType getVideoTypes(int i) {
        return this.videoTypes[i];
    }

    public void setVideoTypes(int i, com.google.api.ads.adwords.axis.v201802.cm.VideoType _value) {
        this.videoTypes[i] = _value;
    }


    /**
     * Gets the expandingDirections value for this ThirdPartyRedirectAd.
     * 
     * @return expandingDirections   * Allowed expanding directions. These directions are used to
     * match
     *                     publishers' ad slots. For example, if a slot allows
     * expansion toward the
     *                     right, only ads with EXPANDING_RIGHT specified
     * will show up there.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAdExpandingDirection[] getExpandingDirections() {
        return expandingDirections;
    }


    /**
     * Sets the expandingDirections value for this ThirdPartyRedirectAd.
     * 
     * @param expandingDirections   * Allowed expanding directions. These directions are used to
     * match
     *                     publishers' ad slots. For example, if a slot allows
     * expansion toward the
     *                     right, only ads with EXPANDING_RIGHT specified
     * will show up there.
     */
    public void setExpandingDirections(com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAdExpandingDirection[] expandingDirections) {
        this.expandingDirections = expandingDirections;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAdExpandingDirection getExpandingDirections(int i) {
        return this.expandingDirections[i];
    }

    public void setExpandingDirections(int i, com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAdExpandingDirection _value) {
        this.expandingDirections[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyRedirectAd)) return false;
        ThirdPartyRedirectAd other = (ThirdPartyRedirectAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isCookieTargeted==null && other.getIsCookieTargeted()==null) || 
             (this.isCookieTargeted!=null &&
              this.isCookieTargeted.equals(other.getIsCookieTargeted()))) &&
            ((this.isUserInterestTargeted==null && other.getIsUserInterestTargeted()==null) || 
             (this.isUserInterestTargeted!=null &&
              this.isUserInterestTargeted.equals(other.getIsUserInterestTargeted()))) &&
            ((this.isTagged==null && other.getIsTagged()==null) || 
             (this.isTagged!=null &&
              this.isTagged.equals(other.getIsTagged()))) &&
            ((this.videoTypes==null && other.getVideoTypes()==null) || 
             (this.videoTypes!=null &&
              java.util.Arrays.equals(this.videoTypes, other.getVideoTypes()))) &&
            ((this.expandingDirections==null && other.getExpandingDirections()==null) || 
             (this.expandingDirections!=null &&
              java.util.Arrays.equals(this.expandingDirections, other.getExpandingDirections())));
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
        if (getIsCookieTargeted() != null) {
            _hashCode += getIsCookieTargeted().hashCode();
        }
        if (getIsUserInterestTargeted() != null) {
            _hashCode += getIsUserInterestTargeted().hashCode();
        }
        if (getIsTagged() != null) {
            _hashCode += getIsTagged().hashCode();
        }
        if (getVideoTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideoTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpandingDirections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpandingDirections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpandingDirections(), i);
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
        new org.apache.axis.description.TypeDesc(ThirdPartyRedirectAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ThirdPartyRedirectAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCookieTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isCookieTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUserInterestTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isUserInterestTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTagged");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isTagged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "videoTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VideoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandingDirections");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "expandingDirections"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ThirdPartyRedirectAd.ExpandingDirection"));
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
