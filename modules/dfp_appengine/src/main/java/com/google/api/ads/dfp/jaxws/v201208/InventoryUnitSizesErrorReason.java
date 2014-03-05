
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUnitSizesError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryUnitSizesError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_SIZES"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_ENVIRONMENT"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_MASTER"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_COMPANION"/>
 *     &lt;enumeration value="DUPLICATE_MASTER_SIZES"/>
 *     &lt;enumeration value="ASPECT_RATIO_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryUnitSizesError.Reason")
@XmlEnum
public enum InventoryUnitSizesErrorReason {


    /**
     * 
     *                 A size in the ad unit is too large or too small.
     *               
     * 
     */
    INVALID_SIZES,

    /**
     * 
     *                 A size is an aspect ratio, but the ad unit is not a mobile ad unit.
     *               
     * 
     */
    INVALID_SIZE_FOR_PLATFORM,

    /**
     * 
     *                 A size is video, but the video feature is not enabled.
     *               
     * 
     */
    INVALID_SIZE_FOR_ENVIRONMENT,

    /**
     * 
     *                 A size that has companions must have an environment of VIDEO_PLAYER.
     *               
     * 
     */
    INVALID_SIZE_FOR_MASTER,

    /**
     * 
     *                 A size that is a companion must have an environment of BROWSER.
     *               
     * 
     */
    INVALID_SIZE_FOR_COMPANION,

    /**
     * 
     *                 Duplicate video master sizes are not allowed.
     *               
     * 
     */
    DUPLICATE_MASTER_SIZES,

    /**
     * 
     *                 A size is an aspect ratio, but aspect ratio sizes are not enabled.
     *               
     * 
     */
    ASPECT_RATIO_NOT_SUPPORTED,

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

    public static InventoryUnitSizesErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
