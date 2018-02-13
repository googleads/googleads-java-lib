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
 * Company.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Company} represents an agency, a single advertiser or
 * an entire
 *             advertising network.
 */
public class Company  implements java.io.Serializable {
    /* Uniquely identifies the {@code Company}. This value is read-only
     * and is
     *                 assigned by Google when the company is created. This
     * attribute is required
     *                 for updates. */
    private java.lang.Long id;

    /* The full name of the company. This attribute is required and
     * has a maximum
     *                 length of 127 characters. */
    private java.lang.String name;

    /* Specifies what kind of company this is. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.CompanyType type;

    /* Specifies the address of the company. This attribute is optional
     * and has a
     *                 maximum length of 65,535 characters. */
    private java.lang.String address;

    /* Specifies the email of the company. This attribute is optional
     * and has a
     *                 maximum length of 128 characters. */
    private java.lang.String email;

    /* Specifies the fax phone number of the company. This attribute
     * is optional
     *                 and has a maximum length of 63 characters. */
    private java.lang.String faxPhone;

    /* Specifies the primary phone number of the company. This attribute
     * is
     *                 optional and has a maximum length of 63 characters. */
    private java.lang.String primaryPhone;

    /* Specifies the external ID of the company. This attribute is
     * optional and
     *                 has a maximum length of 255 characters. */
    private java.lang.String externalId;

    /* Specifies the comment of the company. This attribute is optional
     * and has a
     *                 maximum length of 1024 characters. */
    private java.lang.String comment;

    /* Specifies the company's credit status. This attribute is optional
     * and
     *                 defaults to {@link CreditStatus#ACTIVE} when basic
     * credit status settings
     *                 are enabled, and {@link CreditStatus#ON_HOLD} when
     * advanced credit status
     *                 settings are enabled. */
    private com.google.api.ads.dfp.axis.v201802.CompanyCreditStatus creditStatus;

    /* Specifies the default billing settings of this {@code Company}.
     * This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.CompanySettings settings;

    /* The set of labels applied to this company. */
    private com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels;

    /* The ID of the {@link Contact} who is acting as the primary
     * contact for this
     *                 company. This attribute is optional. */
    private java.lang.Long primaryContactId;

    /* The IDs of all teams that this company is on directly. */
    private long[] appliedTeamIds;

    /* Specifies the ID of the Google-recognized canonicalized form
     * of this
     *                 company. This attribute is optional. */
    private java.lang.Integer thirdPartyCompanyId;

    /* The date and time this company was last modified. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    public Company() {
    }

    public Company(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.CompanyType type,
           java.lang.String address,
           java.lang.String email,
           java.lang.String faxPhone,
           java.lang.String primaryPhone,
           java.lang.String externalId,
           java.lang.String comment,
           com.google.api.ads.dfp.axis.v201802.CompanyCreditStatus creditStatus,
           com.google.api.ads.dfp.axis.v201802.CompanySettings settings,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           java.lang.Long primaryContactId,
           long[] appliedTeamIds,
           java.lang.Integer thirdPartyCompanyId,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
           this.id = id;
           this.name = name;
           this.type = type;
           this.address = address;
           this.email = email;
           this.faxPhone = faxPhone;
           this.primaryPhone = primaryPhone;
           this.externalId = externalId;
           this.comment = comment;
           this.creditStatus = creditStatus;
           this.settings = settings;
           this.appliedLabels = appliedLabels;
           this.primaryContactId = primaryContactId;
           this.appliedTeamIds = appliedTeamIds;
           this.thirdPartyCompanyId = thirdPartyCompanyId;
           this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("address", getAddress())
            .add("appliedLabels", getAppliedLabels())
            .add("appliedTeamIds", getAppliedTeamIds())
            .add("comment", getComment())
            .add("creditStatus", getCreditStatus())
            .add("email", getEmail())
            .add("externalId", getExternalId())
            .add("faxPhone", getFaxPhone())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("primaryContactId", getPrimaryContactId())
            .add("primaryPhone", getPrimaryPhone())
            .add("settings", getSettings())
            .add("thirdPartyCompanyId", getThirdPartyCompanyId())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the id value for this Company.
     * 
     * @return id   * Uniquely identifies the {@code Company}. This value is read-only
     * and is
     *                 assigned by Google when the company is created. This
     * attribute is required
     *                 for updates.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Company.
     * 
     * @param id   * Uniquely identifies the {@code Company}. This value is read-only
     * and is
     *                 assigned by Google when the company is created. This
     * attribute is required
     *                 for updates.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Company.
     * 
     * @return name   * The full name of the company. This attribute is required and
     * has a maximum
     *                 length of 127 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Company.
     * 
     * @param name   * The full name of the company. This attribute is required and
     * has a maximum
     *                 length of 127 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this Company.
     * 
     * @return type   * Specifies what kind of company this is. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.CompanyType getType() {
        return type;
    }


    /**
     * Sets the type value for this Company.
     * 
     * @param type   * Specifies what kind of company this is. This attribute is required.
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.CompanyType type) {
        this.type = type;
    }


    /**
     * Gets the address value for this Company.
     * 
     * @return address   * Specifies the address of the company. This attribute is optional
     * and has a
     *                 maximum length of 65,535 characters.
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Company.
     * 
     * @param address   * Specifies the address of the company. This attribute is optional
     * and has a
     *                 maximum length of 65,535 characters.
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the email value for this Company.
     * 
     * @return email   * Specifies the email of the company. This attribute is optional
     * and has a
     *                 maximum length of 128 characters.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Company.
     * 
     * @param email   * Specifies the email of the company. This attribute is optional
     * and has a
     *                 maximum length of 128 characters.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the faxPhone value for this Company.
     * 
     * @return faxPhone   * Specifies the fax phone number of the company. This attribute
     * is optional
     *                 and has a maximum length of 63 characters.
     */
    public java.lang.String getFaxPhone() {
        return faxPhone;
    }


    /**
     * Sets the faxPhone value for this Company.
     * 
     * @param faxPhone   * Specifies the fax phone number of the company. This attribute
     * is optional
     *                 and has a maximum length of 63 characters.
     */
    public void setFaxPhone(java.lang.String faxPhone) {
        this.faxPhone = faxPhone;
    }


    /**
     * Gets the primaryPhone value for this Company.
     * 
     * @return primaryPhone   * Specifies the primary phone number of the company. This attribute
     * is
     *                 optional and has a maximum length of 63 characters.
     */
    public java.lang.String getPrimaryPhone() {
        return primaryPhone;
    }


    /**
     * Sets the primaryPhone value for this Company.
     * 
     * @param primaryPhone   * Specifies the primary phone number of the company. This attribute
     * is
     *                 optional and has a maximum length of 63 characters.
     */
    public void setPrimaryPhone(java.lang.String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }


    /**
     * Gets the externalId value for this Company.
     * 
     * @return externalId   * Specifies the external ID of the company. This attribute is
     * optional and
     *                 has a maximum length of 255 characters.
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Company.
     * 
     * @param externalId   * Specifies the external ID of the company. This attribute is
     * optional and
     *                 has a maximum length of 255 characters.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the comment value for this Company.
     * 
     * @return comment   * Specifies the comment of the company. This attribute is optional
     * and has a
     *                 maximum length of 1024 characters.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Company.
     * 
     * @param comment   * Specifies the comment of the company. This attribute is optional
     * and has a
     *                 maximum length of 1024 characters.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the creditStatus value for this Company.
     * 
     * @return creditStatus   * Specifies the company's credit status. This attribute is optional
     * and
     *                 defaults to {@link CreditStatus#ACTIVE} when basic
     * credit status settings
     *                 are enabled, and {@link CreditStatus#ON_HOLD} when
     * advanced credit status
     *                 settings are enabled.
     */
    public com.google.api.ads.dfp.axis.v201802.CompanyCreditStatus getCreditStatus() {
        return creditStatus;
    }


    /**
     * Sets the creditStatus value for this Company.
     * 
     * @param creditStatus   * Specifies the company's credit status. This attribute is optional
     * and
     *                 defaults to {@link CreditStatus#ACTIVE} when basic
     * credit status settings
     *                 are enabled, and {@link CreditStatus#ON_HOLD} when
     * advanced credit status
     *                 settings are enabled.
     */
    public void setCreditStatus(com.google.api.ads.dfp.axis.v201802.CompanyCreditStatus creditStatus) {
        this.creditStatus = creditStatus;
    }


    /**
     * Gets the settings value for this Company.
     * 
     * @return settings   * Specifies the default billing settings of this {@code Company}.
     * This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.CompanySettings getSettings() {
        return settings;
    }


    /**
     * Sets the settings value for this Company.
     * 
     * @param settings   * Specifies the default billing settings of this {@code Company}.
     * This attribute is optional.
     */
    public void setSettings(com.google.api.ads.dfp.axis.v201802.CompanySettings settings) {
        this.settings = settings;
    }


    /**
     * Gets the appliedLabels value for this Company.
     * 
     * @return appliedLabels   * The set of labels applied to this company.
     */
    public com.google.api.ads.dfp.axis.v201802.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this Company.
     * 
     * @param appliedLabels   * The set of labels applied to this company.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201802.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201802.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the primaryContactId value for this Company.
     * 
     * @return primaryContactId   * The ID of the {@link Contact} who is acting as the primary
     * contact for this
     *                 company. This attribute is optional.
     */
    public java.lang.Long getPrimaryContactId() {
        return primaryContactId;
    }


    /**
     * Sets the primaryContactId value for this Company.
     * 
     * @param primaryContactId   * The ID of the {@link Contact} who is acting as the primary
     * contact for this
     *                 company. This attribute is optional.
     */
    public void setPrimaryContactId(java.lang.Long primaryContactId) {
        this.primaryContactId = primaryContactId;
    }


    /**
     * Gets the appliedTeamIds value for this Company.
     * 
     * @return appliedTeamIds   * The IDs of all teams that this company is on directly.
     */
    public long[] getAppliedTeamIds() {
        return appliedTeamIds;
    }


    /**
     * Sets the appliedTeamIds value for this Company.
     * 
     * @param appliedTeamIds   * The IDs of all teams that this company is on directly.
     */
    public void setAppliedTeamIds(long[] appliedTeamIds) {
        this.appliedTeamIds = appliedTeamIds;
    }

    public long getAppliedTeamIds(int i) {
        return this.appliedTeamIds[i];
    }

    public void setAppliedTeamIds(int i, long _value) {
        this.appliedTeamIds[i] = _value;
    }


    /**
     * Gets the thirdPartyCompanyId value for this Company.
     * 
     * @return thirdPartyCompanyId   * Specifies the ID of the Google-recognized canonicalized form
     * of this
     *                 company. This attribute is optional.
     */
    public java.lang.Integer getThirdPartyCompanyId() {
        return thirdPartyCompanyId;
    }


    /**
     * Sets the thirdPartyCompanyId value for this Company.
     * 
     * @param thirdPartyCompanyId   * Specifies the ID of the Google-recognized canonicalized form
     * of this
     *                 company. This attribute is optional.
     */
    public void setThirdPartyCompanyId(java.lang.Integer thirdPartyCompanyId) {
        this.thirdPartyCompanyId = thirdPartyCompanyId;
    }


    /**
     * Gets the lastModifiedDateTime value for this Company.
     * 
     * @return lastModifiedDateTime   * The date and time this company was last modified.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Company.
     * 
     * @param lastModifiedDateTime   * The date and time this company was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Company)) return false;
        Company other = (Company) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.faxPhone==null && other.getFaxPhone()==null) || 
             (this.faxPhone!=null &&
              this.faxPhone.equals(other.getFaxPhone()))) &&
            ((this.primaryPhone==null && other.getPrimaryPhone()==null) || 
             (this.primaryPhone!=null &&
              this.primaryPhone.equals(other.getPrimaryPhone()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.creditStatus==null && other.getCreditStatus()==null) || 
             (this.creditStatus!=null &&
              this.creditStatus.equals(other.getCreditStatus()))) &&
            ((this.settings==null && other.getSettings()==null) || 
             (this.settings!=null &&
              this.settings.equals(other.getSettings()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.primaryContactId==null && other.getPrimaryContactId()==null) || 
             (this.primaryContactId!=null &&
              this.primaryContactId.equals(other.getPrimaryContactId()))) &&
            ((this.appliedTeamIds==null && other.getAppliedTeamIds()==null) || 
             (this.appliedTeamIds!=null &&
              java.util.Arrays.equals(this.appliedTeamIds, other.getAppliedTeamIds()))) &&
            ((this.thirdPartyCompanyId==null && other.getThirdPartyCompanyId()==null) || 
             (this.thirdPartyCompanyId!=null &&
              this.thirdPartyCompanyId.equals(other.getThirdPartyCompanyId()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFaxPhone() != null) {
            _hashCode += getFaxPhone().hashCode();
        }
        if (getPrimaryPhone() != null) {
            _hashCode += getPrimaryPhone().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getCreditStatus() != null) {
            _hashCode += getCreditStatus().hashCode();
        }
        if (getSettings() != null) {
            _hashCode += getSettings().hashCode();
        }
        if (getAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryContactId() != null) {
            _hashCode += getPrimaryContactId().hashCode();
        }
        if (getAppliedTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThirdPartyCompanyId() != null) {
            _hashCode += getThirdPartyCompanyId().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Company.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Company"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Company.Type"));
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
        elemField.setFieldName("primaryPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "primaryPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "externalId"));
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
        elemField.setFieldName("creditStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creditStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Company.CreditStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CompanySettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "primaryContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appliedTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCompanyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "thirdPartyCompanyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedDateTime"));
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
