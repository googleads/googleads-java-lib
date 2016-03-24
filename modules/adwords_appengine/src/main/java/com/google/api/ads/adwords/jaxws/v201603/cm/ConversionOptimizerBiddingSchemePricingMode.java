
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionOptimizerBiddingScheme.PricingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionOptimizerBiddingScheme.PricingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLICKS"/>
 *     &lt;enumeration value="CONVERSIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionOptimizerBiddingScheme.PricingMode")
@XmlEnum
public enum ConversionOptimizerBiddingSchemePricingMode {

    CLICKS,
    CONVERSIONS;

    public String value() {
        return name();
    }

    public static ConversionOptimizerBiddingSchemePricingMode fromValue(String v) {
        return valueOf(v);
    }

}
