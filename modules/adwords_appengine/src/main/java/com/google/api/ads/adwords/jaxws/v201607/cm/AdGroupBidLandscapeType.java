
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupBidLandscape.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupBidLandscape.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNIFORM"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupBidLandscape.Type")
@XmlEnum
public enum AdGroupBidLandscapeType {


    /**
     * 
     *                 Signifies that the bid of this ad group was applied to all criteria under the ad group.
     *                 Criteria with bid overrides are <em>included</em>, but the overrides on these criteria
     *                 were ignored when generating the landscape.
     *               
     * 
     */
    UNIFORM,

    /**
     * 
     *                 Signifies that the bid of this ad group was only applied to the ad group itself.
     *                 Criteria with bid overrides are <em>excluded</em>.
     *               
     * 
     */
    DEFAULT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupBidLandscapeType fromValue(String v) {
        return valueOf(v);
    }

}
