
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_FIELD_VALUES_IN_DATE"/>
 *     &lt;enumeration value="INVALID_FIELD_VALUES_IN_DATE_TIME"/>
 *     &lt;enumeration value="INVALID_STRING_DATE"/>
 *     &lt;enumeration value="INVALID_STRING_DATE_RANGE"/>
 *     &lt;enumeration value="INVALID_STRING_DATE_TIME"/>
 *     &lt;enumeration value="EARLIER_THAN_MINIMUM_DATE"/>
 *     &lt;enumeration value="LATER_THAN_MAXIMUM_DATE"/>
 *     &lt;enumeration value="DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE"/>
 *     &lt;enumeration value="DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateError.Reason")
@XmlEnum
public enum DateErrorReason {


    /**
     * 
     *                 Given field values do not correspond to a valid date.
     *               
     * 
     */
    INVALID_FIELD_VALUES_IN_DATE,

    /**
     * 
     *                 Given field values do not correspond to a valid date time.
     *               
     * 
     */
    INVALID_FIELD_VALUES_IN_DATE_TIME,

    /**
     * 
     *                 The string date's format should be yyyymmdd.
     *               
     * 
     */
    INVALID_STRING_DATE,

    /**
     * 
     *                 The string date range's format should be yyyymmdd yyyymmdd.
     *               
     * 
     */
    INVALID_STRING_DATE_RANGE,

    /**
     * 
     *                 The string date time's format should be yyyymmdd hhmmss [tz].
     *               
     * 
     */
    INVALID_STRING_DATE_TIME,

    /**
     * 
     *                 Date is before allowed minimum.
     *               
     * 
     */
    EARLIER_THAN_MINIMUM_DATE,

    /**
     * 
     *                 Date is after allowed maximum.
     *               
     * 
     */
    LATER_THAN_MAXIMUM_DATE,

    /**
     * 
     *                 Date range bounds are not in order.
     *               
     * 
     */
    DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE,

    /**
     * 
     *                 Both dates in range are null.
     *               
     * 
     */
    DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL;

    public String value() {
        return name();
    }

    public static DateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
