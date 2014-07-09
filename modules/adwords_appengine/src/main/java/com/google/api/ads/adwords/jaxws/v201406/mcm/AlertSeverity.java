
package com.google.api.ads.adwords.jaxws.v201406.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GREEN"/>
 *     &lt;enumeration value="YELLOW"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertSeverity")
@XmlEnum
public enum AlertSeverity {


    /**
     * 
     *                 Green alerts are purely informational. The serving of ads isn't affected.
     *               
     * 
     */
    GREEN,

    /**
     * 
     *                 Yellow alerts include problems that cause some ads from being served, or may eventually
     *                 cause all ads of an account not to be served.
     *               
     * 
     */
    YELLOW,

    /**
     * 
     *                 Red alerts indicate ads have stopped being served for an entire account.
     *               
     * 
     */
    RED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AlertSeverity fromValue(String v) {
        return valueOf(v);
    }

}
