
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateRangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TODAY"/>
 *     &lt;enumeration value="YESTERDAY"/>
 *     &lt;enumeration value="LAST_WEEK"/>
 *     &lt;enumeration value="LAST_MONTH"/>
 *     &lt;enumeration value="REACH_LIFETIME"/>
 *     &lt;enumeration value="CUSTOM_DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateRangeType")
@XmlEnum
public enum DateRangeType {


    /**
     * 
     *                 The current day.
     *               
     * 
     */
    TODAY,

    /**
     * 
     *                 The previous day.
     *               
     * 
     */
    YESTERDAY,

    /**
     * 
     *                 The last week, from monday to sunday.
     *               
     * 
     */
    LAST_WEEK,

    /**
     * 
     *                 The previous month.
     *               
     * 
     */
    LAST_MONTH,

    /**
     * 
     *                 The last 5 months and the current month to date. This date range is only
     *                 usable for the columns {@link Column#REACH_FREQUENCY},
     *                 {@link Column#REACH_AVERAGE_REVENUE} and {@link Column#REACH}.
     *               
     * 
     */
    REACH_LIFETIME,

    /**
     * 
     *                 Specifying this value will enable the user to specify
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}.
     *               
     * 
     */
    CUSTOM_DATE;

    public String value() {
        return name();
    }

    public static DateRangeType fromValue(String v) {
        return valueOf(v);
    }

}
