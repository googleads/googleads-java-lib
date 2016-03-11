
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPA"/>
 *     &lt;enumeration value="CPC"/>
 *     &lt;enumeration value="CPD"/>
 *     &lt;enumeration value="CPM"/>
 *     &lt;enumeration value="VCPM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostType")
@XmlEnum
public enum CostType {


    /**
     * 
     *                 Cost per action. The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 </ul>
     *               
     * 
     */
    CPA,

    /**
     * 
     *                 Cost per click. The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 </ul>
     *               
     * 
     */
    CPC,

    /**
     * 
     *                 Cost per day. The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}<li>
     *                 <li>{@link LineItemType#NETWORK}<li>
     *                 </ul>
     *               
     * 
     */
    CPD,

    /**
     * 
     *                 Cost per mille (cost per thousand impressions). The
     *                 {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 </ul>
     *               
     * 
     */
    CPM,

    /**
     * 
     *                 Cost per thousand Active View viewable impressions. The {@link LineItem#lineItemType}
     *                 must be {@link LineItemType#STANDARD}.
     *               
     * 
     */
    VCPM,

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

    public static CostType fromValue(String v) {
        return valueOf(v);
    }

}
