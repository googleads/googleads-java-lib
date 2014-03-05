
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemSummary.Duration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemSummary.Duration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="LIFETIME"/>
 *     &lt;enumeration value="DAILY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemSummary.Duration")
@XmlEnum
public enum LineItemSummaryDuration {


    /**
     * 
     *                 There is no limit on the number of ads delivered. The
     *                 {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#CLICK_TRACKING}</li>
     *                 </ul>
     *                 or if the {@link LineItem} is a Cost-Per-Action (CPA) {@link LineItem}.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 There is a limit on the number of ads delivered for this line item during
     *                 its entire life time. The {@link LineItem#lineItemType} must be
     *                 one of:
     *                 <ul>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#ADSENSE}</li>
     *                 <li>{@link LineItemType#AD_EXCHANGE}</li>
     *                 <li>{@link LineItemType#ADMOB}</li>
     *                 <li>{@link LineItemType#CLICK_TRACKING}</li>
     *                 </ul>
     *               
     * 
     */
    LIFETIME,

    /**
     * 
     *                 There is a daily limit on the number of ads delivered for this line item.
     *                 The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 <li>{@link LineItemType#ADSENSE}</li>
     *                 <li>{@link LineItemType#AD_EXCHANGE}</li>
     *                 <li>{@link LineItemType#ADMOB}</li>
     *                 <li>{@link LineItemType#BUMPER}</li>
     *                 </ul>
     *               
     * 
     */
    DAILY;

    public String value() {
        return name();
    }

    public static LineItemSummaryDuration fromValue(String v) {
        return valueOf(v);
    }

}
