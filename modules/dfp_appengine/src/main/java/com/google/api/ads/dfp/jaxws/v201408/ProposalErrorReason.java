
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_SERVER_UNKNOWN_ERROR"/>
 *     &lt;enumeration value="AD_SERVER_API_ERROR"/>
 *     &lt;enumeration value="UPDATE_ADVERTISER_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_PROPOSAL_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_CONTACT"/>
 *     &lt;enumeration value="DUPLICATED_CONTACT"/>
 *     &lt;enumeration value="UNACCEPTABLE_COMPANY_CREDIT_STATUS"/>
 *     &lt;enumeration value="PRIMARY_AGENCY_REQUIRED"/>
 *     &lt;enumeration value="PRIMARY_AGENCY_NOT_UNIQUE"/>
 *     &lt;enumeration value="DUPLICATED_COMPANY_ASSOCIATION"/>
 *     &lt;enumeration value="DUPLICATED_SALESPERSON"/>
 *     &lt;enumeration value="DUPLICATED_SALES_PLANNER"/>
 *     &lt;enumeration value="DUPLICATED_TRAFFICKER"/>
 *     &lt;enumeration value="HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS"/>
 *     &lt;enumeration value="INVALID_POC"/>
 *     &lt;enumeration value="UPDATE_CURRENCY_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalError.Reason")
@XmlEnum
public enum ProposalErrorReason {


    /**
     * 
     *                 Unknown error from ad-server
     *               
     * 
     */
    AD_SERVER_UNKNOWN_ERROR,

    /**
     * 
     *                 Ad-server reports an api error for the operation.
     *               
     * 
     */
    AD_SERVER_API_ERROR,

    /**
     * 
     *                 Advertiser cannot be updated once the proposal has been reserved.
     *               
     * 
     */
    UPDATE_ADVERTISER_NOT_ALLOWED,

    /**
     * 
     *                 Proposal cannot be updated when its status is not {@code DRAFT} or it is archived.
     *               
     * 
     */
    UPDATE_PROPOSAL_NOT_ALLOWED,

    /**
     * 
     *                 Contact associated with a proposal does not belong to the specific company.
     *               
     * 
     */
    INVALID_CONTACT,

    /**
     * 
     *                 Contact associated with a proposal's advertiser or agency is duplicated.
     *               
     * 
     */
    DUPLICATED_CONTACT,

    /**
     * 
     *                 A proposal cannot be created or updated because the company
     *                 it is associated with has {@link Company#creditStatus}
     *                 that is not {@code ACTIVE} or {@code ON_HOLD}.
     *               
     * 
     */
    UNACCEPTABLE_COMPANY_CREDIT_STATUS,

    /**
     * 
     *                 Cannot have other agencies without a primary agency.
     *               
     * 
     */
    PRIMARY_AGENCY_REQUIRED,

    /**
     * 
     *                 Cannot have more than one primary agency.
     *               
     * 
     */
    PRIMARY_AGENCY_NOT_UNIQUE,

    /**
     * 
     *                 Advertiser or agency associated with a proposal is duplicated.
     *               
     * 
     */
    DUPLICATED_COMPANY_ASSOCIATION,

    /**
     * 
     *                 Found duplicated primary or secondary sales person.
     *               
     * 
     */
    DUPLICATED_SALESPERSON,

    /**
     * 
     *                 Found duplicated sales planner.
     *               
     * 
     */
    DUPLICATED_SALES_PLANNER,

    /**
     * 
     *                 Found duplicated primary or secondary trafficker.
     *               
     * 
     */
    DUPLICATED_TRAFFICKER,

    /**
     * 
     *                 The proposal has no unarchived proposal line items.
     *               
     * 
     */
    HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS,

    /**
     * 
     *                 The POC value of the proposal is invalid.
     *               
     * 
     */
    INVALID_POC,

    /**
     * 
     *                 Currency cannot be updated once the proposal has been reserved.
     *               
     * 
     */
    UPDATE_CURRENCY_NOT_ALLOWED,

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

    public static ProposalErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
