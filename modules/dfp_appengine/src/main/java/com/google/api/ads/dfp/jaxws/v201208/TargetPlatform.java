
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetPlatform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetPlatform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="MOBILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetPlatform")
@XmlEnum
public enum TargetPlatform {


    /**
     * 
     *                 The desktop web.
     *               
     * 
     */
    WEB,

    /**
     * 
     *                 Mobile devices.
     *               
     * 
     */
    MOBILE;

    public String value() {
        return name();
    }

    public static TargetPlatform fromValue(String v) {
        return valueOf(v);
    }

}
