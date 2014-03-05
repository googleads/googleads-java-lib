
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeSetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeSetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIDEO_FEATURE_REQUIRED"/>
 *     &lt;enumeration value="CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES"/>
 *     &lt;enumeration value="ROADBLOCK_FEATURE_REQUIRED"/>
 *     &lt;enumeration value="MASTER_CREATIVE_CANNOT_BE_COMPANION"/>
 *     &lt;enumeration value="VIDEO_CREATIVE_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_ADVERTISER"/>
 *     &lt;enumeration value="UPDATE_MASTER_CREATIVE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeSetError.Reason")
@XmlEnum
public enum CreativeSetErrorReason {


    /**
     * 
     *                 The 'video' feature is required but not enabled.
     *               
     * 
     */
    VIDEO_FEATURE_REQUIRED,

    /**
     * 
     *                 Video creatives (including overlays, VAST redirects, etc..) cannot be created
     *                 or updated through the API.
     *               
     * 
     */
    CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES,

    /**
     * 
     *                 The 'roadblock' feature is required but not enabled.
     *               
     * 
     */
    ROADBLOCK_FEATURE_REQUIRED,

    /**
     * 
     *                 A master creative cannot be a companion creative in the same creative set.
     *               
     * 
     */
    MASTER_CREATIVE_CANNOT_BE_COMPANION,

    /**
     * 
     *                 A video creative is not allowed to be in a creative set.
     *               
     * 
     */
    VIDEO_CREATIVE_NOT_ALLOWED,

    /**
     * 
     *                 Creatives in a creative set must be for the same advertiser.
     *               
     * 
     */
    INVALID_ADVERTISER,

    /**
     * 
     *                 Updating a master creative in a creative set is not allowed.
     *               
     * 
     */
    UPDATE_MASTER_CREATIVE_NOT_ALLOWED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CreativeSetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
