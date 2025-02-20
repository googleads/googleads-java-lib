// Copyright 2025 Google LLC
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
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public abstract class ApiError  implements java.io.Serializable {
    private java.lang.String fieldPath;

    private com.google.api.ads.admanager.axis.v202502.FieldPathElement[] fieldPathElements;

    private java.lang.String trigger;

    private java.lang.String errorString;

    public ApiError() {
    }

    public ApiError(
           java.lang.String fieldPath,
           com.google.api.ads.admanager.axis.v202502.FieldPathElement[] fieldPathElements,
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
     * @return fieldPath
     */
    public java.lang.String getFieldPath() {
        return fieldPath;
    }


    /**
     * Sets the fieldPath value for this ApiError.
     * 
     * @param fieldPath
     */
    public void setFieldPath(java.lang.String fieldPath) {
        this.fieldPath = fieldPath;
    }


    /**
     * Gets the fieldPathElements value for this ApiError.
     * 
     * @return fieldPathElements
     */
    public com.google.api.ads.admanager.axis.v202502.FieldPathElement[] getFieldPathElements() {
        return fieldPathElements;
    }


    /**
     * Sets the fieldPathElements value for this ApiError.
     * 
     * @param fieldPathElements
     */
    public void setFieldPathElements(com.google.api.ads.admanager.axis.v202502.FieldPathElement[] fieldPathElements) {
        this.fieldPathElements = fieldPathElements;
    }

    public com.google.api.ads.admanager.axis.v202502.FieldPathElement getFieldPathElements(int i) {
        return this.fieldPathElements[i];
    }

    public void setFieldPathElements(int i, com.google.api.ads.admanager.axis.v202502.FieldPathElement _value) {
        this.fieldPathElements[i] = _value;
    }


    /**
     * Gets the trigger value for this ApiError.
     * 
     * @return trigger
     */
    public java.lang.String getTrigger() {
        return trigger;
    }


    /**
     * Sets the trigger value for this ApiError.
     * 
     * @param trigger
     */
    public void setTrigger(java.lang.String trigger) {
        this.trigger = trigger;
    }


    /**
     * Gets the errorString value for this ApiError.
     * 
     * @return errorString
     */
    public java.lang.String getErrorString() {
        return errorString;
    }


    /**
     * Sets the errorString value for this ApiError.
     * 
     * @param errorString
     */
    public void setErrorString(java.lang.String errorString) {
        this.errorString = errorString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiError)) return false;
        ApiError other = (ApiError) obj;
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "ApiError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "fieldPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPathElements");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "fieldPathElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "FieldPathElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trigger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "trigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorString");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "errorString"));
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
