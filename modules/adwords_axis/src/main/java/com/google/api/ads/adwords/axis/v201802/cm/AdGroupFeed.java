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
 * AdGroupFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * AdGroupFeeds are used to link a feed to an adgroup using a matching
 * function,
 *             making the feed's feed items available in the adgroup's
 * ads for substitution.
 */
public class AdGroupFeed  implements java.io.Serializable {
    /* Id of the Feed associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* Id of the AdGroup associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* Matching function associated with the AdGroupFeed.
     *                 The matching function will return true/false indicating
     * which feed items may serve.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MatchingFunction".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Function matchingFunction;

    /* Indicates which placeholder types the feed may populate under
     * the connected AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderTypes".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private int[] placeholderTypes;

    /* Status of the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedStatus status;

    /* ID of the base campaign from which this draft/trial ad group
     * feed was created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseCampaignId;

    /* ID of the base ad group from which this draft/trial ad group
     * feed was created. For
     *                 base ad groups this is equal to the ad group ID. 
     * If the ad group was created
     *                 in the draft or trial and has no corresponding base
     * ad group, this field is null.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseAdGroupId;

    public AdGroupFeed() {
    }

    public AdGroupFeed(
           java.lang.Long feedId,
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201802.cm.Function matchingFunction,
           int[] placeholderTypes,
           com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedStatus status,
           java.lang.Long baseCampaignId,
           java.lang.Long baseAdGroupId) {
           this.feedId = feedId;
           this.adGroupId = adGroupId;
           this.matchingFunction = matchingFunction;
           this.placeholderTypes = placeholderTypes;
           this.status = status;
           this.baseCampaignId = baseCampaignId;
           this.baseAdGroupId = baseAdGroupId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("baseAdGroupId", getBaseAdGroupId())
            .add("baseCampaignId", getBaseCampaignId())
            .add("feedId", getFeedId())
            .add("matchingFunction", getMatchingFunction())
            .add("placeholderTypes", getPlaceholderTypes())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the feedId value for this AdGroupFeed.
     * 
     * @return feedId   * Id of the Feed associated with the AdGroupFeed.
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
     * Sets the feedId value for this AdGroupFeed.
     * 
     * @param feedId   * Id of the Feed associated with the AdGroupFeed.
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
     * Gets the adGroupId value for this AdGroupFeed.
     * 
     * @return adGroupId   * Id of the AdGroup associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupFeed.
     * 
     * @param adGroupId   * Id of the AdGroup associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the matchingFunction value for this AdGroupFeed.
     * 
     * @return matchingFunction   * Matching function associated with the AdGroupFeed.
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
     * Sets the matchingFunction value for this AdGroupFeed.
     * 
     * @param matchingFunction   * Matching function associated with the AdGroupFeed.
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
     * Gets the placeholderTypes value for this AdGroupFeed.
     * 
     * @return placeholderTypes   * Indicates which placeholder types the feed may populate under
     * the connected AdGroup.
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
     * Sets the placeholderTypes value for this AdGroupFeed.
     * 
     * @param placeholderTypes   * Indicates which placeholder types the feed may populate under
     * the connected AdGroup.
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
     * Gets the status value for this AdGroupFeed.
     * 
     * @return status   * Status of the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroupFeed.
     * 
     * @param status   * Status of the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedStatus status) {
        this.status = status;
    }


    /**
     * Gets the baseCampaignId value for this AdGroupFeed.
     * 
     * @return baseCampaignId   * ID of the base campaign from which this draft/trial ad group
     * feed was created.
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
     * Sets the baseCampaignId value for this AdGroupFeed.
     * 
     * @param baseCampaignId   * ID of the base campaign from which this draft/trial ad group
     * feed was created.
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


    /**
     * Gets the baseAdGroupId value for this AdGroupFeed.
     * 
     * @return baseAdGroupId   * ID of the base ad group from which this draft/trial ad group
     * feed was created. For
     *                 base ad groups this is equal to the ad group ID. 
     * If the ad group was created
     *                 in the draft or trial and has no corresponding base
     * ad group, this field is null.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseAdGroupId() {
        return baseAdGroupId;
    }


    /**
     * Sets the baseAdGroupId value for this AdGroupFeed.
     * 
     * @param baseAdGroupId   * ID of the base ad group from which this draft/trial ad group
     * feed was created. For
     *                 base ad groups this is equal to the ad group ID. 
     * If the ad group was created
     *                 in the draft or trial and has no corresponding base
     * ad group, this field is null.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseAdGroupId(java.lang.Long baseAdGroupId) {
        this.baseAdGroupId = baseAdGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupFeed)) return false;
        AdGroupFeed other = (AdGroupFeed) obj;
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
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
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
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.baseAdGroupId==null && other.getBaseAdGroupId()==null) || 
             (this.baseAdGroupId!=null &&
              this.baseAdGroupId.equals(other.getBaseAdGroupId())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
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
        if (getBaseAdGroupId() != null) {
            _hashCode += getBaseAdGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupId"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupFeed.Status"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseAdGroupId"));
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
