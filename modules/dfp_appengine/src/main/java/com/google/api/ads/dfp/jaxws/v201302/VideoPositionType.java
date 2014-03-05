
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPosition.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoPosition.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREROLL"/>
 *     &lt;enumeration value="MIDROLL"/>
 *     &lt;enumeration value="POSTROLL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoPosition.Type")
@XmlEnum
public enum VideoPositionType {


    /**
     * 
     *                 The position defined as showing before the video starts playing.
     *               
     * 
     */
    PREROLL,

    /**
     * 
     *                 The position defined as showing within the middle of the playing video.
     *               
     * 
     */
    MIDROLL,

    /**
     * 
     *                 The position defined as showing after the video is completed.
     *               
     * 
     */
    POSTROLL;

    public String value() {
        return name();
    }

    public static VideoPositionType fromValue(String v) {
        return valueOf(v);
    }

}
