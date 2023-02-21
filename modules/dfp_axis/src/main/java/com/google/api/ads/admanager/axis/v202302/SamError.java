// Copyright 2023 Google LLC
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
 * SamError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202302;

public class SamError  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202302.SamErrorType samErrorType;

    private java.lang.String errorDetails;

    public SamError() {
    }

    public SamError(
           com.google.api.ads.admanager.axis.v202302.SamErrorType samErrorType,
           java.lang.String errorDetails) {
           this.samErrorType = samErrorType;
           this.errorDetails = errorDetails;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("errorDetails", getErrorDetails())
            .add("samErrorType", getSamErrorType())
            .toString();
    }

    /**
     * Gets the samErrorType value for this SamError.
     * 
     * @return samErrorType
     */
    public com.google.api.ads.admanager.axis.v202302.SamErrorType getSamErrorType() {
        return samErrorType;
    }


    /**
     * Sets the samErrorType value for this SamError.
     * 
     * @param samErrorType
     */
    public void setSamErrorType(com.google.api.ads.admanager.axis.v202302.SamErrorType samErrorType) {
        this.samErrorType = samErrorType;
    }


    /**
     * Gets the errorDetails value for this SamError.
     * 
     * @return errorDetails
     */
    public java.lang.String getErrorDetails() {
        return errorDetails;
    }


    /**
     * Sets the errorDetails value for this SamError.
     * 
     * @param errorDetails
     */
    public void setErrorDetails(java.lang.String errorDetails) {
        this.errorDetails = errorDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SamError)) return false;
        SamError other = (SamError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.samErrorType==null && other.getSamErrorType()==null) || 
             (this.samErrorType!=null &&
              this.samErrorType.equals(other.getSamErrorType()))) &&
            ((this.errorDetails==null && other.getErrorDetails()==null) || 
             (this.errorDetails!=null &&
              this.errorDetails.equals(other.getErrorDetails())));
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
        if (getSamErrorType() != null) {
            _hashCode += getSamErrorType().hashCode();
        }
        if (getErrorDetails() != null) {
            _hashCode += getErrorDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SamError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "SamError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samErrorType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "samErrorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "SamErrorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "errorDetails"));
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
