
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublisherQueryLanguageSyntaxError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublisherQueryLanguageSyntaxError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNPARSABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublisherQueryLanguageSyntaxError.Reason")
@XmlEnum
public enum PublisherQueryLanguageSyntaxErrorReason {


    /**
     * 
     *                 Indicates that there was a PQL syntax error.
     *               
     * 
     */
    UNPARSABLE,

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

    public static PublisherQueryLanguageSyntaxErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
