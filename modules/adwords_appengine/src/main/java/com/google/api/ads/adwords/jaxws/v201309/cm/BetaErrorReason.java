
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetaError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetaError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BETA_FEATURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BetaError.Reason")
@XmlEnum
public enum BetaErrorReason {


    /**
     * 
     *                 Attempt to use beta feature by non-beta account.
     *               
     * 
     */
    BETA_FEATURE;

    public String value() {
        return name();
    }

    public static BetaErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
