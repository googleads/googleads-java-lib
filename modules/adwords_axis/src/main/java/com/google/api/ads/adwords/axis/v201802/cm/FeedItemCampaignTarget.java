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
 * FeedItemCampaignTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a feed item target for a campaign.
 */
public class FeedItemCampaignTarget  extends com.google.api.ads.adwords.axis.v201802.cm.FeedItemTarget  implements java.io.Serializable {
    /* ID of the target campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Long campaignId;

    /* Name of the target campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String campaignName;

    public FeedItemCampaignTarget() {
    }

    public FeedItemCampaignTarget(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType targetType,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus status,
           java.lang.String feedItemTargetType,
           java.lang.Long campaignId,
           java.lang.String campaignName) {
        super(
            feedId,
            feedItemId,
            targetType,
            status,
            feedItemTargetType);
        this.campaignId = campaignId;
        this.campaignName = campaignName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("campaignId", getCampaignId())
            .add("campaignName", getCampaignName())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedItemTargetType", getFeedItemTargetType())
            .add("status", getStatus())
            .add("targetType", getTargetType())
            .toString();
    }

    /**
     * Gets the campaignId value for this FeedItemCampaignTarget.
     * 
     * @return campaignId   * ID of the target campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this FeedItemCampaignTarget.
     * 
     * @param campaignId   * ID of the target campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaignName value for this FeedItemCampaignTarget.
     * 
     * @return campaignName   * Name of the target campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this FeedItemCampaignTarget.
     * 
     * @param campaignName   * Name of the target campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemCampaignTarget)) return false;
        FeedItemCampaignTarget other = (FeedItemCampaignTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemCampaignTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemCampaignTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignName"));
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
