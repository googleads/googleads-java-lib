
package com.google.api.ads.adwords.jaxws.v201309.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OWNED"/>
 *     &lt;enumeration value="SHARED"/>
 *     &lt;enumeration value="LICENSED"/>
 *     &lt;enumeration value="SUBSCRIBED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessReason")
@XmlEnum
public enum AccessReason {


    /**
     * 
     *                 The entity is owned by the user.
     *               
     * 
     */
    OWNED,

    /**
     * 
     *                 The entity is shared to the user.
     *               
     * 
     */
    SHARED,

    /**
     * 
     *                 The entity is licensed to the user.
     *               
     * 
     */
    LICENSED,

    /**
     * 
     *                 The user subscribed to the entity.
     *               
     * 
     */
    SUBSCRIBED;

    public String value() {
        return name();
    }

    public static AccessReason fromValue(String v) {
        return valueOf(v);
    }

}
