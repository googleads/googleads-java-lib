
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentLabelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADULTISH"/>
 *     &lt;enumeration value="AFE"/>
 *     &lt;enumeration value="BELOW_THE_FOLD"/>
 *     &lt;enumeration value="CONFLICT"/>
 *     &lt;enumeration value="DP"/>
 *     &lt;enumeration value="EMBEDDED_VIDEO"/>
 *     &lt;enumeration value="GAMES"/>
 *     &lt;enumeration value="JUVENILE"/>
 *     &lt;enumeration value="PROFANITY"/>
 *     &lt;enumeration value="UGC_FORUMS"/>
 *     &lt;enumeration value="UGC_IMAGES"/>
 *     &lt;enumeration value="UGC_SOCIAL"/>
 *     &lt;enumeration value="UGC_VIDEOS"/>
 *     &lt;enumeration value="SIRENS"/>
 *     &lt;enumeration value="TRAGEDY"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_G"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_PG"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_T"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_MA"/>
 *     &lt;enumeration value="VIDEO_NOT_YET_RATED"/>
 *     &lt;enumeration value="LIVE_STREAMING_VIDEO"/>
 *     &lt;enumeration value="ALLOWED_GAMBLING_CONTENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentLabelType")
@XmlEnum
public enum ContentLabelType {


    /**
     * 
     *                 Sexually suggestive content
     *               
     * 
     */
    ADULTISH,

    /**
     * 
     *                 Error pages
     *               
     * 
     */
    AFE,

    /**
     * 
     *                 Below the fold placements
     *               
     * 
     */
    BELOW_THE_FOLD,

    /**
     * 
     *                 Military & international conflict
     *               
     * 
     */
    CONFLICT,

    /**
     * 
     *                 Parked domains
     *               
     * 
     */
    DP,

    /**
     * 
     *                 Embedded video
     *               
     * 
     */
    EMBEDDED_VIDEO,

    /**
     * 
     *                 Games
     *               
     * 
     */
    GAMES,

    /**
     * 
     *                 Juvenile, gross & bizarre content
     *               
     * 
     */
    JUVENILE,

    /**
     * 
     *                 Profanity & rough language
     *               
     * 
     */
    PROFANITY,

    /**
     * 
     *                 Forums
     *               
     * 
     */
    UGC_FORUMS,

    /**
     * 
     *                 Image-sharing pages
     *               
     * 
     */
    UGC_IMAGES,

    /**
     * 
     *                 Social networks
     *               
     * 
     */
    UGC_SOCIAL,

    /**
     * 
     *                 Video-sharing pages
     *               
     * 
     */
    UGC_VIDEOS,

    /**
     * 
     *                 Crime, police & emergency
     *               
     * 
     */
    SIRENS,

    /**
     * 
     *                 Death & tragedy
     *               
     * 
     */
    TRAGEDY,

    /**
     * 
     *                 Video
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Content rating: G
     *               
     * 
     */
    VIDEO_RATING_DV_G,

    /**
     * 
     *                 Content rating: PG
     *               
     * 
     */
    VIDEO_RATING_DV_PG,

    /**
     * 
     *                 Content rating: T
     *               
     * 
     */
    VIDEO_RATING_DV_T,

    /**
     * 
     *                 Content rating: MA
     *               
     * 
     */
    VIDEO_RATING_DV_MA,

    /**
     * 
     *                 Content rating: not yet rated
     *               
     * 
     */
    VIDEO_NOT_YET_RATED,

    /**
     * 
     *                 Live streaming video
     *               
     * 
     */
    LIVE_STREAMING_VIDEO,

    /**
     * 
     *                 Allowed gambling content.
     *               
     * 
     */
    ALLOWED_GAMBLING_CONTENT,

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

    public static ContentLabelType fromValue(String v) {
        return valueOf(v);
    }

}
