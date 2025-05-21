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
 * DeliveryForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * The forecast of delivery for a list of {@link ProspectiveLineItem}
 * objects to be reserved at the
 *             same time.
 */
public class DeliveryForecast  implements java.io.Serializable {
    /* The delivery forecasts of the forecasted line items. */
    private com.google.api.ads.admanager.axis.v202505.LineItemDeliveryForecast[] lineItemDeliveryForecasts;

    public DeliveryForecast() {
    }

    public DeliveryForecast(
           com.google.api.ads.admanager.axis.v202505.LineItemDeliveryForecast[] lineItemDeliveryForecasts) {
           this.lineItemDeliveryForecasts = lineItemDeliveryForecasts;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("lineItemDeliveryForecasts", getLineItemDeliveryForecasts())
            .toString();
    }

    /**
     * Gets the lineItemDeliveryForecasts value for this DeliveryForecast.
     * 
     * @return lineItemDeliveryForecasts   * The delivery forecasts of the forecasted line items.
     */
    public com.google.api.ads.admanager.axis.v202505.LineItemDeliveryForecast[] getLineItemDeliveryForecasts() {
        return lineItemDeliveryForecasts;
    }


    /**
     * Sets the lineItemDeliveryForecasts value for this DeliveryForecast.
     * 
     * @param lineItemDeliveryForecasts   * The delivery forecasts of the forecasted line items.
     */
    public void setLineItemDeliveryForecasts(com.google.api.ads.admanager.axis.v202505.LineItemDeliveryForecast[] lineItemDeliveryForecasts) {
        this.lineItemDeliveryForecasts = lineItemDeliveryForecasts;
    }

    public com.google.api.ads.admanager.axis.v202505.LineItemDeliveryForecast getLineItemDeliveryForecasts(int i) {
        return this.lineItemDeliveryForecasts[i];
    }

    public void setLineItemDeliveryForecasts(int i, com.google.api.ads.admanager.axis.v202505.LineItemDeliveryForecast _value) {
        this.lineItemDeliveryForecasts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryForecast)) return false;
        DeliveryForecast other = (DeliveryForecast) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemDeliveryForecasts==null && other.getLineItemDeliveryForecasts()==null) || 
             (this.lineItemDeliveryForecasts!=null &&
              java.util.Arrays.equals(this.lineItemDeliveryForecasts, other.getLineItemDeliveryForecasts())));
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
        if (getLineItemDeliveryForecasts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemDeliveryForecasts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemDeliveryForecasts(), i);
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
        new org.apache.axis.description.TypeDesc(DeliveryForecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "DeliveryForecast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDeliveryForecasts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "lineItemDeliveryForecasts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "LineItemDeliveryForecast"));
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
