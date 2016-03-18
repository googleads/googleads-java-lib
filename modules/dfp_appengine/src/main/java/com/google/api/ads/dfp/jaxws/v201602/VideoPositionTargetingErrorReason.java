
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPositionTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoPositionTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_MIX_BUMPER_AND_NON_BUMPER_TARGETING"/>
 *     &lt;enumeration value="INVALID_BUMPER_TARGETING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoPositionTargetingError.Reason")
@XmlEnum
public enum VideoPositionTargetingErrorReason {


    /**
     * 
     *                 Video position targeting cannot contain both bumper and non-bumper targeting values.
     *               
     * 
     */
    CANNOT_MIX_BUMPER_AND_NON_BUMPER_TARGETING,

    /**
     * 
     *                 The bumper video position targeting is invalid.
     *               
     * 
     */
    INVALID_BUMPER_TARGETING,

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

    public static VideoPositionTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
