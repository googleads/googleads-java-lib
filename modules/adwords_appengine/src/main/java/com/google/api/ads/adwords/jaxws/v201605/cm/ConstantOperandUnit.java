
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstantOperand.Unit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstantOperand.Unit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="METERS"/>
 *     &lt;enumeration value="MILES"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstantOperand.Unit")
@XmlEnum
public enum ConstantOperandUnit {


    /**
     * 
     *                 Meters.
     *               
     * 
     */
    METERS,

    /**
     * 
     *                 Miles.
     *               
     * 
     */
    MILES,
    NONE;

    public String value() {
        return name();
    }

    public static ConstantOperandUnit fromValue(String v) {
        return valueOf(v);
    }

}
