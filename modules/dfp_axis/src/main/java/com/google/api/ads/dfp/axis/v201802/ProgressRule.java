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
 * ProgressRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Describes a rule in a workflow step.
 */
public class ProgressRule  implements java.io.Serializable {
    /* Pending or completed actions for this rule. */
    private com.google.api.ads.dfp.axis.v201802.ProgressAction[] actions;

    /* The name of this rule. */
    private java.lang.String name;

    /* The status of this rule. */
    private com.google.api.ads.dfp.axis.v201802.WorkflowEvaluationStatus evaluationStatus;

    /* The {@link DateTime} this rule was evaluated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime;

    /* Whether this rule is evaluated by external system. */
    private java.lang.Boolean isExternal;

    public ProgressRule() {
    }

    public ProgressRule(
           com.google.api.ads.dfp.axis.v201802.ProgressAction[] actions,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.WorkflowEvaluationStatus evaluationStatus,
           com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime,
           java.lang.Boolean isExternal) {
           this.actions = actions;
           this.name = name;
           this.evaluationStatus = evaluationStatus;
           this.evaluationTime = evaluationTime;
           this.isExternal = isExternal;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("actions", getActions())
            .add("evaluationStatus", getEvaluationStatus())
            .add("evaluationTime", getEvaluationTime())
            .add("isExternal", getIsExternal())
            .add("name", getName())
            .toString();
    }

    /**
     * Gets the actions value for this ProgressRule.
     * 
     * @return actions   * Pending or completed actions for this rule.
     */
    public com.google.api.ads.dfp.axis.v201802.ProgressAction[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this ProgressRule.
     * 
     * @param actions   * Pending or completed actions for this rule.
     */
    public void setActions(com.google.api.ads.dfp.axis.v201802.ProgressAction[] actions) {
        this.actions = actions;
    }

    public com.google.api.ads.dfp.axis.v201802.ProgressAction getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.google.api.ads.dfp.axis.v201802.ProgressAction _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the name value for this ProgressRule.
     * 
     * @return name   * The name of this rule.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProgressRule.
     * 
     * @param name   * The name of this rule.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the evaluationStatus value for this ProgressRule.
     * 
     * @return evaluationStatus   * The status of this rule.
     */
    public com.google.api.ads.dfp.axis.v201802.WorkflowEvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }


    /**
     * Sets the evaluationStatus value for this ProgressRule.
     * 
     * @param evaluationStatus   * The status of this rule.
     */
    public void setEvaluationStatus(com.google.api.ads.dfp.axis.v201802.WorkflowEvaluationStatus evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }


    /**
     * Gets the evaluationTime value for this ProgressRule.
     * 
     * @return evaluationTime   * The {@link DateTime} this rule was evaluated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEvaluationTime() {
        return evaluationTime;
    }


    /**
     * Sets the evaluationTime value for this ProgressRule.
     * 
     * @param evaluationTime   * The {@link DateTime} this rule was evaluated.
     */
    public void setEvaluationTime(com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
    }


    /**
     * Gets the isExternal value for this ProgressRule.
     * 
     * @return isExternal   * Whether this rule is evaluated by external system.
     */
    public java.lang.Boolean getIsExternal() {
        return isExternal;
    }


    /**
     * Sets the isExternal value for this ProgressRule.
     * 
     * @param isExternal   * Whether this rule is evaluated by external system.
     */
    public void setIsExternal(java.lang.Boolean isExternal) {
        this.isExternal = isExternal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgressRule)) return false;
        ProgressRule other = (ProgressRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.evaluationStatus==null && other.getEvaluationStatus()==null) || 
             (this.evaluationStatus!=null &&
              this.evaluationStatus.equals(other.getEvaluationStatus()))) &&
            ((this.evaluationTime==null && other.getEvaluationTime()==null) || 
             (this.evaluationTime!=null &&
              this.evaluationTime.equals(other.getEvaluationTime()))) &&
            ((this.isExternal==null && other.getIsExternal()==null) || 
             (this.isExternal!=null &&
              this.isExternal.equals(other.getIsExternal())));
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
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEvaluationStatus() != null) {
            _hashCode += getEvaluationStatus().hashCode();
        }
        if (getEvaluationTime() != null) {
            _hashCode += getEvaluationTime().hashCode();
        }
        if (getIsExternal() != null) {
            _hashCode += getIsExternal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgressRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgressRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgressAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "evaluationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowEvaluationStatus"));
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
        elemField.setFieldName("isExternal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isExternal"));
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
