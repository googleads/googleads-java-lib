/**
 * MobileDeviceSubmodel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * Represents a mobile device submodel.
 */
public class MobileDeviceSubmodel  extends com.google.api.ads.dfp.axis.v201411.Technology  implements java.io.Serializable {
    /* The mobile device id. */
    private java.lang.Long mobileDeviceCriterionId;

    /* The device manufacturer id. */
    private java.lang.Long deviceManufacturerCriterionId;

    public MobileDeviceSubmodel() {
    }

    public MobileDeviceSubmodel(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String technologyType,
           java.lang.Long mobileDeviceCriterionId,
           java.lang.Long deviceManufacturerCriterionId) {
        super(
            id,
            name,
            technologyType);
        this.mobileDeviceCriterionId = mobileDeviceCriterionId;
        this.deviceManufacturerCriterionId = deviceManufacturerCriterionId;
    }


    /**
     * Gets the mobileDeviceCriterionId value for this MobileDeviceSubmodel.
     * 
     * @return mobileDeviceCriterionId   * The mobile device id.
     */
    public java.lang.Long getMobileDeviceCriterionId() {
        return mobileDeviceCriterionId;
    }


    /**
     * Sets the mobileDeviceCriterionId value for this MobileDeviceSubmodel.
     * 
     * @param mobileDeviceCriterionId   * The mobile device id.
     */
    public void setMobileDeviceCriterionId(java.lang.Long mobileDeviceCriterionId) {
        this.mobileDeviceCriterionId = mobileDeviceCriterionId;
    }


    /**
     * Gets the deviceManufacturerCriterionId value for this MobileDeviceSubmodel.
     * 
     * @return deviceManufacturerCriterionId   * The device manufacturer id.
     */
    public java.lang.Long getDeviceManufacturerCriterionId() {
        return deviceManufacturerCriterionId;
    }


    /**
     * Sets the deviceManufacturerCriterionId value for this MobileDeviceSubmodel.
     * 
     * @param deviceManufacturerCriterionId   * The device manufacturer id.
     */
    public void setDeviceManufacturerCriterionId(java.lang.Long deviceManufacturerCriterionId) {
        this.deviceManufacturerCriterionId = deviceManufacturerCriterionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileDeviceSubmodel)) return false;
        MobileDeviceSubmodel other = (MobileDeviceSubmodel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mobileDeviceCriterionId==null && other.getMobileDeviceCriterionId()==null) || 
             (this.mobileDeviceCriterionId!=null &&
              this.mobileDeviceCriterionId.equals(other.getMobileDeviceCriterionId()))) &&
            ((this.deviceManufacturerCriterionId==null && other.getDeviceManufacturerCriterionId()==null) || 
             (this.deviceManufacturerCriterionId!=null &&
              this.deviceManufacturerCriterionId.equals(other.getDeviceManufacturerCriterionId())));
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
        if (getMobileDeviceCriterionId() != null) {
            _hashCode += getMobileDeviceCriterionId().hashCode();
        }
        if (getDeviceManufacturerCriterionId() != null) {
            _hashCode += getDeviceManufacturerCriterionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileDeviceSubmodel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "MobileDeviceSubmodel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceCriterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "mobileDeviceCriterionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceManufacturerCriterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "deviceManufacturerCriterionId"));
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
