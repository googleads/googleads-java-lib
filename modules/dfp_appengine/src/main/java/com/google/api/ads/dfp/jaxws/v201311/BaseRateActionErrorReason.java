
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseRateActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaseRateActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATED_BASE_RATES"/>
 *     &lt;enumeration value="ACTIVE_BASE_RATE_ALREADY_EXISTS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaseRateActionError.Reason")
@XmlEnum
public enum BaseRateActionErrorReason {


    /**
     * 
     *                 Duplicated base rates are allowed, but only one may be activated at any given time.
     *               
     * 
     */
    DUPLICATED_BASE_RATES,

    /**
     * 
     *                 A duplicated active base rate already exists.
     *               
     * 
     */
    ACTIVE_BASE_RATE_ALREADY_EXISTS,

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

    public static BaseRateActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
