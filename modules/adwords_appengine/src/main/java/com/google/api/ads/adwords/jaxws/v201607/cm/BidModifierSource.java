
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidModifierSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidModifierSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CAMPAIGN"/>
 *     &lt;enumeration value="AD_GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BidModifierSource")
@XmlEnum
public enum BidModifierSource {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The bid modifier is specified at the campaign level, on the campaign level
     *                 criterion.
     *               
     * 
     */
    CAMPAIGN,

    /**
     * 
     *                 The bid modifier is specified (overridden) at the ad group level.
     *               
     * 
     */
    AD_GROUP;

    public String value() {
        return name();
    }

    public static BidModifierSource fromValue(String v) {
        return valueOf(v);
    }

}
