
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SERVING"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ENDED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServingStatus")
@XmlEnum
public enum ServingStatus {


    /**
     * 
     *                 The campaign is currently serving ads.
     *               
     * 
     */
    SERVING,

    /**
     * 
     *                 This is the catch-all if none of the other statuses make sense.
     *                 Such a campaign is not serving, but none of the other statuses
     *                 are sensible options.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 The campaign end date has been past.
     *               
     * 
     */
    ENDED,

    /**
     * 
     *                 The campaign start date has not yet been reached.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 The campaign has been suspended probably from lack of allocated funds.
     *               
     * 
     */
    SUSPENDED;

    public String value() {
        return name();
    }

    public static ServingStatus fromValue(String v) {
        return valueOf(v);
    }

}
