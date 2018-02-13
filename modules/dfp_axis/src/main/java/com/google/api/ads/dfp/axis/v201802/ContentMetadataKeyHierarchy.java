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
 * ContentMetadataKeyHierarchy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code ContentMetadataKeyHierarchy} defines a hierarchical relationship
 * between content
 *             metadata keys.
 */
public class ContentMetadataKeyHierarchy  implements java.io.Serializable {
    /* The unique ID of the {@code ContentMetadataKeyHierarchy}. This
     * value is readonly and
     *                 is assigned by Google. */
    private java.lang.Integer id;

    /* The unique name of the {@code ContentMetadataKeyHierarchy}.
     * This attribute is readonly
     *                 and has a maximum length of 255 characters. */
    private java.lang.String name;

    /* The levels of the {@code ContentMetadataKeyHierarchy}. This
     * attribute is readonly and
     *                 the hierarchy levels must form a continuous set of
     * 1, 2, ..., N where N is the number
     *                 of levels in the hierarchy. */
    private com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyLevel[] hierarchyLevels;

    /* The {@link ContentMetadataKeyHierarchyStatus} of the hierarchy.
     * This attribute is read-only and
     *                 defaults to {@link ContentMetadataKeyHierarchyStatus#ACTIVE}. */
    private com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyStatus status;

    public ContentMetadataKeyHierarchy() {
    }

    public ContentMetadataKeyHierarchy(
           java.lang.Integer id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyLevel[] hierarchyLevels,
           com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyStatus status) {
           this.id = id;
           this.name = name;
           this.hierarchyLevels = hierarchyLevels;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("hierarchyLevels", getHierarchyLevels())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this ContentMetadataKeyHierarchy.
     * 
     * @return id   * The unique ID of the {@code ContentMetadataKeyHierarchy}. This
     * value is readonly and
     *                 is assigned by Google.
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ContentMetadataKeyHierarchy.
     * 
     * @param id   * The unique ID of the {@code ContentMetadataKeyHierarchy}. This
     * value is readonly and
     *                 is assigned by Google.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ContentMetadataKeyHierarchy.
     * 
     * @return name   * The unique name of the {@code ContentMetadataKeyHierarchy}.
     * This attribute is readonly
     *                 and has a maximum length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ContentMetadataKeyHierarchy.
     * 
     * @param name   * The unique name of the {@code ContentMetadataKeyHierarchy}.
     * This attribute is readonly
     *                 and has a maximum length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the hierarchyLevels value for this ContentMetadataKeyHierarchy.
     * 
     * @return hierarchyLevels   * The levels of the {@code ContentMetadataKeyHierarchy}. This
     * attribute is readonly and
     *                 the hierarchy levels must form a continuous set of
     * 1, 2, ..., N where N is the number
     *                 of levels in the hierarchy.
     */
    public com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyLevel[] getHierarchyLevels() {
        return hierarchyLevels;
    }


    /**
     * Sets the hierarchyLevels value for this ContentMetadataKeyHierarchy.
     * 
     * @param hierarchyLevels   * The levels of the {@code ContentMetadataKeyHierarchy}. This
     * attribute is readonly and
     *                 the hierarchy levels must form a continuous set of
     * 1, 2, ..., N where N is the number
     *                 of levels in the hierarchy.
     */
    public void setHierarchyLevels(com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyLevel[] hierarchyLevels) {
        this.hierarchyLevels = hierarchyLevels;
    }

    public com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyLevel getHierarchyLevels(int i) {
        return this.hierarchyLevels[i];
    }

    public void setHierarchyLevels(int i, com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyLevel _value) {
        this.hierarchyLevels[i] = _value;
    }


    /**
     * Gets the status value for this ContentMetadataKeyHierarchy.
     * 
     * @return status   * The {@link ContentMetadataKeyHierarchyStatus} of the hierarchy.
     * This attribute is read-only and
     *                 defaults to {@link ContentMetadataKeyHierarchyStatus#ACTIVE}.
     */
    public com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContentMetadataKeyHierarchy.
     * 
     * @param status   * The {@link ContentMetadataKeyHierarchyStatus} of the hierarchy.
     * This attribute is read-only and
     *                 defaults to {@link ContentMetadataKeyHierarchyStatus#ACTIVE}.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentMetadataKeyHierarchy)) return false;
        ContentMetadataKeyHierarchy other = (ContentMetadataKeyHierarchy) obj;
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
            ((this.hierarchyLevels==null && other.getHierarchyLevels()==null) || 
             (this.hierarchyLevels!=null &&
              java.util.Arrays.equals(this.hierarchyLevels, other.getHierarchyLevels()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getHierarchyLevels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHierarchyLevels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHierarchyLevels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentMetadataKeyHierarchy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ContentMetadataKeyHierarchy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("hierarchyLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "hierarchyLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ContentMetadataKeyHierarchyLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ContentMetadataKeyHierarchyStatus"));
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
