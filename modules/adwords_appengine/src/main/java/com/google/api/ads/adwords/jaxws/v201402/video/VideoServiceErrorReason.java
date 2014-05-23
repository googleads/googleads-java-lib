
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INVALID_VIDEO_ID"/>
 *     &lt;enumeration value="VIDEO_NOT_FOUND"/>
 *     &lt;enumeration value="INVALID_CHANNEL"/>
 *     &lt;enumeration value="VIDEO_LOOKUP_SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="VIDEO_SEARCH_SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="CHANNEL_SEARCH_SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="YOUTUBE_ANALYTICS_SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="VIDEO_NOT_OWNED_BY_LINKED_ACCOUNT"/>
 *     &lt;enumeration value="VIDEO_NOT_ENABLED_FOR_CALL_TO_ACTION"/>
 *     &lt;enumeration value="CALL_TO_ACTION_NOT_FOUND"/>
 *     &lt;enumeration value="INVALID_CALL_TO_ACTION"/>
 *     &lt;enumeration value="UNKNOWN_CALL_TO_ACTION_ERROR"/>
 *     &lt;enumeration value="CALL_TO_ACTION_TOO_LONG"/>
 *     &lt;enumeration value="CALL_TO_ACTION_INVALID_FORMAT"/>
 *     &lt;enumeration value="CALL_TO_ACTION_INVALID_CHARS"/>
 *     &lt;enumeration value="CALL_TO_ACTION_INVALID_INPUT"/>
 *     &lt;enumeration value="INVALID_FORMAT"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="INVALID_IMAGE_FILESIZE"/>
 *     &lt;enumeration value="UNSUPPORTED_IMAGE_FORMAT"/>
 *     &lt;enumeration value="DUPLICATE_VIDEO_ID"/>
 *     &lt;enumeration value="TOO_LONG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoServiceError.Reason")
@XmlEnum
public enum VideoServiceErrorReason {


    /**
     * 
     *                 Default error.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Video id is invalid.
     *               
     * 
     */
    INVALID_VIDEO_ID,

    /**
     * 
     *                 Video id is syntactically valid but the video was not found.
     *               
     * 
     */
    VIDEO_NOT_FOUND,

    /**
     * 
     *                 Channel name is invalid.
     *               
     * 
     */
    INVALID_CHANNEL,

    /**
     * 
     *                 YouTube is unavailable for requesting video data.
     *               
     * 
     */
    VIDEO_LOOKUP_SERVICE_UNAVAILABLE,

    /**
     * 
     *                 Video search service is unavailable.
     *               
     * 
     */
    VIDEO_SEARCH_SERVICE_UNAVAILABLE,

    /**
     * 
     *                 Channel search service is unavailable.
     *               
     * 
     */
    CHANNEL_SEARCH_SERVICE_UNAVAILABLE,

    /**
     * 
     *                 YouTube Analytics service is unavailable.
     *               
     * 
     */
    YOUTUBE_ANALYTICS_SERVICE_UNAVAILABLE,

    /**
     * 
     *                 Video does not belong to one of the linked YouTube accounts.
     *               
     * 
     */
    VIDEO_NOT_OWNED_BY_LINKED_ACCOUNT,

    /**
     * 
     *                 Video is not enabled for call-to-action.
     *               
     * 
     */
    VIDEO_NOT_ENABLED_FOR_CALL_TO_ACTION,

    /**
     * 
     *                 Video does not have a call-to-action.
     *               
     * 
     */
    CALL_TO_ACTION_NOT_FOUND,

    /**
     * 
     *                 Invalid call-to-action.
     *               
     * 
     */
    INVALID_CALL_TO_ACTION,

    /**
     * 
     *                 Unknown error while creating call-to-action.
     *               
     * 
     */
    UNKNOWN_CALL_TO_ACTION_ERROR,

    /**
     * 
     *                 The call-to-action string has too many characters.
     *               
     * 
     */
    CALL_TO_ACTION_TOO_LONG,

    /**
     * 
     *                 The call-to-action url format is invalid. e.g. http://www.example.com here/ or contains
     *                 invalid characters.
     *               
     * 
     */
    CALL_TO_ACTION_INVALID_FORMAT,

    /**
     * 
     *                 The call-to-action string contains invalid characters.
     *               
     * 
     */
    CALL_TO_ACTION_INVALID_CHARS,

    /**
     * 
     *                 The call-to-action string is invalid, but there is no precise error.
     *               
     * 
     */
    CALL_TO_ACTION_INVALID_INPUT,

    /**
     * 
     *                 Format is invalid. e.g. http://www.example.com here
     *               
     * 
     */
    INVALID_FORMAT,
    INVALID_INPUT,

    /**
     * 
     *                 The call-to-action thumbnail image does not have a supported filesize.
     *               
     * 
     */
    INVALID_IMAGE_FILESIZE,

    /**
     * 
     *                 The call-to-action thumbnail image is not in a supported format.
     *               
     * 
     */
    UNSUPPORTED_IMAGE_FORMAT,

    /**
     * 
     *                 VideoId is not unique for the request.
     *               
     * 
     */
    DUPLICATE_VIDEO_ID,

    /**
     * 
     *                 The string has too many characters.
     *               
     * 
     */
    TOO_LONG;

    public String value() {
        return name();
    }

    public static VideoServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
