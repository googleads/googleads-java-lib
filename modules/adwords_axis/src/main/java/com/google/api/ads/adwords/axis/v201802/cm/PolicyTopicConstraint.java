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
 * PolicyTopicConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A target which caused a policy finding.
 */
public abstract class PolicyTopicConstraint  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraintPolicyTopicConstraintType constraintType;

    /* Indicates that this instance is a subtype of PolicyTopicConstraint.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String policyTopicConstraintType;

    public PolicyTopicConstraint() {
    }

    public PolicyTopicConstraint(
           com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraintPolicyTopicConstraintType constraintType,
           java.lang.String policyTopicConstraintType) {
           this.constraintType = constraintType;
           this.policyTopicConstraintType = policyTopicConstraintType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("constraintType", getConstraintType())
            .add("policyTopicConstraintType", getPolicyTopicConstraintType())
            .toString();
    }

    /**
     * Gets the constraintType value for this PolicyTopicConstraint.
     * 
     * @return constraintType
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraintPolicyTopicConstraintType getConstraintType() {
        return constraintType;
    }


    /**
     * Sets the constraintType value for this PolicyTopicConstraint.
     * 
     * @param constraintType
     */
    public void setConstraintType(com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraintPolicyTopicConstraintType constraintType) {
        this.constraintType = constraintType;
    }


    /**
     * Gets the policyTopicConstraintType value for this PolicyTopicConstraint.
     * 
     * @return policyTopicConstraintType   * Indicates that this instance is a subtype of PolicyTopicConstraint.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getPolicyTopicConstraintType() {
        return policyTopicConstraintType;
    }


    /**
     * Sets the policyTopicConstraintType value for this PolicyTopicConstraint.
     * 
     * @param policyTopicConstraintType   * Indicates that this instance is a subtype of PolicyTopicConstraint.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setPolicyTopicConstraintType(java.lang.String policyTopicConstraintType) {
        this.policyTopicConstraintType = policyTopicConstraintType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyTopicConstraint)) return false;
        PolicyTopicConstraint other = (PolicyTopicConstraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.constraintType==null && other.getConstraintType()==null) || 
             (this.constraintType!=null &&
              this.constraintType.equals(other.getConstraintType()))) &&
            ((this.policyTopicConstraintType==null && other.getPolicyTopicConstraintType()==null) || 
             (this.policyTopicConstraintType!=null &&
              this.policyTopicConstraintType.equals(other.getPolicyTopicConstraintType())));
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
        if (getConstraintType() != null) {
            _hashCode += getConstraintType().hashCode();
        }
        if (getPolicyTopicConstraintType() != null) {
            _hashCode += getPolicyTopicConstraintType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyTopicConstraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicConstraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "constraintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicConstraint.PolicyTopicConstraintType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicConstraintType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicConstraint.Type"));
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
