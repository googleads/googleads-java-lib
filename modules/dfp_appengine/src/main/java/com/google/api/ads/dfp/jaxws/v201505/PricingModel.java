
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NET"/>
 *     &lt;enumeration value="GROSS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingModel")
@XmlEnum
public enum PricingModel {


    /**
     * 
     *                 Indicates using net pricing model to calculate the price.
     *               
     * 
     */
    NET,

    /**
     * 
     *                 Indicates using gross pricing model to calculate the price.
     *               
     * 
     */
    GROSS,

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

    public static PricingModel fromValue(String v) {
        return valueOf(v);
    }

}
