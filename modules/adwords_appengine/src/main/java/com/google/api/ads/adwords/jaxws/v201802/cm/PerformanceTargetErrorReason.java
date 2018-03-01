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
 * <p>Java class for PerformanceTargetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceTargetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPEND_TARGET_REQUIRES_DATE_RANGE"/>
 *     &lt;enumeration value="VOLUME_TARGET_VALUE_REQUIRES_DATE_RANGE"/>
 *     &lt;enumeration value="START_DATE_AFTER_END_DATE"/>
 *     &lt;enumeration value="INCOMPATIBLE_EFFICIENCY_TARGET_TYPE"/>
 *     &lt;enumeration value="EFFICIENCY_TARGET_VALUE_AND_TYPE_ARE_MUTUALLY_REQUIRED"/>
 *     &lt;enumeration value="OVERLAPPING_DATE_RANGE"/>
 *     &lt;enumeration value="HISTORICAL_PERFORMANCE_TARGETS_CANNOT_BE_MODIFIED"/>
 *     &lt;enumeration value="SPEND_TARGET_AND_SPEND_TARGET_TYPE_ARE_MUTUALLY_REQUIRED"/>
 *     &lt;enumeration value="PERFORMANCE_TARGET_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceTargetError.Reason")
@XmlEnum
public enum PerformanceTargetErrorReason {


    /**
     * 
     *                 Spend target requires both start date and end date to be specified.
     *               
     * 
     */
    SPEND_TARGET_REQUIRES_DATE_RANGE,

    /**
     * 
     *                 Volume target value requires both start date and end date to be specified.
     *               
     * 
     */
    VOLUME_TARGET_VALUE_REQUIRES_DATE_RANGE,

    /**
     * 
     *                 The end date is before the start date.
     *               
     * 
     */
    START_DATE_AFTER_END_DATE,

    /**
     * 
     *                 The efficiency target type is incompatible with the volume goal type. The following mapping
     *                 describes which volume goal types are compatibe with which efficiency target types. If a
     *                 volume goal does not appear in the mapping, then no efficiency target types are compatible
     *                 with it.
     *                 Volume Goal Type : List of Efficiency Target Types
     *                 MAXIMIZE_CLICKS : CPC_LESS_THAN_OR_EQUAL_TO
     *                 MAXIMIZE_CONVERSIONS : CPA_LESS_THAN_OR_EQUAL_TO
     *               
     * 
     */
    INCOMPATIBLE_EFFICIENCY_TARGET_TYPE,

    /**
     * 
     *                 Efficiency target value and type have to both be null or set to some value.
     *               
     * 
     */
    EFFICIENCY_TARGET_VALUE_AND_TYPE_ARE_MUTUALLY_REQUIRED,

    /**
     * 
     *                 A modified or newly added performance target's date range overlaps with one or more other
     *                 date ranges of other performance targets assigned to the same parent.
     *               
     * 
     */
    OVERLAPPING_DATE_RANGE,

    /**
     * 
     *                 It is not possible to set performance targets that have already ended. If modifications are
     *                 needed, remove the performance target first and re-create it with the desired settings.
     *               
     * 
     */
    HISTORICAL_PERFORMANCE_TARGETS_CANNOT_BE_MODIFIED,

    /**
     * 
     *                 Spend target and spend target type have to both be null or set to some value.
     *               
     * 
     */
    SPEND_TARGET_AND_SPEND_TARGET_TYPE_ARE_MUTUALLY_REQUIRED,

    /**
     * 
     *                 Default error
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    PERFORMANCE_TARGET_ERROR;

    public String value() {
        return name();
    }

    public static PerformanceTargetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
