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
 * <p>Java class for SelectorError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectorError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_FIELD_NAME"/>
 *     &lt;enumeration value="MISSING_FIELDS"/>
 *     &lt;enumeration value="MISSING_PREDICATES"/>
 *     &lt;enumeration value="OPERATOR_DOES_NOT_SUPPORT_MULTIPLE_VALUES"/>
 *     &lt;enumeration value="INVALID_PREDICATE_ENUM_VALUE"/>
 *     &lt;enumeration value="MISSING_PREDICATE_OPERATOR"/>
 *     &lt;enumeration value="MISSING_PREDICATE_VALUES"/>
 *     &lt;enumeration value="INVALID_PREDICATE_FIELD_NAME"/>
 *     &lt;enumeration value="INVALID_PREDICATE_OPERATOR"/>
 *     &lt;enumeration value="INVALID_FIELD_SELECTION"/>
 *     &lt;enumeration value="INVALID_PREDICATE_VALUE"/>
 *     &lt;enumeration value="INVALID_SORT_FIELD_NAME"/>
 *     &lt;enumeration value="SELECTOR_ERROR"/>
 *     &lt;enumeration value="FILTER_BY_DATE_RANGE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="START_INDEX_IS_TOO_HIGH"/>
 *     &lt;enumeration value="TOO_MANY_PREDICATE_VALUES"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelectorError.Reason")
@XmlEnum
public enum SelectorErrorReason {


    /**
     * 
     *                 The field name is not valid.
     *               
     * 
     */
    INVALID_FIELD_NAME,

    /**
     * 
     *                 The list of fields is null or empty.
     *               
     * 
     */
    MISSING_FIELDS,

    /**
     * 
     *                 The list of predicates is null or empty.
     *               
     * 
     */
    MISSING_PREDICATES,

    /**
     * 
     *                 Predicate operator does not support multiple values. Multiple values are
     *                 supported only for {@link Predicate.Operator#IN} and {@link Predicate.Operator#NOT_IN}.
     *               
     * 
     */
    OPERATOR_DOES_NOT_SUPPORT_MULTIPLE_VALUES,

    /**
     * 
     *                 The predicate enum value is not valid.
     *               
     * 
     */
    INVALID_PREDICATE_ENUM_VALUE,

    /**
     * 
     *                 The predicate operator is empty.
     *               
     * 
     */
    MISSING_PREDICATE_OPERATOR,

    /**
     * 
     *                 The predicate values are empty.
     *               
     * 
     */
    MISSING_PREDICATE_VALUES,

    /**
     * 
     *                 The predicate field name is not valid.
     *               
     * 
     */
    INVALID_PREDICATE_FIELD_NAME,

    /**
     * 
     *                 The predicate operator is not valid.
     *               
     * 
     */
    INVALID_PREDICATE_OPERATOR,

    /**
     * 
     *                 Invalid selection of fields.
     *               
     * 
     */
    INVALID_FIELD_SELECTION,

    /**
     * 
     *                 The predicate value is not valid.
     *               
     * 
     */
    INVALID_PREDICATE_VALUE,

    /**
     * 
     *                 The sort field name is not valid or the field is not sortable.
     *               
     * 
     */
    INVALID_SORT_FIELD_NAME,

    /**
     * 
     *                 Standard error.
     *               
     * 
     */
    SELECTOR_ERROR,

    /**
     * 
     *                 Filtering by date range is not supported.
     *               
     * 
     */
    FILTER_BY_DATE_RANGE_NOT_SUPPORTED,

    /**
     * 
     *                 Selector paging start index is too high.
     *               
     * 
     */
    START_INDEX_IS_TOO_HIGH,

    /**
     * 
     *                 The values list in a predicate was too long.
     *               
     * 
     */
    TOO_MANY_PREDICATE_VALUES,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN_ERROR;

    public String value() {
        return name();
    }

    public static SelectorErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
