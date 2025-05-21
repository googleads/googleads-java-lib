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
 * TechnologyTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;

public class TechnologyTargeting  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202505.BandwidthGroupTargeting bandwidthGroupTargeting;

    private com.google.api.ads.admanager.axis.v202505.BrowserTargeting browserTargeting;

    private com.google.api.ads.admanager.axis.v202505.BrowserLanguageTargeting browserLanguageTargeting;

    private com.google.api.ads.admanager.axis.v202505.DeviceCapabilityTargeting deviceCapabilityTargeting;

    private com.google.api.ads.admanager.axis.v202505.DeviceCategoryTargeting deviceCategoryTargeting;

    private com.google.api.ads.admanager.axis.v202505.DeviceManufacturerTargeting deviceManufacturerTargeting;

    private com.google.api.ads.admanager.axis.v202505.MobileCarrierTargeting mobileCarrierTargeting;

    private com.google.api.ads.admanager.axis.v202505.MobileDeviceTargeting mobileDeviceTargeting;

    private com.google.api.ads.admanager.axis.v202505.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting;

    private com.google.api.ads.admanager.axis.v202505.OperatingSystemTargeting operatingSystemTargeting;

    private com.google.api.ads.admanager.axis.v202505.OperatingSystemVersionTargeting operatingSystemVersionTargeting;

    public TechnologyTargeting() {
    }

    public TechnologyTargeting(
           com.google.api.ads.admanager.axis.v202505.BandwidthGroupTargeting bandwidthGroupTargeting,
           com.google.api.ads.admanager.axis.v202505.BrowserTargeting browserTargeting,
           com.google.api.ads.admanager.axis.v202505.BrowserLanguageTargeting browserLanguageTargeting,
           com.google.api.ads.admanager.axis.v202505.DeviceCapabilityTargeting deviceCapabilityTargeting,
           com.google.api.ads.admanager.axis.v202505.DeviceCategoryTargeting deviceCategoryTargeting,
           com.google.api.ads.admanager.axis.v202505.DeviceManufacturerTargeting deviceManufacturerTargeting,
           com.google.api.ads.admanager.axis.v202505.MobileCarrierTargeting mobileCarrierTargeting,
           com.google.api.ads.admanager.axis.v202505.MobileDeviceTargeting mobileDeviceTargeting,
           com.google.api.ads.admanager.axis.v202505.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting,
           com.google.api.ads.admanager.axis.v202505.OperatingSystemTargeting operatingSystemTargeting,
           com.google.api.ads.admanager.axis.v202505.OperatingSystemVersionTargeting operatingSystemVersionTargeting) {
           this.bandwidthGroupTargeting = bandwidthGroupTargeting;
           this.browserTargeting = browserTargeting;
           this.browserLanguageTargeting = browserLanguageTargeting;
           this.deviceCapabilityTargeting = deviceCapabilityTargeting;
           this.deviceCategoryTargeting = deviceCategoryTargeting;
           this.deviceManufacturerTargeting = deviceManufacturerTargeting;
           this.mobileCarrierTargeting = mobileCarrierTargeting;
           this.mobileDeviceTargeting = mobileDeviceTargeting;
           this.mobileDeviceSubmodelTargeting = mobileDeviceSubmodelTargeting;
           this.operatingSystemTargeting = operatingSystemTargeting;
           this.operatingSystemVersionTargeting = operatingSystemVersionTargeting;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bandwidthGroupTargeting", getBandwidthGroupTargeting())
            .add("browserLanguageTargeting", getBrowserLanguageTargeting())
            .add("browserTargeting", getBrowserTargeting())
            .add("deviceCapabilityTargeting", getDeviceCapabilityTargeting())
            .add("deviceCategoryTargeting", getDeviceCategoryTargeting())
            .add("deviceManufacturerTargeting", getDeviceManufacturerTargeting())
            .add("mobileCarrierTargeting", getMobileCarrierTargeting())
            .add("mobileDeviceSubmodelTargeting", getMobileDeviceSubmodelTargeting())
            .add("mobileDeviceTargeting", getMobileDeviceTargeting())
            .add("operatingSystemTargeting", getOperatingSystemTargeting())
            .add("operatingSystemVersionTargeting", getOperatingSystemVersionTargeting())
            .toString();
    }

    /**
     * Gets the bandwidthGroupTargeting value for this TechnologyTargeting.
     * 
     * @return bandwidthGroupTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.BandwidthGroupTargeting getBandwidthGroupTargeting() {
        return bandwidthGroupTargeting;
    }


    /**
     * Sets the bandwidthGroupTargeting value for this TechnologyTargeting.
     * 
     * @param bandwidthGroupTargeting
     */
    public void setBandwidthGroupTargeting(com.google.api.ads.admanager.axis.v202505.BandwidthGroupTargeting bandwidthGroupTargeting) {
        this.bandwidthGroupTargeting = bandwidthGroupTargeting;
    }


    /**
     * Gets the browserTargeting value for this TechnologyTargeting.
     * 
     * @return browserTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.BrowserTargeting getBrowserTargeting() {
        return browserTargeting;
    }


    /**
     * Sets the browserTargeting value for this TechnologyTargeting.
     * 
     * @param browserTargeting
     */
    public void setBrowserTargeting(com.google.api.ads.admanager.axis.v202505.BrowserTargeting browserTargeting) {
        this.browserTargeting = browserTargeting;
    }


    /**
     * Gets the browserLanguageTargeting value for this TechnologyTargeting.
     * 
     * @return browserLanguageTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.BrowserLanguageTargeting getBrowserLanguageTargeting() {
        return browserLanguageTargeting;
    }


    /**
     * Sets the browserLanguageTargeting value for this TechnologyTargeting.
     * 
     * @param browserLanguageTargeting
     */
    public void setBrowserLanguageTargeting(com.google.api.ads.admanager.axis.v202505.BrowserLanguageTargeting browserLanguageTargeting) {
        this.browserLanguageTargeting = browserLanguageTargeting;
    }


    /**
     * Gets the deviceCapabilityTargeting value for this TechnologyTargeting.
     * 
     * @return deviceCapabilityTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.DeviceCapabilityTargeting getDeviceCapabilityTargeting() {
        return deviceCapabilityTargeting;
    }


    /**
     * Sets the deviceCapabilityTargeting value for this TechnologyTargeting.
     * 
     * @param deviceCapabilityTargeting
     */
    public void setDeviceCapabilityTargeting(com.google.api.ads.admanager.axis.v202505.DeviceCapabilityTargeting deviceCapabilityTargeting) {
        this.deviceCapabilityTargeting = deviceCapabilityTargeting;
    }


    /**
     * Gets the deviceCategoryTargeting value for this TechnologyTargeting.
     * 
     * @return deviceCategoryTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.DeviceCategoryTargeting getDeviceCategoryTargeting() {
        return deviceCategoryTargeting;
    }


    /**
     * Sets the deviceCategoryTargeting value for this TechnologyTargeting.
     * 
     * @param deviceCategoryTargeting
     */
    public void setDeviceCategoryTargeting(com.google.api.ads.admanager.axis.v202505.DeviceCategoryTargeting deviceCategoryTargeting) {
        this.deviceCategoryTargeting = deviceCategoryTargeting;
    }


    /**
     * Gets the deviceManufacturerTargeting value for this TechnologyTargeting.
     * 
     * @return deviceManufacturerTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.DeviceManufacturerTargeting getDeviceManufacturerTargeting() {
        return deviceManufacturerTargeting;
    }


    /**
     * Sets the deviceManufacturerTargeting value for this TechnologyTargeting.
     * 
     * @param deviceManufacturerTargeting
     */
    public void setDeviceManufacturerTargeting(com.google.api.ads.admanager.axis.v202505.DeviceManufacturerTargeting deviceManufacturerTargeting) {
        this.deviceManufacturerTargeting = deviceManufacturerTargeting;
    }


    /**
     * Gets the mobileCarrierTargeting value for this TechnologyTargeting.
     * 
     * @return mobileCarrierTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.MobileCarrierTargeting getMobileCarrierTargeting() {
        return mobileCarrierTargeting;
    }


    /**
     * Sets the mobileCarrierTargeting value for this TechnologyTargeting.
     * 
     * @param mobileCarrierTargeting
     */
    public void setMobileCarrierTargeting(com.google.api.ads.admanager.axis.v202505.MobileCarrierTargeting mobileCarrierTargeting) {
        this.mobileCarrierTargeting = mobileCarrierTargeting;
    }


    /**
     * Gets the mobileDeviceTargeting value for this TechnologyTargeting.
     * 
     * @return mobileDeviceTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.MobileDeviceTargeting getMobileDeviceTargeting() {
        return mobileDeviceTargeting;
    }


    /**
     * Sets the mobileDeviceTargeting value for this TechnologyTargeting.
     * 
     * @param mobileDeviceTargeting
     */
    public void setMobileDeviceTargeting(com.google.api.ads.admanager.axis.v202505.MobileDeviceTargeting mobileDeviceTargeting) {
        this.mobileDeviceTargeting = mobileDeviceTargeting;
    }


    /**
     * Gets the mobileDeviceSubmodelTargeting value for this TechnologyTargeting.
     * 
     * @return mobileDeviceSubmodelTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.MobileDeviceSubmodelTargeting getMobileDeviceSubmodelTargeting() {
        return mobileDeviceSubmodelTargeting;
    }


    /**
     * Sets the mobileDeviceSubmodelTargeting value for this TechnologyTargeting.
     * 
     * @param mobileDeviceSubmodelTargeting
     */
    public void setMobileDeviceSubmodelTargeting(com.google.api.ads.admanager.axis.v202505.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting) {
        this.mobileDeviceSubmodelTargeting = mobileDeviceSubmodelTargeting;
    }


    /**
     * Gets the operatingSystemTargeting value for this TechnologyTargeting.
     * 
     * @return operatingSystemTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.OperatingSystemTargeting getOperatingSystemTargeting() {
        return operatingSystemTargeting;
    }


    /**
     * Sets the operatingSystemTargeting value for this TechnologyTargeting.
     * 
     * @param operatingSystemTargeting
     */
    public void setOperatingSystemTargeting(com.google.api.ads.admanager.axis.v202505.OperatingSystemTargeting operatingSystemTargeting) {
        this.operatingSystemTargeting = operatingSystemTargeting;
    }


    /**
     * Gets the operatingSystemVersionTargeting value for this TechnologyTargeting.
     * 
     * @return operatingSystemVersionTargeting
     */
    public com.google.api.ads.admanager.axis.v202505.OperatingSystemVersionTargeting getOperatingSystemVersionTargeting() {
        return operatingSystemVersionTargeting;
    }


    /**
     * Sets the operatingSystemVersionTargeting value for this TechnologyTargeting.
     * 
     * @param operatingSystemVersionTargeting
     */
    public void setOperatingSystemVersionTargeting(com.google.api.ads.admanager.axis.v202505.OperatingSystemVersionTargeting operatingSystemVersionTargeting) {
        this.operatingSystemVersionTargeting = operatingSystemVersionTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TechnologyTargeting)) return false;
        TechnologyTargeting other = (TechnologyTargeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bandwidthGroupTargeting==null && other.getBandwidthGroupTargeting()==null) || 
             (this.bandwidthGroupTargeting!=null &&
              this.bandwidthGroupTargeting.equals(other.getBandwidthGroupTargeting()))) &&
            ((this.browserTargeting==null && other.getBrowserTargeting()==null) || 
             (this.browserTargeting!=null &&
              this.browserTargeting.equals(other.getBrowserTargeting()))) &&
            ((this.browserLanguageTargeting==null && other.getBrowserLanguageTargeting()==null) || 
             (this.browserLanguageTargeting!=null &&
              this.browserLanguageTargeting.equals(other.getBrowserLanguageTargeting()))) &&
            ((this.deviceCapabilityTargeting==null && other.getDeviceCapabilityTargeting()==null) || 
             (this.deviceCapabilityTargeting!=null &&
              this.deviceCapabilityTargeting.equals(other.getDeviceCapabilityTargeting()))) &&
            ((this.deviceCategoryTargeting==null && other.getDeviceCategoryTargeting()==null) || 
             (this.deviceCategoryTargeting!=null &&
              this.deviceCategoryTargeting.equals(other.getDeviceCategoryTargeting()))) &&
            ((this.deviceManufacturerTargeting==null && other.getDeviceManufacturerTargeting()==null) || 
             (this.deviceManufacturerTargeting!=null &&
              this.deviceManufacturerTargeting.equals(other.getDeviceManufacturerTargeting()))) &&
            ((this.mobileCarrierTargeting==null && other.getMobileCarrierTargeting()==null) || 
             (this.mobileCarrierTargeting!=null &&
              this.mobileCarrierTargeting.equals(other.getMobileCarrierTargeting()))) &&
            ((this.mobileDeviceTargeting==null && other.getMobileDeviceTargeting()==null) || 
             (this.mobileDeviceTargeting!=null &&
              this.mobileDeviceTargeting.equals(other.getMobileDeviceTargeting()))) &&
            ((this.mobileDeviceSubmodelTargeting==null && other.getMobileDeviceSubmodelTargeting()==null) || 
             (this.mobileDeviceSubmodelTargeting!=null &&
              this.mobileDeviceSubmodelTargeting.equals(other.getMobileDeviceSubmodelTargeting()))) &&
            ((this.operatingSystemTargeting==null && other.getOperatingSystemTargeting()==null) || 
             (this.operatingSystemTargeting!=null &&
              this.operatingSystemTargeting.equals(other.getOperatingSystemTargeting()))) &&
            ((this.operatingSystemVersionTargeting==null && other.getOperatingSystemVersionTargeting()==null) || 
             (this.operatingSystemVersionTargeting!=null &&
              this.operatingSystemVersionTargeting.equals(other.getOperatingSystemVersionTargeting())));
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
        if (getBandwidthGroupTargeting() != null) {
            _hashCode += getBandwidthGroupTargeting().hashCode();
        }
        if (getBrowserTargeting() != null) {
            _hashCode += getBrowserTargeting().hashCode();
        }
        if (getBrowserLanguageTargeting() != null) {
            _hashCode += getBrowserLanguageTargeting().hashCode();
        }
        if (getDeviceCapabilityTargeting() != null) {
            _hashCode += getDeviceCapabilityTargeting().hashCode();
        }
        if (getDeviceCategoryTargeting() != null) {
            _hashCode += getDeviceCategoryTargeting().hashCode();
        }
        if (getDeviceManufacturerTargeting() != null) {
            _hashCode += getDeviceManufacturerTargeting().hashCode();
        }
        if (getMobileCarrierTargeting() != null) {
            _hashCode += getMobileCarrierTargeting().hashCode();
        }
        if (getMobileDeviceTargeting() != null) {
            _hashCode += getMobileDeviceTargeting().hashCode();
        }
        if (getMobileDeviceSubmodelTargeting() != null) {
            _hashCode += getMobileDeviceSubmodelTargeting().hashCode();
        }
        if (getOperatingSystemTargeting() != null) {
            _hashCode += getOperatingSystemTargeting().hashCode();
        }
        if (getOperatingSystemVersionTargeting() != null) {
            _hashCode += getOperatingSystemVersionTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TechnologyTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "TechnologyTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthGroupTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "bandwidthGroupTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "BandwidthGroupTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "browserTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "BrowserTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserLanguageTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "browserLanguageTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "BrowserLanguageTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCapabilityTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "deviceCapabilityTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "DeviceCapabilityTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCategoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "deviceCategoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "DeviceCategoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceManufacturerTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "deviceManufacturerTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "DeviceManufacturerTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCarrierTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "mobileCarrierTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "MobileCarrierTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "mobileDeviceTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "MobileDeviceTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceSubmodelTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "mobileDeviceSubmodelTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "MobileDeviceSubmodelTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "operatingSystemTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "OperatingSystemTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemVersionTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "operatingSystemVersionTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "OperatingSystemVersionTargeting"));
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
