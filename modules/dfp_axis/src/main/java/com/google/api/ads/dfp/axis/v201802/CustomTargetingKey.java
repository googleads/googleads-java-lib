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
 * CustomTargetingKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * {@code CustomTargetingKey} represents a key used for custom targeting.
 */
public class CustomTargetingKey  implements java.io.Serializable {
    /* The ID of the {@code CustomTargetingKey}. This value is readonly
     * and is
     *                 populated by Google. */
    private java.lang.Long id;

    /* Name of the key. This can be used for encoding . If you don't
     * want users to
     *                 be able to see potentially sensitive targeting information
     * in the ad tags
     *                 of your site, you can encode your key/values. For
     * example, you can create
     *                 key/value g1=abc to represent gender=female. Keys
     * can contain up to 10
     *                 characters each. You can use alphanumeric characters
     * and symbols other than
     *                 the following: ", ', =, !, +, #, *, ~, ;, ^, (, ),
     * <, >, [, ], the white
     *                 space character. */
    private java.lang.String name;

    /* Descriptive name for the key. */
    private java.lang.String displayName;

    /* Indicates whether users will select from predefined values
     * or create new
     *                 targeting values, while specifying targeting criteria
     * for a line item. */
    private com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyType type;

    /* Status of the {@code CustomTargetingKey}. This field is read-only.
     * A key can be activated and
     *                 deactivated by calling {@link CustomTargetingService#performCustomTargetingKeyAction}. */
    private com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyStatus status;

    public CustomTargetingKey() {
    }

    public CustomTargetingKey(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String displayName,
           com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyType type,
           com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyStatus status) {
           this.id = id;
           this.name = name;
           this.displayName = displayName;
           this.type = type;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("displayName", getDisplayName())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the id value for this CustomTargetingKey.
     * 
     * @return id   * The ID of the {@code CustomTargetingKey}. This value is readonly
     * and is
     *                 populated by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomTargetingKey.
     * 
     * @param id   * The ID of the {@code CustomTargetingKey}. This value is readonly
     * and is
     *                 populated by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this CustomTargetingKey.
     * 
     * @return name   * Name of the key. This can be used for encoding . If you don't
     * want users to
     *                 be able to see potentially sensitive targeting information
     * in the ad tags
     *                 of your site, you can encode your key/values. For
     * example, you can create
     *                 key/value g1=abc to represent gender=female. Keys
     * can contain up to 10
     *                 characters each. You can use alphanumeric characters
     * and symbols other than
     *                 the following: ", ', =, !, +, #, *, ~, ;, ^, (, ),
     * <, >, [, ], the white
     *                 space character.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomTargetingKey.
     * 
     * @param name   * Name of the key. This can be used for encoding . If you don't
     * want users to
     *                 be able to see potentially sensitive targeting information
     * in the ad tags
     *                 of your site, you can encode your key/values. For
     * example, you can create
     *                 key/value g1=abc to represent gender=female. Keys
     * can contain up to 10
     *                 characters each. You can use alphanumeric characters
     * and symbols other than
     *                 the following: ", ', =, !, +, #, *, ~, ;, ^, (, ),
     * <, >, [, ], the white
     *                 space character.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this CustomTargetingKey.
     * 
     * @return displayName   * Descriptive name for the key.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CustomTargetingKey.
     * 
     * @param displayName   * Descriptive name for the key.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the type value for this CustomTargetingKey.
     * 
     * @return type   * Indicates whether users will select from predefined values
     * or create new
     *                 targeting values, while specifying targeting criteria
     * for a line item.
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyType getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomTargetingKey.
     * 
     * @param type   * Indicates whether users will select from predefined values
     * or create new
     *                 targeting values, while specifying targeting criteria
     * for a line item.
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyType type) {
        this.type = type;
    }


    /**
     * Gets the status value for this CustomTargetingKey.
     * 
     * @return status   * Status of the {@code CustomTargetingKey}. This field is read-only.
     * A key can be activated and
     *                 deactivated by calling {@link CustomTargetingService#performCustomTargetingKeyAction}.
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomTargetingKey.
     * 
     * @param status   * Status of the {@code CustomTargetingKey}. This field is read-only.
     * A key can be activated and
     *                 deactivated by calling {@link CustomTargetingService#performCustomTargetingKeyAction}.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTargetingKey)) return false;
        CustomTargetingKey other = (CustomTargetingKey) obj;
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
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomTargetingKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomTargetingKey"));
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
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomTargetingKey.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomTargetingKey.Status"));
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
