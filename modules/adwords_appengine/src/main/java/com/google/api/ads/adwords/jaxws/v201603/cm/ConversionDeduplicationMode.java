
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionDeduplicationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionDeduplicationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONE_PER_CLICK"/>
 *     &lt;enumeration value="MANY_PER_CLICK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionDeduplicationMode")
@XmlEnum
public enum ConversionDeduplicationMode {


    /**
     * 
     *                 Number of clicks that get at least one conversion.
     *               
     * 
     */
    ONE_PER_CLICK,

    /**
     * 
     *                 Total number of conversions per click.
     *               
     * 
     */
    MANY_PER_CLICK;

    public String value() {
        return name();
    }

    public static ConversionDeduplicationMode fromValue(String v) {
        return valueOf(v);
    }

}
