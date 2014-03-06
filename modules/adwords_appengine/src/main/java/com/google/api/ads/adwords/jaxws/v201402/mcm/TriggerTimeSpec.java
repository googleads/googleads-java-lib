
package com.google.api.ads.adwords.jaxws.v201402.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerTimeSpec.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerTimeSpec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_TIME"/>
 *     &lt;enumeration value="CUSTOM_TIME"/>
 *     &lt;enumeration value="LAST_24_HOURS"/>
 *     &lt;enumeration value="LAST_7_DAYS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerTimeSpec")
@XmlEnum
public enum TriggerTimeSpec {


    /**
     * 
     *                 Get alerts triggered at any time.
     *               
     * 
     */
    ALL_TIME,

    /**
     * 
     *                 Get alerts triggered since {@link AlertQuery#triggerTime}.
     *               
     * 
     */
    CUSTOM_TIME,

    /**
     * 
     *                 Get alerts triggered within the last 24 hours.
     *               
     * 
     */
    LAST_24_HOURS,

    /**
     * 
     *                 Get alerts triggered within the last 7 days.
     *               
     * 
     */
    LAST_7_DAYS;

    public String value() {
        return name();
    }

    public static TriggerTimeSpec fromValue(String v) {
        return valueOf(v);
    }

}
