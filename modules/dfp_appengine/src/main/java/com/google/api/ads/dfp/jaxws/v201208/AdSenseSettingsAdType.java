
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdSenseSettings.AdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSenseSettings.AdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="TEXT_AND_IMAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdSenseSettings.AdType")
@XmlEnum
public enum AdSenseSettingsAdType {


    /**
     * 
     *                 Allows text-only ads.
     *               
     * 
     */
    TEXT,

    /**
     * 
     *                 Allows image-only ads.
     *               
     * 
     */
    IMAGE,

    /**
     * 
     *                 Allows both text and image ads.
     *               
     * 
     */
    TEXT_AND_IMAGE;

    public String value() {
        return name();
    }

    public static AdSenseSettingsAdType fromValue(String v) {
        return valueOf(v);
    }

}
