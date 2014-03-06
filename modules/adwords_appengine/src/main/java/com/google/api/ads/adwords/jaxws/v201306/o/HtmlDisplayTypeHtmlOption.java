
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HtmlDisplayType.HtmlOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HtmlDisplayType.HtmlOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="THIRD_PARTY_SERVING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HtmlDisplayType.HtmlOption")
@XmlEnum
public enum HtmlDisplayTypeHtmlOption {

    UNKNOWN,

    /**
     * 
     *                 Served by a third party.
     *               
     * 
     */
    THIRD_PARTY_SERVING;

    public String value() {
        return name();
    }

    public static HtmlDisplayTypeHtmlOption fromValue(String v) {
        return valueOf(v);
    }

}
