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
 * DropDownCustomFieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@link CustomFieldValue} for a {@link CustomField} that has a
 * {@link CustomField#dataType}
 *             of {@link CustomFieldDataType#DROP_DOWN}
 */
public class DropDownCustomFieldValue  extends com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue  implements java.io.Serializable {
    /* The {@link CustomFieldOption#id ID} of the {@link CustomFieldOption}
     * for
     *                     this value. */
    private java.lang.Long customFieldOptionId;

    public DropDownCustomFieldValue() {
    }

    public DropDownCustomFieldValue(
           java.lang.Long customFieldId,
           java.lang.Long customFieldOptionId) {
        super(
            customFieldId);
        this.customFieldOptionId = customFieldOptionId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("customFieldId", getCustomFieldId())
            .add("customFieldOptionId", getCustomFieldOptionId())
            .toString();
    }

    /**
     * Gets the customFieldOptionId value for this DropDownCustomFieldValue.
     * 
     * @return customFieldOptionId   * The {@link CustomFieldOption#id ID} of the {@link CustomFieldOption}
     * for
     *                     this value.
     */
    public java.lang.Long getCustomFieldOptionId() {
        return customFieldOptionId;
    }


    /**
     * Sets the customFieldOptionId value for this DropDownCustomFieldValue.
     * 
     * @param customFieldOptionId   * The {@link CustomFieldOption#id ID} of the {@link CustomFieldOption}
     * for
     *                     this value.
     */
    public void setCustomFieldOptionId(java.lang.Long customFieldOptionId) {
        this.customFieldOptionId = customFieldOptionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DropDownCustomFieldValue)) return false;
        DropDownCustomFieldValue other = (DropDownCustomFieldValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customFieldOptionId==null && other.getCustomFieldOptionId()==null) || 
             (this.customFieldOptionId!=null &&
              this.customFieldOptionId.equals(other.getCustomFieldOptionId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustomFieldOptionId() != null) {
            _hashCode += getCustomFieldOptionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DropDownCustomFieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DropDownCustomFieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldOptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customFieldOptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
