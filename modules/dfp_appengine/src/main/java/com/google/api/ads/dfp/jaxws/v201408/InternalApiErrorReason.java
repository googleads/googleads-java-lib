
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalApiError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InternalApiError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNEXPECTED_INTERNAL_API_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DOWNTIME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InternalApiError.Reason")
@XmlEnum
public enum InternalApiErrorReason {


    /**
     * 
     *                 API encountered an unexpected internal error.
     *               
     * 
     */
    UNEXPECTED_INTERNAL_API_ERROR,

    /**
     * 
     *                 The cause of the error is not known or only defined in newer versions.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The API is currently unavailable for a planned downtime.
     *               
     * 
     */
    DOWNTIME;

    public String value() {
        return name();
    }

    public static InternalApiErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
