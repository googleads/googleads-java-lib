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
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a user of the system.
 *             <p>
 *             Users may be assigned at most one {@link Role} per network.
 * Each role
 *             provides a user with permissions to perform specific operations.
 * Without a
 *             role, they will not be able to perform any actions.
 *             </p>
 */
public class User  extends com.google.api.ads.dfp.axis.v201802.UserRecord  implements java.io.Serializable {
    /* Specifies whether or not the {@code User} is active. An inactive
     * user
     *                     cannot log in to the system or perform any operations.
     * This attribute is
     *                     read-only. */
    private java.lang.Boolean isActive;

    /* Specifies whether or not the {@code User} wants to permit the
     * Publisher
     *                     Display Ads system to send email notifications
     * to his or her email address.
     *                     This attribute is optional and defaults to {@code
     * true}. */
    private java.lang.Boolean isEmailNotificationAllowed;

    /* An identifier for the {@code User} that is meaningful to the
     * publisher. This attribute is
     *                     optional and has a maximum length of 255 characters. */
    private java.lang.String externalId;

    /* Whether the user is an OAuth2 service account user. This attribute
     * is read-only. Service
     *                     account users can only be added through the UI. */
    private java.lang.Boolean isServiceAccount;

    /* The long format timezone id (e.g. "America/Los_Angeles") used
     * in the orders and line items UI
     *                     for this {@code User}. Set this to {@code null}
     * to indicate that no such value is defined
     *                     for the {@code User} - UI then defaults to using
     * the Network's timezone.
     *                     
     *                     This setting only affects the UI for this user
     * and does not in
     *                     particular affect the timezone of any dates and
     * times returned in API responses. */
    private java.lang.String ordersUiLocalTimeZoneId;

    public User() {
    }

    public User(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String email,
           java.lang.Long roleId,
           java.lang.String roleName,
           java.lang.Boolean isActive,
           java.lang.Boolean isEmailNotificationAllowed,
           java.lang.String externalId,
           java.lang.Boolean isServiceAccount,
           java.lang.String ordersUiLocalTimeZoneId) {
        super(
            id,
            name,
            email,
            roleId,
            roleName);
        this.isActive = isActive;
        this.isEmailNotificationAllowed = isEmailNotificationAllowed;
        this.externalId = externalId;
        this.isServiceAccount = isServiceAccount;
        this.ordersUiLocalTimeZoneId = ordersUiLocalTimeZoneId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("email", getEmail())
            .add("externalId", getExternalId())
            .add("id", getId())
            .add("isActive", getIsActive())
            .add("isEmailNotificationAllowed", getIsEmailNotificationAllowed())
            .add("isServiceAccount", getIsServiceAccount())
            .add("name", getName())
            .add("ordersUiLocalTimeZoneId", getOrdersUiLocalTimeZoneId())
            .add("roleId", getRoleId())
            .add("roleName", getRoleName())
            .toString();
    }

    /**
     * Gets the isActive value for this User.
     * 
     * @return isActive   * Specifies whether or not the {@code User} is active. An inactive
     * user
     *                     cannot log in to the system or perform any operations.
     * This attribute is
     *                     read-only.
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this User.
     * 
     * @param isActive   * Specifies whether or not the {@code User} is active. An inactive
     * user
     *                     cannot log in to the system or perform any operations.
     * This attribute is
     *                     read-only.
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isEmailNotificationAllowed value for this User.
     * 
     * @return isEmailNotificationAllowed   * Specifies whether or not the {@code User} wants to permit the
     * Publisher
     *                     Display Ads system to send email notifications
     * to his or her email address.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public java.lang.Boolean getIsEmailNotificationAllowed() {
        return isEmailNotificationAllowed;
    }


    /**
     * Sets the isEmailNotificationAllowed value for this User.
     * 
     * @param isEmailNotificationAllowed   * Specifies whether or not the {@code User} wants to permit the
     * Publisher
     *                     Display Ads system to send email notifications
     * to his or her email address.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public void setIsEmailNotificationAllowed(java.lang.Boolean isEmailNotificationAllowed) {
        this.isEmailNotificationAllowed = isEmailNotificationAllowed;
    }


    /**
     * Gets the externalId value for this User.
     * 
     * @return externalId   * An identifier for the {@code User} that is meaningful to the
     * publisher. This attribute is
     *                     optional and has a maximum length of 255 characters.
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this User.
     * 
     * @param externalId   * An identifier for the {@code User} that is meaningful to the
     * publisher. This attribute is
     *                     optional and has a maximum length of 255 characters.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the isServiceAccount value for this User.
     * 
     * @return isServiceAccount   * Whether the user is an OAuth2 service account user. This attribute
     * is read-only. Service
     *                     account users can only be added through the UI.
     */
    public java.lang.Boolean getIsServiceAccount() {
        return isServiceAccount;
    }


    /**
     * Sets the isServiceAccount value for this User.
     * 
     * @param isServiceAccount   * Whether the user is an OAuth2 service account user. This attribute
     * is read-only. Service
     *                     account users can only be added through the UI.
     */
    public void setIsServiceAccount(java.lang.Boolean isServiceAccount) {
        this.isServiceAccount = isServiceAccount;
    }


    /**
     * Gets the ordersUiLocalTimeZoneId value for this User.
     * 
     * @return ordersUiLocalTimeZoneId   * The long format timezone id (e.g. "America/Los_Angeles") used
     * in the orders and line items UI
     *                     for this {@code User}. Set this to {@code null}
     * to indicate that no such value is defined
     *                     for the {@code User} - UI then defaults to using
     * the Network's timezone.
     *                     
     *                     This setting only affects the UI for this user
     * and does not in
     *                     particular affect the timezone of any dates and
     * times returned in API responses.
     */
    public java.lang.String getOrdersUiLocalTimeZoneId() {
        return ordersUiLocalTimeZoneId;
    }


    /**
     * Sets the ordersUiLocalTimeZoneId value for this User.
     * 
     * @param ordersUiLocalTimeZoneId   * The long format timezone id (e.g. "America/Los_Angeles") used
     * in the orders and line items UI
     *                     for this {@code User}. Set this to {@code null}
     * to indicate that no such value is defined
     *                     for the {@code User} - UI then defaults to using
     * the Network's timezone.
     *                     
     *                     This setting only affects the UI for this user
     * and does not in
     *                     particular affect the timezone of any dates and
     * times returned in API responses.
     */
    public void setOrdersUiLocalTimeZoneId(java.lang.String ordersUiLocalTimeZoneId) {
        this.ordersUiLocalTimeZoneId = ordersUiLocalTimeZoneId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isEmailNotificationAllowed==null && other.getIsEmailNotificationAllowed()==null) || 
             (this.isEmailNotificationAllowed!=null &&
              this.isEmailNotificationAllowed.equals(other.getIsEmailNotificationAllowed()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.isServiceAccount==null && other.getIsServiceAccount()==null) || 
             (this.isServiceAccount!=null &&
              this.isServiceAccount.equals(other.getIsServiceAccount()))) &&
            ((this.ordersUiLocalTimeZoneId==null && other.getOrdersUiLocalTimeZoneId()==null) || 
             (this.ordersUiLocalTimeZoneId!=null &&
              this.ordersUiLocalTimeZoneId.equals(other.getOrdersUiLocalTimeZoneId())));
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
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsEmailNotificationAllowed() != null) {
            _hashCode += getIsEmailNotificationAllowed().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getIsServiceAccount() != null) {
            _hashCode += getIsServiceAccount().hashCode();
        }
        if (getOrdersUiLocalTimeZoneId() != null) {
            _hashCode += getOrdersUiLocalTimeZoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEmailNotificationAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isEmailNotificationAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("isServiceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isServiceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordersUiLocalTimeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ordersUiLocalTimeZoneId"));
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
