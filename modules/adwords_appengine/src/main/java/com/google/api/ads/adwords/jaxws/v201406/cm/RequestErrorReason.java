
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestError.Reason")
@XmlEnum
public enum RequestErrorReason {


    /**
     * 
     *                 Error reason is unknown.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Invalid input.
     *               
     * 
     */
    INVALID_INPUT;

    public String value() {
        return name();
    }

    public static RequestErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
