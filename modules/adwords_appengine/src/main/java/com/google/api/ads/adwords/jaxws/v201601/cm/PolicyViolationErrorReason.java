
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyViolationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyViolationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POLICY_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyViolationError.Reason")
@XmlEnum
public enum PolicyViolationErrorReason {

    POLICY_ERROR;

    public String value() {
        return name();
    }

    public static PolicyViolationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
