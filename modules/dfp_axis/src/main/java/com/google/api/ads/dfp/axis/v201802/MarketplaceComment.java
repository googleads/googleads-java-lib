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
 * MarketplaceComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A comment associated with a programmatic {@link Proposal} that
 * has been sent to Marketplace.
 */
public class MarketplaceComment  implements java.io.Serializable {
    /* The unique ID of the {@link Proposal} the comment belongs to. */
    private java.lang.Long proposalId;

    /* The comment made on the {@link Proposal}. */
    private java.lang.String comment;

    /* The creation {@link DateTime} of this {@code MarketplaceComment}. */
    private com.google.api.ads.dfp.axis.v201802.DateTime creationTime;

    /* Indicates whether the {@code MarketplaceComment} was created
     * by seller. */
    private java.lang.Boolean createdBySeller;

    public MarketplaceComment() {
    }

    public MarketplaceComment(
           java.lang.Long proposalId,
           java.lang.String comment,
           com.google.api.ads.dfp.axis.v201802.DateTime creationTime,
           java.lang.Boolean createdBySeller) {
           this.proposalId = proposalId;
           this.comment = comment;
           this.creationTime = creationTime;
           this.createdBySeller = createdBySeller;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("comment", getComment())
            .add("createdBySeller", getCreatedBySeller())
            .add("creationTime", getCreationTime())
            .add("proposalId", getProposalId())
            .toString();
    }

    /**
     * Gets the proposalId value for this MarketplaceComment.
     * 
     * @return proposalId   * The unique ID of the {@link Proposal} the comment belongs to.
     */
    public java.lang.Long getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this MarketplaceComment.
     * 
     * @param proposalId   * The unique ID of the {@link Proposal} the comment belongs to.
     */
    public void setProposalId(java.lang.Long proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the comment value for this MarketplaceComment.
     * 
     * @return comment   * The comment made on the {@link Proposal}.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this MarketplaceComment.
     * 
     * @param comment   * The comment made on the {@link Proposal}.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the creationTime value for this MarketplaceComment.
     * 
     * @return creationTime   * The creation {@link DateTime} of this {@code MarketplaceComment}.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this MarketplaceComment.
     * 
     * @param creationTime   * The creation {@link DateTime} of this {@code MarketplaceComment}.
     */
    public void setCreationTime(com.google.api.ads.dfp.axis.v201802.DateTime creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the createdBySeller value for this MarketplaceComment.
     * 
     * @return createdBySeller   * Indicates whether the {@code MarketplaceComment} was created
     * by seller.
     */
    public java.lang.Boolean getCreatedBySeller() {
        return createdBySeller;
    }


    /**
     * Sets the createdBySeller value for this MarketplaceComment.
     * 
     * @param createdBySeller   * Indicates whether the {@code MarketplaceComment} was created
     * by seller.
     */
    public void setCreatedBySeller(java.lang.Boolean createdBySeller) {
        this.createdBySeller = createdBySeller;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarketplaceComment)) return false;
        MarketplaceComment other = (MarketplaceComment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.createdBySeller==null && other.getCreatedBySeller()==null) || 
             (this.createdBySeller!=null &&
              this.createdBySeller.equals(other.getCreatedBySeller())));
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
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getCreatedBySeller() != null) {
            _hashCode += getCreatedBySeller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarketplaceComment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MarketplaceComment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBySeller");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "createdBySeller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
