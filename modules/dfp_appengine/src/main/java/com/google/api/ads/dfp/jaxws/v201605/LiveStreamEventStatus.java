
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamEventStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="ADS_PAUSED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventStatus")
@XmlEnum
public enum LiveStreamEventStatus {


    /**
     * 
     *                 Indicates the {@link LiveStreamEvent} has been created and is eligible
     *                 for streaming.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Indicates the {@link LiveStreamEvent} has been archived.
     *               
     * 
     */
    ARCHIVED,

    /**
     * 
     *                 Indicates the {@link LiveStreamEvent} has been paused. This
     *                 can be made {@link #ACTIVE} at later time.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 Indicates that the stream is still being served, but ad insertion should be paused
     *                 temporarily.
     *               
     * 
     */
    ADS_PAUSED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LiveStreamEventStatus fromValue(String v) {
        return valueOf(v);
    }

}
