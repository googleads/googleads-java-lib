
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSUPPORTED_BILLING_SCHEDULE"/>
 *     &lt;enumeration value="UNSUPPORTED_BILLING_CAP"/>
 *     &lt;enumeration value="MISSING_BILLING_SOURCE"/>
 *     &lt;enumeration value="MISSING_BILLING_SCHEDULE"/>
 *     &lt;enumeration value="MISSING_BILLING_CAP"/>
 *     &lt;enumeration value="INVALID_BILLING_SOURCE_FOR_OFFLINE"/>
 *     &lt;enumeration value="UPDATE_BILLING_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingError.Reason")
@XmlEnum
public enum BillingErrorReason {


    /**
     * 
     *                 Found unsupported billing schedule.
     *               
     * 
     */
    UNSUPPORTED_BILLING_SCHEDULE,

    /**
     * 
     *                 Found unsupported billing cap.
     *               
     * 
     */
    UNSUPPORTED_BILLING_CAP,

    /**
     * 
     *                 Billing source is missing when either billing scheule or billing cap is provided.
     *               
     * 
     */
    MISSING_BILLING_SOURCE,

    /**
     * 
     *                 Billing schedule is missing when the provided billing source is CONSTRACTED.
     *               
     * 
     */
    MISSING_BILLING_SCHEDULE,

    /**
     * 
     *                 Billing cap is missing when the provided billing source is not CONSTRACTED.
     *               
     * 
     */
    MISSING_BILLING_CAP,

    /**
     * 
     *                 The billing source is invalid for offline proposal line item.
     *               
     * 
     */
    INVALID_BILLING_SOURCE_FOR_OFFLINE,

    /**
     * 
     *                 Billing settings cannot be updated once the proposal has been approved.
     *               
     * 
     */
    UPDATE_BILLING_NOT_ALLOWED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BillingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
