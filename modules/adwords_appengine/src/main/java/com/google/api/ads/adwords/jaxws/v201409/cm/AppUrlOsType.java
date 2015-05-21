
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppUrl.OsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppUrl.OsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OS_TYPE_IOS"/>
 *     &lt;enumeration value="OS_TYPE_ANDROID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppUrl.OsType")
@XmlEnum
public enum AppUrlOsType {


    /**
     * 
     *                 The Apple IOS operating system,
     *               
     * 
     */
    OS_TYPE_IOS,

    /**
     * 
     *                 The Android operating system.
     *               
     * 
     */
    OS_TYPE_ANDROID,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AppUrlOsType fromValue(String v) {
        return valueOf(v);
    }

}
