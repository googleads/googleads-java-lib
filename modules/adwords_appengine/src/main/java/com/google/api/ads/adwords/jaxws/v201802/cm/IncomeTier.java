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
 * <p>Java class for IncomeTier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomeTier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TIER_1"/>
 *     &lt;enumeration value="TIER_2"/>
 *     &lt;enumeration value="TIER_3"/>
 *     &lt;enumeration value="TIER_4"/>
 *     &lt;enumeration value="TIER_5"/>
 *     &lt;enumeration value="TIER_6_TO_10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncomeTier")
@XmlEnum
public enum IncomeTier {

    UNKNOWN,
    TIER_1,
    TIER_2,
    TIER_3,
    TIER_4,
    TIER_5,

    /**
     * 
     *                 Bucket consisting of the bottom 5 tiers, specifying the bottom 50% of household
     *                 income zip codes.
     *               
     * 
     */
    TIER_6_TO_10;

    public String value() {
        return name();
    }

    public static IncomeTier fromValue(String v) {
        return valueOf(v);
    }

}
