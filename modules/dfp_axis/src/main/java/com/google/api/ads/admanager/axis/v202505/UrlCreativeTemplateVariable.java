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
 * UrlCreativeTemplateVariable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * Represents a url variable defined in a creative template.
 *             <p>
 *             Use {@link UrlCreativeTemplateVariableValue} to specify
 * the value
 *             for this variable when creating {@link TemplateCreative}
 * from the {@link TemplateCreative}
 */
public class UrlCreativeTemplateVariable  extends com.google.api.ads.admanager.axis.v202505.CreativeTemplateVariable  implements java.io.Serializable {
    /* Default value to be filled in when creating creatives from
     * the creative
     *                     template. */
    private java.lang.String defaultValue;

    /* When true, if the URL is identified as from a known vendor,
     * cache-busting
     *                     macros will automatically be inserted upon save. */
    private java.lang.Boolean isTrackingUrl;

    public UrlCreativeTemplateVariable() {
    }

    public UrlCreativeTemplateVariable(
           java.lang.String label,
           java.lang.String uniqueName,
           java.lang.String description,
           java.lang.Boolean isRequired,
           java.lang.String defaultValue,
           java.lang.Boolean isTrackingUrl) {
        super(
            label,
            uniqueName,
            description,
            isRequired);
        this.defaultValue = defaultValue;
        this.isTrackingUrl = isTrackingUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("defaultValue", getDefaultValue())
            .add("description", getDescription())
            .add("isRequired", getIsRequired())
            .add("isTrackingUrl", getIsTrackingUrl())
            .add("label", getLabel())
            .add("uniqueName", getUniqueName())
            .toString();
    }

    /**
     * Gets the defaultValue value for this UrlCreativeTemplateVariable.
     * 
     * @return defaultValue   * Default value to be filled in when creating creatives from
     * the creative
     *                     template.
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this UrlCreativeTemplateVariable.
     * 
     * @param defaultValue   * Default value to be filled in when creating creatives from
     * the creative
     *                     template.
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the isTrackingUrl value for this UrlCreativeTemplateVariable.
     * 
     * @return isTrackingUrl   * When true, if the URL is identified as from a known vendor,
     * cache-busting
     *                     macros will automatically be inserted upon save.
     */
    public java.lang.Boolean getIsTrackingUrl() {
        return isTrackingUrl;
    }


    /**
     * Sets the isTrackingUrl value for this UrlCreativeTemplateVariable.
     * 
     * @param isTrackingUrl   * When true, if the URL is identified as from a known vendor,
     * cache-busting
     *                     macros will automatically be inserted upon save.
     */
    public void setIsTrackingUrl(java.lang.Boolean isTrackingUrl) {
        this.isTrackingUrl = isTrackingUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UrlCreativeTemplateVariable)) return false;
        UrlCreativeTemplateVariable other = (UrlCreativeTemplateVariable) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.isTrackingUrl==null && other.getIsTrackingUrl()==null) || 
             (this.isTrackingUrl!=null &&
              this.isTrackingUrl.equals(other.getIsTrackingUrl())));
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
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getIsTrackingUrl() != null) {
            _hashCode += getIsTrackingUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UrlCreativeTemplateVariable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "UrlCreativeTemplateVariable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTrackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "isTrackingUrl"));
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
