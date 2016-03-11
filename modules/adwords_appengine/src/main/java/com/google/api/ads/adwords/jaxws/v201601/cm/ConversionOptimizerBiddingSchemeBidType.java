
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionOptimizerBiddingScheme.BidType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionOptimizerBiddingScheme.BidType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TARGET_CPA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionOptimizerBiddingScheme.BidType")
@XmlEnum
public enum ConversionOptimizerBiddingSchemeBidType {


    /**
     * 
     *                 Average cost-per-acquisition (targetCPA) bid type.
     *               
     * 
     */
    TARGET_CPA;

    public String value() {
        return name();
    }

    public static ConversionOptimizerBiddingSchemeBidType fromValue(String v) {
        return valueOf(v);
    }

}
