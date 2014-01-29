/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class User  extends com.google.api.ads.dfa.axis.v1_19.UserBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.UserFilter advertiserUserFilter;

    private com.google.api.ads.dfa.axis.v1_19.UserFilter campaignUserFilter;

    private java.lang.String comments;

    private boolean gaiaEnabled;

    private long languageEncodingId;

    private com.google.api.ads.dfa.axis.v1_19.UserFilter siteUserFilter;

    private long traffickerType;

    private com.google.api.ads.dfa.axis.v1_19.UserFilter userRoleUserFilter;

    public User() {
    }

    public User(
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
           long userLevelId,
           com.google.api.ads.dfa.axis.v1_19.UserFilter advertiserUserFilter,
           com.google.api.ads.dfa.axis.v1_19.UserFilter campaignUserFilter,
           java.lang.String comments,
           boolean gaiaEnabled,
           long languageEncodingId,
           com.google.api.ads.dfa.axis.v1_19.UserFilter siteUserFilter,
           long traffickerType,
           com.google.api.ads.dfa.axis.v1_19.UserFilter userRoleUserFilter) {
        super(
            id,
            name,
            active,
            apiUser,
            email,
            languageId,
            networkId,
            password,
            subnetworkId,
            userGroupId,
            userLevelId);
        this.advertiserUserFilter = advertiserUserFilter;
        this.campaignUserFilter = campaignUserFilter;
        this.comments = comments;
        this.gaiaEnabled = gaiaEnabled;
        this.languageEncodingId = languageEncodingId;
        this.siteUserFilter = siteUserFilter;
        this.traffickerType = traffickerType;
        this.userRoleUserFilter = userRoleUserFilter;
    }


    /**
     * Gets the advertiserUserFilter value for this User.
     * 
     * @return advertiserUserFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.UserFilter getAdvertiserUserFilter() {
        return advertiserUserFilter;
    }


    /**
     * Sets the advertiserUserFilter value for this User.
     * 
     * @param advertiserUserFilter
     */
    public void setAdvertiserUserFilter(com.google.api.ads.dfa.axis.v1_19.UserFilter advertiserUserFilter) {
        this.advertiserUserFilter = advertiserUserFilter;
    }


    /**
     * Gets the campaignUserFilter value for this User.
     * 
     * @return campaignUserFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.UserFilter getCampaignUserFilter() {
        return campaignUserFilter;
    }


    /**
     * Sets the campaignUserFilter value for this User.
     * 
     * @param campaignUserFilter
     */
    public void setCampaignUserFilter(com.google.api.ads.dfa.axis.v1_19.UserFilter campaignUserFilter) {
        this.campaignUserFilter = campaignUserFilter;
    }


    /**
     * Gets the comments value for this User.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this User.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the gaiaEnabled value for this User.
     * 
     * @return gaiaEnabled
     */
    public boolean isGaiaEnabled() {
        return gaiaEnabled;
    }


    /**
     * Sets the gaiaEnabled value for this User.
     * 
     * @param gaiaEnabled
     */
    public void setGaiaEnabled(boolean gaiaEnabled) {
        this.gaiaEnabled = gaiaEnabled;
    }


    /**
     * Gets the languageEncodingId value for this User.
     * 
     * @return languageEncodingId
     */
    public long getLanguageEncodingId() {
        return languageEncodingId;
    }


    /**
     * Sets the languageEncodingId value for this User.
     * 
     * @param languageEncodingId
     */
    public void setLanguageEncodingId(long languageEncodingId) {
        this.languageEncodingId = languageEncodingId;
    }


    /**
     * Gets the siteUserFilter value for this User.
     * 
     * @return siteUserFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.UserFilter getSiteUserFilter() {
        return siteUserFilter;
    }


    /**
     * Sets the siteUserFilter value for this User.
     * 
     * @param siteUserFilter
     */
    public void setSiteUserFilter(com.google.api.ads.dfa.axis.v1_19.UserFilter siteUserFilter) {
        this.siteUserFilter = siteUserFilter;
    }


    /**
     * Gets the traffickerType value for this User.
     * 
     * @return traffickerType
     */
    public long getTraffickerType() {
        return traffickerType;
    }


    /**
     * Sets the traffickerType value for this User.
     * 
     * @param traffickerType
     */
    public void setTraffickerType(long traffickerType) {
        this.traffickerType = traffickerType;
    }


    /**
     * Gets the userRoleUserFilter value for this User.
     * 
     * @return userRoleUserFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.UserFilter getUserRoleUserFilter() {
        return userRoleUserFilter;
    }


    /**
     * Sets the userRoleUserFilter value for this User.
     * 
     * @param userRoleUserFilter
     */
    public void setUserRoleUserFilter(com.google.api.ads.dfa.axis.v1_19.UserFilter userRoleUserFilter) {
        this.userRoleUserFilter = userRoleUserFilter;
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
            ((this.advertiserUserFilter==null && other.getAdvertiserUserFilter()==null) || 
             (this.advertiserUserFilter!=null &&
              this.advertiserUserFilter.equals(other.getAdvertiserUserFilter()))) &&
            ((this.campaignUserFilter==null && other.getCampaignUserFilter()==null) || 
             (this.campaignUserFilter!=null &&
              this.campaignUserFilter.equals(other.getCampaignUserFilter()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.gaiaEnabled == other.isGaiaEnabled() &&
            this.languageEncodingId == other.getLanguageEncodingId() &&
            ((this.siteUserFilter==null && other.getSiteUserFilter()==null) || 
             (this.siteUserFilter!=null &&
              this.siteUserFilter.equals(other.getSiteUserFilter()))) &&
            this.traffickerType == other.getTraffickerType() &&
            ((this.userRoleUserFilter==null && other.getUserRoleUserFilter()==null) || 
             (this.userRoleUserFilter!=null &&
              this.userRoleUserFilter.equals(other.getUserRoleUserFilter())));
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
        if (getAdvertiserUserFilter() != null) {
            _hashCode += getAdvertiserUserFilter().hashCode();
        }
        if (getCampaignUserFilter() != null) {
            _hashCode += getCampaignUserFilter().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += (isGaiaEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLanguageEncodingId()).hashCode();
        if (getSiteUserFilter() != null) {
            _hashCode += getSiteUserFilter().hashCode();
        }
        _hashCode += new Long(getTraffickerType()).hashCode();
        if (getUserRoleUserFilter() != null) {
            _hashCode += getUserRoleUserFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserUserFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserUserFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignUserFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignUserFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gaiaEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gaiaEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageEncodingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageEncodingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteUserFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteUserFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffickerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traffickerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRoleUserFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRoleUserFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserFilter"));
        elemField.setNillable(true);
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
