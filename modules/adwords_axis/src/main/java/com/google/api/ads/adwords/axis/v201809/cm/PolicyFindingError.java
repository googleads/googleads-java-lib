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
 * PolicyFindingError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Error indicating that an entity will be disapproved unless changes
 * are made to it before it is
 *             saved. This error occurs when the entity will have a policy
 * summary that includes a PROHIBITED
 *             policy topic entry.
 */
public class PolicyFindingError  extends com.google.api.ads.adwords.axis.v201809.cm.ApiError  implements java.io.Serializable {
    /* Error reason enum. */
    private com.google.api.ads.adwords.axis.v201809.cm.PolicyFindingErrorReason reason;

    /* Policy summary containing the policy topic that caused the
     * error. */
    private com.google.api.ads.adwords.axis.v201809.cm.PolicySummary policySummary;

    public PolicyFindingError() {
    }

    public PolicyFindingError(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201809.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201809.cm.PolicyFindingErrorReason reason,
           com.google.api.ads.adwords.axis.v201809.cm.PolicySummary policySummary) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.policySummary = policySummary;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("apiErrorType", getApiErrorType())
            .add("errorString", getErrorString())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("policySummary", getPolicySummary())
            .add("reason", getReason())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the reason value for this PolicyFindingError.
     * 
     * @return reason   * Error reason enum.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.PolicyFindingErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this PolicyFindingError.
     * 
     * @param reason   * Error reason enum.
     */
    public void setReason(com.google.api.ads.adwords.axis.v201809.cm.PolicyFindingErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the policySummary value for this PolicyFindingError.
     * 
     * @return policySummary   * Policy summary containing the policy topic that caused the
     * error.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.PolicySummary getPolicySummary() {
        return policySummary;
    }


    /**
     * Sets the policySummary value for this PolicyFindingError.
     * 
     * @param policySummary   * Policy summary containing the policy topic that caused the
     * error.
     */
    public void setPolicySummary(com.google.api.ads.adwords.axis.v201809.cm.PolicySummary policySummary) {
        this.policySummary = policySummary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyFindingError)) return false;
        PolicyFindingError other = (PolicyFindingError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.policySummary==null && other.getPolicySummary()==null) || 
             (this.policySummary!=null &&
              this.policySummary.equals(other.getPolicySummary())));
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getPolicySummary() != null) {
            _hashCode += getPolicySummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyFindingError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicyFindingError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicyFindingError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policySummary");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "policySummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicySummary"));
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
