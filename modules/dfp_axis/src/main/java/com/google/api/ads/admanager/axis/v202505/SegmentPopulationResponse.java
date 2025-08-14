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
 * SegmentPopulationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * Response returned by {@link SegmentPopulationService}
 */
public class SegmentPopulationResponse  implements java.io.Serializable {
    /* The batch ID used to look up the results. */
    private java.lang.Long batchUploadId;

    /* Individual identifier errors. */
    private com.google.api.ads.admanager.axis.v202505.IdError[] idErrors;

    public SegmentPopulationResponse() {
    }

    public SegmentPopulationResponse(
           java.lang.Long batchUploadId,
           com.google.api.ads.admanager.axis.v202505.IdError[] idErrors) {
           this.batchUploadId = batchUploadId;
           this.idErrors = idErrors;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("batchUploadId", getBatchUploadId())
            .add("idErrors", getIdErrors())
            .toString();
    }

    /**
     * Gets the batchUploadId value for this SegmentPopulationResponse.
     * 
     * @return batchUploadId   * The batch ID used to look up the results.
     */
    public java.lang.Long getBatchUploadId() {
        return batchUploadId;
    }


    /**
     * Sets the batchUploadId value for this SegmentPopulationResponse.
     * 
     * @param batchUploadId   * The batch ID used to look up the results.
     */
    public void setBatchUploadId(java.lang.Long batchUploadId) {
        this.batchUploadId = batchUploadId;
    }


    /**
     * Gets the idErrors value for this SegmentPopulationResponse.
     * 
     * @return idErrors   * Individual identifier errors.
     */
    public com.google.api.ads.admanager.axis.v202505.IdError[] getIdErrors() {
        return idErrors;
    }


    /**
     * Sets the idErrors value for this SegmentPopulationResponse.
     * 
     * @param idErrors   * Individual identifier errors.
     */
    public void setIdErrors(com.google.api.ads.admanager.axis.v202505.IdError[] idErrors) {
        this.idErrors = idErrors;
    }

    public com.google.api.ads.admanager.axis.v202505.IdError getIdErrors(int i) {
        return this.idErrors[i];
    }

    public void setIdErrors(int i, com.google.api.ads.admanager.axis.v202505.IdError _value) {
        this.idErrors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegmentPopulationResponse)) return false;
        SegmentPopulationResponse other = (SegmentPopulationResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchUploadId==null && other.getBatchUploadId()==null) || 
             (this.batchUploadId!=null &&
              this.batchUploadId.equals(other.getBatchUploadId()))) &&
            ((this.idErrors==null && other.getIdErrors()==null) || 
             (this.idErrors!=null &&
              java.util.Arrays.equals(this.idErrors, other.getIdErrors())));
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
        if (getBatchUploadId() != null) {
            _hashCode += getBatchUploadId().hashCode();
        }
        if (getIdErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SegmentPopulationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "SegmentPopulationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchUploadId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "batchUploadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "idErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "IdError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
