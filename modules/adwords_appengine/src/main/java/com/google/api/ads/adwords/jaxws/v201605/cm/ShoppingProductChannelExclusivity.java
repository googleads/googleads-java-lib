
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingProductChannelExclusivity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShoppingProductChannelExclusivity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SINGLE_CHANNEL"/>
 *     &lt;enumeration value="MULTI_CHANNEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShoppingProductChannelExclusivity")
@XmlEnum
public enum ShoppingProductChannelExclusivity {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The item is sold through one channel only, either local stores or online as
     *                 indicated by its ShoppingProductChannel.
     *               
     * 
     */
    SINGLE_CHANNEL,

    /**
     * 
     *                 The item is matched to its online or local stores counterpart, indicating it is
     *                 available for purchase in both ShoppingProductChannels.
     *               
     * 
     */
    MULTI_CHANNEL;

    public String value() {
        return name();
    }

    public static ShoppingProductChannelExclusivity fromValue(String v) {
        return valueOf(v);
    }

}
