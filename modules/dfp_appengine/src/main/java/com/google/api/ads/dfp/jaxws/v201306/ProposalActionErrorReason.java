
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="IS_ARCHIVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalActionError.Reason")
@XmlEnum
public enum ProposalActionErrorReason {


    /**
     * 
     *                 The operation is not applicable to the current state.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The operation cannot be applied because the proposal is archived.
     *               
     * 
     */
    IS_ARCHIVED,

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

    public static ProposalActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
