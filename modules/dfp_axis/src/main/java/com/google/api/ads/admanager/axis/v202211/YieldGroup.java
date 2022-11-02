// Copyright 2022 Google LLC
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
 * YieldGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;

public class YieldGroup  implements java.io.Serializable {
    private java.lang.Long yieldGroupId;

    private java.lang.String yieldGroupName;

    private com.google.api.ads.admanager.axis.v202211.YieldEntityStatus exchangeStatus;

    private com.google.api.ads.admanager.axis.v202211.YieldFormat format;

    private com.google.api.ads.admanager.axis.v202211.YieldEnvironmentType environmentType;

    private com.google.api.ads.admanager.axis.v202211.Targeting targeting;

    private com.google.api.ads.admanager.axis.v202211.YieldAdSource[] adSources;

    public YieldGroup() {
    }

    public YieldGroup(
           java.lang.Long yieldGroupId,
           java.lang.String yieldGroupName,
           com.google.api.ads.admanager.axis.v202211.YieldEntityStatus exchangeStatus,
           com.google.api.ads.admanager.axis.v202211.YieldFormat format,
           com.google.api.ads.admanager.axis.v202211.YieldEnvironmentType environmentType,
           com.google.api.ads.admanager.axis.v202211.Targeting targeting,
           com.google.api.ads.admanager.axis.v202211.YieldAdSource[] adSources) {
           this.yieldGroupId = yieldGroupId;
           this.yieldGroupName = yieldGroupName;
           this.exchangeStatus = exchangeStatus;
           this.format = format;
           this.environmentType = environmentType;
           this.targeting = targeting;
           this.adSources = adSources;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adSources", getAdSources())
            .add("environmentType", getEnvironmentType())
            .add("exchangeStatus", getExchangeStatus())
            .add("format", getFormat())
            .add("targeting", getTargeting())
            .add("yieldGroupId", getYieldGroupId())
            .add("yieldGroupName", getYieldGroupName())
            .toString();
    }

    /**
     * Gets the yieldGroupId value for this YieldGroup.
     * 
     * @return yieldGroupId
     */
    public java.lang.Long getYieldGroupId() {
        return yieldGroupId;
    }


    /**
     * Sets the yieldGroupId value for this YieldGroup.
     * 
     * @param yieldGroupId
     */
    public void setYieldGroupId(java.lang.Long yieldGroupId) {
        this.yieldGroupId = yieldGroupId;
    }


    /**
     * Gets the yieldGroupName value for this YieldGroup.
     * 
     * @return yieldGroupName
     */
    public java.lang.String getYieldGroupName() {
        return yieldGroupName;
    }


    /**
     * Sets the yieldGroupName value for this YieldGroup.
     * 
     * @param yieldGroupName
     */
    public void setYieldGroupName(java.lang.String yieldGroupName) {
        this.yieldGroupName = yieldGroupName;
    }


    /**
     * Gets the exchangeStatus value for this YieldGroup.
     * 
     * @return exchangeStatus
     */
    public com.google.api.ads.admanager.axis.v202211.YieldEntityStatus getExchangeStatus() {
        return exchangeStatus;
    }


    /**
     * Sets the exchangeStatus value for this YieldGroup.
     * 
     * @param exchangeStatus
     */
    public void setExchangeStatus(com.google.api.ads.admanager.axis.v202211.YieldEntityStatus exchangeStatus) {
        this.exchangeStatus = exchangeStatus;
    }


    /**
     * Gets the format value for this YieldGroup.
     * 
     * @return format
     */
    public com.google.api.ads.admanager.axis.v202211.YieldFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this YieldGroup.
     * 
     * @param format
     */
    public void setFormat(com.google.api.ads.admanager.axis.v202211.YieldFormat format) {
        this.format = format;
    }


    /**
     * Gets the environmentType value for this YieldGroup.
     * 
     * @return environmentType
     */
    public com.google.api.ads.admanager.axis.v202211.YieldEnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this YieldGroup.
     * 
     * @param environmentType
     */
    public void setEnvironmentType(com.google.api.ads.admanager.axis.v202211.YieldEnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the targeting value for this YieldGroup.
     * 
     * @return targeting
     */
    public com.google.api.ads.admanager.axis.v202211.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this YieldGroup.
     * 
     * @param targeting
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v202211.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the adSources value for this YieldGroup.
     * 
     * @return adSources
     */
    public com.google.api.ads.admanager.axis.v202211.YieldAdSource[] getAdSources() {
        return adSources;
    }


    /**
     * Sets the adSources value for this YieldGroup.
     * 
     * @param adSources
     */
    public void setAdSources(com.google.api.ads.admanager.axis.v202211.YieldAdSource[] adSources) {
        this.adSources = adSources;
    }

    public com.google.api.ads.admanager.axis.v202211.YieldAdSource getAdSources(int i) {
        return this.adSources[i];
    }

    public void setAdSources(int i, com.google.api.ads.admanager.axis.v202211.YieldAdSource _value) {
        this.adSources[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YieldGroup)) return false;
        YieldGroup other = (YieldGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yieldGroupId==null && other.getYieldGroupId()==null) || 
             (this.yieldGroupId!=null &&
              this.yieldGroupId.equals(other.getYieldGroupId()))) &&
            ((this.yieldGroupName==null && other.getYieldGroupName()==null) || 
             (this.yieldGroupName!=null &&
              this.yieldGroupName.equals(other.getYieldGroupName()))) &&
            ((this.exchangeStatus==null && other.getExchangeStatus()==null) || 
             (this.exchangeStatus!=null &&
              this.exchangeStatus.equals(other.getExchangeStatus()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.environmentType==null && other.getEnvironmentType()==null) || 
             (this.environmentType!=null &&
              this.environmentType.equals(other.getEnvironmentType()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.adSources==null && other.getAdSources()==null) || 
             (this.adSources!=null &&
              java.util.Arrays.equals(this.adSources, other.getAdSources())));
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
        if (getYieldGroupId() != null) {
            _hashCode += getYieldGroupId().hashCode();
        }
        if (getYieldGroupName() != null) {
            _hashCode += getYieldGroupName().hashCode();
        }
        if (getExchangeStatus() != null) {
            _hashCode += getExchangeStatus().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getEnvironmentType() != null) {
            _hashCode += getEnvironmentType().hashCode();
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getAdSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdSources(), i);
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
        new org.apache.axis.description.TypeDesc(YieldGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "YieldGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yieldGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "yieldGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yieldGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "yieldGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "exchangeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "YieldEntityStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "YieldFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "YieldEnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSources");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "adSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "YieldAdSource"));
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
