
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingTermsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingTermsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAPPED_ACTUALS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingTermsType")
@XmlEnum
public enum BillingTermsType {


    /**
     * 
     *                 Indicates that there are no minimum spend guarantees but there is a total budget
     *                 that cannot be exceeded.
     *               
     * 
     */
    CAPPED_ACTUALS,

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

    public static BillingTermsType fromValue(String v) {
        return valueOf(v);
    }

}
