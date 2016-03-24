
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoTargetTypeSetting.PositiveGeoTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoTargetTypeSetting.PositiveGeoTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DONT_CARE"/>
 *     &lt;enumeration value="AREA_OF_INTEREST"/>
 *     &lt;enumeration value="LOCATION_OF_PRESENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoTargetTypeSetting.PositiveGeoTargetType")
@XmlEnum
public enum GeoTargetTypeSettingPositiveGeoTargetType {


    /**
     * 
     *                 Specifies that either AOI or LOP may trigger the ad.
     *               
     * 
     */
    DONT_CARE,

    /**
     * 
     *                 Specifies that the ad is triggered only if the user's AOI matches.
     *               
     * 
     */
    AREA_OF_INTEREST,

    /**
     * 
     *                 Specifies that the ad is triggered only if the user's LOP matches.
     *               
     * 
     */
    LOCATION_OF_PRESENCE;

    public String value() {
        return name();
    }

    public static GeoTargetTypeSettingPositiveGeoTargetType fromValue(String v) {
        return valueOf(v);
    }

}
