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
 * MonthlySearchVolumeAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * {@link Attribute} type that contains a list of {@link MonthlySearchVolume}
 * values. The list contains the past 12 {@link MonthlySearchVolume}s
 * (excluding the current month). The first item is the data for the
 * most
 *             recent month and the last item is the data for the oldest
 * month.
 */
public class MonthlySearchVolumeAttribute  extends com.google.api.ads.adwords.axis.v201802.o.Attribute  implements java.io.Serializable {
    /* List of {@link MonthlySearchVolume} values contained by this
     * {@link Attribute}. The list contains the data for the past 12 months
     * (excluding the current month) in sorted order started with the most
     * recent
     *                     month.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.MonthlySearchVolume[] value;

    public MonthlySearchVolumeAttribute() {
    }

    public MonthlySearchVolumeAttribute(
           java.lang.String attributeType,
           com.google.api.ads.adwords.axis.v201802.o.MonthlySearchVolume[] value) {
        super(
            attributeType);
        this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("attributeType", getAttributeType())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the value value for this MonthlySearchVolumeAttribute.
     * 
     * @return value   * List of {@link MonthlySearchVolume} values contained by this
     * {@link Attribute}. The list contains the data for the past 12 months
     * (excluding the current month) in sorted order started with the most
     * recent
     *                     month.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.MonthlySearchVolume[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this MonthlySearchVolumeAttribute.
     * 
     * @param value   * List of {@link MonthlySearchVolume} values contained by this
     * {@link Attribute}. The list contains the data for the past 12 months
     * (excluding the current month) in sorted order started with the most
     * recent
     *                     month.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setValue(com.google.api.ads.adwords.axis.v201802.o.MonthlySearchVolume[] value) {
        this.value = value;
    }

    public com.google.api.ads.adwords.axis.v201802.o.MonthlySearchVolume getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.google.api.ads.adwords.axis.v201802.o.MonthlySearchVolume _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonthlySearchVolumeAttribute)) return false;
        MonthlySearchVolumeAttribute other = (MonthlySearchVolumeAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(MonthlySearchVolumeAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "MonthlySearchVolumeAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "MonthlySearchVolume"));
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
