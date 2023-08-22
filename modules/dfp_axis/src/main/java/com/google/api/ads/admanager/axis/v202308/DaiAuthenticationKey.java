// Copyright 2023 Google LLC
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
 * DaiAuthenticationKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;


/**
 * A {@code DaiAuthenticationKey} is used to authenticate stream requests
 * to the IMA SDK API.
 */
public class DaiAuthenticationKey  implements java.io.Serializable {
    /* The unique ID of the {@link DaiAuthenticationKey}. This value
     * is read-only and is assigned by
     *                 Google. */
    private java.lang.Long id;

    /* The value of the secure key. This value is read-only and is
     * assigned by Google. */
    private java.lang.String key;

    /* The date and time this {@link DaiAuthenticationKey} was created.
     * This value is read-only and is
     *                 assigned by Google. */
    private com.google.api.ads.admanager.axis.v202308.DateTime creationDateTime;

    /* The status of this {@link DaiAuthenticationKey}. This value
     * is read-only and is assigned by
     *                 Google.
     *                 
     *                 <p>DAI authentication keys are created in the {@link
     * DaiAuthenticationKeyStatus#ACTIVE} state.
     *                 The status can only be modified through the {@link
     * DaiAuthenticationKeyService#performDaiAuthenticationKeyAction} method.
     * 
     *                 <p>Only active keys will be accepted by the IMA SDK
     * API as valid. */
    private com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyStatus status;

    /* The name for this {@link DaiAuthenticationKey}. */
    private java.lang.String name;

    /* The type of this key, which determines how it should be used
     * on stream create requests. */
    private com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyType keyType;

    public DaiAuthenticationKey() {
    }

    public DaiAuthenticationKey(
           java.lang.Long id,
           java.lang.String key,
           com.google.api.ads.admanager.axis.v202308.DateTime creationDateTime,
           com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyStatus status,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyType keyType) {
           this.id = id;
           this.key = key;
           this.creationDateTime = creationDateTime;
           this.status = status;
           this.name = name;
           this.keyType = keyType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creationDateTime", getCreationDateTime())
            .add("id", getId())
            .add("key", getKey())
            .add("keyType", getKeyType())
            .add("name", getName())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this DaiAuthenticationKey.
     * 
     * @return id   * The unique ID of the {@link DaiAuthenticationKey}. This value
     * is read-only and is assigned by
     *                 Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this DaiAuthenticationKey.
     * 
     * @param id   * The unique ID of the {@link DaiAuthenticationKey}. This value
     * is read-only and is assigned by
     *                 Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the key value for this DaiAuthenticationKey.
     * 
     * @return key   * The value of the secure key. This value is read-only and is
     * assigned by Google.
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this DaiAuthenticationKey.
     * 
     * @param key   * The value of the secure key. This value is read-only and is
     * assigned by Google.
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the creationDateTime value for this DaiAuthenticationKey.
     * 
     * @return creationDateTime   * The date and time this {@link DaiAuthenticationKey} was created.
     * This value is read-only and is
     *                 assigned by Google.
     */
    public com.google.api.ads.admanager.axis.v202308.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this DaiAuthenticationKey.
     * 
     * @param creationDateTime   * The date and time this {@link DaiAuthenticationKey} was created.
     * This value is read-only and is
     *                 assigned by Google.
     */
    public void setCreationDateTime(com.google.api.ads.admanager.axis.v202308.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the status value for this DaiAuthenticationKey.
     * 
     * @return status   * The status of this {@link DaiAuthenticationKey}. This value
     * is read-only and is assigned by
     *                 Google.
     *                 
     *                 <p>DAI authentication keys are created in the {@link
     * DaiAuthenticationKeyStatus#ACTIVE} state.
     *                 The status can only be modified through the {@link
     * DaiAuthenticationKeyService#performDaiAuthenticationKeyAction} method.
     * 
     *                 <p>Only active keys will be accepted by the IMA SDK
     * API as valid.
     */
    public com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DaiAuthenticationKey.
     * 
     * @param status   * The status of this {@link DaiAuthenticationKey}. This value
     * is read-only and is assigned by
     *                 Google.
     *                 
     *                 <p>DAI authentication keys are created in the {@link
     * DaiAuthenticationKeyStatus#ACTIVE} state.
     *                 The status can only be modified through the {@link
     * DaiAuthenticationKeyService#performDaiAuthenticationKeyAction} method.
     * 
     *                 <p>Only active keys will be accepted by the IMA SDK
     * API as valid.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyStatus status) {
        this.status = status;
    }


    /**
     * Gets the name value for this DaiAuthenticationKey.
     * 
     * @return name   * The name for this {@link DaiAuthenticationKey}.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DaiAuthenticationKey.
     * 
     * @param name   * The name for this {@link DaiAuthenticationKey}.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the keyType value for this DaiAuthenticationKey.
     * 
     * @return keyType   * The type of this key, which determines how it should be used
     * on stream create requests.
     */
    public com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyType getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this DaiAuthenticationKey.
     * 
     * @param keyType   * The type of this key, which determines how it should be used
     * on stream create requests.
     */
    public void setKeyType(com.google.api.ads.admanager.axis.v202308.DaiAuthenticationKeyType keyType) {
        this.keyType = keyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DaiAuthenticationKey)) return false;
        DaiAuthenticationKey other = (DaiAuthenticationKey) obj;
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
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.keyType==null && other.getKeyType()==null) || 
             (this.keyType!=null &&
              this.keyType.equals(other.getKeyType())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DaiAuthenticationKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "DaiAuthenticationKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "DaiAuthenticationKeyStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "keyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "DaiAuthenticationKeyType"));
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
