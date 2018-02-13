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
 * ProposalLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A link that can be added as a resource to a {@link Proposal}.
 */
public class ProposalLink  implements java.io.Serializable {
    /* The unique ID of the {@code ProposalLink}.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* The name of the {@code ProposalLink}. Must be unique under
     * the same
     *                 {@link Proposal}. This attribute has a maximum length
     * of 255 characters.
     *                 This attribute is required. */
    private java.lang.String name;

    /* The unique ID of the {@link User} who created the {@code ProposalLink}.
     * This attribute is read-only. */
    private java.lang.Long creatorId;

    /* The link to the {@code ProposalLink} resource.
     *                 This attribute is required. */
    private java.lang.String url;

    /* The description for the {@code ProposalLink}. This attribute
     * is optional
     *                 and has a maximum length of 1023 characters. */
    private java.lang.String description;

    /* The creation time of the {@code ProposalLink}. This attribute
     * is assigned by Google when the {@code ProposalLink} is created.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime;

    public ProposalLink() {
    }

    public ProposalLink(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Long creatorId,
           java.lang.String url,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime) {
           this.id = id;
           this.name = name;
           this.creatorId = creatorId;
           this.url = url;
           this.description = description;
           this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creationDateTime", getCreationDateTime())
            .add("creatorId", getCreatorId())
            .add("description", getDescription())
            .add("id", getId())
            .add("name", getName())
            .add("url", getUrl())
            .toString();
    }

    /**
     * Gets the id value for this ProposalLink.
     * 
     * @return id   * The unique ID of the {@code ProposalLink}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ProposalLink.
     * 
     * @param id   * The unique ID of the {@code ProposalLink}.
     *                 This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ProposalLink.
     * 
     * @return name   * The name of the {@code ProposalLink}. Must be unique under
     * the same
     *                 {@link Proposal}. This attribute has a maximum length
     * of 255 characters.
     *                 This attribute is required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProposalLink.
     * 
     * @param name   * The name of the {@code ProposalLink}. Must be unique under
     * the same
     *                 {@link Proposal}. This attribute has a maximum length
     * of 255 characters.
     *                 This attribute is required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the creatorId value for this ProposalLink.
     * 
     * @return creatorId   * The unique ID of the {@link User} who created the {@code ProposalLink}.
     * This attribute is read-only.
     */
    public java.lang.Long getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this ProposalLink.
     * 
     * @param creatorId   * The unique ID of the {@link User} who created the {@code ProposalLink}.
     * This attribute is read-only.
     */
    public void setCreatorId(java.lang.Long creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the url value for this ProposalLink.
     * 
     * @return url   * The link to the {@code ProposalLink} resource.
     *                 This attribute is required.
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ProposalLink.
     * 
     * @param url   * The link to the {@code ProposalLink} resource.
     *                 This attribute is required.
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the description value for this ProposalLink.
     * 
     * @return description   * The description for the {@code ProposalLink}. This attribute
     * is optional
     *                 and has a maximum length of 1023 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProposalLink.
     * 
     * @param description   * The description for the {@code ProposalLink}. This attribute
     * is optional
     *                 and has a maximum length of 1023 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the creationDateTime value for this ProposalLink.
     * 
     * @return creationDateTime   * The creation time of the {@code ProposalLink}. This attribute
     * is assigned by Google when the {@code ProposalLink} is created.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this ProposalLink.
     * 
     * @param creationDateTime   * The creation time of the {@code ProposalLink}. This attribute
     * is assigned by Google when the {@code ProposalLink} is created.
     *                 This attribute is read-only.
     */
    public void setCreationDateTime(com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLink)) return false;
        ProposalLink other = (ProposalLink) obj;
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
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime())));
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
        if (getCreatorId() != null) {
            _hashCode += getCreatorId().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLink"));
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
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
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
