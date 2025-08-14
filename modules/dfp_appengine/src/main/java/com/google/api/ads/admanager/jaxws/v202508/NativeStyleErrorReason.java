// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NativeStyleError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NativeStyleError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE_CREATIVE_TEMPLATE_REQUIRED"/&gt;
 *     &lt;enumeration value="INVALID_CUSTOM_TARGETING_MATCH_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_INVENTORY_TARTGETING_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_STATUS"/&gt;
 *     &lt;enumeration value="INVALID_TARGETING_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_FLUID_SIZE_FOR_NEWSLETTER_FORMAT"/&gt;
 *     &lt;enumeration value="NATIVE_CREATIVE_TEMPLATE_REQUIRED"/&gt;
 *     &lt;enumeration value="TOO_MANY_CUSTOM_TARGETING_KEY_VALUES"/&gt;
 *     &lt;enumeration value="UNIQUE_SNIPPET_REQUIRED"/&gt;
 *     &lt;enumeration value="UNRECOGNIZED_MACRO"/&gt;
 *     &lt;enumeration value="UNRECOGNIZED_PLACEHOLDER"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NativeStyleError.Reason")
@XmlEnum
public enum NativeStyleErrorReason {


    /**
     * 
     *                 Native styles can only be created under active creative templates.
     *               
     * 
     */
    ACTIVE_CREATIVE_TEMPLATE_REQUIRED,

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
     *                 Native styles only allows inclusion of inventory units.
     *               
     * 
     */
    INVALID_INVENTORY_TARTGETING_TYPE,

    /**
     * 
     *                 The status of a native style cannot be null.
     *               
     * 
     */
    INVALID_STATUS,

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
     *                 The fluid size is not allowed for native styles associated with newsletter eligible native
     *                 formats.
     *               
     * 
     */
    INVALID_FLUID_SIZE_FOR_NEWSLETTER_FORMAT,

    /**
     * 
     *                 Native styles can only be created under native creative templates.
     *               
     * 
     */
    NATIVE_CREATIVE_TEMPLATE_REQUIRED,

    /**
     * 
     *                 Targeting expressions on native styles can have a maximum of 20 key-value pairs.
     *               
     * 
     */
    TOO_MANY_CUSTOM_TARGETING_KEY_VALUES,

    /**
     * 
     *                 Native styles must have an HTML snippet.
     *               
     * 
     */
    UNIQUE_SNIPPET_REQUIRED,

    /**
     * 
     *                 The macro referenced in the snippet is not valid.
     *               
     * 
     */
    UNRECOGNIZED_MACRO,

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
