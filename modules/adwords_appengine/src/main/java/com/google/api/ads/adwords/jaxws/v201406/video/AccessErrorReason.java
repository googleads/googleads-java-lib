
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTION_NOT_PERMITTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessError.Reason")
@XmlEnum
public enum AccessErrorReason {


    /**
     * 
     *                 Unauthorized invocation of a service's method (get, mutate, etc.)
     *               
     * 
     */
    ACTION_NOT_PERMITTED,

    /**
     * 
     *                 Unspecified.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AccessErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
