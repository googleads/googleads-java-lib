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
 * ApiError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * The API error base class that provides details about an error that
 * occurred
 *             while processing a service request.
 *             
 *             <p>The OGNL field path is provided for parsers to identify
 * the request data
 *             element that may have caused the error.</p>
 */
public abstract class ApiError  implements java.io.Serializable {
    /* The OGNL field path to identify cause of error. */
    private java.lang.String fieldPath;

    /* A parsed copy of the field path. For example, the field path
     * "operations[1].operand"
     *                 corresponds to this list: {FieldPathElement(field
     * = "operations", index = 1),
     *                 FieldPathElement(field = "operand", index = null)}. */
    private com.google.api.ads.dfp.axis.v201802.FieldPathElement[] fieldPathElements;

    /* The data that caused the error. */
    private java.lang.String trigger;

    /* A simple string representation of the error and reason. */
    private java.lang.String errorString;

    public ApiError() {
    }

    public ApiError(
           java.lang.String fieldPath,
           com.google.api.ads.dfp.axis.v201802.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString) {
           this.fieldPath = fieldPath;
           this.fieldPathElements = fieldPathElements;
           this.trigger = trigger;
           this.errorString = errorString;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("errorString", getErrorString())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the fieldPath value for this ApiError.
     * 
     * @return fieldPath   * The OGNL field path to identify cause of error.
     */
    public java.lang.String getFieldPath() {
        return fieldPath;
    }


    /**
     * Sets the fieldPath value for this ApiError.
     * 
     * @param fieldPath   * The OGNL field path to identify cause of error.
     */
    public void setFieldPath(java.lang.String fieldPath) {
        this.fieldPath = fieldPath;
    }


    /**
     * Gets the fieldPathElements value for this ApiError.
     * 
     * @return fieldPathElements   * A parsed copy of the field path. For example, the field path
     * "operations[1].operand"
     *                 corresponds to this list: {FieldPathElement(field
     * = "operations", index = 1),
     *                 FieldPathElement(field = "operand", index = null)}.
     */
    public com.google.api.ads.dfp.axis.v201802.FieldPathElement[] getFieldPathElements() {
        return fieldPathElements;
    }


    /**
     * Sets the fieldPathElements value for this ApiError.
     * 
     * @param fieldPathElements   * A parsed copy of the field path. For example, the field path
     * "operations[1].operand"
     *                 corresponds to this list: {FieldPathElement(field
     * = "operations", index = 1),
     *                 FieldPathElement(field = "operand", index = null)}.
     */
    public void setFieldPathElements(com.google.api.ads.dfp.axis.v201802.FieldPathElement[] fieldPathElements) {
        this.fieldPathElements = fieldPathElements;
    }

    public com.google.api.ads.dfp.axis.v201802.FieldPathElement getFieldPathElements(int i) {
        return this.fieldPathElements[i];
    }

    public void setFieldPathElements(int i, com.google.api.ads.dfp.axis.v201802.FieldPathElement _value) {
        this.fieldPathElements[i] = _value;
    }


    /**
     * Gets the trigger value for this ApiError.
     * 
     * @return trigger   * The data that caused the error.
     */
    public java.lang.String getTrigger() {
        return trigger;
    }


    /**
     * Sets the trigger value for this ApiError.
     * 
     * @param trigger   * The data that caused the error.
     */
    public void setTrigger(java.lang.String trigger) {
        this.trigger = trigger;
    }


    /**
     * Gets the errorString value for this ApiError.
     * 
     * @return errorString   * A simple string representation of the error and reason.
     */
    public java.lang.String getErrorString() {
        return errorString;
    }


    /**
     * Sets the errorString value for this ApiError.
     * 
     * @param errorString   * A simple string representation of the error and reason.
     */
    public void setErrorString(java.lang.String errorString) {
        this.errorString = errorString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiError)) return false;
        ApiError other = (ApiError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldPath==null && other.getFieldPath()==null) || 
             (this.fieldPath!=null &&
              this.fieldPath.equals(other.getFieldPath()))) &&
            ((this.fieldPathElements==null && other.getFieldPathElements()==null) || 
             (this.fieldPathElements!=null &&
              java.util.Arrays.equals(this.fieldPathElements, other.getFieldPathElements()))) &&
            ((this.trigger==null && other.getTrigger()==null) || 
             (this.trigger!=null &&
              this.trigger.equals(other.getTrigger()))) &&
            ((this.errorString==null && other.getErrorString()==null) || 
             (this.errorString!=null &&
              this.errorString.equals(other.getErrorString())));
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
        if (getFieldPath() != null) {
            _hashCode += getFieldPath().hashCode();
        }
        if (getFieldPathElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldPathElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldPathElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrigger() != null) {
            _hashCode += getTrigger().hashCode();
        }
        if (getErrorString() != null) {
            _hashCode += getErrorString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ApiError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fieldPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPathElements");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fieldPathElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FieldPathElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trigger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "trigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorString");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "errorString"));
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
