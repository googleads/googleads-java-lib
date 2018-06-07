// Copyright 2018 Google LLC
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
 * CustomAffinity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.rm;


/**
 * Custom affinity audience defined by a collection of examples/hints.
 */
public class CustomAffinity  implements java.io.Serializable {
    /* The ID of the custom affinity.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CustomAffinityId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* Status of custom affinity, ENABLED or REMOVED.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityStatus status;

    /* The name of this custom affinity. It should be unique across
     * the same custom affinity audience.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String name;

    /* The type of this custom affinity, CUSTOM_AFFINITY or CUSTOM_INTENT.
     * By default the type is set to CUSTOM_AFFINITY.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Type".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityType type;

    /* The description of this custom affinity audience.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Description".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String description;

    /* List of custom affinity tokens that this custom affinity is
     * composed of. Tokens can be
     *                 added during CustomAffinity creation. Later they can
     * be added or removed using mutateToken
     *                 method. This field is returned by the {@link CustomAffinityService#get}
     * method without the
     *                 need to select.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Tokens".</span> */
    private com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityToken[] tokens;

    public CustomAffinity() {
    }

    public CustomAffinity(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityStatus status,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityType type,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityToken[] tokens) {
           this.id = id;
           this.status = status;
           this.name = name;
           this.type = type;
           this.description = description;
           this.tokens = tokens;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .add("tokens", getTokens())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the id value for this CustomAffinity.
     * 
     * @return id   * The ID of the custom affinity.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CustomAffinityId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomAffinity.
     * 
     * @param id   * The ID of the custom affinity.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CustomAffinityId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the status value for this CustomAffinity.
     * 
     * @return status   * Status of custom affinity, ENABLED or REMOVED.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomAffinity.
     * 
     * @param status   * Status of custom affinity, ENABLED or REMOVED.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityStatus status) {
        this.status = status;
    }


    /**
     * Gets the name value for this CustomAffinity.
     * 
     * @return name   * The name of this custom affinity. It should be unique across
     * the same custom affinity audience.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomAffinity.
     * 
     * @param name   * The name of this custom affinity. It should be unique across
     * the same custom affinity audience.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this CustomAffinity.
     * 
     * @return type   * The type of this custom affinity, CUSTOM_AFFINITY or CUSTOM_INTENT.
     * By default the type is set to CUSTOM_AFFINITY.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Type".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityType getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomAffinity.
     * 
     * @param type   * The type of this custom affinity, CUSTOM_AFFINITY or CUSTOM_INTENT.
     * By default the type is set to CUSTOM_AFFINITY.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Type".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityType type) {
        this.type = type;
    }


    /**
     * Gets the description value for this CustomAffinity.
     * 
     * @return description   * The description of this custom affinity audience.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Description".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomAffinity.
     * 
     * @param description   * The description of this custom affinity audience.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Description".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the tokens value for this CustomAffinity.
     * 
     * @return tokens   * List of custom affinity tokens that this custom affinity is
     * composed of. Tokens can be
     *                 added during CustomAffinity creation. Later they can
     * be added or removed using mutateToken
     *                 method. This field is returned by the {@link CustomAffinityService#get}
     * method without the
     *                 need to select.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Tokens".</span>
     */
    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityToken[] getTokens() {
        return tokens;
    }


    /**
     * Sets the tokens value for this CustomAffinity.
     * 
     * @param tokens   * List of custom affinity tokens that this custom affinity is
     * composed of. Tokens can be
     *                 added during CustomAffinity creation. Later they can
     * be added or removed using mutateToken
     *                 method. This field is returned by the {@link CustomAffinityService#get}
     * method without the
     *                 need to select.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Tokens".</span>
     */
    public void setTokens(com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityToken[] tokens) {
        this.tokens = tokens;
    }

    public com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityToken getTokens(int i) {
        return this.tokens[i];
    }

    public void setTokens(int i, com.google.api.ads.adwords.axis.v201806.rm.CustomAffinityToken _value) {
        this.tokens[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomAffinity)) return false;
        CustomAffinity other = (CustomAffinity) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.tokens==null && other.getTokens()==null) || 
             (this.tokens!=null &&
              java.util.Arrays.equals(this.tokens, other.getTokens())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTokens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokens(), i);
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
        new org.apache.axis.description.TypeDesc(CustomAffinity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "CustomAffinity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "CustomAffinityStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "CustomAffinityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokens");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "tokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "CustomAffinityToken"));
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
