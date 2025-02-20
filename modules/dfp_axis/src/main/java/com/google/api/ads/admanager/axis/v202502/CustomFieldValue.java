// Copyright 2025 Google LLC
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
 * CustomFieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;


/**
 * The value of a {@link CustomField} that does not have a {@link
 * CustomField#dataType} of {@link
 *             CustomFieldDataType#DROP_DOWN}.
 */
public class CustomFieldValue  extends com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue  implements java.io.Serializable {
    /* The value for this field. The appropriate type of {@code Value}
     * is determined by the {@link
     *                     CustomField#dataType} of the {@code CustomField}
     * that this conforms to.
     *                     
     *                     <table>
     *                     <tr><th>{@link CustomFieldDataType}</th><th>{@link
     * Value} type</th></tr>
     *                     <tr><td>{@link CustomFieldDataType#STRING STRING}</td><td>{@link
     * TextValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#NUMBER NUMBER}</td><td>{@link
     * NumberValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#TOGGLE TOGGLE}</td><td>{@link
     * BooleanValue}</td></tr>
     *                     </table> */
    private com.google.api.ads.admanager.axis.v202502.Value value;

    public CustomFieldValue() {
    }

    public CustomFieldValue(
           java.lang.Long customFieldId,
           com.google.api.ads.admanager.axis.v202502.Value value) {
        super(
            customFieldId);
        this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("customFieldId", getCustomFieldId())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the value value for this CustomFieldValue.
     * 
     * @return value   * The value for this field. The appropriate type of {@code Value}
     * is determined by the {@link
     *                     CustomField#dataType} of the {@code CustomField}
     * that this conforms to.
     *                     
     *                     <table>
     *                     <tr><th>{@link CustomFieldDataType}</th><th>{@link
     * Value} type</th></tr>
     *                     <tr><td>{@link CustomFieldDataType#STRING STRING}</td><td>{@link
     * TextValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#NUMBER NUMBER}</td><td>{@link
     * NumberValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#TOGGLE TOGGLE}</td><td>{@link
     * BooleanValue}</td></tr>
     *                     </table>
     */
    public com.google.api.ads.admanager.axis.v202502.Value getValue() {
        return value;
    }


    /**
     * Sets the value value for this CustomFieldValue.
     * 
     * @param value   * The value for this field. The appropriate type of {@code Value}
     * is determined by the {@link
     *                     CustomField#dataType} of the {@code CustomField}
     * that this conforms to.
     *                     
     *                     <table>
     *                     <tr><th>{@link CustomFieldDataType}</th><th>{@link
     * Value} type</th></tr>
     *                     <tr><td>{@link CustomFieldDataType#STRING STRING}</td><td>{@link
     * TextValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#NUMBER NUMBER}</td><td>{@link
     * NumberValue}</td></tr>
     *                     <tr><td>{@link CustomFieldDataType#TOGGLE TOGGLE}</td><td>{@link
     * BooleanValue}</td></tr>
     *                     </table>
     */
    public void setValue(com.google.api.ads.admanager.axis.v202502.Value value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldValue)) return false;
        CustomFieldValue other = (CustomFieldValue) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomFieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "CustomFieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "Value"));
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
