
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateRangeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateRangeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATE_RANGE_ERROR"/>
 *     &lt;enumeration value="INVALID_DATE"/>
 *     &lt;enumeration value="START_DATE_AFTER_END_DATE"/>
 *     &lt;enumeration value="CANNOT_SET_DATE_TO_PAST"/>
 *     &lt;enumeration value="AFTER_MAXIMUM_ALLOWABLE_DATE"/>
 *     &lt;enumeration value="CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateRangeError.Reason")
@XmlEnum
public enum DateRangeErrorReason {

    DATE_RANGE_ERROR,

    /**
     * 
     *                 Invalid date.
     *               
     * 
     */
    INVALID_DATE,

    /**
     * 
     *                 The start date was after the end date.
     *               
     * 
     */
    START_DATE_AFTER_END_DATE,

    /**
     * 
     *                 Cannot set date to past time
     *               
     * 
     */
    CANNOT_SET_DATE_TO_PAST,

    /**
     * 
     *                 A date was used that is past the system "last" date.
     *               
     * 
     */
    AFTER_MAXIMUM_ALLOWABLE_DATE,

    /**
     * 
     *                 Trying to change start date on a campaign that has started.
     *               
     * 
     */
    CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED;

    public String value() {
        return name();
    }

    public static DateRangeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
