
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryStatus")
@XmlEnum
public enum InventoryStatus {


    /**
     * 
     *                 The object is active.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The object is no longer active.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The object has been archived.
     *               
     * 
     */
    ARCHIVED;

    public String value() {
        return name();
    }

    public static InventoryStatus fromValue(String v) {
        return valueOf(v);
    }

}
