
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Media.MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Media.MimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMAGE_JPEG"/>
 *     &lt;enumeration value="IMAGE_GIF"/>
 *     &lt;enumeration value="IMAGE_PNG"/>
 *     &lt;enumeration value="FLASH"/>
 *     &lt;enumeration value="TEXT_HTML"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="MSWORD"/>
 *     &lt;enumeration value="MSEXCEL"/>
 *     &lt;enumeration value="RTF"/>
 *     &lt;enumeration value="AUDIO_WAV"/>
 *     &lt;enumeration value="AUDIO_MP3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Media.MimeType")
@XmlEnum
public enum MediaMimeType {


    /**
     * 
     *                 MIME type of image/jpeg
     *               
     * 
     */
    IMAGE_JPEG("IMAGE_JPEG"),

    /**
     * 
     *                 MIME type of image/gif
     *               
     * 
     */
    IMAGE_GIF("IMAGE_GIF"),

    /**
     * 
     *                 MIME type of image/png
     *               
     * 
     */
    IMAGE_PNG("IMAGE_PNG"),

    /**
     * 
     *                 MIME type of application/x-shockwave-flash
     *               
     * 
     */
    FLASH("FLASH"),

    /**
     * 
     *                 MIME type of text/html
     *               
     * 
     */
    TEXT_HTML("TEXT_HTML"),

    /**
     * 
     *                 MIME type of application/pdf
     *               
     * 
     */
    PDF("PDF"),

    /**
     * 
     *                 MIME type of application/msword
     *               
     * 
     */
    MSWORD("MSWORD"),

    /**
     * 
     *                 MIME type of application/vnd.ms-excel
     *               
     * 
     */
    MSEXCEL("MSEXCEL"),

    /**
     * 
     *                 MIME type of application/rtf
     *               
     * 
     */
    RTF("RTF"),

    /**
     * 
     *                 MIME type of audio/wav
     *               
     * 
     */
    AUDIO_WAV("AUDIO_WAV"),

    /**
     * 
     *                 MIME type of audio/mp3
     *               
     * 
     */
    @XmlEnumValue("AUDIO_MP3")
    AUDIO_MP_3("AUDIO_MP3");
    private final String value;

    MediaMimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaMimeType fromValue(String v) {
        for (MediaMimeType c: MediaMimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
