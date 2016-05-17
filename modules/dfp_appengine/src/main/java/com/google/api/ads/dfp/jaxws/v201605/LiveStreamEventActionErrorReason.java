
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamEventActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_STATUS_TRANSITION"/>
 *     &lt;enumeration value="IS_ARCHIVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventActionError.Reason")
@XmlEnum
public enum LiveStreamEventActionErrorReason {


    /**
     * 
     *                 The operation is not applicable to the current status.
     *               
     * 
     */
    INVALID_STATUS_TRANSITION,

    /**
     * 
     *                 The operation cannot be applied because the live stream event is
     *                 archived.
     *               
     * 
     */
    IS_ARCHIVED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested
     *                 API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LiveStreamEventActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
