
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionSetting.Platform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtensionSetting.Platform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESKTOP"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtensionSetting.Platform")
@XmlEnum
public enum ExtensionSettingPlatform {


    /**
     * 
     *                 Desktop only.
     *               
     * 
     */
    DESKTOP,

    /**
     * 
     *                 Mobile only.
     *               
     * 
     */
    MOBILE,

    /**
     * 
     *                 No restriction.
     *               
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ExtensionSettingPlatform fromValue(String v) {
        return valueOf(v);
    }

}
