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
 * WorkflowProgress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * The progress indicator of a {@link Proposal proposal's} workflow.
 */
public class WorkflowProgress  implements java.io.Serializable {
    /* The steps in this workflow. */
    private com.google.api.ads.dfp.axis.v201802.ProgressStep[] steps;

    /* The {@link User#Id ID} of the user who submitted the {@link
     * Proposal}. */
    private java.lang.Long submitterId;

    /* The status of this workflow. */
    private com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus;

    /* The {@link DateTime} the proposal was submitted. */
    private com.google.api.ads.dfp.axis.v201802.DateTime submissionTime;

    /* The {@link DateTime} this workflow was evaluated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime;

    /* Whether any offline processing is occurring. */
    private java.lang.Boolean isProcessing;

    public WorkflowProgress() {
    }

    public WorkflowProgress(
           com.google.api.ads.dfp.axis.v201802.ProgressStep[] steps,
           java.lang.Long submitterId,
           com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus,
           com.google.api.ads.dfp.axis.v201802.DateTime submissionTime,
           com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime,
           java.lang.Boolean isProcessing) {
           this.steps = steps;
           this.submitterId = submitterId;
           this.evaluationStatus = evaluationStatus;
           this.submissionTime = submissionTime;
           this.evaluationTime = evaluationTime;
           this.isProcessing = isProcessing;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("evaluationStatus", getEvaluationStatus())
            .add("evaluationTime", getEvaluationTime())
            .add("isProcessing", getIsProcessing())
            .add("steps", getSteps())
            .add("submissionTime", getSubmissionTime())
            .add("submitterId", getSubmitterId())
            .toString();
    }

    /**
     * Gets the steps value for this WorkflowProgress.
     * 
     * @return steps   * The steps in this workflow.
     */
    public com.google.api.ads.dfp.axis.v201802.ProgressStep[] getSteps() {
        return steps;
    }


    /**
     * Sets the steps value for this WorkflowProgress.
     * 
     * @param steps   * The steps in this workflow.
     */
    public void setSteps(com.google.api.ads.dfp.axis.v201802.ProgressStep[] steps) {
        this.steps = steps;
    }

    public com.google.api.ads.dfp.axis.v201802.ProgressStep getSteps(int i) {
        return this.steps[i];
    }

    public void setSteps(int i, com.google.api.ads.dfp.axis.v201802.ProgressStep _value) {
        this.steps[i] = _value;
    }


    /**
     * Gets the submitterId value for this WorkflowProgress.
     * 
     * @return submitterId   * The {@link User#Id ID} of the user who submitted the {@link
     * Proposal}.
     */
    public java.lang.Long getSubmitterId() {
        return submitterId;
    }


    /**
     * Sets the submitterId value for this WorkflowProgress.
     * 
     * @param submitterId   * The {@link User#Id ID} of the user who submitted the {@link
     * Proposal}.
     */
    public void setSubmitterId(java.lang.Long submitterId) {
        this.submitterId = submitterId;
    }


    /**
     * Gets the evaluationStatus value for this WorkflowProgress.
     * 
     * @return evaluationStatus   * The status of this workflow.
     */
    public com.google.api.ads.dfp.axis.v201802.EvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }


    /**
     * Sets the evaluationStatus value for this WorkflowProgress.
     * 
     * @param evaluationStatus   * The status of this workflow.
     */
    public void setEvaluationStatus(com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }


    /**
     * Gets the submissionTime value for this WorkflowProgress.
     * 
     * @return submissionTime   * The {@link DateTime} the proposal was submitted.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getSubmissionTime() {
        return submissionTime;
    }


    /**
     * Sets the submissionTime value for this WorkflowProgress.
     * 
     * @param submissionTime   * The {@link DateTime} the proposal was submitted.
     */
    public void setSubmissionTime(com.google.api.ads.dfp.axis.v201802.DateTime submissionTime) {
        this.submissionTime = submissionTime;
    }


    /**
     * Gets the evaluationTime value for this WorkflowProgress.
     * 
     * @return evaluationTime   * The {@link DateTime} this workflow was evaluated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEvaluationTime() {
        return evaluationTime;
    }


    /**
     * Sets the evaluationTime value for this WorkflowProgress.
     * 
     * @param evaluationTime   * The {@link DateTime} this workflow was evaluated.
     */
    public void setEvaluationTime(com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
    }


    /**
     * Gets the isProcessing value for this WorkflowProgress.
     * 
     * @return isProcessing   * Whether any offline processing is occurring.
     */
    public java.lang.Boolean getIsProcessing() {
        return isProcessing;
    }


    /**
     * Sets the isProcessing value for this WorkflowProgress.
     * 
     * @param isProcessing   * Whether any offline processing is occurring.
     */
    public void setIsProcessing(java.lang.Boolean isProcessing) {
        this.isProcessing = isProcessing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowProgress)) return false;
        WorkflowProgress other = (WorkflowProgress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.steps==null && other.getSteps()==null) || 
             (this.steps!=null &&
              java.util.Arrays.equals(this.steps, other.getSteps()))) &&
            ((this.submitterId==null && other.getSubmitterId()==null) || 
             (this.submitterId!=null &&
              this.submitterId.equals(other.getSubmitterId()))) &&
            ((this.evaluationStatus==null && other.getEvaluationStatus()==null) || 
             (this.evaluationStatus!=null &&
              this.evaluationStatus.equals(other.getEvaluationStatus()))) &&
            ((this.submissionTime==null && other.getSubmissionTime()==null) || 
             (this.submissionTime!=null &&
              this.submissionTime.equals(other.getSubmissionTime()))) &&
            ((this.evaluationTime==null && other.getEvaluationTime()==null) || 
             (this.evaluationTime!=null &&
              this.evaluationTime.equals(other.getEvaluationTime()))) &&
            ((this.isProcessing==null && other.getIsProcessing()==null) || 
             (this.isProcessing!=null &&
              this.isProcessing.equals(other.getIsProcessing())));
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
        if (getSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubmitterId() != null) {
            _hashCode += getSubmitterId().hashCode();
        }
        if (getEvaluationStatus() != null) {
            _hashCode += getEvaluationStatus().hashCode();
        }
        if (getSubmissionTime() != null) {
            _hashCode += getSubmissionTime().hashCode();
        }
        if (getEvaluationTime() != null) {
            _hashCode += getEvaluationTime().hashCode();
        }
        if (getIsProcessing() != null) {
            _hashCode += getIsProcessing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowProgress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowProgress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "steps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgressStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitterId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "submitterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "evaluationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "EvaluationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "submissionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "evaluationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProcessing");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isProcessing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
