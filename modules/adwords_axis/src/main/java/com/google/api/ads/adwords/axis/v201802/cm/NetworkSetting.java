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
 * NetworkSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Network settings for a Campaign.
 */
public class NetworkSetting  implements java.io.Serializable {
    /* Ads will be served with Google.com search results.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to true for campaign channel type SEARCH.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * false for campaign channel type DISPLAY.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span> */
    private java.lang.Boolean targetGoogleSearch;

    /* Ads will be served on partner sites in the Google Search Network
     * (requires {@code GOOGLE_SEARCH}).
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span> */
    private java.lang.Boolean targetSearchNetwork;

    /* Ads will be served on specified placements in the Google Display
     * Network.
     *                 Placements are specified using {@code Placement} criteria.
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * false for campaign channel subtype SEARCH_MOBILE_APP.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span> */
    private java.lang.Boolean targetContentNetwork;

    /* Ads will be served on the Google Partner Network. This is available
     * to
     *                 only some specific Google partner accounts.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to false for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span> */
    private java.lang.Boolean targetPartnerSearchNetwork;

    public NetworkSetting() {
    }

    public NetworkSetting(
           java.lang.Boolean targetGoogleSearch,
           java.lang.Boolean targetSearchNetwork,
           java.lang.Boolean targetContentNetwork,
           java.lang.Boolean targetPartnerSearchNetwork) {
           this.targetGoogleSearch = targetGoogleSearch;
           this.targetSearchNetwork = targetSearchNetwork;
           this.targetContentNetwork = targetContentNetwork;
           this.targetPartnerSearchNetwork = targetPartnerSearchNetwork;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("targetContentNetwork", getTargetContentNetwork())
            .add("targetGoogleSearch", getTargetGoogleSearch())
            .add("targetPartnerSearchNetwork", getTargetPartnerSearchNetwork())
            .add("targetSearchNetwork", getTargetSearchNetwork())
            .toString();
    }

    /**
     * Gets the targetGoogleSearch value for this NetworkSetting.
     * 
     * @return targetGoogleSearch   * Ads will be served with Google.com search results.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to true for campaign channel type SEARCH.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * false for campaign channel type DISPLAY.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public java.lang.Boolean getTargetGoogleSearch() {
        return targetGoogleSearch;
    }


    /**
     * Sets the targetGoogleSearch value for this NetworkSetting.
     * 
     * @param targetGoogleSearch   * Ads will be served with Google.com search results.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to true for campaign channel type SEARCH.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * false for campaign channel type DISPLAY.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public void setTargetGoogleSearch(java.lang.Boolean targetGoogleSearch) {
        this.targetGoogleSearch = targetGoogleSearch;
    }


    /**
     * Gets the targetSearchNetwork value for this NetworkSetting.
     * 
     * @return targetSearchNetwork   * Ads will be served on partner sites in the Google Search Network
     * (requires {@code GOOGLE_SEARCH}).
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public java.lang.Boolean getTargetSearchNetwork() {
        return targetSearchNetwork;
    }


    /**
     * Sets the targetSearchNetwork value for this NetworkSetting.
     * 
     * @param targetSearchNetwork   * Ads will be served on partner sites in the Google Search Network
     * (requires {@code GOOGLE_SEARCH}).
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public void setTargetSearchNetwork(java.lang.Boolean targetSearchNetwork) {
        this.targetSearchNetwork = targetSearchNetwork;
    }


    /**
     * Gets the targetContentNetwork value for this NetworkSetting.
     * 
     * @return targetContentNetwork   * Ads will be served on specified placements in the Google Display
     * Network.
     *                 Placements are specified using {@code Placement} criteria.
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * false for campaign channel subtype SEARCH_MOBILE_APP.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public java.lang.Boolean getTargetContentNetwork() {
        return targetContentNetwork;
    }


    /**
     * Sets the targetContentNetwork value for this NetworkSetting.
     * 
     * @param targetContentNetwork   * Ads will be served on specified placements in the Google Display
     * Network.
     *                 Placements are specified using {@code Placement} criteria.
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * false for campaign channel subtype SEARCH_MOBILE_APP.</span>
     * <span class="constraint CampaignType">This field may only be set to
     * true for campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public void setTargetContentNetwork(java.lang.Boolean targetContentNetwork) {
        this.targetContentNetwork = targetContentNetwork;
    }


    /**
     * Gets the targetPartnerSearchNetwork value for this NetworkSetting.
     * 
     * @return targetPartnerSearchNetwork   * Ads will be served on the Google Partner Network. This is available
     * to
     *                 only some specific Google partner accounts.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to false for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public java.lang.Boolean getTargetPartnerSearchNetwork() {
        return targetPartnerSearchNetwork;
    }


    /**
     * Sets the targetPartnerSearchNetwork value for this NetworkSetting.
     * 
     * @param targetPartnerSearchNetwork   * Ads will be served on the Google Partner Network. This is available
     * to
     *                 only some specific Google partner accounts.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to false for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     */
    public void setTargetPartnerSearchNetwork(java.lang.Boolean targetPartnerSearchNetwork) {
        this.targetPartnerSearchNetwork = targetPartnerSearchNetwork;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkSetting)) return false;
        NetworkSetting other = (NetworkSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetGoogleSearch==null && other.getTargetGoogleSearch()==null) || 
             (this.targetGoogleSearch!=null &&
              this.targetGoogleSearch.equals(other.getTargetGoogleSearch()))) &&
            ((this.targetSearchNetwork==null && other.getTargetSearchNetwork()==null) || 
             (this.targetSearchNetwork!=null &&
              this.targetSearchNetwork.equals(other.getTargetSearchNetwork()))) &&
            ((this.targetContentNetwork==null && other.getTargetContentNetwork()==null) || 
             (this.targetContentNetwork!=null &&
              this.targetContentNetwork.equals(other.getTargetContentNetwork()))) &&
            ((this.targetPartnerSearchNetwork==null && other.getTargetPartnerSearchNetwork()==null) || 
             (this.targetPartnerSearchNetwork!=null &&
              this.targetPartnerSearchNetwork.equals(other.getTargetPartnerSearchNetwork())));
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
        if (getTargetGoogleSearch() != null) {
            _hashCode += getTargetGoogleSearch().hashCode();
        }
        if (getTargetSearchNetwork() != null) {
            _hashCode += getTargetSearchNetwork().hashCode();
        }
        if (getTargetContentNetwork() != null) {
            _hashCode += getTargetContentNetwork().hashCode();
        }
        if (getTargetPartnerSearchNetwork() != null) {
            _hashCode += getTargetPartnerSearchNetwork().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NetworkSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetGoogleSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetGoogleSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSearchNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetSearchNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetContentNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetContentNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPartnerSearchNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetPartnerSearchNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
