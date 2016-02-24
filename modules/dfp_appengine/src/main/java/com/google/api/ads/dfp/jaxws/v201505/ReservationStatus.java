
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESERVED"/>
 *     &lt;enumeration value="NOT_RESERVED"/>
 *     &lt;enumeration value="RELEASED"/>
 *     &lt;enumeration value="IGNORED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationStatus")
@XmlEnum
public enum ReservationStatus {


    /**
     * 
     *                 The inventory is reserved.
     *               
     * 
     */
    RESERVED,

    /**
     * 
     *                 The proposal line item's inventory is never reserved.
     *               
     * 
     */
    NOT_RESERVED,

    /**
     * 
     *                 The inventory is once reserved and now released.
     *               
     * 
     */
    RELEASED,

    /**
     * 
     *                 The reservation status of the corresponding {@link LineItem} should be used
     *                 for this {@link ProposalLineItem}.
     *               
     * 
     */
    IGNORED,

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

    public static ReservationStatus fromValue(String v) {
        return valueOf(v);
    }

}
