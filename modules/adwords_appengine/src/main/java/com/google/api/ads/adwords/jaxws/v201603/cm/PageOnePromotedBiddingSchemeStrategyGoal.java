
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageOnePromotedBiddingScheme.StrategyGoal.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageOnePromotedBiddingScheme.StrategyGoal">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAGE_ONE"/>
 *     &lt;enumeration value="PAGE_ONE_PROMOTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageOnePromotedBiddingScheme.StrategyGoal")
@XmlEnum
public enum PageOnePromotedBiddingSchemeStrategyGoal {


    /**
     * 
     *                 First page on google.com.
     *               
     * 
     */
    PAGE_ONE,

    /**
     * 
     *                 Top slots of the first page on google.com.
     *               
     * 
     */
    PAGE_ONE_PROMOTED;

    public String value() {
        return name();
    }

    public static PageOnePromotedBiddingSchemeStrategyGoal fromValue(String v) {
        return valueOf(v);
    }

}
