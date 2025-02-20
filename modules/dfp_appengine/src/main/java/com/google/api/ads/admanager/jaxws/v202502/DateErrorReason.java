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
 * <p>Java class for DateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DATE_IN_PAST"/&gt;
 *     &lt;enumeration value="START_DATE_AFTER_END_DATE"/&gt;
 *     &lt;enumeration value="END_DATE_BEFORE_START_DATE"/&gt;
 *     &lt;enumeration value="NOT_CERTAIN_DAY_OF_MONTH"/&gt;
 *     &lt;enumeration value="INVALID_DATES"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateError.Reason")
@XmlEnum
public enum DateErrorReason {

    DATE_IN_PAST,
    START_DATE_AFTER_END_DATE,
    END_DATE_BEFORE_START_DATE,
    NOT_CERTAIN_DAY_OF_MONTH,
    INVALID_DATES,

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

    public static DateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
