
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDomainTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserDomainTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_DOMAIN_NAMES"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserDomainTargetingError.Reason")
@XmlEnum
public enum UserDomainTargetingErrorReason {


    /**
     * 
     *                 Invalid domain names. Domain names must be at most 67 characters long.
     *                 And must contain only alphanumeric characters and hyphens.
     *               
     * 
     */
    INVALID_DOMAIN_NAMES,

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

    public static UserDomainTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
