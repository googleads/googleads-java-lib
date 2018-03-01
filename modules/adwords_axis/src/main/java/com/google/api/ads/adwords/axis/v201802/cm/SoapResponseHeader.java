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
 * SoapResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Defines the elements within the header of a SOAP response.
 */
public class SoapResponseHeader  implements java.io.Serializable {
    /* Unique id that identifies this request. If developers have
     * any support issues, sending us
     *                 this id will enable us to find their request more
     * easily. */
    private java.lang.String requestId;

    /* The name of the service being invoked. */
    private java.lang.String serviceName;

    /* The name of the method being invoked. */
    private java.lang.String methodName;

    /* Number of operations performed for this SOAP request. */
    private java.lang.Long operations;

    /* Elapsed time in milliseconds between the AdWords API receiving
     * the request and sending the
     *                 response. */
    private java.lang.Long responseTime;

    public SoapResponseHeader() {
    }

    public SoapResponseHeader(
           java.lang.String requestId,
           java.lang.String serviceName,
           java.lang.String methodName,
           java.lang.Long operations,
           java.lang.Long responseTime) {
           this.requestId = requestId;
           this.serviceName = serviceName;
           this.methodName = methodName;
           this.operations = operations;
           this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("methodName", getMethodName())
            .add("operations", getOperations())
            .add("requestId", getRequestId())
            .add("responseTime", getResponseTime())
            .add("serviceName", getServiceName())
            .toString();
    }

    /**
     * Gets the requestId value for this SoapResponseHeader.
     * 
     * @return requestId   * Unique id that identifies this request. If developers have
     * any support issues, sending us
     *                 this id will enable us to find their request more
     * easily.
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this SoapResponseHeader.
     * 
     * @param requestId   * Unique id that identifies this request. If developers have
     * any support issues, sending us
     *                 this id will enable us to find their request more
     * easily.
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the serviceName value for this SoapResponseHeader.
     * 
     * @return serviceName   * The name of the service being invoked.
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this SoapResponseHeader.
     * 
     * @param serviceName   * The name of the service being invoked.
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the methodName value for this SoapResponseHeader.
     * 
     * @return methodName   * The name of the method being invoked.
     */
    public java.lang.String getMethodName() {
        return methodName;
    }


    /**
     * Sets the methodName value for this SoapResponseHeader.
     * 
     * @param methodName   * The name of the method being invoked.
     */
    public void setMethodName(java.lang.String methodName) {
        this.methodName = methodName;
    }


    /**
     * Gets the operations value for this SoapResponseHeader.
     * 
     * @return operations   * Number of operations performed for this SOAP request.
     */
    public java.lang.Long getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this SoapResponseHeader.
     * 
     * @param operations   * Number of operations performed for this SOAP request.
     */
    public void setOperations(java.lang.Long operations) {
        this.operations = operations;
    }


    /**
     * Gets the responseTime value for this SoapResponseHeader.
     * 
     * @return responseTime   * Elapsed time in milliseconds between the AdWords API receiving
     * the request and sending the
     *                 response.
     */
    public java.lang.Long getResponseTime() {
        return responseTime;
    }


    /**
     * Sets the responseTime value for this SoapResponseHeader.
     * 
     * @param responseTime   * Elapsed time in milliseconds between the AdWords API receiving
     * the request and sending the
     *                 response.
     */
    public void setResponseTime(java.lang.Long responseTime) {
        this.responseTime = responseTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapResponseHeader)) return false;
        SoapResponseHeader other = (SoapResponseHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.methodName==null && other.getMethodName()==null) || 
             (this.methodName!=null &&
              this.methodName.equals(other.getMethodName()))) &&
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              this.operations.equals(other.getOperations()))) &&
            ((this.responseTime==null && other.getResponseTime()==null) || 
             (this.responseTime!=null &&
              this.responseTime.equals(other.getResponseTime())));
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getMethodName() != null) {
            _hashCode += getMethodName().hashCode();
        }
        if (getOperations() != null) {
            _hashCode += getOperations().hashCode();
        }
        if (getResponseTime() != null) {
            _hashCode += getResponseTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SoapResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "methodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "responseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
