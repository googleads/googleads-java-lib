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
 * AppliedLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a {@link Label} that can be applied to an entity. To
 * negate an
 *             inherited label, create an {@code AppliedLabel} with {@code
 * labelId} as the
 *             inherited label's ID and {@code isNegated} set to true.
 */
public class AppliedLabel  implements java.io.Serializable {
    /* The ID of a created {@link Label}. */
    private java.lang.Long labelId;

    /* {@code isNegated} should be set to {@code true} to negate the
     * effects of
     *                 {@code labelId}. */
    private java.lang.Boolean isNegated;

    public AppliedLabel() {
    }

    public AppliedLabel(
           java.lang.Long labelId,
           java.lang.Boolean isNegated) {
           this.labelId = labelId;
           this.isNegated = isNegated;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("isNegated", getIsNegated())
            .add("labelId", getLabelId())
            .toString();
    }

    /**
     * Gets the labelId value for this AppliedLabel.
     * 
     * @return labelId   * The ID of a created {@link Label}.
     */
    public java.lang.Long getLabelId() {
        return labelId;
    }


    /**
     * Sets the labelId value for this AppliedLabel.
     * 
     * @param labelId   * The ID of a created {@link Label}.
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }


    /**
     * Gets the isNegated value for this AppliedLabel.
     * 
     * @return isNegated   * {@code isNegated} should be set to {@code true} to negate the
     * effects of
     *                 {@code labelId}.
     */
    public java.lang.Boolean getIsNegated() {
        return isNegated;
    }


    /**
     * Sets the isNegated value for this AppliedLabel.
     * 
     * @param isNegated   * {@code isNegated} should be set to {@code true} to negate the
     * effects of
     *                 {@code labelId}.
     */
    public void setIsNegated(java.lang.Boolean isNegated) {
        this.isNegated = isNegated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppliedLabel)) return false;
        AppliedLabel other = (AppliedLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.labelId==null && other.getLabelId()==null) || 
             (this.labelId!=null &&
              this.labelId.equals(other.getLabelId()))) &&
            ((this.isNegated==null && other.getIsNegated()==null) || 
             (this.isNegated!=null &&
              this.isNegated.equals(other.getIsNegated())));
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
        if (getLabelId() != null) {
            _hashCode += getLabelId().hashCode();
        }
        if (getIsNegated() != null) {
            _hashCode += getIsNegated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppliedLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AppliedLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "labelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNegated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isNegated"));
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
