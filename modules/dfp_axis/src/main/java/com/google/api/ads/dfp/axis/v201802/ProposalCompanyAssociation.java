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
 * ProposalCompanyAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code ProposalCompanyAssociation} represents a {@link Company}
 * associated with the
 *             {@link Proposal} and a set of {@link Contact} objects
 * belonging to the company.
 */
public class ProposalCompanyAssociation  implements java.io.Serializable {
    /* The unique ID of the {@link Company} associated with the {@link
     * Proposal}.
     *                 This attribute is required. */
    private java.lang.Long companyId;

    /* The association type of the {@link Company} and {@link Proposal}.
     * This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.ProposalCompanyAssociationType type;

    /* List of unique IDs for {@link Contact} objects of the {@link
     * Company}. */
    private long[] contactIds;

    public ProposalCompanyAssociation() {
    }

    public ProposalCompanyAssociation(
           java.lang.Long companyId,
           com.google.api.ads.dfp.axis.v201802.ProposalCompanyAssociationType type,
           long[] contactIds) {
           this.companyId = companyId;
           this.type = type;
           this.contactIds = contactIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("companyId", getCompanyId())
            .add("contactIds", getContactIds())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the companyId value for this ProposalCompanyAssociation.
     * 
     * @return companyId   * The unique ID of the {@link Company} associated with the {@link
     * Proposal}.
     *                 This attribute is required.
     */
    public java.lang.Long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ProposalCompanyAssociation.
     * 
     * @param companyId   * The unique ID of the {@link Company} associated with the {@link
     * Proposal}.
     *                 This attribute is required.
     */
    public void setCompanyId(java.lang.Long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the type value for this ProposalCompanyAssociation.
     * 
     * @return type   * The association type of the {@link Company} and {@link Proposal}.
     * This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.ProposalCompanyAssociationType getType() {
        return type;
    }


    /**
     * Sets the type value for this ProposalCompanyAssociation.
     * 
     * @param type   * The association type of the {@link Company} and {@link Proposal}.
     * This attribute is required.
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.ProposalCompanyAssociationType type) {
        this.type = type;
    }


    /**
     * Gets the contactIds value for this ProposalCompanyAssociation.
     * 
     * @return contactIds   * List of unique IDs for {@link Contact} objects of the {@link
     * Company}.
     */
    public long[] getContactIds() {
        return contactIds;
    }


    /**
     * Sets the contactIds value for this ProposalCompanyAssociation.
     * 
     * @param contactIds   * List of unique IDs for {@link Contact} objects of the {@link
     * Company}.
     */
    public void setContactIds(long[] contactIds) {
        this.contactIds = contactIds;
    }

    public long getContactIds(int i) {
        return this.contactIds[i];
    }

    public void setContactIds(int i, long _value) {
        this.contactIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalCompanyAssociation)) return false;
        ProposalCompanyAssociation other = (ProposalCompanyAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyId==null && other.getCompanyId()==null) || 
             (this.companyId!=null &&
              this.companyId.equals(other.getCompanyId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.contactIds==null && other.getContactIds()==null) || 
             (this.contactIds!=null &&
              java.util.Arrays.equals(this.contactIds, other.getContactIds())));
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
        if (getCompanyId() != null) {
            _hashCode += getCompanyId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getContactIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactIds(), i);
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
        new org.apache.axis.description.TypeDesc(ProposalCompanyAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalCompanyAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalCompanyAssociationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "contactIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
