
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlashExpandableCreative.ExpandDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlashExpandableCreative.ExpandDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEFT"/>
 *     &lt;enumeration value="RIGHT"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlashExpandableCreative.ExpandDirection")
@XmlEnum
public enum FlashExpandableCreativeExpandDirection {

    LEFT,
    RIGHT,
    UP,
    DOWN;

    public String value() {
        return name();
    }

    public static FlashExpandableCreativeExpandDirection fromValue(String v) {
        return valueOf(v);
    }

}
