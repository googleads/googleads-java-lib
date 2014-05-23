
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdServingOptimizationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdServingOptimizationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPTIMIZE"/>
 *     &lt;enumeration value="CONVERSION_OPTIMIZE"/>
 *     &lt;enumeration value="ROTATE"/>
 *     &lt;enumeration value="ROTATE_FOREVER"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdServingOptimizationStatus")
@XmlEnum
public enum AdServingOptimizationStatus {


    /**
     * 
     *                 Ad serving is optimized based on CTR for the campaign.
     *               
     * 
     */
    OPTIMIZE,

    /**
     * 
     *                 Ad serving is optimized based on CTR * Conversion for the campaign.
     *               
     * 
     */
    CONVERSION_OPTIMIZE,

    /**
     * 
     *                 Ads are rotated evenly.
     *               
     * 
     */
    ROTATE,

    /**
     * 
     *                 Ads are rotated evenly forever.
     *               
     * 
     */
    ROTATE_FOREVER,

    /**
     * 
     *                 Ad serving optimization status is not available.
     *               
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static AdServingOptimizationStatus fromValue(String v) {
        return valueOf(v);
    }

}
