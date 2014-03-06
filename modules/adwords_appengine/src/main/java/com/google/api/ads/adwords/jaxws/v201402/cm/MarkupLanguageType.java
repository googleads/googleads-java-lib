
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkupLanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkupLanguageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="CHTML"/>
 *     &lt;enumeration value="XHTML"/>
 *     &lt;enumeration value="WML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarkupLanguageType")
@XmlEnum
public enum MarkupLanguageType {


    /**
     * 
     *                 HyperText Markup Language.
     *               
     * 
     */
    HTML,

    /**
     * 
     *                 Compact HyperText Markup Language.
     *               
     * 
     */
    CHTML,

    /**
     * 
     *                 eXtensible HyperText Markup Language.
     *               
     * 
     */
    XHTML,

    /**
     * 
     *                 Wireless Markup Language.
     *               
     * 
     */
    WML;

    public String value() {
        return name();
    }

    public static MarkupLanguageType fromValue(String v) {
        return valueOf(v);
    }

}
