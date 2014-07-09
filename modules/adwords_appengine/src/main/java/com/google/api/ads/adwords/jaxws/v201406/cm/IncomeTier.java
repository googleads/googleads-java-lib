
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomeTier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomeTier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TIER_1"/>
 *     &lt;enumeration value="TIER_2"/>
 *     &lt;enumeration value="TIER_3"/>
 *     &lt;enumeration value="TIER_4"/>
 *     &lt;enumeration value="TIER_5"/>
 *     &lt;enumeration value="TIER_6_TO_10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncomeTier")
@XmlEnum
public enum IncomeTier {

    UNKNOWN,
    TIER_1,
    TIER_2,
    TIER_3,
    TIER_4,
    TIER_5,

    /**
     * 
     *                 Bucket consisting of the bottom 5 tiers, specifying the bottom 50% of household
     *                 income zip codes.
     *               
     * 
     */
    TIER_6_TO_10;

    public String value() {
        return name();
    }

    public static IncomeTier fromValue(String v) {
        return valueOf(v);
    }

}
