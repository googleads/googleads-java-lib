
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanoeSyncResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanoeSyncResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanoeSyncResult")
@XmlEnum
public enum CanoeSyncResult {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Sync message was accepted by Canoe.
     *               
     * 
     */
    ACCEPTED,

    /**
     * 
     *                 Sync message was rejected by Canoe.
     *               
     * 
     */
    REJECTED;

    public String value() {
        return name();
    }

    public static CanoeSyncResult fromValue(String v) {
        return valueOf(v);
    }

}
