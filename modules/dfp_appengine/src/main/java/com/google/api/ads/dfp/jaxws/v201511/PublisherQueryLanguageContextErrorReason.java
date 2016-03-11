
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublisherQueryLanguageContextError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublisherQueryLanguageContextError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNEXECUTABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublisherQueryLanguageContextError.Reason")
@XmlEnum
public enum PublisherQueryLanguageContextErrorReason {


    /**
     * 
     *                 Indicates that there was an error executing the PQL.
     *               
     * 
     */
    UNEXECUTABLE,

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

    public static PublisherQueryLanguageContextErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
