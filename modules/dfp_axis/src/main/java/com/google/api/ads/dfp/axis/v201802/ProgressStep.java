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
 * ProgressStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Describes a step in a workflow.
 */
public class ProgressStep  implements java.io.Serializable {
    /* The rules in this step. */
    private com.google.api.ads.dfp.axis.v201802.ProgressRule[] rules;

    /* The status of this step. */
    private com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus;

    public ProgressStep() {
    }

    public ProgressStep(
           com.google.api.ads.dfp.axis.v201802.ProgressRule[] rules,
           com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus) {
           this.rules = rules;
           this.evaluationStatus = evaluationStatus;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("evaluationStatus", getEvaluationStatus())
            .add("rules", getRules())
            .toString();
    }

    /**
     * Gets the rules value for this ProgressStep.
     * 
     * @return rules   * The rules in this step.
     */
    public com.google.api.ads.dfp.axis.v201802.ProgressRule[] getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this ProgressStep.
     * 
     * @param rules   * The rules in this step.
     */
    public void setRules(com.google.api.ads.dfp.axis.v201802.ProgressRule[] rules) {
        this.rules = rules;
    }

    public com.google.api.ads.dfp.axis.v201802.ProgressRule getRules(int i) {
        return this.rules[i];
    }

    public void setRules(int i, com.google.api.ads.dfp.axis.v201802.ProgressRule _value) {
        this.rules[i] = _value;
    }


    /**
     * Gets the evaluationStatus value for this ProgressStep.
     * 
     * @return evaluationStatus   * The status of this step.
     */
    public com.google.api.ads.dfp.axis.v201802.EvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }


    /**
     * Sets the evaluationStatus value for this ProgressStep.
     * 
     * @param evaluationStatus   * The status of this step.
     */
    public void setEvaluationStatus(com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgressStep)) return false;
        ProgressStep other = (ProgressStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              java.util.Arrays.equals(this.rules, other.getRules()))) &&
            ((this.evaluationStatus==null && other.getEvaluationStatus()==null) || 
             (this.evaluationStatus!=null &&
              this.evaluationStatus.equals(other.getEvaluationStatus())));
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
        if (getRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvaluationStatus() != null) {
            _hashCode += getEvaluationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgressStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgressStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgressRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "evaluationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "EvaluationStatus"));
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
