
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstantOperand.ConstantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstantOperand.ConstantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DOUBLE"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="STRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstantOperand.ConstantType")
@XmlEnum
public enum ConstantOperandConstantType {


    /**
     * 
     *                 Boolean constant type. booleanValue should be set for this type.
     *               
     * 
     */
    BOOLEAN,

    /**
     * 
     *                 Double constant type. doubleValue should be set for this type.
     *               
     * 
     */
    DOUBLE,

    /**
     * 
     *                 Long constant type. longValue should be set for this type.
     *               
     * 
     */
    LONG,

    /**
     * 
     *                 String constant type. stringValue should be set for this type.
     *               
     * 
     */
    STRING;

    public String value() {
        return name();
    }

    public static ConstantOperandConstantType fromValue(String v) {
        return valueOf(v);
    }

}
