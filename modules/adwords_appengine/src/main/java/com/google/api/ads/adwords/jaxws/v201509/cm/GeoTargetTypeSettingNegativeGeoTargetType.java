
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoTargetTypeSetting.NegativeGeoTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoTargetTypeSetting.NegativeGeoTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DONT_CARE"/>
 *     &lt;enumeration value="LOCATION_OF_PRESENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoTargetTypeSetting.NegativeGeoTargetType")
@XmlEnum
public enum GeoTargetTypeSettingNegativeGeoTargetType {


    /**
     * 
     *                 Specifies that a user is excluded from seeing the ad
     *                 if either their AOI or their LOP matches the geo target.
     *               
     * 
     */
    DONT_CARE,

    /**
     * 
     *                 Specifies that a user is excluded from seeing the ad
     *                 only if their LOP matches the geo target.
     *               
     * 
     */
    LOCATION_OF_PRESENCE;

    public String value() {
        return name();
    }

    public static GeoTargetTypeSettingNegativeGeoTargetType fromValue(String v) {
        return valueOf(v);
    }

}
