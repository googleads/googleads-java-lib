// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRuleSlotBehavior.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleSlotBehavior"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALWAYS_SHOW"/&gt;
 *     &lt;enumeration value="NEVER_SHOW"/&gt;
 *     &lt;enumeration value="DEFER"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdRuleSlotBehavior")
@XmlEnum
public enum AdRuleSlotBehavior {


    /**
     * 
     *                 This ad rule always includes this slot's ads.
     *               
     * 
     */
    ALWAYS_SHOW,

    /**
     * 
     *                 This ad rule never includes this slot's ads.
     *               
     * 
     */
    NEVER_SHOW,

    /**
     * 
     *                 Defer to lower priority rules. This ad rule doesn't specify guidelines for this slot's ads.
     *               
     * 
     */
    DEFER,

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

    public static AdRuleSlotBehavior fromValue(String v) {
        return valueOf(v);
    }

}
