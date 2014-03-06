
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppConversion.AppConversionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppConversion.AppConversionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="DOWNLOAD"/>
 *     &lt;enumeration value="IN_APP_PURCHASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppConversion.AppConversionType")
@XmlEnum
public enum AppConversionAppConversionType {

    NONE,
    DOWNLOAD,
    IN_APP_PURCHASE;

    public String value() {
        return name();
    }

    public static AppConversionAppConversionType fromValue(String v) {
        return valueOf(v);
    }

}
