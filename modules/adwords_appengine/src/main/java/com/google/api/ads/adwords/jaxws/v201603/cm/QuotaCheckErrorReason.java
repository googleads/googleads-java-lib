
package com.google.api.ads.adwords.jaxws.v201603.cm;

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
 *     &lt;enumeration value="DEVELOPER_TOKEN_NOT_APPROVED"/>
 *     &lt;enumeration value="TERMS_AND_CONDITIONS_NOT_SIGNED"/>
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
     *                 Developer token is not approved for production access, and the customer
     *                 is attempting to access a production account.
     *               
     * 
     */
    DEVELOPER_TOKEN_NOT_APPROVED,

    /**
     * 
     *                 Terms and conditions are not signed.
     *               
     * 
     */
    TERMS_AND_CONDITIONS_NOT_SIGNED,

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
