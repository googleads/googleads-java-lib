// Copyright 2024 Google LLC
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
 * SegmentPopulationResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public class SegmentPopulationResults  implements java.io.Serializable {
    private java.lang.Long batchUploadId;

    private java.lang.Long segmentId;

    private com.google.api.ads.admanager.axis.v202402.SegmentPopulationStatus status;

    private java.lang.Long numSuccessfulIdsProcessed;

    private com.google.api.ads.admanager.axis.v202402.IdError[] errors;

    public SegmentPopulationResults() {
    }

    public SegmentPopulationResults(
           java.lang.Long batchUploadId,
           java.lang.Long segmentId,
           com.google.api.ads.admanager.axis.v202402.SegmentPopulationStatus status,
           java.lang.Long numSuccessfulIdsProcessed,
           com.google.api.ads.admanager.axis.v202402.IdError[] errors) {
           this.batchUploadId = batchUploadId;
           this.segmentId = segmentId;
           this.status = status;
           this.numSuccessfulIdsProcessed = numSuccessfulIdsProcessed;
           this.errors = errors;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("batchUploadId", getBatchUploadId())
            .add("errors", getErrors())
            .add("numSuccessfulIdsProcessed", getNumSuccessfulIdsProcessed())
            .add("segmentId", getSegmentId())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the batchUploadId value for this SegmentPopulationResults.
     * 
     * @return batchUploadId
     */
    public java.lang.Long getBatchUploadId() {
        return batchUploadId;
    }


    /**
     * Sets the batchUploadId value for this SegmentPopulationResults.
     * 
     * @param batchUploadId
     */
    public void setBatchUploadId(java.lang.Long batchUploadId) {
        this.batchUploadId = batchUploadId;
    }


    /**
     * Gets the segmentId value for this SegmentPopulationResults.
     * 
     * @return segmentId
     */
    public java.lang.Long getSegmentId() {
        return segmentId;
    }


    /**
     * Sets the segmentId value for this SegmentPopulationResults.
     * 
     * @param segmentId
     */
    public void setSegmentId(java.lang.Long segmentId) {
        this.segmentId = segmentId;
    }


    /**
     * Gets the status value for this SegmentPopulationResults.
     * 
     * @return status
     */
    public com.google.api.ads.admanager.axis.v202402.SegmentPopulationStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SegmentPopulationResults.
     * 
     * @param status
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202402.SegmentPopulationStatus status) {
        this.status = status;
    }


    /**
     * Gets the numSuccessfulIdsProcessed value for this SegmentPopulationResults.
     * 
     * @return numSuccessfulIdsProcessed
     */
    public java.lang.Long getNumSuccessfulIdsProcessed() {
        return numSuccessfulIdsProcessed;
    }


    /**
     * Sets the numSuccessfulIdsProcessed value for this SegmentPopulationResults.
     * 
     * @param numSuccessfulIdsProcessed
     */
    public void setNumSuccessfulIdsProcessed(java.lang.Long numSuccessfulIdsProcessed) {
        this.numSuccessfulIdsProcessed = numSuccessfulIdsProcessed;
    }


    /**
     * Gets the errors value for this SegmentPopulationResults.
     * 
     * @return errors
     */
    public com.google.api.ads.admanager.axis.v202402.IdError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this SegmentPopulationResults.
     * 
     * @param errors
     */
    public void setErrors(com.google.api.ads.admanager.axis.v202402.IdError[] errors) {
        this.errors = errors;
    }

    public com.google.api.ads.admanager.axis.v202402.IdError getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.google.api.ads.admanager.axis.v202402.IdError _value) {
        this.errors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegmentPopulationResults)) return false;
        SegmentPopulationResults other = (SegmentPopulationResults) obj;
        if (obj == null) return false;
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
            ((this.segmentId==null && other.getSegmentId()==null) || 
             (this.segmentId!=null &&
              this.segmentId.equals(other.getSegmentId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.numSuccessfulIdsProcessed==null && other.getNumSuccessfulIdsProcessed()==null) || 
             (this.numSuccessfulIdsProcessed!=null &&
              this.numSuccessfulIdsProcessed.equals(other.getNumSuccessfulIdsProcessed()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
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
        if (getSegmentId() != null) {
            _hashCode += getSegmentId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getNumSuccessfulIdsProcessed() != null) {
            _hashCode += getNumSuccessfulIdsProcessed().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
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
        new org.apache.axis.description.TypeDesc(SegmentPopulationResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "SegmentPopulationResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchUploadId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "batchUploadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "segmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "SegmentPopulationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSuccessfulIdsProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "numSuccessfulIdsProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "IdError"));
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
