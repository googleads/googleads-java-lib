
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppConversion.AppPlatform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppConversion.AppPlatform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ITUNES"/>
 *     &lt;enumeration value="ANDROID_MARKET"/>
 *     &lt;enumeration value="MOBILE_APP_CHANNEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppConversion.AppPlatform")
@XmlEnum
public enum AppConversionAppPlatform {

    NONE,
    ITUNES,
    ANDROID_MARKET,
    MOBILE_APP_CHANNEL;

    public String value() {
        return name();
    }

    public static AppConversionAppPlatform fromValue(String v) {
        return valueOf(v);
    }

}
