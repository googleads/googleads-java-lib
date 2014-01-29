
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdWordsConversionTracker.MarkupLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdWordsConversionTracker.MarkupLanguage">
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
@XmlType(name = "AdWordsConversionTracker.MarkupLanguage")
@XmlEnum
public enum AdWordsConversionTrackerMarkupLanguage {

    HTML,
    CHTML,

    /**
     * 
     *                 Mobile XHTML.
     *               
     * 
     */
    XHTML,
    WML;

    public String value() {
        return name();
    }

    public static AdWordsConversionTrackerMarkupLanguage fromValue(String v) {
        return valueOf(v);
    }

}
