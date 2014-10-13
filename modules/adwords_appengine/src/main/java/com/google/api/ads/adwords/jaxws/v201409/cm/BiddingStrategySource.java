
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingStrategySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingStrategySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN"/>
 *     &lt;enumeration value="ADGROUP"/>
 *     &lt;enumeration value="CRITERION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingStrategySource")
@XmlEnum
public enum BiddingStrategySource {


    /**
     * 
     *                 Bidding strategy is defined on campaign level.
     *               
     * 
     */
    CAMPAIGN,

    /**
     * 
     *                 Bidding strategy is defined on adgroup level.
     *               
     * 
     */
    ADGROUP,

    /**
     * 
     *                 Bidding strategy is defined on criterion level.
     *               
     * 
     */
    CRITERION;

    public String value() {
        return name();
    }

    public static BiddingStrategySource fromValue(String v) {
        return valueOf(v);
    }

}
