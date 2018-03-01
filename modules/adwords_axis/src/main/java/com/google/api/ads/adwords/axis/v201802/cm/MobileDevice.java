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
 * MobileDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a Mobile Device Criterion.
 *             <p>A criterion of this type can only be created using
 * an ID.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class MobileDevice  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private java.lang.String deviceName;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private java.lang.String manufacturerName;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.MobileDeviceDeviceType deviceType;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "OperatingSystemName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String operatingSystemName;

    public MobileDevice() {
    }

    public MobileDevice(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String deviceName,
           java.lang.String manufacturerName,
           com.google.api.ads.adwords.axis.v201802.cm.MobileDeviceDeviceType deviceType,
           java.lang.String operatingSystemName) {
        super(
            id,
            type,
            criterionType);
        this.deviceName = deviceName;
        this.manufacturerName = manufacturerName;
        this.deviceType = deviceType;
        this.operatingSystemName = operatingSystemName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("deviceName", getDeviceName())
            .add("deviceType", getDeviceType())
            .add("id", getId())
            .add("manufacturerName", getManufacturerName())
            .add("operatingSystemName", getOperatingSystemName())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the deviceName value for this MobileDevice.
     * 
     * @return deviceName   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this MobileDevice.
     * 
     * @param deviceName   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the manufacturerName value for this MobileDevice.
     * 
     * @return manufacturerName   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public java.lang.String getManufacturerName() {
        return manufacturerName;
    }


    /**
     * Sets the manufacturerName value for this MobileDevice.
     * 
     * @param manufacturerName   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setManufacturerName(java.lang.String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }


    /**
     * Gets the deviceType value for this MobileDevice.
     * 
     * @return deviceType   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MobileDeviceDeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this MobileDevice.
     * 
     * @param deviceType   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setDeviceType(com.google.api.ads.adwords.axis.v201802.cm.MobileDeviceDeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the operatingSystemName value for this MobileDevice.
     * 
     * @return operatingSystemName   * <span class="constraint Selectable">This field can be selected
     * using the value "OperatingSystemName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getOperatingSystemName() {
        return operatingSystemName;
    }


    /**
     * Sets the operatingSystemName value for this MobileDevice.
     * 
     * @param operatingSystemName   * <span class="constraint Selectable">This field can be selected
     * using the value "OperatingSystemName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setOperatingSystemName(java.lang.String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileDevice)) return false;
        MobileDevice other = (MobileDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.manufacturerName==null && other.getManufacturerName()==null) || 
             (this.manufacturerName!=null &&
              this.manufacturerName.equals(other.getManufacturerName()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.operatingSystemName==null && other.getOperatingSystemName()==null) || 
             (this.operatingSystemName!=null &&
              this.operatingSystemName.equals(other.getOperatingSystemName())));
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getManufacturerName() != null) {
            _hashCode += getManufacturerName().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getOperatingSystemName() != null) {
            _hashCode += getOperatingSystemName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "deviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "manufacturerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileDevice.DeviceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operatingSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
