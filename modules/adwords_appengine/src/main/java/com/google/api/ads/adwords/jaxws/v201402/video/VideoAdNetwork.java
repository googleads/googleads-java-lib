
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAdNetwork.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAdNetwork">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YOUTUBE_SEARCH"/>
 *     &lt;enumeration value="YOUTUBE_WATCH"/>
 *     &lt;enumeration value="GOOGLE_DISPLAY_NETWORK"/>
 *     &lt;enumeration value="GOOGLE_SEARCH"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAdNetwork")
@XmlEnum
public enum VideoAdNetwork {

    YOUTUBE_SEARCH,
    YOUTUBE_WATCH,
    GOOGLE_DISPLAY_NETWORK,
    GOOGLE_SEARCH,
    ALL;

    public String value() {
        return name();
    }

    public static VideoAdNetwork fromValue(String v) {
        return valueOf(v);
    }

}
