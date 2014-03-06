
package com.google.api.ads.adwords.jaxws.v201309.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientSpec.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientSpec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="ID_LIST"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientSpec")
@XmlEnum
public enum ClientSpec {


    /**
     * 
     *                 All clients recursively managed by the manager.
     *               
     * 
     */
    ALL,

    /**
     * 
     *                 Clients managed just by the manager and not through any sub-managers.
     *               
     * 
     */
    DIRECT,

    /**
     * 
     *                 Client accounts as specified in the {@link AlertQuery#clientCustomerIds}.
     *               
     * 
     */
    ID_LIST,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ClientSpec fromValue(String v) {
        return valueOf(v);
    }

}
