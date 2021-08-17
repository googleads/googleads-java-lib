// Copyright 2021 Google LLC
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
 * BreakTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202108;


/**
 * A {@link BreakTemplate} defines what kinds of ads show at which
 * positions within a pod.
 *             
 *             <p>Break templates are made up of {@link AdSpot} objects.
 * A break template must have a single ad
 *             spot that has {@code AdSpot#flexible} set to true.
 */
public class BreakTemplate  implements java.io.Serializable {
    /* The unique ID of the {@link BreakTemplate}. This value is readonly
     * and is assigned by
     *                 Google. */
    private java.lang.Long id;

    /* Whether this is custom template. Custom templates get created
     * outside of the ad rule workflow
     *                 and can be referenced in ad tags.
     *                 
     *                 <p>Only custom templates can have names and display
     * names. */
    private java.lang.Boolean customTemplate;

    /* Name of the {@link BreakTemplate}. The name is case insenstive
     * and can be referenced in ad
     *                 tags. This value is required if {@code customTemplate}
     * is true, and cannot be set otherwise.
     *                 
     *                 <p>You can use alphanumeric characters and symbols
     * other than the following: ", ', =, !, +, #,
     *                 *, ~, ;, ^, (, ), <, >, [, ], the white space character. */
    private java.lang.String name;

    /* Descriptive name for the {@link BreakTemplateDto}. This value
     * is optional if {@code
     *                 customTemplate} is true, and cannot be set otherwise. */
    private java.lang.String displayName;

    /* The list of the {@link BreakTemplateMember} objects in the
     * order in which they should appear
     *                 in the ad pod. Each {@link BreakTemplateMember} has
     * a reference to a {@link AdSpot},
     *                 which defines what kinds of ads can appear at that
     * position, as well as other metadata that
     *                 defines how each ad spot should be filled. */
    private com.google.api.ads.admanager.axis.v202108.BreakTemplateBreakTemplateMember[] breakTemplateMembers;

    public BreakTemplate() {
    }

    public BreakTemplate(
           java.lang.Long id,
           java.lang.Boolean customTemplate,
           java.lang.String name,
           java.lang.String displayName,
           com.google.api.ads.admanager.axis.v202108.BreakTemplateBreakTemplateMember[] breakTemplateMembers) {
           this.id = id;
           this.customTemplate = customTemplate;
           this.name = name;
           this.displayName = displayName;
           this.breakTemplateMembers = breakTemplateMembers;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("breakTemplateMembers", getBreakTemplateMembers())
            .add("customTemplate", getCustomTemplate())
            .add("displayName", getDisplayName())
            .add("id", getId())
            .add("name", getName())
            .toString();
    }

    /**
     * Gets the id value for this BreakTemplate.
     * 
     * @return id   * The unique ID of the {@link BreakTemplate}. This value is readonly
     * and is assigned by
     *                 Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BreakTemplate.
     * 
     * @param id   * The unique ID of the {@link BreakTemplate}. This value is readonly
     * and is assigned by
     *                 Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the customTemplate value for this BreakTemplate.
     * 
     * @return customTemplate   * Whether this is custom template. Custom templates get created
     * outside of the ad rule workflow
     *                 and can be referenced in ad tags.
     *                 
     *                 <p>Only custom templates can have names and display
     * names.
     */
    public java.lang.Boolean getCustomTemplate() {
        return customTemplate;
    }


    /**
     * Sets the customTemplate value for this BreakTemplate.
     * 
     * @param customTemplate   * Whether this is custom template. Custom templates get created
     * outside of the ad rule workflow
     *                 and can be referenced in ad tags.
     *                 
     *                 <p>Only custom templates can have names and display
     * names.
     */
    public void setCustomTemplate(java.lang.Boolean customTemplate) {
        this.customTemplate = customTemplate;
    }


    /**
     * Gets the name value for this BreakTemplate.
     * 
     * @return name   * Name of the {@link BreakTemplate}. The name is case insenstive
     * and can be referenced in ad
     *                 tags. This value is required if {@code customTemplate}
     * is true, and cannot be set otherwise.
     *                 
     *                 <p>You can use alphanumeric characters and symbols
     * other than the following: ", ', =, !, +, #,
     *                 *, ~, ;, ^, (, ), <, >, [, ], the white space character.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BreakTemplate.
     * 
     * @param name   * Name of the {@link BreakTemplate}. The name is case insenstive
     * and can be referenced in ad
     *                 tags. This value is required if {@code customTemplate}
     * is true, and cannot be set otherwise.
     *                 
     *                 <p>You can use alphanumeric characters and symbols
     * other than the following: ", ', =, !, +, #,
     *                 *, ~, ;, ^, (, ), <, >, [, ], the white space character.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this BreakTemplate.
     * 
     * @return displayName   * Descriptive name for the {@link BreakTemplateDto}. This value
     * is optional if {@code
     *                 customTemplate} is true, and cannot be set otherwise.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this BreakTemplate.
     * 
     * @param displayName   * Descriptive name for the {@link BreakTemplateDto}. This value
     * is optional if {@code
     *                 customTemplate} is true, and cannot be set otherwise.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the breakTemplateMembers value for this BreakTemplate.
     * 
     * @return breakTemplateMembers   * The list of the {@link BreakTemplateMember} objects in the
     * order in which they should appear
     *                 in the ad pod. Each {@link BreakTemplateMember} has
     * a reference to a {@link AdSpot},
     *                 which defines what kinds of ads can appear at that
     * position, as well as other metadata that
     *                 defines how each ad spot should be filled.
     */
    public com.google.api.ads.admanager.axis.v202108.BreakTemplateBreakTemplateMember[] getBreakTemplateMembers() {
        return breakTemplateMembers;
    }


    /**
     * Sets the breakTemplateMembers value for this BreakTemplate.
     * 
     * @param breakTemplateMembers   * The list of the {@link BreakTemplateMember} objects in the
     * order in which they should appear
     *                 in the ad pod. Each {@link BreakTemplateMember} has
     * a reference to a {@link AdSpot},
     *                 which defines what kinds of ads can appear at that
     * position, as well as other metadata that
     *                 defines how each ad spot should be filled.
     */
    public void setBreakTemplateMembers(com.google.api.ads.admanager.axis.v202108.BreakTemplateBreakTemplateMember[] breakTemplateMembers) {
        this.breakTemplateMembers = breakTemplateMembers;
    }

    public com.google.api.ads.admanager.axis.v202108.BreakTemplateBreakTemplateMember getBreakTemplateMembers(int i) {
        return this.breakTemplateMembers[i];
    }

    public void setBreakTemplateMembers(int i, com.google.api.ads.admanager.axis.v202108.BreakTemplateBreakTemplateMember _value) {
        this.breakTemplateMembers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BreakTemplate)) return false;
        BreakTemplate other = (BreakTemplate) obj;
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
            ((this.customTemplate==null && other.getCustomTemplate()==null) || 
             (this.customTemplate!=null &&
              this.customTemplate.equals(other.getCustomTemplate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.breakTemplateMembers==null && other.getBreakTemplateMembers()==null) || 
             (this.breakTemplateMembers!=null &&
              java.util.Arrays.equals(this.breakTemplateMembers, other.getBreakTemplateMembers())));
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
        if (getCustomTemplate() != null) {
            _hashCode += getCustomTemplate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getBreakTemplateMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBreakTemplateMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBreakTemplateMembers(), i);
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
        new org.apache.axis.description.TypeDesc(BreakTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BreakTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "customTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakTemplateMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "breakTemplateMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BreakTemplate.BreakTemplateMember"));
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
