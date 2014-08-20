
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MULTI_CURRENCY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY"/>
 *     &lt;enumeration value="NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkError.Reason")
@XmlEnum
public enum NetworkErrorReason {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Multi-currency support is not enabled for this network.  This is a premium feature.
     *               
     * 
     */
    MULTI_CURRENCY_NOT_SUPPORTED,

    /**
     * 
     *                 Currency provided is not supported.
     *               
     * 
     */
    UNSUPPORTED_CURRENCY,

    /**
     * 
     *                 The network currency cannot also be specified as a secondary currency.
     *               
     * 
     */
    NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY;

    public String value() {
        return name();
    }

    public static NetworkErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
