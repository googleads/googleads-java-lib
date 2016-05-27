
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsQueryError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatsQueryError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATE_NOT_IN_VALID_RANGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatsQueryError.Reason")
@XmlEnum
public enum StatsQueryErrorReason {


    /**
     * 
     *                 Date is outside of allowed range.
     *               
     * 
     */
    DATE_NOT_IN_VALID_RANGE;

    public String value() {
        return name();
    }

    public static StatsQueryErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
