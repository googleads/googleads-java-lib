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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRuleTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleTargetingError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VIDEO_POSITION_TARGETING_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="EXACT_CUSTOM_VALUE_TARGETING_REQUIRED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdRuleTargetingError.Reason")
@XmlEnum
public enum AdRuleTargetingErrorReason {


    /**
     * 
     *                 Cannot target video positions.
     *               
     * 
     */
    VIDEO_POSITION_TARGETING_NOT_ALLOWED,

    /**
     * 
     *                 As part of COPPA requirements, custom targeting for session ad rules requires exact custom
     *                 value matching.
     *               
     * 
     */
    EXACT_CUSTOM_VALUE_TARGETING_REQUIRED,

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

    public static AdRuleTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
