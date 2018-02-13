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
 * ProductPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code ProductPackage} represents a group of products which will
 * be sold together.
 */
public class ProductPackage  implements java.io.Serializable {
    /* Uniquely identifies the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code ProductPackage}
     *                 is created. */
    private java.lang.Long id;

    /* The name of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is required and has maximum length
     * of 255 characters. */
    private java.lang.String name;

    /* The notes of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute has maximum length of 511 characters.
     * 
     *                 <p>This attribute is optional. */
    private java.lang.String notes;

    /* The status of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google. */
    private com.google.api.ads.dfp.axis.v201802.ProductPackageStatus status;

    /* The archival status of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google. */
    private java.lang.Boolean isArchived;

    /* {@link RateCard} IDs associated with the {@code ProductPackage}.
     * 
     *                 <p>This attribute is optional. */
    private long[] rateCardIds;

    /* The {@link CustomFieldValue} objects associated with this {@code
     * ProductPackage}.
     *                 
     *                 <p>This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues;

    /* The date and time this {@code ProductPackage} was last modified.
     * 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code ProductPackage}
     *                 is updated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    public ProductPackage() {
    }

    public ProductPackage(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201802.ProductPackageStatus status,
           java.lang.Boolean isArchived,
           long[] rateCardIds,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
           this.id = id;
           this.name = name;
           this.notes = notes;
           this.status = status;
           this.isArchived = isArchived;
           this.rateCardIds = rateCardIds;
           this.customFieldValues = customFieldValues;
           this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("customFieldValues", getCustomFieldValues())
            .add("id", getId())
            .add("isArchived", getIsArchived())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("notes", getNotes())
            .add("rateCardIds", getRateCardIds())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this ProductPackage.
     * 
     * @return id   * Uniquely identifies the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code ProductPackage}
     *                 is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ProductPackage.
     * 
     * @param id   * Uniquely identifies the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code ProductPackage}
     *                 is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ProductPackage.
     * 
     * @return name   * The name of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is required and has maximum length
     * of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductPackage.
     * 
     * @param name   * The name of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is required and has maximum length
     * of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this ProductPackage.
     * 
     * @return notes   * The notes of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute has maximum length of 511 characters.
     * 
     *                 <p>This attribute is optional.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ProductPackage.
     * 
     * @param notes   * The notes of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute has maximum length of 511 characters.
     * 
     *                 <p>This attribute is optional.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the status value for this ProductPackage.
     * 
     * @return status   * The status of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google.
     */
    public com.google.api.ads.dfp.axis.v201802.ProductPackageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProductPackage.
     * 
     * @param status   * The status of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ProductPackageStatus status) {
        this.status = status;
    }


    /**
     * Gets the isArchived value for this ProductPackage.
     * 
     * @return isArchived   * The archival status of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this ProductPackage.
     * 
     * @param isArchived   * The archival status of the {@code ProductPackage}.
     *                 
     *                 <p>This attribute is read-only and is assigned by
     * Google.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the rateCardIds value for this ProductPackage.
     * 
     * @return rateCardIds   * {@link RateCard} IDs associated with the {@code ProductPackage}.
     * 
     *                 <p>This attribute is optional.
     */
    public long[] getRateCardIds() {
        return rateCardIds;
    }


    /**
     * Sets the rateCardIds value for this ProductPackage.
     * 
     * @param rateCardIds   * {@link RateCard} IDs associated with the {@code ProductPackage}.
     * 
     *                 <p>This attribute is optional.
     */
    public void setRateCardIds(long[] rateCardIds) {
        this.rateCardIds = rateCardIds;
    }

    public long getRateCardIds(int i) {
        return this.rateCardIds[i];
    }

    public void setRateCardIds(int i, long _value) {
        this.rateCardIds[i] = _value;
    }


    /**
     * Gets the customFieldValues value for this ProductPackage.
     * 
     * @return customFieldValues   * The {@link CustomFieldValue} objects associated with this {@code
     * ProductPackage}.
     *                 
     *                 <p>This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this ProductPackage.
     * 
     * @param customFieldValues   * The {@link CustomFieldValue} objects associated with this {@code
     * ProductPackage}.
     *                 
     *                 <p>This attribute is optional.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the lastModifiedDateTime value for this ProductPackage.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code ProductPackage} was last modified.
     * 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code ProductPackage}
     *                 is updated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this ProductPackage.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code ProductPackage} was last modified.
     * 
     *                 <p>This attribute is read-only and is assigned by
     * Google when a {@code ProductPackage}
     *                 is updated.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPackage)) return false;
        ProductPackage other = (ProductPackage) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.rateCardIds==null && other.getRateCardIds()==null) || 
             (this.rateCardIds!=null &&
              java.util.Arrays.equals(this.rateCardIds, other.getRateCardIds()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getRateCardIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateCardIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateCardIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductPackageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateCardIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
