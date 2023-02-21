// Copyright 2023 Google LLC
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
 * BreakdownForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202302;


/**
 * Represents a single delivery data point, with both available
 *             and forecast number.
 */
public class BreakdownForecast  implements java.io.Serializable {
    private java.lang.Long matched;

    private java.lang.Long available;

    private java.lang.Long possible;

    public BreakdownForecast() {
    }

    public BreakdownForecast(
           java.lang.Long matched,
           java.lang.Long available,
           java.lang.Long possible) {
           this.matched = matched;
           this.available = available;
           this.possible = possible;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("available", getAvailable())
            .add("matched", getMatched())
            .add("possible", getPossible())
            .toString();
    }

    /**
     * Gets the matched value for this BreakdownForecast.
     * 
     * @return matched
     */
    public java.lang.Long getMatched() {
        return matched;
    }


    /**
     * Sets the matched value for this BreakdownForecast.
     * 
     * @param matched
     */
    public void setMatched(java.lang.Long matched) {
        this.matched = matched;
    }


    /**
     * Gets the available value for this BreakdownForecast.
     * 
     * @return available
     */
    public java.lang.Long getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this BreakdownForecast.
     * 
     * @param available
     */
    public void setAvailable(java.lang.Long available) {
        this.available = available;
    }


    /**
     * Gets the possible value for this BreakdownForecast.
     * 
     * @return possible
     */
    public java.lang.Long getPossible() {
        return possible;
    }


    /**
     * Sets the possible value for this BreakdownForecast.
     * 
     * @param possible
     */
    public void setPossible(java.lang.Long possible) {
        this.possible = possible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BreakdownForecast)) return false;
        BreakdownForecast other = (BreakdownForecast) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matched==null && other.getMatched()==null) || 
             (this.matched!=null &&
              this.matched.equals(other.getMatched()))) &&
            ((this.available==null && other.getAvailable()==null) || 
             (this.available!=null &&
              this.available.equals(other.getAvailable()))) &&
            ((this.possible==null && other.getPossible()==null) || 
             (this.possible!=null &&
              this.possible.equals(other.getPossible())));
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
        if (getMatched() != null) {
            _hashCode += getMatched().hashCode();
        }
        if (getAvailable() != null) {
            _hashCode += getAvailable().hashCode();
        }
        if (getPossible() != null) {
            _hashCode += getPossible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BreakdownForecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "BreakdownForecast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matched");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "matched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "possible"));
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
