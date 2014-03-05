
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROWSER"/>
 *     &lt;enumeration value="VIDEO_PLAYER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentType")
@XmlEnum
public enum EnvironmentType {


    /**
     * 
     *                 A regular web browser.
     *               
     * 
     */
    BROWSER,

    /**
     * 
     *                 Video players (such as Flash applications).
     *               
     * 
     */
    VIDEO_PLAYER;

    public String value() {
        return name();
    }

    public static EnvironmentType fromValue(String v) {
        return valueOf(v);
    }

}
