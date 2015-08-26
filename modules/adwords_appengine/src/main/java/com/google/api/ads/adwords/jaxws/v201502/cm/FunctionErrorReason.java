
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FunctionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_FUNCTION_FORMAT"/>
 *     &lt;enumeration value="DATA_TYPE_MISMATCH"/>
 *     &lt;enumeration value="INVALID_CONJUNCTION_OPERANDS"/>
 *     &lt;enumeration value="INVALID_NUMBER_OF_OPERANDS"/>
 *     &lt;enumeration value="INVALID_OPERAND_TYPE"/>
 *     &lt;enumeration value="INVALID_OPERATOR"/>
 *     &lt;enumeration value="INVALID_REQUEST_CONTEXT_TYPE"/>
 *     &lt;enumeration value="INVALID_FUNCTION_FOR_CALL_PLACEHOLDER"/>
 *     &lt;enumeration value="INVALID_FUNCTION_FOR_PLACEHOLDER"/>
 *     &lt;enumeration value="INVALID_OPERAND"/>
 *     &lt;enumeration value="MISSING_CONSTANT_OPERAND_VALUE"/>
 *     &lt;enumeration value="INVALID_CONSTANT_OPERAND_VALUE"/>
 *     &lt;enumeration value="INVALID_NESTING"/>
 *     &lt;enumeration value="MULTIPLE_FEED_IDS_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_ATTRIBUTE_NAME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunctionError.Reason")
@XmlEnum
public enum FunctionErrorReason {


    /**
     * 
     *                 The format of the function is not recognized as a supported function format.
     *               
     * 
     */
    INVALID_FUNCTION_FORMAT,

    /**
     * 
     *                 Operand data types do not match.
     *               
     * 
     */
    DATA_TYPE_MISMATCH,

    /**
     * 
     *                 The operands cannot be used together in a conjunction.
     *               
     * 
     */
    INVALID_CONJUNCTION_OPERANDS,

    /**
     * 
     *                 Invalid numer of Operands.
     *               
     * 
     */
    INVALID_NUMBER_OF_OPERANDS,

    /**
     * 
     *                 Operand Type not supported.
     *               
     * 
     */
    INVALID_OPERAND_TYPE,

    /**
     * 
     *                 Operator not supported.
     *               
     * 
     */
    INVALID_OPERATOR,

    /**
     * 
     *                 Request context type not supported.
     *               
     * 
     */
    INVALID_REQUEST_CONTEXT_TYPE,

    /**
     * 
     *                 The matching function is not allowed for call placeholders
     *               
     * 
     */
    INVALID_FUNCTION_FOR_CALL_PLACEHOLDER,

    /**
     * 
     *                 The matching function is not allowed for the specified placeholder
     *               
     * 
     */
    INVALID_FUNCTION_FOR_PLACEHOLDER,

    /**
     * 
     *                 Invalid operand.
     *               
     * 
     */
    INVALID_OPERAND,

    /**
     * 
     *                 Missing value for the constant operand.
     *               
     * 
     */
    MISSING_CONSTANT_OPERAND_VALUE,

    /**
     * 
     *                 The value of the constant operand is invalid.
     *               
     * 
     */
    INVALID_CONSTANT_OPERAND_VALUE,

    /**
     * 
     *                 Invalid function nesting.
     *               
     * 
     */
    INVALID_NESTING,

    /**
     * 
     *                 The Feed ID was different from another Feed ID in the same function.
     *               
     * 
     */
    MULTIPLE_FEED_IDS_NOT_SUPPORTED,

    /**
     * 
     *                 Invalid attribute name.
     *               
     * 
     */
    INVALID_ATTRIBUTE_NAME,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FunctionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
