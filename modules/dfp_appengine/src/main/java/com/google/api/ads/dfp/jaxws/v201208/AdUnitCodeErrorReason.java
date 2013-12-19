
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnitCodeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnitCodeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CHARACTERS"/>
 *     &lt;enumeration value="INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED"/>
 *     &lt;enumeration value="LEADING_FORWARD_SLASH"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdUnitCodeError.Reason")
@XmlEnum
public enum AdUnitCodeErrorReason {


    /**
     * 
     *                 For {@link AdUnit#adUnitCode}, only alpha-numeric characters,
     *                 underscores, hyphens, periods, asterisks, double quotes, back slashes,
     *                 forward slashes, exclamations, left angle brackets, colons and
     *                 parentheses are allowed.
     *               
     * 
     */
    INVALID_CHARACTERS,

    /**
     * 
     *                 For {@link AdUnit#adUnitCode}, only letters, numbers,
     *                 underscores, hyphens, periods, asterisks, double quotes, back slashes,
     *                 forward slashes, exclamations, left angle brackets, colons and
     *                 parentheses are allowed.
     *               
     * 
     */
    INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED,

    /**
     * 
     *                 For {@link AdUnit#adUnitCode}, forward slashes are not allowed as
     *                 the first character.
     *               
     * 
     */
    LEADING_FORWARD_SLASH,

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

    public static AdUnitCodeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
