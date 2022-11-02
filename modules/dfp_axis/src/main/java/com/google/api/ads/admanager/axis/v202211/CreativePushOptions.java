// Copyright 2022 Google LLC
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
 * CreativePushOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;


/**
 * Data needed to push a creative to a mobile device.
 */
public class CreativePushOptions  implements java.io.Serializable {
    /* The ID of the LineItem to preview.
     *                 
     *                 <p>This field is required. */
    private java.lang.Long lineItemId;

    /* The ID of the Creative to preview.
     *                 
     *                 <p>This field is required. */
    private java.lang.Long creativeId;

    /* The ID of the native style to preview the creative with.
     *                 
     *                 <p>This field is optional but the referenced object
     * must exist. */
    private java.lang.Long nativeStyleId;

    public CreativePushOptions() {
    }

    public CreativePushOptions(
           java.lang.Long lineItemId,
           java.lang.Long creativeId,
           java.lang.Long nativeStyleId) {
           this.lineItemId = lineItemId;
           this.creativeId = creativeId;
           this.nativeStyleId = nativeStyleId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creativeId", getCreativeId())
            .add("lineItemId", getLineItemId())
            .add("nativeStyleId", getNativeStyleId())
            .toString();
    }

    /**
     * Gets the lineItemId value for this CreativePushOptions.
     * 
     * @return lineItemId   * The ID of the LineItem to preview.
     *                 
     *                 <p>This field is required.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this CreativePushOptions.
     * 
     * @param lineItemId   * The ID of the LineItem to preview.
     *                 
     *                 <p>This field is required.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the creativeId value for this CreativePushOptions.
     * 
     * @return creativeId   * The ID of the Creative to preview.
     *                 
     *                 <p>This field is required.
     */
    public java.lang.Long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativePushOptions.
     * 
     * @param creativeId   * The ID of the Creative to preview.
     *                 
     *                 <p>This field is required.
     */
    public void setCreativeId(java.lang.Long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the nativeStyleId value for this CreativePushOptions.
     * 
     * @return nativeStyleId   * The ID of the native style to preview the creative with.
     *                 
     *                 <p>This field is optional but the referenced object
     * must exist.
     */
    public java.lang.Long getNativeStyleId() {
        return nativeStyleId;
    }


    /**
     * Sets the nativeStyleId value for this CreativePushOptions.
     * 
     * @param nativeStyleId   * The ID of the native style to preview the creative with.
     *                 
     *                 <p>This field is optional but the referenced object
     * must exist.
     */
    public void setNativeStyleId(java.lang.Long nativeStyleId) {
        this.nativeStyleId = nativeStyleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativePushOptions)) return false;
        CreativePushOptions other = (CreativePushOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemId==null && other.getLineItemId()==null) || 
             (this.lineItemId!=null &&
              this.lineItemId.equals(other.getLineItemId()))) &&
            ((this.creativeId==null && other.getCreativeId()==null) || 
             (this.creativeId!=null &&
              this.creativeId.equals(other.getCreativeId()))) &&
            ((this.nativeStyleId==null && other.getNativeStyleId()==null) || 
             (this.nativeStyleId!=null &&
              this.nativeStyleId.equals(other.getNativeStyleId())));
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
        if (getLineItemId() != null) {
            _hashCode += getLineItemId().hashCode();
        }
        if (getCreativeId() != null) {
            _hashCode += getCreativeId().hashCode();
        }
        if (getNativeStyleId() != null) {
            _hashCode += getNativeStyleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativePushOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "CreativePushOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeStyleId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "nativeStyleId"));
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
