
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableBillingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailableBillingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BILLING_SOURCE_IS_NOT_AVAILABLE"/>
 *     &lt;enumeration value="BILLING_SCHEDULE_IS_NOT_AVAILABLE"/>
 *     &lt;enumeration value="BILLING_CAP_IS_NOT_AVAILABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailableBillingError.Reason")
@XmlEnum
public enum AvailableBillingErrorReason {


    /**
     * 
     *                 The billing source provided is not available in proposal network settings.
     *               
     * 
     */
    BILLING_SOURCE_IS_NOT_AVAILABLE,

    /**
     * 
     *                 The billing schedule provided is not available in proposal network settings.
     *               
     * 
     */
    BILLING_SCHEDULE_IS_NOT_AVAILABLE,

    /**
     * 
     *                 The billing cap provided is not available in proposal network settings.
     *               
     * 
     */
    BILLING_CAP_IS_NOT_AVAILABLE,

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

    public static AvailableBillingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
