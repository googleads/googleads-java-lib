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
 * SimilarUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * SimilarUserList is a list of users which are similar to users from
 * another UserList.
 *             These lists are readonly and automatically created by
 * google.
 */
public class SimilarUserList  extends com.google.api.ads.adwords.axis.v201802.rm.UserList  implements java.io.Serializable {
    /* Seed UserListId from which this list is derived.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Long seedUserListId;

    /* Name of the seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String seedUserListName;

    /* Description of this seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListDescription".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String seedUserListDescription;

    /* Membership status of this seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListStatus".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus seedUserListStatus;

    /* Estimated number of users in this seed user list.
     *                     This value is null if the number of users has
     * not yet been determined.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedListSize".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Long seedListSize;

    public SimilarUserList() {
    }

    public SimilarUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201802.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201802.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRangeForSearch,
           com.google.api.ads.adwords.axis.v201802.rm.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.Boolean isEligibleForDisplay,
           com.google.api.ads.adwords.axis.v201802.rm.UserListClosingReason closingReason,
           java.lang.String userListType,
           java.lang.Long seedUserListId,
           java.lang.String seedUserListName,
           java.lang.String seedUserListDescription,
           com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus seedUserListStatus,
           java.lang.Long seedListSize) {
        super(
            id,
            isReadOnly,
            name,
            description,
            status,
            integrationCode,
            accessReason,
            accountUserListStatus,
            membershipLifeSpan,
            size,
            sizeRange,
            sizeForSearch,
            sizeRangeForSearch,
            listType,
            isEligibleForSearch,
            isEligibleForDisplay,
            closingReason,
            userListType);
        this.seedUserListId = seedUserListId;
        this.seedUserListName = seedUserListName;
        this.seedUserListDescription = seedUserListDescription;
        this.seedUserListStatus = seedUserListStatus;
        this.seedListSize = seedListSize;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accessReason", getAccessReason())
            .add("accountUserListStatus", getAccountUserListStatus())
            .add("closingReason", getClosingReason())
            .add("description", getDescription())
            .add("id", getId())
            .add("integrationCode", getIntegrationCode())
            .add("isEligibleForDisplay", getIsEligibleForDisplay())
            .add("isEligibleForSearch", getIsEligibleForSearch())
            .add("isReadOnly", getIsReadOnly())
            .add("listType", getListType())
            .add("membershipLifeSpan", getMembershipLifeSpan())
            .add("name", getName())
            .add("seedListSize", getSeedListSize())
            .add("seedUserListDescription", getSeedUserListDescription())
            .add("seedUserListId", getSeedUserListId())
            .add("seedUserListName", getSeedUserListName())
            .add("seedUserListStatus", getSeedUserListStatus())
            .add("size", getSize())
            .add("sizeForSearch", getSizeForSearch())
            .add("sizeRange", getSizeRange())
            .add("sizeRangeForSearch", getSizeRangeForSearch())
            .add("status", getStatus())
            .add("userListType", getUserListType())
            .toString();
    }

    /**
     * Gets the seedUserListId value for this SimilarUserList.
     * 
     * @return seedUserListId   * Seed UserListId from which this list is derived.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Long getSeedUserListId() {
        return seedUserListId;
    }


    /**
     * Sets the seedUserListId value for this SimilarUserList.
     * 
     * @param seedUserListId   * Seed UserListId from which this list is derived.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setSeedUserListId(java.lang.Long seedUserListId) {
        this.seedUserListId = seedUserListId;
    }


    /**
     * Gets the seedUserListName value for this SimilarUserList.
     * 
     * @return seedUserListName   * Name of the seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSeedUserListName() {
        return seedUserListName;
    }


    /**
     * Sets the seedUserListName value for this SimilarUserList.
     * 
     * @param seedUserListName   * Name of the seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSeedUserListName(java.lang.String seedUserListName) {
        this.seedUserListName = seedUserListName;
    }


    /**
     * Gets the seedUserListDescription value for this SimilarUserList.
     * 
     * @return seedUserListDescription   * Description of this seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListDescription".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSeedUserListDescription() {
        return seedUserListDescription;
    }


    /**
     * Sets the seedUserListDescription value for this SimilarUserList.
     * 
     * @param seedUserListDescription   * Description of this seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListDescription".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSeedUserListDescription(java.lang.String seedUserListDescription) {
        this.seedUserListDescription = seedUserListDescription;
    }


    /**
     * Gets the seedUserListStatus value for this SimilarUserList.
     * 
     * @return seedUserListStatus   * Membership status of this seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListStatus".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus getSeedUserListStatus() {
        return seedUserListStatus;
    }


    /**
     * Sets the seedUserListStatus value for this SimilarUserList.
     * 
     * @param seedUserListStatus   * Membership status of this seed user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedUserListStatus".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSeedUserListStatus(com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus seedUserListStatus) {
        this.seedUserListStatus = seedUserListStatus;
    }


    /**
     * Gets the seedListSize value for this SimilarUserList.
     * 
     * @return seedListSize   * Estimated number of users in this seed user list.
     *                     This value is null if the number of users has
     * not yet been determined.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedListSize".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getSeedListSize() {
        return seedListSize;
    }


    /**
     * Sets the seedListSize value for this SimilarUserList.
     * 
     * @param seedListSize   * Estimated number of users in this seed user list.
     *                     This value is null if the number of users has
     * not yet been determined.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "SeedListSize".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSeedListSize(java.lang.Long seedListSize) {
        this.seedListSize = seedListSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimilarUserList)) return false;
        SimilarUserList other = (SimilarUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.seedUserListId==null && other.getSeedUserListId()==null) || 
             (this.seedUserListId!=null &&
              this.seedUserListId.equals(other.getSeedUserListId()))) &&
            ((this.seedUserListName==null && other.getSeedUserListName()==null) || 
             (this.seedUserListName!=null &&
              this.seedUserListName.equals(other.getSeedUserListName()))) &&
            ((this.seedUserListDescription==null && other.getSeedUserListDescription()==null) || 
             (this.seedUserListDescription!=null &&
              this.seedUserListDescription.equals(other.getSeedUserListDescription()))) &&
            ((this.seedUserListStatus==null && other.getSeedUserListStatus()==null) || 
             (this.seedUserListStatus!=null &&
              this.seedUserListStatus.equals(other.getSeedUserListStatus()))) &&
            ((this.seedListSize==null && other.getSeedListSize()==null) || 
             (this.seedListSize!=null &&
              this.seedListSize.equals(other.getSeedListSize())));
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
        if (getSeedUserListId() != null) {
            _hashCode += getSeedUserListId().hashCode();
        }
        if (getSeedUserListName() != null) {
            _hashCode += getSeedUserListName().hashCode();
        }
        if (getSeedUserListDescription() != null) {
            _hashCode += getSeedUserListDescription().hashCode();
        }
        if (getSeedUserListStatus() != null) {
            _hashCode += getSeedUserListStatus().hashCode();
        }
        if (getSeedListSize() != null) {
            _hashCode += getSeedListSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimilarUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "SimilarUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seedUserListId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "seedUserListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seedUserListName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "seedUserListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seedUserListDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "seedUserListDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seedUserListStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "seedUserListStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserListMembershipStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seedListSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "seedListSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
