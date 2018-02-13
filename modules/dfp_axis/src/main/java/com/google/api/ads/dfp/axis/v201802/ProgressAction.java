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
 * ProgressAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An action that is being or was done to progress the workflow.
 */
public abstract class ProgressAction  implements java.io.Serializable {
    /* The {@link DateTime} this action was evaluated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime;

    /* The status of this action. */
    private com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus;

    public ProgressAction() {
    }

    public ProgressAction(
           com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime,
           com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus) {
           this.evaluationTime = evaluationTime;
           this.evaluationStatus = evaluationStatus;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("evaluationStatus", getEvaluationStatus())
            .add("evaluationTime", getEvaluationTime())
            .toString();
    }

    /**
     * Gets the evaluationTime value for this ProgressAction.
     * 
     * @return evaluationTime   * The {@link DateTime} this action was evaluated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEvaluationTime() {
        return evaluationTime;
    }


    /**
     * Sets the evaluationTime value for this ProgressAction.
     * 
     * @param evaluationTime   * The {@link DateTime} this action was evaluated.
     */
    public void setEvaluationTime(com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
    }


    /**
     * Gets the evaluationStatus value for this ProgressAction.
     * 
     * @return evaluationStatus   * The status of this action.
     */
    public com.google.api.ads.dfp.axis.v201802.EvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }


    /**
     * Sets the evaluationStatus value for this ProgressAction.
     * 
     * @param evaluationStatus   * The status of this action.
     */
    public void setEvaluationStatus(com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgressAction)) return false;
        ProgressAction other = (ProgressAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.evaluationTime==null && other.getEvaluationTime()==null) || 
             (this.evaluationTime!=null &&
              this.evaluationTime.equals(other.getEvaluationTime()))) &&
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
        if (getEvaluationTime() != null) {
            _hashCode += getEvaluationTime().hashCode();
        }
        if (getEvaluationStatus() != null) {
            _hashCode += getEvaluationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgressAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgressAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "evaluationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
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
