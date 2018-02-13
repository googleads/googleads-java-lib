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
 * RetractionDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Details describing why a {@link Proposal} was retracted.
 */
public class RetractionDetails  implements java.io.Serializable {
    /* The ID of the reason for why the {@link Proposal} was retracted. */
    private java.lang.Long retractionReasonId;

    /* Comments on why the {@link Proposal} was retracted. This field
     * is optional and has a maximum
     *                 length of 1023 characters. */
    private java.lang.String comments;

    public RetractionDetails() {
    }

    public RetractionDetails(
           java.lang.Long retractionReasonId,
           java.lang.String comments) {
           this.retractionReasonId = retractionReasonId;
           this.comments = comments;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("comments", getComments())
            .add("retractionReasonId", getRetractionReasonId())
            .toString();
    }

    /**
     * Gets the retractionReasonId value for this RetractionDetails.
     * 
     * @return retractionReasonId   * The ID of the reason for why the {@link Proposal} was retracted.
     */
    public java.lang.Long getRetractionReasonId() {
        return retractionReasonId;
    }


    /**
     * Sets the retractionReasonId value for this RetractionDetails.
     * 
     * @param retractionReasonId   * The ID of the reason for why the {@link Proposal} was retracted.
     */
    public void setRetractionReasonId(java.lang.Long retractionReasonId) {
        this.retractionReasonId = retractionReasonId;
    }


    /**
     * Gets the comments value for this RetractionDetails.
     * 
     * @return comments   * Comments on why the {@link Proposal} was retracted. This field
     * is optional and has a maximum
     *                 length of 1023 characters.
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RetractionDetails.
     * 
     * @param comments   * Comments on why the {@link Proposal} was retracted. This field
     * is optional and has a maximum
     *                 length of 1023 characters.
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetractionDetails)) return false;
        RetractionDetails other = (RetractionDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retractionReasonId==null && other.getRetractionReasonId()==null) || 
             (this.retractionReasonId!=null &&
              this.retractionReasonId.equals(other.getRetractionReasonId()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getRetractionReasonId() != null) {
            _hashCode += getRetractionReasonId().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetractionDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RetractionDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retractionReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "retractionReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "comments"));
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
