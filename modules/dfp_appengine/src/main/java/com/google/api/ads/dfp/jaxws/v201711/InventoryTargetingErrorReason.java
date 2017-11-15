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
 * <p>Java class for InventoryTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED"/>
 *     &lt;enumeration value="INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED"/>
 *     &lt;enumeration value="INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED"/>
 *     &lt;enumeration value="INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED"/>
 *     &lt;enumeration value="INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED"/>
 *     &lt;enumeration value="EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_TARGETED"/>
 *     &lt;enumeration value="EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_EXCLUDED"/>
 *     &lt;enumeration value="SELF_ONLY_INVENTORY_UNIT_NOT_ALLOWED"/>
 *     &lt;enumeration value="SELF_ONLY_INVENTORY_UNIT_WITHOUT_DESCENDANTS"/>
 *     &lt;enumeration value="YOUTUBE_AUDIENCE_SEGMENTS_CAN_ONLY_BE_TARGETED_WITH_YOUTUBE_SHARED_INVENTORY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryTargetingError.Reason")
@XmlEnum
public enum InventoryTargetingErrorReason {


    /**
     * 
     *                 At least one placement or inventory unit is required
     *               
     * 
     */
    AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED,

    /**
     * 
     *                 The same inventory unit or placement cannot be targeted and excluded at
     *                 the same time
     *               
     * 
     */
    INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED,

    /**
     * 
     *                 A child inventory unit cannot be targeted if its ancestor inventory unit
     *                 is also targeted.
     *               
     * 
     */
    INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED,

    /**
     * 
     *                 A child inventory unit cannot be targeted if its ancestor inventory unit
     *                 is excluded.
     *               
     * 
     */
    INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED,

    /**
     * 
     *                 A child inventory unit cannot be excluded if its ancestor inventory unit
     *                 is also excluded.
     *               
     * 
     */
    INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED,

    /**
     * 
     *                 An explicitly targeted inventory unit cannot be targeted.
     *               
     * 
     */
    EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_TARGETED,

    /**
     * 
     *                 An explicitly targeted inventory unit cannot be excluded.
     *               
     * 
     */
    EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_EXCLUDED,

    /**
     * 
     *                 A landing page-only ad unit cannot be targeted.
     *               
     * 
     */
    SELF_ONLY_INVENTORY_UNIT_NOT_ALLOWED,

    /**
     * 
     *                 A landing page-only ad unit cannot be targeted if it doesn't have any
     *                 children.
     *               
     * 
     */
    SELF_ONLY_INVENTORY_UNIT_WITHOUT_DESCENDANTS,

    /**
     * 
     *                 Audience segments shared from YouTube can only be targeted with inventory shared
     *                 from YouTube for cross selling.
     *               
     * 
     */
    YOUTUBE_AUDIENCE_SEGMENTS_CAN_ONLY_BE_TARGETED_WITH_YOUTUBE_SHARED_INVENTORY,

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

    public static InventoryTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
