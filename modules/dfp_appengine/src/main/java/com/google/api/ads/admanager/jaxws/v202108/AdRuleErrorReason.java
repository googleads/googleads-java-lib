// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202108;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRuleError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAME_CONTAINS_INVALID_CHARACTERS"/>
 *     &lt;enumeration value="BREAK_TEMPLATE_MUST_HAVE_EXACTLY_ONE_FLEXIBLE_AD_SPOT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdRuleError.Reason")
@XmlEnum
public enum AdRuleErrorReason {


    /**
     * 
     *                 The name contains unsupported or reserved characters.
     *               
     * 
     */
    NAME_CONTAINS_INVALID_CHARACTERS,

    /**
     * 
     *                 The break template must have exactly one flesible ad spot.
     *               
     * 
     */
    BREAK_TEMPLATE_MUST_HAVE_EXACTLY_ONE_FLEXIBLE_AD_SPOT,

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

    public static AdRuleErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
