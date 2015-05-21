
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidPhoneNumberError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvalidPhoneNumberError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_FORMAT"/>
 *     &lt;enumeration value="TOO_SHORT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvalidPhoneNumberError.Reason")
@XmlEnum
public enum InvalidPhoneNumberErrorReason {


    /**
     * 
     *                 The phone number is invalid.
     *               
     * 
     */
    INVALID_FORMAT,

    /**
     * 
     *                 The phone number is too short.
     *               
     * 
     */
    TOO_SHORT,

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

    public static InvalidPhoneNumberErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
