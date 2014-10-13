
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacesOfInterestOperand.Category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacesOfInterestOperand.Category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIRPORT"/>
 *     &lt;enumeration value="DOWNTOWN"/>
 *     &lt;enumeration value="UNIVERSITY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlacesOfInterestOperand.Category")
@XmlEnum
public enum PlacesOfInterestOperandCategory {

    AIRPORT,
    DOWNTOWN,
    UNIVERSITY,

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

    public static PlacesOfInterestOperandCategory fromValue(String v) {
        return valueOf(v);
    }

}
