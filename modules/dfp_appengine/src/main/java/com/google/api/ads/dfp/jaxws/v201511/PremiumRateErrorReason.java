
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumRateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PremiumRateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_RATE_TYPE"/>
 *     &lt;enumeration value="INVALID_PRICING_METHOD"/>
 *     &lt;enumeration value="INVALID_PREMIUM_FEATURE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PremiumRateError.Reason")
@XmlEnum
public enum PremiumRateErrorReason {


    /**
     * 
     *                 The rate type of the {@link PremiumRateValue} is invalid.
     *               
     * 
     */
    INVALID_RATE_TYPE,

    /**
     * 
     *                 The pricing method of the {@link PremiumRate} is invalid.
     *               
     * 
     */
    INVALID_PRICING_METHOD,

    /**
     * 
     *                 The premium feature of the {@link PremiumRate} is invalid.
     *               
     * 
     */
    INVALID_PREMIUM_FEATURE,

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

    public static PremiumRateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
