
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaCheckError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotaCheckError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_TOKEN_HEADER"/>
 *     &lt;enumeration value="ACCOUNT_DELINQUENT"/>
 *     &lt;enumeration value="ACCOUNT_INACCESSIBLE"/>
 *     &lt;enumeration value="ACCOUNT_INACTIVE"/>
 *     &lt;enumeration value="INCOMPLETE_SIGNUP"/>
 *     &lt;enumeration value="INCOMPLETE_SIGNUP_LATEST_ADWORDS_API_TNC_NOT_AGREED"/>
 *     &lt;enumeration value="INCOMPLETE_SIGNUP_NO_BILLING_INFO"/>
 *     &lt;enumeration value="INCOMPLETE_SIGNUP_USER_INFO_MISSING"/>
 *     &lt;enumeration value="INCOMPLETE_SIGNUP_USER_INFO_PENDING"/>
 *     &lt;enumeration value="INCOMPLETE_SIGNUP_USER_INFO_REJECTED"/>
 *     &lt;enumeration value="MONTHLY_BUDGET_REACHED"/>
 *     &lt;enumeration value="QUOTA_EXCEEDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotaCheckError.Reason")
@XmlEnum
public enum QuotaCheckErrorReason {


    /**
     * 
     *                 Customer passed in an invalid token in the header.
     *               
     * 
     */
    INVALID_TOKEN_HEADER,

    /**
     * 
     *                 Customer is marked delinquent.
     *               
     * 
     */
    ACCOUNT_DELINQUENT,

    /**
     * 
     *                 Customer is a fraudulent.
     *               
     * 
     */
    ACCOUNT_INACCESSIBLE,

    /**
     * 
     *                 Inactive Account.
     *               
     * 
     */
    ACCOUNT_INACTIVE,

    /**
     * 
     *                 Signup not complete
     *               
     * 
     */
    INCOMPLETE_SIGNUP,

    /**
     * 
     *                 Latest AdWords API T&C not agreed.
     *               
     * 
     */
    INCOMPLETE_SIGNUP_LATEST_ADWORDS_API_TNC_NOT_AGREED,

    /**
     * 
     *                 No Billing Info.
     *               
     * 
     */
    INCOMPLETE_SIGNUP_NO_BILLING_INFO,

    /**
     * 
     *                 User Info missing.
     *               
     * 
     */
    INCOMPLETE_SIGNUP_USER_INFO_MISSING,

    /**
     * 
     *                 User Info pending.
     *               
     * 
     */
    INCOMPLETE_SIGNUP_USER_INFO_PENDING,

    /**
     * 
     *                 User Info rejected.
     *               
     * 
     */
    INCOMPLETE_SIGNUP_USER_INFO_REJECTED,

    /**
     * 
     *                 Monthly budget quota reached.
     *               
     * 
     */
    MONTHLY_BUDGET_REACHED,

    /**
     * 
     *                 Monthly budget quota exceeded.
     *               
     * 
     */
    QUOTA_EXCEEDED;

    public String value() {
        return name();
    }

    public static QuotaCheckErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
