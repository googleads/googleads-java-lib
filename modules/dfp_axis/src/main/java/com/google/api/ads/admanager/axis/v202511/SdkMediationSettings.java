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
 * SdkMediationSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;


/**
 * Display settings for mobile SDK adapters.
 */
public class SdkMediationSettings  extends com.google.api.ads.admanager.axis.v202511.AbstractDisplaySettings  implements java.io.Serializable {
    /* A map of key-value pairs to be used by this mobile adapter. */
    private com.google.api.ads.admanager.axis.v202511.YieldParameter_StringMapEntry[] parameters;

    /* The integration type of the adapter. This may be {@code CUSTOM_EVENT}
     * or {@code SDK}. */
    private com.google.api.ads.admanager.axis.v202511.YieldIntegrationType yieldIntegrationType;

    /* The platform of the adapter. */
    private com.google.api.ads.admanager.axis.v202511.YieldPlatform platform;

    public SdkMediationSettings() {
    }

    public SdkMediationSettings(
           com.google.api.ads.admanager.axis.v202511.YieldParameter_StringMapEntry[] parameters,
           com.google.api.ads.admanager.axis.v202511.YieldIntegrationType yieldIntegrationType,
           com.google.api.ads.admanager.axis.v202511.YieldPlatform platform) {
        this.parameters = parameters;
        this.yieldIntegrationType = yieldIntegrationType;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("parameters", getParameters())
            .add("platform", getPlatform())
            .add("yieldIntegrationType", getYieldIntegrationType())
            .toString();
    }

    /**
     * Gets the parameters value for this SdkMediationSettings.
     * 
     * @return parameters   * A map of key-value pairs to be used by this mobile adapter.
     */
    public com.google.api.ads.admanager.axis.v202511.YieldParameter_StringMapEntry[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this SdkMediationSettings.
     * 
     * @param parameters   * A map of key-value pairs to be used by this mobile adapter.
     */
    public void setParameters(com.google.api.ads.admanager.axis.v202511.YieldParameter_StringMapEntry[] parameters) {
        this.parameters = parameters;
    }

    public com.google.api.ads.admanager.axis.v202511.YieldParameter_StringMapEntry getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, com.google.api.ads.admanager.axis.v202511.YieldParameter_StringMapEntry _value) {
        this.parameters[i] = _value;
    }


    /**
     * Gets the yieldIntegrationType value for this SdkMediationSettings.
     * 
     * @return yieldIntegrationType   * The integration type of the adapter. This may be {@code CUSTOM_EVENT}
     * or {@code SDK}.
     */
    public com.google.api.ads.admanager.axis.v202511.YieldIntegrationType getYieldIntegrationType() {
        return yieldIntegrationType;
    }


    /**
     * Sets the yieldIntegrationType value for this SdkMediationSettings.
     * 
     * @param yieldIntegrationType   * The integration type of the adapter. This may be {@code CUSTOM_EVENT}
     * or {@code SDK}.
     */
    public void setYieldIntegrationType(com.google.api.ads.admanager.axis.v202511.YieldIntegrationType yieldIntegrationType) {
        this.yieldIntegrationType = yieldIntegrationType;
    }


    /**
     * Gets the platform value for this SdkMediationSettings.
     * 
     * @return platform   * The platform of the adapter.
     */
    public com.google.api.ads.admanager.axis.v202511.YieldPlatform getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this SdkMediationSettings.
     * 
     * @param platform   * The platform of the adapter.
     */
    public void setPlatform(com.google.api.ads.admanager.axis.v202511.YieldPlatform platform) {
        this.platform = platform;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SdkMediationSettings)) return false;
        SdkMediationSettings other = (SdkMediationSettings) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.yieldIntegrationType==null && other.getYieldIntegrationType()==null) || 
             (this.yieldIntegrationType!=null &&
              this.yieldIntegrationType.equals(other.getYieldIntegrationType()))) &&
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              this.platform.equals(other.getPlatform())));
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
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getYieldIntegrationType() != null) {
            _hashCode += getYieldIntegrationType().hashCode();
        }
        if (getPlatform() != null) {
            _hashCode += getPlatform().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SdkMediationSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "SdkMediationSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "YieldParameter_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yieldIntegrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "yieldIntegrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "YieldIntegrationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "YieldPlatform"));
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
