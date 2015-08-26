
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINUTE"/>
 *     &lt;enumeration value="HOUR"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="LIFETIME"/>
 *     &lt;enumeration value="POD"/>
 *     &lt;enumeration value="STREAM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeUnit")
@XmlEnum
public enum TimeUnit {

    MINUTE,
    HOUR,
    DAY,
    WEEK,
    MONTH,
    LIFETIME,

    /**
     * 
     *                 Per pod of ads in a video stream. Only valid for entities in a
     *                 {@link EnvironmentType#VIDEO_PLAYER} environment.
     *               
     * 
     */
    POD,

    /**
     * 
     *                 Per video stream. Only valid for entities in a
     *                 {@link EnvironmentType#VIDEO_PLAYER} environment.
     *               
     * 
     */
    STREAM,

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

    public static TimeUnit fromValue(String v) {
        return valueOf(v);
    }

}
