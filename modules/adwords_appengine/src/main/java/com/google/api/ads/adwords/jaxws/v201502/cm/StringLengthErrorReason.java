
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringLengthError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringLengthError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOO_SHORT"/>
 *     &lt;enumeration value="TOO_LONG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StringLengthError.Reason")
@XmlEnum
public enum StringLengthErrorReason {

    TOO_SHORT,
    TOO_LONG;

    public String value() {
        return name();
    }

    public static StringLengthErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
