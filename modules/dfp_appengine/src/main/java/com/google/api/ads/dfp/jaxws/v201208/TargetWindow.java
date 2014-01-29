
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetWindow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetWindow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLANK"/>
 *     &lt;enumeration value="TOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetWindow")
@XmlEnum
public enum TargetWindow {


    /**
     * 
     *                 Specifies that the link should open in the full body of the page.
     *               
     * 
     */
    BLANK,

    /**
     * 
     *                 Specifies that the link should open in a new window.
     *               
     * 
     */
    TOP;

    public String value() {
        return name();
    }

    public static TargetWindow fromValue(String v) {
        return valueOf(v);
    }

}
