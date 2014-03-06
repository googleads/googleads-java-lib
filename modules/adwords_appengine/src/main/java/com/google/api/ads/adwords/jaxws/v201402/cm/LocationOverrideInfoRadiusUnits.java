
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationOverrideInfo.RadiusUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationOverrideInfo.RadiusUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KILOMETERS"/>
 *     &lt;enumeration value="MILES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationOverrideInfo.RadiusUnits")
@XmlEnum
public enum LocationOverrideInfoRadiusUnits {


    /**
     * 
     *                 In kilometers.
     *               
     * 
     */
    KILOMETERS,

    /**
     * 
     *                 In miles.
     *               
     * 
     */
    MILES;

    public String value() {
        return name();
    }

    public static LocationOverrideInfoRadiusUnits fromValue(String v) {
        return valueOf(v);
    }

}
