
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeZoneError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_TIMEZONE_ID"/>
 *     &lt;enumeration value="TIMEZONE_ID_IN_WRONG_FORMAT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeZoneError.Reason")
@XmlEnum
public enum TimeZoneErrorReason {


    /**
     * 
     *                 Indicates that the timezone ID provided is not supported.
     *               
     * 
     */
    INVALID_TIMEZONE_ID,

    /**
     * 
     *                 Indicates that the timezone ID provided is in the wrong format.
     *                 The timezone ID must be in tz database format (e.g. "America/Los_Angeles").
     *               
     * 
     */
    TIMEZONE_ID_IN_WRONG_FORMAT,

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

    public static TimeZoneErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
