
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBMClientError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DBMClientError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="NOT_FOUND"/>
 *     &lt;enumeration value="RPC_ERROR"/>
 *     &lt;enumeration value="UNMAPPED_DBM_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DBMClientError.Reason")
@XmlEnum
public enum DBMClientErrorReason {


    /**
     * 
     *                 Active gaia user does not have access to DBM.
     *               
     * 
     */
    AUTHENTICATION_ERROR,

    /**
     * 
     *                 Indicates that an attempt was made to retrieve an entity that does not exist.
     *               
     * 
     */
    NOT_FOUND,

    /**
     * 
     *                 An RPC error has occurred.
     *               
     * 
     */
    RPC_ERROR,

    /**
     * 
     *                 Catch all for DBM api errors that we do not have a mapping for.
     *               
     * 
     */
    UNMAPPED_DBM_ERROR,

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

    public static DBMClientErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
