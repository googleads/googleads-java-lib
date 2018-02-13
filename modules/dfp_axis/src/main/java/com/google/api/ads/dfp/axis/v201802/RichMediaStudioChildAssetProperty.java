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
 * RichMediaStudioChildAssetProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a child asset in {@code RichMediaStudioCreative}.
 */
public class RichMediaStudioChildAssetProperty  implements java.io.Serializable {
    /* The name of the asset as known by Rich Media Studio. This attribute
     * is readonly. */
    private java.lang.String name;

    /* Required file type of the asset.  This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetPropertyType type;

    /* The total size of the asset in bytes. This attribute is readonly. */
    private java.lang.Long totalFileSize;

    /* Width of the widget in pixels. This attribute is readonly. */
    private java.lang.Integer width;

    /* Height of the widget in pixels. This attribute is readonly. */
    private java.lang.Integer height;

    /* The URL of the asset. This attribute is readonly. */
    private java.lang.String url;

    public RichMediaStudioChildAssetProperty() {
    }

    public RichMediaStudioChildAssetProperty(
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetPropertyType type,
           java.lang.Long totalFileSize,
           java.lang.Integer width,
           java.lang.Integer height,
           java.lang.String url) {
           this.name = name;
           this.type = type;
           this.totalFileSize = totalFileSize;
           this.width = width;
           this.height = height;
           this.url = url;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("height", getHeight())
            .add("name", getName())
            .add("totalFileSize", getTotalFileSize())
            .add("type", getType())
            .add("url", getUrl())
            .add("width", getWidth())
            .toString();
    }

    /**
     * Gets the name value for this RichMediaStudioChildAssetProperty.
     * 
     * @return name   * The name of the asset as known by Rich Media Studio. This attribute
     * is readonly.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RichMediaStudioChildAssetProperty.
     * 
     * @param name   * The name of the asset as known by Rich Media Studio. This attribute
     * is readonly.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this RichMediaStudioChildAssetProperty.
     * 
     * @return type   * Required file type of the asset.  This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetPropertyType getType() {
        return type;
    }


    /**
     * Sets the type value for this RichMediaStudioChildAssetProperty.
     * 
     * @param type   * Required file type of the asset.  This attribute is readonly.
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.RichMediaStudioChildAssetPropertyType type) {
        this.type = type;
    }


    /**
     * Gets the totalFileSize value for this RichMediaStudioChildAssetProperty.
     * 
     * @return totalFileSize   * The total size of the asset in bytes. This attribute is readonly.
     */
    public java.lang.Long getTotalFileSize() {
        return totalFileSize;
    }


    /**
     * Sets the totalFileSize value for this RichMediaStudioChildAssetProperty.
     * 
     * @param totalFileSize   * The total size of the asset in bytes. This attribute is readonly.
     */
    public void setTotalFileSize(java.lang.Long totalFileSize) {
        this.totalFileSize = totalFileSize;
    }


    /**
     * Gets the width value for this RichMediaStudioChildAssetProperty.
     * 
     * @return width   * Width of the widget in pixels. This attribute is readonly.
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this RichMediaStudioChildAssetProperty.
     * 
     * @param width   * Width of the widget in pixels. This attribute is readonly.
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }


    /**
     * Gets the height value for this RichMediaStudioChildAssetProperty.
     * 
     * @return height   * Height of the widget in pixels. This attribute is readonly.
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this RichMediaStudioChildAssetProperty.
     * 
     * @param height   * Height of the widget in pixels. This attribute is readonly.
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the url value for this RichMediaStudioChildAssetProperty.
     * 
     * @return url   * The URL of the asset. This attribute is readonly.
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this RichMediaStudioChildAssetProperty.
     * 
     * @param url   * The URL of the asset. This attribute is readonly.
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaStudioChildAssetProperty)) return false;
        RichMediaStudioChildAssetProperty other = (RichMediaStudioChildAssetProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.totalFileSize==null && other.getTotalFileSize()==null) || 
             (this.totalFileSize!=null &&
              this.totalFileSize.equals(other.getTotalFileSize()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTotalFileSize() != null) {
            _hashCode += getTotalFileSize().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaStudioChildAssetProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioChildAssetProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioChildAssetProperty.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "totalFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "url"));
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
