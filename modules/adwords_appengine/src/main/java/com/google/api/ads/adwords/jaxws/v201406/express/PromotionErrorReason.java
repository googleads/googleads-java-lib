
package com.google.api.ads.adwords.jaxws.v201406.express;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MISSING_BUSINESS_NAME"/>
 *     &lt;enumeration value="BUSINESS_DELETED"/>
 *     &lt;enumeration value="NOT_BUSINESS_OWNER"/>
 *     &lt;enumeration value="BUSINESS_OWNER_NOT_FOUND"/>
 *     &lt;enumeration value="BUSINESS_OWNER_ACCOUNT_NOT_MATCHED"/>
 *     &lt;enumeration value="BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT"/>
 *     &lt;enumeration value="BUSINESS_COUNTRY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="BUSINESS_LANGUAGE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CURRENCY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="AOL_ACCOUNT"/>
 *     &lt;enumeration value="MCC_ACCOUNT"/>
 *     &lt;enumeration value="INVALID_DESTINATION_URL"/>
 *     &lt;enumeration value="CALL_TRACKING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_PHONE_NUMBER"/>
 *     &lt;enumeration value="PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="NON_LOCAL_BUSINESS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionError.Reason")
@XmlEnum
public enum PromotionErrorReason {


    /**
     * 
     *                 The specified business does not have a public name.
     *               
     * 
     */
    MISSING_BUSINESS_NAME,

    /**
     * 
     *                 The specified business is deleted.
     *               
     * 
     */
    BUSINESS_DELETED,

    /**
     * 
     *                 The specified business is not owned by the current user.
     *               
     * 
     */
    NOT_BUSINESS_OWNER,

    /**
     * 
     *                 No owner found for business.
     *               
     * 
     */
    BUSINESS_OWNER_NOT_FOUND,

    /**
     * 
     *                 Business owner's account doesn't match effective account.
     *               
     * 
     */
    BUSINESS_OWNER_ACCOUNT_NOT_MATCHED,

    /**
     * 
     *                 Business is promoted by another account.
     *               
     * 
     */
    BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT,

    /**
     * 
     *                 The business address is in an unsupported country.
     *               
     * 
     */
    BUSINESS_COUNTRY_NOT_SUPPORTED,

    /**
     * 
     *                 The plus page uses an unsupported language.
     *               
     * 
     */
    BUSINESS_LANGUAGE_NOT_SUPPORTED,

    /**
     * 
     *                 Not supported currency.
     *               
     * 
     */
    CURRENCY_NOT_SUPPORTED,

    /**
     * 
     *                 AOL account.
     *               
     * 
     */
    AOL_ACCOUNT,

    /**
     * 
     *                 MCC account.
     *               
     * 
     */
    MCC_ACCOUNT,

    /**
     * 
     *                 The specified destination URL is invalid.
     *               
     * 
     */
    INVALID_DESTINATION_URL,

    /**
     * 
     *                 Call tracking is not supported.
     *               
     * 
     */
    CALL_TRACKING_NOT_SUPPORTED,

    /**
     * 
     *                 Phone number is invalid.
     *               
     * 
     */
    INVALID_PHONE_NUMBER,

    /**
     * 
     *                 Premium rate phone numbers e.g. 1-900 numbers not allowed.
     *               
     * 
     */
    PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Non-local +Pages are not supported.
     *               
     * 
     */
    NON_LOCAL_BUSINESS,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PromotionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
