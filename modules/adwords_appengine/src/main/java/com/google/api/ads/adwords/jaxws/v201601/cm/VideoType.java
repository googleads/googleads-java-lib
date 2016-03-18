
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADOBE"/>
 *     &lt;enumeration value="REALPLAYER"/>
 *     &lt;enumeration value="QUICKTIME"/>
 *     &lt;enumeration value="WINDOWSMEDIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoType")
@XmlEnum
public enum VideoType {


    /**
     * 
     *                 The Adobe Flash video format (.swf).
     *               
     * 
     */
    ADOBE,

    /**
     * 
     *                 The RealVideo format (.rm or .ram).
     *               
     * 
     */
    REALPLAYER,

    /**
     * 
     *                 The QuickTime format (.mov).
     *               
     * 
     */
    QUICKTIME,

    /**
     * 
     *                 The Windows Media format (.wmv).
     *               
     * 
     */
    WINDOWSMEDIA;

    public String value() {
        return name();
    }

    public static VideoType fromValue(String v) {
        return valueOf(v);
    }

}
