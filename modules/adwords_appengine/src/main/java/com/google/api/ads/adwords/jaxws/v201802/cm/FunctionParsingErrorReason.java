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
 * <p>Java class for FunctionParsingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FunctionParsingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_MORE_INPUT"/>
 *     &lt;enumeration value="EXPECTED_CHARACTER"/>
 *     &lt;enumeration value="UNEXPECTED_SEPARATOR"/>
 *     &lt;enumeration value="UNMATCHED_LEFT_BRACKET"/>
 *     &lt;enumeration value="UNMATCHED_RIGHT_BRACKET"/>
 *     &lt;enumeration value="TOO_MANY_NESTED_FUNCTIONS"/>
 *     &lt;enumeration value="MISSING_RIGHT_HAND_OPERAND"/>
 *     &lt;enumeration value="INVALID_OPERATOR_NAME"/>
 *     &lt;enumeration value="FEED_ATTRIBUTE_OPERAND_ARGUMENT_NOT_INTEGER"/>
 *     &lt;enumeration value="NO_OPERANDS"/>
 *     &lt;enumeration value="TOO_MANY_OPERANDS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunctionParsingError.Reason")
@XmlEnum
public enum FunctionParsingErrorReason {


    /**
     * 
     *                 Unexpected end of function string.
     *               
     * 
     */
    NO_MORE_INPUT,

    /**
     * 
     *                 Could not find an expected character.
     *               
     * 
     */
    EXPECTED_CHARACTER,

    /**
     * 
     *                 Unexpected separator character.
     *               
     * 
     */
    UNEXPECTED_SEPARATOR,

    /**
     * 
     *                 Unmatched left bracket or parenthesis.
     *               
     * 
     */
    UNMATCHED_LEFT_BRACKET,

    /**
     * 
     *                 Unmatched right bracket or parenthesis.
     *               
     * 
     */
    UNMATCHED_RIGHT_BRACKET,

    /**
     * 
     *                 Functions are nested too deeply.
     *               
     * 
     */
    TOO_MANY_NESTED_FUNCTIONS,

    /**
     * 
     *                 Missing right-hand-side operand.
     *               
     * 
     */
    MISSING_RIGHT_HAND_OPERAND,

    /**
     * 
     *                 Invalid operator/function name.
     *               
     * 
     */
    INVALID_OPERATOR_NAME,

    /**
     * 
     *                 Feed attribute operand's argument is not an integer.
     *               
     * 
     */
    FEED_ATTRIBUTE_OPERAND_ARGUMENT_NOT_INTEGER,

    /**
     * 
     *                 Missing function operands.
     *               
     * 
     */
    NO_OPERANDS,

    /**
     * 
     *                 Function had too many operands.
     *               
     * 
     */
    TOO_MANY_OPERANDS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FunctionParsingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
