
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateCardCustomizationGroupError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateCardCustomizationGroupError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_PRICING_METHOD"/>
 *     &lt;enumeration value="INVALID_RATE_CARD_FEATURE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateCardCustomizationGroupError.Reason")
@XmlEnum
public enum RateCardCustomizationGroupErrorReason {


    /**
     * 
     *                 The pricing method of the group is invalid.
     *               
     * 
     */
    INVALID_PRICING_METHOD,

    /**
     * 
     *                 The rate card feature of the group is invalid.
     *               
     * 
     */
    INVALID_RATE_CARD_FEATURE,

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

    public static RateCardCustomizationGroupErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
