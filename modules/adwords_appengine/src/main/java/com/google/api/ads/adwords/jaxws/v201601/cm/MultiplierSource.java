
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiplierSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiplierSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADGROUP"/>
 *     &lt;enumeration value="CRITERION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultiplierSource")
@XmlEnum
public enum MultiplierSource {


    /**
     * 
     *                 AdGroup level multiplier
     *               
     * 
     */
    ADGROUP,

    /**
     * 
     *                 Criterion level multiplier
     *               
     * 
     */
    CRITERION,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static MultiplierSource fromValue(String v) {
        return valueOf(v);
    }

}
