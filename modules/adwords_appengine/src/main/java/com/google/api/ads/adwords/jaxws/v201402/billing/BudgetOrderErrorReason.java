
package com.google.api.ads.adwords.jaxws.v201402.billing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetOrderError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetOrderError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER_NOT_WHITELISTED_FOR_NEW_BILLING"/>
 *     &lt;enumeration value="BUDGET_APPROVAL_IN_PROGRESS"/>
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="INVALID_BILLING_ACCOUNT"/>
 *     &lt;enumeration value="GENERIC_BILLING_ERROR"/>
 *     &lt;enumeration value="INVALID_BILLING_ACCOUNT_ID_FORMAT"/>
 *     &lt;enumeration value="INVALID_BUDGET_DATE_RANGE"/>
 *     &lt;enumeration value="INCOMPATIBLE_CURRENCY"/>
 *     &lt;enumeration value="BUDGET_UPDATE_DENIED"/>
 *     &lt;enumeration value="BUDGET_ALREDY_STARTED"/>
 *     &lt;enumeration value="BUDGET_ALREADY_ENDED"/>
 *     &lt;enumeration value="INVALID_CONSTRAINT"/>
 *     &lt;enumeration value="INVALID_BID_TOO_LARGE"/>
 *     &lt;enumeration value="NO_SUCH_BUDGET_FOUND"/>
 *     &lt;enumeration value="INVALID_BUDGET_ALREADY_SPENT"/>
 *     &lt;enumeration value="INVALID_TIMEZONE_IN_DATE"/>
 *     &lt;enumeration value="ACCOUNT_BUDGET_ID_SET_IN_ADD"/>
 *     &lt;enumeration value="MORE_THAN_ONE_OPERATIONS"/>
 *     &lt;enumeration value="MCC_HIERARCHY_SIZE_TOO_LARGE"/>
 *     &lt;enumeration value="INVALID_MCC_HIERARCHY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetOrderError.Reason")
@XmlEnum
public enum BudgetOrderErrorReason {


    /**
     * 
     *                 The request contains a field that is only available if the manager account
     *                 is whitelisted for new billing backend.
     *               
     * 
     */
    CUSTOMER_NOT_WHITELISTED_FOR_NEW_BILLING,

    /**
     * 
     *                 Existing pending request is being approved.
     *               
     * 
     */
    BUDGET_APPROVAL_IN_PROGRESS,

    /**
     * 
     *                 A server backend was not available.
     *               
     * 
     */
    SERVICE_UNAVAILABLE,

    /**
     * 
     *                 The billing account was invalid.
     *               
     * 
     */
    INVALID_BILLING_ACCOUNT,

    /**
     * 
     *                 Unspecified billing service error.
     *               
     * 
     */
    GENERIC_BILLING_ERROR,

    /**
     * 
     *                 The billing account ID format was invalid.
     *               
     * 
     */
    INVALID_BILLING_ACCOUNT_ID_FORMAT,

    /**
     * 
     *                 Budget date range was invalid.
     *               
     * 
     */
    INVALID_BUDGET_DATE_RANGE,

    /**
     * 
     *                 Customer's currency is different from what is in the billing system.
     *               
     * 
     */
    INCOMPATIBLE_CURRENCY,

    /**
     * 
     *                 User does not have permission to update this budget.
     *               
     * 
     */
    BUDGET_UPDATE_DENIED,

    /**
     * 
     *                 User attempted to cancel a started budget.
     *               
     * 
     */
    BUDGET_ALREDY_STARTED,

    /**
     * 
     *                 User attempted to change an ended budget.
     *               
     * 
     */
    BUDGET_ALREADY_ENDED,

    /**
     * 
     *                 Invalid amount, start date or end date specified.
     *               
     * 
     */
    INVALID_CONSTRAINT,

    /**
     * 
     *                 The bid is too high.
     *               
     * 
     */
    INVALID_BID_TOO_LARGE,

    /**
     * 
     *                 Budget was not found.
     *               
     * 
     */
    NO_SUCH_BUDGET_FOUND,

    /**
     * 
     *                 The budget cannot be lowered below the amount which has already been spent.
     *               
     * 
     */
    INVALID_BUDGET_ALREADY_SPENT,

    /**
     * 
     *                 Time zone from user input is different from user's account time zone.
     *               
     * 
     */
    INVALID_TIMEZONE_IN_DATE,

    /**
     * 
     *                 The BudgetOrder's ID was set in an add operation.
     *               
     * 
     */
    ACCOUNT_BUDGET_ID_SET_IN_ADD,

    /**
     * 
     *                 We don't support more than one operation per mutate call.
     *               
     * 
     */
    MORE_THAN_ONE_OPERATIONS,

    /**
     * 
     *                 MCC Hierarchy size is too large.
     *               
     * 
     */
    MCC_HIERARCHY_SIZE_TOO_LARGE,

    /**
     * 
     *                 MCC Hierarchy not found.
     *               
     * 
     */
    INVALID_MCC_HIERARCHY,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BudgetOrderErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
