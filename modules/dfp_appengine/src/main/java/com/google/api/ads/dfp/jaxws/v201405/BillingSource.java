
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTRACTED"/>
 *     &lt;enumeration value="DFP_VOLUME"/>
 *     &lt;enumeration value="THIRD_PARTY_VOLUME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingSource")
@XmlEnum
public enum BillingSource {


    /**
     * 
     *                 Charge based on the quantity of impressions, clicks, or days booked, regardless of
     *                 what actually delivered.
     *               
     * 
     */
    CONTRACTED,

    /**
     * 
     *                 Charge based on what actually delivered counted by DFP
     *               
     * 
     */
    DFP_VOLUME,

    /**
     * 
     *                 Charge based on what actually delivered counted by third party ads server
     *               
     * 
     */
    THIRD_PARTY_VOLUME,

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

    public static BillingSource fromValue(String v) {
        return valueOf(v);
    }

}
