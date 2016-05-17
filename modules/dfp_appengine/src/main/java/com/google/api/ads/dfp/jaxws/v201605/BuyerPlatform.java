
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerPlatform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPlatform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DCM"/>
 *     &lt;enumeration value="DBM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuyerPlatform")
@XmlEnum
public enum BuyerPlatform {


    /**
     * 
     *                 Indicates that the buyer being billed is a DoubleClick Campaign Manager account user.
     *               
     * 
     */
    DCM,

    /**
     * 
     *                 Indicates that the buyer being billed is a DoubleClick Bid Manager account user.
     *               
     * 
     */
    DBM,

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

    public static BuyerPlatform fromValue(String v) {
        return valueOf(v);
    }

}
