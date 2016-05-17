/**
 * DeviceManufacturerTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;


/**
 * Represents device manufacturer that are being targeted or excluded
 * by the
 *             {@link LineItem}.
 */
public class DeviceManufacturerTargeting  implements java.io.Serializable {
    /* Indicates whether device manufacturers should be targeted or
     * excluded. This
     *                 attribute is optional and defaults to {@code true}. */
    private java.lang.Boolean isTargeted;

    /* Device manufacturers that are being targeted or excluded by
     * the
     *                 {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201605.Technology[] deviceManufacturers;

    public DeviceManufacturerTargeting() {
    }

    public DeviceManufacturerTargeting(
           java.lang.Boolean isTargeted,
           com.google.api.ads.dfp.axis.v201605.Technology[] deviceManufacturers) {
           this.isTargeted = isTargeted;
           this.deviceManufacturers = deviceManufacturers;
    }


    /**
     * Gets the isTargeted value for this DeviceManufacturerTargeting.
     * 
     * @return isTargeted   * Indicates whether device manufacturers should be targeted or
     * excluded. This
     *                 attribute is optional and defaults to {@code true}.
     */
    public java.lang.Boolean getIsTargeted() {
        return isTargeted;
    }


    /**
     * Sets the isTargeted value for this DeviceManufacturerTargeting.
     * 
     * @param isTargeted   * Indicates whether device manufacturers should be targeted or
     * excluded. This
     *                 attribute is optional and defaults to {@code true}.
     */
    public void setIsTargeted(java.lang.Boolean isTargeted) {
        this.isTargeted = isTargeted;
    }


    /**
     * Gets the deviceManufacturers value for this DeviceManufacturerTargeting.
     * 
     * @return deviceManufacturers   * Device manufacturers that are being targeted or excluded by
     * the
     *                 {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201605.Technology[] getDeviceManufacturers() {
        return deviceManufacturers;
    }


    /**
     * Sets the deviceManufacturers value for this DeviceManufacturerTargeting.
     * 
     * @param deviceManufacturers   * Device manufacturers that are being targeted or excluded by
     * the
     *                 {@link LineItem}.
     */
    public void setDeviceManufacturers(com.google.api.ads.dfp.axis.v201605.Technology[] deviceManufacturers) {
        this.deviceManufacturers = deviceManufacturers;
    }

    public com.google.api.ads.dfp.axis.v201605.Technology getDeviceManufacturers(int i) {
        return this.deviceManufacturers[i];
    }

    public void setDeviceManufacturers(int i, com.google.api.ads.dfp.axis.v201605.Technology _value) {
        this.deviceManufacturers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceManufacturerTargeting)) return false;
        DeviceManufacturerTargeting other = (DeviceManufacturerTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isTargeted==null && other.getIsTargeted()==null) || 
             (this.isTargeted!=null &&
              this.isTargeted.equals(other.getIsTargeted()))) &&
            ((this.deviceManufacturers==null && other.getDeviceManufacturers()==null) || 
             (this.deviceManufacturers!=null &&
              java.util.Arrays.equals(this.deviceManufacturers, other.getDeviceManufacturers())));
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
        if (getIsTargeted() != null) {
            _hashCode += getIsTargeted().hashCode();
        }
        if (getDeviceManufacturers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceManufacturers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceManufacturers(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceManufacturerTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "DeviceManufacturerTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "isTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceManufacturers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "deviceManufacturers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "Technology"));
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
