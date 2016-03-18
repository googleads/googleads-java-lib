
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_VIDEO"/>
 *     &lt;enumeration value="STORAGE_ERROR"/>
 *     &lt;enumeration value="BAD_REQUEST"/>
 *     &lt;enumeration value="ERROR_GENERATING_STREAMING_URL"/>
 *     &lt;enumeration value="UNEXPECTED_SIZE"/>
 *     &lt;enumeration value="SERVER_ERROR"/>
 *     &lt;enumeration value="FILE_TOO_LARGE"/>
 *     &lt;enumeration value="VIDEO_PROCESSING_ERROR"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="PROBLEM_READING_FILE"/>
 *     &lt;enumeration value="INVALID_ISCI"/>
 *     &lt;enumeration value="INVALID_AD_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoError.Reason")
@XmlEnum
public enum VideoErrorReason {


    /**
     * 
     *                 Invalid video.
     *               
     * 
     */
    INVALID_VIDEO,

    /**
     * 
     *                 Storage error.
     *               
     * 
     */
    STORAGE_ERROR,

    /**
     * 
     *                 Bad request.
     *               
     * 
     */
    BAD_REQUEST,

    /**
     * 
     *                 Server error.
     *               
     * 
     */
    ERROR_GENERATING_STREAMING_URL,

    /**
     * 
     *                 Unexpected size.
     *               
     * 
     */
    UNEXPECTED_SIZE,

    /**
     * 
     *                 Server error.
     *               
     * 
     */
    SERVER_ERROR,

    /**
     * 
     *                 File too large.
     *               
     * 
     */
    FILE_TOO_LARGE,

    /**
     * 
     *                 Video processing error.
     *               
     * 
     */
    VIDEO_PROCESSING_ERROR,

    /**
     * 
     *                 Invalid input.
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 Problem reading file.
     *               
     * 
     */
    PROBLEM_READING_FILE,

    /**
     * 
     *                 Invalid ISCI.
     *               
     * 
     */
    INVALID_ISCI,

    /**
     * 
     *                 Invalid AD-ID.
     *               
     * 
     */
    INVALID_AD_ID;

    public String value() {
        return name();
    }

    public static VideoErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
