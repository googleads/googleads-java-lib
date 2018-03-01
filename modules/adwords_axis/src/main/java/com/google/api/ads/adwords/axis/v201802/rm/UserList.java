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
 * UserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Represents a UserList object that is sent over the wire.
 *             This is a list of users an account may target.
 */
public class UserList  implements java.io.Serializable {
    /* Id of this user list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* A flag that indicates if a user may edit a list. Depends on
     * the list ownership
     *                 and list type. For example, external remarketing user
     * lists are not editable.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsReadOnly".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean isReadOnly;

    /* Name of this user list. Depending on its AccessReason, the
     * user list name
     *                 may not be unique (e.g. if {@code AccessReason=SHARED}).
     * <span class="constraint Selectable">This field can be selected using
     * the value "Name".</span><span class="constraint Filterable">This field
     * can be filtered on.</span> */
    private java.lang.String name;

    /* Description of this user list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Description".</span> */
    private java.lang.String description;

    /* Membership status of this user list. Indicates whether a user
     * list is open
     *                 or active. Only open user lists can accumulate more
     * users and can be targeted to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus status;

    /* An Id from external system. It is used by user list sellers
     * to correlate ids on their
     *                 systems.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IntegrationCode".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String integrationCode;

    /* Indicates the reason this account has been granted access to
     * the list. The reason can be
     *                 Shared, Owned, Licensed or Subscribed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccessReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.AccessReason accessReason;

    /* Indicates if this share is still active. When a UserList is
     * shared with the user
     *                 this field is set to Active. Later the userList owner
     * can decide to revoke the
     *                 share and make it Inactive. The default value of this
     * field is set to Active.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccountUserListStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.AccountUserListStatus accountUserListStatus;

    /* Number of days a user's cookie stays on your list since its
     * most recent addition to the list.
     *                 This field must be between 0 and 540 inclusive. However,
     * for CRM based userlists, this field
     *                 can be set to 10000 which means no expiration.
     *                 
     *                 <p>It'll be ignored for {@link LogicalUserList}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MembershipLifeSpan".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long membershipLifeSpan;

    /* Estimated number of users in this user list, on the Google
     * Display Network.
     *                 This value is null if the number of users has not
     * yet been determined.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Size".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long size;

    /* Size range in terms of number of users of the UserList.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeRange".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRange;

    /* Estimated number of users in this user list in the google.com
     * domain.
     *                 These are the users available for targeting in search
     * campaigns.
     *                 This value is null if the number of users has not
     * yet been determined.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeForSearch".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long sizeForSearch;

    /* Size range in terms of number of users of the UserList, for
     * Search ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeRangeForSearch".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRangeForSearch;

    /* Type of this list: remarketing/logical/external remarketing.
     * <span class="constraint Selectable">This field can be selected using
     * the value "ListType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.UserListType listType;

    /* A flag that indicates this user list is eligible for Google
     * Search Network.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsEligibleForSearch".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean isEligibleForSearch;

    /* A flag that indicates this user list is eligible for Display
     * Network.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsEligibleForDisplay".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean isEligibleForDisplay;

    /* Indicating the reason why this user list membership status
     * is closed. It is only populated on
     *                 lists that were automatically closed due to inactivity,
     * and will be cleared once the list
     *                 membership status becomes open.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ClosingReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.UserListClosingReason closingReason;

    /* Indicates that this instance is a subtype of UserList.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String userListType;

    public UserList() {
    }

    public UserList(
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
           java.lang.String userListType) {
           this.id = id;
           this.isReadOnly = isReadOnly;
           this.name = name;
           this.description = description;
           this.status = status;
           this.integrationCode = integrationCode;
           this.accessReason = accessReason;
           this.accountUserListStatus = accountUserListStatus;
           this.membershipLifeSpan = membershipLifeSpan;
           this.size = size;
           this.sizeRange = sizeRange;
           this.sizeForSearch = sizeForSearch;
           this.sizeRangeForSearch = sizeRangeForSearch;
           this.listType = listType;
           this.isEligibleForSearch = isEligibleForSearch;
           this.isEligibleForDisplay = isEligibleForDisplay;
           this.closingReason = closingReason;
           this.userListType = userListType;
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
            .add("size", getSize())
            .add("sizeForSearch", getSizeForSearch())
            .add("sizeRange", getSizeRange())
            .add("sizeRangeForSearch", getSizeRangeForSearch())
            .add("status", getStatus())
            .add("userListType", getUserListType())
            .toString();
    }

    /**
     * Gets the id value for this UserList.
     * 
     * @return id   * Id of this user list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this UserList.
     * 
     * @param id   * Id of this user list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isReadOnly value for this UserList.
     * 
     * @return isReadOnly   * A flag that indicates if a user may edit a list. Depends on
     * the list ownership
     *                 and list type. For example, external remarketing user
     * lists are not editable.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsReadOnly".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsReadOnly() {
        return isReadOnly;
    }


    /**
     * Sets the isReadOnly value for this UserList.
     * 
     * @param isReadOnly   * A flag that indicates if a user may edit a list. Depends on
     * the list ownership
     *                 and list type. For example, external remarketing user
     * lists are not editable.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsReadOnly".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setIsReadOnly(java.lang.Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }


    /**
     * Gets the name value for this UserList.
     * 
     * @return name   * Name of this user list. Depending on its AccessReason, the
     * user list name
     *                 may not be unique (e.g. if {@code AccessReason=SHARED}).
     * <span class="constraint Selectable">This field can be selected using
     * the value "Name".</span><span class="constraint Filterable">This field
     * can be filtered on.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserList.
     * 
     * @param name   * Name of this user list. Depending on its AccessReason, the
     * user list name
     *                 may not be unique (e.g. if {@code AccessReason=SHARED}).
     * <span class="constraint Selectable">This field can be selected using
     * the value "Name".</span><span class="constraint Filterable">This field
     * can be filtered on.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this UserList.
     * 
     * @return description   * Description of this user list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Description".</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserList.
     * 
     * @param description   * Description of this user list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Description".</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this UserList.
     * 
     * @return status   * Membership status of this user list. Indicates whether a user
     * list is open
     *                 or active. Only open user lists can accumulate more
     * users and can be targeted to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserList.
     * 
     * @param status   * Membership status of this user list. Indicates whether a user
     * list is open
     *                 or active. Only open user lists can accumulate more
     * users and can be targeted to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus status) {
        this.status = status;
    }


    /**
     * Gets the integrationCode value for this UserList.
     * 
     * @return integrationCode   * An Id from external system. It is used by user list sellers
     * to correlate ids on their
     *                 systems.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IntegrationCode".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getIntegrationCode() {
        return integrationCode;
    }


    /**
     * Sets the integrationCode value for this UserList.
     * 
     * @param integrationCode   * An Id from external system. It is used by user list sellers
     * to correlate ids on their
     *                 systems.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IntegrationCode".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setIntegrationCode(java.lang.String integrationCode) {
        this.integrationCode = integrationCode;
    }


    /**
     * Gets the accessReason value for this UserList.
     * 
     * @return accessReason   * Indicates the reason this account has been granted access to
     * the list. The reason can be
     *                 Shared, Owned, Licensed or Subscribed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccessReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.AccessReason getAccessReason() {
        return accessReason;
    }


    /**
     * Sets the accessReason value for this UserList.
     * 
     * @param accessReason   * Indicates the reason this account has been granted access to
     * the list. The reason can be
     *                 Shared, Owned, Licensed or Subscribed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccessReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAccessReason(com.google.api.ads.adwords.axis.v201802.rm.AccessReason accessReason) {
        this.accessReason = accessReason;
    }


    /**
     * Gets the accountUserListStatus value for this UserList.
     * 
     * @return accountUserListStatus   * Indicates if this share is still active. When a UserList is
     * shared with the user
     *                 this field is set to Active. Later the userList owner
     * can decide to revoke the
     *                 share and make it Inactive. The default value of this
     * field is set to Active.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccountUserListStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.AccountUserListStatus getAccountUserListStatus() {
        return accountUserListStatus;
    }


    /**
     * Sets the accountUserListStatus value for this UserList.
     * 
     * @param accountUserListStatus   * Indicates if this share is still active. When a UserList is
     * shared with the user
     *                 this field is set to Active. Later the userList owner
     * can decide to revoke the
     *                 share and make it Inactive. The default value of this
     * field is set to Active.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccountUserListStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAccountUserListStatus(com.google.api.ads.adwords.axis.v201802.rm.AccountUserListStatus accountUserListStatus) {
        this.accountUserListStatus = accountUserListStatus;
    }


    /**
     * Gets the membershipLifeSpan value for this UserList.
     * 
     * @return membershipLifeSpan   * Number of days a user's cookie stays on your list since its
     * most recent addition to the list.
     *                 This field must be between 0 and 540 inclusive. However,
     * for CRM based userlists, this field
     *                 can be set to 10000 which means no expiration.
     *                 
     *                 <p>It'll be ignored for {@link LogicalUserList}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MembershipLifeSpan".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getMembershipLifeSpan() {
        return membershipLifeSpan;
    }


    /**
     * Sets the membershipLifeSpan value for this UserList.
     * 
     * @param membershipLifeSpan   * Number of days a user's cookie stays on your list since its
     * most recent addition to the list.
     *                 This field must be between 0 and 540 inclusive. However,
     * for CRM based userlists, this field
     *                 can be set to 10000 which means no expiration.
     *                 
     *                 <p>It'll be ignored for {@link LogicalUserList}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MembershipLifeSpan".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setMembershipLifeSpan(java.lang.Long membershipLifeSpan) {
        this.membershipLifeSpan = membershipLifeSpan;
    }


    /**
     * Gets the size value for this UserList.
     * 
     * @return size   * Estimated number of users in this user list, on the Google
     * Display Network.
     *                 This value is null if the number of users has not
     * yet been determined.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Size".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getSize() {
        return size;
    }


    /**
     * Sets the size value for this UserList.
     * 
     * @param size   * Estimated number of users in this user list, on the Google
     * Display Network.
     *                 This value is null if the number of users has not
     * yet been determined.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Size".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }


    /**
     * Gets the sizeRange value for this UserList.
     * 
     * @return sizeRange   * Size range in terms of number of users of the UserList.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeRange".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.SizeRange getSizeRange() {
        return sizeRange;
    }


    /**
     * Sets the sizeRange value for this UserList.
     * 
     * @param sizeRange   * Size range in terms of number of users of the UserList.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeRange".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSizeRange(com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRange) {
        this.sizeRange = sizeRange;
    }


    /**
     * Gets the sizeForSearch value for this UserList.
     * 
     * @return sizeForSearch   * Estimated number of users in this user list in the google.com
     * domain.
     *                 These are the users available for targeting in search
     * campaigns.
     *                 This value is null if the number of users has not
     * yet been determined.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeForSearch".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getSizeForSearch() {
        return sizeForSearch;
    }


    /**
     * Sets the sizeForSearch value for this UserList.
     * 
     * @param sizeForSearch   * Estimated number of users in this user list in the google.com
     * domain.
     *                 These are the users available for targeting in search
     * campaigns.
     *                 This value is null if the number of users has not
     * yet been determined.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeForSearch".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSizeForSearch(java.lang.Long sizeForSearch) {
        this.sizeForSearch = sizeForSearch;
    }


    /**
     * Gets the sizeRangeForSearch value for this UserList.
     * 
     * @return sizeRangeForSearch   * Size range in terms of number of users of the UserList, for
     * Search ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeRangeForSearch".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.SizeRange getSizeRangeForSearch() {
        return sizeRangeForSearch;
    }


    /**
     * Sets the sizeRangeForSearch value for this UserList.
     * 
     * @param sizeRangeForSearch   * Size range in terms of number of users of the UserList, for
     * Search ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SizeRangeForSearch".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSizeRangeForSearch(com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRangeForSearch) {
        this.sizeRangeForSearch = sizeRangeForSearch;
    }


    /**
     * Gets the listType value for this UserList.
     * 
     * @return listType   * Type of this list: remarketing/logical/external remarketing.
     * <span class="constraint Selectable">This field can be selected using
     * the value "ListType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListType getListType() {
        return listType;
    }


    /**
     * Sets the listType value for this UserList.
     * 
     * @param listType   * Type of this list: remarketing/logical/external remarketing.
     * <span class="constraint Selectable">This field can be selected using
     * the value "ListType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setListType(com.google.api.ads.adwords.axis.v201802.rm.UserListType listType) {
        this.listType = listType;
    }


    /**
     * Gets the isEligibleForSearch value for this UserList.
     * 
     * @return isEligibleForSearch   * A flag that indicates this user list is eligible for Google
     * Search Network.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsEligibleForSearch".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getIsEligibleForSearch() {
        return isEligibleForSearch;
    }


    /**
     * Sets the isEligibleForSearch value for this UserList.
     * 
     * @param isEligibleForSearch   * A flag that indicates this user list is eligible for Google
     * Search Network.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsEligibleForSearch".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setIsEligibleForSearch(java.lang.Boolean isEligibleForSearch) {
        this.isEligibleForSearch = isEligibleForSearch;
    }


    /**
     * Gets the isEligibleForDisplay value for this UserList.
     * 
     * @return isEligibleForDisplay   * A flag that indicates this user list is eligible for Display
     * Network.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsEligibleForDisplay".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsEligibleForDisplay() {
        return isEligibleForDisplay;
    }


    /**
     * Sets the isEligibleForDisplay value for this UserList.
     * 
     * @param isEligibleForDisplay   * A flag that indicates this user list is eligible for Display
     * Network.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsEligibleForDisplay".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setIsEligibleForDisplay(java.lang.Boolean isEligibleForDisplay) {
        this.isEligibleForDisplay = isEligibleForDisplay;
    }


    /**
     * Gets the closingReason value for this UserList.
     * 
     * @return closingReason   * Indicating the reason why this user list membership status
     * is closed. It is only populated on
     *                 lists that were automatically closed due to inactivity,
     * and will be cleared once the list
     *                 membership status becomes open.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ClosingReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListClosingReason getClosingReason() {
        return closingReason;
    }


    /**
     * Sets the closingReason value for this UserList.
     * 
     * @param closingReason   * Indicating the reason why this user list membership status
     * is closed. It is only populated on
     *                 lists that were automatically closed due to inactivity,
     * and will be cleared once the list
     *                 membership status becomes open.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ClosingReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setClosingReason(com.google.api.ads.adwords.axis.v201802.rm.UserListClosingReason closingReason) {
        this.closingReason = closingReason;
    }


    /**
     * Gets the userListType value for this UserList.
     * 
     * @return userListType   * Indicates that this instance is a subtype of UserList.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getUserListType() {
        return userListType;
    }


    /**
     * Sets the userListType value for this UserList.
     * 
     * @param userListType   * Indicates that this instance is a subtype of UserList.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setUserListType(java.lang.String userListType) {
        this.userListType = userListType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserList)) return false;
        UserList other = (UserList) obj;
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
            ((this.isReadOnly==null && other.getIsReadOnly()==null) || 
             (this.isReadOnly!=null &&
              this.isReadOnly.equals(other.getIsReadOnly()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.integrationCode==null && other.getIntegrationCode()==null) || 
             (this.integrationCode!=null &&
              this.integrationCode.equals(other.getIntegrationCode()))) &&
            ((this.accessReason==null && other.getAccessReason()==null) || 
             (this.accessReason!=null &&
              this.accessReason.equals(other.getAccessReason()))) &&
            ((this.accountUserListStatus==null && other.getAccountUserListStatus()==null) || 
             (this.accountUserListStatus!=null &&
              this.accountUserListStatus.equals(other.getAccountUserListStatus()))) &&
            ((this.membershipLifeSpan==null && other.getMembershipLifeSpan()==null) || 
             (this.membershipLifeSpan!=null &&
              this.membershipLifeSpan.equals(other.getMembershipLifeSpan()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.sizeRange==null && other.getSizeRange()==null) || 
             (this.sizeRange!=null &&
              this.sizeRange.equals(other.getSizeRange()))) &&
            ((this.sizeForSearch==null && other.getSizeForSearch()==null) || 
             (this.sizeForSearch!=null &&
              this.sizeForSearch.equals(other.getSizeForSearch()))) &&
            ((this.sizeRangeForSearch==null && other.getSizeRangeForSearch()==null) || 
             (this.sizeRangeForSearch!=null &&
              this.sizeRangeForSearch.equals(other.getSizeRangeForSearch()))) &&
            ((this.listType==null && other.getListType()==null) || 
             (this.listType!=null &&
              this.listType.equals(other.getListType()))) &&
            ((this.isEligibleForSearch==null && other.getIsEligibleForSearch()==null) || 
             (this.isEligibleForSearch!=null &&
              this.isEligibleForSearch.equals(other.getIsEligibleForSearch()))) &&
            ((this.isEligibleForDisplay==null && other.getIsEligibleForDisplay()==null) || 
             (this.isEligibleForDisplay!=null &&
              this.isEligibleForDisplay.equals(other.getIsEligibleForDisplay()))) &&
            ((this.closingReason==null && other.getClosingReason()==null) || 
             (this.closingReason!=null &&
              this.closingReason.equals(other.getClosingReason()))) &&
            ((this.userListType==null && other.getUserListType()==null) || 
             (this.userListType!=null &&
              this.userListType.equals(other.getUserListType())));
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
        if (getIsReadOnly() != null) {
            _hashCode += getIsReadOnly().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIntegrationCode() != null) {
            _hashCode += getIntegrationCode().hashCode();
        }
        if (getAccessReason() != null) {
            _hashCode += getAccessReason().hashCode();
        }
        if (getAccountUserListStatus() != null) {
            _hashCode += getAccountUserListStatus().hashCode();
        }
        if (getMembershipLifeSpan() != null) {
            _hashCode += getMembershipLifeSpan().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getSizeRange() != null) {
            _hashCode += getSizeRange().hashCode();
        }
        if (getSizeForSearch() != null) {
            _hashCode += getSizeForSearch().hashCode();
        }
        if (getSizeRangeForSearch() != null) {
            _hashCode += getSizeRangeForSearch().hashCode();
        }
        if (getListType() != null) {
            _hashCode += getListType().hashCode();
        }
        if (getIsEligibleForSearch() != null) {
            _hashCode += getIsEligibleForSearch().hashCode();
        }
        if (getIsEligibleForDisplay() != null) {
            _hashCode += getIsEligibleForDisplay().hashCode();
        }
        if (getClosingReason() != null) {
            _hashCode += getClosingReason().hashCode();
        }
        if (getUserListType() != null) {
            _hashCode += getUserListType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "isReadOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserListMembershipStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "integrationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "accessReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "AccessReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountUserListStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "accountUserListStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "AccountUserListStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membershipLifeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "membershipLifeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "sizeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "SizeRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeForSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "sizeForSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeRangeForSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "sizeRangeForSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "SizeRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "listType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEligibleForSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "isEligibleForSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEligibleForDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "isEligibleForDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "closingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserListClosingReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserList.Type"));
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
