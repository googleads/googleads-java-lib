
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanionDeliveryOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanionDeliveryOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPTIONAL"/>
 *     &lt;enumeration value="AT_LEAST_ONE"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanionDeliveryOption")
@XmlEnum
public enum CompanionDeliveryOption {


    /**
     * 
     *                 Companions are not required to serve a creative set. The creative set can
     *                 serve to inventory that has zero or more matching companions.
     *               
     * 
     */
    OPTIONAL,

    /**
     * 
     *                 At least one companion must be served in order for the creative set to be used.
     *               
     * 
     */
    AT_LEAST_ONE,

    /**
     * 
     *                 All companions in the set must be served in order for the creative set to
     *                 be used. This can still serve to inventory that has more companions
     *                 than can be filled.
     *               
     * 
     */
    ALL,

    /**
     * 
     *                 The delivery type is unknown.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CompanionDeliveryOption fromValue(String v) {
        return valueOf(v);
    }

}
