
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateRefreshRate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateRefreshRate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateRefreshRate")
@XmlEnum
public enum ExchangeRateRefreshRate {


    /**
     * 
     *                 The exchange rate is input manually and not refreshed.
     *               
     * 
     */
    FIXED,

    /**
     * 
     *                 The exchange rate will be updated automatically by Google every day using the latest day's
     *                 rate.
     *               
     * 
     */
    DAILY,

    /**
     * 
     *                 The exchange rate will be updated automatically by Google every month using the latest month's
     *                 rate.
     *               
     * 
     */
    MONTHLY,

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

    public static ExchangeRateRefreshRate fromValue(String v) {
        return valueOf(v);
    }

}
