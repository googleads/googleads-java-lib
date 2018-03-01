// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.cm;

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
 *     &lt;enumeration value="INVALID_FUNCTION_FOR_FEED_WITH_FIXED_SCHEMA"/>
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
     *                 The matching function is invalid for use with a feed with a fixed schema.
     *               
     * 
     */
    INVALID_FUNCTION_FOR_FEED_WITH_FIXED_SCHEMA,

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
