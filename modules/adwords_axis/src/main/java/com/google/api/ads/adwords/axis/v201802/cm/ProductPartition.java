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
 * ProductPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Product partition (product group) in a shopping campaign. Depending
 * on its type, a product
 *             partition subdivides products along some product dimension,
 * specifies a bid for products, or
 *             excludes products from bidding.
 *             
 *             <p>Inner nodes of a product partition hierarchy are always
 * subdivisions. Each child is linked to
 *             the subdivision via the {@code parentCriterionId} and
 * defines a {@code caseValue}. For all
 *             children of the same subdivision, the {@code caseValue}s
 * must be mutually different but
 *             instances of the same class.
 *             
 *             To create a subdivision and child node in the same API
 * request, they should refer to each other
 *             using temporary criterion IDs in the {@code parentCriterionId}
 * of the child, and ID field of the
 *             subdivision. Temporary IDs are specified by using any
 * negative integer. Temporary IDs only exist
 *             within the scope of a single API request. The API will
 * assign real criterion IDs, and replace
 *             the temporary values, and the API response will reflect
 * this.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class ProductPartition  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* Type of the product partition.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ProductPartitionType partitionType;

    /* ID of the parent product partition subdivision. Undefined for
     * the root partition. */
    private java.lang.Long parentCriterionId;

    /* Dimension value with which this product partition is refining
     * its parent. Undefined for the
     *                     root partition. */
    private com.google.api.ads.adwords.axis.v201802.cm.ProductDimension caseValue;

    public ProductPartition() {
    }

    public ProductPartition(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201802.cm.ProductPartitionType partitionType,
           java.lang.Long parentCriterionId,
           com.google.api.ads.adwords.axis.v201802.cm.ProductDimension caseValue) {
        super(
            id,
            type,
            criterionType);
        this.partitionType = partitionType;
        this.parentCriterionId = parentCriterionId;
        this.caseValue = caseValue;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("caseValue", getCaseValue())
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("parentCriterionId", getParentCriterionId())
            .add("partitionType", getPartitionType())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the partitionType value for this ProductPartition.
     * 
     * @return partitionType   * Type of the product partition.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProductPartitionType getPartitionType() {
        return partitionType;
    }


    /**
     * Sets the partitionType value for this ProductPartition.
     * 
     * @param partitionType   * Type of the product partition.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setPartitionType(com.google.api.ads.adwords.axis.v201802.cm.ProductPartitionType partitionType) {
        this.partitionType = partitionType;
    }


    /**
     * Gets the parentCriterionId value for this ProductPartition.
     * 
     * @return parentCriterionId   * ID of the parent product partition subdivision. Undefined for
     * the root partition.
     */
    public java.lang.Long getParentCriterionId() {
        return parentCriterionId;
    }


    /**
     * Sets the parentCriterionId value for this ProductPartition.
     * 
     * @param parentCriterionId   * ID of the parent product partition subdivision. Undefined for
     * the root partition.
     */
    public void setParentCriterionId(java.lang.Long parentCriterionId) {
        this.parentCriterionId = parentCriterionId;
    }


    /**
     * Gets the caseValue value for this ProductPartition.
     * 
     * @return caseValue   * Dimension value with which this product partition is refining
     * its parent. Undefined for the
     *                     root partition.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProductDimension getCaseValue() {
        return caseValue;
    }


    /**
     * Sets the caseValue value for this ProductPartition.
     * 
     * @param caseValue   * Dimension value with which this product partition is refining
     * its parent. Undefined for the
     *                     root partition.
     */
    public void setCaseValue(com.google.api.ads.adwords.axis.v201802.cm.ProductDimension caseValue) {
        this.caseValue = caseValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPartition)) return false;
        ProductPartition other = (ProductPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partitionType==null && other.getPartitionType()==null) || 
             (this.partitionType!=null &&
              this.partitionType.equals(other.getPartitionType()))) &&
            ((this.parentCriterionId==null && other.getParentCriterionId()==null) || 
             (this.parentCriterionId!=null &&
              this.parentCriterionId.equals(other.getParentCriterionId()))) &&
            ((this.caseValue==null && other.getCaseValue()==null) || 
             (this.caseValue!=null &&
              this.caseValue.equals(other.getCaseValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPartitionType() != null) {
            _hashCode += getPartitionType().hashCode();
        }
        if (getParentCriterionId() != null) {
            _hashCode += getParentCriterionId().hashCode();
        }
        if (getCaseValue() != null) {
            _hashCode += getCaseValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "partitionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductPartitionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCriterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "parentCriterionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "caseValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductDimension"));
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
