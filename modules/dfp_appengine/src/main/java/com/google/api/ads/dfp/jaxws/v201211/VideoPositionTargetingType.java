
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPositionTargetingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoPositionTargetingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREROLL"/>
 *     &lt;enumeration value="MIDROLL"/>
 *     &lt;enumeration value="POSTROLL"/>
 *     &lt;enumeration value="BEFORE_PREROLL_BUMPER"/>
 *     &lt;enumeration value="AFTER_PREROLL_BUMPER"/>
 *     &lt;enumeration value="BEFORE_MIDROLL_BUMPERS"/>
 *     &lt;enumeration value="AFTER_MIDROLL_BUMPERS"/>
 *     &lt;enumeration value="BEFORE_POSTROLL_BUMPER"/>
 *     &lt;enumeration value="AFTER_POSTROLL_BUMPER"/>
 *     &lt;enumeration value="FIRST_IN_PREROLL"/>
 *     &lt;enumeration value="LAST_IN_PREROLL"/>
 *     &lt;enumeration value="FIRST_IN_MIDROLL"/>
 *     &lt;enumeration value="LAST_IN_MIDROLL"/>
 *     &lt;enumeration value="FIRST_IN_POSTROLL"/>
 *     &lt;enumeration value="LAST_IN_POSTROLL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoPositionTargetingType")
@XmlEnum
public enum VideoPositionTargetingType {


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
    POSTROLL,

    /**
     * 
     *                 The positions defined as showing before the pre-roll ad slot.
     *               
     * 
     */
    BEFORE_PREROLL_BUMPER,

    /**
     * 
     *                 The position defined as showing after the pre-roll ad slot.
     *               
     * 
     */
    AFTER_PREROLL_BUMPER,

    /**
     * 
     *                 The position defined as showing before each of the mid-roll ad slots.
     *               
     * 
     */
    BEFORE_MIDROLL_BUMPERS,

    /**
     * 
     *                 The position defined as showing after each of the mid-roll ad slots.
     *               
     * 
     */
    AFTER_MIDROLL_BUMPERS,

    /**
     * 
     *                 The position defined as showing before the post-roll ad slot.
     *               
     * 
     */
    BEFORE_POSTROLL_BUMPER,

    /**
     * 
     *                 The position defined as showing after the post-roll ad slot.
     *               
     * 
     */
    AFTER_POSTROLL_BUMPER,

    /**
     * 
     *                 The first position within the pre-roll ad slot.
     *               
     * 
     */
    FIRST_IN_PREROLL,

    /**
     * 
     *                 The last position within the pre-roll ad slot.
     *               
     * 
     */
    LAST_IN_PREROLL,

    /**
     * 
     *                 The first position within each of the mid-roll ad slots.
     *               
     * 
     */
    FIRST_IN_MIDROLL,

    /**
     * 
     *                 The last position within each of the mid-roll ad slots.
     *               
     * 
     */
    LAST_IN_MIDROLL,

    /**
     * 
     *                 The first position within the post-roll ad slot.
     *               
     * 
     */
    FIRST_IN_POSTROLL,

    /**
     * 
     *                 The last position within the post-roll ad slot.
     *               
     * 
     */
    LAST_IN_POSTROLL,

    /**
     * 
     *                 The video position targeting type is unknown most likely due to an incompatible api version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoPositionTargetingType fromValue(String v) {
        return valueOf(v);
    }

}
