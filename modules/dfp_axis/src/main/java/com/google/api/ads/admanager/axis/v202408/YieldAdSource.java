// Copyright 2024 Google LLC
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
 * YieldAdSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;

public class YieldAdSource  implements java.io.Serializable {
    private java.lang.Long adSourceId;

    private java.lang.Long companyId;

    private com.google.api.ads.admanager.axis.v202408.AbstractDisplaySettings displaySettings;

    private com.google.api.ads.admanager.axis.v202408.YieldEntityStatus status;

    private com.google.api.ads.admanager.axis.v202408.Money manualCpm;

    private java.lang.Boolean overrideDynamicCpm;

    public YieldAdSource() {
    }

    public YieldAdSource(
           java.lang.Long adSourceId,
           java.lang.Long companyId,
           com.google.api.ads.admanager.axis.v202408.AbstractDisplaySettings displaySettings,
           com.google.api.ads.admanager.axis.v202408.YieldEntityStatus status,
           com.google.api.ads.admanager.axis.v202408.Money manualCpm,
           java.lang.Boolean overrideDynamicCpm) {
           this.adSourceId = adSourceId;
           this.companyId = companyId;
           this.displaySettings = displaySettings;
           this.status = status;
           this.manualCpm = manualCpm;
           this.overrideDynamicCpm = overrideDynamicCpm;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adSourceId", getAdSourceId())
            .add("companyId", getCompanyId())
            .add("displaySettings", getDisplaySettings())
            .add("manualCpm", getManualCpm())
            .add("overrideDynamicCpm", getOverrideDynamicCpm())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the adSourceId value for this YieldAdSource.
     * 
     * @return adSourceId
     */
    public java.lang.Long getAdSourceId() {
        return adSourceId;
    }


    /**
     * Sets the adSourceId value for this YieldAdSource.
     * 
     * @param adSourceId
     */
    public void setAdSourceId(java.lang.Long adSourceId) {
        this.adSourceId = adSourceId;
    }


    /**
     * Gets the companyId value for this YieldAdSource.
     * 
     * @return companyId
     */
    public java.lang.Long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this YieldAdSource.
     * 
     * @param companyId
     */
    public void setCompanyId(java.lang.Long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the displaySettings value for this YieldAdSource.
     * 
     * @return displaySettings
     */
    public com.google.api.ads.admanager.axis.v202408.AbstractDisplaySettings getDisplaySettings() {
        return displaySettings;
    }


    /**
     * Sets the displaySettings value for this YieldAdSource.
     * 
     * @param displaySettings
     */
    public void setDisplaySettings(com.google.api.ads.admanager.axis.v202408.AbstractDisplaySettings displaySettings) {
        this.displaySettings = displaySettings;
    }


    /**
     * Gets the status value for this YieldAdSource.
     * 
     * @return status
     */
    public com.google.api.ads.admanager.axis.v202408.YieldEntityStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this YieldAdSource.
     * 
     * @param status
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202408.YieldEntityStatus status) {
        this.status = status;
    }


    /**
     * Gets the manualCpm value for this YieldAdSource.
     * 
     * @return manualCpm
     */
    public com.google.api.ads.admanager.axis.v202408.Money getManualCpm() {
        return manualCpm;
    }


    /**
     * Sets the manualCpm value for this YieldAdSource.
     * 
     * @param manualCpm
     */
    public void setManualCpm(com.google.api.ads.admanager.axis.v202408.Money manualCpm) {
        this.manualCpm = manualCpm;
    }


    /**
     * Gets the overrideDynamicCpm value for this YieldAdSource.
     * 
     * @return overrideDynamicCpm
     */
    public java.lang.Boolean getOverrideDynamicCpm() {
        return overrideDynamicCpm;
    }


    /**
     * Sets the overrideDynamicCpm value for this YieldAdSource.
     * 
     * @param overrideDynamicCpm
     */
    public void setOverrideDynamicCpm(java.lang.Boolean overrideDynamicCpm) {
        this.overrideDynamicCpm = overrideDynamicCpm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YieldAdSource)) return false;
        YieldAdSource other = (YieldAdSource) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adSourceId==null && other.getAdSourceId()==null) || 
             (this.adSourceId!=null &&
              this.adSourceId.equals(other.getAdSourceId()))) &&
            ((this.companyId==null && other.getCompanyId()==null) || 
             (this.companyId!=null &&
              this.companyId.equals(other.getCompanyId()))) &&
            ((this.displaySettings==null && other.getDisplaySettings()==null) || 
             (this.displaySettings!=null &&
              this.displaySettings.equals(other.getDisplaySettings()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.manualCpm==null && other.getManualCpm()==null) || 
             (this.manualCpm!=null &&
              this.manualCpm.equals(other.getManualCpm()))) &&
            ((this.overrideDynamicCpm==null && other.getOverrideDynamicCpm()==null) || 
             (this.overrideDynamicCpm!=null &&
              this.overrideDynamicCpm.equals(other.getOverrideDynamicCpm())));
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
        if (getAdSourceId() != null) {
            _hashCode += getAdSourceId().hashCode();
        }
        if (getCompanyId() != null) {
            _hashCode += getCompanyId().hashCode();
        }
        if (getDisplaySettings() != null) {
            _hashCode += getDisplaySettings().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getManualCpm() != null) {
            _hashCode += getManualCpm().hashCode();
        }
        if (getOverrideDynamicCpm() != null) {
            _hashCode += getOverrideDynamicCpm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YieldAdSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "YieldAdSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "adSourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaySettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "displaySettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "AbstractDisplaySettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "YieldEntityStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCpm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "manualCpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideDynamicCpm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "overrideDynamicCpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
