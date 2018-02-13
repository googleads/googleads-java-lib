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
 * ContentBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code ContentBundle} is a grouping of individual {@link Content}.
 * A {@code ContentBundle} is
 *             defined as including the {@code Content} that match certain
 * filter rules, along with the
 *             option to explicitly include or exclude certain {@code
 * Content} IDs.
 */
public class ContentBundle  implements java.io.Serializable {
    /* ID that uniquely identifies the {@code ContentBundle}. This
     * attribute is read-only and
     *                 is assigned by Google when a content bundle is created. */
    private java.lang.Long id;

    /* The name of the {@code ContentBundle}. This attribute is required
     * and has a maximum length of
     *                 255 characters. */
    private java.lang.String name;

    /* The {@link ContentBundleStatus} of the {@code ContentBundle}.
     * This attribute is read-only and
     *                 defaults to {@link ContentBundleStatus#INACTIVE}. */
    private com.google.api.ads.dfp.axis.v201802.ContentBundleStatus status;

    public ContentBundle() {
    }

    public ContentBundle(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.ContentBundleStatus status) {
           this.id = id;
           this.name = name;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this ContentBundle.
     * 
     * @return id   * ID that uniquely identifies the {@code ContentBundle}. This
     * attribute is read-only and
     *                 is assigned by Google when a content bundle is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ContentBundle.
     * 
     * @param id   * ID that uniquely identifies the {@code ContentBundle}. This
     * attribute is read-only and
     *                 is assigned by Google when a content bundle is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ContentBundle.
     * 
     * @return name   * The name of the {@code ContentBundle}. This attribute is required
     * and has a maximum length of
     *                 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ContentBundle.
     * 
     * @param name   * The name of the {@code ContentBundle}. This attribute is required
     * and has a maximum length of
     *                 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this ContentBundle.
     * 
     * @return status   * The {@link ContentBundleStatus} of the {@code ContentBundle}.
     * This attribute is read-only and
     *                 defaults to {@link ContentBundleStatus#INACTIVE}.
     */
    public com.google.api.ads.dfp.axis.v201802.ContentBundleStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContentBundle.
     * 
     * @param status   * The {@link ContentBundleStatus} of the {@code ContentBundle}.
     * This attribute is read-only and
     *                 defaults to {@link ContentBundleStatus#INACTIVE}.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ContentBundleStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentBundle)) return false;
        ContentBundle other = (ContentBundle) obj;
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ContentBundle"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ContentBundleStatus"));
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
