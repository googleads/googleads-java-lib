
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiVersionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApiVersionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPDATE_TO_NEWER_VERSION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApiVersionError.Reason")
@XmlEnum
public enum ApiVersionErrorReason {


    /**
     * 
     *                 Indicates that the operation is not allowed in the version the request
     *                 was made in.
     *               
     * 
     */
    UPDATE_TO_NEWER_VERSION,

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

    public static ApiVersionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
