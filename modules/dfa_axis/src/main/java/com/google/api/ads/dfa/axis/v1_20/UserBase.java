/**
 * UserBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public abstract class UserBase  extends com.google.api.ads.dfa.axis.v1_20.Base  implements java.io.Serializable {
    private boolean active;

    private boolean apiUser;

    private java.lang.String email;

    private long languageId;

    private long networkId;

    private java.lang.String password;

    private long subnetworkId;

    private long userGroupId;

    private long userLevelId;

    public UserBase() {
    }

    public UserBase(
           long id,
           java.lang.String name,
           boolean active,
           boolean apiUser,
           java.lang.String email,
           long languageId,
           long networkId,
           java.lang.String password,
           long subnetworkId,
           long userGroupId,
           long userLevelId) {
        super(
            id,
            name);
        this.active = active;
        this.apiUser = apiUser;
        this.email = email;
        this.languageId = languageId;
        this.networkId = networkId;
        this.password = password;
        this.subnetworkId = subnetworkId;
        this.userGroupId = userGroupId;
        this.userLevelId = userLevelId;
    }


    /**
     * Gets the active value for this UserBase.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this UserBase.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the apiUser value for this UserBase.
     * 
     * @return apiUser
     */
    public boolean isApiUser() {
        return apiUser;
    }


    /**
     * Sets the apiUser value for this UserBase.
     * 
     * @param apiUser
     */
    public void setApiUser(boolean apiUser) {
        this.apiUser = apiUser;
    }


    /**
     * Gets the email value for this UserBase.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserBase.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the languageId value for this UserBase.
     * 
     * @return languageId
     */
    public long getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this UserBase.
     * 
     * @param languageId
     */
    public void setLanguageId(long languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the networkId value for this UserBase.
     * 
     * @return networkId
     */
    public long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this UserBase.
     * 
     * @param networkId
     */
    public void setNetworkId(long networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the password value for this UserBase.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserBase.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the subnetworkId value for this UserBase.
     * 
     * @return subnetworkId
     */
    public long getSubnetworkId() {
        return subnetworkId;
    }


    /**
     * Sets the subnetworkId value for this UserBase.
     * 
     * @param subnetworkId
     */
    public void setSubnetworkId(long subnetworkId) {
        this.subnetworkId = subnetworkId;
    }


    /**
     * Gets the userGroupId value for this UserBase.
     * 
     * @return userGroupId
     */
    public long getUserGroupId() {
        return userGroupId;
    }


    /**
     * Sets the userGroupId value for this UserBase.
     * 
     * @param userGroupId
     */
    public void setUserGroupId(long userGroupId) {
        this.userGroupId = userGroupId;
    }


    /**
     * Gets the userLevelId value for this UserBase.
     * 
     * @return userLevelId
     */
    public long getUserLevelId() {
        return userLevelId;
    }


    /**
     * Sets the userLevelId value for this UserBase.
     * 
     * @param userLevelId
     */
    public void setUserLevelId(long userLevelId) {
        this.userLevelId = userLevelId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserBase)) return false;
        UserBase other = (UserBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            this.apiUser == other.isApiUser() &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.languageId == other.getLanguageId() &&
            this.networkId == other.getNetworkId() &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.subnetworkId == other.getSubnetworkId() &&
            this.userGroupId == other.getUserGroupId() &&
            this.userLevelId == other.getUserLevelId();
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApiUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += new Long(getLanguageId()).hashCode();
        _hashCode += new Long(getNetworkId()).hashCode();
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += new Long(getSubnetworkId()).hashCode();
        _hashCode += new Long(getUserGroupId()).hashCode();
        _hashCode += new Long(getUserLevelId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apiUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subnetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLevelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLevelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
