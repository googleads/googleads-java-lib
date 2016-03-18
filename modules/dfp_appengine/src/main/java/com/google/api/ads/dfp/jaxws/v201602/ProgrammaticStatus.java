
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgrammaticStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgrammaticStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRE_APPROVAL"/>
 *     &lt;enumeration value="PENDING_BUYER_APPROVAL"/>
 *     &lt;enumeration value="BUYER_APPROVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgrammaticStatus")
@XmlEnum
public enum ProgrammaticStatus {


    /**
     * 
     *                 The associated status of the {@link Order} is not approved.
     *               
     * 
     */
    PRE_APPROVAL,

    /**
     * 
     *                 The {@link Order} has been submitted for buyer approval.
     *               
     * 
     */
    PENDING_BUYER_APPROVAL,

    /**
     * 
     *                 The {@link Order} has been approved by the buyer.
     *               
     * 
     */
    BUYER_APPROVED,

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

    public static ProgrammaticStatus fromValue(String v) {
        return valueOf(v);
    }

}
