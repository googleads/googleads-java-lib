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
 * CmsMetadataValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;


/**
 * Key value pair associated with a piece of content from a publisher's
 * CMS.
 */
public class CmsMetadataValue  implements java.io.Serializable {
    /* The ID of this CMS metadata value, to be used in targeting.
     * This field is read-only and
     *                 provided by Google. */
    private java.lang.Long cmsMetadataValueId;

    /* The value of this key-value pair. */
    private java.lang.String valueName;

    private com.google.api.ads.admanager.axis.v202402.CmsMetadataKey key;

    /* The status of this CMS metadata value.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.CmsMetadataValueStatus status;

    public CmsMetadataValue() {
    }

    public CmsMetadataValue(
           java.lang.Long cmsMetadataValueId,
           java.lang.String valueName,
           com.google.api.ads.admanager.axis.v202402.CmsMetadataKey key,
           com.google.api.ads.admanager.axis.v202402.CmsMetadataValueStatus status) {
           this.cmsMetadataValueId = cmsMetadataValueId;
           this.valueName = valueName;
           this.key = key;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("cmsMetadataValueId", getCmsMetadataValueId())
            .add("key", getKey())
            .add("status", getStatus())
            .add("valueName", getValueName())
            .toString();
    }

    /**
     * Gets the cmsMetadataValueId value for this CmsMetadataValue.
     * 
     * @return cmsMetadataValueId   * The ID of this CMS metadata value, to be used in targeting.
     * This field is read-only and
     *                 provided by Google.
     */
    public java.lang.Long getCmsMetadataValueId() {
        return cmsMetadataValueId;
    }


    /**
     * Sets the cmsMetadataValueId value for this CmsMetadataValue.
     * 
     * @param cmsMetadataValueId   * The ID of this CMS metadata value, to be used in targeting.
     * This field is read-only and
     *                 provided by Google.
     */
    public void setCmsMetadataValueId(java.lang.Long cmsMetadataValueId) {
        this.cmsMetadataValueId = cmsMetadataValueId;
    }


    /**
     * Gets the valueName value for this CmsMetadataValue.
     * 
     * @return valueName   * The value of this key-value pair.
     */
    public java.lang.String getValueName() {
        return valueName;
    }


    /**
     * Sets the valueName value for this CmsMetadataValue.
     * 
     * @param valueName   * The value of this key-value pair.
     */
    public void setValueName(java.lang.String valueName) {
        this.valueName = valueName;
    }


    /**
     * Gets the key value for this CmsMetadataValue.
     * 
     * @return key
     */
    public com.google.api.ads.admanager.axis.v202402.CmsMetadataKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this CmsMetadataValue.
     * 
     * @param key
     */
    public void setKey(com.google.api.ads.admanager.axis.v202402.CmsMetadataKey key) {
        this.key = key;
    }


    /**
     * Gets the status value for this CmsMetadataValue.
     * 
     * @return status   * The status of this CMS metadata value.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.CmsMetadataValueStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CmsMetadataValue.
     * 
     * @param status   * The status of this CMS metadata value.
     *                 This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202402.CmsMetadataValueStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmsMetadataValue)) return false;
        CmsMetadataValue other = (CmsMetadataValue) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmsMetadataValueId==null && other.getCmsMetadataValueId()==null) || 
             (this.cmsMetadataValueId!=null &&
              this.cmsMetadataValueId.equals(other.getCmsMetadataValueId()))) &&
            ((this.valueName==null && other.getValueName()==null) || 
             (this.valueName!=null &&
              this.valueName.equals(other.getValueName()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getCmsMetadataValueId() != null) {
            _hashCode += getCmsMetadataValueId().hashCode();
        }
        if (getValueName() != null) {
            _hashCode += getValueName().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmsMetadataValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "CmsMetadataValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsMetadataValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "cmsMetadataValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "valueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "CmsMetadataKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "CmsMetadataValueStatus"));
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
