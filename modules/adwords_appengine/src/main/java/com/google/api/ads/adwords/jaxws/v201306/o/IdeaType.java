
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdeaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdeaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdeaType")
@XmlEnum
public enum IdeaType {


    /**
     * 
     *                 Keyword idea.
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Placement idea.
     *                 <span class="constraint AdxEnabled">This is enabled for AdX.</span>
     *               
     * 
     */
    PLACEMENT;

    public String value() {
        return name();
    }

    public static IdeaType fromValue(String v) {
        return valueOf(v);
    }

}
