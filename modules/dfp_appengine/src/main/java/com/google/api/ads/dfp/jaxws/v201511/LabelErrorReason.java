
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_PREFIX"/>
 *     &lt;enumeration value="NAME_INVALID_CHARS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelError.Reason")
@XmlEnum
public enum LabelErrorReason {


    /**
     * 
     *                 A user created label cannot begin with the Google internal system label prefix.
     *               
     * 
     */
    INVALID_PREFIX,

    /**
     * 
     *                 {@link Label#name} contains unsupported or reserved
     *                 characters.
     *               
     * 
     */
    NAME_INVALID_CHARS,

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

    public static LabelErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
