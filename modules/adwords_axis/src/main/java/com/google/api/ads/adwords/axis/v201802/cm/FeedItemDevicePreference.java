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
 * FeedItemDevicePreference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a FeedItem device preference.
 */
public class FeedItemDevicePreference  implements java.io.Serializable {
    /* CriterionId of the type of device the feed item is preferred
     * to serve on.
     *                 Only CriterionId 30001 (mobile devices) is currently
     * supported.
     *                 If unspecified, the device preference will be cleared
     * indicating that the feed item
     *                 is not preferred for any device type. */
    private java.lang.Long devicePreference;

    public FeedItemDevicePreference() {
    }

    public FeedItemDevicePreference(
           java.lang.Long devicePreference) {
           this.devicePreference = devicePreference;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("devicePreference", getDevicePreference())
            .toString();
    }

    /**
     * Gets the devicePreference value for this FeedItemDevicePreference.
     * 
     * @return devicePreference   * CriterionId of the type of device the feed item is preferred
     * to serve on.
     *                 Only CriterionId 30001 (mobile devices) is currently
     * supported.
     *                 If unspecified, the device preference will be cleared
     * indicating that the feed item
     *                 is not preferred for any device type.
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this FeedItemDevicePreference.
     * 
     * @param devicePreference   * CriterionId of the type of device the feed item is preferred
     * to serve on.
     *                 Only CriterionId 30001 (mobile devices) is currently
     * supported.
     *                 If unspecified, the device preference will be cleared
     * indicating that the feed item
     *                 is not preferred for any device type.
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemDevicePreference)) return false;
        FeedItemDevicePreference other = (FeedItemDevicePreference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference())));
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
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemDevicePreference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemDevicePreference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "devicePreference"));
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
