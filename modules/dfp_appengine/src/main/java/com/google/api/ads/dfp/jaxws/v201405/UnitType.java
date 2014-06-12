
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPRESSIONS"/>
 *     &lt;enumeration value="CLICKS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitType")
@XmlEnum
public enum UnitType {


    /**
     * 
     *                 The number of impressions served by creatives associated with the line
     *                 item. Line items of all {@link LineItemType} support this {@code UnitType}.
     *               
     * 
     */
    IMPRESSIONS,

    /**
     * 
     *                 The number of clicks reported by creatives associated with the line item.
     *                 The {@link LineItem#lineItemType} must be
     *                 {@link LineItemType#STANDARD}, {@link LineItemType#BULK} or
     *                 {@link LineItemType#PRICE_PRIORITY}.
     *               
     * 
     */
    CLICKS;

    public String value() {
        return name();
    }

    public static UnitType fromValue(String v) {
        return valueOf(v);
    }

}
