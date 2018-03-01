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
 * Label.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a label that can be attached to entities such as campaign,
 * ad group, ads,
 *             criterion etc.
 */
public class Label  implements java.io.Serializable {
    /* Id of label.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span> */
    private java.lang.Long id;

    /* Name of label.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span> */
    private java.lang.String name;

    /* Status of the label.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.LabelStatus status;

    /* Attributes of the label.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.LabelAttribute attribute;

    /* Indicates that this instance is a subtype of Label.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String labelType;

    public Label() {
    }

    public Label(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.LabelStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.LabelAttribute attribute,
           java.lang.String labelType) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.attribute = attribute;
           this.labelType = labelType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("attribute", getAttribute())
            .add("id", getId())
            .add("labelType", getLabelType())
            .add("name", getName())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this Label.
     * 
     * @return id   * Id of label.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Label.
     * 
     * @param id   * Id of label.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Label.
     * 
     * @return name   * Name of label.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Label.
     * 
     * @param name   * Name of label.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Label.
     * 
     * @return status   * Status of the label.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.LabelStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Label.
     * 
     * @param status   * Status of the label.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.LabelStatus status) {
        this.status = status;
    }


    /**
     * Gets the attribute value for this Label.
     * 
     * @return attribute   * Attributes of the label.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.LabelAttribute getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this Label.
     * 
     * @param attribute   * Attributes of the label.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setAttribute(com.google.api.ads.adwords.axis.v201802.cm.LabelAttribute attribute) {
        this.attribute = attribute;
    }


    /**
     * Gets the labelType value for this Label.
     * 
     * @return labelType   * Indicates that this instance is a subtype of Label.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getLabelType() {
        return labelType;
    }


    /**
     * Sets the labelType value for this Label.
     * 
     * @param labelType   * Indicates that this instance is a subtype of Label.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setLabelType(java.lang.String labelType) {
        this.labelType = labelType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Label)) return false;
        Label other = (Label) obj;
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
              this.status.equals(other.getStatus()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              this.attribute.equals(other.getAttribute()))) &&
            ((this.labelType==null && other.getLabelType()==null) || 
             (this.labelType!=null &&
              this.labelType.equals(other.getLabelType())));
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
        if (getAttribute() != null) {
            _hashCode += getAttribute().hashCode();
        }
        if (getLabelType() != null) {
            _hashCode += getLabelType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Label.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Label"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Label.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LabelAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Label.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
