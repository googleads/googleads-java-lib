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
 * CampaignEstimateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Represents a campaign that will be estimated.<p>
 *             
 *             Returns traffic estimates for the requested set of campaigns.
 * The campaigns can be all new or all existing, or a mixture of
 *             new and existing. Only existing campaigns may contain
 * estimates for existing
 *             ad groups.<p>
 *             
 *             For existing campaigns, the campaign and optionally the
 * ad group will be
 *             used as context to produce more accurate estimates. Traffic
 * estimates may
 *             only be requested on keywords, so regardless of whether
 * campaign and ad group
 *             IDs are provided or left blank, at least one keyword is
 * required to estimate
 *             traffic.<p>
 *             
 *             To make a keyword estimates request in which estimates
 * do not consider
 *             existing account information (e.g. historical ad group
 * performance), set
 *             {@link #campaignId} to {@code null}.
 */
public class CampaignEstimateRequest  extends com.google.api.ads.adwords.axis.v201802.o.EstimateRequest  implements java.io.Serializable {
    /* The campaignId of an existing campaign or {@code null}.<p>
     *                     
     *                     Refer to the {@link CampaignEstimateRequest} documentation
     * for
     *                     detailed usage. */
    private java.lang.Long campaignId;

    /* The list of ad groups to estimate. This field is required and
     * should not be {@code null}. At
     *                     least one ad group is required.
     *                     
     *                     <p>New campaigns may only contain new ad groups.
     * If an
     *                     {@link AdGroupEstimateRequest} has an adGroupId
     * but the campaign is new,
     *                     the API will return an error.
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.AdGroupEstimateRequest[] adGroupEstimateRequests;

    /* A list of {@link Criterion}s to be used for this Campaign.
     * Criteria
     *                     provide information about geographical and language
     * targeting.
     *                     
     *                     <p>Values in this field override the current targets
     * in the Campaign
     *                     specified by {@link #campaignId} by the following
     * mechanism:
     *                     
     *                     <p>This field accepts two types of {@link Criterion}s:
     * {@link Location}, which should contain
     *                     all geographic targeting and {@link Language},
     * which should contain all language targeting.
     *                     If {@link Location}s are passed in, all geographic
     * targeting in the campaign will be
     *                     overridden.  If any {@link Language}s are passed
     * in, all language targeting in the campaign
     *                     will be overridden.
     *                     
     *                     <p>If multiple {@link Location}s are specified,
     * the traffic estimate will
     *                     be the sum of the estimates for each targeted
     * area. This means that if
     *                     criteria are chosen which overlap each other (for
     * example, targeting both
     *                     a country and a city within that country), the
     * traffic estimate will be
     *                     be larger than if no overlap were present - i.
     * e., the overlap region will
     *                     be double-counted in the estimate.
     *                     
     *                     <p>If no criteria are specified and this is for
     * a new campaign then it
     *                     will default to all languages in all countries
     * and territories, and
     *                     Google search.
     *                     
     *                     <p>If no criteria are specified and this is for
     * an existing campaign
     *                     then the current targeting on that campaign will
     * be used.
     *                     
     *                     <p>While there's no solid limit on number of criteria,
     * TrafficEstimatorService may return error with TOO_MANY_TARGETS if
     * the
     *                     request contains too many criteria across all
     *                     {@link CampaignEstimateRequest}s in a {@link TrafficEstimatorSelector}.
     * 
     *                     <p>Supported Criteria : {@link Language} and {@link
     * Location}.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Criterion[] criteria;

    /* A {@link NetworkSetting} to be used for this Campaign. The
     * value of this
     *                     field overrides the current targets in the Campaign
     * specified by
     *                     {@link #campaignId}.
     *                     
     *                     <p>For non Google partner accounts, only
     *                     {@link NetworkSetting#targetGoogleSearch} and
     *                     {@link NetworkSetting#targetSearchNetwork} are
     * supported, they may be
     *                     combined to sum the estimates.
     *                     
     *                     <p>For some Google partner accounts, in addition
     * {@link NetworkSetting#getTargetPartnerSearchNetwork} is supported.
     * 
     *                     <p>If all request network settings and Campaign's
     * network settings are
     *                     empty, the default is {@link NetworkSetting#targetGoogleSearch}. */
    private com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting networkSetting;

    /* Daily campaign budget to use in traffic estimation.  If not
     * specified,
     *                     the daily budget is unlimited. */
    private com.google.api.ads.adwords.axis.v201802.cm.Money dailyBudget;

    public CampaignEstimateRequest() {
    }

    public CampaignEstimateRequest(
           java.lang.String estimateRequestType,
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201802.o.AdGroupEstimateRequest[] adGroupEstimateRequests,
           com.google.api.ads.adwords.axis.v201802.cm.Criterion[] criteria,
           com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting networkSetting,
           com.google.api.ads.adwords.axis.v201802.cm.Money dailyBudget) {
        super(
            estimateRequestType);
        this.campaignId = campaignId;
        this.adGroupEstimateRequests = adGroupEstimateRequests;
        this.criteria = criteria;
        this.networkSetting = networkSetting;
        this.dailyBudget = dailyBudget;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupEstimateRequests", getAdGroupEstimateRequests())
            .add("campaignId", getCampaignId())
            .add("criteria", getCriteria())
            .add("dailyBudget", getDailyBudget())
            .add("estimateRequestType", getEstimateRequestType())
            .add("networkSetting", getNetworkSetting())
            .toString();
    }

    /**
     * Gets the campaignId value for this CampaignEstimateRequest.
     * 
     * @return campaignId   * The campaignId of an existing campaign or {@code null}.<p>
     *                     
     *                     Refer to the {@link CampaignEstimateRequest} documentation
     * for
     *                     detailed usage.
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignEstimateRequest.
     * 
     * @param campaignId   * The campaignId of an existing campaign or {@code null}.<p>
     *                     
     *                     Refer to the {@link CampaignEstimateRequest} documentation
     * for
     *                     detailed usage.
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adGroupEstimateRequests value for this CampaignEstimateRequest.
     * 
     * @return adGroupEstimateRequests   * The list of ad groups to estimate. This field is required and
     * should not be {@code null}. At
     *                     least one ad group is required.
     *                     
     *                     <p>New campaigns may only contain new ad groups.
     * If an
     *                     {@link AdGroupEstimateRequest} has an adGroupId
     * but the campaign is new,
     *                     the API will return an error.
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.AdGroupEstimateRequest[] getAdGroupEstimateRequests() {
        return adGroupEstimateRequests;
    }


    /**
     * Sets the adGroupEstimateRequests value for this CampaignEstimateRequest.
     * 
     * @param adGroupEstimateRequests   * The list of ad groups to estimate. This field is required and
     * should not be {@code null}. At
     *                     least one ad group is required.
     *                     
     *                     <p>New campaigns may only contain new ad groups.
     * If an
     *                     {@link AdGroupEstimateRequest} has an adGroupId
     * but the campaign is new,
     *                     the API will return an error.
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public void setAdGroupEstimateRequests(com.google.api.ads.adwords.axis.v201802.o.AdGroupEstimateRequest[] adGroupEstimateRequests) {
        this.adGroupEstimateRequests = adGroupEstimateRequests;
    }

    public com.google.api.ads.adwords.axis.v201802.o.AdGroupEstimateRequest getAdGroupEstimateRequests(int i) {
        return this.adGroupEstimateRequests[i];
    }

    public void setAdGroupEstimateRequests(int i, com.google.api.ads.adwords.axis.v201802.o.AdGroupEstimateRequest _value) {
        this.adGroupEstimateRequests[i] = _value;
    }


    /**
     * Gets the criteria value for this CampaignEstimateRequest.
     * 
     * @return criteria   * A list of {@link Criterion}s to be used for this Campaign.
     * Criteria
     *                     provide information about geographical and language
     * targeting.
     *                     
     *                     <p>Values in this field override the current targets
     * in the Campaign
     *                     specified by {@link #campaignId} by the following
     * mechanism:
     *                     
     *                     <p>This field accepts two types of {@link Criterion}s:
     * {@link Location}, which should contain
     *                     all geographic targeting and {@link Language},
     * which should contain all language targeting.
     *                     If {@link Location}s are passed in, all geographic
     * targeting in the campaign will be
     *                     overridden.  If any {@link Language}s are passed
     * in, all language targeting in the campaign
     *                     will be overridden.
     *                     
     *                     <p>If multiple {@link Location}s are specified,
     * the traffic estimate will
     *                     be the sum of the estimates for each targeted
     * area. This means that if
     *                     criteria are chosen which overlap each other (for
     * example, targeting both
     *                     a country and a city within that country), the
     * traffic estimate will be
     *                     be larger than if no overlap were present - i.
     * e., the overlap region will
     *                     be double-counted in the estimate.
     *                     
     *                     <p>If no criteria are specified and this is for
     * a new campaign then it
     *                     will default to all languages in all countries
     * and territories, and
     *                     Google search.
     *                     
     *                     <p>If no criteria are specified and this is for
     * an existing campaign
     *                     then the current targeting on that campaign will
     * be used.
     *                     
     *                     <p>While there's no solid limit on number of criteria,
     * TrafficEstimatorService may return error with TOO_MANY_TARGETS if
     * the
     *                     request contains too many criteria across all
     *                     {@link CampaignEstimateRequest}s in a {@link TrafficEstimatorSelector}.
     * 
     *                     <p>Supported Criteria : {@link Language} and {@link
     * Location}.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Criterion[] getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this CampaignEstimateRequest.
     * 
     * @param criteria   * A list of {@link Criterion}s to be used for this Campaign.
     * Criteria
     *                     provide information about geographical and language
     * targeting.
     *                     
     *                     <p>Values in this field override the current targets
     * in the Campaign
     *                     specified by {@link #campaignId} by the following
     * mechanism:
     *                     
     *                     <p>This field accepts two types of {@link Criterion}s:
     * {@link Location}, which should contain
     *                     all geographic targeting and {@link Language},
     * which should contain all language targeting.
     *                     If {@link Location}s are passed in, all geographic
     * targeting in the campaign will be
     *                     overridden.  If any {@link Language}s are passed
     * in, all language targeting in the campaign
     *                     will be overridden.
     *                     
     *                     <p>If multiple {@link Location}s are specified,
     * the traffic estimate will
     *                     be the sum of the estimates for each targeted
     * area. This means that if
     *                     criteria are chosen which overlap each other (for
     * example, targeting both
     *                     a country and a city within that country), the
     * traffic estimate will be
     *                     be larger than if no overlap were present - i.
     * e., the overlap region will
     *                     be double-counted in the estimate.
     *                     
     *                     <p>If no criteria are specified and this is for
     * a new campaign then it
     *                     will default to all languages in all countries
     * and territories, and
     *                     Google search.
     *                     
     *                     <p>If no criteria are specified and this is for
     * an existing campaign
     *                     then the current targeting on that campaign will
     * be used.
     *                     
     *                     <p>While there's no solid limit on number of criteria,
     * TrafficEstimatorService may return error with TOO_MANY_TARGETS if
     * the
     *                     request contains too many criteria across all
     *                     {@link CampaignEstimateRequest}s in a {@link TrafficEstimatorSelector}.
     * 
     *                     <p>Supported Criteria : {@link Language} and {@link
     * Location}.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public void setCriteria(com.google.api.ads.adwords.axis.v201802.cm.Criterion[] criteria) {
        this.criteria = criteria;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Criterion getCriteria(int i) {
        return this.criteria[i];
    }

    public void setCriteria(int i, com.google.api.ads.adwords.axis.v201802.cm.Criterion _value) {
        this.criteria[i] = _value;
    }


    /**
     * Gets the networkSetting value for this CampaignEstimateRequest.
     * 
     * @return networkSetting   * A {@link NetworkSetting} to be used for this Campaign. The
     * value of this
     *                     field overrides the current targets in the Campaign
     * specified by
     *                     {@link #campaignId}.
     *                     
     *                     <p>For non Google partner accounts, only
     *                     {@link NetworkSetting#targetGoogleSearch} and
     *                     {@link NetworkSetting#targetSearchNetwork} are
     * supported, they may be
     *                     combined to sum the estimates.
     *                     
     *                     <p>For some Google partner accounts, in addition
     * {@link NetworkSetting#getTargetPartnerSearchNetwork} is supported.
     * 
     *                     <p>If all request network settings and Campaign's
     * network settings are
     *                     empty, the default is {@link NetworkSetting#targetGoogleSearch}.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting getNetworkSetting() {
        return networkSetting;
    }


    /**
     * Sets the networkSetting value for this CampaignEstimateRequest.
     * 
     * @param networkSetting   * A {@link NetworkSetting} to be used for this Campaign. The
     * value of this
     *                     field overrides the current targets in the Campaign
     * specified by
     *                     {@link #campaignId}.
     *                     
     *                     <p>For non Google partner accounts, only
     *                     {@link NetworkSetting#targetGoogleSearch} and
     *                     {@link NetworkSetting#targetSearchNetwork} are
     * supported, they may be
     *                     combined to sum the estimates.
     *                     
     *                     <p>For some Google partner accounts, in addition
     * {@link NetworkSetting#getTargetPartnerSearchNetwork} is supported.
     * 
     *                     <p>If all request network settings and Campaign's
     * network settings are
     *                     empty, the default is {@link NetworkSetting#targetGoogleSearch}.
     */
    public void setNetworkSetting(com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting networkSetting) {
        this.networkSetting = networkSetting;
    }


    /**
     * Gets the dailyBudget value for this CampaignEstimateRequest.
     * 
     * @return dailyBudget   * Daily campaign budget to use in traffic estimation.  If not
     * specified,
     *                     the daily budget is unlimited.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getDailyBudget() {
        return dailyBudget;
    }


    /**
     * Sets the dailyBudget value for this CampaignEstimateRequest.
     * 
     * @param dailyBudget   * Daily campaign budget to use in traffic estimation.  If not
     * specified,
     *                     the daily budget is unlimited.
     */
    public void setDailyBudget(com.google.api.ads.adwords.axis.v201802.cm.Money dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignEstimateRequest)) return false;
        CampaignEstimateRequest other = (CampaignEstimateRequest) obj;
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
            ((this.adGroupEstimateRequests==null && other.getAdGroupEstimateRequests()==null) || 
             (this.adGroupEstimateRequests!=null &&
              java.util.Arrays.equals(this.adGroupEstimateRequests, other.getAdGroupEstimateRequests()))) &&
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              java.util.Arrays.equals(this.criteria, other.getCriteria()))) &&
            ((this.networkSetting==null && other.getNetworkSetting()==null) || 
             (this.networkSetting!=null &&
              this.networkSetting.equals(other.getNetworkSetting()))) &&
            ((this.dailyBudget==null && other.getDailyBudget()==null) || 
             (this.dailyBudget!=null &&
              this.dailyBudget.equals(other.getDailyBudget())));
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
        if (getAdGroupEstimateRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupEstimateRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupEstimateRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkSetting() != null) {
            _hashCode += getNetworkSetting().hashCode();
        }
        if (getDailyBudget() != null) {
            _hashCode += getDailyBudget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignEstimateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "CampaignEstimateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupEstimateRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "adGroupEstimateRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "AdGroupEstimateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "networkSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NetworkSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "dailyBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
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
