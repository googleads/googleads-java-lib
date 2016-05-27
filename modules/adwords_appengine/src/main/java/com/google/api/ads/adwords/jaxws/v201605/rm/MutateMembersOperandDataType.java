
package com.google.api.ads.adwords.jaxws.v201605.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MutateMembersOperand.DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MutateMembersOperand.DataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL_SHA256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MutateMembersOperand.DataType")
@XmlEnum
public enum MutateMembersOperandDataType {


    /**
     * 
     *                 Indicates each member is a hashed email address using SHA-256
     *                 hash function.
     *               
     * 
     */
    @XmlEnumValue("EMAIL_SHA256")
    EMAIL_SHA_256("EMAIL_SHA256");
    private final String value;

    MutateMembersOperandDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MutateMembersOperandDataType fromValue(String v) {
        for (MutateMembersOperandDataType c: MutateMembersOperandDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
