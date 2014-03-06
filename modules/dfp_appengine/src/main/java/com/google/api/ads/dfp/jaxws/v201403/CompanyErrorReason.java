
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE"/>
 *     &lt;enumeration value="CANNOT_UPDATE_COMPANY_TYPE"/>
 *     &lt;enumeration value="INVALID_COMPANY_TYPE"/>
 *     &lt;enumeration value="PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY"/>
 *     &lt;enumeration value="THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyError.Reason")
@XmlEnum
public enum CompanyErrorReason {


    /**
     * 
     *                 Indicates that an attempt was made to set a third party company for a
     *                 company whose type is not the same as the third party company.
     *               
     * 
     */
    CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE,

    /**
     * 
     *                 Indicates that an invalid attempt was made to change a company's type.
     *               
     * 
     */
    CANNOT_UPDATE_COMPANY_TYPE,

    /**
     * 
     *                 Indicates that this type of company is not supported.
     *               
     * 
     */
    INVALID_COMPANY_TYPE,

    /**
     * 
     *                 Indicates that an attempt was made to assign a primary contact who
     *                 does not belong to the specified company.
     *               
     * 
     */
    PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY,

    /**
     * 
     *                 Indicates that the user specified as the third party stats provider
     *                 is of the wrong role type.  The user must have the third party stats
     *                 provider role.
     *               
     * 
     */
    THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE,

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

    public static CompanyErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
