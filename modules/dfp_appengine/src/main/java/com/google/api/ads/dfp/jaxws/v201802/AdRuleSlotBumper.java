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
 * <p>Java class for AdRuleSlotBumper.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleSlotBumper">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="BEFORE"/>
 *     &lt;enumeration value="AFTER"/>
 *     &lt;enumeration value="BEFORE_AND_AFTER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdRuleSlotBumper")
@XmlEnum
public enum AdRuleSlotBumper {


    /**
     * 
     *                 Do not show a bumper ad.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Show a bumper ad before the slot's other ads.
     *               
     * 
     */
    BEFORE,

    /**
     * 
     *                 Show a bumper ad after the slot's other ads.
     *               
     * 
     */
    AFTER,

    /**
     * 
     *                 Show a bumper before and after the slot's other ads.
     *               
     * 
     */
    BEFORE_AND_AFTER,

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

    public static AdRuleSlotBumper fromValue(String v) {
        return valueOf(v);
    }

}
