
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryTimeZone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryTimeZone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLISHER"/>
 *     &lt;enumeration value="BROWSER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryTimeZone")
@XmlEnum
public enum DeliveryTimeZone {


    /**
     * 
     *                 Use the time zone of the publisher.
     *               
     * 
     */
    PUBLISHER,

    /**
     * 
     *                 Use the time zone of the browser.
     *               
     * 
     */
    BROWSER;

    public String value() {
        return name();
    }

    public static DeliveryTimeZone fromValue(String v) {
        return valueOf(v);
    }

}
