// Copyright 2019 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201902;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataMergeSpecError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetadataMergeSpecError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INPUT_ID_ALREADY_USED"/>
 *     &lt;enumeration value="BOUND_SPECIFIED_WITHOUT_VALUE"/>
 *     &lt;enumeration value="VALUE_SPECIFIED_WITHOUT_BOUND"/>
 *     &lt;enumeration value="MIN_EXCEEDS_MAX"/>
 *     &lt;enumeration value="MORE_THAN_ONE_INPUT_KEY_HAS_VALUE_RULES"/>
 *     &lt;enumeration value="VALUE_SPECIFIED_DOES_NOT_MATCH_OUTPUT_KEY"/>
 *     &lt;enumeration value="CANNOT_MERGE_VALUES_WHERE_VALUE_BUCKET_EXISTS"/>
 *     &lt;enumeration value="CANNOT_MODIFY_RESERVED_KEY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetadataMergeSpecError.Reason")
@XmlEnum
public enum MetadataMergeSpecErrorReason {


    /**
     * 
     *                 The merge rule has an input id that is already used by another merge rule.
     *               
     * 
     */
    INPUT_ID_ALREADY_USED,

    /**
     * 
     *                 The merge rule has an bucket where a bound type was specified without a min/max.
     *               
     * 
     */
    BOUND_SPECIFIED_WITHOUT_VALUE,

    /**
     * 
     *                 The merge rule has an bucket where a min/max was specified without a bound type.
     *               
     * 
     */
    VALUE_SPECIFIED_WITHOUT_BOUND,

    /**
     * 
     *                 The merge rule has an bucket range where the min exceeds the max.
     *               
     * 
     */
    MIN_EXCEEDS_MAX,

    /**
     * 
     *                 Tried to merge two or more rules which have value rules.
     *               
     * 
     */
    MORE_THAN_ONE_INPUT_KEY_HAS_VALUE_RULES,

    /**
     * 
     *                 Tried to set a rule for a value that does not match rule output namespace.
     *               
     * 
     */
    VALUE_SPECIFIED_DOES_NOT_MATCH_OUTPUT_KEY,

    /**
     * 
     *                 Tried to merge values on an existing rule that has value bucketing.
     *               
     * 
     */
    CANNOT_MERGE_VALUES_WHERE_VALUE_BUCKET_EXISTS,

    /**
     * 
     *                 Tried to create a rule that depends on a reserved key.
     *               
     * 
     */
    CANNOT_MODIFY_RESERVED_KEY,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static MetadataMergeSpecErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
