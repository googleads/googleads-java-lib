
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativePersistenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativePersistenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_PERSISTENT"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_NONE"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_DISPLAY"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_VIDEO"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativePersistenceType")
@XmlEnum
public enum CreativePersistenceType {


    /**
     * 
     *                 Not persistent or exclusive.
     *               
     * 
     */
    NOT_PERSISTENT,

    /**
     * 
     *                 Persistent and does not exclude ads.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_NONE,

    /**
     * 
     *                 Persistent and excludes display ads only.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_DISPLAY,

    /**
     * 
     *                 Persistent and excludes video ads only.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_VIDEO,

    /**
     * 
     *                 Persistent and excludes all other ads.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_ALL;

    public String value() {
        return name();
    }

    public static CreativePersistenceType fromValue(String v) {
        return valueOf(v);
    }

}
