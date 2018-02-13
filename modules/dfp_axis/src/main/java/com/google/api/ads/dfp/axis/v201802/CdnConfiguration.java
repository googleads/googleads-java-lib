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
 * CdnConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@link CdnConfiguration} encapsulates information about where
 * and how to ingest and deliver
 *             content enabled for DAI (Dynamic Ad Insertion).
 */
public class CdnConfiguration  implements java.io.Serializable {
    /* The unique ID of the {@link CdnConfiguration}. This value is
     * read-only and is assigned by
     *                 Google. */
    private java.lang.Long id;

    /* The name of the {@link CdnConfiguration}. This value is required
     * to create a CDN configuration
     *                 and has a maximum length of 255 characters. */
    private java.lang.String name;

    /* The type of CDN configuration represented by this {@link CdnConfiguration}.
     * This value is
     *                 required to create a CDN configuration */
    private com.google.api.ads.dfp.axis.v201802.CdnConfigurationType cdnConfigurationType;

    /* Parameters about this CDN configuration as a source of content.
     * This facilitates fetching the
     *                 original content for conditioning and delivering the
     * original content as part of a modified
     *                 stream. */
    private com.google.api.ads.dfp.axis.v201802.SourceContentConfiguration sourceContentConfiguration;

    public CdnConfiguration() {
    }

    public CdnConfiguration(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.CdnConfigurationType cdnConfigurationType,
           com.google.api.ads.dfp.axis.v201802.SourceContentConfiguration sourceContentConfiguration) {
           this.id = id;
           this.name = name;
           this.cdnConfigurationType = cdnConfigurationType;
           this.sourceContentConfiguration = sourceContentConfiguration;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("cdnConfigurationType", getCdnConfigurationType())
            .add("id", getId())
            .add("name", getName())
            .add("sourceContentConfiguration", getSourceContentConfiguration())
            .toString();
    }

    /**
     * Gets the id value for this CdnConfiguration.
     * 
     * @return id   * The unique ID of the {@link CdnConfiguration}. This value is
     * read-only and is assigned by
     *                 Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CdnConfiguration.
     * 
     * @param id   * The unique ID of the {@link CdnConfiguration}. This value is
     * read-only and is assigned by
     *                 Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this CdnConfiguration.
     * 
     * @return name   * The name of the {@link CdnConfiguration}. This value is required
     * to create a CDN configuration
     *                 and has a maximum length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CdnConfiguration.
     * 
     * @param name   * The name of the {@link CdnConfiguration}. This value is required
     * to create a CDN configuration
     *                 and has a maximum length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the cdnConfigurationType value for this CdnConfiguration.
     * 
     * @return cdnConfigurationType   * The type of CDN configuration represented by this {@link CdnConfiguration}.
     * This value is
     *                 required to create a CDN configuration
     */
    public com.google.api.ads.dfp.axis.v201802.CdnConfigurationType getCdnConfigurationType() {
        return cdnConfigurationType;
    }


    /**
     * Sets the cdnConfigurationType value for this CdnConfiguration.
     * 
     * @param cdnConfigurationType   * The type of CDN configuration represented by this {@link CdnConfiguration}.
     * This value is
     *                 required to create a CDN configuration
     */
    public void setCdnConfigurationType(com.google.api.ads.dfp.axis.v201802.CdnConfigurationType cdnConfigurationType) {
        this.cdnConfigurationType = cdnConfigurationType;
    }


    /**
     * Gets the sourceContentConfiguration value for this CdnConfiguration.
     * 
     * @return sourceContentConfiguration   * Parameters about this CDN configuration as a source of content.
     * This facilitates fetching the
     *                 original content for conditioning and delivering the
     * original content as part of a modified
     *                 stream.
     */
    public com.google.api.ads.dfp.axis.v201802.SourceContentConfiguration getSourceContentConfiguration() {
        return sourceContentConfiguration;
    }


    /**
     * Sets the sourceContentConfiguration value for this CdnConfiguration.
     * 
     * @param sourceContentConfiguration   * Parameters about this CDN configuration as a source of content.
     * This facilitates fetching the
     *                 original content for conditioning and delivering the
     * original content as part of a modified
     *                 stream.
     */
    public void setSourceContentConfiguration(com.google.api.ads.dfp.axis.v201802.SourceContentConfiguration sourceContentConfiguration) {
        this.sourceContentConfiguration = sourceContentConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CdnConfiguration)) return false;
        CdnConfiguration other = (CdnConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.cdnConfigurationType==null && other.getCdnConfigurationType()==null) || 
             (this.cdnConfigurationType!=null &&
              this.cdnConfigurationType.equals(other.getCdnConfigurationType()))) &&
            ((this.sourceContentConfiguration==null && other.getSourceContentConfiguration()==null) || 
             (this.sourceContentConfiguration!=null &&
              this.sourceContentConfiguration.equals(other.getSourceContentConfiguration())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCdnConfigurationType() != null) {
            _hashCode += getCdnConfigurationType().hashCode();
        }
        if (getSourceContentConfiguration() != null) {
            _hashCode += getSourceContentConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CdnConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CdnConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdnConfigurationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "cdnConfigurationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CdnConfigurationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceContentConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sourceContentConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SourceContentConfiguration"));
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
