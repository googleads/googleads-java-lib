
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnit.TargetWindow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnit.TargetWindow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="BLANK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdUnit.TargetWindow")
@XmlEnum
public enum AdUnitTargetWindow {


    /**
     * 
     *                 Specifies that the link should open in the full body of the page.
     *               
     * 
     */
    TOP,

    /**
     * 
     *                 Specifies that the link should open in a new window.
     *               
     * 
     */
    BLANK;

    public String value() {
        return name();
    }

    public static AdUnitTargetWindow fromValue(String v) {
        return valueOf(v);
    }

}
