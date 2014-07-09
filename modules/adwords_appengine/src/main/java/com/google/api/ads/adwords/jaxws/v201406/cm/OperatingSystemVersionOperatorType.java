
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingSystemVersion.OperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatingSystemVersion.OperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GREATER_THAN_EQUAL_TO"/>
 *     &lt;enumeration value="EQUAL_TO"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatingSystemVersion.OperatorType")
@XmlEnum
public enum OperatingSystemVersionOperatorType {

    GREATER_THAN_EQUAL_TO,
    EQUAL_TO,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static OperatingSystemVersionOperatorType fromValue(String v) {
        return valueOf(v);
    }

}
