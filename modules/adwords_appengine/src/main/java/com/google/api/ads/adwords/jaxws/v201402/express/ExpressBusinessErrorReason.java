
package com.google.api.ads.adwords.jaxws.v201402.express;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressBusinessError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpressBusinessError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_WEBSITE"/>
 *     &lt;enumeration value="INVALID_ADDRESS"/>
 *     &lt;enumeration value="INVALID_PHONE_NUMBER"/>
 *     &lt;enumeration value="PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpressBusinessError.Reason")
@XmlEnum
public enum ExpressBusinessErrorReason {


    /**
     * 
     *                 Website is invalid.
     *               
     * 
     */
    INVALID_WEBSITE,

    /**
     * 
     *                 Address is invalid or cannot be geocoded using the specified geo point.
     *               
     * 
     */
    INVALID_ADDRESS,

    /**
     * 
     *                 Phone number is invalid.
     *               
     * 
     */
    INVALID_PHONE_NUMBER,

    /**
     * 
     *                 Premium rate phone numbers e.g. 1-900 numbers not allowed.
     *               
     * 
     */
    PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Default error.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ExpressBusinessErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
