
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoDeliveryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoDeliveryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PROGRESSIVE"/>
 *     &lt;enumeration value="STREAMING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoDeliveryType")
@XmlEnum
public enum VideoDeliveryType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Video will be served through a progressive download.
     *               
     * 
     */
    PROGRESSIVE,

    /**
     * 
     *                 Video will be served via a streaming protocol like RTMP.
     *               
     * 
     */
    STREAMING;

    public String value() {
        return name();
    }

    public static VideoDeliveryType fromValue(String v) {
        return valueOf(v);
    }

}
