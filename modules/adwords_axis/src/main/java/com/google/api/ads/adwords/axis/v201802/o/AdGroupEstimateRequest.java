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
 * AdGroupEstimateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Represents an ad group that will be estimated. Ad groups may be
 * all
 *             new or all existing, or a mixture of new and existing.
 * Only existing
 *             campaigns can contain estimates for existing ad groups.<p>
 * 
 *             <p>To make a keyword estimates request in which estimates
 * do not consider
 *             existing account information (e.g. historical ad group
 * performance), set both
 *             {@link #adGroupId} and the enclosing {@link CampaignEstimateRequest}'s
 * {@code campaignId} to {@code null}.
 *             
 *             <p>For more details on usage, refer to document at
 *             {@link CampaignEstimateRequest}.
 */
public class AdGroupEstimateRequest  extends com.google.api.ads.adwords.axis.v201802.o.EstimateRequest  implements java.io.Serializable {
    /* The adGroupId for an ad group that belongs to the containing
     * campaign from
     *                     {@link CampaignEstimateRequest} or {@code null}.
     * 
     *                     <p>For usage, refer to document from {@link CampaignEstimateRequest}. */
    private java.lang.Long adGroupId;

    /* The keywords to estimate.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.KeywordEstimateRequest[] keywordEstimateRequests;

    /* The max CPC bid to use for estimates for this ad group.
     *                     
     *                     <p>This value overrides the max CPC of AdGroup
     * specified by
     *                     {@link #adGroupId}. */
    private com.google.api.ads.adwords.axis.v201802.cm.Money maxCpc;

    public AdGroupEstimateRequest() {
    }

    public AdGroupEstimateRequest(
           java.lang.String estimateRequestType,
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201802.o.KeywordEstimateRequest[] keywordEstimateRequests,
           com.google.api.ads.adwords.axis.v201802.cm.Money maxCpc) {
        super(
            estimateRequestType);
        this.adGroupId = adGroupId;
        this.keywordEstimateRequests = keywordEstimateRequests;
        this.maxCpc = maxCpc;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("estimateRequestType", getEstimateRequestType())
            .add("keywordEstimateRequests", getKeywordEstimateRequests())
            .add("maxCpc", getMaxCpc())
            .toString();
    }

    /**
     * Gets the adGroupId value for this AdGroupEstimateRequest.
     * 
     * @return adGroupId   * The adGroupId for an ad group that belongs to the containing
     * campaign from
     *                     {@link CampaignEstimateRequest} or {@code null}.
     * 
     *                     <p>For usage, refer to document from {@link CampaignEstimateRequest}.
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupEstimateRequest.
     * 
     * @param adGroupId   * The adGroupId for an ad group that belongs to the containing
     * campaign from
     *                     {@link CampaignEstimateRequest} or {@code null}.
     * 
     *                     <p>For usage, refer to document from {@link CampaignEstimateRequest}.
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the keywordEstimateRequests value for this AdGroupEstimateRequest.
     * 
     * @return keywordEstimateRequests   * The keywords to estimate.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.KeywordEstimateRequest[] getKeywordEstimateRequests() {
        return keywordEstimateRequests;
    }


    /**
     * Sets the keywordEstimateRequests value for this AdGroupEstimateRequest.
     * 
     * @param keywordEstimateRequests   * The keywords to estimate.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setKeywordEstimateRequests(com.google.api.ads.adwords.axis.v201802.o.KeywordEstimateRequest[] keywordEstimateRequests) {
        this.keywordEstimateRequests = keywordEstimateRequests;
    }

    public com.google.api.ads.adwords.axis.v201802.o.KeywordEstimateRequest getKeywordEstimateRequests(int i) {
        return this.keywordEstimateRequests[i];
    }

    public void setKeywordEstimateRequests(int i, com.google.api.ads.adwords.axis.v201802.o.KeywordEstimateRequest _value) {
        this.keywordEstimateRequests[i] = _value;
    }


    /**
     * Gets the maxCpc value for this AdGroupEstimateRequest.
     * 
     * @return maxCpc   * The max CPC bid to use for estimates for this ad group.
     *                     
     *                     <p>This value overrides the max CPC of AdGroup
     * specified by
     *                     {@link #adGroupId}.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getMaxCpc() {
        return maxCpc;
    }


    /**
     * Sets the maxCpc value for this AdGroupEstimateRequest.
     * 
     * @param maxCpc   * The max CPC bid to use for estimates for this ad group.
     *                     
     *                     <p>This value overrides the max CPC of AdGroup
     * specified by
     *                     {@link #adGroupId}.
     */
    public void setMaxCpc(com.google.api.ads.adwords.axis.v201802.cm.Money maxCpc) {
        this.maxCpc = maxCpc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupEstimateRequest)) return false;
        AdGroupEstimateRequest other = (AdGroupEstimateRequest) obj;
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
            ((this.keywordEstimateRequests==null && other.getKeywordEstimateRequests()==null) || 
             (this.keywordEstimateRequests!=null &&
              java.util.Arrays.equals(this.keywordEstimateRequests, other.getKeywordEstimateRequests()))) &&
            ((this.maxCpc==null && other.getMaxCpc()==null) || 
             (this.maxCpc!=null &&
              this.maxCpc.equals(other.getMaxCpc())));
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
        if (getKeywordEstimateRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordEstimateRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordEstimateRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxCpc() != null) {
            _hashCode += getMaxCpc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupEstimateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "AdGroupEstimateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordEstimateRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "keywordEstimateRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "KeywordEstimateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "maxCpc"));
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
