
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteConstants.PlacementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteConstants.PlacementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SITE"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="FEED"/>
 *     &lt;enumeration value="GAME"/>
 *     &lt;enumeration value="MOBILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteConstants.PlacementType")
@XmlEnum
public enum SiteConstantsPlacementType {


    /**
     * 
     *                 An unknown {@link PlacementType}; this may indicate that the underlying
     *                 type has not yet been published.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 On a web page.
     *               
     * 
     */
    SITE,

    /**
     * 
     *                 In a video.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 In a content syndication feed.
     *               
     * 
     */
    FEED,

    /**
     * 
     *                 In or associated with a game.
     *               
     * 
     */
    GAME,

    /**
     * 
     *                 On a mobile device.
     *               
     * 
     */
    MOBILE;

    public String value() {
        return name();
    }

    public static SiteConstantsPlacementType fromValue(String v) {
        return valueOf(v);
    }

}
