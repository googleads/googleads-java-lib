
package com.google.api.ads.adwords.jaxws.v201309.express;

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
 *     &lt;enumeration value="BUSINESS_DELETED"/>
 *     &lt;enumeration value="CURRENCY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="GOOGLE_GRANT_ACCOUNT"/>
 *     &lt;enumeration value="AOL_ACCOUNT"/>
 *     &lt;enumeration value="MCC_ACCOUNT"/>
 *     &lt;enumeration value="INVALID_DESTINATION_URL"/>
 *     &lt;enumeration value="CALL_TRACKING_NOT_SUPPORTED"/>
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
     *                 The specified business is deleted.
     *               
     * 
     */
    BUSINESS_DELETED,

    /**
     * 
     *                 Not supported currency.
     *               
     * 
     */
    CURRENCY_NOT_SUPPORTED,

    /**
     * 
     *                 Google Grant account.
     *               
     * 
     */
    GOOGLE_GRANT_ACCOUNT,

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
     *                 Call tracking is not supported
     *               
     * 
     */
    CALL_TRACKING_NOT_SUPPORTED,

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
