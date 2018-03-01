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
 * LocationExtensionOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * This operand specifies information required for location extension
 * targeting.
 */
public class LocationExtensionOperand  extends com.google.api.ads.adwords.axis.v201802.cm.FunctionArgumentOperand  implements java.io.Serializable {
    /* Distance in units specifying the radius around targeted locations.
     * Only long and double are supported constant types.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ConstantOperand radius;

    /* Used to filter locations present in the location feed by location
     * criterion id. */
    private java.lang.Long locationId;

    public LocationExtensionOperand() {
    }

    public LocationExtensionOperand(
           java.lang.String functionArgumentOperandType,
           com.google.api.ads.adwords.axis.v201802.cm.ConstantOperand radius,
           java.lang.Long locationId) {
        super(
            functionArgumentOperandType);
        this.radius = radius;
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("functionArgumentOperandType", getFunctionArgumentOperandType())
            .add("locationId", getLocationId())
            .add("radius", getRadius())
            .toString();
    }

    /**
     * Gets the radius value for this LocationExtensionOperand.
     * 
     * @return radius   * Distance in units specifying the radius around targeted locations.
     * Only long and double are supported constant types.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConstantOperand getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this LocationExtensionOperand.
     * 
     * @param radius   * Distance in units specifying the radius around targeted locations.
     * Only long and double are supported constant types.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setRadius(com.google.api.ads.adwords.axis.v201802.cm.ConstantOperand radius) {
        this.radius = radius;
    }


    /**
     * Gets the locationId value for this LocationExtensionOperand.
     * 
     * @return locationId   * Used to filter locations present in the location feed by location
     * criterion id.
     */
    public java.lang.Long getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this LocationExtensionOperand.
     * 
     * @param locationId   * Used to filter locations present in the location feed by location
     * criterion id.
     */
    public void setLocationId(java.lang.Long locationId) {
        this.locationId = locationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationExtensionOperand)) return false;
        LocationExtensionOperand other = (LocationExtensionOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.radius==null && other.getRadius()==null) || 
             (this.radius!=null &&
              this.radius.equals(other.getRadius()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId())));
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
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationExtensionOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LocationExtensionOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConstantOperand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "locationId"));
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
