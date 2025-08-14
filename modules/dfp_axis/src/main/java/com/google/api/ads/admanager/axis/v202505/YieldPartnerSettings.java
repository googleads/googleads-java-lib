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
 * YieldPartnerSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * Settings for a yield partner.
 */
public class YieldPartnerSettings  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202505.PartnerSettingStatus status;

    private com.google.api.ads.admanager.axis.v202505.YieldEnvironmentType environment;

    private com.google.api.ads.admanager.axis.v202505.YieldFormat format;

    private com.google.api.ads.admanager.axis.v202505.YieldIntegrationType integrationType;

    private com.google.api.ads.admanager.axis.v202505.YieldPlatform platform;

    private com.google.api.ads.admanager.axis.v202505.YieldParameter[] parameters;

    public YieldPartnerSettings() {
    }

    public YieldPartnerSettings(
           com.google.api.ads.admanager.axis.v202505.PartnerSettingStatus status,
           com.google.api.ads.admanager.axis.v202505.YieldEnvironmentType environment,
           com.google.api.ads.admanager.axis.v202505.YieldFormat format,
           com.google.api.ads.admanager.axis.v202505.YieldIntegrationType integrationType,
           com.google.api.ads.admanager.axis.v202505.YieldPlatform platform,
           com.google.api.ads.admanager.axis.v202505.YieldParameter[] parameters) {
           this.status = status;
           this.environment = environment;
           this.format = format;
           this.integrationType = integrationType;
           this.platform = platform;
           this.parameters = parameters;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("environment", getEnvironment())
            .add("format", getFormat())
            .add("integrationType", getIntegrationType())
            .add("parameters", getParameters())
            .add("platform", getPlatform())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the status value for this YieldPartnerSettings.
     * 
     * @return status
     */
    public com.google.api.ads.admanager.axis.v202505.PartnerSettingStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this YieldPartnerSettings.
     * 
     * @param status
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202505.PartnerSettingStatus status) {
        this.status = status;
    }


    /**
     * Gets the environment value for this YieldPartnerSettings.
     * 
     * @return environment
     */
    public com.google.api.ads.admanager.axis.v202505.YieldEnvironmentType getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this YieldPartnerSettings.
     * 
     * @param environment
     */
    public void setEnvironment(com.google.api.ads.admanager.axis.v202505.YieldEnvironmentType environment) {
        this.environment = environment;
    }


    /**
     * Gets the format value for this YieldPartnerSettings.
     * 
     * @return format
     */
    public com.google.api.ads.admanager.axis.v202505.YieldFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this YieldPartnerSettings.
     * 
     * @param format
     */
    public void setFormat(com.google.api.ads.admanager.axis.v202505.YieldFormat format) {
        this.format = format;
    }


    /**
     * Gets the integrationType value for this YieldPartnerSettings.
     * 
     * @return integrationType
     */
    public com.google.api.ads.admanager.axis.v202505.YieldIntegrationType getIntegrationType() {
        return integrationType;
    }


    /**
     * Sets the integrationType value for this YieldPartnerSettings.
     * 
     * @param integrationType
     */
    public void setIntegrationType(com.google.api.ads.admanager.axis.v202505.YieldIntegrationType integrationType) {
        this.integrationType = integrationType;
    }


    /**
     * Gets the platform value for this YieldPartnerSettings.
     * 
     * @return platform
     */
    public com.google.api.ads.admanager.axis.v202505.YieldPlatform getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this YieldPartnerSettings.
     * 
     * @param platform
     */
    public void setPlatform(com.google.api.ads.admanager.axis.v202505.YieldPlatform platform) {
        this.platform = platform;
    }


    /**
     * Gets the parameters value for this YieldPartnerSettings.
     * 
     * @return parameters
     */
    public com.google.api.ads.admanager.axis.v202505.YieldParameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this YieldPartnerSettings.
     * 
     * @param parameters
     */
    public void setParameters(com.google.api.ads.admanager.axis.v202505.YieldParameter[] parameters) {
        this.parameters = parameters;
    }

    public com.google.api.ads.admanager.axis.v202505.YieldParameter getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, com.google.api.ads.admanager.axis.v202505.YieldParameter _value) {
        this.parameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YieldPartnerSettings)) return false;
        YieldPartnerSettings other = (YieldPartnerSettings) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              this.environment.equals(other.getEnvironment()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.integrationType==null && other.getIntegrationType()==null) || 
             (this.integrationType!=null &&
              this.integrationType.equals(other.getIntegrationType()))) &&
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              this.platform.equals(other.getPlatform()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getEnvironment() != null) {
            _hashCode += getEnvironment().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getIntegrationType() != null) {
            _hashCode += getIntegrationType().hashCode();
        }
        if (getPlatform() != null) {
            _hashCode += getPlatform().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YieldPartnerSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "YieldPartnerSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "PartnerSettingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "YieldEnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "YieldFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "integrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "YieldIntegrationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "YieldPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "YieldParameter"));
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
