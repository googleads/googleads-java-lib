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
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Contact} represents a person who is affiliated with a
 * single
 *             {@link Company}. A contact can have a variety of contact
 * information
 *             associated to it, and can be invited to view their company's
 * orders, line
 *             items, creatives, and reports.
 */
public class Contact  extends com.google.api.ads.dfp.axis.v201802.BaseContact  implements java.io.Serializable {
    /* The unique ID of the {@code Contact}. This value is readonly
     * and is assigned
     *                     by Google. */
    private java.lang.Long id;

    /* The name of the contact. This attribute is required and has
     * a maximum
     *                     length of 127 characters. */
    private java.lang.String name;

    /* The ID of the {@link Company} that this contact is associated
     * with. This
     *                     attribute is required and immutable. */
    private java.lang.Long companyId;

    /* The status of the contact. This attribute is readonly and is
     * assigned by Google. */
    private com.google.api.ads.dfp.axis.v201802.ContactStatus status;

    /* The address of the contact. This attribute is optional and
     * has a maximum length of 1024
     *                     characters. */
    private java.lang.String address;

    /* The cell phone number where the contact can be reached. This
     * attribute is
     *                     optional. */
    private java.lang.String cellPhone;

    /* A free-form text comment for the contact. This attribute is
     * optional and has a maximum
     *                     length of 1024 characters. */
    private java.lang.String comment;

    /* The e-mail address where the contact can be reached. This attribute
     * is optional. */
    private java.lang.String email;

    /* The fax number where the contact can be reached. This attribute
     * is optional. */
    private java.lang.String faxPhone;

    /* The job title of the contact. This attribute is optional and
     * has a maximum length of 1024
     *                     characters. */
    private java.lang.String title;

    /* The work phone number where the contact can be reached. This
     * attribute is optional. */
    private java.lang.String workPhone;

    public Contact() {
    }

    public Contact(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Long companyId,
           com.google.api.ads.dfp.axis.v201802.ContactStatus status,
           java.lang.String address,
           java.lang.String cellPhone,
           java.lang.String comment,
           java.lang.String email,
           java.lang.String faxPhone,
           java.lang.String title,
           java.lang.String workPhone) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
        this.status = status;
        this.address = address;
        this.cellPhone = cellPhone;
        this.comment = comment;
        this.email = email;
        this.faxPhone = faxPhone;
        this.title = title;
        this.workPhone = workPhone;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("address", getAddress())
            .add("cellPhone", getCellPhone())
            .add("comment", getComment())
            .add("companyId", getCompanyId())
            .add("email", getEmail())
            .add("faxPhone", getFaxPhone())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .add("title", getTitle())
            .add("workPhone", getWorkPhone())
            .toString();
    }

    /**
     * Gets the id value for this Contact.
     * 
     * @return id   * The unique ID of the {@code Contact}. This value is readonly
     * and is assigned
     *                     by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Contact.
     * 
     * @param id   * The unique ID of the {@code Contact}. This value is readonly
     * and is assigned
     *                     by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Contact.
     * 
     * @return name   * The name of the contact. This attribute is required and has
     * a maximum
     *                     length of 127 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Contact.
     * 
     * @param name   * The name of the contact. This attribute is required and has
     * a maximum
     *                     length of 127 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the companyId value for this Contact.
     * 
     * @return companyId   * The ID of the {@link Company} that this contact is associated
     * with. This
     *                     attribute is required and immutable.
     */
    public java.lang.Long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this Contact.
     * 
     * @param companyId   * The ID of the {@link Company} that this contact is associated
     * with. This
     *                     attribute is required and immutable.
     */
    public void setCompanyId(java.lang.Long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the status value for this Contact.
     * 
     * @return status   * The status of the contact. This attribute is readonly and is
     * assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.ContactStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Contact.
     * 
     * @param status   * The status of the contact. This attribute is readonly and is
     * assigned by Google.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ContactStatus status) {
        this.status = status;
    }


    /**
     * Gets the address value for this Contact.
     * 
     * @return address   * The address of the contact. This attribute is optional and
     * has a maximum length of 1024
     *                     characters.
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Contact.
     * 
     * @param address   * The address of the contact. This attribute is optional and
     * has a maximum length of 1024
     *                     characters.
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the cellPhone value for this Contact.
     * 
     * @return cellPhone   * The cell phone number where the contact can be reached. This
     * attribute is
     *                     optional.
     */
    public java.lang.String getCellPhone() {
        return cellPhone;
    }


    /**
     * Sets the cellPhone value for this Contact.
     * 
     * @param cellPhone   * The cell phone number where the contact can be reached. This
     * attribute is
     *                     optional.
     */
    public void setCellPhone(java.lang.String cellPhone) {
        this.cellPhone = cellPhone;
    }


    /**
     * Gets the comment value for this Contact.
     * 
     * @return comment   * A free-form text comment for the contact. This attribute is
     * optional and has a maximum
     *                     length of 1024 characters.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Contact.
     * 
     * @param comment   * A free-form text comment for the contact. This attribute is
     * optional and has a maximum
     *                     length of 1024 characters.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the email value for this Contact.
     * 
     * @return email   * The e-mail address where the contact can be reached. This attribute
     * is optional.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Contact.
     * 
     * @param email   * The e-mail address where the contact can be reached. This attribute
     * is optional.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the faxPhone value for this Contact.
     * 
     * @return faxPhone   * The fax number where the contact can be reached. This attribute
     * is optional.
     */
    public java.lang.String getFaxPhone() {
        return faxPhone;
    }


    /**
     * Sets the faxPhone value for this Contact.
     * 
     * @param faxPhone   * The fax number where the contact can be reached. This attribute
     * is optional.
     */
    public void setFaxPhone(java.lang.String faxPhone) {
        this.faxPhone = faxPhone;
    }


    /**
     * Gets the title value for this Contact.
     * 
     * @return title   * The job title of the contact. This attribute is optional and
     * has a maximum length of 1024
     *                     characters.
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Contact.
     * 
     * @param title   * The job title of the contact. This attribute is optional and
     * has a maximum length of 1024
     *                     characters.
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the workPhone value for this Contact.
     * 
     * @return workPhone   * The work phone number where the contact can be reached. This
     * attribute is optional.
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this Contact.
     * 
     * @param workPhone   * The work phone number where the contact can be reached. This
     * attribute is optional.
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.companyId==null && other.getCompanyId()==null) || 
             (this.companyId!=null &&
              this.companyId.equals(other.getCompanyId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.cellPhone==null && other.getCellPhone()==null) || 
             (this.cellPhone!=null &&
              this.cellPhone.equals(other.getCellPhone()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.faxPhone==null && other.getFaxPhone()==null) || 
             (this.faxPhone!=null &&
              this.faxPhone.equals(other.getFaxPhone()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCompanyId() != null) {
            _hashCode += getCompanyId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCellPhone() != null) {
            _hashCode += getCellPhone().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFaxPhone() != null) {
            _hashCode += getFaxPhone().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Contact"));
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
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Contact.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "cellPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "faxPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "workPhone"));
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
