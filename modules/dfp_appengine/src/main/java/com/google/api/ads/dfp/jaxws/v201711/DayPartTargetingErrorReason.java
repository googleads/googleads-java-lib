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
 * <p>Java class for DayPartTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayPartTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_HOUR"/>
 *     &lt;enumeration value="INVALID_MINUTE"/>
 *     &lt;enumeration value="END_TIME_NOT_AFTER_START_TIME"/>
 *     &lt;enumeration value="TIME_PERIODS_OVERLAP"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayPartTargetingError.Reason")
@XmlEnum
public enum DayPartTargetingErrorReason {


    /**
     * 
     *                 Hour of day must be between 0 and 24, inclusive.
     *               
     * 
     */
    INVALID_HOUR,

    /**
     * 
     *                 Minute of hour must be one of 0, 15,30, 45.
     *               
     * 
     */
    INVALID_MINUTE,

    /**
     * 
     *                 The {@link DayPart#endTime} cannot be after {@link DayPart#startTime}.
     *               
     * 
     */
    END_TIME_NOT_AFTER_START_TIME,

    /**
     * 
     *                 Cannot create day-parts that overlap.
     *               
     * 
     */
    TIME_PERIODS_OVERLAP,

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

    public static DayPartTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
