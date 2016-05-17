
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DFP"/>
 *     &lt;enumeration value="OFFLINE"/>
 *     &lt;enumeration value="NON_DFP"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductType")
@XmlEnum
public enum ProductType {


    /**
     * 
     *                 For line items that are booked and managed in DFP.
     *               
     * 
     */
    DFP,

    /**
     * 
     *                 Offline charges indicate services you render for a client which are also outside of the DFP
     *                 system, such as consulting or creative services.
     *               
     * 
     */
    OFFLINE,

    /**
     * 
     *                 For campaigns that are booked and managed by a third party outside of DFP.
     *               
     * 
     */
    NON_DFP,

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

    public static ProductType fromValue(String v) {
        return valueOf(v);
    }

}
