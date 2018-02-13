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
 * Package.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Package} represents a group of proposal line items which
 * will be sold together.
 */
public class Package  implements java.io.Serializable {
    /* The unique ID of the {@code Package}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google. */
    private java.lang.Long id;

    /* The unique ID of the {@link Proposal}, to which the {@code
     * Package} belongs.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only. */
    private java.lang.Long proposalId;

    /* The unique ID of the {@link ProductPackage}, from which the
     * {@code Package} is created.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only. */
    private java.lang.Long productPackageId;

    /* The unique ID of the {@link RateCard}, based on which the {@code
     * ProposalLineItem} objects in
     *                 the {@code Package} are priced.
     *                 
     *                 <p>This attribute is required for creation of associated
     * {@code ProposalLineItem} objects and
     *                 then is read-only. */
    private java.lang.Long rateCardId;

    /* The name of the {@code Package} which should be unique under
     * the same {@link Proposal}.
     *                 
     *                 <p>This attribute is required and has a maximum length
     * of 255 characters. */
    private java.lang.String name;

    /* Provides any additional comments that may annotate the {@code
     * Package}.
     *                 
     *                 <p>This attribute is optional and has a maximum length
     * of 65,535 characters. */
    private java.lang.String comments;

    /* This field specifies the status of the {@code Package}, whether
     * the {@link ProposalLineItem}
     *                 objects belonging to the {@code Package} have been
     * created.
     *                 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.PackageStatus status;

    /* The date and time at which the order and line items associated
     * with
     *                 the {@code Package} are eligible to begin serving.
     * 
     *                 <p>This attribute is read-only and is derived from
     * the earliest
     *                 {@link ProposalLineItem#startDateTime} of {@link ProposalLineItem}
     * objects belonging to
     *                 this package.
     *                 
     *                 <p>This attribute will be null, if this package has
     * no related line items,
     *                 or none of its line items have a start time. */
    private com.google.api.ads.dfp.axis.v201802.DateTime startDateTime;

    /* The date and time at which the order and line items associated
     * with
     *                 the {@code Package} stop being served.
     *                 
     *                 <p>This attribute is read-only and is derived from
     * the latest
     *                 {@link ProposalLineItem#endDateTime} of {@link ProposalLineItem}
     * objects belonging to
     *                 this package.
     *                 
     *                 <p>This attribute will be null, if this package has
     * no related line items,
     *                 or none of its line items have an end time. */
    private com.google.api.ads.dfp.axis.v201802.DateTime endDateTime;

    /* The date and time this {@code Package} was last modified.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code Package} is updated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    public Package() {
    }

    public Package(
           java.lang.Long id,
           java.lang.Long proposalId,
           java.lang.Long productPackageId,
           java.lang.Long rateCardId,
           java.lang.String name,
           java.lang.String comments,
           com.google.api.ads.dfp.axis.v201802.PackageStatus status,
           com.google.api.ads.dfp.axis.v201802.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201802.DateTime endDateTime,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
           this.id = id;
           this.proposalId = proposalId;
           this.productPackageId = productPackageId;
           this.rateCardId = rateCardId;
           this.name = name;
           this.comments = comments;
           this.status = status;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("comments", getComments())
            .add("endDateTime", getEndDateTime())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("productPackageId", getProductPackageId())
            .add("proposalId", getProposalId())
            .add("rateCardId", getRateCardId())
            .add("startDateTime", getStartDateTime())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this Package.
     * 
     * @return id   * The unique ID of the {@code Package}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Package.
     * 
     * @param id   * The unique ID of the {@code Package}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the proposalId value for this Package.
     * 
     * @return proposalId   * The unique ID of the {@link Proposal}, to which the {@code
     * Package} belongs.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public java.lang.Long getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this Package.
     * 
     * @param proposalId   * The unique ID of the {@link Proposal}, to which the {@code
     * Package} belongs.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public void setProposalId(java.lang.Long proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the productPackageId value for this Package.
     * 
     * @return productPackageId   * The unique ID of the {@link ProductPackage}, from which the
     * {@code Package} is created.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public java.lang.Long getProductPackageId() {
        return productPackageId;
    }


    /**
     * Sets the productPackageId value for this Package.
     * 
     * @param productPackageId   * The unique ID of the {@link ProductPackage}, from which the
     * {@code Package} is created.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public void setProductPackageId(java.lang.Long productPackageId) {
        this.productPackageId = productPackageId;
    }


    /**
     * Gets the rateCardId value for this Package.
     * 
     * @return rateCardId   * The unique ID of the {@link RateCard}, based on which the {@code
     * ProposalLineItem} objects in
     *                 the {@code Package} are priced.
     *                 
     *                 <p>This attribute is required for creation of associated
     * {@code ProposalLineItem} objects and
     *                 then is read-only.
     */
    public java.lang.Long getRateCardId() {
        return rateCardId;
    }


    /**
     * Sets the rateCardId value for this Package.
     * 
     * @param rateCardId   * The unique ID of the {@link RateCard}, based on which the {@code
     * ProposalLineItem} objects in
     *                 the {@code Package} are priced.
     *                 
     *                 <p>This attribute is required for creation of associated
     * {@code ProposalLineItem} objects and
     *                 then is read-only.
     */
    public void setRateCardId(java.lang.Long rateCardId) {
        this.rateCardId = rateCardId;
    }


    /**
     * Gets the name value for this Package.
     * 
     * @return name   * The name of the {@code Package} which should be unique under
     * the same {@link Proposal}.
     *                 
     *                 <p>This attribute is required and has a maximum length
     * of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Package.
     * 
     * @param name   * The name of the {@code Package} which should be unique under
     * the same {@link Proposal}.
     *                 
     *                 <p>This attribute is required and has a maximum length
     * of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the comments value for this Package.
     * 
     * @return comments   * Provides any additional comments that may annotate the {@code
     * Package}.
     *                 
     *                 <p>This attribute is optional and has a maximum length
     * of 65,535 characters.
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Package.
     * 
     * @param comments   * Provides any additional comments that may annotate the {@code
     * Package}.
     *                 
     *                 <p>This attribute is optional and has a maximum length
     * of 65,535 characters.
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the status value for this Package.
     * 
     * @return status   * This field specifies the status of the {@code Package}, whether
     * the {@link ProposalLineItem}
     *                 objects belonging to the {@code Package} have been
     * created.
     *                 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.PackageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Package.
     * 
     * @param status   * This field specifies the status of the {@code Package}, whether
     * the {@link ProposalLineItem}
     *                 objects belonging to the {@code Package} have been
     * created.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.PackageStatus status) {
        this.status = status;
    }


    /**
     * Gets the startDateTime value for this Package.
     * 
     * @return startDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Package} are eligible to begin serving.
     * 
     *                 <p>This attribute is read-only and is derived from
     * the earliest
     *                 {@link ProposalLineItem#startDateTime} of {@link ProposalLineItem}
     * objects belonging to
     *                 this package.
     *                 
     *                 <p>This attribute will be null, if this package has
     * no related line items,
     *                 or none of its line items have a start time.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Package.
     * 
     * @param startDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Package} are eligible to begin serving.
     * 
     *                 <p>This attribute is read-only and is derived from
     * the earliest
     *                 {@link ProposalLineItem#startDateTime} of {@link ProposalLineItem}
     * objects belonging to
     *                 this package.
     *                 
     *                 <p>This attribute will be null, if this package has
     * no related line items,
     *                 or none of its line items have a start time.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201802.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this Package.
     * 
     * @return endDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Package} stop being served.
     *                 
     *                 <p>This attribute is read-only and is derived from
     * the latest
     *                 {@link ProposalLineItem#endDateTime} of {@link ProposalLineItem}
     * objects belonging to
     *                 this package.
     *                 
     *                 <p>This attribute will be null, if this package has
     * no related line items,
     *                 or none of its line items have an end time.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Package.
     * 
     * @param endDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Package} stop being served.
     *                 
     *                 <p>This attribute is read-only and is derived from
     * the latest
     *                 {@link ProposalLineItem#endDateTime} of {@link ProposalLineItem}
     * objects belonging to
     *                 this package.
     *                 
     *                 <p>This attribute will be null, if this package has
     * no related line items,
     *                 or none of its line items have an end time.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201802.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this Package.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code Package} was last modified.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code Package} is updated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Package.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code Package} was last modified.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code Package} is updated.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Package)) return false;
        Package other = (Package) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId()))) &&
            ((this.productPackageId==null && other.getProductPackageId()==null) || 
             (this.productPackageId!=null &&
              this.productPackageId.equals(other.getProductPackageId()))) &&
            ((this.rateCardId==null && other.getRateCardId()==null) || 
             (this.rateCardId!=null &&
              this.rateCardId.equals(other.getRateCardId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        if (getProductPackageId() != null) {
            _hashCode += getProductPackageId().hashCode();
        }
        if (getRateCardId() != null) {
            _hashCode += getRateCardId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Package.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Package"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateCardId"));
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
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PackageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
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
