
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAdSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAdSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN_ID"/>
 *     &lt;enumeration value="CAMPAIGN_NAME"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="STATUS"/>
 *     &lt;enumeration value="VIDEOAD_ID"/>
 *     &lt;enumeration value="VIDEO_NAME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAdSortable")
@XmlEnum
public enum VideoAdSortable {

    CAMPAIGN_ID,
    CAMPAIGN_NAME,
    NAME,
    STATUS,
    VIDEOAD_ID,
    VIDEO_NAME,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoAdSortable fromValue(String v) {
        return valueOf(v);
    }

}
