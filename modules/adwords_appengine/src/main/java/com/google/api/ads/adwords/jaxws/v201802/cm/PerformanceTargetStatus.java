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
 * <p>Java class for PerformanceTargetStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceTargetStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ACTIVE_NEEDS_ATTENTION"/>
 *     &lt;enumeration value="ACTIVE_ON_TRACK"/>
 *     &lt;enumeration value="ACTIVE_TARGET_MET"/>
 *     &lt;enumeration value="ACTIVE_INCONCLUSIVE"/>
 *     &lt;enumeration value="ACTIVE_NO_TARGETS"/>
 *     &lt;enumeration value="PAST_TARGET_MISSED"/>
 *     &lt;enumeration value="PAST_TARGET_MET"/>
 *     &lt;enumeration value="PAST_INCONCLUSIVE"/>
 *     &lt;enumeration value="PAST_MISSING_DATA"/>
 *     &lt;enumeration value="PAST_NO_TARGETS"/>
 *     &lt;enumeration value="NOT_YET_STARTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceTargetStatus")
@XmlEnum
public enum PerformanceTargetStatus {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 A status that describes an active performance target that is likely to miss its
     *                 targets.
     *               
     * 
     */
    ACTIVE_NEEDS_ATTENTION,

    /**
     * 
     *                 A status that describes an active performance target that is on track to meet
     *                 its targets.
     *               
     * 
     */
    ACTIVE_ON_TRACK,

    /**
     * 
     *                 A status that describes an active performance target with a defined spend or
     *                 volume target that has already been met.
     *               
     * 
     */
    ACTIVE_TARGET_MET,

    /**
     * 
     *                 A status that describes an active performance target for which we are not able
     *                 to make a status determination with certainty.
     *               
     * 
     */
    ACTIVE_INCONCLUSIVE,

    /**
     * 
     *                 A status that describes an active performance target that does not have any
     *                 targets set. It is not possible to make a status determination for such
     *                 performance targets.
     *               
     * 
     */
    ACTIVE_NO_TARGETS,

    /**
     * 
     *                 A status that describes a performance target that has ended and missed the
     *                 targets that were set for it.
     *               
     * 
     */
    PAST_TARGET_MISSED,

    /**
     * 
     *                 A status that describes a performance target that has ended and met the targets
     *                 that were set for it.
     *               
     * 
     */
    PAST_TARGET_MET,

    /**
     * 
     *                 A status that describes a performance target that has recently ended, but we do
     *                 not yet have all the information necessary to make a target met or missed
     *                 determination.
     *               
     * 
     */
    PAST_INCONCLUSIVE,

    /**
     * 
     *                 A status that describes a performance target that has ended and has no stats
     *                 information in its time range and  therefore cannot cannot make a target met or
     *                 missed determination.
     *               
     * 
     */
    PAST_MISSING_DATA,

    /**
     * 
     *                 A status that describes a performance target that has ended but does not have
     *                 any targets defined for it.
     *               
     * 
     */
    PAST_NO_TARGETS,

    /**
     * 
     *                 A status that describes a performance target that has not yet started.
     *               
     * 
     */
    NOT_YET_STARTED;

    public String value() {
        return name();
    }

    public static PerformanceTargetStatus fromValue(String v) {
        return valueOf(v);
    }

}
