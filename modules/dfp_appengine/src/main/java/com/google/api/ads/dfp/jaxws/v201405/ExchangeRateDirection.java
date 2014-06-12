
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TO_NETWORK"/>
 *     &lt;enumeration value="FROM_NETWORK"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateDirection")
@XmlEnum
public enum ExchangeRateDirection {


    /**
     * 
     *                 The exchange rate is from {@link ExchangeRate#currencyCode} to {@link Network#currencyCode}.
     *               
     * 
     */
    TO_NETWORK,

    /**
     * 
     *                 The exchange rate is from {@link Network#currencyCode} to {@link ExchangeRate#currencyCode}.
     *               
     * 
     */
    FROM_NETWORK,

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

    public static ExchangeRateDirection fromValue(String v) {
        return valueOf(v);
    }

}
