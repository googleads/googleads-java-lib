
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Media.Size.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Media.Size">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="SHRUNKEN"/>
 *     &lt;enumeration value="PREVIEW"/>
 *     &lt;enumeration value="VIDEO_THUMBNAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Media.Size")
@XmlEnum
public enum MediaSize {


    /**
     * 
     *                 Full size of Media.
     *               
     * 
     */
    FULL,

    /**
     * 
     *                 Shunken size of media.
     *               
     * 
     */
    SHRUNKEN,

    /**
     * 
     *                 Preview size of media.
     *               
     * 
     */
    PREVIEW,

    /**
     * 
     *                 Video thumbnail size of Media.
     *               
     * 
     */
    VIDEO_THUMBNAIL;

    public String value() {
        return name();
    }

    public static MediaSize fromValue(String v) {
        return valueOf(v);
    }

}
