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
 * <p>Java class for EntityLimitReachedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityLimitReachedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM_TARGETING_VALUES_LIMIT_REACHED"/>
 *     &lt;enumeration value="AD_EXCLUSION_RULES_LIMIT_REACHED"/>
 *     &lt;enumeration value="FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED"/>
 *     &lt;enumeration value="PLACEMENTS_LIMIT_REACHED"/>
 *     &lt;enumeration value="LINE_ITEMS_LIMIT_REACHED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityLimitReachedError.Reason")
@XmlEnum
public enum EntityLimitReachedErrorReason {


    /**
     * 
     *                 The number of custom targeting values exceeds the max number allowed in the network.
     *               
     * 
     */
    CUSTOM_TARGETING_VALUES_LIMIT_REACHED,

    /**
     * 
     *                 The number of ad exclusion rules exceeds the max number allowed in the network.
     *               
     * 
     */
    AD_EXCLUSION_RULES_LIMIT_REACHED,

    /**
     * 
     *                 The number of first party audience segments exceeds the max number allowed in the network.
     *               
     * 
     */
    FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED,

    /**
     * 
     *                 The number of active placements exceeds the max number allowed in the network.
     *               
     * 
     */
    PLACEMENTS_LIMIT_REACHED,

    /**
     * 
     *                 The number of line items excceeds the max number allowed in the network.
     *               
     * 
     */
    LINE_ITEMS_LIMIT_REACHED,

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

    public static EntityLimitReachedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
