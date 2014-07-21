
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallToAction.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallToAction.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallToAction.Status")
@XmlEnum
public enum CallToActionStatus {


    /**
     * 
     *                 Call-to-action will be displayed.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Call-to-action will not be displayed due to approval or validation issues.
     *               
     * 
     */
    INACTIVE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CallToActionStatus fromValue(String v) {
        return valueOf(v);
    }

}
