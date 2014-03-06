
package com.google.api.ads.adwords.jaxws.v201402.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompetitionSearchParameter.Level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompetitionSearchParameter.Level">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="HIGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompetitionSearchParameter.Level")
@XmlEnum
public enum CompetitionSearchParameterLevel {


    /**
     * 
     *                 Low - competition rate [0.0000, 0.3333]
     *               
     * 
     */
    LOW,

    /**
     * 
     *                 Medium - competition rate (0.3333, 0.6667]
     *               
     * 
     */
    MEDIUM,

    /**
     * 
     *                 High - competition rate (0.6667, 1.0000]
     *               
     * 
     */
    HIGH;

    public String value() {
        return name();
    }

    public static CompetitionSearchParameterLevel fromValue(String v) {
        return valueOf(v);
    }

}
