
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileDevice.DeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileDevice.DeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEVICE_TYPE_MOBILE"/>
 *     &lt;enumeration value="DEVICE_TYPE_TABLET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobileDevice.DeviceType")
@XmlEnum
public enum MobileDeviceDeviceType {

    DEVICE_TYPE_MOBILE,
    DEVICE_TYPE_TABLET;

    public String value() {
        return name();
    }

    public static MobileDeviceDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
