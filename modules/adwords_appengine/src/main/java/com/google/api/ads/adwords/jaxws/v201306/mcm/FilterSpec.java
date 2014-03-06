
package com.google.api.ads.adwords.jaxws.v201306.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterSpec.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterSpec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ONLY_SUBMANAGERS"/>
 *     &lt;enumeration value="ONLY_LEAF_CLIENTS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterSpec")
@XmlEnum
public enum FilterSpec {


    /**
     * 
     *                 Return alerts for all customers.
     *               
     * 
     */
    ALL,

    /**
     * 
     *                 Only return alerts from client managers.
     *               
     * 
     */
    ONLY_SUBMANAGERS,

    /**
     * 
     *                 Only return alerts from non-manager AdWords accounts.
     *               
     * 
     */
    ONLY_LEAF_CLIENTS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FilterSpec fromValue(String v) {
        return valueOf(v);
    }

}
