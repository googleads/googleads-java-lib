
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Html5Feature.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Html5Feature">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC_SVG"/>
 *     &lt;enumeration value="SVG_FILTERS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Html5Feature")
@XmlEnum
public enum Html5Feature {


    /**
     * 
     *                 Requires a basic SVG animation.
     *               
     * 
     */
    BASIC_SVG,

    /**
     * 
     *                 Requires support for SVG filter based animation.
     *               
     * 
     */
    SVG_FILTERS,

    /**
     * 
     *                 The feature is not known or defined in newer versions.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static Html5Feature fromValue(String v) {
        return valueOf(v);
    }

}
