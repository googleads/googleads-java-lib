
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InAppLinkExtension.AppStore.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InAppLinkExtension.AppStore">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GOOGLE_PLAY"/>
 *     &lt;enumeration value="ITUNES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InAppLinkExtension.AppStore")
@XmlEnum
public enum InAppLinkExtensionAppStore {


    /**
     * 
     *                 Render on Android devices using Google Play.
     *               
     * 
     */
    GOOGLE_PLAY,

    /**
     * 
     *                 Render on iOS devices using iTunes.
     *               
     * 
     */
    ITUNES;

    public String value() {
        return name();
    }

    public static InAppLinkExtensionAppStore fromValue(String v) {
        return valueOf(v);
    }

}
