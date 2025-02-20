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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyCapError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyCapError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMPRESSION_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="IMPRESSIONS_TOO_LOW"/&gt;
 *     &lt;enumeration value="RANGE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="RANGE_TOO_LOW"/&gt;
 *     &lt;enumeration value="DUPLICATE_TIME_RANGE"/&gt;
 *     &lt;enumeration value="DUPLICATE_TIME_UNIT"/&gt;
 *     &lt;enumeration value="TOO_MANY_FREQUENCY_CAPS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FrequencyCapError.Reason")
@XmlEnum
public enum FrequencyCapErrorReason {

    IMPRESSION_LIMIT_EXCEEDED,
    IMPRESSIONS_TOO_LOW,
    RANGE_LIMIT_EXCEEDED,
    RANGE_TOO_LOW,
    DUPLICATE_TIME_RANGE,
    DUPLICATE_TIME_UNIT,
    TOO_MANY_FREQUENCY_CAPS,

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

    public static FrequencyCapErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
