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
 * CampaignFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * CampaignFeeds are used to link a feed to a campaign using a matching
 * function,
 *             making the feed's feed items available in the campaign's
 * ads for substitution.
 */
public class CampaignFeed  implements java.io.Serializable {
    /* Id of the Feed associated with the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* Id of the Campaign associated with the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long campaignId;

    /* Matching function associated with the CampaignFeed.
     *                 The matching function will return true/false indicating
     * which feed items may serve.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MatchingFunction".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Function matchingFunction;

    /* Indicates which <a href="/adwords/api/docs/appendix/placeholders">
     * placeholder types</a> the feed may populate under the
     *                 connected Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderTypes".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private int[] placeholderTypes;

    /* Status of the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedStatus status;

    /* ID of the base campaign from which this draft/trial feed was
     * created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseCampaignId;

    public CampaignFeed() {
    }

    public CampaignFeed(
           java.lang.Long feedId,
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201802.cm.Function matchingFunction,
           int[] placeholderTypes,
           com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedStatus status,
           java.lang.Long baseCampaignId) {
           this.feedId = feedId;
           this.campaignId = campaignId;
           this.matchingFunction = matchingFunction;
           this.placeholderTypes = placeholderTypes;
           this.status = status;
           this.baseCampaignId = baseCampaignId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("baseCampaignId", getBaseCampaignId())
            .add("campaignId", getCampaignId())
            .add("feedId", getFeedId())
            .add("matchingFunction", getMatchingFunction())
            .add("placeholderTypes", getPlaceholderTypes())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the feedId value for this CampaignFeed.
     * 
     * @return feedId   * Id of the Feed associated with the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this CampaignFeed.
     * 
     * @param feedId   * Id of the Feed associated with the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the campaignId value for this CampaignFeed.
     * 
     * @return campaignId   * Id of the Campaign associated with the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignFeed.
     * 
     * @param campaignId   * Id of the Campaign associated with the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the matchingFunction value for this CampaignFeed.
     * 
     * @return matchingFunction   * Matching function associated with the CampaignFeed.
     *                 The matching function will return true/false indicating
     * which feed items may serve.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MatchingFunction".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Function getMatchingFunction() {
        return matchingFunction;
    }


    /**
     * Sets the matchingFunction value for this CampaignFeed.
     * 
     * @param matchingFunction   * Matching function associated with the CampaignFeed.
     *                 The matching function will return true/false indicating
     * which feed items may serve.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MatchingFunction".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setMatchingFunction(com.google.api.ads.adwords.axis.v201802.cm.Function matchingFunction) {
        this.matchingFunction = matchingFunction;
    }


    /**
     * Gets the placeholderTypes value for this CampaignFeed.
     * 
     * @return placeholderTypes   * Indicates which <a href="/adwords/api/docs/appendix/placeholders">
     * placeholder types</a> the feed may populate under the
     *                 connected Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderTypes".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public int[] getPlaceholderTypes() {
        return placeholderTypes;
    }


    /**
     * Sets the placeholderTypes value for this CampaignFeed.
     * 
     * @param placeholderTypes   * Indicates which <a href="/adwords/api/docs/appendix/placeholders">
     * placeholder types</a> the feed may populate under the
     *                 connected Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderTypes".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setPlaceholderTypes(int[] placeholderTypes) {
        this.placeholderTypes = placeholderTypes;
    }

    public int getPlaceholderTypes(int i) {
        return this.placeholderTypes[i];
    }

    public void setPlaceholderTypes(int i, int _value) {
        this.placeholderTypes[i] = _value;
    }


    /**
     * Gets the status value for this CampaignFeed.
     * 
     * @return status   * Status of the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignFeed.
     * 
     * @param status   * Status of the CampaignFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedStatus status) {
        this.status = status;
    }


    /**
     * Gets the baseCampaignId value for this CampaignFeed.
     * 
     * @return baseCampaignId   * ID of the base campaign from which this draft/trial feed was
     * created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this CampaignFeed.
     * 
     * @param baseCampaignId   * ID of the base campaign from which this draft/trial feed was
     * created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignFeed)) return false;
        CampaignFeed other = (CampaignFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.matchingFunction==null && other.getMatchingFunction()==null) || 
             (this.matchingFunction!=null &&
              this.matchingFunction.equals(other.getMatchingFunction()))) &&
            ((this.placeholderTypes==null && other.getPlaceholderTypes()==null) || 
             (this.placeholderTypes!=null &&
              java.util.Arrays.equals(this.placeholderTypes, other.getPlaceholderTypes()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) || 
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId())));
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
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getMatchingFunction() != null) {
            _hashCode += getMatchingFunction().hashCode();
        }
        if (getPlaceholderTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlaceholderTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlaceholderTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "matchingFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Function"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeholderTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "placeholderTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignFeed.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseCampaignId"));
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
