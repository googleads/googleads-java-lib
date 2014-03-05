
package com.google.api.ads.adwords.jaxws.v201309.cm;

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

    UNKNOWN,
    CAMPAIGN,
    AD_GROUP;

    public String value() {
        return name();
    }

    public static BidModifierSource fromValue(String v) {
        return valueOf(v);
    }

}
