
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SslScanResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SslScanResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNSCANNED"/>
 *     &lt;enumeration value="SCANNED_SSL"/>
 *     &lt;enumeration value="SCANNED_NON_SSL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SslScanResult")
@XmlEnum
public enum SslScanResult {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,
    UNSCANNED,
    SCANNED_SSL,
    SCANNED_NON_SSL;

    public String value() {
        return name();
    }

    public static SslScanResult fromValue(String v) {
        return valueOf(v);
    }

}
