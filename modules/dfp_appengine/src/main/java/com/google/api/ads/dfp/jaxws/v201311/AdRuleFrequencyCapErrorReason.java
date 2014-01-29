
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRuleFrequencyCapError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleFrequencyCapError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_FREQUENCY_CAPS_SPECIFIED_WHEN_FREQUENCY_CAPS_TURNED_ON"/>
 *     &lt;enumeration value="FREQUENCY_CAPS_SPECIFIED_WHEN_FREQUENCY_CAPS_TURNED_OFF"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdRuleFrequencyCapError.Reason")
@XmlEnum
public enum AdRuleFrequencyCapErrorReason {


    /**
     * 
     *                 The ad rule specifies that frequency caps should be turned on, but then
     *                 none of the frequency caps have actually been set.
     *               
     * 
     */
    NO_FREQUENCY_CAPS_SPECIFIED_WHEN_FREQUENCY_CAPS_TURNED_ON,

    /**
     * 
     *                 The ad rule specifies that frequency caps should not be turned on, but
     *                 then some frequency caps were actually set.
     *               
     * 
     */
    FREQUENCY_CAPS_SPECIFIED_WHEN_FREQUENCY_CAPS_TURNED_OFF,

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

    public static AdRuleFrequencyCapErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
