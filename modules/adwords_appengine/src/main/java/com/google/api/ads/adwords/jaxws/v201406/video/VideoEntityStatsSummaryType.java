
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoEntityStats.SummaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoEntityStats.SummaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ALL_ENABLED"/>
 *     &lt;enumeration value="ALL_BUT_DELETED"/>
 *     &lt;enumeration value="ALL_DELETED"/>
 *     &lt;enumeration value="ALL_NON_VIDEO"/>
 *     &lt;enumeration value="COMBINED_VIDEO_NON_VIDEO"/>
 *     &lt;enumeration value="PERFORMANCE_OTHER"/>
 *     &lt;enumeration value="NON_SUMMARY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoEntityStats.SummaryType")
@XmlEnum
public enum VideoEntityStatsSummaryType {

    ALL,
    ALL_ENABLED,
    ALL_BUT_DELETED,
    ALL_DELETED,
    ALL_NON_VIDEO,
    COMBINED_VIDEO_NON_VIDEO,
    PERFORMANCE_OTHER,
    NON_SUMMARY,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoEntityStatsSummaryType fromValue(String v) {
        return valueOf(v);
    }

}
