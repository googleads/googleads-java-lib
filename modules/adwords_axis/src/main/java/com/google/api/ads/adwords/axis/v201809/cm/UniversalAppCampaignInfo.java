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
 * UniversalAppCampaignInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Stores campaign-level info related to Universal App Campaigns.
 */
public class UniversalAppCampaignInfo  implements java.io.Serializable {
    /* Represents the goal which the bidding strategy of this app
     * campaign should optimize towards.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.UniversalAppBiddingStrategyGoalType biddingStrategyGoalType;

    /* A string that uniquely identifies a mobile application.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String appId;

    /* The vendor, i.e. application store that distributes this specific
     * app.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.MobileApplicationVendor appVendor;

    public UniversalAppCampaignInfo() {
    }

    public UniversalAppCampaignInfo(
           com.google.api.ads.adwords.axis.v201809.cm.UniversalAppBiddingStrategyGoalType biddingStrategyGoalType,
           java.lang.String appId,
           com.google.api.ads.adwords.axis.v201809.cm.MobileApplicationVendor appVendor) {
           this.biddingStrategyGoalType = biddingStrategyGoalType;
           this.appId = appId;
           this.appVendor = appVendor;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("appId", getAppId())
            .add("appVendor", getAppVendor())
            .add("biddingStrategyGoalType", getBiddingStrategyGoalType())
            .toString();
    }

    /**
     * Gets the biddingStrategyGoalType value for this UniversalAppCampaignInfo.
     * 
     * @return biddingStrategyGoalType   * Represents the goal which the bidding strategy of this app
     * campaign should optimize towards.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.UniversalAppBiddingStrategyGoalType getBiddingStrategyGoalType() {
        return biddingStrategyGoalType;
    }


    /**
     * Sets the biddingStrategyGoalType value for this UniversalAppCampaignInfo.
     * 
     * @param biddingStrategyGoalType   * Represents the goal which the bidding strategy of this app
     * campaign should optimize towards.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setBiddingStrategyGoalType(com.google.api.ads.adwords.axis.v201809.cm.UniversalAppBiddingStrategyGoalType biddingStrategyGoalType) {
        this.biddingStrategyGoalType = biddingStrategyGoalType;
    }


    /**
     * Gets the appId value for this UniversalAppCampaignInfo.
     * 
     * @return appId   * A string that uniquely identifies a mobile application.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this UniversalAppCampaignInfo.
     * 
     * @param appId   * A string that uniquely identifies a mobile application.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the appVendor value for this UniversalAppCampaignInfo.
     * 
     * @return appVendor   * The vendor, i.e. application store that distributes this specific
     * app.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.MobileApplicationVendor getAppVendor() {
        return appVendor;
    }


    /**
     * Sets the appVendor value for this UniversalAppCampaignInfo.
     * 
     * @param appVendor   * The vendor, i.e. application store that distributes this specific
     * app.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setAppVendor(com.google.api.ads.adwords.axis.v201809.cm.MobileApplicationVendor appVendor) {
        this.appVendor = appVendor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UniversalAppCampaignInfo)) return false;
        UniversalAppCampaignInfo other = (UniversalAppCampaignInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biddingStrategyGoalType==null && other.getBiddingStrategyGoalType()==null) || 
             (this.biddingStrategyGoalType!=null &&
              this.biddingStrategyGoalType.equals(other.getBiddingStrategyGoalType()))) &&
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.appVendor==null && other.getAppVendor()==null) || 
             (this.appVendor!=null &&
              this.appVendor.equals(other.getAppVendor())));
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
        if (getBiddingStrategyGoalType() != null) {
            _hashCode += getBiddingStrategyGoalType().hashCode();
        }
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getAppVendor() != null) {
            _hashCode += getAppVendor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UniversalAppCampaignInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UniversalAppCampaignInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyGoalType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "biddingStrategyGoalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UniversalAppBiddingStrategyGoalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "appId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "appVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MobileApplicationVendor"));
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
