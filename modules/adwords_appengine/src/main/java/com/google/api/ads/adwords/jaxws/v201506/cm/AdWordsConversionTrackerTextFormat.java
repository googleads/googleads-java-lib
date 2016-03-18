
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdWordsConversionTracker.TextFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdWordsConversionTracker.TextFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONE_LINE"/>
 *     &lt;enumeration value="TWO_LINE"/>
 *     &lt;enumeration value="HIDDEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdWordsConversionTracker.TextFormat")
@XmlEnum
public enum AdWordsConversionTrackerTextFormat {


    /**
     * 
     *                 The text will be displayed on one line.
     *               
     * 
     */
    ONE_LINE,

    /**
     * 
     *                 The text will be displayed on two lines.
     *               
     * 
     */
    TWO_LINE,

    /**
     * 
     *                 The text will be hidden.
     *               
     * 
     */
    HIDDEN;

    public String value() {
        return name();
    }

    public static AdWordsConversionTrackerTextFormat fromValue(String v) {
        return valueOf(v);
    }

}
