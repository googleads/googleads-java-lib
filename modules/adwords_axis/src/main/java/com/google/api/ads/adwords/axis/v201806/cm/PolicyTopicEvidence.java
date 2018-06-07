// Copyright 2018 Google LLC
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
 * PolicyTopicEvidence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;


/**
 * Evidence that caused this policy topic to be reported.
 */
public class PolicyTopicEvidence  implements java.io.Serializable {
    /* The type of evidence for the policy topic. */
    private com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceType policyTopicEvidenceType;

    /* The actual evidence that triggered this policy topic to be
     * reported. This field is associated
     *                 with the policyTopicEvidenceType. So for example,
     * when policyTopicEvidenceType is AD_TEXT,
     *                 the evidence is the texts associated with the Ad. */
    private java.lang.String[] evidenceTextList;

    /* The url types that triggered this policy topic to be reported.
     * This field is associated with
     *                 the policyTopicEvidenceType and will only be populated
     * when it has value of
     *                 DESTINATION_MISMATCH. So for example, when policyTopicEvidenceType
     * is DESTINATION_MISMATCH,
     *                 policyTopicEvidenceDestinationMismatchUrlTypes will
     * be populated with mismatched url types,
     *                 DISPLAY_URL, FINAL_URL and/or FINAL_MOBILE_URL. */
    private com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceDestinationMismatchUrlType[] policyTopicEvidenceDestinationMismatchUrlTypes;

    public PolicyTopicEvidence() {
    }

    public PolicyTopicEvidence(
           com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceType policyTopicEvidenceType,
           java.lang.String[] evidenceTextList,
           com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceDestinationMismatchUrlType[] policyTopicEvidenceDestinationMismatchUrlTypes) {
           this.policyTopicEvidenceType = policyTopicEvidenceType;
           this.evidenceTextList = evidenceTextList;
           this.policyTopicEvidenceDestinationMismatchUrlTypes = policyTopicEvidenceDestinationMismatchUrlTypes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("evidenceTextList", getEvidenceTextList())
            .add("policyTopicEvidenceDestinationMismatchUrlTypes", getPolicyTopicEvidenceDestinationMismatchUrlTypes())
            .add("policyTopicEvidenceType", getPolicyTopicEvidenceType())
            .toString();
    }

    /**
     * Gets the policyTopicEvidenceType value for this PolicyTopicEvidence.
     * 
     * @return policyTopicEvidenceType   * The type of evidence for the policy topic.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceType getPolicyTopicEvidenceType() {
        return policyTopicEvidenceType;
    }


    /**
     * Sets the policyTopicEvidenceType value for this PolicyTopicEvidence.
     * 
     * @param policyTopicEvidenceType   * The type of evidence for the policy topic.
     */
    public void setPolicyTopicEvidenceType(com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceType policyTopicEvidenceType) {
        this.policyTopicEvidenceType = policyTopicEvidenceType;
    }


    /**
     * Gets the evidenceTextList value for this PolicyTopicEvidence.
     * 
     * @return evidenceTextList   * The actual evidence that triggered this policy topic to be
     * reported. This field is associated
     *                 with the policyTopicEvidenceType. So for example,
     * when policyTopicEvidenceType is AD_TEXT,
     *                 the evidence is the texts associated with the Ad.
     */
    public java.lang.String[] getEvidenceTextList() {
        return evidenceTextList;
    }


    /**
     * Sets the evidenceTextList value for this PolicyTopicEvidence.
     * 
     * @param evidenceTextList   * The actual evidence that triggered this policy topic to be
     * reported. This field is associated
     *                 with the policyTopicEvidenceType. So for example,
     * when policyTopicEvidenceType is AD_TEXT,
     *                 the evidence is the texts associated with the Ad.
     */
    public void setEvidenceTextList(java.lang.String[] evidenceTextList) {
        this.evidenceTextList = evidenceTextList;
    }

    public java.lang.String getEvidenceTextList(int i) {
        return this.evidenceTextList[i];
    }

    public void setEvidenceTextList(int i, java.lang.String _value) {
        this.evidenceTextList[i] = _value;
    }


    /**
     * Gets the policyTopicEvidenceDestinationMismatchUrlTypes value for this PolicyTopicEvidence.
     * 
     * @return policyTopicEvidenceDestinationMismatchUrlTypes   * The url types that triggered this policy topic to be reported.
     * This field is associated with
     *                 the policyTopicEvidenceType and will only be populated
     * when it has value of
     *                 DESTINATION_MISMATCH. So for example, when policyTopicEvidenceType
     * is DESTINATION_MISMATCH,
     *                 policyTopicEvidenceDestinationMismatchUrlTypes will
     * be populated with mismatched url types,
     *                 DISPLAY_URL, FINAL_URL and/or FINAL_MOBILE_URL.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceDestinationMismatchUrlType[] getPolicyTopicEvidenceDestinationMismatchUrlTypes() {
        return policyTopicEvidenceDestinationMismatchUrlTypes;
    }


    /**
     * Sets the policyTopicEvidenceDestinationMismatchUrlTypes value for this PolicyTopicEvidence.
     * 
     * @param policyTopicEvidenceDestinationMismatchUrlTypes   * The url types that triggered this policy topic to be reported.
     * This field is associated with
     *                 the policyTopicEvidenceType and will only be populated
     * when it has value of
     *                 DESTINATION_MISMATCH. So for example, when policyTopicEvidenceType
     * is DESTINATION_MISMATCH,
     *                 policyTopicEvidenceDestinationMismatchUrlTypes will
     * be populated with mismatched url types,
     *                 DISPLAY_URL, FINAL_URL and/or FINAL_MOBILE_URL.
     */
    public void setPolicyTopicEvidenceDestinationMismatchUrlTypes(com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceDestinationMismatchUrlType[] policyTopicEvidenceDestinationMismatchUrlTypes) {
        this.policyTopicEvidenceDestinationMismatchUrlTypes = policyTopicEvidenceDestinationMismatchUrlTypes;
    }

    public com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceDestinationMismatchUrlType getPolicyTopicEvidenceDestinationMismatchUrlTypes(int i) {
        return this.policyTopicEvidenceDestinationMismatchUrlTypes[i];
    }

    public void setPolicyTopicEvidenceDestinationMismatchUrlTypes(int i, com.google.api.ads.adwords.axis.v201806.cm.PolicyTopicEvidenceDestinationMismatchUrlType _value) {
        this.policyTopicEvidenceDestinationMismatchUrlTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyTopicEvidence)) return false;
        PolicyTopicEvidence other = (PolicyTopicEvidence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyTopicEvidenceType==null && other.getPolicyTopicEvidenceType()==null) || 
             (this.policyTopicEvidenceType!=null &&
              this.policyTopicEvidenceType.equals(other.getPolicyTopicEvidenceType()))) &&
            ((this.evidenceTextList==null && other.getEvidenceTextList()==null) || 
             (this.evidenceTextList!=null &&
              java.util.Arrays.equals(this.evidenceTextList, other.getEvidenceTextList()))) &&
            ((this.policyTopicEvidenceDestinationMismatchUrlTypes==null && other.getPolicyTopicEvidenceDestinationMismatchUrlTypes()==null) || 
             (this.policyTopicEvidenceDestinationMismatchUrlTypes!=null &&
              java.util.Arrays.equals(this.policyTopicEvidenceDestinationMismatchUrlTypes, other.getPolicyTopicEvidenceDestinationMismatchUrlTypes())));
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
        if (getPolicyTopicEvidenceType() != null) {
            _hashCode += getPolicyTopicEvidenceType().hashCode();
        }
        if (getEvidenceTextList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvidenceTextList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvidenceTextList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyTopicEvidenceDestinationMismatchUrlTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyTopicEvidenceDestinationMismatchUrlTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyTopicEvidenceDestinationMismatchUrlTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyTopicEvidence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "PolicyTopicEvidence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEvidenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "policyTopicEvidenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "PolicyTopicEvidenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evidenceTextList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "evidenceTextList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEvidenceDestinationMismatchUrlTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "policyTopicEvidenceDestinationMismatchUrlTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "PolicyTopicEvidenceDestinationMismatchUrlType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
