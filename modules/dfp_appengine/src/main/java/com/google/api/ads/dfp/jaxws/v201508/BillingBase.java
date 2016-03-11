
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingBase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VOLUME"/>
 *     &lt;enumeration value="REVENUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingBase")
@XmlEnum
public enum BillingBase {


    /**
     * 
     *                 Billing calculation (eg. proration) should be based on volume.
     *               
     * 
     */
    VOLUME,

    /**
     * 
     *                 Billing calculation (eg. proration) should be based on revenue.
     *               
     * 
     */
    REVENUE,

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

    public static BillingBase fromValue(String v) {
        return valueOf(v);
    }

}
