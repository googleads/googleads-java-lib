
package com.google.api.ads.adwords.jaxws.v201409.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountUserListStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountUserListStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountUserListStatus")
@XmlEnum
public enum AccountUserListStatus {

    ACTIVE,
    INACTIVE;

    public String value() {
        return name();
    }

    public static AccountUserListStatus fromValue(String v) {
        return valueOf(v);
    }

}
