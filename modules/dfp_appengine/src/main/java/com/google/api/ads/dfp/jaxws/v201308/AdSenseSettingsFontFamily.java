
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdSenseSettings.FontFamily.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSenseSettings.FontFamily">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="ARIAL"/>
 *     &lt;enumeration value="TAHOMA"/>
 *     &lt;enumeration value="GEORGIA"/>
 *     &lt;enumeration value="TIMES"/>
 *     &lt;enumeration value="VERDANA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdSenseSettings.FontFamily")
@XmlEnum
public enum AdSenseSettingsFontFamily {

    DEFAULT,
    ARIAL,
    TAHOMA,
    GEORGIA,
    TIMES,
    VERDANA;

    public String value() {
        return name();
    }

    public static AdSenseSettingsFontFamily fromValue(String v) {
        return valueOf(v);
    }

}
