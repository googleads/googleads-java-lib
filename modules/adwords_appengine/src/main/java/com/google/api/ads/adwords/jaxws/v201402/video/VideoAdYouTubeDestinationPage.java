
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAd.YouTubeDestinationPage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAd.YouTubeDestinationPage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WATCH_PAGE"/>
 *     &lt;enumeration value="CHANNEL_PAGE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAd.YouTubeDestinationPage")
@XmlEnum
public enum VideoAdYouTubeDestinationPage {

    WATCH_PAGE,
    CHANNEL_PAGE,

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

    public static VideoAdYouTubeDestinationPage fromValue(String v) {
        return valueOf(v);
    }

}
