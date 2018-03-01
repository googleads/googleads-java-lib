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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserListError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="CONVERSION_TYPE_ID_REQUIRED"/>
 *     &lt;enumeration value="DUPLICATE_CONVERSION_TYPES"/>
 *     &lt;enumeration value="INVALID_CONVERSION_TYPE"/>
 *     &lt;enumeration value="INVALID_DESCRIPTION"/>
 *     &lt;enumeration value="INVALID_NAME"/>
 *     &lt;enumeration value="INVALID_TYPE"/>
 *     &lt;enumeration value="CAN_NOT_ADD_SIMILAR_LIST_AS_LOGICAL_LIST_NONE_OPERAND"/>
 *     &lt;enumeration value="CAN_NOT_ADD_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND"/>
 *     &lt;enumeration value="INVALID_USER_LIST_LOGICAL_RULE_OPERAND"/>
 *     &lt;enumeration value="NAME_ALREADY_USED"/>
 *     &lt;enumeration value="NEW_CONVERSION_TYPE_NAME_REQUIRED"/>
 *     &lt;enumeration value="CONVERSION_TYPE_NAME_ALREADY_USED"/>
 *     &lt;enumeration value="OWNERSHIP_REQUIRED_FOR_SET"/>
 *     &lt;enumeration value="REMOVE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="USER_LIST_MUTATE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_RULE"/>
 *     &lt;enumeration value="INVALID_DATE_RANGE"/>
 *     &lt;enumeration value="CAN_NOT_MUTATE_SENSITIVE_USERLIST"/>
 *     &lt;enumeration value="MAX_NUM_RULEBASED_USERLISTS"/>
 *     &lt;enumeration value="CANNOT_MODIFY_BILLABLE_RECORD_COUNT"/>
 *     &lt;enumeration value="APP_ID_NOT_ALLOWED"/>
 *     &lt;enumeration value="APP_ID_NOT_SET"/>
 *     &lt;enumeration value="USER_LIST_SERVICE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserListError.Reason")
@XmlEnum
public enum UserListErrorReason {


    /**
     * 
     *                 Creating and updating external remarketing user lists is not supported.
     *               
     * 
     */
    EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED,

    /**
     * 
     *                 Concrete type of user list (logical v.s. remarketing) is required for
     *                 ADD and SET operations.
     *               
     * 
     */
    CONCRETE_TYPE_REQUIRED,

    /**
     * 
     *                 Adding/updating user list conversion types requires specifying the conversion
     *                 type id.
     *               
     * 
     */
    CONVERSION_TYPE_ID_REQUIRED,

    /**
     * 
     *                 Remarketing user list cannot have duplicate conversion types.
     *               
     * 
     */
    DUPLICATE_CONVERSION_TYPES,

    /**
     * 
     *                 Conversion type is invalid/unknown.
     *               
     * 
     */
    INVALID_CONVERSION_TYPE,

    /**
     * 
     *                 User list description is empty or invalid
     *               
     * 
     */
    INVALID_DESCRIPTION,

    /**
     * 
     *                 User list name is empty or invalid.
     *               
     * 
     */
    INVALID_NAME,

    /**
     * 
     *                 Type of the UserList does not match.
     *               
     * 
     */
    INVALID_TYPE,

    /**
     * 
     *                 Can't use similar list in logical user list rule when operator is NONE.
     *               
     * 
     */
    CAN_NOT_ADD_SIMILAR_LIST_AS_LOGICAL_LIST_NONE_OPERAND,

    /**
     * 
     *                 Embedded logical user lists are not allowed.
     *               
     * 
     */
    CAN_NOT_ADD_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND,

    /**
     * 
     *                 User list rule operand is invalid.
     *               
     * 
     */
    INVALID_USER_LIST_LOGICAL_RULE_OPERAND,

    /**
     * 
     *                 Name is already being used for another user list for the account.
     *               
     * 
     */
    NAME_ALREADY_USED,

    /**
     * 
     *                 Name is required when creating a new conversion type.
     *               
     * 
     */
    NEW_CONVERSION_TYPE_NAME_REQUIRED,

    /**
     * 
     *                 The given conversion type name has been used.
     *               
     * 
     */
    CONVERSION_TYPE_NAME_ALREADY_USED,

    /**
     * 
     *                 Only an owner account may edit a user list.
     *               
     * 
     */
    OWNERSHIP_REQUIRED_FOR_SET,

    /**
     * 
     *                 Removing user lists is not supported.
     *               
     * 
     */
    REMOVE_NOT_SUPPORTED,

    /**
     * 
     *                 The user list of the type is not mutable
     *               
     * 
     */
    USER_LIST_MUTATE_NOT_SUPPORTED,

    /**
     * 
     *                 Rule is invalid.
     *               
     * 
     */
    INVALID_RULE,

    /**
     * 
     *                 The specified date range is empty.
     *               
     * 
     */
    INVALID_DATE_RANGE,

    /**
     * 
     *                 A userlist which is privacy sensitive or legal rejected cannot be mutated by external users.
     *               
     * 
     */
    CAN_NOT_MUTATE_SENSITIVE_USERLIST,

    /**
     * 
     *                 Maximum number of rulebased user lists a customer can have.
     *               
     * 
     */
    MAX_NUM_RULEBASED_USERLISTS,

    /**
     * 
     *                 BasicUserList's billable record field cannot be modified once it is set.
     *               
     * 
     */
    CANNOT_MODIFY_BILLABLE_RECORD_COUNT,

    /**
     * 
     *                 appId field can only be set when uploadKeyType is MOBILE_ADVERTISING_ID.
     *               
     * 
     */
    APP_ID_NOT_ALLOWED,

    /**
     * 
     *                 appId field must be set when uploadKeyType is MOBILE_ADVERTISING_ID.
     *               
     * 
     */
    APP_ID_NOT_SET,

    /**
     * 
     *                 Default generic error.
     *               
     * 
     */
    USER_LIST_SERVICE_ERROR;

    public String value() {
        return name();
    }

    public static UserListErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
