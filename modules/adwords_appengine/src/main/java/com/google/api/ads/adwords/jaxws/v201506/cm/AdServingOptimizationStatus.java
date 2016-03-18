
package com.google.api.ads.adwords.jaxws.v201506.cm;

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
 *     &lt;enumeration value="ROTATE_INDEFINITELY"/>
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
     *                 Ad serving is optimized based on CTR * Conversion for the campaign. If the campaign is not in
     *                 the conversion optimizer bidding strategy, it will default to OPTIMIZED.
     *               
     * 
     */
    CONVERSION_OPTIMIZE,

    /**
     * 
     *                 Ads are rotated evenly for 90 days, then optimized for clicks.
     *               
     * 
     */
    ROTATE,

    /**
     * 
     *                 Show lower performing ads more evenly with higher performing ads, and do not optimize.
     *               
     * 
     */
    ROTATE_INDEFINITELY,

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
