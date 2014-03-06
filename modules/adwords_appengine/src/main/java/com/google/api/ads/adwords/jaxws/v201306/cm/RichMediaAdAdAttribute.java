
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichMediaAd.AdAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaAd.AdAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ROLL_OVER_TO_EXPAND"/>
 *     &lt;enumeration value="SSL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichMediaAd.AdAttribute")
@XmlEnum
public enum RichMediaAdAdAttribute {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Indicates that the ad supports mouse roll over to expand.
     *               
     * 
     */
    ROLL_OVER_TO_EXPAND,

    /**
     * 
     *                 Indicates that the ad supports SSL.
     *               
     * 
     */
    SSL;

    public String value() {
        return name();
    }

    public static RichMediaAdAdAttribute fromValue(String v) {
        return valueOf(v);
    }

}
