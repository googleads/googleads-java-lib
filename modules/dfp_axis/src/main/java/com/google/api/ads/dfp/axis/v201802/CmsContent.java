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
 * CmsContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Contains information about {@link Content} from the CMS it was
 * ingested from.
 */
public class CmsContent  implements java.io.Serializable {
    /* The ID of the Content Source associated with the CMS in DFP.
     * This attribute is read-only. */
    private java.lang.Long id;

    /* The display name of the CMS this content is in. This attribute
     * is read-only. */
    private java.lang.String displayName;

    /* The ID of the {@link Content} in the CMS. This ID will be a
     * 3rd party
     *                 ID, usually the ID of the content in a CMS (Content
     * Management System).
     *                 This attribute is read-only. */
    private java.lang.String cmsContentId;

    public CmsContent() {
    }

    public CmsContent(
           java.lang.Long id,
           java.lang.String displayName,
           java.lang.String cmsContentId) {
           this.id = id;
           this.displayName = displayName;
           this.cmsContentId = cmsContentId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("cmsContentId", getCmsContentId())
            .add("displayName", getDisplayName())
            .add("id", getId())
            .toString();
    }

    /**
     * Gets the id value for this CmsContent.
     * 
     * @return id   * The ID of the Content Source associated with the CMS in DFP.
     * This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CmsContent.
     * 
     * @param id   * The ID of the Content Source associated with the CMS in DFP.
     * This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the displayName value for this CmsContent.
     * 
     * @return displayName   * The display name of the CMS this content is in. This attribute
     * is read-only.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CmsContent.
     * 
     * @param displayName   * The display name of the CMS this content is in. This attribute
     * is read-only.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the cmsContentId value for this CmsContent.
     * 
     * @return cmsContentId   * The ID of the {@link Content} in the CMS. This ID will be a
     * 3rd party
     *                 ID, usually the ID of the content in a CMS (Content
     * Management System).
     *                 This attribute is read-only.
     */
    public java.lang.String getCmsContentId() {
        return cmsContentId;
    }


    /**
     * Sets the cmsContentId value for this CmsContent.
     * 
     * @param cmsContentId   * The ID of the {@link Content} in the CMS. This ID will be a
     * 3rd party
     *                 ID, usually the ID of the content in a CMS (Content
     * Management System).
     *                 This attribute is read-only.
     */
    public void setCmsContentId(java.lang.String cmsContentId) {
        this.cmsContentId = cmsContentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmsContent)) return false;
        CmsContent other = (CmsContent) obj;
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
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.cmsContentId==null && other.getCmsContentId()==null) || 
             (this.cmsContentId!=null &&
              this.cmsContentId.equals(other.getCmsContentId())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getCmsContentId() != null) {
            _hashCode += getCmsContentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmsContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CmsContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsContentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "cmsContentId"));
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
