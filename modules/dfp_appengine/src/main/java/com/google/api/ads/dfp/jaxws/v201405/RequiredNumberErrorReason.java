
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredNumberError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequiredNumberError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="TOO_LARGE"/>
 *     &lt;enumeration value="TOO_SMALL"/>
 *     &lt;enumeration value="TOO_LARGE_WITH_DETAILS"/>
 *     &lt;enumeration value="TOO_SMALL_WITH_DETAILS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequiredNumberError.Reason")
@XmlEnum
public enum RequiredNumberErrorReason {

    REQUIRED,
    TOO_LARGE,
    TOO_SMALL,
    TOO_LARGE_WITH_DETAILS,
    TOO_SMALL_WITH_DETAILS,

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

    public static RequiredNumberErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
