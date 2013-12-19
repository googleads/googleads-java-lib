
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalCompanyAssociationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalCompanyAssociationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIMARY_AGENCY"/>
 *     &lt;enumeration value="BILLING_AGENCY"/>
 *     &lt;enumeration value="BRANDING_AGENCY"/>
 *     &lt;enumeration value="OTHER_AGENCY"/>
 *     &lt;enumeration value="ADVERTISER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalCompanyAssociationType")
@XmlEnum
public enum ProposalCompanyAssociationType {


    /**
     * 
     *                 The company is a primary agency.
     *               
     * 
     */
    PRIMARY_AGENCY,

    /**
     * 
     *                 The company is a billing agency.
     *               
     * 
     */
    BILLING_AGENCY,

    /**
     * 
     *                 The company is a branding agency.
     *               
     * 
     */
    BRANDING_AGENCY,

    /**
     * 
     *                 The company is other type of agency.
     *               
     * 
     */
    OTHER_AGENCY,

    /**
     * 
     *                 The company is advertiser.
     *               
     * 
     */
    ADVERTISER,

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

    public static ProposalCompanyAssociationType fromValue(String v) {
        return valueOf(v);
    }

}
