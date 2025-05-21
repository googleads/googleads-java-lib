// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamEventDateTimeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventDateTimeError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="START_DATE_TIME_IS_IN_PAST"/&gt;
 *     &lt;enumeration value="END_DATE_TIME_NOT_AFTER_START_DATE_TIME"/&gt;
 *     &lt;enumeration value="END_DATE_TIME_TOO_LATE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventDateTimeError.Reason")
@XmlEnum
public enum LiveStreamEventDateTimeErrorReason {


    /**
     * 
     *                 Cannot create a new live stream event with a start date in the past.
     *               
     * 
     */
    START_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 End date must be after the start date.
     *               
     * 
     */
    END_DATE_TIME_NOT_AFTER_START_DATE_TIME,

    /**
     * 
     *                 {@code DateTime}s after 1 January 2037 are not supported.
     *               
     * 
     */
    END_DATE_TIME_TOO_LATE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested
     *                 API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LiveStreamEventDateTimeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
