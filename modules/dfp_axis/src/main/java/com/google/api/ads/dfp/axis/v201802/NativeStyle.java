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
 * NativeStyle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Used to define the look and feel of native ads, for both web and
 * apps.
 *             Native styles determine how native creatives look for
 * a segment of inventory.
 */
public class NativeStyle  implements java.io.Serializable {
    /* Uniquely identifies the {@code NativeStyle}. This attribute
     * is read-only and is assigned by
     *                 Google when a native style is created. */
    private java.lang.Long id;

    /* The name of the native style. This attribute is required and
     * has a maximum length of 255
     *                 characters. */
    private java.lang.String name;

    /* The HTML snippet of the native style with placeholders for
     * the associated variables.
     *                 This attribute is required. */
    private java.lang.String htmlSnippet;

    /* The CSS snippet of the native style, with placeholders for
     * the associated variables. This
     *                 attribute is required. */
    private java.lang.String cssSnippet;

    /* The creative template ID this native style associated with.
     * This attribute is required on
     *                 creation and is read-only afterwards. */
    private java.lang.Long creativeTemplateId;

    /* Whether this is a fluid size native style. If {@code true},
     * this must be used with 1x1 size. */
    private java.lang.Boolean isFluid;

    /* The targeting criteria for this native style.
     *                 Only ad unit and key-value targeting are supported
     * at this time. */
    private com.google.api.ads.dfp.axis.v201802.Targeting targeting;

    /* The status of the native style. This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.NativeStyleStatus status;

    /* The size of the native style. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.Size size;

    public NativeStyle() {
    }

    public NativeStyle(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String htmlSnippet,
           java.lang.String cssSnippet,
           java.lang.Long creativeTemplateId,
           java.lang.Boolean isFluid,
           com.google.api.ads.dfp.axis.v201802.Targeting targeting,
           com.google.api.ads.dfp.axis.v201802.NativeStyleStatus status,
           com.google.api.ads.dfp.axis.v201802.Size size) {
           this.id = id;
           this.name = name;
           this.htmlSnippet = htmlSnippet;
           this.cssSnippet = cssSnippet;
           this.creativeTemplateId = creativeTemplateId;
           this.isFluid = isFluid;
           this.targeting = targeting;
           this.status = status;
           this.size = size;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creativeTemplateId", getCreativeTemplateId())
            .add("cssSnippet", getCssSnippet())
            .add("htmlSnippet", getHtmlSnippet())
            .add("id", getId())
            .add("isFluid", getIsFluid())
            .add("name", getName())
            .add("size", getSize())
            .add("status", getStatus())
            .add("targeting", getTargeting())
            .toString();
    }

    /**
     * Gets the id value for this NativeStyle.
     * 
     * @return id   * Uniquely identifies the {@code NativeStyle}. This attribute
     * is read-only and is assigned by
     *                 Google when a native style is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this NativeStyle.
     * 
     * @param id   * Uniquely identifies the {@code NativeStyle}. This attribute
     * is read-only and is assigned by
     *                 Google when a native style is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this NativeStyle.
     * 
     * @return name   * The name of the native style. This attribute is required and
     * has a maximum length of 255
     *                 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this NativeStyle.
     * 
     * @param name   * The name of the native style. This attribute is required and
     * has a maximum length of 255
     *                 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the htmlSnippet value for this NativeStyle.
     * 
     * @return htmlSnippet   * The HTML snippet of the native style with placeholders for
     * the associated variables.
     *                 This attribute is required.
     */
    public java.lang.String getHtmlSnippet() {
        return htmlSnippet;
    }


    /**
     * Sets the htmlSnippet value for this NativeStyle.
     * 
     * @param htmlSnippet   * The HTML snippet of the native style with placeholders for
     * the associated variables.
     *                 This attribute is required.
     */
    public void setHtmlSnippet(java.lang.String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
    }


    /**
     * Gets the cssSnippet value for this NativeStyle.
     * 
     * @return cssSnippet   * The CSS snippet of the native style, with placeholders for
     * the associated variables. This
     *                 attribute is required.
     */
    public java.lang.String getCssSnippet() {
        return cssSnippet;
    }


    /**
     * Sets the cssSnippet value for this NativeStyle.
     * 
     * @param cssSnippet   * The CSS snippet of the native style, with placeholders for
     * the associated variables. This
     *                 attribute is required.
     */
    public void setCssSnippet(java.lang.String cssSnippet) {
        this.cssSnippet = cssSnippet;
    }


    /**
     * Gets the creativeTemplateId value for this NativeStyle.
     * 
     * @return creativeTemplateId   * The creative template ID this native style associated with.
     * This attribute is required on
     *                 creation and is read-only afterwards.
     */
    public java.lang.Long getCreativeTemplateId() {
        return creativeTemplateId;
    }


    /**
     * Sets the creativeTemplateId value for this NativeStyle.
     * 
     * @param creativeTemplateId   * The creative template ID this native style associated with.
     * This attribute is required on
     *                 creation and is read-only afterwards.
     */
    public void setCreativeTemplateId(java.lang.Long creativeTemplateId) {
        this.creativeTemplateId = creativeTemplateId;
    }


    /**
     * Gets the isFluid value for this NativeStyle.
     * 
     * @return isFluid   * Whether this is a fluid size native style. If {@code true},
     * this must be used with 1x1 size.
     */
    public java.lang.Boolean getIsFluid() {
        return isFluid;
    }


    /**
     * Sets the isFluid value for this NativeStyle.
     * 
     * @param isFluid   * Whether this is a fluid size native style. If {@code true},
     * this must be used with 1x1 size.
     */
    public void setIsFluid(java.lang.Boolean isFluid) {
        this.isFluid = isFluid;
    }


    /**
     * Gets the targeting value for this NativeStyle.
     * 
     * @return targeting   * The targeting criteria for this native style.
     *                 Only ad unit and key-value targeting are supported
     * at this time.
     */
    public com.google.api.ads.dfp.axis.v201802.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this NativeStyle.
     * 
     * @param targeting   * The targeting criteria for this native style.
     *                 Only ad unit and key-value targeting are supported
     * at this time.
     */
    public void setTargeting(com.google.api.ads.dfp.axis.v201802.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the status value for this NativeStyle.
     * 
     * @return status   * The status of the native style. This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.NativeStyleStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this NativeStyle.
     * 
     * @param status   * The status of the native style. This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.NativeStyleStatus status) {
        this.status = status;
    }


    /**
     * Gets the size value for this NativeStyle.
     * 
     * @return size   * The size of the native style. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this NativeStyle.
     * 
     * @param size   * The size of the native style. This attribute is required.
     */
    public void setSize(com.google.api.ads.dfp.axis.v201802.Size size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NativeStyle)) return false;
        NativeStyle other = (NativeStyle) obj;
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
            ((this.htmlSnippet==null && other.getHtmlSnippet()==null) || 
             (this.htmlSnippet!=null &&
              this.htmlSnippet.equals(other.getHtmlSnippet()))) &&
            ((this.cssSnippet==null && other.getCssSnippet()==null) || 
             (this.cssSnippet!=null &&
              this.cssSnippet.equals(other.getCssSnippet()))) &&
            ((this.creativeTemplateId==null && other.getCreativeTemplateId()==null) || 
             (this.creativeTemplateId!=null &&
              this.creativeTemplateId.equals(other.getCreativeTemplateId()))) &&
            ((this.isFluid==null && other.getIsFluid()==null) || 
             (this.isFluid!=null &&
              this.isFluid.equals(other.getIsFluid()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize())));
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
        if (getHtmlSnippet() != null) {
            _hashCode += getHtmlSnippet().hashCode();
        }
        if (getCssSnippet() != null) {
            _hashCode += getCssSnippet().hashCode();
        }
        if (getCreativeTemplateId() != null) {
            _hashCode += getCreativeTemplateId().hashCode();
        }
        if (getIsFluid() != null) {
            _hashCode += getIsFluid().hashCode();
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NativeStyle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "NativeStyle"));
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
        elemField.setFieldName("htmlSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "htmlSnippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "cssSnippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFluid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isFluid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "NativeStyleStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
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
