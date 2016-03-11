
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proximity.DistanceUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Proximity.DistanceUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KILOMETERS"/>
 *     &lt;enumeration value="MILES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Proximity.DistanceUnits")
@XmlEnum
public enum ProximityDistanceUnits {


    /**
     * 
     *                 The unit of distance is kilometer.
     *               
     * 
     */
    KILOMETERS,

    /**
     * 
     *                 The unit of distance is mile.
     *               
     * 
     */
    MILES;

    public String value() {
        return name();
    }

    public static ProximityDistanceUnits fromValue(String v) {
        return valueOf(v);
    }

}
