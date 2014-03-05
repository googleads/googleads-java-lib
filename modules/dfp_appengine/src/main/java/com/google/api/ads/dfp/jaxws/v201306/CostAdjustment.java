
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostAdjustment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostAdjustment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="MAKE_GOOD"/>
 *     &lt;enumeration value="BARTER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostAdjustment")
@XmlEnum
public enum CostAdjustment {


    /**
     * 
     *                 Indicates that the {@link ProposalLineItem} has no cost adjustment.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Indicates that the cost adjustment of the {@link ProposalLineItem} is make good.
     *               
     * 
     */
    MAKE_GOOD,

    /**
     * 
     *                 Indicates that the cost adjustment of the {@link ProposalLineItem} is barter.
     *               
     * 
     */
    BARTER,

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

    public static CostAdjustment fromValue(String v) {
        return valueOf(v);
    }

}
