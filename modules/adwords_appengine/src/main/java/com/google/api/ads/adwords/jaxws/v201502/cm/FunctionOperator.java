
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Function.Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Function.Operator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IDENTITY"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="CONTAINS_ANY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Function.Operator")
@XmlEnum
public enum FunctionOperator {


    /**
     * 
     *                 The IN operator.
     *               
     * 
     */
    IN,

    /**
     * 
     *                 The IDENTITY operator.
     *               
     * 
     */
    IDENTITY,

    /**
     * 
     *                 The EQUALS operator
     *               
     * 
     */
    EQUALS,

    /**
     * 
     *                 Operator that takes two or more operands that are of type FunctionOperand
     *                 and checks that all the operands evaluate to true.
     *                 All the operands must be in lhsOperand.
     *                 Return ConstantOperand with Bool type.
     *               
     * 
     */
    AND,

    /**
     * 
     *                 Operator that returns true if the elements in lhsOperand contains any of the elements
     *                 in rhsOperands. Otherwise, return false.
     *               
     * 
     */
    CONTAINS_ANY,

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

    public static FunctionOperator fromValue(String v) {
        return valueOf(v);
    }

}
