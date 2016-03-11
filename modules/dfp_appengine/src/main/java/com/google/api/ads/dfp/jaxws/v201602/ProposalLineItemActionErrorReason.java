
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalLineItemActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalLineItemActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="PROPOSAL_NOT_EDITABLE"/>
 *     &lt;enumeration value="CANNOT_SELECTIVELY_ARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS"/>
 *     &lt;enumeration value="CANNOT_SELECTIVELY_UNARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalLineItemActionError.Reason")
@XmlEnum
public enum ProposalLineItemActionErrorReason {


    /**
     * 
     *                 The operation is not applicable to the current state.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The operation is not applicable because the containing proposal is not editable.
     *               
     * 
     */
    PROPOSAL_NOT_EDITABLE,

    /**
     * 
     *                 The archive operation is not applicable because it would cause some mandatory products
     *                 to have no unarchived proposal line items in the package.
     *               
     * 
     */
    CANNOT_SELECTIVELY_ARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS,

    /**
     * 
     *                 The unarchive operation is not applicable because it would cause some mandatory products
     *                 to have no unarchived proposal line items in the package.
     *               
     * 
     */
    CANNOT_SELECTIVELY_UNARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS,

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

    public static ProposalLineItemActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
