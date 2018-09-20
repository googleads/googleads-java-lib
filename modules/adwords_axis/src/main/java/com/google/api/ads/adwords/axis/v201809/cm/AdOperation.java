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
 * AdOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Ad service operations.
 */
public class AdOperation  extends com.google.api.ads.adwords.axis.v201809.cm.Operation  implements java.io.Serializable {
    /* Ad to operate on.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.Ad operand;

    /* Exemption requests for any policy violations in this Ad. */
    private com.google.api.ads.adwords.axis.v201809.cm.ExemptionRequest[] exemptionRequests;

    /* The list of policy topic IDs that should not cause a PolicyFindingError
     * to be reported. If the
     *                     up front policy check produces a policy summary
     * containing PROHIBITED or FULLY_LIMITED policy
     *                     topic entries of these types, the reviewable entities
     * will be saved without reporting an error.
     *                     The reviewable entities will not be eligible to
     * serve until they pass the policy check.
     *                     
     *                     <p>This field accepts returned policyTopicId from
     * PolicyTopicEntry in the PolicyFindingError. */
    private java.lang.String[] ignorablePolicyTopicIds;

    public AdOperation() {
    }

    public AdOperation(
           com.google.api.ads.adwords.axis.v201809.cm.Operator operator,
           java.lang.String operationType,
           com.google.api.ads.adwords.axis.v201809.cm.Ad operand,
           com.google.api.ads.adwords.axis.v201809.cm.ExemptionRequest[] exemptionRequests,
           java.lang.String[] ignorablePolicyTopicIds) {
        super(
            operator,
            operationType);
        this.operand = operand;
        this.exemptionRequests = exemptionRequests;
        this.ignorablePolicyTopicIds = ignorablePolicyTopicIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("exemptionRequests", getExemptionRequests())
            .add("ignorablePolicyTopicIds", getIgnorablePolicyTopicIds())
            .add("operand", getOperand())
            .add("operationType", getOperationType())
            .add("operator", getOperator())
            .toString();
    }

    /**
     * Gets the operand value for this AdOperation.
     * 
     * @return operand   * Ad to operate on.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.Ad getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this AdOperation.
     * 
     * @param operand   * Ad to operate on.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setOperand(com.google.api.ads.adwords.axis.v201809.cm.Ad operand) {
        this.operand = operand;
    }


    /**
     * Gets the exemptionRequests value for this AdOperation.
     * 
     * @return exemptionRequests   * Exemption requests for any policy violations in this Ad.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.ExemptionRequest[] getExemptionRequests() {
        return exemptionRequests;
    }


    /**
     * Sets the exemptionRequests value for this AdOperation.
     * 
     * @param exemptionRequests   * Exemption requests for any policy violations in this Ad.
     */
    public void setExemptionRequests(com.google.api.ads.adwords.axis.v201809.cm.ExemptionRequest[] exemptionRequests) {
        this.exemptionRequests = exemptionRequests;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.ExemptionRequest getExemptionRequests(int i) {
        return this.exemptionRequests[i];
    }

    public void setExemptionRequests(int i, com.google.api.ads.adwords.axis.v201809.cm.ExemptionRequest _value) {
        this.exemptionRequests[i] = _value;
    }


    /**
     * Gets the ignorablePolicyTopicIds value for this AdOperation.
     * 
     * @return ignorablePolicyTopicIds   * The list of policy topic IDs that should not cause a PolicyFindingError
     * to be reported. If the
     *                     up front policy check produces a policy summary
     * containing PROHIBITED or FULLY_LIMITED policy
     *                     topic entries of these types, the reviewable entities
     * will be saved without reporting an error.
     *                     The reviewable entities will not be eligible to
     * serve until they pass the policy check.
     *                     
     *                     <p>This field accepts returned policyTopicId from
     * PolicyTopicEntry in the PolicyFindingError.
     */
    public java.lang.String[] getIgnorablePolicyTopicIds() {
        return ignorablePolicyTopicIds;
    }


    /**
     * Sets the ignorablePolicyTopicIds value for this AdOperation.
     * 
     * @param ignorablePolicyTopicIds   * The list of policy topic IDs that should not cause a PolicyFindingError
     * to be reported. If the
     *                     up front policy check produces a policy summary
     * containing PROHIBITED or FULLY_LIMITED policy
     *                     topic entries of these types, the reviewable entities
     * will be saved without reporting an error.
     *                     The reviewable entities will not be eligible to
     * serve until they pass the policy check.
     *                     
     *                     <p>This field accepts returned policyTopicId from
     * PolicyTopicEntry in the PolicyFindingError.
     */
    public void setIgnorablePolicyTopicIds(java.lang.String[] ignorablePolicyTopicIds) {
        this.ignorablePolicyTopicIds = ignorablePolicyTopicIds;
    }

    public java.lang.String getIgnorablePolicyTopicIds(int i) {
        return this.ignorablePolicyTopicIds[i];
    }

    public void setIgnorablePolicyTopicIds(int i, java.lang.String _value) {
        this.ignorablePolicyTopicIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdOperation)) return false;
        AdOperation other = (AdOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              this.operand.equals(other.getOperand()))) &&
            ((this.exemptionRequests==null && other.getExemptionRequests()==null) || 
             (this.exemptionRequests!=null &&
              java.util.Arrays.equals(this.exemptionRequests, other.getExemptionRequests()))) &&
            ((this.ignorablePolicyTopicIds==null && other.getIgnorablePolicyTopicIds()==null) || 
             (this.ignorablePolicyTopicIds!=null &&
              java.util.Arrays.equals(this.ignorablePolicyTopicIds, other.getIgnorablePolicyTopicIds())));
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
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        if (getExemptionRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExemptionRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExemptionRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIgnorablePolicyTopicIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIgnorablePolicyTopicIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIgnorablePolicyTopicIds(), i);
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
        new org.apache.axis.description.TypeDesc(AdOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Ad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptionRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "exemptionRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ExemptionRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignorablePolicyTopicIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ignorablePolicyTopicIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
