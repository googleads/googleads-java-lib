
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YouTubeVideo.AccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YouTubeVideo.AccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL_LINKED"/>
 *     &lt;enumeration value="LIMITED_NOT_LINKED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YouTubeVideo.AccessLevel")
@XmlEnum
public enum YouTubeVideoAccessLevel {


    /**
     * 
     *                 Full stats are provided because the customer is
     *                 linked to the YouTube channel that owns this video.
     *               
     * 
     */
    FULL_LINKED,

    /**
     * 
     *                 Only limited stats are returned because the customer is not linked
     *                 to the YouTube channel that owns this video.
     *               
     * 
     */
    LIMITED_NOT_LINKED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static YouTubeVideoAccessLevel fromValue(String v) {
        return valueOf(v);
    }

}
