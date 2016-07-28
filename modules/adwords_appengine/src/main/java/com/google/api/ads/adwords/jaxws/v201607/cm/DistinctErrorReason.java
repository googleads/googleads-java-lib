
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistinctError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistinctError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_ELEMENT"/>
 *     &lt;enumeration value="DUPLICATE_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistinctError.Reason")
@XmlEnum
public enum DistinctErrorReason {

    DUPLICATE_ELEMENT,
    DUPLICATE_TYPE;

    public String value() {
        return name();
    }

    public static DistinctErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
