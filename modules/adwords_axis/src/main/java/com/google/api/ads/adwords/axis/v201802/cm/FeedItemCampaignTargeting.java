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
 * FeedItemCampaignTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Specifies the campaign the request context must match in order
 * for
 *             the feed item to be considered eligible for serving (aka
 * the targeted campaign).
 *             E.g., if the below campaign targeting is set to campaignId
 * = X, then the feed
 *             item can only serve under campaign X.
 */
public class FeedItemCampaignTargeting  implements java.io.Serializable {
    /* The ID of the campaign to target.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.Long targetingCampaignId;

    public FeedItemCampaignTargeting() {
    }

    public FeedItemCampaignTargeting(
           java.lang.Long targetingCampaignId) {
           this.targetingCampaignId = targetingCampaignId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("targetingCampaignId", getTargetingCampaignId())
            .toString();
    }

    /**
     * Gets the targetingCampaignId value for this FeedItemCampaignTargeting.
     * 
     * @return targetingCampaignId   * The ID of the campaign to target.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.Long getTargetingCampaignId() {
        return targetingCampaignId;
    }


    /**
     * Sets the targetingCampaignId value for this FeedItemCampaignTargeting.
     * 
     * @param targetingCampaignId   * The ID of the campaign to target.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setTargetingCampaignId(java.lang.Long targetingCampaignId) {
        this.targetingCampaignId = targetingCampaignId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemCampaignTargeting)) return false;
        FeedItemCampaignTargeting other = (FeedItemCampaignTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingCampaignId==null && other.getTargetingCampaignId()==null) || 
             (this.targetingCampaignId!=null &&
              this.targetingCampaignId.equals(other.getTargetingCampaignId())));
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
        if (getTargetingCampaignId() != null) {
            _hashCode += getTargetingCampaignId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemCampaignTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemCampaignTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetingCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
