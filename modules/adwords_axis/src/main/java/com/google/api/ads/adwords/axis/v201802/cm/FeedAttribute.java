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
 * FeedAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * FeedAttributes define the types of data expected to be present
 * in a Feed. A single FeedAttribute
 *             specifies the expected type of the FeedItemAttributes
 * with the same FeedAttributeId. Optionally,
 *             a FeedAttribute can be marked as being part of a FeedItem's
 * unique key.
 */
public class FeedAttribute  implements java.io.Serializable {
    /* Id of the attribute. */
    private java.lang.Long id;

    /* The name of the attribute.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 30, inclusive, (trimmed).</span> */
    private java.lang.String name;

    /* The expected type of the data.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeType type;

    /* Indicates that data corresponding to this attribute is part
     * of a FeedItem's unique key. It
     *                 defaults to false if it is unspecified. Note that
     * a unique key is not required in a Feed's
     *                 schema, in which case the FeedItems must be referenced
     * by their FeedItemId. */
    private java.lang.Boolean isPartOfKey;

    public FeedAttribute() {
    }

    public FeedAttribute(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeType type,
           java.lang.Boolean isPartOfKey) {
           this.id = id;
           this.name = name;
           this.type = type;
           this.isPartOfKey = isPartOfKey;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("isPartOfKey", getIsPartOfKey())
            .add("name", getName())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the id value for this FeedAttribute.
     * 
     * @return id   * Id of the attribute.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this FeedAttribute.
     * 
     * @param id   * Id of the attribute.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this FeedAttribute.
     * 
     * @return name   * The name of the attribute.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 30, inclusive, (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FeedAttribute.
     * 
     * @param name   * The name of the attribute.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 30, inclusive, (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this FeedAttribute.
     * 
     * @return type   * The expected type of the data.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeType getType() {
        return type;
    }


    /**
     * Sets the type value for this FeedAttribute.
     * 
     * @param type   * The expected type of the data.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeType type) {
        this.type = type;
    }


    /**
     * Gets the isPartOfKey value for this FeedAttribute.
     * 
     * @return isPartOfKey   * Indicates that data corresponding to this attribute is part
     * of a FeedItem's unique key. It
     *                 defaults to false if it is unspecified. Note that
     * a unique key is not required in a Feed's
     *                 schema, in which case the FeedItems must be referenced
     * by their FeedItemId.
     */
    public java.lang.Boolean getIsPartOfKey() {
        return isPartOfKey;
    }


    /**
     * Sets the isPartOfKey value for this FeedAttribute.
     * 
     * @param isPartOfKey   * Indicates that data corresponding to this attribute is part
     * of a FeedItem's unique key. It
     *                 defaults to false if it is unspecified. Note that
     * a unique key is not required in a Feed's
     *                 schema, in which case the FeedItems must be referenced
     * by their FeedItemId.
     */
    public void setIsPartOfKey(java.lang.Boolean isPartOfKey) {
        this.isPartOfKey = isPartOfKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedAttribute)) return false;
        FeedAttribute other = (FeedAttribute) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.isPartOfKey==null && other.getIsPartOfKey()==null) || 
             (this.isPartOfKey!=null &&
              this.isPartOfKey.equals(other.getIsPartOfKey())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIsPartOfKey() != null) {
            _hashCode += getIsPartOfKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttribute.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartOfKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isPartOfKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
