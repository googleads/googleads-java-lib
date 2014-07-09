
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardCompatibilityError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForwardCompatibilityError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_FORWARD_COMPATIBILITY_MAP_VALUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForwardCompatibilityError.Reason")
@XmlEnum
public enum ForwardCompatibilityErrorReason {


    /**
     * 
     *                 Invalid value specified for a key in the forward compatibility map.
     *               
     * 
     */
    INVALID_FORWARD_COMPATIBILITY_MAP_VALUE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ForwardCompatibilityErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
