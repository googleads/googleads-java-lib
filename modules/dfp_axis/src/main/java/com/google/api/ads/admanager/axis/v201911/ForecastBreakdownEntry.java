// Copyright 2019 Google LLC
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
 * ForecastBreakdownEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201911;


/**
 * A single forecast breakdown entry.
 */
public class ForecastBreakdownEntry  implements java.io.Serializable {
    /* The optional name of this entry, as specified in the corresponding
     * {@link ForecastBreakdownTarget#name} field. */
    private java.lang.String name;

    /* The forecast of this entry. */
    private com.google.api.ads.admanager.axis.v201911.BreakdownForecast forecast;

    public ForecastBreakdownEntry() {
    }

    public ForecastBreakdownEntry(
           java.lang.String name,
           com.google.api.ads.admanager.axis.v201911.BreakdownForecast forecast) {
           this.name = name;
           this.forecast = forecast;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("forecast", getForecast())
            .add("name", getName())
            .toString();
    }

    /**
     * Gets the name value for this ForecastBreakdownEntry.
     * 
     * @return name   * The optional name of this entry, as specified in the corresponding
     * {@link ForecastBreakdownTarget#name} field.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ForecastBreakdownEntry.
     * 
     * @param name   * The optional name of this entry, as specified in the corresponding
     * {@link ForecastBreakdownTarget#name} field.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the forecast value for this ForecastBreakdownEntry.
     * 
     * @return forecast   * The forecast of this entry.
     */
    public com.google.api.ads.admanager.axis.v201911.BreakdownForecast getForecast() {
        return forecast;
    }


    /**
     * Sets the forecast value for this ForecastBreakdownEntry.
     * 
     * @param forecast   * The forecast of this entry.
     */
    public void setForecast(com.google.api.ads.admanager.axis.v201911.BreakdownForecast forecast) {
        this.forecast = forecast;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastBreakdownEntry)) return false;
        ForecastBreakdownEntry other = (ForecastBreakdownEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.forecast==null && other.getForecast()==null) || 
             (this.forecast!=null &&
              this.forecast.equals(other.getForecast())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getForecast() != null) {
            _hashCode += getForecast().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastBreakdownEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "ForecastBreakdownEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecast");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "forecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "BreakdownForecast"));
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
