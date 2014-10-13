/**
 * UserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.rm;


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
    private com.google.api.ads.adwords.axis.v201402.rm.UserListMembershipStatus status;

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
    private com.google.api.ads.adwords.axis.v201402.rm.AccessReason accessReason;

    /* Indicates if this share is still active. When a UserList is
     * shared with the user
     *                 this field is set to Active. Later the userList owner
     * can decide to revoke the
     *                 share and make it Inactive. The default value of this
     * field is set to Active.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccountUserListStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201402.rm.AccountUserListStatus accountUserListStatus;

    /* Number of days a user's cookie stays on your list since its
     * most recent addition to the list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MembershipLifeSpan".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 540, inclusive.</span> */
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
    private com.google.api.ads.adwords.axis.v201402.rm.SizeRange sizeRange;

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
    private com.google.api.ads.adwords.axis.v201402.rm.SizeRange sizeRangeForSearch;

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
           com.google.api.ads.adwords.axis.v201402.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201402.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201402.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201402.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201402.rm.SizeRange sizeRangeForSearch,
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
           this.userListType = userListType;
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
    public com.google.api.ads.adwords.axis.v201402.rm.UserListMembershipStatus getStatus() {
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
    public void setStatus(com.google.api.ads.adwords.axis.v201402.rm.UserListMembershipStatus status) {
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
    public com.google.api.ads.adwords.axis.v201402.rm.AccessReason getAccessReason() {
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
    public void setAccessReason(com.google.api.ads.adwords.axis.v201402.rm.AccessReason accessReason) {
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
    public com.google.api.ads.adwords.axis.v201402.rm.AccountUserListStatus getAccountUserListStatus() {
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
    public void setAccountUserListStatus(com.google.api.ads.adwords.axis.v201402.rm.AccountUserListStatus accountUserListStatus) {
        this.accountUserListStatus = accountUserListStatus;
    }


    /**
     * Gets the membershipLifeSpan value for this UserList.
     * 
     * @return membershipLifeSpan   * Number of days a user's cookie stays on your list since its
     * most recent addition to the list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MembershipLifeSpan".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 540, inclusive.</span>
     */
    public java.lang.Long getMembershipLifeSpan() {
        return membershipLifeSpan;
    }


    /**
     * Sets the membershipLifeSpan value for this UserList.
     * 
     * @param membershipLifeSpan   * Number of days a user's cookie stays on your list since its
     * most recent addition to the list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MembershipLifeSpan".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 540, inclusive.</span>
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
    public com.google.api.ads.adwords.axis.v201402.rm.SizeRange getSizeRange() {
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
    public void setSizeRange(com.google.api.ads.adwords.axis.v201402.rm.SizeRange sizeRange) {
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
    public com.google.api.ads.adwords.axis.v201402.rm.SizeRange getSizeRangeForSearch() {
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
    public void setSizeRangeForSearch(com.google.api.ads.adwords.axis.v201402.rm.SizeRange sizeRangeForSearch) {
        this.sizeRangeForSearch = sizeRangeForSearch;
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "UserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "isReadOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "UserListMembershipStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "integrationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "accessReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "AccessReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountUserListStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "accountUserListStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "AccountUserListStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membershipLifeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "membershipLifeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "sizeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "SizeRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeForSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "sizeForSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeRangeForSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "sizeRangeForSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "SizeRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201402", "UserList.Type"));
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
