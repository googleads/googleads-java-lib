
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeRange.AgeRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeRange.AgeRangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGE_RANGE_18_24"/>
 *     &lt;enumeration value="AGE_RANGE_25_34"/>
 *     &lt;enumeration value="AGE_RANGE_35_44"/>
 *     &lt;enumeration value="AGE_RANGE_45_54"/>
 *     &lt;enumeration value="AGE_RANGE_55_64"/>
 *     &lt;enumeration value="AGE_RANGE_65_UP"/>
 *     &lt;enumeration value="AGE_RANGE_UNDETERMINED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeRange.AgeRangeType")
@XmlEnum
public enum AgeRangeAgeRangeType {

    AGE_RANGE_18_24,
    AGE_RANGE_25_34,
    AGE_RANGE_35_44,
    AGE_RANGE_45_54,
    AGE_RANGE_55_64,
    AGE_RANGE_65_UP,
    AGE_RANGE_UNDETERMINED,

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

    public static AgeRangeAgeRangeType fromValue(String v) {
        return valueOf(v);
    }

}
