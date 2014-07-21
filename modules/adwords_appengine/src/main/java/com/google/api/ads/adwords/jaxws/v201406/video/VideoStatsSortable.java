
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoStatsSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoStatsSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOTAL_VIEWS"/>
 *     &lt;enumeration value="CTA_IMPRESSIONS"/>
 *     &lt;enumeration value="CTA_CLICKS"/>
 *     &lt;enumeration value="CTA_CTR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoStatsSortable")
@XmlEnum
public enum VideoStatsSortable {

    TOTAL_VIEWS,
    CTA_IMPRESSIONS,
    CTA_CLICKS,
    CTA_CTR,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoStatsSortable fromValue(String v) {
        return valueOf(v);
    }

}
