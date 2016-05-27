
package com.google.api.ads.adwords.jaxws.v201605.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListConversionType.Category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserListConversionType.Category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOOMERANG_EVENT"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserListConversionType.Category")
@XmlEnum
public enum UserListConversionTypeCategory {

    BOOMERANG_EVENT,
    OTHER;

    public String value() {
        return name();
    }

    public static UserListConversionTypeCategory fromValue(String v) {
        return valueOf(v);
    }

}
