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
 * CriterionUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * UserList - represents a user list that is defined by the advertiser
 * to be targeted.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class CriterionUserList  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
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
    private com.google.api.ads.adwords.axis.v201802.cm.CriterionUserListMembershipStatus userListMembershipStatus;

    /* Determines whether a user list is eligible for targeting in
     * the google.com
     *                     (search) network.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListEligibleForSearch".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Boolean userListEligibleForSearch;

    /* Determines whether a user list is eligible for targeting in
     * the display network.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListEligibleForDisplay".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Boolean userListEligibleForDisplay;

    public CriterionUserList() {
    }

    public CriterionUserList(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.Long userListId,
           java.lang.String userListName,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionUserListMembershipStatus userListMembershipStatus,
           java.lang.Boolean userListEligibleForSearch,
           java.lang.Boolean userListEligibleForDisplay) {
        super(
            id,
            type,
            criterionType);
        this.userListId = userListId;
        this.userListName = userListName;
        this.userListMembershipStatus = userListMembershipStatus;
        this.userListEligibleForSearch = userListEligibleForSearch;
        this.userListEligibleForDisplay = userListEligibleForDisplay;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("type", getType())
            .add("userListEligibleForDisplay", getUserListEligibleForDisplay())
            .add("userListEligibleForSearch", getUserListEligibleForSearch())
            .add("userListId", getUserListId())
            .add("userListMembershipStatus", getUserListMembershipStatus())
            .add("userListName", getUserListName())
            .toString();
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
    public com.google.api.ads.adwords.axis.v201802.cm.CriterionUserListMembershipStatus getUserListMembershipStatus() {
        return userListMembershipStatus;
    }


    /**
     * Sets the userListMembershipStatus value for this CriterionUserList.
     * 
     * @param userListMembershipStatus   * <span class="constraint Selectable">This field can be selected
     * using the value "UserListMembershipStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setUserListMembershipStatus(com.google.api.ads.adwords.axis.v201802.cm.CriterionUserListMembershipStatus userListMembershipStatus) {
        this.userListMembershipStatus = userListMembershipStatus;
    }


    /**
     * Gets the userListEligibleForSearch value for this CriterionUserList.
     * 
     * @return userListEligibleForSearch   * Determines whether a user list is eligible for targeting in
     * the google.com
     *                     (search) network.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListEligibleForSearch".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getUserListEligibleForSearch() {
        return userListEligibleForSearch;
    }


    /**
     * Sets the userListEligibleForSearch value for this CriterionUserList.
     * 
     * @param userListEligibleForSearch   * Determines whether a user list is eligible for targeting in
     * the google.com
     *                     (search) network.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListEligibleForSearch".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setUserListEligibleForSearch(java.lang.Boolean userListEligibleForSearch) {
        this.userListEligibleForSearch = userListEligibleForSearch;
    }


    /**
     * Gets the userListEligibleForDisplay value for this CriterionUserList.
     * 
     * @return userListEligibleForDisplay   * Determines whether a user list is eligible for targeting in
     * the display network.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListEligibleForDisplay".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getUserListEligibleForDisplay() {
        return userListEligibleForDisplay;
    }


    /**
     * Sets the userListEligibleForDisplay value for this CriterionUserList.
     * 
     * @param userListEligibleForDisplay   * Determines whether a user list is eligible for targeting in
     * the display network.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserListEligibleForDisplay".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setUserListEligibleForDisplay(java.lang.Boolean userListEligibleForDisplay) {
        this.userListEligibleForDisplay = userListEligibleForDisplay;
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
              this.userListMembershipStatus.equals(other.getUserListMembershipStatus()))) &&
            ((this.userListEligibleForSearch==null && other.getUserListEligibleForSearch()==null) || 
             (this.userListEligibleForSearch!=null &&
              this.userListEligibleForSearch.equals(other.getUserListEligibleForSearch()))) &&
            ((this.userListEligibleForDisplay==null && other.getUserListEligibleForDisplay()==null) || 
             (this.userListEligibleForDisplay!=null &&
              this.userListEligibleForDisplay.equals(other.getUserListEligibleForDisplay())));
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
        if (getUserListEligibleForSearch() != null) {
            _hashCode += getUserListEligibleForSearch().hashCode();
        }
        if (getUserListEligibleForDisplay() != null) {
            _hashCode += getUserListEligibleForDisplay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriterionUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListMembershipStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userListMembershipStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionUserList.MembershipStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListEligibleForSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userListEligibleForSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListEligibleForDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userListEligibleForDisplay"));
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
