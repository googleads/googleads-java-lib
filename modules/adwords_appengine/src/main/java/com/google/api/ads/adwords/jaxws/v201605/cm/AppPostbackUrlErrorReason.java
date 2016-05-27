
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppPostbackUrlError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppPostbackUrlError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_URL_FORMAT"/>
 *     &lt;enumeration value="INVALID_DOMAIN"/>
 *     &lt;enumeration value="REQUIRED_MACRO_NOT_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppPostbackUrlError.Reason")
@XmlEnum
public enum AppPostbackUrlErrorReason {


    /**
     * 
     *                 Invalid Url format.
     *               
     * 
     */
    INVALID_URL_FORMAT,

    /**
     * 
     *                 Invalid domain.
     *               
     * 
     */
    INVALID_DOMAIN,

    /**
     * 
     *                 Some of the required macros were not found.
     *               
     * 
     */
    REQUIRED_MACRO_NOT_FOUND;

    public String value() {
        return name();
    }

    public static AppPostbackUrlErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
