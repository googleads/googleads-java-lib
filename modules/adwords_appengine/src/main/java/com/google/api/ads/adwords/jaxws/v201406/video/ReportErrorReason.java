
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CRITERIA_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_TARGETING_GROUP_ID_COUNT"/>
 *     &lt;enumeration value="NO_STATS_SELECTOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportError.Reason")
@XmlEnum
public enum ReportErrorReason {


    /**
     * 
     *                 Default error.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Unsupported criteria type bundle.
     *               
     * 
     */
    CRITERIA_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 Reporting at targeting group level requires exactly one targeting group.
     *               
     * 
     */
    INVALID_TARGETING_GROUP_ID_COUNT,

    /**
     * 
     *                 Stats selector is required for reporting.
     *               
     * 
     */
    NO_STATS_SELECTOR;

    public String value() {
        return name();
    }

    public static ReportErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
