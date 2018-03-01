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
 * CustomerChangeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.ch;


/**
 * Holds information about changes to a customer
 */
public class CustomerChangeData  implements java.io.Serializable {
    /* A list of campaign changes for the customer, as specified by
     * the selector. If a campaign is
     *                 included in the selector it will be included in this
     * list, even if the campaign did not change. */
    private com.google.api.ads.adwords.axis.v201802.ch.CampaignChangeData[] changedCampaigns;

    /* A list of feed changes for the customer as specified in the
     * selector. If a feed is included in
     *                 the selector then it will be included in this list,
     * even if the feed did not change. */
    private com.google.api.ads.adwords.axis.v201802.ch.FeedChangeData[] changedFeeds;

    /* The timestamp for the last changed processed for this customer.
     * It is important that this
     *                 timestamp be used for subsequent requests to avoid
     * missing any changes. */
    private java.lang.String lastChangeTimestamp;

    public CustomerChangeData() {
    }

    public CustomerChangeData(
           com.google.api.ads.adwords.axis.v201802.ch.CampaignChangeData[] changedCampaigns,
           com.google.api.ads.adwords.axis.v201802.ch.FeedChangeData[] changedFeeds,
           java.lang.String lastChangeTimestamp) {
           this.changedCampaigns = changedCampaigns;
           this.changedFeeds = changedFeeds;
           this.lastChangeTimestamp = lastChangeTimestamp;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("changedCampaigns", getChangedCampaigns())
            .add("changedFeeds", getChangedFeeds())
            .add("lastChangeTimestamp", getLastChangeTimestamp())
            .toString();
    }

    /**
     * Gets the changedCampaigns value for this CustomerChangeData.
     * 
     * @return changedCampaigns   * A list of campaign changes for the customer, as specified by
     * the selector. If a campaign is
     *                 included in the selector it will be included in this
     * list, even if the campaign did not change.
     */
    public com.google.api.ads.adwords.axis.v201802.ch.CampaignChangeData[] getChangedCampaigns() {
        return changedCampaigns;
    }


    /**
     * Sets the changedCampaigns value for this CustomerChangeData.
     * 
     * @param changedCampaigns   * A list of campaign changes for the customer, as specified by
     * the selector. If a campaign is
     *                 included in the selector it will be included in this
     * list, even if the campaign did not change.
     */
    public void setChangedCampaigns(com.google.api.ads.adwords.axis.v201802.ch.CampaignChangeData[] changedCampaigns) {
        this.changedCampaigns = changedCampaigns;
    }

    public com.google.api.ads.adwords.axis.v201802.ch.CampaignChangeData getChangedCampaigns(int i) {
        return this.changedCampaigns[i];
    }

    public void setChangedCampaigns(int i, com.google.api.ads.adwords.axis.v201802.ch.CampaignChangeData _value) {
        this.changedCampaigns[i] = _value;
    }


    /**
     * Gets the changedFeeds value for this CustomerChangeData.
     * 
     * @return changedFeeds   * A list of feed changes for the customer as specified in the
     * selector. If a feed is included in
     *                 the selector then it will be included in this list,
     * even if the feed did not change.
     */
    public com.google.api.ads.adwords.axis.v201802.ch.FeedChangeData[] getChangedFeeds() {
        return changedFeeds;
    }


    /**
     * Sets the changedFeeds value for this CustomerChangeData.
     * 
     * @param changedFeeds   * A list of feed changes for the customer as specified in the
     * selector. If a feed is included in
     *                 the selector then it will be included in this list,
     * even if the feed did not change.
     */
    public void setChangedFeeds(com.google.api.ads.adwords.axis.v201802.ch.FeedChangeData[] changedFeeds) {
        this.changedFeeds = changedFeeds;
    }

    public com.google.api.ads.adwords.axis.v201802.ch.FeedChangeData getChangedFeeds(int i) {
        return this.changedFeeds[i];
    }

    public void setChangedFeeds(int i, com.google.api.ads.adwords.axis.v201802.ch.FeedChangeData _value) {
        this.changedFeeds[i] = _value;
    }


    /**
     * Gets the lastChangeTimestamp value for this CustomerChangeData.
     * 
     * @return lastChangeTimestamp   * The timestamp for the last changed processed for this customer.
     * It is important that this
     *                 timestamp be used for subsequent requests to avoid
     * missing any changes.
     */
    public java.lang.String getLastChangeTimestamp() {
        return lastChangeTimestamp;
    }


    /**
     * Sets the lastChangeTimestamp value for this CustomerChangeData.
     * 
     * @param lastChangeTimestamp   * The timestamp for the last changed processed for this customer.
     * It is important that this
     *                 timestamp be used for subsequent requests to avoid
     * missing any changes.
     */
    public void setLastChangeTimestamp(java.lang.String lastChangeTimestamp) {
        this.lastChangeTimestamp = lastChangeTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerChangeData)) return false;
        CustomerChangeData other = (CustomerChangeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changedCampaigns==null && other.getChangedCampaigns()==null) || 
             (this.changedCampaigns!=null &&
              java.util.Arrays.equals(this.changedCampaigns, other.getChangedCampaigns()))) &&
            ((this.changedFeeds==null && other.getChangedFeeds()==null) || 
             (this.changedFeeds!=null &&
              java.util.Arrays.equals(this.changedFeeds, other.getChangedFeeds()))) &&
            ((this.lastChangeTimestamp==null && other.getLastChangeTimestamp()==null) || 
             (this.lastChangeTimestamp!=null &&
              this.lastChangeTimestamp.equals(other.getLastChangeTimestamp())));
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
        if (getChangedCampaigns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedCampaigns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedCampaigns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangedFeeds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedFeeds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedFeeds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastChangeTimestamp() != null) {
            _hashCode += getLastChangeTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerChangeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "CustomerChangeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedCampaigns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "changedCampaigns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "CampaignChangeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "changedFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "FeedChangeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChangeTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "lastChangeTimestamp"));
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
