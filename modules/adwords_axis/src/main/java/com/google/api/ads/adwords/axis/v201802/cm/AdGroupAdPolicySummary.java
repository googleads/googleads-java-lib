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
 * AdGroupAdPolicySummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Contains policy information for an ad.
 */
public class AdGroupAdPolicySummary  implements java.io.Serializable {
    /* List of policy findings. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] policyTopicEntries;

    /* Progress through the review process. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryReviewState reviewState;

    /* Overall review status based on the policy topic entries. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryDenormalizedStatus denormalizedStatus;

    /* Approval status that combines review state and status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CombinedApprovalStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyApprovalStatus combinedApprovalStatus;

    public AdGroupAdPolicySummary() {
    }

    public AdGroupAdPolicySummary(
           com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] policyTopicEntries,
           com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryReviewState reviewState,
           com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryDenormalizedStatus denormalizedStatus,
           com.google.api.ads.adwords.axis.v201802.cm.PolicyApprovalStatus combinedApprovalStatus) {
           this.policyTopicEntries = policyTopicEntries;
           this.reviewState = reviewState;
           this.denormalizedStatus = denormalizedStatus;
           this.combinedApprovalStatus = combinedApprovalStatus;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("combinedApprovalStatus", getCombinedApprovalStatus())
            .add("denormalizedStatus", getDenormalizedStatus())
            .add("policyTopicEntries", getPolicyTopicEntries())
            .add("reviewState", getReviewState())
            .toString();
    }

    /**
     * Gets the policyTopicEntries value for this AdGroupAdPolicySummary.
     * 
     * @return policyTopicEntries   * List of policy findings.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] getPolicyTopicEntries() {
        return policyTopicEntries;
    }


    /**
     * Sets the policyTopicEntries value for this AdGroupAdPolicySummary.
     * 
     * @param policyTopicEntries   * List of policy findings.
     */
    public void setPolicyTopicEntries(com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry[] policyTopicEntries) {
        this.policyTopicEntries = policyTopicEntries;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry getPolicyTopicEntries(int i) {
        return this.policyTopicEntries[i];
    }

    public void setPolicyTopicEntries(int i, com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry _value) {
        this.policyTopicEntries[i] = _value;
    }


    /**
     * Gets the reviewState value for this AdGroupAdPolicySummary.
     * 
     * @return reviewState   * Progress through the review process.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryReviewState getReviewState() {
        return reviewState;
    }


    /**
     * Sets the reviewState value for this AdGroupAdPolicySummary.
     * 
     * @param reviewState   * Progress through the review process.
     */
    public void setReviewState(com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryReviewState reviewState) {
        this.reviewState = reviewState;
    }


    /**
     * Gets the denormalizedStatus value for this AdGroupAdPolicySummary.
     * 
     * @return denormalizedStatus   * Overall review status based on the policy topic entries.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryDenormalizedStatus getDenormalizedStatus() {
        return denormalizedStatus;
    }


    /**
     * Sets the denormalizedStatus value for this AdGroupAdPolicySummary.
     * 
     * @param denormalizedStatus   * Overall review status based on the policy topic entries.
     */
    public void setDenormalizedStatus(com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryDenormalizedStatus denormalizedStatus) {
        this.denormalizedStatus = denormalizedStatus;
    }


    /**
     * Gets the combinedApprovalStatus value for this AdGroupAdPolicySummary.
     * 
     * @return combinedApprovalStatus   * Approval status that combines review state and status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CombinedApprovalStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyApprovalStatus getCombinedApprovalStatus() {
        return combinedApprovalStatus;
    }


    /**
     * Sets the combinedApprovalStatus value for this AdGroupAdPolicySummary.
     * 
     * @param combinedApprovalStatus   * Approval status that combines review state and status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CombinedApprovalStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setCombinedApprovalStatus(com.google.api.ads.adwords.axis.v201802.cm.PolicyApprovalStatus combinedApprovalStatus) {
        this.combinedApprovalStatus = combinedApprovalStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupAdPolicySummary)) return false;
        AdGroupAdPolicySummary other = (AdGroupAdPolicySummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyTopicEntries==null && other.getPolicyTopicEntries()==null) || 
             (this.policyTopicEntries!=null &&
              java.util.Arrays.equals(this.policyTopicEntries, other.getPolicyTopicEntries()))) &&
            ((this.reviewState==null && other.getReviewState()==null) || 
             (this.reviewState!=null &&
              this.reviewState.equals(other.getReviewState()))) &&
            ((this.denormalizedStatus==null && other.getDenormalizedStatus()==null) || 
             (this.denormalizedStatus!=null &&
              this.denormalizedStatus.equals(other.getDenormalizedStatus()))) &&
            ((this.combinedApprovalStatus==null && other.getCombinedApprovalStatus()==null) || 
             (this.combinedApprovalStatus!=null &&
              this.combinedApprovalStatus.equals(other.getCombinedApprovalStatus())));
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
        if (getPolicyTopicEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyTopicEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyTopicEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReviewState() != null) {
            _hashCode += getReviewState().hashCode();
        }
        if (getDenormalizedStatus() != null) {
            _hashCode += getDenormalizedStatus().hashCode();
        }
        if (getCombinedApprovalStatus() != null) {
            _hashCode += getCombinedApprovalStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupAdPolicySummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdPolicySummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "reviewState"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicySummaryReviewState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denormalizedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "denormalizedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicySummaryDenormalizedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedApprovalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "combinedApprovalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyApprovalStatus"));
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
