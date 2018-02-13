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
 * TechnologyTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Provides {@link LineItem} objects the ability to target or exclude
 * technologies.
 */
public class TechnologyTargeting  implements java.io.Serializable {
    /* The bandwidth groups being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting bandwidthGroupTargeting;

    /* The browsers being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.BrowserTargeting browserTargeting;

    /* The languages of browsers being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting browserLanguageTargeting;

    /* The device capabilities being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting deviceCapabilityTargeting;

    /* The device categories being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting deviceCategoryTargeting;

    /* The device manufacturers being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting deviceManufacturerTargeting;

    /* The mobile carriers being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting mobileCarrierTargeting;

    /* The mobile devices being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting mobileDeviceTargeting;

    /* The mobile device submodels being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting;

    /* The operating systems being targeted by the {@link LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting operatingSystemTargeting;

    /* The operating system versions being targeted by the {@link
     * LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting operatingSystemVersionTargeting;

    public TechnologyTargeting() {
    }

    public TechnologyTargeting(
           com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting bandwidthGroupTargeting,
           com.google.api.ads.dfp.axis.v201802.BrowserTargeting browserTargeting,
           com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting browserLanguageTargeting,
           com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting deviceCapabilityTargeting,
           com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting deviceCategoryTargeting,
           com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting deviceManufacturerTargeting,
           com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting mobileCarrierTargeting,
           com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting mobileDeviceTargeting,
           com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting,
           com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting operatingSystemTargeting,
           com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting operatingSystemVersionTargeting) {
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
     * @return bandwidthGroupTargeting   * The bandwidth groups being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting getBandwidthGroupTargeting() {
        return bandwidthGroupTargeting;
    }


    /**
     * Sets the bandwidthGroupTargeting value for this TechnologyTargeting.
     * 
     * @param bandwidthGroupTargeting   * The bandwidth groups being targeted by the {@link LineItem}.
     */
    public void setBandwidthGroupTargeting(com.google.api.ads.dfp.axis.v201802.BandwidthGroupTargeting bandwidthGroupTargeting) {
        this.bandwidthGroupTargeting = bandwidthGroupTargeting;
    }


    /**
     * Gets the browserTargeting value for this TechnologyTargeting.
     * 
     * @return browserTargeting   * The browsers being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.BrowserTargeting getBrowserTargeting() {
        return browserTargeting;
    }


    /**
     * Sets the browserTargeting value for this TechnologyTargeting.
     * 
     * @param browserTargeting   * The browsers being targeted by the {@link LineItem}.
     */
    public void setBrowserTargeting(com.google.api.ads.dfp.axis.v201802.BrowserTargeting browserTargeting) {
        this.browserTargeting = browserTargeting;
    }


    /**
     * Gets the browserLanguageTargeting value for this TechnologyTargeting.
     * 
     * @return browserLanguageTargeting   * The languages of browsers being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting getBrowserLanguageTargeting() {
        return browserLanguageTargeting;
    }


    /**
     * Sets the browserLanguageTargeting value for this TechnologyTargeting.
     * 
     * @param browserLanguageTargeting   * The languages of browsers being targeted by the {@link LineItem}.
     */
    public void setBrowserLanguageTargeting(com.google.api.ads.dfp.axis.v201802.BrowserLanguageTargeting browserLanguageTargeting) {
        this.browserLanguageTargeting = browserLanguageTargeting;
    }


    /**
     * Gets the deviceCapabilityTargeting value for this TechnologyTargeting.
     * 
     * @return deviceCapabilityTargeting   * The device capabilities being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting getDeviceCapabilityTargeting() {
        return deviceCapabilityTargeting;
    }


    /**
     * Sets the deviceCapabilityTargeting value for this TechnologyTargeting.
     * 
     * @param deviceCapabilityTargeting   * The device capabilities being targeted by the {@link LineItem}.
     */
    public void setDeviceCapabilityTargeting(com.google.api.ads.dfp.axis.v201802.DeviceCapabilityTargeting deviceCapabilityTargeting) {
        this.deviceCapabilityTargeting = deviceCapabilityTargeting;
    }


    /**
     * Gets the deviceCategoryTargeting value for this TechnologyTargeting.
     * 
     * @return deviceCategoryTargeting   * The device categories being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting getDeviceCategoryTargeting() {
        return deviceCategoryTargeting;
    }


    /**
     * Sets the deviceCategoryTargeting value for this TechnologyTargeting.
     * 
     * @param deviceCategoryTargeting   * The device categories being targeted by the {@link LineItem}.
     */
    public void setDeviceCategoryTargeting(com.google.api.ads.dfp.axis.v201802.DeviceCategoryTargeting deviceCategoryTargeting) {
        this.deviceCategoryTargeting = deviceCategoryTargeting;
    }


    /**
     * Gets the deviceManufacturerTargeting value for this TechnologyTargeting.
     * 
     * @return deviceManufacturerTargeting   * The device manufacturers being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting getDeviceManufacturerTargeting() {
        return deviceManufacturerTargeting;
    }


    /**
     * Sets the deviceManufacturerTargeting value for this TechnologyTargeting.
     * 
     * @param deviceManufacturerTargeting   * The device manufacturers being targeted by the {@link LineItem}.
     */
    public void setDeviceManufacturerTargeting(com.google.api.ads.dfp.axis.v201802.DeviceManufacturerTargeting deviceManufacturerTargeting) {
        this.deviceManufacturerTargeting = deviceManufacturerTargeting;
    }


    /**
     * Gets the mobileCarrierTargeting value for this TechnologyTargeting.
     * 
     * @return mobileCarrierTargeting   * The mobile carriers being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting getMobileCarrierTargeting() {
        return mobileCarrierTargeting;
    }


    /**
     * Sets the mobileCarrierTargeting value for this TechnologyTargeting.
     * 
     * @param mobileCarrierTargeting   * The mobile carriers being targeted by the {@link LineItem}.
     */
    public void setMobileCarrierTargeting(com.google.api.ads.dfp.axis.v201802.MobileCarrierTargeting mobileCarrierTargeting) {
        this.mobileCarrierTargeting = mobileCarrierTargeting;
    }


    /**
     * Gets the mobileDeviceTargeting value for this TechnologyTargeting.
     * 
     * @return mobileDeviceTargeting   * The mobile devices being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting getMobileDeviceTargeting() {
        return mobileDeviceTargeting;
    }


    /**
     * Sets the mobileDeviceTargeting value for this TechnologyTargeting.
     * 
     * @param mobileDeviceTargeting   * The mobile devices being targeted by the {@link LineItem}.
     */
    public void setMobileDeviceTargeting(com.google.api.ads.dfp.axis.v201802.MobileDeviceTargeting mobileDeviceTargeting) {
        this.mobileDeviceTargeting = mobileDeviceTargeting;
    }


    /**
     * Gets the mobileDeviceSubmodelTargeting value for this TechnologyTargeting.
     * 
     * @return mobileDeviceSubmodelTargeting   * The mobile device submodels being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting getMobileDeviceSubmodelTargeting() {
        return mobileDeviceSubmodelTargeting;
    }


    /**
     * Sets the mobileDeviceSubmodelTargeting value for this TechnologyTargeting.
     * 
     * @param mobileDeviceSubmodelTargeting   * The mobile device submodels being targeted by the {@link LineItem}.
     */
    public void setMobileDeviceSubmodelTargeting(com.google.api.ads.dfp.axis.v201802.MobileDeviceSubmodelTargeting mobileDeviceSubmodelTargeting) {
        this.mobileDeviceSubmodelTargeting = mobileDeviceSubmodelTargeting;
    }


    /**
     * Gets the operatingSystemTargeting value for this TechnologyTargeting.
     * 
     * @return operatingSystemTargeting   * The operating systems being targeted by the {@link LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting getOperatingSystemTargeting() {
        return operatingSystemTargeting;
    }


    /**
     * Sets the operatingSystemTargeting value for this TechnologyTargeting.
     * 
     * @param operatingSystemTargeting   * The operating systems being targeted by the {@link LineItem}.
     */
    public void setOperatingSystemTargeting(com.google.api.ads.dfp.axis.v201802.OperatingSystemTargeting operatingSystemTargeting) {
        this.operatingSystemTargeting = operatingSystemTargeting;
    }


    /**
     * Gets the operatingSystemVersionTargeting value for this TechnologyTargeting.
     * 
     * @return operatingSystemVersionTargeting   * The operating system versions being targeted by the {@link
     * LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting getOperatingSystemVersionTargeting() {
        return operatingSystemVersionTargeting;
    }


    /**
     * Sets the operatingSystemVersionTargeting value for this TechnologyTargeting.
     * 
     * @param operatingSystemVersionTargeting   * The operating system versions being targeted by the {@link
     * LineItem}.
     */
    public void setOperatingSystemVersionTargeting(com.google.api.ads.dfp.axis.v201802.OperatingSystemVersionTargeting operatingSystemVersionTargeting) {
        this.operatingSystemVersionTargeting = operatingSystemVersionTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TechnologyTargeting)) return false;
        TechnologyTargeting other = (TechnologyTargeting) obj;
        if (obj == null) return false;
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TechnologyTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthGroupTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "bandwidthGroupTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BandwidthGroupTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "browserTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BrowserTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserLanguageTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "browserLanguageTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BrowserLanguageTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCapabilityTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deviceCapabilityTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeviceCapabilityTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCategoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deviceCategoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeviceCategoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceManufacturerTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deviceManufacturerTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeviceManufacturerTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCarrierTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileCarrierTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileCarrierTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileDeviceTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileDeviceTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceSubmodelTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mobileDeviceSubmodelTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileDeviceSubmodelTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "operatingSystemTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "OperatingSystemTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemVersionTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "operatingSystemVersionTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "OperatingSystemVersionTargeting"));
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
