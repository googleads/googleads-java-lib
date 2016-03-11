
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SslManualOverride.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SslManualOverride">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NO_OVERRIDE"/>
 *     &lt;enumeration value="SSL_COMPATIBLE"/>
 *     &lt;enumeration value="NOT_SSL_COMPATIBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SslManualOverride")
@XmlEnum
public enum SslManualOverride {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,
    NO_OVERRIDE,
    SSL_COMPATIBLE,
    NOT_SSL_COMPATIBLE;

    public String value() {
        return name();
    }

    public static SslManualOverride fromValue(String v) {
        return valueOf(v);
    }

}
