
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingCap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingCap">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CAP"/>
 *     &lt;enumeration value="CAPPED_CUMULATIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingCap")
@XmlEnum
public enum BillingCap {


    /**
     * 
     *                 There is no cap for each billing month.
     *               
     * 
     */
    NO_CAP,

    /**
     * 
     *                 Use a billing source of capped actuals with a billing cap of cumulative to bill your
     *                 advertiser up to a campaign's capped amount, regardless of the number of impressions that
     *                 are served each month.
     *               
     * 
     */
    CAPPED_CUMULATIVE,

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

    public static BillingCap fromValue(String v) {
        return valueOf(v);
    }

}
