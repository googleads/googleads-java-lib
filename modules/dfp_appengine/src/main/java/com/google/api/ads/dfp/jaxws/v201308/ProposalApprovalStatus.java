
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="NON_PENDING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalApprovalStatus")
@XmlEnum
public enum ProposalApprovalStatus {


    /**
     * 
     *                 Indicates that the {@link Proposal} is pending on active user's approval.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 Indicates that active user is the approver, and the related approval action(s) of the
     *                 {@link Proposal} has been performed or not activated yet, or the proposal is retracted.
     *               
     * 
     */
    NON_PENDING,

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

    public static ProposalApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}
