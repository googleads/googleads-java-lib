
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdsApiError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdsApiError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNHANDLED_ADS_API_ERROR"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="UNEXPECTED_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdsApiError.Reason")
@XmlEnum
public enum AdsApiErrorReason {


    /**
     * 
     *                 Error from ads api that is not handled/converted to video api error.
     *               
     * 
     */
    UNHANDLED_ADS_API_ERROR,

    /**
     * 
     *                 (Permanent) error caused by the service implementation. Potential bug.
     *               
     * 
     */
    INTERNAL_ERROR,

    /**
     * 
     *                 Error from ads api that is not supposed to be received. Potential bug.
     *               
     * 
     */
    UNEXPECTED_ERROR,

    /**
     * 
     *                 Unspecified.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdsApiErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
