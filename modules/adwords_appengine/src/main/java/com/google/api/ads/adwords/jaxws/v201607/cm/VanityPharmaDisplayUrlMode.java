
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VanityPharmaDisplayUrlMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VanityPharmaDisplayUrlMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MANUFACTURER_WEBSITE_URL"/>
 *     &lt;enumeration value="WEBSITE_DESCRIPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VanityPharmaDisplayUrlMode")
@XmlEnum
public enum VanityPharmaDisplayUrlMode {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Replace vanity pharma URL with manufacturer website url.
     *               
     * 
     */
    MANUFACTURER_WEBSITE_URL,

    /**
     * 
     *                 Replace vanity pharma URL with description of the website.
     *               
     * 
     */
    WEBSITE_DESCRIPTION;

    public String value() {
        return name();
    }

    public static VanityPharmaDisplayUrlMode fromValue(String v) {
        return valueOf(v);
    }

}
