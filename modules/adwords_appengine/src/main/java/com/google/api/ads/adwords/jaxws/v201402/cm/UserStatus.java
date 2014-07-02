
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="PAUSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserStatus")
@XmlEnum
public enum UserStatus {


    /**
     * 
     *                 Default state of a criterion (e.g. not paused).
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Criterion is removed.
     *               
     * 
     */
    DELETED,

    /**
     * 
     *                 Criterion is paused. Also used to pause a criterion.
     *               
     * 
     */
    PAUSED;

    public String value() {
        return name();
    }

    public static UserStatus fromValue(String v) {
        return valueOf(v);
    }

}
