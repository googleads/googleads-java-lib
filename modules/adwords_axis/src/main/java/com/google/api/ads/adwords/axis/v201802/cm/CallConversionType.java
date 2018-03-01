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
 * CallConversionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Conversion type for a call extension.
 */
public class CallConversionType  implements java.io.Serializable {
    /* The ID of an AdCallMetricsConversion object. This object contains
     * the phoneCallDuration field
     *                 which is the minimum duration (in seconds) of a call
     * to be considered a conversion. */
    private java.lang.Long conversionTypeId;

    public CallConversionType() {
    }

    public CallConversionType(
           java.lang.Long conversionTypeId) {
           this.conversionTypeId = conversionTypeId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("conversionTypeId", getConversionTypeId())
            .toString();
    }

    /**
     * Gets the conversionTypeId value for this CallConversionType.
     * 
     * @return conversionTypeId   * The ID of an AdCallMetricsConversion object. This object contains
     * the phoneCallDuration field
     *                 which is the minimum duration (in seconds) of a call
     * to be considered a conversion.
     */
    public java.lang.Long getConversionTypeId() {
        return conversionTypeId;
    }


    /**
     * Sets the conversionTypeId value for this CallConversionType.
     * 
     * @param conversionTypeId   * The ID of an AdCallMetricsConversion object. This object contains
     * the phoneCallDuration field
     *                 which is the minimum duration (in seconds) of a call
     * to be considered a conversion.
     */
    public void setConversionTypeId(java.lang.Long conversionTypeId) {
        this.conversionTypeId = conversionTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallConversionType)) return false;
        CallConversionType other = (CallConversionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conversionTypeId==null && other.getConversionTypeId()==null) || 
             (this.conversionTypeId!=null &&
              this.conversionTypeId.equals(other.getConversionTypeId())));
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
        if (getConversionTypeId() != null) {
            _hashCode += getConversionTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallConversionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CallConversionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionTypeId"));
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
