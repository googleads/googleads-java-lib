/**
 * CriterionUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * UserList - represents a user list that is defined by the advertiser
 * to be targeted.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class CriterionUserList  extends com.google.api.ads.adwords.axis.v201506.cm.Criterion  implements java.io.Serializable {
    /* Id of this user list. This is a required field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListId".</span> */
    private java.lang.Long userListId;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "UserListName".</span> */
    private java.lang.String userListName;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "UserListMembershipStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201506.cm.CriterionUserListMembershipStatus userListMembershipStatus;

    public CriterionUserList() {
    }

    public CriterionUserList(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201506.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.Long userListId,
           java.lang.String userListName,
           com.google.api.ads.adwords.axis.v201506.cm.CriterionUserListMembershipStatus userListMembershipStatus) {
        super(
            id,
            type,
            criterionType);
        this.userListId = userListId;
        this.userListName = userListName;
        this.userListMembershipStatus = userListMembershipStatus;
    }


    /**
     * Gets the userListId value for this CriterionUserList.
     * 
     * @return userListId   * Id of this user list. This is a required field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListId".</span>
     */
    public java.lang.Long getUserListId() {
        return userListId;
    }


    /**
     * Sets the userListId value for this CriterionUserList.
     * 
     * @param userListId   * Id of this user list. This is a required field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListId".</span>
     */
    public void setUserListId(java.lang.Long userListId) {
        this.userListId = userListId;
    }


    /**
     * Gets the userListName value for this CriterionUserList.
     * 
     * @return userListName   * <span class="constraint Selectable">This field can be selected
     * using the value "UserListName".</span>
     */
    public java.lang.String getUserListName() {
        return userListName;
    }


    /**
     * Sets the userListName value for this CriterionUserList.
     * 
     * @param userListName   * <span class="constraint Selectable">This field can be selected
     * using the value "UserListName".</span>
     */
    public void setUserListName(java.lang.String userListName) {
        this.userListName = userListName;
    }


    /**
     * Gets the userListMembershipStatus value for this CriterionUserList.
     * 
     * @return userListMembershipStatus   * <span class="constraint Selectable">This field can be selected
     * using the value "UserListMembershipStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201506.cm.CriterionUserListMembershipStatus getUserListMembershipStatus() {
        return userListMembershipStatus;
    }


    /**
     * Sets the userListMembershipStatus value for this CriterionUserList.
     * 
     * @param userListMembershipStatus   * <span class="constraint Selectable">This field can be selected
     * using the value "UserListMembershipStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setUserListMembershipStatus(com.google.api.ads.adwords.axis.v201506.cm.CriterionUserListMembershipStatus userListMembershipStatus) {
        this.userListMembershipStatus = userListMembershipStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriterionUserList)) return false;
        CriterionUserList other = (CriterionUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userListId==null && other.getUserListId()==null) || 
             (this.userListId!=null &&
              this.userListId.equals(other.getUserListId()))) &&
            ((this.userListName==null && other.getUserListName()==null) || 
             (this.userListName!=null &&
              this.userListName.equals(other.getUserListName()))) &&
            ((this.userListMembershipStatus==null && other.getUserListMembershipStatus()==null) || 
             (this.userListMembershipStatus!=null &&
              this.userListMembershipStatus.equals(other.getUserListMembershipStatus())));
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
        if (getUserListId() != null) {
            _hashCode += getUserListId().hashCode();
        }
        if (getUserListName() != null) {
            _hashCode += getUserListName().hashCode();
        }
        if (getUserListMembershipStatus() != null) {
            _hashCode += getUserListMembershipStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriterionUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "CriterionUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "userListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "userListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListMembershipStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "userListMembershipStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "CriterionUserList.MembershipStatus"));
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
