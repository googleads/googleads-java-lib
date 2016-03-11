
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeWrapperOrdering.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeWrapperOrdering">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_PREFERENCE"/>
 *     &lt;enumeration value="INNER"/>
 *     &lt;enumeration value="OUTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeWrapperOrdering")
@XmlEnum
public enum CreativeWrapperOrdering {


    /**
     * 
     *                 Wrapping occurs after {@link #INNER} but before {@link #OUTER}
     *               
     * 
     */
    NO_PREFERENCE,

    /**
     * 
     *                 Wrapping occurs as early as possible.
     *               
     * 
     */
    INNER,

    /**
     * 
     *                 Wrapping occurs after both {@link #NO_PREFERENCE} and {@link #INNER}
     *               
     * 
     */
    OUTER;

    public String value() {
        return name();
    }

    public static CreativeWrapperOrdering fromValue(String v) {
        return valueOf(v);
    }

}
