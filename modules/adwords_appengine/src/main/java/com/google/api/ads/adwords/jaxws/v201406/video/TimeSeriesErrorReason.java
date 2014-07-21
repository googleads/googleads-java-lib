
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSeriesError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeSeriesError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INVALID_SEGMENTATION_DIMENSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeSeriesError.Reason")
@XmlEnum
public enum TimeSeriesErrorReason {

    UNKNOWN,
    INVALID_SEGMENTATION_DIMENSION;

    public String value() {
        return name();
    }

    public static TimeSeriesErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
