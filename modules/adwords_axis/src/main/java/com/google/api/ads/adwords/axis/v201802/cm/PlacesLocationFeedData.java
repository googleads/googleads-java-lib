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
 * PlacesLocationFeedData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data used to configure a location feed populated from
 *             Google My Business Locations.
 */
public class PlacesLocationFeedData  extends com.google.api.ads.adwords.axis.v201802.cm.SystemFeedGenerationData  implements java.io.Serializable {
    /* Required authentication token (from OAuth API) for the email.</br>
     * Use the following values when populating the oAuthInfo:
     *                     <ul>
     *                     <li>httpMethod: {@code GET}</li>
     *                     <li>httpRequestUrl: {@code https://www.googleapis.com/auth/adwords}</li>
     * <li>
     *                     httpAuthorizationHeader: {@code Bearer *ACCESS_TOKEN*}
     * (where *ACCESS_TOKEN* is generated from OAuth credentials for the
     *                     emailAddress and a scope matching httpRequestUrl)
     * </li>
     *                     </ul> */
    private com.google.api.ads.adwords.axis.v201802.cm.OAuthInfo oAuthInfo;

    /* Email address of a Google My Business account or email address
     * of a manager of the
     *                     Google My Business account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String emailAddress;

    /* Plus page ID of the managed business whose locations should
     * be used. If this field is not set,
     *                     then all businesses accessible by the user (specified
     * by the emailAddress) are used. */
    private java.lang.String businessAccountIdentifier;

    /* Used to filter Google My Business listings by business name.
     * If businessNameFilter is set,
     *                     only listings with a matching business name are
     * candidates to be sync'd into FeedItems. */
    private java.lang.String businessNameFilter;

    /* Used to filter Google My Business listings by categories. If
     * entries exist in categoryFilters,
     *                     only listings that belong to any of the categories
     * are candidates to be sync'd into FeedItems.
     *                     If no entries exist in categoryFilters, then all
     * listings are candidates for syncing. */
    private java.lang.String[] categoryFilters;

    /* Used to filter <a href="http://www.google.com/mybusiness">Google
     * My Business</a> listings by
     *                     labels. If entries exist in labelFilters, only
     * listings that has any of the labels set are
     *                     candidates to be synchronized into FeedItems.
     * If no entries exist in labelFilters, then all
     *                     listings are candidates for syncing. */
    private java.lang.String[] labelFilters;

    public PlacesLocationFeedData() {
    }

    public PlacesLocationFeedData(
           java.lang.String systemFeedGenerationDataType,
           com.google.api.ads.adwords.axis.v201802.cm.OAuthInfo oAuthInfo,
           java.lang.String emailAddress,
           java.lang.String businessAccountIdentifier,
           java.lang.String businessNameFilter,
           java.lang.String[] categoryFilters,
           java.lang.String[] labelFilters) {
        super(
            systemFeedGenerationDataType);
        this.oAuthInfo = oAuthInfo;
        this.emailAddress = emailAddress;
        this.businessAccountIdentifier = businessAccountIdentifier;
        this.businessNameFilter = businessNameFilter;
        this.categoryFilters = categoryFilters;
        this.labelFilters = labelFilters;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("businessAccountIdentifier", getBusinessAccountIdentifier())
            .add("businessNameFilter", getBusinessNameFilter())
            .add("categoryFilters", getCategoryFilters())
            .add("emailAddress", getEmailAddress())
            .add("labelFilters", getLabelFilters())
            .add("oAuthInfo", getOAuthInfo())
            .add("systemFeedGenerationDataType", getSystemFeedGenerationDataType())
            .toString();
    }

    /**
     * Gets the oAuthInfo value for this PlacesLocationFeedData.
     * 
     * @return oAuthInfo   * Required authentication token (from OAuth API) for the email.</br>
     * Use the following values when populating the oAuthInfo:
     *                     <ul>
     *                     <li>httpMethod: {@code GET}</li>
     *                     <li>httpRequestUrl: {@code https://www.googleapis.com/auth/adwords}</li>
     * <li>
     *                     httpAuthorizationHeader: {@code Bearer *ACCESS_TOKEN*}
     * (where *ACCESS_TOKEN* is generated from OAuth credentials for the
     *                     emailAddress and a scope matching httpRequestUrl)
     * </li>
     *                     </ul>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.OAuthInfo getOAuthInfo() {
        return oAuthInfo;
    }


    /**
     * Sets the oAuthInfo value for this PlacesLocationFeedData.
     * 
     * @param oAuthInfo   * Required authentication token (from OAuth API) for the email.</br>
     * Use the following values when populating the oAuthInfo:
     *                     <ul>
     *                     <li>httpMethod: {@code GET}</li>
     *                     <li>httpRequestUrl: {@code https://www.googleapis.com/auth/adwords}</li>
     * <li>
     *                     httpAuthorizationHeader: {@code Bearer *ACCESS_TOKEN*}
     * (where *ACCESS_TOKEN* is generated from OAuth credentials for the
     *                     emailAddress and a scope matching httpRequestUrl)
     * </li>
     *                     </ul>
     */
    public void setOAuthInfo(com.google.api.ads.adwords.axis.v201802.cm.OAuthInfo oAuthInfo) {
        this.oAuthInfo = oAuthInfo;
    }


    /**
     * Gets the emailAddress value for this PlacesLocationFeedData.
     * 
     * @return emailAddress   * Email address of a Google My Business account or email address
     * of a manager of the
     *                     Google My Business account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this PlacesLocationFeedData.
     * 
     * @param emailAddress   * Email address of a Google My Business account or email address
     * of a manager of the
     *                     Google My Business account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the businessAccountIdentifier value for this PlacesLocationFeedData.
     * 
     * @return businessAccountIdentifier   * Plus page ID of the managed business whose locations should
     * be used. If this field is not set,
     *                     then all businesses accessible by the user (specified
     * by the emailAddress) are used.
     */
    public java.lang.String getBusinessAccountIdentifier() {
        return businessAccountIdentifier;
    }


    /**
     * Sets the businessAccountIdentifier value for this PlacesLocationFeedData.
     * 
     * @param businessAccountIdentifier   * Plus page ID of the managed business whose locations should
     * be used. If this field is not set,
     *                     then all businesses accessible by the user (specified
     * by the emailAddress) are used.
     */
    public void setBusinessAccountIdentifier(java.lang.String businessAccountIdentifier) {
        this.businessAccountIdentifier = businessAccountIdentifier;
    }


    /**
     * Gets the businessNameFilter value for this PlacesLocationFeedData.
     * 
     * @return businessNameFilter   * Used to filter Google My Business listings by business name.
     * If businessNameFilter is set,
     *                     only listings with a matching business name are
     * candidates to be sync'd into FeedItems.
     */
    public java.lang.String getBusinessNameFilter() {
        return businessNameFilter;
    }


    /**
     * Sets the businessNameFilter value for this PlacesLocationFeedData.
     * 
     * @param businessNameFilter   * Used to filter Google My Business listings by business name.
     * If businessNameFilter is set,
     *                     only listings with a matching business name are
     * candidates to be sync'd into FeedItems.
     */
    public void setBusinessNameFilter(java.lang.String businessNameFilter) {
        this.businessNameFilter = businessNameFilter;
    }


    /**
     * Gets the categoryFilters value for this PlacesLocationFeedData.
     * 
     * @return categoryFilters   * Used to filter Google My Business listings by categories. If
     * entries exist in categoryFilters,
     *                     only listings that belong to any of the categories
     * are candidates to be sync'd into FeedItems.
     *                     If no entries exist in categoryFilters, then all
     * listings are candidates for syncing.
     */
    public java.lang.String[] getCategoryFilters() {
        return categoryFilters;
    }


    /**
     * Sets the categoryFilters value for this PlacesLocationFeedData.
     * 
     * @param categoryFilters   * Used to filter Google My Business listings by categories. If
     * entries exist in categoryFilters,
     *                     only listings that belong to any of the categories
     * are candidates to be sync'd into FeedItems.
     *                     If no entries exist in categoryFilters, then all
     * listings are candidates for syncing.
     */
    public void setCategoryFilters(java.lang.String[] categoryFilters) {
        this.categoryFilters = categoryFilters;
    }

    public java.lang.String getCategoryFilters(int i) {
        return this.categoryFilters[i];
    }

    public void setCategoryFilters(int i, java.lang.String _value) {
        this.categoryFilters[i] = _value;
    }


    /**
     * Gets the labelFilters value for this PlacesLocationFeedData.
     * 
     * @return labelFilters   * Used to filter <a href="http://www.google.com/mybusiness">Google
     * My Business</a> listings by
     *                     labels. If entries exist in labelFilters, only
     * listings that has any of the labels set are
     *                     candidates to be synchronized into FeedItems.
     * If no entries exist in labelFilters, then all
     *                     listings are candidates for syncing.
     */
    public java.lang.String[] getLabelFilters() {
        return labelFilters;
    }


    /**
     * Sets the labelFilters value for this PlacesLocationFeedData.
     * 
     * @param labelFilters   * Used to filter <a href="http://www.google.com/mybusiness">Google
     * My Business</a> listings by
     *                     labels. If entries exist in labelFilters, only
     * listings that has any of the labels set are
     *                     candidates to be synchronized into FeedItems.
     * If no entries exist in labelFilters, then all
     *                     listings are candidates for syncing.
     */
    public void setLabelFilters(java.lang.String[] labelFilters) {
        this.labelFilters = labelFilters;
    }

    public java.lang.String getLabelFilters(int i) {
        return this.labelFilters[i];
    }

    public void setLabelFilters(int i, java.lang.String _value) {
        this.labelFilters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacesLocationFeedData)) return false;
        PlacesLocationFeedData other = (PlacesLocationFeedData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oAuthInfo==null && other.getOAuthInfo()==null) || 
             (this.oAuthInfo!=null &&
              this.oAuthInfo.equals(other.getOAuthInfo()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.businessAccountIdentifier==null && other.getBusinessAccountIdentifier()==null) || 
             (this.businessAccountIdentifier!=null &&
              this.businessAccountIdentifier.equals(other.getBusinessAccountIdentifier()))) &&
            ((this.businessNameFilter==null && other.getBusinessNameFilter()==null) || 
             (this.businessNameFilter!=null &&
              this.businessNameFilter.equals(other.getBusinessNameFilter()))) &&
            ((this.categoryFilters==null && other.getCategoryFilters()==null) || 
             (this.categoryFilters!=null &&
              java.util.Arrays.equals(this.categoryFilters, other.getCategoryFilters()))) &&
            ((this.labelFilters==null && other.getLabelFilters()==null) || 
             (this.labelFilters!=null &&
              java.util.Arrays.equals(this.labelFilters, other.getLabelFilters())));
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
        if (getOAuthInfo() != null) {
            _hashCode += getOAuthInfo().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getBusinessAccountIdentifier() != null) {
            _hashCode += getBusinessAccountIdentifier().hashCode();
        }
        if (getBusinessNameFilter() != null) {
            _hashCode += getBusinessNameFilter().hashCode();
        }
        if (getCategoryFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabelFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabelFilters(), i);
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
        new org.apache.axis.description.TypeDesc(PlacesLocationFeedData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PlacesLocationFeedData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OAuthInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "oAuthInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OAuthInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessAccountIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "businessAccountIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessNameFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "businessNameFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "categoryFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "labelFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
