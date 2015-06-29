
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvertisingChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvertisingChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SEARCH"/>
 *     &lt;enumeration value="DISPLAY"/>
 *     &lt;enumeration value="SHOPPING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvertisingChannelType")
@XmlEnum
public enum AdvertisingChannelType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Search Network. Includes display bundled, and Search+ campaigns.
     *               
     * 
     */
    SEARCH,

    /**
     * 
     *                 Google Display Network only.
     *               
     * 
     */
    DISPLAY,

    /**
     * 
     *                 Shopping campaigns serve on the shopping property and on google.com search
     *                 results.
     *               
     * 
     */
    SHOPPING;

    public String value() {
        return name();
    }

    public static AdvertisingChannelType fromValue(String v) {
        return valueOf(v);
    }

}
