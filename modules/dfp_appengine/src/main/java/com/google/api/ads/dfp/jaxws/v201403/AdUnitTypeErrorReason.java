
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnitTypeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnitTypeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILE_APP_PLATFORM_NOT_VALID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdUnitTypeError.Reason")
@XmlEnum
public enum AdUnitTypeErrorReason {


    /**
     * 
     *                 Non-mobile {@link AdUnit} cannot have a mobile application platform.
     *               
     * 
     */
    MOBILE_APP_PLATFORM_NOT_VALID,

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

    public static AdUnitTypeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
