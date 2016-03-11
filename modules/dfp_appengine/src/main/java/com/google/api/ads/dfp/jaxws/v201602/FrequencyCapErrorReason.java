
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyCapError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyCapError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPRESSION_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="IMPRESSIONS_TOO_LOW"/>
 *     &lt;enumeration value="RANGE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="RANGE_TOO_LOW"/>
 *     &lt;enumeration value="DUPLICATE_TIME_RANGE"/>
 *     &lt;enumeration value="TOO_MANY_FREQUENCY_CAPS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FrequencyCapError.Reason")
@XmlEnum
public enum FrequencyCapErrorReason {

    IMPRESSION_LIMIT_EXCEEDED,
    IMPRESSIONS_TOO_LOW,
    RANGE_LIMIT_EXCEEDED,
    RANGE_TOO_LOW,
    DUPLICATE_TIME_RANGE,
    TOO_MANY_FREQUENCY_CAPS,

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

    public static FrequencyCapErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
