
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServerError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SERVER_ERROR"/>
 *     &lt;enumeration value="SERVER_BUSY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServerError.Reason")
@XmlEnum
public enum ServerErrorReason {


    /**
     * 
     *                 Indicates that an unexpected error occured.
     *               
     * 
     */
    SERVER_ERROR,

    /**
     * 
     *                 Indicates that the server is currently experiencing a high load. Please
     *                 wait and try your request again.
     *               
     * 
     */
    SERVER_BUSY,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ServerErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
