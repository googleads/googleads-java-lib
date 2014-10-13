
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIDDABLE"/>
 *     &lt;enumeration value="NEGATIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriterionUse")
@XmlEnum
public enum CriterionUse {


    /**
     * 
     *                 Biddable (positive) criterion
     *               
     * 
     */
    BIDDABLE,

    /**
     * 
     *                 Negative criterion
     *               
     * 
     */
    NEGATIVE;

    public String value() {
        return name();
    }

    public static CriterionUse fromValue(String v) {
        return valueOf(v);
    }

}
