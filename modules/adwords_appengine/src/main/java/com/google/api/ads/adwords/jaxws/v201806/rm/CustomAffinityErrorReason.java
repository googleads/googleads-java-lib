// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201806.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomAffinityError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomAffinityError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAME_ALREADY_USED"/>
 *     &lt;enumeration value="CUSTOM_AFFINITY_TOKEN_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE"/>
 *     &lt;enumeration value="TYPE_AND_PARAMETER_NOT_FOUND"/>
 *     &lt;enumeration value="TYPE_AND_PARAMETER_ALREADY_EXISTED"/>
 *     &lt;enumeration value="INVALID_CUSTOM_AFFINITY_TOKEN_TYPE"/>
 *     &lt;enumeration value="CANNOT_REMOVE_WHILE_IN_USE"/>
 *     &lt;enumeration value="FIELD_MUTATE_OPERATOR_FOR_TOKENS_IS_NOT_SUPPORTED"/>
 *     &lt;enumeration value="READ_ONLY_ENTITY"/>
 *     &lt;enumeration value="CANNOT_CHANGE_TYPE"/>
 *     &lt;enumeration value="CUSTOM_AFFINITY_SERVICE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomAffinityError.Reason")
@XmlEnum
public enum CustomAffinityErrorReason {


    /**
     * 
     *                 Duplicated name ignoring cases.
     *               
     * 
     */
    NAME_ALREADY_USED,

    /**
     * 
     *                 In remove custom affinity token operation, both token ID and
     *                 pair [type, parameter] are not present.
     *               
     * 
     */
    CUSTOM_AFFINITY_TOKEN_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE,

    /**
     * 
     *                 The pair of [type, parameter] does not exist.
     *               
     * 
     */
    TYPE_AND_PARAMETER_NOT_FOUND,

    /**
     * 
     *                 The pair of [type, parameter] already exists.
     *               
     * 
     */
    TYPE_AND_PARAMETER_ALREADY_EXISTED,

    /**
     * 
     *                 Unsupported custom affinity token type.
     *               
     * 
     */
    INVALID_CUSTOM_AFFINITY_TOKEN_TYPE,

    /**
     * 
     *                 Cannot remove a custom affinity while it's still being used as targeting.
     *               
     * 
     */
    CANNOT_REMOVE_WHILE_IN_USE,

    /**
     * 
     *                 Field mutate operator for tokens is not supported.
     *               
     * 
     */
    FIELD_MUTATE_OPERATOR_FOR_TOKENS_IS_NOT_SUPPORTED,

    /**
     * 
     *                 Read only entities are not editable.
     *               
     * 
     */
    READ_ONLY_ENTITY,

    /**
     * 
     *                 Cannot change custom affinity type.
     *               
     * 
     */
    CANNOT_CHANGE_TYPE,

    /**
     * 
     *                 Default generic error.
     *               
     * 
     */
    CUSTOM_AFFINITY_SERVICE_ERROR;

    public String value() {
        return name();
    }

    public static CustomAffinityErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
