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
 * FeedItemAdGroupTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a feed item target for an ad group.
 */
public class FeedItemAdGroupTarget  extends com.google.api.ads.adwords.axis.v201802.cm.FeedItemTarget  implements java.io.Serializable {
    /* ID of the target ad group.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* Name of the target ad group.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String adGroupName;

    /* Name of the target ad group's campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ParentCampaignName".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.String parentCampaignName;

    public FeedItemAdGroupTarget() {
    }

    public FeedItemAdGroupTarget(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType targetType,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus status,
           java.lang.String feedItemTargetType,
           java.lang.Long adGroupId,
           java.lang.String adGroupName,
           java.lang.String parentCampaignName) {
        super(
            feedId,
            feedItemId,
            targetType,
            status,
            feedItemTargetType);
        this.adGroupId = adGroupId;
        this.adGroupName = adGroupName;
        this.parentCampaignName = parentCampaignName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("adGroupName", getAdGroupName())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedItemTargetType", getFeedItemTargetType())
            .add("parentCampaignName", getParentCampaignName())
            .add("status", getStatus())
            .add("targetType", getTargetType())
            .toString();
    }

    /**
     * Gets the adGroupId value for this FeedItemAdGroupTarget.
     * 
     * @return adGroupId   * ID of the target ad group.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this FeedItemAdGroupTarget.
     * 
     * @param adGroupId   * ID of the target ad group.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the adGroupName value for this FeedItemAdGroupTarget.
     * 
     * @return adGroupName   * Name of the target ad group.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getAdGroupName() {
        return adGroupName;
    }


    /**
     * Sets the adGroupName value for this FeedItemAdGroupTarget.
     * 
     * @param adGroupName   * Name of the target ad group.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setAdGroupName(java.lang.String adGroupName) {
        this.adGroupName = adGroupName;
    }


    /**
     * Gets the parentCampaignName value for this FeedItemAdGroupTarget.
     * 
     * @return parentCampaignName   * Name of the target ad group's campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ParentCampaignName".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.String getParentCampaignName() {
        return parentCampaignName;
    }


    /**
     * Sets the parentCampaignName value for this FeedItemAdGroupTarget.
     * 
     * @param parentCampaignName   * Name of the target ad group's campaign.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ParentCampaignName".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setParentCampaignName(java.lang.String parentCampaignName) {
        this.parentCampaignName = parentCampaignName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemAdGroupTarget)) return false;
        FeedItemAdGroupTarget other = (FeedItemAdGroupTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.adGroupName==null && other.getAdGroupName()==null) || 
             (this.adGroupName!=null &&
              this.adGroupName.equals(other.getAdGroupName()))) &&
            ((this.parentCampaignName==null && other.getParentCampaignName()==null) || 
             (this.parentCampaignName!=null &&
              this.parentCampaignName.equals(other.getParentCampaignName())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getAdGroupName() != null) {
            _hashCode += getAdGroupName().hashCode();
        }
        if (getParentCampaignName() != null) {
            _hashCode += getParentCampaignName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemAdGroupTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAdGroupTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCampaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "parentCampaignName"));
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
