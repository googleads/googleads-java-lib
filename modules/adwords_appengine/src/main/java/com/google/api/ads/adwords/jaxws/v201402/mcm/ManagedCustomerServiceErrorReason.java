
package com.google.api.ads.adwords.jaxws.v201402.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedCustomerServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedCustomerServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NOT_AUTHORIZED"/>
 *     &lt;enumeration value="INVALID_SELECTOR"/>
 *     &lt;enumeration value="INVALID_TIMEZONE"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="INVALID_DESCRIPTIVE_NAME"/>
 *     &lt;enumeration value="ADD_CUSTOMER_FAILURE"/>
 *     &lt;enumeration value="SAVE_CUSTOMERS_FAILURE"/>
 *     &lt;enumeration value="TEST_ACCOUNT_LINK_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManagedCustomerServiceError.Reason")
@XmlEnum
public enum ManagedCustomerServiceErrorReason {


    /**
     * 
     *                 Unknown.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The user is not authorized to perform the action
     *               
     * 
     */
    NOT_AUTHORIZED,

    /**
     * 
     *                 Invalid selector
     *               
     * 
     */
    INVALID_SELECTOR,

    /**
     * 
     *                 Can't process the passed in timezone.
     *               
     * 
     */
    INVALID_TIMEZONE,

    /**
     * 
     *                 Can't process the passed in currency code.
     *               
     * 
     */
    INVALID_CURRENCY,

    /**
     * 
     *                 Can't process the passed in descriptive name.
     *               
     * 
     */
    INVALID_DESCRIPTIVE_NAME,

    /**
     * 
     *                 Generic error during add customer process.
     *               
     * 
     */
    ADD_CUSTOMER_FAILURE,

    /**
     * 
     *                 There was a problem saving the modified customers, and some of the customers may not
     *                 have been saved successfully.
     *               
     * 
     */
    SAVE_CUSTOMERS_FAILURE,

    /**
     * 
     *                 Error involving test accounts (mixed types) or too many child accounts.
     *               
     * 
     */
    TEST_ACCOUNT_LINK_ERROR;

    public String value() {
        return name();
    }

    public static ManagedCustomerServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
