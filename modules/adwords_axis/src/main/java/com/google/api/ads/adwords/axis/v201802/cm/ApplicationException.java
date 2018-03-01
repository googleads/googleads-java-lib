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
 * ApplicationException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Base class for exceptions.
 */
public class ApplicationException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* Error message. */
    private java.lang.String message1;

    /* Indicates that this instance is a subtype of ApplicationException.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String applicationExceptionType;

    public ApplicationException() {
    }

    public ApplicationException(
           java.lang.String message1,
           java.lang.String applicationExceptionType) {
        this.message1 = message1;
        this.applicationExceptionType = applicationExceptionType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("applicationExceptionType", getApplicationExceptionType())
            .add("message", getMessage())
            .toString();
    }

    /**
     * Gets the message1 value for this ApplicationException.
     * 
     * @return message1   * Error message.
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this ApplicationException.
     * 
     * @param message1   * Error message.
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }


    /**
     * Gets the applicationExceptionType value for this ApplicationException.
     * 
     * @return applicationExceptionType   * Indicates that this instance is a subtype of ApplicationException.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getApplicationExceptionType() {
        return applicationExceptionType;
    }


    /**
     * Sets the applicationExceptionType value for this ApplicationException.
     * 
     * @param applicationExceptionType   * Indicates that this instance is a subtype of ApplicationException.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setApplicationExceptionType(java.lang.String applicationExceptionType) {
        this.applicationExceptionType = applicationExceptionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationException)) return false;
        ApplicationException other = (ApplicationException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1()))) &&
            ((this.applicationExceptionType==null && other.getApplicationExceptionType()==null) || 
             (this.applicationExceptionType!=null &&
              this.applicationExceptionType.equals(other.getApplicationExceptionType())));
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
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        if (getApplicationExceptionType() != null) {
            _hashCode += getApplicationExceptionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApplicationException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationExceptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApplicationException.Type"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
