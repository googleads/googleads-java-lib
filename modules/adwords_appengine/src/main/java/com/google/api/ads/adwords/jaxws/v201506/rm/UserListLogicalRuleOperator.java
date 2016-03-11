
package com.google.api.ads.adwords.jaxws.v201506.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListLogicalRule.Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserListLogicalRule.Operator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserListLogicalRule.Operator")
@XmlEnum
public enum UserListLogicalRuleOperator {


    /**
     * 
     *                 And - all of the operands.
     *               
     * 
     */
    ALL,

    /**
     * 
     *                 Or - at least one of the operands.
     *               
     * 
     */
    ANY,

    /**
     * 
     *                 Not - none of the operands.
     *               
     * 
     */
    NONE,

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

    public static UserListLogicalRuleOperator fromValue(String v) {
        return valueOf(v);
    }

}
