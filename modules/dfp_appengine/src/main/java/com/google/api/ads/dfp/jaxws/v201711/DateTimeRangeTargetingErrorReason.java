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
 * <p>Java class for DateTimeRangeTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTimeRangeTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPTY_RANGES"/>
 *     &lt;enumeration value="NOT_SPONSORSHIP_LINEITEM"/>
 *     &lt;enumeration value="PAST_RANGES_CHANGED"/>
 *     &lt;enumeration value="RANGES_OVERLAP"/>
 *     &lt;enumeration value="RANGES_OUT_OF_LINEITEM_ACTIVE_PERIOD"/>
 *     &lt;enumeration value="START_TIME_IS_NOT_START_OF_DAY"/>
 *     &lt;enumeration value="END_TIME_IS_NOT_END_OF_DAY"/>
 *     &lt;enumeration value="START_DATE_TIME_IS_IN_PAST"/>
 *     &lt;enumeration value="RANGE_END_TIME_BEFORE_START_TIME"/>
 *     &lt;enumeration value="END_DATE_TIME_IS_TOO_LATE"/>
 *     &lt;enumeration value="LIMITED_RANGES_IN_UNLIMITED_LINEITEM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateTimeRangeTargetingError.Reason")
@XmlEnum
public enum DateTimeRangeTargetingErrorReason {


    /**
     * 
     *                 No targeted ranges exists.
     *               
     * 
     */
    EMPTY_RANGES,

    /**
     * 
     *                 Type of lineitem is not sponsorship.
     *               
     * 
     */
    NOT_SPONSORSHIP_LINEITEM,

    /**
     * 
     *                 Past ranges are changed.
     *               
     * 
     */
    PAST_RANGES_CHANGED,

    /**
     * 
     *                 Targeted date time ranges overlap.
     *               
     * 
     */
    RANGES_OVERLAP,

    /**
     * 
     *                 Targeted date time ranges fall out the active period of lineitem.
     *               
     * 
     */
    RANGES_OUT_OF_LINEITEM_ACTIVE_PERIOD,

    /**
     * 
     *                 Start time of range (except the earliest range) is not at start of day.
     *                 Start of day is 00:00:00.
     *               
     * 
     */
    START_TIME_IS_NOT_START_OF_DAY,

    /**
     * 
     *                 End time of range (except the latest range) is not at end of day.
     *                 End of day is 23:59:59.
     *               
     * 
     */
    END_TIME_IS_NOT_END_OF_DAY,

    /**
     * 
     *                 Start date time of earliest targeted ranges is in past.
     *               
     * 
     */
    START_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 The end time of range is before the start time.
     *                 Could happen when start type is IMMEDIATE or ONE_HOUR_LATER.
     *               
     * 
     */
    RANGE_END_TIME_BEFORE_START_TIME,

    /**
     * 
     *                 End date time of latest targeted ranges is too late.
     *               
     * 
     */
    END_DATE_TIME_IS_TOO_LATE,
    LIMITED_RANGES_IN_UNLIMITED_LINEITEM,

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

    public static DateTimeRangeTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
