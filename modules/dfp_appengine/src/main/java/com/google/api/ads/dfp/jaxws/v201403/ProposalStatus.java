
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalStatus")
@XmlEnum
public enum ProposalStatus {


    /**
     * 
     *                 Indicates that the {@link Proposal} has just been created or retracted but no approval
     *                 has been requested yet.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 Indicates that a request for approval has been made for the {@link Proposal}.
     *               
     * 
     */
    PENDING_APPROVAL,

    /**
     * 
     *                 Indicates that the {@link Proposal} has been approved and is ready to serve.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Indicates that the {@link Proposal} has been rejected in the approval workflow.
     *               
     * 
     */
    REJECTED,

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

    public static ProposalStatus fromValue(String v) {
        return valueOf(v);
    }

}
