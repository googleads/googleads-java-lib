
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiFramework.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApiFramework">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="CLICKTAG"/>
 *     &lt;enumeration value="VPAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApiFramework")
@XmlEnum
public enum ApiFramework {

    NONE,
    CLICKTAG,
    VPAID;

    public String value() {
        return name();
    }

    public static ApiFramework fromValue(String v) {
        return valueOf(v);
    }

}
