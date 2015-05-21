
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalLineItemPremiumStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalLineItemPremiumStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUDED"/>
 *     &lt;enumeration value="EXCLUDED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalLineItemPremiumStatus")
@XmlEnum
public enum ProposalLineItemPremiumStatus {


    /**
     * 
     *                 Indicating the premium is included in the pricing.
     *               
     * 
     */
    INCLUDED,

    /**
     * 
     *                 Indicating the premium is excluded from the pricing.
     *               
     * 
     */
    EXCLUDED,

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

    public static ProposalLineItemPremiumStatus fromValue(String v) {
        return valueOf(v);
    }

}
