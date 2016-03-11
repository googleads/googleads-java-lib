
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNABLE_TO_AUTHORIZE"/>
 *     &lt;enumeration value="NO_ADWORDS_ACCOUNT_FOR_CUSTOMER"/>
 *     &lt;enumeration value="USER_PERMISSION_DENIED"/>
 *     &lt;enumeration value="EFFECTIVE_USER_PERMISSION_DENIED"/>
 *     &lt;enumeration value="USER_HAS_READONLY_PERMISSION"/>
 *     &lt;enumeration value="NO_CUSTOMER_FOUND"/>
 *     &lt;enumeration value="SERVICE_ACCESS_DENIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationError.Reason")
@XmlEnum
public enum AuthorizationErrorReason {


    /**
     * 
     *                 Could not complete authorization due to an internal problem.
     *               
     * 
     */
    UNABLE_TO_AUTHORIZE,

    /**
     * 
     *                 Customer has no AdWords account.
     *               
     * 
     */
    NO_ADWORDS_ACCOUNT_FOR_CUSTOMER,

    /**
     * 
     *                 User doesn't have permission to access customer.
     *               
     * 
     */
    USER_PERMISSION_DENIED,

    /**
     * 
     *                 Effective user doesn't have permission to access this customer.
     *               
     * 
     */
    EFFECTIVE_USER_PERMISSION_DENIED,

    /**
     * 
     *                 User has read-only permission cannot mutate.
     *               
     * 
     */
    USER_HAS_READONLY_PERMISSION,

    /**
     * 
     *                 No customer found.
     *               
     * 
     */
    NO_CUSTOMER_FOUND,

    /**
     * 
     *                 Developer doesn't have permission to access service.
     *               
     * 
     */
    SERVICE_ACCESS_DENIED;

    public String value() {
        return name();
    }

    public static AuthorizationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
