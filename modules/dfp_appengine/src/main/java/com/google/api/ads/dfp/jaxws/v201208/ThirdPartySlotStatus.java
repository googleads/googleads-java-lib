
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartySlot.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartySlot.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartySlot.Status")
@XmlEnum
public enum ThirdPartySlotStatus {


    /**
     * 
     *                 The {@code ThirdPartySlot} is active and in use.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 {@code ThirdPartySlot}s are archived rather than deleted.
     *               
     * 
     */
    ARCHIVED;

    public String value() {
        return name();
    }

    public static ThirdPartySlotStatus fromValue(String v) {
        return valueOf(v);
    }

}
