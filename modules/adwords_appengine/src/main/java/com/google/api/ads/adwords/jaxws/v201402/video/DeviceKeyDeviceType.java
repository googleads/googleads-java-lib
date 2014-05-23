
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceKey.DeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceKey.DeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESKTOP"/>
 *     &lt;enumeration value="HIGHENDMOBILE"/>
 *     &lt;enumeration value="TABLET"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceKey.DeviceType")
@XmlEnum
public enum DeviceKeyDeviceType {

    DESKTOP,
    HIGHENDMOBILE,
    TABLET,
    OTHER;

    public String value() {
        return name();
    }

    public static DeviceKeyDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
