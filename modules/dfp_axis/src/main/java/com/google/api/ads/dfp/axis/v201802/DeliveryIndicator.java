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
 * DeliveryIndicator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Indicates the delivery performance of the {@link LineItem}.
 */
public class DeliveryIndicator  implements java.io.Serializable {
    /* How much the {@code LineItem} was expected to deliver as a
     * percentage of
     *                 {@link LineItem#unitsBought}. */
    private java.lang.Double expectedDeliveryPercentage;

    /* How much the line item actually delivered as a percentage of
     * {@link LineItem#unitsBought}. */
    private java.lang.Double actualDeliveryPercentage;

    public DeliveryIndicator() {
    }

    public DeliveryIndicator(
           java.lang.Double expectedDeliveryPercentage,
           java.lang.Double actualDeliveryPercentage) {
           this.expectedDeliveryPercentage = expectedDeliveryPercentage;
           this.actualDeliveryPercentage = actualDeliveryPercentage;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("actualDeliveryPercentage", getActualDeliveryPercentage())
            .add("expectedDeliveryPercentage", getExpectedDeliveryPercentage())
            .toString();
    }

    /**
     * Gets the expectedDeliveryPercentage value for this DeliveryIndicator.
     * 
     * @return expectedDeliveryPercentage   * How much the {@code LineItem} was expected to deliver as a
     * percentage of
     *                 {@link LineItem#unitsBought}.
     */
    public java.lang.Double getExpectedDeliveryPercentage() {
        return expectedDeliveryPercentage;
    }


    /**
     * Sets the expectedDeliveryPercentage value for this DeliveryIndicator.
     * 
     * @param expectedDeliveryPercentage   * How much the {@code LineItem} was expected to deliver as a
     * percentage of
     *                 {@link LineItem#unitsBought}.
     */
    public void setExpectedDeliveryPercentage(java.lang.Double expectedDeliveryPercentage) {
        this.expectedDeliveryPercentage = expectedDeliveryPercentage;
    }


    /**
     * Gets the actualDeliveryPercentage value for this DeliveryIndicator.
     * 
     * @return actualDeliveryPercentage   * How much the line item actually delivered as a percentage of
     * {@link LineItem#unitsBought}.
     */
    public java.lang.Double getActualDeliveryPercentage() {
        return actualDeliveryPercentage;
    }


    /**
     * Sets the actualDeliveryPercentage value for this DeliveryIndicator.
     * 
     * @param actualDeliveryPercentage   * How much the line item actually delivered as a percentage of
     * {@link LineItem#unitsBought}.
     */
    public void setActualDeliveryPercentage(java.lang.Double actualDeliveryPercentage) {
        this.actualDeliveryPercentage = actualDeliveryPercentage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryIndicator)) return false;
        DeliveryIndicator other = (DeliveryIndicator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expectedDeliveryPercentage==null && other.getExpectedDeliveryPercentage()==null) || 
             (this.expectedDeliveryPercentage!=null &&
              this.expectedDeliveryPercentage.equals(other.getExpectedDeliveryPercentage()))) &&
            ((this.actualDeliveryPercentage==null && other.getActualDeliveryPercentage()==null) || 
             (this.actualDeliveryPercentage!=null &&
              this.actualDeliveryPercentage.equals(other.getActualDeliveryPercentage())));
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
        if (getExpectedDeliveryPercentage() != null) {
            _hashCode += getExpectedDeliveryPercentage().hashCode();
        }
        if (getActualDeliveryPercentage() != null) {
            _hashCode += getActualDeliveryPercentage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryIndicator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeliveryIndicator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "expectedDeliveryPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "actualDeliveryPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
