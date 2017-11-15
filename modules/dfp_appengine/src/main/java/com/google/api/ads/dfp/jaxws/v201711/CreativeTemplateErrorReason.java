// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeTemplateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeTemplateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_PARSE_CREATIVE_TEMPLATE"/>
 *     &lt;enumeration value="VARIABLE_DUPLICATE_UNIQUE_NAME"/>
 *     &lt;enumeration value="VARIABLE_INVALID_UNIQUE_NAME"/>
 *     &lt;enumeration value="LIST_CHOICE_DUPLICATE_VALUE"/>
 *     &lt;enumeration value="LIST_CHOICE_NEEDS_DEFAULT"/>
 *     &lt;enumeration value="LIST_CHOICES_EMPTY"/>
 *     &lt;enumeration value="NO_TARGET_PLATFORMS"/>
 *     &lt;enumeration value="MULTIPLE_TARGET_PLATFORMS"/>
 *     &lt;enumeration value="UNRECOGNIZED_PLACEHOLDER"/>
 *     &lt;enumeration value="PLACEHOLDERS_NOT_IN_FORMATTER"/>
 *     &lt;enumeration value="MISSING_INTERSTITIAL_MACRO"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeTemplateError.Reason")
@XmlEnum
public enum CreativeTemplateErrorReason {


    /**
     * 
     *                 The XML of the creative template definition is malformed and cannot be parsed.
     *               
     * 
     */
    CANNOT_PARSE_CREATIVE_TEMPLATE,

    /**
     * 
     *                 A creative template has multiple variables with the same uniqueName.
     *               
     * 
     */
    VARIABLE_DUPLICATE_UNIQUE_NAME,

    /**
     * 
     *                 The creative template contains a variable with invalid characters. Valid
     *                 characters are letters, numbers, spaces, forward slashes, dashes,
     *                 and underscores.
     *               
     * 
     */
    VARIABLE_INVALID_UNIQUE_NAME,

    /**
     * 
     *                 Multiple choices for a CreativeTemplateListStringVariable have the same value.
     *               
     * 
     */
    LIST_CHOICE_DUPLICATE_VALUE,

    /**
     * 
     *                 The choices for a CreativeTemplateListStringVariable do not contain the
     *                 default value.
     *               
     * 
     */
    LIST_CHOICE_NEEDS_DEFAULT,

    /**
     * 
     *                 There are no choices specified for the list variable.
     *               
     * 
     */
    LIST_CHOICES_EMPTY,

    /**
     * 
     *                 No target platform is assigned to a creative template.
     *               
     * 
     */
    NO_TARGET_PLATFORMS,

    /**
     * 
     *                 More than one target platform is assigned to a single creative template.
     *               
     * 
     */
    MULTIPLE_TARGET_PLATFORMS,

    /**
     * 
     *                 The formatter contains a placeholder which is not defined as a variable.
     *               
     * 
     */
    UNRECOGNIZED_PLACEHOLDER,

    /**
     * 
     *                 There are variables defined which are not being used in the formatter.
     *               
     * 
     */
    PLACEHOLDERS_NOT_IN_FORMATTER,

    /**
     * 
     *                 The creative template is interstitial, but the formatter doesn't contain
     *                 an interstitial macro.
     *               
     * 
     */
    MISSING_INTERSTITIAL_MACRO,

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

    public static CreativeTemplateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
