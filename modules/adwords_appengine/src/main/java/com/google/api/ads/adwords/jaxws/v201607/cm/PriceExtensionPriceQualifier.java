
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceExtensionPriceQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceExtensionPriceQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="FROM"/>
 *     &lt;enumeration value="UP_TO"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceExtensionPriceQualifier")
@XmlEnum
public enum PriceExtensionPriceQualifier {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 'From' qualifier for the price.
     *               
     * 
     */
    FROM,

    /**
     * 
     *                 'Up to' qualifier for the price.
     *               
     * 
     */
    UP_TO,

    /**
     * 
     *                 None is used for clearing the qualifier.
     *               
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static PriceExtensionPriceQualifier fromValue(String v) {
        return valueOf(v);
    }

}
