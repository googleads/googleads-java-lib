
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoImage.MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoImage.MimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMAGE_JPEG"/>
 *     &lt;enumeration value="IMAGE_GIF"/>
 *     &lt;enumeration value="IMAGE_PNG"/>
 *     &lt;enumeration value="FLASH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoImage.MimeType")
@XmlEnum
public enum VideoImageMimeType {


    /**
     * 
     *                 MIME type of image/jpeg
     *               
     * 
     */
    IMAGE_JPEG,

    /**
     * 
     *                 MIME type of image/gif
     *               
     * 
     */
    IMAGE_GIF,

    /**
     * 
     *                 MIME type of image/png
     *               
     * 
     */
    IMAGE_PNG,

    /**
     * 
     *                 MIME type of application/x-shockwave-flash
     *               
     * 
     */
    FLASH;

    public String value() {
        return name();
    }

    public static VideoImageMimeType fromValue(String v) {
        return valueOf(v);
    }

}
