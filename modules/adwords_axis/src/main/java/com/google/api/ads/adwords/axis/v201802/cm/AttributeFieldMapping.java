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
 * AttributeFieldMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a mapping between a feed attribute and a placeholder
 * field.
 *             
 *             <p>For a list of feed placeholders, see
 *             <a href="/adwords/api/docs/appendix/placeholders">
 *             https://developers.google.com/adwords/api/docs/appendix/placeholders
 * </a></p>
 */
public class AttributeFieldMapping  implements java.io.Serializable {
    /* The feed attribute that this mapping references.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedAttributeId;

    /* The constant placeholder field that this mapping references.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.Integer fieldId;

    public AttributeFieldMapping() {
    }

    public AttributeFieldMapping(
           java.lang.Long feedAttributeId,
           java.lang.Integer fieldId) {
           this.feedAttributeId = feedAttributeId;
           this.fieldId = fieldId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("feedAttributeId", getFeedAttributeId())
            .add("fieldId", getFieldId())
            .toString();
    }

    /**
     * Gets the feedAttributeId value for this AttributeFieldMapping.
     * 
     * @return feedAttributeId   * The feed attribute that this mapping references.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedAttributeId() {
        return feedAttributeId;
    }


    /**
     * Sets the feedAttributeId value for this AttributeFieldMapping.
     * 
     * @param feedAttributeId   * The feed attribute that this mapping references.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFeedAttributeId(java.lang.Long feedAttributeId) {
        this.feedAttributeId = feedAttributeId;
    }


    /**
     * Gets the fieldId value for this AttributeFieldMapping.
     * 
     * @return fieldId   * The constant placeholder field that this mapping references.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.Integer getFieldId() {
        return fieldId;
    }


    /**
     * Sets the fieldId value for this AttributeFieldMapping.
     * 
     * @param fieldId   * The constant placeholder field that this mapping references.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setFieldId(java.lang.Integer fieldId) {
        this.fieldId = fieldId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeFieldMapping)) return false;
        AttributeFieldMapping other = (AttributeFieldMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedAttributeId==null && other.getFeedAttributeId()==null) || 
             (this.feedAttributeId!=null &&
              this.feedAttributeId.equals(other.getFeedAttributeId()))) &&
            ((this.fieldId==null && other.getFieldId()==null) || 
             (this.fieldId!=null &&
              this.fieldId.equals(other.getFieldId())));
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
        if (getFeedAttributeId() != null) {
            _hashCode += getFeedAttributeId().hashCode();
        }
        if (getFieldId() != null) {
            _hashCode += getFieldId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeFieldMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AttributeFieldMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedAttributeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
