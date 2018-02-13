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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NativeStyleError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NativeStyleError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNRECOGNIZED_PLACEHOLDER"/>
 *     &lt;enumeration value="NATIVE_CREATIVE_TEMPLATE_REQUIRED"/>
 *     &lt;enumeration value="ACTIVE_CREATIVE_TEMPLATE_REQUIRED"/>
 *     &lt;enumeration value="UNIQUE_SNIPPET_REQUIRED"/>
 *     &lt;enumeration value="INVALID_CUSTOM_TARGETING_MATCH_TYPE"/>
 *     &lt;enumeration value="TOO_MANY_CUSTOM_TARGETING_KEY_VALUES"/>
 *     &lt;enumeration value="INVALID_TARGETING_TYPE"/>
 *     &lt;enumeration value="INVALID_INVENTORY_TARTGETING_TYPE"/>
 *     &lt;enumeration value="UNRECOGNIZED_MACRO"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NativeStyleError.Reason")
@XmlEnum
public enum NativeStyleErrorReason {


    /**
     * 
     *                 The snippet of the native style contains a placeholder which is not defined as a variable
     *                 on the creative template of this native style.
     *               
     * 
     */
    UNRECOGNIZED_PLACEHOLDER,

    /**
     * 
     *                 Native styles can only be created under native creative templates.
     *               
     * 
     */
    NATIVE_CREATIVE_TEMPLATE_REQUIRED,

    /**
     * 
     *                 Native styles can only be created under active creative templates.
     *               
     * 
     */
    ACTIVE_CREATIVE_TEMPLATE_REQUIRED,

    /**
     * 
     *                 Native styles must have an HTML snippet.
     *               
     * 
     */
    UNIQUE_SNIPPET_REQUIRED,

    /**
     * 
     *                 Targeting expressions on the NativeStyle can only have custom criteria targeting
     *                 with {@link CustomTargetingValue.MatchType#EXACT}.
     *               
     * 
     */
    INVALID_CUSTOM_TARGETING_MATCH_TYPE,

    /**
     * 
     *                 Targeting expressions on native styles can have a maximum of 20 key-value pairs.
     *               
     * 
     */
    TOO_MANY_CUSTOM_TARGETING_KEY_VALUES,

    /**
     * 
     *                 Targeting expressions on the native style can only have inventory targeting and/or
     *                 custom targeting.
     *               
     * 
     */
    INVALID_TARGETING_TYPE,

    /**
     * 
     *                 Native styles only allows inclusion of inventory units.
     *               
     * 
     */
    INVALID_INVENTORY_TARTGETING_TYPE,

    /**
     * 
     *                 The macro referenced in the snippet is not valid.
     *               
     * 
     */
    UNRECOGNIZED_MACRO,

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

    public static NativeStyleErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
