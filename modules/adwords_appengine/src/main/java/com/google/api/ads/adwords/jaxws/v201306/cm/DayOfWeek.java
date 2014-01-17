
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeek">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONDAY"/>
 *     &lt;enumeration value="TUESDAY"/>
 *     &lt;enumeration value="WEDNESDAY"/>
 *     &lt;enumeration value="THURSDAY"/>
 *     &lt;enumeration value="FRIDAY"/>
 *     &lt;enumeration value="SATURDAY"/>
 *     &lt;enumeration value="SUNDAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeek")
@XmlEnum
public enum DayOfWeek {


    /**
     * 
     *                 The day of week named Monday.
     *               
     * 
     */
    MONDAY,

    /**
     * 
     *                 The day of week named Tuesday.
     *               
     * 
     */
    TUESDAY,

    /**
     * 
     *                 The day of week named Wednesday.
     *               
     * 
     */
    WEDNESDAY,

    /**
     * 
     *                 The day of week named Thursday.
     *               
     * 
     */
    THURSDAY,

    /**
     * 
     *                 The day of week named Friday.
     *               
     * 
     */
    FRIDAY,

    /**
     * 
     *                 The day of week named Saturday.
     *               
     * 
     */
    SATURDAY,

    /**
     * 
     *                 The day of week named Sunday.
     *               
     * 
     */
    SUNDAY;

    public String value() {
        return name();
    }

    public static DayOfWeek fromValue(String v) {
        return valueOf(v);
    }

}
