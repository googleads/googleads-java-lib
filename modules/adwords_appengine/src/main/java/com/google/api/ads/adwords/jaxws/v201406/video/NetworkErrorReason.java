
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPTY"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkError.Reason")
@XmlEnum
public enum NetworkErrorReason {


    /**
     * 
     *                 No network selected.
     *               
     * 
     */
    EMPTY,

    /**
     * 
     *                 Invalid network.
     *               
     * 
     */
    INVALID,

    /**
     * 
     *                 Network combination not allowed.
     *               
     * 
     */
    NOT_ALLOWED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static NetworkErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
