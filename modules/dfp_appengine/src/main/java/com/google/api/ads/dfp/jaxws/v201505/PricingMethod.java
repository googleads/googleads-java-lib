
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUM"/>
 *     &lt;enumeration value="HIGHEST"/>
 *     &lt;enumeration value="ANY_VALUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingMethod")
@XmlEnum
public enum PricingMethod {


    /**
     * 
     *                 Applies sum of all matched {@link PremiumRateValue} objects in the
     *                 {@link PremiumRate}.
     *               
     * 
     */
    SUM,

    /**
     * 
     *                 Applies the matched {@link PremiumRateValue} with highest adjustment size.
     *               
     * 
     */
    HIGHEST,

    /**
     * 
     *                 Only {@link PremiumRateValue} objects with 'Any' matching value are
     *                 allowed to be added to this {@link PremiumRate}.
     *               
     * 
     */
    ANY_VALUE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PricingMethod fromValue(String v) {
        return valueOf(v);
    }

}
