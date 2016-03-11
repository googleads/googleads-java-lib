
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateCardError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateCardError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNCHANGEABLE_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateCardError.Reason")
@XmlEnum
public enum RateCardErrorReason {


    /**
     * 
     *                 The currency code is invalid and does not follow ISO 4217.
     *               
     * 
     */
    INVALID_CURRENCY_CODE,

    /**
     * 
     *                 The currency code is not supported by current network. A supported currency can be either
     *                 {@link Network#currencyCode} or one of {@link Network#secondaryCurrencyCodes}.
     *               
     * 
     */
    UNSUPPORTED_CURRENCY_CODE,

    /**
     * 
     *                 The currency code is unchangeable as long as there is any proposal line item created
     *                 with the rate card.
     *               
     * 
     */
    UNCHANGEABLE_CURRENCY_CODE,

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

    public static RateCardErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
