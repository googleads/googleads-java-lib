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
 * CreativeTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A template upon which a creative can be created.
 */
public class CreativeTemplate  implements java.io.Serializable {
    /* Uniquely identifies the {@code CreativeTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * template is created. */
    private java.lang.Long id;

    /* The name of the creative template. This attribute is required
     * and has a
     *                 maximum length of 255 characters. */
    private java.lang.String name;

    /* The description of the creative template. This attribute is
     * optional. */
    private java.lang.String description;

    /* The list of creative template variables. This attribute is
     * required. */
    private com.google.api.ads.dfp.axis.v201802.CreativeTemplateVariable[] variables;

    /* The snippet of the creative template, with placeholders for
     * the associated variables. This
     *                 attribute is required. */
    private java.lang.String snippet;

    /* The status of the {@code CreativeTemplate}. This attribute
     * is read-only
     *                 and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201802.CreativeTemplateStatus status;

    /* The type of the {@code CreativeTemplate}. Publisher can only
     * create
     *                 user-defined template */
    private com.google.api.ads.dfp.axis.v201802.CreativeTemplateType type;

    /* {@code true} if this creative template produces interstitial
     * creatives. */
    private java.lang.Boolean isInterstitial;

    /* {@code true} if this creative template produces native-eligible
     * creatives. */
    private java.lang.Boolean isNativeEligible;

    /* Whether the {@link Creative} produced is compatible for SafeFrame
     * rendering.
     *                 
     *                 <p>This attribute is optional and defaults to {@code
     * true}. */
    private java.lang.Boolean isSafeFrameCompatible;

    public CreativeTemplate() {
    }

    public CreativeTemplate(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201802.CreativeTemplateVariable[] variables,
           java.lang.String snippet,
           com.google.api.ads.dfp.axis.v201802.CreativeTemplateStatus status,
           com.google.api.ads.dfp.axis.v201802.CreativeTemplateType type,
           java.lang.Boolean isInterstitial,
           java.lang.Boolean isNativeEligible,
           java.lang.Boolean isSafeFrameCompatible) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.variables = variables;
           this.snippet = snippet;
           this.status = status;
           this.type = type;
           this.isInterstitial = isInterstitial;
           this.isNativeEligible = isNativeEligible;
           this.isSafeFrameCompatible = isSafeFrameCompatible;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("id", getId())
            .add("isInterstitial", getIsInterstitial())
            .add("isNativeEligible", getIsNativeEligible())
            .add("isSafeFrameCompatible", getIsSafeFrameCompatible())
            .add("name", getName())
            .add("snippet", getSnippet())
            .add("status", getStatus())
            .add("type", getType())
            .add("variables", getVariables())
            .toString();
    }

    /**
     * Gets the id value for this CreativeTemplate.
     * 
     * @return id   * Uniquely identifies the {@code CreativeTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * template is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CreativeTemplate.
     * 
     * @param id   * Uniquely identifies the {@code CreativeTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * template is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this CreativeTemplate.
     * 
     * @return name   * The name of the creative template. This attribute is required
     * and has a
     *                 maximum length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreativeTemplate.
     * 
     * @param name   * The name of the creative template. This attribute is required
     * and has a
     *                 maximum length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this CreativeTemplate.
     * 
     * @return description   * The description of the creative template. This attribute is
     * optional.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreativeTemplate.
     * 
     * @param description   * The description of the creative template. This attribute is
     * optional.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the variables value for this CreativeTemplate.
     * 
     * @return variables   * The list of creative template variables. This attribute is
     * required.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeTemplateVariable[] getVariables() {
        return variables;
    }


    /**
     * Sets the variables value for this CreativeTemplate.
     * 
     * @param variables   * The list of creative template variables. This attribute is
     * required.
     */
    public void setVariables(com.google.api.ads.dfp.axis.v201802.CreativeTemplateVariable[] variables) {
        this.variables = variables;
    }

    public com.google.api.ads.dfp.axis.v201802.CreativeTemplateVariable getVariables(int i) {
        return this.variables[i];
    }

    public void setVariables(int i, com.google.api.ads.dfp.axis.v201802.CreativeTemplateVariable _value) {
        this.variables[i] = _value;
    }


    /**
     * Gets the snippet value for this CreativeTemplate.
     * 
     * @return snippet   * The snippet of the creative template, with placeholders for
     * the associated variables. This
     *                 attribute is required.
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this CreativeTemplate.
     * 
     * @param snippet   * The snippet of the creative template, with placeholders for
     * the associated variables. This
     *                 attribute is required.
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the status value for this CreativeTemplate.
     * 
     * @return status   * The status of the {@code CreativeTemplate}. This attribute
     * is read-only
     *                 and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeTemplateStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreativeTemplate.
     * 
     * @param status   * The status of the {@code CreativeTemplate}. This attribute
     * is read-only
     *                 and is assigned by Google.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.CreativeTemplateStatus status) {
        this.status = status;
    }


    /**
     * Gets the type value for this CreativeTemplate.
     * 
     * @return type   * The type of the {@code CreativeTemplate}. Publisher can only
     * create
     *                 user-defined template
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeTemplateType getType() {
        return type;
    }


    /**
     * Sets the type value for this CreativeTemplate.
     * 
     * @param type   * The type of the {@code CreativeTemplate}. Publisher can only
     * create
     *                 user-defined template
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.CreativeTemplateType type) {
        this.type = type;
    }


    /**
     * Gets the isInterstitial value for this CreativeTemplate.
     * 
     * @return isInterstitial   * {@code true} if this creative template produces interstitial
     * creatives.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this CreativeTemplate.
     * 
     * @param isInterstitial   * {@code true} if this creative template produces interstitial
     * creatives.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the isNativeEligible value for this CreativeTemplate.
     * 
     * @return isNativeEligible   * {@code true} if this creative template produces native-eligible
     * creatives.
     */
    public java.lang.Boolean getIsNativeEligible() {
        return isNativeEligible;
    }


    /**
     * Sets the isNativeEligible value for this CreativeTemplate.
     * 
     * @param isNativeEligible   * {@code true} if this creative template produces native-eligible
     * creatives.
     */
    public void setIsNativeEligible(java.lang.Boolean isNativeEligible) {
        this.isNativeEligible = isNativeEligible;
    }


    /**
     * Gets the isSafeFrameCompatible value for this CreativeTemplate.
     * 
     * @return isSafeFrameCompatible   * Whether the {@link Creative} produced is compatible for SafeFrame
     * rendering.
     *                 
     *                 <p>This attribute is optional and defaults to {@code
     * true}.
     */
    public java.lang.Boolean getIsSafeFrameCompatible() {
        return isSafeFrameCompatible;
    }


    /**
     * Sets the isSafeFrameCompatible value for this CreativeTemplate.
     * 
     * @param isSafeFrameCompatible   * Whether the {@link Creative} produced is compatible for SafeFrame
     * rendering.
     *                 
     *                 <p>This attribute is optional and defaults to {@code
     * true}.
     */
    public void setIsSafeFrameCompatible(java.lang.Boolean isSafeFrameCompatible) {
        this.isSafeFrameCompatible = isSafeFrameCompatible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeTemplate)) return false;
        CreativeTemplate other = (CreativeTemplate) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.variables==null && other.getVariables()==null) || 
             (this.variables!=null &&
              java.util.Arrays.equals(this.variables, other.getVariables()))) &&
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial()))) &&
            ((this.isNativeEligible==null && other.getIsNativeEligible()==null) || 
             (this.isNativeEligible!=null &&
              this.isNativeEligible.equals(other.getIsNativeEligible()))) &&
            ((this.isSafeFrameCompatible==null && other.getIsSafeFrameCompatible()==null) || 
             (this.isSafeFrameCompatible!=null &&
              this.isSafeFrameCompatible.equals(other.getIsSafeFrameCompatible())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        if (getIsNativeEligible() != null) {
            _hashCode += getIsNativeEligible().hashCode();
        }
        if (getIsSafeFrameCompatible() != null) {
            _hashCode += getIsSafeFrameCompatible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeTemplate"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variables");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "variables"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeTemplateVariable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeTemplateStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeTemplateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInterstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isInterstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNativeEligible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isNativeEligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSafeFrameCompatible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isSafeFrameCompatible"));
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
