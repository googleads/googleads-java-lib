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
 * AdCustomizerError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * An error indicating a problem with an ad customizer tag.
 */
public class AdCustomizerError  extends com.google.api.ads.adwords.axis.v201802.cm.ApiError  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerErrorReason reason;

    /* String form of the function that contained the error. */
    private java.lang.String functionString;

    /* Lowercased string representation of the ad customizer function's
     * operator. */
    private java.lang.String operatorName;

    /* Index of the operand that caused the error. */
    private java.lang.Integer operandIndex;

    /* Value of the operand that caused the error. */
    private java.lang.String operandValue;

    public AdCustomizerError() {
    }

    public AdCustomizerError(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerErrorReason reason,
           java.lang.String functionString,
           java.lang.String operatorName,
           java.lang.Integer operandIndex,
           java.lang.String operandValue) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.functionString = functionString;
        this.operatorName = operatorName;
        this.operandIndex = operandIndex;
        this.operandValue = operandValue;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("apiErrorType", getApiErrorType())
            .add("errorString", getErrorString())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("functionString", getFunctionString())
            .add("operandIndex", getOperandIndex())
            .add("operandValue", getOperandValue())
            .add("operatorName", getOperatorName())
            .add("reason", getReason())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the reason value for this AdCustomizerError.
     * 
     * @return reason
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this AdCustomizerError.
     * 
     * @param reason
     */
    public void setReason(com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the functionString value for this AdCustomizerError.
     * 
     * @return functionString   * String form of the function that contained the error.
     */
    public java.lang.String getFunctionString() {
        return functionString;
    }


    /**
     * Sets the functionString value for this AdCustomizerError.
     * 
     * @param functionString   * String form of the function that contained the error.
     */
    public void setFunctionString(java.lang.String functionString) {
        this.functionString = functionString;
    }


    /**
     * Gets the operatorName value for this AdCustomizerError.
     * 
     * @return operatorName   * Lowercased string representation of the ad customizer function's
     * operator.
     */
    public java.lang.String getOperatorName() {
        return operatorName;
    }


    /**
     * Sets the operatorName value for this AdCustomizerError.
     * 
     * @param operatorName   * Lowercased string representation of the ad customizer function's
     * operator.
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Gets the operandIndex value for this AdCustomizerError.
     * 
     * @return operandIndex   * Index of the operand that caused the error.
     */
    public java.lang.Integer getOperandIndex() {
        return operandIndex;
    }


    /**
     * Sets the operandIndex value for this AdCustomizerError.
     * 
     * @param operandIndex   * Index of the operand that caused the error.
     */
    public void setOperandIndex(java.lang.Integer operandIndex) {
        this.operandIndex = operandIndex;
    }


    /**
     * Gets the operandValue value for this AdCustomizerError.
     * 
     * @return operandValue   * Value of the operand that caused the error.
     */
    public java.lang.String getOperandValue() {
        return operandValue;
    }


    /**
     * Sets the operandValue value for this AdCustomizerError.
     * 
     * @param operandValue   * Value of the operand that caused the error.
     */
    public void setOperandValue(java.lang.String operandValue) {
        this.operandValue = operandValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdCustomizerError)) return false;
        AdCustomizerError other = (AdCustomizerError) obj;
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
            ((this.functionString==null && other.getFunctionString()==null) || 
             (this.functionString!=null &&
              this.functionString.equals(other.getFunctionString()))) &&
            ((this.operatorName==null && other.getOperatorName()==null) || 
             (this.operatorName!=null &&
              this.operatorName.equals(other.getOperatorName()))) &&
            ((this.operandIndex==null && other.getOperandIndex()==null) || 
             (this.operandIndex!=null &&
              this.operandIndex.equals(other.getOperandIndex()))) &&
            ((this.operandValue==null && other.getOperandValue()==null) || 
             (this.operandValue!=null &&
              this.operandValue.equals(other.getOperandValue())));
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
        if (getFunctionString() != null) {
            _hashCode += getFunctionString().hashCode();
        }
        if (getOperatorName() != null) {
            _hashCode += getOperatorName().hashCode();
        }
        if (getOperandIndex() != null) {
            _hashCode += getOperandIndex().hashCode();
        }
        if (getOperandValue() != null) {
            _hashCode += getOperandValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdCustomizerError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdCustomizerError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdCustomizerError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionString");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "functionString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operandIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operandIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operandValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operandValue"));
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
