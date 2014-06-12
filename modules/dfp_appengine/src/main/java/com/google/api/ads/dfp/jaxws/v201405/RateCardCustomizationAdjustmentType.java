
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateCardCustomizationAdjustmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateCardCustomizationAdjustmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERCENTAGE"/>
 *     &lt;enumeration value="ABSOLUTE_VALUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateCardCustomizationAdjustmentType")
@XmlEnum
public enum RateCardCustomizationAdjustmentType {


    /**
     * 
     *                 The adjustment size to the base rate is a percentage.
     *               
     * 
     */
    PERCENTAGE,

    /**
     * 
     *                 The adjustment size to the base rate is an absolute value.
     *               
     * 
     */
    ABSOLUTE_VALUE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RateCardCustomizationAdjustmentType fromValue(String v) {
        return valueOf(v);
    }

}
