
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityLimitReachedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityLimitReachedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM_TARGETING_VALUES_LIMIT_REACHED"/>
 *     &lt;enumeration value="AD_EXCLUSION_RULES_LIMIT_REACHED"/>
 *     &lt;enumeration value="FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED"/>
 *     &lt;enumeration value="PLACEMENTS_LIMIT_REACHED"/>
 *     &lt;enumeration value="LINE_ITEMS_LIMIT_REACHED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityLimitReachedError.Reason")
@XmlEnum
public enum EntityLimitReachedErrorReason {


    /**
     * 
     *                 The number of custom targeting values exceeds the max number allowed in the network.
     *               
     * 
     */
    CUSTOM_TARGETING_VALUES_LIMIT_REACHED,

    /**
     * 
     *                 The number of ad exclusion rules exceeds the max number allowed in the network.
     *               
     * 
     */
    AD_EXCLUSION_RULES_LIMIT_REACHED,

    /**
     * 
     *                 The number of first party audience segments exceeds the max number allowed in the network.
     *               
     * 
     */
    FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED,

    /**
     * 
     *                 The number of active placements exceeds the max number allowed in the network.
     *               
     * 
     */
    PLACEMENTS_LIMIT_REACHED,

    /**
     * 
     *                 The number of line items excceeds the max number allowed in the network.
     *               
     * 
     */
    LINE_ITEMS_LIMIT_REACHED,

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

    public static EntityLimitReachedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
