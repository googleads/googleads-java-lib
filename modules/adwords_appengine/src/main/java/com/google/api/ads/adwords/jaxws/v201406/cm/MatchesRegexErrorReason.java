
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchesRegexError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchesRegexError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DOES_NOT_MATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchesRegexError.Reason")
@XmlEnum
public enum MatchesRegexErrorReason {

    UNKNOWN,
    DOES_NOT_MATCH;

    public String value() {
        return name();
    }

    public static MatchesRegexErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
