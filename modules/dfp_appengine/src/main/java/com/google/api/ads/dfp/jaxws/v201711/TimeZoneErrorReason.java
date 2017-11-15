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
 * <p>Java class for TimeZoneError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeZoneError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_TIMEZONE_ID"/>
 *     &lt;enumeration value="TIMEZONE_ID_IN_WRONG_FORMAT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeZoneError.Reason")
@XmlEnum
public enum TimeZoneErrorReason {


    /**
     * 
     *                 Indicates that the timezone ID provided is not supported.
     *               
     * 
     */
    INVALID_TIMEZONE_ID,

    /**
     * 
     *                 Indicates that the timezone ID provided is in the wrong format.
     *                 The timezone ID must be in tz database format (e.g. "America/Los_Angeles").
     *               
     * 
     */
    TIMEZONE_ID_IN_WRONG_FORMAT,

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

    public static TimeZoneErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
