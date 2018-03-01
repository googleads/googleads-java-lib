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
 * PolicyTopicEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Contains Ads Policy decisions.
 */
public class PolicyTopicEntry  implements java.io.Serializable {
    /* The type of the policy topic entry. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntryType policyTopicEntryType;

    /* The policy topic evidences associated with this policy topic
     * entry. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidence[] policyTopicEvidences;

    /* The targeting constraints to which this PolicyTopicEntry is
     * related. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint[] policyTopicConstraints;

    /* The policy topic id.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String policyTopicId;

    /* The policy topic name (in English).
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String policyTopicName;

    /* URL of the help center article describing this policy topic
     * entry.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String policyTopicHelpCenterUrl;

    public PolicyTopicEntry() {
    }

    public PolicyTopicEntry(
           com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntryType policyTopicEntryType,
           com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidence[] policyTopicEvidences,
           com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint[] policyTopicConstraints,
           java.lang.String policyTopicId,
           java.lang.String policyTopicName,
           java.lang.String policyTopicHelpCenterUrl) {
           this.policyTopicEntryType = policyTopicEntryType;
           this.policyTopicEvidences = policyTopicEvidences;
           this.policyTopicConstraints = policyTopicConstraints;
           this.policyTopicId = policyTopicId;
           this.policyTopicName = policyTopicName;
           this.policyTopicHelpCenterUrl = policyTopicHelpCenterUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("policyTopicConstraints", getPolicyTopicConstraints())
            .add("policyTopicEntryType", getPolicyTopicEntryType())
            .add("policyTopicEvidences", getPolicyTopicEvidences())
            .add("policyTopicHelpCenterUrl", getPolicyTopicHelpCenterUrl())
            .add("policyTopicId", getPolicyTopicId())
            .add("policyTopicName", getPolicyTopicName())
            .toString();
    }

    /**
     * Gets the policyTopicEntryType value for this PolicyTopicEntry.
     * 
     * @return policyTopicEntryType   * The type of the policy topic entry.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntryType getPolicyTopicEntryType() {
        return policyTopicEntryType;
    }


    /**
     * Sets the policyTopicEntryType value for this PolicyTopicEntry.
     * 
     * @param policyTopicEntryType   * The type of the policy topic entry.
     */
    public void setPolicyTopicEntryType(com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntryType policyTopicEntryType) {
        this.policyTopicEntryType = policyTopicEntryType;
    }


    /**
     * Gets the policyTopicEvidences value for this PolicyTopicEntry.
     * 
     * @return policyTopicEvidences   * The policy topic evidences associated with this policy topic
     * entry.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidence[] getPolicyTopicEvidences() {
        return policyTopicEvidences;
    }


    /**
     * Sets the policyTopicEvidences value for this PolicyTopicEntry.
     * 
     * @param policyTopicEvidences   * The policy topic evidences associated with this policy topic
     * entry.
     */
    public void setPolicyTopicEvidences(com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidence[] policyTopicEvidences) {
        this.policyTopicEvidences = policyTopicEvidences;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidence getPolicyTopicEvidences(int i) {
        return this.policyTopicEvidences[i];
    }

    public void setPolicyTopicEvidences(int i, com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidence _value) {
        this.policyTopicEvidences[i] = _value;
    }


    /**
     * Gets the policyTopicConstraints value for this PolicyTopicEntry.
     * 
     * @return policyTopicConstraints   * The targeting constraints to which this PolicyTopicEntry is
     * related.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint[] getPolicyTopicConstraints() {
        return policyTopicConstraints;
    }


    /**
     * Sets the policyTopicConstraints value for this PolicyTopicEntry.
     * 
     * @param policyTopicConstraints   * The targeting constraints to which this PolicyTopicEntry is
     * related.
     */
    public void setPolicyTopicConstraints(com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint[] policyTopicConstraints) {
        this.policyTopicConstraints = policyTopicConstraints;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint getPolicyTopicConstraints(int i) {
        return this.policyTopicConstraints[i];
    }

    public void setPolicyTopicConstraints(int i, com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint _value) {
        this.policyTopicConstraints[i] = _value;
    }


    /**
     * Gets the policyTopicId value for this PolicyTopicEntry.
     * 
     * @return policyTopicId   * The policy topic id.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getPolicyTopicId() {
        return policyTopicId;
    }


    /**
     * Sets the policyTopicId value for this PolicyTopicEntry.
     * 
     * @param policyTopicId   * The policy topic id.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPolicyTopicId(java.lang.String policyTopicId) {
        this.policyTopicId = policyTopicId;
    }


    /**
     * Gets the policyTopicName value for this PolicyTopicEntry.
     * 
     * @return policyTopicName   * The policy topic name (in English).
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getPolicyTopicName() {
        return policyTopicName;
    }


    /**
     * Sets the policyTopicName value for this PolicyTopicEntry.
     * 
     * @param policyTopicName   * The policy topic name (in English).
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPolicyTopicName(java.lang.String policyTopicName) {
        this.policyTopicName = policyTopicName;
    }


    /**
     * Gets the policyTopicHelpCenterUrl value for this PolicyTopicEntry.
     * 
     * @return policyTopicHelpCenterUrl   * URL of the help center article describing this policy topic
     * entry.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getPolicyTopicHelpCenterUrl() {
        return policyTopicHelpCenterUrl;
    }


    /**
     * Sets the policyTopicHelpCenterUrl value for this PolicyTopicEntry.
     * 
     * @param policyTopicHelpCenterUrl   * URL of the help center article describing this policy topic
     * entry.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPolicyTopicHelpCenterUrl(java.lang.String policyTopicHelpCenterUrl) {
        this.policyTopicHelpCenterUrl = policyTopicHelpCenterUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyTopicEntry)) return false;
        PolicyTopicEntry other = (PolicyTopicEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyTopicEntryType==null && other.getPolicyTopicEntryType()==null) || 
             (this.policyTopicEntryType!=null &&
              this.policyTopicEntryType.equals(other.getPolicyTopicEntryType()))) &&
            ((this.policyTopicEvidences==null && other.getPolicyTopicEvidences()==null) || 
             (this.policyTopicEvidences!=null &&
              java.util.Arrays.equals(this.policyTopicEvidences, other.getPolicyTopicEvidences()))) &&
            ((this.policyTopicConstraints==null && other.getPolicyTopicConstraints()==null) || 
             (this.policyTopicConstraints!=null &&
              java.util.Arrays.equals(this.policyTopicConstraints, other.getPolicyTopicConstraints()))) &&
            ((this.policyTopicId==null && other.getPolicyTopicId()==null) || 
             (this.policyTopicId!=null &&
              this.policyTopicId.equals(other.getPolicyTopicId()))) &&
            ((this.policyTopicName==null && other.getPolicyTopicName()==null) || 
             (this.policyTopicName!=null &&
              this.policyTopicName.equals(other.getPolicyTopicName()))) &&
            ((this.policyTopicHelpCenterUrl==null && other.getPolicyTopicHelpCenterUrl()==null) || 
             (this.policyTopicHelpCenterUrl!=null &&
              this.policyTopicHelpCenterUrl.equals(other.getPolicyTopicHelpCenterUrl())));
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
        if (getPolicyTopicEntryType() != null) {
            _hashCode += getPolicyTopicEntryType().hashCode();
        }
        if (getPolicyTopicEvidences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyTopicEvidences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyTopicEvidences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyTopicConstraints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyTopicConstraints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyTopicConstraints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyTopicId() != null) {
            _hashCode += getPolicyTopicId().hashCode();
        }
        if (getPolicyTopicName() != null) {
            _hashCode += getPolicyTopicName().hashCode();
        }
        if (getPolicyTopicHelpCenterUrl() != null) {
            _hashCode += getPolicyTopicHelpCenterUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyTopicEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEntryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicEntryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEntryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEvidences");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicEvidences"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEvidence"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicConstraints");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicConstraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicHelpCenterUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyTopicHelpCenterUrl"));
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
