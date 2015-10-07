
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyRedirectAd.ExpandingDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyRedirectAd.ExpandingDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="EXPANDING_UP"/>
 *     &lt;enumeration value="EXPANDING_DOWN"/>
 *     &lt;enumeration value="EXPANDING_LEFT"/>
 *     &lt;enumeration value="EXPANDING_RIGHT"/>
 *     &lt;enumeration value="EXPANDING_UPLEFT"/>
 *     &lt;enumeration value="EXPANDING_UPRIGHT"/>
 *     &lt;enumeration value="EXPANDING_DOWNLEFT"/>
 *     &lt;enumeration value="EXPANDING_DOWNRIGHT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyRedirectAd.ExpandingDirection")
@XmlEnum
public enum ThirdPartyRedirectAdExpandingDirection {


    /**
     * 
     *                 Whether the ad can be expanded is unknown.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The ad is allowed to expand upward.
     *               
     * 
     */
    EXPANDING_UP,

    /**
     * 
     *                 The ad is allowed to expand downward.
     *               
     * 
     */
    EXPANDING_DOWN,

    /**
     * 
     *                 The ad is allowed to expand leftward.
     *               
     * 
     */
    EXPANDING_LEFT,

    /**
     * 
     *                 The ad is allowed to expand rightward.
     *               
     * 
     */
    EXPANDING_RIGHT,

    /**
     * 
     *                 The ad is allowed to expand toward the up-left corner.
     *               
     * 
     */
    EXPANDING_UPLEFT,

    /**
     * 
     *                 The ad is allowed to expand toward the up-right corner.
     *               
     * 
     */
    EXPANDING_UPRIGHT,

    /**
     * 
     *                 The ad is allowed to expand toward the down-left corner.
     *               
     * 
     */
    EXPANDING_DOWNLEFT,

    /**
     * 
     *                 The ad is allowed to expand toward the down-right corner.
     *               
     * 
     */
    EXPANDING_DOWNRIGHT;

    public String value() {
        return name();
    }

    public static ThirdPartyRedirectAdExpandingDirection fromValue(String v) {
        return valueOf(v);
    }

}
