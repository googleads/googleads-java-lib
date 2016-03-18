
package com.google.api.ads.adwords.jaxws.v201601.rm;

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
 *     &lt;enumeration value="INVALID_USER_LIST_LOGICAL_RULE_OPERAND"/>
 *     &lt;enumeration value="NAME_ALREADY_USED"/>
 *     &lt;enumeration value="NEW_CONVERSION_TYPE_NAME_REQUIRED"/>
 *     &lt;enumeration value="OWNERSHIP_REQUIRED_FOR_SET"/>
 *     &lt;enumeration value="REMOVE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="USER_LIST_MUTATE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_RULE"/>
 *     &lt;enumeration value="INVALID_DATE_RANGE"/>
 *     &lt;enumeration value="OPT_OUT_LINK_IS_NOT_VALID"/>
 *     &lt;enumeration value="MAX_NUM_RULEBASED_USERLISTS"/>
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
     *                 An opt out link should be a valid url.
     *               
     * 
     */
    OPT_OUT_LINK_IS_NOT_VALID,

    /**
     * 
     *                 Maximum number of rulebased user lists a customer can have.
     *               
     * 
     */
    MAX_NUM_RULEBASED_USERLISTS,

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
