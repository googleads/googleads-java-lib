
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteConstants.AdFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteConstants.AdFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="INSTREAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteConstants.AdFormat")
@XmlEnum
public enum SiteConstantsAdFormat {


    /**
     * 
     *                 Unknown ad format.  This usually indicates that the actual ad format
     *                 has not yet been published.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 A simple text ad.
     *               
     * 
     */
    TEXT,

    /**
     * 
     *                 An image ad.
     *               
     * 
     */
    IMAGE,

    /**
     * 
     *                 A click-to-play video ad displaying in a non-video context.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 A video ad displaying as part of other video content.
     *               
     * 
     */
    INSTREAM;

    public String value() {
        return name();
    }

    public static SiteConstantsAdFormat fromValue(String v) {
        return valueOf(v);
    }

}
