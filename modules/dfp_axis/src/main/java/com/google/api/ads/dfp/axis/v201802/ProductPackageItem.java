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
 * ProductPackageItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code ProductPackageItem} represents a product item in a package.
 */
public class ProductPackageItem  implements java.io.Serializable {
    /* The unique ID of the {@link ProductPackageItem}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@link ProductPackageItem}
     *                 is created. */
    private java.lang.Long id;

    /* The unique ID of the {@link Product}, to which the {@link ProductPackageItem}
     * comes from.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only. */
    private java.lang.Long productId;

    /* The unique ID of the {@link ProductPackage}, to which the {@link
     * ProductPackageItem} belongs.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only. */
    private java.lang.Long productPackageId;

    /* Indicates whether the {@link ProductPackageItem} must be included
     * to complete
     *                 the {@link ProductPackage}.
     *                 
     *                 <p>Deactivating a mandatory {@link ProductPackageItem}
     * will make the {@link ProductPackage}
     *                 unsellable.
     *                 
     *                 <p>This attribute is required. */
    private java.lang.Boolean isMandatory;

    /* The archival status of the {@link ProductPackageItem}.
     *                 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.ArchiveStatus archiveStatus;

    public ProductPackageItem() {
    }

    public ProductPackageItem(
           java.lang.Long id,
           java.lang.Long productId,
           java.lang.Long productPackageId,
           java.lang.Boolean isMandatory,
           com.google.api.ads.dfp.axis.v201802.ArchiveStatus archiveStatus) {
           this.id = id;
           this.productId = productId;
           this.productPackageId = productPackageId;
           this.isMandatory = isMandatory;
           this.archiveStatus = archiveStatus;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("archiveStatus", getArchiveStatus())
            .add("id", getId())
            .add("isMandatory", getIsMandatory())
            .add("productId", getProductId())
            .add("productPackageId", getProductPackageId())
            .toString();
    }

    /**
     * Gets the id value for this ProductPackageItem.
     * 
     * @return id   * The unique ID of the {@link ProductPackageItem}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@link ProductPackageItem}
     *                 is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ProductPackageItem.
     * 
     * @param id   * The unique ID of the {@link ProductPackageItem}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@link ProductPackageItem}
     *                 is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the productId value for this ProductPackageItem.
     * 
     * @return productId   * The unique ID of the {@link Product}, to which the {@link ProductPackageItem}
     * comes from.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductPackageItem.
     * 
     * @param productId   * The unique ID of the {@link Product}, to which the {@link ProductPackageItem}
     * comes from.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the productPackageId value for this ProductPackageItem.
     * 
     * @return productPackageId   * The unique ID of the {@link ProductPackage}, to which the {@link
     * ProductPackageItem} belongs.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public java.lang.Long getProductPackageId() {
        return productPackageId;
    }


    /**
     * Sets the productPackageId value for this ProductPackageItem.
     * 
     * @param productPackageId   * The unique ID of the {@link ProductPackage}, to which the {@link
     * ProductPackageItem} belongs.
     *                 
     *                 <p>This attribute is required for creation and then
     * is read-only.
     */
    public void setProductPackageId(java.lang.Long productPackageId) {
        this.productPackageId = productPackageId;
    }


    /**
     * Gets the isMandatory value for this ProductPackageItem.
     * 
     * @return isMandatory   * Indicates whether the {@link ProductPackageItem} must be included
     * to complete
     *                 the {@link ProductPackage}.
     *                 
     *                 <p>Deactivating a mandatory {@link ProductPackageItem}
     * will make the {@link ProductPackage}
     *                 unsellable.
     *                 
     *                 <p>This attribute is required.
     */
    public java.lang.Boolean getIsMandatory() {
        return isMandatory;
    }


    /**
     * Sets the isMandatory value for this ProductPackageItem.
     * 
     * @param isMandatory   * Indicates whether the {@link ProductPackageItem} must be included
     * to complete
     *                 the {@link ProductPackage}.
     *                 
     *                 <p>Deactivating a mandatory {@link ProductPackageItem}
     * will make the {@link ProductPackage}
     *                 unsellable.
     *                 
     *                 <p>This attribute is required.
     */
    public void setIsMandatory(java.lang.Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }


    /**
     * Gets the archiveStatus value for this ProductPackageItem.
     * 
     * @return archiveStatus   * The archival status of the {@link ProductPackageItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.ArchiveStatus getArchiveStatus() {
        return archiveStatus;
    }


    /**
     * Sets the archiveStatus value for this ProductPackageItem.
     * 
     * @param archiveStatus   * The archival status of the {@link ProductPackageItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setArchiveStatus(com.google.api.ads.dfp.axis.v201802.ArchiveStatus archiveStatus) {
        this.archiveStatus = archiveStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPackageItem)) return false;
        ProductPackageItem other = (ProductPackageItem) obj;
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
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productPackageId==null && other.getProductPackageId()==null) || 
             (this.productPackageId!=null &&
              this.productPackageId.equals(other.getProductPackageId()))) &&
            ((this.isMandatory==null && other.getIsMandatory()==null) || 
             (this.isMandatory!=null &&
              this.isMandatory.equals(other.getIsMandatory()))) &&
            ((this.archiveStatus==null && other.getArchiveStatus()==null) || 
             (this.archiveStatus!=null &&
              this.archiveStatus.equals(other.getArchiveStatus())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductPackageId() != null) {
            _hashCode += getProductPackageId().hashCode();
        }
        if (getIsMandatory() != null) {
            _hashCode += getIsMandatory().hashCode();
        }
        if (getArchiveStatus() != null) {
            _hashCode += getArchiveStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPackageItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductPackageItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productId"));
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
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isMandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "archiveStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ArchiveStatus"));
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
