
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TARGETED_LOCATIONS_NOT_EXCLUDABLE"/>
 *     &lt;enumeration value="EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED"/>
 *     &lt;enumeration value="POSTAL_CODES_CANNOT_BE_EXCLUDED"/>
 *     &lt;enumeration value="UNTARGETABLE_LOCATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoTargetingError.Reason")
@XmlEnum
public enum GeoTargetingErrorReason {


    /**
     * 
     *                 A location that is targeted cannot also be excluded.
     *               
     * 
     */
    TARGETED_LOCATIONS_NOT_EXCLUDABLE,

    /**
     * 
     *                 Excluded locations cannot have any of their children targeted.
     *               
     * 
     */
    EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED,

    /**
     * 
     *                 Postal codes cannot be excluded.
     *               
     * 
     */
    POSTAL_CODES_CANNOT_BE_EXCLUDED,

    /**
     * 
     *                 Indicates that location targeting is not allowed.
     *               
     * 
     */
    UNTARGETABLE_LOCATION,

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

    public static GeoTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
