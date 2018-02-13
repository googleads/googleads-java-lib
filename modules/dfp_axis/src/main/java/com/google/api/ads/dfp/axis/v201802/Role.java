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
 * Role.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Each {@code Role} provides a user with permissions to perform specific
 * operations in the system.
 */
public class Role  implements java.io.Serializable {
    /* The unique ID of the role. This value is readonly and is assigned
     * by
     *                 Google. Roles that are created by Google will have
     * negative IDs. */
    private java.lang.Long id;

    /* The name of the role. This value is readonly and is assigned
     * by Google. */
    private java.lang.String name;

    /* The description of the role. This value is readonly and is
     * assigned by
     *                 Google. */
    private java.lang.String description;

    /* The status of the {@link Role}. This field is read-only and
     * can have the values
     *                 {@link RoleStatus#ACTIVE} (default) or {@link RoleStatus#INACTIVE},
     * which determines the
     *                 visibility of the role in the UI. */
    private com.google.api.ads.dfp.axis.v201802.RoleStatus status;

    public Role() {
    }

    public Role(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201802.RoleStatus status) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this Role.
     * 
     * @return id   * The unique ID of the role. This value is readonly and is assigned
     * by
     *                 Google. Roles that are created by Google will have
     * negative IDs.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Role.
     * 
     * @param id   * The unique ID of the role. This value is readonly and is assigned
     * by
     *                 Google. Roles that are created by Google will have
     * negative IDs.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Role.
     * 
     * @return name   * The name of the role. This value is readonly and is assigned
     * by Google.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Role.
     * 
     * @param name   * The name of the role. This value is readonly and is assigned
     * by Google.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Role.
     * 
     * @return description   * The description of the role. This value is readonly and is
     * assigned by
     *                 Google.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Role.
     * 
     * @param description   * The description of the role. This value is readonly and is
     * assigned by
     *                 Google.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this Role.
     * 
     * @return status   * The status of the {@link Role}. This field is read-only and
     * can have the values
     *                 {@link RoleStatus#ACTIVE} (default) or {@link RoleStatus#INACTIVE},
     * which determines the
     *                 visibility of the role in the UI.
     */
    public com.google.api.ads.dfp.axis.v201802.RoleStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Role.
     * 
     * @param status   * The status of the {@link Role}. This field is read-only and
     * can have the values
     *                 {@link RoleStatus#ACTIVE} (default) or {@link RoleStatus#INACTIVE},
     * which determines the
     *                 visibility of the role in the UI.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.RoleStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Role)) return false;
        Role other = (Role) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Role.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Role"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RoleStatus"));
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
