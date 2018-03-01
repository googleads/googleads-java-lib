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
 * <p>Java class for Predicate.Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Predicate.Operator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="NOT_IN"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_THAN_EQUALS"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="LESS_THAN_EQUALS"/>
 *     &lt;enumeration value="STARTS_WITH"/>
 *     &lt;enumeration value="STARTS_WITH_IGNORE_CASE"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="CONTAINS_IGNORE_CASE"/>
 *     &lt;enumeration value="DOES_NOT_CONTAIN"/>
 *     &lt;enumeration value="DOES_NOT_CONTAIN_IGNORE_CASE"/>
 *     &lt;enumeration value="CONTAINS_ANY"/>
 *     &lt;enumeration value="CONTAINS_ALL"/>
 *     &lt;enumeration value="CONTAINS_NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Predicate.Operator")
@XmlEnum
public enum PredicateOperator {


    /**
     * 
     *                 Checks if the field is equal to the given value.
     *                 
     *                 <p>This operator is used with integers, dates, booleans, strings,
     *                 enums, and sets.
     *               
     * 
     */
    EQUALS,

    /**
     * 
     *                 Checks if the field does not equal the given value.
     *                 
     *                 <p>This operator is used with integers, booleans, strings, enums,
     *                 and sets.
     *               
     * 
     */
    NOT_EQUALS,

    /**
     * 
     *                 Checks if the field is equal to one of the given values.
     *                 
     *                 <p>This operator accepts multiple operands and is used with
     *                 integers, booleans, strings, and enums.
     *               
     * 
     */
    IN,

    /**
     * 
     *                 Checks if the field does not equal any of the given values.
     *                 
     *                 <p>This operator accepts multiple operands and is used with
     *                 integers, booleans, strings, and enums.
     *               
     * 
     */
    NOT_IN,

    /**
     * 
     *                 Checks if the field is greater than the given value.
     *                 
     *                 <p>This operator is used with numbers and dates.
     *               
     * 
     */
    GREATER_THAN,

    /**
     * 
     *                 Checks if the field is greater or equal to the given value.
     *                 
     *                 <p>This operator is used with numbers and dates.
     *               
     * 
     */
    GREATER_THAN_EQUALS,

    /**
     * 
     *                 Checks if the field is less than the given value.
     *                 
     *                 <p>This operator is used with numbers and dates.
     *               
     * 
     */
    LESS_THAN,

    /**
     * 
     *                 Checks if the field is less or equal to than the given value.
     *                 
     *                 <p>This operator is used with numbers and dates.
     *               
     * 
     */
    LESS_THAN_EQUALS,

    /**
     * 
     *                 Checks if the field starts with the given value.
     *                 
     *                 <p>This operator is used with strings.
     *               
     * 
     */
    STARTS_WITH,

    /**
     * 
     *                 Checks if the field starts with the given value, ignoring case.
     *                 
     *                 <p>This operator is used with strings.
     *               
     * 
     */
    STARTS_WITH_IGNORE_CASE,

    /**
     * 
     *                 Checks if the field contains the given value as a substring.
     *                 
     *                 <p>This operator is used with strings.
     *               
     * 
     */
    CONTAINS,

    /**
     * 
     *                 Checks if the field contains the given value as a substring, ignoring
     *                 case.
     *                 
     *                 <p>This operator is used with strings.
     *               
     * 
     */
    CONTAINS_IGNORE_CASE,

    /**
     * 
     *                 Checks if the field does not contain the given value as a substring.
     *                 
     *                 <p>This operator is used with strings.
     *               
     * 
     */
    DOES_NOT_CONTAIN,

    /**
     * 
     *                 Checks if the field does not contain the given value as a substring,
     *                 ignoring case.
     *                 
     *                 <p>This operator is used with strings.
     *               
     * 
     */
    DOES_NOT_CONTAIN_IGNORE_CASE,

    /**
     * 
     *                 Checks if the field contains <em>any</em> of the given values.
     *                 
     *                 <p>This operator accepts multiple values and is used on sets of numbers
     *                 or strings.
     *               
     * 
     */
    CONTAINS_ANY,

    /**
     * 
     *                 Checks if the field contains <em>all</em> of the given values.
     *                 
     *                 <p>This operator accepts multiple values and is used on sets of numbers
     *                 or strings.
     *               
     * 
     */
    CONTAINS_ALL,

    /**
     * 
     *                 Checks if the field contains <em>none</em> of the given values.
     *                 
     *                 <p>This operator accepts multiple values and is used on sets of numbers
     *                 or strings.
     *               
     * 
     */
    CONTAINS_NONE,

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

    public static PredicateOperator fromValue(String v) {
        return valueOf(v);
    }

}
