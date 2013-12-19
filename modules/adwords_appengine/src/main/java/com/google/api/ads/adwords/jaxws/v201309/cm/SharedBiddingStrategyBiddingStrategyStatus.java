
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedBiddingStrategy.BiddingStrategyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharedBiddingStrategy.BiddingStrategyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SharedBiddingStrategy.BiddingStrategyStatus")
@XmlEnum
public enum SharedBiddingStrategyBiddingStrategyStatus {

    ACTIVE,
    DELETED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SharedBiddingStrategyBiddingStrategyStatus fromValue(String v) {
        return valueOf(v);
    }

}
