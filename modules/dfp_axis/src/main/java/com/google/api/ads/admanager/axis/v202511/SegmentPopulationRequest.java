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
 * SegmentPopulationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;


/**
 * A request to upload identifiers to an AudienceSegment.
 */
public class SegmentPopulationRequest  implements java.io.Serializable {
    /* The ID of the batch that will process {@link identifiers}.
     * If not specified, it will be
     *                 provided by Google. The same ID can be used in subsequent
     * requests to group them together as
     *                 part of the same batch. */
    private java.lang.Long batchUploadId;

    /* The ID of the segment to populate. This segment must be active. */
    private java.lang.Long segmentId;

    /* Whether the identifiers should be added or removed. */
    private java.lang.Boolean isDeletion;

    /* The type of identifier being operated upon. */
    private com.google.api.ads.admanager.axis.v202511.IdentifierType identifierType;

    /* The identifiers to upload. This field may have a maximum size
     * of 100,000 elements. */
    private java.lang.String[] ids;

    /* Consent type gathered for all identifiers in this request. */
    private com.google.api.ads.admanager.axis.v202511.ConsentType consentType;

    public SegmentPopulationRequest() {
    }

    public SegmentPopulationRequest(
           java.lang.Long batchUploadId,
           java.lang.Long segmentId,
           java.lang.Boolean isDeletion,
           com.google.api.ads.admanager.axis.v202511.IdentifierType identifierType,
           java.lang.String[] ids,
           com.google.api.ads.admanager.axis.v202511.ConsentType consentType) {
           this.batchUploadId = batchUploadId;
           this.segmentId = segmentId;
           this.isDeletion = isDeletion;
           this.identifierType = identifierType;
           this.ids = ids;
           this.consentType = consentType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("batchUploadId", getBatchUploadId())
            .add("consentType", getConsentType())
            .add("identifierType", getIdentifierType())
            .add("ids", getIds())
            .add("isDeletion", getIsDeletion())
            .add("segmentId", getSegmentId())
            .toString();
    }

    /**
     * Gets the batchUploadId value for this SegmentPopulationRequest.
     * 
     * @return batchUploadId   * The ID of the batch that will process {@link identifiers}.
     * If not specified, it will be
     *                 provided by Google. The same ID can be used in subsequent
     * requests to group them together as
     *                 part of the same batch.
     */
    public java.lang.Long getBatchUploadId() {
        return batchUploadId;
    }


    /**
     * Sets the batchUploadId value for this SegmentPopulationRequest.
     * 
     * @param batchUploadId   * The ID of the batch that will process {@link identifiers}.
     * If not specified, it will be
     *                 provided by Google. The same ID can be used in subsequent
     * requests to group them together as
     *                 part of the same batch.
     */
    public void setBatchUploadId(java.lang.Long batchUploadId) {
        this.batchUploadId = batchUploadId;
    }


    /**
     * Gets the segmentId value for this SegmentPopulationRequest.
     * 
     * @return segmentId   * The ID of the segment to populate. This segment must be active.
     */
    public java.lang.Long getSegmentId() {
        return segmentId;
    }


    /**
     * Sets the segmentId value for this SegmentPopulationRequest.
     * 
     * @param segmentId   * The ID of the segment to populate. This segment must be active.
     */
    public void setSegmentId(java.lang.Long segmentId) {
        this.segmentId = segmentId;
    }


    /**
     * Gets the isDeletion value for this SegmentPopulationRequest.
     * 
     * @return isDeletion   * Whether the identifiers should be added or removed.
     */
    public java.lang.Boolean getIsDeletion() {
        return isDeletion;
    }


    /**
     * Sets the isDeletion value for this SegmentPopulationRequest.
     * 
     * @param isDeletion   * Whether the identifiers should be added or removed.
     */
    public void setIsDeletion(java.lang.Boolean isDeletion) {
        this.isDeletion = isDeletion;
    }


    /**
     * Gets the identifierType value for this SegmentPopulationRequest.
     * 
     * @return identifierType   * The type of identifier being operated upon.
     */
    public com.google.api.ads.admanager.axis.v202511.IdentifierType getIdentifierType() {
        return identifierType;
    }


    /**
     * Sets the identifierType value for this SegmentPopulationRequest.
     * 
     * @param identifierType   * The type of identifier being operated upon.
     */
    public void setIdentifierType(com.google.api.ads.admanager.axis.v202511.IdentifierType identifierType) {
        this.identifierType = identifierType;
    }


    /**
     * Gets the ids value for this SegmentPopulationRequest.
     * 
     * @return ids   * The identifiers to upload. This field may have a maximum size
     * of 100,000 elements.
     */
    public java.lang.String[] getIds() {
        return ids;
    }


    /**
     * Sets the ids value for this SegmentPopulationRequest.
     * 
     * @param ids   * The identifiers to upload. This field may have a maximum size
     * of 100,000 elements.
     */
    public void setIds(java.lang.String[] ids) {
        this.ids = ids;
    }

    public java.lang.String getIds(int i) {
        return this.ids[i];
    }

    public void setIds(int i, java.lang.String _value) {
        this.ids[i] = _value;
    }


    /**
     * Gets the consentType value for this SegmentPopulationRequest.
     * 
     * @return consentType   * Consent type gathered for all identifiers in this request.
     */
    public com.google.api.ads.admanager.axis.v202511.ConsentType getConsentType() {
        return consentType;
    }


    /**
     * Sets the consentType value for this SegmentPopulationRequest.
     * 
     * @param consentType   * Consent type gathered for all identifiers in this request.
     */
    public void setConsentType(com.google.api.ads.admanager.axis.v202511.ConsentType consentType) {
        this.consentType = consentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegmentPopulationRequest)) return false;
        SegmentPopulationRequest other = (SegmentPopulationRequest) obj;
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
            ((this.isDeletion==null && other.getIsDeletion()==null) || 
             (this.isDeletion!=null &&
              this.isDeletion.equals(other.getIsDeletion()))) &&
            ((this.identifierType==null && other.getIdentifierType()==null) || 
             (this.identifierType!=null &&
              this.identifierType.equals(other.getIdentifierType()))) &&
            ((this.ids==null && other.getIds()==null) || 
             (this.ids!=null &&
              java.util.Arrays.equals(this.ids, other.getIds()))) &&
            ((this.consentType==null && other.getConsentType()==null) || 
             (this.consentType!=null &&
              this.consentType.equals(other.getConsentType())));
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
        if (getIsDeletion() != null) {
            _hashCode += getIsDeletion().hashCode();
        }
        if (getIdentifierType() != null) {
            _hashCode += getIdentifierType().hashCode();
        }
        if (getIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsentType() != null) {
            _hashCode += getConsentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SegmentPopulationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "SegmentPopulationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchUploadId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "batchUploadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "segmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeletion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "isDeletion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "identifierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "consentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "ConsentType"));
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
