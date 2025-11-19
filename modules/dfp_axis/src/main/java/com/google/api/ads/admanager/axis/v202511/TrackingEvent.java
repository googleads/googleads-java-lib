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
 * TrackingEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;


/**
 * A {@code TrackingEvent} contains information about an event that
 * triggered a URL to get pinged.
 *             
 *             <p>For example, a VAST response could contain a URL to
 * ping if an ad is clicked on. For VAST
 *             redirects there may be multiple tracking events for a
 * single event because every ad server
 *             involved will get pinged.
 */
public class TrackingEvent  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202511.TrackingEventPing[] pings;

    public TrackingEvent() {
    }

    public TrackingEvent(
           com.google.api.ads.admanager.axis.v202511.TrackingEventPing[] pings) {
           this.pings = pings;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("pings", getPings())
            .toString();
    }

    /**
     * Gets the pings value for this TrackingEvent.
     * 
     * @return pings
     */
    public com.google.api.ads.admanager.axis.v202511.TrackingEventPing[] getPings() {
        return pings;
    }


    /**
     * Sets the pings value for this TrackingEvent.
     * 
     * @param pings
     */
    public void setPings(com.google.api.ads.admanager.axis.v202511.TrackingEventPing[] pings) {
        this.pings = pings;
    }

    public com.google.api.ads.admanager.axis.v202511.TrackingEventPing getPings(int i) {
        return this.pings[i];
    }

    public void setPings(int i, com.google.api.ads.admanager.axis.v202511.TrackingEventPing _value) {
        this.pings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingEvent)) return false;
        TrackingEvent other = (TrackingEvent) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pings==null && other.getPings()==null) || 
             (this.pings!=null &&
              java.util.Arrays.equals(this.pings, other.getPings())));
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
        if (getPings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPings(), i);
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
        new org.apache.axis.description.TypeDesc(TrackingEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "TrackingEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "pings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "TrackingEvent.Ping"));
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
