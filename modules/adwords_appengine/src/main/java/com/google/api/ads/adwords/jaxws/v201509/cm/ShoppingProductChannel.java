
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingProductChannel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShoppingProductChannel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ONLINE"/>
 *     &lt;enumeration value="LOCAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShoppingProductChannel")
@XmlEnum
public enum ShoppingProductChannel {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The item is sold online.
     *               
     * 
     */
    ONLINE,

    /**
     * 
     *                 The item is sold in local stores.
     *               
     * 
     */
    LOCAL;

    public String value() {
        return name();
    }

    public static ShoppingProductChannel fromValue(String v) {
        return valueOf(v);
    }

}
