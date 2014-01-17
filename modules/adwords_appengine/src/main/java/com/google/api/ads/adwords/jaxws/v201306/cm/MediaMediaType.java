
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Media.MediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Media.MediaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUDIO"/>
 *     &lt;enumeration value="DYNAMIC_IMAGE"/>
 *     &lt;enumeration value="ICON"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="STANDARD_ICON"/>
 *     &lt;enumeration value="VIDEO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Media.MediaType")
@XmlEnum
public enum MediaMediaType {


    /**
     * 
     *                 Audio file.
     *               
     * 
     */
    AUDIO,

    /**
     * 
     *                 Animated image, such as animated GIF.
     *               
     * 
     */
    DYNAMIC_IMAGE,

    /**
     * 
     *                 Small image; used for map ad.
     *               
     * 
     */
    ICON,

    /**
     * 
     *                 Static image; for image ad.
     *               
     * 
     */
    IMAGE,

    /**
     * 
     *                 Predefined standard icon; used for map ads.
     *               
     * 
     */
    STANDARD_ICON,

    /**
     * 
     *                 Video file.
     *               
     * 
     */
    VIDEO;

    public String value() {
        return name();
    }

    public static MediaMediaType fromValue(String v) {
        return valueOf(v);
    }

}
