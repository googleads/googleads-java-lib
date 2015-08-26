
package com.google.api.ads.dfp.jaxws.v201508;

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
 *     &lt;enumeration value="CLICK_THROUGH_CPA_CONVERSIONS"/>
 *     &lt;enumeration value="VIEW_THROUGH_CPA_CONVERSIONS"/>
 *     &lt;enumeration value="TOTAL_CPA_CONVERSIONS"/>
 *     &lt;enumeration value="UNKNOWN"/>
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
    CLICKS,

    /**
     * 
     *                 The number of click-through Cost-Per-Action (CPA) conversions from creatives
     *                 associated with the line item. This is only supported as secondary goal and the
     *                 {@link LineItem#costType} must be {@link CostType#CPA}.
     *               
     * 
     */
    CLICK_THROUGH_CPA_CONVERSIONS,

    /**
     * 
     *                 The number of view-through Cost-Per-Action (CPA) conversions from creatives
     *                 associated with the line item. This is only supported as secondary goal and the
     *                 {@link LineItem#costType} must be {@link CostType#CPA}.
     *               
     * 
     */
    VIEW_THROUGH_CPA_CONVERSIONS,

    /**
     * 
     *                 The number of total Cost-Per-Action (CPA) conversions from creatives
     *                 associated with the line item. This is only supported as secondary goal and the
     *                 {@link LineItem#costType} must be {@link CostType#CPA}.
     *               
     * 
     */
    TOTAL_CPA_CONVERSIONS,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static UnitType fromValue(String v) {
        return valueOf(v);
    }

}
