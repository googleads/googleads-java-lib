
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordMatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeywordMatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXACT"/>
 *     &lt;enumeration value="PHRASE"/>
 *     &lt;enumeration value="BROAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeywordMatchType")
@XmlEnum
public enum KeywordMatchType {


    /**
     * 
     *                 Exact match
     *               
     * 
     */
    EXACT,

    /**
     * 
     *                 Phrase match
     *               
     * 
     */
    PHRASE,

    /**
     * 
     *                 Broad match
     *               
     * 
     */
    BROAD;

    public String value() {
        return name();
    }

    public static KeywordMatchType fromValue(String v) {
        return valueOf(v);
    }

}
