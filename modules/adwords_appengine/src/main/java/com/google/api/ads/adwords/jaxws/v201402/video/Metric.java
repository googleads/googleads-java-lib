
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Metric.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Metric">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIEWS"/>
 *     &lt;enumeration value="THUMBNAIL_IMPRESSIONS"/>
 *     &lt;enumeration value="VIDEO_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_IMPRESSIONS"/>
 *     &lt;enumeration value="COST"/>
 *     &lt;enumeration value="AVERAGE_CPV"/>
 *     &lt;enumeration value="VTR"/>
 *     &lt;enumeration value="CONVERSIONS"/>
 *     &lt;enumeration value="DAILY_UNIQUE_VIEWERS"/>
 *     &lt;enumeration value="WEEKLY_UNIQUE_VIEWERS"/>
 *     &lt;enumeration value="MONTHLY_UNIQUE_VIEWERS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Metric")
@XmlEnum
public enum Metric {

    VIEWS,
    THUMBNAIL_IMPRESSIONS,
    VIDEO_IMPRESSIONS,
    TOTAL_IMPRESSIONS,
    COST,
    AVERAGE_CPV,
    VTR,
    CONVERSIONS,
    DAILY_UNIQUE_VIEWERS,
    WEEKLY_UNIQUE_VIEWERS,
    MONTHLY_UNIQUE_VIEWERS,

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

    public static Metric fromValue(String v) {
        return valueOf(v);
    }

}
