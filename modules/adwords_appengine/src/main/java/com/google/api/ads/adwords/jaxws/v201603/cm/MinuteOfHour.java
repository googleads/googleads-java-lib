
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinuteOfHour.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MinuteOfHour">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZERO"/>
 *     &lt;enumeration value="FIFTEEN"/>
 *     &lt;enumeration value="THIRTY"/>
 *     &lt;enumeration value="FORTY_FIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MinuteOfHour")
@XmlEnum
public enum MinuteOfHour {


    /**
     * 
     *                 Zero minutes past hour.
     *               
     * 
     */
    ZERO,

    /**
     * 
     *                 Fifteen minutes past hour.
     *               
     * 
     */
    FIFTEEN,

    /**
     * 
     *                 Thirty minutes past hour.
     *               
     * 
     */
    THIRTY,

    /**
     * 
     *                 Forty-five minutes past hour.
     *               
     * 
     */
    FORTY_FIVE;

    public String value() {
        return name();
    }

    public static MinuteOfHour fromValue(String v) {
        return valueOf(v);
    }

}
