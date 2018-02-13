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
 * ProposalTermsAndConditions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a terms and conditions that has been added to a {@link
 * Proposal}.
 */
public class ProposalTermsAndConditions  implements java.io.Serializable {
    /* The ID of the terms and conditions added to the proposal.
     *                 This attribute is required. */
    private java.lang.Long termsAndConditionsId;

    /* The name of the terms and conditions at the time it was added
     * to the proposal.
     *                 This is a snapshot of the terms and conditions' name.
     * It will not be updated
     *                 if the terms and conditions name is updated.
     *                 This attribute is read-only. */
    private java.lang.String name;

    /* The content of the terms and conditions at the time it was
     * added to the proposal.
     *                 This is a snapshot of the terms and conditions' content.
     * It will not be updated
     *                 if the terms and conditions content is updated.
     *                 This attribute is read-only. */
    private java.lang.String content;

    public ProposalTermsAndConditions() {
    }

    public ProposalTermsAndConditions(
           java.lang.Long termsAndConditionsId,
           java.lang.String name,
           java.lang.String content) {
           this.termsAndConditionsId = termsAndConditionsId;
           this.name = name;
           this.content = content;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("content", getContent())
            .add("name", getName())
            .add("termsAndConditionsId", getTermsAndConditionsId())
            .toString();
    }

    /**
     * Gets the termsAndConditionsId value for this ProposalTermsAndConditions.
     * 
     * @return termsAndConditionsId   * The ID of the terms and conditions added to the proposal.
     *                 This attribute is required.
     */
    public java.lang.Long getTermsAndConditionsId() {
        return termsAndConditionsId;
    }


    /**
     * Sets the termsAndConditionsId value for this ProposalTermsAndConditions.
     * 
     * @param termsAndConditionsId   * The ID of the terms and conditions added to the proposal.
     *                 This attribute is required.
     */
    public void setTermsAndConditionsId(java.lang.Long termsAndConditionsId) {
        this.termsAndConditionsId = termsAndConditionsId;
    }


    /**
     * Gets the name value for this ProposalTermsAndConditions.
     * 
     * @return name   * The name of the terms and conditions at the time it was added
     * to the proposal.
     *                 This is a snapshot of the terms and conditions' name.
     * It will not be updated
     *                 if the terms and conditions name is updated.
     *                 This attribute is read-only.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProposalTermsAndConditions.
     * 
     * @param name   * The name of the terms and conditions at the time it was added
     * to the proposal.
     *                 This is a snapshot of the terms and conditions' name.
     * It will not be updated
     *                 if the terms and conditions name is updated.
     *                 This attribute is read-only.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the content value for this ProposalTermsAndConditions.
     * 
     * @return content   * The content of the terms and conditions at the time it was
     * added to the proposal.
     *                 This is a snapshot of the terms and conditions' content.
     * It will not be updated
     *                 if the terms and conditions content is updated.
     *                 This attribute is read-only.
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this ProposalTermsAndConditions.
     * 
     * @param content   * The content of the terms and conditions at the time it was
     * added to the proposal.
     *                 This is a snapshot of the terms and conditions' content.
     * It will not be updated
     *                 if the terms and conditions content is updated.
     *                 This attribute is read-only.
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalTermsAndConditions)) return false;
        ProposalTermsAndConditions other = (ProposalTermsAndConditions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.termsAndConditionsId==null && other.getTermsAndConditionsId()==null) || 
             (this.termsAndConditionsId!=null &&
              this.termsAndConditionsId.equals(other.getTermsAndConditionsId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent())));
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
        if (getTermsAndConditionsId() != null) {
            _hashCode += getTermsAndConditionsId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalTermsAndConditions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalTermsAndConditions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditionsId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "termsAndConditionsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "content"));
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
